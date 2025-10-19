import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class SetTheory {
    
    public static ArrayList<Integer> generateSet(int min, int max){
            
        if(min>max){
            return new ArrayList<>();
        }
        
        if(max>100){
            max = 100;
        }
        
        if(min < 0){
            min = 0;
        }

        ArrayList<Integer> set = new ArrayList<>();

        for(int i = min; i < max; i++){
            set.add(i);
        }

        return set;
    }

    public static ArrayList<Integer> union(ArrayList<Integer> a, ArrayList<Integer> b){
        
        ArrayList<Integer> uni = new ArrayList<>();
        
        for(Integer numA : a){
            uni.add(numA);
        }
        
        for(Integer numB : b){
            if(!uni.contains(numB)){
                uni.add(numB);
            }
        }

        return uni;
        
    }

    public static ArrayList<Integer> intersection(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> set = new ArrayList<>();
        
        for(Integer numA : a){
            
            if(b.contains(numA) && !set.contains(numA))
            {
                set.add(numA);
            }
            
        }

        return set;
    }

    public static ArrayList<Integer> complement(ArrayList<Integer> a){
        ArrayList<Integer> ucomp = new ArrayList<>(generateSet(0, 100));
        Iterator<Integer> iter = ucomp.iterator();
        
        while(iter.hasNext()){
            Integer numHolder = iter.next();
            
            for(Integer item : a){
                if(Objects.equals(item, numHolder)){
                    iter.remove();
                }
            }
        }

        return ucomp;
    }

    public static int cardinality(ArrayList<Integer> a){
        ArrayList<Integer> copy = new ArrayList<>();

        for(Integer num : a){
            if(!copy.contains(num)){
                
                copy.add(num);
            }
        }

        return copy.size();
    }

    public static int cardinalityOfUnion(ArrayList<Integer> a, ArrayList<Integer> b){
        return union(a, b).size();
    }

    public static void main(String[] args) {
        // ArrayList<Integer> a = new ArrayList<>(generateSet(0, 21));
        // ArrayList<Integer> b = new ArrayList<>(generateSet(10, 31));
        
        //Generet Set Method.
        // System.out.println(generateSet(-100, 1000));
        // System.out.println(generateSet(100, 0));
        // System.out.println(generateSet(0, 100));

        //Union Method.
        //System.out.println(union(a, b)); //Output: [10, 11, ..., 30]

        //Intersection Method.
        //System.out.println(intersection(a, b)); //Output: [10, 11, ..., 20]

        //Complement Method.
        //System.out.println(complement(a)); //Output:[21, 22, ..., 99]

        //Cardinality Method.
        //System.out.println(cardinality(a)); //Output: 21

        //Cardinality of Union
        //System.out.println(cardinalityOfUnion(a,b)); //Output: 31
    }
}

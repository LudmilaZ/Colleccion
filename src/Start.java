
import java.util.*;

public class Start {
    public static void main(String[] args) {
//        написать программу которая подсчитывает количество слов в строке потом выводит статистику
        Map<String,Integer> myMapStr = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        List<String> list  = Arrays.asList(a.split(" "));
        for (String pair: list){
            if (myMapStr.containsKey(pair)){
                myMapStr.put(pair,myMapStr.get(pair).intValue()+1);
            }
            else{
                myMapStr.put(pair,1);
            }
        }
        System.out.println(myMapStr);
//        // написать компоратор что бы сначала сортировал посумме если сумма одинаковая то по имени, если  имена одинаковые  то сначала Sber Alpha Vtb
//       Map<String ,Integer> myMap = new HashMap<>();
//       myMap.put("Sber",1 );
//        myMap.put("Alpha",2 );
//        myMap.put("Vtb",3 );
//        Comparator<Order> muComp = new Comparator<>() {
//            @Override
//            public int compare(Order o1, Order o2) {
//                if (o2.amount != o1.amount) return o2.amount - o1.amount;
//                if (!o2.name.equals(o1.name)) return -1;
//                else return myMap.get(o1.bank)- myMap.get(o2.bank);
//            }
//        };
//        SortedSet<Order> mySet = new TreeSet<>(muComp);
//        mySet.add(new Order("Luda", 100, "Alpha"));
//        mySet.add(new Order("Anna", 100, "Vtb"));
//        mySet.add(new Order("Anna", 4, "Vtb"));
//        mySet.add(new Order("Luda", 74, "Sber"));
//        mySet.add(new Order("Luda", 100, "Sber"));
//        mySet.add(new Order("Anna", 100, "Vtb"));
//        mySet.add(new Order("Luda", 100, "Vtb"));
//        System.out.println(mySet);

// проверить что выведет
//        Map<String,String>   myMap = new HashMap<String,String>() ;
//        myMap.put("one", "1");
//        myMap.put("two", "2");
//        String val1 = myMap.get("tree");
//        String val2 = myMap.getOrDefault("tree", "for");
//        String val3 = myMap.getOrDefault("tree", myMap.get("one"));
//        System.out.println(val1);
//        System.out.println(val2);
//        System.out.println(val3);
        //  Создавить мапу в которой ключ имя значение уровень джава
// Map<String,String>   myMap = new HashMap<String,String>() ;
//        myMap.put("Luda", "программист");
//        myMap.put("Ema", "ребенок");
//        for (Map.Entry<String,String> pair: myMap.entrySet()){
//        System.out.println(pair.getKey() + " trabaja " + pair.getValue());
//        }
// задавали новый порядок}
//порядок        Comparator<Order> muComp = new Comparator<Order>() {
//           @Override
//            public int compare(Order o1, Order o2) {
//                if (o1.name.compareTo(o2.name)>0) return 1;
//               if (o1.name.compareTo(o2.name)<0) return -1;
//                else return o1.amount-o2.amount;
//            }
//        };
//       SortedSet<Order> mySet= new TreeSet<>(muComp);
//        mySet.add(new Order("Luda", 100,""));
//        mySet.add(new Order("Luda", 4,""));
//        mySet.add(new Order("Anna", 74,""));
//        System.out.println(mySet);
//    }
    }
}

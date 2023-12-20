public class Main {

    public static void main(String[] args) {

          CustomList customList = new CustomList(new int[]{5, 1, 2, 7, 15, 7, 8, 19, 3});
//        System.out.println(customList.toString());
//
//        System.out.println(customList.IndexOf(1));
//        System.out.println(customList.IndexOf(3));
//        System.out.println(customList.lastIndexOf(1));
//        System.out.println(customList.get(2,15));
//        System.out.println(customList.get(6,15));
//        customList.add(13);
//        System.out.println(customList.toString());

//        CustomStringList customStringList = new CustomStringList(new String[]{"гном","лес","гриб"});
//        System.out.println(customStringList.check("гном"));
//        System.out.println(customStringList.check("полено"));
//        System.out.println(customStringList.check(new String[]{"гном","лес","гриб"}));
//        System.out.println(customStringList.check(new String[]{"гном","арбуз","гриб", "апельсин"}));
//        System.out.println(customStringList.check(new String[]{"билет","заяц","береза"}));
//        System.out.println(customStringList.toString());
//        customStringList.add("потолок");
//        System.out.println(customStringList.toString());
//        customStringList.addIfNotExists("билет");
//        System.out.println(customStringList.toString());
//        customStringList.addIfNotExists("билет");
//        System.out.println(customStringList.toString());
//
//        System.out.println(customList.getMax());
//        System.out.println(customList.toString());
//        System.out.println(customList.pop());
//        System.out.println(customList.pop());
//        System.out.println(customList.pop());
 //       customList.remove(2);
 //       System.out.println(customList.toString());
  //      customList.shiftByIndex(2);

 //       customList.removeAllByIndex(-3);
 //       System.out.println(customList.toString());
  //      customList.reverse();
        System.out.println(customList.toString());
        customList.selectionSort(true);
        System.out.println(customList.toString());
      //  customList.selectionSort(false);
      //  System.out.println(customList.toString());



    }


}
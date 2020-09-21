public class Main {
    public static void main(String[] args) {
        // 1)троичный оператор
        int y = 1;
      int z = 1;
    final int x = y>=10 ? y++ : z++;
System.out.println(y+","+z); //  Outputs 1,2
    //Теперь, когда левое booleanвыражение оценивается как false, zбыло увеличено только значение .
        // Таким образом, мы видим, как выражения в тройном операторе могут не применяться,
        // если конкретное выражение не используется.

        // 2)switch
        int dayOfWeek = 5;
        switch(dayOfWeek) {
            default:
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;}

        //При значении dayOfWeek в 5 этом коде выхода будет:Weekday

        int dayOfWeek1 = 5;switch(dayOfWeek1) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break;
                //Эта код очень похож на предыдущий пример, за исключением того,
            // что два breakоператора были удалены и порядок был изменен.
            // Это означает, что для данного значения dayOfWeek, 5код будет переходить к defaultблоку и
            // затем выполнять все последующие caseоператоры по порядку, пока не найдет breakоператор или
            // не завершит структу. вывод Weekday Saturday
        }
// 3)do-while

    int s = 0;
do {
        s++;}
while(false);
System.out.println(s);  // Outputs 1
    //Java сначала выполнит блок операторов, а затем проверит условие цикла.
        // Несмотря на то, что цикл завершается сразу же, блок операторов все еще выполнялся один раз,
        // и программа выдает a 1.

// 4)for
    int r = 0;
        for(long u = 0, k = 4; r < 5 && u < 10; r++, u++) {
        System.out.println(u + " ");
    }
System.out.println(r);

    //Этот код демонстрирует три варианта forцикла, которые вы, возможно, не видели.
        // Во-первых, вы можете объявить переменную, как xв этом примере, до начала цикла и использовать
        // ее после завершения. Во-вторых, ваш блок инициализации, booleanвыражение и операторы обновления
        // могут содержать дополнительные переменные, которые могут не ссылаться друг на друга. Например, zопределяется в блоке инициализации и никогда не используется. Наконец, updateоператор может изменять несколько переменных. Этот код напечатает следующее при выполнении:
          //  0 1 2 3 4

        // 5) for-each

        final String[] names = new String[3];
        names[0] = "Lisa";
        names[1] = "Kevin";
        names[2] = "Roger";
        for(String name : names) {
            System.out.println(name + ", ");
        }

        //Этот код скомпилирует и напечатает:
        //Lisa, Kevin, Roger,

        java.util.List<String> values = new java.util.ArrayList<String>();
        values.add("Lisa");
        values.add("Kevin");
        values.add("Roger");
        for(String value : values) {
            System.out.print(value + ", ");
        }
        //Этот код скомпилирует и выведет те же значения:

       // Lisa, Kevin, Roger,
               // Когда вы видите for-eachпетлю на экзамене, убедитесь, что правая сторона
        // представляет собой массив или Iterableобъект, а левая сторона имеет соответствующий тип.
        


}}

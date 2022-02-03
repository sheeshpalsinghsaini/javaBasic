# javaBasic


//This represent current class instance of variable and method.



Integer cache : In Java 5, a new feature was introduced to save the memory and improve 
        performance for Integer type objects handling. Integer objects are cached internally and
        reused via the same referenced objects. This is applicable for Integer values in the range 
        between –128 to +127.
        Example. Integer num1 = 100                 Integer num1 = 500;
                 Integer num2 = 100                 Integer num2 = 500;
                 num1==num2 //give true.            num1==num2  //give false.


'==' operator for primitive type check only value of variable.
'==' operator for object type check reference of object.
equal() : check vlaue of object is same or not only for string, for other it also compare reference of two object.

------------------
Abastraction
Data Hiding                                     these are use for security.
Encapsulation
Tightly coupled classes


Abstraction :
        is a detail hiding (implementation hiding).
        
        there are two way for achiving abstraction in java.
                1. Abstract class(0 to 100%)
                2. Interfaces(100%)

        Abstract class Vehicle{
                int no_of_tyres;
                abstract void start();  //only prototype, no body
        }



        class Car {
                void start(){
                        sop("Start with key");          //override abstract method
                }
        }
        class Scooter extends Vehicle{
                vodi start(){
                        sop("Start with keh");
                }
        }


        Note:
          1. A method without body(no implementation) is known as 
             abstract method.
          2. A method must always be declared in an abstract class,
             or we can say that if a class has an abstract method, it
             should be declared abstracct as well.
          3. If a regular class extends an abstract class, then the class
             must have to implement all the abstract method of abstract parent
             class or it has to be declared abstract as well.
          4. Abstract classes cannot be instatieated, means we can't create 
             an object of abstract class. but we can create reference variable.







Interface :
        Interfaced are similar to Abstract class but having all the methods  abstract type.
Note: Interfaces are the blueprint of the class. It specify what a class must do and not how.

Loose Coupling : if change in one class it doesn't effect on other class.in tight couple both 
are totaly depends.




        use of interface:
                * Achive Abstraction.
                * Achive multiple interface.
                * It can used to achive loose coupling.

       important points:
                * all methods are public and abstract.
                * all field are public static final by default.
                * in java 8 version,
                      ->  we can create default concreate method.
                                default void display(){
                                        //return type must be default.
                                } 
                        -> we can create static concreate method also.
                                static void run(){

                                }
                * in java 9 version.
                        -> private methods also can create.


        Example:
                interface I1 {
                        void show();
                }
                class Test implements I1{
                       public void show(){
                                //must override method of interface.
                                public void show(){
                                        System.
                                }
                        }
                }

                public class Main{
                        public static void main(String[]args){
                                Test obj = new Test();
                                obj.display();
                        }
                }












-----------------**********************Exception Handling in java
Object class is the parent class of all classes in java.
        * An exception is an unwanted or unexpected event, which disturb normal flow of a program.
        * if we handle/solution this unwanted or unexpected event then this is known as Exception Handling.
                or
                Find alternate way provide for unwanted/unexpected event.

        Exception Hierarchy in java.
                                                                                                                Object
                                                                                                                        |
                                                                                                                Throwable
                                                                                        |-------------------------------|------------------------------|
                                                                                Exception                                                       Error
        |----------------|----------------|---------------|-----------------|--------------------------|
 Class Not Fount  NoSuchMethod    IOException    SQLException    RemoteException         InterruptedException
                                 ->EOFException[end of file]
                                 ->FileNotFountException
                                 ->IntruptedIOException
        |
RuntimeException:
        ->Arithmetic Exception
        ->ClassCast Exception
        ->NullPointerException
        ->IndexOutOfBoundException
                ->ArrayIndexOutOfBoundException
                ->StringIndexOutOfBoundException 




        difference between exception and error.
        Exception: * In most of the cases, Exceptions are occured by our Program.
                   * Recoverable, they can recover by programmer
                   * there are type of exceptions.
                        1. Compile time[Checked Exception]
                        2. Run timie[Unchecked Exception]



        Error  :
        * Error are occured because of lack of system resources; not by our programs
          and thus, programmer can't do anything.
        * not recoverable by programmer.
        *only one type error[Unchecked Exception]


        




























------------------*************** what is thread and java and thread safe and unsafe:
Multitasking:
        * Performing multiple task at a single time.
        * It increasing the performance of CPU.
        

        Multitasking is achive through :
                1. Multiprocessing[process based multitasking]
                        * when one system is connect to multiple processor in order to complete task
                        * it is best suitable at system level or o.s level.


                2. Multithreading[threading based multitasking]
                        * Sub process or sub-task or a task called thread.
                                like in video player timer running, volume-up-down, game movement,timer,map.
                        * Executing multiple thread at a single time that is called multiple threading.
        ******* safe and unsafe thread.
Note: When multiple threads are working on the same data, and the value of data is changing, that senario is unsafe thread.
and we will get inconsistent results.



        -> when a thread is already working on an object and preventing another thread on working on the same object, this
           process is called thread-safety.
                Example:
                        class VLC{
                                play(){
                                        playvideo();
                                        playmusic();
                                        startTimmer();
                                        ...
                                }
                        }
                        class playvideo{                -> thread-1

                        }
                        class playmusic{                -> thread-2

                        }
                        class startTimmer{              -> thread-3

                        }

        Note: multithreading is best suitable at programming level.
         -> java provides pre-define API for multithreading. ex: thread,runnable,etc.






Difference between process and thread
        process:
                * a program which is in executing state.
                * process is heavy weight
                * process take more time for context-switching.
                * each process havae different address space.
                * process are not dependent on eachother.
                * doesn't required synchronization.
        thread:
                * it is a sub-part of process(small task of task).
                * light weight.
                * context-switching less time.
                * thread share same address space.
                * thread are to eachother.
                * thread may required synchronization.




How to create thread in java?.
        there are two way-
                1. by thread class. : in java.lang package.
                2. Runnable(interface).


        1. using thread class.

                class Test extends Thread{               //1. extends Thread class.
                        public void run(){              //2. override run method.
                                //task of thread
                        }
                        public static void main(String args){
                                //3. create an object of class.
                                Test t = new Test();
                                //4. start thread.
                                t.start();              //start thread
                        }
                }



        Life cycle of thread:

                1. create_thread_state --> 2. Runnable_State -->3. Running state->4. Dead state
                                                    \                /
                                                     \              /
                                                  5.non-runable-state/waiting/suspend.














--------------------------------------------- String in Java ----------------------------------------

1. String is non-primitive data type.[size not fixe]
2. String is sequence of characters or array of characters.
3. String is class in java, and there are differenct methods are there.
        syntax:
                public final class String extends Object implement CharSequence,Serializable,Comparable{
                        //methods.../
                        //methods...
                }
4. String is an immuatable object.
5. To create String, there are three classes:-
        1. String
                String s = "java"
                String s = new String("java");
        2. StringBuffer
        3. StringBuilder


String constant Pool/string litral pool:
        String Constant Pool ( or String Literal Pool) is an area in heap memory where java stores String literal values.

        difference between : String = "Sheesh"                    &                String = new String("Sheesh");
                              1.create one object in scp                                  create two object in heap & scp
        
        Note: in case of SCP Garbage Collection are not work.bcz JVM maintained internaly reference of SCP literal.



        String s1 = new String("Sheeshpal");    //create two obj in head & SCP [internaly jvm provide reference to this object.]
        String s2 = new String("Sheeshpal");    //create one obj in heap and in SCP already present same literal not create again it.
        String s3 = "Sheeshpal";                //no object create it point to exist literal which is same as it.





What is String Immutability?.
       : means Unchangable.

       Note: if we create multiple String obj literal they point to same object in SCP. if value is same. if we canage
       value of any object then it doesn't effect to other object value that by it create seprate literal in SCP.
       that by string is immutable.


        String s1 = new String("Sheesh");    //create two object
                s1.concat("Singh");             //create another object in heap with value "Sheesh Singh" and create one in 
                                                //SCP "Singh".
        s1 = s1+"Saini"         //create heap object with "Sheesh Saini" and one for SCP "Saini" but s1 now point to this heap object.   




Why String class is final?.
        for this, anyother class cannt inherit this class and doesnt change the method of it.


Note: final doesn't allow to reinitialize the value of it. but immutable doesn't allow to change the data.
        Example: final StringBuffer sb = new StringBuffer("Sheeshpal");
                 sb = sb.appedn(" Singh");      //show error;
                 sb.append(" Singh");           //not show error 



Difference between "==" & equal():
        String s1 = new String("Sheeshpal");    //create two obj heap and SCP.
        String s2 = new String("Sheeshpal");    //create only one obj in heap not in SCP.
        SOP(s1==s2);    //reference comparison give false they are different obj.

        String s3= "Sheesh";    //one obj in SCP.
        String s4 = "Sheesh";   //one obj in SCP.

        SOP(s3==s4);            //true same obj.


        Note: .equal() is the method of Ojbect class. .equal() & == are same compare reference for object class.


        But String Class override .equal() method. different ==. equal() now check object content.

        String s1 = new String("Sheeshpal");    
        String s2 = new String("Sheeshpal");
        s1.equals(s2);  //true.










------------********************Collection Framework in java:
Note: we can't create object of interface but we can create reference variable of interface.

        Data structure is a way to store data into memory in efficient way. in term of space and speed.


        Arrays                                  vs                         Collection Framework

1. can store primitive & non-primitive               1. Collection framework can contain only non-primitive of data.
   data types.like int[]arr,Integer[];                  ex: ArrayList al = new ArrayList(); al.add(10); //10 here is object type[Integer];

2. Array can store only homogeneous/same type        2. we can store hetrogeneous/different type of data.
   of data.

3. Array size is fixed, we cann't increased or       3. we can increase and decrease the size of collection at run time.
   decrease the size of array at run time.

4. Arrays are inbuild features of java & thus        4. Collection framework is an API which provides pre-defined classes, interfaces & methods.
   we have to develop algorithms







        Collection Framework:
                Collection : it is the single entity or object which can store multiple data.
                Framework  : represent the library.

                it is the set of pre-defined classes and interfaces which is used to stored multiple data.

                -> it contains 2 major parts.
                        1. java.util.Collection                 //we can store data directly.
                        2. java.util.map                        //here data store in the form of key:value pair.


                                                                            .
                                                                            |
                                                                       Collection[I]
                   |--------------------------------------------------------|---------------------------------------------------|
                  List[I]                                                 Set[I]                                              Queue[I]
        |-------------|------------|                          |-------------|------------|                            |-------------|------------|
    ArrayList[C]  LinkedList[C] Vector[LC]                HashSet,c                     SortedSet,i                Priority Queue,c            Dequeue,i
                                   |                          |                          |                                                       |
                                 Stack[LC]                LinkedSet,c                  TreeSet,c                                               ArrayDeque,c


LC[legacy class] : these class is already available in java before collection framework. so after come framework they are modify that's why they are known as 
legacy class.


                                                                          .
                                                                          |
                                                                         Map
                                        |-------------|-------------------|-------------------|------------------|
                                    HashMap
                                        |
                                    LinkedHashMap





Collection:- -> Collection is an interface which is present in java.util package
             -> Syntax : public interface Collection<E> extends Iterable<E>{
                                //methods....
                        }
            -> methods of collection interface. 
                * public boolean add(object obj);
                * public boolean addAll(Collection c);



Difference Array and ArrayList.
        Array                                                                           ArrayList
1. fixed length[static] can't change array size                         1. Re-sizable Arraylist[Dynamic].
        ex. String strArray[] = new String[10];                                 ex: ArrayList<String> list = new ArrayList<>();

2. Parts of core java programming.                                      2. parts of collection framework.
3. contains primitive as well as object.                                3. support only objects.



---------------*************** ArrayList : index start from 0.
        ArrayList implements it with a dynamically re-sizing array.

        insert element = O(N);
        delete element = O(N);

        after resizeing array size = n + n/2 +1;


Constructors in ArrayList:
Constructor                             Description
1. ArrayList()                    it is used to build an empty array list.
2. ArrayList(int capacity)        it is used to build an array list that has the specified initial capacity.


Methods of ArrayList:
        * void add(int index,E element) // insert the specified element at the specified position in a list.
        * boolean add(E e)              // it is used to append the specified element at the end of a list.
        * boolean addAll(Collection c)  //append all of the elements in the specified collection to the end
                                        // of this list.
        * boolean addAll(int index,Collection c)  //at specified positon.
        * void clear()                  // used to clear all the element from the list.
        * void ensureCapacity(int requiredCapacity)     // it is used to enhance the capacity of an arraylist instance.
        * E get(int index)              // fetch the element from the particular position of the list.
        * boolean isEmpty()             // return true/false.
        * int lastIndexOf(object o)     //return the index in this list of the last occurrence of the specified element, or -1 if the list does not contain this element.
        * Object clone()                // return a shallow copy of an arraylist.
        * boolean contains(Object o)    // return ture/false.
        * int indexOf(Object o)         // return index in this list of first occurent, -1 if not present.
        * E remove(int index)           // remove the element present at the specified position in the list.
        * boolean removeAll(collection c) // remove all the elements from the list.
        * E set(int index, E element)   // replace the specified element in the list, present at the specified position.
        * void sort(Comparator<? super E> c)    // sort the element of the list on the basis of specified comparator.
        * int size()    // return the number of elements present in the list.
        


        Syntax: 
                ArrayList list = new ArrayList();       // creating old non-generic arraylist.

                ArrayList<String> list = new ArrayList<String>();       //creating new generic arraylist.



        example:
                ArrayList<String> list = new ArrayList<String>();

                list.add("Mango");      //adding object in arraylist.
                list.add("Apple");     
                list.add("Banana");
                list.add("Grapes");
                System.out.println(list);

                or      //creating iterator to iterator each elements.

                iterator itr = list.iterator(); //getting the iterator.

                while(itr.hasNext()){
                        System.out.println(itr.next());         //print the element and move to next.
                }


                or      //using forEach loop.

                for(String fruit: list)
                        System.out.println(fruit);

                or      //using for loops.
                for(int i=0;i<list.size();i++){
                        System.out.println(list.get(i));
                }

                or      
                list.forEach(a->{
                        System.out.println(a);
                })

        ------------methods:
                list.get(1);
                list.set(1,"papaya");

                Collection.sort(list);  //sorting the list.



        ------------------ user Define class objects in java Arraylist:

        class Student{
                int rollno;
                String name;
                int age;
                Student(int rollno,String name,int age){
                        this.rollno=rollno;
                        this.name = name;
                        this.age=age;
                }
        }

        //creating object of students class.
        Student s1 = new Student(101,"Sheeshpal",23);
        Student s2 = new Student(102,"Shagun",21);
        Student s3 = new Student(103,"Vaibhav",25);

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(s1);           //adding frist student into arraylist.
        list.add(s2);
        list.add(s3);
        //creating iterator 
        iterator itr = list.iterator();
        while(itr.hasNext()){
                Student st = (Student)itr.next();
                System.out.println(st.rollno+" "+st.name+""+st.age);
        }




        ********* Removing elements:
                ArrayList<String> al = new ArrayList<String>();
                al.add("Sheeshpal");
                al.add("Ravi");
                al.add("Ajay");
                al.add("Anuj");
                al.add("Gaurav");

                al.remove("Vijay");
                System.out.println(al);

                al.remove(0);
                System.out.println(al);

                ArrayList<String> al2 = new ArrayList<String>();
                al2.add("Ravi");
                al2.add("Hanumat");

                //adding new elements to arralist.
                al.addAll(al2);
                System.out.println(al2);

                //Removing all the new elements form the arraylist.
                al.removeAll(al2);
                System.out.println(al2);

                //removing specified condition with labda expression.
                al.remove(str->str.contains("Ajay"));

                al.clear();     //removing all the elements of the list.

                System.out.println(al.isEmpty());       //return true/false.

                Book Example by ArrayList:
                        class Book{
                                int id;
                                String name,author,publisher;
                                int quantity;
                                public Book(int id,String name,String author,String publisher,int quantity){
                                        this.id=id;
                                        this.name = name;
                                        this.author = author;
                                        this.publisher = publisher;
                                        this.quantity = quantity;
                                }
                        }

                        public class ArrayListExample{
                                public static void main(String[]args){
                                        List<Book> list = new ArrayList<Book>();
                                        //creating Books
                                        Book b1 = new Book(101,"let us C","Yashwant kanetkar","BPB",8);
                                        Book b2 = new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);
                                        Book b3 = new Book(103,"Operating System","Galvin","Wiley",6);
                                        //Adding Books to list.
                                        list.add(b1);
                                        list.add(b2);
                                        list.add(b3);
                                        //Traversing list.
                                        for(Book b : list){
                                                System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.qunatity);
                                        }
                                }
                        }















LinkedList:
        LinkedList class uses a doubly linked list to store the elements. It implement list and Dequeue
        interfaceds.

        important points:
                * it can conatins duplicate elements.
                * it maintains insertion order.
                * manipulation is fast because no shifting needs to occur.
        
        LinkedList class declaration:
                public class LinkedList<E> extends AbstractSequentialList<E> implement List<E>,Deque<E>,Cloneable,Serializable{
                        //methods....
                }

        
        Methods of java LinkedList:
                * boolean add(E e)      // append element to the end of a list.
                * void add(int index,E element);        //insert the specified element at specified position index in a list.
                * boolean addAll(Collection c);         //add all collection elements.at the end
                * boolean addAll(int index,Collection c);       //at the specified position.
                * void addFirst(E e);                   //insert at the beginning of a list.
                * void addLast(E e);                    //append to the end of a list.
                * boolean offer(E e);                   // add specified element as the last element of a list.
                * boolean offerFirst(E e);              // insert element at the front of a list.
                * boolean offerLast(E e);               // insert element at the end of a list.
                * E element();                          // retrieve the first element of a list.
                * E get(int index);                     // return the element at the specified position in a list.
                * E getFrist();                         //return the first element in a list.
                * E getLast();                          //return the last element in a list.
                * int indexOf(Object o);                //return first occurence of the specified element, -1 if not present.
                * int lastIndexOf(Object o);            // return last occurent of the specified element, -1 if not present.
                * void clear();                         // remove all the elements from a list.
                * Object clone();                       //return a shallow copy of an arraylist.
                * boolean contains(Object o);           //return ture/false.
                * E peek();                             // retrieve the first element of a list.
                * E peekFirst();                        // retrieves the first element of a list or return null if a list empty.
                * E peekLast();                         // retrieves the last element of a list or return null if list empty.
                * E poll();                             // retrives and remove the first element of list.           
                * E pollFirst();                        //it retrieves and removes the first element of a list,null it empty.
                * E pollLast();                         //retrieves and removes the last element of a list, null if empty.
                * E pop();                              //pop an element from stack represented by a list.
                * void push(E e);                       //pushes an element onto the stack represent by a list.
                * E remove();                           //retrieve and removes the first element of a list.
                * E remove(int index);                  //remove element at specified position.
                * boolean remove(Object o);             //remove the first occurrence of the element of element in list.
                * E removeFirst();                      //remove and return first element.
                * boolean removeFirstOccurrence(Object o);    //remove first occu. list when traverse from head to tail
                * E removeLast();                       //remove and return last element.
                * boolean removeLastOccurrence(Object o);     // remove last occurentce list when tranverse from head to tail.
                * E set(int index, E element);          //replace the element at the specified position in a list.
                * int size();                           // return number of elements in a list.






---------************HashSet :
        it uses a hash table for storage. it inherits the AbstractSet class and implement Set interface.

        Important point:
                * HashSet store element using hashing mechanism.
                * HashSet conatins unique elements only.
                * HashSet allow null value.
                * it doesn't maintain insertion order. here element are insert on the basis of their hashcode.
                * The initial capacity of HashSet is 16, and the load factor is 0.75.

Note: Difference between List and Set: A list can contain duplicate elements whereas Set contains unique elements only.

        HashSet class declaration:
                public class HashSet<E> extends AbstractSet<E> implements Set<E>,Cloneable,Serializable{

                }



        Constructor of java HashSet class:
                * HashSEt():                    //default HashSet constructor.
                * HashSet(int capacity):        //with initial capacity.
                * HashSet(int capacity,Float loadFactor):       //initial capacity and specified load factor.
                * HashSet(Collection c):         //initialize the hash by using the elements of the collection c.

Note: what is load factor->
      Default initial capacity of the HashMap takes is 16 and load factor is 0.75f (i.e 75% of current map size). 
      The load factor represents at what level the HashMap capacity should be doubled.
      For example product of capacity and load factor as 16 * 0.75 = 12. This represents that after storing the 12th key – value pair into the HashMap , its capacity becomes 32.


        Methods:
                * boolean add(E e);     //add element, if not already present.
                * void clear();         //remove all elements form the set.
                * clone();              //return ashallow copy of HashSet.
                * contains(Object o);   //return true/false.
                * isEmpty();            //return true if set is empty.
                * iterator();           // iterate over the elements in this set.
                * remove(Object o);     //remove specified element from this set.
                * size();               // return number of elements.


        class HashSet1{
                public static void main(String args[]){
                        HashSet<String> set = new HashSet();
                        set.add("One");
                        set.add("Two");
                        set.add("Three");
                        set.add("Four");
                        set.add("Five");
                        iterator<String> itr = set.iterator();
                        while(itr.hasNext()){
                                System.out.println(itr.next());
                        }
                }
        }


        removing elements:
                set.remove("Ravi");
                set.remove(str->str.contains("Vijay")); //with lambda expression.
                set.clear();
                System.out.println(set);




        Java HashSet from another Collection:
                ArrayList<String> list = new ArrayListString>();
                list.add("Ravi");
                list.add("Vijay");
                list.add("Adday");

        HashSet<String> set = new HashSEt(list);
        set.add("Gaurav");
        iterator(String) i = set.iterator();
        while(i.hasNext()){
                System.out.println(i.next());
        }








-----------------***********LinkedHashSet :
        java LinkedHashSet class is a Hashtable and Linked list implementation of the set interface.it inherits HashSet and 
        implement Set interface.

        Importanat points:
                * it conatins unique elements.
                * it maintains insertion order.

        LinkedHashSet class extends HashSet class which implements Set interface.


        Constructors:
                * HashSet():                    //constructe a default HashSet.
                * HashSet():                    //initialize the hash set by using the elemtns of the collections c.
                * LinkedHashSet(int capacity):  //initialize the capacity of the linkedhashset .
                * LinkedHashSet(int capacity,float,float fillRatio):    //initialize both capacity and fill ration(load capacity).



                class LinkedHashSet{
                        public static void main(String args[]){
                                LinkedHashSet<String> set = new LinkedHashSet();

                                set.add("One");
                                set.add("Two");
                                set.add("Three");
                                set.add("Four");
                                set.add("Five");
                                iterator<String> i = set.iterator();
                                while(i.hasNext()){
                                        System.out.println(i.next());
                                }
                        }
                }

                ignore duplicate elements:
                        class LinkedList{
                                public static void main(String[]args){
                                        LinkedHashSet<String> al = new LinkedHashSet<String>();
                                        al.add("Ravi");
                                        al.add("Vijay");
                                        al.add("Ravi");
                                        al.add("Ajay");
                                        iterator<String> itr = al.iterator();
                                        while(itr.hasNext()){
                                                System.out.println(itr.next());
                                        }
                                }
                        }



                        Book Example:

                        import java.util.*;  
                                class Book {  
                                int id;  
                                String name,author,publisher;  
                                int quantity;  
                                public Book(int id, String name, String author, String publisher, int quantity) {  
                                this.id = id;  
                                this.name = name;  
                                this.author = author;  
                                this.publisher = publisher;  
                                this.quantity = quantity;  
                                }  
                                }  
                                public class LinkedHashSetExample {  
                                public static void main(String[] args) {  
                                LinkedHashSet<Book> hs=new LinkedHashSet<Book>();  
                                //Creating Books  
                                Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
                                Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
                                Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
                                //Adding Books to hash table  
                                hs.add(b1);  
                                hs.add(b2);  
                                hs.add(b3);  
                                //Traversing hash table  
                                for(Book b:hs){  
                                System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
                                }  
                                }  
                                }  







--------------**************TreeSet :
        Java TreeSet class implement the Set interface that uses a tree for storage. It inherits AbstractSet class and 
        implement the Navigable interface. the object of the TreeSet class are stored in ascending order.

        Important Points:
                * it contains unique elements only.
                * it's access and retrieval times are quiet fast.
                * Java TreeSet class doesn't allow null element.
                * Java TreeSet maintains ascending order.
                

        Note: Java TreeSet class implement the NavigableSet interface. The NavigableSet interface extends SortedSet,Set,
        Collection and Iterable interfaces.

        TreeSet class declaration:
                public class TreeSet<E> extends AbstractSet<E> implements NavigableSet<E>, Cloneable,Serializable{

                }

        
        Constructors of java TreeSet class:
                * TreeSet():                    //construct empty tree set. that will be sorted in ascending order a
                                                according to natural order of the tree set.
                * TreeSet(Collection c):        //used to build a new tree set that contains the elements of the collection c.
                * TreeSet(Comparator<E> comparator) // construct an empty set that will be sorted according to give comparator.
                * TreeSet(SortedSet<E> s):      // used to build a TreeSet that contains the elements of the given SortedSet.


        Methods of java TreeSet class:
                * boolean add(E e):     //add element, if it's not present.
                * boolean addAll(Collection c):     // add all the element in the collection to this set.
                * boolean contains(Object o);           // return true/false.
                * boolean isEmpty();                    //return true, if set contains no elements.
                * boolean remove(Object o):             // remove element if it is present.
                * void clear();                         // remove all of the elements.
                * Object clone();                       // return a shallow copy.
                * E first();                            // return first(lowest) element currently in this sorted set.
                * E last();;                            // return the last(higher) element currently in this sorted set.
                * int size();                           // return the number of elements in this set.



                Example:
                        class TreeSet{
                                public static void main(String args[]){
                                        TreeSet<String> al = new TreeSet<String>();
                                        al.add("Ravi");
                                        al.add("Vijay");
                                        al.add("Ravi");
                                        al.add("Ajay");

                                        Iterator<String> itr = al.iterator();
                                        while(itr.hasNext()){
                                                System.out.println(itr.next());
                                        }
                                }
                        }



                Traversing elements in descending order:
                        class TreeSet{
                                public static void main(String[]args){
                                        TreeSet<String> set = new TreeSet<String>();

                                        set.add("Ravi");
                                        set.add("Vijay");
                                        set.add("Ajay");
                                        Iterator i = set.descendingIterator();
                                        while(i.hasNext()){
                                                System.out.println(i.next());
                                        }
                                }
                        }





                retrive and remove the highest and lowest value.
                        class TreeSet{
                                public stati void main(String[]args){
                                        TreeSet<Integer> set = new TreeSet<Integer>();
                                        set.add(24);
                                        set.add(66);
                                        set.add(12);
                                        set.add(15);
                                        System.out.println("Highest value:"+set.pollFirst());
                                        System.out.println("Lowest Value:"+set.pollLast());
                                }
                        }


                NavigableSet operations:
                        class TreeSet{
                                public static void main(String[]args){
                                        set.add("A");
                                        set.add("B");
                                        set.add("C");
                                        set.add("D");
                                        set.add("E");
                                        System.out.println("Initial Set:"+set);
                                        System.out.println("Reverse Set:"set.descendingSet());
                                        System.out.println("Head Set:"+set.headSet("C",true));
                                        System.out.println("SubSet:"+set.subSet("A",false,"E",true));
                                        System.out.println("TAilSet:"+set.tailSet("C",false));
                                }
                        }











-----------------------------------------------------
 -----------*****************HashMap:{fount in java.util package.}
        Java HashMap class implements the Map interface which allow us to store key:value pair, where keys should be unique. 
        if you try to insert the duplicate key, it will replace thge element of the corresponding key. 
                it is easy to perform operations using the key index like updation,deletion,etc. 

        Internal Working : HashMap is basicaly used hashtable mechanism for store elemetns. where we can store data in 
        the form of key:value pairs.



        Points to remembers:
                * It constains vaues based on the key.
                * constains only unique keys.
                * it may have one null key and multiple null values.
                * it maintains no order.
                * initial capacity is 16 with a load factor of 0.75.

        
Note: HashMap class extends AbstractMap class and implements Map interface.

        class Declaration:
                public class HashMap<K,V> extends AbstractMap<K,V> implement Map<K,V>, Cloneable,Serializable{

                }


        Constructors:
                * HashMap():            //construct a default HashMap.
                * HashMap(Map<K,V> map) //initialize hashmap by using the element of the given map object m.
                * HashMap(ini capacity) // with a specified capacity.
                * HashMap(int capacity,float loadFactor);       // with inital capacity and load factor.


        Methods:
                * void clear()                  //remov3e all of the mappings from this map.
                * boolean isEmpty()             // return true, if it contains no key:value pair.
                * Object clone()                //return a shallow copy, the key values themselves are not clone.
                * Set entrySet()                 // return a collection view of the mappings contained in this map.
                * Set keySet()                  // return a set view of the keys contained in this map.
                * V put(object key,object value)        // insert an entry in the map.
                * void putAll(Map map)          // insert the specified map in the map.
                * V putIfAbsent(K key,V value)  // insert the specified value with the specifed key in the map only if it is 
                                                // not already specified.
                * V remove(Object key)          //delete an entry for the specified key.
                * boolean remove(Object key, Object value)      //remove the specified value with the associated specified keys 
                                                                //from the map.
                * boolean containsValue(Object value)   // return true if some value equal to the value exists within the map. 
                                                        //else false
                * boolean containsKey(Object key)       // return true if key equal to the key exists within the map. else false.
                * boolean equals(Object o)              // compare the specified Object with the Map.
                * V get(Object key)             // return the object that contains the value associated with the key.
                * boolean isEmpty()             // return true if map is empty.
                * V replace(K key,V value)      //it replaces the specified value for a specified key.
                * boolean replace(K key,V oldValue,V newValue)  // replace old value with new value for specified key.
                * Collection<V> values()        // return a collection view of the values contained in the mapl.
                * int size()                    //return number of entry in the map.




        Example:
                public class HashMapExample{
                        public static void main(String[]args){
                                HashMap<Integer,String> map = new HashMap<Integer,String>();
                                map.put(1,"mango");     //put element in map.
                                map.put(2,"Apple");
                                map.put(3,"Banana");
                                map.put(4,"Grapes");

                                for(Map.Entry m :map.entrySet()){
                                        System.out.println(m.getKey()+" "+m.getValue());
                                }
                        }
                }

                        we can't store duplicate key in HashMap.
                                map.put(1,"Guavava");   //update revious one.

        
        add() elements

        map.putIfAbsent(101,"Gaurav");
        for(Map.Entry m : map.entrySet()){
                System.out.println(m.getKey()+" "+m.getValue());
        }


        //remove() elements

        map.remove(100);        //key-based removal.
        map.remove(102,"Rahul");        //key-value pair based removal.
        map.remove("Ammit");    //value based remove.

        //replace()
        map.replace(102,"Gaurav");      
        map.replace(101,"Vijay","Ravi");

        map.replaceAll((k,v)->"Ajay");
        for(Map.Entry m = map.entrySet()){
                System.out.println(m.getKey()+" "+m.getValue());
        }
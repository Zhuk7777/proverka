import java.util.*;

/**
 * A class for comparing the performance of ArrayList and LinkedList
 * @author Давид
 * @see Сomparison#addLast(int, boolean)
 * @see Сomparison#addLast(int)
 * @see Сomparison#addFirst(int, boolean)
 * @see Сomparison#addFirst(int)
 * @see Сomparison#getFirst(int, boolean)
 * @see Сomparison#addFirst(int)
 * @see Сomparison#getLast(int, boolean)
 * @see Сomparison#getLast(int)
 * @see Сomparison#deleteFirst(int, boolean)
 * @see Сomparison#deleteFirst(int)
 * @see Сomparison#deleteLast(int, boolean)
 * @see Сomparison#deleteLast(int)
 * @see Сomparison#deleteAll(boolean)
 * @see Сomparison#deleteAll()
 * @see Сomparison#fillСontainer(int)
 * @see Сomparison#printTable(int) 
 */
public class Сomparison {

    private static LinkedList<Integer>Linked = new LinkedList<Integer>();
    private static ArrayList<Integer> Array=new ArrayList<Integer>();

    /**
     * method for checking the insertion speed of the first element
     * @param count number of inserts
     * @param table to differentiate between normal output and output to a table
     */
    public static void addFirst(int count,boolean table)//for the table
    {
        if(table==false)
            System.out.println(("          LinkedList    ArrayList"));
        long timeLinked = 0, timeArray = 0;
        long start, stop;

        start=System.nanoTime();
        for(int i=0;i<count;i++)
            Linked.addFirst(i);
        stop=System.nanoTime();
        timeLinked=stop-start;
        Linked.clear();

        start=System.nanoTime();
        for(int i=0;i<count;i++)
            Array.add(0,i);
        stop=System.nanoTime();
        timeArray=stop-start;
        Array.clear();

        System.out.println("Add First:" + timeLinked + "    " + timeArray);
    }

    /**
     * function overload for normal output
     *@see Сomparison#addFirst(int, boolean)
     * @param count number of inserts
     */
    public static void addFirst(int count)//for a simple call
    {
        addFirst(count,false);
    }

    /**
     * method for checking the insertion speed of the last element
     * @param count number of inserts
     * @param table to differentiate between normal output and output to a table
     */
    public static void addLast(int count,boolean table)
    {
        if(table==false)
            System.out.println(("          LinkedList    ArrayList"));
        long timeLinked = 0, timeArray = 0;
        long start, stop;

        start=System.nanoTime();
        for(int i=0;i<count;i++)
            Linked.addLast(i);
        stop=System.nanoTime();
        timeLinked=stop-start;
        Linked.clear();

        start=System.nanoTime();
        for(int i=0;i<count;i++)
            Array.add(i);
        stop=System.nanoTime();
        timeArray=stop-start;
        Array.clear();

        System.out.println("Add Last:" + timeLinked + "    " + timeArray);
    }

    /**
     * Method for the normal output of the check
     * @see Сomparison#addLast(int, boolean)
     * @param count number of inserts
     */
    public static void addLast(int count)
    {
        addLast(count,false);
    }

    /**
     * Method for checking the speed of obtaining the first element
     * @param count how many times was the first element received
     * @param table  to differentiate between normal output and output to a table
     */
    public static void getFirst(int count,boolean table)
    {
        if(table==false)
            System.out.println(("          LinkedList    ArrayList"));
        long timeLinked = 0, timeArray = 0;
        long start, stop;

        fillСontainer(5);

        start=System.nanoTime();
        for(int i=0;i<count;i++)
            Linked.getFirst();
        stop=System.nanoTime();
        timeLinked=stop-start;
        Linked.clear();

        start=System.nanoTime();
        for(int i=0;i<count;i++)
            Array.get(0);
        stop=System.nanoTime();
        timeArray=stop-start;
        Array.clear();

        System.out.println("Get First:" + timeLinked + "    " + timeArray);
    }

    /**
     * Method for the normal output of the check
     * @see Сomparison#getFirst(int, boolean)
     * @param count how many times was the first element received
     */
    public static void getFirst(int count)
    {
        getFirst(count,false);
    }

    /**
     *Method for checking the speed of obtaining the last element
     * @param count how many times was the last element received
     * @param table to differentiate between normal output and output to a table
     */
    public static void getLast(int count,boolean table)
    {
        if(table==false)
            System.out.println(("         LinkedList    ArrayList"));
        long timeLinked = 0, timeArray = 0;
        long start, stop;

        fillСontainer(5);

        start=System.nanoTime();
        for(int i=0;i<count;i++)
            Linked.getLast();
        stop=System.nanoTime();
        timeLinked=stop-start;
        Linked.clear();

        start=System.nanoTime();
        for(int i=0;i<count;i++)
            Array.get(4);
        stop=System.nanoTime();
        timeArray=stop-start;
        Array.clear();

        System.out.println("Get Last:" + timeLinked + "    " + timeArray);
    }

    /**
     * Method for the normal output of the check
     * @see Сomparison#getLast(int, boolean)
     * @param count how many times was the last element received
     */
    public static void getLast(int count)
    {
        getLast(count,false);
    }

    /**
     * Method for comparing the removal rate of the first element
     * @param count number of deletions
     * @param table to differentiate between normal output and output to a table
     */
    public static void deleteFirst(int count,boolean table)
    {
        if(table==false)
            System.out.println(("             LinkedList    ArrayList"));
        long timeLinked = 0, timeArray = 0;
        long start, stop;

        fillСontainer(count);

        start=System.nanoTime();
        for(int i=0;i<count;i++)
            Linked.removeFirst();
        stop=System.nanoTime();
        timeLinked=stop-start;
        Linked.clear();

        start=System.nanoTime();
        for(int i=0;i<count;i++)
            Array.remove(0);
        stop=System.nanoTime();
        timeArray=stop-start;
        Array.clear();

        System.out.println("Delete First:" + timeLinked + "    " + timeArray);
    }

    /**
     * Method for the normal output of the check
     * @see Сomparison#deleteFirst(int, boolean)
     * @param count number of deletions
     */
    public static void deleteFirst(int count)
    {
        deleteFirst(count,false);
    }

    /**
     * Method for comparing the removal rate of the last element
     * @param count number of deletions
     * @param table to differentiate between normal output and output to a table
     */
    public static void deleteLast(int count,boolean table)
    {
        if(table==false)
            System.out.println(("            LinkedList    ArrayList"));
        long timeLinked = 0, timeArray = 0;
        long start, stop;

        fillСontainer(count);

        start=System.nanoTime();
        for(int i=0;i<count;i++)
            Linked.removeLast();
        stop=System.nanoTime();
        timeLinked=stop-start;
        Linked.clear();

        start=System.nanoTime();
        for(int i=count-1;i>=0;i--)
            Array.remove(i);
        stop=System.nanoTime();
        timeArray=stop-start;
        Array.clear();

        System.out.println("Delete Last:" + timeLinked + "    " + timeArray);
    }

    /**
     * Method for the normal output of the check
     * @see Сomparison#deleteLast(int, boolean)
     * @param count number of deletions
     */
    public static void deleteLast(int count)
    {

        deleteLast(count,false);
    }

    /**
     * Method for comparing the speed of complete cleaning of the container
     * @param table to differentiate between normal output and output to a table
     */
    public static void deleteAll(boolean table)
    {
        if(table==false)
            System.out.println(("      LinkedList    ArrayList"));
        long timeLinked = 0, timeArray = 0;
        long start, stop;

        fillСontainer(10);

        start=System.nanoTime();
        Linked.clear();
        stop=System.nanoTime();
        timeLinked=stop-start;

        start=System.nanoTime();
        Array.clear();
        stop=System.nanoTime();
        timeArray=stop-start;

        System.out.println("Clear:" + timeLinked + "    " + timeArray);
    }

    /**
     * Method for the normal output of the check
     * @see Сomparison#deleteAll(boolean)
     */
    public static void deleteAll()
    {
        deleteAll(false);
    }

    /**
     * Method for filling the container
     * @param count number of elements
     */
    private static void fillСontainer(int count)
    {
        for(int i=0;i<count;i++) {
            Linked.add(i);
            Array.add(i);
        }
    }

    /**
     * Method for displaying a table of all comparisons
     * @param count number of checks
     */
    public static void printTable(int count)
    {
        System.out.println(count +" repeats");
        System.out.println("          LinkedList      ArrayList");
        addFirst(count,true);
        addLast(count,true);
        getFirst(count,true);
        getLast(count,true);
        deleteFirst(count,true);
        deleteLast(count,true);
        deleteAll(true);
    }
}

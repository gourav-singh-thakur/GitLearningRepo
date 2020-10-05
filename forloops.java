public class Record{
    private int total=0;
    public void getRecord(int arr[])
    {
        for(int rec=0;rec<arr.length;rec++)
        {
             total=arr[rec]+total;
        }
      
    }
     public int Total()
        {
            return total;
        }
        public static void main(String args[])
        {   int arr[]={2,3,4,5};
            Record rec=new Record();
            rec.getRecord(arr);
            System.out.println(rec.Total());
        }
}
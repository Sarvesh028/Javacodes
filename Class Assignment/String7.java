class String7
{
	public static void main(String[] arg)
	{
		String s1="Programming Language";
		int i=s1.indexOf("a");
		int j=s1.indexOf("a", i+1);
		System.out.println("Index of 2nd occurence of a is "+j);
	}
}
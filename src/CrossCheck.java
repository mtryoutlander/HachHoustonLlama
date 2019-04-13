import java.util.ArrayList;

public class CrossCheck 
{
	public boolean Cross(ArrayList<Nodes> a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a.get(j).equals(a.get(i)))
				{
					return true;
				}
			}
		}
		return false;
	}
}

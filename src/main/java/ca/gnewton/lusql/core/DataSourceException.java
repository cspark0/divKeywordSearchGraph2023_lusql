package ca.gnewton.lusql.core;

/**
 * Describe class DataSourceException here.
 *
 *
 * Created: Wed Dec  3 23:34:48 2008
 *
 * @author <a href="mailto:gnewton@">Glen Newton</a>
 * @version 1.0
 */
public class DataSourceException 
    extends Exception
{
	static final long serialVersionUID = 1166985225326060842L;

    public DataSourceException()
	{
	    super();
	}

    public DataSourceException(String s)
	{
	    super(s);
	}

    public DataSourceException(Exception e)
	{
	    super(e);
	}

}

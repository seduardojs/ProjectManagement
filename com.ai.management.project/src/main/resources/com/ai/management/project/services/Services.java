import javax.ws.rs.core.Application;

public class Services extends Application {
	private static final Set<Class<?>> services;

    static {
        HashSet<Class<?>> tmp = new HashSet<Class<?>>();
        tmp.add(Resource.class);

        CLASSES = Collections.unmodifiableSet(tmp);
    }

    @Override
    public Set<Class<?>> getClasses(){

       return  CLASSES;
    }  

}

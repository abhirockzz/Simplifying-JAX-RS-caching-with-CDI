
package abhirockzz.wordpress.com.jax.rs.caching.cdi;

import java.util.UUID;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.Response;

@Path("/testcache")
public class RESTfulResource {
    @Inject
    @CachControlConfig(maxAge = 20)
    CacheControl cc;
 
    @GET
    @javax.ws.rs.Produces("text/plain")
    public Response find() {
        return Response.ok(UUID.randomUUID().toString()).cacheControl(cc).build();
    }
}

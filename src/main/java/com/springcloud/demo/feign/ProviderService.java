@FeignClient(name="providerTest", url="https://baidu.com")
public interface ProviderService {

    @RequestMapping(value="/", method=RequestMethod.GET)
    String invokerBaidu();
}

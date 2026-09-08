import java.util.Map;
import java.util.HashMap;

public class DialingCodes {
    private Map<Integer, String> dialingCodes = new HashMap<>();
    public Map<Integer, String> getCodes() {
        return this.dialingCodes;
    }

    public void setDialingCode(Integer code, String country) {
        this.dialingCodes.put(code, country);
    }

    public String getCountry(Integer code) {
        return this.dialingCodes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (this.dialingCodes.containsKey(code) 
            || this.dialingCodes.containsValue(country)) {
            return;
        }

        this.setDialingCode(code, country);
    }

    public Integer findDialingCode(String country) {
        for (Integer key : this.dialingCodes.keySet()) {
            if (this.dialingCodes.get(key) == country) {
                return key;
            }
        }

        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer presentCountryCode = this.findDialingCode(country);

        if (presentCountryCode == null) {
            return;
        }

        this.dialingCodes.remove(presentCountryCode);
        this.setDialingCode(code, country);
    }
}

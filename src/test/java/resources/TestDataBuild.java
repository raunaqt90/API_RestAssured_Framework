package resources;

import pojo.AddPlace;
import pojo.Location;

import java.util.ArrayList;
import java.util.List;

public class TestDataBuild {

    public AddPlace addPlacePayload(String name, String language, String address){
        AddPlace p = new AddPlace();
        p.setAccuracy(50);
        p.setAddress(address);
        p.setLanguage(language);
        p.setPhone_number("(+91) 983 893 3937");
        p.setWebsite("https://rahulshettyacademy.com");
        p.setName(name);
        List<String> mylist = new ArrayList<String>();
        mylist.add("shoe park");
        mylist.add("shop");

        p.setTypes(mylist);
        Location l =  new Location();
        l.setLat(-38.383494);
        l.setLng(33.427362);
        p.setLocation(l);

        return p;
    }
}

package com.iesemilidarder.anicolau.resolution.web.controller;//package com.iesemilidarder.anicolau.resolution.web.controller;

import com.iesemilidarder.anicolau.resolution.core.DataHelper;
import com.iesemilidarder.anicolau.resolution.core.data.Country;
import com.iesemilidarder.anicolau.resolution.core.data.Hotel;
import com.iesemilidarder.anicolau.resolution.core.data.Product;
import com.iesemilidarder.anicolau.resolution.core.data.Restaurant;
import com.iesemilidarder.anicolau.resolution.web.service.CallMeService;
//import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.UUID;

import static com.iesemilidarder.anicolau.resolution.core.DataHelper.*;


@RestController
@RequestMapping("/api/rest")
public class RestApiController {

    @Autowired
    CallMeService callService;

    @RequestMapping("/greeting")
    public Product greeting(@RequestParam(value = "name", defaultValue = "World") String name,
                            HttpSession session) {
        //session.getServletContext()
        callService.callMe();
        Restaurant aux = new Restaurant();
        aux.setName("hi");
        return aux;
    }


    @RequestMapping("/add")
    public Product addProduct(
            @RequestParam String name,
            @RequestParam String description,
            @RequestParam String img,
            @RequestParam Double price
    ) {
        Product product = new Restaurant();
        product.setName(name);
        product.setDescription(description);
        product.setImgUri(img);
        product.setPrecio(price);
        DataHelper.addItem(product);
        return product;
    }
    /*########################################ADD COUNTRY #############################*/
    @RequestMapping("/addCountry")
    public Country addCountry(
            @RequestParam String name,
            @RequestParam String Iniciales,
            @RequestParam String Location,
            @RequestParam String Description
    ) {
        Country product2 = new Country() {
            @Override
            public void setName(String name) {
                super.setName(name);
            }

            @Override
            public void setIniciales(String iniciales) {
                super.setIniciales(iniciales);
            }

            @Override
            public void setLocation(String location) {
                super.setLocation(location);
            }

            @Override
            public void setDescription(String description) {
                super.setDescription(description);
            }
        };
        product2.setName(name);
        product2.setIniciales(Iniciales);
        product2.setLocation(Location);
        product2.setDescription(Description);

        DataHelper.addItem2(product2);
        return product2;
    }

    @RequestMapping("/find")
    public Product findById(@RequestParam String uuid, Session session) {
        Product product = DataHelper.getItemById(UUID.fromString(uuid));
        if (product==null){
            return new Restaurant();
        }
        return product;
    }

    @RequestMapping("/getAll")
    public List<Product> getAll( Session session) {
        return DataHelper.getItems();
    }

    @RequestMapping("/pruebas")
    public List<Product> init( Session session) {
        return init(session);
    }


/*
    @RequestMapping("/getCountries")
    public List<Country> getCountries( String name,String Location) {
        return DataHelper.getCountries();
    }*/
@RequestMapping("/getCountries")
public static List < Country > getCountries() {
    if (countries.isEmpty()) {

        isemptycountry();
    }
    return countries;
}
/* ////////////////////////////////////////////////////////////////////// Hotels */
@RequestMapping("/getHotels")
    public static List < Hotel > getHotels() {
        if (hotels.isEmpty()) {

            isemptyhotel();
        }
        return hotels;
    }

/* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ SACAR RESTAURAMTES $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
@RequestMapping("/getRestaurants")
public static List < Restaurant > getRestaurants() {
    if (restaurants.isEmpty()) {

        isemptycountry();
    }
    return restaurants;
}







 /* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Añadir Hotel Nuevo $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
 @RequestMapping("/addHotel")
 public Hotel addHotel(
         @RequestParam String name,
         @RequestParam String iniciales,
         @RequestParam String Location,
         @RequestParam String Description
 )
 {
     Hotel hotel = new Hotel() {
         @Override
         public void setName(String name) {
             super.setName(name);
         }

         @Override
         public void setIniciales(String iniciales) {
             super.setIniciales(iniciales);
         }

         @Override
         public void setLocation(String location) {
             super.setLocation(location);
         }

         @Override
         public void setDescription(String description) {
             super.setDescription(description);
         }
     };
     hotel.setName(name);
     hotel.setIniciales(iniciales);
     hotel.setLocation(Location);
     hotel.setDescription(Description);

     DataHelper.addItem3(hotel);
     return hotel;
 }
/** $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ AGREGAR RESTA $$$$$$$$$$$$$$$$$$$$$$$$$$$$ */
@RequestMapping("/addRestaurant")
public Restaurant addRestaurant(
        @RequestParam String name,
        @RequestParam String description,
        @RequestParam Double precio,
        @RequestParam String imgUri
)
{
    Restaurant restaurant = new Restaurant() {
        @Override
        public void setName(String name) {
            super.setName(name);
        }

        @Override
        public void setDescription(String description) {
            super.setDescription(description);
        }

        @Override
        public void setPrecio(Double precio) {
            super.setPrecio(precio);
        }

        @Override
        public void setImgUri(String imgUri) {
            super.setImgUri(imgUri);
        }
    };
    restaurant.setName(name);
    //hotel.setIniciales(iniciales);
    //hotel.setLocation(Location);
    //hotel.setDescription(Description);

    DataHelper.addItem4(restaurant);
    return restaurant;
}
 /*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$HASTA AQUI AGREGAR NUEVO HOTEL $$$$$$$$$$$$$$$$$$$$$$$*/

/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ CREATING A PRODUCT $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/


} //<-- Las break


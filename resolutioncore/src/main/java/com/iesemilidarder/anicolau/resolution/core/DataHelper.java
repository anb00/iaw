package com.iesemilidarder.anicolau.resolution.core;
import com.iesemilidarder.anicolau.resolution.core.data.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DataHelper {

    public static Integer MAX_NUM = 10;

    public static List<Restaurant> restaurants = new ArrayList<>();

    public static List<Restaurant> getRestaurants() {
        if (restaurants.isEmpty()) {
            isemptyrestaurant();
        }
    return restaurants;
}
/*$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

    public static List < Country > countries = new ArrayList < > ();
    public static List < Country > getCountries() {
        if (countries.isEmpty()) {
            isemptycountry();
        }
        return countries;
    }
/* ESPACIO PARA  private static List < Product > products = new ArrayList < > ();
//
//
//

 public static List < Product > getItems() {
        if (products.isEmpty()) {
            isempty();
        }
        return products;
    }


 public static void isempty() {
        for (int i = 0; i < MAX_NUM; i++) {
            //Product alpha;
            Product Item;
            //alpha = new Activity();
            Item = new Product() {
                @Override
                public void setName(String name) {
                    super.setName(name);
                }
            };
            Item.setImgUri("http://");
            Item.setName("Producto" + i);
            //alpha.setName("Actividad" + i);
            products.add(Item);
            //products.add(alpha);
            System.out.print("Este es el número -->" + products.size());
            System.out.print("\n");
        }

    }



 */
   /*///////////////////////////////////////////////////////////////////////////////////////////////////////// GENERO EL ARRAY Hoteles ////////////////////////////*/
    public  static List< Hotel > hotels = new ArrayList<>();
    public static  List< Hotel > getHotels() {
        if(hotels.isEmpty()) {
            isemptyhotel();
        }
        return hotels;
    }
    /* ///////////////////////////////////////////////////////////HASTA AQUI HOTELES   /////////////////////////////////////////////////// */
    private static List < Product > products = new ArrayList < > (); ///////////////////////////////////////////CREAMOS PRODUCTOS
    public static List < Product > getItems() { ///////////////////////////////////////////////SI ESTA VACIA LA LISTA GENERA 10
        if (products.isEmpty()) {
            isempty();
        }
        return products;
    }
    /* ###########################GET ITEMS BY ID####################################################################*/
    public static Product getItemById(UUID id) {
        try {
            for (Product aux: products) {
                if (aux.getId().equals(id)) {
                    return aux;
                }
            }
        } catch (Exception e) {
            System.out.println("MEK!!!" + e.toString());
        }
        return null;
    }
    /* ##################################ADD ITEMS##################################################################*/
    public static void addItem(Product aux) {
        try {
            if (aux != null) {
                products.add(aux);
            }
        } catch (Exception e) {
            System.out.println("MEK!!!" + e.toString());
        }
    }
    /*##################################################################################################################
    #######################################ADD ITEM COUNTRIES #########################################################
    */
    public static void addItem2(Country aux2) {
        try {
            if (aux2 != null) {
                countries.add(aux2);
            }
        } catch (Exception e) {
            System.out.println("MEK!!!" + e.toString());
        }
    }
    /*#########################################################################################################
    #########################################ADD HOTEL ######################################################### */
    public static void addItem3(Hotel aux3) {
        try {
            if (aux3 != null) {
                hotels.add(aux3);
            }
        } catch (Exception e) {
            System.out.println("MEK!!!" + e.toString());
        }
    }

/* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ hasta aqui additem Hoteles $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

  /* #########################################ADD restaurant ######################################################### */
    public static void addItem4(Restaurant aux4) {
        try {
            if (aux4 != null) {
                restaurants.add(aux4);
            }
        } catch (Exception e) {
            System.out.println("MEK!!!" + e.toString());
        }
    }

    /* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ hasta aqui additem Hoteles $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

    /* ############################################## IS EMPTY [1] #####################################################*/
    public static void isempty() {
        for (int i = 0; i < MAX_NUM; i++) { //////////////////////////////PRODUCTO CREADO SE LLAMA ITEM
            Product Item;
            //alpha = new Activity();
            Item = new Product() {
                @Override
                public void setName(String name) {
                    super.getId();
                    super.setName(name);
                    super.getDescription();

                }
            };
            Item.setName("PRODUCTO" + i);
            Item.setDescription("UNKNOWN");
            Item.setImgUri("GOOGLE");

            //alpha.setName("Actividad" + i);
            products.add(Item);
            //products.add(alpha);
            System.out.print("Este es el número -->" + products.size());
            //System.out.println("Hay un total de " +products.lenght() +"prodductos");
            System.out.print("\n");
        }

    }
    /* ############################################## IS EMPTY [2] #####################################################*/
    /* ############################################## COUNTRY #####################################################*/
    public static void isemptycountry() {
        if (MAX_NUM == 10) {
            Country alpha;
            Country beta;
            Country gamma;
            gamma = new Country() {
                @Override
                public UUID getId() {
                    return super.getId();
                }

                @Override
                public String getName() {
                    return super.getName();
                }

                @Override
                public void setName(String name) {
                    super.setName(name);
                }
            };
            alpha = new Country() {
                @Override
                public UUID getId() {
                    return super.getId();
                }

                @Override
                public String getName() {
                    return super.getName();
                }
            };
            beta = new Country() {
                @Override
                public UUID getId() {
                    return super.getId();
                }

                @Override
                public String getName() {
                    return super.getName();
                }

                @Override
                public void setName(String name) {
                    super.setName(name);
                }
            };
            alpha.setName("Dubai");
            beta.setName("Madrid");
            gamma.setName("New York");
            alpha.getId();
            alpha.hashCode();
            countries.addAll(countries);
            countries.size();
            countries.add(beta);
            countries.add(alpha);
            countries.add(gamma);
            countries.hashCode();
            System.out.print("Lista de paises" + "-->" + countries.size());
            System.out.print("\n");
        } else {}
    }
    private static void doInit() {
        //TODO ASF (14/11/2018) Hacer lazy init
        for (int i = 0; i < MAX_NUM; i++) {
            final int resto = i % 3;
            /*if(resto == 0){
            }else if(resto==1){
            }else{
            }*/
            Product alpha;
            switch (resto) {
                case 0:
                    alpha = new Event();
                    break;
                case 1:
                    alpha = new Activity();
                    break;
                default:
                    alpha = new Restaurant();
                    break;
            }
            alpha.setName("Product " + resto);
            products.add(alpha);

        }
    }

/* ////////////////////////////////////////////////// GENERAMOS HOTELES SI ESTAN VACIOS ///////////////////////////*/
public static void isemptyhotel() {
    if (MAX_NUM == 10) {
        Hotel alpha;
        Hotel beta;
        Hotel gamma;
        gamma = new Hotel() {
            @Override
            public UUID getId() {
                return super.getId();
            }

            @Override
            public String getName() {
                return super.getName();
            }

            @Override
            public void setName(String name) {
                super.setName(name);
            }
        };
        alpha = new Hotel() {
            @Override
            public UUID getId() {
                return super.getId();
            }

            @Override
            public String getName() {
                return super.getName();
            }
        };
        beta = new Hotel() {
            @Override
            public UUID getId() {
                return super.getId();
            }

            @Override
            public String getName() {
                return super.getName();
            }

            @Override
            public void setName(String name) {
                super.setName(name);
            }
        };
        alpha.setName("Hotel Alpha");
        beta.setName("Hotel Beta");
        gamma.setName("Hotel Gamma");
        alpha.getId();
        alpha.hashCode();
        hotels.addAll(hotels);
        hotels.size();
        hotels.add(beta);
        hotels.add(alpha);
        hotels.add(gamma);
        hotels.hashCode();
        System.out.print("Lista de Hoteles" + "-->" + hotels.size());
        System.out.print("\n");
    } else {}
}
/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ is empty rest $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
public static void isemptyrestaurant() {
    if (MAX_NUM == 10) {
        Restaurant alpha;
        Restaurant beta;
        Restaurant gamma;
        gamma = new Restaurant() {
            @Override
            public UUID getId() {
                return super.getId();
            }

            @Override
            public String getName() {
                return super.getName();
            }

            @Override
            public void setName(String name) {
                super.setName(name);
            }
        };
        alpha = new Restaurant() {
            @Override
            public UUID getId() {
                return super.getId();
            }

            @Override
            public String getName() {
                return super.getName();
            }
        };
        beta = new Restaurant() {
            @Override
            public UUID getId() {
                return super.getId();
            }

            @Override
            public String getName() {
                return super.getName();
            }

            @Override
            public void setName(String name) {
                super.setName(name);
            }
        };
        alpha.setName("Rest. Alpha");
        beta.setName("Rest. Beta");
        gamma.setName("Rest.  Gamma");
        alpha.getId();
        alpha.hashCode();
        restaurants.addAll(restaurants);
        restaurants.size();
        restaurants.add(beta);
        restaurants.add(alpha);
        restaurants.add(gamma);
        restaurants.hashCode();
        System.out.print("Tenemos" + "-->" + restaurants.size() +"Restaurantes!!"+"\n");
        System.out.print("\n");
    } else {}
}


} // <-- last break
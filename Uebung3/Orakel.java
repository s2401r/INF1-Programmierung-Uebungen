public class Orakel {
public static String wasIstEs(Gegenstand gegenStand) throws IllegalArgumentException
{
        if (gegenStand != null)
        {
                if (gegenStand.isElektrisch()) {
                        switch(gegenStand.getMaterial().toLowerCase()) {
                        case "metal":
                                if (gegenStand.getGewicht() <= 3500) {
                                        return "Computer";
                                }
                                else {
                                        return "Supercomputer";
                                }
                        case "plastik":
                                return "Smartphone";
                        case "wasser":
                                return "Wolken";
                        case "gummi":
                                return "Stromkabel";
                        default:
                                return "notSpecified";
                        }
                }
                else if (!gegenStand.isElektrisch())
                {
                        switch(gegenStand.getMaterial().toLowerCase()) {
                        case "holz":
                                return "Baum";
                        case "fleisch":
                                return "Student";
                        case "gummi":
                                return "Gummiente";
                        default:
                                return "notSpecified";
                        }
                }
                else{
                        return "notSpecified";
                }
        }
        else {
                throw new IllegalArgumentException("gegenStand is null");
        }
}
}

import java.util.ArrayList;

public class CustomerCheck
{
    /** The check for a customer or group of customers
     *  Guaranteed to contain at least one MenuItem and all entries are non-null
     */
    private ArrayList<MenuItem> check;

    /* Constructor */
    public CustomerCheck(ArrayList<MenuItem> check)
    {
        this.check = check;
    }

    /** Returns the total of all MenuItem prices on the check,
     *  as described in part (a)
     */
    public double totalPrices()
    {
        double total = 0;
        for (int index = 0; index < check.size(); index++){
            total += check.get(index).getPrice();
        }
        return total;
    }

    /** Returns true if the restaurant’s coupon offer can be applied to this check and
     *  returns false otherwise, as described in part (b) */
    public boolean couponApplies()
    {
        for (int index = 0; index < check.size(); index++){
            if (check.get(index).isDailySpecial()){
                return false;
            }
        }
        if (totalPrices() < 40){
            return false;
        }
        return true;
    }

    /** Calculates the final cost of this check, as described in part (c) */
    public double calculateCheck()
    {
        double end = totalPrices();
        double price = totalPrices();
        if (couponApplies()){
            end -= (price * .25);
        }
        if (check.size() >= 6){
            end += (price * .20);
        }
        return end;
    }
}
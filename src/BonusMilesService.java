public class BonusMilesService {

    public int calculate(int ticketPrice) {
        int bonusForOneMile = 20;
        int totalBonus = ticketPrice / bonusForOneMile;

        return totalBonus;
    }
}

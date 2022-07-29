package lang.print.gaps.task6;

public class FloatTypeCasting {

    public void roundNumber(float numberToBeRounded) {
        int result;
        if (numberToBeRounded - (int) numberToBeRounded >= 0.5f) {
            result = (int) numberToBeRounded + 1;
        } else result = (int) numberToBeRounded;
        System.out.println(result);
    }
}


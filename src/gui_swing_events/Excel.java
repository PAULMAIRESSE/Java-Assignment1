package gui_swing_events;

import java.util.ArrayList;

public class Excel {
    private ArrayList<Double> numbers;

    public Excel(ArrayList<Double> numbers) {
        this.numbers = numbers;
    }

    public Excel(String numbers) throws NumberFormatException {
        this.numbers = new ArrayList<Double>();
        String[] numbersArray = numbers.split(",\\s*|\\s+");
        try {
            for (String number : numbersArray) {
                this.numbers.add(Double.parseDouble(number));
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid input");
        }
    }

    public Double getTotal() {
        Double total = 0d;
        for (Double number : this.numbers) {
            total += number;
        }
        return total;
    }

    public Double getAverage() {
        return this.getTotal() / this.numbers.size();
    }

    public Double getMaximum() {
        Double maximum = this.numbers.get(0);
        for (Double number : this.numbers) {
            if (number > maximum) {
                maximum = number;
            }
        }
        return maximum;
    }

    public Double getMinimum() {
        Double minimum = this.numbers.get(0);
        for (Double number : this.numbers) {
            if (number < minimum) {
                minimum = number;
            }
        }
        return minimum;
    }
}

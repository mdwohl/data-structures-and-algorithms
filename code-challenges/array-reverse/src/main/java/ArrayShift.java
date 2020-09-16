public class ArrayShift {

    public static int[] insertShiftArray (int[] input, int value) {
        int[] output = new int[input.length + 1];
        int middle = (int)Math.ceil(output.length / 2f);
        int counter = 0;
        int outputCounter = 0;
        while (outputCounter < input.length) {
            if (outputCounter < middle) {
                output[outputCounter] = input[counter];
            } else if (outputCounter == middle) {
                output[outputCounter] = value;
                counter--;
            } else {
                output[outputCounter] = input[counter];
            }
            counter++;
            outputCounter++;
        }
        return output;
    }
}
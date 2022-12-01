package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

        int arraySize = 0;

        for (int i = 0; i < this.array.length; i++) {
            int count = 0;
            for (int t : this.array) {
                if (t == this.array[i]) {
                    count++;
                }
            }
            if (count < maxNumberOfDuplications) {
                arraySize++;
            }
        }
        Integer[] newArray = new Integer[arraySize];
        int newIndex = -1;

        for (int i = 0; i < this.array.length; i++) {
            int count = 0;

            for (int t : this.array) {
                if (t == this.array[i]) {
                    count++;
                }
            }
            if (count < maxNumberOfDuplications) {
                newIndex++;
                newArray[newIndex] = this.array[i];
            }
        }


        return newArray;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        int arraySize = 0;

        for (int i = 0; i < this.array.length; i++) {
            int count = 0;
            for (int t : this.array) {
                if (t == this.array[i]) {
                    count++;
                }
            }
            if (count != exactNumberOfDuplications) {
               arraySize++;
            }
        }
        Integer[] newArray = new Integer[arraySize];
        int newIndex = -1;

        for (int i = 0; i < this.array.length; i++) {
            int count = 0;

            for (int t : this.array) {
                if (t == this.array[i]) {
                    count++;
                }
            }
            if (count != exactNumberOfDuplications) {
                newIndex++;
                newArray[newIndex] = this.array[i];
            }
        }


        return newArray;
    }



    public static void main(String[] args) {
        Integer[] array = new Integer[]{0, 0, 0, 1, 2, 2, 4, 4, 5, 5, 5, 6, 9, 9, 9};

        int arraySize = 0;
        int exactNumberOfDuplications = 3;

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int t : array) {
                if (t == array[i]) {
                    count++;
                }
            }
            if (count != exactNumberOfDuplications) {
                arraySize++;
            }
        }
        System.out.println(arraySize);
        Integer[] newArray = new Integer[arraySize];
        System.out.println(newArray.length);
        int newIndex = -1;
        for (int i = 0; i < array.length; i++) {
            int count = 0;

            for (int t : array) {
                if (t == array[i]) {
                    count++;
                }
            }
            if (count != exactNumberOfDuplications) {
                newIndex++;
                newArray[newIndex] = array[i];
            }
        }


        for(int i: newArray) {
            System.out.println(i);
        }


    }

}

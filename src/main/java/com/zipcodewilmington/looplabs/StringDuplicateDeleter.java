package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {

        int arraySize = 0;

        for (int i = 0; i < this.array.length; i++) {
            int count = 0;
            for (String t : this.array) {
                if (t == this.array[i]) {
                    count++;
                }
            }
            if (count < maxNumberOfDuplications) {
                arraySize++;
            }
        }
        String[] newArray = new String[arraySize];
        int newIndex = -1;

        for (int i = 0; i < this.array.length; i++) {
            int count = 0;

            for (String t : this.array) {
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
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        int arraySize = 0;

        for (int i = 0; i < this.array.length; i++) {
            int count = 0;
            for (String t : this.array) {
                if (t == this.array[i]) {
                    count++;
                }
            }
            if (count != exactNumberOfDuplications) {
                arraySize++;
            }
        }
        String[] newArray = new String[arraySize];
        int newIndex = -1;

        for (int i = 0; i < this.array.length; i++) {
            int count = 0;

            for (String t : this.array) {
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
}

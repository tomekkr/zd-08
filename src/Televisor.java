class Televisor {
    private boolean status; // true - on, false - off

    boolean turnOn() {
        return status = true;
    }

    boolean turnOff() {
        return status = false;
    }

    void showStatus() {
        System.out.println("Aktualny status telwizora: " + checkAndPrintStatus(status));
    }

    private String checkAndPrintStatus(Boolean status) {
        if (status)
            return "włączony";
        else
            return "wyłączony";
    }
}

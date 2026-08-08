class Badge {
    public String print(Integer id, String name, String department) {
        String badge = null;

        if (id != null) {
            badge = "[" + id + "] - " + name;
        } else {
             badge = name;   
        }

        if (department != null) {
            badge += " - " + department.toUpperCase();
        } else {
            badge += " - OWNER";
        }

        return badge;
    }
}

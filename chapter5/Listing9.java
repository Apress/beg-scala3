public String test2(Object in) {
    if (in == null) {
        return "null";
    }
    if (in instanceof String) {
        String s = (String) in;
        return "String, length " + s.length();
    }
    if (in instanceof Integer) {
        int i = ((Integer) in).intValue();
        if (i > 0) {
            return "Natural Int";
        }
        return "Another Int";
    }
    return in.getClass().getName();
}
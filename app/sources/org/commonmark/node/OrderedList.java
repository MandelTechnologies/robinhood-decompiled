package org.commonmark.node;

/* loaded from: classes23.dex */
public class OrderedList extends ListBlock {
    private String markerDelimiter;
    private Integer markerStartNumber;

    @Override // org.commonmark.node.Node
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public Integer getMarkerStartNumber() {
        return this.markerStartNumber;
    }

    public void setMarkerStartNumber(Integer num) {
        this.markerStartNumber = num;
    }

    public String getMarkerDelimiter() {
        return this.markerDelimiter;
    }

    public void setMarkerDelimiter(String str) {
        this.markerDelimiter = str;
    }

    @Deprecated
    public int getStartNumber() {
        Integer num = this.markerStartNumber;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Deprecated
    public void setStartNumber(int i) {
        this.markerStartNumber = i != 0 ? Integer.valueOf(i) : null;
    }

    @Deprecated
    public char getDelimiter() {
        String str = this.markerDelimiter;
        if (str == null || str.isEmpty()) {
            return (char) 0;
        }
        return this.markerDelimiter.charAt(0);
    }
}

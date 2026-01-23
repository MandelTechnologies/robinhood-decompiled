package org.commonmark.node;

/* loaded from: classes23.dex */
public class FencedCodeBlock extends Block {
    private Integer closingFenceLength;
    private String fenceCharacter;
    private int fenceIndent;
    private String info;
    private String literal;
    private Integer openingFenceLength;

    @Override // org.commonmark.node.Node
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void setFenceCharacter(String str) {
        this.fenceCharacter = str;
    }

    public Integer getOpeningFenceLength() {
        return this.openingFenceLength;
    }

    public void setOpeningFenceLength(Integer num) {
        if (num != null && num.intValue() < 3) {
            throw new IllegalArgumentException("openingFenceLength needs to be >= 3");
        }
        checkFenceLengths(num, this.closingFenceLength);
        this.openingFenceLength = num;
    }

    public void setClosingFenceLength(Integer num) {
        if (num != null && num.intValue() < 3) {
            throw new IllegalArgumentException("closingFenceLength needs to be >= 3");
        }
        checkFenceLengths(this.openingFenceLength, num);
        this.closingFenceLength = num;
    }

    public int getFenceIndent() {
        return this.fenceIndent;
    }

    public void setFenceIndent(int i) {
        this.fenceIndent = i;
    }

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String str) {
        this.info = str;
    }

    public String getLiteral() {
        return this.literal;
    }

    public void setLiteral(String str) {
        this.literal = str;
    }

    private static void checkFenceLengths(Integer num, Integer num2) {
        if (num != null && num2 != null && num2.intValue() < num.intValue()) {
            throw new IllegalArgumentException("fence lengths required to be: closingFenceLength >= openingFenceLength");
        }
    }
}

package kotlin.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CharCategoryJVM.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001.B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0086\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)¨\u0006/"}, m3636d2 = {"Lkotlin/text/CharCategory;", "", "value", "", "code", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getValue", "()I", "getCode", "()Ljava/lang/String;", "UNASSIGNED", "UPPERCASE_LETTER", "LOWERCASE_LETTER", "TITLECASE_LETTER", "MODIFIER_LETTER", "OTHER_LETTER", "NON_SPACING_MARK", "ENCLOSING_MARK", "COMBINING_SPACING_MARK", "DECIMAL_DIGIT_NUMBER", "LETTER_NUMBER", "OTHER_NUMBER", "SPACE_SEPARATOR", "LINE_SEPARATOR", "PARAGRAPH_SEPARATOR", "CONTROL", "FORMAT", "PRIVATE_USE", "SURROGATE", "DASH_PUNCTUATION", "START_PUNCTUATION", "END_PUNCTUATION", "CONNECTOR_PUNCTUATION", "OTHER_PUNCTUATION", "MATH_SYMBOL", "CURRENCY_SYMBOL", "MODIFIER_SYMBOL", "OTHER_SYMBOL", "INITIAL_QUOTE_PUNCTUATION", "FINAL_QUOTE_PUNCTUATION", "contains", "", "char", "", "Companion", "kotlin-stdlib"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: kotlin.text.CharCategory, reason: use source file name */
/* loaded from: classes14.dex */
public final class CharCategoryJVM {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CharCategoryJVM[] $VALUES;
    private final String code;
    private final int value;
    public static final CharCategoryJVM UNASSIGNED = new CharCategoryJVM("UNASSIGNED", 0, 0, "Cn");
    public static final CharCategoryJVM UPPERCASE_LETTER = new CharCategoryJVM("UPPERCASE_LETTER", 1, 1, "Lu");
    public static final CharCategoryJVM LOWERCASE_LETTER = new CharCategoryJVM("LOWERCASE_LETTER", 2, 2, "Ll");
    public static final CharCategoryJVM TITLECASE_LETTER = new CharCategoryJVM("TITLECASE_LETTER", 3, 3, "Lt");
    public static final CharCategoryJVM MODIFIER_LETTER = new CharCategoryJVM("MODIFIER_LETTER", 4, 4, "Lm");
    public static final CharCategoryJVM OTHER_LETTER = new CharCategoryJVM("OTHER_LETTER", 5, 5, "Lo");
    public static final CharCategoryJVM NON_SPACING_MARK = new CharCategoryJVM("NON_SPACING_MARK", 6, 6, "Mn");
    public static final CharCategoryJVM ENCLOSING_MARK = new CharCategoryJVM("ENCLOSING_MARK", 7, 7, "Me");
    public static final CharCategoryJVM COMBINING_SPACING_MARK = new CharCategoryJVM("COMBINING_SPACING_MARK", 8, 8, "Mc");
    public static final CharCategoryJVM DECIMAL_DIGIT_NUMBER = new CharCategoryJVM("DECIMAL_DIGIT_NUMBER", 9, 9, "Nd");
    public static final CharCategoryJVM LETTER_NUMBER = new CharCategoryJVM("LETTER_NUMBER", 10, 10, "Nl");
    public static final CharCategoryJVM OTHER_NUMBER = new CharCategoryJVM("OTHER_NUMBER", 11, 11, "No");
    public static final CharCategoryJVM SPACE_SEPARATOR = new CharCategoryJVM("SPACE_SEPARATOR", 12, 12, "Zs");
    public static final CharCategoryJVM LINE_SEPARATOR = new CharCategoryJVM("LINE_SEPARATOR", 13, 13, "Zl");
    public static final CharCategoryJVM PARAGRAPH_SEPARATOR = new CharCategoryJVM("PARAGRAPH_SEPARATOR", 14, 14, "Zp");
    public static final CharCategoryJVM CONTROL = new CharCategoryJVM("CONTROL", 15, 15, "Cc");
    public static final CharCategoryJVM FORMAT = new CharCategoryJVM("FORMAT", 16, 16, "Cf");
    public static final CharCategoryJVM PRIVATE_USE = new CharCategoryJVM("PRIVATE_USE", 17, 18, "Co");
    public static final CharCategoryJVM SURROGATE = new CharCategoryJVM("SURROGATE", 18, 19, "Cs");
    public static final CharCategoryJVM DASH_PUNCTUATION = new CharCategoryJVM("DASH_PUNCTUATION", 19, 20, "Pd");
    public static final CharCategoryJVM START_PUNCTUATION = new CharCategoryJVM("START_PUNCTUATION", 20, 21, "Ps");
    public static final CharCategoryJVM END_PUNCTUATION = new CharCategoryJVM("END_PUNCTUATION", 21, 22, "Pe");
    public static final CharCategoryJVM CONNECTOR_PUNCTUATION = new CharCategoryJVM("CONNECTOR_PUNCTUATION", 22, 23, "Pc");
    public static final CharCategoryJVM OTHER_PUNCTUATION = new CharCategoryJVM("OTHER_PUNCTUATION", 23, 24, "Po");
    public static final CharCategoryJVM MATH_SYMBOL = new CharCategoryJVM("MATH_SYMBOL", 24, 25, "Sm");
    public static final CharCategoryJVM CURRENCY_SYMBOL = new CharCategoryJVM("CURRENCY_SYMBOL", 25, 26, "Sc");
    public static final CharCategoryJVM MODIFIER_SYMBOL = new CharCategoryJVM("MODIFIER_SYMBOL", 26, 27, "Sk");
    public static final CharCategoryJVM OTHER_SYMBOL = new CharCategoryJVM("OTHER_SYMBOL", 27, 28, "So");
    public static final CharCategoryJVM INITIAL_QUOTE_PUNCTUATION = new CharCategoryJVM("INITIAL_QUOTE_PUNCTUATION", 28, 29, "Pi");
    public static final CharCategoryJVM FINAL_QUOTE_PUNCTUATION = new CharCategoryJVM("FINAL_QUOTE_PUNCTUATION", 29, 30, "Pf");

    private static final /* synthetic */ CharCategoryJVM[] $values() {
        return new CharCategoryJVM[]{UNASSIGNED, UPPERCASE_LETTER, LOWERCASE_LETTER, TITLECASE_LETTER, MODIFIER_LETTER, OTHER_LETTER, NON_SPACING_MARK, ENCLOSING_MARK, COMBINING_SPACING_MARK, DECIMAL_DIGIT_NUMBER, LETTER_NUMBER, OTHER_NUMBER, SPACE_SEPARATOR, LINE_SEPARATOR, PARAGRAPH_SEPARATOR, CONTROL, FORMAT, PRIVATE_USE, SURROGATE, DASH_PUNCTUATION, START_PUNCTUATION, END_PUNCTUATION, CONNECTOR_PUNCTUATION, OTHER_PUNCTUATION, MATH_SYMBOL, CURRENCY_SYMBOL, MODIFIER_SYMBOL, OTHER_SYMBOL, INITIAL_QUOTE_PUNCTUATION, FINAL_QUOTE_PUNCTUATION};
    }

    public static EnumEntries<CharCategoryJVM> getEntries() {
        return $ENTRIES;
    }

    private CharCategoryJVM(String str, int i, int i2, String str2) {
        this.value = i2;
        this.code = str2;
    }

    public final String getCode() {
        return this.code;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        CharCategoryJVM[] charCategoryJVMArr$values = $values();
        $VALUES = charCategoryJVMArr$values;
        $ENTRIES = EnumEntries2.enumEntries(charCategoryJVMArr$values);
        INSTANCE = new Companion(null);
    }

    public final boolean contains(char c) {
        return Character.getType(c) == this.value;
    }

    public static CharCategoryJVM valueOf(String str) {
        return (CharCategoryJVM) Enum.valueOf(CharCategoryJVM.class, str);
    }

    public static CharCategoryJVM[] values() {
        return (CharCategoryJVM[]) $VALUES.clone();
    }
}

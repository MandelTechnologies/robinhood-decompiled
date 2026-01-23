package com.robinhood.shared.ticker;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TextType.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/ticker/TextType;", "", "<init>", "(Ljava/lang/String;I)V", "MONEY", "PERCENTAGE", "DEFAULT", "animateSeparatorsSeparately", "", "getAnimateSeparatorsSeparately", "()Z", "lib-ticker-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class TextType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TextType[] $VALUES;
    public static final TextType MONEY = new TextType("MONEY", 0);
    public static final TextType PERCENTAGE = new TextType("PERCENTAGE", 1);
    public static final TextType DEFAULT = new TextType("DEFAULT", 2);

    /* compiled from: TextType.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextType.values().length];
            try {
                iArr[TextType.MONEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextType.PERCENTAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextType.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ TextType[] $values() {
        return new TextType[]{MONEY, PERCENTAGE, DEFAULT};
    }

    public static EnumEntries<TextType> getEntries() {
        return $ENTRIES;
    }

    private TextType(String str, int i) {
    }

    static {
        TextType[] textTypeArr$values = $values();
        $VALUES = textTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(textTypeArr$values);
    }

    public final boolean getAnimateSeparatorsSeparately() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static TextType valueOf(String str) {
        return (TextType) Enum.valueOf(TextType.class, str);
    }

    public static TextType[] values() {
        return (TextType[]) $VALUES.clone();
    }
}

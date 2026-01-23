package com.robinhood.compose.bento.component.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BentoTextWithTrailingIcon.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/text/TrailingIconLocation;", "", "<init>", "(Ljava/lang/String;I)V", "FIRST_LINE", "CENTER_COORDINATE", "LAST_LINE", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.text.TrailingIconLocation, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoTextWithTrailingIcon7 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BentoTextWithTrailingIcon7[] $VALUES;
    public static final BentoTextWithTrailingIcon7 FIRST_LINE = new BentoTextWithTrailingIcon7("FIRST_LINE", 0);
    public static final BentoTextWithTrailingIcon7 CENTER_COORDINATE = new BentoTextWithTrailingIcon7("CENTER_COORDINATE", 1);
    public static final BentoTextWithTrailingIcon7 LAST_LINE = new BentoTextWithTrailingIcon7("LAST_LINE", 2);

    private static final /* synthetic */ BentoTextWithTrailingIcon7[] $values() {
        return new BentoTextWithTrailingIcon7[]{FIRST_LINE, CENTER_COORDINATE, LAST_LINE};
    }

    public static EnumEntries<BentoTextWithTrailingIcon7> getEntries() {
        return $ENTRIES;
    }

    private BentoTextWithTrailingIcon7(String str, int i) {
    }

    static {
        BentoTextWithTrailingIcon7[] bentoTextWithTrailingIcon7Arr$values = $values();
        $VALUES = bentoTextWithTrailingIcon7Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(bentoTextWithTrailingIcon7Arr$values);
    }

    public static BentoTextWithTrailingIcon7 valueOf(String str) {
        return (BentoTextWithTrailingIcon7) Enum.valueOf(BentoTextWithTrailingIcon7.class, str);
    }

    public static BentoTextWithTrailingIcon7[] values() {
        return (BentoTextWithTrailingIcon7[]) $VALUES.clone();
    }
}

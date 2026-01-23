package com.robinhood.compose.bento.component.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BentoTickerText.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/text/TextType;", "", "<init>", "(Ljava/lang/String;I)V", "MONEY", "PERCENTAGE", "DEFAULT", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.text.TextType, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoTickerText4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BentoTickerText4[] $VALUES;
    public static final BentoTickerText4 MONEY = new BentoTickerText4("MONEY", 0);
    public static final BentoTickerText4 PERCENTAGE = new BentoTickerText4("PERCENTAGE", 1);
    public static final BentoTickerText4 DEFAULT = new BentoTickerText4("DEFAULT", 2);

    private static final /* synthetic */ BentoTickerText4[] $values() {
        return new BentoTickerText4[]{MONEY, PERCENTAGE, DEFAULT};
    }

    public static EnumEntries<BentoTickerText4> getEntries() {
        return $ENTRIES;
    }

    private BentoTickerText4(String str, int i) {
    }

    static {
        BentoTickerText4[] bentoTickerText4Arr$values = $values();
        $VALUES = bentoTickerText4Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(bentoTickerText4Arr$values);
    }

    public static BentoTickerText4 valueOf(String str) {
        return (BentoTickerText4) Enum.valueOf(BentoTickerText4.class, str);
    }

    public static BentoTickerText4[] values() {
        return (BentoTickerText4[]) $VALUES.clone();
    }
}

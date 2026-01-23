package com.robinhood.compose.bento.component.rows;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BentoValuePropRow.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowAlignment;", "", "<init>", "(Ljava/lang/String;I)V", "Top", "Center", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.rows.BentoValuePropRowAlignment, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoValuePropRow {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BentoValuePropRow[] $VALUES;
    public static final BentoValuePropRow Top = new BentoValuePropRow("Top", 0);
    public static final BentoValuePropRow Center = new BentoValuePropRow("Center", 1);

    private static final /* synthetic */ BentoValuePropRow[] $values() {
        return new BentoValuePropRow[]{Top, Center};
    }

    public static EnumEntries<BentoValuePropRow> getEntries() {
        return $ENTRIES;
    }

    private BentoValuePropRow(String str, int i) {
    }

    static {
        BentoValuePropRow[] bentoValuePropRowArr$values = $values();
        $VALUES = bentoValuePropRowArr$values;
        $ENTRIES = EnumEntries2.enumEntries(bentoValuePropRowArr$values);
    }

    public static BentoValuePropRow valueOf(String str) {
        return (BentoValuePropRow) Enum.valueOf(BentoValuePropRow.class, str);
    }

    public static BentoValuePropRow[] values() {
        return (BentoValuePropRow[]) $VALUES.clone();
    }
}

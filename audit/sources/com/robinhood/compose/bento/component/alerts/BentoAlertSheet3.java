package com.robinhood.compose.bento.component.alerts;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BentoAlertSheet.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/alerts/BentoBottomSheetStyle;", "", "<init>", "(Ljava/lang/String;I)V", "NEUTRAL", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.alerts.BentoBottomSheetStyle, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoAlertSheet3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BentoAlertSheet3[] $VALUES;
    public static final BentoAlertSheet3 NEUTRAL = new BentoAlertSheet3("NEUTRAL", 0);

    private static final /* synthetic */ BentoAlertSheet3[] $values() {
        return new BentoAlertSheet3[]{NEUTRAL};
    }

    public static EnumEntries<BentoAlertSheet3> getEntries() {
        return $ENTRIES;
    }

    private BentoAlertSheet3(String str, int i) {
    }

    static {
        BentoAlertSheet3[] bentoAlertSheet3Arr$values = $values();
        $VALUES = bentoAlertSheet3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(bentoAlertSheet3Arr$values);
    }

    public static BentoAlertSheet3 valueOf(String str) {
        return (BentoAlertSheet3) Enum.valueOf(BentoAlertSheet3.class, str);
    }

    public static BentoAlertSheet3[] values() {
        return (BentoAlertSheet3[]) $VALUES.clone();
    }
}

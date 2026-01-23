package com.robinhood.android.transfers.p271ui.max.wires;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WireRoutingDetailsInputDataState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputMode;", "", "<init>", "(Ljava/lang/String;I)V", "ENTER_INFORMATION", "CONFIRM_INFORMATION", "SCAM_PREVENTION", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputMode, reason: use source file name */
/* loaded from: classes9.dex */
public final class WireRoutingDetailsInputDataState3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ WireRoutingDetailsInputDataState3[] $VALUES;
    public static final WireRoutingDetailsInputDataState3 ENTER_INFORMATION = new WireRoutingDetailsInputDataState3("ENTER_INFORMATION", 0);
    public static final WireRoutingDetailsInputDataState3 CONFIRM_INFORMATION = new WireRoutingDetailsInputDataState3("CONFIRM_INFORMATION", 1);
    public static final WireRoutingDetailsInputDataState3 SCAM_PREVENTION = new WireRoutingDetailsInputDataState3("SCAM_PREVENTION", 2);

    private static final /* synthetic */ WireRoutingDetailsInputDataState3[] $values() {
        return new WireRoutingDetailsInputDataState3[]{ENTER_INFORMATION, CONFIRM_INFORMATION, SCAM_PREVENTION};
    }

    public static EnumEntries<WireRoutingDetailsInputDataState3> getEntries() {
        return $ENTRIES;
    }

    private WireRoutingDetailsInputDataState3(String str, int i) {
    }

    static {
        WireRoutingDetailsInputDataState3[] wireRoutingDetailsInputDataState3Arr$values = $values();
        $VALUES = wireRoutingDetailsInputDataState3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(wireRoutingDetailsInputDataState3Arr$values);
    }

    public static WireRoutingDetailsInputDataState3 valueOf(String str) {
        return (WireRoutingDetailsInputDataState3) Enum.valueOf(WireRoutingDetailsInputDataState3.class, str);
    }

    public static WireRoutingDetailsInputDataState3[] values() {
        return (WireRoutingDetailsInputDataState3[]) $VALUES.clone();
    }
}

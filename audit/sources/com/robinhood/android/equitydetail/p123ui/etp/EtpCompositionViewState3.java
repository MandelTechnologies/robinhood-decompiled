package com.robinhood.android.equitydetail.p123ui.etp;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EtpCompositionViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionDisplayType;", "", "<init>", "(Ljava/lang/String;I)V", "GRID", "FLAT_LIST", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.etp.EtpCompositionDisplayType, reason: use source file name */
/* loaded from: classes3.dex */
public final class EtpCompositionViewState3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EtpCompositionViewState3[] $VALUES;
    public static final EtpCompositionViewState3 GRID = new EtpCompositionViewState3("GRID", 0);
    public static final EtpCompositionViewState3 FLAT_LIST = new EtpCompositionViewState3("FLAT_LIST", 1);

    private static final /* synthetic */ EtpCompositionViewState3[] $values() {
        return new EtpCompositionViewState3[]{GRID, FLAT_LIST};
    }

    public static EnumEntries<EtpCompositionViewState3> getEntries() {
        return $ENTRIES;
    }

    private EtpCompositionViewState3(String str, int i) {
    }

    static {
        EtpCompositionViewState3[] etpCompositionViewState3Arr$values = $values();
        $VALUES = etpCompositionViewState3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(etpCompositionViewState3Arr$values);
    }

    public static EtpCompositionViewState3 valueOf(String str) {
        return (EtpCompositionViewState3) Enum.valueOf(EtpCompositionViewState3.class, str);
    }

    public static EtpCompositionViewState3[] values() {
        return (EtpCompositionViewState3[]) $VALUES.clone();
    }
}

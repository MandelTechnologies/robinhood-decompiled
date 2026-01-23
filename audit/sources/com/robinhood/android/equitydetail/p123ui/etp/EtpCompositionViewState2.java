package com.robinhood.android.equitydetail.p123ui.etp;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EtpCompositionViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionDataType;", "", "<init>", "(Ljava/lang/String;I)V", "SECTORS", "HOLDINGS", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.etp.EtpCompositionDataType, reason: use source file name */
/* loaded from: classes3.dex */
public final class EtpCompositionViewState2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EtpCompositionViewState2[] $VALUES;
    public static final EtpCompositionViewState2 SECTORS = new EtpCompositionViewState2("SECTORS", 0);
    public static final EtpCompositionViewState2 HOLDINGS = new EtpCompositionViewState2("HOLDINGS", 1);

    private static final /* synthetic */ EtpCompositionViewState2[] $values() {
        return new EtpCompositionViewState2[]{SECTORS, HOLDINGS};
    }

    public static EnumEntries<EtpCompositionViewState2> getEntries() {
        return $ENTRIES;
    }

    private EtpCompositionViewState2(String str, int i) {
    }

    static {
        EtpCompositionViewState2[] etpCompositionViewState2Arr$values = $values();
        $VALUES = etpCompositionViewState2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(etpCompositionViewState2Arr$values);
    }

    public static EtpCompositionViewState2 valueOf(String str) {
        return (EtpCompositionViewState2) Enum.valueOf(EtpCompositionViewState2.class, str);
    }

    public static EtpCompositionViewState2[] values() {
        return (EtpCompositionViewState2[]) $VALUES.clone();
    }
}

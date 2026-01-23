package com.withpersona.sdk2.inquiry.nfc;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChipAuthenticationStatus.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/ChipAuthenticationStatus;", "", "<init>", "(Ljava/lang/String;I)V", "NotRequested", "NotSupported", "Failed", "Success", "nfc_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class ChipAuthenticationStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ChipAuthenticationStatus[] $VALUES;
    public static final ChipAuthenticationStatus NotRequested = new ChipAuthenticationStatus("NotRequested", 0);
    public static final ChipAuthenticationStatus NotSupported = new ChipAuthenticationStatus("NotSupported", 1);
    public static final ChipAuthenticationStatus Failed = new ChipAuthenticationStatus("Failed", 2);
    public static final ChipAuthenticationStatus Success = new ChipAuthenticationStatus("Success", 3);

    private static final /* synthetic */ ChipAuthenticationStatus[] $values() {
        return new ChipAuthenticationStatus[]{NotRequested, NotSupported, Failed, Success};
    }

    public static EnumEntries<ChipAuthenticationStatus> getEntries() {
        return $ENTRIES;
    }

    private ChipAuthenticationStatus(String str, int i) {
    }

    static {
        ChipAuthenticationStatus[] chipAuthenticationStatusArr$values = $values();
        $VALUES = chipAuthenticationStatusArr$values;
        $ENTRIES = EnumEntries2.enumEntries(chipAuthenticationStatusArr$values);
    }

    public static ChipAuthenticationStatus valueOf(String str) {
        return (ChipAuthenticationStatus) Enum.valueOf(ChipAuthenticationStatus.class, str);
    }

    public static ChipAuthenticationStatus[] values() {
        return (ChipAuthenticationStatus[]) $VALUES.clone();
    }
}

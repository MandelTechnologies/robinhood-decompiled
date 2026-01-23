package com.robinhood.android.equities.equityupsell;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UpsellLocation.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equities/equityupsell/UpsellLocation;", "", "<init>", "(Ljava/lang/String;I)V", "LADDER", "MAC", "lib-equity-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class UpsellLocation {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UpsellLocation[] $VALUES;
    public static final UpsellLocation LADDER = new UpsellLocation("LADDER", 0);
    public static final UpsellLocation MAC = new UpsellLocation("MAC", 1);

    private static final /* synthetic */ UpsellLocation[] $values() {
        return new UpsellLocation[]{LADDER, MAC};
    }

    public static EnumEntries<UpsellLocation> getEntries() {
        return $ENTRIES;
    }

    private UpsellLocation(String str, int i) {
    }

    static {
        UpsellLocation[] upsellLocationArr$values = $values();
        $VALUES = upsellLocationArr$values;
        $ENTRIES = EnumEntries2.enumEntries(upsellLocationArr$values);
    }

    public static UpsellLocation valueOf(String str) {
        return (UpsellLocation) Enum.valueOf(UpsellLocation.class, str);
    }

    public static UpsellLocation[] values() {
        return (UpsellLocation[]) $VALUES.clone();
    }
}

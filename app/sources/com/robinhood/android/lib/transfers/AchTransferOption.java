package com.robinhood.android.lib.transfers;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AchTransferOption.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/lib/transfers/AchTransferOption;", "", "<init>", "(Ljava/lang/String;I)V", "STANDARD", "INSTANT", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class AchTransferOption {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AchTransferOption[] $VALUES;
    public static final AchTransferOption STANDARD = new AchTransferOption("STANDARD", 0);
    public static final AchTransferOption INSTANT = new AchTransferOption("INSTANT", 1);

    private static final /* synthetic */ AchTransferOption[] $values() {
        return new AchTransferOption[]{STANDARD, INSTANT};
    }

    public static EnumEntries<AchTransferOption> getEntries() {
        return $ENTRIES;
    }

    private AchTransferOption(String str, int i) {
    }

    static {
        AchTransferOption[] achTransferOptionArr$values = $values();
        $VALUES = achTransferOptionArr$values;
        $ENTRIES = EnumEntries2.enumEntries(achTransferOptionArr$values);
    }

    public static AchTransferOption valueOf(String str) {
        return (AchTransferOption) Enum.valueOf(AchTransferOption.class, str);
    }

    public static AchTransferOption[] values() {
        return (AchTransferOption[]) $VALUES.clone();
    }
}

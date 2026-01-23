package com.robinhood.librobinhood.usecase;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CheckOptionUpgradeToLevel3EligibilityUseCase.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/librobinhood/usecase/ShowOptionsLevel3EntryPointSurface;", "", "<init>", "(Ljava/lang/String;I)V", "OPTIONS_ASSET_HOME", "POST_TRADE_UPSELL", "SDP", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.usecase.ShowOptionsLevel3EntryPointSurface, reason: use source file name */
/* loaded from: classes13.dex */
public final class CheckOptionUpgradeToLevel3EligibilityUseCase3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CheckOptionUpgradeToLevel3EligibilityUseCase3[] $VALUES;
    public static final CheckOptionUpgradeToLevel3EligibilityUseCase3 OPTIONS_ASSET_HOME = new CheckOptionUpgradeToLevel3EligibilityUseCase3("OPTIONS_ASSET_HOME", 0);
    public static final CheckOptionUpgradeToLevel3EligibilityUseCase3 POST_TRADE_UPSELL = new CheckOptionUpgradeToLevel3EligibilityUseCase3("POST_TRADE_UPSELL", 1);
    public static final CheckOptionUpgradeToLevel3EligibilityUseCase3 SDP = new CheckOptionUpgradeToLevel3EligibilityUseCase3("SDP", 2);

    private static final /* synthetic */ CheckOptionUpgradeToLevel3EligibilityUseCase3[] $values() {
        return new CheckOptionUpgradeToLevel3EligibilityUseCase3[]{OPTIONS_ASSET_HOME, POST_TRADE_UPSELL, SDP};
    }

    public static EnumEntries<CheckOptionUpgradeToLevel3EligibilityUseCase3> getEntries() {
        return $ENTRIES;
    }

    private CheckOptionUpgradeToLevel3EligibilityUseCase3(String str, int i) {
    }

    static {
        CheckOptionUpgradeToLevel3EligibilityUseCase3[] checkOptionUpgradeToLevel3EligibilityUseCase3Arr$values = $values();
        $VALUES = checkOptionUpgradeToLevel3EligibilityUseCase3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(checkOptionUpgradeToLevel3EligibilityUseCase3Arr$values);
    }

    public static CheckOptionUpgradeToLevel3EligibilityUseCase3 valueOf(String str) {
        return (CheckOptionUpgradeToLevel3EligibilityUseCase3) Enum.valueOf(CheckOptionUpgradeToLevel3EligibilityUseCase3.class, str);
    }

    public static CheckOptionUpgradeToLevel3EligibilityUseCase3[] values() {
        return (CheckOptionUpgradeToLevel3EligibilityUseCase3[]) $VALUES.clone();
    }
}

package com.robinhood.android.optionsupgrade;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionOnboardingStates.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionUpgradeExperimentType;", "", "<init>", "(Ljava/lang/String;I)V", "OPTIONS_L0_SPLASH_EXPERIMENT", "OPTIONS_L2_SPLASH_EXPERIMENT", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionUpgradeExperimentType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionUpgradeExperimentType[] $VALUES;
    public static final OptionUpgradeExperimentType OPTIONS_L0_SPLASH_EXPERIMENT = new OptionUpgradeExperimentType("OPTIONS_L0_SPLASH_EXPERIMENT", 0);
    public static final OptionUpgradeExperimentType OPTIONS_L2_SPLASH_EXPERIMENT = new OptionUpgradeExperimentType("OPTIONS_L2_SPLASH_EXPERIMENT", 1);

    private static final /* synthetic */ OptionUpgradeExperimentType[] $values() {
        return new OptionUpgradeExperimentType[]{OPTIONS_L0_SPLASH_EXPERIMENT, OPTIONS_L2_SPLASH_EXPERIMENT};
    }

    public static EnumEntries<OptionUpgradeExperimentType> getEntries() {
        return $ENTRIES;
    }

    private OptionUpgradeExperimentType(String str, int i) {
    }

    static {
        OptionUpgradeExperimentType[] optionUpgradeExperimentTypeArr$values = $values();
        $VALUES = optionUpgradeExperimentTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionUpgradeExperimentTypeArr$values);
    }

    public static OptionUpgradeExperimentType valueOf(String str) {
        return (OptionUpgradeExperimentType) Enum.valueOf(OptionUpgradeExperimentType.class, str);
    }

    public static OptionUpgradeExperimentType[] values() {
        return (OptionUpgradeExperimentType[]) $VALUES.clone();
    }
}

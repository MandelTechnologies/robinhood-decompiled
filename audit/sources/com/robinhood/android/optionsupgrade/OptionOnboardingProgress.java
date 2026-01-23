package com.robinhood.android.optionsupgrade;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionOnboardingStates.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "", "<init>", "(Ljava/lang/String;I)V", "IN_PROGRESS", "SUCCESS", "FAILURE", "ALREADY_HAS_OPTIONS_ACCESS", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionOnboardingProgress {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionOnboardingProgress[] $VALUES;
    public static final OptionOnboardingProgress IN_PROGRESS = new OptionOnboardingProgress("IN_PROGRESS", 0);
    public static final OptionOnboardingProgress SUCCESS = new OptionOnboardingProgress("SUCCESS", 1);
    public static final OptionOnboardingProgress FAILURE = new OptionOnboardingProgress("FAILURE", 2);
    public static final OptionOnboardingProgress ALREADY_HAS_OPTIONS_ACCESS = new OptionOnboardingProgress("ALREADY_HAS_OPTIONS_ACCESS", 3);

    private static final /* synthetic */ OptionOnboardingProgress[] $values() {
        return new OptionOnboardingProgress[]{IN_PROGRESS, SUCCESS, FAILURE, ALREADY_HAS_OPTIONS_ACCESS};
    }

    public static EnumEntries<OptionOnboardingProgress> getEntries() {
        return $ENTRIES;
    }

    private OptionOnboardingProgress(String str, int i) {
    }

    static {
        OptionOnboardingProgress[] optionOnboardingProgressArr$values = $values();
        $VALUES = optionOnboardingProgressArr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionOnboardingProgressArr$values);
    }

    public static OptionOnboardingProgress valueOf(String str) {
        return (OptionOnboardingProgress) Enum.valueOf(OptionOnboardingProgress.class, str);
    }

    public static OptionOnboardingProgress[] values() {
        return (OptionOnboardingProgress[]) $VALUES.clone();
    }
}

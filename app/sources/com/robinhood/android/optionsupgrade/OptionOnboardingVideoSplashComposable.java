package com.robinhood.android.optionsupgrade;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionOnboardingVideoSplashComposable.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/FoldMode;", "", "<init>", "(Ljava/lang/String;I)V", "SLAB", "UNFOLDED", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.FoldMode, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionOnboardingVideoSplashComposable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionOnboardingVideoSplashComposable[] $VALUES;
    public static final OptionOnboardingVideoSplashComposable SLAB = new OptionOnboardingVideoSplashComposable("SLAB", 0);
    public static final OptionOnboardingVideoSplashComposable UNFOLDED = new OptionOnboardingVideoSplashComposable("UNFOLDED", 1);

    private static final /* synthetic */ OptionOnboardingVideoSplashComposable[] $values() {
        return new OptionOnboardingVideoSplashComposable[]{SLAB, UNFOLDED};
    }

    public static EnumEntries<OptionOnboardingVideoSplashComposable> getEntries() {
        return $ENTRIES;
    }

    static {
        OptionOnboardingVideoSplashComposable[] optionOnboardingVideoSplashComposableArr$values = $values();
        $VALUES = optionOnboardingVideoSplashComposableArr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionOnboardingVideoSplashComposableArr$values);
    }

    private OptionOnboardingVideoSplashComposable(String str, int i) {
    }

    public static OptionOnboardingVideoSplashComposable valueOf(String str) {
        return (OptionOnboardingVideoSplashComposable) Enum.valueOf(OptionOnboardingVideoSplashComposable.class, str);
    }

    public static OptionOnboardingVideoSplashComposable[] values() {
        return (OptionOnboardingVideoSplashComposable[]) $VALUES.clone();
    }
}

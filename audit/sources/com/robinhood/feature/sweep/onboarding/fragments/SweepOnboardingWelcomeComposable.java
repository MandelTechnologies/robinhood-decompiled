package com.robinhood.feature.sweep.onboarding.fragments;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SweepOnboardingWelcomeComposable.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/fragments/PrimaryButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "STANDARD", "GOLD", "SPARKLE", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.feature.sweep.onboarding.fragments.PrimaryButtonType, reason: use source file name */
/* loaded from: classes15.dex */
public final class SweepOnboardingWelcomeComposable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SweepOnboardingWelcomeComposable[] $VALUES;
    public static final SweepOnboardingWelcomeComposable STANDARD = new SweepOnboardingWelcomeComposable("STANDARD", 0);
    public static final SweepOnboardingWelcomeComposable GOLD = new SweepOnboardingWelcomeComposable("GOLD", 1);
    public static final SweepOnboardingWelcomeComposable SPARKLE = new SweepOnboardingWelcomeComposable("SPARKLE", 2);

    private static final /* synthetic */ SweepOnboardingWelcomeComposable[] $values() {
        return new SweepOnboardingWelcomeComposable[]{STANDARD, GOLD, SPARKLE};
    }

    public static EnumEntries<SweepOnboardingWelcomeComposable> getEntries() {
        return $ENTRIES;
    }

    private SweepOnboardingWelcomeComposable(String str, int i) {
    }

    static {
        SweepOnboardingWelcomeComposable[] sweepOnboardingWelcomeComposableArr$values = $values();
        $VALUES = sweepOnboardingWelcomeComposableArr$values;
        $ENTRIES = EnumEntries2.enumEntries(sweepOnboardingWelcomeComposableArr$values);
    }

    public static SweepOnboardingWelcomeComposable valueOf(String str) {
        return (SweepOnboardingWelcomeComposable) Enum.valueOf(SweepOnboardingWelcomeComposable.class, str);
    }

    public static SweepOnboardingWelcomeComposable[] values() {
        return (SweepOnboardingWelcomeComposable[]) $VALUES.clone();
    }
}

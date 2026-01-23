package com.robinhood.android.optionsupgrade;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionOnboardingDisclosureStates.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ErrorDialogType;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "LOADING_ERROR", "SIGNING_ERROR", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.ErrorDialogType, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionOnboardingDisclosureStates {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionOnboardingDisclosureStates[] $VALUES;
    public static final OptionOnboardingDisclosureStates NONE = new OptionOnboardingDisclosureStates("NONE", 0);
    public static final OptionOnboardingDisclosureStates LOADING_ERROR = new OptionOnboardingDisclosureStates("LOADING_ERROR", 1);
    public static final OptionOnboardingDisclosureStates SIGNING_ERROR = new OptionOnboardingDisclosureStates("SIGNING_ERROR", 2);

    private static final /* synthetic */ OptionOnboardingDisclosureStates[] $values() {
        return new OptionOnboardingDisclosureStates[]{NONE, LOADING_ERROR, SIGNING_ERROR};
    }

    public static EnumEntries<OptionOnboardingDisclosureStates> getEntries() {
        return $ENTRIES;
    }

    private OptionOnboardingDisclosureStates(String str, int i) {
    }

    static {
        OptionOnboardingDisclosureStates[] optionOnboardingDisclosureStatesArr$values = $values();
        $VALUES = optionOnboardingDisclosureStatesArr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionOnboardingDisclosureStatesArr$values);
    }

    public static OptionOnboardingDisclosureStates valueOf(String str) {
        return (OptionOnboardingDisclosureStates) Enum.valueOf(OptionOnboardingDisclosureStates.class, str);
    }

    public static OptionOnboardingDisclosureStates[] values() {
        return (OptionOnboardingDisclosureStates[]) $VALUES.clone();
    }
}

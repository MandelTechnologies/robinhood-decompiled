package com.robinhood.android.options.contracts;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionAlertOnboardingSource.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionAlertOnboardingSource;", "", "<init>", "(Ljava/lang/String;I)V", "DEEPLINK", "UPGRADE", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionAlertOnboardingSource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionAlertOnboardingSource[] $VALUES;
    public static final OptionAlertOnboardingSource DEEPLINK = new OptionAlertOnboardingSource("DEEPLINK", 0);
    public static final OptionAlertOnboardingSource UPGRADE = new OptionAlertOnboardingSource("UPGRADE", 1);

    private static final /* synthetic */ OptionAlertOnboardingSource[] $values() {
        return new OptionAlertOnboardingSource[]{DEEPLINK, UPGRADE};
    }

    public static EnumEntries<OptionAlertOnboardingSource> getEntries() {
        return $ENTRIES;
    }

    private OptionAlertOnboardingSource(String str, int i) {
    }

    static {
        OptionAlertOnboardingSource[] optionAlertOnboardingSourceArr$values = $values();
        $VALUES = optionAlertOnboardingSourceArr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionAlertOnboardingSourceArr$values);
    }

    public static OptionAlertOnboardingSource valueOf(String str) {
        return (OptionAlertOnboardingSource) Enum.valueOf(OptionAlertOnboardingSource.class, str);
    }

    public static OptionAlertOnboardingSource[] values() {
        return (OptionAlertOnboardingSource[]) $VALUES.clone();
    }
}

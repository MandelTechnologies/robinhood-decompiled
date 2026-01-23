package com.robinhood.android.common.options.rolling;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionRollingContentful.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/options/rolling/OptionRollingContentful;", "", "contentfulId", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getContentfulId", "()Ljava/lang/String;", "OPTIONS_ROLLING_LEARN_MORE", "OPTION_ROLLING_RISK_DISCLOSURES", "UK_OPTION_ROLLING_RISK_DISCLOSURES", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class OptionRollingContentful {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionRollingContentful[] $VALUES;
    public static final OptionRollingContentful OPTIONS_ROLLING_LEARN_MORE = new OptionRollingContentful("OPTIONS_ROLLING_LEARN_MORE", 0, "4mk6UBK3BJSkcLw9sdLA2B");
    public static final OptionRollingContentful OPTION_ROLLING_RISK_DISCLOSURES = new OptionRollingContentful("OPTION_ROLLING_RISK_DISCLOSURES", 1, "75kXhgncu0RWbKtplMCQfx");
    public static final OptionRollingContentful UK_OPTION_ROLLING_RISK_DISCLOSURES = new OptionRollingContentful("UK_OPTION_ROLLING_RISK_DISCLOSURES", 2, "5zwo62NGg3fCcF3yIgREnc");
    private final String contentfulId;

    private static final /* synthetic */ OptionRollingContentful[] $values() {
        return new OptionRollingContentful[]{OPTIONS_ROLLING_LEARN_MORE, OPTION_ROLLING_RISK_DISCLOSURES, UK_OPTION_ROLLING_RISK_DISCLOSURES};
    }

    public static EnumEntries<OptionRollingContentful> getEntries() {
        return $ENTRIES;
    }

    private OptionRollingContentful(String str, int i, String str2) {
        this.contentfulId = str2;
    }

    public final String getContentfulId() {
        return this.contentfulId;
    }

    static {
        OptionRollingContentful[] optionRollingContentfulArr$values = $values();
        $VALUES = optionRollingContentfulArr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionRollingContentfulArr$values);
    }

    public static OptionRollingContentful valueOf(String str) {
        return (OptionRollingContentful) Enum.valueOf(OptionRollingContentful.class, str);
    }

    public static OptionRollingContentful[] values() {
        return (OptionRollingContentful[]) $VALUES.clone();
    }
}

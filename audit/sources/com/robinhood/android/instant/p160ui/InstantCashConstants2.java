package com.robinhood.android.instant.p160ui;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InstantCashConstants.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/instant/ui/SwitchAccountSource;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SOURCE_INVESTING_SETTINGS_ACCOUNT_TYPE", "SOURCE_MARGIN_INVESTING_SECTION", "SOURCE_EQUITY", "SOURCE_OPTIONS_ROLLING", "SOURCE_OPTIONS_L3_UPGRADE", "SOURCE_OPTIONS_L3_UPGRADE_SETTINGS", "SOURCE_OPTIONS_L3_UPGRADE_STRATEGY_BUILDER", "SOURCE_SWEEP_SECTION", "SOURCE_MARGIN_ACCOUNT_UPSELL", "feature-lib-instant_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.instant.ui.SwitchAccountSource, reason: use source file name */
/* loaded from: classes10.dex */
public final class InstantCashConstants2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InstantCashConstants2[] $VALUES;
    private final String value;
    public static final InstantCashConstants2 SOURCE_INVESTING_SETTINGS_ACCOUNT_TYPE = new InstantCashConstants2("SOURCE_INVESTING_SETTINGS_ACCOUNT_TYPE", 0, "investing_settings_account_type");
    public static final InstantCashConstants2 SOURCE_MARGIN_INVESTING_SECTION = new InstantCashConstants2("SOURCE_MARGIN_INVESTING_SECTION", 1, "margin_investing_section");
    public static final InstantCashConstants2 SOURCE_EQUITY = new InstantCashConstants2("SOURCE_EQUITY", 2, ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_EQUITY);
    public static final InstantCashConstants2 SOURCE_OPTIONS_ROLLING = new InstantCashConstants2("SOURCE_OPTIONS_ROLLING", 3, "options_rolling");
    public static final InstantCashConstants2 SOURCE_OPTIONS_L3_UPGRADE = new InstantCashConstants2("SOURCE_OPTIONS_L3_UPGRADE", 4, "options_l3_upgrade");
    public static final InstantCashConstants2 SOURCE_OPTIONS_L3_UPGRADE_SETTINGS = new InstantCashConstants2("SOURCE_OPTIONS_L3_UPGRADE_SETTINGS", 5, "options_l3_upgrade_settings");
    public static final InstantCashConstants2 SOURCE_OPTIONS_L3_UPGRADE_STRATEGY_BUILDER = new InstantCashConstants2("SOURCE_OPTIONS_L3_UPGRADE_STRATEGY_BUILDER", 6, "options_l3_upgrade_strategy_builder");
    public static final InstantCashConstants2 SOURCE_SWEEP_SECTION = new InstantCashConstants2("SOURCE_SWEEP_SECTION", 7, "sweep_section");
    public static final InstantCashConstants2 SOURCE_MARGIN_ACCOUNT_UPSELL = new InstantCashConstants2("SOURCE_MARGIN_ACCOUNT_UPSELL", 8, "margin_account_upsell");

    private static final /* synthetic */ InstantCashConstants2[] $values() {
        return new InstantCashConstants2[]{SOURCE_INVESTING_SETTINGS_ACCOUNT_TYPE, SOURCE_MARGIN_INVESTING_SECTION, SOURCE_EQUITY, SOURCE_OPTIONS_ROLLING, SOURCE_OPTIONS_L3_UPGRADE, SOURCE_OPTIONS_L3_UPGRADE_SETTINGS, SOURCE_OPTIONS_L3_UPGRADE_STRATEGY_BUILDER, SOURCE_SWEEP_SECTION, SOURCE_MARGIN_ACCOUNT_UPSELL};
    }

    public static EnumEntries<InstantCashConstants2> getEntries() {
        return $ENTRIES;
    }

    private InstantCashConstants2(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        InstantCashConstants2[] instantCashConstants2Arr$values = $values();
        $VALUES = instantCashConstants2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(instantCashConstants2Arr$values);
    }

    public static InstantCashConstants2 valueOf(String str) {
        return (InstantCashConstants2) Enum.valueOf(InstantCashConstants2.class, str);
    }

    public static InstantCashConstants2[] values() {
        return (InstantCashConstants2[]) $VALUES.clone();
    }
}

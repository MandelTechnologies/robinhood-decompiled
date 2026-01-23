package com.robinhood.shared.settings.contracts;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SettingsFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/settings/contracts/SettingsLaunchType;", "", "<init>", "(Ljava/lang/String;I)V", "LAUNCH_NONE", "LAUNCH_UPDATE_ACCOUNT", "LAUNCH_OPTIONS_SETTINGS", "LAUNCH_NOTIFICATION_SETTINGS", "LAUNCH_CASH_MANAGEMENT_SETTINGS", "LAUNCH_APP_APPEARANCE_SETTINGS", "LAUNCH_APP_AUTO_PLAY_SETTINGS", "LAUNCH_DAY_TRADE_SETTINGS", "LAUNCH_MARGIN_SETTINGS", "LAUNCH_INVESTMENT_PROFILE", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.settings.contracts.SettingsLaunchType, reason: use source file name */
/* loaded from: classes6.dex */
public final class SettingsFragmentKey3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SettingsFragmentKey3[] $VALUES;
    public static final SettingsFragmentKey3 LAUNCH_NONE = new SettingsFragmentKey3("LAUNCH_NONE", 0);
    public static final SettingsFragmentKey3 LAUNCH_UPDATE_ACCOUNT = new SettingsFragmentKey3("LAUNCH_UPDATE_ACCOUNT", 1);
    public static final SettingsFragmentKey3 LAUNCH_OPTIONS_SETTINGS = new SettingsFragmentKey3("LAUNCH_OPTIONS_SETTINGS", 2);
    public static final SettingsFragmentKey3 LAUNCH_NOTIFICATION_SETTINGS = new SettingsFragmentKey3("LAUNCH_NOTIFICATION_SETTINGS", 3);
    public static final SettingsFragmentKey3 LAUNCH_CASH_MANAGEMENT_SETTINGS = new SettingsFragmentKey3("LAUNCH_CASH_MANAGEMENT_SETTINGS", 4);
    public static final SettingsFragmentKey3 LAUNCH_APP_APPEARANCE_SETTINGS = new SettingsFragmentKey3("LAUNCH_APP_APPEARANCE_SETTINGS", 5);
    public static final SettingsFragmentKey3 LAUNCH_APP_AUTO_PLAY_SETTINGS = new SettingsFragmentKey3("LAUNCH_APP_AUTO_PLAY_SETTINGS", 6);
    public static final SettingsFragmentKey3 LAUNCH_DAY_TRADE_SETTINGS = new SettingsFragmentKey3("LAUNCH_DAY_TRADE_SETTINGS", 7);
    public static final SettingsFragmentKey3 LAUNCH_MARGIN_SETTINGS = new SettingsFragmentKey3("LAUNCH_MARGIN_SETTINGS", 8);
    public static final SettingsFragmentKey3 LAUNCH_INVESTMENT_PROFILE = new SettingsFragmentKey3("LAUNCH_INVESTMENT_PROFILE", 9);

    private static final /* synthetic */ SettingsFragmentKey3[] $values() {
        return new SettingsFragmentKey3[]{LAUNCH_NONE, LAUNCH_UPDATE_ACCOUNT, LAUNCH_OPTIONS_SETTINGS, LAUNCH_NOTIFICATION_SETTINGS, LAUNCH_CASH_MANAGEMENT_SETTINGS, LAUNCH_APP_APPEARANCE_SETTINGS, LAUNCH_APP_AUTO_PLAY_SETTINGS, LAUNCH_DAY_TRADE_SETTINGS, LAUNCH_MARGIN_SETTINGS, LAUNCH_INVESTMENT_PROFILE};
    }

    public static EnumEntries<SettingsFragmentKey3> getEntries() {
        return $ENTRIES;
    }

    private SettingsFragmentKey3(String str, int i) {
    }

    static {
        SettingsFragmentKey3[] settingsFragmentKey3Arr$values = $values();
        $VALUES = settingsFragmentKey3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(settingsFragmentKey3Arr$values);
    }

    public static SettingsFragmentKey3 valueOf(String str) {
        return (SettingsFragmentKey3) Enum.valueOf(SettingsFragmentKey3.class, str);
    }

    public static SettingsFragmentKey3[] values() {
        return (SettingsFragmentKey3[]) $VALUES.clone();
    }
}

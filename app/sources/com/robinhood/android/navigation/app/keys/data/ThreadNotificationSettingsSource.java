package com.robinhood.android.navigation.app.keys.data;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ThreadNotificationSettingsSource.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/ThreadNotificationSettingsSource;", "", "analyticsSource", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getAnalyticsSource", "()Ljava/lang/String;", "MUTED_SETTINGS", "THREAD_MESSAGES", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class ThreadNotificationSettingsSource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ThreadNotificationSettingsSource[] $VALUES;
    public static final ThreadNotificationSettingsSource MUTED_SETTINGS = new ThreadNotificationSettingsSource("MUTED_SETTINGS", 0, AnalyticsStrings.MUTED_SETTINGS_SCREEN_NAME);
    public static final ThreadNotificationSettingsSource THREAD_MESSAGES = new ThreadNotificationSettingsSource("THREAD_MESSAGES", 1, "ThreadMessages");
    private final String analyticsSource;

    private static final /* synthetic */ ThreadNotificationSettingsSource[] $values() {
        return new ThreadNotificationSettingsSource[]{MUTED_SETTINGS, THREAD_MESSAGES};
    }

    public static EnumEntries<ThreadNotificationSettingsSource> getEntries() {
        return $ENTRIES;
    }

    private ThreadNotificationSettingsSource(String str, int i, String str2) {
        this.analyticsSource = str2;
    }

    public final String getAnalyticsSource() {
        return this.analyticsSource;
    }

    static {
        ThreadNotificationSettingsSource[] threadNotificationSettingsSourceArr$values = $values();
        $VALUES = threadNotificationSettingsSourceArr$values;
        $ENTRIES = EnumEntries2.enumEntries(threadNotificationSettingsSourceArr$values);
    }

    public static ThreadNotificationSettingsSource valueOf(String str) {
        return (ThreadNotificationSettingsSource) Enum.valueOf(ThreadNotificationSettingsSource.class, str);
    }

    public static ThreadNotificationSettingsSource[] values() {
        return (ThreadNotificationSettingsSource[]) $VALUES.clone();
    }
}

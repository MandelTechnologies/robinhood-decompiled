package com.robinhood.analytics.performance.startup;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import p479j$.time.Instant;

/* compiled from: StartupActivity.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\nR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/analytics/performance/startup/StartupActivity;", "", "j$/time/Instant", "getConstructionTimestamp", "()Lj$/time/Instant;", "constructionTimestamp", "Lcom/robinhood/analytics/performance/startup/StartupActivity$Screen;", "getScreen", "()Lcom/robinhood/analytics/performance/startup/StartupActivity$Screen;", "screen", "Screen", "lib-startup-performance_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface StartupActivity {
    Instant getConstructionTimestamp();

    Screen getScreen();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StartupActivity.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/analytics/performance/startup/StartupActivity$Screen;", "", "<init>", "(Ljava/lang/String;I)V", "LOGIN", "WELCOME", "LOCKSCREEN", "MAIN_TAB", "lib-startup-performance_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Screen {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Screen[] $VALUES;
        public static final Screen LOGIN = new Screen("LOGIN", 0);
        public static final Screen WELCOME = new Screen("WELCOME", 1);
        public static final Screen LOCKSCREEN = new Screen("LOCKSCREEN", 2);
        public static final Screen MAIN_TAB = new Screen("MAIN_TAB", 3);

        private static final /* synthetic */ Screen[] $values() {
            return new Screen[]{LOGIN, WELCOME, LOCKSCREEN, MAIN_TAB};
        }

        public static EnumEntries<Screen> getEntries() {
            return $ENTRIES;
        }

        private Screen(String str, int i) {
        }

        static {
            Screen[] screenArr$values = $values();
            $VALUES = screenArr$values;
            $ENTRIES = EnumEntries2.enumEntries(screenArr$values);
        }

        public static Screen valueOf(String str) {
            return (Screen) Enum.valueOf(Screen.class, str);
        }

        public static Screen[] values() {
            return (Screen[]) $VALUES.clone();
        }
    }
}

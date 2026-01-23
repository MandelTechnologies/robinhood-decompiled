package com.robinhood.android.lib.webview.data;

import com.robinhood.android.common.p088ui.daynight.NightModeManager2;
import com.robinhood.android.designsystem.prefs.Theme;
import com.robinhood.android.designsystem.style.ColorScheme;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisplayInfo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/lib/webview/data/DisplayInfo;", "", "theme", "Lcom/robinhood/android/designsystem/prefs/Theme;", "colorScheme", "Lcom/robinhood/android/designsystem/style/ColorScheme;", "dayNightMode", "Lcom/robinhood/android/common/ui/daynight/DayNightMode;", "<init>", "(Lcom/robinhood/android/designsystem/prefs/Theme;Lcom/robinhood/android/designsystem/style/ColorScheme;Lcom/robinhood/android/common/ui/daynight/DayNightMode;)V", "getTheme", "()Lcom/robinhood/android/designsystem/prefs/Theme;", "getColorScheme", "()Lcom/robinhood/android/designsystem/style/ColorScheme;", "getDayNightMode", "()Lcom/robinhood/android/common/ui/daynight/DayNightMode;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-webview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class DisplayInfo {
    private final ColorScheme colorScheme;
    private final NightModeManager2 dayNightMode;
    private final Theme theme;

    public static /* synthetic */ DisplayInfo copy$default(DisplayInfo displayInfo, Theme theme, ColorScheme colorScheme, NightModeManager2 nightModeManager2, int i, Object obj) {
        if ((i & 1) != 0) {
            theme = displayInfo.theme;
        }
        if ((i & 2) != 0) {
            colorScheme = displayInfo.colorScheme;
        }
        if ((i & 4) != 0) {
            nightModeManager2 = displayInfo.dayNightMode;
        }
        return displayInfo.copy(theme, colorScheme, nightModeManager2);
    }

    /* renamed from: component1, reason: from getter */
    public final Theme getTheme() {
        return this.theme;
    }

    /* renamed from: component2, reason: from getter */
    public final ColorScheme getColorScheme() {
        return this.colorScheme;
    }

    /* renamed from: component3, reason: from getter */
    public final NightModeManager2 getDayNightMode() {
        return this.dayNightMode;
    }

    public final DisplayInfo copy(Theme theme, ColorScheme colorScheme, NightModeManager2 dayNightMode) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        Intrinsics.checkNotNullParameter(dayNightMode, "dayNightMode");
        return new DisplayInfo(theme, colorScheme, dayNightMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayInfo)) {
            return false;
        }
        DisplayInfo displayInfo = (DisplayInfo) other;
        return this.theme == displayInfo.theme && this.colorScheme == displayInfo.colorScheme && this.dayNightMode == displayInfo.dayNightMode;
    }

    public int hashCode() {
        return (((this.theme.hashCode() * 31) + this.colorScheme.hashCode()) * 31) + this.dayNightMode.hashCode();
    }

    public String toString() {
        return "DisplayInfo(theme=" + this.theme + ", colorScheme=" + this.colorScheme + ", dayNightMode=" + this.dayNightMode + ")";
    }

    public DisplayInfo(Theme theme, ColorScheme colorScheme, NightModeManager2 dayNightMode) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        Intrinsics.checkNotNullParameter(dayNightMode, "dayNightMode");
        this.theme = theme;
        this.colorScheme = colorScheme;
        this.dayNightMode = dayNightMode;
    }

    public /* synthetic */ DisplayInfo(Theme theme, ColorScheme colorScheme, NightModeManager2 nightModeManager2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Theme.MARKET : theme, colorScheme, nightModeManager2);
    }

    public final Theme getTheme() {
        return this.theme;
    }

    public final ColorScheme getColorScheme() {
        return this.colorScheme;
    }

    public final NightModeManager2 getDayNightMode() {
        return this.dayNightMode;
    }
}

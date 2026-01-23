package com.robinhood.android.common.util.lifecycle;

import com.robinhood.android.common.util.UiCallbacks;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SourceScreenAnalytics.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eJ\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0012R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/common/util/lifecycle/SourceScreenAnalytics;", "", "<init>", "()V", "sourceDataMap", "", "", "Lcom/robinhood/android/common/util/lifecycle/SourceScreenAnalytics$SourceData;", "droppedScreens", "mostRecentSourceData", "onScreenResumed", "", "screen", "Lcom/robinhood/android/common/util/UiCallbacks$ScreenViewAnalyticable;", "onScreenResumed$lib_common_externalRelease", "onScreenPaused", "", "timeSpent", "onScreenPaused$lib_common_externalRelease", "SourceData", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class SourceScreenAnalytics {
    private static final String NO_PREVIOUS_SCREEN = "no_previous_screen";
    private SourceData mostRecentSourceData;
    public static final int $stable = 8;
    private final Map<Integer, SourceData> sourceDataMap = new LinkedHashMap();
    private final Map<Integer, SourceData> droppedScreens = new LinkedHashMap();

    public final void onScreenResumed$lib_common_externalRelease(UiCallbacks.ScreenViewAnalyticable screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (screen.getExcludeFromSourceLogging()) {
            return;
        }
        SourceData sourceData = this.mostRecentSourceData;
        if (sourceData != null) {
            this.sourceDataMap.put(Integer.valueOf(screen.hashCode()), sourceData);
        }
        this.mostRecentSourceData = new SourceData(screen.hashCode(), screen.getScreenName());
    }

    public final String onScreenPaused$lib_common_externalRelease(UiCallbacks.ScreenViewAnalyticable screen, int timeSpent) {
        String screenName;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (screen.getExcludeFromSourceLogging()) {
            return null;
        }
        if (timeSpent <= 250) {
            SourceData sourceDataRemove = this.sourceDataMap.remove(Integer.valueOf(screen.hashCode()));
            if (sourceDataRemove != null) {
                this.droppedScreens.put(Integer.valueOf(screen.hashCode()), sourceDataRemove);
            }
            return null;
        }
        SourceData sourceDataRemove2 = this.sourceDataMap.remove(Integer.valueOf(screen.hashCode()));
        if (sourceDataRemove2 != null) {
            while (true) {
                Map<Integer, SourceData> map = this.droppedScreens;
                Intrinsics.checkNotNull(sourceDataRemove2);
                if (!map.containsKey(Integer.valueOf(sourceDataRemove2.getHashCode()))) {
                    break;
                }
                sourceDataRemove2 = this.droppedScreens.remove(Integer.valueOf(sourceDataRemove2.getHashCode()));
            }
        }
        return (sourceDataRemove2 == null || (screenName = sourceDataRemove2.getScreenName()) == null) ? NO_PREVIOUS_SCREEN : screenName;
    }

    /* compiled from: SourceScreenAnalytics.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/util/lifecycle/SourceScreenAnalytics$SourceData;", "", "hashCode", "", "screenName", "", "<init>", "(ILjava/lang/String;)V", "getHashCode", "()I", "getScreenName", "()Ljava/lang/String;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class SourceData {
        private final int hashCode;
        private final String screenName;

        public SourceData(int i, String screenName) {
            Intrinsics.checkNotNullParameter(screenName, "screenName");
            this.hashCode = i;
            this.screenName = screenName;
        }

        public final int getHashCode() {
            return this.hashCode;
        }

        public final String getScreenName() {
            return this.screenName;
        }
    }
}

package com.robinhood.android.common.util;

import kotlin.Metadata;

/* compiled from: UiCallbacks.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/common/util/UiCallbacks;", "", "<init>", "()V", "ScreenViewAnalyticable", "ProgressDisplay", "Clearable", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class UiCallbacks {
    public static final int $stable = 0;

    /* compiled from: UiCallbacks.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/util/UiCallbacks$Clearable;", "", "clear", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public interface Clearable {
        void clear();
    }

    /* compiled from: UiCallbacks.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/util/UiCallbacks$ProgressDisplay;", "", "showLoading", "", "loading", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface ProgressDisplay {
        void showLoading(boolean loading);
    }

    /* compiled from: UiCallbacks.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\n\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0005R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0005R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0005R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0005R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001a¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/common/util/UiCallbacks$ScreenViewAnalyticable;", "", "screenName", "", "getScreenName", "()Ljava/lang/String;", "screenDescription", "getScreenDescription", "screenSource", "getScreenSource", "getAndResetTransitionReason", "screenDepth", "", "getScreenDepth", "()Ljava/lang/Integer;", "screenMessageType", "getScreenMessageType", "screenType", "getScreenType", "entityId", "getEntityId", "screenTag", "getScreenTag", "excludeFromSourceLogging", "", "getExcludeFromSourceLogging", "()Z", "excludeFromAnalyticsLogging", "getExcludeFromAnalyticsLogging", "isParentScreen", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public interface ScreenViewAnalyticable {
        String getAndResetTransitionReason();

        String getEntityId();

        boolean getExcludeFromAnalyticsLogging();

        boolean getExcludeFromSourceLogging();

        Integer getScreenDepth();

        String getScreenDescription();

        String getScreenMessageType();

        String getScreenName();

        String getScreenSource();

        String getScreenTag();

        String getScreenType();

        boolean isParentScreen();

        /* compiled from: UiCallbacks.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static String getAndResetTransitionReason(ScreenViewAnalyticable screenViewAnalyticable) {
                return null;
            }

            public static String getEntityId(ScreenViewAnalyticable screenViewAnalyticable) {
                return null;
            }

            public static boolean getExcludeFromAnalyticsLogging(ScreenViewAnalyticable screenViewAnalyticable) {
                return false;
            }

            public static Integer getScreenDepth(ScreenViewAnalyticable screenViewAnalyticable) {
                return null;
            }

            public static String getScreenDescription(ScreenViewAnalyticable screenViewAnalyticable) {
                return null;
            }

            public static String getScreenMessageType(ScreenViewAnalyticable screenViewAnalyticable) {
                return null;
            }

            public static String getScreenSource(ScreenViewAnalyticable screenViewAnalyticable) {
                return null;
            }

            public static String getScreenTag(ScreenViewAnalyticable screenViewAnalyticable) {
                return null;
            }

            public static String getScreenType(ScreenViewAnalyticable screenViewAnalyticable) {
                return null;
            }

            public static boolean isParentScreen(ScreenViewAnalyticable screenViewAnalyticable) {
                return false;
            }

            public static boolean getExcludeFromSourceLogging(ScreenViewAnalyticable screenViewAnalyticable) {
                return screenViewAnalyticable.getExcludeFromAnalyticsLogging();
            }
        }
    }
}

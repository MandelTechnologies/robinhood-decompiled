package com.robinhood.android.common.util;

import android.os.SystemClock;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.robinhood.analytics.AnalyticsLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnalyticsTabOnPageChangeListener.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rJ\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\rH$J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/common/util/AnalyticsTabOnPageChangeListener;", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "tabGroupName", "", "tag", "<init>", "(Lcom/robinhood/analytics/AnalyticsLogger;Ljava/lang/String;Ljava/lang/String;)V", "startTimeForTab", "", "currentPosition", "", "onPageSelected", "", "position", "getTabName", "handlePageSelected", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public abstract class AnalyticsTabOnPageChangeListener extends ViewPager2.OnPageChangeCallback implements ViewPager.OnPageChangeListener {
    public static final int $stable = 8;
    private final AnalyticsLogger analytics;
    private int currentPosition;
    private long startTimeForTab;
    private final String tabGroupName;
    private final String tag;

    protected abstract String getTabName(int position);

    protected void handlePageSelected(int position) {
    }

    public /* synthetic */ AnalyticsTabOnPageChangeListener(AnalyticsLogger analyticsLogger, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(analyticsLogger, str, (i & 4) != 0 ? null : str2);
    }

    public AnalyticsTabOnPageChangeListener(AnalyticsLogger analytics, String tabGroupName, String str) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(tabGroupName, "tabGroupName");
        this.analytics = analytics;
        this.tabGroupName = tabGroupName;
        this.tag = str;
        this.currentPosition = -1;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int position) {
        int i;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.startTimeForTab;
        if (j > 0 && (i = this.currentPosition) != -1 && position != i) {
            this.analytics.logTabGroup(this.tabGroupName, getTabName(i), Long.valueOf(jElapsedRealtime - j), this.tag);
        }
        this.startTimeForTab = jElapsedRealtime;
        this.currentPosition = position;
        handlePageSelected(position);
    }
}

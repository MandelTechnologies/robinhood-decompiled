package com.robinhood.android.advanced.alert.utils;

import com.robinhood.models.advanced.alert.api.ApiAlertHubSettingItem;
import com.robinhood.models.advanced.alert.api.IntervalDisplayResources;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntervalDisplayResources.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"getSubtitle", "", "Lcom/robinhood/models/advanced/alert/api/IntervalDisplayResources;", "interval", "Lcom/robinhood/models/advanced/alert/api/ApiAlertHubSettingItem$Interval;", "feature-lib-advanced-alert_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advanced.alert.utils.IntervalDisplayResourcesKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class IntervalDisplayResources2 {

    /* compiled from: IntervalDisplayResources.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advanced.alert.utils.IntervalDisplayResourcesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiAlertHubSettingItem.Interval.values().length];
            try {
                iArr[ApiAlertHubSettingItem.Interval.FIVE_MINUTES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAlertHubSettingItem.Interval.TEN_MINUTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiAlertHubSettingItem.Interval.HOUR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiAlertHubSettingItem.Interval.DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiAlertHubSettingItem.Interval.WEEK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getSubtitle(IntervalDisplayResources intervalDisplayResources, ApiAlertHubSettingItem.Interval interval) {
        Intrinsics.checkNotNullParameter(intervalDisplayResources, "<this>");
        Intrinsics.checkNotNullParameter(interval, "interval");
        int i = WhenMappings.$EnumSwitchMapping$0[interval.ordinal()];
        if (i == 1) {
            return intervalDisplayResources.getFiveMinuteDescription();
        }
        if (i == 2) {
            return intervalDisplayResources.getTenMinuteDescription();
        }
        if (i == 3) {
            return intervalDisplayResources.getHourDescription();
        }
        if (i == 4) {
            return intervalDisplayResources.getDayDescription();
        }
        if (i == 5) {
            return intervalDisplayResources.getWeekDescription();
        }
        return "";
    }
}

package com.robinhood.android.settings.p254ui.notification;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: NotificationSettings4ComposeDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0000¨\u0006\u0004"}, m3636d2 = {"notificationSettingsScreenName", "", "subPageReference", "Lcom/robinhood/shared/settings/contracts/SubPageReference;", "feature-settings_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposeDuxoKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class NotificationSettings4ComposeDuxo2 {
    public static final String notificationSettingsScreenName(NotificationSettings4FragmentKey3 notificationSettings4FragmentKey3) {
        if (notificationSettings4FragmentKey3 instanceof NotificationSettings4FragmentKey3.FromId) {
            return AnalyticsStrings.NOTIFICATIONS_SETTINGS_PAGE_SCREEN_NAME;
        }
        if (notificationSettings4FragmentKey3 instanceof NotificationSettings4FragmentKey3.FromViews) {
            return AnalyticsStrings.NOTIFICATIONS_SETTINGS_DETAIL_SCREEN_NAME;
        }
        if (notificationSettings4FragmentKey3 != null) {
            throw new NoWhenBranchMatchedException();
        }
        return AnalyticsStrings.NOTIFICATIONS_SETTINGS_LANDING_SCREEN_NAME;
    }
}

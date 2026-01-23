package com.robinhood.android.settings.util.extensions;

import com.robinhood.models.api.ApiNotificationSettingsToggleSettingsItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Statuses.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"asAnalyticsTag", "", "Lcom/robinhood/models/api/ApiNotificationSettingsToggleSettingsItem$Status;", "feature-settings_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.settings.util.extensions.StatusesKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class Statuses {
    public static final String asAnalyticsTag(ApiNotificationSettingsToggleSettingsItem.Status status) {
        Intrinsics.checkNotNullParameter(status, "<this>");
        return status == ApiNotificationSettingsToggleSettingsItem.Status.OFF ? "disabled" : "enabled";
    }
}

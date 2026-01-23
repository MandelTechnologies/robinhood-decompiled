package com.robinhood.shared.settings.iibsettings;

import com.robinhood.models.serverdriven.api.ApiGenericAction;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey3;
import kotlin.Metadata;

/* compiled from: NotificationSettingsCallbacks.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/settings/iibsettings/NotificationSettingsCallbacks;", "", "onNotificationSettings4SubPageClicked", "", "subPageReference", "Lcom/robinhood/shared/settings/contracts/SubPageReference;", "onNotificationSettings4ActionTriggered", "action", "Lcom/robinhood/models/serverdriven/api/ApiGenericAction;", "onNotificationSettings4MutedClicked", "lib-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface NotificationSettingsCallbacks {
    void onNotificationSettings4ActionTriggered(ApiGenericAction action);

    void onNotificationSettings4MutedClicked();

    void onNotificationSettings4SubPageClicked(NotificationSettings4FragmentKey3 subPageReference);
}

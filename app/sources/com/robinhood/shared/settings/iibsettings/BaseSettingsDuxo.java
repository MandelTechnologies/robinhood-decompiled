package com.robinhood.shared.settings.iibsettings;

import com.robinhood.android.settings.models.p253ui.TypedSettingsItem;
import kotlin.Metadata;

/* compiled from: BaseSettingsDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\tH&¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/settings/iibsettings/BaseSettingsDuxo;", "", "refreshAccountsAndIacBanners", "", "logTapSwitchToCashAccount", "updateToggleSetting", "toggleItem", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$ToggleItem;", "newValue", "", "updateSelectOneSetting", "selectOneItem", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$SelectOneItem;", "selection", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$SelectOneItem$Option;", "updateLocationProtection", "enabled", "lib-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface BaseSettingsDuxo {
    void logTapSwitchToCashAccount();

    void refreshAccountsAndIacBanners();

    void updateLocationProtection(boolean enabled);

    void updateSelectOneSetting(TypedSettingsItem.SelectOneItem selectOneItem, TypedSettingsItem.SelectOneItem.Option selection);

    void updateToggleSetting(TypedSettingsItem.ToggleItem toggleItem, boolean newValue);
}

package com.robinhood.android.slip.onboarding.hub;

import com.robinhood.android.account.icons.AccountDisplayIcons;
import com.robinhood.android.slip.C28532R;
import com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsDataState;
import com.robinhood.android.slip.onboarding.hub.p256ui.SettingsToggleAlertViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.SlipEnabledResponse;
import com.robinhood.models.p320db.SlipHub;
import com.robinhood.shared.account.contracts.switcher.AccountToggleData;
import com.robinhood.shared.account.contracts.switcher.AccountToggleRowData;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SlipHubSettingsMultiAccountsStateProvider.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016JJ\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsDataState;", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsViewState;", "<init>", "()V", "reduce", "dataState", "getAccountToggleData", "Lcom/robinhood/shared/account/contracts/switcher/AccountToggleData;", "accountDetailsMap", "", "", "Lcom/robinhood/models/db/SlipHub$SlipHubAccountDetails;", "accountStatusMap", "Lcom/robinhood/models/db/SlipEnabledResponse;", "accountNumbersCurrentlyUpdating", "", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getToggleAlertViewState", "Lcom/robinhood/android/slip/onboarding/hub/ui/SettingsToggleAlertViewState;", "dialogToShow", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsDataState$DialogToShowData;", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SlipHubSettingsMultiAccountsStateProvider implements StateProvider<SlipHubSettingsMultiAccountsDataState, SlipHubSettingsMultiAccountsViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public SlipHubSettingsMultiAccountsViewState reduce(SlipHubSettingsMultiAccountsDataState dataState) {
        SettingsToggleAlertViewState toggleAlertViewState;
        SlipHub.SettingsPage settingsPage;
        SlipHub.SettingsPage settingsPage2;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        SlipHub slipHub = dataState.getSlipHub();
        String titleV2 = (slipHub == null || (settingsPage2 = slipHub.getSettingsPage()) == null) ? null : settingsPage2.getTitleV2();
        SlipHub slipHub2 = dataState.getSlipHub();
        String descriptionV2 = (slipHub2 == null || (settingsPage = slipHub2.getSettingsPage()) == null) ? null : settingsPage.getDescriptionV2();
        if (dataState.getDialogToShow() != null) {
            SlipHubSettingsMultiAccountsDataState.DialogToShowData dialogToShow = dataState.getDialogToShow();
            SlipHub slipHub3 = dataState.getSlipHub();
            Map<String, SlipHub.SlipHubAccountDetails> accountDetailsMap = slipHub3 != null ? slipHub3.getAccountDetailsMap() : null;
            if (accountDetailsMap == null) {
                accountDetailsMap = MapsKt.emptyMap();
            }
            toggleAlertViewState = getToggleAlertViewState(dialogToShow, accountDetailsMap);
        } else {
            toggleAlertViewState = null;
        }
        SlipHub slipHub4 = dataState.getSlipHub();
        Map<String, SlipHub.SlipHubAccountDetails> accountDetailsMap2 = slipHub4 != null ? slipHub4.getAccountDetailsMap() : null;
        if (accountDetailsMap2 == null) {
            accountDetailsMap2 = MapsKt.emptyMap();
        }
        Map<String, SlipEnabledResponse> accountStatusMap = dataState.getAccountStatusMap();
        if (accountStatusMap == null) {
            accountStatusMap = MapsKt.emptyMap();
        }
        return new SlipHubSettingsMultiAccountsViewState(titleV2, descriptionV2, toggleAlertViewState, getAccountToggleData(accountDetailsMap2, accountStatusMap, dataState.getAccountNumbersCurrentlyUpdating(), dataState.getUserLocality()));
    }

    static /* synthetic */ AccountToggleData getAccountToggleData$default(SlipHubSettingsMultiAccountsStateProvider slipHubSettingsMultiAccountsStateProvider, Map map, Map map2, Set set, CountryCode.Supported supported, int i, Object obj) {
        if ((i & 8) != 0) {
            supported = null;
        }
        return slipHubSettingsMultiAccountsStateProvider.getAccountToggleData(map, map2, set, supported);
    }

    private final SettingsToggleAlertViewState getToggleAlertViewState(SlipHubSettingsMultiAccountsDataState.DialogToShowData dialogToShow, Map<String, SlipHub.SlipHubAccountDetails> accountDetailsMap) {
        SlipHub.SlipHubAccountDetails slipHubAccountDetails = accountDetailsMap.get(dialogToShow.getAccountNumber());
        if (slipHubAccountDetails == null) {
            return null;
        }
        if (dialogToShow.getEnabled()) {
            SlipHub.EnableAlert enableAlert = slipHubAccountDetails.getEnableAlert();
            return new SettingsToggleAlertViewState(dialogToShow.getAccountNumber(), enableAlert.getTitle(), enableAlert.getContent(), enableAlert.getCtaButtonTitle(), enableAlert.getDismissButtonTitle(), true);
        }
        SlipHub.DisableAlert disableAlert = slipHubAccountDetails.getDisableAlert();
        return new SettingsToggleAlertViewState(dialogToShow.getAccountNumber(), disableAlert.getTitle(), disableAlert.getContent(), disableAlert.getDisableButtonTitle(), disableAlert.getDismissButtonTitle(), false);
    }

    private final AccountToggleData getAccountToggleData(Map<String, SlipHub.SlipHubAccountDetails> accountDetailsMap, Map<String, SlipEnabledResponse> accountStatusMap, Set<String> accountNumbersCurrentlyUpdating, CountryCode.Supported locality) {
        int i;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, SlipHub.SlipHubAccountDetails> entry : accountDetailsMap.entrySet()) {
            String key = entry.getKey();
            SlipHub.SlipHubAccountDetails value = entry.getValue();
            SlipEnabledResponse slipEnabledResponse = accountStatusMap.get(key);
            AccountToggleRowData accountToggleRowData = null;
            if (slipEnabledResponse != null) {
                StringResource.Companion companion = StringResource.INSTANCE;
                int i2 = C28532R.string.account_status_toggle_row_subtitle;
                if (slipEnabledResponse.isEnabled()) {
                    i = C28532R.string.enabled;
                } else {
                    i = C28532R.string.disabled;
                }
                accountToggleRowData = new AccountToggleRowData(value.getBrokerageAccountType(), value.getManagementType(), value.getCreatedAt(), null, key, companion.invoke(value.getAccountName()), Intrinsics.areEqual(locality, CountryCode.Supported.UnitedKingdom.INSTANCE) ? companion.invoke(i2, companion.invoke(i, new Object[0])) : null, AccountDisplayIcons.getDisplayIcon24(value.getBrokerageAccountType(), value.getManagementType()), slipEnabledResponse.isEnabled(), accountNumbersCurrentlyUpdating.contains(key), 8, null);
            }
            if (accountToggleRowData != null) {
                arrayList.add(accountToggleRowData);
            }
        }
        return new AccountToggleData(extensions2.toImmutableList(arrayList));
    }
}

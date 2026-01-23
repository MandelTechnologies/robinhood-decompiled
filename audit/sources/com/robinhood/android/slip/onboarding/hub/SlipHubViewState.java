package com.robinhood.android.slip.onboarding.hub;

import android.content.res.Resources;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.icons.AccountDisplayIcons;
import com.robinhood.android.slip.C28532R;
import com.robinhood.android.slip.onboarding.hub.p256ui.HubPageViewModel;
import com.robinhood.android.slip.onboarding.hub.p256ui.HubPageViewModel2;
import com.robinhood.android.slip.onboarding.hub.p256ui.HubPageViewModel3;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.p320db.SlipEnabledResponse;
import com.robinhood.models.p320db.SlipHub;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherRowData;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: SlipHubViewState.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001JB\u0093\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u000207J\u001a\u00108\u001a\u0004\u0018\u00010\u000f2\u0006\u00109\u001a\u00020\u00032\b\u0010:\u001a\u0004\u0018\u00010\u000fJ\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010>\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003J\u0011\u0010?\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0015\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u000fHÂ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0013HÂ\u0003J\u0095\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u0010E\u001a\u00020\u00032\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020HHÖ\u0001J\t\u0010I\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\u0004\u0018\u00010!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0016R\u0014\u0010&\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0016R\u001c\u0010(\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0016R\u0011\u0010/\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b0\u0010\u0016R\u0016\u00101\u001a\u0004\u0018\u00010*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u0006K"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/hub/SlipHubViewState;", "", "isLoading", "", "hub", "Lcom/robinhood/models/db/SlipHub;", "slipUnavailableEvent", "Lcom/robinhood/udf/UiEvent;", "", "updateConsentEvent", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubViewState$Result;", "disableSlipSurveyEvent", "redirectToOnboardingEvent", "accountStatusMap", "", "", "Lcom/robinhood/models/db/SlipEnabledResponse;", "_selectedAccountNumber", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "(ZLcom/robinhood/models/db/SlipHub;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Ljava/util/Map;Ljava/lang/String;Lcom/robinhood/iso/countrycode/CountryCode$Supported;)V", "()Z", "getHub", "()Lcom/robinhood/models/db/SlipHub;", "getSlipUnavailableEvent", "()Lcom/robinhood/udf/UiEvent;", "getUpdateConsentEvent", "getDisableSlipSurveyEvent", "getRedirectToOnboardingEvent", "getAccountStatusMap", "()Ljava/util/Map;", "selectedAccountDetails", "Lcom/robinhood/models/db/SlipHub$SlipHubAccountDetails;", "getSelectedAccountDetails", "()Lcom/robinhood/models/db/SlipHub$SlipHubAccountDetails;", "shouldShowSwitcher", "getShouldShowSwitcher", "showEnableAlert", "getShowEnableAlert", "accountList", "", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherRowData$Account;", "getAccountList", "()Ljava/util/List;", "hasAllAccountsDetail", "getHasAllAccountsDetail", "overrideOnClickEnableCta", "getOverrideOnClickEnableCta", "selectedAccount", "getSelectedAccount", "()Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherRowData$Account;", "currentPageViewModel", "Lcom/robinhood/android/slip/onboarding/hub/ui/HubPageViewModel;", "resources", "Landroid/content/res/Resources;", "getConfirmationText", "enabled", "accountNumber", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "Result", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final /* data */ class SlipHubViewState {
    public static final int $stable = 8;
    private final String _selectedAccountNumber;
    private final Map<String, SlipEnabledResponse> accountStatusMap;
    private final UiEvent<Unit> disableSlipSurveyEvent;
    private final SlipHub hub;
    private final boolean isLoading;
    private final CountryCode.Supported locality;
    private final UiEvent<Unit> redirectToOnboardingEvent;
    private final UiEvent<Unit> slipUnavailableEvent;
    private final UiEvent<Result> updateConsentEvent;

    public SlipHubViewState() {
        this(false, null, null, null, null, null, null, null, null, 511, null);
    }

    /* renamed from: component8, reason: from getter */
    private final String get_selectedAccountNumber() {
        return this._selectedAccountNumber;
    }

    /* renamed from: component9, reason: from getter */
    private final CountryCode.Supported getLocality() {
        return this.locality;
    }

    public static /* synthetic */ SlipHubViewState copy$default(SlipHubViewState slipHubViewState, boolean z, SlipHub slipHub, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, Map map, String str, CountryCode.Supported supported, int i, Object obj) {
        if ((i & 1) != 0) {
            z = slipHubViewState.isLoading;
        }
        if ((i & 2) != 0) {
            slipHub = slipHubViewState.hub;
        }
        if ((i & 4) != 0) {
            uiEvent = slipHubViewState.slipUnavailableEvent;
        }
        if ((i & 8) != 0) {
            uiEvent2 = slipHubViewState.updateConsentEvent;
        }
        if ((i & 16) != 0) {
            uiEvent3 = slipHubViewState.disableSlipSurveyEvent;
        }
        if ((i & 32) != 0) {
            uiEvent4 = slipHubViewState.redirectToOnboardingEvent;
        }
        if ((i & 64) != 0) {
            map = slipHubViewState.accountStatusMap;
        }
        if ((i & 128) != 0) {
            str = slipHubViewState._selectedAccountNumber;
        }
        if ((i & 256) != 0) {
            supported = slipHubViewState.locality;
        }
        String str2 = str;
        CountryCode.Supported supported2 = supported;
        UiEvent uiEvent5 = uiEvent4;
        Map map2 = map;
        UiEvent uiEvent6 = uiEvent3;
        UiEvent uiEvent7 = uiEvent;
        return slipHubViewState.copy(z, slipHub, uiEvent7, uiEvent2, uiEvent6, uiEvent5, map2, str2, supported2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final SlipHub getHub() {
        return this.hub;
    }

    public final UiEvent<Unit> component3() {
        return this.slipUnavailableEvent;
    }

    public final UiEvent<Result> component4() {
        return this.updateConsentEvent;
    }

    public final UiEvent<Unit> component5() {
        return this.disableSlipSurveyEvent;
    }

    public final UiEvent<Unit> component6() {
        return this.redirectToOnboardingEvent;
    }

    public final Map<String, SlipEnabledResponse> component7() {
        return this.accountStatusMap;
    }

    public final SlipHubViewState copy(boolean isLoading, SlipHub hub, UiEvent<Unit> slipUnavailableEvent, UiEvent<Result> updateConsentEvent, UiEvent<Unit> disableSlipSurveyEvent, UiEvent<Unit> redirectToOnboardingEvent, Map<String, SlipEnabledResponse> accountStatusMap, String _selectedAccountNumber, CountryCode.Supported locality) {
        Intrinsics.checkNotNullParameter(accountStatusMap, "accountStatusMap");
        return new SlipHubViewState(isLoading, hub, slipUnavailableEvent, updateConsentEvent, disableSlipSurveyEvent, redirectToOnboardingEvent, accountStatusMap, _selectedAccountNumber, locality);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlipHubViewState)) {
            return false;
        }
        SlipHubViewState slipHubViewState = (SlipHubViewState) other;
        return this.isLoading == slipHubViewState.isLoading && Intrinsics.areEqual(this.hub, slipHubViewState.hub) && Intrinsics.areEqual(this.slipUnavailableEvent, slipHubViewState.slipUnavailableEvent) && Intrinsics.areEqual(this.updateConsentEvent, slipHubViewState.updateConsentEvent) && Intrinsics.areEqual(this.disableSlipSurveyEvent, slipHubViewState.disableSlipSurveyEvent) && Intrinsics.areEqual(this.redirectToOnboardingEvent, slipHubViewState.redirectToOnboardingEvent) && Intrinsics.areEqual(this.accountStatusMap, slipHubViewState.accountStatusMap) && Intrinsics.areEqual(this._selectedAccountNumber, slipHubViewState._selectedAccountNumber) && Intrinsics.areEqual(this.locality, slipHubViewState.locality);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        SlipHub slipHub = this.hub;
        int iHashCode2 = (iHashCode + (slipHub == null ? 0 : slipHub.hashCode())) * 31;
        UiEvent<Unit> uiEvent = this.slipUnavailableEvent;
        int iHashCode3 = (iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Result> uiEvent2 = this.updateConsentEvent;
        int iHashCode4 = (iHashCode3 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<Unit> uiEvent3 = this.disableSlipSurveyEvent;
        int iHashCode5 = (iHashCode4 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31;
        UiEvent<Unit> uiEvent4 = this.redirectToOnboardingEvent;
        int iHashCode6 = (((iHashCode5 + (uiEvent4 == null ? 0 : uiEvent4.hashCode())) * 31) + this.accountStatusMap.hashCode()) * 31;
        String str = this._selectedAccountNumber;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        CountryCode.Supported supported = this.locality;
        return iHashCode7 + (supported != null ? supported.hashCode() : 0);
    }

    public String toString() {
        return "SlipHubViewState(isLoading=" + this.isLoading + ", hub=" + this.hub + ", slipUnavailableEvent=" + this.slipUnavailableEvent + ", updateConsentEvent=" + this.updateConsentEvent + ", disableSlipSurveyEvent=" + this.disableSlipSurveyEvent + ", redirectToOnboardingEvent=" + this.redirectToOnboardingEvent + ", accountStatusMap=" + this.accountStatusMap + ", _selectedAccountNumber=" + this._selectedAccountNumber + ", locality=" + this.locality + ")";
    }

    public SlipHubViewState(boolean z, SlipHub slipHub, UiEvent<Unit> uiEvent, UiEvent<Result> uiEvent2, UiEvent<Unit> uiEvent3, UiEvent<Unit> uiEvent4, Map<String, SlipEnabledResponse> accountStatusMap, String str, CountryCode.Supported supported) {
        Intrinsics.checkNotNullParameter(accountStatusMap, "accountStatusMap");
        this.isLoading = z;
        this.hub = slipHub;
        this.slipUnavailableEvent = uiEvent;
        this.updateConsentEvent = uiEvent2;
        this.disableSlipSurveyEvent = uiEvent3;
        this.redirectToOnboardingEvent = uiEvent4;
        this.accountStatusMap = accountStatusMap;
        this._selectedAccountNumber = str;
        this.locality = supported;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final SlipHub getHub() {
        return this.hub;
    }

    public final UiEvent<Unit> getSlipUnavailableEvent() {
        return this.slipUnavailableEvent;
    }

    public final UiEvent<Result> getUpdateConsentEvent() {
        return this.updateConsentEvent;
    }

    public final UiEvent<Unit> getDisableSlipSurveyEvent() {
        return this.disableSlipSurveyEvent;
    }

    public final UiEvent<Unit> getRedirectToOnboardingEvent() {
        return this.redirectToOnboardingEvent;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ SlipHubViewState(boolean r2, com.robinhood.models.p320db.SlipHub r3, com.robinhood.udf.UiEvent r4, com.robinhood.udf.UiEvent r5, com.robinhood.udf.UiEvent r6, com.robinhood.udf.UiEvent r7, java.util.Map r8, java.lang.String r9, com.robinhood.iso.countrycode.CountryCode.Supported r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r1 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L5
            r2 = 0
        L5:
            r12 = r11 & 2
            r0 = 0
            if (r12 == 0) goto Lb
            r3 = r0
        Lb:
            r12 = r11 & 4
            if (r12 == 0) goto L10
            r4 = r0
        L10:
            r12 = r11 & 8
            if (r12 == 0) goto L15
            r5 = r0
        L15:
            r12 = r11 & 16
            if (r12 == 0) goto L1a
            r6 = r0
        L1a:
            r12 = r11 & 32
            if (r12 == 0) goto L1f
            r7 = r0
        L1f:
            r12 = r11 & 64
            if (r12 == 0) goto L27
            java.util.Map r8 = kotlin.collections.MapsKt.emptyMap()
        L27:
            r12 = r11 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L2c
            r9 = r0
        L2c:
            r11 = r11 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L3b
            r12 = r0
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L45
        L3b:
            r12 = r10
            r11 = r9
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L45:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.slip.onboarding.hub.SlipHubViewState.<init>(boolean, com.robinhood.models.db.SlipHub, com.robinhood.udf.UiEvent, com.robinhood.udf.UiEvent, com.robinhood.udf.UiEvent, com.robinhood.udf.UiEvent, java.util.Map, java.lang.String, com.robinhood.iso.countrycode.CountryCode$Supported, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Map<String, SlipEnabledResponse> getAccountStatusMap() {
        return this.accountStatusMap;
    }

    private final SlipHub.SlipHubAccountDetails getSelectedAccountDetails() {
        Map<String, SlipHub.SlipHubAccountDetails> accountDetailsMap;
        SlipHub slipHub = this.hub;
        if (slipHub == null || (accountDetailsMap = slipHub.getAccountDetailsMap()) == null) {
            return null;
        }
        AccountSwitcherRowData.Account selectedAccount = getSelectedAccount();
        return accountDetailsMap.get(selectedAccount != null ? selectedAccount.getId() : null);
    }

    private final boolean getShouldShowSwitcher() {
        List<AccountSwitcherRowData.Account> accountList = getAccountList();
        return (accountList != null ? accountList.size() : 0) > 1;
    }

    private final boolean getShowEnableAlert() {
        List<AccountSwitcherRowData.Account> accountList = getAccountList();
        return (accountList != null ? accountList.size() : 0) > 1;
    }

    private final List<AccountSwitcherRowData.Account> getAccountList() {
        Map<String, SlipHub.SlipHubAccountDetails> accountDetailsMap;
        SlipHub slipHub = this.hub;
        if (slipHub == null || (accountDetailsMap = slipHub.getAccountDetailsMap()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(accountDetailsMap.size());
        for (Map.Entry<String, SlipHub.SlipHubAccountDetails> entry : accountDetailsMap.entrySet()) {
            String key = entry.getKey();
            SlipHub.SlipHubAccountDetails value = entry.getValue();
            SlipEnabledResponse slipEnabledResponse = this.accountStatusMap.get(key);
            boolean zIsEnabled = slipEnabledResponse != null ? slipEnabledResponse.isEnabled() : true;
            BrokerageAccountType brokerageAccountType = value.getBrokerageAccountType();
            Instant createdAt = value.getCreatedAt();
            ManagementType managementType = value.getManagementType();
            StringResource.Companion companion = StringResource.INSTANCE;
            arrayList.add(new AccountSwitcherRowData.Account(key, brokerageAccountType, managementType, createdAt, null, companion.invoke(value.getAccountName()), !zIsEnabled ? companion.invoke(C28532R.string.slip_hub_not_enabled, new Object[0]) : null, null, null, AccountDisplayIcons.getDisplayIcon24(value.getBrokerageAccountType(), value.getManagementType()), false, 1424, null));
        }
        return arrayList;
    }

    private final boolean getHasAllAccountsDetail() {
        SlipHub slipHub = this.hub;
        return (slipHub != null ? slipHub.getAllAccountsDetail() : null) != null;
    }

    public final boolean getOverrideOnClickEnableCta() {
        return Intrinsics.areEqual(this.locality, CountryCode.Supported.UnitedKingdom.INSTANCE);
    }

    private final AccountSwitcherRowData.Account getSelectedAccount() {
        Object next;
        List<AccountSwitcherRowData.Account> accountList = getAccountList();
        if (accountList != null) {
            Iterator<T> it = accountList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((AccountSwitcherRowData.Account) next).getId(), this._selectedAccountNumber)) {
                    break;
                }
            }
            AccountSwitcherRowData.Account account = (AccountSwitcherRowData.Account) next;
            if (account != null) {
                return account;
            }
        }
        List<AccountSwitcherRowData.Account> accountList2 = getAccountList();
        AccountSwitcherRowData.Account account2 = accountList2 != null ? (AccountSwitcherRowData.Account) CollectionsKt.firstOrNull((List) accountList2) : null;
        if (getHasAllAccountsDetail()) {
            return null;
        }
        return account2;
    }

    public final HubPageViewModel currentPageViewModel(Resources resources) {
        AccountSwitcherData accountSwitcherData;
        SlipHub.SlipHubAllAccountsDetail allAccountsDetail;
        AccountSwitcherData.ActiveSelection accountRow;
        String id;
        Intrinsics.checkNotNullParameter(resources, "resources");
        SlipHub.SlipHubAccountDetails selectedAccountDetails = getSelectedAccountDetails();
        List<AccountSwitcherRowData.Account> accountList = getAccountList();
        if (!getShouldShowSwitcher() || accountList == null) {
            accountSwitcherData = null;
        } else {
            AccountSwitcherRowData.Account selectedAccount = getSelectedAccount();
            if (selectedAccount != null && (id = selectedAccount.getId()) != null) {
                accountRow = new AccountSwitcherData.ActiveSelection.AccountRow(id);
            } else {
                accountRow = AccountSwitcherData.ActiveSelection.AllAccounts.INSTANCE;
            }
            accountSwitcherData = new AccountSwitcherData(accountList, accountRow, getHasAllAccountsDetail(), false, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        }
        boolean z = false;
        if (selectedAccountDetails != null) {
            SlipEnabledResponse slipEnabledResponse = this.accountStatusMap.get(selectedAccountDetails.getAccountNumber());
            if (slipEnabledResponse != null && !slipEnabledResponse.isEnabled()) {
                z = true;
            }
            String accountNumber = selectedAccountDetails.getAccountNumber();
            SlipHub slipHub = this.hub;
            Intrinsics.checkNotNull(slipHub);
            SlipHub.TextWithIconLink title = slipHub.getTitle();
            String accountName = getShouldShowSwitcher() ? selectedAccountDetails.getAccountName() : null;
            List<UIComponent<GenericAction>> headerContent = selectedAccountDetails.getHeaderContent();
            SlipHub.PaymentsCard previousMonthPaymentsCard = selectedAccountDetails.getPreviousMonthPaymentsCard();
            SlipHub.PaymentsCard totalPaymentsCard = selectedAccountDetails.getTotalPaymentsCard();
            SlipHub.InstrumentsSection instrumentsSection = selectedAccountDetails.getInstrumentsSection();
            String string2 = z ? resources.getString(C28532R.string.slip_hub_enable_lending) : null;
            String enableDeeplink = selectedAccountDetails.getEnableDeeplink();
            SlipHub.EnableAlert enableAlert = getShowEnableAlert() ? selectedAccountDetails.getEnableAlert() : null;
            AccountSwitcherRowData.Account selectedAccount2 = getSelectedAccount();
            return new HubPageViewModel2(title, accountName, headerContent, previousMonthPaymentsCard, totalPaymentsCard, instrumentsSection, accountSwitcherData, accountNumber, string2, enableDeeplink, enableAlert, selectedAccount2 != null ? selectedAccount2.getEnabled() : true);
        }
        SlipHub slipHub2 = this.hub;
        if (slipHub2 != null && (allAccountsDetail = slipHub2.getAllAccountsDetail()) != null) {
            return new HubPageViewModel3(this.hub.getTitle(), allAccountsDetail.getAccountName(), allAccountsDetail.getHeaderContent(), allAccountsDetail.getPreviousMonthPaymentsCard(), allAccountsDetail.getTotalPaymentsCard(), allAccountsDetail.getInstrumentsSection(), accountSwitcherData);
        }
        SlipHub slipHub3 = this.hub;
        if (slipHub3 != null) {
            return new HubPageViewModel2(slipHub3.getTitle(), null, this.hub.getHeaderContent(), this.hub.getPreviousMonthPaymentsCard(), this.hub.getTotalPaymentsCard(), this.hub.getInstrumentsSection(), null, null, slipHub3.getEnableButtonCta(), null, null, slipHub3.getEnableButtonCta() == null);
        }
        return null;
    }

    public final String getConfirmationText(boolean enabled, String accountNumber) {
        Map<String, SlipHub.SlipHubAccountDetails> accountDetailsMap;
        SlipHub.SlipHubAccountDetails slipHubAccountDetails;
        Map<String, SlipHub.SlipHubAccountDetails> accountDetailsMap2;
        SlipHub.SlipHubAccountDetails slipHubAccountDetails2;
        if (accountNumber == null) {
            if (enabled) {
                SlipHub slipHub = this.hub;
                if (slipHub != null) {
                    return slipHub.getEnableToastText();
                }
                return null;
            }
            SlipHub slipHub2 = this.hub;
            if (slipHub2 != null) {
                return slipHub2.getDisableToastText();
            }
            return null;
        }
        if (enabled) {
            SlipHub slipHub3 = this.hub;
            if (slipHub3 == null || (accountDetailsMap2 = slipHub3.getAccountDetailsMap()) == null || (slipHubAccountDetails2 = accountDetailsMap2.get(accountNumber)) == null) {
                return null;
            }
            return slipHubAccountDetails2.getEnableConfirmationText();
        }
        SlipHub slipHub4 = this.hub;
        if (slipHub4 == null || (accountDetailsMap = slipHub4.getAccountDetailsMap()) == null || (slipHubAccountDetails = accountDetailsMap.get(accountNumber)) == null) {
            return null;
        }
        return slipHubAccountDetails.getDisableConfirmationText();
    }

    /* compiled from: SlipHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/hub/SlipHubViewState$Result;", "", "<init>", "()V", "Success", "Failure", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubViewState$Result$Failure;", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubViewState$Result$Success;", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Result {
        public static final int $stable = 0;

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: SlipHubViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/hub/SlipHubViewState$Result$Success;", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubViewState$Result;", "toastMessage", "", "<init>", "(Ljava/lang/String;)V", "getToastMessage", "()Ljava/lang/String;", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Success extends Result {
            public static final int $stable = 0;
            private final String toastMessage;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(String toastMessage) {
                super(null);
                Intrinsics.checkNotNullParameter(toastMessage, "toastMessage");
                this.toastMessage = toastMessage;
            }

            public final String getToastMessage() {
                return this.toastMessage;
            }
        }

        private Result() {
        }

        /* compiled from: SlipHubViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/hub/SlipHubViewState$Result$Failure;", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubViewState$Result;", "<init>", "()V", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Failure extends Result {
            public static final int $stable = 0;
            public static final Failure INSTANCE = new Failure();

            private Failure() {
                super(null);
            }
        }
    }
}

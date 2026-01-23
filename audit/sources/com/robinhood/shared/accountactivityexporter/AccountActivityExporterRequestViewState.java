package com.robinhood.shared.accountactivityexporter;

import androidx.core.util.Pair;
import com.google.android.material.datepicker.CalendarConstraints;
import com.robinhood.models.accountactivityexporter.api.ApiAccountActivityExporterRequest;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountActivityExporterRequestViewState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u00101\u001a\u00020\u000fHÆ\u0003J\t\u00102\u001a\u00020\u000fHÆ\u0003J\t\u00103\u001a\u00020\u000fHÆ\u0003J\u0091\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u000fHÆ\u0001J\u0013\u00105\u001a\u00020\u000f2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0011\u0010\u0013\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0011\u0010\u0014\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#¨\u0006:"}, m3636d2 = {"Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestViewState;", "", "accountSelectorArgs", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "selectedAccountType", "Lcom/robinhood/utils/resource/StringResource;", "startDate", "", "endDate", "calendarConstraints", "Lcom/google/android/material/datepicker/CalendarConstraints;", "datePickerSelection", "Landroidx/core/util/Pair;", "", "shouldShowAccountSelector", "", "submitRequest", "Lcom/robinhood/models/accountactivityexporter/api/ApiAccountActivityExporterRequest;", "showLoadingIndicatorOnSubmitButton", "requestCompleted", "requestFailed", "<init>", "(Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/material/datepicker/CalendarConstraints;Landroidx/core/util/Pair;ZLcom/robinhood/models/accountactivityexporter/api/ApiAccountActivityExporterRequest;ZZZ)V", "getAccountSelectorArgs", "()Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "getSelectedAccountType", "()Lcom/robinhood/utils/resource/StringResource;", "getStartDate", "()Ljava/lang/String;", "getEndDate", "getCalendarConstraints", "()Lcom/google/android/material/datepicker/CalendarConstraints;", "getDatePickerSelection", "()Landroidx/core/util/Pair;", "getShouldShowAccountSelector", "()Z", "getSubmitRequest", "()Lcom/robinhood/models/accountactivityexporter/api/ApiAccountActivityExporterRequest;", "getShowLoadingIndicatorOnSubmitButton", "getRequestCompleted", "getRequestFailed", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "feature-account-activity-exporter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class AccountActivityExporterRequestViewState {
    public static final int $stable = 8;
    private final AccountSwitcherData accountSelectorArgs;
    private final CalendarConstraints calendarConstraints;
    private final Pair<Long, Long> datePickerSelection;
    private final String endDate;
    private final boolean requestCompleted;
    private final boolean requestFailed;
    private final StringResource selectedAccountType;
    private final boolean shouldShowAccountSelector;
    private final boolean showLoadingIndicatorOnSubmitButton;
    private final String startDate;
    private final ApiAccountActivityExporterRequest submitRequest;

    public static /* synthetic */ AccountActivityExporterRequestViewState copy$default(AccountActivityExporterRequestViewState accountActivityExporterRequestViewState, AccountSwitcherData accountSwitcherData, StringResource stringResource, String str, String str2, CalendarConstraints calendarConstraints, Pair pair, boolean z, ApiAccountActivityExporterRequest apiAccountActivityExporterRequest, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            accountSwitcherData = accountActivityExporterRequestViewState.accountSelectorArgs;
        }
        if ((i & 2) != 0) {
            stringResource = accountActivityExporterRequestViewState.selectedAccountType;
        }
        if ((i & 4) != 0) {
            str = accountActivityExporterRequestViewState.startDate;
        }
        if ((i & 8) != 0) {
            str2 = accountActivityExporterRequestViewState.endDate;
        }
        if ((i & 16) != 0) {
            calendarConstraints = accountActivityExporterRequestViewState.calendarConstraints;
        }
        if ((i & 32) != 0) {
            pair = accountActivityExporterRequestViewState.datePickerSelection;
        }
        if ((i & 64) != 0) {
            z = accountActivityExporterRequestViewState.shouldShowAccountSelector;
        }
        if ((i & 128) != 0) {
            apiAccountActivityExporterRequest = accountActivityExporterRequestViewState.submitRequest;
        }
        if ((i & 256) != 0) {
            z2 = accountActivityExporterRequestViewState.showLoadingIndicatorOnSubmitButton;
        }
        if ((i & 512) != 0) {
            z3 = accountActivityExporterRequestViewState.requestCompleted;
        }
        if ((i & 1024) != 0) {
            z4 = accountActivityExporterRequestViewState.requestFailed;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        ApiAccountActivityExporterRequest apiAccountActivityExporterRequest2 = apiAccountActivityExporterRequest;
        boolean z7 = z2;
        Pair pair2 = pair;
        boolean z8 = z;
        CalendarConstraints calendarConstraints2 = calendarConstraints;
        String str3 = str;
        return accountActivityExporterRequestViewState.copy(accountSwitcherData, stringResource, str3, str2, calendarConstraints2, pair2, z8, apiAccountActivityExporterRequest2, z7, z5, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final AccountSwitcherData getAccountSelectorArgs() {
        return this.accountSelectorArgs;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getRequestCompleted() {
        return this.requestCompleted;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getRequestFailed() {
        return this.requestFailed;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getSelectedAccountType() {
        return this.selectedAccountType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    /* renamed from: component5, reason: from getter */
    public final CalendarConstraints getCalendarConstraints() {
        return this.calendarConstraints;
    }

    public final Pair<Long, Long> component6() {
        return this.datePickerSelection;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShouldShowAccountSelector() {
        return this.shouldShowAccountSelector;
    }

    /* renamed from: component8, reason: from getter */
    public final ApiAccountActivityExporterRequest getSubmitRequest() {
        return this.submitRequest;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShowLoadingIndicatorOnSubmitButton() {
        return this.showLoadingIndicatorOnSubmitButton;
    }

    public final AccountActivityExporterRequestViewState copy(AccountSwitcherData accountSelectorArgs, StringResource selectedAccountType, String startDate, String endDate, CalendarConstraints calendarConstraints, Pair<Long, Long> datePickerSelection, boolean shouldShowAccountSelector, ApiAccountActivityExporterRequest submitRequest, boolean showLoadingIndicatorOnSubmitButton, boolean requestCompleted, boolean requestFailed) {
        return new AccountActivityExporterRequestViewState(accountSelectorArgs, selectedAccountType, startDate, endDate, calendarConstraints, datePickerSelection, shouldShowAccountSelector, submitRequest, showLoadingIndicatorOnSubmitButton, requestCompleted, requestFailed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountActivityExporterRequestViewState)) {
            return false;
        }
        AccountActivityExporterRequestViewState accountActivityExporterRequestViewState = (AccountActivityExporterRequestViewState) other;
        return Intrinsics.areEqual(this.accountSelectorArgs, accountActivityExporterRequestViewState.accountSelectorArgs) && Intrinsics.areEqual(this.selectedAccountType, accountActivityExporterRequestViewState.selectedAccountType) && Intrinsics.areEqual(this.startDate, accountActivityExporterRequestViewState.startDate) && Intrinsics.areEqual(this.endDate, accountActivityExporterRequestViewState.endDate) && Intrinsics.areEqual(this.calendarConstraints, accountActivityExporterRequestViewState.calendarConstraints) && Intrinsics.areEqual(this.datePickerSelection, accountActivityExporterRequestViewState.datePickerSelection) && this.shouldShowAccountSelector == accountActivityExporterRequestViewState.shouldShowAccountSelector && Intrinsics.areEqual(this.submitRequest, accountActivityExporterRequestViewState.submitRequest) && this.showLoadingIndicatorOnSubmitButton == accountActivityExporterRequestViewState.showLoadingIndicatorOnSubmitButton && this.requestCompleted == accountActivityExporterRequestViewState.requestCompleted && this.requestFailed == accountActivityExporterRequestViewState.requestFailed;
    }

    public int hashCode() {
        AccountSwitcherData accountSwitcherData = this.accountSelectorArgs;
        int iHashCode = (accountSwitcherData == null ? 0 : accountSwitcherData.hashCode()) * 31;
        StringResource stringResource = this.selectedAccountType;
        int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        String str = this.startDate;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.endDate;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CalendarConstraints calendarConstraints = this.calendarConstraints;
        int iHashCode5 = (iHashCode4 + (calendarConstraints == null ? 0 : calendarConstraints.hashCode())) * 31;
        Pair<Long, Long> pair = this.datePickerSelection;
        int iHashCode6 = (((iHashCode5 + (pair == null ? 0 : pair.hashCode())) * 31) + Boolean.hashCode(this.shouldShowAccountSelector)) * 31;
        ApiAccountActivityExporterRequest apiAccountActivityExporterRequest = this.submitRequest;
        return ((((((iHashCode6 + (apiAccountActivityExporterRequest != null ? apiAccountActivityExporterRequest.hashCode() : 0)) * 31) + Boolean.hashCode(this.showLoadingIndicatorOnSubmitButton)) * 31) + Boolean.hashCode(this.requestCompleted)) * 31) + Boolean.hashCode(this.requestFailed);
    }

    public String toString() {
        return "AccountActivityExporterRequestViewState(accountSelectorArgs=" + this.accountSelectorArgs + ", selectedAccountType=" + this.selectedAccountType + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", calendarConstraints=" + this.calendarConstraints + ", datePickerSelection=" + this.datePickerSelection + ", shouldShowAccountSelector=" + this.shouldShowAccountSelector + ", submitRequest=" + this.submitRequest + ", showLoadingIndicatorOnSubmitButton=" + this.showLoadingIndicatorOnSubmitButton + ", requestCompleted=" + this.requestCompleted + ", requestFailed=" + this.requestFailed + ")";
    }

    public AccountActivityExporterRequestViewState(AccountSwitcherData accountSwitcherData, StringResource stringResource, String str, String str2, CalendarConstraints calendarConstraints, Pair<Long, Long> pair, boolean z, ApiAccountActivityExporterRequest apiAccountActivityExporterRequest, boolean z2, boolean z3, boolean z4) {
        this.accountSelectorArgs = accountSwitcherData;
        this.selectedAccountType = stringResource;
        this.startDate = str;
        this.endDate = str2;
        this.calendarConstraints = calendarConstraints;
        this.datePickerSelection = pair;
        this.shouldShowAccountSelector = z;
        this.submitRequest = apiAccountActivityExporterRequest;
        this.showLoadingIndicatorOnSubmitButton = z2;
        this.requestCompleted = z3;
        this.requestFailed = z4;
    }

    public final AccountSwitcherData getAccountSelectorArgs() {
        return this.accountSelectorArgs;
    }

    public final StringResource getSelectedAccountType() {
        return this.selectedAccountType;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public final String getEndDate() {
        return this.endDate;
    }

    public final CalendarConstraints getCalendarConstraints() {
        return this.calendarConstraints;
    }

    public final Pair<Long, Long> getDatePickerSelection() {
        return this.datePickerSelection;
    }

    public final boolean getShouldShowAccountSelector() {
        return this.shouldShowAccountSelector;
    }

    public final ApiAccountActivityExporterRequest getSubmitRequest() {
        return this.submitRequest;
    }

    public final boolean getShowLoadingIndicatorOnSubmitButton() {
        return this.showLoadingIndicatorOnSubmitButton;
    }

    public final boolean getRequestCompleted() {
        return this.requestCompleted;
    }

    public final boolean getRequestFailed() {
        return this.requestFailed;
    }
}

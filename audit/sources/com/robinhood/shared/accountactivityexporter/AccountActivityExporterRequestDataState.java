package com.robinhood.shared.accountactivityexporter;

import com.robinhood.models.accountactivityexporter.api.ApiAccountActivityExporter;
import com.robinhood.models.p320db.Account;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;
import retrofit2.Response;

/* compiled from: AccountActivityExporterRequestDataState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJb\u0010\u001b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b,\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0018R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u0010\u001a¨\u00061"}, m3636d2 = {"Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestDataState;", "", "", "Lcom/robinhood/models/db/Account;", "allAccounts", "selectedAccount", "j$/time/LocalDate", "startDate", "endDate", "", "submitRequestInFlight", "Lretrofit2/Response;", "Lcom/robinhood/models/accountactivityexporter/api/ApiAccountActivityExporter;", "submitRequestResponse", "<init>", "(Ljava/util/List;Lcom/robinhood/models/db/Account;Lj$/time/LocalDate;Lj$/time/LocalDate;ZLretrofit2/Response;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/robinhood/models/db/Account;", "component3", "()Lj$/time/LocalDate;", "component4", "component5", "()Z", "component6", "()Lretrofit2/Response;", "copy", "(Ljava/util/List;Lcom/robinhood/models/db/Account;Lj$/time/LocalDate;Lj$/time/LocalDate;ZLretrofit2/Response;)Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestDataState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAllAccounts", "Lcom/robinhood/models/db/Account;", "getSelectedAccount", "Lj$/time/LocalDate;", "getStartDate", "getEndDate", "Z", "getSubmitRequestInFlight", "Lretrofit2/Response;", "getSubmitRequestResponse", "feature-account-activity-exporter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class AccountActivityExporterRequestDataState {
    public static final int $stable = 8;
    private final List<Account> allAccounts;
    private final LocalDate endDate;
    private final Account selectedAccount;
    private final LocalDate startDate;
    private final boolean submitRequestInFlight;
    private final Response<ApiAccountActivityExporter> submitRequestResponse;

    public AccountActivityExporterRequestDataState() {
        this(null, null, null, null, false, null, 63, null);
    }

    public static /* synthetic */ AccountActivityExporterRequestDataState copy$default(AccountActivityExporterRequestDataState accountActivityExporterRequestDataState, List list, Account account, LocalDate localDate, LocalDate localDate2, boolean z, Response response, int i, Object obj) {
        if ((i & 1) != 0) {
            list = accountActivityExporterRequestDataState.allAccounts;
        }
        if ((i & 2) != 0) {
            account = accountActivityExporterRequestDataState.selectedAccount;
        }
        if ((i & 4) != 0) {
            localDate = accountActivityExporterRequestDataState.startDate;
        }
        if ((i & 8) != 0) {
            localDate2 = accountActivityExporterRequestDataState.endDate;
        }
        if ((i & 16) != 0) {
            z = accountActivityExporterRequestDataState.submitRequestInFlight;
        }
        if ((i & 32) != 0) {
            response = accountActivityExporterRequestDataState.submitRequestResponse;
        }
        boolean z2 = z;
        Response response2 = response;
        return accountActivityExporterRequestDataState.copy(list, account, localDate, localDate2, z2, response2);
    }

    public final List<Account> component1() {
        return this.allAccounts;
    }

    /* renamed from: component2, reason: from getter */
    public final Account getSelectedAccount() {
        return this.selectedAccount;
    }

    /* renamed from: component3, reason: from getter */
    public final LocalDate getStartDate() {
        return this.startDate;
    }

    /* renamed from: component4, reason: from getter */
    public final LocalDate getEndDate() {
        return this.endDate;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getSubmitRequestInFlight() {
        return this.submitRequestInFlight;
    }

    public final Response<ApiAccountActivityExporter> component6() {
        return this.submitRequestResponse;
    }

    public final AccountActivityExporterRequestDataState copy(List<Account> allAccounts, Account selectedAccount, LocalDate startDate, LocalDate endDate, boolean submitRequestInFlight, Response<ApiAccountActivityExporter> submitRequestResponse) {
        return new AccountActivityExporterRequestDataState(allAccounts, selectedAccount, startDate, endDate, submitRequestInFlight, submitRequestResponse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountActivityExporterRequestDataState)) {
            return false;
        }
        AccountActivityExporterRequestDataState accountActivityExporterRequestDataState = (AccountActivityExporterRequestDataState) other;
        return Intrinsics.areEqual(this.allAccounts, accountActivityExporterRequestDataState.allAccounts) && Intrinsics.areEqual(this.selectedAccount, accountActivityExporterRequestDataState.selectedAccount) && Intrinsics.areEqual(this.startDate, accountActivityExporterRequestDataState.startDate) && Intrinsics.areEqual(this.endDate, accountActivityExporterRequestDataState.endDate) && this.submitRequestInFlight == accountActivityExporterRequestDataState.submitRequestInFlight && Intrinsics.areEqual(this.submitRequestResponse, accountActivityExporterRequestDataState.submitRequestResponse);
    }

    public int hashCode() {
        List<Account> list = this.allAccounts;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Account account = this.selectedAccount;
        int iHashCode2 = (iHashCode + (account == null ? 0 : account.hashCode())) * 31;
        LocalDate localDate = this.startDate;
        int iHashCode3 = (iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.endDate;
        int iHashCode4 = (((iHashCode3 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31) + Boolean.hashCode(this.submitRequestInFlight)) * 31;
        Response<ApiAccountActivityExporter> response = this.submitRequestResponse;
        return iHashCode4 + (response != null ? response.hashCode() : 0);
    }

    public String toString() {
        return "AccountActivityExporterRequestDataState(allAccounts=" + this.allAccounts + ", selectedAccount=" + this.selectedAccount + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", submitRequestInFlight=" + this.submitRequestInFlight + ", submitRequestResponse=" + this.submitRequestResponse + ")";
    }

    public AccountActivityExporterRequestDataState(List<Account> list, Account account, LocalDate localDate, LocalDate localDate2, boolean z, Response<ApiAccountActivityExporter> response) {
        this.allAccounts = list;
        this.selectedAccount = account;
        this.startDate = localDate;
        this.endDate = localDate2;
        this.submitRequestInFlight = z;
        this.submitRequestResponse = response;
    }

    public /* synthetic */ AccountActivityExporterRequestDataState(List list, Account account, LocalDate localDate, LocalDate localDate2, boolean z, Response response, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : account, (i & 4) != 0 ? null : localDate, (i & 8) != 0 ? null : localDate2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : response);
    }

    public final List<Account> getAllAccounts() {
        return this.allAccounts;
    }

    public final Account getSelectedAccount() {
        return this.selectedAccount;
    }

    public final LocalDate getStartDate() {
        return this.startDate;
    }

    public final LocalDate getEndDate() {
        return this.endDate;
    }

    public final boolean getSubmitRequestInFlight() {
        return this.submitRequestInFlight;
    }

    public final Response<ApiAccountActivityExporter> getSubmitRequestResponse() {
        return this.submitRequestResponse;
    }
}

package com.robinhood.shared.accountactivityexporter;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.util.Pair;
import com.google.android.material.datepicker.CalendarConstraints;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.accountactivityexporter.api.ApiAccountActivityExporter;
import com.robinhood.models.accountactivityexporter.api.ApiAccountActivityExporterRequest;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.LocalDates4;
import com.robinhood.utils.datetime.ZoneIds;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.resource.StringResource;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.ZoneId;
import retrofit2.Response;

/* compiled from: AccountActivityExporterRequestDuxo.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0017\u0016B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b*\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestDataState;", "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestViewState;", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lj$/time/Clock;)V", "Lcom/google/android/material/datepicker/CalendarConstraints;", "getCalendarConstraints", "(Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestDataState;)Lcom/google/android/material/datepicker/CalendarConstraints;", "Landroidx/core/util/Pair;", "", "getDatePickerSelection", "(Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestDataState;)Landroidx/core/util/Pair;", "Lcom/robinhood/models/accountactivityexporter/api/ApiAccountActivityExporterRequest;", "getSubmitRequest", "(Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestDataState;)Lcom/robinhood/models/accountactivityexporter/api/ApiAccountActivityExporterRequest;", "dataState", "reduce", "(Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestDataState;)Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestViewState;", "Lj$/time/Clock;", "Companion", "ActivityExporterDateValidator", "feature-account-activity-exporter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestStateProvider, reason: use source file name */
/* loaded from: classes26.dex */
public final class AccountActivityExporterRequestDuxo4 implements StateProvider<AccountActivityExporterRequestDataState, AccountActivityExporterRequestViewState> {
    private final Clock clock;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final ZoneId DATE_PICKER_TIME_ZONE = ZoneIds.INSTANCE.getUTC();

    public AccountActivityExporterRequestDuxo4(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.clock = clock;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public AccountActivityExporterRequestViewState reduce(AccountActivityExporterRequestDataState dataState) {
        AccountSwitcherData accountSwitcherDataFrom$default;
        boolean z;
        DisplayName displayName;
        DisplayName.Variants variants;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        List<Account> allAccounts = dataState.getAllAccounts();
        if (allAccounts != null) {
            Account selectedAccount = dataState.getSelectedAccount();
            if (selectedAccount == null) {
                selectedAccount = (Account) CollectionsKt.first((List) allAccounts);
            }
            accountSwitcherDataFrom$default = AccountSwitcherData.Companion.from$default(AccountSwitcherData.INSTANCE, selectedAccount.getAccountNumber(), allAccounts, false, false, null, 28, null);
        } else {
            accountSwitcherDataFrom$default = null;
        }
        Account selectedAccount2 = dataState.getSelectedAccount();
        StringResource title = (selectedAccount2 == null || (displayName = AccountDisplayNames.getDisplayName(selectedAccount2)) == null || (variants = displayName.getShort()) == null) ? null : variants.getTitle();
        LocalDate startDate = dataState.getStartDate();
        String str = startDate != null ? LocalDateFormatter.MEDIUM.format(startDate) : null;
        LocalDate endDate = dataState.getEndDate();
        String str2 = endDate != null ? LocalDateFormatter.MEDIUM.format(endDate) : null;
        CalendarConstraints calendarConstraints = getCalendarConstraints(dataState);
        Pair<Long, Long> datePickerSelection = getDatePickerSelection(dataState);
        List<Account> allAccounts2 = dataState.getAllAccounts();
        if (allAccounts2 != null) {
            z = allAccounts2.size() > 1;
        } else {
            z = false;
        }
        ApiAccountActivityExporterRequest submitRequest = getSubmitRequest(dataState);
        boolean submitRequestInFlight = dataState.getSubmitRequestInFlight();
        Response<ApiAccountActivityExporter> submitRequestResponse = dataState.getSubmitRequestResponse();
        boolean zIsSuccessful = submitRequestResponse != null ? submitRequestResponse.isSuccessful() : false;
        Response<ApiAccountActivityExporter> submitRequestResponse2 = dataState.getSubmitRequestResponse();
        return new AccountActivityExporterRequestViewState(accountSwitcherDataFrom$default, title, str, str2, calendarConstraints, datePickerSelection, z, submitRequest, submitRequestInFlight, zIsSuccessful, (submitRequestResponse2 == null || submitRequestResponse2.isSuccessful()) ? false : true);
    }

    private final CalendarConstraints getCalendarConstraints(AccountActivityExporterRequestDataState accountActivityExporterRequestDataState) {
        Account selectedAccount = accountActivityExporterRequestDataState.getSelectedAccount();
        if (selectedAccount == null) {
            return null;
        }
        LocalDate localDate$default = Instants.toLocalDate$default(selectedAccount.getCreatedAt(), null, 1, null);
        Instant instant = this.clock.instant();
        Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
        LocalDate localDate$default2 = Instants.toLocalDate$default(instant, null, 1, null);
        CalendarConstraints.Builder builder = new CalendarConstraints.Builder();
        ZoneId zoneId = DATE_PICKER_TIME_ZONE;
        return builder.setStart(LocalDates4.toEpochMillis(localDate$default, zoneId)).setEnd(LocalDates4.toEpochMillis(localDate$default2, zoneId)).setValidator(new ActivityExporterDateValidator(localDate$default, localDate$default2)).build();
    }

    private final Pair<Long, Long> getDatePickerSelection(AccountActivityExporterRequestDataState accountActivityExporterRequestDataState) {
        if (accountActivityExporterRequestDataState.getStartDate() == null || accountActivityExporterRequestDataState.getEndDate() == null) {
            return null;
        }
        LocalDate startDate = accountActivityExporterRequestDataState.getStartDate();
        ZoneId zoneId = DATE_PICKER_TIME_ZONE;
        return new Pair<>(Long.valueOf(LocalDates4.toEpochMillis(startDate, zoneId)), Long.valueOf(LocalDates4.toEpochMillis(accountActivityExporterRequestDataState.getEndDate(), zoneId)));
    }

    private final ApiAccountActivityExporterRequest getSubmitRequest(AccountActivityExporterRequestDataState accountActivityExporterRequestDataState) {
        String accountNumber;
        LocalDate startDate;
        LocalDate endDate;
        Account selectedAccount = accountActivityExporterRequestDataState.getSelectedAccount();
        if (selectedAccount == null || (accountNumber = selectedAccount.getAccountNumber()) == null || (startDate = accountActivityExporterRequestDataState.getStartDate()) == null || (endDate = accountActivityExporterRequestDataState.getEndDate()) == null) {
            return null;
        }
        return new ApiAccountActivityExporterRequest(accountNumber, startDate, endDate);
    }

    /* compiled from: AccountActivityExporterRequestDuxo.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestStateProvider$ActivityExporterDateValidator;", "Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;", "Landroid/os/Parcelable;", "j$/time/LocalDate", "startDate", "endDate", "<init>", "(Lj$/time/LocalDate;Lj$/time/LocalDate;)V", "", InquiryField.DateField.TYPE, "", "isValid", "(J)Z", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lj$/time/LocalDate;", "feature-account-activity-exporter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestStateProvider$ActivityExporterDateValidator */
    public static final class ActivityExporterDateValidator implements CalendarConstraints.DateValidator, Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<ActivityExporterDateValidator> CREATOR = new Creator();
        private final LocalDate endDate;
        private final LocalDate startDate;

        /* compiled from: AccountActivityExporterRequestDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestStateProvider$ActivityExporterDateValidator$Creator */
        public static final class Creator implements Parcelable.Creator<ActivityExporterDateValidator> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ActivityExporterDateValidator createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ActivityExporterDateValidator((LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ActivityExporterDateValidator[] newArray(int i) {
                return new ActivityExporterDateValidator[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.startDate);
            dest.writeSerializable(this.endDate);
        }

        public ActivityExporterDateValidator(LocalDate startDate, LocalDate endDate) {
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            this.startDate = startDate;
            this.endDate = endDate;
        }

        @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
        public boolean isValid(long date) {
            LocalDate localDate = this.startDate;
            Companion companion = AccountActivityExporterRequestDuxo4.INSTANCE;
            return date >= LocalDates4.toEpochMillis(localDate, companion.getDATE_PICKER_TIME_ZONE()) && date <= LocalDates4.toEpochMillis(this.endDate, companion.getDATE_PICKER_TIME_ZONE());
        }
    }

    /* compiled from: AccountActivityExporterRequestDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestStateProvider$Companion;", "", "<init>", "()V", "j$/time/ZoneId", "DATE_PICKER_TIME_ZONE", "Lj$/time/ZoneId;", "getDATE_PICKER_TIME_ZONE", "()Lj$/time/ZoneId;", "feature-account-activity-exporter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestStateProvider$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ZoneId getDATE_PICKER_TIME_ZONE() {
            return AccountActivityExporterRequestDuxo4.DATE_PICKER_TIME_ZONE;
        }
    }
}

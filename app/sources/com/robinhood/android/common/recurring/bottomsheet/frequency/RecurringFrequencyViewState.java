package com.robinhood.android.common.recurring.bottomsheet.frequency;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.rosetta.converters.recurring.Recurring2;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;

/* compiled from: RecurringFrequencyViewState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\tHÂ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000bHÂ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÂ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J^\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b\b\u0010\u0016R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010-R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010.R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010.R\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u00040/8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u00104\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b3\u0010\u0011R\u0011\u00106\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b5\u0010\u0013¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyViewState;", "", "", "hasDirectDepositRelationships", "Lcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyBottomSheet$Row;", "selectedRow", "Lcom/robinhood/models/db/bonfire/RhyAccount;", "rhyAccount", "isCrypto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "initialLoggingContext", "j$/time/LocalDate", "userSelectedNextInvestmentDate", "serverNextInvestmentDate", "<init>", "(ZLcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyBottomSheet$Row;Lcom/robinhood/models/db/bonfire/RhyAccount;ZLcom/robinhood/rosetta/eventlogging/RecurringContext;Lj$/time/LocalDate;Lj$/time/LocalDate;)V", "component5", "()Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "component6", "()Lj$/time/LocalDate;", "component7", "component1", "()Z", "component2", "()Lcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyBottomSheet$Row;", "component3", "()Lcom/robinhood/models/db/bonfire/RhyAccount;", "component4", "copy", "(ZLcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyBottomSheet$Row;Lcom/robinhood/models/db/bonfire/RhyAccount;ZLcom/robinhood/rosetta/eventlogging/RecurringContext;Lj$/time/LocalDate;Lj$/time/LocalDate;)Lcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyViewState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getHasDirectDepositRelationships", "Lcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyBottomSheet$Row;", "getSelectedRow", "Lcom/robinhood/models/db/bonfire/RhyAccount;", "getRhyAccount", "Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "Lj$/time/LocalDate;", "", "getRows", "()Ljava/util/List;", "rows", "getLoggingContext", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "getNextInvestmentDate", "nextInvestmentDate", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class RecurringFrequencyViewState {
    public static final int $stable = 8;
    private final boolean hasDirectDepositRelationships;
    private final RecurringContext initialLoggingContext;
    private final boolean isCrypto;
    private final RhyAccount rhyAccount;
    private final RecurringFrequencyBottomSheet.Row selectedRow;
    private final LocalDate serverNextInvestmentDate;
    private final LocalDate userSelectedNextInvestmentDate;

    public RecurringFrequencyViewState() {
        this(false, null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    /* renamed from: component5, reason: from getter */
    private final RecurringContext getInitialLoggingContext() {
        return this.initialLoggingContext;
    }

    /* renamed from: component6, reason: from getter */
    private final LocalDate getUserSelectedNextInvestmentDate() {
        return this.userSelectedNextInvestmentDate;
    }

    /* renamed from: component7, reason: from getter */
    private final LocalDate getServerNextInvestmentDate() {
        return this.serverNextInvestmentDate;
    }

    public static /* synthetic */ RecurringFrequencyViewState copy$default(RecurringFrequencyViewState recurringFrequencyViewState, boolean z, RecurringFrequencyBottomSheet.Row row, RhyAccount rhyAccount, boolean z2, RecurringContext recurringContext, LocalDate localDate, LocalDate localDate2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = recurringFrequencyViewState.hasDirectDepositRelationships;
        }
        if ((i & 2) != 0) {
            row = recurringFrequencyViewState.selectedRow;
        }
        if ((i & 4) != 0) {
            rhyAccount = recurringFrequencyViewState.rhyAccount;
        }
        if ((i & 8) != 0) {
            z2 = recurringFrequencyViewState.isCrypto;
        }
        if ((i & 16) != 0) {
            recurringContext = recurringFrequencyViewState.initialLoggingContext;
        }
        if ((i & 32) != 0) {
            localDate = recurringFrequencyViewState.userSelectedNextInvestmentDate;
        }
        if ((i & 64) != 0) {
            localDate2 = recurringFrequencyViewState.serverNextInvestmentDate;
        }
        LocalDate localDate3 = localDate;
        LocalDate localDate4 = localDate2;
        RecurringContext recurringContext2 = recurringContext;
        RhyAccount rhyAccount2 = rhyAccount;
        return recurringFrequencyViewState.copy(z, row, rhyAccount2, z2, recurringContext2, localDate3, localDate4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasDirectDepositRelationships() {
        return this.hasDirectDepositRelationships;
    }

    /* renamed from: component2, reason: from getter */
    public final RecurringFrequencyBottomSheet.Row getSelectedRow() {
        return this.selectedRow;
    }

    /* renamed from: component3, reason: from getter */
    public final RhyAccount getRhyAccount() {
        return this.rhyAccount;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsCrypto() {
        return this.isCrypto;
    }

    public final RecurringFrequencyViewState copy(boolean hasDirectDepositRelationships, RecurringFrequencyBottomSheet.Row selectedRow, RhyAccount rhyAccount, boolean isCrypto, RecurringContext initialLoggingContext, LocalDate userSelectedNextInvestmentDate, LocalDate serverNextInvestmentDate) {
        Intrinsics.checkNotNullParameter(serverNextInvestmentDate, "serverNextInvestmentDate");
        return new RecurringFrequencyViewState(hasDirectDepositRelationships, selectedRow, rhyAccount, isCrypto, initialLoggingContext, userSelectedNextInvestmentDate, serverNextInvestmentDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringFrequencyViewState)) {
            return false;
        }
        RecurringFrequencyViewState recurringFrequencyViewState = (RecurringFrequencyViewState) other;
        return this.hasDirectDepositRelationships == recurringFrequencyViewState.hasDirectDepositRelationships && this.selectedRow == recurringFrequencyViewState.selectedRow && Intrinsics.areEqual(this.rhyAccount, recurringFrequencyViewState.rhyAccount) && this.isCrypto == recurringFrequencyViewState.isCrypto && Intrinsics.areEqual(this.initialLoggingContext, recurringFrequencyViewState.initialLoggingContext) && Intrinsics.areEqual(this.userSelectedNextInvestmentDate, recurringFrequencyViewState.userSelectedNextInvestmentDate) && Intrinsics.areEqual(this.serverNextInvestmentDate, recurringFrequencyViewState.serverNextInvestmentDate);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.hasDirectDepositRelationships) * 31;
        RecurringFrequencyBottomSheet.Row row = this.selectedRow;
        int iHashCode2 = (iHashCode + (row == null ? 0 : row.hashCode())) * 31;
        RhyAccount rhyAccount = this.rhyAccount;
        int iHashCode3 = (((iHashCode2 + (rhyAccount == null ? 0 : rhyAccount.hashCode())) * 31) + Boolean.hashCode(this.isCrypto)) * 31;
        RecurringContext recurringContext = this.initialLoggingContext;
        int iHashCode4 = (iHashCode3 + (recurringContext == null ? 0 : recurringContext.hashCode())) * 31;
        LocalDate localDate = this.userSelectedNextInvestmentDate;
        return ((iHashCode4 + (localDate != null ? localDate.hashCode() : 0)) * 31) + this.serverNextInvestmentDate.hashCode();
    }

    public String toString() {
        return "RecurringFrequencyViewState(hasDirectDepositRelationships=" + this.hasDirectDepositRelationships + ", selectedRow=" + this.selectedRow + ", rhyAccount=" + this.rhyAccount + ", isCrypto=" + this.isCrypto + ", initialLoggingContext=" + this.initialLoggingContext + ", userSelectedNextInvestmentDate=" + this.userSelectedNextInvestmentDate + ", serverNextInvestmentDate=" + this.serverNextInvestmentDate + ")";
    }

    public RecurringFrequencyViewState(boolean z, RecurringFrequencyBottomSheet.Row row, RhyAccount rhyAccount, boolean z2, RecurringContext recurringContext, LocalDate localDate, LocalDate serverNextInvestmentDate) {
        Intrinsics.checkNotNullParameter(serverNextInvestmentDate, "serverNextInvestmentDate");
        this.hasDirectDepositRelationships = z;
        this.selectedRow = row;
        this.rhyAccount = rhyAccount;
        this.isCrypto = z2;
        this.initialLoggingContext = recurringContext;
        this.userSelectedNextInvestmentDate = localDate;
        this.serverNextInvestmentDate = serverNextInvestmentDate;
    }

    public final boolean getHasDirectDepositRelationships() {
        return this.hasDirectDepositRelationships;
    }

    public final RecurringFrequencyBottomSheet.Row getSelectedRow() {
        return this.selectedRow;
    }

    public final RhyAccount getRhyAccount() {
        return this.rhyAccount;
    }

    public final boolean isCrypto() {
        return this.isCrypto;
    }

    public /* synthetic */ RecurringFrequencyViewState(boolean z, RecurringFrequencyBottomSheet.Row row, RhyAccount rhyAccount, boolean z2, RecurringContext recurringContext, LocalDate localDate, LocalDate localDate2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : row, (i & 4) != 0 ? null : rhyAccount, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : recurringContext, (i & 32) != 0 ? null : localDate, (i & 64) != 0 ? InvestFlowFrequency.Companion.defaultInvestmentStartDate$default(InvestFlowFrequency.INSTANCE, null, 1, null) : localDate2);
    }

    public final List<RecurringFrequencyBottomSheet.Row> getRows() {
        List list;
        boolean showForEquity;
        if (this.hasDirectDepositRelationships && this.rhyAccount != null) {
            list = ArraysKt.toList(RecurringFrequencyBottomSheet.Row.values());
        } else {
            RecurringFrequencyBottomSheet.Row[] rowArrValues = RecurringFrequencyBottomSheet.Row.values();
            ArrayList arrayList = new ArrayList();
            for (RecurringFrequencyBottomSheet.Row row : rowArrValues) {
                if (row.getFrequency().getIsFrequencyDeterministic()) {
                    arrayList.add(row);
                }
            }
            list = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            RecurringFrequencyBottomSheet.Row row2 = (RecurringFrequencyBottomSheet.Row) obj;
            if (this.isCrypto) {
                showForEquity = row2.getShowForCrypto();
            } else {
                showForEquity = row2.getShowForEquity();
            }
            if (showForEquity) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final RecurringContext getLoggingContext() {
        RecurringContext.EntryPoint entry_point;
        RecurringContext.ScheduleFrequency frequency;
        RecurringContext.RecurringFundsSource source_of_funds;
        RecurringContext.AssetType asset_type;
        ApiInvestmentSchedule.Frequency frequency2;
        RecurringContext.FlowType flowType = RecurringContext.FlowType.CREATE;
        RecurringContext recurringContext = this.initialLoggingContext;
        if (recurringContext == null || (entry_point = recurringContext.getEntry_point()) == null) {
            entry_point = RecurringContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
        }
        RecurringFrequencyBottomSheet.Row row = this.selectedRow;
        if (row == null || (frequency2 = row.getFrequency()) == null || (frequency = Recurring2.toProtobuf(frequency2)) == null) {
            RecurringContext recurringContext2 = this.initialLoggingContext;
            frequency = recurringContext2 != null ? recurringContext2.getFrequency() : RecurringContext.ScheduleFrequency.SCHEDULE_FREQUENCY_UNSPECIFIED;
        }
        RecurringContext.ScheduleFrequency scheduleFrequency = frequency;
        RecurringContext recurringContext3 = this.initialLoggingContext;
        if (recurringContext3 == null || (source_of_funds = recurringContext3.getSource_of_funds()) == null) {
            source_of_funds = RecurringContext.RecurringFundsSource.RECURRING_FUNDS_SOURCE_UNSPECIFIED;
        }
        RecurringContext.RecurringFundsSource recurringFundsSource = source_of_funds;
        RecurringContext recurringContext4 = this.initialLoggingContext;
        double amount = recurringContext4 != null ? recurringContext4.getAmount() : 0.0d;
        RecurringContext recurringContext5 = this.initialLoggingContext;
        if (recurringContext5 == null || (asset_type = recurringContext5.getAsset_type()) == null) {
            asset_type = RecurringContext.AssetType.ASSET_TYPE_UNSPECIFIED;
        }
        return new RecurringContext(flowType, entry_point, null, scheduleFrequency, recurringFundsSource, amount, asset_type, null, 0.0d, null, null, 1924, null);
    }

    public final LocalDate getNextInvestmentDate() {
        LocalDate localDate = this.userSelectedNextInvestmentDate;
        return localDate == null ? this.serverNextInvestmentDate : localDate;
    }
}

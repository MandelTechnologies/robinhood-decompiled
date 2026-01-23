package com.robinhood.android.advisory.projection;

import com.robinhood.android.advisory.contracts.SimulateDepositFrequency;
import com.robinhood.android.advisory.projection.AdvisoryProjectionViewState;
import com.robinhood.android.advisory.projection.frequency.SimulateDepositFrequency2;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.advisory.p304db.projection.OneTimeConfiguration;
import com.robinhood.models.advisory.p304db.projection.ProjectedReturns;
import com.robinhood.models.advisory.p304db.projection.RecurringConfiguration;
import com.robinhood.models.p320db.Account;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AdvisoryProjectionDataState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/advisory/projection/AdvisoryProjectionDataState;", "", "projectedReturns", "Lcom/robinhood/models/advisory/db/projection/ProjectedReturns;", "account", "Lcom/robinhood/models/db/Account;", "currentYear", "", "defaultFrequency", "Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;", "<init>", "(Lcom/robinhood/models/advisory/db/projection/ProjectedReturns;Lcom/robinhood/models/db/Account;ILcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;)V", "getProjectedReturns", "()Lcom/robinhood/models/advisory/db/projection/ProjectedReturns;", "getAccount", "()Lcom/robinhood/models/db/Account;", "getCurrentYear", "()I", "getDefaultFrequency", "()Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "feature-projected-returns_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AdvisoryProjectionDataState {
    private final Account account;
    private final int currentYear;
    private final SimulateDepositFrequency defaultFrequency;
    private final ProjectedReturns projectedReturns;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ AdvisoryProjectionDataState copy$default(AdvisoryProjectionDataState advisoryProjectionDataState, ProjectedReturns projectedReturns, Account account, int i, SimulateDepositFrequency simulateDepositFrequency, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            projectedReturns = advisoryProjectionDataState.projectedReturns;
        }
        if ((i2 & 2) != 0) {
            account = advisoryProjectionDataState.account;
        }
        if ((i2 & 4) != 0) {
            i = advisoryProjectionDataState.currentYear;
        }
        if ((i2 & 8) != 0) {
            simulateDepositFrequency = advisoryProjectionDataState.defaultFrequency;
        }
        return advisoryProjectionDataState.copy(projectedReturns, account, i, simulateDepositFrequency);
    }

    /* renamed from: component1, reason: from getter */
    public final ProjectedReturns getProjectedReturns() {
        return this.projectedReturns;
    }

    /* renamed from: component2, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCurrentYear() {
        return this.currentYear;
    }

    /* renamed from: component4, reason: from getter */
    public final SimulateDepositFrequency getDefaultFrequency() {
        return this.defaultFrequency;
    }

    public final AdvisoryProjectionDataState copy(ProjectedReturns projectedReturns, Account account, int currentYear, SimulateDepositFrequency defaultFrequency) {
        Intrinsics.checkNotNullParameter(defaultFrequency, "defaultFrequency");
        return new AdvisoryProjectionDataState(projectedReturns, account, currentYear, defaultFrequency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvisoryProjectionDataState)) {
            return false;
        }
        AdvisoryProjectionDataState advisoryProjectionDataState = (AdvisoryProjectionDataState) other;
        return Intrinsics.areEqual(this.projectedReturns, advisoryProjectionDataState.projectedReturns) && Intrinsics.areEqual(this.account, advisoryProjectionDataState.account) && this.currentYear == advisoryProjectionDataState.currentYear && this.defaultFrequency == advisoryProjectionDataState.defaultFrequency;
    }

    public int hashCode() {
        ProjectedReturns projectedReturns = this.projectedReturns;
        int iHashCode = (projectedReturns == null ? 0 : projectedReturns.hashCode()) * 31;
        Account account = this.account;
        return ((((iHashCode + (account != null ? account.hashCode() : 0)) * 31) + Integer.hashCode(this.currentYear)) * 31) + this.defaultFrequency.hashCode();
    }

    public String toString() {
        return "AdvisoryProjectionDataState(projectedReturns=" + this.projectedReturns + ", account=" + this.account + ", currentYear=" + this.currentYear + ", defaultFrequency=" + this.defaultFrequency + ")";
    }

    public AdvisoryProjectionDataState(ProjectedReturns projectedReturns, Account account, int i, SimulateDepositFrequency defaultFrequency) {
        Intrinsics.checkNotNullParameter(defaultFrequency, "defaultFrequency");
        this.projectedReturns = projectedReturns;
        this.account = account;
        this.currentYear = i;
        this.defaultFrequency = defaultFrequency;
    }

    public /* synthetic */ AdvisoryProjectionDataState(ProjectedReturns projectedReturns, Account account, int i, SimulateDepositFrequency simulateDepositFrequency, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : projectedReturns, (i2 & 2) != 0 ? null : account, i, simulateDepositFrequency);
    }

    public final ProjectedReturns getProjectedReturns() {
        return this.projectedReturns;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final int getCurrentYear() {
        return this.currentYear;
    }

    public final SimulateDepositFrequency getDefaultFrequency() {
        return this.defaultFrequency;
    }

    /* compiled from: AdvisoryProjectionDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/projection/AdvisoryProjectionDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/advisory/projection/AdvisoryProjectionDataState;", "Lcom/robinhood/android/advisory/projection/AdvisoryProjectionViewState;", "<init>", "()V", "reduce", "dataState", "feature-projected-returns_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements StateProvider<AdvisoryProjectionDataState, AdvisoryProjectionViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public AdvisoryProjectionViewState reduce(AdvisoryProjectionDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getProjectedReturns() != null && dataState.getAccount() != null) {
                OneTimeConfiguration oneTimeConfiguration = dataState.getProjectedReturns().getOneTimeConfiguration();
                ImmutableList3 persistentList = extensions2.toPersistentList(UtilsKt.generateMoneyList(oneTimeConfiguration.getSliderMinimumValue(), oneTimeConfiguration.getSliderMaximumValue(), oneTimeConfiguration.getSliderIncrementValue(), dataState.getProjectedReturns().getCurrency()));
                ProjectedReturns projectedReturns = dataState.getProjectedReturns();
                DepositCtaData depositCta = new DepositCtaData(dataState.getAccount().getAccountNumberRhs(), dataState.getAccount().getBrokerageAccountType());
                int currentYear = dataState.getCurrentYear();
                SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                spreadBuilder.add(SimulateDepositFrequency.ONE_TIME);
                List<RecurringConfiguration> recurringDepositConfigurations = dataState.getProjectedReturns().getRecurringDepositConfigurations();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(recurringDepositConfigurations, 10));
                Iterator<T> it = recurringDepositConfigurations.iterator();
                while (it.hasNext()) {
                    arrayList.add(SimulateDepositFrequency2.getSimulateDepositFrequency(((RecurringConfiguration) it.next()).getDepositFrequency()));
                }
                spreadBuilder.addSpread(arrayList.toArray(new SimulateDepositFrequency[0]));
                return new AdvisoryProjectionViewState.Loaded(projectedReturns, persistentList, depositCta, currentYear, dataState.getProjectedReturns().getInitialHighlightYearIndex(), extensions2.persistentListOf(spreadBuilder.toArray(new SimulateDepositFrequency[spreadBuilder.size()])), new ProjectionAccountInfo(dataState.getAccount().getAccountNumber(), dataState.getProjectedReturns().getEndOfYearAge(), dataState.getAccount().getBrokerageAccountType()), dataState.getDefaultFrequency());
            }
            return new AdvisoryProjectionViewState.Loading(dataState.getDefaultFrequency());
        }
    }
}

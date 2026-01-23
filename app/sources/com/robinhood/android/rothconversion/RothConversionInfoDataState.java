package com.robinhood.android.rothconversion;

import com.robinhood.android.models.retirement.p194db.RothConversionInfoViewModel;
import com.robinhood.android.rothconversion.RothConversionInfoEvent;
import com.robinhood.android.rothconversion.RothConversionInfoViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.p320db.Account;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RothConversionInfoDataState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0001)B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\u0017\u001a\u00020\u0000J\u0012\u0010\u001c\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0012\u0010\u001d\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J=\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/rothconversion/RothConversionInfoDataState;", "", "viewModel", "Lcom/robinhood/android/models/retirement/db/RothConversionInfoViewModel;", "accounts", "", "Lcom/robinhood/models/db/Account;", "error", "", "inRothAdvisoryExperiment", "", "<init>", "(Lcom/robinhood/android/models/retirement/db/RothConversionInfoViewModel;Ljava/util/List;Ljava/lang/Throwable;Z)V", "getViewModel", "()Lcom/robinhood/android/models/retirement/db/RothConversionInfoViewModel;", "getAccounts", "()Ljava/util/List;", "getError", "()Ljava/lang/Throwable;", "getInRothAdvisoryExperiment", "()Z", "mutateSuccess", "mutateFailure", "mutateLoading", "navigationEvent", "Lcom/robinhood/android/rothconversion/RothConversionInfoEvent;", "getNavigationEvent", "()Lcom/robinhood/android/rothconversion/RothConversionInfoEvent;", "hasNoSelfDirectedRoth", "hasNoManagedRoth", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "feature-roth-conversion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final /* data */ class RothConversionInfoDataState {
    private final List<Account> accounts;
    private final Throwable error;
    private final boolean inRothAdvisoryExperiment;
    private final RothConversionInfoViewModel viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final StateProvider<RothConversionInfoDataState, RothConversionInfoViewState> StateProvider = new StateProvider() { // from class: com.robinhood.android.rothconversion.RothConversionInfoDataState$Companion$StateProvider$1
        @Override // com.robinhood.android.udf.StateProvider
        public final RothConversionInfoViewState reduce(RothConversionInfoDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            RothConversionInfoEvent navigationEvent = dataState.getNavigationEvent();
            if (dataState.getViewModel() == null || navigationEvent == null) {
                return dataState.getError() != null ? RothConversionInfoViewState.Error.INSTANCE : RothConversionInfoViewState.Loading.INSTANCE;
            }
            return new RothConversionInfoViewState.Loaded(dataState.getViewModel().getPages(), navigationEvent);
        }
    };

    public RothConversionInfoDataState() {
        this(null, null, null, false, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RothConversionInfoDataState copy$default(RothConversionInfoDataState rothConversionInfoDataState, RothConversionInfoViewModel rothConversionInfoViewModel, List list, Throwable th, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            rothConversionInfoViewModel = rothConversionInfoDataState.viewModel;
        }
        if ((i & 2) != 0) {
            list = rothConversionInfoDataState.accounts;
        }
        if ((i & 4) != 0) {
            th = rothConversionInfoDataState.error;
        }
        if ((i & 8) != 0) {
            z = rothConversionInfoDataState.inRothAdvisoryExperiment;
        }
        return rothConversionInfoDataState.copy(rothConversionInfoViewModel, list, th, z);
    }

    /* renamed from: component1, reason: from getter */
    public final RothConversionInfoViewModel getViewModel() {
        return this.viewModel;
    }

    public final List<Account> component2() {
        return this.accounts;
    }

    /* renamed from: component3, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getInRothAdvisoryExperiment() {
        return this.inRothAdvisoryExperiment;
    }

    public final RothConversionInfoDataState copy(RothConversionInfoViewModel viewModel, List<Account> accounts2, Throwable error, boolean inRothAdvisoryExperiment) {
        return new RothConversionInfoDataState(viewModel, accounts2, error, inRothAdvisoryExperiment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RothConversionInfoDataState)) {
            return false;
        }
        RothConversionInfoDataState rothConversionInfoDataState = (RothConversionInfoDataState) other;
        return Intrinsics.areEqual(this.viewModel, rothConversionInfoDataState.viewModel) && Intrinsics.areEqual(this.accounts, rothConversionInfoDataState.accounts) && Intrinsics.areEqual(this.error, rothConversionInfoDataState.error) && this.inRothAdvisoryExperiment == rothConversionInfoDataState.inRothAdvisoryExperiment;
    }

    public int hashCode() {
        RothConversionInfoViewModel rothConversionInfoViewModel = this.viewModel;
        int iHashCode = (rothConversionInfoViewModel == null ? 0 : rothConversionInfoViewModel.hashCode()) * 31;
        List<Account> list = this.accounts;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Throwable th = this.error;
        return ((iHashCode2 + (th != null ? th.hashCode() : 0)) * 31) + Boolean.hashCode(this.inRothAdvisoryExperiment);
    }

    public String toString() {
        return "RothConversionInfoDataState(viewModel=" + this.viewModel + ", accounts=" + this.accounts + ", error=" + this.error + ", inRothAdvisoryExperiment=" + this.inRothAdvisoryExperiment + ")";
    }

    public RothConversionInfoDataState(RothConversionInfoViewModel rothConversionInfoViewModel, List<Account> list, Throwable th, boolean z) {
        this.viewModel = rothConversionInfoViewModel;
        this.accounts = list;
        this.error = th;
        this.inRothAdvisoryExperiment = z;
    }

    public /* synthetic */ RothConversionInfoDataState(RothConversionInfoViewModel rothConversionInfoViewModel, List list, Throwable th, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : rothConversionInfoViewModel, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : th, (i & 8) != 0 ? false : z);
    }

    public final RothConversionInfoViewModel getViewModel() {
        return this.viewModel;
    }

    public final List<Account> getAccounts() {
        return this.accounts;
    }

    public final Throwable getError() {
        return this.error;
    }

    public final boolean getInRothAdvisoryExperiment() {
        return this.inRothAdvisoryExperiment;
    }

    public final RothConversionInfoDataState mutateSuccess(RothConversionInfoViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        return copy$default(this, viewModel, null, null, false, 10, null);
    }

    public final RothConversionInfoDataState mutateFailure(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return copy$default(this, null, null, error, false, 11, null);
    }

    public final RothConversionInfoDataState mutateLoading() {
        return copy$default(this, null, null, null, false, 11, null);
    }

    public final RothConversionInfoEvent getNavigationEvent() {
        List<Account> list;
        if (this.viewModel == null || (list = this.accounts) == null) {
            return null;
        }
        List<Account> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (Account account : list2) {
                if (account.getBrokerageAccountType() == BrokerageAccountType.IRA_TRADITIONAL && account.getManagementType() == ManagementType.SELF_DIRECTED) {
                    if (!this.inRothAdvisoryExperiment && hasNoSelfDirectedRoth(this.accounts)) {
                        return new RothConversionInfoEvent.Alert(this.viewModel.getNoRothIraAlert());
                    }
                    if (this.inRothAdvisoryExperiment && hasNoSelfDirectedRoth(this.accounts) && hasNoManagedRoth(this.accounts)) {
                        return new RothConversionInfoEvent.Alert(this.viewModel.getNoRothIraAlert());
                    }
                    return RothConversionInfoEvent.Transfer.INSTANCE;
                }
            }
        }
        return new RothConversionInfoEvent.Alert(this.viewModel.getNoTraditionalIraAlert());
    }

    private final boolean hasNoSelfDirectedRoth(List<Account> list) {
        List<Account> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        for (Account account : list2) {
            if (account.getBrokerageAccountType() == BrokerageAccountType.IRA_ROTH && account.getManagementType() == ManagementType.SELF_DIRECTED) {
                return false;
            }
        }
        return true;
    }

    private final boolean hasNoManagedRoth(List<Account> list) {
        List<Account> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        for (Account account : list2) {
            if (account.getBrokerageAccountType() == BrokerageAccountType.IRA_ROTH && account.getManagementType() == ManagementType.MANAGED) {
                return false;
            }
        }
        return true;
    }

    /* compiled from: RothConversionInfoDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/rothconversion/RothConversionInfoDataState$Companion;", "", "<init>", "()V", "StateProvider", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/rothconversion/RothConversionInfoDataState;", "Lcom/robinhood/android/rothconversion/RothConversionInfoViewState;", "getStateProvider", "()Lcom/robinhood/android/udf/StateProvider;", "feature-roth-conversion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final StateProvider<RothConversionInfoDataState, RothConversionInfoViewState> getStateProvider() {
            return RothConversionInfoDataState.StateProvider;
        }
    }
}

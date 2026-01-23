package com.robinhood.android.advisory.onboarding.rxr;

import com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.advisory.p304db.onboarding.RecsForRetirementStrategiesUpsellViewModel;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecsForRetirementStrategiesUpsellDataState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/rxr/RecsForRetirementStrategiesUpsellDataState;", "", "source", "", "viewModel", "Lcom/robinhood/models/advisory/db/onboarding/RecsForRetirementStrategiesUpsellViewModel;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "error", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/advisory/db/onboarding/RecsForRetirementStrategiesUpsellViewModel;Lcom/robinhood/models/api/BrokerageAccountType;Ljava/lang/Throwable;)V", "getSource", "()Ljava/lang/String;", "getViewModel", "()Lcom/robinhood/models/advisory/db/onboarding/RecsForRetirementStrategiesUpsellViewModel;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getError", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RecsForRetirementStrategiesUpsellDataState {
    private final BrokerageAccountType brokerageAccountType;
    private final Throwable error;
    private final String source;
    private final RecsForRetirementStrategiesUpsellViewModel viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public RecsForRetirementStrategiesUpsellDataState() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ RecsForRetirementStrategiesUpsellDataState copy$default(RecsForRetirementStrategiesUpsellDataState recsForRetirementStrategiesUpsellDataState, String str, RecsForRetirementStrategiesUpsellViewModel recsForRetirementStrategiesUpsellViewModel, BrokerageAccountType brokerageAccountType, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recsForRetirementStrategiesUpsellDataState.source;
        }
        if ((i & 2) != 0) {
            recsForRetirementStrategiesUpsellViewModel = recsForRetirementStrategiesUpsellDataState.viewModel;
        }
        if ((i & 4) != 0) {
            brokerageAccountType = recsForRetirementStrategiesUpsellDataState.brokerageAccountType;
        }
        if ((i & 8) != 0) {
            th = recsForRetirementStrategiesUpsellDataState.error;
        }
        return recsForRetirementStrategiesUpsellDataState.copy(str, recsForRetirementStrategiesUpsellViewModel, brokerageAccountType, th);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final RecsForRetirementStrategiesUpsellViewModel getViewModel() {
        return this.viewModel;
    }

    /* renamed from: component3, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    /* renamed from: component4, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    public final RecsForRetirementStrategiesUpsellDataState copy(String source, RecsForRetirementStrategiesUpsellViewModel viewModel, BrokerageAccountType brokerageAccountType, Throwable error) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new RecsForRetirementStrategiesUpsellDataState(source, viewModel, brokerageAccountType, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecsForRetirementStrategiesUpsellDataState)) {
            return false;
        }
        RecsForRetirementStrategiesUpsellDataState recsForRetirementStrategiesUpsellDataState = (RecsForRetirementStrategiesUpsellDataState) other;
        return Intrinsics.areEqual(this.source, recsForRetirementStrategiesUpsellDataState.source) && Intrinsics.areEqual(this.viewModel, recsForRetirementStrategiesUpsellDataState.viewModel) && this.brokerageAccountType == recsForRetirementStrategiesUpsellDataState.brokerageAccountType && Intrinsics.areEqual(this.error, recsForRetirementStrategiesUpsellDataState.error);
    }

    public int hashCode() {
        int iHashCode = this.source.hashCode() * 31;
        RecsForRetirementStrategiesUpsellViewModel recsForRetirementStrategiesUpsellViewModel = this.viewModel;
        int iHashCode2 = (iHashCode + (recsForRetirementStrategiesUpsellViewModel == null ? 0 : recsForRetirementStrategiesUpsellViewModel.hashCode())) * 31;
        BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
        int iHashCode3 = (iHashCode2 + (brokerageAccountType == null ? 0 : brokerageAccountType.hashCode())) * 31;
        Throwable th = this.error;
        return iHashCode3 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "RecsForRetirementStrategiesUpsellDataState(source=" + this.source + ", viewModel=" + this.viewModel + ", brokerageAccountType=" + this.brokerageAccountType + ", error=" + this.error + ")";
    }

    public RecsForRetirementStrategiesUpsellDataState(String source, RecsForRetirementStrategiesUpsellViewModel recsForRetirementStrategiesUpsellViewModel, BrokerageAccountType brokerageAccountType, Throwable th) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.viewModel = recsForRetirementStrategiesUpsellViewModel;
        this.brokerageAccountType = brokerageAccountType;
        this.error = th;
    }

    public /* synthetic */ RecsForRetirementStrategiesUpsellDataState(String str, RecsForRetirementStrategiesUpsellViewModel recsForRetirementStrategiesUpsellViewModel, BrokerageAccountType brokerageAccountType, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : recsForRetirementStrategiesUpsellViewModel, (i & 4) != 0 ? null : brokerageAccountType, (i & 8) != 0 ? null : th);
    }

    public final String getSource() {
        return this.source;
    }

    public final RecsForRetirementStrategiesUpsellViewModel getViewModel() {
        return this.viewModel;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final Throwable getError() {
        return this.error;
    }

    /* compiled from: RecsForRetirementStrategiesUpsellDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/rxr/RecsForRetirementStrategiesUpsellDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/advisory/onboarding/rxr/RecsForRetirementStrategiesUpsellDataState;", "Lcom/robinhood/android/advisory/onboarding/rxr/RecsForRetirementStrategiesUpsellViewState;", "<init>", "()V", "reduce", "dataState", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StateProvider<RecsForRetirementStrategiesUpsellDataState, RecsForRetirementStrategiesUpsellViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public RecsForRetirementStrategiesUpsellViewState reduce(RecsForRetirementStrategiesUpsellDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getViewModel() == null || dataState.getBrokerageAccountType() == null) {
                return dataState.getError() != null ? RecsForRetirementStrategiesUpsellViewState.Error.INSTANCE : RecsForRetirementStrategiesUpsellViewState.Loading.INSTANCE;
            }
            return new RecsForRetirementStrategiesUpsellViewState.Loaded(dataState.getViewModel(), dataState.getBrokerageAccountType(), dataState.getSource());
        }
    }
}

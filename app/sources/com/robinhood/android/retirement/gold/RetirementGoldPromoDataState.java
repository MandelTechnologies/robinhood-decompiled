package com.robinhood.android.retirement.gold;

import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.models.retirement.api.iraupsell.GoldBoostedMatchPromoPageViewModel;
import com.robinhood.android.retirement.gold.RetirementGoldPromoViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: RetirementGoldPromoDataState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/retirement/gold/RetirementGoldPromoDataState;", "", "source", "", "viewModel", "Lcom/robinhood/android/models/retirement/api/iraupsell/GoldBoostedMatchPromoPageViewModel;", "error", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/models/retirement/api/iraupsell/GoldBoostedMatchPromoPageViewModel;Ljava/lang/Throwable;)V", "getSource", "()Ljava/lang/String;", "getViewModel", "()Lcom/robinhood/android/models/retirement/api/iraupsell/GoldBoostedMatchPromoPageViewModel;", "getError", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Provider", "feature-retirement-gold_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RetirementGoldPromoDataState {
    private final Throwable error;
    private final String source;
    private final GoldBoostedMatchPromoPageViewModel viewModel;

    /* renamed from: Provider, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public RetirementGoldPromoDataState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ RetirementGoldPromoDataState copy$default(RetirementGoldPromoDataState retirementGoldPromoDataState, String str, GoldBoostedMatchPromoPageViewModel goldBoostedMatchPromoPageViewModel, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            str = retirementGoldPromoDataState.source;
        }
        if ((i & 2) != 0) {
            goldBoostedMatchPromoPageViewModel = retirementGoldPromoDataState.viewModel;
        }
        if ((i & 4) != 0) {
            th = retirementGoldPromoDataState.error;
        }
        return retirementGoldPromoDataState.copy(str, goldBoostedMatchPromoPageViewModel, th);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final GoldBoostedMatchPromoPageViewModel getViewModel() {
        return this.viewModel;
    }

    /* renamed from: component3, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    public final RetirementGoldPromoDataState copy(String source, GoldBoostedMatchPromoPageViewModel viewModel, Throwable error) {
        return new RetirementGoldPromoDataState(source, viewModel, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetirementGoldPromoDataState)) {
            return false;
        }
        RetirementGoldPromoDataState retirementGoldPromoDataState = (RetirementGoldPromoDataState) other;
        return Intrinsics.areEqual(this.source, retirementGoldPromoDataState.source) && Intrinsics.areEqual(this.viewModel, retirementGoldPromoDataState.viewModel) && Intrinsics.areEqual(this.error, retirementGoldPromoDataState.error);
    }

    public int hashCode() {
        String str = this.source;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        GoldBoostedMatchPromoPageViewModel goldBoostedMatchPromoPageViewModel = this.viewModel;
        int iHashCode2 = (iHashCode + (goldBoostedMatchPromoPageViewModel == null ? 0 : goldBoostedMatchPromoPageViewModel.hashCode())) * 31;
        Throwable th = this.error;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "RetirementGoldPromoDataState(source=" + this.source + ", viewModel=" + this.viewModel + ", error=" + this.error + ")";
    }

    public RetirementGoldPromoDataState(String str, GoldBoostedMatchPromoPageViewModel goldBoostedMatchPromoPageViewModel, Throwable th) {
        this.source = str;
        this.viewModel = goldBoostedMatchPromoPageViewModel;
        this.error = th;
    }

    public /* synthetic */ RetirementGoldPromoDataState(String str, GoldBoostedMatchPromoPageViewModel goldBoostedMatchPromoPageViewModel, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : goldBoostedMatchPromoPageViewModel, (i & 4) != 0 ? null : th);
    }

    public final String getSource() {
        return this.source;
    }

    public final GoldBoostedMatchPromoPageViewModel getViewModel() {
        return this.viewModel;
    }

    public final Throwable getError() {
        return this.error;
    }

    /* compiled from: RetirementGoldPromoDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/retirement/gold/RetirementGoldPromoDataState$Provider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/retirement/gold/RetirementGoldPromoDataState;", "Lcom/robinhood/android/retirement/gold/RetirementGoldPromoViewState;", "<init>", "()V", "reduce", "dataState", "feature-retirement-gold_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.retirement.gold.RetirementGoldPromoDataState$Provider, reason: from kotlin metadata */
    public static final class Companion implements StateProvider<RetirementGoldPromoDataState, RetirementGoldPromoViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public RetirementGoldPromoViewState reduce(RetirementGoldPromoDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getViewModel() == null) {
                return dataState.getError() != null ? RetirementGoldPromoViewState.Failure.INSTANCE : RetirementGoldPromoViewState.Loading.INSTANCE;
            }
            ImmutableList3 persistentList = extensions2.toPersistentList(dataState.getViewModel().getBody());
            ImmutableList3 persistentList2 = extensions2.toPersistentList(dataState.getViewModel().getFooter());
            String lottie_url = dataState.getViewModel().getLottie_info().getLottie_url();
            int start_frame = dataState.getViewModel().getLottie_info().getStart_frame();
            int end_frame = dataState.getViewModel().getLottie_info().getEnd_frame();
            String logging_identifier = dataState.getViewModel().getLogging_identifier();
            Screen screenGoldPromoScreen = RetirementGoldPromo5.goldPromoScreen(dataState.getViewModel().getLogging_identifier());
            String source = dataState.getSource();
            if (source == null) {
                source = "";
            }
            return new RetirementGoldPromoViewState.Loaded(new UserInteractionEventDescriptor(logging_identifier, screenGoldPromoScreen, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, source, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 52, null), persistentList, persistentList2, lottie_url, start_frame, end_frame);
        }
    }
}

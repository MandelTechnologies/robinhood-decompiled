package com.robinhood.android.advisory.withdrawal;

import com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalViewState;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: AdvisoryFullWithdrawalDataState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalDataState;", "", ErrorBundle.SUMMARY_ENTRY, "Lcom/robinhood/android/advisory/withdrawal/FullWithdrawalSummary;", "initialLoadError", "", "submitting", "", "<init>", "(Lcom/robinhood/android/advisory/withdrawal/FullWithdrawalSummary;Ljava/lang/Throwable;Z)V", "getSummary", "()Lcom/robinhood/android/advisory/withdrawal/FullWithdrawalSummary;", "getInitialLoadError", "()Ljava/lang/Throwable;", "getSubmitting", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "feature-advisory-full-withdrawal_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AdvisoryFullWithdrawalDataState {
    private final Throwable initialLoadError;
    private final boolean submitting;
    private final FullWithdrawalSummary summary;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public AdvisoryFullWithdrawalDataState() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ AdvisoryFullWithdrawalDataState copy$default(AdvisoryFullWithdrawalDataState advisoryFullWithdrawalDataState, FullWithdrawalSummary fullWithdrawalSummary, Throwable th, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            fullWithdrawalSummary = advisoryFullWithdrawalDataState.summary;
        }
        if ((i & 2) != 0) {
            th = advisoryFullWithdrawalDataState.initialLoadError;
        }
        if ((i & 4) != 0) {
            z = advisoryFullWithdrawalDataState.submitting;
        }
        return advisoryFullWithdrawalDataState.copy(fullWithdrawalSummary, th, z);
    }

    /* renamed from: component1, reason: from getter */
    public final FullWithdrawalSummary getSummary() {
        return this.summary;
    }

    /* renamed from: component2, reason: from getter */
    public final Throwable getInitialLoadError() {
        return this.initialLoadError;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSubmitting() {
        return this.submitting;
    }

    public final AdvisoryFullWithdrawalDataState copy(FullWithdrawalSummary summary, Throwable initialLoadError, boolean submitting) {
        return new AdvisoryFullWithdrawalDataState(summary, initialLoadError, submitting);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvisoryFullWithdrawalDataState)) {
            return false;
        }
        AdvisoryFullWithdrawalDataState advisoryFullWithdrawalDataState = (AdvisoryFullWithdrawalDataState) other;
        return Intrinsics.areEqual(this.summary, advisoryFullWithdrawalDataState.summary) && Intrinsics.areEqual(this.initialLoadError, advisoryFullWithdrawalDataState.initialLoadError) && this.submitting == advisoryFullWithdrawalDataState.submitting;
    }

    public int hashCode() {
        FullWithdrawalSummary fullWithdrawalSummary = this.summary;
        int iHashCode = (fullWithdrawalSummary == null ? 0 : fullWithdrawalSummary.hashCode()) * 31;
        Throwable th = this.initialLoadError;
        return ((iHashCode + (th != null ? th.hashCode() : 0)) * 31) + Boolean.hashCode(this.submitting);
    }

    public String toString() {
        return "AdvisoryFullWithdrawalDataState(summary=" + this.summary + ", initialLoadError=" + this.initialLoadError + ", submitting=" + this.submitting + ")";
    }

    public AdvisoryFullWithdrawalDataState(FullWithdrawalSummary fullWithdrawalSummary, Throwable th, boolean z) {
        this.summary = fullWithdrawalSummary;
        this.initialLoadError = th;
        this.submitting = z;
    }

    public /* synthetic */ AdvisoryFullWithdrawalDataState(FullWithdrawalSummary fullWithdrawalSummary, Throwable th, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fullWithdrawalSummary, (i & 2) != 0 ? null : th, (i & 4) != 0 ? false : z);
    }

    public final FullWithdrawalSummary getSummary() {
        return this.summary;
    }

    public final Throwable getInitialLoadError() {
        return this.initialLoadError;
    }

    public final boolean getSubmitting() {
        return this.submitting;
    }

    /* compiled from: AdvisoryFullWithdrawalDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalDataState;", "Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalViewState;", "<init>", "()V", "reduce", "dataState", "feature-advisory-full-withdrawal_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StateProvider<AdvisoryFullWithdrawalDataState, AdvisoryFullWithdrawalViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public AdvisoryFullWithdrawalViewState reduce(AdvisoryFullWithdrawalDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getSummary() != null) {
                return new AdvisoryFullWithdrawalViewState.Loaded(dataState.getSummary(), dataState.getSubmitting());
            }
            return dataState.getInitialLoadError() != null ? AdvisoryFullWithdrawalViewState.InitializationError.INSTANCE : AdvisoryFullWithdrawalViewState.Loading.INSTANCE;
        }
    }
}

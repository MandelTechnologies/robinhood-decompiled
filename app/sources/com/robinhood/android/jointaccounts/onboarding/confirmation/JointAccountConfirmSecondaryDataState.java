package com.robinhood.android.jointaccounts.onboarding.confirmation;

import com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.jointaccounts.api.confirmation.ApiConfirmSecondaryViewModel;
import com.robinhood.store.AsyncResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JointAccountConfirmSecondaryDataState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryDataState;", "", "source", "", "viewModelResult", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/models/jointaccounts/api/confirmation/ApiConfirmSecondaryViewModel;", "postingRejection", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/store/AsyncResult;Z)V", "getSource", "()Ljava/lang/String;", "getViewModelResult", "()Lcom/robinhood/store/AsyncResult;", "getPostingRejection", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class JointAccountConfirmSecondaryDataState {
    private final boolean postingRejection;
    private final String source;
    private final AsyncResult<ApiConfirmSecondaryViewModel> viewModelResult;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JointAccountConfirmSecondaryDataState copy$default(JointAccountConfirmSecondaryDataState jointAccountConfirmSecondaryDataState, String str, AsyncResult asyncResult, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jointAccountConfirmSecondaryDataState.source;
        }
        if ((i & 2) != 0) {
            asyncResult = jointAccountConfirmSecondaryDataState.viewModelResult;
        }
        if ((i & 4) != 0) {
            z = jointAccountConfirmSecondaryDataState.postingRejection;
        }
        return jointAccountConfirmSecondaryDataState.copy(str, asyncResult, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final AsyncResult<ApiConfirmSecondaryViewModel> component2() {
        return this.viewModelResult;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getPostingRejection() {
        return this.postingRejection;
    }

    public final JointAccountConfirmSecondaryDataState copy(String source, AsyncResult<ApiConfirmSecondaryViewModel> viewModelResult, boolean postingRejection) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(viewModelResult, "viewModelResult");
        return new JointAccountConfirmSecondaryDataState(source, viewModelResult, postingRejection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JointAccountConfirmSecondaryDataState)) {
            return false;
        }
        JointAccountConfirmSecondaryDataState jointAccountConfirmSecondaryDataState = (JointAccountConfirmSecondaryDataState) other;
        return Intrinsics.areEqual(this.source, jointAccountConfirmSecondaryDataState.source) && Intrinsics.areEqual(this.viewModelResult, jointAccountConfirmSecondaryDataState.viewModelResult) && this.postingRejection == jointAccountConfirmSecondaryDataState.postingRejection;
    }

    public int hashCode() {
        return (((this.source.hashCode() * 31) + this.viewModelResult.hashCode()) * 31) + Boolean.hashCode(this.postingRejection);
    }

    public String toString() {
        return "JointAccountConfirmSecondaryDataState(source=" + this.source + ", viewModelResult=" + this.viewModelResult + ", postingRejection=" + this.postingRejection + ")";
    }

    public JointAccountConfirmSecondaryDataState(String source, AsyncResult<ApiConfirmSecondaryViewModel> viewModelResult, boolean z) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(viewModelResult, "viewModelResult");
        this.source = source;
        this.viewModelResult = viewModelResult;
        this.postingRejection = z;
    }

    public final String getSource() {
        return this.source;
    }

    public /* synthetic */ JointAccountConfirmSecondaryDataState(String str, AsyncResult asyncResult, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? AsyncResult.Loading.INSTANCE : asyncResult, (i & 4) != 0 ? false : z);
    }

    public final AsyncResult<ApiConfirmSecondaryViewModel> getViewModelResult() {
        return this.viewModelResult;
    }

    public final boolean getPostingRejection() {
        return this.postingRejection;
    }

    /* compiled from: JointAccountConfirmSecondaryDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryDataState;", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryViewState;", "<init>", "()V", "reduce", "dataState", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StateProvider<JointAccountConfirmSecondaryDataState, JointAccountConfirmSecondaryViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public JointAccountConfirmSecondaryViewState reduce(JointAccountConfirmSecondaryDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            AsyncResult<ApiConfirmSecondaryViewModel> viewModelResult = dataState.getViewModelResult();
            if (viewModelResult instanceof AsyncResult.Failure) {
                return JointAccountConfirmSecondaryViewState.Error.INSTANCE;
            }
            if (viewModelResult instanceof AsyncResult.Loading) {
                return JointAccountConfirmSecondaryViewState.Loading.INSTANCE;
            }
            if (!(viewModelResult instanceof AsyncResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            return new JointAccountConfirmSecondaryViewState.Loaded((ApiConfirmSecondaryViewModel) ((AsyncResult.Success) viewModelResult).getValue(), dataState.getPostingRejection(), dataState.getSource());
        }
    }
}

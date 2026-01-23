package com.robinhood.android.beneficiaries.p067ui.individualflow.finalize;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryCreateFinalizeDataState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeDataState;", "", "successAlert", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "error", "", "<init>", "(Lcom/robinhood/utils/Optional;Ljava/lang/Throwable;)V", "getSuccessAlert", "()Lcom/robinhood/utils/Optional;", "getError", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BeneficiaryCreateFinalizeDataState {
    public static final int $stable = 8;
    private final Throwable error;
    private final Optional<GenericAlertContent<GenericAction>> successAlert;

    /* JADX WARN: Multi-variable type inference failed */
    public BeneficiaryCreateFinalizeDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeneficiaryCreateFinalizeDataState copy$default(BeneficiaryCreateFinalizeDataState beneficiaryCreateFinalizeDataState, Optional optional, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            optional = beneficiaryCreateFinalizeDataState.successAlert;
        }
        if ((i & 2) != 0) {
            th = beneficiaryCreateFinalizeDataState.error;
        }
        return beneficiaryCreateFinalizeDataState.copy(optional, th);
    }

    public final Optional<GenericAlertContent<GenericAction>> component1() {
        return this.successAlert;
    }

    /* renamed from: component2, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    public final BeneficiaryCreateFinalizeDataState copy(Optional<? extends GenericAlertContent<? extends GenericAction>> successAlert, Throwable error) {
        return new BeneficiaryCreateFinalizeDataState(successAlert, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryCreateFinalizeDataState)) {
            return false;
        }
        BeneficiaryCreateFinalizeDataState beneficiaryCreateFinalizeDataState = (BeneficiaryCreateFinalizeDataState) other;
        return Intrinsics.areEqual(this.successAlert, beneficiaryCreateFinalizeDataState.successAlert) && Intrinsics.areEqual(this.error, beneficiaryCreateFinalizeDataState.error);
    }

    public int hashCode() {
        Optional<GenericAlertContent<GenericAction>> optional = this.successAlert;
        int iHashCode = (optional == null ? 0 : optional.hashCode()) * 31;
        Throwable th = this.error;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "BeneficiaryCreateFinalizeDataState(successAlert=" + this.successAlert + ", error=" + this.error + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeneficiaryCreateFinalizeDataState(Optional<? extends GenericAlertContent<? extends GenericAction>> optional, Throwable th) {
        this.successAlert = optional;
        this.error = th;
    }

    public /* synthetic */ BeneficiaryCreateFinalizeDataState(Optional optional, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : optional, (i & 2) != 0 ? null : th);
    }

    public final Optional<GenericAlertContent<GenericAction>> getSuccessAlert() {
        return this.successAlert;
    }

    public final Throwable getError() {
        return this.error;
    }
}

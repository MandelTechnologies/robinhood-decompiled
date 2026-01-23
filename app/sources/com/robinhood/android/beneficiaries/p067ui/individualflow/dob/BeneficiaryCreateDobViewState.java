package com.robinhood.android.beneficiaries.p067ui.individualflow.dob;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: BeneficiaryCreateDobViewState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u001e\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011JV\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b\u0003\u0010\u000fR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0011R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\"\u0010\u0011R%\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b#\u0010\u0011R\u0011\u0010$\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b$\u0010\u000f¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobViewState;", "", "", "isLoading", "Lcom/robinhood/udf/UiEvent;", "j$/time/LocalDate", "success", "", "error", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "validationError", "<init>", "(ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "component1", "()Z", "component2", "()Lcom/robinhood/udf/UiEvent;", "component3", "component4", "copy", "(ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobViewState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Lcom/robinhood/udf/UiEvent;", "getSuccess", "getError", "getValidationError", "isInputEnabled", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BeneficiaryCreateDobViewState {
    public static final int $stable = 8;
    private final UiEvent<Throwable> error;
    private final boolean isLoading;
    private final UiEvent<LocalDate> success;
    private final UiEvent<GenericAlertContent<GenericAction>> validationError;

    public BeneficiaryCreateDobViewState() {
        this(false, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeneficiaryCreateDobViewState copy$default(BeneficiaryCreateDobViewState beneficiaryCreateDobViewState, boolean z, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = beneficiaryCreateDobViewState.isLoading;
        }
        if ((i & 2) != 0) {
            uiEvent = beneficiaryCreateDobViewState.success;
        }
        if ((i & 4) != 0) {
            uiEvent2 = beneficiaryCreateDobViewState.error;
        }
        if ((i & 8) != 0) {
            uiEvent3 = beneficiaryCreateDobViewState.validationError;
        }
        return beneficiaryCreateDobViewState.copy(z, uiEvent, uiEvent2, uiEvent3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final UiEvent<LocalDate> component2() {
        return this.success;
    }

    public final UiEvent<Throwable> component3() {
        return this.error;
    }

    public final UiEvent<GenericAlertContent<GenericAction>> component4() {
        return this.validationError;
    }

    public final BeneficiaryCreateDobViewState copy(boolean isLoading, UiEvent<LocalDate> success, UiEvent<Throwable> error, UiEvent<GenericAlertContent<GenericAction>> validationError) {
        return new BeneficiaryCreateDobViewState(isLoading, success, error, validationError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryCreateDobViewState)) {
            return false;
        }
        BeneficiaryCreateDobViewState beneficiaryCreateDobViewState = (BeneficiaryCreateDobViewState) other;
        return this.isLoading == beneficiaryCreateDobViewState.isLoading && Intrinsics.areEqual(this.success, beneficiaryCreateDobViewState.success) && Intrinsics.areEqual(this.error, beneficiaryCreateDobViewState.error) && Intrinsics.areEqual(this.validationError, beneficiaryCreateDobViewState.validationError);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        UiEvent<LocalDate> uiEvent = this.success;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Throwable> uiEvent2 = this.error;
        int iHashCode3 = (iHashCode2 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<GenericAlertContent<GenericAction>> uiEvent3 = this.validationError;
        return iHashCode3 + (uiEvent3 != null ? uiEvent3.hashCode() : 0);
    }

    public String toString() {
        return "BeneficiaryCreateDobViewState(isLoading=" + this.isLoading + ", success=" + this.success + ", error=" + this.error + ", validationError=" + this.validationError + ")";
    }

    public BeneficiaryCreateDobViewState(boolean z, UiEvent<LocalDate> uiEvent, UiEvent<Throwable> uiEvent2, UiEvent<GenericAlertContent<GenericAction>> uiEvent3) {
        this.isLoading = z;
        this.success = uiEvent;
        this.error = uiEvent2;
        this.validationError = uiEvent3;
    }

    public /* synthetic */ BeneficiaryCreateDobViewState(boolean z, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : uiEvent, (i & 4) != 0 ? null : uiEvent2, (i & 8) != 0 ? null : uiEvent3);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final UiEvent<LocalDate> getSuccess() {
        return this.success;
    }

    public final UiEvent<Throwable> getError() {
        return this.error;
    }

    public final UiEvent<GenericAlertContent<GenericAction>> getValidationError() {
        return this.validationError;
    }

    public final boolean isInputEnabled() {
        return !this.isLoading;
    }
}

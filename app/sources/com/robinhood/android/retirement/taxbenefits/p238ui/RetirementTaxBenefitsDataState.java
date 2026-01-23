package com.robinhood.android.retirement.taxbenefits.p238ui;

import com.robinhood.android.models.retirement.api.taxbenefits.ApiRetirementTaxBenefitsViewModel;
import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.utils.Either;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementTaxBenefitsDataState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0003HÆ\u0003J'\u0010\f\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R%\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/retirement/taxbenefits/ui/RetirementTaxBenefitsDataState;", "", "taxBenefitsResponse", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/android/models/retirement/api/taxbenefits/ApiRetirementTaxBenefitsViewModel;", "Lcom/robinhood/compose/duxo/ComposeUiEvent;", "", "<init>", "(Lcom/robinhood/utils/Either;)V", "getTaxBenefitsResponse", "()Lcom/robinhood/utils/Either;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-retirement-tax-benefits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RetirementTaxBenefitsDataState {
    public static final int $stable = 8;
    private final Either<ApiRetirementTaxBenefitsViewModel, ComposeUiEvent<Throwable>> taxBenefitsResponse;

    /* JADX WARN: Multi-variable type inference failed */
    public RetirementTaxBenefitsDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RetirementTaxBenefitsDataState copy$default(RetirementTaxBenefitsDataState retirementTaxBenefitsDataState, Either either, int i, Object obj) {
        if ((i & 1) != 0) {
            either = retirementTaxBenefitsDataState.taxBenefitsResponse;
        }
        return retirementTaxBenefitsDataState.copy(either);
    }

    public final Either<ApiRetirementTaxBenefitsViewModel, ComposeUiEvent<Throwable>> component1() {
        return this.taxBenefitsResponse;
    }

    public final RetirementTaxBenefitsDataState copy(Either<ApiRetirementTaxBenefitsViewModel, ComposeUiEvent<Throwable>> taxBenefitsResponse) {
        return new RetirementTaxBenefitsDataState(taxBenefitsResponse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RetirementTaxBenefitsDataState) && Intrinsics.areEqual(this.taxBenefitsResponse, ((RetirementTaxBenefitsDataState) other).taxBenefitsResponse);
    }

    public int hashCode() {
        Either<ApiRetirementTaxBenefitsViewModel, ComposeUiEvent<Throwable>> either = this.taxBenefitsResponse;
        if (either == null) {
            return 0;
        }
        return either.hashCode();
    }

    public String toString() {
        return "RetirementTaxBenefitsDataState(taxBenefitsResponse=" + this.taxBenefitsResponse + ")";
    }

    public RetirementTaxBenefitsDataState(Either<ApiRetirementTaxBenefitsViewModel, ComposeUiEvent<Throwable>> either) {
        this.taxBenefitsResponse = either;
    }

    public /* synthetic */ RetirementTaxBenefitsDataState(Either either, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : either);
    }

    public final Either<ApiRetirementTaxBenefitsViewModel, ComposeUiEvent<Throwable>> getTaxBenefitsResponse() {
        return this.taxBenefitsResponse;
    }
}

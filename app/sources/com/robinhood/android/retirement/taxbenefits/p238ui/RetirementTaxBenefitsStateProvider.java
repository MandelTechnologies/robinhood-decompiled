package com.robinhood.android.retirement.taxbenefits.p238ui;

import com.robinhood.android.models.retirement.api.taxbenefits.ApiRetirementTaxBenefitsViewModel;
import com.robinhood.android.retirement.taxbenefits.p238ui.RetirementTaxBenefitsViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.utils.Either;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementTaxBenefitsStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/retirement/taxbenefits/ui/RetirementTaxBenefitsStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/retirement/taxbenefits/ui/RetirementTaxBenefitsDataState;", "Lcom/robinhood/android/retirement/taxbenefits/ui/RetirementTaxBenefitsViewState;", "<init>", "()V", "reduce", "dataState", "feature-retirement-tax-benefits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RetirementTaxBenefitsStateProvider implements StateProvider<RetirementTaxBenefitsDataState, RetirementTaxBenefitsViewState> {
    public static final int $stable = 0;
    public static final RetirementTaxBenefitsStateProvider INSTANCE = new RetirementTaxBenefitsStateProvider();

    private RetirementTaxBenefitsStateProvider() {
    }

    @Override // com.robinhood.android.udf.StateProvider
    public RetirementTaxBenefitsViewState reduce(RetirementTaxBenefitsDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Either<ApiRetirementTaxBenefitsViewModel, ComposeUiEvent<Throwable>> taxBenefitsResponse = dataState.getTaxBenefitsResponse();
        if (taxBenefitsResponse == null) {
            return RetirementTaxBenefitsViewState.Loading.INSTANCE;
        }
        if (taxBenefitsResponse instanceof Either.Left) {
            return new RetirementTaxBenefitsViewState.Loaded((ApiRetirementTaxBenefitsViewModel) ((Either.Left) taxBenefitsResponse).getValue());
        }
        if (taxBenefitsResponse instanceof Either.Right) {
            return new RetirementTaxBenefitsViewState.Error((ComposeUiEvent) ((Either.Right) taxBenefitsResponse).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}

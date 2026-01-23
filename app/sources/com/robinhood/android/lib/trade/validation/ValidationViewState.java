package com.robinhood.android.lib.trade.validation;

import com.robinhood.android.lib.trade.validation.ValidationData;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;

/* compiled from: ValidationViewState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u0012\u001a\u0002H\u0013\"\u0014\b\u0002\u0010\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H&¢\u0006\u0002\u0010\u0014R\u001e\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00018\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR)\u0010\r\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u000f\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/validation/ValidationViewState;", "InputT", "", "ResolverT", "<init>", "()V", "validationData", "Lcom/robinhood/android/lib/trade/validation/ValidationData;", "getValidationData", "()Lcom/robinhood/android/lib/trade/validation/ValidationData;", "validationInput", "getValidationInput", "()Ljava/lang/Object;", "validationResult", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/lib/trade/validation/ValidationData$ValidationResult;", "getValidationResult", "()Lcom/robinhood/udf/UiEvent;", "copyWithNewValidationData", "StateT", "(Lcom/robinhood/android/lib/trade/validation/ValidationData;)Lcom/robinhood/android/lib/trade/validation/ValidationViewState;", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public abstract class ValidationViewState<InputT, ResolverT> {
    public static final int $stable = 0;

    public abstract <StateT extends ValidationViewState<InputT, ResolverT>> StateT copyWithNewValidationData(ValidationData<InputT, ResolverT> validationData);

    public abstract ValidationData<InputT, ResolverT> getValidationData();

    public abstract InputT getValidationInput();

    public final UiEvent<ValidationData.ValidationResult<? extends InputT, ? extends ResolverT>> getValidationResult() {
        return getValidationData().getValidationResult();
    }
}

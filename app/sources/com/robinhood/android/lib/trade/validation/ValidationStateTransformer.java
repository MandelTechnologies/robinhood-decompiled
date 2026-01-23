package com.robinhood.android.lib.trade.validation;

import com.robinhood.android.lib.trade.validation.ValidationData;
import com.robinhood.android.lib.trade.validation.ValidationViewState;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ValidationStateTransformer.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0002*\u0014\b\u0002\u0010\u0004*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00052\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00028\u00022\u0006\u0010\u000b\u001a\u00028\u0002¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00028\u00022\u0006\u0010\u000b\u001a\u00028\u0002¢\u0006\u0002\u0010\fJ'\u0010\u000e\u001a\u00028\u00022\u0006\u0010\u000b\u001a\u00028\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0012\u001a\u00028\u00022\u0006\u0010\u000b\u001a\u00028\u0002H\u0002¢\u0006\u0002\u0010\fR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/validation/ValidationStateTransformer;", "InputT", "", "ResolverT", "StateT", "Lcom/robinhood/android/lib/trade/validation/ValidationViewState;", "validator", "Lcom/robinhood/android/lib/trade/validation/Validator;", "<init>", "(Lcom/robinhood/android/lib/trade/validation/Validator;)V", "resetAndValidate", "state", "(Lcom/robinhood/android/lib/trade/validation/ValidationViewState;)Lcom/robinhood/android/lib/trade/validation/ValidationViewState;", "abortValidation", "skipFailureAndValidate", "failure", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "(Lcom/robinhood/android/lib/trade/validation/ValidationViewState;Lcom/robinhood/android/lib/trade/validation/Validator$Failure;)Lcom/robinhood/android/lib/trade/validation/ValidationViewState;", "validate", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class ValidationStateTransformer<InputT, ResolverT, StateT extends ValidationViewState<InputT, ResolverT>> {
    public static final int $stable = 8;
    private final Validator<InputT, ResolverT> validator;

    /* JADX WARN: Multi-variable type inference failed */
    public ValidationStateTransformer(Validator<? super InputT, ? super ResolverT> validator) {
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.validator = validator;
    }

    public final StateT resetAndValidate(StateT state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return (StateT) validate(abortValidation(state));
    }

    public final StateT abortValidation(StateT state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return (StateT) state.copyWithNewValidationData(state.getValidationData().copy(null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final StateT skipFailureAndValidate(StateT state, Validator.Failure<? super InputT, ? super ResolverT> failure) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(failure, "failure");
        ValidationData<InputT, ResolverT> validationData = state.getValidationData();
        Validator.ValidationContext<InputT, ResolverT> validationContext = state.getValidationData().getValidationContext();
        return (StateT) validate(state.copyWithNewValidationData(ValidationData.copy$default(validationData, validationContext != null ? validationContext.skipFailure(failure) : null, null, 2, null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final StateT validate(StateT state) {
        Object failure;
        Object validationInput = state.getValidationInput();
        if (validationInput == null) {
            return state;
        }
        ValidationData<InputT, ResolverT> validationData = state.getValidationData();
        Validator.ValidationContext<InputT, ResolverT> validationContext = validationData.getValidationContext();
        if (validationContext == null) {
            validationContext = this.validator.validateWithContext(validationInput);
        }
        Validator.Failure<InputT, ResolverT> failure2 = validationContext.getFailure();
        if (failure2 == null) {
            failure = new ValidationData.ValidationResult.Success(validationInput);
        } else {
            failure = new ValidationData.ValidationResult.Failure(failure2, validationInput);
        }
        return (StateT) state.copyWithNewValidationData(validationData.copy(validationContext, new UiEvent<>(failure)));
    }
}

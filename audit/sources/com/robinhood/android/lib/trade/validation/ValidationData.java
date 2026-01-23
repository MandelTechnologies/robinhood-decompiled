package com.robinhood.android.lib.trade.validation;

import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ValidationData.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002:\u0001\u0019BA\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005\u0012 \b\u0002\u0010\u0006\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005HÆ\u0003J!\u0010\u0010\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\b\u0018\u00010\u0007HÆ\u0003JO\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00052 \b\u0002\u0010\u0006\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR)\u0010\u0006\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/validation/ValidationData;", "InputT", "", "ResolverT", "validationContext", "Lcom/robinhood/android/lib/trade/validation/Validator$ValidationContext;", "validationResult", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/lib/trade/validation/ValidationData$ValidationResult;", "<init>", "(Lcom/robinhood/android/lib/trade/validation/Validator$ValidationContext;Lcom/robinhood/udf/UiEvent;)V", "getValidationContext", "()Lcom/robinhood/android/lib/trade/validation/Validator$ValidationContext;", "getValidationResult", "()Lcom/robinhood/udf/UiEvent;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ValidationResult", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ValidationData<InputT, ResolverT> {
    public static final int $stable = 8;
    private final Validator.ValidationContext<InputT, ResolverT> validationContext;
    private final UiEvent<ValidationResult<? extends InputT, ? extends ResolverT>> validationResult;

    /* JADX WARN: Multi-variable type inference failed */
    public ValidationData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ValidationData copy$default(ValidationData validationData, Validator.ValidationContext validationContext, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            validationContext = validationData.validationContext;
        }
        if ((i & 2) != 0) {
            uiEvent = validationData.validationResult;
        }
        return validationData.copy(validationContext, uiEvent);
    }

    public final Validator.ValidationContext<InputT, ResolverT> component1() {
        return this.validationContext;
    }

    public final UiEvent<ValidationResult<? extends InputT, ? extends ResolverT>> component2() {
        return this.validationResult;
    }

    public final ValidationData<InputT, ResolverT> copy(Validator.ValidationContext<? super InputT, ? super ResolverT> validationContext, UiEvent<ValidationResult<? extends InputT, ? extends ResolverT>> validationResult) {
        return new ValidationData<>(validationContext, validationResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidationData)) {
            return false;
        }
        ValidationData validationData = (ValidationData) other;
        return Intrinsics.areEqual(this.validationContext, validationData.validationContext) && Intrinsics.areEqual(this.validationResult, validationData.validationResult);
    }

    public int hashCode() {
        Validator.ValidationContext<InputT, ResolverT> validationContext = this.validationContext;
        int iHashCode = (validationContext == null ? 0 : validationContext.hashCode()) * 31;
        UiEvent<ValidationResult<? extends InputT, ? extends ResolverT>> uiEvent = this.validationResult;
        return iHashCode + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "ValidationData(validationContext=" + this.validationContext + ", validationResult=" + this.validationResult + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ValidationData(Validator.ValidationContext<? super InputT, ? super ResolverT> validationContext, UiEvent<ValidationResult<? extends InputT, ? extends ResolverT>> uiEvent) {
        this.validationContext = validationContext;
        this.validationResult = uiEvent;
    }

    public /* synthetic */ ValidationData(Validator.ValidationContext validationContext, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : validationContext, (i & 2) != 0 ? null : uiEvent);
    }

    public final Validator.ValidationContext<InputT, ResolverT> getValidationContext() {
        return this.validationContext;
    }

    public final UiEvent<ValidationResult<? extends InputT, ? extends ResolverT>> getValidationResult() {
        return this.validationResult;
    }

    /* compiled from: ValidationData.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u0002*\b\b\u0003\u0010\u0003*\u00020\u00022\u00020\u0002:\u0002\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/validation/ValidationData$ValidationResult;", "InputT", "", "ResolverT", "<init>", "()V", "Success", "Failure", "Lcom/robinhood/android/lib/trade/validation/ValidationData$ValidationResult$Failure;", "Lcom/robinhood/android/lib/trade/validation/ValidationData$ValidationResult$Success;", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ValidationResult<InputT, ResolverT> {
        public static final int $stable = 0;

        public /* synthetic */ ValidationResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ValidationResult() {
        }

        /* compiled from: ValidationData.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\b\b\u0004\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000b\u001a\u00028\u0004HÆ\u0003¢\u0006\u0002\u0010\tJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00040\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u0004HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0005\u001a\u00028\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/validation/ValidationData$ValidationResult$Success;", "InputT", "", "Lcom/robinhood/android/lib/trade/validation/ValidationData$ValidationResult;", "", "validatedInput", "<init>", "(Ljava/lang/Object;)V", "getValidatedInput", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/robinhood/android/lib/trade/validation/ValidationData$ValidationResult$Success;", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success<InputT> extends ValidationResult {
            public static final int $stable = 0;
            private final InputT validatedInput;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Success copy$default(Success success, Object obj, int i, Object obj2) {
                if ((i & 1) != 0) {
                    obj = success.validatedInput;
                }
                return success.copy(obj);
            }

            public final InputT component1() {
                return this.validatedInput;
            }

            public final Success<InputT> copy(InputT validatedInput) {
                Intrinsics.checkNotNullParameter(validatedInput, "validatedInput");
                return new Success<>(validatedInput);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.validatedInput, ((Success) other).validatedInput);
            }

            public int hashCode() {
                return this.validatedInput.hashCode();
            }

            public String toString() {
                return "Success(validatedInput=" + this.validatedInput + ")";
            }

            public final InputT getValidatedInput() {
                return this.validatedInput;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(InputT validatedInput) {
                super(null);
                Intrinsics.checkNotNullParameter(validatedInput, "validatedInput");
                this.validatedInput = validatedInput;
            }
        }

        /* compiled from: ValidationData.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\b\b\u0004\u0010\u0001*\u00020\u0002*\b\b\u0005\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0004¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0006HÂ\u0003J\u000e\u0010\u0010\u001a\u00028\u0004HÂ\u0003¢\u0006\u0002\u0010\u0011J:\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00062\b\b\u0002\u0010\u0007\u001a\u00028\u0004HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00028\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/validation/ValidationData$ValidationResult$Failure;", "InputT", "", "ResolverT", "Lcom/robinhood/android/lib/trade/validation/ValidationData$ValidationResult;", "failure", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "input", "<init>", "(Lcom/robinhood/android/lib/trade/validation/Validator$Failure;Ljava/lang/Object;)V", "Ljava/lang/Object;", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "component1", "component2", "()Ljava/lang/Object;", "copy", "(Lcom/robinhood/android/lib/trade/validation/Validator$Failure;Ljava/lang/Object;)Lcom/robinhood/android/lib/trade/validation/ValidationData$ValidationResult$Failure;", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Failure<InputT, ResolverT> extends ValidationResult<InputT, ResolverT> {
            public static final int $stable = 0;
            private final Validator.Failure<InputT, ResolverT> failure;
            private final InputT input;

            private final Validator.Failure<InputT, ResolverT> component1() {
                return this.failure;
            }

            private final InputT component2() {
                return this.input;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Failure copy$default(Failure failure, Validator.Failure failure2, Object obj, int i, Object obj2) {
                if ((i & 1) != 0) {
                    failure2 = failure.failure;
                }
                if ((i & 2) != 0) {
                    obj = failure.input;
                }
                return failure.copy(failure2, obj);
            }

            public final Failure<InputT, ResolverT> copy(Validator.Failure<? super InputT, ? super ResolverT> failure, InputT input) {
                Intrinsics.checkNotNullParameter(failure, "failure");
                Intrinsics.checkNotNullParameter(input, "input");
                return new Failure<>(failure, input);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Failure)) {
                    return false;
                }
                Failure failure = (Failure) other;
                return Intrinsics.areEqual(this.failure, failure.failure) && Intrinsics.areEqual(this.input, failure.input);
            }

            public int hashCode() {
                return (this.failure.hashCode() * 31) + this.input.hashCode();
            }

            public String toString() {
                return "Failure(failure=" + this.failure + ", input=" + this.input + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Failure(Validator.Failure<? super InputT, ? super ResolverT> failure, InputT input) {
                super(null);
                Intrinsics.checkNotNullParameter(failure, "failure");
                Intrinsics.checkNotNullParameter(input, "input");
                this.failure = failure;
                this.input = input;
            }

            public final void showAlert(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.failure.showAlert(activity, this.input);
            }
        }
    }
}

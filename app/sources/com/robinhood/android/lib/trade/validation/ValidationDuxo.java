package com.robinhood.android.lib.trade.validation;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.lib.trade.validation.ValidationViewState;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import defpackage.C0007xc1408999;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.ObservablesKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ValidationDuxo.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0002*\u0014\b\u0002\u0010\u0004*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00052\b\u0012\u0004\u0012\u0002H\u00040\u0006B#\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\t\u001a\u00028\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0014J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019J\u001c\u0010\u001a\u001a\u00020\u00142\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001cH\u0002J\u0014\u0010\u001d\u001a\u00020\u00142\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J(\u0010\u001f\u001a\u00020\u00142\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000!R,\u0010\f\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\rX\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\u000e\u001a(\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011 \u0012*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0018\u00010\u00100\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/lib/trade/validation/ValidationDuxo;", "InputT", "", "ResolverT", "StateT", "Lcom/robinhood/android/lib/trade/validation/ValidationViewState;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "validator", "Lcom/robinhood/android/lib/trade/validation/Validator;", "initialState", "<init>", "(Lcom/robinhood/android/lib/trade/validation/Validator;Lcom/robinhood/android/lib/trade/validation/ValidationViewState;)V", "transformer", "Lcom/robinhood/android/lib/trade/validation/ValidationStateTransformer;", "retryWhenRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/lib/trade/validation/Validator$Action$RetryWhen;", "kotlin.jvm.PlatformType", "onStart", "", "validate", "abortValidation", "onPreValidate", "input", "(Ljava/lang/Object;)V", "skipFailureAndRetryValidation", "failure", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "setRetryWhen", "retryWhen", "onDialogAction", "action", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public abstract class ValidationDuxo<InputT, ResolverT, StateT extends ValidationViewState<InputT, ResolverT>> extends OldBaseDuxo<StateT> {
    public static final int $stable = 8;
    private final BehaviorRelay<Optional<Validator.Action.RetryWhen<InputT>>> retryWhenRelay;
    private final ValidationStateTransformer<InputT, ResolverT, ValidationViewState<InputT, ResolverT>> transformer;

    public void onPreValidate(InputT input) {
        Intrinsics.checkNotNullParameter(input, "input");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidationDuxo(Validator<? super InputT, ? super ResolverT> validator, StateT initialState) {
        super(initialState, null, 2, null);
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.transformer = new ValidationStateTransformer<>(validator);
        BehaviorRelay<Optional<Validator.Action.RetryWhen<InputT>>> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.retryWhenRelay = behaviorRelayCreate;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        Observable observableFilter = ObservablesKt.withLatestFrom(this.retryWhenRelay, getStates()).map(new Function() { // from class: com.robinhood.android.lib.trade.validation.ValidationDuxo.onStart.1
            /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
            @Override // io.reactivex.functions.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Boolean apply(Tuples2<? extends Optional<? extends Validator.Action.RetryWhen<? super InputT>>, ? extends StateT> tuples2) {
                boolean zBooleanValue;
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                Optional<? extends Validator.Action.RetryWhen<? super InputT>> optionalComponent1 = tuples2.component1();
                StateT statetComponent2 = tuples2.component2();
                Validator.Action.RetryWhen<? super InputT> orNull = optionalComponent1.getOrNull();
                if (orNull == null) {
                    zBooleanValue = false;
                } else {
                    C0007xc1408999 c0007xc1408999 = (Object) statetComponent2.getValidationInput();
                    Boolean boolValueOf = c0007xc1408999 != null ? Boolean.valueOf(orNull.matches(c0007xc1408999)) : null;
                    if (boolValueOf != null) {
                        zBooleanValue = boolValueOf.booleanValue();
                    }
                }
                return Boolean.valueOf(zBooleanValue);
            }
        }).distinctUntilChanged().filter(new Predicate() { // from class: com.robinhood.android.lib.trade.validation.ValidationDuxo.onStart.2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Boolean shouldRetryValidation) {
                Intrinsics.checkNotNullParameter(shouldRetryValidation, "shouldRetryValidation");
                return shouldRetryValidation.booleanValue();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFilter, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lib.trade.validation.ValidationDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ValidationDuxo.onStart$lambda$0(this.f$0, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(ValidationDuxo validationDuxo, Boolean bool) {
        validationDuxo.validate();
        return Unit.INSTANCE;
    }

    public final void validate() {
        this.retryWhenRelay.accept(Optional2.INSTANCE);
        applyMutation(new Function1() { // from class: com.robinhood.android.lib.trade.validation.ValidationDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ValidationDuxo.validate$lambda$1(this.f$0, (ValidationViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ValidationViewState validate$lambda$1(ValidationDuxo validationDuxo, ValidationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Object validationInput = applyMutation.getValidationInput();
        if (validationInput != null) {
            validationDuxo.onPreValidate(validationInput);
        }
        ValidationViewState validationViewStateResetAndValidate = validationDuxo.transformer.resetAndValidate(applyMutation);
        Intrinsics.checkNotNull(validationViewStateResetAndValidate, "null cannot be cast to non-null type StateT of com.robinhood.android.lib.trade.validation.ValidationDuxo");
        return validationViewStateResetAndValidate;
    }

    public final void abortValidation() {
        applyMutation(new Function1() { // from class: com.robinhood.android.lib.trade.validation.ValidationDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ValidationDuxo.abortValidation$lambda$2(this.f$0, (ValidationViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ValidationViewState abortValidation$lambda$2(ValidationDuxo validationDuxo, ValidationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        ValidationViewState validationViewStateAbortValidation = validationDuxo.transformer.abortValidation(applyMutation);
        Intrinsics.checkNotNull(validationViewStateAbortValidation, "null cannot be cast to non-null type StateT of com.robinhood.android.lib.trade.validation.ValidationDuxo");
        return validationViewStateAbortValidation;
    }

    private final void skipFailureAndRetryValidation(final Validator.Failure<? super InputT, ? super ResolverT> failure) {
        applyMutation(new Function1() { // from class: com.robinhood.android.lib.trade.validation.ValidationDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ValidationDuxo.skipFailureAndRetryValidation$lambda$3(this.f$0, failure, (ValidationViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ValidationViewState skipFailureAndRetryValidation$lambda$3(ValidationDuxo validationDuxo, Validator.Failure failure, ValidationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        ValidationViewState validationViewStateSkipFailureAndValidate = validationDuxo.transformer.skipFailureAndValidate(applyMutation, failure);
        Intrinsics.checkNotNull(validationViewStateSkipFailureAndValidate, "null cannot be cast to non-null type StateT of com.robinhood.android.lib.trade.validation.ValidationDuxo");
        return validationViewStateSkipFailureAndValidate;
    }

    public final void setRetryWhen(Validator.Action.RetryWhen<? super InputT> retryWhen) {
        Intrinsics.checkNotNullParameter(retryWhen, "retryWhen");
        this.retryWhenRelay.accept(Optional3.asOptional(retryWhen));
    }

    public final void onDialogAction(Validator.Failure<? super InputT, ? super ResolverT> failure, Validator.Action<? super InputT> action) {
        Intrinsics.checkNotNullParameter(failure, "failure");
        Intrinsics.checkNotNullParameter(action, "action");
        if (Intrinsics.areEqual(action, Validator.Action.Abort.INSTANCE)) {
            abortValidation();
        } else if (Intrinsics.areEqual(action, Validator.Action.Skip.INSTANCE)) {
            skipFailureAndRetryValidation(failure);
        } else {
            if (!(action instanceof Validator.Action.RetryWhen)) {
                throw new NoWhenBranchMatchedException();
            }
            setRetryWhen((Validator.Action.RetryWhen) action);
        }
    }
}

package com.robinhood.android.equity.validation;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.equity.ordercheck.EquityOrderCheckValidator;
import com.robinhood.android.equity.ordercheck.OrderCheckFailure;
import com.robinhood.android.equity.ordercheck.ValidationState;
import com.robinhood.android.equity.validation.event.EquityOrderEvent;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.DirectOrderRequestDraft;
import com.robinhood.models.p320db.EquityOrderChecksAlert;
import com.robinhood.models.p320db.SilentEquityOrderChecksAlert;
import com.robinhood.models.p320db.VisibleEquityOrderChecksAlert;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.extensions.Throwables;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ValidateAndReviewEquityOrder.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001az\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0018\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0013¨\u0006\u0014"}, m3636d2 = {"validateAndReviewEquityOrder", "", "Lcom/robinhood/android/udf/BaseEventDuxo;", "retryWhenRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/lib/trade/validation/Validator$Action$RetryWhen;", "Lcom/robinhood/android/equity/validation/EquityOrderContext;", "equityOrderContext", "source", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "equityOrderCheckValidator", "Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator;", "updateValidationState", "Lkotlin/Function1;", "Lcom/robinhood/android/equity/ordercheck/ValidationState;", "handleEvent", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$OrderCheckEvent;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "lib-equity-validation_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equity.validation.ValidateAndReviewEquityOrderKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ValidateAndReviewEquityOrder {
    public static final void validateAndReviewEquityOrder(BaseDuxo3<?, ?, ?> baseDuxo3, BehaviorRelay<Optional<Validator.Action.RetryWhen<EquityOrderContext>>> retryWhenRelay, EquityOrderContext equityOrderContext, EquityOrderFlowSource source, EquityOrderCheckValidator equityOrderCheckValidator, Function1<? super ValidationState, Unit> updateValidationState, Function1<? super EquityOrderEvent.OrderCheckEvent, Unit> handleEvent, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(baseDuxo3, "<this>");
        Intrinsics.checkNotNullParameter(retryWhenRelay, "retryWhenRelay");
        Intrinsics.checkNotNullParameter(equityOrderContext, "equityOrderContext");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(equityOrderCheckValidator, "equityOrderCheckValidator");
        Intrinsics.checkNotNullParameter(updateValidationState, "updateValidationState");
        Intrinsics.checkNotNullParameter(handleEvent, "handleEvent");
        Intrinsics.checkNotNullParameter(scope, "scope");
        retryWhenRelay.accept(Optional2.INSTANCE);
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new C151411(updateValidationState, equityOrderCheckValidator, equityOrderContext, source, handleEvent, null), 3, null);
    }

    /* compiled from: ValidateAndReviewEquityOrder.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equity.validation.ValidateAndReviewEquityOrderKt$validateAndReviewEquityOrder$1", m3645f = "ValidateAndReviewEquityOrder.kt", m3646l = {32}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equity.validation.ValidateAndReviewEquityOrderKt$validateAndReviewEquityOrder$1 */
    static final class C151411 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ EquityOrderCheckValidator $equityOrderCheckValidator;
        final /* synthetic */ EquityOrderContext $equityOrderContext;
        final /* synthetic */ Function1<EquityOrderEvent.OrderCheckEvent, Unit> $handleEvent;
        final /* synthetic */ EquityOrderFlowSource $source;
        final /* synthetic */ Function1<ValidationState, Unit> $updateValidationState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C151411(Function1<? super ValidationState, Unit> function1, EquityOrderCheckValidator equityOrderCheckValidator, EquityOrderContext equityOrderContext, EquityOrderFlowSource equityOrderFlowSource, Function1<? super EquityOrderEvent.OrderCheckEvent, Unit> function12, Continuation<? super C151411> continuation) {
            super(2, continuation);
            this.$updateValidationState = function1;
            this.$equityOrderCheckValidator = equityOrderCheckValidator;
            this.$equityOrderContext = equityOrderContext;
            this.$source = equityOrderFlowSource;
            this.$handleEvent = function12;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C151411(this.$updateValidationState, this.$equityOrderCheckValidator, this.$equityOrderContext, this.$source, this.$handleEvent, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C151411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM13720validateOrderBWLJW6A;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.$updateValidationState.invoke(ValidationState.Validating.INSTANCE);
                EquityOrderCheckValidator equityOrderCheckValidator = this.$equityOrderCheckValidator;
                DirectOrderRequestDraft orderRequestDraft = this.$equityOrderContext.getOrderRequestDraft();
                BrokerageAccountType brokerageAccountType = this.$equityOrderContext.getBrokerageAccountType();
                EquityOrderFlowSource equityOrderFlowSource = this.$source;
                this.label = 1;
                objM13720validateOrderBWLJW6A = equityOrderCheckValidator.m13720validateOrderBWLJW6A(orderRequestDraft, brokerageAccountType, equityOrderFlowSource, this);
                if (objM13720validateOrderBWLJW6A == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM13720validateOrderBWLJW6A = ((Result) obj).getValue();
            }
            Function1<ValidationState, Unit> function1 = this.$updateValidationState;
            Function1<EquityOrderEvent.OrderCheckEvent, Unit> function12 = this.$handleEvent;
            EquityOrderContext equityOrderContext = this.$equityOrderContext;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM13720validateOrderBWLJW6A);
            if (thM28553exceptionOrNullimpl == null) {
                EquityOrderChecksAlert equityOrderChecksAlert = (EquityOrderChecksAlert) objM13720validateOrderBWLJW6A;
                if (equityOrderChecksAlert == null) {
                    function1.invoke(ValidationState.Validated.INSTANCE);
                } else {
                    function12.invoke(new EquityOrderEvent.OrderCheckEvent(new OrderCheckFailure(equityOrderChecksAlert instanceof VisibleEquityOrderChecksAlert ? (VisibleEquityOrderChecksAlert) equityOrderChecksAlert : null, equityOrderChecksAlert instanceof SilentEquityOrderChecksAlert ? (SilentEquityOrderChecksAlert) equityOrderChecksAlert : null), null, equityOrderContext.getOrderRequestDraft().getAccountNumber(), equityOrderContext));
                    function1.invoke(ValidationState.Initial.INSTANCE);
                }
            } else if (Throwables.isNetworkRelated(thM28553exceptionOrNullimpl)) {
                function1.invoke(ValidationState.Validated.INSTANCE);
            } else {
                function1.invoke(ValidationState.ValidationError.INSTANCE);
                function1.invoke(ValidationState.Initial.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }
}

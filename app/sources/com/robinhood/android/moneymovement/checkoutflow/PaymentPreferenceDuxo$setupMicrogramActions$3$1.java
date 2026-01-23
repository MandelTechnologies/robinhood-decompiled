package com.robinhood.android.moneymovement.checkoutflow;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: PaymentPreferenceDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$setupMicrogramActions$3$1", m3645f = "PaymentPreferenceDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PaymentPreferenceDuxo$setupMicrogramActions$3$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PaymentPreferenceDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentPreferenceDuxo$setupMicrogramActions$3$1(PaymentPreferenceDuxo paymentPreferenceDuxo, Continuation<? super PaymentPreferenceDuxo$setupMicrogramActions$3$1> continuation) {
        super(2, continuation);
        this.this$0 = paymentPreferenceDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentPreferenceDuxo$setupMicrogramActions$3$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PaymentPreferenceDuxo$setupMicrogramActions$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(300L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.applyMutation(new C221941(null));
        return Unit.INSTANCE;
    }

    /* compiled from: PaymentPreferenceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$setupMicrogramActions$3$1$1", m3645f = "PaymentPreferenceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$setupMicrogramActions$3$1$1 */
    static final class C221941 extends ContinuationImpl7 implements Function2<PaymentPreferenceDataState, Continuation<? super PaymentPreferenceDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C221941(Continuation<? super C221941> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C221941 c221941 = new C221941(continuation);
            c221941.L$0 = obj;
            return c221941;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaymentPreferenceDataState paymentPreferenceDataState, Continuation<? super PaymentPreferenceDataState> continuation) {
            return ((C221941) create(paymentPreferenceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PaymentPreferenceDataState.copy$default((PaymentPreferenceDataState) this.L$0, false, null, false, null, null, false, 0, null, null, null, null, null, 4063, null);
        }
    }
}

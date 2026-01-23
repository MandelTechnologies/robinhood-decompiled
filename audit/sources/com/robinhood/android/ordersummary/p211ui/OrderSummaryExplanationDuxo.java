package com.robinhood.android.ordersummary.p211ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.OrderSummaryExplanationArgs;
import com.robinhood.librobinhood.data.store.bonfire.OrderSummaryExplanationStore;
import com.robinhood.ordersummary.models.api.ApiOrderSummaryExplanation;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OrderSummaryExplanationDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/ordersummary/ui/OrderSummaryExplanationDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/ordersummary/ui/OrderSummaryExplanationViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "orderSummaryExplanationStore", "Lcom/robinhood/librobinhood/data/store/bonfire/OrderSummaryExplanationStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/OrderSummaryExplanationStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-lib-order-summary_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OrderSummaryExplanationDuxo extends OldBaseDuxo<OrderSummaryExplanationViewState> implements HasSavedState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final OrderSummaryExplanationStore orderSummaryExplanationStore;
    private final SavedStateHandle savedStateHandle;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OrderSummaryExplanationDuxo(OrderSummaryExplanationStore orderSummaryExplanationStore, SavedStateHandle savedStateHandle) {
        super(new OrderSummaryExplanationViewState(null, 1, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(orderSummaryExplanationStore, "orderSummaryExplanationStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.orderSummaryExplanationStore = orderSummaryExplanationStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C252451(null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.ordersummary.ui.OrderSummaryExplanationDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderSummaryExplanationDuxo.onStart$lambda$1(this.f$0, (Optional) obj);
            }
        });
    }

    /* compiled from: OrderSummaryExplanationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/ordersummary/models/api/ApiOrderSummaryExplanation;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.ordersummary.ui.OrderSummaryExplanationDuxo$onStart$1", m3645f = "OrderSummaryExplanationDuxo.kt", m3646l = {26}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.ordersummary.ui.OrderSummaryExplanationDuxo$onStart$1 */
    static final class C252451 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends ApiOrderSummaryExplanation>>, Object> {
        Object L$0;
        int label;

        C252451(Continuation<? super C252451> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrderSummaryExplanationDuxo.this.new C252451(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends ApiOrderSummaryExplanation>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Optional<ApiOrderSummaryExplanation>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<ApiOrderSummaryExplanation>> continuation) {
            return ((C252451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Optional.Companion companion;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Optional.Companion companion2 = Optional.INSTANCE;
                Endpoint<OrderSummaryExplanationArgs, ApiOrderSummaryExplanation> endpoint = OrderSummaryExplanationDuxo.this.orderSummaryExplanationStore.getEndpoint();
                Companion companion3 = OrderSummaryExplanationDuxo.INSTANCE;
                OrderSummaryExplanationArgs orderSummaryExplanationArgs = new OrderSummaryExplanationArgs(((LegacyFragmentKey.OrderSummaryExplanation) companion3.getArgs((HasSavedState) OrderSummaryExplanationDuxo.this)).getInstrumentIds(), ((LegacyFragmentKey.OrderSummaryExplanation) companion3.getArgs((HasSavedState) OrderSummaryExplanationDuxo.this)).getIsPresetPercentLimitOrder(), ((LegacyFragmentKey.OrderSummaryExplanation) companion3.getArgs((HasSavedState) OrderSummaryExplanationDuxo.this)).getPresetPercentLimit());
                this.L$0 = companion2;
                this.label = 1;
                Object objFetch$default = Endpoint.DefaultImpls.fetch$default(endpoint, orderSummaryExplanationArgs, null, this, 2, null);
                if (objFetch$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                companion = companion2;
                obj = objFetch$default;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                companion = (Optional.Companion) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return companion.m2972of(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(OrderSummaryExplanationDuxo orderSummaryExplanationDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        final ApiOrderSummaryExplanation apiOrderSummaryExplanation = (ApiOrderSummaryExplanation) optional.component1();
        orderSummaryExplanationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.ordersummary.ui.OrderSummaryExplanationDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderSummaryExplanationDuxo.onStart$lambda$1$lambda$0(apiOrderSummaryExplanation, (OrderSummaryExplanationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderSummaryExplanationViewState onStart$lambda$1$lambda$0(ApiOrderSummaryExplanation apiOrderSummaryExplanation, OrderSummaryExplanationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(apiOrderSummaryExplanation);
    }

    /* compiled from: OrderSummaryExplanationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/ordersummary/ui/OrderSummaryExplanationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/ordersummary/ui/OrderSummaryExplanationDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$OrderSummaryExplanation;", "<init>", "()V", "feature-lib-order-summary_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OrderSummaryExplanationDuxo, LegacyFragmentKey.OrderSummaryExplanation> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.OrderSummaryExplanation getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.OrderSummaryExplanation) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.OrderSummaryExplanation getArgs(OrderSummaryExplanationDuxo orderSummaryExplanationDuxo) {
            return (LegacyFragmentKey.OrderSummaryExplanation) DuxoCompanion.DefaultImpls.getArgs(this, orderSummaryExplanationDuxo);
        }
    }
}

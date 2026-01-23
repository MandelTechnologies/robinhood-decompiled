package com.stripe.android.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycle;
import com.plaid.internal.EnumC7081g;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.CardBrand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: CardWidgetViewModel.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m3636d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, m3637k = 3, m3638mv = {1, 9, 0})
@DebugMetadata(m3644c = "com.stripe.android.view.CardNumberEditText$onAttachedToWindow$2$invoke$$inlined$launchAndCollect$default$1", m3645f = "CardNumberEditText.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.stripe.android.view.CardNumberEditText$onAttachedToWindow$2$invoke$$inlined$launchAndCollect$default$1, reason: use source file name */
/* loaded from: classes26.dex */
public final class CardWidgetViewModel4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LifecycleOwner $$context_receiver_0;
    final /* synthetic */ Lifecycle.State $minActiveState;
    final /* synthetic */ Flow $this_launchAndCollect;
    int label;
    final /* synthetic */ CardNumberEditText this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardWidgetViewModel4(LifecycleOwner lifecycleOwner, Lifecycle.State state, Flow flow, Continuation continuation, CardNumberEditText cardNumberEditText) {
        super(2, continuation);
        this.$minActiveState = state;
        this.$this_launchAndCollect = flow;
        this.this$0 = cardNumberEditText;
        this.$$context_receiver_0 = lifecycleOwner;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CardWidgetViewModel4(this.$$context_receiver_0, this.$minActiveState, this.$this_launchAndCollect, continuation, this.this$0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CardWidgetViewModel4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: CardWidgetViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m3636d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, m3637k = 3, m3638mv = {1, 9, 0})
    @DebugMetadata(m3644c = "com.stripe.android.view.CardNumberEditText$onAttachedToWindow$2$invoke$$inlined$launchAndCollect$default$1$1", m3645f = "CardNumberEditText.kt", m3646l = {125}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.stripe.android.view.CardNumberEditText$onAttachedToWindow$2$invoke$$inlined$launchAndCollect$default$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow $this_launchAndCollect;
        int label;
        final /* synthetic */ CardNumberEditText this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Flow flow, Continuation continuation, CardNumberEditText cardNumberEditText) {
            super(2, continuation);
            this.$this_launchAndCollect = flow;
            this.this$0 = cardNumberEditText;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$this_launchAndCollect, continuation, this.this$0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flow = this.$this_launchAndCollect;
                final CardNumberEditText cardNumberEditText = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.stripe.android.view.CardNumberEditText$onAttachedToWindow$2$invoke$.inlined.launchAndCollect.default.1.1.1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(T t, Continuation<? super Unit> continuation) {
                        boolean zBooleanValue = ((Boolean) t).booleanValue();
                        cardNumberEditText.isCbcEligible = zBooleanValue;
                        List<AccountRange> accountRanges = cardNumberEditText.getAccountRangeService().getAccountRanges();
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(accountRanges, 10));
                        Iterator<T> it = accountRanges.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((AccountRange) it.next()).getBrand());
                        }
                        List<? extends CardBrand> listDistinct = CollectionsKt.distinct(arrayList);
                        if (zBooleanValue) {
                            CardNumberEditText cardNumberEditText2 = cardNumberEditText;
                            CardBrand cardBrand = (CardBrand) CollectionsKt.firstOrNull((List) listDistinct);
                            if (cardBrand == null) {
                                cardBrand = CardBrand.Unknown;
                            }
                            cardNumberEditText2.setImplicitCardBrandForCbc$payments_core_release(cardBrand);
                            cardNumberEditText.setPossibleCardBrands$payments_core_release(listDistinct);
                        } else {
                            CardNumberEditText cardNumberEditText3 = cardNumberEditText;
                            CardBrand cardBrand2 = (CardBrand) CollectionsKt.singleOrNull((List) listDistinct);
                            if (cardBrand2 == null) {
                                cardBrand2 = CardBrand.Unknown;
                            }
                            cardNumberEditText3.setCardBrand$payments_core_release(cardBrand2);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LifecycleOwner lifecycleOwner = this.$$context_receiver_0;
            Lifecycle.State state = this.$minActiveState;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_launchAndCollect, null, this.this$0);
            this.label = 1;
            if (RepeatOnLifecycle.repeatOnLifecycle(lifecycleOwner, state, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}

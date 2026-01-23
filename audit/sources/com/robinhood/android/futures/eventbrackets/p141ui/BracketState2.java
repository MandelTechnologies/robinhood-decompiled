package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.pager.PagerState;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: BracketState.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.ui.BracketState$SubscribeToLocationRequest$1$1", m3645f = "BracketState.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketState$SubscribeToLocationRequest$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class BracketState2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BracketState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BracketState2(BracketState bracketState, Continuation<? super BracketState2> continuation) {
        super(2, continuation);
        this.this$0 = bracketState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BracketState2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BracketState2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.navigationState.streamLocationChangeRequests());
            final BracketState bracketState = this.this$0;
            Flow<Tuples2<? extends Integer, ? extends Integer>> flow = new Flow<Tuples2<? extends Integer, ? extends Integer>>() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketState$SubscribeToLocationRequest$1$1$invokeSuspend$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Tuples2<? extends Integer, ? extends Integer>> flowCollector, Continuation continuation) {
                    Object objCollect = flowFilterNotNull.collect(new AnonymousClass2(flowCollector, bracketState), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketState$SubscribeToLocationRequest$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ BracketState this$0;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.ui.BracketState$SubscribeToLocationRequest$1$1$invokeSuspend$$inlined$map$1$2", m3645f = "BracketState.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketState$SubscribeToLocationRequest$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, BracketState bracketState) {
                        this.$this_unsafeFlow = flowCollector;
                        this.this$0 = bracketState;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Tuples2 tuples2 = (Tuples2) obj;
                            int iIntValue = ((Number) tuples2.component1()).intValue();
                            float fFloatValue = ((Number) tuples2.component2()).floatValue();
                            int iCalculateRoundHeightPx = this.this$0.getCallbacks().calculateRoundHeightPx(iIntValue);
                            Tuples2 tuples2M3642to = Tuples4.m3642to(boxing.boxInt(iIntValue), boxing.boxInt(RangesKt.coerceAtMost(MathKt.roundToInt(fFloatValue * iCalculateRoundHeightPx), this.this$0.getMaxHeight() >= iCalculateRoundHeightPx ? 0 : iCalculateRoundHeightPx - this.this$0.getMaxHeight())));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
            };
            C172172 c172172 = new C172172(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flow, c172172, this) == coroutine_suspended) {
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

    /* compiled from: BracketState.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.ui.BracketState$SubscribeToLocationRequest$1$1$2", m3645f = "BracketState.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketState$SubscribeToLocationRequest$1$1$2 */
    static final class C172172 extends ContinuationImpl7 implements Function2<Tuples2<? extends Integer, ? extends Integer>, Continuation<? super Unit>, Object> {
        int I$0;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BracketState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C172172(BracketState bracketState, Continuation<? super C172172> continuation) {
            super(2, continuation);
            this.this$0 = bracketState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C172172 c172172 = new C172172(this.this$0, continuation);
            c172172.L$0 = obj;
            return c172172;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Integer, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
            return invoke2((Tuples2<Integer, Integer>) tuples2, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Tuples2<Integer, Integer> tuples2, Continuation<? super Unit> continuation) {
            return ((C172172) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
        
            if (androidx.compose.foundation.ScrollState.animateScrollTo$default(r3, r4, null, r6, 2, null) == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int iIntValue;
            C172172 c172172;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Tuples2 tuples2 = (Tuples2) this.L$0;
                int iIntValue2 = ((Number) tuples2.component1()).intValue();
                iIntValue = ((Number) tuples2.component2()).intValue();
                PagerState horizontalPagerState = this.this$0.getHorizontalPagerState();
                this.I$0 = iIntValue;
                this.label = 1;
                c172172 = this;
                if (PagerState.animateScrollToPage$default(horizontalPagerState, iIntValue2, 0.0f, null, this, 6, null) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c172172 = this;
                c172172.this$0.navigationState.onNewLocationMoved();
                return Unit.INSTANCE;
            }
            iIntValue = this.I$0;
            ResultKt.throwOnFailure(obj);
            c172172 = this;
            int i2 = iIntValue;
            ScrollState verticalScrollState = c172172.this$0.getVerticalScrollState();
            c172172.label = 2;
        }
    }
}

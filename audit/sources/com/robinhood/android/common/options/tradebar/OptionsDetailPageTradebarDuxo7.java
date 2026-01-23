package com.robinhood.android.common.options.tradebar;

import com.robinhood.android.common.options.utils.PairUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: OptionsDetailPageTradebarDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aN\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0006\"\b\b\u0001\u0010\u0003*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00050\u00012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u0002H\u0005\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\bH\u0002¨\u0006\t"}, m3636d2 = {"mapNotNullToTradebarIndex", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Pair;", "P", "", "T", "", "transform", "Lkotlin/Function1;", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxoKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class OptionsDetailPageTradebarDuxo7 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, P> Flow<Tuples2<P, Integer>> mapNotNullToTradebarIndex(final Flow<? extends T> flow, final Function1<? super T, ? extends P> function1) {
        return new Flow<Tuples2<? extends P, ? extends Integer>>() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxoKt$mapNotNullToTradebarIndex$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, function1), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxoKt$mapNotNullToTradebarIndex$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ Function1 $transform$inlined$1;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxoKt$mapNotNullToTradebarIndex$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxoKt$mapNotNullToTradebarIndex$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, Function1 function1) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$transform$inlined$1 = function1;
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
                        Tuples2 nullable = PairUtils.toNullable(Tuples4.m3642to(this.$transform$inlined$1.invoke(obj), boxing.boxInt(0)));
                        if (nullable != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(nullable, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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
    }
}

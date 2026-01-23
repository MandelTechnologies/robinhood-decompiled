package com.stripe.android.uicore.utils;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: StateFlows.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001aw\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00030\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"T1", "T2", "T3", "R", "Lkotlinx/coroutines/flow/StateFlow;", "flow1", "flow2", "flow3", "Lkotlin/Function3;", "transform", "combineAsStateFlow", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/StateFlow;", "T", "value", "stateFlowOf", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;", "stripe-ui-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.stripe.android.uicore.utils.StateFlowsKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class StateFlows2 {

    /* JADX INFO: Add missing generic type declarations: [R, T1, T2, T3] */
    /* compiled from: StateFlows.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.stripe.android.uicore.utils.StateFlowsKt$combineAsStateFlow$3 */
    /* synthetic */ class C426403<R, T1, T2, T3> extends FunctionReferenceImpl implements Function4<T1, T2, T3, Continuation<? super R>, Object>, ContinuationImpl6 {
        C426403(Object obj) {
            super(4, obj, Intrinsics.Kotlin.class, "suspendConversion0", "combineAsStateFlow$suspendConversion0$2(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((C426403<R, T1, T2, T3>) obj, obj2, obj3, (Continuation) obj4);
        }

        public final Object invoke(T1 t1, T2 t2, T3 t3, Continuation<? super R> continuation) {
            return StateFlows2.combineAsStateFlow$suspendConversion0$2((Function3) this.receiver, t1, t2, t3, continuation);
        }
    }

    public static final <T1, T2, T3, R> StateFlow<R> combineAsStateFlow(final StateFlow<? extends T1> flow1, final StateFlow<? extends T2> flow2, final StateFlow<? extends T3> flow3, final Function3<? super T1, ? super T2, ? super T3, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(flow1, "flow1");
        Intrinsics.checkNotNullParameter(flow2, "flow2");
        Intrinsics.checkNotNullParameter(flow3, "flow3");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new StateFlows(FlowKt.combine(flow1, flow2, flow3, new C426403(transform)), new Function0<R>() { // from class: com.stripe.android.uicore.utils.StateFlowsKt.combineAsStateFlow.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final R invoke() {
                return transform.invoke(flow1.getValue(), flow2.getValue(), flow3.getValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object combineAsStateFlow$suspendConversion0$2(Function3 function3, Object obj, Object obj2, Object obj3, Continuation continuation) {
        return function3.invoke(obj, obj2, obj3);
    }

    public static final <T> StateFlow<T> stateFlowOf(T t) {
        return FlowKt.asStateFlow(StateFlow4.MutableStateFlow(t));
    }
}

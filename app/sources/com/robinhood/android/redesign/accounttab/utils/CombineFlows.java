package com.robinhood.android.redesign.accounttab.utils;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.Combine;

/* compiled from: CombineFlows.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001aí\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\u0006\"\u0004\b\u0004\u0010\u0007\"\u0004\b\u0005\u0010\b\"\u0004\b\u0006\u0010\t\"\u0004\b\u0007\u0010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\b0\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\t0\u00012F\u0010\u0011\u001aB\b\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012H\u0000¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"combineFlows", "Lkotlinx/coroutines/flow/Flow;", "R", "T1", "T2", "T3", "T4", "T5", "T6", "T7", "flow", "flow2", "flow3", "flow4", "flow5", "flow6", "flow7", "transform", "Lkotlin/Function8;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function8;)Lkotlinx/coroutines/flow/Flow;", "lib-account-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesign.accounttab.utils.CombineFlowsKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class CombineFlows {
    public static final <T1, T2, T3, T4, T5, T6, T7, R> Flow<R> combineFlows(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, Flow<? extends T6> flow6, Flow<? extends T7> flow7, final Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super Continuation<? super R>, ? extends Object> transform) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(flow2, "flow2");
        Intrinsics.checkNotNullParameter(flow3, "flow3");
        Intrinsics.checkNotNullParameter(flow4, "flow4");
        Intrinsics.checkNotNullParameter(flow5, "flow5");
        Intrinsics.checkNotNullParameter(flow6, "flow6");
        Intrinsics.checkNotNullParameter(flow7, "flow7");
        Intrinsics.checkNotNullParameter(transform, "transform");
        final Flow[] flowArr = (Flow[]) CollectionsKt.toList(CollectionsKt.listOf((Object[]) new Flow[]{flow, flow2, flow3, flow4, flow5, flow6, flow7})).toArray(new Flow[0]);
        return new Flow<R>() { // from class: com.robinhood.android.redesign.accounttab.utils.CombineFlowsKt$combineFlows$$inlined$combine$1

            /* compiled from: Zip.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
            @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.utils.CombineFlowsKt$combineFlows$$inlined$combine$1$3", m3645f = "CombineFlows.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE, 288}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.redesign.accounttab.utils.CombineFlowsKt$combineFlows$$inlined$combine$1$3 */
            public static final class C263903 extends ContinuationImpl7 implements Function3<FlowCollector<? super R>, Object[], Continuation<? super Unit>, Object> {
                final /* synthetic */ Function8 $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C263903(Continuation continuation, Function8 function8) {
                    super(3, continuation);
                    this.$transform$inlined = function8;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(FlowCollector<? super R> flowCollector, Object[] objArr, Continuation<? super Unit> continuation) {
                    C263903 c263903 = new C263903(continuation, this.$transform$inlined);
                    c263903.L$0 = flowCollector;
                    c263903.L$1 = objArr;
                    return c263903.invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
                
                    if (r1.emit(r14, r13) == r0) goto L15;
                 */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    FlowCollector flowCollector;
                    C263903 c263903;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        flowCollector = (FlowCollector) this.L$0;
                        Object[] objArr = (Object[]) this.L$1;
                        Function8 function8 = this.$transform$inlined;
                        Object obj2 = objArr[0];
                        Object obj3 = objArr[1];
                        Object obj4 = objArr[2];
                        Object obj5 = objArr[3];
                        Object obj6 = objArr[4];
                        Object obj7 = objArr[5];
                        Object obj8 = objArr[6];
                        this.L$0 = flowCollector;
                        this.label = 1;
                        InlineMarker.mark(6);
                        c263903 = this;
                        obj = function8.invoke(obj2, obj3, obj4, obj5, obj6, obj7, obj8, c263903);
                        InlineMarker.mark(7);
                        if (obj != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    flowCollector = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    c263903 = this;
                    c263903.L$0 = null;
                    c263903.label = 2;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                final Flow[] flowArr2 = flowArr;
                Object objCombineInternal = Combine.combineInternal(flowCollector, flowArr2, new Function0<Object[]>() { // from class: com.robinhood.android.redesign.accounttab.utils.CombineFlowsKt$combineFlows$$inlined$combine$1.2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object[] invoke() {
                        return new Object[flowArr2.length];
                    }
                }, new C263903(null, transform), continuation);
                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
            }
        };
    }
}

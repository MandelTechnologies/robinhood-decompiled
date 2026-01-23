package com.robinhood.coroutines.flow;

import com.plaid.internal.EnumC7081g;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.Combine;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: SafeCollector.common.kt */
@Metadata(m3635d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class OperatorsKt$combineLatestToList$$inlined$combine$1<T> implements Flow<List<? extends T>> {
    final /* synthetic */ Flow[] $flowArray$inlined;

    /* compiled from: Zip.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
    @DebugMetadata(m3644c = "com.robinhood.coroutines.flow.OperatorsKt$combineLatestToList$$inlined$combine$1$3", m3645f = "Operators.kt", m3646l = {288}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.coroutines.flow.OperatorsKt$combineLatestToList$$inlined$combine$1$3 */
    public static final class C329683 extends ContinuationImpl7 implements Function3<FlowCollector<? super List<? extends T>>, T[], Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C329683(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super List<? extends T>> flowCollector, T[] tArr, Continuation<? super Unit> continuation) {
            C329683 c329683 = new C329683(continuation);
            c329683.L$0 = flowCollector;
            c329683.L$1 = tArr;
            return c329683.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                List list = ArraysKt.toList((Object[]) this.L$1);
                this.label = 1;
                if (flowCollector.emit(list, this) == coroutine_suspended) {
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

        public final Object invokeSuspend$$forInline(Object obj) {
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            List list = ArraysKt.toList((Object[]) this.L$1);
            InlineMarker.mark(0);
            flowCollector.emit(list, this);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    public OperatorsKt$combineLatestToList$$inlined$combine$1(Flow[] flowArr) {
        this.$flowArray$inlined = flowArr;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, Continuation continuation) {
        Flow[] flowArr = this.$flowArray$inlined;
        Intrinsics.needClassReification();
        C329672 c329672 = new C329672(this.$flowArray$inlined);
        Intrinsics.needClassReification();
        Object objCombineInternal = Combine.combineInternal(flowCollector, flowArr, c329672, new C329683(null), continuation);
        return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
    }

    public Object collect$$forInline(FlowCollector flowCollector, Continuation continuation) {
        InlineMarker.mark(4);
        new ContinuationImpl(continuation) { // from class: com.robinhood.coroutines.flow.OperatorsKt$combineLatestToList$$inlined$combine$1.1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return OperatorsKt$combineLatestToList$$inlined$combine$1.this.collect(null, this);
            }
        };
        InlineMarker.mark(5);
        Flow[] flowArr = this.$flowArray$inlined;
        Intrinsics.needClassReification();
        C329672 c329672 = new C329672(this.$flowArray$inlined);
        Intrinsics.needClassReification();
        C329683 c329683 = new C329683(null);
        InlineMarker.mark(0);
        Combine.combineInternal(flowCollector, flowArr, c329672, c329683, continuation);
        InlineMarker.mark(1);
        return Unit.INSTANCE;
    }

    /* compiled from: Zip.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    /* renamed from: com.robinhood.coroutines.flow.OperatorsKt$combineLatestToList$$inlined$combine$1$2 */
    public static final class C329672 implements Function0<T[]> {
        final /* synthetic */ Flow[] $flowArray;

        public C329672(Flow[] flowArr) {
            this.$flowArray = flowArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T[] invoke() {
            int length = this.$flowArray.length;
            Intrinsics.reifiedOperationMarker(0, "T?");
            return (T[]) new Object[length];
        }
    }
}

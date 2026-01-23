package com.robinhood.shared.equities.store.subzero;

import com.robinhood.shared.equities.subzero.ShortingInfo;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: ShortingInfoStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Result;", "Lcom/robinhood/shared/equities/subzero/ShortingInfo;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.equities.store.subzero.ShortingInfoStore$streamShortingInfoResult$1$2", m3645f = "ShortingInfoStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.equities.store.subzero.ShortingInfoStore$streamShortingInfoResult$1$2, reason: use source file name */
/* loaded from: classes6.dex */
final class ShortingInfoStore5 extends ContinuationImpl7 implements Function3<FlowCollector<? super Result<? extends ShortingInfo>>, Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ UUID $instrumentId;
    int label;
    final /* synthetic */ ShortingInfoStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortingInfoStore5(ShortingInfoStore shortingInfoStore, UUID uuid, Continuation<? super ShortingInfoStore5> continuation) {
        super(3, continuation);
        this.this$0 = shortingInfoStore;
        this.$instrumentId = uuid;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Result<? extends ShortingInfo>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super Result<ShortingInfo>>) flowCollector, th, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super Result<ShortingInfo>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        return new ShortingInfoStore5(this.this$0, this.$instrumentId, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.borrowFeeSharedFlows.remove(this.$instrumentId);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

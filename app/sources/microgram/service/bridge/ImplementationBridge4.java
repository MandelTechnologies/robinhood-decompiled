package microgram.service.bridge;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.json.JsonElement;
import microgram.service.protocol.ProtocolMessage3;

/* compiled from: ImplementationBridge.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/serialization/json/JsonElement;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.service.bridge.ImplementationBridge$handleCall$2$originalFlow$1", m3645f = "ImplementationBridge.kt", m3646l = {59}, m3647m = "invokeSuspend")
/* renamed from: microgram.service.bridge.ImplementationBridge$handleCall$2$originalFlow$1, reason: use source file name */
/* loaded from: classes14.dex */
final class ImplementationBridge4 extends ContinuationImpl7 implements Function2<FlowCollector<? super JsonElement>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProtocolMessage3.Call $call;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ImplementationBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImplementationBridge4(ImplementationBridge implementationBridge, ProtocolMessage3.Call call, Continuation<? super ImplementationBridge4> continuation) {
        super(2, continuation);
        this.this$0 = implementationBridge;
        this.$call = call;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ImplementationBridge4 implementationBridge4 = new ImplementationBridge4(this.this$0, this.$call, continuation);
        implementationBridge4.L$0 = obj;
        return implementationBridge4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super JsonElement> flowCollector, Continuation<? super Unit> continuation) {
        return ((ImplementationBridge4) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow<JsonElement> flowCall = this.this$0.callable.call(this.$call.getBody());
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowCall, this) == coroutine_suspended) {
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

package microgram.service.bridge;

import co.touchlab.kermit.Logger;
import co.touchlab.kermit.Severity;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.json.JsonElement;
import microgram.service.protocol.ProtocolExceptions3;
import microgram.service.protocol.ProtocolMessage3;
import microgram.service.protocol.ProtocolMessage6;

/* compiled from: ImplementationBridge.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.service.bridge.ImplementationBridge$handleCall$2$1", m3645f = "ImplementationBridge.kt", m3646l = {70}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: microgram.service.bridge.ImplementationBridge$handleCall$2$1, reason: use source file name */
/* loaded from: classes14.dex */
final class ImplementationBridge2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Throwable>, Object> {
    final /* synthetic */ ProtocolMessage3.Call $call;
    final /* synthetic */ Flow<JsonElement> $flow;
    final /* synthetic */ Integer $limit;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ImplementationBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ImplementationBridge2(Integer num, Flow<? extends JsonElement> flow, ImplementationBridge implementationBridge, ProtocolMessage3.Call call, Continuation<? super ImplementationBridge2> continuation) {
        super(2, continuation);
        this.$limit = num;
        this.$flow = flow;
        this.this$0 = implementationBridge;
        this.$call = call;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ImplementationBridge2 implementationBridge2 = new ImplementationBridge2(this.$limit, this.$flow, this.this$0, this.$call, continuation);
        implementationBridge2.L$0 = obj;
        return implementationBridge2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Throwable> continuation) {
        return ((ImplementationBridge2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref.IntRef intRef;
        Throwable th;
        Object objM28550constructorimpl;
        Throwable thM28553exceptionOrNullimpl;
        Integer num;
        Logger.Companion companion;
        Severity severity;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.IntRef intRef2 = new Ref.IntRef();
            Flow<JsonElement> flow = this.$flow;
            final ImplementationBridge implementationBridge = this.this$0;
            final ProtocolMessage3.Call call = this.$call;
            try {
                Result.Companion companion2 = Result.INSTANCE;
                FlowCollector<? super JsonElement> flowCollector = new FlowCollector() { // from class: microgram.service.bridge.ImplementationBridge$handleCall$2$1$result$1$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((JsonElement) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(JsonElement jsonElement, Continuation<? super Unit> continuation) {
                        intRef2.element++;
                        Object objSend = implementationBridge.peer.send(new ProtocolMessage6.Emission(call.getCallId(), jsonElement), continuation);
                        return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
                    }
                };
                this.L$0 = intRef2;
                this.label = 1;
                if (flow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                intRef = intRef2;
            } catch (Throwable th2) {
                intRef = intRef2;
                th = th2;
                Result.Companion companion3 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                num = this.$limit;
                if (num != null) {
                }
                if (thM28553exceptionOrNullimpl != null) {
                }
                return thM28553exceptionOrNullimpl;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            intRef = (Ref.IntRef) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th3) {
                th = th3;
                Result.Companion companion32 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                num = this.$limit;
                if (num != null) {
                }
                if (thM28553exceptionOrNullimpl != null) {
                    companion = Logger.INSTANCE;
                    String tag = companion.getTag();
                    severity = Severity.Error;
                    if (companion.getConfig().get_minSeverity().compareTo(severity) <= 0) {
                    }
                }
                return thM28553exceptionOrNullimpl;
            }
        }
        objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        num = this.$limit;
        if (num != null) {
            if (intRef.element > num.intValue()) {
                throw new IllegalStateException("Check failed.");
            }
            int i2 = intRef.element;
            Integer num2 = this.$limit;
            if (num2 != null && i2 == num2.intValue()) {
                throw new ProtocolExceptions3("Took " + intRef.element);
            }
        }
        if (thM28553exceptionOrNullimpl != null && !(thM28553exceptionOrNullimpl instanceof CancellationException)) {
            companion = Logger.INSTANCE;
            String tag2 = companion.getTag();
            severity = Severity.Error;
            if (companion.getConfig().get_minSeverity().compareTo(severity) <= 0) {
                companion.processLog(severity, tag2, thM28553exceptionOrNullimpl, thM28553exceptionOrNullimpl.toString());
            }
        }
        return thM28553exceptionOrNullimpl;
    }
}

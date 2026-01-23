package microgram.android.service.protocol;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferred3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.serialization.json.Json;
import microgram.Message;
import microgram.MicrogramError;
import microgram.android.MessageHandler;
import microgram.service.protocol.ProtocolExceptions5;
import microgram.service.protocol.ProtocolMessage;
import microgram.service.protocol.ProtocolMessageSubscriber;

/* compiled from: ProtocolMessageSubscriber.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\f\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000eJ\f\u0010\u0011\u001a\u00020\u0012*\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/android/service/protocol/ProtocolMessageSubscriberMessageHandler;", "Lmicrogram/android/MessageHandler;", "json", "Lkotlinx/serialization/json/Json;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "subscriber", "Lmicrogram/service/protocol/ProtocolMessageSubscriber;", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/coroutines/CoroutineScope;Lmicrogram/service/protocol/ProtocolMessageSubscriber;)V", "handle", "", "message", "Lmicrogram/Message;", "(Lmicrogram/Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleWithReplyAsync", "Lkotlinx/coroutines/Deferred;", "decode", "Lmicrogram/service/protocol/ProtocolMessage;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: microgram.android.service.protocol.ProtocolMessageSubscriberMessageHandler, reason: use source file name */
/* loaded from: classes14.dex */
public final class ProtocolMessageSubscriber3 implements MessageHandler {
    private final CoroutineScope coroutineScope;
    private final Json json;
    private final ProtocolMessageSubscriber subscriber;

    /* compiled from: ProtocolMessageSubscriber.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.android.service.protocol.ProtocolMessageSubscriberMessageHandler", m3645f = "ProtocolMessageSubscriber.kt", m3646l = {29}, m3647m = "handle")
    /* renamed from: microgram.android.service.protocol.ProtocolMessageSubscriberMessageHandler$handle$1 */
    static final class C462841 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C462841(Continuation<? super C462841> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProtocolMessageSubscriber3.this.handle(null, this);
        }
    }

    public ProtocolMessageSubscriber3(Json json, CoroutineScope coroutineScope, ProtocolMessageSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        this.json = json;
        this.coroutineScope = coroutineScope;
        this.subscriber = subscriber;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // microgram.android.MessageHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object handle(Message message, Continuation<? super Boolean> continuation) {
        C462841 c462841;
        if (continuation instanceof C462841) {
            c462841 = (C462841) continuation;
            int i = c462841.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c462841.label = i - Integer.MIN_VALUE;
            } else {
                c462841 = new C462841(continuation);
            }
        }
        Object obj = c462841.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c462841.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ProtocolMessageSubscriber protocolMessageSubscriber = this.subscriber;
            ProtocolMessage protocolMessageDecode = decode(message);
            c462841.label = 1;
            if (protocolMessageSubscriber.onMessage(protocolMessageDecode, c462841) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return boxing.boxBoolean(true);
    }

    @Override // microgram.android.MessageHandler
    public Object handleWithReplyAsync(Message message, Continuation<? super Deferred<Message>> continuation) {
        ProtocolMessage protocolMessageDecode = decode(message);
        final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferred3.CompletableDeferred$default(null, 1, null);
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C462852(protocolMessageDecode, null), 3, null).invokeOnCompletion(new Function1() { // from class: microgram.android.service.protocol.ProtocolMessageSubscriberMessageHandler$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProtocolMessageSubscriber3.handleWithReplyAsync$lambda$0(completableDeferredCompletableDeferred$default, (Throwable) obj);
            }
        });
        return completableDeferredCompletableDeferred$default;
    }

    /* compiled from: ProtocolMessageSubscriber.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.android.service.protocol.ProtocolMessageSubscriberMessageHandler$handleWithReplyAsync$2", m3645f = "ProtocolMessageSubscriber.kt", m3646l = {38}, m3647m = "invokeSuspend")
    /* renamed from: microgram.android.service.protocol.ProtocolMessageSubscriberMessageHandler$handleWithReplyAsync$2 */
    static final class C462852 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProtocolMessage $protocolMessage;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C462852(ProtocolMessage protocolMessage, Continuation<? super C462852> continuation) {
            super(2, continuation);
            this.$protocolMessage = protocolMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProtocolMessageSubscriber3.this.new C462852(this.$protocolMessage, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C462852) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ProtocolMessageSubscriber protocolMessageSubscriber = ProtocolMessageSubscriber3.this.subscriber;
                ProtocolMessage protocolMessage = this.$protocolMessage;
                this.label = 1;
                if (protocolMessageSubscriber.onMessage(protocolMessage, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleWithReplyAsync$lambda$0(CompletableDeferred completableDeferred, Throwable th) {
        MicrogramError microgramErrorAsMicrogramError;
        Integer numValueOf = null;
        String message = th != null ? th.getMessage() : null;
        if (th != null && (microgramErrorAsMicrogramError = ProtocolExceptions5.asMicrogramError(th)) != null) {
            numValueOf = Integer.valueOf(microgramErrorAsMicrogramError.getValue());
        }
        completableDeferred.complete(new Message(message, numValueOf));
        return Unit.INSTANCE;
    }

    private final ProtocolMessage decode(Message message) {
        Json json = this.json;
        String payload = message.getPayload();
        Intrinsics.checkNotNull(payload);
        json.getSerializersModule();
        return (ProtocolMessage) json.decodeFromString(ProtocolMessage.INSTANCE.serializer(), payload);
    }
}

package microgram.service.protocol;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: ProtocolMessageSubscriber.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/service/protocol/ProtocolMessageSubscriber;", "", "Lmicrogram/service/protocol/ProtocolMessage;", "protocolMessage", "", "onMessage", "(Lmicrogram/service/protocol/ProtocolMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "microgram-service"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface ProtocolMessageSubscriber {
    Object onMessage(ProtocolMessage protocolMessage, Continuation<? super Unit> continuation);
}

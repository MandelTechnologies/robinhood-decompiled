package microgram.service.protocol;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import microgram.MessageDispatcher2;

/* compiled from: ProtocolMessageSubscriber.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m3636d2 = {"createMessageHandler", "Lmicrogram/MessageHandler;", "Lmicrogram/service/protocol/ProtocolMessageSubscriber;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "json", "Lkotlinx/serialization/json/Json;", "microgram-service"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.service.protocol.ProtocolMessageSubscriberKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ProtocolMessageSubscriber4 {
    public static final MessageDispatcher2 createMessageHandler(ProtocolMessageSubscriber protocolMessageSubscriber, CoroutineScope coroutineScope, Json json) {
        Intrinsics.checkNotNullParameter(protocolMessageSubscriber, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(json, "json");
        return new ProtocolMessageSubscriber5(protocolMessageSubscriber, coroutineScope, json);
    }
}

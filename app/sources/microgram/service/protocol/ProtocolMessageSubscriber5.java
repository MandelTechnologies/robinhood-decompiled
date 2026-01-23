package microgram.service.protocol;

import co.touchlab.kermit.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import microgram.MessageDispatcher2;

/* compiled from: ProtocolMessageSubscriber.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u0010"}, m3636d2 = {"Lmicrogram/service/protocol/ProtocolMessageSubscriberMessageHandler;", "Lmicrogram/MessageHandler;", "Lmicrogram/service/protocol/ProtocolMessageSubscriber;", "subscriber", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/protocol/ProtocolMessageSubscriber;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/serialization/json/Json;)V", "Lmicrogram/service/protocol/ProtocolMessageSubscriber;", "getSubscriber$microgram_service", "()Lmicrogram/service/protocol/ProtocolMessageSubscriber;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/serialization/json/Json;", "Companion", "microgram-service"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: microgram.service.protocol.ProtocolMessageSubscriberMessageHandler, reason: use source file name */
/* loaded from: classes14.dex */
public final class ProtocolMessageSubscriber5 implements MessageDispatcher2 {
    private static final Logger logger = Logger.INSTANCE.withTag("ProtocolMessageSubscriberMessageHandler");
    private final CoroutineScope coroutineScope;
    private final Json json;
    private final ProtocolMessageSubscriber subscriber;

    public ProtocolMessageSubscriber5(ProtocolMessageSubscriber subscriber, CoroutineScope coroutineScope, Json json) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(json, "json");
        this.subscriber = subscriber;
        this.coroutineScope = coroutineScope;
        this.json = json;
    }
}

package microgram.android.service.protocol;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import microgram.android.MessageHandler;
import microgram.service.protocol.ProtocolMessageSubscriber;

/* compiled from: ProtocolMessageSubscriber.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"createMessageHandler", "Lmicrogram/android/MessageHandler;", "Lmicrogram/service/protocol/ProtocolMessageSubscriber;", "json", "Lkotlinx/serialization/json/Json;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "lib-microgram_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.service.protocol.ProtocolMessageSubscriberKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ProtocolMessageSubscriber2 {
    public static final MessageHandler createMessageHandler(ProtocolMessageSubscriber protocolMessageSubscriber, Json json, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(protocolMessageSubscriber, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new ProtocolMessageSubscriber3(json, coroutineScope, protocolMessageSubscriber);
    }
}

package microgram.service.bridge;

import kotlin.Metadata;
import microgram.service.protocol.ProtocolExceptions5;
import microgram.service.protocol.ProtocolMessage6;

/* compiled from: PeerClientBridge.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0003H\u0002¨\u0006\u0004"}, m3636d2 = {"asException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lmicrogram/service/protocol/Response$Termination$Error;", "microgram-service"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.service.bridge.PeerClientBridgeKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class PeerClientBridge2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Exception asException(ProtocolMessage6.Termination.Error error) {
        return ProtocolExceptions5.asException(error.getCode(), error.getDescription());
    }
}

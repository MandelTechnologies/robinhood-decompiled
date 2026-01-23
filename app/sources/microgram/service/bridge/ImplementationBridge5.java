package microgram.service.bridge;

import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import microgram.MicrogramError;
import microgram.service.protocol.ProtocolExceptions5;
import microgram.service.protocol.ProtocolMessage6;

/* compiled from: ImplementationBridge.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m3636d2 = {"asTerminationError", "Lmicrogram/service/protocol/Response$Termination$Error;", "", "microgram-service"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: microgram.service.bridge.ImplementationBridgeKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ImplementationBridge5 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ProtocolMessage6.Termination.Error asTerminationError(Throwable th) {
        String simpleName;
        MicrogramError microgramErrorAsMicrogramError = ProtocolExceptions5.asMicrogramError(th);
        String message = th.getMessage();
        if (message != null) {
            simpleName = Reflection.getOrCreateKotlinClass(th.getClass()).getSimpleName() + ": " + message;
            if (simpleName == null) {
                simpleName = Reflection.getOrCreateKotlinClass(th.getClass()).getSimpleName();
                if (simpleName == null) {
                    simpleName = "Unknown";
                }
            }
        }
        return new ProtocolMessage6.Termination.Error(microgramErrorAsMicrogramError, simpleName);
    }
}

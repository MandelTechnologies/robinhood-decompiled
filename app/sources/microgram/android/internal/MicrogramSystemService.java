package microgram.android.internal;

import com.robinhood.android.tracing.RhTrace3;
import com.robinhood.android.tracing.RhTrace6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Deferred;
import kotlinx.serialization.SerializationExceptions2;
import kotlinx.serialization.json.Json;
import microgram.Message;
import microgram.RuntimeEvent;
import microgram.android.MessageHandler;

/* compiled from: MicrogramSystemService.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lmicrogram/android/internal/MicrogramSystemService;", "Lmicrogram/android/MessageHandler;", "tunnel", "Lmicrogram/android/internal/HostPlatformMessageTunnel;", "json", "Lkotlinx/serialization/json/Json;", "instanceTrace", "Lcom/robinhood/android/tracing/TrackTrace;", "<init>", "(Lmicrogram/android/internal/HostPlatformMessageTunnel;Lkotlinx/serialization/json/Json;Lcom/robinhood/android/tracing/TrackTrace;)V", "trace", "handle", "", "message", "Lmicrogram/Message;", "(Lmicrogram/Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class MicrogramSystemService implements MessageHandler {
    private final Json json;
    private final RhTrace6 trace;
    private final HostPlatformMessageTunnel tunnel;

    /* compiled from: MicrogramSystemService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RuntimeEvent.MessageType.values().length];
            try {
                iArr[RuntimeEvent.MessageType.DID_FINISH_LAUNCHING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // microgram.android.MessageHandler
    public Object handleWithReplyAsync(Message message, Continuation<? super Deferred<Message>> continuation) {
        return MessageHandler.DefaultImpls.handleWithReplyAsync(this, message, continuation);
    }

    public MicrogramSystemService(HostPlatformMessageTunnel tunnel, Json json, RhTrace6 instanceTrace) {
        Intrinsics.checkNotNullParameter(tunnel, "tunnel");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(instanceTrace, "instanceTrace");
        this.tunnel = tunnel;
        this.json = json;
        this.trace = instanceTrace.withMethodNamePrefix("MicrogramSystemService.");
    }

    @Override // microgram.android.MessageHandler
    public Object handle(Message message, Continuation<? super Boolean> continuation) {
        RhTrace6 rhTrace6 = this.trace;
        RuntimeEvent runtimeEvent = null;
        RhTrace3 rhTrace3BeginSpan = !rhTrace6.isEnabled() ? null : rhTrace6.beginSpan("handle");
        try {
            try {
                String payload = message.getPayload();
                if (payload != null) {
                    Json json = this.json;
                    json.getSerializersModule();
                    runtimeEvent = (RuntimeEvent) json.decodeFromString(RuntimeEvent.INSTANCE.serializer(), payload);
                }
                if (runtimeEvent == null) {
                    Boolean boolBoxBoolean = boxing.boxBoolean(false);
                    if (rhTrace3BeginSpan != null) {
                        rhTrace3BeginSpan.end();
                    }
                    return boolBoxBoolean;
                }
                if (WhenMappings.$EnumSwitchMapping$0[runtimeEvent.getMessageType().ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                this.tunnel.onReady();
                Boolean boolBoxBoolean2 = boxing.boxBoolean(true);
                if (rhTrace3BeginSpan != null) {
                    rhTrace3BeginSpan.end();
                }
                return boolBoxBoolean2;
            } catch (SerializationExceptions2 unused) {
                Boolean boolBoxBoolean3 = boxing.boxBoolean(false);
                if (rhTrace3BeginSpan != null) {
                    rhTrace3BeginSpan.end();
                }
                return boolBoxBoolean3;
            }
        } catch (Throwable th) {
            if (rhTrace3BeginSpan != null) {
                rhTrace3BeginSpan.end();
            }
            throw th;
        }
    }
}

package microgram.android.internal.guest;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GuestRuntime.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lmicrogram/android/internal/guest/RuntimeMessage;", "", "", WebsocketGatewayConstants.DATA_KEY, "", "Lmicrogram/android/internal/guest/HostPort;", "ports", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getData", "Ljava/util/List;", "getPorts", "()Ljava/util/List;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RuntimeMessage {
    private final String data;
    private final List<GuestRuntime3> ports;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RuntimeMessage)) {
            return false;
        }
        RuntimeMessage runtimeMessage = (RuntimeMessage) other;
        return Intrinsics.areEqual(this.data, runtimeMessage.data) && Intrinsics.areEqual(this.ports, runtimeMessage.ports);
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + this.ports.hashCode();
    }

    public String toString() {
        return "RuntimeMessage(data=" + this.data + ", ports=" + this.ports + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RuntimeMessage(String data, List<? extends GuestRuntime3> ports) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(ports, "ports");
        this.data = data;
        this.ports = ports;
    }

    public final String getData() {
        return this.data;
    }

    public final List<GuestRuntime3> getPorts() {
        return this.ports;
    }
}

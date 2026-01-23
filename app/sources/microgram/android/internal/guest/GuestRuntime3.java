package microgram.android.internal.guest;

import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlinx.coroutines.channels.Channel8;

/* compiled from: GuestRuntime.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J)\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH&¢\u0006\u0002\u0010\u000fR\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lmicrogram/android/internal/guest/HostPort;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", NotificationSettings4FragmentKey.SETTINGS_MESSAGES, "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lmicrogram/android/internal/guest/RuntimeMessage;", "getMessages", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "postMessage", "", WebsocketGatewayConstants.DATA_KEY, "", "ports", "", "Lmicrogram/android/internal/guest/GuestPort;", "(Ljava/lang/String;[Lmicrogram/android/internal/guest/GuestPort;)V", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.internal.guest.HostPort, reason: use source file name */
/* loaded from: classes14.dex */
public interface GuestRuntime3 extends AutoCloseable {
    Channel8<RuntimeMessage> getMessages();

    void postMessage(String data, GuestRuntime2... ports);
}

package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.PublishedApi;

@Metadata(m3635d1 = {"kotlinx/coroutines/channels/ChannelsKt__ChannelsKt", "kotlinx/coroutines/channels/ChannelsKt__Channels_commonKt"}, m3636d2 = {}, m3637k = 4, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class ChannelsKt {
    @PublishedApi
    public static final void cancelConsumed(Channel8<?> channel8, Throwable th) {
        ChannelsKt__Channels_commonKt.cancelConsumed(channel8, th);
    }

    public static final <E> Object trySendBlocking(Channel9<? super E> channel9, E e) {
        return Channels4.trySendBlocking(channel9, e);
    }
}

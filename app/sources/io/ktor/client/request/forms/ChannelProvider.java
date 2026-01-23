package io.ktor.client.request.forms;

import io.ktor.utils.p478io.ByteReadChannelJVM;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: formDsl.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lio/ktor/client/request/forms/ChannelProvider;", "", "", "size", "Ljava/lang/Long;", "getSize", "()Ljava/lang/Long;", "Lkotlin/Function0;", "Lio/ktor/utils/io/ByteReadChannel;", "block", "Lkotlin/jvm/functions/Function0;", "getBlock", "()Lkotlin/jvm/functions/Function0;", "ktor-client-core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class ChannelProvider {
    private final Function0<ByteReadChannelJVM> block;
    private final Long size;

    public final Function0<ByteReadChannelJVM> getBlock() {
        return this.block;
    }

    public final Long getSize() {
        return this.size;
    }
}

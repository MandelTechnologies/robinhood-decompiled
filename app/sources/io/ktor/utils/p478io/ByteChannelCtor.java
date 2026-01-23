package io.ktor.utils.p478io;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlinx.coroutines.Job;

/* compiled from: ByteChannelCtor.kt */
@Deprecated
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'¨\u0006\u0007"}, m3636d2 = {"Lio/ktor/utils/io/ByteChannel;", "Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/utils/io/ByteWriteChannel;", "attachJob", "", "job", "Lkotlinx/coroutines/Job;", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.utils.io.ByteChannel, reason: use source file name */
/* loaded from: classes14.dex */
public interface ByteChannelCtor extends ByteReadChannelJVM, ByteWriteChannel {
    @Deprecated
    void attachJob(Job job);
}

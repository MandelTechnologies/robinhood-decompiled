package io.ktor.utils.p478io;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlinx.coroutines.Job;

/* compiled from: Coroutines.kt */
@Deprecated
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lio/ktor/utils/io/WriterJob;", "Lkotlinx/coroutines/Job;", "channel", "Lio/ktor/utils/io/ByteReadChannel;", "getChannel", "()Lio/ktor/utils/io/ByteReadChannel;", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.utils.io.WriterJob, reason: use source file name */
/* loaded from: classes14.dex */
public interface Coroutines5 extends Job {
    ByteReadChannelJVM getChannel();
}

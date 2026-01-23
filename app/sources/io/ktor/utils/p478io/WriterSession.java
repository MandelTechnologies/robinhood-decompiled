package io.ktor.utils.p478io;

import io.ktor.utils.p478io.core.internal.ChunkBuffer;
import kotlin.Deprecated;
import kotlin.Metadata;

/* compiled from: WriterSession.kt */
@Deprecated
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lio/ktor/utils/io/WriterSession;", "", "", "min", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "request", "(I)Lio/ktor/utils/io/core/internal/ChunkBuffer;", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface WriterSession {
    ChunkBuffer request(int min);
}

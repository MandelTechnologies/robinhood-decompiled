package io.ktor.utils.p478io;

import kotlin.Metadata;

/* compiled from: WriterSession.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b`\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lio/ktor/utils/io/HasWriteSession;", "", "beginWriteSession", "Lio/ktor/utils/io/WriterSuspendSession;", "endWriteSession", "", "written", "", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.utils.io.HasWriteSession, reason: use source file name */
/* loaded from: classes14.dex */
public interface WriterSession2 {
    WriterSession4 beginWriteSession();

    void endWriteSession(int written);
}

package io.ktor.utils.p478io;

import com.singular.sdk.internal.Constants;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: WriterSession.kt */
@Deprecated
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m3636d2 = {"Lio/ktor/utils/io/WriterSuspendSession;", "Lio/ktor/utils/io/WriterSession;", "tryAwait", "", Constants.RequestParamsKeys.APP_NAME_KEY, "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.utils.io.WriterSuspendSession, reason: use source file name */
/* loaded from: classes14.dex */
public interface WriterSession4 extends WriterSession {
    Object tryAwait(int i, Continuation<? super Unit> continuation);
}

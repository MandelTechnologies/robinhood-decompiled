package kotlinx.coroutines.internal;

import _COROUTINE.CoroutineDebugging;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StackTraceRecovery.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u001c\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u001c\u0010\f\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b*\f\b\u0000\u0010\u000e\"\u00020\r2\u00020\r*\f\b\u0000\u0010\u000f\"\u00020\u00052\u00020\u0005¨\u0006\u0010"}, m3636d2 = {"", "E", "exception", "recoverStackTrace", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Ljava/lang/StackTraceElement;", "ARTIFICIAL_FRAME", "Ljava/lang/StackTraceElement;", "", "kotlin.jvm.PlatformType", "baseContinuationImplClassName", "Ljava/lang/String;", "stackTraceRecoveryClassName", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.coroutines.internal.StackTraceRecoveryKt, reason: use source file name */
/* loaded from: classes23.dex */
public final class StackTraceRecovery {
    private static final StackTraceElement ARTIFICIAL_FRAME = new CoroutineDebugging().coroutineBoundary();
    private static final String baseContinuationImplClassName;
    private static final String stackTraceRecoveryClassName;

    public static final <E extends Throwable> E recoverStackTrace(E e) {
        return e;
    }

    static {
        Object objM28550constructorimpl;
        Object objM28550constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ContinuationImpl2.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) != null) {
            objM28550constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        baseContinuationImplClassName = (String) objM28550constructorimpl;
        try {
            objM28550constructorimpl2 = Result.m28550constructorimpl(StackTraceRecovery.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            objM28550constructorimpl2 = Result.m28550constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl2) != null) {
            objM28550constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        stackTraceRecoveryClassName = (String) objM28550constructorimpl2;
    }
}

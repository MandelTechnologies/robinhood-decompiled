package kotlinx.coroutines.rx2;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler7;

/* compiled from: RxCancellable.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, m3636d2 = {"handleUndeliverableException", "", "cause", "", "context", "Lkotlin/coroutines/CoroutineContext;", "kotlinx-coroutines-rx2"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: kotlinx.coroutines.rx2.RxCancellableKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class RxCancellable2 {
    public static final void handleUndeliverableException(Throwable th, CoroutineContext coroutineContext) {
        if (th instanceof CancellationException) {
            return;
        }
        try {
            RxJavaPlugins.onError(th);
        } catch (Throwable th2) {
            ExceptionsKt.addSuppressed(th, th2);
            CoroutineExceptionHandler7.handleCoroutineException(coroutineContext, th);
        }
    }
}

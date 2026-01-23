package microgram.service.managed;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: Dispatching.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\n\"0\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00008\u0000@AX\u0081\u000e¢\u0006\u0018\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m3636d2 = {"Lkotlinx/coroutines/CoroutineDispatcher;", "value", "WorkDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getWorkDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "setWorkDispatcher", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "getWorkDispatcher$annotations", "()V", "microgram-service"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.service.managed.DispatchingKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class Dispatching {
    private static CoroutineDispatcher WorkDispatcher = Dispatchers.getDefault();

    public static final CoroutineDispatcher getWorkDispatcher() {
        return WorkDispatcher;
    }
}

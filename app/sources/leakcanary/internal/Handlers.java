package leakcanary.internal;

import android.os.Handler;
import android.os.Looper;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Handlers.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u001b\u0010\b\u001a\u00020\u00038@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0014\u0010\n\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"", "checkMainThread", "()V", "Landroid/os/Handler;", "mainHandler$delegate", "Lkotlin/Lazy;", "getMainHandler", "()Landroid/os/Handler;", "mainHandler", "", "isMainThread", "()Z", "leakcanary-android-utils_release"}, m3637k = 2, m3638mv = {1, 4, 1})
/* renamed from: leakcanary.internal.HandlersKt, reason: use source file name */
/* loaded from: classes23.dex */
public final class Handlers {
    private static final Lazy mainHandler$delegate = LazyKt.lazy(new Function0<Handler>() { // from class: leakcanary.internal.HandlersKt$mainHandler$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    });

    public static final Handler getMainHandler() {
        return (Handler) mainHandler$delegate.getValue();
    }

    public static final boolean isMainThread() {
        Looper mainLooper = Looper.getMainLooper();
        Intrinsics.checkExpressionValueIsNotNull(mainLooper, "Looper.getMainLooper()");
        return mainLooper.getThread() == Thread.currentThread();
    }

    public static final void checkMainThread() {
        if (isMainThread()) {
            return;
        }
        throw new IllegalStateException(("Should be called from the main thread, not " + Thread.currentThread()).toString());
    }
}

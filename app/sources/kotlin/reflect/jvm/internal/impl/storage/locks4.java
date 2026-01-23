package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: locks.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.storage.SimpleLock, reason: use source file name */
/* loaded from: classes23.dex */
public interface locks4 {
    public static final Companion Companion = Companion.$$INSTANCE;

    void lock();

    void unlock();

    /* compiled from: locks.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.SimpleLock$Companion */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final locks2 simpleLock(Runnable runnable, Function1<? super InterruptedException, Unit> function1) {
            if (runnable != null && function1 != null) {
                return new locks(runnable, function1);
            }
            return new locks2(null, 1, null);
        }
    }
}

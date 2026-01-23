package androidx.paging;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InvalidateCallbackTracker.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\r\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u0015J\r\u0010\u0016\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0017J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u001d\u0010\u001bR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Landroidx/paging/InvalidateCallbackTracker;", "T", "", "callbackInvoker", "Lkotlin/Function1;", "", "invalidGetter", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "callbacks", "", "<set-?>", "invalid", "getInvalid$paging_common_release", "()Z", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/paging/internal/ReentrantLock;", "callbackCount", "", "callbackCount$paging_common_release", "invalidate", "invalidate$paging_common_release", "registerInvalidatedCallback", "callback", "registerInvalidatedCallback$paging_common_release", "(Ljava/lang/Object;)V", "unregisterInvalidatedCallback", "unregisterInvalidatedCallback$paging_common_release", "paging-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class InvalidateCallbackTracker<T> {
    private final Function1<T, Unit> callbackInvoker;
    private final List<T> callbacks;
    private boolean invalid;
    private final Function0<Boolean> invalidGetter;
    private final ReentrantLock lock;

    /* JADX WARN: Multi-variable type inference failed */
    public InvalidateCallbackTracker(Function1<? super T, Unit> callbackInvoker, Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(callbackInvoker, "callbackInvoker");
        this.callbackInvoker = callbackInvoker;
        this.invalidGetter = function0;
        this.lock = new ReentrantLock();
        this.callbacks = new ArrayList();
    }

    public /* synthetic */ InvalidateCallbackTracker(Function1 function1, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i & 2) != 0 ? null : function0);
    }

    /* renamed from: getInvalid$paging_common_release, reason: from getter */
    public final boolean getInvalid() {
        return this.invalid;
    }

    public final int callbackCount$paging_common_release() {
        return this.callbacks.size();
    }

    public final void registerInvalidatedCallback$paging_common_release(T callback) {
        Function0<Boolean> function0 = this.invalidGetter;
        boolean z = true;
        if (function0 != null && function0.invoke().booleanValue()) {
            invalidate$paging_common_release();
        }
        if (this.invalid) {
            this.callbackInvoker.invoke(callback);
            return;
        }
        ReentrantLock reentrantLock = this.lock;
        try {
            reentrantLock.lock();
            if (!this.invalid) {
                this.callbacks.add(callback);
                z = false;
            }
            if (z) {
                this.callbackInvoker.invoke(callback);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void unregisterInvalidatedCallback$paging_common_release(T callback) {
        ReentrantLock reentrantLock = this.lock;
        try {
            reentrantLock.lock();
            this.callbacks.remove(callback);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean invalidate$paging_common_release() {
        if (this.invalid) {
            return false;
        }
        ReentrantLock reentrantLock = this.lock;
        try {
            reentrantLock.lock();
            if (this.invalid) {
                return false;
            }
            this.invalid = true;
            List list = CollectionsKt.toList(this.callbacks);
            this.callbacks.clear();
            reentrantLock.unlock();
            Function1<T, Unit> function1 = this.callbackInvoker;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }
}

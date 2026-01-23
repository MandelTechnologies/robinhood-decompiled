package io.bitdrift.capture.network.okhttp;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeallocationGuard.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\u000b\u001a\u00020\u0006J\u001a\u0010\f\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005R\u0012\u0010\b\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u00028\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u000e"}, m3636d2 = {"Lio/bitdrift/capture/network/okhttp/DeallocationGuard;", "T", "", "inner", "deallocator", "Lkotlin/Function1;", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "deallocated", "", "Ljava/lang/Object;", "deallocate", "safeAccess", "f", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class DeallocationGuard<T> {
    private boolean deallocated;
    private final Function1<T, Unit> deallocator;
    private final T inner;

    /* JADX WARN: Multi-variable type inference failed */
    public DeallocationGuard(T t, Function1<? super T, Unit> deallocator) {
        Intrinsics.checkNotNullParameter(deallocator, "deallocator");
        this.inner = t;
        this.deallocator = deallocator;
    }

    public final synchronized void safeAccess(Function1<? super T, Unit> f) {
        Intrinsics.checkNotNullParameter(f, "f");
        if (!this.deallocated) {
            f.invoke(this.inner);
        }
    }

    public final synchronized void deallocate() {
        if (!this.deallocated) {
            this.deallocated = true;
            this.deallocator.invoke(this.inner);
        }
    }
}

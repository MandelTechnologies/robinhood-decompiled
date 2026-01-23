package com.robinhood.android.udf;

import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dispatch.core.DispatcherProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: DuxoBundle.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB!\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/udf/DuxoBundle;", "", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "coroutineExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "<init>", "(Lcom/robinhood/coroutines/rx/RxFactory;Ldispatch/core/DispatcherProvider;Lkotlinx/coroutines/CoroutineExceptionHandler;)V", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "(Lcom/robinhood/coroutines/rx/RxFactory;Ldispatch/core/DispatcherProvider;Lcom/robinhood/utils/RxGlobalErrorHandler;)V", "getRxFactory", "()Lcom/robinhood/coroutines/rx/RxFactory;", "getDispatcherProvider", "()Ldispatch/core/DispatcherProvider;", "getCoroutineExceptionHandler", "()Lkotlinx/coroutines/CoroutineExceptionHandler;", "lib-udf_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class DuxoBundle {
    public static final int $stable = 8;
    private final CoroutineExceptionHandler coroutineExceptionHandler;
    private final DispatcherProvider dispatcherProvider;
    private final RxFactory rxFactory;

    public DuxoBundle(RxFactory rxFactory, DispatcherProvider dispatcherProvider, CoroutineExceptionHandler coroutineExceptionHandler) {
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(coroutineExceptionHandler, "coroutineExceptionHandler");
        this.rxFactory = rxFactory;
        this.dispatcherProvider = dispatcherProvider;
        this.coroutineExceptionHandler = coroutineExceptionHandler;
    }

    public final RxFactory getRxFactory() {
        return this.rxFactory;
    }

    public final DispatcherProvider getDispatcherProvider() {
        return this.dispatcherProvider;
    }

    public final CoroutineExceptionHandler getCoroutineExceptionHandler() {
        return this.coroutineExceptionHandler;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DuxoBundle(RxFactory rxFactory, DispatcherProvider dispatcherProvider, RxGlobalErrorHandler rxGlobalErrorHandler) {
        this(rxFactory, dispatcherProvider, (CoroutineExceptionHandler) rxGlobalErrorHandler);
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
    }
}

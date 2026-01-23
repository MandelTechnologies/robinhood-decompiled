package com.robinhood.utils;

import android.app.Application;
import com.robinhood.utils.p408rx.error.RxCheckpointException;
import dagger.Lazy;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.functions.Consumer;
import io.reactivex.plugins.RxJavaPlugins;
import java.io.IOException;
import java.lang.Thread;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import retrofit2.HttpException;
import timber.log.Timber;

/* compiled from: RxGlobalErrorHandler.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0002H\u0002J\f\u0010\u0019\u001a\u00020\u001a*\u00020\u0002H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/utils/RxGlobalErrorHandler;", "Lio/reactivex/functions/Consumer;", "", "Lcom/robinhood/utils/AppInitializedListener;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "logoutKillswitch", "Ldagger/Lazy;", "Lcom/robinhood/utils/LogoutKillswitch;", "<init>", "(Ldagger/Lazy;)V", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "onAppInitialized", "", "app", "Landroid/app/Application;", "handleException", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "accept", "throwable", "swallowOrThrow", "shouldSwallow", "", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class RxGlobalErrorHandler implements Consumer<Throwable>, AppInitializedListener, CoroutineExceptionHandler {
    private final Lazy<LogoutKillswitch> logoutKillswitch;

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineExceptionHandler.DefaultImpls.fold(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) CoroutineExceptionHandler.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return CoroutineExceptionHandler.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineExceptionHandler.DefaultImpls.plus(this, coroutineContext);
    }

    public RxGlobalErrorHandler(Lazy<LogoutKillswitch> logoutKillswitch) {
        Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
        this.logoutKillswitch = logoutKillswitch;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.Key<?> getKey() {
        return CoroutineExceptionHandler.INSTANCE;
    }

    @Override // com.robinhood.utils.AppInitializedListener
    public void onAppInitialized(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        RxJavaPlugins.setErrorHandler(this);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(CoroutineContext context, Throwable exception) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(exception, "exception");
        accept(exception);
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (throwable instanceof CompositeException) {
            for (Throwable th : ((CompositeException) throwable).getExceptions()) {
                Intrinsics.checkNotNull(th);
                swallowOrThrow(th);
            }
            return;
        }
        swallowOrThrow(throwable);
    }

    private final void swallowOrThrow(Throwable throwable) {
        Throwable cause;
        if ((throwable instanceof UndeliverableException) || (throwable instanceof OnErrorNotImplementedException)) {
            cause = throwable.getCause();
            Intrinsics.checkNotNull(cause);
            if (cause instanceof RxCheckpointException) {
                cause = cause.getCause();
                Intrinsics.checkNotNull(cause);
            }
        } else {
            cause = throwable;
        }
        if (shouldSwallow(cause)) {
            Timber.INSTANCE.mo3352d(throwable, "Swallowed uncaught error:", new Object[0]);
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = threadCurrentThread.getUncaughtExceptionHandler();
        Intrinsics.checkNotNull(uncaughtExceptionHandler);
        uncaughtExceptionHandler.uncaughtException(threadCurrentThread, throwable);
    }

    private final boolean shouldSwallow(Throwable th) {
        if ((th instanceof IOException) || (th instanceof HttpException) || (th instanceof InterruptedException)) {
            return true;
        }
        if (this.logoutKillswitch.get().isLoggedOut()) {
            return (th instanceof CancellationException) || (th instanceof NoSuchElementException) || ((th instanceof IllegalStateException) && Intrinsics.areEqual(th.getMessage(), "cache is closed"));
        }
        return false;
    }
}

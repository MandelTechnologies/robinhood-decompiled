package com.robinhood.disposer;

import android.os.Handler;
import android.os.Looper;
import com.robinhood.utils.system.References;
import io.reactivex.exceptions.CompositeException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: LifecycleCoroutineExceptionHandler.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/disposer/LifecycleCoroutineExceptionHandler;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "defaultExceptionHandler", "uiExceptionHandler", "Lcom/robinhood/disposer/UiUncaughtExceptionHandler;", "<init>", "(Lkotlinx/coroutines/CoroutineExceptionHandler;Lcom/robinhood/disposer/UiUncaughtExceptionHandler;)V", "getUiExceptionHandler", "()Lcom/robinhood/disposer/UiUncaughtExceptionHandler;", "uiExceptionHandler$delegate", "Lkotlin/properties/ReadWriteProperty;", "mainHandler", "Landroid/os/Handler;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class LifecycleCoroutineExceptionHandler implements CoroutineExceptionHandler {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(LifecycleCoroutineExceptionHandler.class, "uiExceptionHandler", "getUiExceptionHandler()Lcom/robinhood/disposer/UiUncaughtExceptionHandler;", 0))};
    public static final int $stable = 8;
    private final CoroutineExceptionHandler defaultExceptionHandler;
    private final Handler mainHandler;

    /* renamed from: uiExceptionHandler$delegate, reason: from kotlin metadata */
    private final Interfaces3 uiExceptionHandler;

    public LifecycleCoroutineExceptionHandler(CoroutineExceptionHandler defaultExceptionHandler, UiUncaughtExceptionHandler uiUncaughtExceptionHandler) {
        Intrinsics.checkNotNullParameter(defaultExceptionHandler, "defaultExceptionHandler");
        this.defaultExceptionHandler = defaultExceptionHandler;
        this.uiExceptionHandler = References.weak(uiUncaughtExceptionHandler);
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

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

    /* JADX INFO: Access modifiers changed from: private */
    public final UiUncaughtExceptionHandler getUiExceptionHandler() {
        return (UiUncaughtExceptionHandler) this.uiExceptionHandler.getValue(this, $$delegatedProperties[0]);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.Key<?> getKey() {
        return CoroutineExceptionHandler.INSTANCE;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(final CoroutineContext context, final Throwable exception) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (this.mainHandler.post(new Runnable() { // from class: com.robinhood.disposer.LifecycleCoroutineExceptionHandler$handleException$posted$1
            @Override // java.lang.Runnable
            public final void run() {
                Throwable th;
                UiUncaughtExceptionHandler uiExceptionHandler = this.this$0.getUiExceptionHandler();
                if (uiExceptionHandler != null) {
                    try {
                        th = uiExceptionHandler.handleUiUncaughtException(context, exception) ? null : exception;
                    } catch (Throwable th2) {
                        Throwable compositeException = exception;
                        if (compositeException != th2) {
                            compositeException = new CompositeException(exception, th2);
                        }
                        th = compositeException;
                    }
                } else {
                    th = exception;
                }
                if (th != null) {
                    this.this$0.defaultExceptionHandler.handleException(context, th);
                }
            }
        })) {
            return;
        }
        this.defaultExceptionHandler.handleException(context, exception);
    }
}

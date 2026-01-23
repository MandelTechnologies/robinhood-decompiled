package com.robinhood.disposer;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiUncaughtExceptionHandler.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/disposer/UiUncaughtExceptionHandler;", "", "handleUiUncaughtException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface UiUncaughtExceptionHandler {

    /* compiled from: UiUncaughtExceptionHandler.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes15.dex */
    public static final class DefaultImpls {
        public static boolean handleUiUncaughtException(UiUncaughtExceptionHandler uiUncaughtExceptionHandler, CoroutineContext context, Throwable exception) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(exception, "exception");
            return false;
        }
    }

    boolean handleUiUncaughtException(CoroutineContext context, Throwable exception);
}

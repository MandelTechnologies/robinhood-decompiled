package com.robinhood.android.common.util.p090rx;

import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.UiUncaughtExceptionHandler;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorHandlers.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u001a\u001c\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0007¨\u0006\r"}, m3636d2 = {"handleErrorEvent", "", "T", "Lcom/robinhood/android/util/rx/AbsErrorHandler;", "event", "Lcom/robinhood/udf/UiEvent;", "", "handleUiUncaughtExceptionWithActivity", "", "Landroidx/fragment/app/Fragment;", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.util.rx.ErrorHandlersKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class ErrorHandlers {
    public static final <T> void handleErrorEvent(AbsErrorHandler<T> absErrorHandler, UiEvent<Throwable> uiEvent) {
        Throwable thConsume;
        Intrinsics.checkNotNullParameter(absErrorHandler, "<this>");
        if (uiEvent != null && (thConsume = uiEvent.consume()) != null && !AbsErrorHandler.handleError$default(absErrorHandler, thConsume, false, 2, null)) {
            throw thConsume;
        }
    }

    public static final boolean handleUiUncaughtExceptionWithActivity(Fragment fragment, CoroutineContext context, Throwable exception) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(exception, "exception");
        KeyEventDispatcher.Component activity = fragment.getActivity();
        if (activity instanceof UiUncaughtExceptionHandler) {
            return ((UiUncaughtExceptionHandler) activity).handleUiUncaughtException(context, exception);
        }
        return false;
    }
}

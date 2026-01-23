package com.robinhood.android.compose.autoeventlogging;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidedValue;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AutoLoggingCompositionLocals.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\t2\u0006\u0010\n\u001a\u00020\u0005H\u0086\u0004R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/compose/autoeventlogging/PerformanceLoggerCompositionLocal;", "", "<init>", "()V", "current", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/performancelogger/PerformanceLogger;", "provides", "Landroidx/compose/runtime/ProvidedValue;", "value", "lib-compose-auto-event-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.compose.autoeventlogging.PerformanceLoggerCompositionLocal, reason: use source file name */
/* loaded from: classes17.dex */
public final class AutoLoggingCompositionLocals7 {
    public static final int $stable = 0;

    @JvmName
    public final PerformanceLogger getCurrent(Composer composer, int i) {
        ComponentCallbacks2 componentCallbacks2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(220168840, i, -1, "com.robinhood.android.compose.autoeventlogging.PerformanceLoggerCompositionLocal.<get-current> (AutoLoggingCompositionLocals.kt:139)");
        }
        PerformanceLogger performanceLogger = (PerformanceLogger) composer.consume(AutoLoggingCompositionLocals.LocalPerformanceLoggerOverride);
        if (performanceLogger == null) {
            Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            if (context instanceof Application) {
                componentCallbacks2 = (Application) context;
            } else {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
                componentCallbacks2 = (Application) applicationContext;
            }
            performanceLogger = ((AutoLoggingCompositionLocals2) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).performanceLogger();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return performanceLogger;
    }

    public final ProvidedValue<PerformanceLogger> provides(PerformanceLogger value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return AutoLoggingCompositionLocals.LocalPerformanceLoggerOverride.provides(value);
    }
}

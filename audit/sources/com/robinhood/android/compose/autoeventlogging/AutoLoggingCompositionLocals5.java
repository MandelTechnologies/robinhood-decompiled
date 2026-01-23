package com.robinhood.android.compose.autoeventlogging;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.ProvidedValue;
import com.robinhood.android.compose.autoeventlogging.PerformanceIndicatorDispatcher;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AutoLoggingCompositionLocals.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0086\u0004R\u0016\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/compose/autoeventlogging/PerformanceIndicatorDispatcherFactoryCompositionLocal;", "", "delegate", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/robinhood/android/compose/autoeventlogging/PerformanceIndicatorDispatcher$Factory;", "<init>", "(Landroidx/compose/runtime/ProvidableCompositionLocal;)V", "current", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/compose/autoeventlogging/PerformanceIndicatorDispatcher$Factory;", "provides", "Landroidx/compose/runtime/ProvidedValue;", "value", "lib-compose-auto-event-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.compose.autoeventlogging.PerformanceIndicatorDispatcherFactoryCompositionLocal, reason: use source file name */
/* loaded from: classes2.dex */
public final class AutoLoggingCompositionLocals5 {
    public static final int $stable = 0;
    private final CompositionLocal6<PerformanceIndicatorDispatcher.Factory> delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public AutoLoggingCompositionLocals5() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PerformanceIndicatorDispatcher.Factory _init_$lambda$0() {
        return null;
    }

    public AutoLoggingCompositionLocals5(CompositionLocal6<PerformanceIndicatorDispatcher.Factory> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    public /* synthetic */ AutoLoggingCompositionLocals5(CompositionLocal6 compositionLocal6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CompositionLocal3.staticCompositionLocalOf(new Function0() { // from class: com.robinhood.android.compose.autoeventlogging.PerformanceIndicatorDispatcherFactoryCompositionLocal$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AutoLoggingCompositionLocals5._init_$lambda$0();
            }
        }) : compositionLocal6);
    }

    @JvmName
    public final PerformanceIndicatorDispatcher.Factory getCurrent(Composer composer, int i) {
        ComponentCallbacks2 componentCallbacks2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1874212342, i, -1, "com.robinhood.android.compose.autoeventlogging.PerformanceIndicatorDispatcherFactoryCompositionLocal.<get-current> (AutoLoggingCompositionLocals.kt:34)");
        }
        PerformanceIndicatorDispatcher.Factory factoryPerformanceIndicatorDispatcherFactory = (PerformanceIndicatorDispatcher.Factory) composer.consume(this.delegate);
        if (factoryPerformanceIndicatorDispatcherFactory == null) {
            final PerformanceLogger performanceLogger = (PerformanceLogger) composer.consume(AutoLoggingCompositionLocals.LocalPerformanceLoggerOverride);
            if (performanceLogger == null) {
                factoryPerformanceIndicatorDispatcherFactory = null;
            } else {
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(performanceLogger);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new PerformanceIndicatorDispatcher.Factory() { // from class: com.robinhood.android.compose.autoeventlogging.PerformanceIndicatorDispatcherFactoryCompositionLocal$current$1$1$1
                        @Override // com.robinhood.android.compose.autoeventlogging.PerformanceIndicatorDispatcher.Factory
                        public final PerformanceIndicatorDispatcher create(UUID contextualId) {
                            Intrinsics.checkNotNullParameter(contextualId, "contextualId");
                            return new PerformanceIndicatorDispatcher(performanceLogger, contextualId);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                factoryPerformanceIndicatorDispatcherFactory = (PerformanceIndicatorDispatcher.Factory) objRememberedValue;
                composer.endReplaceGroup();
            }
        }
        if (factoryPerformanceIndicatorDispatcherFactory == null) {
            Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            if (context instanceof Application) {
                componentCallbacks2 = (Application) context;
            } else {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
                componentCallbacks2 = (Application) applicationContext;
            }
            factoryPerformanceIndicatorDispatcherFactory = ((AutoLoggingCompositionLocals2) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).performanceIndicatorDispatcherFactory();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return factoryPerformanceIndicatorDispatcherFactory;
    }

    public final ProvidedValue<PerformanceIndicatorDispatcher.Factory> provides(PerformanceIndicatorDispatcher.Factory value) {
        return this.delegate.provides(value);
    }
}

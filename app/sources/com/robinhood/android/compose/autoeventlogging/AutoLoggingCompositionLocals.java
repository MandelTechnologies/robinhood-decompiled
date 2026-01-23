package com.robinhood.android.compose.autoeventlogging;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.performancelogger.PerformanceLogger;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AutoLoggingCompositionLocals.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\"\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u001f\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b\"\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\t\"\u001f\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\t\u001a\u0004\b\"\u0010\u000b¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "descriptor", "Lkotlin/Function0;", "", "content", "EventLoggable", "(Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalUserInteractionEventDescriptor", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalUserInteractionEventDescriptor", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/robinhood/android/compose/autoeventlogging/PerformanceIndicatorDispatcher;", "LocalPerformanceIndicatorDispatcher", "getLocalPerformanceIndicatorDispatcher", "Lcom/robinhood/android/compose/autoeventlogging/PerformanceIndicatorDispatcherFactoryCompositionLocal;", "LocalPerformanceIndicatorDispatcherFactory", "Lcom/robinhood/android/compose/autoeventlogging/PerformanceIndicatorDispatcherFactoryCompositionLocal;", "getLocalPerformanceIndicatorDispatcherFactory", "()Lcom/robinhood/android/compose/autoeventlogging/PerformanceIndicatorDispatcherFactoryCompositionLocal;", "Lcom/robinhood/android/compose/autoeventlogging/EventLoggerCompositionLocal;", "LocalEventLogger", "Lcom/robinhood/android/compose/autoeventlogging/EventLoggerCompositionLocal;", "getLocalEventLogger", "()Lcom/robinhood/android/compose/autoeventlogging/EventLoggerCompositionLocal;", "Lcom/robinhood/android/compose/autoeventlogging/PerformanceLoggerCompositionLocal;", "LocalPerformanceLogger", "Lcom/robinhood/android/compose/autoeventlogging/PerformanceLoggerCompositionLocal;", "getLocalPerformanceLogger", "()Lcom/robinhood/android/compose/autoeventlogging/PerformanceLoggerCompositionLocal;", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "LocalPerformanceLoggerOverride", "Ljava/util/UUID;", "LocalPerformanceLoggerContextualId", "getLocalPerformanceLoggerContextualId", "lib-compose-auto-event-logging_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocalsKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class AutoLoggingCompositionLocals {
    private static final AutoLoggingCompositionLocals4 LocalEventLogger;
    private static final AutoLoggingCompositionLocals5 LocalPerformanceIndicatorDispatcherFactory;
    private static final CompositionLocal6<UserInteractionEventDescriptor> LocalUserInteractionEventDescriptor = CompositionLocal3.compositionLocalOf$default(null, new Function0() { // from class: com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocalsKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AutoLoggingCompositionLocals.LocalUserInteractionEventDescriptor$lambda$0();
        }
    }, 1, null);
    private static final CompositionLocal6<PerformanceIndicatorDispatcher> LocalPerformanceIndicatorDispatcher = CompositionLocal3.compositionLocalOf$default(null, new Function0() { // from class: com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocalsKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AutoLoggingCompositionLocals.LocalPerformanceIndicatorDispatcher$lambda$1();
        }
    }, 1, null);
    private static final AutoLoggingCompositionLocals7 LocalPerformanceLogger = new AutoLoggingCompositionLocals7();
    private static final CompositionLocal6<PerformanceLogger> LocalPerformanceLoggerOverride = CompositionLocal3.staticCompositionLocalOf(new Function0() { // from class: com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocalsKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AutoLoggingCompositionLocals.LocalPerformanceLoggerOverride$lambda$3();
        }
    });
    private static final CompositionLocal6<UUID> LocalPerformanceLoggerContextualId = CompositionLocal3.staticCompositionLocalOf(new Function0() { // from class: com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocalsKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AutoLoggingCompositionLocals.LocalPerformanceLoggerContextualId$lambda$4();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventLoggable$lambda$2(UserInteractionEventDescriptor userInteractionEventDescriptor, Function2 function2, int i, Composer composer, int i2) {
        EventLoggable(userInteractionEventDescriptor, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PerformanceIndicatorDispatcher LocalPerformanceIndicatorDispatcher$lambda$1() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID LocalPerformanceLoggerContextualId$lambda$4() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PerformanceLogger LocalPerformanceLoggerOverride$lambda$3() {
        return null;
    }

    public static final CompositionLocal6<UserInteractionEventDescriptor> getLocalUserInteractionEventDescriptor() {
        return LocalUserInteractionEventDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 1;
        LocalPerformanceIndicatorDispatcherFactory = new AutoLoggingCompositionLocals5(null, i, 0 == true ? 1 : 0);
        LocalEventLogger = new AutoLoggingCompositionLocals4(0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor LocalUserInteractionEventDescriptor$lambda$0() {
        return new UserInteractionEventDescriptor(null, null, null, null, null, null, 63, null);
    }

    public static final CompositionLocal6<PerformanceIndicatorDispatcher> getLocalPerformanceIndicatorDispatcher() {
        return LocalPerformanceIndicatorDispatcher;
    }

    public static final AutoLoggingCompositionLocals5 getLocalPerformanceIndicatorDispatcherFactory() {
        return LocalPerformanceIndicatorDispatcherFactory;
    }

    public static final AutoLoggingCompositionLocals4 getLocalEventLogger() {
        return LocalEventLogger;
    }

    public static final AutoLoggingCompositionLocals7 getLocalPerformanceLogger() {
        return LocalPerformanceLogger;
    }

    public static final void EventLoggable(final UserInteractionEventDescriptor descriptor, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(237532876);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(descriptor) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(237532876, i2, -1, "com.robinhood.android.compose.autoeventlogging.EventLoggable (AutoLoggingCompositionLocals.kt:103)");
            }
            CompositionLocal6<UserInteractionEventDescriptor> compositionLocal6 = LocalUserInteractionEventDescriptor;
            CompositionLocal3.CompositionLocalProvider(compositionLocal6.provides(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(compositionLocal6), descriptor)), ComposableLambda3.rememberComposableLambda(1551215500, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocalsKt.EventLoggable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1551215500, i3, -1, "com.robinhood.android.compose.autoeventlogging.EventLoggable.<anonymous> (AutoLoggingCompositionLocals.kt:106)");
                    }
                    content.invoke(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocalsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AutoLoggingCompositionLocals.EventLoggable$lambda$2(descriptor, content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final CompositionLocal6<UUID> getLocalPerformanceLoggerContextualId() {
        return LocalPerformanceLoggerContextualId;
    }
}

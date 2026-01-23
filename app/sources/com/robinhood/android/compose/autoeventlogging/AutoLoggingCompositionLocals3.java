package com.robinhood.android.compose.autoeventlogging;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.rosetta.eventlogging.Context;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AutoLoggingCompositionLocals.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0019\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/compose/autoeventlogging/EventLoggable;", "", "<init>", "()V", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getEventContext", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/rosetta/eventlogging/Context;", "lib-compose-auto-event-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.compose.autoeventlogging.EventLoggable, reason: use source file name */
/* loaded from: classes2.dex */
public final class AutoLoggingCompositionLocals3 {
    public static final int $stable = 0;
    public static final AutoLoggingCompositionLocals3 INSTANCE = new AutoLoggingCompositionLocals3();

    private AutoLoggingCompositionLocals3() {
    }

    @JvmName
    public final Context getEventContext(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1500103697, i, -1, "com.robinhood.android.compose.autoeventlogging.EventLoggable.<get-eventContext> (AutoLoggingCompositionLocals.kt:115)");
        }
        Context context = ((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getContext();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return context;
    }
}

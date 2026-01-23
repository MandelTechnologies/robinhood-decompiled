package com.robinhood.android.diagnostics.event;

import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DiagnosticEventLogger.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/event/ExperimentBasedDiagnosticEventLogger;", "Lcom/robinhood/android/diagnostics/event/DiagnosticEventLogger;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "delegate", "Ldagger/Lazy;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/experiments/ExperimentsProvider;Ldagger/Lazy;)V", "isInExperiment", "", "send", "", "event", "Lcom/robinhood/android/diagnostics/event/DiagnosticEvent;", "shutDown", "throwable", "", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.diagnostics.event.ExperimentBasedDiagnosticEventLogger, reason: use source file name */
/* loaded from: classes16.dex */
public final class DiagnosticEventLogger2 implements DiagnosticEventLogger {
    private final Lazy<? extends DiagnosticEventLogger> delegate;
    private volatile boolean isInExperiment;

    public DiagnosticEventLogger2(CoroutineScope coroutineScope, ExperimentsProvider experimentsProvider, Lazy<? extends DiagnosticEventLogger> delegate) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
        ScopedSubscriptionKt.subscribeIn(ExperimentsProvider.DefaultImpls.streamState$default(experimentsProvider, new Experiment[]{Experiment.DIAGNOSTIC_EVENT_LOGGING.INSTANCE}, false, null, 6, null), coroutineScope, new Function1() { // from class: com.robinhood.android.diagnostics.event.ExperimentBasedDiagnosticEventLogger$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DiagnosticEventLogger2._init_$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(DiagnosticEventLogger2 diagnosticEventLogger2, boolean z) {
        diagnosticEventLogger2.isInExperiment = z;
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.diagnostics.event.DiagnosticEventLogger
    public void send(DiagnosticEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.isInExperiment) {
            this.delegate.get().send(event);
        }
    }

    @Override // com.robinhood.android.diagnostics.event.DiagnosticEventLogger
    public void shutDown(Throwable throwable) {
        if (this.isInExperiment) {
            this.delegate.get().shutDown(throwable);
        }
    }
}

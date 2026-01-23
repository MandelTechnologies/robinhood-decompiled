package com.robinhood.analytics;

import com.robinhood.analytics.experiments.ExperimentExposureLogger;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: RealExperimentExposureLogger.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B#\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000RN\u0010\n\u001aB\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f\u0012\f\u0012\n \r*\u0004\u0018\u00010\u000e0\u000e \r* \u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f\u0012\f\u0012\n \r*\u0004\u0018\u00010\u000e0\u000e\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/analytics/RealExperimentExposureLogger;", "Lcom/robinhood/analytics/experiments/ExperimentExposureLogger;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "sessionManager", "Lcom/robinhood/analytics/SessionManager;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/analytics/SessionManager;)V", "triggersInSession", "Ljava/util/concurrent/ConcurrentHashMap$KeySetView;", "Lcom/robinhood/analytics/RealExperimentExposureLogger$Trigger;", "kotlin.jvm.PlatformType", "", "logExposure", "", "experimentName", "", "variant", "Trigger", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RealExperimentExposureLogger implements ExperimentExposureLogger {
    private final CoroutineScope coroutineScope;
    private final EventLogger eventLogger;
    private final ConcurrentHashMap.KeySetView<Trigger, Boolean> triggersInSession;

    public RealExperimentExposureLogger(@RootCoroutineScope CoroutineScope coroutineScope, EventLogger eventLogger, SessionManager sessionManager) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        this.coroutineScope = coroutineScope;
        this.eventLogger = eventLogger;
        this.triggersInSession = ConcurrentHashMap.newKeySet();
        Flow flowOnEach = FlowKt.onEach(sessionManager.getSessionId(), new C73131(null));
        String simpleName = RealExperimentExposureLogger.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        FlowKt.launchIn(flowOnEach, CoroutineScope2.plus(coroutineScope, new CoroutineName(simpleName)));
    }

    /* compiled from: RealExperimentExposureLogger.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "sessionId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.RealExperimentExposureLogger$1", m3645f = "RealExperimentExposureLogger.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.RealExperimentExposureLogger$1 */
    static final class C73131 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C73131(Continuation<? super C73131> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C73131 c73131 = RealExperimentExposureLogger.this.new C73131(continuation);
            c73131.L$0 = obj;
            return c73131;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UUID uuid, Continuation<? super Unit> continuation) {
            return ((C73131) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (((UUID) this.L$0) == null) {
                RealExperimentExposureLogger.this.triggersInSession.clear();
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.analytics.experiments.ExperimentExposureLogger
    public void logExposure(String experimentName, String variant) {
        Intrinsics.checkNotNullParameter(experimentName, "experimentName");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Trigger trigger = new Trigger(experimentName, variant);
        if (this.triggersInSession.contains(trigger)) {
            return;
        }
        this.eventLogger.logExperimentExposure(experimentName, variant);
        ConcurrentHashMap.KeySetView<Trigger, Boolean> triggersInSession = this.triggersInSession;
        Intrinsics.checkNotNullExpressionValue(triggersInSession, "triggersInSession");
        triggersInSession.add(trigger);
    }

    /* compiled from: RealExperimentExposureLogger.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/analytics/RealExperimentExposureLogger$Trigger;", "", "experimentName", "", "variant", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getExperimentName", "()Ljava/lang/String;", "getVariant", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final /* data */ class Trigger {
        private final String experimentName;
        private final String variant;

        public static /* synthetic */ Trigger copy$default(Trigger trigger, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = trigger.experimentName;
            }
            if ((i & 2) != 0) {
                str2 = trigger.variant;
            }
            return trigger.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getExperimentName() {
            return this.experimentName;
        }

        /* renamed from: component2, reason: from getter */
        public final String getVariant() {
            return this.variant;
        }

        public final Trigger copy(String experimentName, String variant) {
            Intrinsics.checkNotNullParameter(experimentName, "experimentName");
            Intrinsics.checkNotNullParameter(variant, "variant");
            return new Trigger(experimentName, variant);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Trigger)) {
                return false;
            }
            Trigger trigger = (Trigger) other;
            return Intrinsics.areEqual(this.experimentName, trigger.experimentName) && Intrinsics.areEqual(this.variant, trigger.variant);
        }

        public int hashCode() {
            return (this.experimentName.hashCode() * 31) + this.variant.hashCode();
        }

        public String toString() {
            return "Trigger(experimentName=" + this.experimentName + ", variant=" + this.variant + ")";
        }

        public Trigger(String experimentName, String variant) {
            Intrinsics.checkNotNullParameter(experimentName, "experimentName");
            Intrinsics.checkNotNullParameter(variant, "variant");
            this.experimentName = experimentName;
            this.variant = variant;
        }

        public final String getExperimentName() {
            return this.experimentName;
        }

        public final String getVariant() {
            return this.variant;
        }
    }
}

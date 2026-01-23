package com.robinhood.android.compose.autoeventlogging;

import com.robinhood.android.autoeventlogging.PerformanceIndicator;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.models.p320db.KaizenExperiment;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: PerformanceIndicatorDispatcher.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0000¢\u0006\u0002\b\u0014JA\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000b2/\u0010\u0017\u001a+\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\u0018j\u0002`\u001b¢\u0006\u0002\b\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/compose/autoeventlogging/PerformanceIndicatorDispatcher;", "", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "contextualId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/android/performancelogger/PerformanceLogger;Ljava/util/UUID;)V", "mutablePerformanceIndicators", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "Lcom/robinhood/android/autoeventlogging/PerformanceIndicator;", "performanceIndicators", "Lkotlinx/coroutines/flow/StateFlow;", "getPerformanceIndicators", "()Lkotlinx/coroutines/flow/StateFlow;", "addPerformanceIndicator", "", "indicator", "addPerformanceIndicator$lib_compose_auto_event_logging_externalDebug", "logPerformance", "identifier", KaizenExperiment.VARIATION_MEMBER, "Lkotlin/Function4;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "Lkotlin/ExtensionFunctionType;", "Lcom/robinhood/android/compose/autoeventlogging/LoggerMember;", "Factory", "lib-compose-auto-event-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PerformanceIndicatorDispatcher {
    public static final int $stable = 8;
    private final UUID contextualId;
    private final StateFlow2<Map<String, PerformanceIndicator>> mutablePerformanceIndicators;
    private final StateFlow<Map<String, PerformanceIndicator>> performanceIndicators;
    private final PerformanceLogger performanceLogger;

    /* compiled from: PerformanceIndicatorDispatcher.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/compose/autoeventlogging/PerformanceIndicatorDispatcher$Factory;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/compose/autoeventlogging/PerformanceIndicatorDispatcher;", "contextualId", "Ljava/util/UUID;", "lib-compose-auto-event-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Factory {
        PerformanceIndicatorDispatcher create(UUID contextualId);
    }

    /* compiled from: PerformanceIndicatorDispatcher.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PerformanceIndicator.State.values().length];
            try {
                iArr[PerformanceIndicator.State.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PerformanceIndicator.State.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PerformanceIndicator.State.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PerformanceIndicatorDispatcher(PerformanceLogger performanceLogger, UUID contextualId) {
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(contextualId, "contextualId");
        this.performanceLogger = performanceLogger;
        this.contextualId = contextualId;
        StateFlow2<Map<String, PerformanceIndicator>> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(MapsKt.emptyMap());
        this.mutablePerformanceIndicators = stateFlow2MutableStateFlow;
        this.performanceIndicators = FlowKt.asStateFlow(stateFlow2MutableStateFlow);
    }

    public final StateFlow<Map<String, PerformanceIndicator>> getPerformanceIndicators() {
        return this.performanceIndicators;
    }

    /* renamed from: addPerformanceIndicator$lib_compose_auto_event_logging_externalDebug */
    public final void m1856xa9ae39e(PerformanceIndicator indicator) {
        Map<String, PerformanceIndicator> value;
        Map<String, PerformanceIndicator> map;
        String identifier;
        PerformanceIndicator performanceIndicator;
        Intrinsics.checkNotNullParameter(indicator, "indicator");
        StateFlow2<Map<String, PerformanceIndicator>> stateFlow2 = this.mutablePerformanceIndicators;
        do {
            value = stateFlow2.getValue();
            map = value;
            identifier = indicator.getIdentifier();
            PerformanceIndicator performanceIndicator2 = map.get(identifier);
            if (performanceIndicator2 == null) {
                performanceIndicator = indicator;
            } else {
                PerformanceIndicator.State state = performanceIndicator2.getState();
                int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i == 1) {
                    state = indicator.getState();
                } else if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                performanceIndicator = new PerformanceIndicator(identifier, state);
            }
        } while (!stateFlow2.compareAndSet(value, MapsKt.plus(map, Tuples4.m3642to(identifier, performanceIndicator))));
        if (Intrinsics.areEqual(indicator, map.get(indicator.getIdentifier()))) {
            return;
        }
        logPerformance(indicator.getIdentifier(), PerformanceIndicatorDispatcher2.getLoggerMember(indicator.getState()));
    }

    private final void logPerformance(String identifier, Function4<? super PerformanceLogger, ? super PerformanceMetricEventData.Name, ? super UUID, ? super String, Unit> member) {
        member.invoke(this.performanceLogger, PerformanceMetricEventData.Name.SCREEN_LOAD, this.contextualId, "PerformanceIndicator(" + identifier + ")");
    }
}

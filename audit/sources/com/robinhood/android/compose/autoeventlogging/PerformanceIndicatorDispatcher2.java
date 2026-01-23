package com.robinhood.android.compose.autoeventlogging;

import com.robinhood.android.autoeventlogging.PerformanceIndicator;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* compiled from: PerformanceIndicatorDispatcher.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"A\u0010\b\u001a+\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\t¢\u0006\u0002\b\u0007*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f*V\b\u0002\u0010\u0000\"'\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001¢\u0006\u0002\b\u00072'\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001¢\u0006\u0002\b\u0007¨\u0006\r"}, m3636d2 = {"LoggerMember", "Lkotlin/Function4;", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "Ljava/util/UUID;", "", "", "Lkotlin/ExtensionFunctionType;", "loggerMember", "Lcom/robinhood/android/compose/autoeventlogging/LoggerMember;", "Lcom/robinhood/android/autoeventlogging/PerformanceIndicator$State;", "getLoggerMember", "(Lcom/robinhood/android/autoeventlogging/PerformanceIndicator$State;)Lkotlin/jvm/functions/Function4;", "lib-compose-auto-event-logging_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.compose.autoeventlogging.PerformanceIndicatorDispatcherKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class PerformanceIndicatorDispatcher2 {

    /* compiled from: PerformanceIndicatorDispatcher.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.compose.autoeventlogging.PerformanceIndicatorDispatcherKt$WhenMappings */
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function4<PerformanceLogger, PerformanceMetricEventData.Name, UUID, String, Unit> getLoggerMember(PerformanceIndicator.State state) {
        int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1) {
            return PerformanceIndicatorDispatcher3.INSTANCE;
        }
        if (i == 2) {
            return PerformanceIndicatorDispatcher4.INSTANCE;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return PerformanceIndicatorDispatcher5.INSTANCE;
    }
}

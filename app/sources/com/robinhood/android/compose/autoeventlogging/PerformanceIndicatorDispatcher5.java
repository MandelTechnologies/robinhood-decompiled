package com.robinhood.android.compose.autoeventlogging;

import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerformanceIndicatorDispatcher.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.compose.autoeventlogging.PerformanceIndicatorDispatcherKt$loggerMember$3, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class PerformanceIndicatorDispatcher5 extends FunctionReferenceImpl implements Function4<PerformanceLogger, PerformanceMetricEventData.Name, UUID, String, Unit> {
    public static final PerformanceIndicatorDispatcher5 INSTANCE = new PerformanceIndicatorDispatcher5();

    PerformanceIndicatorDispatcher5() {
        super(4, PerformanceLogger.class, "completeSpan", "completeSpan(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;Ljava/util/UUID;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(PerformanceLogger performanceLogger, PerformanceMetricEventData.Name name, UUID uuid, String str) {
        invoke2(performanceLogger, name, uuid, str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PerformanceLogger p0, PerformanceMetricEventData.Name p1, UUID uuid, String p3) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        Intrinsics.checkNotNullParameter(p3, "p3");
        p0.completeSpan(p1, uuid, p3);
    }
}

package com.robinhood.android.compose.autoeventlogging;

import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerformanceIndicatorDispatcher.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.compose.autoeventlogging.PerformanceIndicatorDispatcherKt$loggerMember$1, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class PerformanceIndicatorDispatcher3 extends AdaptedFunctionReference implements Function4<PerformanceLogger, PerformanceMetricEventData.Name, UUID, String, Unit> {
    public static final PerformanceIndicatorDispatcher3 INSTANCE = new PerformanceIndicatorDispatcher3();

    PerformanceIndicatorDispatcher3() {
        super(4, PerformanceLogger.class, "beginSpan", "beginSpan(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Context;)V", 0);
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
        PerformanceLogger.DefaultImpls.beginSpan$default(p0, p1, uuid, p3, null, 8, null);
    }
}

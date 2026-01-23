package io.bitdrift.capture.events.performance;

import com.robinhood.android.eventcontracts.analytics.EventAnalyticsString;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResourceUtilizationTarget.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a8\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H\u0000¨\u0006\u0005"}, m3636d2 = {"putPair", "", "", EventAnalyticsString.CONTROL_CONTRACT_SELECTOR_PAIR_MODE, "Lkotlin/Pair;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: io.bitdrift.capture.events.performance.ResourceUtilizationTargetKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ResourceUtilizationTarget2 {
    public static final Map<String, String> putPair(Map<String, String> map, Tuples2<String, String> pair) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pair, "pair");
        map.put(pair.getFirst(), pair.getSecond());
        return map;
    }
}

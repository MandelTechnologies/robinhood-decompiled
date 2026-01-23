package com.robinhood.rosetta.converters.retirement;

import com.robinhood.android.models.retirement.api.analytics.RecommendationsState;
import com.robinhood.rosetta.eventlogging.RecsRetirementContext;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toProtoBuf", "Lcom/robinhood/rosetta/eventlogging/RecsRetirementContext$RecommendationsState;", "Lcom/robinhood/android/models/retirement/api/analytics/RecommendationsState;", "lib-rosetta-converters_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rosetta.converters.retirement.RecommendationsStateKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class RecommendationsState2 {

    /* compiled from: RecommendationsState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.rosetta.converters.retirement.RecommendationsStateKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecommendationsState.values().length];
            try {
                iArr[RecommendationsState.INVESTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecommendationsState.NOT_INVESTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecommendationsState.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final RecsRetirementContext.RecommendationsState toProtoBuf(RecommendationsState recommendationsState) {
        Intrinsics.checkNotNullParameter(recommendationsState, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[recommendationsState.ordinal()];
        if (i == 1) {
            return RecsRetirementContext.RecommendationsState.RECS_INVESTED;
        }
        if (i == 2) {
            return RecsRetirementContext.RecommendationsState.NON_RECS_INVESTED;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return RecsRetirementContext.RecommendationsState.RECOMMENDATIONS_STATE_UNSPECIFIED;
    }
}

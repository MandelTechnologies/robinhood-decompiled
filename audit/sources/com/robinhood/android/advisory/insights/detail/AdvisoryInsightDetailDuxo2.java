package com.robinhood.android.advisory.insights.detail;

import com.robinhood.android.advisory.contracts.InsightNavArg;
import com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsight;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AdvisoryInsightDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailDuxo$DisplayTarget;", "nav", "Lcom/robinhood/android/advisory/contracts/InsightNavArg;", "children", "", "Lcom/robinhood/models/advisory/db/insights/AdvisoryInsight;", "childIdx", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$displayedTargetFlow$1", m3645f = "AdvisoryInsightDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$displayedTargetFlow$1, reason: use source file name */
/* loaded from: classes7.dex */
final class AdvisoryInsightDetailDuxo2 extends ContinuationImpl7 implements Function4<InsightNavArg, List<? extends AdvisoryInsight>, Integer, Continuation<? super AdvisoryInsightDetailDuxo.DisplayTarget>, Object> {
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* compiled from: AdvisoryInsightDetailDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$displayedTargetFlow$1$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdvisoryInsight.PageType.values().length];
            try {
                iArr[AdvisoryInsight.PageType.MULTI_PAGE_PARENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    AdvisoryInsightDetailDuxo2(Continuation<? super AdvisoryInsightDetailDuxo2> continuation) {
        super(4, continuation);
    }

    public final Object invoke(InsightNavArg insightNavArg, List<AdvisoryInsight> list, int i, Continuation<? super AdvisoryInsightDetailDuxo.DisplayTarget> continuation) {
        AdvisoryInsightDetailDuxo2 advisoryInsightDetailDuxo2 = new AdvisoryInsightDetailDuxo2(continuation);
        advisoryInsightDetailDuxo2.L$0 = insightNavArg;
        advisoryInsightDetailDuxo2.L$1 = list;
        advisoryInsightDetailDuxo2.I$0 = i;
        return advisoryInsightDetailDuxo2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(InsightNavArg insightNavArg, List<? extends AdvisoryInsight> list, Integer num, Continuation<? super AdvisoryInsightDetailDuxo.DisplayTarget> continuation) {
        return invoke(insightNavArg, (List<AdvisoryInsight>) list, num.intValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InsightNavArg insightNavArg = (InsightNavArg) this.L$0;
        List list = (List) this.L$1;
        int i = this.I$0;
        if (WhenMappings.$EnumSwitchMapping$0[insightNavArg.getPageType().ordinal()] == 1) {
            AdvisoryInsight advisoryInsight = (AdvisoryInsight) CollectionsKt.getOrNull(list, i);
            if (advisoryInsight != null) {
                return new AdvisoryInsightDetailDuxo.DisplayTarget.Cached(advisoryInsight);
            }
            return null;
        }
        return new AdvisoryInsightDetailDuxo.DisplayTarget.Fetch(insightNavArg.getId());
    }
}

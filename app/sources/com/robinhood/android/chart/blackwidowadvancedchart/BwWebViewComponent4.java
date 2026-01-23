package com.robinhood.android.chart.blackwidowadvancedchart;

import black_widow.contracts.mobile_app_chart.proto.p024v1.IntervalDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.TimeSpanDto;
import com.robinhood.android.chart.blackwidowadvancedchart.models.SpanIntervalData;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function5;

/* compiled from: BwWebViewComponent.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u001a\u0010\b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\tH\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/SpanIntervalData;", "currentSpan", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TimeSpanDto;", "currentInterval", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IntervalDto;", "timeSpans", "", "intervals", "", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$spanIntervalData$2", m3645f = "BwWebViewComponent.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$spanIntervalData$2, reason: use source file name */
/* loaded from: classes7.dex */
final class BwWebViewComponent4 extends ContinuationImpl7 implements Function5<TimeSpanDto, IntervalDto, List<? extends TimeSpanDto>, Map<String, ? extends List<? extends IntervalDto>>, Continuation<? super SpanIntervalData>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;
    final /* synthetic */ BwWebViewComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BwWebViewComponent4(BwWebViewComponent bwWebViewComponent, Continuation<? super BwWebViewComponent4> continuation) {
        super(5, continuation);
        this.this$0 = bwWebViewComponent;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(TimeSpanDto timeSpanDto, IntervalDto intervalDto, List<TimeSpanDto> list, Map<String, ? extends List<IntervalDto>> map, Continuation<? super SpanIntervalData> continuation) {
        BwWebViewComponent4 bwWebViewComponent4 = new BwWebViewComponent4(this.this$0, continuation);
        bwWebViewComponent4.L$0 = timeSpanDto;
        bwWebViewComponent4.L$1 = intervalDto;
        bwWebViewComponent4.L$2 = list;
        bwWebViewComponent4.L$3 = map;
        return bwWebViewComponent4.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Object invoke(TimeSpanDto timeSpanDto, IntervalDto intervalDto, List<? extends TimeSpanDto> list, Map<String, ? extends List<? extends IntervalDto>> map, Continuation<? super SpanIntervalData> continuation) {
        return invoke2(timeSpanDto, intervalDto, (List<TimeSpanDto>) list, (Map<String, ? extends List<IntervalDto>>) map, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        TimeSpanDto timeSpanDto = (TimeSpanDto) this.L$0;
        IntervalDto intervalDto = (IntervalDto) this.L$1;
        List list = (List) this.L$2;
        List list2 = (List) ((Map) this.L$3).get(timeSpanDto.getId());
        if (list2 == null) {
            return null;
        }
        BwWebViewComponent bwWebViewComponent = this.this$0;
        IntervalDto intervalDto2 = (IntervalDto) bwWebViewComponent.getSpanIntervalCache().get(timeSpanDto.getId());
        if (intervalDto2 != null && list2.contains(intervalDto2)) {
            return new SpanIntervalData(timeSpanDto, intervalDto2, list, list2);
        }
        if (list2.contains(intervalDto)) {
            return new SpanIntervalData(timeSpanDto, intervalDto, list, list2);
        }
        IntervalDto intervalDto3 = (IntervalDto) CollectionsKt.first(list2);
        bwWebViewComponent.setChartInterval(intervalDto3);
        return new SpanIntervalData(timeSpanDto, intervalDto3, list, list2);
    }
}

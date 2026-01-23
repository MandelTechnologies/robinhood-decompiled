package com.robinhood.android.options.p208ui.chart;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.charts.cursor.CursorRowModifiers;
import com.robinhood.android.options.p208ui.detail.OptionsDetailPageLoggings;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionHistoricalChartHeader.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.ui.chart.OptionHistoricalChartHeaderKt$OptionHistoricalChartHeader$1$2$1", m3645f = "OptionHistoricalChartHeader.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.options.ui.chart.OptionHistoricalChartHeaderKt$OptionHistoricalChartHeader$1$2$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionHistoricalChartHeader2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ CursorRowModifiers.TertiaryValueTooltip $tertiaryValueTooltip;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionHistoricalChartHeader2(CursorRowModifiers.TertiaryValueTooltip tertiaryValueTooltip, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Continuation<? super OptionHistoricalChartHeader2> continuation) {
        super(2, continuation);
        this.$tertiaryValueTooltip = tertiaryValueTooltip;
        this.$eventLogger = eventLogger;
        this.$eventDescriptor = userInteractionEventDescriptor;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionHistoricalChartHeader2(this.$tertiaryValueTooltip, this.$eventLogger, this.$eventDescriptor, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionHistoricalChartHeader2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$tertiaryValueTooltip != null) {
            OptionsDetailPageLoggings.logIndexCurbTooltipAppear(this.$eventLogger, this.$eventDescriptor.getScreen(), this.$eventDescriptor.getContext());
        }
        return Unit.INSTANCE;
    }
}

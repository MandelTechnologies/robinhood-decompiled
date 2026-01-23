package com.robinhood.android.chart.blackwidowadvancedchart;

import black_widow.contracts.mobile_app_chart.proto.p024v1.AdvancedChartClosedEvent;
import black_widow.contracts.mobile_app_chart.proto.p024v1.AdvancedChartOpenedEvent;
import black_widow.contracts.mobile_app_chart.proto.p024v1.DeleteIndicatorTemplateAction;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorTemplateAction;
import black_widow.contracts.mobile_app_chart.proto.p024v1.InitializeChartApp;
import black_widow.contracts.mobile_app_chart.proto.p024v1.OrderCancelledEvent;
import black_widow.contracts.mobile_app_chart.proto.p024v1.OrderEditedEvent;
import black_widow.contracts.mobile_app_chart.proto.p024v1.OrderFailedToCancelEvent;
import black_widow.contracts.mobile_app_chart.proto.p024v1.OrderFailedToEditEvent;
import black_widow.contracts.mobile_app_chart.proto.p024v1.OrderFailedToSubmitEvent;
import black_widow.contracts.mobile_app_chart.proto.p024v1.OrderSubmittedEvent;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetChartSetting;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetIndicatorLegendCollapsed;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetIndicatorTemplateAction;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetInterval;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetTimeSpan;
import black_widow.contracts.mobile_app_chart.proto.p024v1.TemplateDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.WebBlackWidowChartMessage;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;

/* compiled from: BlackWidowAdvancedChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$deleteTemplate$1$2", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {WaitlistAnimationConstants.RIGHT_YAW_END}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$deleteTemplate$1$2, reason: use source file name */
/* loaded from: classes7.dex */
final class BlackWidowAdvancedChartDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TemplateDto $template;
    int label;
    final /* synthetic */ BlackWidowAdvancedChartDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BlackWidowAdvancedChartDuxo3(BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo, TemplateDto templateDto, Continuation<? super BlackWidowAdvancedChartDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = blackWidowAdvancedChartDuxo;
        this.$template = templateDto;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BlackWidowAdvancedChartDuxo3(this.this$0, this.$template, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BlackWidowAdvancedChartDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            BwWebViewManager bwWebViewManager = this.this$0.getBwWebViewManager();
            Object[] objArr = 0 == true ? 1 : 0;
            InitializeChartApp initializeChartApp = null;
            SetTimeSpan setTimeSpan = null;
            SetInterval setInterval = null;
            SetChartSetting setChartSetting = null;
            OrderSubmittedEvent orderSubmittedEvent = null;
            OrderEditedEvent orderEditedEvent = null;
            OrderFailedToSubmitEvent orderFailedToSubmitEvent = null;
            SetIndicatorLegendCollapsed setIndicatorLegendCollapsed = null;
            AdvancedChartOpenedEvent advancedChartOpenedEvent = null;
            OrderFailedToEditEvent orderFailedToEditEvent = null;
            OrderCancelledEvent orderCancelledEvent = null;
            OrderFailedToCancelEvent orderFailedToCancelEvent = null;
            AdvancedChartClosedEvent advancedChartClosedEvent = null;
            ByteString byteString = null;
            Object[] objArr2 = 0 == true ? 1 : 0;
            Object[] objArr3 = 0 == true ? 1 : 0;
            Object[] objArr4 = 0 == true ? 1 : 0;
            Object[] objArr5 = 0 == true ? 1 : 0;
            Object[] objArr6 = 0 == true ? 1 : 0;
            WebBlackWidowChartMessage webBlackWidowChartMessage = new WebBlackWidowChartMessage(initializeChartApp, setTimeSpan, setInterval, objArr2, setChartSetting, objArr4, objArr5, objArr6, new SetIndicatorTemplateAction(this.$template.getId(), new IndicatorTemplateAction(null, new DeleteIndicatorTemplateAction(null, 1, null), null, null, null, 29, null), objArr, 4, 0 == true ? 1 : 0), objArr3, orderSubmittedEvent, orderEditedEvent, orderFailedToSubmitEvent, setIndicatorLegendCollapsed, advancedChartOpenedEvent, orderFailedToEditEvent, orderCancelledEvent, orderFailedToCancelEvent, advancedChartClosedEvent, byteString, 1048319, null);
            this.label = 1;
            if (bwWebViewManager.sendMessage(webBlackWidowChartMessage, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}

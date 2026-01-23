package com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators;

import androidx.compose.material3.SnackbarHostState;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorDto;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.ChartSnackbarVisuals;
import com.robinhood.android.chart.libblackwidowadvancedchart.C10963R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AddIndicatorScreen.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$indicatorSelected$1$1$1", m3645f = "AddIndicatorScreen.kt", m3646l = {90}, m3647m = "invokeSuspend")
/* loaded from: classes7.dex */
final class AddIndicatorScreenKt$AddIndicatorScreen$indicatorSelected$1$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ IndicatorDto $indicator;
    final /* synthetic */ SnackbarHostState $snackbarHostState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddIndicatorScreenKt$AddIndicatorScreen$indicatorSelected$1$1$1(SnackbarHostState snackbarHostState, IndicatorDto indicatorDto, Continuation<? super AddIndicatorScreenKt$AddIndicatorScreen$indicatorSelected$1$1$1> continuation) {
        super(2, continuation);
        this.$snackbarHostState = snackbarHostState;
        this.$indicator = indicatorDto;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddIndicatorScreenKt$AddIndicatorScreen$indicatorSelected$1$1$1(this.$snackbarHostState, this.$indicator, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddIndicatorScreenKt$AddIndicatorScreen$indicatorSelected$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SnackbarHostState snackbarHostState = this.$snackbarHostState;
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.CHECKMARK_16;
            StringResource.Companion companion = StringResource.INSTANCE;
            int i2 = C10963R.string.indicators_added_snackbar_message;
            String abbr = this.$indicator.getAbbr();
            IndicatorDto indicatorDto = this.$indicator;
            if (StringsKt.isBlank(abbr)) {
                abbr = indicatorDto.getTitle();
            }
            ChartSnackbarVisuals chartSnackbarVisuals = new ChartSnackbarVisuals(serverToBentoAssetMapper2, companion.invoke(i2, abbr), null, null, null, 28, null);
            this.label = 1;
            if (snackbarHostState.showSnackbar(chartSnackbarVisuals, this) == coroutine_suspended) {
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

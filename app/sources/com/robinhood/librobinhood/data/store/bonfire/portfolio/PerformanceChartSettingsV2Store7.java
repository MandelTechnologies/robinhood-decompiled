package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.models.portfolio.api.ApiPerformanceChartSettingsV2;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartSettingsV2Store2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PerformanceChartSettingsV2Store.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartSettingsV2HelperStore$updateSettings$1", m3645f = "PerformanceChartSettingsV2Store.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartSettingsV2HelperStore$updateSettings$1, reason: use source file name */
/* loaded from: classes13.dex */
final class PerformanceChartSettingsV2Store7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountNumber;
    final /* synthetic */ String $chartType;
    final /* synthetic */ ApiPerformanceChartSettingsV2 $updateModel;
    int label;
    final /* synthetic */ PerformanceChartSettingsV2Store2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerformanceChartSettingsV2Store7(PerformanceChartSettingsV2Store2 performanceChartSettingsV2Store2, String str, String str2, ApiPerformanceChartSettingsV2 apiPerformanceChartSettingsV2, Continuation<? super PerformanceChartSettingsV2Store7> continuation) {
        super(2, continuation);
        this.this$0 = performanceChartSettingsV2Store2;
        this.$accountNumber = str;
        this.$chartType = str2;
        this.$updateModel = apiPerformanceChartSettingsV2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PerformanceChartSettingsV2Store7(this.this$0, this.$accountNumber, this.$chartType, this.$updateModel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PerformanceChartSettingsV2Store7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PostEndpoint postEndpoint = this.this$0.postSettingsEndpoint;
            PerformanceChartSettingsV2Store2.SettingsUpdateParams settingsUpdateParams = new PerformanceChartSettingsV2Store2.SettingsUpdateParams(this.$accountNumber, this.$chartType, this.$updateModel);
            this.label = 1;
            if (PostEndpoint.DefaultImpls.post$default(postEndpoint, settingsUpdateParams, null, this, 2, null) == coroutine_suspended) {
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

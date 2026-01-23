package com.robinhood.librobinhood.data.store;

import com.robinhood.models.p320db.OptionChainSettingsTableMetric2;
import com.robinhood.models.p320db.OptionChainSettingsTableMetricsUpdate;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import options_product.service.ChainCustomization;
import options_product.service.SbsChainCustomizationResponseDto;
import options_product.service.UpdateSbsChainCustomizationRequestDto;

/* compiled from: OptionSideBySideChainStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Loptions_product/service/SbsChainCustomizationResponseDto;", "tableMetricsUpdate", "Lcom/robinhood/models/db/OptionChainSettingsTableMetricsUpdate;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionSideBySideChainStore$updateSbsChainCustomizationEndpoint$1", m3645f = "OptionSideBySideChainStore.kt", m3646l = {105}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class OptionSideBySideChainStore$updateSbsChainCustomizationEndpoint$1 extends ContinuationImpl7 implements Function2<OptionChainSettingsTableMetricsUpdate, Continuation<? super SbsChainCustomizationResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionSideBySideChainStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionSideBySideChainStore$updateSbsChainCustomizationEndpoint$1(OptionSideBySideChainStore optionSideBySideChainStore, Continuation<? super OptionSideBySideChainStore$updateSbsChainCustomizationEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = optionSideBySideChainStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionSideBySideChainStore$updateSbsChainCustomizationEndpoint$1 optionSideBySideChainStore$updateSbsChainCustomizationEndpoint$1 = new OptionSideBySideChainStore$updateSbsChainCustomizationEndpoint$1(this.this$0, continuation);
        optionSideBySideChainStore$updateSbsChainCustomizationEndpoint$1.L$0 = obj;
        return optionSideBySideChainStore$updateSbsChainCustomizationEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OptionChainSettingsTableMetricsUpdate optionChainSettingsTableMetricsUpdate, Continuation<? super SbsChainCustomizationResponseDto> continuation) {
        return ((OptionSideBySideChainStore$updateSbsChainCustomizationEndpoint$1) create(optionChainSettingsTableMetricsUpdate, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        OptionChainSettingsTableMetricsUpdate optionChainSettingsTableMetricsUpdate = (OptionChainSettingsTableMetricsUpdate) this.L$0;
        ChainCustomization chainCustomization = this.this$0.chainCustomizationService;
        UpdateSbsChainCustomizationRequestDto idlModel = OptionChainSettingsTableMetric2.toIdlModel(optionChainSettingsTableMetricsUpdate);
        this.label = 1;
        Object objUpdateSbsChainCustomization = chainCustomization.UpdateSbsChainCustomization(idlModel, this);
        return objUpdateSbsChainCustomization == coroutine_suspended ? coroutine_suspended : objUpdateSbsChainCustomization;
    }
}

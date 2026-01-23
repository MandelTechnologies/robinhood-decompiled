package com.robinhood.librobinhood.data.store;

import com.robinhood.models.p320db.OptionChainSettingsTableMetric2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import options_product.service.SbsChainCustomizationResponseDto;

/* compiled from: OptionSideBySideChainStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "requestTimestamp", "", "response", "Loptions_product/service/SbsChainCustomizationResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionSideBySideChainStore$getSbsChainCustomizationEndpoint$2", m3645f = "OptionSideBySideChainStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class OptionSideBySideChainStore$getSbsChainCustomizationEndpoint$2 extends ContinuationImpl7 implements Function3<Long, SbsChainCustomizationResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionSideBySideChainStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionSideBySideChainStore$getSbsChainCustomizationEndpoint$2(OptionSideBySideChainStore optionSideBySideChainStore, Continuation<? super OptionSideBySideChainStore$getSbsChainCustomizationEndpoint$2> continuation) {
        super(3, continuation);
        this.this$0 = optionSideBySideChainStore;
    }

    public final Object invoke(long j, SbsChainCustomizationResponseDto sbsChainCustomizationResponseDto, Continuation<? super Unit> continuation) {
        OptionSideBySideChainStore$getSbsChainCustomizationEndpoint$2 optionSideBySideChainStore$getSbsChainCustomizationEndpoint$2 = new OptionSideBySideChainStore$getSbsChainCustomizationEndpoint$2(this.this$0, continuation);
        optionSideBySideChainStore$getSbsChainCustomizationEndpoint$2.J$0 = j;
        optionSideBySideChainStore$getSbsChainCustomizationEndpoint$2.L$0 = sbsChainCustomizationResponseDto;
        return optionSideBySideChainStore$getSbsChainCustomizationEndpoint$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Long l, SbsChainCustomizationResponseDto sbsChainCustomizationResponseDto, Continuation<? super Unit> continuation) {
        return invoke(l.longValue(), sbsChainCustomizationResponseDto, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.J$0;
            this.this$0.optionChainSettingsTableMetricsDao.deleteStaleAndInsert(OptionChainSettingsTableMetric2.toDbModel((SbsChainCustomizationResponseDto) this.L$0, j));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

package com.robinhood.android.alldaytrading.infosheet.instrumentinfo;

import com.robinhood.android.alldaytrading.infosheet.instrumentinfo.datastate.AdtInstrumentInfoDataState;
import com.robinhood.models.alldaytrading.p305db.AdtInstrumentInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AdtInstrumentInfoDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/alldaytrading/infosheet/instrumentinfo/datastate/AdtInstrumentInfoDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.alldaytrading.infosheet.instrumentinfo.AdtInstrumentInfoDuxo$onStart$1$1", m3645f = "AdtInstrumentInfoDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.alldaytrading.infosheet.instrumentinfo.AdtInstrumentInfoDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class AdtInstrumentInfoDuxo2 extends ContinuationImpl7 implements Function2<AdtInstrumentInfoDataState, Continuation<? super AdtInstrumentInfoDataState>, Object> {
    final /* synthetic */ AdtInstrumentInfo $adtInstrumentInfo;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdtInstrumentInfoDuxo2(AdtInstrumentInfo adtInstrumentInfo, Continuation<? super AdtInstrumentInfoDuxo2> continuation) {
        super(2, continuation);
        this.$adtInstrumentInfo = adtInstrumentInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdtInstrumentInfoDuxo2 adtInstrumentInfoDuxo2 = new AdtInstrumentInfoDuxo2(this.$adtInstrumentInfo, continuation);
        adtInstrumentInfoDuxo2.L$0 = obj;
        return adtInstrumentInfoDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AdtInstrumentInfoDataState adtInstrumentInfoDataState, Continuation<? super AdtInstrumentInfoDataState> continuation) {
        return ((AdtInstrumentInfoDuxo2) create(adtInstrumentInfoDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((AdtInstrumentInfoDataState) this.L$0).copy(this.$adtInstrumentInfo.getContents());
    }
}

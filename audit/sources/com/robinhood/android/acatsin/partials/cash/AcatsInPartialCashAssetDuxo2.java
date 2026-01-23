package com.robinhood.android.acatsin.partials.cash;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AcatsInPartialCashAssetDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetDuxo$onStart$2$1", m3645f = "AcatsInPartialCashAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetDuxo$onStart$2$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsInPartialCashAssetDuxo2 extends ContinuationImpl7 implements Function2<AcatsInPartialCashAssetDataState, Continuation<? super AcatsInPartialCashAssetDataState>, Object> {
    final /* synthetic */ MarginSettings $marginSettings;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsInPartialCashAssetDuxo2(MarginSettings marginSettings, Continuation<? super AcatsInPartialCashAssetDuxo2> continuation) {
        super(2, continuation);
        this.$marginSettings = marginSettings;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsInPartialCashAssetDuxo2 acatsInPartialCashAssetDuxo2 = new AcatsInPartialCashAssetDuxo2(this.$marginSettings, continuation);
        acatsInPartialCashAssetDuxo2.L$0 = obj;
        return acatsInPartialCashAssetDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AcatsInPartialCashAssetDataState acatsInPartialCashAssetDataState, Continuation<? super AcatsInPartialCashAssetDataState> continuation) {
        return ((AcatsInPartialCashAssetDuxo2) create(acatsInPartialCashAssetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return AcatsInPartialCashAssetDataState.copy$default((AcatsInPartialCashAssetDataState) this.L$0, false, false, null, this.$marginSettings.isMarginInvestingEnabled(), null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null);
    }
}

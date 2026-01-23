package com.robinhood.android.engagement.infolandingpage;

import com.robinhood.models.api.rewardoffer.ApiRewardOfferDetails;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InfoLandingPageDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.engagement.infolandingpage.InfoLandingPageDuxo$onStart$1$2$1", m3645f = "InfoLandingPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.engagement.infolandingpage.InfoLandingPageDuxo$onStart$1$2$1, reason: use source file name */
/* loaded from: classes7.dex */
final class InfoLandingPageDuxo3 extends ContinuationImpl7 implements Function2<InfoLandingPageDataState, Continuation<? super InfoLandingPageDataState>, Object> {
    final /* synthetic */ ApiRewardOfferDetails $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InfoLandingPageDuxo3(ApiRewardOfferDetails apiRewardOfferDetails, Continuation<? super InfoLandingPageDuxo3> continuation) {
        super(2, continuation);
        this.$it = apiRewardOfferDetails;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InfoLandingPageDuxo3 infoLandingPageDuxo3 = new InfoLandingPageDuxo3(this.$it, continuation);
        infoLandingPageDuxo3.L$0 = obj;
        return infoLandingPageDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InfoLandingPageDataState infoLandingPageDataState, Continuation<? super InfoLandingPageDataState> continuation) {
        return ((InfoLandingPageDuxo3) create(infoLandingPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return InfoLandingPageDataState.copy$default((InfoLandingPageDataState) this.L$0, this.$it, null, 2, null);
    }
}

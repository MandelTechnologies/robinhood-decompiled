package com.robinhood.android.acatsin.brokeragesearch;

import com.robinhood.models.p320db.IacInfoBanner;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AcatsInBrokerageSearchDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchDuxo$onStart$2$1", m3645f = "AcatsInBrokerageSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchDuxo$onStart$2$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsInBrokerageSearchDuxo4 extends ContinuationImpl7 implements Function2<AcatsInBrokerageSearchDataState, Continuation<? super AcatsInBrokerageSearchDataState>, Object> {
    final /* synthetic */ IacInfoBanner $infoBanner;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsInBrokerageSearchDuxo4(IacInfoBanner iacInfoBanner, Continuation<? super AcatsInBrokerageSearchDuxo4> continuation) {
        super(2, continuation);
        this.$infoBanner = iacInfoBanner;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsInBrokerageSearchDuxo4 acatsInBrokerageSearchDuxo4 = new AcatsInBrokerageSearchDuxo4(this.$infoBanner, continuation);
        acatsInBrokerageSearchDuxo4.L$0 = obj;
        return acatsInBrokerageSearchDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AcatsInBrokerageSearchDataState acatsInBrokerageSearchDataState, Continuation<? super AcatsInBrokerageSearchDataState> continuation) {
        return ((AcatsInBrokerageSearchDuxo4) create(acatsInBrokerageSearchDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return AcatsInBrokerageSearchDataState.copy$default((AcatsInBrokerageSearchDataState) this.L$0, null, this.$infoBanner, false, 5, null);
    }
}

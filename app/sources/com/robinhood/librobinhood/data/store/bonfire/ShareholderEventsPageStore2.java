package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.shareholderx.ShareholderXApi;
import com.robinhood.librobinhood.data.store.bonfire.ShareholderEventsPageStore;
import com.robinhood.shareholderx.models.api.ApiShareholderEventsPage;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ShareholderEventsPageStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shareholderx/models/api/ApiShareholderEventsPage;", "params", "Lcom/robinhood/librobinhood/data/store/bonfire/ShareholderEventsPageStore$EventsPageParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.ShareholderEventsPageStore$eventsPageEndpoint$1", m3645f = "ShareholderEventsPageStore.kt", m3646l = {31}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.ShareholderEventsPageStore$eventsPageEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class ShareholderEventsPageStore2 extends ContinuationImpl7 implements Function2<ShareholderEventsPageStore.EventsPageParams, Continuation<? super ApiShareholderEventsPage>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ShareholderEventsPageStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShareholderEventsPageStore2(ShareholderEventsPageStore shareholderEventsPageStore, Continuation<? super ShareholderEventsPageStore2> continuation) {
        super(2, continuation);
        this.this$0 = shareholderEventsPageStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShareholderEventsPageStore2 shareholderEventsPageStore2 = new ShareholderEventsPageStore2(this.this$0, continuation);
        shareholderEventsPageStore2.L$0 = obj;
        return shareholderEventsPageStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ShareholderEventsPageStore.EventsPageParams eventsPageParams, Continuation<? super ApiShareholderEventsPage> continuation) {
        return ((ShareholderEventsPageStore2) create(eventsPageParams, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ShareholderEventsPageStore.EventsPageParams eventsPageParams = (ShareholderEventsPageStore.EventsPageParams) this.L$0;
        ShareholderXApi shareholderXApi = this.this$0.shareholderXApi;
        UUID instrumentId = eventsPageParams.getInstrumentId();
        String filter = eventsPageParams.getFilter();
        this.label = 1;
        Object shareholderQaEventsPage = shareholderXApi.getShareholderQaEventsPage(instrumentId, filter, this);
        return shareholderQaEventsPage == coroutine_suspended ? coroutine_suspended : shareholderQaEventsPage;
    }
}

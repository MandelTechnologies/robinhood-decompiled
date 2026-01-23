package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.librobinhood.data.store.bonfire.ShareholderEventsPageStore;
import com.robinhood.shareholderx.models.api.ApiShareholderEventsPage;
import com.robinhood.shareholderx.models.p401db.ShareholderEventsPage2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: ShareholderEventsPageStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "Lcom/robinhood/librobinhood/data/store/bonfire/ShareholderEventsPageStore$EventsPageParams;", "eventsPage", "Lcom/robinhood/shareholderx/models/api/ApiShareholderEventsPage;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.ShareholderEventsPageStore$eventsPageEndpoint$2", m3645f = "ShareholderEventsPageStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.ShareholderEventsPageStore$eventsPageEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class ShareholderEventsPageStore3 extends ContinuationImpl7 implements Function3<ShareholderEventsPageStore.EventsPageParams, ApiShareholderEventsPage, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ShareholderEventsPageStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShareholderEventsPageStore3(ShareholderEventsPageStore shareholderEventsPageStore, Continuation<? super ShareholderEventsPageStore3> continuation) {
        super(3, continuation);
        this.this$0 = shareholderEventsPageStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(ShareholderEventsPageStore.EventsPageParams eventsPageParams, ApiShareholderEventsPage apiShareholderEventsPage, Continuation<? super Unit> continuation) {
        ShareholderEventsPageStore3 shareholderEventsPageStore3 = new ShareholderEventsPageStore3(this.this$0, continuation);
        shareholderEventsPageStore3.L$0 = apiShareholderEventsPage;
        return shareholderEventsPageStore3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.dao.insert(ShareholderEventsPage2.toDbModel((ApiShareholderEventsPage) this.L$0));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

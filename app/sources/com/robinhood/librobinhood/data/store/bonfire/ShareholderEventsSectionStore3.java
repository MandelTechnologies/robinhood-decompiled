package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.shareholderx.models.api.ApiShareholderEventsSection;
import com.robinhood.shareholderx.models.p401db.ShareholderEventsSection2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ShareholderEventsSectionStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/shareholderx/models/api/ApiShareholderEventsSection;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.ShareholderEventsSectionStore$eventsEndpoint$2", m3645f = "ShareholderEventsSectionStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.ShareholderEventsSectionStore$eventsEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class ShareholderEventsSectionStore3 extends ContinuationImpl7 implements Function2<ApiShareholderEventsSection, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ShareholderEventsSectionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShareholderEventsSectionStore3(ShareholderEventsSectionStore shareholderEventsSectionStore, Continuation<? super ShareholderEventsSectionStore3> continuation) {
        super(2, continuation);
        this.this$0 = shareholderEventsSectionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShareholderEventsSectionStore3 shareholderEventsSectionStore3 = new ShareholderEventsSectionStore3(this.this$0, continuation);
        shareholderEventsSectionStore3.L$0 = obj;
        return shareholderEventsSectionStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiShareholderEventsSection apiShareholderEventsSection, Continuation<? super Unit> continuation) {
        return ((ShareholderEventsSectionStore3) create(apiShareholderEventsSection, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.dao.insert(ShareholderEventsSection2.toDbModel((ApiShareholderEventsSection) this.L$0));
        return Unit.INSTANCE;
    }
}

package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.shareholderx.ShareholderXApi;
import com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore;
import com.robinhood.shareholderx.models.api.ApiQaEventMetadata;
import com.robinhood.shareholderx.models.p401db.QaEventMetadata;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ShareholderExperienceStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shareholderx/models/db/QaEventMetadata;", "params", "Lcom/robinhood/librobinhood/data/store/bonfire/ShareholderExperienceStore$QaMetadataParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$metadataEndpoint$1", m3645f = "ShareholderExperienceStore.kt", m3646l = {55}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ShareholderExperienceStore$metadataEndpoint$1 extends ContinuationImpl7 implements Function2<ShareholderExperienceStore.QaMetadataParams, Continuation<? super QaEventMetadata>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ShareholderExperienceStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShareholderExperienceStore$metadataEndpoint$1(ShareholderExperienceStore shareholderExperienceStore, Continuation<? super ShareholderExperienceStore$metadataEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = shareholderExperienceStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShareholderExperienceStore$metadataEndpoint$1 shareholderExperienceStore$metadataEndpoint$1 = new ShareholderExperienceStore$metadataEndpoint$1(this.this$0, continuation);
        shareholderExperienceStore$metadataEndpoint$1.L$0 = obj;
        return shareholderExperienceStore$metadataEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ShareholderExperienceStore.QaMetadataParams qaMetadataParams, Continuation<? super QaEventMetadata> continuation) {
        return ((ShareholderExperienceStore$metadataEndpoint$1) create(qaMetadataParams, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ShareholderExperienceStore.QaMetadataParams qaMetadataParams = (ShareholderExperienceStore.QaMetadataParams) this.L$0;
            ShareholderXApi shareholderXApi = this.this$0.shareholderXApi;
            UUID instrumentId = qaMetadataParams.getInstrumentId();
            String eventSlug = qaMetadataParams.getEventSlug();
            this.label = 1;
            obj = shareholderXApi.getQaEventMetadata(instrumentId, eventSlug, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ((ApiQaEventMetadata) obj).toDbModel();
    }
}

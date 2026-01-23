package com.robinhood.android.acats.retries.activity;

import com.plaid.internal.EnumC7081g;
import com.robinhood.librobinhood.data.store.bonfire.AcatsTransferStore;
import com.robinhood.models.acats.p299db.bonfire.AcatsTransfer;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AcatsRetriesDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$submitRetry$2$1$1", m3645f = "AcatsRetriesDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$submitRetry$2$1$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsRetriesDuxo7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super AcatsTransfer>, Object> {
    final /* synthetic */ UUID $conflictingResourceId;
    int label;
    final /* synthetic */ AcatsRetriesDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsRetriesDuxo7(AcatsRetriesDuxo acatsRetriesDuxo, UUID uuid, Continuation<? super AcatsRetriesDuxo7> continuation) {
        super(2, continuation);
        this.this$0 = acatsRetriesDuxo;
        this.$conflictingResourceId = uuid;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AcatsRetriesDuxo7(this.this$0, this.$conflictingResourceId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AcatsTransfer> continuation) {
        return ((AcatsRetriesDuxo7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        AcatsTransferStore acatsTransferStore = this.this$0.acatsTransferStore;
        UUID uuid = this.$conflictingResourceId;
        this.label = 1;
        Object acatTransfer = acatsTransferStore.getAcatTransfer(uuid, this);
        return acatTransfer == coroutine_suspended ? coroutine_suspended : acatTransfer;
    }
}

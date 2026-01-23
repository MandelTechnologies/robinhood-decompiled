package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.acats.api.AcatsApi;
import com.robinhood.models.acats.p299db.bonfire.AcatsAccountContents;
import com.robinhood.models.acats.p299db.bonfire.AcatsAccountContents2;
import com.robinhood.models.api.bonfire.ApiAcatsAccountContentsResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AcatsBrokerageStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/acats/db/bonfire/AcatsAccountContents;", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.AcatsBrokerageStore$accountContentsEndpoint$1", m3645f = "AcatsBrokerageStore.kt", m3646l = {64}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsBrokerageStore$accountContentsEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class AcatsBrokerageStore2 extends ContinuationImpl7 implements Function2<String, Continuation<? super AcatsAccountContents>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AcatsBrokerageStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsBrokerageStore2(AcatsBrokerageStore acatsBrokerageStore, Continuation<? super AcatsBrokerageStore2> continuation) {
        super(2, continuation);
        this.this$0 = acatsBrokerageStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsBrokerageStore2 acatsBrokerageStore2 = new AcatsBrokerageStore2(this.this$0, continuation);
        acatsBrokerageStore2.L$0 = obj;
        return acatsBrokerageStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super AcatsAccountContents> continuation) {
        return ((AcatsBrokerageStore2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            AcatsApi acatsApi = this.this$0.acatsApi;
            this.label = 1;
            obj = acatsApi.getAccountContents(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return AcatsAccountContents2.toDbModel((ApiAcatsAccountContentsResponse) obj);
    }
}

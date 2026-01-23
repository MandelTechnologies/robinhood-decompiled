package com.robinhood.librobinhood.data.store.bonfire.slip;

import com.robinhood.api.retrofit.SlipApi;
import com.robinhood.models.api.ApiUpdatedAgreementsResponse;
import com.robinhood.models.p355ui.UiUpdatedAgreementsResponse;
import com.robinhood.models.p355ui.UiUpdatedAgreementsResponse2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SlipUpdatedAgreementsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/ui/UiUpdatedAgreementsResponse;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.slip.SlipUpdatedAgreementsStore$endpoint$1", m3645f = "SlipUpdatedAgreementsStore.kt", m3646l = {26}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.slip.SlipUpdatedAgreementsStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class SlipUpdatedAgreementsStore2 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super UiUpdatedAgreementsResponse>, Object> {
    int label;
    final /* synthetic */ SlipUpdatedAgreementsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SlipUpdatedAgreementsStore2(SlipUpdatedAgreementsStore slipUpdatedAgreementsStore, Continuation<? super SlipUpdatedAgreementsStore2> continuation) {
        super(2, continuation);
        this.this$0 = slipUpdatedAgreementsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SlipUpdatedAgreementsStore2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super UiUpdatedAgreementsResponse> continuation) {
        return ((SlipUpdatedAgreementsStore2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SlipApi slipApi = this.this$0.slipApi;
            this.label = 1;
            obj = slipApi.getSlipUpdatedAgreements(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return UiUpdatedAgreementsResponse2.toUiModel((ApiUpdatedAgreementsResponse) obj);
    }
}

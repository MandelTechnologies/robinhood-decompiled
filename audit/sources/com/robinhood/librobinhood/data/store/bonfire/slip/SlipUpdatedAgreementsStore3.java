package com.robinhood.librobinhood.data.store.bonfire.slip;

import com.robinhood.models.p355ui.UiUpdatedAgreementsResponse;
import com.robinhood.utils.Optional3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SlipUpdatedAgreementsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/ui/UiUpdatedAgreementsResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.slip.SlipUpdatedAgreementsStore$endpoint$2", m3645f = "SlipUpdatedAgreementsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.slip.SlipUpdatedAgreementsStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class SlipUpdatedAgreementsStore3 extends ContinuationImpl7 implements Function2<UiUpdatedAgreementsResponse, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SlipUpdatedAgreementsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SlipUpdatedAgreementsStore3(SlipUpdatedAgreementsStore slipUpdatedAgreementsStore, Continuation<? super SlipUpdatedAgreementsStore3> continuation) {
        super(2, continuation);
        this.this$0 = slipUpdatedAgreementsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SlipUpdatedAgreementsStore3 slipUpdatedAgreementsStore3 = new SlipUpdatedAgreementsStore3(this.this$0, continuation);
        slipUpdatedAgreementsStore3.L$0 = obj;
        return slipUpdatedAgreementsStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UiUpdatedAgreementsResponse uiUpdatedAgreementsResponse, Continuation<? super Unit> continuation) {
        return ((SlipUpdatedAgreementsStore3) create(uiUpdatedAgreementsResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.updatedAgreementsRelay.accept(Optional3.asOptional((UiUpdatedAgreementsResponse) this.L$0));
        return Unit.INSTANCE;
    }
}

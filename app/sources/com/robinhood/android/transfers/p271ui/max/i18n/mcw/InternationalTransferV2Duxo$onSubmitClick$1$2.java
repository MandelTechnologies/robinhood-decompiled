package com.robinhood.android.transfers.p271ui.max.i18n.mcw;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.transfers.p271ui.max.i18n.mcw.InternationalTransferV2Event;
import com.robinhood.models.api.bonfire.ApiCreateTransferResponse;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InternationalTransferV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$onSubmitClick$1$2", m3645f = "InternationalTransferV2Duxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes9.dex */
final class InternationalTransferV2Duxo$onSubmitClick$1$2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InternationalTransferV2DataState $state;
    int label;
    final /* synthetic */ InternationalTransferV2Duxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternationalTransferV2Duxo$onSubmitClick$1$2(InternationalTransferV2Duxo internationalTransferV2Duxo, InternationalTransferV2DataState internationalTransferV2DataState, Continuation<? super InternationalTransferV2Duxo$onSubmitClick$1$2> continuation) {
        super(2, continuation);
        this.this$0 = internationalTransferV2Duxo;
        this.$state = internationalTransferV2DataState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InternationalTransferV2Duxo$onSubmitClick$1$2(this.this$0, this.$state, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InternationalTransferV2Duxo$onSubmitClick$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object objM19870createTransfergIAlus$feature_transfers_externalRelease;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TransferRequestCreator transferRequestCreator = this.this$0.transferRequestCreator;
            TransferData transferData = this.$state.getTransferData();
            this.label = 1;
            objM19870createTransfergIAlus$feature_transfers_externalRelease = transferRequestCreator.m19870createTransfergIAlus$feature_transfers_externalRelease(transferData, this);
            if (objM19870createTransfergIAlus$feature_transfers_externalRelease == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM19870createTransfergIAlus$feature_transfers_externalRelease = ((Result) obj).getValue();
        }
        InternationalTransferV2Duxo internationalTransferV2Duxo = this.this$0;
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM19870createTransfergIAlus$feature_transfers_externalRelease);
        if (thM28553exceptionOrNullimpl == null) {
            internationalTransferV2Duxo.applyMutation(new InternationalTransferV2Duxo$onSubmitClick$1$2$1$1(null));
            internationalTransferV2Duxo.submit(new InternationalTransferV2Event.TransferCreated((ApiCreateTransferResponse) objM19870createTransfergIAlus$feature_transfers_externalRelease));
        } else {
            internationalTransferV2Duxo.applyMutation(new InternationalTransferV2Duxo$onSubmitClick$1$2$2$1(null));
            InternationalTransferV2Event internationalTransferV2EventExtractErrorEvent = InternationalTransferV2DuxoKt.extractErrorEvent(thM28553exceptionOrNullimpl);
            if (internationalTransferV2EventExtractErrorEvent != null) {
                internationalTransferV2Duxo.submit(internationalTransferV2EventExtractErrorEvent);
            }
        }
        return Unit.INSTANCE;
    }
}

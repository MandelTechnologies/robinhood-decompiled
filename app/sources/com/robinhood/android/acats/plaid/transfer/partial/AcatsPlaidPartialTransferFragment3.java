package com.robinhood.android.acats.plaid.transfer.partial;

import androidx.compose.material.ModalBottomSheetState;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AcatsPlaidPartialTransferFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferFragment$ComposeContent$12$1$1", m3645f = "AcatsPlaidPartialTransferFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferFragment$ComposeContent$12$1$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsPlaidPartialTransferFragment3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ModalBottomSheetState $confirmationBottomSheetState;
    final /* synthetic */ AcatsPlaidPartialTransferDuxo3 $it;
    int label;
    final /* synthetic */ AcatsPlaidPartialTransferFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsPlaidPartialTransferFragment3(AcatsPlaidPartialTransferFragment acatsPlaidPartialTransferFragment, AcatsPlaidPartialTransferDuxo3 acatsPlaidPartialTransferDuxo3, ModalBottomSheetState modalBottomSheetState, Continuation<? super AcatsPlaidPartialTransferFragment3> continuation) {
        super(2, continuation);
        this.this$0 = acatsPlaidPartialTransferFragment;
        this.$it = acatsPlaidPartialTransferDuxo3;
        this.$confirmationBottomSheetState = modalBottomSheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AcatsPlaidPartialTransferFragment3(this.this$0, this.$it, this.$confirmationBottomSheetState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AcatsPlaidPartialTransferFragment3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.getDuxo().removeAssetFromTransfer(this.$it);
            ModalBottomSheetState modalBottomSheetState = this.$confirmationBottomSheetState;
            this.label = 1;
            if (modalBottomSheetState.hide(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}

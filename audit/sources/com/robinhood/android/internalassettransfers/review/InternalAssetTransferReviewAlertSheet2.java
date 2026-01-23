package com.robinhood.android.internalassettransfers.review;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.SnapshotIntState2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InternalAssetTransferReviewAlertSheet.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewAlertSheetKt$PresubmitAlertSheet$1$1", m3645f = "InternalAssetTransferReviewAlertSheet.kt", m3646l = {38}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewAlertSheetKt$PresubmitAlertSheet$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class InternalAssetTransferReviewAlertSheet2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotIntState2 $currentAlertIndex$delegate;
    final /* synthetic */ SheetState $sheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalAssetTransferReviewAlertSheet2(SheetState sheetState, SnapshotIntState2 snapshotIntState2, Continuation<? super InternalAssetTransferReviewAlertSheet2> continuation) {
        super(2, continuation);
        this.$sheetState = sheetState;
        this.$currentAlertIndex$delegate = snapshotIntState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InternalAssetTransferReviewAlertSheet2(this.$sheetState, this.$currentAlertIndex$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InternalAssetTransferReviewAlertSheet2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.$currentAlertIndex$delegate.setIntValue(0);
            SheetState sheetState = this.$sheetState;
            this.label = 1;
            if (sheetState.show(this) == coroutine_suspended) {
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

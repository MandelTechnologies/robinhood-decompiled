package com.robinhood.android.acats.plaid.transfer.partial.edit;

import com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferAssetRowData;
import com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AcatsPlaidPartialTransferEditComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$AcatsPlaidPartialTransferEditComposable$1$1", m3645f = "AcatsPlaidPartialTransferEditComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$AcatsPlaidPartialTransferEditComposable$1$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsPlaidPartialTransferEditComposable2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AcatsPlaidPartialTransferEditDuxo $duxo;
    final /* synthetic */ AcatsPlaidPartialTransferAssetRowData $editAsset;
    final /* synthetic */ Function1<AcatsPlaidPartialTransferDuxo3, Unit> $onEditComplete;
    final /* synthetic */ Function1<AcatsPlaidPartialTransferDuxo3, Unit> $onRemove;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AcatsPlaidPartialTransferEditComposable2(AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo, AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, Function1<? super AcatsPlaidPartialTransferDuxo3, Unit> function1, Function1<? super AcatsPlaidPartialTransferDuxo3, Unit> function12, Continuation<? super AcatsPlaidPartialTransferEditComposable2> continuation) {
        super(2, continuation);
        this.$duxo = acatsPlaidPartialTransferEditDuxo;
        this.$editAsset = acatsPlaidPartialTransferAssetRowData;
        this.$onEditComplete = function1;
        this.$onRemove = function12;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AcatsPlaidPartialTransferEditComposable2(this.$duxo, this.$editAsset, this.$onEditComplete, this.$onRemove, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AcatsPlaidPartialTransferEditComposable2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$duxo.bind(this.$editAsset, this.$onEditComplete, this.$onRemove);
        return Unit.INSTANCE;
    }
}

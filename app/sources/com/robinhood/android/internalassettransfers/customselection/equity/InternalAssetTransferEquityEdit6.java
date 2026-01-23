package com.robinhood.android.internalassettransfers.customselection.equity;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InternalAssetTransferEquityEdit.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditKt$EquityEditMainContent$2$1$4$1", m3645f = "InternalAssetTransferEquityEdit.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditKt$EquityEditMainContent$2$1$4$1, reason: use source file name */
/* loaded from: classes10.dex */
final class InternalAssetTransferEquityEdit6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Boolean, Unit> $updateUserCurrentlyEditing;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    InternalAssetTransferEquityEdit6(Function1<? super Boolean, Unit> function1, Continuation<? super InternalAssetTransferEquityEdit6> continuation) {
        super(2, continuation);
        this.$updateUserCurrentlyEditing = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InternalAssetTransferEquityEdit6(this.$updateUserCurrentlyEditing, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InternalAssetTransferEquityEdit6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$updateUserCurrentlyEditing.invoke(boxing.boxBoolean(true));
        return Unit.INSTANCE;
    }
}

package com.robinhood.shared.crypto.transfer.verification.beneficiary;

import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BeneficiaryNameComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryNameComposableKt$BeneficiaryNameComposable$2$1", m3645f = "BeneficiaryNameComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryNameComposableKt$BeneficiaryNameComposable$2$1, reason: use source file name */
/* loaded from: classes6.dex */
final class BeneficiaryNameComposable3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ SnapshotState<Boolean> $requestFocus$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BeneficiaryNameComposable3(FocusRequester focusRequester, SnapshotState<Boolean> snapshotState, Continuation<? super BeneficiaryNameComposable3> continuation) {
        super(2, continuation);
        this.$focusRequester = focusRequester;
        this.$requestFocus$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BeneficiaryNameComposable3(this.$focusRequester, this.$requestFocus$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BeneficiaryNameComposable3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (BeneficiaryNameComposable.BeneficiaryNameComposable$lambda$13(this.$requestFocus$delegate)) {
                FocusRequester.m6497requestFocus3ESFkO8$default(this.$focusRequester, 0, 1, null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

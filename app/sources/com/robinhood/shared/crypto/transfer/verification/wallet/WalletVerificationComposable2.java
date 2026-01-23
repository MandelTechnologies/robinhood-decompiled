package com.robinhood.shared.crypto.transfer.verification.wallet;

import androidx.compose.runtime.SnapshotState;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WalletVerificationComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.wallet.WalletVerificationComposableKt$WalletVerificationComposable$1$1", m3645f = "WalletVerificationComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.crypto.transfer.verification.wallet.WalletVerificationComposableKt$WalletVerificationComposable$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class WalletVerificationComposable2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<UUID> $alreadyLaunchedForVerificationId$delegate;
    final /* synthetic */ WalletVerificationDuxo $duxo;
    final /* synthetic */ boolean $isDay;
    final /* synthetic */ UUID $verificationId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WalletVerificationComposable2(UUID uuid, WalletVerificationDuxo walletVerificationDuxo, boolean z, SnapshotState<UUID> snapshotState, Continuation<? super WalletVerificationComposable2> continuation) {
        super(2, continuation);
        this.$verificationId = uuid;
        this.$duxo = walletVerificationDuxo;
        this.$isDay = z;
        this.$alreadyLaunchedForVerificationId$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletVerificationComposable2(this.$verificationId, this.$duxo, this.$isDay, this.$alreadyLaunchedForVerificationId$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletVerificationComposable2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (!Intrinsics.areEqual(WalletVerificationComposable.WalletVerificationComposable$lambda$4(this.$alreadyLaunchedForVerificationId$delegate), this.$verificationId)) {
                this.$duxo.bind(this.$verificationId, this.$isDay);
                this.$alreadyLaunchedForVerificationId$delegate.setValue(this.$verificationId);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

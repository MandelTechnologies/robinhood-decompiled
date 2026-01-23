package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierUpgraded;

import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: CryptoFeeTierUpgradedComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$3$1$1$1", m3645f = "CryptoFeeTierUpgradedComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$3$1$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $startPlaying$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$3$1$1$1(SnapshotState<Boolean> snapshotState, Continuation<? super CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$3$1$1$1> continuation) {
        super(2, continuation);
        this.$startPlaying$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$3$1$1$1(this.$startPlaying$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$3$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!CryptoFeeTierUpgradedComposableKt.C404033.invoke$lambda$17$lambda$2(this.$startPlaying$delegate)) {
                this.label = 1;
                if (DelayKt.delay(650L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CryptoFeeTierUpgradedComposableKt.C404033.invoke$lambda$17$lambda$3(this.$startPlaying$delegate, true);
        return Unit.INSTANCE;
    }
}

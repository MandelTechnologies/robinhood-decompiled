package com.robinhood.android.common.gold;

import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementViewState2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LegacyGoldUpgradeAgreementComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementComposableKt$Loaded$1$1", m3645f = "LegacyGoldUpgradeAgreementComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementComposableKt$Loaded$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class LegacyGoldUpgradeAgreementComposable8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState4<Boolean> $isScrolledToEnd$delegate;
    final /* synthetic */ Function0<Unit> $onClickReview;
    final /* synthetic */ LegacyGoldUpgradeAgreementViewState2.Loaded $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegacyGoldUpgradeAgreementComposable8(LegacyGoldUpgradeAgreementViewState2.Loaded loaded, Function0<Unit> function0, SnapshotState4<Boolean> snapshotState4, Continuation<? super LegacyGoldUpgradeAgreementComposable8> continuation) {
        super(2, continuation);
        this.$state = loaded;
        this.$onClickReview = function0;
        this.$isScrolledToEnd$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LegacyGoldUpgradeAgreementComposable8(this.$state, this.$onClickReview, this.$isScrolledToEnd$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LegacyGoldUpgradeAgreementComposable8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (LegacyGoldUpgradeAgreementComposable3.Loaded$lambda$7(this.$isScrolledToEnd$delegate) && this.$state.getStatus() == LegacyGoldUpgradeAgreementDataState2.UNREVIEWED) {
                this.$onClickReview.invoke();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

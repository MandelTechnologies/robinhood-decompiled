package com.robinhood.android.gold.upgrade.unified.screen;

import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementViewState;
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

/* compiled from: GoldUnifiedSingleAgreementComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposableKt$Loaded$2$1", m3645f = "GoldUnifiedSingleAgreementComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposableKt$Loaded$2$1, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldUnifiedSingleAgreementComposable7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState4<Boolean> $isScrolledToEnd$delegate;
    final /* synthetic */ Function0<Unit> $onReview;
    final /* synthetic */ GoldUnifiedSingleAgreementViewState.Loaded $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldUnifiedSingleAgreementComposable7(GoldUnifiedSingleAgreementViewState.Loaded loaded, Function0<Unit> function0, SnapshotState4<Boolean> snapshotState4, Continuation<? super GoldUnifiedSingleAgreementComposable7> continuation) {
        super(2, continuation);
        this.$state = loaded;
        this.$onReview = function0;
        this.$isScrolledToEnd$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoldUnifiedSingleAgreementComposable7(this.$state, this.$onReview, this.$isScrolledToEnd$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GoldUnifiedSingleAgreementComposable7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (GoldUnifiedSingleAgreementComposable3.Loaded$lambda$4(this.$isScrolledToEnd$delegate) && this.$state.getReviewStatus() == GoldUnifiedSingleAgreementViewState2.UNREVIEWED) {
                this.$onReview.invoke();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

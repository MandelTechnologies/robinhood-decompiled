package com.robinhood.android.optionschain.sbschain;

import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionSideBySideChainComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$6$7$1", m3645f = "OptionSideBySideChainComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$6$7$1 */
/* loaded from: classes11.dex */
final class C24352xfdbf2ebf extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OptionSideBySideChainDuxo $duxo;
    final /* synthetic */ SnapshotState<Boolean> $isTableReady$delegate;
    final /* synthetic */ OptionSideBySideChainDataState4 $nuxMode;
    final /* synthetic */ SnapshotState4<OptionSideBySideChainViewState> $viewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C24352xfdbf2ebf(OptionSideBySideChainDataState4 optionSideBySideChainDataState4, OptionSideBySideChainDuxo optionSideBySideChainDuxo, SnapshotState4<OptionSideBySideChainViewState> snapshotState4, SnapshotState<Boolean> snapshotState, Continuation<? super C24352xfdbf2ebf> continuation) {
        super(2, continuation);
        this.$nuxMode = optionSideBySideChainDataState4;
        this.$duxo = optionSideBySideChainDuxo;
        this.$viewState$delegate = snapshotState4;
        this.$isTableReady$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C24352xfdbf2ebf(this.$nuxMode, this.$duxo, this.$viewState$delegate, this.$isTableReady$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C24352xfdbf2ebf) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (!OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$0(this.$viewState$delegate).isEduFooterAnimationDismissed() && OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$0(this.$viewState$delegate).getEduFooterAnimationState() == OptionSideBySideChainDataState5.NOT_PLAYING && OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$0(this.$viewState$delegate).getInSbsNuxRevampExperiment() && OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$41$lambda$30(this.$isTableReady$delegate) && this.$nuxMode == OptionSideBySideChainDataState4.SBS_NUX_REVAMP && OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$0(this.$viewState$delegate).getHasSeenLottieNuxAnimation() && (OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$0(this.$viewState$delegate).getLaunchMode() instanceof OptionChainLaunchMode.Normal)) {
                this.$duxo.startEduFooterAnimation();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

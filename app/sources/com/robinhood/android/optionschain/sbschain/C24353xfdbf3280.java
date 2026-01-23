package com.robinhood.android.optionschain.sbschain;

import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
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

/* compiled from: OptionSideBySideChainComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$6$8$1", m3645f = "OptionSideBySideChainComposable.kt", m3646l = {346, 348, 350, 352}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$6$8$1 */
/* loaded from: classes11.dex */
final class C24353xfdbf3280 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<TableHighlightPhase> $animationPhase$delegate;
    final /* synthetic */ OptionSideBySideChainDuxo $duxo;
    final /* synthetic */ SnapshotState4<OptionSideBySideChainViewState> $viewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C24353xfdbf3280(OptionSideBySideChainDuxo optionSideBySideChainDuxo, SnapshotState4<OptionSideBySideChainViewState> snapshotState4, SnapshotState<TableHighlightPhase> snapshotState, Continuation<? super C24353xfdbf3280> continuation) {
        super(2, continuation);
        this.$duxo = optionSideBySideChainDuxo;
        this.$viewState$delegate = snapshotState4;
        this.$animationPhase$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C24353xfdbf3280(this.$duxo, this.$viewState$delegate, this.$animationPhase$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C24353xfdbf3280) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(600, r8) != r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$0(this.$viewState$delegate).getEduFooterAnimationState() == OptionSideBySideChainDataState5.PLAYING) {
                this.label = 1;
                if (DelayKt.delay(600L, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                this.$animationPhase$delegate.setValue(TableHighlightPhase.HIGHLIGHT_ASK);
                this.label = 3;
                if (DelayKt.delay(600L, this) != coroutine_suspended) {
                    this.$animationPhase$delegate.setValue(TableHighlightPhase.NORMAL_SBS);
                    this.label = 4;
                }
                return coroutine_suspended;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$duxo.completeEduFooterAnimation();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.$animationPhase$delegate.setValue(TableHighlightPhase.NORMAL_SBS);
            this.label = 4;
        }
        this.$animationPhase$delegate.setValue(TableHighlightPhase.HIGHLIGHT_BID);
        this.label = 2;
        if (DelayKt.delay(600L, this) != coroutine_suspended) {
            this.$animationPhase$delegate.setValue(TableHighlightPhase.HIGHLIGHT_ASK);
            this.label = 3;
            if (DelayKt.delay(600L, this) != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }
}

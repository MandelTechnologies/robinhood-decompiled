package com.robinhood.android.optionschain.sbschain;

import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: OptionSideBySideChainComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$4$1", m3645f = "OptionSideBySideChainComposable.kt", m3646l = {119}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$4$1 */
/* loaded from: classes11.dex */
final class C24334xbf88072a extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Integer> $currentPageIndex$delegate;
    final /* synthetic */ OptionSideBySideChainDuxo $duxo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C24334xbf88072a(OptionSideBySideChainDuxo optionSideBySideChainDuxo, SnapshotState<Integer> snapshotState, Continuation<? super C24334xbf88072a> continuation) {
        super(2, continuation);
        this.$duxo = optionSideBySideChainDuxo;
        this.$currentPageIndex$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C24334xbf88072a(this.$duxo, this.$currentPageIndex$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C24334xbf88072a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Integer numOptionSideBySideChainComposable$lambda$4 = OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$4(this.$currentPageIndex$delegate);
            if (numOptionSideBySideChainComposable$lambda$4 == null) {
                this.label = 1;
                if (DelayKt.delay(2000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.$duxo.onCurrentPageUpdated(numOptionSideBySideChainComposable$lambda$4.intValue());
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$currentPageIndex$delegate.setValue(boxing.boxInt(0));
        return Unit.INSTANCE;
    }
}

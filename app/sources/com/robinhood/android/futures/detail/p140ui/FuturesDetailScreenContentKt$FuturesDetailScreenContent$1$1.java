package com.robinhood.android.futures.detail.p140ui;

import androidx.compose.foundation.lazy.LazyListState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.futures.detail.p140ui.duxo.FtuxProgressState;
import com.robinhood.android.futures.detail.p140ui.duxo.FuturesDetailViewState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FuturesDetailScreenContent.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.FuturesDetailScreenContentKt$FuturesDetailScreenContent$1$1", m3645f = "FuturesDetailScreenContent.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE, EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FuturesDetailScreenContentKt$FuturesDetailScreenContent$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $buffer;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ FuturesDetailViewState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesDetailScreenContentKt$FuturesDetailScreenContent$1$1(FuturesDetailViewState futuresDetailViewState, LazyListState lazyListState, int i, Continuation<? super FuturesDetailScreenContentKt$FuturesDetailScreenContent$1$1> continuation) {
        super(2, continuation);
        this.$state = futuresDetailViewState;
        this.$lazyListState = lazyListState;
        this.$buffer = i;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesDetailScreenContentKt$FuturesDetailScreenContent$1$1(this.$state, this.$lazyListState, this.$buffer, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturesDetailScreenContentKt$FuturesDetailScreenContent$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (androidx.compose.foundation.lazy.LazyListState.animateScrollToItem$default(r4, 0, 0, r10, 2, null) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (r11.animateScrollToItem(r1, r3, r10) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FtuxProgressState ftuxProgressState = this.$state.getFtuxProgressState();
            if (Intrinsics.areEqual(ftuxProgressState, FtuxProgressState.MarginRequirementEducation.INSTANCE)) {
                LazyListState lazyListState = this.$lazyListState;
                this.label = 1;
            } else if (Intrinsics.areEqual(ftuxProgressState, FtuxProgressState.LeverageEducation.INSTANCE) || Intrinsics.areEqual(ftuxProgressState, FtuxProgressState.MarginRequirementEducationForMiB.INSTANCE)) {
                LazyListState lazyListState2 = this.$lazyListState;
                int contractSpecIndex = this.$state.getContractSpecIndex();
                int i2 = -this.$buffer;
                this.label = 2;
            } else if (ftuxProgressState != null && !(ftuxProgressState instanceof FtuxProgressState.ChartEducation) && !Intrinsics.areEqual(ftuxProgressState, FtuxProgressState.PositionEducation.INSTANCE) && !Intrinsics.areEqual(ftuxProgressState, FtuxProgressState.FtuxEducationDone.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}

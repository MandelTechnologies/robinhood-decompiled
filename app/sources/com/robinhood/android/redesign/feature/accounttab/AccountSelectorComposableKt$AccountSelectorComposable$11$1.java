package com.robinhood.android.redesign.feature.accounttab;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorTabRowScrollInfo;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountSelectorComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$11$1", m3645f = "AccountSelectorComposable.kt", m3646l = {653, 661, 666}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class AccountSelectorComposableKt$AccountSelectorComposable$11$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $accountTabRowListState;
    final /* synthetic */ SnapshotState<Boolean> $isProgrammaticallyScrollingTabRow$delegate;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ SnapshotState4<AccountSelectorTabRowScrollInfo> $targetScrollInfo$delegate;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AccountSelectorComposableKt$AccountSelectorComposable$11$1(SnapshotState4<? extends AccountSelectorTabRowScrollInfo> snapshotState4, LazyListState lazyListState, PagerState pagerState, SnapshotState<Boolean> snapshotState, Continuation<? super AccountSelectorComposableKt$AccountSelectorComposable$11$1> continuation) {
        super(2, continuation);
        this.$targetScrollInfo$delegate = snapshotState4;
        this.$accountTabRowListState = lazyListState;
        this.$pagerState = pagerState;
        this.$isProgrammaticallyScrollingTabRow$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountSelectorComposableKt$AccountSelectorComposable$11$1(this.$targetScrollInfo$delegate, this.$accountTabRowListState, this.$pagerState, this.$isProgrammaticallyScrollingTabRow$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountSelectorComposableKt$AccountSelectorComposable$11$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(1:(1:(6:7|8|48|36|44|45)(2:12|13))(1:14))(1:18)|46|15|48|36|44|45) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        r6 = r4;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        if (r1.scrollToItem(r4, r13, r12) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bf, code lost:
    
        if (androidx.compose.foundation.lazy.LazyListState.animateScrollToItem$default(r6, r7, 0, r12, 2, null) == r0) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [androidx.compose.runtime.MutableState] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        SnapshotState<Boolean> snapshotState;
        PagerState pagerState;
        SnapshotState<Boolean> snapshotState2;
        LazyListState lazyListState;
        SnapshotState<Boolean> snapshotState3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.label;
        try {
            if (r1 != 0) {
                if (r1 == 1) {
                    SnapshotState<Boolean> snapshotState4 = (SnapshotState) this.L$2;
                    pagerState = (PagerState) this.L$1;
                    lazyListState = (LazyListState) this.L$0;
                    snapshotState3 = snapshotState4;
                } else {
                    if (r1 != 2) {
                        if (r1 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SnapshotState snapshotState5 = (SnapshotState) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        r1 = snapshotState5;
                        AccountSelectorComposableKt.AccountSelectorComposable$lambda$45(r1, false);
                        return Unit.INSTANCE;
                    }
                    SnapshotState<Boolean> snapshotState6 = (SnapshotState) this.L$2;
                    pagerState = (PagerState) this.L$1;
                    lazyListState = (LazyListState) this.L$0;
                    snapshotState3 = snapshotState6;
                }
                ResultKt.throwOnFailure(obj);
                r1 = snapshotState3;
                AccountSelectorComposableKt.AccountSelectorComposable$lambda$45(r1, false);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            AccountSelectorTabRowScrollInfo accountSelectorTabRowScrollInfoAccountSelectorComposable$lambda$84 = AccountSelectorComposableKt.AccountSelectorComposable$lambda$84(this.$targetScrollInfo$delegate);
            if (accountSelectorTabRowScrollInfoAccountSelectorComposable$lambda$84 != null) {
                LazyListState lazyListState2 = this.$accountTabRowListState;
                PagerState pagerState2 = this.$pagerState;
                SnapshotState<Boolean> snapshotState7 = this.$isProgrammaticallyScrollingTabRow$delegate;
                AccountSelectorComposableKt.AccountSelectorComposable$lambda$45(snapshotState7, true);
                try {
                } catch (Exception unused) {
                    pagerState = pagerState2;
                    LazyListState lazyListState3 = lazyListState2;
                    snapshotState2 = snapshotState7;
                } catch (Throwable th2) {
                    th = th2;
                    snapshotState = snapshotState7;
                    AccountSelectorComposableKt.AccountSelectorComposable$lambda$45(snapshotState, false);
                    throw th;
                }
                if (accountSelectorTabRowScrollInfoAccountSelectorComposable$lambda$84 instanceof AccountSelectorTabRowScrollInfo.StaticPosition) {
                    int index = ((AccountSelectorTabRowScrollInfo.StaticPosition) accountSelectorTabRowScrollInfoAccountSelectorComposable$lambda$84).getIndex();
                    this.L$0 = lazyListState2;
                    this.L$1 = pagerState2;
                    this.L$2 = snapshotState7;
                    this.label = 1;
                    if (lazyListState2.animateScrollToItem(index, 0, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    r1 = snapshotState7;
                } else {
                    if (!(accountSelectorTabRowScrollInfoAccountSelectorComposable$lambda$84 instanceof AccountSelectorTabRowScrollInfo.PrecisePosition)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int index2 = ((AccountSelectorTabRowScrollInfo.PrecisePosition) accountSelectorTabRowScrollInfoAccountSelectorComposable$lambda$84).getIndex();
                    int offset = ((AccountSelectorTabRowScrollInfo.PrecisePosition) accountSelectorTabRowScrollInfoAccountSelectorComposable$lambda$84).getOffset();
                    this.L$0 = lazyListState2;
                    this.L$1 = pagerState2;
                    this.L$2 = snapshotState7;
                    this.label = 2;
                }
                AccountSelectorComposableKt.AccountSelectorComposable$lambda$45(r1, false);
            }
            return Unit.INSTANCE;
            int currentPage = pagerState.getCurrentPage();
            this.L$0 = snapshotState2;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 3;
            r1 = snapshotState2;
        } catch (Throwable th3) {
            th = th3;
            snapshotState = r1;
        }
    }
}

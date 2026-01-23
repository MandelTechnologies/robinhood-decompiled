package com.robinhood.android.redesign.feature.accounttab;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.redesign.accounttab.deeplink.AccountTabTarget;
import com.robinhood.android.redesign.accounttab.duxo.AccountSelectorViewState;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

/* compiled from: AccountSelectorComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$10$1", m3645f = "AccountSelectorComposable.kt", m3646l = {572, 573}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes5.dex */
final class AccountSelectorComposableKt$AccountSelectorComposable$10$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AccountTabDuxo $accountTabDuxo;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ ImmutableMap<String, Integer> $tabInfoIndexMap;
    final /* synthetic */ SnapshotState4<AccountSelectorViewState> $viewState$delegate;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSelectorComposableKt$AccountSelectorComposable$10$1(SnapshotState4<AccountSelectorViewState> snapshotState4, PagerState pagerState, AccountTabDuxo accountTabDuxo, ImmutableMap<String, Integer> immutableMap, Continuation<? super AccountSelectorComposableKt$AccountSelectorComposable$10$1> continuation) {
        super(2, continuation);
        this.$viewState$delegate = snapshotState4;
        this.$pagerState = pagerState;
        this.$accountTabDuxo = accountTabDuxo;
        this.$tabInfoIndexMap = immutableMap;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountSelectorComposableKt$AccountSelectorComposable$10$1(this.$viewState$delegate, this.$pagerState, this.$accountTabDuxo, this.$tabInfoIndexMap, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountSelectorComposableKt$AccountSelectorComposable$10$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00de, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(50, r12) != r0) goto L7;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00de -> B:7:0x0020). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Integer num;
        int i;
        PagerState pagerState;
        AccountTabDuxo accountTabDuxo;
        AccountSelectorComposableKt$AccountSelectorComposable$10$1 accountSelectorComposableKt$AccountSelectorComposable$10$1;
        PagerState pagerState2;
        AccountTabDuxo accountTabDuxo2;
        Integer num2;
        int i2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            AccountTabTarget deeplinkTarget = AccountSelectorComposableKt.AccountSelectorComposable$lambda$0(this.$viewState$delegate).getDeeplinkTarget();
            if (deeplinkTarget != null) {
                PagerState pagerState3 = this.$pagerState;
                AccountTabDuxo accountTabDuxo3 = this.$accountTabDuxo;
                ImmutableMap<String, Integer> immutableMap = this.$tabInfoIndexMap;
                AccountTabInfo.Account accountConsume = deeplinkTarget.consume();
                num = immutableMap.get(accountConsume != null ? accountConsume.getId() : null);
                i = 0;
                Timber.INSTANCE.tag("AccountTabSwitcher").mo3350d("Processing selection at idx=" + num + " pagerState=" + pagerState3.getPageCount() + " tabIndex=" + num, new Object[0]);
                pagerState = pagerState3;
                accountTabDuxo = accountTabDuxo3;
                if (num == null) {
                }
                accountTabDuxo.clearPendingDeeplinkRequest();
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = this.I$0;
            num2 = (Integer) this.L$2;
            accountTabDuxo2 = (AccountTabDuxo) this.L$1;
            pagerState2 = (PagerState) this.L$0;
            ResultKt.throwOnFailure(obj);
            AccountTabDuxo accountTabDuxo4 = accountTabDuxo2;
            int i4 = i2;
            accountTabDuxo = accountTabDuxo4;
            num = num2;
            pagerState = pagerState2;
            i = i4;
            if (num == null && pagerState.getCurrentPage() != num.intValue() && i < 3) {
                int i5 = i + 1;
                int iIntValue = num.intValue();
                this.L$0 = pagerState;
                this.L$1 = accountTabDuxo;
                this.L$2 = num;
                this.I$0 = i5;
                this.label = 1;
                accountSelectorComposableKt$AccountSelectorComposable$10$1 = this;
                if (PagerState.scrollToPage$default(pagerState, iIntValue, 0.0f, accountSelectorComposableKt$AccountSelectorComposable$10$1, 2, null) != coroutine_suspended) {
                    accountTabDuxo2 = accountTabDuxo;
                    pagerState2 = pagerState;
                    i2 = i5;
                    num2 = num;
                    accountSelectorComposableKt$AccountSelectorComposable$10$1.L$0 = pagerState2;
                    accountSelectorComposableKt$AccountSelectorComposable$10$1.L$1 = accountTabDuxo2;
                    accountSelectorComposableKt$AccountSelectorComposable$10$1.L$2 = num2;
                    accountSelectorComposableKt$AccountSelectorComposable$10$1.I$0 = i2;
                    accountSelectorComposableKt$AccountSelectorComposable$10$1.label = 2;
                }
                return coroutine_suspended;
            }
            accountTabDuxo.clearPendingDeeplinkRequest();
            return Unit.INSTANCE;
        }
        i2 = this.I$0;
        num2 = (Integer) this.L$2;
        accountTabDuxo2 = (AccountTabDuxo) this.L$1;
        pagerState2 = (PagerState) this.L$0;
        ResultKt.throwOnFailure(obj);
        accountSelectorComposableKt$AccountSelectorComposable$10$1 = this;
        accountSelectorComposableKt$AccountSelectorComposable$10$1.L$0 = pagerState2;
        accountSelectorComposableKt$AccountSelectorComposable$10$1.L$1 = accountTabDuxo2;
        accountSelectorComposableKt$AccountSelectorComposable$10$1.L$2 = num2;
        accountSelectorComposableKt$AccountSelectorComposable$10$1.I$0 = i2;
        accountSelectorComposableKt$AccountSelectorComposable$10$1.label = 2;
    }
}

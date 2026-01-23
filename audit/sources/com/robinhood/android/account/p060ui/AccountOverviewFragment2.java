package com.robinhood.android.account.p060ui;

import androidx.compose.foundation.lazy.LazyListState;
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

/* compiled from: AccountOverviewFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewFragment$ComposeContent$2$1", m3645f = "AccountOverviewFragment.kt", m3646l = {588}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.account.ui.AccountOverviewFragment$ComposeContent$2$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AccountOverviewFragment2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ SnapshotState4<Integer> $sectionScrollEvent$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountOverviewFragment2(SnapshotState4<Integer> snapshotState4, LazyListState lazyListState, Continuation<? super AccountOverviewFragment2> continuation) {
        super(2, continuation);
        this.$sectionScrollEvent$delegate = snapshotState4;
        this.$listState = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountOverviewFragment2(this.$sectionScrollEvent$delegate, this.$listState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountOverviewFragment2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Integer numComposeContent$lambda$12 = AccountOverviewFragment.ComposeContent$lambda$12(this.$sectionScrollEvent$delegate);
            if (numComposeContent$lambda$12 != null) {
                LazyListState lazyListState = this.$listState;
                int iIntValue = numComposeContent$lambda$12.intValue();
                this.label = 1;
                if (LazyListState.scrollToItem$default(lazyListState, iIntValue, 0, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}

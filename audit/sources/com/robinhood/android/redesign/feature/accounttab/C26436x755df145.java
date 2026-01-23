package com.robinhood.android.redesign.feature.accounttab;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: AccountSelectorComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$scrollToSelectedTabWithDelay$1", m3645f = "AccountSelectorComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$scrollToSelectedTabWithDelay$1 */
/* loaded from: classes5.dex */
final class C26436x755df145 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $accountTabRowListState;
    final /* synthetic */ int $index;
    final /* synthetic */ SnapshotState<Boolean> $isProgrammaticallyScrollingTabRow$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C26436x755df145(SnapshotState<Boolean> snapshotState, LazyListState lazyListState, int i, Continuation<? super C26436x755df145> continuation) {
        super(2, continuation);
        this.$isProgrammaticallyScrollingTabRow$delegate = snapshotState;
        this.$accountTabRowListState = lazyListState;
        this.$index = i;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C26436x755df145 c26436x755df145 = new C26436x755df145(this.$isProgrammaticallyScrollingTabRow$delegate, this.$accountTabRowListState, this.$index, continuation);
        c26436x755df145.L$0 = obj;
        return c26436x755df145;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C26436x755df145) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(1:(1:(6:33|6|7|22|29|30)(2:10|11))(1:12))(3:13|(1:15)|21)|16|31|17|18|35|19|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (androidx.compose.foundation.lazy.LazyListState.animateScrollToItem$default(r4, r5, 0, r7, 2, null) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r7 = r10;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C26436x755df145 c26436x755df145;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.L$0 = (CoroutineScope) this.L$0;
            this.label = 1;
            if (DelayKt.delay(100L, this) == coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                ResultKt.throwOnFailure(obj);
                c26436x755df145 = this;
                Result.m28550constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Throwable th2 = th;
                c26436x755df145 = this;
                Result.Companion companion = Result.INSTANCE;
                Result.m28550constructorimpl(ResultKt.createFailure(th2));
                AccountSelectorComposableKt.AccountSelectorComposable$lambda$45(c26436x755df145.$isProgrammaticallyScrollingTabRow$delegate, false);
                return Unit.INSTANCE;
            }
            AccountSelectorComposableKt.AccountSelectorComposable$lambda$45(c26436x755df145.$isProgrammaticallyScrollingTabRow$delegate, false);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        AccountSelectorComposableKt.AccountSelectorComposable$lambda$45(this.$isProgrammaticallyScrollingTabRow$delegate, true);
        LazyListState lazyListState = this.$accountTabRowListState;
        int i2 = this.$index;
        Result.Companion companion2 = Result.INSTANCE;
        this.L$0 = null;
        this.label = 2;
        c26436x755df145 = this;
    }
}

package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.main;

import androidx.compose.foundation.pager.PagerState;
import com.robinhood.android.redesigninvesting.investingmonitor.model.InvestingMonitorPage;
import com.robinhood.android.redesigninvesting.investingmonitor.p232ui.main.InvestingMonitorViewState;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InvestingMonitorComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$MainContent$3$1$4$1", m3645f = "InvestingMonitorComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$MainContent$3$1$4$1, reason: use source file name */
/* loaded from: classes5.dex */
final class InvestingMonitorComposable8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ Function1<InvestingMonitorPage, Unit> $onRecentlyCreatedPageProcessed;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ ImmutableList3<InvestingMonitorPage> $pages;
    final /* synthetic */ InvestingMonitorViewState.Loaded $viewState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    InvestingMonitorComposable8(InvestingMonitorViewState.Loaded loaded, CoroutineScope coroutineScope, ImmutableList3<InvestingMonitorPage> immutableList3, PagerState pagerState, Function1<? super InvestingMonitorPage, Unit> function1, Continuation<? super InvestingMonitorComposable8> continuation) {
        super(2, continuation);
        this.$viewState = loaded;
        this.$coroutineScope = coroutineScope;
        this.$pages = immutableList3;
        this.$pagerState = pagerState;
        this.$onRecentlyCreatedPageProcessed = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestingMonitorComposable8(this.$viewState, this.$coroutineScope, this.$pages, this.$pagerState, this.$onRecentlyCreatedPageProcessed, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestingMonitorComposable8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        InvestingMonitorPage investingMonitorPageConsume;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        UiEvent<InvestingMonitorPage> recentlyCreatedPage = this.$viewState.getRecentlyCreatedPage();
        if (recentlyCreatedPage != null && (investingMonitorPageConsume = recentlyCreatedPage.consume()) != null) {
            BuildersKt__Builders_commonKt.launch$default(this.$coroutineScope, null, null, new C265971(this.$pages, investingMonitorPageConsume, this.$pagerState, this.$onRecentlyCreatedPageProcessed, null), 3, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: InvestingMonitorComposable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$MainContent$3$1$4$1$1", m3645f = "InvestingMonitorComposable.kt", m3646l = {418, 422}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$MainContent$3$1$4$1$1 */
    static final class C265971 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<InvestingMonitorPage, Unit> $onRecentlyCreatedPageProcessed;
        final /* synthetic */ PagerState $pagerState;
        final /* synthetic */ ImmutableList3<InvestingMonitorPage> $pages;
        final /* synthetic */ InvestingMonitorPage $recentlyCreatedPage;
        int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C265971(ImmutableList3<InvestingMonitorPage> immutableList3, InvestingMonitorPage investingMonitorPage, PagerState pagerState, Function1<? super InvestingMonitorPage, Unit> function1, Continuation<? super C265971> continuation) {
            super(2, continuation);
            this.$pages = immutableList3;
            this.$recentlyCreatedPage = investingMonitorPage;
            this.$pagerState = pagerState;
            this.$onRecentlyCreatedPageProcessed = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C265971(this.$pages, this.$recentlyCreatedPage, this.$pagerState, this.$onRecentlyCreatedPageProcessed, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C265971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
        
            if (androidx.compose.foundation.pager.PagerState.animateScrollToPage$default(r3, r4, 0.0f, null, r7, 6, null) != r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int iIndexOf;
            C265971 c265971;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                iIndexOf = this.$pages.indexOf(this.$recentlyCreatedPage);
                if (iIndexOf != -1) {
                    if (this.$pagerState.getCurrentPage() == iIndexOf) {
                        this.I$0 = iIndexOf;
                        this.label = 1;
                        c265971 = this;
                        if (PagerState.scrollToPage$default(this.$pagerState, iIndexOf + 1, 0.0f, c265971, 2, null) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    int i2 = iIndexOf;
                    PagerState pagerState = c265971.$pagerState;
                    c265971.label = 2;
                } else {
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    c265971 = this;
                    c265971.$onRecentlyCreatedPageProcessed.invoke(c265971.$recentlyCreatedPage);
                    return Unit.INSTANCE;
                }
                iIndexOf = this.I$0;
                ResultKt.throwOnFailure(obj);
            }
            c265971 = this;
            int i22 = iIndexOf;
            PagerState pagerState2 = c265971.$pagerState;
            c265971.label = 2;
        }
    }
}

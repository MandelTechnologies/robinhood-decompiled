package com.robinhood.android.crypto.tab.p093ui.discover;

import androidx.compose.foundation.lazy.LazyListState;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoHomeDiscoverExperimentComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$loaded$header$1$1$1", m3645f = "CryptoHomeDiscoverExperimentComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CryptoHomeDiscoverExperimentComposableKt$loaded$header$1$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $chipRowState;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ CryptoHomeDiscoverExperimentViewState $viewState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoHomeDiscoverExperimentComposableKt$loaded$header$1$1$1(CoroutineScope coroutineScope, CryptoHomeDiscoverExperimentViewState cryptoHomeDiscoverExperimentViewState, LazyListState lazyListState, Continuation<? super CryptoHomeDiscoverExperimentComposableKt$loaded$header$1$1$1> continuation) {
        super(2, continuation);
        this.$coroutineScope = coroutineScope;
        this.$viewState = cryptoHomeDiscoverExperimentViewState;
        this.$chipRowState = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoHomeDiscoverExperimentComposableKt$loaded$header$1$1$1(this.$coroutineScope, this.$viewState, this.$chipRowState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoHomeDiscoverExperimentComposableKt$loaded$header$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: CryptoHomeDiscoverExperimentComposable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$loaded$header$1$1$1$1", m3645f = "CryptoHomeDiscoverExperimentComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$loaded$header$1$1$1$1 */
    static final class C131031 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LazyListState $chipRowState;
        final /* synthetic */ CryptoHomeDiscoverExperimentViewState $viewState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C131031(CryptoHomeDiscoverExperimentViewState cryptoHomeDiscoverExperimentViewState, LazyListState lazyListState, Continuation<? super C131031> continuation) {
            super(2, continuation);
            this.$viewState = cryptoHomeDiscoverExperimentViewState;
            this.$chipRowState = lazyListState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C131031(this.$viewState, this.$chipRowState, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C131031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$viewState.getSelectedCategoryIndex() >= 0) {
                    LazyListState lazyListState = this.$chipRowState;
                    int selectedCategoryIndex = this.$viewState.getSelectedCategoryIndex();
                    this.label = 1;
                    if (LazyListState.scrollToItem$default(lazyListState, selectedCategoryIndex, 0, this, 2, null) == coroutine_suspended) {
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

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            BuildersKt__Builders_commonKt.launch$default(this.$coroutineScope, null, null, new C131031(this.$viewState, this.$chipRowState, null), 3, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

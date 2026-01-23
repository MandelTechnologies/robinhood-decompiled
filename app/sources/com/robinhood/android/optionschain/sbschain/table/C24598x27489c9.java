package com.robinhood.android.optionschain.sbschain.table;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotLongState2;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableEvent;
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
import timber.log.Timber;

/* compiled from: OptionSideBySideChainTable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$2$2$10$4$1", m3645f = "OptionSideBySideChainTable.kt", m3646l = {585, 589}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$2$2$10$4$1 */
/* loaded from: classes11.dex */
final class C24598x27489c9 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $isTableReady$delegate;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ OptionSideBySideChainTableEvent $localEvent;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $sharedScrollValue;
    final /* synthetic */ SnapshotLongState2 $startTableLoading$delegate;
    final /* synthetic */ SnapshotState4<OptionSideBySideChainTableViewState> $viewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C24598x27489c9(LazyListState lazyListState, OptionSideBySideChainTableEvent optionSideBySideChainTableEvent, Animatable<Float, AnimationVectors2> animatable, SnapshotState4<OptionSideBySideChainTableViewState> snapshotState4, SnapshotLongState2 snapshotLongState2, SnapshotState<Boolean> snapshotState, Continuation<? super C24598x27489c9> continuation) {
        super(2, continuation);
        this.$lazyListState = lazyListState;
        this.$localEvent = optionSideBySideChainTableEvent;
        this.$sharedScrollValue = animatable;
        this.$viewState$delegate = snapshotState4;
        this.$startTableLoading$delegate = snapshotLongState2;
        this.$isTableReady$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C24598x27489c9(this.$lazyListState, this.$localEvent, this.$sharedScrollValue, this.$viewState$delegate, this.$startTableLoading$delegate, this.$isTableReady$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C24598x27489c9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
    
        if (r7.snapTo(r1, r6) == r0) goto L15;
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
            LazyListState lazyListState = this.$lazyListState;
            int firstVerticalVisibleIndex = ((OptionSideBySideChainTableEvent.ScrollToPosition) this.$localEvent).getPosition().getFirstVerticalVisibleIndex();
            int firstVerticalVisibleOffset = ((OptionSideBySideChainTableEvent.ScrollToPosition) this.$localEvent).getPosition().getFirstVerticalVisibleOffset();
            this.label = 1;
            if (lazyListState.scrollToItem(firstVerticalVisibleIndex, firstVerticalVisibleOffset, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Timber.Companion companion = Timber.INSTANCE;
            OptionChainExpirationDateState expirationDateState = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(this.$viewState$delegate).getExpirationDateState();
            String key = expirationDateState != null ? expirationDateState.getKey() : null;
            companion.mo3350d("Sbs loaded " + key + " in " + (System.currentTimeMillis() - this.$startTableLoading$delegate.getLongValue()), new Object[0]);
            OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$11(this.$isTableReady$delegate, true);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        Animatable<Float, AnimationVectors2> animatable = this.$sharedScrollValue;
        Float fBoxFloat = boxing.boxFloat(((OptionSideBySideChainTableEvent.ScrollToPosition) this.$localEvent).getPosition().getHorizontalScrollValue());
        this.label = 2;
    }
}

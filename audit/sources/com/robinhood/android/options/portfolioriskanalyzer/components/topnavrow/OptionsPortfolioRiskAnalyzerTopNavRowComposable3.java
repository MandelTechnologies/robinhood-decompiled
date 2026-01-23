package com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotFloatState2;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionsPortfolioRiskAnalyzerTopNavRowComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposableKt$OptionsPortfolioRiskAnalyzerTopNavRowComposable$5$1", m3645f = "OptionsPortfolioRiskAnalyzerTopNavRowComposable.kt", m3646l = {103, 108}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposableKt$OptionsPortfolioRiskAnalyzerTopNavRowComposable$5$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionsPortfolioRiskAnalyzerTopNavRowComposable3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ SnapshotFloatState2 $lazyRowWidthPx$delegate;
    final /* synthetic */ ImmutableList<NavRowItemViewState> $navRowItems;
    final /* synthetic */ SnapshotFloatState2 $rowWidthPx$delegate;
    final /* synthetic */ UUID $selectedId;
    int I$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionsPortfolioRiskAnalyzerTopNavRowComposable3(ImmutableList<NavRowItemViewState> immutableList, LazyListState lazyListState, UUID uuid, SnapshotFloatState2 snapshotFloatState2, SnapshotFloatState2 snapshotFloatState22, Continuation<? super OptionsPortfolioRiskAnalyzerTopNavRowComposable3> continuation) {
        super(2, continuation);
        this.$navRowItems = immutableList;
        this.$lazyListState = lazyListState;
        this.$selectedId = uuid;
        this.$rowWidthPx$delegate = snapshotFloatState2;
        this.$lazyRowWidthPx$delegate = snapshotFloatState22;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionsPortfolioRiskAnalyzerTopNavRowComposable3 optionsPortfolioRiskAnalyzerTopNavRowComposable3 = new OptionsPortfolioRiskAnalyzerTopNavRowComposable3(this.$navRowItems, this.$lazyListState, this.$selectedId, this.$rowWidthPx$delegate, this.$lazyRowWidthPx$delegate, continuation);
        optionsPortfolioRiskAnalyzerTopNavRowComposable3.L$0 = obj;
        return optionsPortfolioRiskAnalyzerTopNavRowComposable3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionsPortfolioRiskAnalyzerTopNavRowComposable3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
    
        if (androidx.compose.foundation.gestures.ScrollExtensions.animateScrollBy$default(r1, r4, null, r12, 2, null) == r6) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d1, code lost:
    
        if (androidx.compose.foundation.lazy.LazyListState.animateScrollToItem$default(r0, r7, 0, r12, 2, null) == r6) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d3, code lost:
    
        return r6;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
            } else if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            ImmutableList<NavRowItemViewState> immutableList = this.$navRowItems;
            UUID uuid = this.$selectedId;
            Iterator<NavRowItemViewState> it = immutableList.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (Intrinsics.areEqual(it.next().getUnderlyingId(), uuid)) {
                    break;
                }
                i2++;
            }
            if (i2 < 0) {
                return Unit.INSTANCE;
            }
            LazyListLayoutInfo layoutInfo = this.$lazyListState.getLayoutInfo();
            float viewportStartOffset = ((layoutInfo.getViewportStartOffset() + layoutInfo.getViewportEndOffset()) / 2.0f) - ((this.$rowWidthPx$delegate.getFloatValue() - this.$lazyRowWidthPx$delegate.getFloatValue()) / 2.0f);
            Iterator<T> it2 = layoutInfo.getVisibleItemsInfo().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((LazyListItemInfo) next).getIndex() == i2) {
                    break;
                }
            }
            if (((LazyListItemInfo) next) != null) {
                LazyListState lazyListState = this.$lazyListState;
                float offset = (r9.getOffset() + (r9.getSize() / 2.0f)) - viewportStartOffset;
                if (Math.abs(offset) > 0.5f) {
                    this.L$0 = coroutineScope;
                    this.I$0 = i2;
                    this.label = 1;
                }
            } else {
                LazyListState lazyListState2 = this.$lazyListState;
                this.L$0 = null;
                this.label = 2;
            }
        }
        return Unit.INSTANCE;
    }
}

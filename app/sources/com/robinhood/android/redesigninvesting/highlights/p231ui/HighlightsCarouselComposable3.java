package com.robinhood.android.redesigninvesting.highlights.p231ui;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import com.plaid.internal.EnumC7081g;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: HighlightsCarouselComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposableKt$HighlightsCarouselComposable$4$1", m3645f = "HighlightsCarouselComposable.kt", m3646l = {98}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposableKt$HighlightsCarouselComposable$4$1, reason: use source file name */
/* loaded from: classes5.dex */
final class HighlightsCarouselComposable3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ SnapshotState<Boolean> $userInteractedOnce$delegate;
    final /* synthetic */ SnapshotState4<HighlightsCarouselViewState> $viewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HighlightsCarouselComposable3(LazyListState lazyListState, CoroutineScope coroutineScope, SnapshotState<Boolean> snapshotState, SnapshotState4<HighlightsCarouselViewState> snapshotState4, Continuation<? super HighlightsCarouselComposable3> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$scope = coroutineScope;
        this.$userInteractedOnce$delegate = snapshotState;
        this.$viewState$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HighlightsCarouselComposable3(this.$listState, this.$scope, this.$userInteractedOnce$delegate, this.$viewState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HighlightsCarouselComposable3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: HighlightsCarouselComposable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposableKt$HighlightsCarouselComposable$4$1$1", m3645f = "HighlightsCarouselComposable.kt", m3646l = {101}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposableKt$HighlightsCarouselComposable$4$1$1 */
    static final class C264921 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LazyListState $listState;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ SnapshotState<Boolean> $userInteractedOnce$delegate;
        final /* synthetic */ SnapshotState4<HighlightsCarouselViewState> $viewState$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C264921(LazyListState lazyListState, CoroutineScope coroutineScope, SnapshotState<Boolean> snapshotState, SnapshotState4<HighlightsCarouselViewState> snapshotState4, Continuation<? super C264921> continuation) {
            super(2, continuation);
            this.$listState = lazyListState;
            this.$scope = coroutineScope;
            this.$userInteractedOnce$delegate = snapshotState;
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C264921(this.$listState, this.$scope, this.$userInteractedOnce$delegate, this.$viewState$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C264921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0069 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0032 -> B:16:0x0035). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object next;
            int i;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (HighlightsCarouselComposable.HighlightsCarouselComposable$lambda$7(this.$userInteractedOnce$delegate)) {
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            LazyListLayoutInfo layoutInfo = this.$listState.getLayoutInfo();
            List<LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
            int iMo5206getViewportSizeYbymL2g = (int) (layoutInfo.mo5206getViewportSizeYbymL2g() >> 32);
            Iterator<T> it = visibleItemsInfo.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = it.next();
                    LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) next;
                    int offset = lazyListItemInfo.getOffset();
                    int size = lazyListItemInfo.getSize() + offset;
                    if (offset >= 0 && size <= iMo5206getViewportSizeYbymL2g) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) next;
            int index = lazyListItemInfo2 == null ? lazyListItemInfo2.getIndex() : this.$listState.getFirstVisibleItemIndex();
            int size2 = HighlightsCarouselComposable.HighlightsCarouselComposable$lambda$3(this.$viewState$delegate).getCarouselItems().size() - 1;
            int i3 = 0;
            if (index != size2 && (i = index + 1) != size2 && (i3 = index + 2) == size2) {
                i3 = i;
            }
            if (i3 != index) {
                BuildersKt__Builders_commonKt.launch$default(this.$scope, Dispatchers.getMain(), null, new AnonymousClass1(this.$listState, i3, null), 2, null);
            }
            if (HighlightsCarouselComposable.HighlightsCarouselComposable$lambda$7(this.$userInteractedOnce$delegate) && !this.$listState.isScrollInProgress()) {
                this.label = 1;
                if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                LazyListLayoutInfo layoutInfo2 = this.$listState.getLayoutInfo();
                List<LazyListItemInfo> visibleItemsInfo2 = layoutInfo2.getVisibleItemsInfo();
                int iMo5206getViewportSizeYbymL2g2 = (int) (layoutInfo2.mo5206getViewportSizeYbymL2g() >> 32);
                Iterator<T> it2 = visibleItemsInfo2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                    }
                }
                LazyListItemInfo lazyListItemInfo22 = (LazyListItemInfo) next;
                if (lazyListItemInfo22 == null) {
                }
                int size22 = HighlightsCarouselComposable.HighlightsCarouselComposable$lambda$3(this.$viewState$delegate).getCarouselItems().size() - 1;
                int i32 = 0;
                if (index != size22) {
                    i32 = i;
                }
                if (i32 != index) {
                }
                if (HighlightsCarouselComposable.HighlightsCarouselComposable$lambda$7(this.$userInteractedOnce$delegate)) {
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }

        /* compiled from: HighlightsCarouselComposable.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposableKt$HighlightsCarouselComposable$4$1$1$1", m3645f = "HighlightsCarouselComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposableKt$HighlightsCarouselComposable$4$1$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ LazyListState $listState;
            final /* synthetic */ int $targetIndex;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(LazyListState lazyListState, int i, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$listState = lazyListState;
                this.$targetIndex = i;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$listState, this.$targetIndex, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    LazyListState lazyListState = this.$listState;
                    int i2 = this.$targetIndex;
                    this.label = 1;
                    if (lazyListState.animateScrollToItem(i2, 0, this) == coroutine_suspended) {
                        return coroutine_suspended;
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
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
            C264921 c264921 = new C264921(this.$listState, this.$scope, this.$userInteractedOnce$delegate, this.$viewState$delegate, null);
            this.label = 1;
            if (BuildersKt.withContext(coroutineDispatcher, c264921, this) == coroutine_suspended) {
                return coroutine_suspended;
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

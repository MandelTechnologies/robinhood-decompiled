package com.google.accompanist.pager;

import androidx.compose.foundation.MutatorMutex2;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableState4;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaver;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.Saver5;
import com.plaid.internal.EnumC7081g;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: PagerState.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 Y2\u00020\u0001:\u0001YB\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0011\u001a\u00020\t2\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0003\u0010\u0010\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0013\u001a\u00020\t2\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0003\u0010\u0010\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0017\u0010\u0015JA\u0010!\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192'\u0010 \u001a#\b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001b¢\u0006\u0002\b\u001fH\u0096@¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0007H\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010)\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R+\u00103\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u0010\u0005R+\u00107\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u0010\u0005R!\u0010<\u001a\u00020\u00028GX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b;\u0010\u0015\u001a\u0004\b:\u00101R\u001b\u0010@\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b>\u0010?R/\u0010F\u001a\u0004\u0018\u00010\u00022\b\u0010-\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bA\u0010/\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER?\u0010M\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010G2\u0010\u0010-\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010G8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010/\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0016\u0010Q\u001a\u0004\u0018\u00010N8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0016\u0010S\u001a\u0004\u0018\u00010N8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bR\u0010PR$\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00028G@@X\u0086\u000e¢\u0006\f\u001a\u0004\bT\u00101\"\u0004\bU\u0010\u0005R\u0014\u0010W\u001a\u00020V8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010X¨\u0006Z"}, m3636d2 = {"Lcom/google/accompanist/pager/PagerState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "currentPage", "<init>", "(I)V", "value", "", "name", "", "requireCurrentPage", "(ILjava/lang/String;)V", "", "requireCurrentPageOffset", "(FLjava/lang/String;)V", "page", "pageOffset", "animateScrollToPage", "(IFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollToPage", "updateCurrentPageBasedOnLazyListState$pager_release", "()V", "updateCurrentPageBasedOnLazyListState", "onScrollFinished$pager_release", "onScrollFinished", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "dispatchRawDelta", "(F)F", "toString", "()Ljava/lang/String;", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "getLazyListState$pager_release", "()Landroidx/compose/foundation/lazy/LazyListState;", "<set-?>", "_currentPage$delegate", "Landroidx/compose/runtime/MutableState;", "get_currentPage", "()I", "set_currentPage", "_currentPage", "itemSpacing$delegate", "getItemSpacing$pager_release", "setItemSpacing$pager_release", "itemSpacing", "pageCount$delegate", "Landroidx/compose/runtime/State;", "getPageCount", "getPageCount$annotations", "pageCount", "currentPageOffset$delegate", "getCurrentPageOffset", "()F", "currentPageOffset", "animationTargetPage$delegate", "getAnimationTargetPage", "()Ljava/lang/Integer;", "setAnimationTargetPage", "(Ljava/lang/Integer;)V", "animationTargetPage", "Lkotlin/Function0;", "flingAnimationTarget$delegate", "getFlingAnimationTarget$pager_release", "()Lkotlin/jvm/functions/Function0;", "setFlingAnimationTarget$pager_release", "(Lkotlin/jvm/functions/Function0;)V", "flingAnimationTarget", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "getCurrentPageLayoutInfo", "()Landroidx/compose/foundation/lazy/LazyListItemInfo;", "currentPageLayoutInfo", "getMostVisiblePageLayoutInfo$pager_release", "mostVisiblePageLayoutInfo", "getCurrentPage", "setCurrentPage$pager_release", "", "isScrollInProgress", "()Z", "Companion", "pager_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class PagerState implements ScrollableState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Saver<PagerState, ?> Saver = ListSaver.listSaver(new Function2<Saver5, PagerState, List<? extends Object>>() { // from class: com.google.accompanist.pager.PagerState$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        public final List<Object> invoke(Saver5 listSaver, PagerState it) {
            Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt.listOf(Integer.valueOf(it.getCurrentPage()));
        }
    }, new Function1<List<? extends Object>, PagerState>() { // from class: com.google.accompanist.pager.PagerState$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        public final PagerState invoke(List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Object obj = it.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            return new PagerState(((Integer) obj).intValue());
        }
    });

    /* renamed from: _currentPage$delegate, reason: from kotlin metadata */
    private final SnapshotState _currentPage;

    /* renamed from: animationTargetPage$delegate, reason: from kotlin metadata */
    private final SnapshotState animationTargetPage;

    /* renamed from: currentPageOffset$delegate, reason: from kotlin metadata */
    private final SnapshotState4 currentPageOffset;

    /* renamed from: flingAnimationTarget$delegate, reason: from kotlin metadata */
    private final SnapshotState flingAnimationTarget;

    /* renamed from: itemSpacing$delegate, reason: from kotlin metadata */
    private final SnapshotState itemSpacing;
    private final LazyListState lazyListState;

    /* renamed from: pageCount$delegate, reason: from kotlin metadata */
    private final SnapshotState4 pageCount;

    /* compiled from: PagerState.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.google.accompanist.pager.PagerState", m3645f = "PagerState.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, 239, EnumC7081g.f2778x3356acf6, 250, EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE}, m3647m = "animateScrollToPage")
    /* renamed from: com.google.accompanist.pager.PagerState$animateScrollToPage$2 */
    static final class C48392 extends ContinuationImpl {
        float F$0;
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C48392(Continuation<? super C48392> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PagerState.this.animateScrollToPage(0, 0.0f, this);
        }
    }

    /* compiled from: PagerState.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.google.accompanist.pager.PagerState", m3645f = "PagerState.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE, EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE}, m3647m = "scrollToPage")
    /* renamed from: com.google.accompanist.pager.PagerState$scrollToPage$1 */
    static final class C48411 extends ContinuationImpl {
        float F$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C48411(Continuation<? super C48411> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PagerState.this.scrollToPage(0, 0.0f, this);
        }
    }

    public PagerState() {
        this(0, 1, null);
    }

    public PagerState(int i) {
        this.lazyListState = new LazyListState(i, 0, 2, null);
        this._currentPage = SnapshotState3.mutableStateOf$default(Integer.valueOf(i), null, 2, null);
        this.itemSpacing = SnapshotState3.mutableStateOf$default(0, null, 2, null);
        this.pageCount = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: com.google.accompanist.pager.PagerState$pageCount$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return Integer.valueOf(this.this$0.getLazyListState().getLayoutInfo().getTotalItemsCount());
            }
        });
        this.currentPageOffset = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: com.google.accompanist.pager.PagerState$currentPageOffset$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Float invoke() {
                float fCoerceIn;
                if (this.this$0.getCurrentPageLayoutInfo() != null) {
                    fCoerceIn = RangesKt.coerceIn((-r0.getOffset()) / (r0.getSize() + this.this$0.getItemSpacing$pager_release()), -0.5f, 0.5f);
                } else {
                    fCoerceIn = 0.0f;
                }
                return Float.valueOf(fCoerceIn);
            }
        });
        this.animationTargetPage = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.flingAnimationTarget = SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    public /* synthetic */ PagerState(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    /* renamed from: getLazyListState$pager_release, reason: from getter */
    public final LazyListState getLazyListState() {
        return this.lazyListState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int get_currentPage() {
        return ((Number) this._currentPage.getValue()).intValue();
    }

    private final void set_currentPage(int i) {
        this._currentPage.setValue(Integer.valueOf(i));
    }

    public final LazyListItemInfo getMostVisiblePageLayoutInfo$pager_release() {
        Object obj;
        LazyListLayoutInfo layoutInfo = this.lazyListState.getLayoutInfo();
        Iterator<T> it = layoutInfo.getVisibleItemsInfo().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) next;
                int iMin = Math.min(lazyListItemInfo.getOffset() + lazyListItemInfo.getSize(), layoutInfo.getViewportEndOffset() - layoutInfo.getAfterContentPadding()) - Math.max(lazyListItemInfo.getOffset(), 0);
                do {
                    Object next2 = it.next();
                    LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) next2;
                    int iMin2 = Math.min(lazyListItemInfo2.getOffset() + lazyListItemInfo2.getSize(), layoutInfo.getViewportEndOffset() - layoutInfo.getAfterContentPadding()) - Math.max(lazyListItemInfo2.getOffset(), 0);
                    if (iMin < iMin2) {
                        next = next2;
                        iMin = iMin2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (LazyListItemInfo) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getItemSpacing$pager_release() {
        return ((Number) this.itemSpacing.getValue()).intValue();
    }

    public final void setItemSpacing$pager_release(int i) {
        this.itemSpacing.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LazyListItemInfo getCurrentPageLayoutInfo() {
        LazyListItemInfo lazyListItemInfoPrevious;
        List<LazyListItemInfo> visibleItemsInfo = this.lazyListState.getLayoutInfo().getVisibleItemsInfo();
        ListIterator<LazyListItemInfo> listIterator = visibleItemsInfo.listIterator(visibleItemsInfo.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                lazyListItemInfoPrevious = null;
                break;
            }
            lazyListItemInfoPrevious = listIterator.previous();
            if (lazyListItemInfoPrevious.getIndex() == getCurrentPage()) {
                break;
            }
        }
        return lazyListItemInfoPrevious;
    }

    public final int getPageCount() {
        return ((Number) this.pageCount.getValue()).intValue();
    }

    public final int getCurrentPage() {
        return get_currentPage();
    }

    public final void setCurrentPage$pager_release(int i) {
        if (i != get_currentPage()) {
            set_currentPage(i);
        }
    }

    public final float getCurrentPageOffset() {
        return ((Number) this.currentPageOffset.getValue()).floatValue();
    }

    private final void setAnimationTargetPage(Integer num) {
        this.animationTargetPage.setValue(num);
    }

    public final void setFlingAnimationTarget$pager_release(Function0<Integer> function0) {
        this.flingAnimationTarget.setValue(function0);
    }

    public static /* synthetic */ Object animateScrollToPage$default(PagerState pagerState, int i, float f, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        return pagerState.animateScrollToPage(i, f, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d0, code lost:
    
        if (r13.animateScrollToItem(r1, r12, r4) != r0) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d5 A[Catch: all -> 0x0038, TryCatch #2 {all -> 0x0038, blocks: (B:14:0x0033, B:75:0x0183, B:76:0x0193, B:78:0x0199, B:81:0x01a7, B:83:0x01ab, B:85:0x01b6, B:58:0x0103, B:59:0x0113, B:61:0x0119, B:65:0x0128, B:67:0x012c, B:70:0x014a, B:72:0x0156, B:49:0x00ca, B:51:0x00d5, B:54:0x00e7), top: B:94:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e7 A[Catch: all -> 0x0038, TryCatch #2 {all -> 0x0038, blocks: (B:14:0x0033, B:75:0x0183, B:76:0x0193, B:78:0x0199, B:81:0x01a7, B:83:0x01ab, B:85:0x01b6, B:58:0x0103, B:59:0x0113, B:61:0x0119, B:65:0x0128, B:67:0x012c, B:70:0x014a, B:72:0x0156, B:49:0x00ca, B:51:0x00d5, B:54:0x00e7), top: B:94:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0119 A[Catch: all -> 0x0038, TryCatch #2 {all -> 0x0038, blocks: (B:14:0x0033, B:75:0x0183, B:76:0x0193, B:78:0x0199, B:81:0x01a7, B:83:0x01ab, B:85:0x01b6, B:58:0x0103, B:59:0x0113, B:61:0x0119, B:65:0x0128, B:67:0x012c, B:70:0x014a, B:72:0x0156, B:49:0x00ca, B:51:0x00d5, B:54:0x00e7), top: B:94:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012c A[Catch: all -> 0x0038, TryCatch #2 {all -> 0x0038, blocks: (B:14:0x0033, B:75:0x0183, B:76:0x0193, B:78:0x0199, B:81:0x01a7, B:83:0x01ab, B:85:0x01b6, B:58:0x0103, B:59:0x0113, B:61:0x0119, B:65:0x0128, B:67:0x012c, B:70:0x014a, B:72:0x0156, B:49:0x00ca, B:51:0x00d5, B:54:0x00e7), top: B:94:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014a A[Catch: all -> 0x0038, TryCatch #2 {all -> 0x0038, blocks: (B:14:0x0033, B:75:0x0183, B:76:0x0193, B:78:0x0199, B:81:0x01a7, B:83:0x01ab, B:85:0x01b6, B:58:0x0103, B:59:0x0113, B:61:0x0119, B:65:0x0128, B:67:0x012c, B:70:0x014a, B:72:0x0156, B:49:0x00ca, B:51:0x00d5, B:54:0x00e7), top: B:94:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0199 A[Catch: all -> 0x0038, TryCatch #2 {all -> 0x0038, blocks: (B:14:0x0033, B:75:0x0183, B:76:0x0193, B:78:0x0199, B:81:0x01a7, B:83:0x01ab, B:85:0x01b6, B:58:0x0103, B:59:0x0113, B:61:0x0119, B:65:0x0128, B:67:0x012c, B:70:0x014a, B:72:0x0156, B:49:0x00ca, B:51:0x00d5, B:54:0x00e7), top: B:94:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object animateScrollToPage(int i, float f, Continuation<? super Unit> continuation) throws Throwable {
        C48392 c48392;
        Throwable th;
        PagerState pagerState;
        int i2;
        PagerState pagerState2;
        PagerState pagerState3;
        int i3;
        int i4;
        Iterator<T> it;
        Object next;
        int size;
        Iterator<T> it2;
        LazyListItemInfo lazyListItemInfo;
        if (continuation instanceof C48392) {
            c48392 = (C48392) continuation;
            int i5 = c48392.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c48392.label = i5 - Integer.MIN_VALUE;
            } else {
                c48392 = new C48392(continuation);
            }
        }
        C48392 c483922 = c48392;
        Object obj = c483922.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = c483922.label;
        Object obj2 = null;
        try {
            try {
                switch (r1) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        requireCurrentPage(i, "page");
                        requireCurrentPageOffset(f, "pageOffset");
                        try {
                            setAnimationTargetPage(boxing.boxInt(i));
                            int firstVisibleItemIndex = this.lazyListState.getFirstVisibleItemIndex();
                            if (Math.abs(i - firstVisibleItemIndex) <= 3) {
                                i2 = i;
                                pagerState2 = this;
                                if (Math.abs(f) <= 0.005f) {
                                }
                                return coroutine_suspended;
                            }
                            LazyListState lazyListState = this.lazyListState;
                            int i6 = i > firstVisibleItemIndex ? i - 3 : i + 3;
                            c483922.L$0 = this;
                            c483922.I$0 = i;
                            c483922.F$0 = f;
                            c483922.label = 1;
                            if (LazyListState.scrollToItem$default(lazyListState, i6, 0, c483922, 2, null) != coroutine_suspended) {
                                pagerState3 = this;
                                i4 = i;
                                i2 = i4;
                                pagerState2 = pagerState3;
                                if (Math.abs(f) <= 0.005f) {
                                    LazyListState lazyListState2 = pagerState2.lazyListState;
                                    c483922.L$0 = pagerState2;
                                    c483922.label = 2;
                                    if (LazyListState.animateScrollToItem$default(lazyListState2, i2, 0, c483922, 2, null) == coroutine_suspended) {
                                    }
                                    pagerState2.onScrollFinished$pager_release();
                                    return Unit.INSTANCE;
                                }
                                int i7 = i2;
                                LazyListState lazyListState3 = pagerState2.lazyListState;
                                C48403 c48403 = new C48403(null);
                                c483922.L$0 = pagerState2;
                                c483922.I$0 = i7;
                                c483922.F$0 = f;
                                c483922.label = 3;
                                if (ScrollableState.scroll$default(lazyListState3, null, c48403, c483922, 1, null) != coroutine_suspended) {
                                    i3 = i7;
                                    LazyListLayoutInfo layoutInfo = pagerState2.lazyListState.getLayoutInfo();
                                    it = layoutInfo.getVisibleItemsInfo().iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            next = null;
                                        } else {
                                            next = it.next();
                                            if (((LazyListItemInfo) next).getIndex() == i3) {
                                            }
                                        }
                                    }
                                    if (((LazyListItemInfo) next) == null) {
                                        LazyListState lazyListState4 = pagerState2.lazyListState;
                                        int iRoundToInt = MathKt.roundToInt((r3.getSize() + pagerState2.getItemSpacing$pager_release()) * f);
                                        c483922.L$0 = pagerState2;
                                        c483922.label = 4;
                                        if (lazyListState4.animateScrollToItem(i3, iRoundToInt, c483922) == coroutine_suspended) {
                                        }
                                        pagerState2.onScrollFinished$pager_release();
                                        return Unit.INSTANCE;
                                    }
                                    if (!layoutInfo.getVisibleItemsInfo().isEmpty()) {
                                        size = ((LazyListItemInfo) CollectionsKt.first((List) layoutInfo.getVisibleItemsInfo())).getSize() + pagerState2.getItemSpacing$pager_release();
                                        LazyListState lazyListState5 = pagerState2.lazyListState;
                                        int iRoundToInt2 = MathKt.roundToInt(size * f);
                                        c483922.L$0 = pagerState2;
                                        c483922.I$0 = i3;
                                        c483922.F$0 = f;
                                        c483922.I$1 = size;
                                        c483922.label = 5;
                                        if (lazyListState5.animateScrollToItem(i3, iRoundToInt2, c483922) != coroutine_suspended) {
                                            it2 = pagerState2.lazyListState.getLayoutInfo().getVisibleItemsInfo().iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    Object next2 = it2.next();
                                                    if (((LazyListItemInfo) next2).getIndex() == i3) {
                                                        obj2 = next2;
                                                    }
                                                }
                                            }
                                            lazyListItemInfo = (LazyListItemInfo) obj2;
                                            if (lazyListItemInfo != null && lazyListItemInfo.getSize() + pagerState2.getItemSpacing$pager_release() != size) {
                                                LazyListState lazyListState6 = pagerState2.lazyListState;
                                                int iRoundToInt3 = MathKt.roundToInt((lazyListItemInfo.getSize() + pagerState2.getItemSpacing$pager_release()) * f);
                                                c483922.L$0 = pagerState2;
                                                c483922.label = 6;
                                                break;
                                            }
                                        }
                                    }
                                    pagerState2.onScrollFinished$pager_release();
                                    return Unit.INSTANCE;
                                }
                            }
                            return coroutine_suspended;
                        } catch (Throwable th2) {
                            th = th2;
                            pagerState = this;
                            pagerState.onScrollFinished$pager_release();
                            throw th;
                        }
                    case 1:
                        f = c483922.F$0;
                        int i8 = c483922.I$0;
                        pagerState3 = (PagerState) c483922.L$0;
                        ResultKt.throwOnFailure(obj);
                        i4 = i8;
                        i2 = i4;
                        pagerState2 = pagerState3;
                        if (Math.abs(f) <= 0.005f) {
                        }
                        return coroutine_suspended;
                    case 2:
                        pagerState2 = (PagerState) c483922.L$0;
                        ResultKt.throwOnFailure(obj);
                        pagerState2.onScrollFinished$pager_release();
                        return Unit.INSTANCE;
                    case 3:
                        float f2 = c483922.F$0;
                        int i9 = c483922.I$0;
                        PagerState pagerState4 = (PagerState) c483922.L$0;
                        ResultKt.throwOnFailure(obj);
                        f = f2;
                        pagerState2 = pagerState4;
                        i3 = i9;
                        LazyListLayoutInfo layoutInfo2 = pagerState2.lazyListState.getLayoutInfo();
                        it = layoutInfo2.getVisibleItemsInfo().iterator();
                        while (true) {
                            if (it.hasNext()) {
                            }
                        }
                        if (((LazyListItemInfo) next) == null) {
                        }
                        break;
                    case 4:
                        pagerState2 = (PagerState) c483922.L$0;
                        ResultKt.throwOnFailure(obj);
                        pagerState2.onScrollFinished$pager_release();
                        return Unit.INSTANCE;
                    case 5:
                        int i10 = c483922.I$1;
                        f = c483922.F$0;
                        i3 = c483922.I$0;
                        PagerState pagerState5 = (PagerState) c483922.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            size = i10;
                            pagerState2 = pagerState5;
                            it2 = pagerState2.lazyListState.getLayoutInfo().getVisibleItemsInfo().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                }
                            }
                            lazyListItemInfo = (LazyListItemInfo) obj2;
                            if (lazyListItemInfo != null) {
                                LazyListState lazyListState62 = pagerState2.lazyListState;
                                int iRoundToInt32 = MathKt.roundToInt((lazyListItemInfo.getSize() + pagerState2.getItemSpacing$pager_release()) * f);
                                c483922.L$0 = pagerState2;
                                c483922.label = 6;
                                break;
                            }
                            pagerState2.onScrollFinished$pager_release();
                            return Unit.INSTANCE;
                        } catch (Throwable th3) {
                            th = th3;
                            pagerState = pagerState5;
                            pagerState.onScrollFinished$pager_release();
                            throw th;
                        }
                    case 6:
                        pagerState2 = (PagerState) c483922.L$0;
                        ResultKt.throwOnFailure(obj);
                        pagerState2.onScrollFinished$pager_release();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th4) {
                th = th4;
                pagerState = r1;
            }
        } catch (Throwable th5) {
            th = th5;
            pagerState = i;
        }
    }

    /* compiled from: PagerState.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.google.accompanist.pager.PagerState$animateScrollToPage$3", m3645f = "PagerState.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.google.accompanist.pager.PagerState$animateScrollToPage$3 */
    static final class C48403 extends ContinuationImpl7 implements Function2<ScrollableState4, Continuation<? super Unit>, Object> {
        int label;

        C48403(Continuation<? super C48403> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C48403(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollableState4 scrollableState4, Continuation<? super Unit> continuation) {
            return ((C48403) create(scrollableState4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Object scrollToPage$default(PagerState pagerState, int i, float f, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        return pagerState.scrollToPage(i, f, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object scrollToPage(int i, float f, Continuation<? super Unit> continuation) throws Throwable {
        C48411 c48411;
        Throwable th;
        PagerState pagerState;
        PagerState pagerState2;
        PagerState pagerState3;
        LazyListItemInfo currentPageLayoutInfo;
        PagerState$scrollToPage$2$1 pagerState$scrollToPage$2$1;
        if (continuation instanceof C48411) {
            c48411 = (C48411) continuation;
            int i2 = c48411.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c48411.label = i2 - Integer.MIN_VALUE;
            } else {
                c48411 = new C48411(continuation);
            }
        }
        C48411 c484112 = c48411;
        Object obj = c484112.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c484112.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            requireCurrentPage(i, "page");
            requireCurrentPageOffset(f, "pageOffset");
            try {
                setAnimationTargetPage(boxing.boxInt(i));
                LazyListState lazyListState = this.lazyListState;
                c484112.L$0 = this;
                c484112.F$0 = f;
                c484112.label = 1;
                if (LazyListState.scrollToItem$default(lazyListState, i, 0, c484112, 2, null) != coroutine_suspended) {
                    pagerState = this;
                    pagerState.updateCurrentPageBasedOnLazyListState$pager_release();
                    if (Math.abs(f) > 1.0E-4f) {
                        pagerState$scrollToPage$2$1 = new PagerState$scrollToPage$2$1(currentPageLayoutInfo, pagerState, f, null);
                        c484112.L$0 = pagerState;
                        c484112.label = 2;
                        if (ScrollableState.scroll$default(pagerState, null, pagerState$scrollToPage$2$1, c484112, 1, null) != coroutine_suspended) {
                        }
                    }
                }
                return coroutine_suspended;
            } catch (Throwable th2) {
                th = th2;
                pagerState3 = this;
                pagerState3.onScrollFinished$pager_release();
                throw th;
            }
        }
        try {
            if (i3 == 1) {
                f = c484112.F$0;
                PagerState pagerState4 = (PagerState) c484112.L$0;
                ResultKt.throwOnFailure(obj);
                pagerState = pagerState4;
                try {
                    pagerState.updateCurrentPageBasedOnLazyListState$pager_release();
                    if (Math.abs(f) > 1.0E-4f && (currentPageLayoutInfo = pagerState.getCurrentPageLayoutInfo()) != null) {
                        pagerState$scrollToPage$2$1 = new PagerState$scrollToPage$2$1(currentPageLayoutInfo, pagerState, f, null);
                        c484112.L$0 = pagerState;
                        c484112.label = 2;
                        if (ScrollableState.scroll$default(pagerState, null, pagerState$scrollToPage$2$1, c484112, 1, null) != coroutine_suspended) {
                            pagerState2 = pagerState;
                            pagerState = pagerState2;
                        }
                        return coroutine_suspended;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    pagerState3 = pagerState;
                    pagerState3.onScrollFinished$pager_release();
                    throw th;
                }
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pagerState2 = (PagerState) c484112.L$0;
                ResultKt.throwOnFailure(obj);
                pagerState = pagerState2;
            }
        } catch (Throwable th4) {
            th = th4;
            pagerState3 = i;
            pagerState3.onScrollFinished$pager_release();
            throw th;
        }
        pagerState.onScrollFinished$pager_release();
        return Unit.INSTANCE;
    }

    public final void updateCurrentPageBasedOnLazyListState$pager_release() {
        LazyListItemInfo mostVisiblePageLayoutInfo$pager_release = getMostVisiblePageLayoutInfo$pager_release();
        if (mostVisiblePageLayoutInfo$pager_release != null) {
            setCurrentPage$pager_release(mostVisiblePageLayoutInfo$pager_release.getIndex());
        }
    }

    public final void onScrollFinished$pager_release() {
        setAnimationTargetPage(null);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatorMutex2 mutatorMutex2, Function2<? super ScrollableState4, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objScroll = this.lazyListState.scroll(mutatorMutex2, function2, continuation);
        return objScroll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScroll : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return this.lazyListState.dispatchRawDelta(delta);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.lazyListState.isScrollInProgress();
    }

    public String toString() {
        return "PagerState(pageCount=" + getPageCount() + ", currentPage=" + getCurrentPage() + ", currentPageOffset=" + getCurrentPageOffset() + ')';
    }

    private final void requireCurrentPage(int value, String name) {
        if (value >= 0) {
            return;
        }
        throw new IllegalArgumentException((name + '[' + value + "] must be >= 0").toString());
    }

    private final void requireCurrentPageOffset(float value, String name) {
        if (-1.0f > value || value > 1.0f) {
            throw new IllegalArgumentException((name + " must be >= -1 and <= 1").toString());
        }
    }

    /* compiled from: PagerState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/google/accompanist/pager/PagerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Lcom/google/accompanist/pager/PagerState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "pager_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<PagerState, ?> getSaver() {
            return PagerState.Saver;
        }
    }
}

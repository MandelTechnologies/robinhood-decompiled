package androidx.paging;

import androidx.paging.PageEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: PagingData.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u0016*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0001\u0016BC\b\u0000\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f0\u000b¢\u0006\u0002\u0010\rJ\u0015\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\fH\u0000¢\u0006\u0002\b\u0015R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m3636d2 = {"Landroidx/paging/PagingData;", "T", "", "flow", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PageEvent;", "uiReceiver", "Landroidx/paging/UiReceiver;", "hintReceiver", "Landroidx/paging/HintReceiver;", "cachedPageEvent", "Lkotlin/Function0;", "Landroidx/paging/PageEvent$Insert;", "(Lkotlinx/coroutines/flow/Flow;Landroidx/paging/UiReceiver;Landroidx/paging/HintReceiver;Lkotlin/jvm/functions/Function0;)V", "getFlow$paging_common_release", "()Lkotlinx/coroutines/flow/Flow;", "getHintReceiver$paging_common_release", "()Landroidx/paging/HintReceiver;", "getUiReceiver$paging_common_release", "()Landroidx/paging/UiReceiver;", "cachedEvent", "cachedEvent$paging_common_release", "Companion", "paging-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class PagingData<T> {
    private final Function0<PageEvent.Insert<T>> cachedPageEvent;
    private final Flow<PageEvent<T>> flow;
    private final HintReceiver hintReceiver;
    private final UiReceiver uiReceiver;
    private static final UiReceiver NOOP_UI_RECEIVER = new UiReceiver() { // from class: androidx.paging.PagingData$Companion$NOOP_UI_RECEIVER$1
        @Override // androidx.paging.UiReceiver
        public void refresh() {
        }

        @Override // androidx.paging.UiReceiver
        public void retry() {
        }
    };
    private static final HintReceiver NOOP_HINT_RECEIVER = new HintReceiver() { // from class: androidx.paging.PagingData$Companion$NOOP_HINT_RECEIVER$1
        @Override // androidx.paging.HintReceiver
        public void accessHint(ViewportHint viewportHint) {
            Intrinsics.checkNotNullParameter(viewportHint, "viewportHint");
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public PagingData(Flow<? extends PageEvent<T>> flow, UiReceiver uiReceiver, HintReceiver hintReceiver, Function0<PageEvent.Insert<T>> cachedPageEvent) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(uiReceiver, "uiReceiver");
        Intrinsics.checkNotNullParameter(hintReceiver, "hintReceiver");
        Intrinsics.checkNotNullParameter(cachedPageEvent, "cachedPageEvent");
        this.flow = flow;
        this.uiReceiver = uiReceiver;
        this.hintReceiver = hintReceiver;
        this.cachedPageEvent = cachedPageEvent;
    }

    public final Flow<PageEvent<T>> getFlow$paging_common_release() {
        return this.flow;
    }

    /* renamed from: getUiReceiver$paging_common_release, reason: from getter */
    public final UiReceiver getUiReceiver() {
        return this.uiReceiver;
    }

    /* renamed from: getHintReceiver$paging_common_release, reason: from getter */
    public final HintReceiver getHintReceiver() {
        return this.hintReceiver;
    }

    public /* synthetic */ PagingData(Flow flow, UiReceiver uiReceiver, HintReceiver hintReceiver, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(flow, uiReceiver, hintReceiver, (i & 8) != 0 ? new Function0() { // from class: androidx.paging.PagingData.1
            @Override // kotlin.jvm.functions.Function0
            public final Void invoke() {
                return null;
            }
        } : function0);
    }

    public final PageEvent.Insert<T> cachedEvent$paging_common_release() {
        return this.cachedPageEvent.invoke();
    }
}

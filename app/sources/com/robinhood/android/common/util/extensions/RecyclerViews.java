package com.robinhood.android.common.util.extensions;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecyclerViews.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u001aB\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006\f"}, m3636d2 = {"addOneTimeScrollListener", "", "Landroidx/recyclerview/widget/RecyclerView;", "block", "Lkotlin/Function0;", "addAutoSelectingScrollListener", "onPositionSelected", "Lkotlin/Function1;", "", "getFirstVisibleItem", "Landroidx/recyclerview/widget/LinearLayoutManager;", "onAutoScroll", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.util.extensions.RecyclerViewsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class RecyclerViews {
    public static final void addOneTimeScrollListener(final RecyclerView recyclerView, final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.robinhood.android.common.util.extensions.RecyclerViewsKt.addOneTimeScrollListener.1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView2, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView2, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                if (newState == 1) {
                    recyclerView.removeOnScrollListener(this);
                    block.invoke();
                }
            }
        });
    }

    public static /* synthetic */ void addAutoSelectingScrollListener$default(RecyclerView recyclerView, Function1 function1, Function1 function12, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: com.robinhood.android.common.util.extensions.RecyclerViewsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        addAutoSelectingScrollListener(recyclerView, function1, function12, function0);
    }

    public static final void addAutoSelectingScrollListener(final RecyclerView recyclerView, final Function1<? super Integer, Unit> onPositionSelected, final Function1<? super LinearLayoutManager, Integer> getFirstVisibleItem, final Function0<Unit> onAutoScroll) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(onPositionSelected, "onPositionSelected");
        Intrinsics.checkNotNullParameter(getFirstVisibleItem, "getFirstVisibleItem");
        Intrinsics.checkNotNullParameter(onAutoScroll, "onAutoScroll");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        final LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.robinhood.android.common.util.extensions.RecyclerViewsKt.addAutoSelectingScrollListener.2
            private boolean isSmoothSettling;

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView2, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                if (this.isSmoothSettling && newState == 0) {
                    highlightFirstVisible();
                }
                this.isSmoothSettling = linearLayoutManager.isSmoothScrolling() && newState == 2;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView2, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                if (linearLayoutManager.isSmoothScrolling() || this.isSmoothSettling) {
                    return;
                }
                onAutoScroll.invoke();
                highlightFirstVisible();
            }

            private final void highlightFirstVisible() {
                final int iIntValue = getFirstVisibleItem.invoke(linearLayoutManager).intValue();
                if (iIntValue != -1) {
                    RecyclerView recyclerView2 = recyclerView;
                    final Function1<Integer, Unit> function1 = onPositionSelected;
                    recyclerView2.post(new Runnable() { // from class: com.robinhood.android.common.util.extensions.RecyclerViewsKt$addAutoSelectingScrollListener$2$highlightFirstVisible$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            function1.invoke(Integer.valueOf(iIntValue));
                        }
                    });
                }
            }
        });
    }
}

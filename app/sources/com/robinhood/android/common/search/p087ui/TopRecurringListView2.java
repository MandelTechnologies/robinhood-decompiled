package com.robinhood.android.common.search.p087ui;

import android.view.View;
import com.robinhood.android.common.search.databinding.MergeTopRecurringListBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TopRecurringListView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.search.ui.TopRecurringListView$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class TopRecurringListView2 extends FunctionReferenceImpl implements Function1<View, MergeTopRecurringListBinding> {
    public static final TopRecurringListView2 INSTANCE = new TopRecurringListView2();

    TopRecurringListView2() {
        super(1, MergeTopRecurringListBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/search/databinding/MergeTopRecurringListBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeTopRecurringListBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeTopRecurringListBinding.bind(p0);
    }
}

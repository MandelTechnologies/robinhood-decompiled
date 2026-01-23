package com.robinhood.android.directipo.allocation.p104ui;

import android.view.View;
import com.robinhood.android.directipo.allocation.databinding.MergeDirectIpoSummaryStatItemBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoSummaryStatItemView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directipo.allocation.ui.DirectIpoSummaryStatItemView$binding$2, reason: use source file name */
/* loaded from: classes27.dex */
/* synthetic */ class DirectIpoSummaryStatItemView2 extends FunctionReferenceImpl implements Function1<View, MergeDirectIpoSummaryStatItemBinding> {
    public static final DirectIpoSummaryStatItemView2 INSTANCE = new DirectIpoSummaryStatItemView2();

    DirectIpoSummaryStatItemView2() {
        super(1, MergeDirectIpoSummaryStatItemBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/directipo/allocation/databinding/MergeDirectIpoSummaryStatItemBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeDirectIpoSummaryStatItemBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeDirectIpoSummaryStatItemBinding.bind(p0);
    }
}

package com.robinhood.android.equitydetail.p123ui.ipo;

import android.view.View;
import com.robinhood.android.equitydetail.databinding.MergeIpoResultsRowBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IpoResultsSectionRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.ipo.IpoResultsSectionRowView$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class IpoResultsSectionRowView2 extends FunctionReferenceImpl implements Function1<View, MergeIpoResultsRowBinding> {
    public static final IpoResultsSectionRowView2 INSTANCE = new IpoResultsSectionRowView2();

    IpoResultsSectionRowView2() {
        super(1, MergeIpoResultsRowBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/equitydetail/databinding/MergeIpoResultsRowBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeIpoResultsRowBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeIpoResultsRowBinding.bind(p0);
    }
}

package com.robinhood.android.cash.disputes.view;

import android.view.View;
import com.robinhood.android.cash.disputes.databinding.MergeDateSelectionViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DateSelectionView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.disputes.view.DateSelectionView$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class DateSelectionView2 extends FunctionReferenceImpl implements Function1<View, MergeDateSelectionViewBinding> {
    public static final DateSelectionView2 INSTANCE = new DateSelectionView2();

    DateSelectionView2() {
        super(1, MergeDateSelectionViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/cash/disputes/databinding/MergeDateSelectionViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeDateSelectionViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeDateSelectionViewBinding.bind(p0);
    }
}

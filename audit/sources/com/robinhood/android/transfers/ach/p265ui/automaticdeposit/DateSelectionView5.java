package com.robinhood.android.transfers.ach.p265ui.automaticdeposit;

import android.view.View;
import com.robinhood.android.transfers.ach.databinding.MergeDateSelectionViewLegacyBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DateSelectionView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.DateSelectionView$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class DateSelectionView5 extends FunctionReferenceImpl implements Function1<View, MergeDateSelectionViewLegacyBinding> {
    public static final DateSelectionView5 INSTANCE = new DateSelectionView5();

    DateSelectionView5() {
        super(1, MergeDateSelectionViewLegacyBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/transfers/ach/databinding/MergeDateSelectionViewLegacyBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeDateSelectionViewLegacyBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeDateSelectionViewLegacyBinding.bind(p0);
    }
}

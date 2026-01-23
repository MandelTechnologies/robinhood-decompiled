package com.robinhood.android.equitydetail.p123ui.similarinstruments;

import android.view.View;
import com.robinhood.android.equitydetail.databinding.MergeSimilarInstrumentsBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SimilarInstrumentsView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsView$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class SimilarInstrumentsView2 extends FunctionReferenceImpl implements Function1<View, MergeSimilarInstrumentsBinding> {
    public static final SimilarInstrumentsView2 INSTANCE = new SimilarInstrumentsView2();

    SimilarInstrumentsView2() {
        super(1, MergeSimilarInstrumentsBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/equitydetail/databinding/MergeSimilarInstrumentsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeSimilarInstrumentsBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeSimilarInstrumentsBinding.bind(p0);
    }
}

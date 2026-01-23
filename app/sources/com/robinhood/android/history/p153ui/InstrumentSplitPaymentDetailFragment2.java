package com.robinhood.android.history.p153ui;

import android.view.View;
import com.robinhood.android.history.databinding.FragmentInstrumentSplitPaymentDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentSplitPaymentDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.history.ui.InstrumentSplitPaymentDetailFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class InstrumentSplitPaymentDetailFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentInstrumentSplitPaymentDetailBinding> {
    public static final InstrumentSplitPaymentDetailFragment2 INSTANCE = new InstrumentSplitPaymentDetailFragment2();

    InstrumentSplitPaymentDetailFragment2() {
        super(1, FragmentInstrumentSplitPaymentDetailBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/history/databinding/FragmentInstrumentSplitPaymentDetailBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentInstrumentSplitPaymentDetailBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentInstrumentSplitPaymentDetailBinding.bind(p0);
    }
}

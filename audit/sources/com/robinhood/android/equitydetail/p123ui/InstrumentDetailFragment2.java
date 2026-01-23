package com.robinhood.android.equitydetail.p123ui;

import android.view.View;
import com.robinhood.android.equitydetail.databinding.FragmentInstrumentDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class InstrumentDetailFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentInstrumentDetailBinding> {
    public static final InstrumentDetailFragment2 INSTANCE = new InstrumentDetailFragment2();

    InstrumentDetailFragment2() {
        super(1, FragmentInstrumentDetailBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/equitydetail/databinding/FragmentInstrumentDetailBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentInstrumentDetailBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentInstrumentDetailBinding.bind(p0);
    }
}

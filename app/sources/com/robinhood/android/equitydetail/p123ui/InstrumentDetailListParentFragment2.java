package com.robinhood.android.equitydetail.p123ui;

import android.view.View;
import com.robinhood.android.equitydetail.databinding.FragmentInstrumentDetailListBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentDetailListParentFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class InstrumentDetailListParentFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentInstrumentDetailListBinding> {
    public static final InstrumentDetailListParentFragment2 INSTANCE = new InstrumentDetailListParentFragment2();

    InstrumentDetailListParentFragment2() {
        super(1, FragmentInstrumentDetailListBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/equitydetail/databinding/FragmentInstrumentDetailListBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentInstrumentDetailListBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentInstrumentDetailListBinding.bind(p0);
    }
}

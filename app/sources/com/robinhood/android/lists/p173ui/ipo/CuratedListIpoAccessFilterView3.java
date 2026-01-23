package com.robinhood.android.lists.p173ui.ipo;

import android.view.View;
import com.robinhood.android.lists.databinding.MergeCuratedListIpoAccessFilterBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListIpoAccessFilterView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lists.ui.ipo.CuratedListIpoAccessFilterView$binding$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class CuratedListIpoAccessFilterView3 extends FunctionReferenceImpl implements Function1<View, MergeCuratedListIpoAccessFilterBinding> {
    public static final CuratedListIpoAccessFilterView3 INSTANCE = new CuratedListIpoAccessFilterView3();

    CuratedListIpoAccessFilterView3() {
        super(1, MergeCuratedListIpoAccessFilterBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/lists/databinding/MergeCuratedListIpoAccessFilterBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeCuratedListIpoAccessFilterBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeCuratedListIpoAccessFilterBinding.bind(p0);
    }
}

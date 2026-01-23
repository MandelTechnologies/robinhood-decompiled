package com.robinhood.android.lists.p173ui.ipo;

import android.view.View;
import com.robinhood.android.lists.databinding.MergeCuratedListIpoAccessHeaderBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListIpoAccessHeaderView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lists.ui.ipo.CuratedListIpoAccessHeaderView$binding$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class CuratedListIpoAccessHeaderView2 extends FunctionReferenceImpl implements Function1<View, MergeCuratedListIpoAccessHeaderBinding> {
    public static final CuratedListIpoAccessHeaderView2 INSTANCE = new CuratedListIpoAccessHeaderView2();

    CuratedListIpoAccessHeaderView2() {
        super(1, MergeCuratedListIpoAccessHeaderBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/lists/databinding/MergeCuratedListIpoAccessHeaderBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeCuratedListIpoAccessHeaderBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeCuratedListIpoAccessHeaderBinding.bind(p0);
    }
}

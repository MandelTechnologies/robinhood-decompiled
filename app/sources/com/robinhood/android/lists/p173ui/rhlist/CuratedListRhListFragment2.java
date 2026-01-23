package com.robinhood.android.lists.p173ui.rhlist;

import android.view.View;
import com.robinhood.android.lists.databinding.FragmentCuratedListRhListBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListRhListFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$binding$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class CuratedListRhListFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentCuratedListRhListBinding> {
    public static final CuratedListRhListFragment2 INSTANCE = new CuratedListRhListFragment2();

    CuratedListRhListFragment2() {
        super(1, FragmentCuratedListRhListBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/lists/databinding/FragmentCuratedListRhListBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentCuratedListRhListBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentCuratedListRhListBinding.bind(p0);
    }
}

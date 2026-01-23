package com.robinhood.android.lists.p173ui.rhlist;

import android.view.View;
import com.robinhood.android.lists.databinding.MergeRhListHeaderViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListRhListHeaderView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lists.ui.rhlist.CuratedListRhListHeaderView$binding$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class CuratedListRhListHeaderView4 extends FunctionReferenceImpl implements Function1<View, MergeRhListHeaderViewBinding> {
    public static final CuratedListRhListHeaderView4 INSTANCE = new CuratedListRhListHeaderView4();

    CuratedListRhListHeaderView4() {
        super(1, MergeRhListHeaderViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/lists/databinding/MergeRhListHeaderViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeRhListHeaderViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeRhListHeaderViewBinding.bind(p0);
    }
}

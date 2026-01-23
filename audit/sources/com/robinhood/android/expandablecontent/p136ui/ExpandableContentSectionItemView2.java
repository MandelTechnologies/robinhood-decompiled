package com.robinhood.android.expandablecontent.p136ui;

import android.view.View;
import com.robinhood.android.expandablecontent.databinding.MergeExpandableContentSectionItemBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExpandableContentSectionItemView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.expandablecontent.ui.ExpandableContentSectionItemView$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class ExpandableContentSectionItemView2 extends FunctionReferenceImpl implements Function1<View, MergeExpandableContentSectionItemBinding> {
    public static final ExpandableContentSectionItemView2 INSTANCE = new ExpandableContentSectionItemView2();

    ExpandableContentSectionItemView2() {
        super(1, MergeExpandableContentSectionItemBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/expandablecontent/databinding/MergeExpandableContentSectionItemBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeExpandableContentSectionItemBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeExpandableContentSectionItemBinding.bind(p0);
    }
}

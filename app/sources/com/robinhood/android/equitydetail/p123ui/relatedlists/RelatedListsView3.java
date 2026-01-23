package com.robinhood.android.equitydetail.p123ui.relatedlists;

import android.view.View;
import com.robinhood.android.equitydetail.databinding.MergeRelatedIndustryViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RelatedListsView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.relatedlists.RelatedListsView$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class RelatedListsView3 extends FunctionReferenceImpl implements Function1<View, MergeRelatedIndustryViewBinding> {
    public static final RelatedListsView3 INSTANCE = new RelatedListsView3();

    RelatedListsView3() {
        super(1, MergeRelatedIndustryViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/equitydetail/databinding/MergeRelatedIndustryViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeRelatedIndustryViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeRelatedIndustryViewBinding.bind(p0);
    }
}

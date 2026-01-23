package com.robinhood.android.matcha.p177ui.history.detail.request;

import android.view.View;
import com.robinhood.android.matcha.databinding.FragmentMatchaRequestDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaRequestDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.history.detail.request.MatchaRequestDetailFragment$binding$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class MatchaRequestDetailFragment3 extends FunctionReferenceImpl implements Function1<View, FragmentMatchaRequestDetailBinding> {
    public static final MatchaRequestDetailFragment3 INSTANCE = new MatchaRequestDetailFragment3();

    MatchaRequestDetailFragment3() {
        super(1, FragmentMatchaRequestDetailBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/matcha/databinding/FragmentMatchaRequestDetailBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentMatchaRequestDetailBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentMatchaRequestDetailBinding.bind(p0);
    }
}

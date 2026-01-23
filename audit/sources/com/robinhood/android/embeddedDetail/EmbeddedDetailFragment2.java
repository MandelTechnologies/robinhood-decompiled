package com.robinhood.android.embeddedDetail;

import android.view.View;
import com.robinhood.android.embeddedDetail.databinding.FragmentEmbeddedDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmbeddedDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.embeddedDetail.EmbeddedDetailFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class EmbeddedDetailFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentEmbeddedDetailBinding> {
    public static final EmbeddedDetailFragment2 INSTANCE = new EmbeddedDetailFragment2();

    EmbeddedDetailFragment2() {
        super(1, FragmentEmbeddedDetailBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/embeddedDetail/databinding/FragmentEmbeddedDetailBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentEmbeddedDetailBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentEmbeddedDetailBinding.bind(p0);
    }
}

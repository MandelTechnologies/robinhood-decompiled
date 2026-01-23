package com.robinhood.android.acatsin.assets;

import android.view.View;
import com.robinhood.android.acatsin.databinding.FragmentAcatsInAssetListBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInAssetListFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.assets.AcatsInAssetListFragment$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AcatsInAssetListFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAcatsInAssetListBinding> {
    public static final AcatsInAssetListFragment2 INSTANCE = new AcatsInAssetListFragment2();

    AcatsInAssetListFragment2() {
        super(1, FragmentAcatsInAssetListBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/acatsin/databinding/FragmentAcatsInAssetListBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAcatsInAssetListBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAcatsInAssetListBinding.bind(p0);
    }
}

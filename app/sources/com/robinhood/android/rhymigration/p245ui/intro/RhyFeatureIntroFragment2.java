package com.robinhood.android.rhymigration.p245ui.intro;

import android.view.View;
import com.robinhood.android.rhymigration.databinding.FragmentRhyFeatureIntroBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyFeatureIntroFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhymigration.ui.intro.RhyFeatureIntroFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class RhyFeatureIntroFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRhyFeatureIntroBinding> {
    public static final RhyFeatureIntroFragment2 INSTANCE = new RhyFeatureIntroFragment2();

    RhyFeatureIntroFragment2() {
        super(1, FragmentRhyFeatureIntroBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/rhymigration/databinding/FragmentRhyFeatureIntroBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRhyFeatureIntroBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRhyFeatureIntroBinding.bind(p0);
    }
}

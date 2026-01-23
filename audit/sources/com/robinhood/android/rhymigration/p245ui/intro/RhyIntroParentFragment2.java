package com.robinhood.android.rhymigration.p245ui.intro;

import android.view.View;
import com.robinhood.android.rhymigration.databinding.FragmentRhyIntroParentBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyIntroParentFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhymigration.ui.intro.RhyIntroParentFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class RhyIntroParentFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRhyIntroParentBinding> {
    public static final RhyIntroParentFragment2 INSTANCE = new RhyIntroParentFragment2();

    RhyIntroParentFragment2() {
        super(1, FragmentRhyIntroParentBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/rhymigration/databinding/FragmentRhyIntroParentBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRhyIntroParentBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRhyIntroParentBinding.bind(p0);
    }
}

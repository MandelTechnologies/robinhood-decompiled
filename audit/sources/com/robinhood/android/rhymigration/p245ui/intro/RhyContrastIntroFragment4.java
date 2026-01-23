package com.robinhood.android.rhymigration.p245ui.intro;

import android.view.View;
import com.robinhood.android.rhymigration.databinding.FragmentRhyContrastIntroBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyContrastIntroFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhymigration.ui.intro.RhyContrastIntroFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class RhyContrastIntroFragment4 extends FunctionReferenceImpl implements Function1<View, FragmentRhyContrastIntroBinding> {
    public static final RhyContrastIntroFragment4 INSTANCE = new RhyContrastIntroFragment4();

    RhyContrastIntroFragment4() {
        super(1, FragmentRhyContrastIntroBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/rhymigration/databinding/FragmentRhyContrastIntroBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRhyContrastIntroBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRhyContrastIntroBinding.bind(p0);
    }
}

package com.robinhood.android.acatsin.partials;

import android.view.View;
import com.robinhood.android.acats.p057ui.databinding.FragmentAcatsInBuildPartialBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInBuildPartialFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.partials.AcatsInBuildPartialFragment$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AcatsInBuildPartialFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAcatsInBuildPartialBinding> {
    public static final AcatsInBuildPartialFragment2 INSTANCE = new AcatsInBuildPartialFragment2();

    AcatsInBuildPartialFragment2() {
        super(1, FragmentAcatsInBuildPartialBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/acats/ui/databinding/FragmentAcatsInBuildPartialBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAcatsInBuildPartialBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAcatsInBuildPartialBinding.bind(p0);
    }
}

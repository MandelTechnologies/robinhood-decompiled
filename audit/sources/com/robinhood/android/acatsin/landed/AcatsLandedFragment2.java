package com.robinhood.android.acatsin.landed;

import android.view.View;
import com.robinhood.android.acatsin.databinding.FragmentAcatsLandedBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsLandedFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.landed.AcatsLandedFragment$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AcatsLandedFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAcatsLandedBinding> {
    public static final AcatsLandedFragment2 INSTANCE = new AcatsLandedFragment2();

    AcatsLandedFragment2() {
        super(1, FragmentAcatsLandedBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/acatsin/databinding/FragmentAcatsLandedBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAcatsLandedBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAcatsLandedBinding.bind(p0);
    }
}

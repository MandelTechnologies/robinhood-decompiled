package com.robinhood.android.educationtour;

import android.view.View;
import com.robinhood.android.educationtour.databinding.FragmentEducationTourOverlayBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationTourOverlayFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.educationtour.EducationTourOverlayFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class EducationTourOverlayFragment3 extends FunctionReferenceImpl implements Function1<View, FragmentEducationTourOverlayBinding> {
    public static final EducationTourOverlayFragment3 INSTANCE = new EducationTourOverlayFragment3();

    EducationTourOverlayFragment3() {
        super(1, FragmentEducationTourOverlayBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/educationtour/databinding/FragmentEducationTourOverlayBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentEducationTourOverlayBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentEducationTourOverlayBinding.bind(p0);
    }
}

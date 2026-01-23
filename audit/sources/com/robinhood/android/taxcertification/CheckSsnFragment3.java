package com.robinhood.android.taxcertification;

import android.view.View;
import com.robinhood.android.taxcertification.databinding.FragmentCheckSsnBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CheckSsnFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.taxcertification.CheckSsnFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class CheckSsnFragment3 extends FunctionReferenceImpl implements Function1<View, FragmentCheckSsnBinding> {
    public static final CheckSsnFragment3 INSTANCE = new CheckSsnFragment3();

    CheckSsnFragment3() {
        super(1, FragmentCheckSsnBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/taxcertification/databinding/FragmentCheckSsnBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentCheckSsnBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentCheckSsnBinding.bind(p0);
    }
}

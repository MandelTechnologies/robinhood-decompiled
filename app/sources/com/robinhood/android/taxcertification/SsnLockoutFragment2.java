package com.robinhood.android.taxcertification;

import android.view.View;
import com.robinhood.android.taxcertification.databinding.FragmentSsnLockoutBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SsnLockoutFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.taxcertification.SsnLockoutFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class SsnLockoutFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentSsnLockoutBinding> {
    public static final SsnLockoutFragment2 INSTANCE = new SsnLockoutFragment2();

    SsnLockoutFragment2() {
        super(1, FragmentSsnLockoutBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/taxcertification/databinding/FragmentSsnLockoutBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSsnLockoutBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSsnLockoutBinding.bind(p0);
    }
}

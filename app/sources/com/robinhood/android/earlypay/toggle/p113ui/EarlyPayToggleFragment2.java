package com.robinhood.android.earlypay.toggle.p113ui;

import android.view.View;
import com.robinhood.android.earlypay.databinding.FragmentEarlyPayToggleBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EarlyPayToggleFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.earlypay.toggle.ui.EarlyPayToggleFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class EarlyPayToggleFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentEarlyPayToggleBinding> {
    public static final EarlyPayToggleFragment2 INSTANCE = new EarlyPayToggleFragment2();

    EarlyPayToggleFragment2() {
        super(1, FragmentEarlyPayToggleBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/earlypay/databinding/FragmentEarlyPayToggleBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentEarlyPayToggleBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentEarlyPayToggleBinding.bind(p0);
    }
}

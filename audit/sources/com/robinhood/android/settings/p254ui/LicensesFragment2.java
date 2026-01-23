package com.robinhood.android.settings.p254ui;

import android.view.View;
import com.robinhood.android.settings.databinding.FragmentLicensesBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LicensesFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.settings.ui.LicensesFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class LicensesFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentLicensesBinding> {
    public static final LicensesFragment2 INSTANCE = new LicensesFragment2();

    LicensesFragment2() {
        super(1, FragmentLicensesBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/settings/databinding/FragmentLicensesBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentLicensesBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentLicensesBinding.bind(p0);
    }
}

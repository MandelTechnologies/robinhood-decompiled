package com.robinhood.android.acatsin.accountnumber;

import android.view.View;
import com.robinhood.android.acats.p057ui.databinding.FragmentAcatsInAccountNumberBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInAccountNumberFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberFragment$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AcatsInAccountNumberFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAcatsInAccountNumberBinding> {
    public static final AcatsInAccountNumberFragment2 INSTANCE = new AcatsInAccountNumberFragment2();

    AcatsInAccountNumberFragment2() {
        super(1, FragmentAcatsInAccountNumberBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/acats/ui/databinding/FragmentAcatsInAccountNumberBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAcatsInAccountNumberBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAcatsInAccountNumberBinding.bind(p0);
    }
}

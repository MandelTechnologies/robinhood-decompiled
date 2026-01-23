package com.robinhood.android.rhymigration.p245ui.agreements;

import android.view.View;
import com.robinhood.android.rhymigration.databinding.FragmentRhyAgreementBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyAgreementFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhymigration.ui.agreements.RhyAgreementFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class RhyAgreementFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRhyAgreementBinding> {
    public static final RhyAgreementFragment2 INSTANCE = new RhyAgreementFragment2();

    RhyAgreementFragment2() {
        super(1, FragmentRhyAgreementBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/rhymigration/databinding/FragmentRhyAgreementBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRhyAgreementBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRhyAgreementBinding.bind(p0);
    }
}

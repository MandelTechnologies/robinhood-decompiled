package com.robinhood.android.acatsin.confirmation;

import android.view.View;
import com.robinhood.android.acats.p057ui.databinding.FragmentAcatsInConfirmationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInConfirmationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.confirmation.AcatsInConfirmationFragment$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AcatsInConfirmationFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAcatsInConfirmationBinding> {
    public static final AcatsInConfirmationFragment2 INSTANCE = new AcatsInConfirmationFragment2();

    AcatsInConfirmationFragment2() {
        super(1, FragmentAcatsInConfirmationBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/acats/ui/databinding/FragmentAcatsInConfirmationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAcatsInConfirmationBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAcatsInConfirmationBinding.bind(p0);
    }
}

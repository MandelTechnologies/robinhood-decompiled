package com.robinhood.android.cash.disputes.p070ui;

import android.view.View;
import com.robinhood.android.cash.disputes.databinding.FragmentDisputeCreationIntroBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisputeCreationIntroFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.disputes.ui.DisputeCreationIntroFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class DisputeCreationIntroFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDisputeCreationIntroBinding> {
    public static final DisputeCreationIntroFragment2 INSTANCE = new DisputeCreationIntroFragment2();

    DisputeCreationIntroFragment2() {
        super(1, FragmentDisputeCreationIntroBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/cash/disputes/databinding/FragmentDisputeCreationIntroBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDisputeCreationIntroBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDisputeCreationIntroBinding.bind(p0);
    }
}

package com.robinhood.android.cash.disputes.p070ui.submitted;

import android.view.View;
import com.robinhood.android.cash.disputes.databinding.FragmentDisputeSubmittedBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisputeSubmittedFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.disputes.ui.submitted.DisputeSubmittedFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class DisputeSubmittedFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDisputeSubmittedBinding> {
    public static final DisputeSubmittedFragment2 INSTANCE = new DisputeSubmittedFragment2();

    DisputeSubmittedFragment2() {
        super(1, FragmentDisputeSubmittedBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/cash/disputes/databinding/FragmentDisputeSubmittedBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDisputeSubmittedBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDisputeSubmittedBinding.bind(p0);
    }
}

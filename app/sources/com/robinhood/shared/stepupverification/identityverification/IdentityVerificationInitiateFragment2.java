package com.robinhood.shared.stepupverification.identityverification;

import android.view.View;
import com.robinhood.shared.stepupverification.databinding.FragmentLoadingWithErrorViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdentityVerificationInitiateFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.stepupverification.identityverification.IdentityVerificationInitiateFragment$binding$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class IdentityVerificationInitiateFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentLoadingWithErrorViewBinding> {
    public static final IdentityVerificationInitiateFragment2 INSTANCE = new IdentityVerificationInitiateFragment2();

    IdentityVerificationInitiateFragment2() {
        super(1, FragmentLoadingWithErrorViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/stepupverification/databinding/FragmentLoadingWithErrorViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentLoadingWithErrorViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentLoadingWithErrorViewBinding.bind(p0);
    }
}

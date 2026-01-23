package com.robinhood.shared.stepupverification.challenge;

import android.view.View;
import com.robinhood.shared.stepupverification.databinding.FragmentLoadingWithErrorViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChallengeFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class ChallengeFragment$binding$2 extends FunctionReferenceImpl implements Function1<View, FragmentLoadingWithErrorViewBinding> {
    public static final ChallengeFragment$binding$2 INSTANCE = new ChallengeFragment$binding$2();

    ChallengeFragment$binding$2() {
        super(1, FragmentLoadingWithErrorViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/stepupverification/databinding/FragmentLoadingWithErrorViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentLoadingWithErrorViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentLoadingWithErrorViewBinding.bind(p0);
    }
}

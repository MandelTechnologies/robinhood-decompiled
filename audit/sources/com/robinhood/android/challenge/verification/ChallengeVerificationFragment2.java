package com.robinhood.android.challenge.verification;

import android.view.View;
import com.robinhood.android.challenge.databinding.FragmentChallengeVerificationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChallengeVerificationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.challenge.verification.ChallengeVerificationFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class ChallengeVerificationFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentChallengeVerificationBinding> {
    public static final ChallengeVerificationFragment2 INSTANCE = new ChallengeVerificationFragment2();

    ChallengeVerificationFragment2() {
        super(1, FragmentChallengeVerificationBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/challenge/databinding/FragmentChallengeVerificationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentChallengeVerificationBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentChallengeVerificationBinding.bind(p0);
    }
}

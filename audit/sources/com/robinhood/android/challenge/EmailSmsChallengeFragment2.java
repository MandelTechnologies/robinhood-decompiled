package com.robinhood.android.challenge;

import android.view.View;
import com.robinhood.android.challenge.databinding.FragmentEmailSmsChallengeBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmailSmsChallengeFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.challenge.EmailSmsChallengeFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class EmailSmsChallengeFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentEmailSmsChallengeBinding> {
    public static final EmailSmsChallengeFragment2 INSTANCE = new EmailSmsChallengeFragment2();

    EmailSmsChallengeFragment2() {
        super(1, FragmentEmailSmsChallengeBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/challenge/databinding/FragmentEmailSmsChallengeBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentEmailSmsChallengeBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentEmailSmsChallengeBinding.bind(p0);
    }
}

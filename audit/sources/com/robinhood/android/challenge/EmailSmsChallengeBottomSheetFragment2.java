package com.robinhood.android.challenge;

import android.view.View;
import com.robinhood.android.challenge.databinding.FragmentEmailSmsChallengeBottomSheetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmailSmsChallengeBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.challenge.EmailSmsChallengeBottomSheetFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class EmailSmsChallengeBottomSheetFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentEmailSmsChallengeBottomSheetBinding> {
    public static final EmailSmsChallengeBottomSheetFragment2 INSTANCE = new EmailSmsChallengeBottomSheetFragment2();

    EmailSmsChallengeBottomSheetFragment2() {
        super(1, FragmentEmailSmsChallengeBottomSheetBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/challenge/databinding/FragmentEmailSmsChallengeBottomSheetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentEmailSmsChallengeBottomSheetBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentEmailSmsChallengeBottomSheetBinding.bind(p0);
    }
}

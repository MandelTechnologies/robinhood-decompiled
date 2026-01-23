package com.robinhood.android.shareholderexperience.intro;

import android.view.View;
import com.robinhood.android.shareholderexperience.databinding.FragmentShareholderExperienceIntroBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShareholderExperienceIntroFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.shareholderexperience.intro.ShareholderExperienceIntroFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class ShareholderExperienceIntroFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentShareholderExperienceIntroBinding> {
    public static final ShareholderExperienceIntroFragment2 INSTANCE = new ShareholderExperienceIntroFragment2();

    ShareholderExperienceIntroFragment2() {
        super(1, FragmentShareholderExperienceIntroBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/shareholderexperience/databinding/FragmentShareholderExperienceIntroBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentShareholderExperienceIntroBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentShareholderExperienceIntroBinding.bind(p0);
    }
}

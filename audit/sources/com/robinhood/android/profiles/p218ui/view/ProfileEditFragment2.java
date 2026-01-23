package com.robinhood.android.profiles.p218ui.view;

import android.view.View;
import com.robinhood.android.profiles.databinding.FragmentProfileEditBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfileEditFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.profiles.ui.view.ProfileEditFragment$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class ProfileEditFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentProfileEditBinding> {
    public static final ProfileEditFragment2 INSTANCE = new ProfileEditFragment2();

    ProfileEditFragment2() {
        super(1, FragmentProfileEditBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/profiles/databinding/FragmentProfileEditBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentProfileEditBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentProfileEditBinding.bind(p0);
    }
}

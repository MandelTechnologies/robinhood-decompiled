package com.robinhood.android.onboarding.p205ui.usercreation;

import android.view.View;
import com.robinhood.android.onboarding.databinding.FragmentUserCreationFullNameBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserCreationFullNameFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class UserCreationFullNameFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentUserCreationFullNameBinding> {
    public static final UserCreationFullNameFragment2 INSTANCE = new UserCreationFullNameFragment2();

    UserCreationFullNameFragment2() {
        super(1, FragmentUserCreationFullNameBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/onboarding/databinding/FragmentUserCreationFullNameBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentUserCreationFullNameBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentUserCreationFullNameBinding.bind(p0);
    }
}

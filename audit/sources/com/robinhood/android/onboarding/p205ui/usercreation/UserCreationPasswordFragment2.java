package com.robinhood.android.onboarding.p205ui.usercreation;

import android.view.View;
import com.robinhood.android.onboarding.databinding.FragmentUserCreationPasswordBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserCreationPasswordFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class UserCreationPasswordFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentUserCreationPasswordBinding> {
    public static final UserCreationPasswordFragment2 INSTANCE = new UserCreationPasswordFragment2();

    UserCreationPasswordFragment2() {
        super(1, FragmentUserCreationPasswordBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/onboarding/databinding/FragmentUserCreationPasswordBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentUserCreationPasswordBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentUserCreationPasswordBinding.bind(p0);
    }
}

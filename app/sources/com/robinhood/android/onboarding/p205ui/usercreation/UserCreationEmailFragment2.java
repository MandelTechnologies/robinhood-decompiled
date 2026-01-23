package com.robinhood.android.onboarding.p205ui.usercreation;

import android.view.View;
import com.robinhood.android.onboarding.databinding.FragmentUserCreationEmailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserCreationEmailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class UserCreationEmailFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentUserCreationEmailBinding> {
    public static final UserCreationEmailFragment2 INSTANCE = new UserCreationEmailFragment2();

    UserCreationEmailFragment2() {
        super(1, FragmentUserCreationEmailBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/onboarding/databinding/FragmentUserCreationEmailBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentUserCreationEmailBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentUserCreationEmailBinding.bind(p0);
    }
}

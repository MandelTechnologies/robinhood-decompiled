package com.robinhood.shared.login.lockscreen;

import android.view.View;
import com.robinhood.shared.login.databinding.FragmentSetPinBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SetPinFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.login.lockscreen.SetPinFragment$binding$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class SetPinFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentSetPinBinding> {
    public static final SetPinFragment2 INSTANCE = new SetPinFragment2();

    SetPinFragment2() {
        super(1, FragmentSetPinBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/login/databinding/FragmentSetPinBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSetPinBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSetPinBinding.bind(p0);
    }
}

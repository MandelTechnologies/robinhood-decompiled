package com.robinhood.shared.login.lockscreen;

import android.view.View;
import com.robinhood.shared.login.databinding.FragmentPinBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PinFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.login.lockscreen.PinFragment$binding$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class PinFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentPinBinding> {
    public static final PinFragment2 INSTANCE = new PinFragment2();

    PinFragment2() {
        super(1, FragmentPinBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/login/databinding/FragmentPinBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentPinBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentPinBinding.bind(p0);
    }
}

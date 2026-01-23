package com.robinhood.android.verification.phone;

import android.view.View;
import com.robinhood.android.verification.databinding.ActivityPhoneValuePropBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PhoneValuePropActivity.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.verification.phone.PhoneValuePropActivity$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class PhoneValuePropActivity2 extends FunctionReferenceImpl implements Function1<View, ActivityPhoneValuePropBinding> {
    public static final PhoneValuePropActivity2 INSTANCE = new PhoneValuePropActivity2();

    PhoneValuePropActivity2() {
        super(1, ActivityPhoneValuePropBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/verification/databinding/ActivityPhoneValuePropBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ActivityPhoneValuePropBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ActivityPhoneValuePropBinding.bind(p0);
    }
}

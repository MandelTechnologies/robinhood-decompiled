package com.robinhood.android.support.call;

import android.view.View;
import com.robinhood.shared.support.databinding.FragmentPhoneEditBottomSheetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PhoneEditBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.support.call.PhoneEditBottomSheetFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class PhoneEditBottomSheetFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentPhoneEditBottomSheetBinding> {
    public static final PhoneEditBottomSheetFragment2 INSTANCE = new PhoneEditBottomSheetFragment2();

    PhoneEditBottomSheetFragment2() {
        super(1, FragmentPhoneEditBottomSheetBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/support/databinding/FragmentPhoneEditBottomSheetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentPhoneEditBottomSheetBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentPhoneEditBottomSheetBinding.bind(p0);
    }
}

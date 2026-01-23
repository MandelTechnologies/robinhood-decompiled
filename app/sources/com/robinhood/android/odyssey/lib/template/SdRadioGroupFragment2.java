package com.robinhood.android.odyssey.lib.template;

import android.view.View;
import com.robinhood.android.lib.odyssey.databinding.FragmentSdRadioGroupBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdRadioGroupFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.template.SdRadioGroupFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class SdRadioGroupFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentSdRadioGroupBinding> {
    public static final SdRadioGroupFragment2 INSTANCE = new SdRadioGroupFragment2();

    SdRadioGroupFragment2() {
        super(1, FragmentSdRadioGroupBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdRadioGroupBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSdRadioGroupBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSdRadioGroupBinding.bind(p0);
    }
}

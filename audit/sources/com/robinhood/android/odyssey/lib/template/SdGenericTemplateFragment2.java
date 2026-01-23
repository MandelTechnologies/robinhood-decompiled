package com.robinhood.android.odyssey.lib.template;

import android.view.View;
import com.robinhood.android.lib.odyssey.databinding.FragmentSdGenericTemplateBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdGenericTemplateFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.template.SdGenericTemplateFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class SdGenericTemplateFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentSdGenericTemplateBinding> {
    public static final SdGenericTemplateFragment2 INSTANCE = new SdGenericTemplateFragment2();

    SdGenericTemplateFragment2() {
        super(1, FragmentSdGenericTemplateBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdGenericTemplateBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSdGenericTemplateBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSdGenericTemplateBinding.bind(p0);
    }
}

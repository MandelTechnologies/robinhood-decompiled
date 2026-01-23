package com.robinhood.android.odyssey.lib.template;

import android.view.View;
import com.robinhood.android.lib.odyssey.databinding.FragmentSdSearchInputBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdSearchInputFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.template.SdSearchInputFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class SdSearchInputFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentSdSearchInputBinding> {
    public static final SdSearchInputFragment2 INSTANCE = new SdSearchInputFragment2();

    SdSearchInputFragment2() {
        super(1, FragmentSdSearchInputBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdSearchInputBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSdSearchInputBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSdSearchInputBinding.bind(p0);
    }
}

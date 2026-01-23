package com.robinhood.android.odyssey.lib.template;

import android.view.View;
import com.robinhood.android.lib.odyssey.databinding.FragmentSdSelectionBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdSelectionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.template.SdSelectionFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class SdSelectionFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentSdSelectionBinding> {
    public static final SdSelectionFragment2 INSTANCE = new SdSelectionFragment2();

    SdSelectionFragment2() {
        super(1, FragmentSdSelectionBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdSelectionBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSdSelectionBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSdSelectionBinding.bind(p0);
    }
}

package com.robinhood.android.odyssey.lib.template;

import android.view.View;
import com.robinhood.android.lib.odyssey.databinding.FragmentSdInformationalListBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdInformationalListFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.template.SdInformationalListFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class SdInformationalListFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentSdInformationalListBinding> {
    public static final SdInformationalListFragment2 INSTANCE = new SdInformationalListFragment2();

    SdInformationalListFragment2() {
        super(1, FragmentSdInformationalListBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdInformationalListBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSdInformationalListBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSdInformationalListBinding.bind(p0);
    }
}

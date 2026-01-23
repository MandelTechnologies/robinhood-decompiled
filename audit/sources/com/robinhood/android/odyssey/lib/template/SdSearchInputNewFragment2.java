package com.robinhood.android.odyssey.lib.template;

import android.view.View;
import com.robinhood.android.lib.odyssey.databinding.FragmentSdSearchInputNewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdSearchInputNewFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.template.SdSearchInputNewFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class SdSearchInputNewFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentSdSearchInputNewBinding> {
    public static final SdSearchInputNewFragment2 INSTANCE = new SdSearchInputNewFragment2();

    SdSearchInputNewFragment2() {
        super(1, FragmentSdSearchInputNewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdSearchInputNewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSdSearchInputNewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSdSearchInputNewBinding.bind(p0);
    }
}

package com.robinhood.android.odyssey.lib.view;

import android.view.View;
import com.robinhood.android.lib.odyssey.databinding.MergeSdSectionBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdSectionView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.view.SdSectionView$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class SdSectionView2 extends FunctionReferenceImpl implements Function1<View, MergeSdSectionBinding> {
    public static final SdSectionView2 INSTANCE = new SdSectionView2();

    SdSectionView2() {
        super(1, MergeSdSectionBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/lib/odyssey/databinding/MergeSdSectionBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeSdSectionBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeSdSectionBinding.bind(p0);
    }
}

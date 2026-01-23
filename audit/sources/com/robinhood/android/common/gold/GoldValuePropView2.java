package com.robinhood.android.common.gold;

import android.view.View;
import com.robinhood.android.common.gold.databinding.GoldValuePropViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldValuePropView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.gold.GoldValuePropView$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class GoldValuePropView2 extends FunctionReferenceImpl implements Function1<View, GoldValuePropViewBinding> {
    public static final GoldValuePropView2 INSTANCE = new GoldValuePropView2();

    GoldValuePropView2() {
        super(1, GoldValuePropViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/gold/databinding/GoldValuePropViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final GoldValuePropViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return GoldValuePropViewBinding.bind(p0);
    }
}

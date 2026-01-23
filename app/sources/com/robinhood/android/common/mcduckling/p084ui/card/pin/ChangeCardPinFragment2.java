package com.robinhood.android.common.mcduckling.p084ui.card.pin;

import android.view.View;
import com.robinhood.android.common.mcduckling.databinding.FragmentChangeCardPinBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChangeCardPinFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.mcduckling.ui.card.pin.ChangeCardPinFragment$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class ChangeCardPinFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentChangeCardPinBinding> {
    public static final ChangeCardPinFragment2 INSTANCE = new ChangeCardPinFragment2();

    ChangeCardPinFragment2() {
        super(1, FragmentChangeCardPinBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/mcduckling/databinding/FragmentChangeCardPinBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentChangeCardPinBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentChangeCardPinBinding.bind(p0);
    }
}

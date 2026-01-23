package com.robinhood.android.settings.p254ui;

import android.view.View;
import com.robinhood.android.settings.p254ui.databinding.IncludeButtonViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ButtonView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.settings.ui.ButtonView$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class ButtonView2 extends FunctionReferenceImpl implements Function1<View, IncludeButtonViewBinding> {
    public static final ButtonView2 INSTANCE = new ButtonView2();

    ButtonView2() {
        super(1, IncludeButtonViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/settings/ui/databinding/IncludeButtonViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final IncludeButtonViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return IncludeButtonViewBinding.bind(p0);
    }
}

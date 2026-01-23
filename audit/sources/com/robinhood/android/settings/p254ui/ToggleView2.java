package com.robinhood.android.settings.p254ui;

import android.view.View;
import com.robinhood.android.settings.p254ui.databinding.IncludeToggleViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ToggleView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.settings.ui.ToggleView$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class ToggleView2 extends FunctionReferenceImpl implements Function1<View, IncludeToggleViewBinding> {
    public static final ToggleView2 INSTANCE = new ToggleView2();

    ToggleView2() {
        super(1, IncludeToggleViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/settings/ui/databinding/IncludeToggleViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final IncludeToggleViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return IncludeToggleViewBinding.bind(p0);
    }
}

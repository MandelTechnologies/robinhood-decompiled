package com.robinhood.android.settings.p254ui;

import android.view.View;
import com.robinhood.android.settings.p254ui.databinding.IncludeSettingsPlaceholderItemBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SettingsPlaceholderView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.settings.ui.SettingsPlaceholderView$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class SettingsPlaceholderView2 extends FunctionReferenceImpl implements Function1<View, IncludeSettingsPlaceholderItemBinding> {
    public static final SettingsPlaceholderView2 INSTANCE = new SettingsPlaceholderView2();

    SettingsPlaceholderView2() {
        super(1, IncludeSettingsPlaceholderItemBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/settings/ui/databinding/IncludeSettingsPlaceholderItemBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final IncludeSettingsPlaceholderItemBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return IncludeSettingsPlaceholderItemBinding.bind(p0);
    }
}

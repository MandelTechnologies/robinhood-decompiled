package com.robinhood.android.settings.p254ui.drip;

import android.view.View;
import com.robinhood.android.settings.p254ui.drip.databinding.FragmentDripSettingsBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DripSettingsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.settings.ui.drip.DripSettingsFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class DripSettingsFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDripSettingsBinding> {
    public static final DripSettingsFragment2 INSTANCE = new DripSettingsFragment2();

    DripSettingsFragment2() {
        super(1, FragmentDripSettingsBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/settings/ui/drip/databinding/FragmentDripSettingsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDripSettingsBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDripSettingsBinding.bind(p0);
    }
}

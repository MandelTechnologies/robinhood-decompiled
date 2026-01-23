package com.robinhood.android.options.settings;

import android.view.View;
import com.robinhood.android.options.settings.databinding.FragmentOptionsSettingBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSettingFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.settings.OptionsSettingFragment$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionsSettingFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentOptionsSettingBinding> {
    public static final OptionsSettingFragment2 INSTANCE = new OptionsSettingFragment2();

    OptionsSettingFragment2() {
        super(1, FragmentOptionsSettingBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/options/settings/databinding/FragmentOptionsSettingBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentOptionsSettingBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentOptionsSettingBinding.bind(p0);
    }
}

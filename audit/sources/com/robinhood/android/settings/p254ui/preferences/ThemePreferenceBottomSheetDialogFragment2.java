package com.robinhood.android.settings.p254ui.preferences;

import android.view.View;
import com.robinhood.android.settings.databinding.FragmentThemePreferenceBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThemePreferenceBottomSheetDialogFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.settings.ui.preferences.ThemePreferenceBottomSheetDialogFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class ThemePreferenceBottomSheetDialogFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentThemePreferenceBinding> {
    public static final ThemePreferenceBottomSheetDialogFragment2 INSTANCE = new ThemePreferenceBottomSheetDialogFragment2();

    ThemePreferenceBottomSheetDialogFragment2() {
        super(1, FragmentThemePreferenceBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/settings/databinding/FragmentThemePreferenceBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentThemePreferenceBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentThemePreferenceBinding.bind(p0);
    }
}

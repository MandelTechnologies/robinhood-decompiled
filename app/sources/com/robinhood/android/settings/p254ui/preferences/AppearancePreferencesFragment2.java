package com.robinhood.android.settings.p254ui.preferences;

import android.view.View;
import com.robinhood.android.settings.databinding.FragmentAppearancePreferencesBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppearancePreferencesFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.settings.ui.preferences.AppearancePreferencesFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class AppearancePreferencesFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAppearancePreferencesBinding> {
    public static final AppearancePreferencesFragment2 INSTANCE = new AppearancePreferencesFragment2();

    AppearancePreferencesFragment2() {
        super(1, FragmentAppearancePreferencesBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/settings/databinding/FragmentAppearancePreferencesBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAppearancePreferencesBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAppearancePreferencesBinding.bind(p0);
    }
}

package com.robinhood.android.cash.rhy.tab.p077v2.settings;

import android.view.View;
import com.robinhood.android.cash.rhy.tab.databinding.FragmentRhyCardSettingsBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyCardSettingsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.settings.RhyCardSettingsFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class RhyCardSettingsFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRhyCardSettingsBinding> {
    public static final RhyCardSettingsFragment2 INSTANCE = new RhyCardSettingsFragment2();

    RhyCardSettingsFragment2() {
        super(1, FragmentRhyCardSettingsBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/cash/rhy/tab/databinding/FragmentRhyCardSettingsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRhyCardSettingsBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRhyCardSettingsBinding.bind(p0);
    }
}

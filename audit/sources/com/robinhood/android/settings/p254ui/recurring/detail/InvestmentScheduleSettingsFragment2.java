package com.robinhood.android.settings.p254ui.recurring.detail;

import android.view.View;
import com.robinhood.android.settings.p254ui.recurring.databinding.FragmentInvestmentScheduleSettingsBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentScheduleSettingsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class InvestmentScheduleSettingsFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentInvestmentScheduleSettingsBinding> {
    public static final InvestmentScheduleSettingsFragment2 INSTANCE = new InvestmentScheduleSettingsFragment2();

    InvestmentScheduleSettingsFragment2() {
        super(1, FragmentInvestmentScheduleSettingsBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/settings/ui/recurring/databinding/FragmentInvestmentScheduleSettingsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentInvestmentScheduleSettingsBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentInvestmentScheduleSettingsBinding.bind(p0);
    }
}

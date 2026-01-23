package com.robinhood.android.account.p060ui.margin;

import android.view.View;
import com.robinhood.android.account.overview.databinding.MarginInvestingLearnMoreDialogBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginInvestingLearnMoreDialog.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.account.ui.margin.MarginInvestingLearnMoreDialog$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class MarginInvestingLearnMoreDialog2 extends FunctionReferenceImpl implements Function1<View, MarginInvestingLearnMoreDialogBinding> {
    public static final MarginInvestingLearnMoreDialog2 INSTANCE = new MarginInvestingLearnMoreDialog2();

    MarginInvestingLearnMoreDialog2() {
        super(1, MarginInvestingLearnMoreDialogBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/account/overview/databinding/MarginInvestingLearnMoreDialogBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MarginInvestingLearnMoreDialogBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MarginInvestingLearnMoreDialogBinding.bind(p0);
    }
}

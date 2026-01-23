package com.robinhood.shared.support.help;

import android.view.View;
import com.robinhood.shared.support.help.databinding.FragmentHelpCenterWebViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HelpCenterWebViewFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.support.help.HelpCenterWebViewFragment$binding$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class HelpCenterWebViewFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentHelpCenterWebViewBinding> {
    public static final HelpCenterWebViewFragment2 INSTANCE = new HelpCenterWebViewFragment2();

    HelpCenterWebViewFragment2() {
        super(1, FragmentHelpCenterWebViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/support/help/databinding/FragmentHelpCenterWebViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentHelpCenterWebViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentHelpCenterWebViewBinding.bind(p0);
    }
}

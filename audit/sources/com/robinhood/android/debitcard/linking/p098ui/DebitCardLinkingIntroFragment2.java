package com.robinhood.android.debitcard.linking.p098ui;

import android.view.View;
import com.robinhood.android.debitcard.linking.databinding.FragmentDebitCardLinkingIntroFragmentBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebitCardLinkingIntroFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.debitcard.linking.ui.DebitCardLinkingIntroFragment$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class DebitCardLinkingIntroFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDebitCardLinkingIntroFragmentBinding> {
    public static final DebitCardLinkingIntroFragment2 INSTANCE = new DebitCardLinkingIntroFragment2();

    DebitCardLinkingIntroFragment2() {
        super(1, FragmentDebitCardLinkingIntroFragmentBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/debitcard/linking/databinding/FragmentDebitCardLinkingIntroFragmentBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDebitCardLinkingIntroFragmentBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDebitCardLinkingIntroFragmentBinding.bind(p0);
    }
}

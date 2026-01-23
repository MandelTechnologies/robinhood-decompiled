package com.robinhood.android.mcduckling.card.help.p179ui;

import android.view.View;
import com.robinhood.android.mcduckling.card.help.databinding.FragmentCardHelpInterstitialBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardHelpInterstitialFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.mcduckling.card.help.ui.CardHelpInterstitialFragment$binding$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class CardHelpInterstitialFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentCardHelpInterstitialBinding> {
    public static final CardHelpInterstitialFragment2 INSTANCE = new CardHelpInterstitialFragment2();

    CardHelpInterstitialFragment2() {
        super(1, FragmentCardHelpInterstitialBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/mcduckling/card/help/databinding/FragmentCardHelpInterstitialBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentCardHelpInterstitialBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentCardHelpInterstitialBinding.bind(p0);
    }
}

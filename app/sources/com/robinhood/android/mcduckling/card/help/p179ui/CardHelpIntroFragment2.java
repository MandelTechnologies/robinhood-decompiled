package com.robinhood.android.mcduckling.card.help.p179ui;

import android.view.View;
import com.robinhood.android.mcduckling.card.help.databinding.FragmentCardHelpIntroBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardHelpIntroFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.mcduckling.card.help.ui.CardHelpIntroFragment$binding$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class CardHelpIntroFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentCardHelpIntroBinding> {
    public static final CardHelpIntroFragment2 INSTANCE = new CardHelpIntroFragment2();

    CardHelpIntroFragment2() {
        super(1, FragmentCardHelpIntroBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/mcduckling/card/help/databinding/FragmentCardHelpIntroBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentCardHelpIntroBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentCardHelpIntroBinding.bind(p0);
    }
}

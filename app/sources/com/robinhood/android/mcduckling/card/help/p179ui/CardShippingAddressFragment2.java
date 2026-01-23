package com.robinhood.android.mcduckling.card.help.p179ui;

import android.view.View;
import com.robinhood.android.mcduckling.card.help.databinding.FragmentCardShippingAddressBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardShippingAddressFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.mcduckling.card.help.ui.CardShippingAddressFragment$binding$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class CardShippingAddressFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentCardShippingAddressBinding> {
    public static final CardShippingAddressFragment2 INSTANCE = new CardShippingAddressFragment2();

    CardShippingAddressFragment2() {
        super(1, FragmentCardShippingAddressBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/mcduckling/card/help/databinding/FragmentCardShippingAddressBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentCardShippingAddressBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentCardShippingAddressBinding.bind(p0);
    }
}

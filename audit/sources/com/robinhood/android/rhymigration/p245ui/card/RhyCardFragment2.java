package com.robinhood.android.rhymigration.p245ui.card;

import android.view.View;
import com.robinhood.android.rhymigration.databinding.FragmentRhyCardBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyCardFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhymigration.ui.card.RhyCardFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class RhyCardFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRhyCardBinding> {
    public static final RhyCardFragment2 INSTANCE = new RhyCardFragment2();

    RhyCardFragment2() {
        super(1, FragmentRhyCardBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/rhymigration/databinding/FragmentRhyCardBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRhyCardBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRhyCardBinding.bind(p0);
    }
}

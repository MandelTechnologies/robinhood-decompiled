package com.robinhood.android.cash.rhy.tab.p077v2.card;

import android.view.View;
import com.robinhood.android.cash.rhy.tab.databinding.MergeRhyCardSettingsLayoutBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyCardSettingsLayout.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.card.RhyCardSettingsLayout$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class RhyCardSettingsLayout2 extends FunctionReferenceImpl implements Function1<View, MergeRhyCardSettingsLayoutBinding> {
    public static final RhyCardSettingsLayout2 INSTANCE = new RhyCardSettingsLayout2();

    RhyCardSettingsLayout2() {
        super(1, MergeRhyCardSettingsLayoutBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/cash/rhy/tab/databinding/MergeRhyCardSettingsLayoutBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeRhyCardSettingsLayoutBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeRhyCardSettingsLayoutBinding.bind(p0);
    }
}

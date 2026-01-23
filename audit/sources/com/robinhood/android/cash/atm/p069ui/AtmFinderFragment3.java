package com.robinhood.android.cash.atm.p069ui;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.robinhood.android.cash.atm.p069ui.AtmFinderFragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AtmFinderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.atm.ui.AtmFinderFragment$onViewCreated$4$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class AtmFinderFragment3 extends FunctionReferenceImpl implements Function1<LinearLayoutManager, Integer> {
    AtmFinderFragment3(Object obj) {
        super(1, obj, AtmFinderFragment.Companion.class, "getSelectedItemIndex", "getSelectedItemIndex(Landroidx/recyclerview/widget/LinearLayoutManager;)I", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(LinearLayoutManager p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Integer.valueOf(((AtmFinderFragment.Companion) this.receiver).getSelectedItemIndex(p0));
    }
}

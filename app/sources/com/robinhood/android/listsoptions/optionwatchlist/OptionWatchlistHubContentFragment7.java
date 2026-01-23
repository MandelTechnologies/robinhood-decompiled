package com.robinhood.android.listsoptions.optionwatchlist;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OptionWatchlistHubContentFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment$onViewCreated$8$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class OptionWatchlistHubContentFragment7 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    OptionWatchlistHubContentFragment7(Object obj) {
        super(1, obj, OptionWatchlistHubContentFragment.class, "onCompositeAdapterPositionSelected", "onCompositeAdapterPositionSelected(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        ((OptionWatchlistHubContentFragment) this.receiver).onCompositeAdapterPositionSelected(i);
    }
}

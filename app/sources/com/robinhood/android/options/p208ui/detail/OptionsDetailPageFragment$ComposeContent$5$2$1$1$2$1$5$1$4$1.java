package com.robinhood.android.options.p208ui.detail;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OptionsDetailPageFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$5$1$4$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$5$1$4$1(Object obj) {
        super(1, obj, OptionsDetailPageFragment.class, "onCandlestickSwitchClicked", "onCandlestickSwitchClicked(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((OptionsDetailPageFragment) this.receiver).onCandlestickSwitchClicked(z);
    }
}

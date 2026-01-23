package com.robinhood.android.optionschain.sbschain;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: OptionSideBySideChainFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class OptionSideBySideChainFragment$ComposeContent$1$4$1 extends FunctionReferenceImpl implements Function1<Instant, Unit> {
    OptionSideBySideChainFragment$ComposeContent$1$4$1(Object obj) {
        super(1, obj, OptionSideBySideChainFragment.class, "showSelloutWarningSnackbarConditionally", "showSelloutWarningSnackbarConditionally(Ljava/time/Instant;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Instant instant) {
        invoke2(instant);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Instant p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((OptionSideBySideChainFragment) this.receiver).showSelloutWarningSnackbarConditionally(p0);
    }
}

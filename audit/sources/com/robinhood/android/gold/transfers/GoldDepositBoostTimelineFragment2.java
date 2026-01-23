package com.robinhood.android.gold.transfers;

import com.robinhood.android.gold.transfers.GoldDepositBoostTimelineFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GoldDepositBoostTimelineFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.transfers.GoldDepositBoostTimelineFragment$ComposeContent$1$2$1$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class GoldDepositBoostTimelineFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    GoldDepositBoostTimelineFragment2(Object obj) {
        super(0, obj, GoldDepositBoostTimelineFragment.Callbacks.class, "onContinueClick", "onContinueClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((GoldDepositBoostTimelineFragment.Callbacks) this.receiver).onContinueClick();
    }
}

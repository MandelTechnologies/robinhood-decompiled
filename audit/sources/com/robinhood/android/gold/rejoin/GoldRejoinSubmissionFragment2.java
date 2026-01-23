package com.robinhood.android.gold.rejoin;

import com.robinhood.android.gold.contracts.GoldUpgradeOutcome;
import com.robinhood.android.gold.rejoin.GoldRejoinSubmissionFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldRejoinSubmissionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.rejoin.GoldRejoinSubmissionFragment$ComposeContent$2$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class GoldRejoinSubmissionFragment2 extends FunctionReferenceImpl implements Function2<GoldUpgradeOutcome, Boolean, Unit> {
    GoldRejoinSubmissionFragment2(Object obj) {
        super(2, obj, GoldRejoinSubmissionFragment.Callbacks.class, "onRejoinLoaded", "onRejoinLoaded(Lcom/robinhood/android/gold/contracts/GoldUpgradeOutcome;Ljava/lang/Boolean;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(GoldUpgradeOutcome goldUpgradeOutcome, Boolean bool) {
        invoke2(goldUpgradeOutcome, bool);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GoldUpgradeOutcome p0, Boolean bool) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((GoldRejoinSubmissionFragment.Callbacks) this.receiver).onRejoinLoaded(p0, bool);
    }
}

package com.robinhood.android.gold.rejoin;

import com.robinhood.android.gold.rejoin.GoldRejoinSubmissionFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldRejoinSubmissionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.rejoin.GoldRejoinSubmissionFragment$ComposeContent$3$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class GoldRejoinSubmissionFragment3 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
    GoldRejoinSubmissionFragment3(Object obj) {
        super(1, obj, GoldRejoinSubmissionFragment.Callbacks.class, "onRejoinFailed", "onRejoinFailed(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((GoldRejoinSubmissionFragment.Callbacks) this.receiver).onRejoinFailed(p0);
    }
}

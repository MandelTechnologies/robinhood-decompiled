package com.robinhood.android.rhy.referral.track;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralsStatusTrackingFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingFragment$ComposeContent$1$1$1$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class RhyReferralsStatusTrackingFragment4 extends FunctionReferenceImpl implements Function1<RhyReferralsStatusInfoSheetData, Unit> {
    RhyReferralsStatusTrackingFragment4(Object obj) {
        super(1, obj, RhyReferralsStatusTrackingFragment.class, "showSheet", "showSheet(Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusInfoSheetData;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RhyReferralsStatusInfoSheetData rhyReferralsStatusInfoSheetData) {
        invoke2(rhyReferralsStatusInfoSheetData);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(RhyReferralsStatusInfoSheetData p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((RhyReferralsStatusTrackingFragment) this.receiver).showSheet(p0);
    }
}

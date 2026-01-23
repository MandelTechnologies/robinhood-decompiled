package com.robinhood.android.waitlist.spot;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: WaitlistSpotFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.waitlist.spot.WaitlistSpotFragment$onUserCanJoin$1$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class WaitlistSpotFragment3 extends FunctionReferenceImpl implements Function0<Unit> {
    WaitlistSpotFragment3(Object obj) {
        super(0, obj, WaitlistSpotDuxo.class, "joinWaitlist", "joinWaitlist()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((WaitlistSpotDuxo) this.receiver).joinWaitlist();
    }
}

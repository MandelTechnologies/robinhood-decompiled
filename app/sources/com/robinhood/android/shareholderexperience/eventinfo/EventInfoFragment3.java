package com.robinhood.android.shareholderexperience.eventinfo;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EventInfoFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.shareholderexperience.eventinfo.EventInfoFragment$faqAdapter$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class EventInfoFragment3 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    EventInfoFragment3(Object obj) {
        super(1, obj, EventInfoFragment.class, "onRowItemClicked", "onRowItemClicked(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        ((EventInfoFragment) this.receiver).onRowItemClicked(i);
    }
}

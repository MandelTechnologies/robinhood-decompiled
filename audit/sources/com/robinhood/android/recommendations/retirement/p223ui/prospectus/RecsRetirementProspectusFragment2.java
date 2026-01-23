package com.robinhood.android.recommendations.retirement.p223ui.prospectus;

import com.robinhood.android.recommendations.retirement.p223ui.prospectus.RecsRetirementProspectusFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: RecsRetirementProspectusFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.retirement.ui.prospectus.RecsRetirementProspectusFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class RecsRetirementProspectusFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    RecsRetirementProspectusFragment2(Object obj) {
        super(0, obj, RecsRetirementProspectusFragment.Callbacks.class, "exitProspectus", "exitProspectus()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((RecsRetirementProspectusFragment.Callbacks) this.receiver).exitProspectus();
    }
}

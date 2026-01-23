package com.robinhood.shared.unverifiedaccountrecovery.phone;

import com.robinhood.models.api.pathfinder.input.FlowState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PathfinderSmsMfaEnrollOtpFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class PathfinderSmsMfaEnrollOtpFragment2 extends FunctionReferenceImpl implements Function1<FlowState, Unit> {
    PathfinderSmsMfaEnrollOtpFragment2(Object obj) {
        super(1, obj, PathfinderSmsMfaEnrollOtpDuxo.class, "sendInput", "sendInput(Lcom/robinhood/models/api/pathfinder/input/FlowState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FlowState flowState) {
        invoke2(flowState);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FlowState p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((PathfinderSmsMfaEnrollOtpDuxo) this.receiver).sendInput(p0);
    }
}

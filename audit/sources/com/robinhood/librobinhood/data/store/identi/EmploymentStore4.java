package com.robinhood.librobinhood.data.store.identi;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.models.p355ui.identi.UiEmploymentInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmploymentStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.identi.EmploymentStore$employmentSaveAction$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class EmploymentStore4 extends FunctionReferenceImpl implements Function1<UiEmploymentInfo, Unit> {
    EmploymentStore4(Object obj) {
        super(1, obj, BehaviorRelay.class, "accept", "accept(Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UiEmploymentInfo uiEmploymentInfo) {
        invoke2(uiEmploymentInfo);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UiEmploymentInfo p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((BehaviorRelay) this.receiver).accept(p0);
    }
}

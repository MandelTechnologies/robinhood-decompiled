package com.robinhood.librobinhood.data.store.identi;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.models.p355ui.identi.ResidentialAddress;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddressStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class AddressStore$residentialAddressSaveAction$1 extends FunctionReferenceImpl implements Function1<ResidentialAddress, Unit> {
    AddressStore$residentialAddressSaveAction$1(Object obj) {
        super(1, obj, BehaviorRelay.class, "accept", "accept(Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ResidentialAddress residentialAddress) {
        invoke2(residentialAddress);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ResidentialAddress p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((BehaviorRelay) this.receiver).accept(p0);
    }
}

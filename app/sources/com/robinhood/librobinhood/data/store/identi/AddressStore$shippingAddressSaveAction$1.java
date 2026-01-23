package com.robinhood.librobinhood.data.store.identi;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.models.p355ui.identi.ShippingAddress;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddressStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class AddressStore$shippingAddressSaveAction$1 extends FunctionReferenceImpl implements Function1<List<? extends ShippingAddress>, Unit> {
    AddressStore$shippingAddressSaveAction$1(Object obj) {
        super(1, obj, BehaviorRelay.class, "accept", "accept(Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends ShippingAddress> list) {
        invoke2((List<ShippingAddress>) list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<ShippingAddress> p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((BehaviorRelay) this.receiver).accept(p0);
    }
}

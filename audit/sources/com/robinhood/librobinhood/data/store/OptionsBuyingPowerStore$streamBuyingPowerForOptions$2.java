package com.robinhood.librobinhood.data.store;

import com.robinhood.models.p320db.OptionsBuyingPower;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: OptionsBuyingPowerStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class OptionsBuyingPowerStore$streamBuyingPowerForOptions$2 extends FunctionReferenceImpl implements Function1<String, Flow<? extends OptionsBuyingPower>> {
    OptionsBuyingPowerStore$streamBuyingPowerForOptions$2(Object obj) {
        super(1, obj, OptionsBuyingPowerStore.class, "getBuyingPowerForOptionsFunction", "getBuyingPowerForOptionsFunction(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<OptionsBuyingPower> invoke(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((OptionsBuyingPowerStore) this.receiver).getBuyingPowerForOptionsFunction(p0);
    }
}

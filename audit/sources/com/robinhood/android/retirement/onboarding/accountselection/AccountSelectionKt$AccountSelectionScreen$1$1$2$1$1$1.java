package com.robinhood.android.retirement.onboarding.accountselection;

import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSelection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class AccountSelectionKt$AccountSelectionScreen$1$1$2$1$1$1 extends FunctionReferenceImpl implements Function1<BrokerageAccountType, Unit> {
    AccountSelectionKt$AccountSelectionScreen$1$1$2$1$1$1(Object obj) {
        super(1, obj, AccountSelectionCallbacks.class, "onAccountSelected", "onAccountSelected(Lcom/robinhood/models/api/BrokerageAccountType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BrokerageAccountType brokerageAccountType) {
        invoke2(brokerageAccountType);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BrokerageAccountType p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((AccountSelectionCallbacks) this.receiver).onAccountSelected(p0);
    }
}

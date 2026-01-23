package com.robinhood.android.feature.account.onboarding.managmentstyle;

import com.robinhood.android.account.contracts.onboarding.ManagementStyleSelectionCallbacks;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ManagementStyleSelectionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionFragment$ComposeContent$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class ManagementStyleSelectionFragment2 extends FunctionReferenceImpl implements Function1<BrokerageAccountType, Unit> {
    ManagementStyleSelectionFragment2(Object obj) {
        super(1, obj, ManagementStyleSelectionCallbacks.class, "onConfirmSelfDirectedAccount", "onConfirmSelfDirectedAccount(Lcom/robinhood/models/api/BrokerageAccountType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BrokerageAccountType brokerageAccountType) {
        invoke2(brokerageAccountType);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BrokerageAccountType p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((ManagementStyleSelectionCallbacks) this.receiver).onConfirmSelfDirectedAccount(p0);
    }
}

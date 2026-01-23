package com.robinhood.android.internalassettransfers.accountselection;

import com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSelectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class AccountSelectionComposableKt$AccountSelectionComposable$1$1 extends FunctionReferenceImpl implements Function2<String, AccountSelectionListFragment.AccountSelectionType, Unit> {
    AccountSelectionComposableKt$AccountSelectionComposable$1$1(Object obj) {
        super(2, obj, AccountSelectionDuxo.class, "onAccountSelected", "onAccountSelected(Ljava/lang/String;Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$AccountSelectionType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, AccountSelectionListFragment.AccountSelectionType accountSelectionType) {
        invoke2(str, accountSelectionType);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0, AccountSelectionListFragment.AccountSelectionType p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((AccountSelectionDuxo) this.receiver).onAccountSelected(p0, p1);
    }
}

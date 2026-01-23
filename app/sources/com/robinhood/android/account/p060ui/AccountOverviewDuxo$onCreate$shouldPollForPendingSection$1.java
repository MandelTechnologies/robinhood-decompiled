package com.robinhood.android.account.p060ui;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function6;

/* compiled from: AccountOverviewDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "optionsEnabled", "inOptionsKnowledgeCheckExperiment", "inOptionsInJointAccountPreSetupExperiment", "inOptionsLevel3EntryPointOptionsSettingsExperiment", "shouldShowOptionsCard"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$shouldPollForPendingSection$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes24.dex */
final class AccountOverviewDuxo$onCreate$shouldPollForPendingSection$1 extends ContinuationImpl7 implements Function6<Boolean, Boolean, Boolean, Boolean, Boolean, Continuation<? super Boolean>, Object> {
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    /* synthetic */ boolean Z$2;
    /* synthetic */ boolean Z$3;
    /* synthetic */ boolean Z$4;
    int label;

    AccountOverviewDuxo$onCreate$shouldPollForPendingSection$1(Continuation<? super AccountOverviewDuxo$onCreate$shouldPollForPendingSection$1> continuation) {
        super(6, continuation);
    }

    @Override // kotlin.jvm.functions.Function6
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Continuation<? super Boolean> continuation) {
        return invoke(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), bool5.booleanValue(), continuation);
    }

    public final Object invoke(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Continuation<? super Boolean> continuation) {
        AccountOverviewDuxo$onCreate$shouldPollForPendingSection$1 accountOverviewDuxo$onCreate$shouldPollForPendingSection$1 = new AccountOverviewDuxo$onCreate$shouldPollForPendingSection$1(continuation);
        accountOverviewDuxo$onCreate$shouldPollForPendingSection$1.Z$0 = z;
        accountOverviewDuxo$onCreate$shouldPollForPendingSection$1.Z$1 = z2;
        accountOverviewDuxo$onCreate$shouldPollForPendingSection$1.Z$2 = z3;
        accountOverviewDuxo$onCreate$shouldPollForPendingSection$1.Z$3 = z4;
        accountOverviewDuxo$onCreate$shouldPollForPendingSection$1.Z$4 = z5;
        return accountOverviewDuxo$onCreate$shouldPollForPendingSection$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return boxing.boxBoolean(this.Z$0 && (this.Z$1 || this.Z$2 || this.Z$3 || this.Z$4));
    }
}

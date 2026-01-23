package com.robinhood.android.common.recurring.sourceoffunds;

import com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsViewState;
import com.robinhood.models.p320db.AchRelationship;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringOrderSourceOfFundsViewState.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsViewState$fundingSources$1, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class RecurringOrderSourceOfFundsViewState2 extends FunctionReferenceImpl implements Function1<AchRelationship, RecurringOrderSourceOfFundsViewState.FundingSource.Ach> {
    public static final RecurringOrderSourceOfFundsViewState2 INSTANCE = new RecurringOrderSourceOfFundsViewState2();

    RecurringOrderSourceOfFundsViewState2() {
        super(1, RecurringOrderSourceOfFundsViewState.FundingSource.Ach.class, "<init>", "<init>(Lcom/robinhood/models/db/AchRelationship;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final RecurringOrderSourceOfFundsViewState.FundingSource.Ach invoke(AchRelationship p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new RecurringOrderSourceOfFundsViewState.FundingSource.Ach(p0);
    }
}

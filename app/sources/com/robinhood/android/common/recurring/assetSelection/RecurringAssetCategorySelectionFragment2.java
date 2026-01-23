package com.robinhood.android.common.recurring.assetSelection;

import com.robinhood.recurring.models.RecurringInvestmentCategory2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringAssetCategorySelectionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionFragment$Content$1$1, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class RecurringAssetCategorySelectionFragment2 extends FunctionReferenceImpl implements Function1<RecurringInvestmentCategory2, Unit> {
    RecurringAssetCategorySelectionFragment2(Object obj) {
        super(1, obj, RecurringAssetCategorySelectionFragment.class, "onSelectAssetCategory", "onSelectAssetCategory(Lcom/robinhood/recurring/models/RecurringInvestmentSelection;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RecurringInvestmentCategory2 recurringInvestmentCategory2) {
        invoke2(recurringInvestmentCategory2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(RecurringInvestmentCategory2 p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((RecurringAssetCategorySelectionFragment) this.receiver).onSelectAssetCategory(p0);
    }
}

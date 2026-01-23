package com.robinhood.android.isa.contributions;

import com.robinhood.android.isa.models.isa.p163db.entity.IsaContribution;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaContributions;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.util.Money;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IsaContributionBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/isa/contributions/IsaContributionBottomSheetStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/isa/contributions/IsaContributionBottomSheetDataState;", "Lcom/robinhood/android/isa/contributions/IsaContributionBottomSheetViewState;", "<init>", "()V", "reduce", "dataState", "lib-isa-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.isa.contributions.IsaContributionBottomSheetStateProvider, reason: use source file name */
/* loaded from: classes10.dex */
public final class IsaContributionBottomSheetDuxo3 implements StateProvider<IsaContributionBottomSheetDataState, IsaContributionBottomSheetViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public IsaContributionBottomSheetViewState reduce(IsaContributionBottomSheetDataState dataState) {
        IsaContribution isaContribution;
        Money allowance;
        Money contributed;
        List<IsaContribution> items;
        Object next;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        IsaContributions contributions = dataState.getContributions();
        String str = null;
        if (contributions == null || (items = contributions.getItems()) == null) {
            isaContribution = null;
        } else {
            Iterator<T> it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                int taxYear = ((IsaContribution) next).getTaxYear();
                Integer taxYear2 = dataState.getTaxYear();
                if (taxYear2 != null && taxYear == taxYear2.intValue()) {
                    break;
                }
            }
            isaContribution = (IsaContribution) next;
        }
        String str2 = (isaContribution == null || (contributed = isaContribution.getContributed()) == null) ? null : Money.format$default(contributed, null, false, null, false, 0, null, false, null, false, false, 1023, null);
        if (str2 == null) {
            str2 = "";
        }
        Money allowance2 = isaContribution != null ? isaContribution.getAllowance() : null;
        Money contributed2 = isaContribution != null ? isaContribution.getContributed() : null;
        String str3 = (allowance2 == null || contributed2 == null) ? "" : Money.format$default(allowance2.minus(contributed2), null, false, null, false, 0, null, false, null, false, false, 1023, null);
        String taxYearLabel = isaContribution != null ? isaContribution.getTaxYearLabel() : null;
        if (taxYearLabel == null) {
            taxYearLabel = "";
        }
        if (isaContribution != null && (allowance = isaContribution.getAllowance()) != null) {
            str = Money.format$default(allowance, null, false, null, false, 0, null, false, null, false, false, 1023, null);
        }
        return new IsaContributionBottomSheetViewState(taxYearLabel, str2, str3, str != null ? str : "");
    }
}

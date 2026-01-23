package com.robinhood.android.investmentstracker;

import androidx.view.result.ActivityResultCallback;
import com.plaid.link.result.LinkInstitution;
import com.plaid.link.result.LinkResult;
import com.plaid.link.result.LinkSuccess;
import com.robinhood.android.investmentstracker.linking.models.PlaidLinkResultData;
import com.robinhood.shared.transfers.contracts.context.PlaidIavMetadata;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentsTrackerFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
final class InvestmentsTrackerFragment$oldLauncher$1<O> implements ActivityResultCallback {
    final /* synthetic */ InvestmentsTrackerFragment this$0;

    InvestmentsTrackerFragment$oldLauncher$1(InvestmentsTrackerFragment investmentsTrackerFragment) {
        this.this$0 = investmentsTrackerFragment;
    }

    @Override // androidx.view.result.ActivityResultCallback
    public final void onActivityResult(LinkResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        LinkSuccess linkSuccess = result instanceof LinkSuccess ? (LinkSuccess) result : null;
        if (linkSuccess != null) {
            final InvestmentsTrackerFragment investmentsTrackerFragment = this.this$0;
            InvestmentsTrackerDuxo duxo = investmentsTrackerFragment.getDuxo();
            String publicToken = linkSuccess.getPublicToken();
            String linkSessionId = linkSuccess.getMetadata().getLinkSessionId();
            LinkInstitution institution = linkSuccess.getMetadata().getInstitution();
            String id = institution != null ? institution.getId() : null;
            LinkInstitution institution2 = linkSuccess.getMetadata().getInstitution();
            duxo.linkUsingOldPlaidFlow(new PlaidLinkResultData(publicToken, new PlaidIavMetadata(linkSessionId, id, institution2 != null ? institution2.getName() : null, "investments-tracker"), linkSuccess.getMetadata().getAccounts()), new Function0() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$oldLauncher$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InvestmentsTrackerFragment$oldLauncher$1.onActivityResult$lambda$1$lambda$0(investmentsTrackerFragment);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onActivityResult$lambda$1$lambda$0(InvestmentsTrackerFragment investmentsTrackerFragment) {
        investmentsTrackerFragment.getDuxo().finishedLink();
        return Unit.INSTANCE;
    }
}

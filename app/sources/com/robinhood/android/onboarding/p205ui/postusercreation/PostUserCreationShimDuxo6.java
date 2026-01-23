package com.robinhood.android.onboarding.p205ui.postusercreation;

import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.onboarding.contracts.OnboardingFlowPathType;
import com.robinhood.android.onboarding.p205ui.postusercreation.PostUserCreationShimViewState2;
import com.robinhood.p2p.MatchaManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PostUserCreationShimDuxo.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u001e\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0001¨\u0006\n"}, m3636d2 = {"toOnboardingArgs", "Lcom/robinhood/android/onboarding/ui/postusercreation/OnboardingArgs;", "Lcom/robinhood/p2p/MatchaManager$TransactionArgs;", "referralCodeQueryParams", "", "", "referralData", "rhyReferralOnboardingArgs", "Lcom/robinhood/android/onboarding/ui/postusercreation/OnboardingArgs$RhyUpgrade;", "rhyReferralData", "feature-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.onboarding.ui.postusercreation.PostUserCreationShimDuxoKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class PostUserCreationShimDuxo6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final PostUserCreationShimViewState2 toOnboardingArgs(MatchaManager.TransactionArgs transactionArgs) {
        return new PostUserCreationShimViewState2.SdOnboarding(new OnboardingFlowPathType.MatchaFlow(MapsKt.mapOf(Tuples4.m3642to("transaction_id", transactionArgs.getTransactionId()), Tuples4.m3642to("transaction_type", transactionArgs.getTransactionType()))), transactionArgs.getEntryPointIdentifier(), null, 4, null);
    }

    private static final Map<String, String> referralCodeQueryParams(String str) {
        Map<String, String> mapMapOf;
        return (str == null || (mapMapOf = MapsKt.mapOf(Tuples4.m3642to("referral_code", str))) == null) ? MapsKt.emptyMap() : mapMapOf;
    }

    public static final PostUserCreationShimViewState2.RhyUpgrade rhyReferralOnboardingArgs(String str) {
        return new PostUserCreationShimViewState2.RhyUpgrade(DeepLinkPath.RHY_REFERRAL_FUND.buildUri(MapsKt.emptyMap()), referralCodeQueryParams(str));
    }
}

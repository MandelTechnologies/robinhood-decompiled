package com.robinhood.android.onboarding.p205ui.sdonboarding;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.odyssey.lib.BaseSdActivity;
import com.robinhood.android.onboarding.contracts.OnboardingFlowPathType;
import com.robinhood.android.onboarding.contracts.SdOnboardingIntentKey;
import com.robinhood.librobinhood.data.store.identi.ServerDrivenStore;
import com.robinhood.models.api.serverdrivenui.ApiSdResponse;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.shared.store.user.UserStore;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdOnboardingActivity.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 92\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u0002012\u0006\u00103\u001a\u000204H\u0016J\u0018\u00105\u001a\u0002012\u0006\u00106\u001a\u00020#2\u0006\u00107\u001a\u00020'H\u0016J\b\u00108\u001a\u00020\u0017H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0019R\u0016\u0010\"\u001a\u0004\u0018\u00010#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0016\u0010&\u001a\u0004\u0018\u00010'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0016\u0010*\u001a\u0004\u0018\u00010'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0016\u0010,\u001a\u0004\u0018\u00010-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/sdonboarding/SdOnboardingActivity;", "Lcom/robinhood/android/odyssey/lib/BaseSdActivity;", "<init>", "()V", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "getUserStore", "()Lcom/robinhood/shared/store/user/UserStore;", "setUserStore", "(Lcom/robinhood/shared/store/user/UserStore;)V", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "getCardManager", "()Lcom/robinhood/android/common/util/CardManager;", "setCardManager", "(Lcom/robinhood/android/common/util/CardManager;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "forceDarkTheme", "", "getForceDarkTheme", "()Z", "odysseyFlowConfiguration", "Lcom/robinhood/librobinhood/data/store/identi/ServerDrivenStore$FlowConfiguration;", "getOdysseyFlowConfiguration", "()Lcom/robinhood/librobinhood/data/store/identi/ServerDrivenStore$FlowConfiguration;", "odysseyFlowConfiguration$delegate", "Lkotlin/Lazy;", "useAchromaticTheme", "getUseAchromaticTheme", "exitDeeplinkOverride", "Landroid/net/Uri;", "getExitDeeplinkOverride", "()Landroid/net/Uri;", "screenSource", "", "getScreenSource", "()Ljava/lang/String;", "entryPointIdentifier", "getEntryPointIdentifier", "productTag", "Lcom/robinhood/rosetta/eventlogging/Context$ProductTag;", "getProductTag", "()Lcom/robinhood/rosetta/eventlogging/Context$ProductTag;", "onExitFlow", "", "onInitialSdResponseReceived", "response", "Lcom/robinhood/models/api/serverdrivenui/ApiSdResponse;", "doOnExitDeeplinkReceived", "url", "odysseyFlowId", "shouldPromptForLockscreen", "Companion", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class SdOnboardingActivity extends BaseSdActivity {
    public AnalyticsLogger analytics;
    public CardManager cardManager;

    /* renamed from: odysseyFlowConfiguration$delegate, reason: from kotlin metadata */
    private final Lazy odysseyFlowConfiguration = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.onboarding.ui.sdonboarding.SdOnboardingActivity$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SdOnboardingActivity.odysseyFlowConfiguration_delegate$lambda$0(this.f$0);
        }
    });
    public UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.odyssey.lib.BaseSdActivity
    public boolean getUseAchromaticTheme() {
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean shouldPromptForLockscreen() {
        return false;
    }

    public final UserStore getUserStore() {
        UserStore userStore = this.userStore;
        if (userStore != null) {
            return userStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userStore");
        return null;
    }

    public final void setUserStore(UserStore userStore) {
        Intrinsics.checkNotNullParameter(userStore, "<set-?>");
        this.userStore = userStore;
    }

    public final CardManager getCardManager() {
        CardManager cardManager = this.cardManager;
        if (cardManager != null) {
            return cardManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cardManager");
        return null;
    }

    public final void setCardManager(CardManager cardManager) {
        Intrinsics.checkNotNullParameter(cardManager, "<set-?>");
        this.cardManager = cardManager;
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    @Override // com.robinhood.android.odyssey.lib.BaseSdActivity
    public boolean getForceDarkTheme() {
        return ((SdOnboardingIntentKey) INSTANCE.getExtras((Activity) this)).getForceDarkTheme();
    }

    @Override // com.robinhood.android.odyssey.lib.BaseSdActivity
    public ServerDrivenStore.FlowConfiguration getOdysseyFlowConfiguration() {
        return (ServerDrivenStore.FlowConfiguration) this.odysseyFlowConfiguration.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ServerDrivenStore.FlowConfiguration odysseyFlowConfiguration_delegate$lambda$0(SdOnboardingActivity sdOnboardingActivity) {
        OnboardingFlowPathType flowPathType = ((SdOnboardingIntentKey) INSTANCE.getExtras((Activity) sdOnboardingActivity)).getFlowPathType();
        return new ServerDrivenStore.FlowConfiguration(flowPathType.getFlowPath(), false, flowPathType.getQueryParameters(), null, null, null, 58, null);
    }

    @Override // com.robinhood.android.odyssey.lib.BaseSdActivity
    public Uri getExitDeeplinkOverride() {
        return ((SdOnboardingIntentKey) INSTANCE.getExtras((Activity) this)).getExitDeeplinkOverride();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenSource() {
        return ((SdOnboardingIntentKey) INSTANCE.getExtras((Activity) this)).getSource();
    }

    @Override // com.robinhood.android.odyssey.lib.BaseSdActivity
    public String getEntryPointIdentifier() {
        return ((SdOnboardingIntentKey) INSTANCE.getExtras((Activity) this)).getEntryPointIdentifier();
    }

    @Override // com.robinhood.android.odyssey.lib.BaseSdActivity
    public Context.ProductTag getProductTag() {
        OnboardingFlowPathType flowPathType = ((SdOnboardingIntentKey) INSTANCE.getExtras((Activity) this)).getFlowPathType();
        if (Intrinsics.areEqual(flowPathType, OnboardingFlowPathType.CreditCard.INSTANCE) || Intrinsics.areEqual(flowPathType, OnboardingFlowPathType.Rhce.INSTANCE) || (flowPathType instanceof OnboardingFlowPathType.Brokerage)) {
            return super.getProductTag();
        }
        if (flowPathType instanceof OnboardingFlowPathType.MatchaFlow) {
            return Context.ProductTag.PEER_TO_PEER;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.robinhood.android.odyssey.lib.BaseSdActivity
    public void onExitFlow() {
        super.onExitFlow();
        getUserStore().refresh(true);
        getCardManager().invalidateCardsBestEffort();
    }

    @Override // com.robinhood.android.odyssey.lib.BaseSdActivity, com.robinhood.android.odyssey.lib.SdLoadingFragment.Callbacks
    public void onInitialSdResponseReceived(ApiSdResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_STARTED_BROKERAGE_SIGNUP);
    }

    @Override // com.robinhood.android.odyssey.lib.BaseSdActivity
    public void doOnExitDeeplinkReceived(Uri url, String odysseyFlowId) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(odysseyFlowId, "odysseyFlowId");
        AnalyticsLogger.DefaultImpls.logUserAction$default(getAnalytics(), AnalyticsStrings.USER_ACTION_FINISHED_BROKERAGE_SIGNUP, "completed", null, url.toString(), 4, null);
    }

    /* compiled from: SdOnboardingActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/sdonboarding/SdOnboardingActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/onboarding/ui/sdonboarding/SdOnboardingActivity;", "Lcom/robinhood/android/onboarding/contracts/SdOnboardingIntentKey;", "<init>", "()V", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<SdOnboardingActivity, SdOnboardingIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public SdOnboardingIntentKey getExtras(SdOnboardingActivity sdOnboardingActivity) {
            return (SdOnboardingIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, sdOnboardingActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(android.content.Context context, SdOnboardingIntentKey sdOnboardingIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, sdOnboardingIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(android.content.Context context, SdOnboardingIntentKey sdOnboardingIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, sdOnboardingIntentKey);
        }
    }
}

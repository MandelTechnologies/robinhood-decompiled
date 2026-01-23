package com.robinhood.android.referral.rewardoffers.offersList;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.maxonboarding.FromOnboardingCallbacks;
import com.robinhood.android.maxonboarding.OnboardingProgress;
import com.robinhood.android.maxonboarding.ToolbarExt2;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.data.ReferralLaunchMode;
import com.robinhood.android.referral.C26659R;
import com.robinhood.android.referral.contracts.RewardOfferIntentKey;
import com.robinhood.android.referral.lib.rewardOfferDetail.RewardOfferDetails;
import com.robinhood.android.referral.pastRewards.RewardsFragment;
import com.robinhood.android.referral.rewardoffers.offerDetails.RewardOfferDetailsV1Fragment;
import com.robinhood.android.referral.rewardoffers.offersList.RewardOffersFragment;
import com.robinhood.android.referral.rewardoffers.offersList.RewardOffersLoadingFragment;
import com.robinhood.android.util.play.GooglePlay;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.api.rewardoffer.ApiRewardOfferAction;
import com.robinhood.models.api.rewardoffer.ApiRewardOfferButtonAction;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import java.util.List;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RewardOffersActivity.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001.B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000b\u001a\u00020\tH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J \u0010\u0014\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J$\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010 \u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010!\u001a\u00020\rH\u0016J\b\u0010\"\u001a\u00020\rH\u0016J\u001a\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020%2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010&\u001a\u00020\r2\u0006\u0010$\u001a\u00020%2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010'\u001a\u00020\rH\u0016J\u001a\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020%2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010*\u001a\u00020\r2\u0006\u0010)\u001a\u00020+2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010,\u001a\u00020\rH\u0002J\u001a\u0010-\u001a\u00020\r2\u0006\u0010$\u001a\u00020%2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\n¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersLoadingFragment$Callbacks;", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersFragment$Callbacks;", "Lcom/robinhood/android/referral/rewardoffers/offerDetails/RewardOfferDetailsV1Fragment$Callbacks;", "Lcom/robinhood/android/maxonboarding/FromOnboardingCallbacks;", "<init>", "()V", "isFromRhfOnboarding", "", "()Z", "shouldPromptForLockscreen", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onRewardOffersLoaded", "rewardOffers", "", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOfferViewType;", "initialSource", "", "onRewardOfferDetailsLoaded", "rewardOfferDetails", "Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetails;", "showReferralV2Offer", "offerId", "Ljava/util/UUID;", "source", "onRewardOfferUpdateAppButtonTriggered", "onAccessDenied", "onRewardOfferTapActionTriggered", "rewardOfferAction", "Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferAction;", "onRewardOfferButtonActionTriggered", "onPastReferralsClicked", "onOfferDetailsBulletActionTriggered", "action", "onOfferDetailsButtonActionTriggered", "Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferButtonAction;", "setInitialFragment", "handleAction", "Companion", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RewardOffersActivity extends BaseActivity implements RewardOffersLoadingFragment.Callbacks, RewardOffersFragment.Callbacks, RewardOfferDetailsV1Fragment.Callbacks, FromOnboardingCallbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseActivity.$stable;

    public RewardOffersActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    @Override // com.robinhood.android.maxonboarding.FromOnboardingCallbacks
    public boolean isFromRhfOnboarding() {
        RewardOfferIntentKey.OffersList offersList = (RewardOfferIntentKey.OffersList) INSTANCE.getExtras((Activity) this);
        if (offersList instanceof RewardOfferIntentKey.Platform) {
            return ((RewardOfferIntentKey.Platform) offersList).isFromRhfOnboarding();
        }
        return false;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean shouldPromptForLockscreen() {
        return !isFromRhfOnboarding();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (isFromRhfOnboarding()) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), AchromaticOverlay.INSTANCE, null, 2, null);
        }
        if (((RewardOfferIntentKey.OffersList) INSTANCE.getExtras((Activity) this)).getTheme() == ColorTheme.DARK) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), DayNightOverlay.NIGHT, null, 2, null);
        }
        if (savedInstanceState == null) {
            setInitialFragment();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() >= 2) {
            super.onBackPressed();
        } else {
            finish();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        ToolbarExt2.configureMaxActivity(toolbar, OnboardingProgress.REFERRAL, isFromRhfOnboarding());
    }

    @Override // com.robinhood.android.referral.rewardoffers.offersList.RewardOffersLoadingFragment.Callbacks
    public void onRewardOffersLoaded(List<? extends RewardOfferViewType> rewardOffers, String initialSource) {
        Intrinsics.checkNotNullParameter(rewardOffers, "rewardOffers");
        replaceFragmentWithoutAnimation(RewardOffersFragment.INSTANCE.newInstance((Parcelable) new RewardOffersFragment.Args(rewardOffers, initialSource)));
    }

    @Override // com.robinhood.android.referral.rewardoffers.offersList.RewardOffersLoadingFragment.Callbacks
    public void onRewardOfferDetailsLoaded(RewardOfferDetails rewardOfferDetails, String initialSource) {
        Intrinsics.checkNotNullParameter(rewardOfferDetails, "rewardOfferDetails");
        replaceFragmentWithoutAnimation(RewardOfferDetailsV1Fragment.INSTANCE.newInstance((Parcelable) new RewardOfferDetailsV1Fragment.Args(rewardOfferDetails, initialSource, ReferralLaunchMode.LAST_KNOWN_TOUCHPOINT_OFFERS_LIST_SCREEN)));
    }

    @Override // com.robinhood.android.referral.rewardoffers.offersList.RewardOffersLoadingFragment.Callbacks
    public void showReferralV2Offer(UUID offerId, String initialSource, String source) {
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new RewardOfferIntentKey.ReferralOffer(source, ((RewardOfferIntentKey.OffersList) INSTANCE.getExtras((Activity) this)).getTheme(), offerId, null, initialSource, isFromRhfOnboarding(), 8, null), null, false, null, null, 60, null);
        finish();
    }

    @Override // com.robinhood.android.referral.rewardoffers.offersList.RewardOffersFragment.Callbacks
    public void onRewardOfferUpdateAppButtonTriggered() {
        GooglePlay.INSTANCE.launchStore(this);
    }

    @Override // com.robinhood.android.referral.rewardoffers.offersList.RewardOffersLoadingFragment.Callbacks
    public void onAccessDenied() throws Resources.NotFoundException {
        ContextsUiExtensions.showShortToast(this, C26659R.string.reward_offers_no_access_message);
        finish();
    }

    @Override // com.robinhood.android.referral.rewardoffers.offersList.RewardOffersFragment.Callbacks
    public void onRewardOfferTapActionTriggered(ApiRewardOfferAction rewardOfferAction, String initialSource) {
        Intrinsics.checkNotNullParameter(rewardOfferAction, "rewardOfferAction");
        handleAction(rewardOfferAction, initialSource);
    }

    @Override // com.robinhood.android.referral.rewardoffers.offersList.RewardOffersFragment.Callbacks
    public void onRewardOfferButtonActionTriggered(ApiRewardOfferAction rewardOfferAction, String initialSource) {
        Intrinsics.checkNotNullParameter(rewardOfferAction, "rewardOfferAction");
        handleAction(rewardOfferAction, initialSource);
    }

    @Override // com.robinhood.android.referral.rewardoffers.offersList.RewardOffersFragment.Callbacks, com.robinhood.android.referral.rewardoffers.offerDetails.RewardOfferDetailsV1Fragment.Callbacks
    public void onPastReferralsClicked() {
        replaceFragment(RewardsFragment.INSTANCE.newInstance());
    }

    @Override // com.robinhood.android.referral.rewardoffers.offerDetails.RewardOfferDetailsV1Fragment.Callbacks
    public void onOfferDetailsBulletActionTriggered(ApiRewardOfferAction action, String initialSource) {
        Intrinsics.checkNotNullParameter(action, "action");
        handleAction(action, initialSource);
    }

    @Override // com.robinhood.android.referral.rewardoffers.offerDetails.RewardOfferDetailsV1Fragment.Callbacks
    public void onOfferDetailsButtonActionTriggered(ApiRewardOfferButtonAction action, String initialSource) {
        Intrinsics.checkNotNullParameter(action, "action");
        handleAction(action.getAction(), initialSource);
    }

    private final void setInitialFragment() {
        Fragment fragmentNewInstance;
        RewardOfferIntentKey.OffersList offersList = (RewardOfferIntentKey.OffersList) INSTANCE.getExtras((Activity) this);
        if (offersList instanceof RewardOfferIntentKey.Platform) {
            fragmentNewInstance = (GenericComposeFragment) RewardOffersLoadingFragment.INSTANCE.newInstance((Parcelable) offersList);
        } else {
            if (!(offersList instanceof RewardOfferIntentKey.PastReferrals)) {
                throw new NoWhenBranchMatchedException();
            }
            fragmentNewInstance = RewardsFragment.INSTANCE.newInstance();
        }
        setFragment(C11048R.id.fragment_container, fragmentNewInstance);
    }

    /* JADX WARN: Type inference failed for: r10v6, types: [T, android.net.Uri$Builder] */
    /* JADX WARN: Type inference failed for: r10v8, types: [T, android.net.Uri$Builder] */
    private final void handleAction(ApiRewardOfferAction rewardOfferAction, String initialSource) {
        if (rewardOfferAction instanceof ApiRewardOfferAction.DeepLinkAction) {
            ApiRewardOfferAction.DeepLinkAction deepLinkAction = (ApiRewardOfferAction.DeepLinkAction) rewardOfferAction;
            String queryParameter = deepLinkAction.getData().getAction_url().getQueryParameter("source");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? AppendQueryParameter = deepLinkAction.getData().getAction_url().buildUpon().appendQueryParameter("initial_source", initialSource);
            objectRef.element = AppendQueryParameter;
            if (queryParameter == null) {
                objectRef.element = AppendQueryParameter.appendQueryParameter("source", ReferralLaunchMode.LAST_KNOWN_TOUCHPOINT_OFFERS_LIST_SCREEN);
            }
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C267961(objectRef, null), 3, null);
            return;
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(rewardOfferAction);
        throw new ExceptionsH();
    }

    /* compiled from: RewardOffersActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.offersList.RewardOffersActivity$handleAction$1", m3645f = "RewardOffersActivity.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.rewardoffers.offersList.RewardOffersActivity$handleAction$1 */
    static final class C267961 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<Uri.Builder> $deeplinkUriBuilder;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C267961(Ref.ObjectRef<Uri.Builder> objectRef, Continuation<? super C267961> continuation) {
            super(2, continuation);
            this.$deeplinkUriBuilder = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RewardOffersActivity.this.new C267961(this.$deeplinkUriBuilder, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C267961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Navigator.DefaultImpls.handleDeepLink$default(RewardOffersActivity.this.getNavigator(), RewardOffersActivity.this, this.$deeplinkUriBuilder.element.build(), boxing.boxBoolean(false), null, false, null, 56, null);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: RewardOffersActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersActivity;", "Lcom/robinhood/android/referral/contracts/RewardOfferIntentKey$OffersList;", "<init>", "()V", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<RewardOffersActivity, RewardOfferIntentKey.OffersList> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public RewardOfferIntentKey.OffersList getExtras(RewardOffersActivity rewardOffersActivity) {
            return (RewardOfferIntentKey.OffersList) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, rewardOffersActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, RewardOfferIntentKey.OffersList offersList) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, offersList);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, RewardOfferIntentKey.OffersList offersList) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, offersList);
        }
    }
}

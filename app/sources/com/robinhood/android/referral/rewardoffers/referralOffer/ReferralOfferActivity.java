package com.robinhood.android.referral.rewardoffers.referralOffer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.util.Compat;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.referral.contracts.RewardOfferIntentKey;
import com.robinhood.android.referral.pastRewards.RewardsFragment;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.installation.WhatsAppInstallation;
import com.robinhood.android.referral.rewardoffers.referralOffer.infoSheet.ReferralOfferInfoSheetFragment;
import com.robinhood.android.referral.rewardoffers.referralOffer.loading.ReferralOfferLoadingFragment;
import com.robinhood.android.referral.rewardoffers.referralOffer.loading.ReferralOfferLoadingResult;
import com.robinhood.android.referral.rewardoffers.referralOffer.sdui.ReferralOfferV2SduiFragment;
import com.robinhood.android.referral.rewardoffers.referralOffer.sdui.ReferralOfferV2SduiFragmentKey;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p355ui.referraloffer.ReferralOfferDetails;
import com.robinhood.models.p355ui.referraloffer.ReferralOfferInfoSheet;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.StandardPageTemplate;
import com.robinhood.models.serverdriven.p347db.ImageSource;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: ReferralOfferActivity.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00010B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0016J\u001e\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&H\u0016J\u0010\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020\u001cH\u0016J\b\u0010/\u001a\u00020\u001cH\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/ReferralOfferActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/loading/ReferralOfferLoadingFragment$Callbacks;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/sdui/ReferralOfferV2SduiFragment$Callbacks;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/ReferralOfferDetailsFragment$Callbacks;", "<init>", "()V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "getUserStore", "()Lcom/robinhood/shared/store/user/UserStore;", "setUserStore", "(Lcom/robinhood/shared/store/user/UserStore;)V", "whatsAppInstallation", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/installation/WhatsAppInstallation;", "getWhatsAppInstallation", "()Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/installation/WhatsAppInstallation;", "setWhatsAppInstallation", "(Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/installation/WhatsAppInstallation;)V", "shouldPromptForLockscreen", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOfferDetailsLoaded", "result", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/loading/ReferralOfferLoadingResult;", "onSduiDetailsLoaded", "offerId", "Ljava/util/UUID;", "content", "Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "prefetchImageAssets", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/models/ui/referraloffer/ReferralOfferDetails;", "onShowInfoSheet", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/ui/referraloffer/ReferralOfferInfoSheet;", "onPastRewardsClicked", "onBackPressed", "Companion", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ReferralOfferActivity extends BaseActivity implements ReferralOfferLoadingFragment.Callbacks, ReferralOfferV2SduiFragment.Callbacks, ReferralOfferDetailsFragment.Callbacks {
    public ImageLoader imageLoader;
    public UserStore userStore;
    public WhatsAppInstallation whatsAppInstallation;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public ReferralOfferActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader = this.imageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final void setImageLoader(ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.imageLoader = imageLoader;
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

    public final WhatsAppInstallation getWhatsAppInstallation() {
        WhatsAppInstallation whatsAppInstallation = this.whatsAppInstallation;
        if (whatsAppInstallation != null) {
            return whatsAppInstallation;
        }
        Intrinsics.throwUninitializedPropertyAccessException("whatsAppInstallation");
        return null;
    }

    public final void setWhatsAppInstallation(WhatsAppInstallation whatsAppInstallation) {
        Intrinsics.checkNotNullParameter(whatsAppInstallation, "<set-?>");
        this.whatsAppInstallation = whatsAppInstallation;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean shouldPromptForLockscreen() {
        return !((RewardOfferIntentKey.ReferralOffer) INSTANCE.getExtras((Activity) this)).isFromRhfOnboarding();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Companion companion = INSTANCE;
        if (((RewardOfferIntentKey.ReferralOffer) companion.getExtras((Activity) this)).getTheme() == ColorTheme.DARK) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), DayNightOverlay.NIGHT, null, 2, null);
        }
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, ReferralOfferLoadingFragment.INSTANCE.newInstance((Parcelable) new ReferralOfferLoadingFragment.Args(((RewardOfferIntentKey.ReferralOffer) companion.getExtras((Activity) this)).getRewardOfferId(), ((RewardOfferIntentKey.ReferralOffer) companion.getExtras((Activity) this)).getInstrumentId(), ((RewardOfferIntentKey.ReferralOffer) companion.getExtras((Activity) this)).getInitialSource(), ((RewardOfferIntentKey.ReferralOffer) companion.getExtras((Activity) this)).getSource(), ((RewardOfferIntentKey.ReferralOffer) companion.getExtras((Activity) this)).isFromRhfOnboarding())));
        }
    }

    @Override // com.robinhood.android.referral.rewardoffers.referralOffer.loading.ReferralOfferLoadingFragment.Callbacks
    public void onOfferDetailsLoaded(ReferralOfferLoadingResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        prefetchImageAssets(result.getDetails());
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C268191(result, Compat.INSTANCE.checkSelfPermission(this, "android.permission.READ_CONTACTS"), null), 3, null);
    }

    /* compiled from: ReferralOfferActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.referralOffer.ReferralOfferActivity$onOfferDetailsLoaded$1", m3645f = "ReferralOfferActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.ReferralOfferActivity$onOfferDetailsLoaded$1 */
    static final class C268191 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isContactsPermissionGranted;
        final /* synthetic */ ReferralOfferLoadingResult $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C268191(ReferralOfferLoadingResult referralOfferLoadingResult, boolean z, Continuation<? super C268191> continuation) {
            super(2, continuation);
            this.$result = referralOfferLoadingResult;
            this.$isContactsPermissionGranted = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReferralOfferActivity.this.new C268191(this.$result, this.$isContactsPermissionGranted, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C268191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws PackageManager.NameNotFoundException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable<User> user = ReferralOfferActivity.this.getUserStore().getUser();
                this.label = 1;
                obj = RxAwait3.awaitFirstOrNull(user, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            User user2 = (User) obj;
            boolean isRhsg = user2 != null ? user2.getIsRhsg() : false;
            boolean zIsInstalled = ReferralOfferActivity.this.getWhatsAppInstallation().isInstalled();
            ReferralOfferActivity referralOfferActivity = ReferralOfferActivity.this;
            ReferralOfferDetailsFragment.Companion companion = ReferralOfferDetailsFragment.INSTANCE;
            ReferralOfferDetails details = this.$result.getDetails();
            boolean zIsMultiSelectContactsMember = this.$result.isMultiSelectContactsMember();
            boolean z = this.$isContactsPermissionGranted;
            Companion companion2 = ReferralOfferActivity.INSTANCE;
            referralOfferActivity.replaceFragmentWithoutAnimation(companion.newInstance((Parcelable) new ReferralOfferDetailsFragment.Args(details, zIsMultiSelectContactsMember, z, isRhsg, zIsInstalled, ((RewardOfferIntentKey.ReferralOffer) companion2.getExtras((Activity) ReferralOfferActivity.this)).getSource(), ((RewardOfferIntentKey.ReferralOffer) companion2.getExtras((Activity) ReferralOfferActivity.this)).getInitialSource())));
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.referral.rewardoffers.referralOffer.loading.ReferralOfferLoadingFragment.Callbacks
    public void onSduiDetailsLoaded(UUID offerId, StandardPageTemplate<? extends GenericAction> content) {
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        Intrinsics.checkNotNullParameter(content, "content");
        replaceFragmentWithoutAnimation(ReferralOfferV2SduiFragment.INSTANCE.newInstance((Parcelable) new ReferralOfferV2SduiFragmentKey(offerId, content)));
    }

    private final void prefetchImageAssets(ReferralOfferDetails details) {
        ImageSource dark;
        if (DayNightChanges.isDay(ScarletManager2.getScarletManager(this))) {
            dark = details.getHeaderImage().getUrl().getLight();
        } else {
            dark = details.getHeaderImage().getUrl().getDark();
        }
        ImageLoader.ImageRequest.DefaultImpls.fetch$default(getImageLoader().load(dark.toImageUrl(this)), null, null, 3, null);
    }

    @Override // com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment.Callbacks
    public void onShowInfoSheet(ReferralOfferInfoSheet data) {
        Intrinsics.checkNotNullParameter(data, "data");
        replaceFragment(ReferralOfferInfoSheetFragment.INSTANCE.newInstance((Parcelable) data));
    }

    @Override // com.robinhood.android.referral.rewardoffers.referralOffer.sdui.ReferralOfferV2SduiFragment.Callbacks, com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment.Callbacks
    public void onPastRewardsClicked() {
        replaceFragment(RewardsFragment.INSTANCE.newInstance());
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() >= 2) {
            super.onBackPressed();
        } else {
            finish();
        }
    }

    /* compiled from: ReferralOfferActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/ReferralOfferActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/ReferralOfferActivity;", "Lcom/robinhood/android/referral/contracts/RewardOfferIntentKey$ReferralOffer;", "<init>", "()V", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<ReferralOfferActivity, RewardOfferIntentKey.ReferralOffer> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public RewardOfferIntentKey.ReferralOffer getExtras(ReferralOfferActivity referralOfferActivity) {
            return (RewardOfferIntentKey.ReferralOffer) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, referralOfferActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, RewardOfferIntentKey.ReferralOffer referralOffer) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, referralOffer);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, RewardOfferIntentKey.ReferralOffer referralOffer) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, referralOffer);
        }
    }
}

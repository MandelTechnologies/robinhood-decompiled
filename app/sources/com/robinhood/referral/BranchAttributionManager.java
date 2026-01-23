package com.robinhood.referral;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.account.contracts.jointaccounts.JointAccountOnboardingSecondaryIntroShim;
import com.robinhood.android.common.data.prefs.ReferredDataPref;
import com.robinhood.android.creditcard.contracts.WelcomeCreditCardKey;
import com.robinhood.android.crypto.contracts.CryptoReferralsDeeplinkIntentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.rhyonboarding.contracts.WelcomeRhyKey;
import com.robinhood.api.referral.ReferralApi;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.UserRegionStore;
import com.robinhood.models.api.EstablishReferralRequest;
import com.robinhood.models.api.ReferralLandingSdui;
import com.robinhood.models.api.ReferredCampaign;
import com.robinhood.models.api.ReferredCampaign4;
import com.robinhood.models.api.ReferredLandingPageContentResponse;
import com.robinhood.models.api.UserRegion;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.Installation;
import com.robinhood.prefs.LongPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.EngagementTimeForAnalyticsPref;
import com.robinhood.prefs.annotation.HasEverLoggedInPref;
import com.robinhood.prefs.annotation.ReferredDataForAnalyticsPref;
import com.robinhood.prefs.annotation.ReferredDataOrganicPref;
import com.robinhood.referral.branch.BranchManager;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.logging.TimberLogger;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.moshi.JsonAdapter;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuationJvm;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import org.json.JSONObject;
import timber.log.Timber;

/* compiled from: BranchAttributionManager.kt */
@Metadata(m3635d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 H2\u00020\u0001:\u0001HB}\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010&\u001a\u00020'J\b\u0010-\u001a\u00020'H\u0016J'\u0010.\u001a\u00020'\"\b\b\u0000\u0010/*\u0002002\u0006\u00101\u001a\u0002H/2\u0006\u00102\u001a\u000203H\u0016¢\u0006\u0002\u00104J*\u00105\u001a\u0004\u0018\u000106\"\b\b\u0000\u0010/*\u0002002\u0006\u00101\u001a\u0002H/2\u0006\u00102\u001a\u000203H\u0082@¢\u0006\u0002\u00107J,\u00108\u001a\u0004\u0018\u000106\"\b\b\u0000\u0010/*\u0002002\u0006\u00101\u001a\u0002H/2\b\u00109\u001a\u0004\u0018\u00010:H\u0082@¢\u0006\u0002\u0010;J\u0012\u0010<\u001a\u00020=*\u000206H\u0082@¢\u0006\u0002\u0010>J\u0012\u0010?\u001a\u00020'2\b\u0010@\u001a\u0004\u0018\u00010=H\u0002J\u000e\u0010A\u001a\u0004\u0018\u00010B*\u00020=H\u0002J\u0010\u0010C\u001a\u0002062\u0006\u0010D\u001a\u00020EH\u0002J\b\u0010F\u001a\u00020'H\u0016J\b\u0010G\u001a\u00020'H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006I"}, m3636d2 = {"Lcom/robinhood/referral/BranchAttributionManager;", "Lcom/robinhood/referral/AttributionManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "branchManager", "Lcom/robinhood/referral/branch/BranchManager;", "referralApi", "Lcom/robinhood/api/referral/ReferralApi;", "installation", "Lcom/robinhood/prefs/Installation;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "userRegionStore", "Lcom/robinhood/librobinhood/data/store/UserRegionStore;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "referredDataPref", "Lcom/robinhood/prefs/StringPreference;", "referredDataForAnalyticsPref", "engagementTimeForAnalyticsPref", "Lcom/robinhood/prefs/LongPreference;", "referredDataOrganicPref", "Lcom/robinhood/prefs/BooleanPreference;", "hasEverLoggedInPref", "<init>", "(Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/referral/branch/BranchManager;Lcom/robinhood/api/referral/ReferralApi;Lcom/robinhood/prefs/Installation;Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/librobinhood/data/store/UserRegionStore;Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/LongPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;)V", "referredCampaignJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/models/api/ReferredCampaign;", "getReferredCampaignJsonAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "referredCampaignJsonAdapter$delegate", "Lkotlin/Lazy;", "branchCountryBlockList", "", "", "resetReferredAnalytics", "", "nextScreenFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/robinhood/referral/AttributionNavigation;", "getNextScreenFlow", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "resetNextScreenFlow", "handleAttribution", "A", "Landroid/app/Activity;", "activity", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "(Landroid/app/Activity;Landroid/content/Intent;)V", "getAttributionData", "Lcom/robinhood/referral/BranchLinkAttributionData;", "(Landroid/app/Activity;Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAttributionDataFromBranch", "dataForBranch", "Landroid/net/Uri;", "(Landroid/app/Activity;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toAttributionResult", "Lcom/robinhood/referral/AttributionResult;", "(Lcom/robinhood/referral/BranchLinkAttributionData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "persistAttributionResult", "attributionResult", "toNextScreen", "Lcom/robinhood/android/navigation/keys/IntentKey;", "extractAttributionData", "referringParams", "Lorg/json/JSONObject;", "completeAttribution", "clearPersistedData", "Companion", "lib-referral_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class BranchAttributionManager implements AttributionManager {
    private static final String REFERRED_OBJECT_KEY = "rh_data";
    private final AnalyticsLogger analytics;
    private final AuthManager authManager;
    private final List<String> branchCountryBlockList;
    private final BranchManager branchManager;
    private final CoroutineScope coroutineScope;
    private final LongPreference engagementTimeForAnalyticsPref;
    private final BooleanPreference hasEverLoggedInPref;
    private final Installation installation;
    private final SharedFlow2<AttributionNavigation> nextScreenFlow;
    private final ReferralApi referralApi;

    /* renamed from: referredCampaignJsonAdapter$delegate, reason: from kotlin metadata */
    private final Lazy referredCampaignJsonAdapter;
    private final StringPreference referredDataForAnalyticsPref;
    private final BooleanPreference referredDataOrganicPref;
    private final StringPreference referredDataPref;
    private final UserRegionStore userRegionStore;

    /* compiled from: BranchAttributionManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReferredCampaign4.values().length];
            try {
                iArr[ReferredCampaign4.WAITLIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReferredCampaign4.BROKERAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReferredCampaign4.RHY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReferredCampaign4.CREDIT_CARD_WAITLIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReferredCampaign4.ACCEPT_JOINT_ACCOUNT_INVITE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReferredCampaign4.CRYPTO_REFERRAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: BranchAttributionManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.referral.BranchAttributionManager", m3645f = "BranchAttributionManager.kt", m3646l = {104, 108}, m3647m = "getAttributionData")
    /* renamed from: com.robinhood.referral.BranchAttributionManager$getAttributionData$1 */
    static final class C361481<A extends Activity> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C361481(Continuation<? super C361481> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BranchAttributionManager.this.getAttributionData(null, null, this);
        }
    }

    /* compiled from: BranchAttributionManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.referral.BranchAttributionManager", m3645f = "BranchAttributionManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE}, m3647m = "toAttributionResult")
    /* renamed from: com.robinhood.referral.BranchAttributionManager$toAttributionResult$1 */
    static final class C361501 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C361501(Continuation<? super C361501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BranchAttributionManager.this.toAttributionResult(null, this);
        }
    }

    public BranchAttributionManager(final LazyMoshi moshi, AuthManager authManager, BranchManager branchManager, ReferralApi referralApi, Installation installation, AnalyticsLogger analytics, UserRegionStore userRegionStore, @RootCoroutineScope CoroutineScope coroutineScope, @ReferredDataPref StringPreference referredDataPref, @ReferredDataForAnalyticsPref StringPreference referredDataForAnalyticsPref, @EngagementTimeForAnalyticsPref LongPreference engagementTimeForAnalyticsPref, @ReferredDataOrganicPref BooleanPreference referredDataOrganicPref, @HasEverLoggedInPref BooleanPreference hasEverLoggedInPref) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(branchManager, "branchManager");
        Intrinsics.checkNotNullParameter(referralApi, "referralApi");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(userRegionStore, "userRegionStore");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(referredDataPref, "referredDataPref");
        Intrinsics.checkNotNullParameter(referredDataForAnalyticsPref, "referredDataForAnalyticsPref");
        Intrinsics.checkNotNullParameter(engagementTimeForAnalyticsPref, "engagementTimeForAnalyticsPref");
        Intrinsics.checkNotNullParameter(referredDataOrganicPref, "referredDataOrganicPref");
        Intrinsics.checkNotNullParameter(hasEverLoggedInPref, "hasEverLoggedInPref");
        this.authManager = authManager;
        this.branchManager = branchManager;
        this.referralApi = referralApi;
        this.installation = installation;
        this.analytics = analytics;
        this.userRegionStore = userRegionStore;
        this.coroutineScope = coroutineScope;
        this.referredDataPref = referredDataPref;
        this.referredDataForAnalyticsPref = referredDataForAnalyticsPref;
        this.engagementTimeForAnalyticsPref = engagementTimeForAnalyticsPref;
        this.referredDataOrganicPref = referredDataOrganicPref;
        this.hasEverLoggedInPref = hasEverLoggedInPref;
        this.referredCampaignJsonAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.referral.BranchAttributionManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BranchAttributionManager.referredCampaignJsonAdapter_delegate$lambda$0(moshi);
            }
        });
        this.branchCountryBlockList = CollectionsKt.listOf(CountryCode.COUNTRY_CODE_GB);
        this.nextScreenFlow = SharedFlow4.MutableSharedFlow$default(1, 0, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonAdapter<ReferredCampaign> getReferredCampaignJsonAdapter() {
        return (JsonAdapter) this.referredCampaignJsonAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAdapter referredCampaignJsonAdapter_delegate$lambda$0(LazyMoshi lazyMoshi) {
        return lazyMoshi.adapter(ReferredCampaign.class);
    }

    public final void resetReferredAnalytics() {
        this.analytics.onReferredCampaign(this.referredDataForAnalyticsPref.get(), this.engagementTimeForAnalyticsPref.isSet() ? Long.valueOf(this.engagementTimeForAnalyticsPref.get()) : null);
    }

    @Override // com.robinhood.referral.AttributionManager
    public SharedFlow2<AttributionNavigation> getNextScreenFlow() {
        return this.nextScreenFlow;
    }

    @Override // com.robinhood.referral.AttributionManager
    public void resetNextScreenFlow() {
        getNextScreenFlow().resetReplayCache();
    }

    /* compiled from: BranchAttributionManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.referral.BranchAttributionManager$handleAttribution$1", m3645f = "BranchAttributionManager.kt", m3646l = {89, 90, 93}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.referral.BranchAttributionManager$handleAttribution$1 */
    static final class C361491 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: Incorrect field signature: TA; */
        final /* synthetic */ Activity $activity;
        final /* synthetic */ Intent $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lcom/robinhood/referral/BranchAttributionManager;TA;Landroid/content/Intent;Lkotlin/coroutines/Continuation<-Lcom/robinhood/referral/BranchAttributionManager$handleAttribution$1;>;)V */
        C361491(Activity activity, Intent intent, Continuation continuation) {
            super(2, continuation);
            this.$activity = activity;
            this.$data = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BranchAttributionManager.this.new C361491(this.$activity, this.$data, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C361491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
        
            if (r7 == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
        
            if (r1.emit(r3, r6) != r0) goto L29;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AttributionResult attributionResult;
            IntentKey nextScreen;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BranchAttributionManager branchAttributionManager = BranchAttributionManager.this;
                Activity activity = this.$activity;
                Intent intent = this.$data;
                this.label = 1;
                obj = branchAttributionManager.getAttributionData(activity, intent, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                attributionResult = (AttributionResult) obj;
                BranchAttributionManager.this.persistAttributionResult(attributionResult);
                if (attributionResult != null && (nextScreen = BranchAttributionManager.this.toNextScreen(attributionResult)) != null) {
                    SharedFlow2<AttributionNavigation> nextScreenFlow = BranchAttributionManager.this.getNextScreenFlow();
                    IntentKeyNavigation intentKeyNavigation = new IntentKeyNavigation(nextScreen);
                    this.label = 3;
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            BranchLinkAttributionData branchLinkAttributionData = (BranchLinkAttributionData) obj;
            if (branchLinkAttributionData == null) {
                attributionResult = null;
                BranchAttributionManager.this.persistAttributionResult(attributionResult);
                if (attributionResult != null) {
                    SharedFlow2<AttributionNavigation> nextScreenFlow2 = BranchAttributionManager.this.getNextScreenFlow();
                    IntentKeyNavigation intentKeyNavigation2 = new IntentKeyNavigation(nextScreen);
                    this.label = 3;
                }
                return Unit.INSTANCE;
            }
            BranchAttributionManager branchAttributionManager2 = BranchAttributionManager.this;
            this.label = 2;
            obj = branchAttributionManager2.toAttributionResult(branchLinkAttributionData, this);
        }
    }

    @Override // com.robinhood.referral.AttributionManager
    public <A extends Activity> void handleAttribution(A activity, Intent data) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.authManager.isLoggedIn()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C361491(activity, data, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <A extends Activity> Object getAttributionData(A a, Intent intent, Continuation<? super BranchLinkAttributionData> continuation) {
        C361481 c361481;
        if (continuation instanceof C361481) {
            c361481 = (C361481) continuation;
            int i = c361481.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c361481.label = i - Integer.MIN_VALUE;
            } else {
                c361481 = new C361481(continuation);
            }
        }
        Object objCoGetCurrentRegion = c361481.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c361481.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCoGetCurrentRegion);
            UserRegionStore userRegionStore = this.userRegionStore;
            c361481.L$0 = a;
            c361481.L$1 = intent;
            c361481.label = 1;
            objCoGetCurrentRegion = userRegionStore.coGetCurrentRegion(c361481);
            if (objCoGetCurrentRegion != coroutine_suspended) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCoGetCurrentRegion);
            return objCoGetCurrentRegion;
        }
        intent = (Intent) c361481.L$1;
        a = (A) c361481.L$0;
        ResultKt.throwOnFailure(objCoGetCurrentRegion);
        String upperCase = ((UserRegion) objCoGetCurrentRegion).getRegion().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (!this.branchCountryBlockList.contains(upperCase)) {
            Uri data = intent.getData();
            c361481.L$0 = null;
            c361481.L$1 = null;
            c361481.label = 2;
            Object attributionDataFromBranch = getAttributionDataFromBranch(a, data, c361481);
            return attributionDataFromBranch == coroutine_suspended ? coroutine_suspended : attributionDataFromBranch;
        }
        Uri data2 = intent.getData();
        return new BranchLinkAttributionData(data2 != null ? data2.getQueryParameter("referral_code") : null, (ReferredCampaign4) ReferredCampaign4.INSTANCE.getDefault(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <A extends Activity> Object getAttributionDataFromBranch(A a, Uri uri, Continuation<? super BranchLinkAttributionData> continuation) {
        final SafeContinuationJvm safeContinuationJvm = new SafeContinuationJvm(IntrinsicsKt.intercepted(continuation));
        if (uri == null) {
            uri = Uri.EMPTY;
        }
        Timber.INSTANCE.mo3350d("Branch init session start", new Object[0]);
        BranchManager branchManager = this.branchManager;
        Intrinsics.checkNotNull(uri);
        branchManager.initSession(uri, a, new Function2<JSONObject, String, Unit>() { // from class: com.robinhood.referral.BranchAttributionManager$getAttributionDataFromBranch$2$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject, String str) {
                invoke2(jSONObject, str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(JSONObject jSONObject, String str) {
                if (str == null) {
                    Timber.INSTANCE.mo3350d("Branch init session result: %s", jSONObject);
                    if (jSONObject == null) {
                        throw new IllegalStateException("referringParams are null, but no error was encountered!");
                    }
                    Continuation<BranchLinkAttributionData> continuation2 = safeContinuationJvm;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m28550constructorimpl(this.extractAttributionData(jSONObject)));
                    return;
                }
                Timber.INSTANCE.mo3353e("Branch init session error: %s", str);
                Continuation<BranchLinkAttributionData> continuation3 = safeContinuationJvm;
                Result.Companion companion2 = Result.INSTANCE;
                continuation3.resumeWith(Result.m28550constructorimpl(new BranchLinkAttributionData(null, (ReferredCampaign4) ReferredCampaign4.INSTANCE.getDefault(), null, 4, null)));
            }
        });
        Object orThrow = safeContinuationJvm.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object toAttributionResult(BranchLinkAttributionData branchLinkAttributionData, Continuation<? super AttributionResult> continuation) {
        C361501 c361501;
        if (continuation instanceof C361501) {
            c361501 = (C361501) continuation;
            int i = c361501.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c361501.label = i - Integer.MIN_VALUE;
            } else {
                c361501 = new C361501(continuation);
            }
        }
        Object referredLandingPageContent = c361501.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c361501.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(referredLandingPageContent);
                ReferredCampaign4 referralType = branchLinkAttributionData.getReferralType();
                if (referralType != null && !referralType.getRequiresReferredLandingPageContent()) {
                    return AttributionResult.INSTANCE.forReferral(null, branchLinkAttributionData);
                }
                ReferralApi referralApi = this.referralApi;
                String strMo2745id = this.installation.mo2745id();
                String referralCode = branchLinkAttributionData.getReferralCode();
                c361501.L$0 = branchLinkAttributionData;
                c361501.label = 1;
                referredLandingPageContent = referralApi.getReferredLandingPageContent(strMo2745id, referralCode, c361501);
                if (referredLandingPageContent == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                branchLinkAttributionData = (BranchLinkAttributionData) c361501.L$0;
                ResultKt.throwOnFailure(referredLandingPageContent);
            }
            return AttributionResult.INSTANCE.forReferral(((ReferredLandingPageContentResponse) referredLandingPageContent).getRh_data(), branchLinkAttributionData);
        } catch (Exception e) {
            Timber.INSTANCE.mo3353e("Get Referred Landing Page Content Error: %s", e);
            return AttributionResult.INSTANCE.forNoResult();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void persistAttributionResult(AttributionResult attributionResult) {
        if ((attributionResult != null ? attributionResult.getReferredCampaign() : null) != null) {
            String json = getReferredCampaignJsonAdapter().toJson(attributionResult.getReferredCampaign());
            this.referredDataPref.set(json);
            this.referredDataOrganicPref.set(attributionResult.isOrganic());
            if (this.referredDataForAnalyticsPref.mo23850isSet()) {
                return;
            }
            this.referredDataForAnalyticsPref.set(json);
            resetReferredAnalytics();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IntentKey toNextScreen(AttributionResult attributionResult) {
        if (attributionResult.getSilence()) {
            return null;
        }
        if (this.hasEverLoggedInPref.get() && !attributionResult.getReferralType().getValidPostLogin()) {
            clearPersistedData();
            return null;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[attributionResult.getReferralType().ordinal()]) {
            case 1:
            case 2:
                ReferredCampaign referredCampaign = attributionResult.getReferredCampaign();
                ReferralLandingSdui referral_landing_sdui = referredCampaign != null ? referredCampaign.getReferral_landing_sdui() : null;
                if (referral_landing_sdui != null) {
                    return new OnboardingTakeoverIntentKey(referral_landing_sdui);
                }
                return null;
            case 3:
                BranchLinkAttributionData attributionData = attributionResult.getAttributionData();
                return new WelcomeRhyKey(attributionData != null ? attributionData.getReferralCode() : null);
            case 4:
                BranchLinkAttributionData attributionData2 = attributionResult.getAttributionData();
                return new WelcomeCreditCardKey(attributionData2 != null ? attributionData2.getReferralCode() : null);
            case 5:
                BranchLinkAttributionData attributionData3 = attributionResult.getAttributionData();
                if ((attributionData3 != null ? attributionData3.getReferralCode() : null) != null) {
                    return new JointAccountOnboardingSecondaryIntroShim(attributionResult.getAttributionData().getReferralCode());
                }
                return null;
            case 6:
                BranchLinkAttributionData attributionData4 = attributionResult.getAttributionData();
                if ((attributionData4 != null ? attributionData4.getReferralCode() : null) == null || attributionResult.getAttributionData().getExperiment() == null) {
                    return null;
                }
                return new CryptoReferralsDeeplinkIntentKey(attributionResult.getAttributionData().getExperiment(), attributionResult.getAttributionData().getReferralCode());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BranchLinkAttributionData extractAttributionData(JSONObject referringParams) {
        String string2;
        JSONObject jSONObjectOptJSONObject = referringParams.optJSONObject(REFERRED_OBJECT_KEY);
        ReferredCampaign referredCampaignFromJson = (jSONObjectOptJSONObject == null || (string2 = jSONObjectOptJSONObject.toString()) == null) ? null : getReferredCampaignJsonAdapter().fromJson(string2);
        return new BranchLinkAttributionData(referredCampaignFromJson != null ? referredCampaignFromJson.getReferral_code() : null, referredCampaignFromJson != null ? referredCampaignFromJson.getReferral_type() : null, referredCampaignFromJson != null ? referredCampaignFromJson.getExperiment() : null);
    }

    /* compiled from: BranchAttributionManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.referral.BranchAttributionManager$completeAttribution$1", m3645f = "BranchAttributionManager.kt", m3646l = {EnumC7081g.f2779x59907a3d}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.referral.BranchAttributionManager$completeAttribution$1 */
    static final class C361471 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C361471(Continuation<? super C361471> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BranchAttributionManager.this.new C361471(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C361471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    String str = BranchAttributionManager.this.referredDataPref.get();
                    if (str == null) {
                        str = "";
                    }
                    ReferredCampaign referredCampaign = (ReferredCampaign) BranchAttributionManager.this.getReferredCampaignJsonAdapter().fromJson(str);
                    if (referredCampaign != null) {
                        EstablishReferralRequest establishReferralRequest = new EstablishReferralRequest(referredCampaign.getReferral_code(), referredCampaign.getCampaign(), referredCampaign.getExperiment(), referredCampaign.getRhMeta(), BranchAttributionManager.this.installation.mo2745id());
                        ReferralApi referralApi = BranchAttributionManager.this.referralApi;
                        this.label = 1;
                        if (referralApi.establishReferral(establishReferralRequest, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e) {
                TimberLogger.INSTANCE.mo1682e(e, "Failed to establish referral", new Object[0]);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.referral.AttributionManager
    public void completeAttribution() {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C361471(null), 3, null);
        clearPersistedData();
    }

    @Override // com.robinhood.referral.AttributionManager
    public void clearPersistedData() {
        this.referredDataPref.delete();
    }
}

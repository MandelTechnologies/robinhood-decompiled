package com.robinhood.android.onboarding.p205ui.postsignup;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.widget.Toast;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.home.contracts.MainActivityIntentKey;
import com.robinhood.android.maxonboarding.OnboardingProgress;
import com.robinhood.android.maxonboarding.PostSignUpLastKnownContextManager;
import com.robinhood.android.maxonboarding.ToolbarExt2;
import com.robinhood.android.navigation.DeepLinkOrigin;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.ReturnedData;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.onboarding.C22739R;
import com.robinhood.android.onboarding.contracts.OnboardingUpsellIntentKey;
import com.robinhood.android.onboarding.contracts.PostSignUpIntentKey;
import com.robinhood.android.onboarding.p205ui.OnboardingMonochromeOverlay;
import com.robinhood.android.onboarding.p205ui.postsignup.PostSignUpActivity;
import com.robinhood.android.onboarding.p205ui.postsignup.event.PostSignUpDestination;
import com.robinhood.android.onboarding.p205ui.postsignup.event.PostSignUpEvent;
import com.robinhood.android.onboarding.p205ui.postsignup.fund.PostSignUpFundAccountDetailFragment;
import com.robinhood.android.onboarding.p205ui.postsignup.fund.PostSignUpFundAccountSplashFragment;
import com.robinhood.android.onboarding.p205ui.postsignup.loading.PostSignUpLoadingFragment;
import com.robinhood.android.onboarding.p205ui.postsignup.thanks.PostSignUpThanksFragment;
import com.robinhood.android.referral.contracts.RewardOfferIntentKey;
import com.robinhood.android.transfers.contracts.AchTransferIntentKey;
import com.robinhood.android.transfers.contracts.CreateIavRelationshipIntentKey;
import com.robinhood.android.transfers.contracts.UkQueuedDeposit;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.ScopedSingle;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.documents.contracts.DocUploadAssistant;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import com.robinhood.shared.transfers.contracts.context.IavSource;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Single;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PostSignUpActivity.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 O2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002NOB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\u0012\u0010.\u001a\u00020)2\b\u0010/\u001a\u0004\u0018\u000100H\u0014J\b\u00101\u001a\u00020)H\u0014J\u0012\u00102\u001a\u00020)2\b\u00103\u001a\u0004\u0018\u00010\u0015H\u0016J\"\u00104\u001a\u00020)2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002062\b\u00108\u001a\u0004\u0018\u000109H\u0014J\u0010\u0010:\u001a\u00020)2\u0006\u0010;\u001a\u00020<H\u0016J\u0010\u0010=\u001a\u00020)2\u0006\u0010>\u001a\u00020-H\u0002J \u0010?\u001a\u00020)*\u00020#2\b\u0010;\u001a\u0004\u0018\u00010<2\b\u0010>\u001a\u0004\u0018\u00010-H\u0002J\b\u0010@\u001a\u00020)H\u0002J\b\u0010A\u001a\u00020)H\u0002J\u0010\u0010B\u001a\u00020)2\u0006\u0010C\u001a\u00020DH\u0002J\b\u0010E\u001a\u00020)H\u0002J\b\u0010F\u001a\u00020)H\u0002J\b\u0010G\u001a\u00020)H\u0002J\b\u0010L\u001a\u00020MH\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR+\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010H\u001a\u00020I8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006P"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/onboarding/ui/postsignup/loading/PostSignUpLoadingFragment$Callbacks;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$Receiver;", "<init>", "()V", "duxo", "Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpDuxo;", "getDuxo", "()Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "<set-?>", "Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpState;", "state", "getState", "()Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpState;", "setState", "(Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpState;)V", "state$delegate", "Lkotlin/properties/ReadWriteProperty;", "Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpContext;", "signUpContext", "getSignUpContext", "()Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpContext;", "setSignUpContext", "(Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpContext;)V", "signUpContext$delegate", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "previousDestination", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onInitialLoadingFinished", "context", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "onEvent", "event", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent;", "processDestination", "destination", "logPostSignUpNavigation", "showDocUploadFlow", "showPostFundingUpsell", "showRecurringDepositFlow", "recommendedAmount", "Lcom/robinhood/models/util/Money;", "showVerifyIdentity", "showWatchlist", "showRhyTab", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "shouldPromptForLockscreen", "", "RequestCode", "Companion", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class PostSignUpActivity extends BaseActivity implements PostSignUpLoadingFragment.Callbacks, PostSignUpEvent.Receiver {
    private static final String ONBOARDING_TRANSFER_COMPLETE_GOLD_NATIVE_FUNDING_SOURCE = "onboarding_transfer_complete";
    private static final String ONBOARDING_VERIFY_IDENTITY_DEEPLINK = "robinhood://onboarding_verify_identity?account_type=brokerage";
    public static final int REQUEST_CODE_DO_NOTHING = 1000;
    public AnalyticsLogger analytics;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private PostSignUpDestination previousDestination;

    /* renamed from: signUpContext$delegate, reason: from kotlin metadata */
    private final Interfaces3 signUpContext;

    /* renamed from: state$delegate, reason: from kotlin metadata */
    private final Interfaces3 state;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(PostSignUpActivity.class, "state", "getState()Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpState;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(PostSignUpActivity.class, "signUpContext", "getSignUpContext()Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpContext;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PostSignUpActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RequestCode.values().length];
            try {
                iArr[RequestCode.FUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RequestCode.REFERRAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RequestCode.DOC_UPLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RequestCode.POST_FUNDING_UPSELL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RequestCode.RECURRING_AUTOMATIC_DEPOSIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean shouldPromptForLockscreen() {
        return false;
    }

    public PostSignUpActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.duxo = DuxosKt.duxo(this, PostSignUpDuxo.class);
        Interfaces interfacesSavedParcelable = BindSavedState2.savedParcelable(this, new PostSignUpState(null, null, false, false, false, false, null, null, false, false, false, 2047, null));
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.state = (Interfaces3) interfacesSavedParcelable.provideDelegate(this, kPropertyArr[0]);
        this.signUpContext = (Interfaces3) BindSavedState2.savedParcelable(this, new PostSignUpContext(false, null, 3, null)).provideDelegate(this, kPropertyArr[1]);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PostSignUpActivity.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpActivity$RequestCode;", "", "<init>", "(Ljava/lang/String;I)V", "FUND", "REFERRAL", "DOC_UPLOAD", "POST_FUNDING_UPSELL", "RECURRING_AUTOMATIC_DEPOSIT", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class RequestCode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RequestCode[] $VALUES;
        public static final RequestCode FUND = new RequestCode("FUND", 0);
        public static final RequestCode REFERRAL = new RequestCode("REFERRAL", 1);
        public static final RequestCode DOC_UPLOAD = new RequestCode("DOC_UPLOAD", 2);
        public static final RequestCode POST_FUNDING_UPSELL = new RequestCode("POST_FUNDING_UPSELL", 3);
        public static final RequestCode RECURRING_AUTOMATIC_DEPOSIT = new RequestCode("RECURRING_AUTOMATIC_DEPOSIT", 4);

        private static final /* synthetic */ RequestCode[] $values() {
            return new RequestCode[]{FUND, REFERRAL, DOC_UPLOAD, POST_FUNDING_UPSELL, RECURRING_AUTOMATIC_DEPOSIT};
        }

        public static EnumEntries<RequestCode> getEntries() {
            return $ENTRIES;
        }

        private RequestCode(String str, int i) {
        }

        static {
            RequestCode[] requestCodeArr$values = $values();
            $VALUES = requestCodeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(requestCodeArr$values);
        }

        public static RequestCode valueOf(String str) {
            return (RequestCode) Enum.valueOf(RequestCode.class, str);
        }

        public static RequestCode[] values() {
            return (RequestCode[]) $VALUES.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostSignUpDuxo getDuxo() {
        return (PostSignUpDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostSignUpState getState() {
        return (PostSignUpState) this.state.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(PostSignUpState postSignUpState) {
        this.state.setValue(this, $$delegatedProperties[0], postSignUpState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostSignUpContext getSignUpContext() {
        return (PostSignUpContext) this.signUpContext.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSignUpContext(PostSignUpContext postSignUpContext) {
        this.signUpContext.setValue(this, $$delegatedProperties[1], postSignUpContext);
    }

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
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

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        ToolbarExt2.configureMaxActivity(toolbar, OnboardingProgress.FUND_ACCOUNT_INITIAL, !((PostSignUpIntentKey) INSTANCE.getExtras((Activity) this)).getIsRhy());
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().getDecorView().setSystemUiVisibility(1280);
        super.onCreate(savedInstanceState);
        Companion companion = INSTANCE;
        if (((PostSignUpIntentKey) companion.getExtras((Activity) this)).getTheme() == ColorTheme.DARK) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), DayNightOverlay.NIGHT, null, 2, null);
        }
        getDuxo().setRhy(((PostSignUpIntentKey) companion.getExtras((Activity) this)).getIsRhy());
        getDuxo().setSignUpContext(getSignUpContext());
        PostSignUpLastKnownContextManager.INSTANCE.setAccountType(((PostSignUpIntentKey) companion.getExtras((Activity) this)).getTransferAccountType());
        BaseActivity.collectDuxoState$default(this, null, new C228391(null), 1, null);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, PostSignUpLoadingFragment.INSTANCE.newInstance((Parcelable) new PostSignUpLoadingFragment.Args(((PostSignUpIntentKey) companion.getExtras((Activity) this)).getIsRhy())));
        }
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), OnboardingMonochromeOverlay.INSTANCE, null, 2, null);
        getDuxo().loadNextScreen(getState().getHasExitedIavRelationship());
    }

    /* compiled from: PostSignUpActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.PostSignUpActivity$onCreate$1", m3645f = "PostSignUpActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.postsignup.PostSignUpActivity$onCreate$1 */
    static final class C228391 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C228391(Continuation<? super C228391> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PostSignUpActivity.this.new C228391(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C228391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PostSignUpActivity.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.PostSignUpActivity$onCreate$1$1", m3645f = "PostSignUpActivity.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.onboarding.ui.postsignup.PostSignUpActivity$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FlowCollector<? super PostSignUpState>, Continuation<? super Unit>, Object> {
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FlowCollector<? super PostSignUpState> flowCollector, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                IdlingResourceCounters2.setBusy(IdlingResourceType.POST_SIGN_UP_ACCOUNT_LOADED, true);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowOnCompletion = FlowKt.onCompletion(FlowKt.onStart(PostSignUpActivity.this.getDuxo().getStateFlow(), new AnonymousClass1(null)), new AnonymousClass2(null));
                final PostSignUpActivity postSignUpActivity = PostSignUpActivity.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.onboarding.ui.postsignup.PostSignUpActivity.onCreate.1.3
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((PostSignUpState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(PostSignUpState postSignUpState, Continuation<? super Unit> continuation) {
                        postSignUpActivity.setState(postSignUpState);
                        if (postSignUpActivity.getState().getHasApplication() || ((PostSignUpIntentKey) PostSignUpActivity.INSTANCE.getExtras((Activity) postSignUpActivity)).getIsRhy()) {
                            IdlingResourceCounters2.setBusy(IdlingResourceType.POST_SIGN_UP_ACCOUNT_LOADED, false);
                        }
                        PostSignUpDestination destination = postSignUpState.getDestination();
                        if (destination != null) {
                            PostSignUpActivity postSignUpActivity2 = postSignUpActivity;
                            if (!Intrinsics.areEqual(postSignUpActivity2.previousDestination, destination) || (postSignUpActivity2.getState().getShouldPromptForFundingAgain() && Intrinsics.areEqual(postSignUpActivity2.previousDestination, PostSignUpDestination.CreateIavRelationship.INSTANCE))) {
                                postSignUpActivity2.previousDestination = destination;
                                postSignUpActivity2.processDestination(destination);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowOnCompletion.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: PostSignUpActivity.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpState;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.PostSignUpActivity$onCreate$1$2", m3645f = "PostSignUpActivity.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.onboarding.ui.postsignup.PostSignUpActivity$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function3<FlowCollector<? super PostSignUpState>, Throwable, Continuation<? super Unit>, Object> {
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super PostSignUpState> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                return new AnonymousClass2(continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                IdlingResourceCounters2.setBusy(IdlingResourceType.POST_SIGN_UP_ACCOUNT_LOADED, false);
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        getDuxo().signUpActivityDestroyed();
    }

    @Override // com.robinhood.android.onboarding.ui.postsignup.loading.PostSignUpLoadingFragment.Callbacks
    public void onInitialLoadingFinished(PostSignUpContext context) {
        if (context != null) {
            new MutablePropertyReference0Impl(this) { // from class: com.robinhood.android.onboarding.ui.postsignup.PostSignUpActivity.onInitialLoadingFinished.2
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
                public Object get() {
                    return ((PostSignUpActivity) this.receiver).getSignUpContext();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
                public void set(Object obj) {
                    ((PostSignUpActivity) this.receiver).setSignUpContext((PostSignUpContext) obj);
                }
            }.set(context);
        }
        getDuxo().setSignUpContext(getSignUpContext());
        if (((PostSignUpIntentKey) INSTANCE.getExtras((Activity) this)).getShowThanksScreen()) {
            onEvent(new PostSignUpEvent.DisplayThanks(false));
        } else {
            onEvent(new PostSignUpEvent.LoadingComplete(false));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        int i = WhenMappings.$EnumSwitchMapping$0[RequestCode.values()[requestCode].ordinal()];
        if (i == 1) {
            if (resultCode == -1) {
                BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C228371(data, this, null), 3, null);
                return;
            } else {
                if (getState().getShouldPromptForFundingAgain()) {
                    return;
                }
                getDuxo().hasExitedIavRelationship();
                getDuxo().loadNextScreen(true);
                return;
            }
        }
        if (i == 2) {
            onEvent(PostSignUpEvent.ReferralComplete.INSTANCE);
            return;
        }
        if (i == 3) {
            onEvent(PostSignUpEvent.DocUploadComplete.INSTANCE);
            return;
        }
        if (i != 4) {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            onEvent(PostSignUpEvent.RecurringAutomaticDepositComplete.INSTANCE);
        } else if (resultCode == -1) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.robinhood.android.onboarding.ui.postsignup.PostSignUpActivity.onActivityResult.2
                @Override // java.lang.Runnable
                public final void run() {
                    PostSignUpActivity.this.onEvent(PostSignUpEvent.PostFundUpsellComplete.INSTANCE);
                }
            }, 1000L);
        } else {
            onEvent(PostSignUpEvent.PostFundUpsellCancel.INSTANCE);
        }
    }

    /* compiled from: PostSignUpActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.PostSignUpActivity$onActivityResult$1", m3645f = "PostSignUpActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.postsignup.PostSignUpActivity$onActivityResult$1 */
    static final class C228371 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Intent $data;
        Object L$0;
        int label;
        final /* synthetic */ PostSignUpActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C228371(Intent intent, PostSignUpActivity postSignUpActivity, Continuation<? super C228371> continuation) {
            super(2, continuation);
            this.$data = intent;
            this.this$0 = postSignUpActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C228371(this.$data, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C228371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            final Money money;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Intent intent = this.$data;
                ReturnedData.AchTransferAmount achTransferAmount = intent != null ? (ReturnedData.AchTransferAmount) intent.getParcelableExtra(ReturnedData.EXTRA_RETURNED_DATA) : null;
                if (achTransferAmount == null) {
                    achTransferAmount = null;
                }
                Money amount = achTransferAmount != null ? achTransferAmount.getAmount() : null;
                PostSignUpDuxo duxo = this.this$0.getDuxo();
                this.L$0 = amount;
                this.label = 1;
                if (duxo.refreshLatestDocUpload(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                money = amount;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                money = (Money) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            PostSignUpActivity postSignUpActivity = this.this$0;
            Single<Boolean> singleFirst = postSignUpActivity.getDuxo().hasApprovedAchRelationship().first(boxing.boxBoolean(false));
            Intrinsics.checkNotNullExpressionValue(singleFirst, "first(...)");
            ScopedSingle scopedSingleBind = postSignUpActivity.bind(SinglesAndroid.observeOnMainThread(singleFirst), LifecycleEvent.ON_DESTROY);
            final PostSignUpActivity postSignUpActivity2 = this.this$0;
            scopedSingleBind.subscribeKotlin(new Function1() { // from class: com.robinhood.android.onboarding.ui.postsignup.PostSignUpActivity$onActivityResult$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return PostSignUpActivity.C228371.invokeSuspend$lambda$0(postSignUpActivity2, money, (Boolean) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(PostSignUpActivity postSignUpActivity, Money money, Boolean bool) {
            Intrinsics.checkNotNull(bool);
            postSignUpActivity.onEvent(new PostSignUpEvent.FundingComplete(bool.booleanValue(), money));
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.onboarding.ui.postsignup.event.PostSignUpEvent.Receiver
    public void onEvent(PostSignUpEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        getDuxo().handleEvent(event);
        logPostSignUpNavigation(getAnalytics(), event, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processDestination(PostSignUpDestination destination) {
        PostSignUpActivity postSignUpActivity = this;
        if (destination instanceof PostSignUpDestination.PreFundDetails) {
            postSignUpActivity.replaceFragment(PostSignUpFundAccountDetailFragment.INSTANCE.newInstance());
        } else if (destination instanceof PostSignUpDestination.PreFundSplash) {
            if (((PostSignUpDestination.PreFundSplash) destination).getShowTransition()) {
                postSignUpActivity.replaceFragmentWithoutBackStack(PostSignUpFundAccountSplashFragment.INSTANCE.newInstance());
            } else {
                postSignUpActivity.replaceFragmentWithoutAnimationAndBackStack(PostSignUpFundAccountSplashFragment.INSTANCE.newInstance());
            }
        } else {
            if (destination instanceof PostSignUpDestination.CreateIavRelationship) {
                postSignUpActivity.getDuxo().showedCreateIav();
                Navigator navigator = postSignUpActivity.getNavigator();
                IavSource iavSource = IavSource.ONBOARDING;
                Companion companion = INSTANCE;
                Navigator.DefaultImpls.startActivityForResult$default(navigator, (Activity) postSignUpActivity, (IntentKey) new CreateIavRelationshipIntentKey(iavSource, null, null, ((PostSignUpIntentKey) companion.getExtras((Activity) postSignUpActivity)).getTransferAccountType(), !((PostSignUpIntentKey) companion.getExtras((Activity) postSignUpActivity)).getIsRhy(), true, null, ((PostSignUpIntentKey) companion.getExtras((Activity) postSignUpActivity)).getTheme(), 70, null), RequestCode.FUND.ordinal(), (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
                postSignUpActivity = this;
            } else if (Intrinsics.areEqual(destination, PostSignUpDestination.CreateUkQueuedDeposit.INSTANCE)) {
                postSignUpActivity = this;
                postSignUpActivity.startActivities(new Intent[]{Navigator.DefaultImpls.createIntent$default(getNavigator(), this, MainActivityIntentKey.INSTANCE, null, false, 12, null), Navigator.DefaultImpls.createIntent$default(getNavigator(), postSignUpActivity, new UkQueuedDeposit(Uri.parse(ONBOARDING_VERIFY_IDENTITY_DEEPLINK), true, null, 4, null), null, false, 12, null)});
                postSignUpActivity.finish();
            } else {
                postSignUpActivity = this;
                if (Intrinsics.areEqual(destination, PostSignUpDestination.Referral.INSTANCE)) {
                    Navigator.DefaultImpls.startActivityForResult$default(postSignUpActivity.getNavigator(), (Activity) postSignUpActivity, (IntentKey) new RewardOfferIntentKey.Platform("sign_up", ((PostSignUpIntentKey) INSTANCE.getExtras((Activity) postSignUpActivity)).getTheme(), null, !((PostSignUpIntentKey) r3.getExtras((Activity) postSignUpActivity)).getIsRhy(), false, "sign_up", 16, null), RequestCode.REFERRAL.ordinal(), (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
                } else if (destination instanceof PostSignUpDestination.DocUpload) {
                    postSignUpActivity.showDocUploadFlow();
                } else if (Intrinsics.areEqual(destination, PostSignUpDestination.PostFundingUpsell.INSTANCE)) {
                    postSignUpActivity.showPostFundingUpsell();
                } else if (destination instanceof PostSignUpDestination.Thanks) {
                    PostSignUpThanksFragment.Args args = new PostSignUpThanksFragment.Args(((PostSignUpIntentKey) INSTANCE.getExtras((Activity) postSignUpActivity)).getTheme() != ColorTheme.DEFAULT);
                    if (((PostSignUpDestination.Thanks) destination).getShowTransition()) {
                        postSignUpActivity.replaceFragment(PostSignUpThanksFragment.INSTANCE.newInstance((Parcelable) args));
                    } else {
                        postSignUpActivity.replaceFragmentWithoutAnimation(PostSignUpThanksFragment.INSTANCE.newInstance((Parcelable) args));
                    }
                } else if (Intrinsics.areEqual(destination, PostSignUpDestination.DepositQueuedMessage.INSTANCE)) {
                    Toast.makeText(postSignUpActivity, C22739R.string.post_sign_up_fund_error_already_funded, 0).show();
                    postSignUpActivity.onEvent(PostSignUpEvent.DepositQueuedMessageShown.INSTANCE);
                } else if (destination instanceof PostSignUpDestination.RecurringAutomaticDeposit) {
                    postSignUpActivity.showRecurringDepositFlow(((PostSignUpDestination.RecurringAutomaticDeposit) destination).getRecommendedAmount());
                } else if (Intrinsics.areEqual(destination, PostSignUpDestination.VerifyIdentity.INSTANCE)) {
                    postSignUpActivity.showVerifyIdentity();
                } else if (Intrinsics.areEqual(destination, PostSignUpDestination.Watchlist.INSTANCE)) {
                    postSignUpActivity.showWatchlist();
                } else {
                    if (!Intrinsics.areEqual(destination, PostSignUpDestination.RhyTab.INSTANCE)) {
                        if (!(destination instanceof PostSignUpDestination.NativeFundingUpsell) && !(destination instanceof PostSignUpDestination.FirstDeposit) && !(destination instanceof PostSignUpDestination.HelmDrivenSubFlow)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("Helm destinations should not be processed here");
                    }
                    postSignUpActivity.showRhyTab();
                }
            }
        }
        postSignUpActivity.getDuxo().processedDestination();
        postSignUpActivity.logPostSignUpNavigation(postSignUpActivity.getAnalytics(), null, destination);
    }

    private final void logPostSignUpNavigation(AnalyticsLogger analyticsLogger, PostSignUpEvent postSignUpEvent, PostSignUpDestination postSignUpDestination) {
        String str;
        AnalyticsLogger analyticsLogger2;
        if (((PostSignUpIntentKey) INSTANCE.getExtras((Activity) this)).getIsRhy()) {
            str = AnalyticsStrings.USER_ACTION_RHY_POST_SIGN_UP_NAVIGATION;
        } else {
            str = AnalyticsStrings.USER_ACTION_POST_SIGN_UP_NAVIGATION;
        }
        String str2 = str;
        if (postSignUpEvent != null) {
            analyticsLogger2 = analyticsLogger;
            AnalyticsLogger.DefaultImpls.logUserAction$default(analyticsLogger2, str2, null, null, postSignUpEvent.getAnalyticsString(), 6, null);
        } else {
            analyticsLogger2 = analyticsLogger;
        }
        if (postSignUpDestination != null) {
            AnalyticsLogger.DefaultImpls.logUserAction$default(analyticsLogger2, str2, null, postSignUpDestination.getAnalyticsString(), null, 10, null);
        }
    }

    private final void showDocUploadFlow() {
        getDuxo().setIsDocUploadFlowVisited();
        Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Activity) this, (IntentKey) new DocUploadAssistant(getState().getLatestDocumentRequests(), !((PostSignUpIntentKey) r0.getExtras((Activity) this)).getIsRhy(), true, false, ((PostSignUpIntentKey) INSTANCE.getExtras((Activity) this)).getTheme(), 8, null), RequestCode.DOC_UPLOAD.ordinal(), (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
    }

    private final void showPostFundingUpsell() {
        Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Activity) this, (IntentKey) new OnboardingUpsellIntentKey(OnboardingUpsellIntentKey.ONBOARDING_UPSELL, null, true, false, ((PostSignUpIntentKey) INSTANCE.getExtras((Activity) this)).getTheme(), 10, null), RequestCode.POST_FUNDING_UPSELL.ordinal(), (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
    }

    private final void showRecurringDepositFlow(Money recommendedAmount) {
        Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Activity) this, (IntentKey) new AchTransferIntentKey(new TransferContext.RecurringDepositFromOnboarding(recommendedAmount.getDecimalValue()), true, !((PostSignUpIntentKey) r11.getExtras((Activity) this)).getIsRhy(), false, ((PostSignUpIntentKey) INSTANCE.getExtras((Activity) this)).getTheme(), 8, null), RequestCode.RECURRING_AUTOMATIC_DEPOSIT.ordinal(), (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
    }

    private final void showVerifyIdentity() {
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(Navigator.DefaultImpls.createIntent$default(getNavigator(), this, MainActivityIntentKey.INSTANCE, null, false, 12, null));
        spreadBuilder.addSpread(Navigator.DefaultImpls.resolveDeepLink$default(getNavigator(), this, Uri.parse(ONBOARDING_VERIFY_IDENTITY_DEEPLINK), null, DeepLinkOrigin.Internal.INSTANCE, false, 20, null));
        startActivities((Intent[]) spreadBuilder.toArray(new Intent[spreadBuilder.size()]));
        finish();
    }

    private final void showWatchlist() {
        getDuxo().onFinishFlow();
        Navigator.DefaultImpls.startActivity$default(getNavigator(), this, MainActivityIntentKey.INSTANCE, null, false, null, null, 60, null);
        finish();
    }

    private final void showRhyTab() {
        getDuxo().onFinishFlow();
        Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new TabLinkIntentKey.McDuckling(getScreenName(), false, null, 6, null), null, false, null, null, 60, null);
        finish();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return ((PostSignUpIntentKey) INSTANCE.getExtras((Activity) this)).getIsRhy() ? "RHY" : "RHF";
    }

    /* compiled from: PostSignUpActivity.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpActivity;", "Lcom/robinhood/android/onboarding/contracts/PostSignUpIntentKey;", "<init>", "()V", "getIntentWithExtras", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "extras", "REQUEST_CODE_DO_NOTHING", "", "ONBOARDING_VERIFY_IDENTITY_DEEPLINK", "", "ONBOARDING_TRANSFER_COMPLETE_GOLD_NATIVE_FUNDING_SOURCE", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<PostSignUpActivity, PostSignUpIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public PostSignUpIntentKey getExtras(PostSignUpActivity postSignUpActivity) {
            return (PostSignUpIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, postSignUpActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, PostSignUpIntentKey postSignUpIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, postSignUpIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, PostSignUpIntentKey extras) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(extras, "extras");
            Intent flags = IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, extras).setFlags(268468224);
            Intrinsics.checkNotNullExpressionValue(flags, "setFlags(...)");
            return flags;
        }
    }
}

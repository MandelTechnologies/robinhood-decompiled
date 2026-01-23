package com.robinhood.android.onboarding.p205ui.postsignup.helm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.WindowInsets;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.home.contracts.MainActivityIntentKey;
import com.robinhood.android.maxonboarding.OnboardingProgress;
import com.robinhood.android.maxonboarding.ToolbarExt2;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.ReturnedData;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.onboarding.contracts.GoldNativeFundingUpsellIntentKey;
import com.robinhood.android.onboarding.contracts.HelmIntentKey;
import com.robinhood.android.onboarding.contracts.OnboardingUpsellIntentKey;
import com.robinhood.android.onboarding.p205ui.OnboardingMonochromeOverlay;
import com.robinhood.android.onboarding.p205ui.postsignup.PostSignUpContext;
import com.robinhood.android.onboarding.p205ui.postsignup.event.PostSignUpDestination;
import com.robinhood.android.onboarding.p205ui.postsignup.event.PostSignUpEvent;
import com.robinhood.android.onboarding.p205ui.postsignup.fund.PostSignUpFundAccountDetailFragment;
import com.robinhood.android.onboarding.p205ui.postsignup.fund.PostSignUpFundAccountSplashFragment;
import com.robinhood.android.onboarding.p205ui.postsignup.helm.HelmDuxoEvent;
import com.robinhood.android.onboarding.p205ui.postsignup.loading.PostSignUpLoadingFragment;
import com.robinhood.android.onboarding.p205ui.postsignup.thanks.PostSignUpThanksFragment;
import com.robinhood.android.referral.contracts.RewardOfferIntentKey;
import com.robinhood.android.transfers.contracts.AchTransferIntentKey;
import com.robinhood.android.transfers.contracts.CreateIavRelationshipIntentKey;
import com.robinhood.android.transfers.contracts.UkQueuedDeposit;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.documents.contracts.DocUploadAssistant;
import com.robinhood.shared.documents.contracts.PersonaSplashIntentKey;
import com.robinhood.shared.documents.lib.docupload.PersonaFlowStyle;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import com.robinhood.shared.transfers.contracts.context.IavSource;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.logging.TimberLogger;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: HelmActivity.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 =2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002<=B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0012\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\"\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020*H\u0002J\u0016\u0010+\u001a\u00020\u00162\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-H\u0002J\b\u0010/\u001a\u00020\u0016H\u0002J\u0010\u00100\u001a\u00020\u00162\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020\u0016H\u0002J\b\u00104\u001a\u00020\u0016H\u0002J\b\u00105\u001a\u00020\u0016H\u0002J\b\u0010:\u001a\u00020;H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR+\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u00106\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006>"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/onboarding/ui/postsignup/loading/PostSignUpLoadingFragment$Callbacks;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$Receiver;", "<init>", "()V", "duxo", "Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmDuxo;", "getDuxo", "()Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "<set-?>", "Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmState;", "state", "getState", "()Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmState;", "setState", "(Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmState;)V", "state$delegate", "Lkotlin/properties/ReadWriteProperty;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onInitialLoadingFinished", "context", "Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpContext;", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "onEvent", "event", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent;", "processDestination", "destination", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination;", "showDocUploadFlow", "requests", "", "Lcom/robinhood/models/ui/DocumentRequest;", "showPostFundingUpsell", "showRecurringDepositFlow", "recommendedAmount", "Lcom/robinhood/models/util/Money;", "showVerifyIdentity", "showWatchlist", "showRhyTab", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "shouldPromptForLockscreen", "", "RequestCode", "Companion", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class HelmActivity extends BaseActivity implements PostSignUpLoadingFragment.Callbacks, PostSignUpEvent.Receiver {
    private static final String GOLD_NATIVE_FUNDING_UPSELL_BANK_LINK_SOURCE = "onboarding_plaid_connection";

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: state$delegate, reason: from kotlin metadata */
    private final Interfaces3 state;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(HelmActivity.class, "state", "getState()Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmState;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: HelmActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RequestCode.values().length];
            try {
                iArr[RequestCode.BANK_LINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RequestCode.FUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RequestCode.REFERRAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RequestCode.DOC_UPLOAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RequestCode.POST_FUNDING_UPSELL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RequestCode.RECURRING_AUTOMATIC_DEPOSIT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[RequestCode.GOLD_NATIVE_FUNDING_UPSELL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[RequestCode.UK_QUEUED_DEPOSIT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[RequestCode.UK_VERIFY_IDENTITY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean shouldPromptForLockscreen() {
        return false;
    }

    public HelmActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.duxo = DuxosKt.duxo(this, HelmDuxo.class);
        this.state = (Interfaces3) BindSavedState2.savedParcelable(this, new HelmState(false, null, null, 7, null)).provideDelegate(this, $$delegatedProperties[0]);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HelmActivity.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmActivity$RequestCode;", "", "<init>", "(Ljava/lang/String;I)V", "BANK_LINK", "FUND", "REFERRAL", "DOC_UPLOAD", "POST_FUNDING_UPSELL", "RECURRING_AUTOMATIC_DEPOSIT", "GOLD_NATIVE_FUNDING_UPSELL", "UK_QUEUED_DEPOSIT", "UK_VERIFY_IDENTITY", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class RequestCode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RequestCode[] $VALUES;
        public static final RequestCode BANK_LINK = new RequestCode("BANK_LINK", 0);
        public static final RequestCode FUND = new RequestCode("FUND", 1);
        public static final RequestCode REFERRAL = new RequestCode("REFERRAL", 2);
        public static final RequestCode DOC_UPLOAD = new RequestCode("DOC_UPLOAD", 3);
        public static final RequestCode POST_FUNDING_UPSELL = new RequestCode("POST_FUNDING_UPSELL", 4);
        public static final RequestCode RECURRING_AUTOMATIC_DEPOSIT = new RequestCode("RECURRING_AUTOMATIC_DEPOSIT", 5);
        public static final RequestCode GOLD_NATIVE_FUNDING_UPSELL = new RequestCode("GOLD_NATIVE_FUNDING_UPSELL", 6);
        public static final RequestCode UK_QUEUED_DEPOSIT = new RequestCode("UK_QUEUED_DEPOSIT", 7);
        public static final RequestCode UK_VERIFY_IDENTITY = new RequestCode("UK_VERIFY_IDENTITY", 8);

        private static final /* synthetic */ RequestCode[] $values() {
            return new RequestCode[]{BANK_LINK, FUND, REFERRAL, DOC_UPLOAD, POST_FUNDING_UPSELL, RECURRING_AUTOMATIC_DEPOSIT, GOLD_NATIVE_FUNDING_UPSELL, UK_QUEUED_DEPOSIT, UK_VERIFY_IDENTITY};
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
    public final HelmDuxo getDuxo() {
        return (HelmDuxo) this.duxo.getValue();
    }

    private final HelmState getState() {
        return (HelmState) this.state.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(HelmState helmState) {
        this.state.setValue(this, $$delegatedProperties[0], helmState);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        ToolbarExt2.configureMaxActivity(toolbar, OnboardingProgress.FUND_ACCOUNT_INITIAL, !((HelmIntentKey) INSTANCE.getExtras((Activity) this)).getIsRhy());
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().getDecorView().setSystemUiVisibility(1280);
        super.onCreate(savedInstanceState);
        Companion companion = INSTANCE;
        if (((HelmIntentKey) companion.getExtras((Activity) this)).getTheme() == ColorTheme.DARK) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), DayNightOverlay.NIGHT, null, 2, null);
        }
        BaseActivity.collectDuxoState$default(this, null, new C228791(null), 1, null);
        BaseActivity.collectDuxoState$default(this, null, new C228802(null), 1, null);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, PostSignUpLoadingFragment.INSTANCE.newInstance((Parcelable) new PostSignUpLoadingFragment.Args(((HelmIntentKey) companion.getExtras((Activity) this)).getIsRhy())));
        }
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.robinhood.android.onboarding.ui.postsignup.helm.HelmActivity.onCreate.3
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View v, WindowInsets insets) {
                    Intrinsics.checkNotNullParameter(v, "v");
                    Intrinsics.checkNotNullParameter(insets, "insets");
                    ViewsKt.setMarginTop(v, insets.getSystemWindowInsetTop());
                    return insets.consumeSystemWindowInsets();
                }
            });
        }
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), OnboardingMonochromeOverlay.INSTANCE, null, 2, null);
    }

    /* compiled from: HelmActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.helm.HelmActivity$onCreate$1", m3645f = "HelmActivity.kt", m3646l = {99}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.postsignup.helm.HelmActivity$onCreate$1 */
    static final class C228791 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C228791(Continuation<? super C228791> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HelmActivity.this.new C228791(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C228791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: HelmActivity.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.helm.HelmActivity$onCreate$1$1", m3645f = "HelmActivity.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.onboarding.ui.postsignup.helm.HelmActivity$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FlowCollector<? super HelmState>, Continuation<? super Unit>, Object> {
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FlowCollector<? super HelmState> flowCollector, Continuation<? super Unit> continuation) {
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
                Flow flowOnCompletion = FlowKt.onCompletion(FlowKt.onStart(HelmActivity.this.getDuxo().getStateFlow(), new AnonymousClass1(null)), new AnonymousClass2(null));
                final HelmActivity helmActivity = HelmActivity.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.onboarding.ui.postsignup.helm.HelmActivity.onCreate.1.3
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((HelmState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(HelmState helmState, Continuation<? super Unit> continuation) {
                        helmActivity.setState(helmState);
                        IdlingResourceCounters2.setBusy(IdlingResourceType.POST_SIGN_UP_ACCOUNT_LOADED, false);
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

        /* compiled from: HelmActivity.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmState;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.helm.HelmActivity$onCreate$1$2", m3645f = "HelmActivity.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.onboarding.ui.postsignup.helm.HelmActivity$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function3<FlowCollector<? super HelmState>, Throwable, Continuation<? super Unit>, Object> {
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super HelmState> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
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

    /* compiled from: HelmActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.helm.HelmActivity$onCreate$2", m3645f = "HelmActivity.kt", m3646l = {106}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.postsignup.helm.HelmActivity$onCreate$2 */
    static final class C228802 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C228802(Continuation<? super C228802> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HelmActivity.this.new C228802(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C228802) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(HelmActivity.this.getDuxo().getEventFlow());
                final HelmActivity helmActivity = HelmActivity.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.onboarding.ui.postsignup.helm.HelmActivity.onCreate.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<HelmDuxoEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<HelmDuxoEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<HelmDuxoEvent> eventConsumerInvoke;
                        EventConsumer<HelmDuxoEvent> eventConsumerInvoke2;
                        EventConsumer<HelmDuxoEvent> eventConsumerInvoke3;
                        final HelmActivity helmActivity2 = helmActivity;
                        if ((event.getData() instanceof HelmDuxoEvent.ProcessDestination) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.onboarding.ui.postsignup.helm.HelmActivity$onCreate$2$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m16855invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m16855invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    helmActivity2.processDestination(((HelmDuxoEvent.ProcessDestination) event.getData()).getDestination());
                                }
                            });
                        }
                        final HelmActivity helmActivity3 = helmActivity;
                        if ((event.getData() instanceof HelmDuxoEvent.LaunchUi) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.onboarding.ui.postsignup.helm.HelmActivity$onCreate$2$1$emit$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m16856invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m16856invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    HelmDuxoEvent.LaunchUi launchUi = (HelmDuxoEvent.LaunchUi) event.getData();
                                    HelmActivity helmActivity4 = helmActivity3;
                                    helmActivity4.replaceFragment(Navigator.DefaultImpls.createFragment$default(helmActivity4.getNavigator(), launchUi.getFragmentKey(), null, 2, null));
                                }
                            });
                        }
                        final HelmActivity helmActivity4 = helmActivity;
                        if ((event.getData() instanceof HelmDuxoEvent.EndFlow) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.onboarding.ui.postsignup.helm.HelmActivity$onCreate$2$1$emit$$inlined$consumeIfType$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m16857invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m16857invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    if (((HelmDuxoEvent.EndFlow) event.getData()).isRhy()) {
                                        helmActivity4.showRhyTab();
                                    } else {
                                        helmActivity4.showWatchlist();
                                    }
                                }
                            });
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
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
    }

    @Override // com.robinhood.android.onboarding.ui.postsignup.loading.PostSignUpLoadingFragment.Callbacks
    public void onInitialLoadingFinished(PostSignUpContext context) {
        TimberLogger.INSTANCE.mo1679d("[Helm] onInitialLoadingFinished context:" + context, new Object[0]);
        getDuxo().handleEvent(new PostSignUpEvent.LoadingComplete(false));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (WhenMappings.$EnumSwitchMapping$0[RequestCode.getEntries().get(requestCode).ordinal()]) {
            case 1:
                getDuxo().handleEvent(new PostSignUpEvent.BankLinkFinished(resultCode == -1));
                break;
            case 2:
                boolean z = resultCode == -1;
                ReturnedData.AchTransferAmount achTransferAmount = data != null ? (ReturnedData.AchTransferAmount) data.getParcelableExtra(ReturnedData.EXTRA_RETURNED_DATA) : null;
                if (achTransferAmount == null) {
                    achTransferAmount = null;
                }
                Money amount = achTransferAmount != null ? achTransferAmount.getAmount() : null;
                TimberLogger.INSTANCE.mo1679d("[Helm] onActivityResult FUND success:" + z + " amount:" + (amount != null ? amount.getDecimalValue() : null), new Object[0]);
                getDuxo().handleEvent(new PostSignUpEvent.FundingComplete(true, amount));
                break;
            case 3:
                TimberLogger.INSTANCE.mo1679d("[Helm] onActivityResult REFERRAL", new Object[0]);
                getDuxo().handleEvent(PostSignUpEvent.ReferralComplete.INSTANCE);
                break;
            case 4:
                TimberLogger.INSTANCE.mo1679d("[Helm] onActivityResult DOC_UPLOAD", new Object[0]);
                getDuxo().handleEvent(PostSignUpEvent.DocUploadComplete.INSTANCE);
                break;
            case 5:
                TimberLogger.INSTANCE.mo1679d("[Helm] onActivityResult POST_FUNDING_UPSELL " + resultCode, new Object[0]);
                if (resultCode == -1) {
                    getDuxo().handleEvent(PostSignUpEvent.PostFundUpsellComplete.INSTANCE);
                    break;
                } else {
                    getDuxo().handleEvent(PostSignUpEvent.PostFundUpsellCancel.INSTANCE);
                    break;
                }
            case 6:
                TimberLogger.INSTANCE.mo1679d("[Helm] onActivityResult RECURRING_AUTOMATIC_DEPOSIT", new Object[0]);
                getDuxo().handleEvent(PostSignUpEvent.RecurringAutomaticDepositComplete.INSTANCE);
                break;
            case 7:
                TimberLogger.INSTANCE.mo1679d("[Helm] onActivityResult GOLD_NATIVE_FUNDING_UPSELL", new Object[0]);
                getDuxo().handleEvent(PostSignUpEvent.GoldNativeFundingUpsellCompleted.INSTANCE);
                break;
            case 8:
                boolean z2 = resultCode == -1;
                TimberLogger.INSTANCE.mo1679d("[Helm] onActivityResult UK_QUEUED_DEPOSIT succeeded:" + z2, new Object[0]);
                getDuxo().handleEvent(new PostSignUpEvent.UkQueuedDepositCompleted(z2));
                break;
            case 9:
                TimberLogger.INSTANCE.mo1679d("[Helm] onActivityResult UK_VERIFY_IDENTITY", new Object[0]);
                getDuxo().handleEvent(PostSignUpEvent.UkVerifyIdentityCompleted.INSTANCE);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // com.robinhood.android.onboarding.ui.postsignup.event.PostSignUpEvent.Receiver
    public void onEvent(PostSignUpEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        getDuxo().handleEvent(event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processDestination(PostSignUpDestination destination) {
        TimberLogger.INSTANCE.mo1679d("[Helm] process destination: " + destination, new Object[0]);
        if (destination instanceof PostSignUpDestination.PreFundDetails) {
            replaceFragment(PostSignUpFundAccountDetailFragment.INSTANCE.newInstance());
            return;
        }
        if (destination instanceof PostSignUpDestination.PreFundSplash) {
            if (((PostSignUpDestination.PreFundSplash) destination).getShowTransition()) {
                replaceFragmentWithoutBackStack(PostSignUpFundAccountSplashFragment.INSTANCE.newInstance());
                return;
            } else {
                replaceFragmentWithoutAnimationAndBackStack(PostSignUpFundAccountSplashFragment.INSTANCE.newInstance());
                return;
            }
        }
        if (destination instanceof PostSignUpDestination.CreateIavRelationship) {
            Navigator navigator = getNavigator();
            IavSource iavSource = IavSource.ONBOARDING_V2;
            Companion companion = INSTANCE;
            Navigator.DefaultImpls.startActivityForResult$default(navigator, (Activity) this, (IntentKey) new CreateIavRelationshipIntentKey(iavSource, null, null, ((HelmIntentKey) companion.getExtras((Activity) this)).getTransferAccountType(), !((HelmIntentKey) companion.getExtras((Activity) this)).getIsRhy(), true, null, ((HelmIntentKey) companion.getExtras((Activity) this)).getTheme(), 70, null), RequestCode.BANK_LINK.ordinal(), (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
            return;
        }
        if (Intrinsics.areEqual(destination, PostSignUpDestination.CreateUkQueuedDeposit.INSTANCE)) {
            Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Activity) this, (IntentKey) new UkQueuedDeposit(null, true, null, 5, null), RequestCode.UK_QUEUED_DEPOSIT.ordinal(), (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
            return;
        }
        if (Intrinsics.areEqual(destination, PostSignUpDestination.FirstDeposit.INSTANCE)) {
            Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Activity) this, (IntentKey) new AchTransferIntentKey(new TransferContext.NormalIav(TransferDirection.DEPOSIT, null, IavSource.ONBOARDING_V2, null, 10, null), false, !((HelmIntentKey) INSTANCE.getExtras((Activity) this)).getIsRhy(), false, null, 24, null), RequestCode.FUND.ordinal(), (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
            return;
        }
        if (Intrinsics.areEqual(destination, PostSignUpDestination.NativeFundingUpsell.INSTANCE)) {
            Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Activity) this, (IntentKey) new GoldNativeFundingUpsellIntentKey("onboarding_plaid_connection", true, ((HelmIntentKey) INSTANCE.getExtras((Activity) this)).getTheme()), RequestCode.GOLD_NATIVE_FUNDING_UPSELL.ordinal(), (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
            return;
        }
        if (Intrinsics.areEqual(destination, PostSignUpDestination.Referral.INSTANCE)) {
            Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Activity) this, (IntentKey) new RewardOfferIntentKey.Platform("sign_up", ((HelmIntentKey) INSTANCE.getExtras((Activity) this)).getTheme(), null, !((HelmIntentKey) r2.getExtras((Activity) this)).getIsRhy(), false, "sign_up", 16, null), RequestCode.REFERRAL.ordinal(), (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
            return;
        }
        if (destination instanceof PostSignUpDestination.DocUpload) {
            showDocUploadFlow(((PostSignUpDestination.DocUpload) destination).getRequests());
            return;
        }
        if (Intrinsics.areEqual(destination, PostSignUpDestination.PostFundingUpsell.INSTANCE)) {
            showPostFundingUpsell();
            return;
        }
        if (destination instanceof PostSignUpDestination.Thanks) {
            PostSignUpThanksFragment.Args args = new PostSignUpThanksFragment.Args(((HelmIntentKey) INSTANCE.getExtras((Activity) this)).getTheme() != ColorTheme.DEFAULT);
            if (((PostSignUpDestination.Thanks) destination).getShowTransition()) {
                replaceFragment(PostSignUpThanksFragment.INSTANCE.newInstance((Parcelable) args));
                return;
            } else {
                replaceFragmentWithoutAnimation(PostSignUpThanksFragment.INSTANCE.newInstance((Parcelable) args));
                return;
            }
        }
        if (destination instanceof PostSignUpDestination.RecurringAutomaticDeposit) {
            showRecurringDepositFlow(((PostSignUpDestination.RecurringAutomaticDeposit) destination).getRecommendedAmount());
            return;
        }
        if (Intrinsics.areEqual(destination, PostSignUpDestination.VerifyIdentity.INSTANCE)) {
            showVerifyIdentity();
            return;
        }
        if (Intrinsics.areEqual(destination, PostSignUpDestination.Watchlist.INSTANCE)) {
            showWatchlist();
        } else if (Intrinsics.areEqual(destination, PostSignUpDestination.RhyTab.INSTANCE)) {
            showRhyTab();
        } else if (!Intrinsics.areEqual(destination, PostSignUpDestination.DepositQueuedMessage.INSTANCE) && !(destination instanceof PostSignUpDestination.HelmDrivenSubFlow)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void showDocUploadFlow(List<DocumentRequest> requests) {
        Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Activity) this, (IntentKey) new DocUploadAssistant(requests, !((HelmIntentKey) r2.getExtras((Activity) this)).getIsRhy(), true, false, ((HelmIntentKey) INSTANCE.getExtras((Activity) this)).getTheme(), 8, null), RequestCode.DOC_UPLOAD.ordinal(), (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
    }

    private final void showPostFundingUpsell() {
        Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Activity) this, (IntentKey) new OnboardingUpsellIntentKey(OnboardingUpsellIntentKey.ONBOARDING_UPSELL, null, false, false, ((HelmIntentKey) INSTANCE.getExtras((Activity) this)).getTheme(), 10, null), RequestCode.POST_FUNDING_UPSELL.ordinal(), (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
    }

    private final void showRecurringDepositFlow(Money recommendedAmount) {
        Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Activity) this, (IntentKey) new AchTransferIntentKey(new TransferContext.RecurringDepositFromOnboarding(recommendedAmount.getDecimalValue()), true, !((HelmIntentKey) r11.getExtras((Activity) this)).getIsRhy(), false, ((HelmIntentKey) INSTANCE.getExtras((Activity) this)).getTheme(), 8, null), RequestCode.RECURRING_AUTOMATIC_DEPOSIT.ordinal(), (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
    }

    private final void showVerifyIdentity() {
        Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Activity) this, (IntentKey) new PersonaSplashIntentKey(PersonaFlowStyle.BROKERAGE_V2), RequestCode.UK_VERIFY_IDENTITY.ordinal(), (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showWatchlist() {
        Navigator.DefaultImpls.startActivity$default(getNavigator(), this, MainActivityIntentKey.INSTANCE, null, false, null, null, 60, null);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRhyTab() {
        Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new TabLinkIntentKey.McDuckling(getScreenName(), false, null, 6, null), null, false, null, null, 60, null);
        finish();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return ((HelmIntentKey) INSTANCE.getExtras((Activity) this)).getIsRhy() ? "RHY" : "RHF";
    }

    /* compiled from: HelmActivity.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmActivity;", "Lcom/robinhood/android/onboarding/contracts/HelmIntentKey;", "<init>", "()V", "GOLD_NATIVE_FUNDING_UPSELL_BANK_LINK_SOURCE", "", "getIntentWithExtras", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "extras", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<HelmActivity, HelmIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public HelmIntentKey getExtras(HelmActivity helmActivity) {
            return (HelmIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, helmActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, HelmIntentKey helmIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, helmIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, HelmIntentKey extras) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(extras, "extras");
            Intent flags = IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, extras).setFlags(268468224);
            Intrinsics.checkNotNullExpressionValue(flags, "setFlags(...)");
            return flags;
        }
    }
}

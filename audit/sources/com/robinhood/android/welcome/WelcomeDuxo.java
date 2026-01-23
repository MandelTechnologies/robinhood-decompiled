package com.robinhood.android.welcome;

import android.content.Intent;
import androidx.lifecycle.ViewModel2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.android.api.swipeycontent.SwipeyContent;
import com.robinhood.android.api.swipeycontent.SwipeyContentApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.gdpr.GdprConsentStatus;
import com.robinhood.android.gdpr.manager.annotation.GdprMarketingConsentPref;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.welcome.WelcomeDuxo;
import com.robinhood.android.welcome.WelcomeDuxo3;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OnboardingGbExperiments;
import com.robinhood.librobinhood.data.store.UserRegionStore;
import com.robinhood.models.api.UserRegion;
import com.robinhood.models.p320db.Account;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.referral.AttributionManager;
import com.robinhood.referral.AttributionNavigation;
import com.robinhood.referral.DeeplinkNavigation;
import com.robinhood.referral.IntentKeyNavigation;
import com.robinhood.referral.SingularAttributionManager;
import com.robinhood.rosetta.eventlogging.Boolean;
import com.robinhood.rosetta.eventlogging.DeviceSecurityConfig;
import com.robinhood.rosetta.eventlogging.DeviceSecurityEventData;
import com.robinhood.rosetta.eventlogging.DeviceSecurityTimeout;
import com.robinhood.shared.common.singular.LinkParams;
import com.robinhood.shared.common.singular.SingularSdkWrapper;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.user.contracts.auth.Login;
import com.robinhood.shared.user.contracts.auth.UserCreation;
import com.robinhood.utils.logging.TimberLogger;
import io.reactivex.Single;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxAwait3;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: WelcomeDuxo.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001'Bi\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u000e\b\u0001\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u000e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\u001eJ\u000e\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/welcome/WelcomeDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/welcome/WelcomeState;", "Lcom/robinhood/android/welcome/WelcomeDuxoEvent;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "attributionManager", "Lcom/robinhood/referral/AttributionManager;", "regionStore", "Lcom/robinhood/librobinhood/data/store/UserRegionStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "swipeyContentApi", "Lcom/robinhood/android/api/swipeycontent/SwipeyContentApi;", "singularSdkWrapper", "Lcom/robinhood/shared/common/singular/SingularSdkWrapper;", "marketingConsent", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/gdpr/GdprConsentStatus;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/analytics/SharedEventLogger;Lcom/robinhood/referral/AttributionManager;Lcom/robinhood/librobinhood/data/store/UserRegionStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/api/swipeycontent/SwipeyContentApi;Lcom/robinhood/shared/common/singular/SingularSdkWrapper;Lcom/robinhood/prefs/EnumPreference;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "fetchAttribution", "intent", "Landroid/content/Intent;", "logNoDeviceSecurityEvent", "onSignInClicked", "loggingTag", "", "onSignUpClicked", "Companion", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class WelcomeDuxo extends BaseDuxo5<WelcomeState, WelcomeDuxo3> {
    private static final String PREDICTION_MARKETS_PRODUCT = "prediction_markets";
    private final AccountProvider accountProvider;
    private final AnalyticsLogger analytics;
    private final AttributionManager attributionManager;
    private final AuthManager authManager;
    private final SharedEventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final EnumPreference<GdprConsentStatus> marketingConsent;
    private final UserRegionStore regionStore;
    private final SingularSdkWrapper singularSdkWrapper;
    private final SwipeyContentApi swipeyContentApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeDuxo(AccountProvider accountProvider, AnalyticsLogger analytics, AuthManager authManager, SharedEventLogger eventLogger, AttributionManager attributionManager, UserRegionStore regionStore, ExperimentsStore experimentsStore, SwipeyContentApi swipeyContentApi, SingularSdkWrapper singularSdkWrapper, @GdprMarketingConsentPref EnumPreference<GdprConsentStatus> marketingConsent, DuxoBundle duxoBundle) {
        super(new WelcomeState(false, null, 3, null), duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(attributionManager, "attributionManager");
        Intrinsics.checkNotNullParameter(regionStore, "regionStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(swipeyContentApi, "swipeyContentApi");
        Intrinsics.checkNotNullParameter(singularSdkWrapper, "singularSdkWrapper");
        Intrinsics.checkNotNullParameter(marketingConsent, "marketingConsent");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.analytics = analytics;
        this.authManager = authManager;
        this.eventLogger = eventLogger;
        this.attributionManager = attributionManager;
        this.regionStore = regionStore;
        this.experimentsStore = experimentsStore;
        this.swipeyContentApi = swipeyContentApi;
        this.singularSdkWrapper = singularSdkWrapper;
        this.marketingConsent = marketingConsent;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C314641(null), 3, null);
        if (this.authManager.isLoggedIn()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C314652(null), 3, null);
    }

    /* compiled from: WelcomeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.welcome.WelcomeDuxo$onCreate$1", m3645f = "WelcomeDuxo.kt", m3646l = {66}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.welcome.WelcomeDuxo$onCreate$1 */
    static final class C314641 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C314641(Continuation<? super C314641> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WelcomeDuxo.this.new C314641(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C314641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: WelcomeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/referral/AttributionNavigation;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.welcome.WelcomeDuxo$onCreate$1$1", m3645f = "WelcomeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.welcome.WelcomeDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AttributionNavigation, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ WelcomeDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(WelcomeDuxo welcomeDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = welcomeDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AttributionNavigation attributionNavigation, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(attributionNavigation, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    AttributionNavigation attributionNavigation = (AttributionNavigation) this.L$0;
                    this.this$0.attributionManager.resetNextScreenFlow();
                    if (attributionNavigation instanceof IntentKeyNavigation) {
                        this.this$0.submit(new WelcomeDuxo3.NavigateTo(((IntentKeyNavigation) attributionNavigation).getIntentKey()));
                    } else {
                        if (!(attributionNavigation instanceof DeeplinkNavigation)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.this$0.submit(new WelcomeDuxo3.HandleDeeplink(((DeeplinkNavigation) attributionNavigation).getDeeplink()));
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<AttributionNavigation> nextScreenFlow = WelcomeDuxo.this.attributionManager.getNextScreenFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(WelcomeDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(nextScreenFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: WelcomeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.welcome.WelcomeDuxo$onCreate$2", m3645f = "WelcomeDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, 87, 102}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.welcome.WelcomeDuxo$onCreate$2 */
    static final class C314652 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int I$0;
        Object L$0;
        boolean Z$0;
        int label;

        C314652(Continuation<? super C314652> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WelcomeDuxo.this.new C314652(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C314652) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00c1 A[Catch: Exception -> 0x00d3, TRY_LEAVE, TryCatch #4 {Exception -> 0x00d3, blocks: (B:42:0x00bb, B:44:0x00c1), top: B:61:0x00bb }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String upperCase;
            int iBooleanValue;
            Object objCoGetCurrentRegion;
            int i;
            int i2;
            String str;
            boolean zAreEqual;
            boolean z;
            Object swipeyContent;
            Object objAwait;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.label;
            boolean z2 = false;
            SwipeyContent swipeyContent2 = null;
            boolean z3 = true;
            try {
                try {
                } catch (Exception unused) {
                    iBooleanValue = 0;
                }
            } catch (Exception unused2) {
                upperCase = "";
                i = i3;
            }
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                Single state$default = ExperimentsStore.getState$default(WelcomeDuxo.this.experimentsStore, OnboardingGbExperiments.INSTANCE, false, 2, null);
                this.label = 1;
                objAwait = RxAwait3.await(state$default, this);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z = this.Z$0;
                        str = (String) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            swipeyContent = obj;
                            swipeyContent2 = (SwipeyContent) swipeyContent;
                        } catch (Exception unused3) {
                        }
                        zAreEqual = z;
                        try {
                            if (!Intrinsics.areEqual(str, CountryCode.COUNTRY_CODE_GB)) {
                                if (!Intrinsics.areEqual(CountryCode.INSTANCE.getInstance(str).getParentLocality(), CountryCode.COUNTRY_CODE_US)) {
                                    z2 = true;
                                }
                            }
                            z3 = z2;
                        } catch (Exception unused4) {
                        }
                        WelcomeDuxo.this.submit(new WelcomeDuxo3.RegionLoadingCompleted(Intrinsics.areEqual(str, CountryCode.COUNTRY_CODE_GB), z3, swipeyContent2, zAreEqual));
                        return Unit.INSTANCE;
                    }
                    int i4 = this.I$0;
                    ResultKt.throwOnFailure(obj);
                    objCoGetCurrentRegion = obj;
                    i3 = i4;
                    upperCase = ((UserRegion) objCoGetCurrentRegion).getRegion().toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    i = i3;
                    String str2 = upperCase;
                    i2 = i;
                    str = str2;
                    zAreEqual = Intrinsics.areEqual(str, CountryCode.COUNTRY_CODE_US);
                    WelcomeDuxo.this.applyMutation(new AnonymousClass1(zAreEqual, null));
                    if (i2 != false) {
                        if (Intrinsics.areEqual(str, CountryCode.COUNTRY_CODE_GB)) {
                            try {
                                SwipeyContentApi swipeyContentApi = WelcomeDuxo.this.swipeyContentApi;
                                this.L$0 = str;
                                this.Z$0 = zAreEqual;
                                this.label = 3;
                                swipeyContent = swipeyContentApi.getSwipeyContent(this);
                            } catch (Exception unused5) {
                                z = zAreEqual;
                            }
                            if (swipeyContent != coroutine_suspended) {
                                z = zAreEqual;
                                swipeyContent2 = (SwipeyContent) swipeyContent;
                                zAreEqual = z;
                            }
                            return coroutine_suspended;
                        }
                        if (!Intrinsics.areEqual(str, CountryCode.COUNTRY_CODE_GB)) {
                        }
                        z3 = z2;
                        WelcomeDuxo.this.submit(new WelcomeDuxo3.RegionLoadingCompleted(Intrinsics.areEqual(str, CountryCode.COUNTRY_CODE_GB), z3, swipeyContent2, zAreEqual));
                        return Unit.INSTANCE;
                    }
                    WelcomeDuxo.this.submit(new WelcomeDuxo3.RegionLoadingCompleted(false, false, null, zAreEqual, 6, null));
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                objAwait = obj;
            }
            Intrinsics.checkNotNull(objAwait);
            iBooleanValue = ((Boolean) objAwait).booleanValue();
            UserRegionStore userRegionStore = WelcomeDuxo.this.regionStore;
            this.I$0 = iBooleanValue;
            this.label = 2;
            objCoGetCurrentRegion = userRegionStore.coGetCurrentRegion(this);
            i3 = iBooleanValue;
            if (objCoGetCurrentRegion == coroutine_suspended) {
                return coroutine_suspended;
            }
            upperCase = ((UserRegion) objCoGetCurrentRegion).getRegion().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            i = i3;
            String str22 = upperCase;
            i2 = i;
            str = str22;
            zAreEqual = Intrinsics.areEqual(str, CountryCode.COUNTRY_CODE_US);
            WelcomeDuxo.this.applyMutation(new AnonymousClass1(zAreEqual, null));
            if (i2 != false) {
            }
        }

        /* compiled from: WelcomeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/welcome/WelcomeState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.welcome.WelcomeDuxo$onCreate$2$1", m3645f = "WelcomeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.welcome.WelcomeDuxo$onCreate$2$1, reason: invalid class name */
        /* loaded from: classes9.dex */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<WelcomeState, Continuation<? super WelcomeState>, Object> {
            final /* synthetic */ boolean $isBrandRefresh;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$isBrandRefresh = z;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isBrandRefresh, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(WelcomeState welcomeState, Continuation<? super WelcomeState> continuation) {
                return ((AnonymousClass1) create(welcomeState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return WelcomeState.copy$default((WelcomeState) this.L$0, this.$isBrandRefresh, null, 2, null);
            }
        }
    }

    /* compiled from: WelcomeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.welcome.WelcomeDuxo$fetchAttribution$1", m3645f = "WelcomeDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.welcome.WelcomeDuxo$fetchAttribution$1 */
    /* loaded from: classes9.dex */
    static final class C314631 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Intent $intent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C314631(Intent intent, Continuation<? super C314631> continuation) {
            super(2, continuation);
            this.$intent = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WelcomeDuxo.this.new C314631(this.$intent, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C314631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(WelcomeDuxo.this.marketingConsent.getChanges()), Integer.MAX_VALUE, null, 2, null);
                Flow<GdprConsentStatus> flow = new Flow<GdprConsentStatus>() { // from class: com.robinhood.android.welcome.WelcomeDuxo$fetchAttribution$1$invokeSuspend$$inlined$filter$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super GdprConsentStatus> flowCollector, Continuation continuation) {
                        Object objCollect = flowBuffer$default.collect(new C314622(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.welcome.WelcomeDuxo$fetchAttribution$1$invokeSuspend$$inlined$filter$1$2 */
                    public static final class C314622<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.welcome.WelcomeDuxo$fetchAttribution$1$invokeSuspend$$inlined$filter$1$2", m3645f = "WelcomeDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.welcome.WelcomeDuxo$fetchAttribution$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C314622.this.emit(null, this);
                            }
                        }

                        public C314622(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                if (((GdprConsentStatus) obj).getIsEnabled()) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(WelcomeDuxo.this, this.$intent, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: WelcomeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/gdpr/GdprConsentStatus;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.welcome.WelcomeDuxo$fetchAttribution$1$2", m3645f = "WelcomeDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.welcome.WelcomeDuxo$fetchAttribution$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<GdprConsentStatus, Continuation<? super Unit>, Object> {
            final /* synthetic */ Intent $intent;
            int label;
            final /* synthetic */ WelcomeDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(WelcomeDuxo welcomeDuxo, Intent intent, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = welcomeDuxo;
                this.$intent = intent;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$intent, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GdprConsentStatus gdprConsentStatus, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(gdprConsentStatus, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                ExperimentsStore experimentsStore;
                PredicationMarketsAttributedFlowExperiment predicationMarketsAttributedFlowExperiment;
                AnonymousClass2 anonymousClass2;
                Object objM22650coGetState0E7RQCE$default;
                Exception exc;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        experimentsStore = this.this$0.experimentsStore;
                        predicationMarketsAttributedFlowExperiment = PredicationMarketsAttributedFlowExperiment.INSTANCE;
                        this.label = 1;
                        anonymousClass2 = this;
                    } catch (Exception e) {
                        e = e;
                        exc = e;
                        TimberLogger.INSTANCE.mo1682e(exc, "Unable to fetch attribution", new Object[0]);
                        return Unit.INSTANCE;
                    }
                    try {
                        objM22650coGetState0E7RQCE$default = ExperimentsStore.m22650coGetState0E7RQCE$default(experimentsStore, predicationMarketsAttributedFlowExperiment, false, anonymousClass2, 2, null);
                        if (objM22650coGetState0E7RQCE$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        exc = e;
                        TimberLogger.INSTANCE.mo1682e(exc, "Unable to fetch attribution", new Object[0]);
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        ResultKt.throwOnFailure(obj);
                        objM22650coGetState0E7RQCE$default = ((Result) obj).getValue();
                        anonymousClass2 = this;
                    } catch (Exception e3) {
                        exc = e3;
                        TimberLogger.INSTANCE.mo1682e(exc, "Unable to fetch attribution", new Object[0]);
                        return Unit.INSTANCE;
                    }
                }
                Boolean boolBoxBoolean = boxing.boxBoolean(false);
                if (Result.m28555isFailureimpl(objM22650coGetState0E7RQCE$default)) {
                    objM22650coGetState0E7RQCE$default = boolBoxBoolean;
                }
                if (((Boolean) objM22650coGetState0E7RQCE$default).booleanValue()) {
                    SingularSdkWrapper singularSdkWrapper = anonymousClass2.this$0.singularSdkWrapper;
                    Intent intent = anonymousClass2.$intent;
                    final WelcomeDuxo welcomeDuxo = anonymousClass2.this$0;
                    singularSdkWrapper.init(intent, new Function1() { // from class: com.robinhood.android.welcome.WelcomeDuxo$fetchAttribution$1$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return WelcomeDuxo.C314631.AnonymousClass2.invokeSuspend$lambda$0(welcomeDuxo, (LinkParams) obj2);
                        }
                    });
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(WelcomeDuxo welcomeDuxo, LinkParams linkParams) {
                if (Intrinsics.areEqual(linkParams.getMetadata().get(SingularAttributionManager.PRODUCT_PARAM_KEY), WelcomeDuxo.PREDICTION_MARKETS_PRODUCT)) {
                    welcomeDuxo.applyMutation(new WelcomeDuxo2(null));
                }
                return Unit.INSTANCE;
            }
        }
    }

    public final void fetchAttribution(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C314631(intent, null), 3, null);
    }

    public final void logNoDeviceSecurityEvent() {
        final DeviceSecurityEventData.SecurityType securityType = DeviceSecurityEventData.SecurityType.NONE;
        Boolean r2 = Boolean.FALSE;
        final DeviceSecurityConfig deviceSecurityConfig = new DeviceSecurityConfig(r2, null, null, null, r2, r2, null, 78, null);
        Single<Account> singleFirstOrError = this.accountProvider.streamIndividualAccount().firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleFirstOrError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.welcome.WelcomeDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WelcomeDuxo.logNoDeviceSecurityEvent$lambda$0(this.f$0, securityType, deviceSecurityConfig, (Account) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logNoDeviceSecurityEvent$lambda$0(WelcomeDuxo welcomeDuxo, DeviceSecurityEventData.SecurityType securityType, DeviceSecurityConfig deviceSecurityConfig, Account account) {
        welcomeDuxo.eventLogger.logDeviceSecurityEvent(securityType, deviceSecurityConfig, account.getAccountAgeInWeeks(), Boolean.TRUE, DeviceSecurityTimeout.SECURITY_TIMEOUT_UNSPECIFIED);
        return Unit.INSTANCE;
    }

    public final void onSignInClicked(String loggingTag) {
        Intrinsics.checkNotNullParameter(loggingTag, "loggingTag");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(this.analytics, AnalyticsStrings.BUTTON_GROUP_MAX_WELCOME, AnalyticsStrings.BUTTON_MAX_WELCOME_LOGIN, null, null, null, null, loggingTag, null, 188, null);
        submit(new WelcomeDuxo3.NavigateTo(new Login(null, null, false, 7, null)));
    }

    public final void onSignUpClicked(String loggingTag) {
        Intrinsics.checkNotNullParameter(loggingTag, "loggingTag");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(this.analytics, AnalyticsStrings.BUTTON_GROUP_MAX_WELCOME, AnalyticsStrings.BUTTON_MAX_WELCOME_SIGNUP, null, null, null, null, loggingTag, null, 188, null);
        withDataState(new Function1() { // from class: com.robinhood.android.welcome.WelcomeDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WelcomeDuxo.onSignUpClicked$lambda$1(this.f$0, (WelcomeState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSignUpClicked$lambda$1(WelcomeDuxo welcomeDuxo, WelcomeState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        welcomeDuxo.submit(new WelcomeDuxo3.NavigateTo(new UserCreation(null, null, null, null, null, it.getForceDarkTheme(), 31, null)));
        return Unit.INSTANCE;
    }
}

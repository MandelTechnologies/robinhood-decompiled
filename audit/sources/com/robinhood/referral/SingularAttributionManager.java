package com.robinhood.referral;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.robinhood.android.gdpr.GdprConsentStatus;
import com.robinhood.android.gdpr.manager.annotation.GdprMarketingConsentPref;
import com.robinhood.android.navigation.DeepLinkResolver;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.prefs.Installation;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.StringToStringMapPreference;
import com.robinhood.referral.SingularAttributionManager;
import com.robinhood.referral.singular.AttributionApi;
import com.robinhood.referral.singular.AttributionCampaignDataPref;
import com.robinhood.referral.singular.AttributionMetadataPref;
import com.robinhood.referral.singular.AttributionProductDataPref;
import com.robinhood.referral.singular.AttributionRequest;
import com.robinhood.shared.common.singular.LinkParams;
import com.robinhood.shared.common.singular.SingularSdkWrapper;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.logging.TimberLogger;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: SingularAttributionManager.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(Bi\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0012\u0012\u000e\b\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001d\u001a\u00020\u001e\"\b\b\u0000\u0010\u001f*\u00020 2\u0006\u0010!\u001a\u0002H\u001f2\u0006\u0010\"\u001a\u00020#H\u0016¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u001eH\u0016J\b\u0010&\u001a\u00020\u001eH\u0016J\b\u0010'\u001a\u00020\u001eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006)"}, m3636d2 = {"Lcom/robinhood/referral/SingularAttributionManager;", "Lcom/robinhood/referral/AttributionManager;", "attributionApi", "Lcom/robinhood/referral/singular/AttributionApi;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "installation", "Lcom/robinhood/prefs/Installation;", "singularSdkWrapper", "Lcom/robinhood/shared/common/singular/SingularSdkWrapper;", "deeplinkResolver", "Lcom/robinhood/android/navigation/DeepLinkResolver;", "productDataPref", "Lcom/robinhood/prefs/StringPreference;", "campaignDataPref", "metadataPref", "Lcom/robinhood/prefs/StringToStringMapPreference;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "marketingConsent", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/gdpr/GdprConsentStatus;", "<init>", "(Lcom/robinhood/referral/singular/AttributionApi;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/prefs/Installation;Lcom/robinhood/shared/common/singular/SingularSdkWrapper;Lcom/robinhood/android/navigation/DeepLinkResolver;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringToStringMapPreference;Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/prefs/EnumPreference;)V", "nextScreenFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/robinhood/referral/AttributionNavigation;", "getNextScreenFlow", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "handleAttribution", "", "A", "Landroid/app/Activity;", "activity", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "(Landroid/app/Activity;Landroid/content/Intent;)V", "completeAttribution", "clearPersistedData", "resetNextScreenFlow", "Companion", "lib-referral_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class SingularAttributionManager implements AttributionManager {
    private static final String CAMPAIGN_PARAM_KEY = "campaign";
    public static final String PRODUCT_PARAM_KEY = "product";
    private final AttributionApi attributionApi;
    private final AuthManager authManager;
    private final StringPreference campaignDataPref;
    private final CoroutineScope coroutineScope;
    private final DeepLinkResolver deeplinkResolver;
    private final Installation installation;
    private final EnumPreference<GdprConsentStatus> marketingConsent;
    private final StringToStringMapPreference metadataPref;
    private final SharedFlow2<AttributionNavigation> nextScreenFlow;
    private final StringPreference productDataPref;
    private final SingularSdkWrapper singularSdkWrapper;

    public SingularAttributionManager(AttributionApi attributionApi, AuthManager authManager, Installation installation, SingularSdkWrapper singularSdkWrapper, DeepLinkResolver deeplinkResolver, @AttributionProductDataPref StringPreference productDataPref, @AttributionCampaignDataPref StringPreference campaignDataPref, @AttributionMetadataPref StringToStringMapPreference metadataPref, @RootCoroutineScope CoroutineScope coroutineScope, @GdprMarketingConsentPref EnumPreference<GdprConsentStatus> marketingConsent) {
        Intrinsics.checkNotNullParameter(attributionApi, "attributionApi");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(singularSdkWrapper, "singularSdkWrapper");
        Intrinsics.checkNotNullParameter(deeplinkResolver, "deeplinkResolver");
        Intrinsics.checkNotNullParameter(productDataPref, "productDataPref");
        Intrinsics.checkNotNullParameter(campaignDataPref, "campaignDataPref");
        Intrinsics.checkNotNullParameter(metadataPref, "metadataPref");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(marketingConsent, "marketingConsent");
        this.attributionApi = attributionApi;
        this.authManager = authManager;
        this.installation = installation;
        this.singularSdkWrapper = singularSdkWrapper;
        this.deeplinkResolver = deeplinkResolver;
        this.productDataPref = productDataPref;
        this.campaignDataPref = campaignDataPref;
        this.metadataPref = metadataPref;
        this.coroutineScope = coroutineScope;
        this.marketingConsent = marketingConsent;
        this.nextScreenFlow = SharedFlow4.MutableSharedFlow$default(1, 0, null, 6, null);
    }

    @Override // com.robinhood.referral.AttributionManager
    public SharedFlow2<AttributionNavigation> getNextScreenFlow() {
        return this.nextScreenFlow;
    }

    /* compiled from: SingularAttributionManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.referral.SingularAttributionManager$handleAttribution$1", m3645f = "SingularAttributionManager.kt", m3646l = {56}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.referral.SingularAttributionManager$handleAttribution$1 */
    static final class C361571 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Intent $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C361571(Intent intent, Continuation<? super C361571> continuation) {
            super(2, continuation);
            this.$data = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SingularAttributionManager.this.new C361571(this.$data, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C361571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable observableDistinctUntilChanged = SingularAttributionManager.this.marketingConsent.getChanges().distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(observableDistinctUntilChanged), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SingularAttributionManager.this, this.$data, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: SingularAttributionManager.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "status", "Lcom/robinhood/android/gdpr/GdprConsentStatus;", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.referral.SingularAttributionManager$handleAttribution$1$1", m3645f = "SingularAttributionManager.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.referral.SingularAttributionManager$handleAttribution$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GdprConsentStatus, Continuation<? super Unit>, Object> {
            final /* synthetic */ Intent $data;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SingularAttributionManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SingularAttributionManager singularAttributionManager, Intent intent, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = singularAttributionManager;
                this.$data = intent;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$data, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GdprConsentStatus gdprConsentStatus, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(gdprConsentStatus, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (((GdprConsentStatus) this.L$0).getIsEnabled()) {
                    SingularSdkWrapper singularSdkWrapper = this.this$0.singularSdkWrapper;
                    Intent intent = this.$data;
                    final SingularAttributionManager singularAttributionManager = this.this$0;
                    singularSdkWrapper.init(intent, new Function1() { // from class: com.robinhood.referral.SingularAttributionManager$handleAttribution$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return SingularAttributionManager.C361571.AnonymousClass1.invokeSuspend$lambda$1(singularAttributionManager, (LinkParams) obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }
                TimberLogger.INSTANCE.mo1679d("[Singular] Skipping init: can't use sdk without consent", new Object[0]);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$1(SingularAttributionManager singularAttributionManager, LinkParams linkParams) {
                String deeplink = linkParams.getDeeplink();
                if (deeplink != null && singularAttributionManager.authManager.isLoggedIn()) {
                    if (singularAttributionManager.deeplinkResolver.isSupported(Uri.parse(deeplink))) {
                        singularAttributionManager.getNextScreenFlow().tryEmit(new DeeplinkNavigation(deeplink));
                    } else {
                        TimberLogger.INSTANCE.mo1679d("[Singular] extracted deeplink not supported: " + deeplink, new Object[0]);
                    }
                }
                String str = linkParams.getMetadata().get(SingularAttributionManager.PRODUCT_PARAM_KEY);
                if (str == null) {
                    TimberLogger.INSTANCE.mo1679d("[Singular] Skipping attribution: product param not found", new Object[0]);
                    return Unit.INSTANCE;
                }
                String str2 = linkParams.getMetadata().get(SingularAttributionManager.CAMPAIGN_PARAM_KEY);
                TimberLogger.INSTANCE.mo1679d("[Singular] extracted product: " + str + " and campaign: " + str2, new Object[0]);
                singularAttributionManager.productDataPref.set(str);
                singularAttributionManager.campaignDataPref.set(str2);
                StringToStringMapPreference stringToStringMapPreference = singularAttributionManager.metadataPref;
                Map<String, String> mutableMap = MapsKt.toMutableMap(linkParams.getMetadata());
                mutableMap.remove(SingularAttributionManager.PRODUCT_PARAM_KEY);
                mutableMap.remove(SingularAttributionManager.CAMPAIGN_PARAM_KEY);
                stringToStringMapPreference.setValues(mutableMap);
                if (singularAttributionManager.authManager.isLoggedIn()) {
                    singularAttributionManager.completeAttribution();
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.referral.AttributionManager
    public <A extends Activity> void handleAttribution(A activity, Intent data) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(data, "data");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C361571(data, null), 3, null);
    }

    /* compiled from: SingularAttributionManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.referral.SingularAttributionManager$completeAttribution$1", m3645f = "SingularAttributionManager.kt", m3646l = {104}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.referral.SingularAttributionManager$completeAttribution$1 */
    static final class C361561 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C361561(Continuation<? super C361561> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SingularAttributionManager.this.new C361561(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C361561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    String str = SingularAttributionManager.this.productDataPref.get();
                    String str2 = SingularAttributionManager.this.campaignDataPref.get();
                    if (str == null) {
                        TimberLogger.INSTANCE.mo1679d("[Singular] Unable to complete attribution: no product param", new Object[0]);
                        return Unit.INSTANCE;
                    }
                    TimberLogger.INSTANCE.mo1679d("[Singular] Completing attribution with " + str + " and " + str2, new Object[0]);
                    AttributionApi attributionApi = SingularAttributionManager.this.attributionApi;
                    AttributionRequest attributionRequest = new AttributionRequest(SingularAttributionManager.this.installation.mo2745id(), str, str2, SingularAttributionManager.this.metadataPref.getValues());
                    this.label = 1;
                    if (attributionApi.completeAttribution(attributionRequest, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                SingularAttributionManager.this.clearPersistedData();
            } catch (Exception e) {
                TimberLogger.INSTANCE.mo1682e(e, "[Singular] Unable to complete attribution", new Object[0]);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.referral.AttributionManager
    public void completeAttribution() {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C361561(null), 3, null);
    }

    @Override // com.robinhood.referral.AttributionManager
    public void clearPersistedData() {
        this.productDataPref.delete();
        this.campaignDataPref.delete();
        this.metadataPref.delete();
    }

    @Override // com.robinhood.referral.AttributionManager
    public void resetNextScreenFlow() {
        TimberLogger.INSTANCE.mo1679d("[Singular] resetNextScreenFlow", new Object[0]);
        getNextScreenFlow().resetReplayCache();
    }
}

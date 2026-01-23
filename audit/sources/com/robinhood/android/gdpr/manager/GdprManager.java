package com.robinhood.android.gdpr.manager;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.data.store.gdpr.GdprStore;
import com.robinhood.android.gdpr.GdprConsent;
import com.robinhood.android.gdpr.GdprConsentCategory;
import com.robinhood.android.gdpr.GdprConsentStatus;
import com.robinhood.android.gdpr.GdprManagedSdk;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.api.odyssey.RegionApi;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.UserRegion;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserLocalityPref;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.gdpr.contracts.PrivacySettingsBottomSheetActivityKey;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.utils.AppInitializedListener;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.lifecycle.ActivityLifecycleListener;
import com.robinhood.utils.logging.CrashReporter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job6;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import okio.ByteString;
import p479j$.time.Clock;
import p479j$.time.Instant;
import timber.log.Timber;

/* compiled from: GdprManager.kt */
@Metadata(m3635d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 i2\u00020\u00012\u00020\u0002:\u0001iBx\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0011\u0010\u001c\u001a\r\u0012\t\u0012\u00070\u001a¢\u0006\u0002\b\u001b0\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fH\u0082@¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u001fH\u0082@¢\u0006\u0004\b'\u0010!J\u000f\u0010(\u001a\u00020\u001fH\u0002¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u001fH\u0082@¢\u0006\u0004\b*\u0010!J\u0017\u0010-\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\u001f2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u001f2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0010\u00108\u001a\u00020\u001fH\u0081@¢\u0006\u0004\b7\u0010!J\u0010\u0010:\u001a\u00020\u001fH\u0081@¢\u0006\u0004\b9\u0010!J\u000f\u0010<\u001a\u00020\u001fH\u0001¢\u0006\u0004\b;\u0010)R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010=R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010>R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010?R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010@R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010AR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010BR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010CR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010DR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010ER\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010FR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR+\u0010N\u001a\u0019\u0012\u0004\u0012\u00020L\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u001a¢\u0006\u0002\b\u001b0M0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR(\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0P8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bQ\u0010R\u0012\u0004\bU\u0010)\u001a\u0004\bS\u0010TR.\u0010W\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u000203\u0018\u00010V0P8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bW\u0010R\u0012\u0004\bY\u0010)\u001a\u0004\bX\u0010TR6\u0010[\u001a\u0010\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u001f\u0018\u00010Z8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b[\u0010\\\u0012\u0004\ba\u0010)\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0014\u0010e\u001a\u00020b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0011\u0010h\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\bf\u0010g¨\u0006j"}, m3636d2 = {"Lcom/robinhood/android/gdpr/manager/GdprManager;", "Lcom/robinhood/utils/AppInitializedListener;", "Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "Lkotlinx/coroutines/CoroutineScope;", "rootCoroutineScope", "Lcom/robinhood/shared/security/auth/AuthManager;", "authManager", "Lcom/robinhood/android/navigation/Navigator;", "navigator", "Lcom/robinhood/api/odyssey/RegionApi;", "regionApi", "Lcom/robinhood/android/data/store/gdpr/GdprStore;", "gdprStore", "Lcom/robinhood/android/gdpr/manager/GdprConsentCache;", "consentCache", "Lcom/robinhood/prefs/StringPreference;", "userLocalityPref", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/shared/app/type/AppType;", "appType", "", "Lcom/robinhood/android/gdpr/GdprManagedSdk;", "Lkotlin/jvm/JvmSuppressWildcards;", "managedSdks", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/api/odyssey/RegionApi;Lcom/robinhood/android/data/store/gdpr/GdprStore;Lcom/robinhood/android/gdpr/manager/GdprConsentCache;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/analytics/EventLogger;Lj$/time/Clock;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/shared/app/type/AppType;Ljava/util/Set;)V", "", "syncConsent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "managedSdk", "", "isEnabled", "updateConsentStatus", "(Lcom/robinhood/android/gdpr/GdprManagedSdk;Z)V", "setupInitialConsent", "setupLoggedInInitialConsent", "()V", "setupLoggedOutInitialConsent", "Landroid/app/Application;", "app", "onAppInitialized", "(Landroid/app/Application;)V", "Lcom/robinhood/android/gdpr/GdprConsent;", "consent", "setConsent", "(Lcom/robinhood/android/gdpr/GdprConsent;)V", "Landroid/app/Activity;", "activity", "onActivityStarted", "(Landroid/app/Activity;)V", "handleHasCollectedConsent$lib_gdpr_manager_externalDebug", "handleHasCollectedConsent", "handleShowConsentBottomSheet$lib_gdpr_manager_externalDebug", "handleShowConsentBottomSheet", "showConsentBottomSheet$lib_gdpr_manager_externalDebug", "showConsentBottomSheet", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/robinhood/shared/security/auth/AuthManager;", "Lcom/robinhood/android/navigation/Navigator;", "Lcom/robinhood/api/odyssey/RegionApi;", "Lcom/robinhood/android/data/store/gdpr/GdprStore;", "Lcom/robinhood/android/gdpr/manager/GdprConsentCache;", "Lcom/robinhood/prefs/StringPreference;", "Lcom/robinhood/analytics/EventLogger;", "Lj$/time/Clock;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lcom/robinhood/shared/app/type/AppType;", "Lkotlinx/coroutines/Job;", "job", "Lkotlinx/coroutines/Job;", "", "Lcom/robinhood/android/gdpr/GdprConsentCategory;", "", "managedSdksByCategory", "Ljava/util/Map;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "showConsentFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getShowConsentFlow$lib_gdpr_manager_externalDebug", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getShowConsentFlow$lib_gdpr_manager_externalDebug$annotations", "Ljava/lang/ref/WeakReference;", "activityFlow", "getActivityFlow$lib_gdpr_manager_externalDebug", "getActivityFlow$lib_gdpr_manager_externalDebug$annotations", "Lkotlin/Function1;", "onActivityStartedListener", "Lkotlin/jvm/functions/Function1;", "getOnActivityStartedListener$lib_gdpr_manager_externalDebug", "()Lkotlin/jvm/functions/Function1;", "setOnActivityStartedListener$lib_gdpr_manager_externalDebug", "(Lkotlin/jvm/functions/Function1;)V", "getOnActivityStartedListener$lib_gdpr_manager_externalDebug$annotations", "Lcom/robinhood/iso/countrycode/CountryCode;", "getUserCountryCode", "()Lcom/robinhood/iso/countrycode/CountryCode;", "userCountryCode", "getCurrentConsent", "()Lcom/robinhood/android/gdpr/GdprConsent;", "currentConsent", "Companion", "lib-gdpr-manager_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class GdprManager implements AppInitializedListener, ActivityLifecycleListener {
    private static final String CANCELLATION_REASON = "onAppInitialized has been called again, cancelling previous job";
    private final StateFlow2<WeakReference<Activity>> activityFlow;
    private final AppType appType;
    private final AuthManager authManager;
    private final Clock clock;
    private final GdprConsentCache consentCache;
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final GdprStore gdprStore;
    private Job job;
    private final Map<GdprConsentCategory, List<GdprManagedSdk>> managedSdksByCategory;
    private final Navigator navigator;
    private Function1<? super Activity, Unit> onActivityStartedListener;
    private final RegionApi regionApi;
    private final CoroutineScope rootCoroutineScope;
    private final StateFlow2<Unit> showConsentFlow;
    private final StringPreference userLocalityPref;

    /* compiled from: GdprManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gdpr.manager.GdprManager", m3645f = "GdprManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, 192}, m3647m = "setupInitialConsent")
    /* renamed from: com.robinhood.android.gdpr.manager.GdprManager$setupInitialConsent$1 */
    static final class C176861 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C176861(Continuation<? super C176861> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GdprManager.this.setupInitialConsent(this);
        }
    }

    /* compiled from: GdprManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gdpr.manager.GdprManager", m3645f = "GdprManager.kt", m3646l = {211, EnumC7081g.SDK_ASSET_ICON_PIN_VALUE}, m3647m = "setupLoggedOutInitialConsent")
    /* renamed from: com.robinhood.android.gdpr.manager.GdprManager$setupLoggedOutInitialConsent$1 */
    static final class C176871 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C176871(Continuation<? super C176871> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GdprManager.this.setupLoggedOutInitialConsent(this);
        }
    }

    /* compiled from: GdprManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gdpr.manager.GdprManager", m3645f = "GdprManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE}, m3647m = "syncConsent")
    /* renamed from: com.robinhood.android.gdpr.manager.GdprManager$syncConsent$1 */
    static final class C176881 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C176881(Continuation<? super C176881> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GdprManager.this.syncConsent(this);
        }
    }

    public static /* synthetic */ void getActivityFlow$lib_gdpr_manager_externalDebug$annotations() {
    }

    /* renamed from: getOnActivityStartedListener$lib_gdpr_manager_externalDebug$annotations */
    public static /* synthetic */ void m2046xce25c2e3() {
    }

    public static /* synthetic */ void getShowConsentFlow$lib_gdpr_manager_externalDebug$annotations() {
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        ActivityLifecycleListener.DefaultImpls.onActivityCreated(this, activity, bundle);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityDestroyed(this, activity);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityPaused(this, activity);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityResumed(this, activity);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        ActivityLifecycleListener.DefaultImpls.onActivitySaveInstanceState(this, activity, bundle);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityStopped(this, activity);
    }

    public GdprManager(@RootCoroutineScope CoroutineScope rootCoroutineScope, AuthManager authManager, Navigator navigator, RegionApi regionApi, GdprStore gdprStore, GdprConsentCache consentCache, @UserLocalityPref StringPreference userLocalityPref, EventLogger eventLogger, Clock clock, ExperimentsStore experimentsStore, AppType appType, Set<GdprManagedSdk> managedSdks) {
        Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(regionApi, "regionApi");
        Intrinsics.checkNotNullParameter(gdprStore, "gdprStore");
        Intrinsics.checkNotNullParameter(consentCache, "consentCache");
        Intrinsics.checkNotNullParameter(userLocalityPref, "userLocalityPref");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(managedSdks, "managedSdks");
        this.rootCoroutineScope = rootCoroutineScope;
        this.authManager = authManager;
        this.navigator = navigator;
        this.regionApi = regionApi;
        this.gdprStore = gdprStore;
        this.consentCache = consentCache;
        this.userLocalityPref = userLocalityPref;
        this.eventLogger = eventLogger;
        this.clock = clock;
        this.experimentsStore = experimentsStore;
        this.appType = appType;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : managedSdks) {
            GdprConsentCategory consentCategory = ((GdprManagedSdk) obj).getConsentCategory();
            Object arrayList = linkedHashMap.get(consentCategory);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(consentCategory, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.managedSdksByCategory = linkedHashMap;
        this.showConsentFlow = StateFlow4.MutableStateFlow(null);
        this.activityFlow = StateFlow4.MutableStateFlow(null);
        this.onActivityStartedListener = new Function1() { // from class: com.robinhood.android.gdpr.manager.GdprManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return GdprManager.onActivityStartedListener$lambda$1(this.f$0, (Activity) obj2);
            }
        };
    }

    public final StateFlow2<Unit> getShowConsentFlow$lib_gdpr_manager_externalDebug() {
        return this.showConsentFlow;
    }

    public final StateFlow2<WeakReference<Activity>> getActivityFlow$lib_gdpr_manager_externalDebug() {
        return this.activityFlow;
    }

    public final Function1<Activity, Unit> getOnActivityStartedListener$lib_gdpr_manager_externalDebug() {
        return this.onActivityStartedListener;
    }

    public final void setOnActivityStartedListener$lib_gdpr_manager_externalDebug(Function1<? super Activity, Unit> function1) {
        this.onActivityStartedListener = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onActivityStartedListener$lambda$1(GdprManager gdprManager, Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!(activity instanceof PrivacySettingsBottomSheetExclusion)) {
            gdprManager.activityFlow.tryEmit(new WeakReference<>(activity));
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.utils.AppInitializedListener
    public void onAppInitialized(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        Timber.Companion companion = Timber.INSTANCE;
        companion.mo3356i("onAppInitialized", new Object[0]);
        List<GdprManagedSdk> listFlatten = CollectionsKt.flatten(this.managedSdksByCategory.values());
        companion.mo3356i("SDK manifest: " + CollectionsKt.joinToString$default(listFlatten, null, null, null, 0, null, new Function1() { // from class: com.robinhood.android.gdpr.manager.GdprManager$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GdprManager.onAppInitialized$lambda$2((GdprManagedSdk) obj);
            }
        }, 31, null), new Object[0]);
        for (GdprManagedSdk gdprManagedSdk : listFlatten) {
            Timber.INSTANCE.mo3356i(gdprManagedSdk.getName() + " initializing", new Object[0]);
            gdprManagedSdk.onAppInitialized(app);
        }
        Job job = this.job;
        if (job != null) {
            Job6.cancel$default(job, CANCELLATION_REASON, null, 2, null);
        }
        this.job = BuildersKt__Builders_commonKt.launch$default(this.rootCoroutineScope, null, null, new C176853(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence onAppInitialized$lambda$2(GdprManagedSdk it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getName();
    }

    /* compiled from: GdprManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gdpr.manager.GdprManager$onAppInitialized$3", m3645f = "GdprManager.kt", m3646l = {93}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gdpr.manager.GdprManager$onAppInitialized$3 */
    static final class C176853 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C176853(Continuation<? super C176853> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C176853 c176853 = GdprManager.this.new C176853(continuation);
            c176853.L$0 = obj;
            return c176853;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C176853) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                GdprManager gdprManager = GdprManager.this;
                this.L$0 = coroutineScope2;
                this.label = 1;
                if (gdprManager.setupInitialConsent(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                coroutineScope = coroutineScope3;
            }
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(GdprManager.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(GdprManager.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(GdprManager.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(GdprManager.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(GdprManager.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(GdprManager.this, null), 3, null);
            return Unit.INSTANCE;
        }

        /* compiled from: GdprManager.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.gdpr.manager.GdprManager$onAppInitialized$3$1", m3645f = "GdprManager.kt", m3646l = {94}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.gdpr.manager.GdprManager$onAppInitialized$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ GdprManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(GdprManager gdprManager, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = gdprManager;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    GdprManager gdprManager = this.this$0;
                    this.label = 1;
                    if (gdprManager.handleHasCollectedConsent$lib_gdpr_manager_externalDebug(this) == coroutine_suspended) {
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

        /* compiled from: GdprManager.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.gdpr.manager.GdprManager$onAppInitialized$3$2", m3645f = "GdprManager.kt", m3646l = {95}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.gdpr.manager.GdprManager$onAppInitialized$3$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ GdprManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(GdprManager gdprManager, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = gdprManager;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    GdprManager gdprManager = this.this$0;
                    this.label = 1;
                    if (gdprManager.handleShowConsentBottomSheet$lib_gdpr_manager_externalDebug(this) == coroutine_suspended) {
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

        /* compiled from: GdprManager.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.gdpr.manager.GdprManager$onAppInitialized$3$3", m3645f = "GdprManager.kt", m3646l = {100}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.gdpr.manager.GdprManager$onAppInitialized$3$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ GdprManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(GdprManager gdprManager, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = gdprManager;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.this$0.consentCache.getFunctionalConsentFlow$lib_gdpr_manager_externalDebug());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: GdprManager.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "status", "Lcom/robinhood/android/gdpr/GdprConsentStatus;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.gdpr.manager.GdprManager$onAppInitialized$3$3$1", m3645f = "GdprManager.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.gdpr.manager.GdprManager$onAppInitialized$3$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GdprConsentStatus, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GdprManager this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(GdprManager gdprManager, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = gdprManager;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
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
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        GdprConsentStatus gdprConsentStatus = (GdprConsentStatus) this.L$0;
                        List list = (List) this.this$0.managedSdksByCategory.get(GdprConsentCategory.FUNCTIONAL);
                        if (list != null) {
                            GdprManager gdprManager = this.this$0;
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                gdprManager.updateConsentStatus((GdprManagedSdk) it.next(), gdprConsentStatus.getIsEnabled());
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: GdprManager.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.gdpr.manager.GdprManager$onAppInitialized$3$4", m3645f = "GdprManager.kt", m3646l = {110}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.gdpr.manager.GdprManager$onAppInitialized$3$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ GdprManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(GdprManager gdprManager, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = gdprManager;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.this$0.consentCache.getMarketingConsentFlow$lib_gdpr_manager_externalDebug());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: GdprManager.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "status", "Lcom/robinhood/android/gdpr/GdprConsentStatus;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.gdpr.manager.GdprManager$onAppInitialized$3$4$1", m3645f = "GdprManager.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.gdpr.manager.GdprManager$onAppInitialized$3$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GdprConsentStatus, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GdprManager this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(GdprManager gdprManager, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = gdprManager;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
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
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        GdprConsentStatus gdprConsentStatus = (GdprConsentStatus) this.L$0;
                        List list = (List) this.this$0.managedSdksByCategory.get(GdprConsentCategory.MARKETING);
                        if (list != null) {
                            GdprManager gdprManager = this.this$0;
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                gdprManager.updateConsentStatus((GdprManagedSdk) it.next(), gdprConsentStatus.getIsEnabled());
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: GdprManager.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.gdpr.manager.GdprManager$onAppInitialized$3$5", m3645f = "GdprManager.kt", m3646l = {120}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.gdpr.manager.GdprManager$onAppInitialized$3$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ GdprManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(GdprManager gdprManager, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = gdprManager;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.this$0.consentCache.getPerformanceConsentFlow$lib_gdpr_manager_externalDebug());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: GdprManager.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "status", "Lcom/robinhood/android/gdpr/GdprConsentStatus;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.gdpr.manager.GdprManager$onAppInitialized$3$5$1", m3645f = "GdprManager.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.gdpr.manager.GdprManager$onAppInitialized$3$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GdprConsentStatus, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GdprManager this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(GdprManager gdprManager, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = gdprManager;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
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
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        GdprConsentStatus gdprConsentStatus = (GdprConsentStatus) this.L$0;
                        List list = (List) this.this$0.managedSdksByCategory.get(GdprConsentCategory.PERFORMANCE);
                        if (list != null) {
                            GdprManager gdprManager = this.this$0;
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                gdprManager.updateConsentStatus((GdprManagedSdk) it.next(), gdprConsentStatus.getIsEnabled());
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: GdprManager.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.gdpr.manager.GdprManager$onAppInitialized$3$6", m3645f = "GdprManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.gdpr.manager.GdprManager$onAppInitialized$3$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ GdprManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(GdprManager gdprManager, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.this$0 = gdprManager;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.this$0.consentCache.getConsentFlow$lib_gdpr_manager_externalDebug());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: GdprManager.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m3636d2 = {"Lkotlin/Pair;", "Lcom/robinhood/android/gdpr/GdprConsent;", "j$/time/Instant", "<destruct>", "", "<anonymous>", "(Lkotlin/Pair;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
            @DebugMetadata(m3644c = "com.robinhood.android.gdpr.manager.GdprManager$onAppInitialized$3$6$1", m3645f = "GdprManager.kt", m3646l = {136}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.gdpr.manager.GdprManager$onAppInitialized$3$6$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends GdprConsent, ? extends Instant>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GdprManager this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(GdprManager gdprManager, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = gdprManager;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends GdprConsent, ? extends Instant> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<GdprConsent, Instant>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<GdprConsent, Instant> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    try {
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            Tuples2 tuples2 = (Tuples2) this.L$0;
                            GdprConsent gdprConsent = (GdprConsent) tuples2.component1();
                            Instant instant = (Instant) tuples2.component2();
                            if (instant != null) {
                                if (this.this$0.authManager.isLoggedIn() && this.this$0.getUserCountryCode().isGdprApplicable()) {
                                    GdprStore gdprStore = this.this$0.gdprStore;
                                    this.label = 1;
                                    if (gdprStore.postConsent(gdprConsent, instant, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                            return Unit.INSTANCE;
                        }
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e) {
                        Timber.INSTANCE.mo3354e(e);
                    }
                    return Unit.INSTANCE;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setConsent(GdprConsent consent) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        UserInteractionEventData.EventType eventType = null;
        Screen screen = null;
        ByteString byteString = null;
        Object[] objArr = 0 == true ? 1 : 0;
        EventLogger.DefaultImpls.logUserInteractionEvent$default(this.eventLogger, new UserInteractionEventData(eventType, screen, new Component(null, "GDPR_CONSENT_UPDATED", null, 5, null), UserInteractionEventData.Action.SAVE, consent.getLoggingContext(), objArr, byteString, 99, null), false, false, 6, null);
        this.consentCache.setConsent(consent, this.clock.instant());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object syncConsent(Continuation<? super Unit> continuation) {
        C176881 c176881;
        if (continuation instanceof C176881) {
            c176881 = (C176881) continuation;
            int i = c176881.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c176881.label = i - Integer.MIN_VALUE;
            } else {
                c176881 = new C176881(continuation);
            }
        }
        Object consent = c176881.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c176881.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(consent);
                if (this.authManager.isLoggedIn() && getUserCountryCode().isGdprApplicable()) {
                    GdprStore gdprStore = this.gdprStore;
                    c176881.label = 1;
                    consent = gdprStore.getConsent(c176881);
                    if (consent == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(consent);
            Tuples2 tuples2 = (Tuples2) consent;
            GdprConsent gdprConsent = (GdprConsent) tuples2.component1();
            Instant instant = (Instant) tuples2.component2();
            if (this.consentCache.getLastUpdated$lib_gdpr_manager_externalDebug() == null || instant.isAfter(this.consentCache.getLastUpdated$lib_gdpr_manager_externalDebug())) {
                this.consentCache.setConsent(gdprConsent, instant);
            }
        } catch (Exception e) {
            Timber.INSTANCE.mo3354e(e);
        }
        return Unit.INSTANCE;
    }

    public final GdprConsent getCurrentConsent() {
        return this.consentCache.getCurrentConsent$lib_gdpr_manager_externalDebug();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateConsentStatus(GdprManagedSdk managedSdk, boolean isEnabled) {
        Timber.INSTANCE.mo3356i(managedSdk.getName() + " updating consent status: " + isEnabled, new Object[0]);
        managedSdk.updateConsentStatus(isEnabled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (setupLoggedOutInitialConsent(r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setupInitialConsent(Continuation<? super Unit> continuation) {
        C176861 c176861;
        if (continuation instanceof C176861) {
            c176861 = (C176861) continuation;
            int i = c176861.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c176861.label = i - Integer.MIN_VALUE;
            } else {
                c176861 = new C176861(continuation);
            }
        }
        Object obj = c176861.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c176861.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c176861.label = 1;
            if (syncConsent(c176861) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        Timber.Companion companion = Timber.INSTANCE;
        companion.mo3356i("Setting up initial consent", new Object[0]);
        if (!this.consentCache.getInitialConsent().getHasCollectedConsent()) {
            companion.mo3356i("Has not collected all required consent.", new Object[0]);
            if (this.authManager.isLoggedIn()) {
                setupLoggedInInitialConsent();
            } else {
                c176861.label = 2;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CountryCode getUserCountryCode() {
        CountryCode instance;
        String str = this.userLocalityPref.get();
        return (str == null || (instance = CountryCode.INSTANCE.parseInstance(str)) == null) ? CountryCode.Supported.UnitedStates.INSTANCE : instance;
    }

    private final void setupLoggedInInitialConsent() {
        if (getUserCountryCode().isGdprApplicable()) {
            showConsentBottomSheet$lib_gdpr_manager_externalDebug();
        } else {
            this.consentCache.setConsent(GdprConsent.INSTANCE.getALL_GRANTED(), this.clock.instant());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        if (r8 == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setupLoggedOutInitialConsent(Continuation<? super Unit> continuation) {
        C176871 c176871;
        CountryCode.Companion companion;
        Object objM22650coGetState0E7RQCE$default;
        if (continuation instanceof C176871) {
            c176871 = (C176871) continuation;
            int i = c176871.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c176871.label = i - Integer.MIN_VALUE;
            } else {
                c176871 = new C176871(continuation);
            }
        }
        C176871 c1768712 = c176871;
        Object userRegion = c1768712.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c1768712.label;
        try {
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 4, null);
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(userRegion);
            companion = CountryCode.INSTANCE;
            RegionApi regionApi = this.regionApi;
            c1768712.L$0 = companion;
            c1768712.label = 1;
            userRegion = regionApi.getUserRegion(c1768712);
            if (userRegion == coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(userRegion);
            objM22650coGetState0E7RQCE$default = ((Result) userRegion).getValue();
            Boolean boolBoxBoolean = boxing.boxBoolean(false);
            if (Result.m28555isFailureimpl(objM22650coGetState0E7RQCE$default)) {
                objM22650coGetState0E7RQCE$default = boolBoxBoolean;
            }
            if (!((Boolean) objM22650coGetState0E7RQCE$default).booleanValue()) {
                showConsentBottomSheet$lib_gdpr_manager_externalDebug();
            }
            return Unit.INSTANCE;
        }
        companion = (CountryCode.Companion) c1768712.L$0;
        ResultKt.throwOnFailure(userRegion);
        if (companion.getInstance(((UserRegion) userRegion).getRegion()).isGdprApplicable()) {
            if (this.appType == AppType.RHC) {
                ExperimentsStore experimentsStore = this.experimentsStore;
                CryptoEuPrivacyScreenLaterExperiment cryptoEuPrivacyScreenLaterExperiment = CryptoEuPrivacyScreenLaterExperiment.INSTANCE;
                c1768712.L$0 = null;
                c1768712.label = 2;
                objM22650coGetState0E7RQCE$default = ExperimentsStore.m22650coGetState0E7RQCE$default(experimentsStore, cryptoEuPrivacyScreenLaterExperiment, false, c1768712, 2, null);
            }
            showConsentBottomSheet$lib_gdpr_manager_externalDebug();
            return Unit.INSTANCE;
        }
        this.consentCache.setConsent(GdprConsent.INSTANCE.getALL_GRANTED(), this.clock.instant());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        ActivityLifecycleListener.DefaultImpls.onActivityStarted(this, activity);
        Function1<? super Activity, Unit> function1 = this.onActivityStartedListener;
        if (function1 != null) {
            function1.invoke(activity);
        }
    }

    public final Object handleHasCollectedConsent$lib_gdpr_manager_externalDebug(Continuation<? super Unit> continuation) {
        final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.consentCache.getHasCollectedConsentFlow$lib_gdpr_manager_externalDebug());
        Object objCollect = new Flow<Boolean>() { // from class: com.robinhood.android.gdpr.manager.GdprManager$handleHasCollectedConsent$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation2) {
                Object objCollect2 = flowDistinctUntilChanged.collect(new C176832(flowCollector), continuation2);
                return objCollect2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect2 : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.gdpr.manager.GdprManager$handleHasCollectedConsent$$inlined$filter$1$2 */
            public static final class C176832<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.gdpr.manager.GdprManager$handleHasCollectedConsent$$inlined$filter$1$2", m3645f = "GdprManager.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.gdpr.manager.GdprManager$handleHasCollectedConsent$$inlined$filter$1$2$1, reason: invalid class name */
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
                        return C176832.this.emit(null, this);
                    }
                }

                public C176832(FlowCollector flowCollector) {
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
                        if (((Boolean) obj).booleanValue()) {
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
        }.collect(new FlowCollector() { // from class: com.robinhood.android.gdpr.manager.GdprManager$handleHasCollectedConsent$3
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
                return emit(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) continuation2);
            }

            public final Object emit(boolean z, Continuation<? super Unit> continuation2) {
                this.this$0.setOnActivityStartedListener$lib_gdpr_manager_externalDebug(null);
                return Unit.INSTANCE;
            }
        }, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    public final Object handleShowConsentBottomSheet$lib_gdpr_manager_externalDebug(Continuation<? super Unit> continuation) {
        Flow flowFilterNotNull = FlowKt.filterNotNull(this.showConsentFlow);
        final StateFlow2<WeakReference<Activity>> stateFlow2 = this.activityFlow;
        Object objCollect = FlowKt.flowCombine(flowFilterNotNull, FlowKt.distinctUntilChanged(FlowKt.filterNotNull(new Flow<Activity>() { // from class: com.robinhood.android.gdpr.manager.GdprManager$handleShowConsentBottomSheet$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Activity> flowCollector, Continuation continuation2) {
                Object objCollect2 = stateFlow2.collect(new C176842(flowCollector), continuation2);
                return objCollect2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect2 : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.gdpr.manager.GdprManager$handleShowConsentBottomSheet$$inlined$map$1$2 */
            public static final class C176842<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.gdpr.manager.GdprManager$handleShowConsentBottomSheet$$inlined$map$1$2", m3645f = "GdprManager.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.gdpr.manager.GdprManager$handleShowConsentBottomSheet$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C176842.this.emit(null, this);
                    }
                }

                public C176842(FlowCollector flowCollector) {
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
                        WeakReference weakReference = (WeakReference) obj;
                        Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(activity, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
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
        })), new GdprManager3(null)).collect(new FlowCollector() { // from class: com.robinhood.android.gdpr.manager.GdprManager$handleShowConsentBottomSheet$4
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
                return emit((Activity) obj, (Continuation<? super Unit>) continuation2);
            }

            public final Object emit(Activity activity, Continuation<? super Unit> continuation2) {
                if (this.this$0.consentCache.getCurrentConsent$lib_gdpr_manager_externalDebug().getHasCollectedConsent()) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Showing GDPR bottom sheet when already collected consent"), false, null, 6, null);
                }
                Navigator.DefaultImpls.startActivity$default(this.this$0.navigator, activity, PrivacySettingsBottomSheetActivityKey.INSTANCE, null, false, null, null, 60, null);
                return Unit.INSTANCE;
            }
        }, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    public final void showConsentBottomSheet$lib_gdpr_manager_externalDebug() {
        this.showConsentFlow.tryEmit(Unit.INSTANCE);
    }
}

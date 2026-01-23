package com.robinhood.android.configurationvitals;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.plaid.internal.EnumC7081g;
import com.robinhood.models.api.ConfigurationVitals;
import com.robinhood.models.api.UnsupportedVersionContent;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.LongPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.clearcache.CacheClearManager;
import com.robinhood.utils.RhProcessLifecycleOwner;
import com.robinhood.utils.RhProcessLifecycleOwner2;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.lifecycle.ActivityLifecycleListener;
import com.robinhood.utils.system.References;
import dagger.Lazy;
import dispatch.core.CoroutineScopeExt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import p479j$.time.Clock;

/* compiled from: ConfigurationVitalsManager.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002Bm\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\u00020!*\u00020\u001aH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b(\u0010'J\u0017\u0010+\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b-\u0010,R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010.R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010/R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00101R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00102R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00103R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00104R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00105R/\u0010>\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u0001068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006B"}, m3636d2 = {"Lcom/robinhood/android/configurationvitals/ConfigurationVitalsManager;", "Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "Lcom/robinhood/utils/ProcessLifecycleObserver;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Ldagger/Lazy;", "Lcom/robinhood/android/configurationvitals/ConfigurationVitalsPreference;", "preference", "Lcom/robinhood/android/configurationvitals/ForceUpdatePrompt;", "prompt", "Lcom/robinhood/android/configurationvitals/ConfigurationVitalsProvider;", "configurationVitalsProvider", "Lcom/robinhood/prefs/StringPreference;", "lastVitalsDismissPref", "Lcom/robinhood/prefs/LongPreference;", "lastClearCacheCreatedBeforeTimestamp", "Lcom/robinhood/prefs/BooleanPreference;", "vitalsEnabledPref", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/shared/clearcache/CacheClearManager;", "cacheClearManager", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "rhProcessLifecycleOwner", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Ldagger/Lazy;Lcom/robinhood/android/configurationvitals/ForceUpdatePrompt;Ldagger/Lazy;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/LongPreference;Lcom/robinhood/prefs/BooleanPreference;Lj$/time/Clock;Lcom/robinhood/shared/clearcache/CacheClearManager;Lcom/robinhood/utils/RhProcessLifecycleOwner;)V", "Lcom/robinhood/models/api/ConfigurationVitals;", "vitals", "", "handleVitals", "(Lcom/robinhood/models/api/ConfigurationVitals;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "promptIfNecessary", "()V", "", "hasAlreadyDismissed", "(Lcom/robinhood/models/api/ConfigurationVitals;)Z", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onStart", "(Landroidx/lifecycle/LifecycleOwner;)V", "onStop", "Landroid/app/Activity;", "activity", "onActivityResumed", "(Landroid/app/Activity;)V", "onActivityPaused", "Lkotlinx/coroutines/CoroutineScope;", "Ldagger/Lazy;", "Lcom/robinhood/android/configurationvitals/ForceUpdatePrompt;", "Lcom/robinhood/prefs/StringPreference;", "Lcom/robinhood/prefs/LongPreference;", "Lcom/robinhood/prefs/BooleanPreference;", "Lj$/time/Clock;", "Lcom/robinhood/shared/clearcache/CacheClearManager;", "Landroidx/fragment/app/FragmentActivity;", "<set-?>", "currentActivity$delegate", "Lkotlin/properties/ReadWriteProperty;", "getCurrentActivity", "()Landroidx/fragment/app/FragmentActivity;", "setCurrentActivity", "(Landroidx/fragment/app/FragmentActivity;)V", "currentActivity", "Lkotlinx/coroutines/Job;", "job", "Lkotlinx/coroutines/Job;", "lib-configuration-vitals_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class ConfigurationVitalsManager implements ActivityLifecycleListener, RhProcessLifecycleOwner2 {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConfigurationVitalsManager.class, "currentActivity", "getCurrentActivity()Landroidx/fragment/app/FragmentActivity;", 0))};
    private final CacheClearManager cacheClearManager;
    private final Clock clock;
    private final Lazy<ConfigurationVitalsProvider> configurationVitalsProvider;
    private final CoroutineScope coroutineScope;

    /* renamed from: currentActivity$delegate, reason: from kotlin metadata */
    private final Interfaces3 currentActivity;
    private Job job;
    private final LongPreference lastClearCacheCreatedBeforeTimestamp;
    private final StringPreference lastVitalsDismissPref;
    private final Lazy<ConfigurationVitalsPreference> preference;
    private final ForceUpdatePrompt prompt;
    private final BooleanPreference vitalsEnabledPref;

    /* compiled from: ConfigurationVitalsManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.configurationvitals.ConfigurationVitalsManager", m3645f = "ConfigurationVitalsManager.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, 101, 104}, m3647m = "handleVitals")
    /* renamed from: com.robinhood.android.configurationvitals.ConfigurationVitalsManager$handleVitals$1 */
    static final class C119421 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C119421(Continuation<? super C119421> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfigurationVitalsManager.this.handleVitals(null, this);
        }
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
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        ActivityLifecycleListener.DefaultImpls.onActivitySaveInstanceState(this, activity, bundle);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityStarted(this, activity);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityStopped(this, activity);
    }

    public ConfigurationVitalsManager(@RootCoroutineScope CoroutineScope coroutineScope, Lazy<ConfigurationVitalsPreference> preference, ForceUpdatePrompt prompt, Lazy<ConfigurationVitalsProvider> configurationVitalsProvider, @LastVitalsDismissPref StringPreference lastVitalsDismissPref, @LastClearCacheCreatedBeforeTimestamp LongPreference lastClearCacheCreatedBeforeTimestamp, @VitalsDebugPrefs2 BooleanPreference vitalsEnabledPref, Clock clock, CacheClearManager cacheClearManager, RhProcessLifecycleOwner rhProcessLifecycleOwner) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        Intrinsics.checkNotNullParameter(configurationVitalsProvider, "configurationVitalsProvider");
        Intrinsics.checkNotNullParameter(lastVitalsDismissPref, "lastVitalsDismissPref");
        Intrinsics.checkNotNullParameter(lastClearCacheCreatedBeforeTimestamp, "lastClearCacheCreatedBeforeTimestamp");
        Intrinsics.checkNotNullParameter(vitalsEnabledPref, "vitalsEnabledPref");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(cacheClearManager, "cacheClearManager");
        Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
        this.coroutineScope = coroutineScope;
        this.preference = preference;
        this.prompt = prompt;
        this.configurationVitalsProvider = configurationVitalsProvider;
        this.lastVitalsDismissPref = lastVitalsDismissPref;
        this.lastClearCacheCreatedBeforeTimestamp = lastClearCacheCreatedBeforeTimestamp;
        this.vitalsEnabledPref = vitalsEnabledPref;
        this.clock = clock;
        this.cacheClearManager = cacheClearManager;
        this.currentActivity = References.weak$default(null, 1, null);
        rhProcessLifecycleOwner.register(this);
    }

    private final FragmentActivity getCurrentActivity() {
        return (FragmentActivity) this.currentActivity.getValue(this, $$delegatedProperties[0]);
    }

    private final void setCurrentActivity(FragmentActivity fragmentActivity) {
        this.currentActivity.setValue(this, $$delegatedProperties[0], fragmentActivity);
    }

    /* compiled from: ConfigurationVitalsManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.configurationvitals.ConfigurationVitalsManager$onStart$1", m3645f = "ConfigurationVitalsManager.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, 62, 63}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.configurationvitals.ConfigurationVitalsManager$onStart$1 */
    static final class C119441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C119441(Continuation<? super C119441> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C119441 c119441 = ConfigurationVitalsManager.this.new C119441(continuation);
            c119441.L$0 = obj;
            return c119441;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C119441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00b3, code lost:
        
            if (com.robinhood.coroutines.RetryOnError.retryExponential$default(5, null, r0, r12, 2, null) == r6) goto L35;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x008f A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:8:0x0018, B:15:0x002c, B:33:0x009e, B:26:0x0089, B:28:0x008f), top: B:41:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x009e A[Catch: all -> 0x001d, PHI: r7
          0x009e: PHI (r7v5 com.robinhood.android.configurationvitals.ConfigurationVitalsProvider) = 
          (r7v4 com.robinhood.android.configurationvitals.ConfigurationVitalsProvider)
          (r7v6 com.robinhood.android.configurationvitals.ConfigurationVitalsProvider)
         binds: [B:27:0x008d, B:32:0x009d] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x001d, blocks: (B:8:0x0018, B:15:0x002c, B:33:0x009e, B:26:0x0089, B:28:0x008f), top: B:41:0x000e }] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean zIsNetworkRelated;
            CoroutineScope coroutineScope;
            Object objWithContext;
            ConfigurationVitalsProvider configurationVitalsProvider;
            Object objWithContext2;
            ConfigurationVitals value;
            ConfigurationVitalsProvider configurationVitalsProvider2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } finally {
                if (!zIsNetworkRelated) {
                }
                return Unit.INSTANCE;
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                Lazy lazy = ConfigurationVitalsManager.this.configurationVitalsProvider;
                CoroutineDispatcher defaultDispatcher = CoroutineScopeExt.getDefaultDispatcher(coroutineScope);
                C11940x2b342f22 c11940x2b342f22 = new C11940x2b342f22(lazy, null);
                this.L$0 = coroutineScope;
                this.label = 1;
                objWithContext = BuildersKt.withContext(defaultDispatcher, c11940x2b342f22, this);
                if (objWithContext != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                objWithContext = obj;
            } else {
                if (i == 2) {
                    ConfigurationVitalsProvider configurationVitalsProvider3 = (ConfigurationVitalsProvider) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    configurationVitalsProvider = configurationVitalsProvider3;
                    objWithContext2 = obj;
                    Intrinsics.checkNotNullExpressionValue(objWithContext2, "withContext(...)");
                    value = ((ConfigurationVitalsPreference) objWithContext2).getValue();
                    if (value == null) {
                        ConfigurationVitalsManager configurationVitalsManager = ConfigurationVitalsManager.this;
                        this.L$0 = configurationVitalsProvider;
                        this.label = 3;
                        if (configurationVitalsManager.handleVitals(value, this) != coroutine_suspended) {
                            configurationVitalsProvider2 = configurationVitalsProvider;
                            configurationVitalsProvider = configurationVitalsProvider2;
                            AnonymousClass2 anonymousClass2 = new AnonymousClass2(ConfigurationVitalsManager.this, configurationVitalsProvider, null);
                            this.L$0 = null;
                            this.label = 4;
                        }
                    } else {
                        AnonymousClass2 anonymousClass22 = new AnonymousClass2(ConfigurationVitalsManager.this, configurationVitalsProvider, null);
                        this.L$0 = null;
                        this.label = 4;
                    }
                    return coroutine_suspended;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                configurationVitalsProvider2 = (ConfigurationVitalsProvider) this.L$0;
                ResultKt.throwOnFailure(obj);
                configurationVitalsProvider = configurationVitalsProvider2;
                AnonymousClass2 anonymousClass222 = new AnonymousClass2(ConfigurationVitalsManager.this, configurationVitalsProvider, null);
                this.L$0 = null;
                this.label = 4;
            }
            Intrinsics.checkNotNullExpressionValue(objWithContext, "withContext(...)");
            configurationVitalsProvider = (ConfigurationVitalsProvider) objWithContext;
            Lazy lazy2 = ConfigurationVitalsManager.this.preference;
            CoroutineDispatcher defaultDispatcher2 = CoroutineScopeExt.getDefaultDispatcher(coroutineScope);
            C11941x2b342f23 c11941x2b342f23 = new C11941x2b342f23(lazy2, null);
            this.L$0 = configurationVitalsProvider;
            this.label = 2;
            objWithContext2 = BuildersKt.withContext(defaultDispatcher2, c11941x2b342f23, this);
            if (objWithContext2 != coroutine_suspended) {
                Intrinsics.checkNotNullExpressionValue(objWithContext2, "withContext(...)");
                value = ((ConfigurationVitalsPreference) objWithContext2).getValue();
                if (value == null) {
                }
            }
            return coroutine_suspended;
        }

        /* compiled from: ConfigurationVitalsManager.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.configurationvitals.ConfigurationVitalsManager$onStart$1$2", m3645f = "ConfigurationVitalsManager.kt", m3646l = {64, 64}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.configurationvitals.ConfigurationVitalsManager$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
            final /* synthetic */ ConfigurationVitalsProvider $provider;
            Object L$0;
            int label;
            final /* synthetic */ ConfigurationVitalsManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ConfigurationVitalsManager configurationVitalsManager, ConfigurationVitalsProvider configurationVitalsProvider, Continuation<? super AnonymousClass2> continuation) {
                super(1, continuation);
                this.this$0 = configurationVitalsManager;
                this.$provider = configurationVitalsProvider;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$provider, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
            
                if (r1.handleVitals((com.robinhood.models.api.ConfigurationVitals) r5, r4) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                ConfigurationVitalsManager configurationVitalsManager;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    configurationVitalsManager = this.this$0;
                    ConfigurationVitalsProvider configurationVitalsProvider = this.$provider;
                    this.L$0 = configurationVitalsManager;
                    this.label = 1;
                    obj = configurationVitalsProvider.getConfigurationVitals(this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                configurationVitalsManager = (ConfigurationVitalsManager) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = null;
                this.label = 2;
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.job = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C119441(null), 3, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        setCurrentActivity(activity instanceof FragmentActivity ? (FragmentActivity) activity : null);
        promptIfNecessary();
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity == getCurrentActivity()) {
            setCurrentActivity(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (dispatch.core.Suspend.withMain$default(null, r12, r0, 1, null) != r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleVitals(ConfigurationVitals configurationVitals, Continuation<? super Unit> continuation) {
        C119421 c119421;
        if (continuation instanceof C119421) {
            c119421 = (C119421) continuation;
            int i = c119421.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c119421.label = i - Integer.MIN_VALUE;
            } else {
                c119421 = new C119421(continuation);
            }
        }
        Object objWithContext = c119421.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c119421.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            Lazy<ConfigurationVitalsPreference> lazy = this.preference;
            CoroutineDispatcher coroutineDispatcher = CoroutineScopeExt.getDispatcherProvider(c119421.getContext()).getDefault();
            ConfigurationVitalsManager$handleVitals$$inlined$coGet$1 configurationVitalsManager$handleVitals$$inlined$coGet$1 = new ConfigurationVitalsManager$handleVitals$$inlined$coGet$1(lazy, null);
            c119421.L$0 = configurationVitals;
            c119421.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, configurationVitalsManager$handleVitals$$inlined$coGet$1, c119421);
            if (objWithContext != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            configurationVitals = (ConfigurationVitals) c119421.L$0;
            ResultKt.throwOnFailure(objWithContext);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithContext);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(objWithContext);
            C119432 c119432 = new C119432(null);
            c119421.L$0 = null;
            c119421.label = 3;
        }
        Intrinsics.checkNotNullExpressionValue(objWithContext, "withContext(...)");
        ConfigurationVitalsPreference configurationVitalsPreference = (ConfigurationVitalsPreference) objWithContext;
        if (!Intrinsics.areEqual(configurationVitals, configurationVitalsPreference.getValue())) {
            this.lastVitalsDismissPref.delete();
        }
        configurationVitalsPreference.setValue(configurationVitals);
        if (configurationVitals.getClearCacheCreatedBeforeTimestamp() != 0 && this.lastClearCacheCreatedBeforeTimestamp.get() < configurationVitals.getClearCacheCreatedBeforeTimestamp()) {
            this.lastClearCacheCreatedBeforeTimestamp.set(Math.max(configurationVitals.getClearCacheCreatedBeforeTimestamp(), this.clock.instant().getEpochSecond()));
            CacheClearManager cacheClearManager = this.cacheClearManager;
            c119421.L$0 = null;
            c119421.label = 2;
            if (cacheClearManager.clearCachesAndRestart(c119421) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        C119432 c1194322 = new C119432(null);
        c119421.L$0 = null;
        c119421.label = 3;
    }

    /* compiled from: ConfigurationVitalsManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.configurationvitals.ConfigurationVitalsManager$handleVitals$2", m3645f = "ConfigurationVitalsManager.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.configurationvitals.ConfigurationVitalsManager$handleVitals$2 */
    static final class C119432 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C119432(Continuation<? super C119432> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConfigurationVitalsManager.this.new C119432(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C119432) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ConfigurationVitalsManager.this.promptIfNecessary();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void promptIfNecessary() {
        ConfigurationVitals value;
        FragmentActivity currentActivity = getCurrentActivity();
        if (currentActivity == null || (value = this.preference.get().getValue()) == null || hasAlreadyDismissed(value)) {
            return;
        }
        UnsupportedVersionContent unsupportedVersionContent = value.getUnsupportedVersionContent();
        if (unsupportedVersionContent != null) {
            this.prompt.show(currentActivity, unsupportedVersionContent);
            this.vitalsEnabledPref.set(false);
        } else {
            this.prompt.dismiss(currentActivity);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        r5 = r4.lastVitalsDismissPref.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r5 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        r5 = p479j$.time.LocalDateTime.parse(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r5.plusDays(1).compareTo((p479j$.time.chrono.ChronoLocalDateTime<?>) p479j$.time.LocalDateTime.now()) <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        r4.lastVitalsDismissPref.delete();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean hasAlreadyDismissed(ConfigurationVitals configurationVitals) {
        UnsupportedVersionContent unsupportedVersionContent = configurationVitals.getUnsupportedVersionContent();
        if (unsupportedVersionContent == null) {
            return false;
        }
        List<UnsupportedVersionContent.Button> buttons = unsupportedVersionContent.getButtons();
        if (!(buttons instanceof Collection) || !buttons.isEmpty()) {
            Iterator<T> it = buttons.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((UnsupportedVersionContent.Button) it.next()).getAction() instanceof UnsupportedVersionContent.Button.Action.Dismiss) {
                    break;
                }
            }
        }
        return false;
    }
}

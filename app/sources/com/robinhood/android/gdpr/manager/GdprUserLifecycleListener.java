package com.robinhood.android.gdpr.manager;

import android.content.Context;
import com.robinhood.android.data.store.gdpr.GdprStore;
import com.robinhood.android.gdpr.GdprConsent;
import com.robinhood.android.util.login.UserLifecycleListener;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserLocalityPref;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Instant;
import timber.log.Timber;

/* compiled from: GdprUserLifecycleListener.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/gdpr/manager/GdprUserLifecycleListener;", "Lcom/robinhood/android/util/login/UserLifecycleListener;", "rootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "userLocalityPref", "Lcom/robinhood/prefs/StringPreference;", "gdprStore", "Lcom/robinhood/android/data/store/gdpr/GdprStore;", "consentCache", "Lcom/robinhood/android/gdpr/manager/GdprConsentCache;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/android/data/store/gdpr/GdprStore;Lcom/robinhood/android/gdpr/manager/GdprConsentCache;)V", "onUserStateChanged", "", "context", "Landroid/content/Context;", "newState", "Lcom/robinhood/android/util/login/UserLifecycleListener$State;", "userCountryCode", "Lcom/robinhood/iso/countrycode/CountryCode;", "getUserCountryCode", "()Lcom/robinhood/iso/countrycode/CountryCode;", "lib-gdpr-manager_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class GdprUserLifecycleListener implements UserLifecycleListener {
    private final GdprConsentCache consentCache;
    private final GdprStore gdprStore;
    private final CoroutineScope rootCoroutineScope;
    private final StringPreference userLocalityPref;

    public GdprUserLifecycleListener(@RootCoroutineScope CoroutineScope rootCoroutineScope, @UserLocalityPref StringPreference userLocalityPref, GdprStore gdprStore, GdprConsentCache consentCache) {
        Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
        Intrinsics.checkNotNullParameter(userLocalityPref, "userLocalityPref");
        Intrinsics.checkNotNullParameter(gdprStore, "gdprStore");
        Intrinsics.checkNotNullParameter(consentCache, "consentCache");
        this.rootCoroutineScope = rootCoroutineScope;
        this.userLocalityPref = userLocalityPref;
        this.gdprStore = gdprStore;
        this.consentCache = consentCache;
    }

    @Override // com.robinhood.android.util.login.UserLifecycleListener
    public void onUserStateChanged(Context context, UserLifecycleListener.State newState) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(newState, "newState");
        if (newState != UserLifecycleListener.State.LOGGED_IN || !getUserCountryCode().isGdprApplicable() || Intrinsics.areEqual(this.consentCache.getCurrentConsent$lib_gdpr_manager_externalDebug(), GdprConsent.INSTANCE.getALL_UNKNOWN()) || this.consentCache.getLastUpdated$lib_gdpr_manager_externalDebug() == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.rootCoroutineScope, null, null, new C176891(null), 3, null);
    }

    /* compiled from: GdprUserLifecycleListener.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gdpr.manager.GdprUserLifecycleListener$onUserStateChanged$1", m3645f = "GdprUserLifecycleListener.kt", m3646l = {41}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gdpr.manager.GdprUserLifecycleListener$onUserStateChanged$1 */
    /* loaded from: classes10.dex */
    static final class C176891 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        C176891(Continuation<? super C176891> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GdprUserLifecycleListener.this.new C176891(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C176891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            GdprUserLifecycleListener gdprUserLifecycleListener;
            Instant instant;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Exception e) {
                Timber.INSTANCE.mo3354e(e);
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Instant lastUpdated$lib_gdpr_manager_externalDebug = GdprUserLifecycleListener.this.consentCache.getLastUpdated$lib_gdpr_manager_externalDebug();
                if (lastUpdated$lib_gdpr_manager_externalDebug != null) {
                    gdprUserLifecycleListener = GdprUserLifecycleListener.this;
                    GdprStore gdprStore = gdprUserLifecycleListener.gdprStore;
                    GdprConsent currentConsent$lib_gdpr_manager_externalDebug = gdprUserLifecycleListener.consentCache.getCurrentConsent$lib_gdpr_manager_externalDebug();
                    this.L$0 = gdprUserLifecycleListener;
                    this.L$1 = lastUpdated$lib_gdpr_manager_externalDebug;
                    this.label = 1;
                    Object objPostConsent = gdprStore.postConsent(currentConsent$lib_gdpr_manager_externalDebug, lastUpdated$lib_gdpr_manager_externalDebug, this);
                    if (objPostConsent == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    instant = lastUpdated$lib_gdpr_manager_externalDebug;
                    obj = objPostConsent;
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            instant = (Instant) this.L$1;
            gdprUserLifecycleListener = (GdprUserLifecycleListener) this.L$0;
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) obj;
            GdprConsent gdprConsent = (GdprConsent) tuples2.component1();
            Instant instant2 = (Instant) tuples2.component2();
            if (instant2.isAfter(instant)) {
                gdprUserLifecycleListener.consentCache.setConsent(gdprConsent, instant2);
            }
            return Unit.INSTANCE;
        }
    }

    private final CountryCode getUserCountryCode() {
        CountryCode instance;
        String str = this.userLocalityPref.get();
        return (str == null || (instance = CountryCode.INSTANCE.parseInstance(str)) == null) ? CountryCode.Supported.UnitedStates.INSTANCE : instance;
    }
}

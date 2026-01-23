package com.robinhood.android.authlock.pin;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.MoshiSecurePreference;
import com.robinhood.prefs.StringPreference;
import dagger.internal.Factory;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PinManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Br\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012#\u0010\u0006\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\u0002\b\n0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0006\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\u0002\b\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/authlock/pin/PinManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/authlock/pin/PinManager;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "userPinPref", "Lcom/robinhood/prefs/MoshiSecurePreference;", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "pinPref", "Lcom/robinhood/prefs/StringPreference;", "failedAttemptsPref", "Lcom/robinhood/prefs/IntPreference;", "userUuidPref", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-auth-lock_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PinManager_Factory implements Factory<PinManager> {
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<IntPreference> failedAttemptsPref;
    private final Provider<StringPreference> pinPref;
    private final Provider<MoshiSecurePreference<Map<String, String>>> userPinPref;
    private final Provider<StringPreference> userUuidPref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PinManager_Factory create(Provider<CoroutineScope> provider, Provider<MoshiSecurePreference<Map<String, String>>> provider2, Provider<StringPreference> provider3, Provider<IntPreference> provider4, Provider<StringPreference> provider5, Provider<ExperimentsStore> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final PinManager newInstance(CoroutineScope coroutineScope, MoshiSecurePreference<Map<String, String>> moshiSecurePreference, StringPreference stringPreference, IntPreference intPreference, StringPreference stringPreference2, ExperimentsStore experimentsStore) {
        return INSTANCE.newInstance(coroutineScope, moshiSecurePreference, stringPreference, intPreference, stringPreference2, experimentsStore);
    }

    public PinManager_Factory(Provider<CoroutineScope> coroutineScope, Provider<MoshiSecurePreference<Map<String, String>>> userPinPref, Provider<StringPreference> pinPref, Provider<IntPreference> failedAttemptsPref, Provider<StringPreference> userUuidPref, Provider<ExperimentsStore> experimentsStore) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(userPinPref, "userPinPref");
        Intrinsics.checkNotNullParameter(pinPref, "pinPref");
        Intrinsics.checkNotNullParameter(failedAttemptsPref, "failedAttemptsPref");
        Intrinsics.checkNotNullParameter(userUuidPref, "userUuidPref");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        this.coroutineScope = coroutineScope;
        this.userPinPref = userPinPref;
        this.pinPref = pinPref;
        this.failedAttemptsPref = failedAttemptsPref;
        this.userUuidPref = userUuidPref;
        this.experimentsStore = experimentsStore;
    }

    @Override // javax.inject.Provider
    public PinManager get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        MoshiSecurePreference<Map<String, String>> moshiSecurePreference = this.userPinPref.get();
        Intrinsics.checkNotNullExpressionValue(moshiSecurePreference, "get(...)");
        StringPreference stringPreference = this.pinPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        IntPreference intPreference = this.failedAttemptsPref.get();
        Intrinsics.checkNotNullExpressionValue(intPreference, "get(...)");
        StringPreference stringPreference2 = this.userUuidPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference2, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        return companion.newInstance(coroutineScope, moshiSecurePreference, stringPreference, intPreference, stringPreference2, experimentsStore);
    }

    /* compiled from: PinManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Js\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072#\u0010\t\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b0\n¢\u0006\u0002\b\r0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007JO\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u001d\u0010\t\u001a\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b0\n¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/authlock/pin/PinManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/authlock/pin/PinManager_Factory;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "userPinPref", "Lcom/robinhood/prefs/MoshiSecurePreference;", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "pinPref", "Lcom/robinhood/prefs/StringPreference;", "failedAttemptsPref", "Lcom/robinhood/prefs/IntPreference;", "userUuidPref", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "newInstance", "Lcom/robinhood/android/authlock/pin/PinManager;", "lib-auth-lock_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PinManager_Factory create(Provider<CoroutineScope> coroutineScope, Provider<MoshiSecurePreference<Map<String, String>>> userPinPref, Provider<StringPreference> pinPref, Provider<IntPreference> failedAttemptsPref, Provider<StringPreference> userUuidPref, Provider<ExperimentsStore> experimentsStore) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(userPinPref, "userPinPref");
            Intrinsics.checkNotNullParameter(pinPref, "pinPref");
            Intrinsics.checkNotNullParameter(failedAttemptsPref, "failedAttemptsPref");
            Intrinsics.checkNotNullParameter(userUuidPref, "userUuidPref");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            return new PinManager_Factory(coroutineScope, userPinPref, pinPref, failedAttemptsPref, userUuidPref, experimentsStore);
        }

        @JvmStatic
        public final PinManager newInstance(CoroutineScope coroutineScope, MoshiSecurePreference<Map<String, String>> userPinPref, StringPreference pinPref, IntPreference failedAttemptsPref, StringPreference userUuidPref, ExperimentsStore experimentsStore) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(userPinPref, "userPinPref");
            Intrinsics.checkNotNullParameter(pinPref, "pinPref");
            Intrinsics.checkNotNullParameter(failedAttemptsPref, "failedAttemptsPref");
            Intrinsics.checkNotNullParameter(userUuidPref, "userUuidPref");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            return new PinManager(coroutineScope, userPinPref, pinPref, failedAttemptsPref, userUuidPref, experimentsStore);
        }
    }
}

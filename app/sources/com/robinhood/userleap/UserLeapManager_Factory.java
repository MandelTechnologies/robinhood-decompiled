package com.robinhood.userleap;

import android.app.Application;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.prefs.StringPreference;
import com.userleap.UserLeap;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: UserLeapManager_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/userleap/UserLeapManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/userleap/UserLeapManager;", "rootScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "app", "Landroid/app/Application;", "userLeap", "Lcom/userleap/UserLeap;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "userLeapUserIdPref", "Lcom/robinhood/prefs/StringPreference;", "userLocalityPref", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-userleap_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class UserLeapManager_Factory implements Factory<SurveyManager3> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Application> app;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<CoroutineScope> rootScope;
    private final Provider<UserLeap> userLeap;
    private final Provider<StringPreference> userLeapUserIdPref;
    private final Provider<StringPreference> userLocalityPref;

    @JvmStatic
    public static final UserLeapManager_Factory create(Provider<CoroutineScope> provider, Provider<Application> provider2, Provider<UserLeap> provider3, Provider<ExperimentsStore> provider4, Provider<StringPreference> provider5, Provider<StringPreference> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final SurveyManager3 newInstance(CoroutineScope coroutineScope, Application application, UserLeap userLeap, ExperimentsStore experimentsStore, StringPreference stringPreference, StringPreference stringPreference2) {
        return INSTANCE.newInstance(coroutineScope, application, userLeap, experimentsStore, stringPreference, stringPreference2);
    }

    public UserLeapManager_Factory(Provider<CoroutineScope> rootScope, Provider<Application> app, Provider<UserLeap> userLeap, Provider<ExperimentsStore> experimentsStore, Provider<StringPreference> userLeapUserIdPref, Provider<StringPreference> userLocalityPref) {
        Intrinsics.checkNotNullParameter(rootScope, "rootScope");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(userLeap, "userLeap");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(userLeapUserIdPref, "userLeapUserIdPref");
        Intrinsics.checkNotNullParameter(userLocalityPref, "userLocalityPref");
        this.rootScope = rootScope;
        this.app = app;
        this.userLeap = userLeap;
        this.experimentsStore = experimentsStore;
        this.userLeapUserIdPref = userLeapUserIdPref;
        this.userLocalityPref = userLocalityPref;
    }

    @Override // javax.inject.Provider
    public SurveyManager3 get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.rootScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        Application application = this.app.get();
        Intrinsics.checkNotNullExpressionValue(application, "get(...)");
        UserLeap userLeap = this.userLeap.get();
        Intrinsics.checkNotNullExpressionValue(userLeap, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        StringPreference stringPreference = this.userLeapUserIdPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        StringPreference stringPreference2 = this.userLocalityPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference2, "get(...)");
        return companion.newInstance(coroutineScope, application, userLeap, experimentsStore, stringPreference, stringPreference2);
    }

    /* compiled from: UserLeapManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J8\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/userleap/UserLeapManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/userleap/UserLeapManager_Factory;", "rootScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "app", "Landroid/app/Application;", "userLeap", "Lcom/userleap/UserLeap;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "userLeapUserIdPref", "Lcom/robinhood/prefs/StringPreference;", "userLocalityPref", "newInstance", "Lcom/robinhood/userleap/UserLeapManager;", "lib-userleap_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final UserLeapManager_Factory create(Provider<CoroutineScope> rootScope, Provider<Application> app, Provider<UserLeap> userLeap, Provider<ExperimentsStore> experimentsStore, Provider<StringPreference> userLeapUserIdPref, Provider<StringPreference> userLocalityPref) {
            Intrinsics.checkNotNullParameter(rootScope, "rootScope");
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(userLeap, "userLeap");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(userLeapUserIdPref, "userLeapUserIdPref");
            Intrinsics.checkNotNullParameter(userLocalityPref, "userLocalityPref");
            return new UserLeapManager_Factory(rootScope, app, userLeap, experimentsStore, userLeapUserIdPref, userLocalityPref);
        }

        @JvmStatic
        public final SurveyManager3 newInstance(CoroutineScope rootScope, Application app, UserLeap userLeap, ExperimentsStore experimentsStore, StringPreference userLeapUserIdPref, StringPreference userLocalityPref) {
            Intrinsics.checkNotNullParameter(rootScope, "rootScope");
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(userLeap, "userLeap");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(userLeapUserIdPref, "userLeapUserIdPref");
            Intrinsics.checkNotNullParameter(userLocalityPref, "userLocalityPref");
            return new SurveyManager3(rootScope, app, userLeap, experimentsStore, userLeapUserIdPref, userLocalityPref);
        }
    }
}

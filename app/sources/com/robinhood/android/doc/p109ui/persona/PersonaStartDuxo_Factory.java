package com.robinhood.android.doc.p109ui.persona;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.api.retrofit.Identi;
import com.robinhood.api.retrofit.PathfinderApi;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.prefs.Installation;
import com.robinhood.shared.security.auth.AuthManager;
import dagger.internal.Factory;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PersonaStartDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0085\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/PersonaStartDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/doc/ui/persona/PersonaStartDuxo;", "identi", "Ljavax/inject/Provider;", "Lcom/robinhood/api/retrofit/Identi;", "pathfinderApi", "Lcom/robinhood/api/retrofit/PathfinderApi;", "installation", "Lcom/robinhood/prefs/Installation;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "markwon", "Lio/noties/markwon/Markwon;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PersonaStartDuxo_Factory implements Factory<PersonaStartDuxo> {
    private final Provider<AgreementsStore> agreementsStore;
    private final Provider<AuthManager> authManager;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<Identi> identi;
    private final Provider<Installation> installation;
    private final Provider<Markwon> markwon;
    private final Provider<PathfinderApi> pathfinderApi;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PersonaStartDuxo_Factory create(Provider<Identi> provider, Provider<PathfinderApi> provider2, Provider<Installation> provider3, Provider<AuthManager> provider4, Provider<AgreementsStore> provider5, Provider<Markwon> provider6, Provider<ExperimentsStore> provider7, Provider<SavedStateHandle> provider8, Provider<DuxoBundle> provider9) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @JvmStatic
    public static final PersonaStartDuxo newInstance(Identi identi2, PathfinderApi pathfinderApi, Installation installation, AuthManager authManager, AgreementsStore agreementsStore, Markwon markwon, ExperimentsStore experimentsStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(identi2, pathfinderApi, installation, authManager, agreementsStore, markwon, experimentsStore, savedStateHandle, duxoBundle);
    }

    public PersonaStartDuxo_Factory(Provider<Identi> identi2, Provider<PathfinderApi> pathfinderApi, Provider<Installation> installation, Provider<AuthManager> authManager, Provider<AgreementsStore> agreementsStore, Provider<Markwon> markwon, Provider<ExperimentsStore> experimentsStore, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(identi2, "identi");
        Intrinsics.checkNotNullParameter(pathfinderApi, "pathfinderApi");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.identi = identi2;
        this.pathfinderApi = pathfinderApi;
        this.installation = installation;
        this.authManager = authManager;
        this.agreementsStore = agreementsStore;
        this.markwon = markwon;
        this.experimentsStore = experimentsStore;
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public PersonaStartDuxo get() {
        Companion companion = INSTANCE;
        Identi identi2 = this.identi.get();
        Intrinsics.checkNotNullExpressionValue(identi2, "get(...)");
        PathfinderApi pathfinderApi = this.pathfinderApi.get();
        Intrinsics.checkNotNullExpressionValue(pathfinderApi, "get(...)");
        Installation installation = this.installation.get();
        Intrinsics.checkNotNullExpressionValue(installation, "get(...)");
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        AgreementsStore agreementsStore = this.agreementsStore.get();
        Intrinsics.checkNotNullExpressionValue(agreementsStore, "get(...)");
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(identi2, pathfinderApi, installation, authManager, agreementsStore, markwon, experimentsStore, savedStateHandle, duxoBundle);
    }

    /* compiled from: PersonaStartDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0086\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H\u0007JP\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/PersonaStartDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/doc/ui/persona/PersonaStartDuxo_Factory;", "identi", "Ljavax/inject/Provider;", "Lcom/robinhood/api/retrofit/Identi;", "pathfinderApi", "Lcom/robinhood/api/retrofit/PathfinderApi;", "installation", "Lcom/robinhood/prefs/Installation;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "markwon", "Lio/noties/markwon/Markwon;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/doc/ui/persona/PersonaStartDuxo;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PersonaStartDuxo_Factory create(Provider<Identi> identi2, Provider<PathfinderApi> pathfinderApi, Provider<Installation> installation, Provider<AuthManager> authManager, Provider<AgreementsStore> agreementsStore, Provider<Markwon> markwon, Provider<ExperimentsStore> experimentsStore, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(identi2, "identi");
            Intrinsics.checkNotNullParameter(pathfinderApi, "pathfinderApi");
            Intrinsics.checkNotNullParameter(installation, "installation");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new PersonaStartDuxo_Factory(identi2, pathfinderApi, installation, authManager, agreementsStore, markwon, experimentsStore, savedStateHandle, duxoBundle);
        }

        @JvmStatic
        public final PersonaStartDuxo newInstance(Identi identi2, PathfinderApi pathfinderApi, Installation installation, AuthManager authManager, AgreementsStore agreementsStore, Markwon markwon, ExperimentsStore experimentsStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(identi2, "identi");
            Intrinsics.checkNotNullParameter(pathfinderApi, "pathfinderApi");
            Intrinsics.checkNotNullParameter(installation, "installation");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new PersonaStartDuxo(identi2, pathfinderApi, installation, authManager, agreementsStore, markwon, experimentsStore, savedStateHandle, duxoBundle);
        }
    }
}

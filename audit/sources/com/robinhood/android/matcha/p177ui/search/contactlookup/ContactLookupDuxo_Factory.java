package com.robinhood.android.matcha.p177ui.search.contactlookup;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.store.matcha.MatchaSearchStore;
import com.robinhood.android.udf.DuxoBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContactLookupDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupDuxo;", "searchStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/store/matcha/MatchaSearchStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ContactLookupDuxo_Factory implements Factory<ContactLookupDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<MatchaSearchStore> searchStore;
    private final Provider<ContactLookupStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final ContactLookupDuxo_Factory create(Provider<MatchaSearchStore> provider, Provider<DuxoBundle> provider2, Provider<SavedStateHandle> provider3, Provider<ContactLookupStateProvider> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final ContactLookupDuxo newInstance(MatchaSearchStore matchaSearchStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, ContactLookupStateProvider contactLookupStateProvider) {
        return INSTANCE.newInstance(matchaSearchStore, duxoBundle, savedStateHandle, contactLookupStateProvider);
    }

    public ContactLookupDuxo_Factory(Provider<MatchaSearchStore> searchStore, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<ContactLookupStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(searchStore, "searchStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.searchStore = searchStore;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public ContactLookupDuxo get() {
        Companion companion = INSTANCE;
        MatchaSearchStore matchaSearchStore = this.searchStore.get();
        Intrinsics.checkNotNullExpressionValue(matchaSearchStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        ContactLookupStateProvider contactLookupStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(contactLookupStateProvider, "get(...)");
        return companion.newInstance(matchaSearchStore, duxoBundle, savedStateHandle, contactLookupStateProvider);
    }

    /* compiled from: ContactLookupDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupDuxo_Factory;", "searchStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/store/matcha/MatchaSearchStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupStateProvider;", "newInstance", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupDuxo;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ContactLookupDuxo_Factory create(Provider<MatchaSearchStore> searchStore, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<ContactLookupStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(searchStore, "searchStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new ContactLookupDuxo_Factory(searchStore, duxoBundle, savedStateHandle, stateProvider);
        }

        @JvmStatic
        public final ContactLookupDuxo newInstance(MatchaSearchStore searchStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, ContactLookupStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(searchStore, "searchStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new ContactLookupDuxo(searchStore, duxoBundle, savedStateHandle, stateProvider);
        }
    }
}

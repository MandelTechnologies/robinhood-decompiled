package com.robinhood.android.search.newsfeed.marketupdates;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import dagger.MembersInjector;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewsFeedMarketUpdatesView_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/marketupdates/NewsFeedMarketUpdatesView_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/search/newsfeed/marketupdates/NewsFeedMarketUpdatesView;", "markwon", "Ljavax/inject/Provider;", "Lio/noties/markwon/Markwon;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class NewsFeedMarketUpdatesView_MembersInjector implements MembersInjector<NewsFeedMarketUpdatesView> {
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<Markwon> markwon;
    private final Provider<Navigator> navigator;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<NewsFeedMarketUpdatesView> create(Provider<Markwon> provider, Provider<Navigator> provider2, Provider<ExperimentsStore> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectExperimentsStore(NewsFeedMarketUpdatesView newsFeedMarketUpdatesView, ExperimentsStore experimentsStore) {
        INSTANCE.injectExperimentsStore(newsFeedMarketUpdatesView, experimentsStore);
    }

    @JvmStatic
    public static final void injectMarkwon(NewsFeedMarketUpdatesView newsFeedMarketUpdatesView, Markwon markwon) {
        INSTANCE.injectMarkwon(newsFeedMarketUpdatesView, markwon);
    }

    @JvmStatic
    public static final void injectNavigator(NewsFeedMarketUpdatesView newsFeedMarketUpdatesView, Navigator navigator) {
        INSTANCE.injectNavigator(newsFeedMarketUpdatesView, navigator);
    }

    public NewsFeedMarketUpdatesView_MembersInjector(Provider<Markwon> markwon, Provider<Navigator> navigator, Provider<ExperimentsStore> experimentsStore) {
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        this.markwon = markwon;
        this.navigator = navigator;
        this.experimentsStore = experimentsStore;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(NewsFeedMarketUpdatesView instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        companion.injectMarkwon(instance, markwon);
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        companion.injectNavigator(instance, navigator);
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        companion.injectExperimentsStore(instance, experimentsStore);
    }

    /* compiled from: NewsFeedMarketUpdatesView_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/marketupdates/NewsFeedMarketUpdatesView_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/search/newsfeed/marketupdates/NewsFeedMarketUpdatesView;", "markwon", "Ljavax/inject/Provider;", "Lio/noties/markwon/Markwon;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "injectMarkwon", "", "instance", "injectNavigator", "injectExperimentsStore", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<NewsFeedMarketUpdatesView> create(Provider<Markwon> markwon, Provider<Navigator> navigator, Provider<ExperimentsStore> experimentsStore) {
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            return new NewsFeedMarketUpdatesView_MembersInjector(markwon, navigator, experimentsStore);
        }

        @JvmStatic
        public final void injectMarkwon(NewsFeedMarketUpdatesView instance, Markwon markwon) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            instance.setMarkwon(markwon);
        }

        @JvmStatic
        public final void injectNavigator(NewsFeedMarketUpdatesView instance, Navigator navigator) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            instance.setNavigator(navigator);
        }

        @JvmStatic
        public final void injectExperimentsStore(NewsFeedMarketUpdatesView instance, ExperimentsStore experimentsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            instance.setExperimentsStore(experimentsStore);
        }
    }
}

package com.robinhood.android.search.newsfeed.view;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.newsfeed.p200ui.QuoteFetcher;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewsFeedInstrumentView_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/view/NewsFeedInstrumentView_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/search/newsfeed/view/NewsFeedInstrumentView;", "quoteFetcher", "Ljavax/inject/Provider;", "Lcom/robinhood/android/newsfeed/ui/QuoteFetcher;", "<init>", "(Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class NewsFeedInstrumentView_MembersInjector implements MembersInjector<NewsFeedInstrumentView> {
    private final Provider<QuoteFetcher> quoteFetcher;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<NewsFeedInstrumentView> create(Provider<QuoteFetcher> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final void injectQuoteFetcher(NewsFeedInstrumentView newsFeedInstrumentView, QuoteFetcher quoteFetcher) {
        INSTANCE.injectQuoteFetcher(newsFeedInstrumentView, quoteFetcher);
    }

    public NewsFeedInstrumentView_MembersInjector(Provider<QuoteFetcher> quoteFetcher) {
        Intrinsics.checkNotNullParameter(quoteFetcher, "quoteFetcher");
        this.quoteFetcher = quoteFetcher;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(NewsFeedInstrumentView instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        QuoteFetcher quoteFetcher = this.quoteFetcher.get();
        Intrinsics.checkNotNullExpressionValue(quoteFetcher, "get(...)");
        companion.injectQuoteFetcher(instance, quoteFetcher);
    }

    /* compiled from: NewsFeedInstrumentView_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/view/NewsFeedInstrumentView_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/search/newsfeed/view/NewsFeedInstrumentView;", "quoteFetcher", "Ljavax/inject/Provider;", "Lcom/robinhood/android/newsfeed/ui/QuoteFetcher;", "injectQuoteFetcher", "", "instance", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<NewsFeedInstrumentView> create(Provider<QuoteFetcher> quoteFetcher) {
            Intrinsics.checkNotNullParameter(quoteFetcher, "quoteFetcher");
            return new NewsFeedInstrumentView_MembersInjector(quoteFetcher);
        }

        @JvmStatic
        public final void injectQuoteFetcher(NewsFeedInstrumentView instance, QuoteFetcher quoteFetcher) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(quoteFetcher, "quoteFetcher");
            instance.setQuoteFetcher(quoteFetcher);
        }
    }
}

package com.robinhood.android.search.highlights;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.models.card.p311db.Card;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Clock;

/* compiled from: SearchHighlightsManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/SearchHighlightsManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/search/highlights/SearchHighlightsManager;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "microgramManager", "j$/time/Clock", Card.Icon.CLOCK, "Lkotlinx/coroutines/CoroutineScope;", "rootScope", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/search/highlights/SearchHighlightsManager;", "Ljavax/inject/Provider;", "Companion", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class SearchHighlightsManager_Factory implements Factory<SearchHighlightsManager> {
    private final Provider<Clock> clock;
    private final Provider<MicrogramManager> microgramManager;
    private final Provider<CoroutineScope> rootScope;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final SearchHighlightsManager_Factory create(Provider<MicrogramManager> provider, Provider<Clock> provider2, Provider<CoroutineScope> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final SearchHighlightsManager newInstance(MicrogramManager microgramManager, Clock clock, CoroutineScope coroutineScope) {
        return INSTANCE.newInstance(microgramManager, clock, coroutineScope);
    }

    public SearchHighlightsManager_Factory(Provider<MicrogramManager> microgramManager, Provider<Clock> clock, Provider<CoroutineScope> rootScope) {
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(rootScope, "rootScope");
        this.microgramManager = microgramManager;
        this.clock = clock;
        this.rootScope = rootScope;
    }

    @Override // javax.inject.Provider
    public SearchHighlightsManager get() {
        Companion companion = INSTANCE;
        MicrogramManager microgramManager = this.microgramManager.get();
        Intrinsics.checkNotNullExpressionValue(microgramManager, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        CoroutineScope coroutineScope = this.rootScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        return companion.newInstance(microgramManager, clock, coroutineScope);
    }

    /* compiled from: SearchHighlightsManager_Factory.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/SearchHighlightsManager_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "microgramManager", "j$/time/Clock", Card.Icon.CLOCK, "Lkotlinx/coroutines/CoroutineScope;", "rootScope", "Lcom/robinhood/android/search/highlights/SearchHighlightsManager_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/search/highlights/SearchHighlightsManager_Factory;", "Lcom/robinhood/android/search/highlights/SearchHighlightsManager;", "newInstance", "(Lcom/robinhood/android/microgramsdui/MicrogramManager;Lj$/time/Clock;Lkotlinx/coroutines/CoroutineScope;)Lcom/robinhood/android/search/highlights/SearchHighlightsManager;", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SearchHighlightsManager_Factory create(Provider<MicrogramManager> microgramManager, Provider<Clock> clock, Provider<CoroutineScope> rootScope) {
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(rootScope, "rootScope");
            return new SearchHighlightsManager_Factory(microgramManager, clock, rootScope);
        }

        @JvmStatic
        public final SearchHighlightsManager newInstance(MicrogramManager microgramManager, Clock clock, CoroutineScope rootScope) {
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(rootScope, "rootScope");
            return new SearchHighlightsManager(microgramManager, clock, rootScope);
        }
    }
}

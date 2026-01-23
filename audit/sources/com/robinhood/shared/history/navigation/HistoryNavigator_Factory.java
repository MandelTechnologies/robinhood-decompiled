package com.robinhood.shared.history.navigation;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HistoryNavigator_Factory.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB3\u0012\u0017\u0010\u0003\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00070\u0004\u0012\u0011\u0010\b\u001a\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\u00070\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u001f\u0010\u0003\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/history/navigation/HistoryNavigator_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "detailResolvers", "Ljavax/inject/Provider;", "", "Lcom/robinhood/shared/history/navigation/HistoryDetailResolver;", "Lkotlin/jvm/JvmSuppressWildcards;", "legacyHistoryDetailResolver", "Lcom/robinhood/shared/history/navigation/LegacyHistoryDetailResolver;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class HistoryNavigator_Factory implements Factory<HistoryNavigator> {
    private final Provider<Set<HistoryDetailResolver>> detailResolvers;
    private final Provider<LegacyHistoryDetailResolver> legacyHistoryDetailResolver;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final HistoryNavigator_Factory create(Provider<Set<HistoryDetailResolver>> provider, Provider<LegacyHistoryDetailResolver> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final HistoryNavigator newInstance(Lazy<Set<HistoryDetailResolver>> lazy, Lazy<LegacyHistoryDetailResolver> lazy2) {
        return INSTANCE.newInstance(lazy, lazy2);
    }

    public HistoryNavigator_Factory(Provider<Set<HistoryDetailResolver>> detailResolvers, Provider<LegacyHistoryDetailResolver> legacyHistoryDetailResolver) {
        Intrinsics.checkNotNullParameter(detailResolvers, "detailResolvers");
        Intrinsics.checkNotNullParameter(legacyHistoryDetailResolver, "legacyHistoryDetailResolver");
        this.detailResolvers = detailResolvers;
        this.legacyHistoryDetailResolver = legacyHistoryDetailResolver;
    }

    @Override // javax.inject.Provider
    public HistoryNavigator get() {
        Companion companion = INSTANCE;
        Lazy<Set<HistoryDetailResolver>> lazy = DoubleCheck.lazy(this.detailResolvers);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        Lazy<LegacyHistoryDetailResolver> lazy2 = DoubleCheck.lazy(this.legacyHistoryDetailResolver);
        Intrinsics.checkNotNullExpressionValue(lazy2, "lazy(...)");
        return companion.newInstance(lazy, lazy2);
    }

    /* compiled from: HistoryNavigator_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n0\u00072\u0011\u0010\u000b\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\n0\u0007H\u0007J4\u0010\r\u001a\u00020\u000e2\u0017\u0010\u0006\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n0\u000f2\u0011\u0010\u000b\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\n0\u000fH\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/history/navigation/HistoryNavigator_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/history/navigation/HistoryNavigator_Factory;", "detailResolvers", "Ljavax/inject/Provider;", "", "Lcom/robinhood/shared/history/navigation/HistoryDetailResolver;", "Lkotlin/jvm/JvmSuppressWildcards;", "legacyHistoryDetailResolver", "Lcom/robinhood/shared/history/navigation/LegacyHistoryDetailResolver;", "newInstance", "Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "Ldagger/Lazy;", "lib-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final HistoryNavigator_Factory create(Provider<Set<HistoryDetailResolver>> detailResolvers, Provider<LegacyHistoryDetailResolver> legacyHistoryDetailResolver) {
            Intrinsics.checkNotNullParameter(detailResolvers, "detailResolvers");
            Intrinsics.checkNotNullParameter(legacyHistoryDetailResolver, "legacyHistoryDetailResolver");
            return new HistoryNavigator_Factory(detailResolvers, legacyHistoryDetailResolver);
        }

        @JvmStatic
        public final HistoryNavigator newInstance(Lazy<Set<HistoryDetailResolver>> detailResolvers, Lazy<LegacyHistoryDetailResolver> legacyHistoryDetailResolver) {
            Intrinsics.checkNotNullParameter(detailResolvers, "detailResolvers");
            Intrinsics.checkNotNullParameter(legacyHistoryDetailResolver, "legacyHistoryDetailResolver");
            return new HistoryNavigator(detailResolvers, legacyHistoryDetailResolver);
        }
    }
}

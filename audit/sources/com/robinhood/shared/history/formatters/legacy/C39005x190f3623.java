package com.robinhood.shared.history.formatters.legacy;

import com.robinhood.android.common.history.p082ui.format.AggregatedHistoryTransactionFormatter;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HistoryFormattersLegacyModule_ProvideAggregatedHistoryTransactionFormatterFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/HistoryFormattersLegacyModule_ProvideAggregatedHistoryTransactionFormatterFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/history/ui/format/AggregatedHistoryTransactionFormatter;", "minervaTransactionFormatters", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/history/formatters/legacy/MinervaTransactionFormatters;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.history.formatters.legacy.HistoryFormattersLegacyModule_ProvideAggregatedHistoryTransactionFormatterFactory */
/* loaded from: classes21.dex */
public final class C39005x190f3623 implements Factory<AggregatedHistoryTransactionFormatter> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<MinervaTransactionFormatters> minervaTransactionFormatters;

    @JvmStatic
    public static final C39005x190f3623 create(Provider<MinervaTransactionFormatters> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final AggregatedHistoryTransactionFormatter provideAggregatedHistoryTransactionFormatter(MinervaTransactionFormatters minervaTransactionFormatters) {
        return INSTANCE.provideAggregatedHistoryTransactionFormatter(minervaTransactionFormatters);
    }

    public C39005x190f3623(Provider<MinervaTransactionFormatters> minervaTransactionFormatters) {
        Intrinsics.checkNotNullParameter(minervaTransactionFormatters, "minervaTransactionFormatters");
        this.minervaTransactionFormatters = minervaTransactionFormatters;
    }

    @Override // javax.inject.Provider
    public AggregatedHistoryTransactionFormatter get() {
        Companion companion = INSTANCE;
        MinervaTransactionFormatters minervaTransactionFormatters = this.minervaTransactionFormatters.get();
        Intrinsics.checkNotNullExpressionValue(minervaTransactionFormatters, "get(...)");
        return companion.provideAggregatedHistoryTransactionFormatter(minervaTransactionFormatters);
    }

    /* compiled from: HistoryFormattersLegacyModule_ProvideAggregatedHistoryTransactionFormatterFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/HistoryFormattersLegacyModule_ProvideAggregatedHistoryTransactionFormatterFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/history/formatters/legacy/HistoryFormattersLegacyModule_ProvideAggregatedHistoryTransactionFormatterFactory;", "minervaTransactionFormatters", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/history/formatters/legacy/MinervaTransactionFormatters;", "provideAggregatedHistoryTransactionFormatter", "Lcom/robinhood/android/common/history/ui/format/AggregatedHistoryTransactionFormatter;", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.history.formatters.legacy.HistoryFormattersLegacyModule_ProvideAggregatedHistoryTransactionFormatterFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C39005x190f3623 create(Provider<MinervaTransactionFormatters> minervaTransactionFormatters) {
            Intrinsics.checkNotNullParameter(minervaTransactionFormatters, "minervaTransactionFormatters");
            return new C39005x190f3623(minervaTransactionFormatters);
        }

        @JvmStatic
        public final AggregatedHistoryTransactionFormatter provideAggregatedHistoryTransactionFormatter(MinervaTransactionFormatters minervaTransactionFormatters) {
            Intrinsics.checkNotNullParameter(minervaTransactionFormatters, "minervaTransactionFormatters");
            Object objCheckNotNull = Preconditions.checkNotNull(HistoryFormattersLegacyModule.INSTANCE.provideAggregatedHistoryTransactionFormatter(minervaTransactionFormatters), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (AggregatedHistoryTransactionFormatter) objCheckNotNull;
        }
    }
}

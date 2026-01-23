package com.robinhood.lib.p296fx.order.history.formatter;

import com.robinhood.android.common.history.p082ui.format.HistoryFormatter;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FxOrderFormatterModule_ProvideFxOrderFormatterFactory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/lib/fx/order/history/formatter/FxOrderFormatterModule_ProvideFxOrderFormatterFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/history/ui/format/HistoryFormatter;", "module", "Lcom/robinhood/lib/fx/order/history/formatter/FxOrderFormatterModule;", "formatter", "Ljavax/inject/Provider;", "Lcom/robinhood/lib/fx/order/history/formatter/FxOrderFormatter;", "<init>", "(Lcom/robinhood/lib/fx/order/history/formatter/FxOrderFormatterModule;Ljavax/inject/Provider;)V", "get", "Companion", "lib-fx-order-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class FxOrderFormatterModule_ProvideFxOrderFormatterFactory implements Factory<HistoryFormatter> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<FxOrderFormatter> formatter;
    private final FxOrderFormatterModule module;

    @JvmStatic
    public static final FxOrderFormatterModule_ProvideFxOrderFormatterFactory create(FxOrderFormatterModule fxOrderFormatterModule, Provider<FxOrderFormatter> provider) {
        return INSTANCE.create(fxOrderFormatterModule, provider);
    }

    @JvmStatic
    public static final HistoryFormatter provideFxOrderFormatter(FxOrderFormatterModule fxOrderFormatterModule, FxOrderFormatter fxOrderFormatter) {
        return INSTANCE.provideFxOrderFormatter(fxOrderFormatterModule, fxOrderFormatter);
    }

    public FxOrderFormatterModule_ProvideFxOrderFormatterFactory(FxOrderFormatterModule module, Provider<FxOrderFormatter> formatter) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        this.module = module;
        this.formatter = formatter;
    }

    @Override // javax.inject.Provider
    public HistoryFormatter get() {
        Companion companion = INSTANCE;
        FxOrderFormatterModule fxOrderFormatterModule = this.module;
        FxOrderFormatter fxOrderFormatter = this.formatter.get();
        Intrinsics.checkNotNullExpressionValue(fxOrderFormatter, "get(...)");
        return companion.provideFxOrderFormatter(fxOrderFormatterModule, fxOrderFormatter);
    }

    /* compiled from: FxOrderFormatterModule_ProvideFxOrderFormatterFactory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/lib/fx/order/history/formatter/FxOrderFormatterModule_ProvideFxOrderFormatterFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/lib/fx/order/history/formatter/FxOrderFormatterModule_ProvideFxOrderFormatterFactory;", "module", "Lcom/robinhood/lib/fx/order/history/formatter/FxOrderFormatterModule;", "formatter", "Ljavax/inject/Provider;", "Lcom/robinhood/lib/fx/order/history/formatter/FxOrderFormatter;", "provideFxOrderFormatter", "Lcom/robinhood/android/common/history/ui/format/HistoryFormatter;", "lib-fx-order-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FxOrderFormatterModule_ProvideFxOrderFormatterFactory create(FxOrderFormatterModule module, Provider<FxOrderFormatter> formatter) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(formatter, "formatter");
            return new FxOrderFormatterModule_ProvideFxOrderFormatterFactory(module, formatter);
        }

        @JvmStatic
        public final HistoryFormatter provideFxOrderFormatter(FxOrderFormatterModule module, FxOrderFormatter formatter) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(formatter, "formatter");
            Object objCheckNotNull = Preconditions.checkNotNull(module.provideFxOrderFormatter(formatter), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (HistoryFormatter) objCheckNotNull;
        }
    }
}

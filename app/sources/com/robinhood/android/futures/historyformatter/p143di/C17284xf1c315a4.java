package com.robinhood.android.futures.historyformatter.p143di;

import com.robinhood.android.common.history.p082ui.format.HistoryFormatter;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.futures.historyformatter.FuturesCashCorrectionFormatter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesFormattersModule_ProvideEventCashCorrectionFormatterFactory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/historyformatter/di/FuturesFormattersModule_ProvideEventCashCorrectionFormatterFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/history/ui/format/HistoryFormatter;", "module", "Lcom/robinhood/android/futures/historyformatter/di/FuturesFormattersModule;", "formatter", "Ljavax/inject/Provider;", "Lcom/robinhood/android/futures/historyformatter/FuturesCashCorrectionFormatter;", "<init>", "(Lcom/robinhood/android/futures/historyformatter/di/FuturesFormattersModule;Ljavax/inject/Provider;)V", "get", "Companion", "lib-futures-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.historyformatter.di.FuturesFormattersModule_ProvideEventCashCorrectionFormatterFactory */
/* loaded from: classes3.dex */
public final class C17284xf1c315a4 implements Factory<HistoryFormatter> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<FuturesCashCorrectionFormatter> formatter;
    private final FuturesFormattersModule module;

    @JvmStatic
    public static final C17284xf1c315a4 create(FuturesFormattersModule futuresFormattersModule, Provider<FuturesCashCorrectionFormatter> provider) {
        return INSTANCE.create(futuresFormattersModule, provider);
    }

    @JvmStatic
    public static final HistoryFormatter provideEventCashCorrectionFormatter(FuturesFormattersModule futuresFormattersModule, FuturesCashCorrectionFormatter futuresCashCorrectionFormatter) {
        return INSTANCE.provideEventCashCorrectionFormatter(futuresFormattersModule, futuresCashCorrectionFormatter);
    }

    public C17284xf1c315a4(FuturesFormattersModule module, Provider<FuturesCashCorrectionFormatter> formatter) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        this.module = module;
        this.formatter = formatter;
    }

    @Override // javax.inject.Provider
    public HistoryFormatter get() {
        Companion companion = INSTANCE;
        FuturesFormattersModule futuresFormattersModule = this.module;
        FuturesCashCorrectionFormatter futuresCashCorrectionFormatter = this.formatter.get();
        Intrinsics.checkNotNullExpressionValue(futuresCashCorrectionFormatter, "get(...)");
        return companion.provideEventCashCorrectionFormatter(futuresFormattersModule, futuresCashCorrectionFormatter);
    }

    /* compiled from: FuturesFormattersModule_ProvideEventCashCorrectionFormatterFactory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/futures/historyformatter/di/FuturesFormattersModule_ProvideEventCashCorrectionFormatterFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/futures/historyformatter/di/FuturesFormattersModule_ProvideEventCashCorrectionFormatterFactory;", "module", "Lcom/robinhood/android/futures/historyformatter/di/FuturesFormattersModule;", "formatter", "Ljavax/inject/Provider;", "Lcom/robinhood/android/futures/historyformatter/FuturesCashCorrectionFormatter;", "provideEventCashCorrectionFormatter", "Lcom/robinhood/android/common/history/ui/format/HistoryFormatter;", "lib-futures-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.historyformatter.di.FuturesFormattersModule_ProvideEventCashCorrectionFormatterFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C17284xf1c315a4 create(FuturesFormattersModule module, Provider<FuturesCashCorrectionFormatter> formatter) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(formatter, "formatter");
            return new C17284xf1c315a4(module, formatter);
        }

        @JvmStatic
        public final HistoryFormatter provideEventCashCorrectionFormatter(FuturesFormattersModule module, FuturesCashCorrectionFormatter formatter) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(formatter, "formatter");
            Object objCheckNotNull = Preconditions.checkNotNull(module.provideEventCashCorrectionFormatter(formatter), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (HistoryFormatter) objCheckNotNull;
        }
    }
}

package com.robinhood.android.event.historyformatter.p132di;

import com.robinhood.android.common.history.p082ui.format.HistoryFormatter;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.event.historyformatter.EventOrderFormatter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventFormattersModule_ProvideOrderFormatterFactory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/event/historyformatter/di/EventFormattersModule_ProvideOrderFormatterFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/history/ui/format/HistoryFormatter;", "module", "Lcom/robinhood/android/event/historyformatter/di/EventFormattersModule;", "formatter", "Ljavax/inject/Provider;", "Lcom/robinhood/android/event/historyformatter/EventOrderFormatter;", "<init>", "(Lcom/robinhood/android/event/historyformatter/di/EventFormattersModule;Ljavax/inject/Provider;)V", "get", "Companion", "lib-futures-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class EventFormattersModule_ProvideOrderFormatterFactory implements Factory<HistoryFormatter> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<EventOrderFormatter> formatter;
    private final EventFormattersModule module;

    @JvmStatic
    public static final EventFormattersModule_ProvideOrderFormatterFactory create(EventFormattersModule eventFormattersModule, Provider<EventOrderFormatter> provider) {
        return INSTANCE.create(eventFormattersModule, provider);
    }

    @JvmStatic
    public static final HistoryFormatter provideOrderFormatter(EventFormattersModule eventFormattersModule, EventOrderFormatter eventOrderFormatter) {
        return INSTANCE.provideOrderFormatter(eventFormattersModule, eventOrderFormatter);
    }

    public EventFormattersModule_ProvideOrderFormatterFactory(EventFormattersModule module, Provider<EventOrderFormatter> formatter) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        this.module = module;
        this.formatter = formatter;
    }

    @Override // javax.inject.Provider
    public HistoryFormatter get() {
        Companion companion = INSTANCE;
        EventFormattersModule eventFormattersModule = this.module;
        EventOrderFormatter eventOrderFormatter = this.formatter.get();
        Intrinsics.checkNotNullExpressionValue(eventOrderFormatter, "get(...)");
        return companion.provideOrderFormatter(eventFormattersModule, eventOrderFormatter);
    }

    /* compiled from: EventFormattersModule_ProvideOrderFormatterFactory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/event/historyformatter/di/EventFormattersModule_ProvideOrderFormatterFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/event/historyformatter/di/EventFormattersModule_ProvideOrderFormatterFactory;", "module", "Lcom/robinhood/android/event/historyformatter/di/EventFormattersModule;", "formatter", "Ljavax/inject/Provider;", "Lcom/robinhood/android/event/historyformatter/EventOrderFormatter;", "provideOrderFormatter", "Lcom/robinhood/android/common/history/ui/format/HistoryFormatter;", "lib-futures-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EventFormattersModule_ProvideOrderFormatterFactory create(EventFormattersModule module, Provider<EventOrderFormatter> formatter) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(formatter, "formatter");
            return new EventFormattersModule_ProvideOrderFormatterFactory(module, formatter);
        }

        @JvmStatic
        public final HistoryFormatter provideOrderFormatter(EventFormattersModule module, EventOrderFormatter formatter) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(formatter, "formatter");
            Object objCheckNotNull = Preconditions.checkNotNull(module.provideOrderFormatter(formatter), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (HistoryFormatter) objCheckNotNull;
        }
    }
}

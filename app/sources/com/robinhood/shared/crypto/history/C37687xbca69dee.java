package com.robinhood.shared.crypto.history;

import com.robinhood.android.common.history.p082ui.format.HistoryFormatter;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHistoryFormattersModule_ProvideSepaCreditHistoryFormatterFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/CryptoHistoryFormattersModule_ProvideSepaCreditHistoryFormatterFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/history/ui/format/HistoryFormatter;", "formatter", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/crypto/history/SepaCreditFormatter;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.history.CryptoHistoryFormattersModule_ProvideSepaCreditHistoryFormatterFactory */
/* loaded from: classes21.dex */
public final class C37687xbca69dee implements Factory<HistoryFormatter> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<SepaCreditFormatter> formatter;

    @JvmStatic
    public static final C37687xbca69dee create(Provider<SepaCreditFormatter> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final HistoryFormatter provideSepaCreditHistoryFormatter(SepaCreditFormatter sepaCreditFormatter) {
        return INSTANCE.provideSepaCreditHistoryFormatter(sepaCreditFormatter);
    }

    public C37687xbca69dee(Provider<SepaCreditFormatter> formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        this.formatter = formatter;
    }

    @Override // javax.inject.Provider
    public HistoryFormatter get() {
        Companion companion = INSTANCE;
        SepaCreditFormatter sepaCreditFormatter = this.formatter.get();
        Intrinsics.checkNotNullExpressionValue(sepaCreditFormatter, "get(...)");
        return companion.provideSepaCreditHistoryFormatter(sepaCreditFormatter);
    }

    /* compiled from: CryptoHistoryFormattersModule_ProvideSepaCreditHistoryFormatterFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/CryptoHistoryFormattersModule_ProvideSepaCreditHistoryFormatterFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/crypto/history/CryptoHistoryFormattersModule_ProvideSepaCreditHistoryFormatterFactory;", "formatter", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/crypto/history/SepaCreditFormatter;", "provideSepaCreditHistoryFormatter", "Lcom/robinhood/android/common/history/ui/format/HistoryFormatter;", "lib-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.history.CryptoHistoryFormattersModule_ProvideSepaCreditHistoryFormatterFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C37687xbca69dee create(Provider<SepaCreditFormatter> formatter) {
            Intrinsics.checkNotNullParameter(formatter, "formatter");
            return new C37687xbca69dee(formatter);
        }

        @JvmStatic
        public final HistoryFormatter provideSepaCreditHistoryFormatter(SepaCreditFormatter formatter) {
            Intrinsics.checkNotNullParameter(formatter, "formatter");
            Object objCheckNotNull = Preconditions.checkNotNull(CryptoHistoryFormattersModule.INSTANCE.provideSepaCreditHistoryFormatter(formatter), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (HistoryFormatter) objCheckNotNull;
        }
    }
}

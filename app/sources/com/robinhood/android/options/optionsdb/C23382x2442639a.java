package com.robinhood.android.options.optionsdb;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.dao.OptionChainSettingsTableMetricsDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsDaoModule_ProvideOptionChainSettingsTableMetricsDaoFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/options/optionsdb/OptionsDaoModule_ProvideOptionChainSettingsTableMetricsDaoFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/models/dao/OptionChainSettingsTableMetricsDao;", "optionsDatabase", "Ljavax/inject/Provider;", "Lcom/robinhood/android/options/optionsdb/OptionsDatabase;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-options-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.optionsdb.OptionsDaoModule_ProvideOptionChainSettingsTableMetricsDaoFactory */
/* loaded from: classes11.dex */
public final class C23382x2442639a implements Factory<OptionChainSettingsTableMetricsDao> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<OptionsDatabase> optionsDatabase;

    @JvmStatic
    public static final C23382x2442639a create(Provider<OptionsDatabase> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final OptionChainSettingsTableMetricsDao provideOptionChainSettingsTableMetricsDao(OptionsDatabase optionsDatabase) {
        return INSTANCE.provideOptionChainSettingsTableMetricsDao(optionsDatabase);
    }

    public C23382x2442639a(Provider<OptionsDatabase> optionsDatabase) {
        Intrinsics.checkNotNullParameter(optionsDatabase, "optionsDatabase");
        this.optionsDatabase = optionsDatabase;
    }

    @Override // javax.inject.Provider
    public OptionChainSettingsTableMetricsDao get() {
        Companion companion = INSTANCE;
        OptionsDatabase optionsDatabase = this.optionsDatabase.get();
        Intrinsics.checkNotNullExpressionValue(optionsDatabase, "get(...)");
        return companion.provideOptionChainSettingsTableMetricsDao(optionsDatabase);
    }

    /* compiled from: OptionsDaoModule_ProvideOptionChainSettingsTableMetricsDaoFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/options/optionsdb/OptionsDaoModule_ProvideOptionChainSettingsTableMetricsDaoFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/options/optionsdb/OptionsDaoModule_ProvideOptionChainSettingsTableMetricsDaoFactory;", "optionsDatabase", "Ljavax/inject/Provider;", "Lcom/robinhood/android/options/optionsdb/OptionsDatabase;", "provideOptionChainSettingsTableMetricsDao", "Lcom/robinhood/models/dao/OptionChainSettingsTableMetricsDao;", "lib-options-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.optionsdb.OptionsDaoModule_ProvideOptionChainSettingsTableMetricsDaoFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C23382x2442639a create(Provider<OptionsDatabase> optionsDatabase) {
            Intrinsics.checkNotNullParameter(optionsDatabase, "optionsDatabase");
            return new C23382x2442639a(optionsDatabase);
        }

        @JvmStatic
        public final OptionChainSettingsTableMetricsDao provideOptionChainSettingsTableMetricsDao(OptionsDatabase optionsDatabase) {
            Intrinsics.checkNotNullParameter(optionsDatabase, "optionsDatabase");
            Object objCheckNotNull = Preconditions.checkNotNull(OptionsDaoModule.INSTANCE.provideOptionChainSettingsTableMetricsDao(optionsDatabase), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (OptionChainSettingsTableMetricsDao) objCheckNotNull;
        }
    }
}

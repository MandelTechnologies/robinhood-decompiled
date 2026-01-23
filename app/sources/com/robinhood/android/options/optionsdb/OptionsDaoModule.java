package com.robinhood.android.options.optionsdb;

import com.robinhood.models.dao.OptionChainSettingsTableMetricsDao;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsDaoModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/options/optionsdb/OptionsDaoModule;", "", "<init>", "()V", "provideOptionChainSettingsTableMetricsDao", "Lcom/robinhood/models/dao/OptionChainSettingsTableMetricsDao;", "optionsDatabase", "Lcom/robinhood/android/options/optionsdb/OptionsDatabase;", "lib-options-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionsDaoModule {
    public static final OptionsDaoModule INSTANCE = new OptionsDaoModule();

    private OptionsDaoModule() {
    }

    public final OptionChainSettingsTableMetricsDao provideOptionChainSettingsTableMetricsDao(OptionsDatabase optionsDatabase) {
        Intrinsics.checkNotNullParameter(optionsDatabase, "optionsDatabase");
        return optionsDatabase.optionChainSettingsTableMetricsDao();
    }
}

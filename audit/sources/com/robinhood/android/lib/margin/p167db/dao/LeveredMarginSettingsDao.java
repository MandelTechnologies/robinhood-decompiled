package com.robinhood.android.lib.margin.p167db.dao;

import com.robinhood.android.lib.margin.api.ApiMarginSettings;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: LeveredMarginSettingsDao.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\t\u001a\u00020\nH'J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\bH'¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/db/dao/LeveredMarginSettingsDao;", "", "insert", "", "apiMarginSettings", "Lcom/robinhood/android/lib/margin/api/ApiMarginSettings;", "getLeveredMarginSettings", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/lib/margin/db/models/MarginSettings;", "accountNumber", "", "marginSettings", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface LeveredMarginSettingsDao {
    Flow<MarginSettings> getLeveredMarginSettings(String accountNumber);

    void insert(ApiMarginSettings apiMarginSettings);

    void insert(MarginSettings marginSettings);

    /* compiled from: LeveredMarginSettingsDao.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes8.dex */
    public static final class DefaultImpls {
        public static void insert(LeveredMarginSettingsDao leveredMarginSettingsDao, ApiMarginSettings apiMarginSettings) {
            Intrinsics.checkNotNullParameter(apiMarginSettings, "apiMarginSettings");
            leveredMarginSettingsDao.insert(apiMarginSettings.toDbModel());
        }
    }
}

package com.robinhood.android.lib.margin.p167db.dao;

import com.robinhood.android.lib.margin.p167db.models.MarginUpgradeRestriction;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

/* compiled from: MarginUpgradeRestrictionDao.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00072\u0006\u0010\b\u001a\u00020\tH'¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/db/dao/MarginUpgradeRestrictionDao;", "", "insert", "", "restriction", "Lcom/robinhood/android/lib/margin/db/models/MarginUpgradeRestriction;", "get", "Lkotlinx/coroutines/flow/Flow;", "accountNumber", "", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface MarginUpgradeRestrictionDao {
    Flow<MarginUpgradeRestriction> get(String accountNumber);

    void insert(MarginUpgradeRestriction restriction);
}

package com.robinhood.accounts.p056db.dao;

import com.robinhood.models.jointaccounts.p330db.JointAccountFeatures;
import com.robinhood.utils.room.dao.BaseDaos3;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

/* compiled from: JointAccountFeaturesDao.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/accounts/db/dao/JointAccountFeaturesDao;", "Lcom/robinhood/utils/room/dao/SingleInsertDao;", "Lcom/robinhood/models/jointaccounts/db/JointAccountFeatures;", "streamJointAccountFeatures", "Lkotlinx/coroutines/flow/Flow;", "accountNumber", "", "lib-accounts-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface JointAccountFeaturesDao extends BaseDaos3<JointAccountFeatures> {
    Flow<JointAccountFeatures> streamJointAccountFeatures(String accountNumber);
}

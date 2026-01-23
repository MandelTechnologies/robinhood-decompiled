package com.robinhood.librobinhood.data.store;

import com.robinhood.accounts.p056db.dao.JointAccountFeaturesDao;
import com.robinhood.models.jointaccounts.p330db.JointAccountFeatures;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: JointAccountStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.JointAccountStore$featuresQuery$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class JointAccountStore5 extends FunctionReferenceImpl implements Function1<String, Flow<? extends JointAccountFeatures>> {
    JointAccountStore5(Object obj) {
        super(1, obj, JointAccountFeaturesDao.class, "streamJointAccountFeatures", "streamJointAccountFeatures(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<JointAccountFeatures> invoke(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((JointAccountFeaturesDao) this.receiver).streamJointAccountFeatures(p0);
    }
}

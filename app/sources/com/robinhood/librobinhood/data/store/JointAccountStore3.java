package com.robinhood.librobinhood.data.store;

import com.robinhood.accounts.p056db.dao.JointAccountFeaturesDao;
import com.robinhood.models.jointaccounts.p330db.JointAccountFeatures;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: JointAccountStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.JointAccountStore$featuresEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class JointAccountStore3 extends AdaptedFunctionReference implements Function2<JointAccountFeatures, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    JointAccountStore3(Object obj) {
        super(2, obj, JointAccountFeaturesDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(JointAccountFeatures jointAccountFeatures, Continuation<? super Unit> continuation) {
        return JointAccountStore.featuresEndpoint$insert((JointAccountFeaturesDao) this.receiver, jointAccountFeatures, continuation);
    }
}

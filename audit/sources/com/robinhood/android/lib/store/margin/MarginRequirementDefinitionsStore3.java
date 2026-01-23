package com.robinhood.android.lib.store.margin;

import com.robinhood.models.dao.bonfire.instrument.MarginRequirementDefinitionDao;
import com.robinhood.models.p320db.MarginRequirements;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: MarginRequirementDefinitionsStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.store.margin.MarginRequirementDefinitionsStore$marginRequirementEndpoint$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class MarginRequirementDefinitionsStore3 extends AdaptedFunctionReference implements Function2<MarginRequirements, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    MarginRequirementDefinitionsStore3(Object obj) {
        super(2, obj, MarginRequirementDefinitionDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MarginRequirements marginRequirements, Continuation<? super Unit> continuation) {
        return MarginRequirementDefinitionsStore.marginRequirementEndpoint$insert((MarginRequirementDefinitionDao) this.receiver, marginRequirements, continuation);
    }
}

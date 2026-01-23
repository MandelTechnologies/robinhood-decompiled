package com.robinhood.librobinhood.data.store;

import com.robinhood.models.dao.OptionChainCustomizationEducationDao;
import com.robinhood.models.p320db.OptionChainCustomizationEducation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: OptionChainCustomizationStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class OptionChainCustomizationStore$streamChainEducationById$2 extends FunctionReferenceImpl implements Function1<String, Flow<? extends OptionChainCustomizationEducation>> {
    OptionChainCustomizationStore$streamChainEducationById$2(Object obj) {
        super(1, obj, OptionChainCustomizationEducationDao.class, "getOptionChainCustomizationEducation", "getOptionChainCustomizationEducation(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<OptionChainCustomizationEducation> invoke(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((OptionChainCustomizationEducationDao) this.receiver).getOptionChainCustomizationEducation(p0);
    }
}

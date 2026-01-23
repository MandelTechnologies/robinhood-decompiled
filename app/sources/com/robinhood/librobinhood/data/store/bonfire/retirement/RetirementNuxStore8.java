package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.models.retirement.dao.RetirementNuxDao;
import com.robinhood.android.models.retirement.shared.RetirementUninvestedViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RetirementNuxStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementNuxStore$uninvestedViewModelQuery$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class RetirementNuxStore8 extends FunctionReferenceImpl implements Function1<String, Flow<? extends RetirementUninvestedViewModel>> {
    RetirementNuxStore8(Object obj) {
        super(1, obj, RetirementNuxDao.class, "getUninvestedViewModel", "getUninvestedViewModel(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<RetirementUninvestedViewModel> invoke(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((RetirementNuxDao) this.receiver).getUninvestedViewModel(p0);
    }
}

package com.robinhood.librobinhood.data.store;

import com.robinhood.models.crypto.dao.CryptoHomeCtaButtonsDao;
import com.robinhood.models.crypto.p314db.home.CryptoHomeCtaButtons;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: CryptoHomeStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class CryptoHomeStore$ctaButtonsQuery$2 extends FunctionReferenceImpl implements Function1<String, Flow<? extends CryptoHomeCtaButtons>> {
    CryptoHomeStore$ctaButtonsQuery$2(Object obj) {
        super(1, obj, CryptoHomeCtaButtonsDao.class, "getCtaButtons", "getCtaButtons(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<CryptoHomeCtaButtons> invoke(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((CryptoHomeCtaButtonsDao) this.receiver).getCtaButtons(p0);
    }
}

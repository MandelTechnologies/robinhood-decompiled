package com.robinhood.android.crypto.tab.p093ui.discover;

import com.robinhood.android.crypto.tab.p093ui.discover.CryptoHomeDiscoverExperimentDuxo;
import com.robinhood.models.crypto.p314db.explore.CryptoExploreCategories;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: CryptoHomeDiscoverExperimentDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentDuxo$onCreate$1$categoriesResponseFlow$1, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class CryptoHomeDiscoverExperimentDuxo3 extends AdaptedFunctionReference implements Function2<CryptoExploreCategories, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    CryptoHomeDiscoverExperimentDuxo3(Object obj) {
        super(2, obj, CryptoHomeDiscoverExperimentDuxo.class, "onCategoriesLoad", "onCategoriesLoad(Lcom/robinhood/models/crypto/db/explore/CryptoExploreCategories;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoExploreCategories cryptoExploreCategories, Continuation<? super Unit> continuation) {
        return CryptoHomeDiscoverExperimentDuxo.C131091.invokeSuspend$onCategoriesLoad((CryptoHomeDiscoverExperimentDuxo) this.receiver, cryptoExploreCategories, continuation);
    }
}

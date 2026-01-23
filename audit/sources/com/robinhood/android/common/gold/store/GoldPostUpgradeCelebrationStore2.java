package com.robinhood.android.common.gold.store;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: GoldPostUpgradeCelebrationStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.gold.store.GoldPostUpgradeCelebrationStore$goldCelebrationEndpoint$1, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class GoldPostUpgradeCelebrationStore2 extends AdaptedFunctionReference implements Function2<UiPostTransferPage.PostTransferGoldCelebration, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    GoldPostUpgradeCelebrationStore2(Object obj) {
        super(2, obj, BehaviorRelay.class, "accept", "accept(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UiPostTransferPage.PostTransferGoldCelebration postTransferGoldCelebration, Continuation<? super Unit> continuation) {
        return GoldPostUpgradeCelebrationStore.goldCelebrationEndpoint$accept((BehaviorRelay) this.receiver, postTransferGoldCelebration, continuation);
    }
}

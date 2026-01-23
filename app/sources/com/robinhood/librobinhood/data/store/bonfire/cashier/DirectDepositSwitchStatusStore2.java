package com.robinhood.librobinhood.data.store.bonfire.cashier;

import com.robinhood.prefs.BooleanPreference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: DirectDepositSwitchStatusStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.cashier.DirectDepositSwitchStatusStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class DirectDepositSwitchStatusStore2 extends AdaptedFunctionReference implements Function2<Boolean, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    DirectDepositSwitchStatusStore2(Object obj) {
        super(2, obj, BooleanPreference.class, "set", "set(Z)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
        return DirectDepositSwitchStatusStore.endpoint$set((BooleanPreference) this.receiver, z, continuation);
    }
}

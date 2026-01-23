package com.robinhood.librobinhood.data.store;

import com.robinhood.models.dao.OptionsAccountSwitcherDao;
import com.robinhood.models.p320db.accountswitcher.OptionsAccountSwitcher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: OptionAccountSwitcherStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore$optionsAccountSwitcherEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class OptionAccountSwitcherStore2 extends AdaptedFunctionReference implements Function2<OptionsAccountSwitcher, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    OptionAccountSwitcherStore2(Object obj) {
        super(2, obj, OptionsAccountSwitcherDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OptionsAccountSwitcher optionsAccountSwitcher, Continuation<? super Unit> continuation) {
        return OptionAccountSwitcherStore.optionsAccountSwitcherEndpoint$insert((OptionsAccountSwitcherDao) this.receiver, optionsAccountSwitcher, continuation);
    }
}

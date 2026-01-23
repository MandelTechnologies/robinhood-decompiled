package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.accountswitcher.OptionsAccountSwitcherId;
import com.robinhood.models.dao.OptionsAccountSwitcherDao;
import com.robinhood.models.p320db.accountswitcher.OptionsAccountSwitcher;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: OptionAccountSwitcherStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore$optionsAccountSwitcherQuery$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class OptionAccountSwitcherStore5 extends FunctionReferenceImpl implements Function1<OptionsAccountSwitcherId, Flow<? extends OptionsAccountSwitcher>> {
    OptionAccountSwitcherStore5(Object obj) {
        super(1, obj, OptionsAccountSwitcherDao.class, "getOptionsAccountSwitcher", "getOptionsAccountSwitcher(Lcom/robinhood/models/api/accountswitcher/OptionsAccountSwitcherId;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<OptionsAccountSwitcher> invoke(OptionsAccountSwitcherId p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((OptionsAccountSwitcherDao) this.receiver).getOptionsAccountSwitcher(p0);
    }
}

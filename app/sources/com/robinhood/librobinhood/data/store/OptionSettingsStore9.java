package com.robinhood.librobinhood.data.store;

import com.robinhood.models.dao.OptionSettingsDao;
import com.robinhood.models.p320db.OptionSettings;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: OptionSettingsStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.OptionSettingsStore$streamOptionSettingsFromAccount$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class OptionSettingsStore9 extends FunctionReferenceImpl implements Function1<String, Flow<? extends OptionSettings>> {
    OptionSettingsStore9(Object obj) {
        super(1, obj, OptionSettingsDao.class, "getOptionSettings", "getOptionSettings(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<OptionSettings> invoke(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((OptionSettingsDao) this.receiver).getOptionSettings(p0);
    }
}

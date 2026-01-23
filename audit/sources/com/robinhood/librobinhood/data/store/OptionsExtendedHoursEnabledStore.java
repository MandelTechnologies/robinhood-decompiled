package com.robinhood.librobinhood.data.store;

import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: OptionsExtendedHoursEnabledStore.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "Lcom/robinhood/store/Store;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/store/StoreBundle;)V", "isIndexOptionsExtendedHoursEnabled", "Lkotlinx/coroutines/flow/Flow;", "", "()Lkotlinx/coroutines/flow/Flow;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class OptionsExtendedHoursEnabledStore extends Store {
    private final Flow<Boolean> isIndexOptionsExtendedHoursEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsExtendedHoursEnabledStore(ExperimentsStore experimentsStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.isIndexOptionsExtendedHoursEnabled = ExperimentsProvider.DefaultImpls.streamStateFlow$default(experimentsStore, new Experiment[]{Experiments.IndexOptionsExtendedHoursCurb.INSTANCE}, true, null, 4, null);
    }

    public final Flow<Boolean> isIndexOptionsExtendedHoursEnabled() {
        return this.isIndexOptionsExtendedHoursEnabled;
    }
}

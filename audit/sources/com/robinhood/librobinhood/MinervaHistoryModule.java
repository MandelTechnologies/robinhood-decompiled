package com.robinhood.librobinhood;

import com.robinhood.librobinhood.store.MinervaHistoryStore;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.history.HistoryLoaderV2;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MinervaHistoryModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/librobinhood/MinervaHistoryModule;", "", "<init>", "()V", "provideMinervaHistoryLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoaderV2;", "minervaHistoryStore", "Lcom/robinhood/librobinhood/store/MinervaHistoryStore;", "lib-store-minerva_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MinervaHistoryModule {
    public static final MinervaHistoryModule INSTANCE = new MinervaHistoryModule();

    private MinervaHistoryModule() {
    }

    public final HistoryLoaderV2 provideMinervaHistoryLoaderCallbacks(MinervaHistoryStore minervaHistoryStore) {
        Intrinsics.checkNotNullParameter(minervaHistoryStore, "minervaHistoryStore");
        return new HistoryLoaderV2(minervaHistoryStore.getMinervaHistoryLoaderCallbacks(), SetsKt.setOf(AppType.TRADER));
    }
}

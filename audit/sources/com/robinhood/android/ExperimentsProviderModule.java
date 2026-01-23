package com.robinhood.android;

import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import kotlin.Metadata;

/* compiled from: ExperimentsProviderModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/ExperimentsProviderModule;", "", "<init>", "()V", "bindExperimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "lib-experiments-store-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public abstract class ExperimentsProviderModule {
    public abstract ExperimentsProvider bindExperimentsProvider(ExperimentsStore experimentsStore);
}

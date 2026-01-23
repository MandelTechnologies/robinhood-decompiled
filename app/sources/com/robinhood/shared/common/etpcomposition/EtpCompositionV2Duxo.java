package com.robinhood.shared.common.etpcomposition;

import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.EtpDetailsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.shared.common.etpcomposition.EtpCompositionV2Duxo2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Supervisor3;

/* compiled from: EtpCompositionV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2Duxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2DataState;", "Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2ViewState;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "etpDetailsStore", "Lcom/robinhood/librobinhood/data/store/EtpDetailsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2StateProvider;", "<init>", "(Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/EtpDetailsStore;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2StateProvider;)V", "bind", "Lkotlinx/coroutines/Job;", "uuid", "Ljava/util/UUID;", "bind$lib_etp_composition_externalDebug", "lib-etp-composition_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class EtpCompositionV2Duxo extends BaseDuxo<EtpCompositionV2Duxo2, EtpCompositionV2Duxo5> {
    public static final int $stable = 8;
    private final EtpDetailsStore etpDetailsStore;
    private final InstrumentStore instrumentStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EtpCompositionV2Duxo(InstrumentStore instrumentStore, EtpDetailsStore etpDetailsStore, DuxoBundle duxoBundle, EtpCompositionV2Duxo4 stateProvider) {
        super(EtpCompositionV2Duxo2.Loading.INSTANCE, stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(etpDetailsStore, "etpDetailsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.instrumentStore = instrumentStore;
        this.etpDetailsStore = etpDetailsStore;
    }

    public final Job bind$lib_etp_composition_externalDebug(UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        CompletableJob completableJobSupervisorJob$default = Supervisor3.SupervisorJob$default(null, 1, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new EtpCompositionV2Duxo3(this, uuid, null), 2, null);
        return completableJobSupervisorJob$default;
    }
}

package com.robinhood.android.equitydetail.p123ui.about.p124v2;

import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.EtpDetailsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.shared.equities.models.instrumentdetails.store.FundamentalStore;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Supervisor3;

/* compiled from: AboutV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\u0018J\r\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\u001bJ\r\u0010\u001c\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2Duxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2DataState;", "Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2ViewState;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "fundamentalStore", "Lcom/robinhood/shared/equities/models/instrumentdetails/store/FundamentalStore;", "etpDetailsStore", "Lcom/robinhood/librobinhood/data/store/EtpDetailsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2StateProvider;", "<init>", "(Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/shared/equities/models/instrumentdetails/store/FundamentalStore;Lcom/robinhood/librobinhood/data/store/EtpDetailsStore;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2StateProvider;)V", "bind", "Lkotlinx/coroutines/Job;", "instrumentUuid", "Ljava/util/UUID;", "resourceStrings", "Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2ResourceStrings;", "bind$feature_equity_detail_externalDebug", "onShowMoreOrLessClicked", "", "onShowMoreOrLessClicked$feature_equity_detail_externalDebug", "onAboutTextOverflow", "onAboutTextOverflow$feature_equity_detail_externalDebug", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class AboutV2Duxo extends BaseDuxo<AboutV2DataState, AboutV2ViewState> {
    public static final int $stable = 8;
    private final EtpDetailsStore etpDetailsStore;
    private final FundamentalStore fundamentalStore;
    private final InstrumentStore instrumentStore;
    private final QuoteStore quoteStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AboutV2Duxo(InstrumentStore instrumentStore, QuoteStore quoteStore, FundamentalStore fundamentalStore, EtpDetailsStore etpDetailsStore, DuxoBundle duxoBundle, AboutV2StateProvider stateProvider) {
        super(new AboutV2DataState(null, null, null, null, null, false, null, false, false, 511, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(fundamentalStore, "fundamentalStore");
        Intrinsics.checkNotNullParameter(etpDetailsStore, "etpDetailsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.instrumentStore = instrumentStore;
        this.quoteStore = quoteStore;
        this.fundamentalStore = fundamentalStore;
        this.etpDetailsStore = etpDetailsStore;
    }

    public final Job bind$feature_equity_detail_externalDebug(UUID instrumentUuid, AboutV2ResourceStrings resourceStrings) {
        Intrinsics.checkNotNullParameter(instrumentUuid, "instrumentUuid");
        Intrinsics.checkNotNullParameter(resourceStrings, "resourceStrings");
        CompletableJob completableJobSupervisorJob$default = Supervisor3.SupervisorJob$default(null, 1, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new AboutV2Duxo2(this, instrumentUuid, resourceStrings, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new AboutV2Duxo3(this, instrumentUuid, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new AboutV2Duxo4(this, instrumentUuid, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new AboutV2Duxo5(this, instrumentUuid, null), 2, null);
        return completableJobSupervisorJob$default;
    }

    public final void onShowMoreOrLessClicked$feature_equity_detail_externalDebug() {
        applyMutation(new AboutV2Duxo7(null));
    }

    public final void onAboutTextOverflow$feature_equity_detail_externalDebug() {
        applyMutation(new AboutV2Duxo6(null));
    }
}

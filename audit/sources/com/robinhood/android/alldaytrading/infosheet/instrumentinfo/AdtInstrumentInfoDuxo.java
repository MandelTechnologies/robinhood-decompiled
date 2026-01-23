package com.robinhood.android.alldaytrading.infosheet.instrumentinfo;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.alldaytrading.infosheet.instrumentinfo.AdtInstrumentInfoBottomSheetFragment;
import com.robinhood.android.alldaytrading.infosheet.instrumentinfo.datastate.AdtInstrumentInfoDataState;
import com.robinhood.android.alldaytrading.infosheet.instrumentinfo.datastate.AdtInstrumentInfoStateProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.adtcreative.store.AdtInstrumentInfoStore;
import com.robinhood.librobinhood.data.store.bonfire.EquityTradingSeenStatusStore;
import com.robinhood.models.alldaytrading.p305db.AdtInstrumentInfo;
import com.robinhood.models.api.bonfire.ApiEquityTradingSeenStatusRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdtInstrumentInfoDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0015B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/alldaytrading/infosheet/instrumentinfo/AdtInstrumentInfoDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/alldaytrading/infosheet/instrumentinfo/datastate/AdtInstrumentInfoDataState;", "Lcom/robinhood/android/alldaytrading/infosheet/instrumentinfo/AdtInstrumentInfoViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "adtInstrumentInfoStore", "Lcom/robinhood/librobinhood/adtcreative/store/AdtInstrumentInfoStore;", "equityTradingSeenStatusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EquityTradingSeenStatusStore;", "stateProvider", "Lcom/robinhood/android/alldaytrading/infosheet/instrumentinfo/datastate/AdtInstrumentInfoStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/adtcreative/store/AdtInstrumentInfoStore;Lcom/robinhood/librobinhood/data/store/bonfire/EquityTradingSeenStatusStore;Lcom/robinhood/android/alldaytrading/infosheet/instrumentinfo/datastate/AdtInstrumentInfoStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-all-day-trading_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AdtInstrumentInfoDuxo extends BaseDuxo<AdtInstrumentInfoDataState, AdtInstrumentInfoViewState> implements HasSavedState {
    private final AdtInstrumentInfoStore adtInstrumentInfoStore;
    private final EquityTradingSeenStatusStore equityTradingSeenStatusStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdtInstrumentInfoDuxo(AdtInstrumentInfoStore adtInstrumentInfoStore, EquityTradingSeenStatusStore equityTradingSeenStatusStore, AdtInstrumentInfoStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new AdtInstrumentInfoDataState(null, 1, 0 == true ? 1 : 0), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(adtInstrumentInfoStore, "adtInstrumentInfoStore");
        Intrinsics.checkNotNullParameter(equityTradingSeenStatusStore, "equityTradingSeenStatusStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.adtInstrumentInfoStore = adtInstrumentInfoStore;
        this.equityTradingSeenStatusStore = equityTradingSeenStatusStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.adtInstrumentInfoStore.getInstrumentInfo(((AdtInstrumentInfoBottomSheetFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getInstrumentId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.alldaytrading.infosheet.instrumentinfo.AdtInstrumentInfoDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdtInstrumentInfoDuxo.onStart$lambda$0(this.f$0, (AdtInstrumentInfo) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.equityTradingSeenStatusStore.updateSeenStatus(new ApiEquityTradingSeenStatusRequest(null, null, null, null, null, Boolean.TRUE, null, 95, null)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(AdtInstrumentInfoDuxo adtInstrumentInfoDuxo, AdtInstrumentInfo adtInstrumentInfo) {
        Intrinsics.checkNotNullParameter(adtInstrumentInfo, "adtInstrumentInfo");
        adtInstrumentInfoDuxo.applyMutation(new AdtInstrumentInfoDuxo2(adtInstrumentInfo, null));
        return Unit.INSTANCE;
    }

    /* compiled from: AdtInstrumentInfoDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/alldaytrading/infosheet/instrumentinfo/AdtInstrumentInfoDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/alldaytrading/infosheet/instrumentinfo/AdtInstrumentInfoDuxo;", "Lcom/robinhood/android/alldaytrading/infosheet/instrumentinfo/AdtInstrumentInfoBottomSheetFragment$Args;", "<init>", "()V", "feature-all-day-trading_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AdtInstrumentInfoDuxo, AdtInstrumentInfoBottomSheetFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdtInstrumentInfoBottomSheetFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (AdtInstrumentInfoBottomSheetFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdtInstrumentInfoBottomSheetFragment.Args getArgs(AdtInstrumentInfoDuxo adtInstrumentInfoDuxo) {
            return (AdtInstrumentInfoBottomSheetFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, adtInstrumentInfoDuxo);
        }
    }
}

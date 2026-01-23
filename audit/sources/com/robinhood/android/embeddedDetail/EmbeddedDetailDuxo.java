package com.robinhood.android.embeddedDetail;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.investflow.models.api.sdui.ApiInvestFlowEmbeddedDetailPageResponse;
import com.robinhood.librobinhood.data.store.EtpDetailsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.bonfire.investflow.InvestFlowStore;
import com.robinhood.models.p320db.EtpDetails;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmbeddedDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001eB1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0013H\u0002J\b\u0010\u001c\u001a\u00020\u0013H\u0002J\u0006\u0010\u001d\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/embeddedDetail/EmbeddedDetailDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/embeddedDetail/EmbeddedDetailViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "investFlowStore", "Lcom/robinhood/librobinhood/data/store/bonfire/investflow/InvestFlowStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "etpDetailsStore", "Lcom/robinhood/librobinhood/data/store/EtpDetailsStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/investflow/InvestFlowStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/EtpDetailsStore;Lcom/robinhood/analytics/EventLogger;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onResume", "", "onDestroy", "pollForHeader", "assetType", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "id", "Ljava/util/UUID;", "pollForFundamental", "logAppear", "logDisappear", "logButtonTap", "Companion", "lib-embedded-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class EmbeddedDetailDuxo extends OldBaseDuxo<EmbeddedDetailViewState> implements HasSavedState {
    private final EtpDetailsStore etpDetailsStore;
    private final EventLogger eventLogger;
    private final InstrumentStore instrumentStore;
    private final InvestFlowStore investFlowStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EmbeddedDetailDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiAssetType.values().length];
            try {
                iArr[ApiAssetType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAssetType.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiAssetType.BROKERAGE_CASH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiAssetType.TOKENIZED_STOCK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public EmbeddedDetailDuxo(InvestFlowStore investFlowStore, InstrumentStore instrumentStore, EtpDetailsStore etpDetailsStore, EventLogger eventLogger, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(investFlowStore, "investFlowStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(etpDetailsStore, "etpDetailsStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        ApiInvestFlowEmbeddedDetailPageResponse apiInvestFlowEmbeddedDetailPageResponse = null;
        ApiInvestFlowEmbeddedDetailPageResponse apiInvestFlowEmbeddedDetailPageResponse2 = null;
        ApiInvestFlowEmbeddedDetailPageResponse apiInvestFlowEmbeddedDetailPageResponse3 = null;
        EtpDetails etpDetails = null;
        super(new EmbeddedDetailViewState(((EmbeddedDetailArgs) companion.getArgs(savedStateHandle)).getAssetType(), ((EmbeddedDetailArgs) companion.getArgs(savedStateHandle)).getAssetId(), apiInvestFlowEmbeddedDetailPageResponse, apiInvestFlowEmbeddedDetailPageResponse2, apiInvestFlowEmbeddedDetailPageResponse3, ((EmbeddedDetailArgs) companion.getArgs(savedStateHandle)).getBasketFull(), etpDetails, ((EmbeddedDetailArgs) companion.getArgs(savedStateHandle)).getInBasket(), 92, null), null, 2, 0 == true ? 1 : 0);
        this.investFlowStore = investFlowStore;
        this.instrumentStore = instrumentStore;
        this.etpDetailsStore = etpDetailsStore;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        Companion companion = INSTANCE;
        int i = WhenMappings.$EnumSwitchMapping$0[((EmbeddedDetailArgs) companion.getArgs((HasSavedState) this)).getAssetType().ordinal()];
        if (i == 1 || i == 2) {
            Single<ApiInvestFlowEmbeddedDetailPageResponse> singleDoOnSuccess = this.investFlowStore.fetchInvestFlowEmbeddedDetailPage(((EmbeddedDetailArgs) companion.getArgs((HasSavedState) this)).getAssetType(), ((EmbeddedDetailArgs) companion.getArgs((HasSavedState) this)).getAssetId()).doOnSuccess(new Consumer() { // from class: com.robinhood.android.embeddedDetail.EmbeddedDetailDuxo.onResume.1
                @Override // io.reactivex.functions.Consumer
                public final void accept(ApiInvestFlowEmbeddedDetailPageResponse apiInvestFlowEmbeddedDetailPageResponse) {
                    EmbeddedDetailDuxo embeddedDetailDuxo = EmbeddedDetailDuxo.this;
                    Companion companion2 = EmbeddedDetailDuxo.INSTANCE;
                    embeddedDetailDuxo.pollForHeader(((EmbeddedDetailArgs) companion2.getArgs((HasSavedState) embeddedDetailDuxo)).getAssetType(), ((EmbeddedDetailArgs) companion2.getArgs((HasSavedState) EmbeddedDetailDuxo.this)).getAssetId());
                    EmbeddedDetailDuxo embeddedDetailDuxo2 = EmbeddedDetailDuxo.this;
                    embeddedDetailDuxo2.pollForFundamental(((EmbeddedDetailArgs) companion2.getArgs((HasSavedState) embeddedDetailDuxo2)).getAssetType(), ((EmbeddedDetailArgs) companion2.getArgs((HasSavedState) EmbeddedDetailDuxo.this)).getAssetId());
                }
            });
            Intrinsics.checkNotNullExpressionValue(singleDoOnSuccess, "doOnSuccess(...)");
            LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSuccess, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.embeddedDetail.EmbeddedDetailDuxo$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EmbeddedDetailDuxo.onResume$lambda$1(this.f$0, (ApiInvestFlowEmbeddedDetailPageResponse) obj);
                }
            });
        } else if (i != 3) {
            if (i == 4) {
                throw new IllegalStateException("This flow doesn't support tokenized stocks");
            }
            throw new NoWhenBranchMatchedException();
        }
        if (((EmbeddedDetailArgs) companion.getArgs((HasSavedState) this)).getAssetType() == ApiAssetType.EQUITY) {
            Observable<R> observableSwitchMap = this.instrumentStore.getInstrument(((EmbeddedDetailArgs) companion.getArgs((HasSavedState) this)).getAssetId()).switchMap(new Function() { // from class: com.robinhood.android.embeddedDetail.EmbeddedDetailDuxo.onResume.3
                @Override // io.reactivex.functions.Function
                public final ObservableSource<? extends EtpDetails> apply(Instrument instrument) {
                    Intrinsics.checkNotNullParameter(instrument, "instrument");
                    if (instrument.isEtpOrCef()) {
                        return EmbeddedDetailDuxo.this.etpDetailsStore.getStreamEtpDetails().asObservable(instrument.getId());
                    }
                    return Observable.never();
                }
            });
            Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
            LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.embeddedDetail.EmbeddedDetailDuxo$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EmbeddedDetailDuxo.onResume$lambda$3(this.f$0, (EtpDetails) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(EmbeddedDetailDuxo embeddedDetailDuxo, final ApiInvestFlowEmbeddedDetailPageResponse apiInvestFlowEmbeddedDetailPageResponse) {
        embeddedDetailDuxo.logAppear();
        embeddedDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.embeddedDetail.EmbeddedDetailDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmbeddedDetailDuxo.onResume$lambda$1$lambda$0(apiInvestFlowEmbeddedDetailPageResponse, (EmbeddedDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmbeddedDetailViewState onResume$lambda$1$lambda$0(ApiInvestFlowEmbeddedDetailPageResponse apiInvestFlowEmbeddedDetailPageResponse, EmbeddedDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EmbeddedDetailViewState.copy$default(applyMutation, null, null, apiInvestFlowEmbeddedDetailPageResponse, null, null, false, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(EmbeddedDetailDuxo embeddedDetailDuxo, final EtpDetails etpDetails) {
        Intrinsics.checkNotNullParameter(etpDetails, "etpDetails");
        embeddedDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.embeddedDetail.EmbeddedDetailDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmbeddedDetailDuxo.onResume$lambda$3$lambda$2(etpDetails, (EmbeddedDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmbeddedDetailViewState onResume$lambda$3$lambda$2(EtpDetails etpDetails, EmbeddedDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EmbeddedDetailViewState.copy$default(applyMutation, null, null, null, null, null, false, etpDetails, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onDestroy() {
        logDisappear();
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pollForHeader(ApiAssetType assetType, UUID id) {
        LifecycleHost.DefaultImpls.bind$default(this, this.investFlowStore.streamInvestFlowEmbeddedDetailPageHeader(assetType, id), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.embeddedDetail.EmbeddedDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmbeddedDetailDuxo.pollForHeader$lambda$5(this.f$0, (ApiInvestFlowEmbeddedDetailPageResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pollForHeader$lambda$5(EmbeddedDetailDuxo embeddedDetailDuxo, final ApiInvestFlowEmbeddedDetailPageResponse header) {
        Intrinsics.checkNotNullParameter(header, "header");
        embeddedDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.embeddedDetail.EmbeddedDetailDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmbeddedDetailDuxo.pollForHeader$lambda$5$lambda$4(header, (EmbeddedDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmbeddedDetailViewState pollForHeader$lambda$5$lambda$4(ApiInvestFlowEmbeddedDetailPageResponse apiInvestFlowEmbeddedDetailPageResponse, EmbeddedDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EmbeddedDetailViewState.copy$default(applyMutation, null, null, null, apiInvestFlowEmbeddedDetailPageResponse, null, false, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pollForFundamental(ApiAssetType assetType, UUID id) {
        LifecycleHost.DefaultImpls.bind$default(this, this.investFlowStore.streamInvestFlowEmbeddedDetailPageFundamental(assetType, id), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.embeddedDetail.EmbeddedDetailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmbeddedDetailDuxo.pollForFundamental$lambda$7(this.f$0, (ApiInvestFlowEmbeddedDetailPageResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pollForFundamental$lambda$7(EmbeddedDetailDuxo embeddedDetailDuxo, final ApiInvestFlowEmbeddedDetailPageResponse fundamental) {
        Intrinsics.checkNotNullParameter(fundamental, "fundamental");
        embeddedDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.embeddedDetail.EmbeddedDetailDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmbeddedDetailDuxo.pollForFundamental$lambda$7$lambda$6(fundamental, (EmbeddedDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmbeddedDetailViewState pollForFundamental$lambda$7$lambda$6(ApiInvestFlowEmbeddedDetailPageResponse apiInvestFlowEmbeddedDetailPageResponse, EmbeddedDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EmbeddedDetailViewState.copy$default(applyMutation, null, null, null, null, apiInvestFlowEmbeddedDetailPageResponse, false, null, false, 239, null);
    }

    private final void logAppear() {
        EventLogger eventLogger = this.eventLogger;
        Screen.Name name = Screen.Name.STOCK_DETAIL_PAGE_MINI;
        String string2 = ((EmbeddedDetailArgs) INSTANCE.getArgs((HasSavedState) this)).getAssetId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logScreenAppear$default(eventLogger, UserInteractionEventData.Action.VIEW_PROSPECTUS, new Screen(name, null, string2, null, 10, null), null, null, null, 28, null);
    }

    private final void logDisappear() {
        EventLogger eventLogger = this.eventLogger;
        Screen.Name name = Screen.Name.STOCK_DETAIL_PAGE_MINI;
        String string2 = ((EmbeddedDetailArgs) INSTANCE.getArgs((HasSavedState) this)).getAssetId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logScreenDisappear$default(eventLogger, UserInteractionEventData.Action.VIEW_PROSPECTUS, new Screen(name, null, string2, null, 10, null), null, null, null, 28, null);
    }

    public final void logButtonTap() {
        UserInteractionEventData.Action action;
        EventLogger eventLogger = this.eventLogger;
        Screen.Name name = Screen.Name.STOCK_DETAIL_PAGE_MINI;
        Companion companion = INSTANCE;
        String string2 = ((EmbeddedDetailArgs) companion.getArgs((HasSavedState) this)).getAssetId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Screen screen = new Screen(name, null, string2, null, 10, null);
        if (((EmbeddedDetailArgs) companion.getArgs((HasSavedState) this)).getInBasket()) {
            action = UserInteractionEventData.Action.REMOVE_FROM_BASKET;
        } else {
            action = UserInteractionEventData.Action.ADD_TO_BASKET;
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, null, null, null, false, 60, null);
    }

    /* compiled from: EmbeddedDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/embeddedDetail/EmbeddedDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/embeddedDetail/EmbeddedDetailDuxo;", "Lcom/robinhood/android/embeddedDetail/EmbeddedDetailArgs;", "<init>", "()V", "lib-embedded-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EmbeddedDetailDuxo, EmbeddedDetailArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EmbeddedDetailArgs getArgs(SavedStateHandle savedStateHandle) {
            return (EmbeddedDetailArgs) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EmbeddedDetailArgs getArgs(EmbeddedDetailDuxo embeddedDetailDuxo) {
            return (EmbeddedDetailArgs) DuxoCompanion.DefaultImpls.getArgs(this, embeddedDetailDuxo);
        }
    }
}

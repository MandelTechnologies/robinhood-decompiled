package com.robinhood.android.trade.equity.p261ui.loadoptionchain;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.trade.equity.p261ui.loadoptionchain.LoadOptionChainViewState;
import com.robinhood.android.trade.equity.p261ui.loadoptionchain.LoadOptionsChainFragment;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoadOptionChainDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0012B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/loadoptionchain/LoadOptionChainDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/trade/equity/ui/loadoptionchain/LoadOptionChainViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/OptionChainStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class LoadOptionChainDuxo extends BaseDuxo4<LoadOptionChainViewState> implements HasSavedState {
    private final InstrumentStore instrumentStore;
    private final OptionChainStore optionChainStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadOptionChainDuxo(InstrumentStore instrumentStore, OptionChainStore optionChainStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(LoadOptionChainViewState.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.instrumentStore = instrumentStore;
        this.optionChainStore = optionChainStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        Companion companion = INSTANCE;
        final String accountNumber = ((LoadOptionsChainFragment.Args) companion.getArgs((HasSavedState) this)).getAccountNumber();
        if (accountNumber == null) {
            throw new IllegalStateException("Account number must be provided to LoadOptionChainDuxo");
        }
        final UUID instrumentId = ((LoadOptionsChainFragment.Args) companion.getArgs((HasSavedState) this)).getInstrumentId();
        if (instrumentId == null) {
            throw new IllegalStateException("Instrument ID must be provided to LoadOptionChainDuxo");
        }
        this.instrumentStore.refresh(false, instrumentId);
        Observable observableTake = this.instrumentStore.getInstrument(instrumentId).distinctUntilChanged((Function<? super Instrument, K>) new Function() { // from class: com.robinhood.android.trade.equity.ui.loadoptionchain.LoadOptionChainDuxo.onCreate.1
            @Override // io.reactivex.functions.Function
            public final UUID apply(Instrument instrument) {
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                return instrument.getTradableChainId();
            }
        }).take(1L).flatMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.loadoptionchain.LoadOptionChainDuxo.onCreate.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<UiOptionChain>> apply(Instrument instrument) {
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                UUID tradableChainId = instrument.getTradableChainId();
                if (tradableChainId != null) {
                    Observable<UiOptionChain> observableAsObservable = LoadOptionChainDuxo.this.optionChainStore.getStreamUiOptionChain().asObservable(tradableChainId);
                    final Optional.Companion companion2 = Optional.INSTANCE;
                    return observableAsObservable.map(new Function() { // from class: com.robinhood.android.trade.equity.ui.loadoptionchain.LoadOptionChainDuxo.onCreate.2.1
                        @Override // io.reactivex.functions.Function
                        public final Optional<UiOptionChain> apply(UiOptionChain uiOptionChain) {
                            return companion2.m2972of(uiOptionChain);
                        }
                    });
                }
                return Observable.just(Optional2.INSTANCE);
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.loadoptionchain.LoadOptionChainDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LoadOptionChainDuxo.onCreate$lambda$2(this.f$0, instrumentId, accountNumber, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(LoadOptionChainDuxo loadOptionChainDuxo, UUID uuid, String str, Optional optional) {
        loadOptionChainDuxo.applyMutation(new LoadOptionChainDuxo2((UiOptionChain) optional.component1(), uuid, str, null));
        return Unit.INSTANCE;
    }

    /* compiled from: LoadOptionChainDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/loadoptionchain/LoadOptionChainDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/trade/equity/ui/loadoptionchain/LoadOptionChainDuxo;", "Lcom/robinhood/android/trade/equity/ui/loadoptionchain/LoadOptionsChainFragment$Args;", "<init>", "()V", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<LoadOptionChainDuxo, LoadOptionsChainFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LoadOptionsChainFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (LoadOptionsChainFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LoadOptionsChainFragment.Args getArgs(LoadOptionChainDuxo loadOptionChainDuxo) {
            return (LoadOptionsChainFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, loadOptionChainDuxo);
        }
    }
}

package com.robinhood.shared.crypto.transfer.skip;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.models.api.transfer.ApiCryptoSupportedNetworks;
import com.robinhood.models.api.transfer.CryptoTransferAction;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.crypto.transfer.skip.CryptoTransferSkipStepsFragment;
import com.robinhood.shared.crypto.transfer.skip.CryptoTransferSkipStepsViewState;
import com.robinhood.shared.formats.crypto.UiCurrencyPairs3;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferSkipStepsDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0010B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/skip/CryptoTransferSkipStepsDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/shared/crypto/transfer/skip/CryptoTransferSkipStepsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoTransferSkipStepsDuxo extends OldBaseDuxo<CryptoTransferSkipStepsViewState> implements HasSavedState {
    private final CryptoTransfersStore cryptoTransfersStore;
    private final CurrencyPairV2Store currencyPairStore;
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
    public CryptoTransferSkipStepsDuxo(SavedStateHandle savedStateHandle, CryptoTransfersStore cryptoTransfersStore, CurrencyPairV2Store currencyPairStore) {
        super(new CryptoTransferSkipStepsViewState(null, null, 3, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        this.savedStateHandle = savedStateHandle;
        this.cryptoTransfersStore = cryptoTransfersStore;
        this.currencyPairStore = currencyPairStore;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        Single singleSubscribeOn = this.currencyPairStore.streamCurrencyPair(((CryptoTransferSkipStepsFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getCurrencyPairId()).take(1L).singleOrError().map(new Function() { // from class: com.robinhood.shared.crypto.transfer.skip.CryptoTransferSkipStepsDuxo.onStart.1
            @Override // io.reactivex.functions.Function
            public final UiCurrencyPair apply(UiCurrencyPair uiCurrencyPair) {
                Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
                return UiCurrencyPairs3.adjustMinOrderQuantityIncrement(uiCurrencyPair);
            }
        }).flatMap(new Function() { // from class: com.robinhood.shared.crypto.transfer.skip.CryptoTransferSkipStepsDuxo.onStart.2
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends CryptoTransferSkipStepsViewState.SkipStepsData> apply(final UiCurrencyPair currencyPair) {
                Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                Single<T> singleSingleOrError = CryptoTransfersStore.streamTransferConfig$default(CryptoTransferSkipStepsDuxo.this.cryptoTransfersStore, CryptoTransferAction.SEND, currencyPair.getAssetCurrency(), null, 4, null).take(1L).singleOrError();
                Single<ApiCryptoSupportedNetworks> supportNetworks = CryptoTransferSkipStepsDuxo.this.cryptoTransfersStore.getSupportNetworks(currencyPair.getAssetCurrency(), ((CryptoTransferSkipStepsFragment.Args) CryptoTransferSkipStepsDuxo.INSTANCE.getArgs((HasSavedState) CryptoTransferSkipStepsDuxo.this)).getAddress());
                final CryptoTransferSkipStepsDuxo cryptoTransferSkipStepsDuxo = CryptoTransferSkipStepsDuxo.this;
                return Single.zip(singleSingleOrError, supportNetworks, new BiFunction() { // from class: com.robinhood.shared.crypto.transfer.skip.CryptoTransferSkipStepsDuxo.onStart.2.1
                    @Override // io.reactivex.functions.BiFunction
                    public final CryptoTransferSkipStepsViewState.SkipStepsData apply(CryptoTransferConfig transferConfig, ApiCryptoSupportedNetworks supportedNetworks) throws CryptoTransferSkipStepsViewState2 {
                        Intrinsics.checkNotNullParameter(transferConfig, "transferConfig");
                        Intrinsics.checkNotNullParameter(supportedNetworks, "supportedNetworks");
                        ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetworkFindByCode = supportedNetworks.findByCode(((CryptoTransferSkipStepsFragment.Args) CryptoTransferSkipStepsDuxo.INSTANCE.getArgs((HasSavedState) cryptoTransferSkipStepsDuxo)).getNetworkCode());
                        if (cryptoNetworkFindByCode == null) {
                            throw new CryptoTransferSkipStepsViewState2();
                        }
                        UiCurrencyPair uiCurrencyPair = currencyPair;
                        Intrinsics.checkNotNull(uiCurrencyPair);
                        return new CryptoTransferSkipStepsViewState.SkipStepsData(uiCurrencyPair, transferConfig, supportedNetworks, cryptoNetworkFindByCode);
                    }
                });
            }
        }).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(singleSubscribeOn, "subscribeOn(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleSubscribeOn, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.crypto.transfer.skip.CryptoTransferSkipStepsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTransferSkipStepsDuxo.onStart$lambda$1(this.f$0, (CryptoTransferSkipStepsViewState.SkipStepsData) obj);
            }
        }, new Function1() { // from class: com.robinhood.shared.crypto.transfer.skip.CryptoTransferSkipStepsDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTransferSkipStepsDuxo.onStart$lambda$3(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(CryptoTransferSkipStepsDuxo cryptoTransferSkipStepsDuxo, final CryptoTransferSkipStepsViewState.SkipStepsData skipStepsData) {
        cryptoTransferSkipStepsDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.crypto.transfer.skip.CryptoTransferSkipStepsDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTransferSkipStepsDuxo.onStart$lambda$1$lambda$0(skipStepsData, (CryptoTransferSkipStepsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoTransferSkipStepsViewState onStart$lambda$1$lambda$0(CryptoTransferSkipStepsViewState.SkipStepsData skipStepsData, CryptoTransferSkipStepsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CryptoTransferSkipStepsViewState.copy$default(applyMutation, new UiEvent(skipStepsData), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(CryptoTransferSkipStepsDuxo cryptoTransferSkipStepsDuxo, final Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (Throwables.isNetworkRelated(t) || (t instanceof CryptoTransferSkipStepsViewState2)) {
            cryptoTransferSkipStepsDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.crypto.transfer.skip.CryptoTransferSkipStepsDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoTransferSkipStepsDuxo.onStart$lambda$3$lambda$2(t, (CryptoTransferSkipStepsViewState) obj);
                }
            });
            return Unit.INSTANCE;
        }
        throw t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoTransferSkipStepsViewState onStart$lambda$3$lambda$2(Throwable th, CryptoTransferSkipStepsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CryptoTransferSkipStepsViewState.copy$default(applyMutation, null, new UiEvent(th), 1, null);
    }

    /* compiled from: CryptoTransferSkipStepsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/skip/CryptoTransferSkipStepsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/crypto/transfer/skip/CryptoTransferSkipStepsDuxo;", "Lcom/robinhood/shared/crypto/transfer/skip/CryptoTransferSkipStepsFragment$Args;", "<init>", "()V", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoTransferSkipStepsDuxo, CryptoTransferSkipStepsFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoTransferSkipStepsFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoTransferSkipStepsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoTransferSkipStepsFragment.Args getArgs(CryptoTransferSkipStepsDuxo cryptoTransferSkipStepsDuxo) {
            return (CryptoTransferSkipStepsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, cryptoTransferSkipStepsDuxo);
        }
    }
}

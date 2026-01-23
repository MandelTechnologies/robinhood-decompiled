package com.robinhood.android.rhymigration.p245ui.address;

import androidx.lifecycle.SavedStateHandle;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.rhymigration.p245ui.address.RhyConfirmAddressDuxo;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.identi.AddressStore;
import com.robinhood.models.api.ApiShippingAddress;
import com.robinhood.models.p355ui.identi.ResidentialAddress;
import com.robinhood.models.p355ui.identi.ShippingAddress;
import com.robinhood.models.p355ui.identi.UsAddress;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.SinglesAndroid;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyConfirmAddressDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0014B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/address/RhyConfirmAddressDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/rhymigration/ui/address/RhyConfirmAddressViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "addressStore", "Lcom/robinhood/librobinhood/data/store/identi/AddressStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/identi/AddressStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "showShippingAddress", "", "onCreate", "", "onStart", "submitShippingAddress", PlaceTypes.ADDRESS, "Lcom/robinhood/models/ui/identi/UsAddress;", "Companion", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhyConfirmAddressDuxo extends OldBaseDuxo<RhyConfirmAddressViewState> implements HasSavedState {
    private final AddressStore addressStore;
    private final SavedStateHandle savedStateHandle;
    private final boolean showShippingAddress;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RhyConfirmAddressDuxo(AddressStore addressStore, SavedStateHandle savedStateHandle) {
        super(new RhyConfirmAddressViewState(null, null, false, null, 15, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(addressStore, "addressStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.addressStore = addressStore;
        this.savedStateHandle = savedStateHandle;
        this.showShippingAddress = ((LegacyFragmentKey.RhyConfirmAddress) INSTANCE.getArgs(getSavedStateHandle())).getShowShippingAddress();
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        if (this.showShippingAddress) {
            this.addressStore.refreshShippingAddress(true);
        }
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        this.addressStore.refreshResidentialAddress(true);
        LifecycleHost.DefaultImpls.bind$default(this, this.addressStore.streamResidentialAddress(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhymigration.ui.address.RhyConfirmAddressDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyConfirmAddressDuxo.onStart$lambda$1(this.f$0, (ResidentialAddress) obj);
            }
        });
        if (this.showShippingAddress) {
            LifecycleHost.DefaultImpls.bind$default(this, this.addressStore.streamMostRecentShippingAddress(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhymigration.ui.address.RhyConfirmAddressDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyConfirmAddressDuxo.onStart$lambda$3(this.f$0, (ShippingAddress) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RhyConfirmAddressDuxo rhyConfirmAddressDuxo, final ResidentialAddress address) {
        Intrinsics.checkNotNullParameter(address, "address");
        rhyConfirmAddressDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.address.RhyConfirmAddressDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyConfirmAddressDuxo.onStart$lambda$1$lambda$0(address, (RhyConfirmAddressViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyConfirmAddressViewState onStart$lambda$1$lambda$0(ResidentialAddress residentialAddress, RhyConfirmAddressViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyConfirmAddressViewState.copy$default(applyMutation, residentialAddress.getAddress(), null, false, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(RhyConfirmAddressDuxo rhyConfirmAddressDuxo, final ShippingAddress address) {
        Intrinsics.checkNotNullParameter(address, "address");
        rhyConfirmAddressDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.address.RhyConfirmAddressDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyConfirmAddressDuxo.onStart$lambda$3$lambda$2(address, (RhyConfirmAddressViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyConfirmAddressViewState onStart$lambda$3$lambda$2(ShippingAddress shippingAddress, RhyConfirmAddressViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyConfirmAddressViewState.copy$default(applyMutation, null, shippingAddress, false, null, 13, null);
    }

    public final void submitShippingAddress(UsAddress address) {
        Intrinsics.checkNotNullParameter(address, "address");
        Single<ApiShippingAddress> singleDoFinally = this.addressStore.submitShippingAddress(address).doOnSubscribe(new C275941()).doFinally(new C275952());
        Intrinsics.checkNotNullExpressionValue(singleDoFinally, "doFinally(...)");
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(singleDoFinally), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhymigration.ui.address.RhyConfirmAddressDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyConfirmAddressDuxo.submitShippingAddress$lambda$4((ApiShippingAddress) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.rhymigration.ui.address.RhyConfirmAddressDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyConfirmAddressDuxo.submitShippingAddress$lambda$6(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: RhyConfirmAddressDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhymigration.ui.address.RhyConfirmAddressDuxo$submitShippingAddress$1 */
    static final class C275941<T> implements Consumer {
        C275941() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            RhyConfirmAddressDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.address.RhyConfirmAddressDuxo$submitShippingAddress$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyConfirmAddressDuxo.C275941.accept$lambda$0((RhyConfirmAddressViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RhyConfirmAddressViewState accept$lambda$0(RhyConfirmAddressViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return RhyConfirmAddressViewState.copy$default(applyMutation, null, null, true, null, 11, null);
        }
    }

    /* compiled from: RhyConfirmAddressDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhymigration.ui.address.RhyConfirmAddressDuxo$submitShippingAddress$2 */
    static final class C275952 implements Action {
        C275952() {
        }

        @Override // io.reactivex.functions.Action
        public final void run() {
            RhyConfirmAddressDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.address.RhyConfirmAddressDuxo$submitShippingAddress$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyConfirmAddressDuxo.C275952.run$lambda$0((RhyConfirmAddressViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RhyConfirmAddressViewState run$lambda$0(RhyConfirmAddressViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return RhyConfirmAddressViewState.copy$default(applyMutation, null, null, false, null, 11, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitShippingAddress$lambda$4(ApiShippingAddress apiShippingAddress) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitShippingAddress$lambda$6(RhyConfirmAddressDuxo rhyConfirmAddressDuxo, final Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        rhyConfirmAddressDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.address.RhyConfirmAddressDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyConfirmAddressDuxo.submitShippingAddress$lambda$6$lambda$5(error, (RhyConfirmAddressViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyConfirmAddressViewState submitShippingAddress$lambda$6$lambda$5(Throwable th, RhyConfirmAddressViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyConfirmAddressViewState.copy$default(applyMutation, null, null, false, new UiEvent(th), 7, null);
    }

    /* compiled from: RhyConfirmAddressDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/address/RhyConfirmAddressDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/rhymigration/ui/address/RhyConfirmAddressDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyConfirmAddress;", "<init>", "()V", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RhyConfirmAddressDuxo, LegacyFragmentKey.RhyConfirmAddress> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.RhyConfirmAddress getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.RhyConfirmAddress) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.RhyConfirmAddress getArgs(RhyConfirmAddressDuxo rhyConfirmAddressDuxo) {
            return (LegacyFragmentKey.RhyConfirmAddress) DuxoCompanion.DefaultImpls.getArgs(this, rhyConfirmAddressDuxo);
        }
    }
}

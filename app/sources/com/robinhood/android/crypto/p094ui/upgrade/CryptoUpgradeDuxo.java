package com.robinhood.android.crypto.p094ui.upgrade;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.crypto.p094ui.upgrade.CryptoUpgradeDuxo;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.librobinhood.data.store.CryptoResidencyDocumentStore;
import com.robinhood.librobinhood.data.store.CryptoUpgradeStore;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiCryptoActivation;
import com.robinhood.models.api.ApiResidencyDocument;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function4;
import io.reactivex.rxkotlin.Singles;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoUpgradeDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0016B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeState;", "Lcom/robinhood/android/udf/HasSavedState;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoResidencyDocumentStore", "Lcom/robinhood/librobinhood/data/store/CryptoResidencyDocumentStore;", "cryptoUpgradeStore", "Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;Lcom/robinhood/librobinhood/data/store/CryptoResidencyDocumentStore;Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore;Lcom/robinhood/shared/store/user/UserStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "isFromDeepLink", "", "onStart", "", "Inputs", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CryptoUpgradeDuxo extends OldBaseDuxo<CryptoUpgradeState> implements HasSavedState {
    public static final int $stable = 8;
    private final CryptoAccountStore cryptoAccountStore;
    private final CryptoResidencyDocumentStore cryptoResidencyDocumentStore;
    private final CryptoUpgradeStore cryptoUpgradeStore;
    private final boolean isFromDeepLink;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public CryptoUpgradeDuxo(CryptoAccountStore cryptoAccountStore, CryptoResidencyDocumentStore cryptoResidencyDocumentStore, CryptoUpgradeStore cryptoUpgradeStore, UserStore userStore, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(cryptoResidencyDocumentStore, "cryptoResidencyDocumentStore");
        Intrinsics.checkNotNullParameter(cryptoUpgradeStore, "cryptoUpgradeStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Boolean bool = (Boolean) savedStateHandle.get(CryptoUpgradeActivity.EXTRA_FROM_DEEPLINK);
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        super(new CryptoUpgradeState(null, null, zBooleanValue, null, null, null, true, 59, null), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
        this.cryptoAccountStore = cryptoAccountStore;
        this.cryptoResidencyDocumentStore = cryptoResidencyDocumentStore;
        this.cryptoUpgradeStore = cryptoUpgradeStore;
        this.userStore = userStore;
        this.savedStateHandle = savedStateHandle;
        Boolean bool2 = (Boolean) getSavedStateHandle().get(CryptoUpgradeActivity.EXTRA_FROM_DEEPLINK);
        this.isFromDeepLink = bool2 != null ? bool2.booleanValue() : false;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        Single singleJust;
        Single singleJust2;
        super.onStart();
        this.userStore.refresh(true);
        Single singleRxSingle$default = RxFactory.DefaultImpls.rxSingle$default(this, null, new CryptoUpgradeDuxo4(this, null), 1, null);
        Single singleRxSingle$default2 = RxFactory.DefaultImpls.rxSingle$default(this, null, new CryptoUpgradeDuxo5(this, null), 1, null);
        if (this.isFromDeepLink) {
            singleJust = RxFactory.DefaultImpls.rxSingle$default(this, null, new CryptoUpgradeDuxo2(this, null), 1, null).map(new Function() { // from class: com.robinhood.android.crypto.ui.upgrade.CryptoUpgradeDuxo$onStart$activationsObservable$2
                @Override // io.reactivex.functions.Function
                public final Optional<List<ApiCryptoActivation>> apply(PaginatedResult<ApiCryptoActivation> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Optional3.asOptional(it.getResults());
                }
            });
            Intrinsics.checkNotNull(singleJust);
        } else {
            singleJust = Single.just(Optional2.INSTANCE);
            Intrinsics.checkNotNull(singleJust);
        }
        if (this.isFromDeepLink) {
            singleJust2 = RxFactory.DefaultImpls.rxSingle$default(this, null, new CryptoUpgradeDuxo6(this, null), 1, null).map(new Function() { // from class: com.robinhood.android.crypto.ui.upgrade.CryptoUpgradeDuxo$onStart$residencyDocumentObservable$2
                @Override // io.reactivex.functions.Function
                public final Optional<List<ApiResidencyDocument>> apply(PaginatedResult<ApiResidencyDocument> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Optional3.asOptional(it.getResults());
                }
            });
            Intrinsics.checkNotNull(singleJust2);
        } else {
            singleJust2 = Single.just(Optional2.INSTANCE);
            Intrinsics.checkNotNull(singleJust2);
        }
        Singles singles = Singles.INSTANCE;
        Single singleZip = Single.zip(singleRxSingle$default, singleRxSingle$default2, singleJust, singleJust2, new Function4<T1, T2, T3, T4, R>() { // from class: com.robinhood.android.crypto.ui.upgrade.CryptoUpgradeDuxo$onStart$$inlined$zip$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function4
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Intrinsics.checkParameterIsNotNull(t4, "t4");
                return (R) new CryptoUpgradeDuxo.Inputs((CryptoAccount) ((Optional) t1).component1(), (CryptoUpgradeStore.CryptoUpgradeEligibility) t2, (List) ((Optional) t3).component1(), (List) ((Optional) t4).component1());
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(singleZip, "Single.zip(s1, s2, s3, s…invoke(t1, t2, t3, t4) })");
        LifecycleHost.DefaultImpls.bind$default(this, singleZip, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.ui.upgrade.CryptoUpgradeDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoUpgradeDuxo.onStart$lambda$2(this.f$0, (CryptoUpgradeDuxo.Inputs) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.crypto.ui.upgrade.CryptoUpgradeDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoUpgradeDuxo.onStart$lambda$4(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(CryptoUpgradeDuxo cryptoUpgradeDuxo, final Inputs inputs) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        cryptoUpgradeDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.crypto.ui.upgrade.CryptoUpgradeDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoUpgradeDuxo.onStart$lambda$2$lambda$1(inputs, (CryptoUpgradeState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoUpgradeState onStart$lambda$2$lambda$1(Inputs inputs, CryptoUpgradeState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        CryptoAccount optionalCryptoAccount = inputs.getOptionalCryptoAccount();
        return CryptoUpgradeState.copy$default(applyMutation, inputs.getActivations(), inputs.getEligibility(), false, optionalCryptoAccount, inputs.getResidencyDocuments(), null, false, 36, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(CryptoUpgradeDuxo cryptoUpgradeDuxo, final Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (!Throwables.isNetworkRelated(t)) {
            throw t;
        }
        cryptoUpgradeDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.crypto.ui.upgrade.CryptoUpgradeDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoUpgradeDuxo.onStart$lambda$4$lambda$3(t, (CryptoUpgradeState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoUpgradeState onStart$lambda$4$lambda$3(Throwable th, CryptoUpgradeState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CryptoUpgradeState.copy$default(applyMutation, null, null, false, null, null, new UiEvent(th), false, 95, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CryptoUpgradeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003JC\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeDuxo$Inputs;", "", "optionalCryptoAccount", "Lcom/robinhood/models/crypto/db/CryptoAccount;", "eligibility", "Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore$CryptoUpgradeEligibility;", "activations", "", "Lcom/robinhood/models/api/ApiCryptoActivation;", "residencyDocuments", "Lcom/robinhood/models/api/ApiResidencyDocument;", "<init>", "(Lcom/robinhood/models/crypto/db/CryptoAccount;Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore$CryptoUpgradeEligibility;Ljava/util/List;Ljava/util/List;)V", "getOptionalCryptoAccount", "()Lcom/robinhood/models/crypto/db/CryptoAccount;", "getEligibility", "()Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore$CryptoUpgradeEligibility;", "getActivations", "()Ljava/util/List;", "getResidencyDocuments", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class Inputs {
        private final List<ApiCryptoActivation> activations;
        private final CryptoUpgradeStore.CryptoUpgradeEligibility eligibility;
        private final CryptoAccount optionalCryptoAccount;
        private final List<ApiResidencyDocument> residencyDocuments;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Inputs copy$default(Inputs inputs, CryptoAccount cryptoAccount, CryptoUpgradeStore.CryptoUpgradeEligibility cryptoUpgradeEligibility, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoAccount = inputs.optionalCryptoAccount;
            }
            if ((i & 2) != 0) {
                cryptoUpgradeEligibility = inputs.eligibility;
            }
            if ((i & 4) != 0) {
                list = inputs.activations;
            }
            if ((i & 8) != 0) {
                list2 = inputs.residencyDocuments;
            }
            return inputs.copy(cryptoAccount, cryptoUpgradeEligibility, list, list2);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoAccount getOptionalCryptoAccount() {
            return this.optionalCryptoAccount;
        }

        /* renamed from: component2, reason: from getter */
        public final CryptoUpgradeStore.CryptoUpgradeEligibility getEligibility() {
            return this.eligibility;
        }

        public final List<ApiCryptoActivation> component3() {
            return this.activations;
        }

        public final List<ApiResidencyDocument> component4() {
            return this.residencyDocuments;
        }

        public final Inputs copy(CryptoAccount optionalCryptoAccount, CryptoUpgradeStore.CryptoUpgradeEligibility eligibility, List<ApiCryptoActivation> activations, List<ApiResidencyDocument> residencyDocuments) {
            Intrinsics.checkNotNullParameter(eligibility, "eligibility");
            return new Inputs(optionalCryptoAccount, eligibility, activations, residencyDocuments);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Inputs)) {
                return false;
            }
            Inputs inputs = (Inputs) other;
            return Intrinsics.areEqual(this.optionalCryptoAccount, inputs.optionalCryptoAccount) && Intrinsics.areEqual(this.eligibility, inputs.eligibility) && Intrinsics.areEqual(this.activations, inputs.activations) && Intrinsics.areEqual(this.residencyDocuments, inputs.residencyDocuments);
        }

        public int hashCode() {
            CryptoAccount cryptoAccount = this.optionalCryptoAccount;
            int iHashCode = (((cryptoAccount == null ? 0 : cryptoAccount.hashCode()) * 31) + this.eligibility.hashCode()) * 31;
            List<ApiCryptoActivation> list = this.activations;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<ApiResidencyDocument> list2 = this.residencyDocuments;
            return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        }

        public String toString() {
            return "Inputs(optionalCryptoAccount=" + this.optionalCryptoAccount + ", eligibility=" + this.eligibility + ", activations=" + this.activations + ", residencyDocuments=" + this.residencyDocuments + ")";
        }

        public Inputs(CryptoAccount cryptoAccount, CryptoUpgradeStore.CryptoUpgradeEligibility eligibility, List<ApiCryptoActivation> list, List<ApiResidencyDocument> list2) {
            Intrinsics.checkNotNullParameter(eligibility, "eligibility");
            this.optionalCryptoAccount = cryptoAccount;
            this.eligibility = eligibility;
            this.activations = list;
            this.residencyDocuments = list2;
        }

        public final CryptoAccount getOptionalCryptoAccount() {
            return this.optionalCryptoAccount;
        }

        public final CryptoUpgradeStore.CryptoUpgradeEligibility getEligibility() {
            return this.eligibility;
        }

        public final List<ApiCryptoActivation> getActivations() {
            return this.activations;
        }

        public final List<ApiResidencyDocument> getResidencyDocuments() {
            return this.residencyDocuments;
        }
    }
}

package com.robinhood.android.common.margin.p083ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.regiongate.MarginWithdrawalRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarginSpendingProduct.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bj\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/MarginSpendingProduct;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CASH_MANAGEMENT", "RHY", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class MarginSpendingProduct implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MarginSpendingProduct[] $VALUES;
    public static final Parcelable.Creator<MarginSpendingProduct> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final MarginSpendingProduct CASH_MANAGEMENT = new MarginSpendingProduct("CASH_MANAGEMENT", 0);
    public static final MarginSpendingProduct RHY = new MarginSpendingProduct("RHY", 1);

    private static final /* synthetic */ MarginSpendingProduct[] $values() {
        return new MarginSpendingProduct[]{CASH_MANAGEMENT, RHY};
    }

    public static EnumEntries<MarginSpendingProduct> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }

    private MarginSpendingProduct(String str, int i) {
    }

    static {
        MarginSpendingProduct[] marginSpendingProductArr$values = $values();
        $VALUES = marginSpendingProductArr$values;
        $ENTRIES = EnumEntries2.enumEntries(marginSpendingProductArr$values);
        INSTANCE = new Companion(null);
        CREATOR = new Parcelable.Creator<MarginSpendingProduct>() { // from class: com.robinhood.android.common.margin.ui.MarginSpendingProduct.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MarginSpendingProduct createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return MarginSpendingProduct.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MarginSpendingProduct[] newArray(int i) {
                return new MarginSpendingProduct[i];
            }
        };
    }

    /* compiled from: MarginSpendingProduct.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/MarginSpendingProduct$Companion;", "", "<init>", "()V", "fromAccounts", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/common/margin/ui/MarginSpendingProduct;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Observable<Optional<MarginSpendingProduct>> fromAccounts(final AccountProvider accountProvider, final RhyAccountStore rhyAccountStore, RegionGateProvider regionGateProvider) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Observables observables = Observables.INSTANCE;
            Observable observableCombineLatest = Observable.combineLatest(RegionGateProvider.DefaultImpls.streamRegionGateState$default(regionGateProvider, MarginWithdrawalRegionGate.INSTANCE, false, 2, null), RegionGateProvider.DefaultImpls.streamRegionGateState$default(regionGateProvider, SpendingRegionGate.INSTANCE, false, 2, null), new BiFunction<T1, T2, R>() { // from class: com.robinhood.android.common.margin.ui.MarginSpendingProduct$Companion$fromAccounts$$inlined$combineLatest$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.BiFunction
                public final R apply(T1 t1, T2 t2) {
                    Intrinsics.checkParameterIsNotNull(t1, "t1");
                    Intrinsics.checkParameterIsNotNull(t2, "t2");
                    return (R) Boolean.valueOf(((Boolean) t1).booleanValue() && ((Boolean) t2).booleanValue());
                }
            });
            Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
            Observable<Optional<MarginSpendingProduct>> observableSwitchMap = observableCombineLatest.switchMap(new Function() { // from class: com.robinhood.android.common.margin.ui.MarginSpendingProduct$Companion$fromAccounts$2
                @Override // io.reactivex.functions.Function
                public final ObservableSource<? extends Optional<MarginSpendingProduct>> apply(Boolean areBothRegionGatesEnabled) {
                    Intrinsics.checkNotNullParameter(areBothRegionGatesEnabled, "areBothRegionGatesEnabled");
                    if (areBothRegionGatesEnabled.booleanValue()) {
                        Observables observables2 = Observables.INSTANCE;
                        Observable<Optional<Account>> observableStreamIndividualAccountOptional = accountProvider.streamIndividualAccountOptional();
                        Observable<Optional<RhyAccount>> observable = rhyAccountStore.forceFetchAccountIfNotCached().toObservable();
                        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
                        Observable observableCombineLatest2 = Observable.combineLatest(observableStreamIndividualAccountOptional, observable, new BiFunction<T1, T2, R>() { // from class: com.robinhood.android.common.margin.ui.MarginSpendingProduct$Companion$fromAccounts$2$apply$$inlined$combineLatest$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // io.reactivex.functions.BiFunction
                            public final R apply(T1 t1, T2 t2) {
                                Intrinsics.checkParameterIsNotNull(t1, "t1");
                                Intrinsics.checkParameterIsNotNull(t2, "t2");
                                return (R) Tuples4.m3642to((Account) ((Optional) t1).component1(), (RhyAccount) ((Optional) t2).component1());
                            }
                        });
                        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest2, "Observable.combineLatest…ombineFunction(t1, t2) })");
                        return observableCombineLatest2.map(new Function() { // from class: com.robinhood.android.common.margin.ui.MarginSpendingProduct$Companion$fromAccounts$2.2
                            @Override // io.reactivex.functions.Function
                            public final Optional<MarginSpendingProduct> apply(Tuples2<Account, RhyAccount> tuples2) {
                                MarginSpendingProduct marginSpendingProduct;
                                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                                Account accountComponent1 = tuples2.component1();
                                if (tuples2.component2() != null) {
                                    marginSpendingProduct = MarginSpendingProduct.RHY;
                                } else {
                                    marginSpendingProduct = (accountComponent1 == null || !accountComponent1.getCashManagementEnabled()) ? null : MarginSpendingProduct.CASH_MANAGEMENT;
                                }
                                return Optional3.asOptional(marginSpendingProduct);
                            }
                        }).distinctUntilChanged();
                    }
                    return Observable.just(Optional.INSTANCE.m2972of(null));
                }
            });
            Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
            return observableSwitchMap;
        }
    }

    public static MarginSpendingProduct valueOf(String str) {
        return (MarginSpendingProduct) Enum.valueOf(MarginSpendingProduct.class, str);
    }

    public static MarginSpendingProduct[] values() {
        return (MarginSpendingProduct[]) $VALUES.clone();
    }
}

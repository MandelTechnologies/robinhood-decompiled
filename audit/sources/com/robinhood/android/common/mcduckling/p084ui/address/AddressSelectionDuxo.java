package com.robinhood.android.common.mcduckling.p084ui.address;

import com.robinhood.android.common.mcduckling.address.CardShippingAddress;
import com.robinhood.android.common.mcduckling.address.MailingAddress;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.identi.AddressStore;
import com.robinhood.models.api.ApiShippingAddress;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p355ui.identi.ShippingAddress;
import com.robinhood.models.p355ui.identi.UiAddress;
import com.robinhood.models.p355ui.identi.UsAddress;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.udf.UiEvent;
import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;
import io.reactivex.rxkotlin.Observables;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AddressSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u000bH\u0002J\u0014\u0010\u0018\u001a\u00020\u0019*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/address/AddressSelectionDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/common/mcduckling/ui/address/AddressSelectionState;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "addressStore", "Lcom/robinhood/librobinhood/data/store/identi/AddressStore;", "<init>", "(Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/librobinhood/data/store/identi/AddressStore;)V", "value", "Lcom/robinhood/udf/UiEvent;", "Ljava/util/UUID;", "startingAddressIdEvent", "getStartingAddressIdEvent", "()Lcom/robinhood/udf/UiEvent;", "onCreate", "", "refresh", "getShippingAddresses", "saveShippingAddress", "shippingAddress", "Lcom/robinhood/models/ui/identi/UsAddress;", "setStartingAddressId", "id", "toOnboardingShippingAddress", "Lcom/robinhood/android/common/mcduckling/address/CardShippingAddress;", "Lcom/robinhood/models/ui/identi/ShippingAddress;", "fullName", "", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AddressSelectionDuxo extends OldBaseDuxo<AddressSelectionState> {
    private final AddressStore addressStore;
    private UiEvent<UUID> startingAddressIdEvent;
    private final UserStore userStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AddressSelectionDuxo(UserStore userStore, AddressStore addressStore) {
        super(new AddressSelectionState(false, null, null, null, null, 31, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(addressStore, "addressStore");
        this.userStore = userStore;
        this.addressStore = addressStore;
    }

    public final UiEvent<UUID> getStartingAddressIdEvent() {
        return this.startingAddressIdEvent;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        getShippingAddresses();
    }

    public final void refresh() {
        this.addressStore.refreshShippingAddress(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddressSelectionState getShippingAddresses$lambda$0(AddressSelectionState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AddressSelectionState.copy$default(applyMutation, true, null, null, null, null, 30, null);
    }

    public final void getShippingAddresses() {
        applyMutation(new Function1() { // from class: com.robinhood.android.common.mcduckling.ui.address.AddressSelectionDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressSelectionDuxo.getShippingAddresses$lambda$0((AddressSelectionState) obj);
            }
        });
        this.userStore.refresh(false);
        refresh();
        Observables observables = Observables.INSTANCE;
        Observable observableCombineLatest = Observable.combineLatest(this.userStore.getUser(), this.addressStore.streamShippingAddresses(), new BiFunction<T1, T2, R>() { // from class: com.robinhood.android.common.mcduckling.ui.address.AddressSelectionDuxo$getShippingAddresses$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t1, T2 t2) {
                Object next;
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                User user = (User) t1;
                List listSortedWith = CollectionsKt.sortedWith((List) t2, new Comparator() { // from class: com.robinhood.android.common.mcduckling.ui.address.AddressSelectionDuxo$getShippingAddresses$lambda$5$$inlined$sortedByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t3) {
                        return ComparisonsKt.compareValues(Boolean.valueOf(((ShippingAddress) t3).isBilling()), Boolean.valueOf(((ShippingAddress) t).isBilling()));
                    }
                });
                ArrayList arrayList = new ArrayList();
                for (Object obj : listSortedWith) {
                    if (((ShippingAddress) obj).getAddress() instanceof UsAddress) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(this.this$0.toOnboardingShippingAddress((ShippingAddress) it.next(), user.getFullName()));
                }
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (((CardShippingAddress) next).isBillingAddress()) {
                        break;
                    }
                }
                return (R) new Tuples2(arrayList2, (CardShippingAddress) next);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableCombineLatest, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.common.mcduckling.ui.address.AddressSelectionDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressSelectionDuxo.getShippingAddresses$lambda$7(this.f$0, (Tuples2) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.common.mcduckling.ui.address.AddressSelectionDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressSelectionDuxo.getShippingAddresses$lambda$9(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getShippingAddresses$lambda$7(AddressSelectionDuxo addressSelectionDuxo, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        final List list = (List) tuples2.component1();
        final CardShippingAddress cardShippingAddress = (CardShippingAddress) tuples2.component2();
        addressSelectionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.mcduckling.ui.address.AddressSelectionDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressSelectionDuxo.getShippingAddresses$lambda$7$lambda$6(cardShippingAddress, list, (AddressSelectionState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddressSelectionState getShippingAddresses$lambda$7$lambda$6(CardShippingAddress cardShippingAddress, List list, AddressSelectionState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AddressSelectionState.copy$default(applyMutation, false, cardShippingAddress, list, null, null, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getShippingAddresses$lambda$9(AddressSelectionDuxo addressSelectionDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        addressSelectionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.mcduckling.ui.address.AddressSelectionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressSelectionDuxo.getShippingAddresses$lambda$9$lambda$8(throwable, (AddressSelectionState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddressSelectionState getShippingAddresses$lambda$9$lambda$8(Throwable th, AddressSelectionState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AddressSelectionState.copy$default(applyMutation, false, null, CollectionsKt.emptyList(), new UiEvent(th), null, 18, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddressSelectionState saveShippingAddress$lambda$10(AddressSelectionState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AddressSelectionState.copy$default(applyMutation, true, null, null, null, null, 30, null);
    }

    public final void saveShippingAddress(UsAddress shippingAddress) {
        Intrinsics.checkNotNullParameter(shippingAddress, "shippingAddress");
        applyMutation(new Function1() { // from class: com.robinhood.android.common.mcduckling.ui.address.AddressSelectionDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressSelectionDuxo.saveShippingAddress$lambda$10((AddressSelectionState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.addressStore.submitShippingAddress(shippingAddress), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.mcduckling.ui.address.AddressSelectionDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressSelectionDuxo.saveShippingAddress$lambda$11(this.f$0, (ApiShippingAddress) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.common.mcduckling.ui.address.AddressSelectionDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressSelectionDuxo.saveShippingAddress$lambda$13(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit saveShippingAddress$lambda$11(AddressSelectionDuxo addressSelectionDuxo, ApiShippingAddress addressResult) {
        Intrinsics.checkNotNullParameter(addressResult, "addressResult");
        addressSelectionDuxo.setStartingAddressId(addressResult.getId());
        addressSelectionDuxo.refresh();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit saveShippingAddress$lambda$13(AddressSelectionDuxo addressSelectionDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        addressSelectionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.mcduckling.ui.address.AddressSelectionDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressSelectionDuxo.saveShippingAddress$lambda$13$lambda$12(throwable, (AddressSelectionState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddressSelectionState saveShippingAddress$lambda$13$lambda$12(Throwable th, AddressSelectionState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AddressSelectionState.copy$default(applyMutation, false, null, null, null, new UiEvent(th), 14, null);
    }

    private final void setStartingAddressId(UUID id) {
        this.startingAddressIdEvent = new UiEvent<>(id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CardShippingAddress toOnboardingShippingAddress(ShippingAddress shippingAddress, String str) {
        UUID id = shippingAddress.getId();
        UiAddress address = shippingAddress.getAddress();
        Intrinsics.checkNotNull(address, "null cannot be cast to non-null type com.robinhood.models.ui.identi.UsAddress");
        return new CardShippingAddress(id, new MailingAddress(str, (UsAddress) address), shippingAddress.isBilling(), shippingAddress.isValidSoftCheck());
    }
}

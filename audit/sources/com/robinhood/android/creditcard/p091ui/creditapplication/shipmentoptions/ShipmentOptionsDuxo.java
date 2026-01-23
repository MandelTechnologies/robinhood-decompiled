package com.robinhood.android.creditcard.p091ui.creditapplication.shipmentoptions;

import android.app.Application;
import android.location.Address;
import android.location.Geocoder;
import android.location.Geocoder$GeocodeListener;
import android.os.Build;
import androidx.lifecycle.ViewModel2;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.creditcard.p091ui.creditapplication.identity.IdentityDuxo$$ExternalSyntheticApiModelOutline0;
import com.robinhood.android.creditcard.p091ui.creditapplication.shipmentoptions.ShipmentOptionsEvent;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import com.robinhood.android.models.creditcard.api.graphql.CreateCreditAccountResponse;
import com.robinhood.android.models.creditcard.api.graphql.GraphqlValidationType;
import com.robinhood.android.models.creditcard.api.graphql.ShipmentOption;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.coroutines.dagger.annotation.DefaultDispatcher;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ShipmentOptionsDuxo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\r\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0011J%\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0000¢\u0006\u0002\b\u0019J'\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0000¢\u0006\u0002\b\u001bJ&\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0082@¢\u0006\u0002\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0016H\u0000¢\u0006\u0002\b R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsViewState;", "Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsEvent;", "app", "Landroid/app/Application;", "creditCardStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Landroid/app/Application;Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;Lcom/robinhood/android/udf/DuxoBundle;Lkotlinx/coroutines/CoroutineDispatcher;)V", "onStart", "", "doneLoading", "doneLoading$feature_credit_card_externalDebug", "onContinue", AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION, "Lcom/robinhood/android/models/creditcard/api/graphql/ShipmentOption;", "sigRequired", "", PlaceTypes.ADDRESS, "Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "onContinue$feature_credit_card_externalDebug", "continueIgnoreSkippableAddressError", "continueIgnoreSkippableAddressError$feature_credit_card_externalDebug", "createCreditAccountAndContinue", "(Lcom/robinhood/android/models/creditcard/api/graphql/ShipmentOption;ZLcom/robinhood/android/models/creditcard/api/graphql/AddressType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAddress", "animate", "updateAddress$feature_credit_card_externalDebug", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ShipmentOptionsDuxo extends BaseDuxo5<ShipmentOptionsViewState, ShipmentOptionsEvent> {
    public static final int $stable = 8;
    private final Application app;
    private final CreditCardStore creditCardStore;
    private final CoroutineDispatcher defaultDispatcher;

    /* compiled from: ShipmentOptionsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsDuxo", m3645f = "ShipmentOptionsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m3647m = "createCreditAccountAndContinue")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsDuxo$createCreditAccountAndContinue$1 */
    static final class C125571 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C125571(Continuation<? super C125571> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ShipmentOptionsDuxo.this.createCreditAccountAndContinue(null, false, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShipmentOptionsDuxo(Application app, CreditCardStore creditCardStore, DuxoBundle duxoBundle, @DefaultDispatcher CoroutineDispatcher defaultDispatcher) {
        super(new ShipmentOptionsViewState(false, null, null, null, null, false, 63, null), duxoBundle);
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        this.app = app;
        this.creditCardStore = creditCardStore;
        this.defaultDispatcher = defaultDispatcher;
    }

    /* compiled from: ShipmentOptionsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsDuxo$onStart$1", m3645f = "ShipmentOptionsDuxo.kt", m3646l = {36}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsDuxo$onStart$1 */
    static final class C125601 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C125601(Continuation<? super C125601> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ShipmentOptionsDuxo.this.new C125601(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C125601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CreditCardStore creditCardStore = ShipmentOptionsDuxo.this.creditCardStore;
                this.label = 1;
                obj = creditCardStore.getShipmentOptions(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ShipmentOptionsDuxo.this.applyMutation(new AnonymousClass1((List) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: ShipmentOptionsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsDuxo$onStart$1$1", m3645f = "ShipmentOptionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ShipmentOptionsViewState, Continuation<? super ShipmentOptionsViewState>, Object> {
            final /* synthetic */ List<ShipmentOption> $shipmentOptions;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(List<ShipmentOption> list, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$shipmentOptions = list;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$shipmentOptions, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ShipmentOptionsViewState shipmentOptionsViewState, Continuation<? super ShipmentOptionsViewState> continuation) {
                return ((AnonymousClass1) create(shipmentOptionsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                ImmutableList immutableList;
                String logoUrl;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ShipmentOptionsViewState shipmentOptionsViewState = (ShipmentOptionsViewState) this.L$0;
                List<ShipmentOption> list = this.$shipmentOptions;
                if (list != null) {
                    List<ShipmentOption> list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (ShipmentOption shipmentOption : list2) {
                        if (shipmentOption.getLogoUrl().length() > 0) {
                            logoUrl = shipmentOption.getLogoUrl() + "?theme=gold";
                        } else {
                            logoUrl = shipmentOption.getLogoUrl();
                        }
                        arrayList.add(shipmentOption.copy((1919 & 1) != 0 ? shipmentOption.id : null, (1919 & 2) != 0 ? shipmentOption.name : null, (1919 & 4) != 0 ? shipmentOption.description : null, (1919 & 8) != 0 ? shipmentOption.cardDescription : null, (1919 & 16) != 0 ? shipmentOption.carrier : null, (1919 & 32) != 0 ? shipmentOption.deliveryMethod : null, (1919 & 64) != 0 ? shipmentOption.canRequireSignature : false, (1919 & 128) != 0 ? shipmentOption.logoUrl : logoUrl, (1919 & 256) != 0 ? shipmentOption.eta : 0L, (1919 & 512) != 0 ? shipmentOption.etaEnd : null, (1919 & 1024) != 0 ? shipmentOption.feeAmountMicro : 0.0d));
                    }
                    immutableList = extensions2.toImmutableList(arrayList);
                } else {
                    immutableList = null;
                }
                return ShipmentOptionsViewState.copy$default(shipmentOptionsViewState, false, null, null, null, immutableList, false, 47, null);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.defaultDispatcher, null, new C125601(null), 2, null);
    }

    public final void doneLoading$feature_credit_card_externalDebug() {
        applyMutation(new ShipmentOptionsDuxo$doneLoading$1(null));
    }

    public final void onContinue$feature_credit_card_externalDebug(ShipmentOption option, boolean sigRequired, AddressType address) {
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(address, "address");
        applyMutation(new ShipmentOptionsDuxo$onContinue$1(null));
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.defaultDispatcher, null, new ShipmentOptionsDuxo$onContinue$2(this, address, option, sigRequired, null), 2, null);
    }

    /* renamed from: continueIgnoreSkippableAddressError$feature_credit_card_externalDebug */
    public final void m1880xd227ee18(final ShipmentOption option, final boolean sigRequired, final AddressType address) {
        Intrinsics.checkNotNullParameter(address, "address");
        applyMutation(new ShipmentOptionsDuxo$continueIgnoreSkippableAddressError$1(null));
        withDataState(new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShipmentOptionsDuxo.continueIgnoreSkippableAddressError$lambda$0(this.f$0, option, sigRequired, address, (ShipmentOptionsViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit continueIgnoreSkippableAddressError$lambda$0(ShipmentOptionsDuxo shipmentOptionsDuxo, ShipmentOption shipmentOption, boolean z, AddressType addressType, ShipmentOptionsViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(shipmentOptionsDuxo), shipmentOptionsDuxo.defaultDispatcher, null, new ShipmentOptionsDuxo$continueIgnoreSkippableAddressError$2$1(shipmentOption, shipmentOptionsDuxo, z, addressType, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createCreditAccountAndContinue(ShipmentOption shipmentOption, boolean z, AddressType addressType, Continuation<? super Unit> continuation) {
        C125571 c125571;
        GraphqlValidationType<CreateCreditAccountResponse.Response> createCreditAccount;
        CreateCreditAccountResponse.Response data;
        CreateCreditAccountResponse.Response.Customer customer;
        if (continuation instanceof C125571) {
            c125571 = (C125571) continuation;
            int i = c125571.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c125571.label = i - Integer.MIN_VALUE;
            } else {
                c125571 = new C125571(continuation);
            }
        }
        Object objCreateCreditAccount = c125571.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c125571.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateCreditAccount);
            CreditCardStore creditCardStore = this.creditCardStore;
            c125571.L$0 = shipmentOption;
            c125571.label = 1;
            objCreateCreditAccount = creditCardStore.createCreditAccount(shipmentOption, z, addressType, c125571);
            if (objCreateCreditAccount == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            shipmentOption = (ShipmentOption) c125571.L$0;
            ResultKt.throwOnFailure(objCreateCreditAccount);
        }
        CreateCreditAccountResponse createCreditAccountResponse = (CreateCreditAccountResponse) objCreateCreditAccount;
        if (((createCreditAccountResponse == null || (createCreditAccount = createCreditAccountResponse.getCreateCreditAccount()) == null || (data = createCreditAccount.getData()) == null || (customer = data.getCustomer()) == null) ? null : customer.getId()) != null) {
            submit(new ShipmentOptionsEvent.Continue(shipmentOption));
        } else {
            submit(ShipmentOptionsEvent.Error.INSTANCE);
        }
        applyMutation(new C125582(null));
        return Unit.INSTANCE;
    }

    /* compiled from: ShipmentOptionsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsDuxo$createCreditAccountAndContinue$2", m3645f = "ShipmentOptionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsDuxo$createCreditAccountAndContinue$2 */
    static final class C125582 extends ContinuationImpl7 implements Function2<ShipmentOptionsViewState, Continuation<? super ShipmentOptionsViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C125582(Continuation<? super C125582> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C125582 c125582 = new C125582(continuation);
            c125582.L$0 = obj;
            return c125582;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ShipmentOptionsViewState shipmentOptionsViewState, Continuation<? super ShipmentOptionsViewState> continuation) {
            return ((C125582) create(shipmentOptionsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ShipmentOptionsViewState.copy$default((ShipmentOptionsViewState) this.L$0, false, null, null, null, null, false, 62, null);
        }
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [T, java.lang.Double] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, java.lang.Double] */
    public final void updateAddress$feature_credit_card_externalDebug(final AddressType address, final boolean animate) throws IOException {
        Intrinsics.checkNotNullParameter(address, "address");
        String str = address.getPrimaryAddressLine() + PlaceholderUtils.XXShortPlaceholderText + address.getSecondaryAddressLine() + PlaceholderUtils.XXShortPlaceholderText + address.getLocality() + PlaceholderUtils.XXShortPlaceholderText + address.getSubdivision() + PlaceholderUtils.XXShortPlaceholderText + address.getZip();
        Geocoder geocoder = new Geocoder(this.app);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        if (Build.VERSION.SDK_INT >= 33) {
            geocoder.getFromLocationName(str, 1, IdentityDuxo$$ExternalSyntheticApiModelOutline0.m1878m(new Geocoder$GeocodeListener() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsDuxo$updateAddress$1
                /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Double] */
                /* JADX WARN: Type inference failed for: r7v4, types: [T, java.lang.Double] */
                public final void onGeocode(List<Address> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (!it.isEmpty()) {
                        objectRef.element = Double.valueOf(it.get(0).getLatitude());
                        objectRef2.element = Double.valueOf(it.get(0).getLongitude());
                    }
                    this.applyMutation(new C125611(address, objectRef, objectRef2, animate, null));
                }

                /* compiled from: ShipmentOptionsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsDuxo$updateAddress$1$1", m3645f = "ShipmentOptionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsDuxo$updateAddress$1$1 */
                static final class C125611 extends ContinuationImpl7 implements Function2<ShipmentOptionsViewState, Continuation<? super ShipmentOptionsViewState>, Object> {
                    final /* synthetic */ AddressType $address;
                    final /* synthetic */ boolean $animate;
                    final /* synthetic */ Ref.ObjectRef<Double> $lang;
                    final /* synthetic */ Ref.ObjectRef<Double> $lat;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C125611(AddressType addressType, Ref.ObjectRef<Double> objectRef, Ref.ObjectRef<Double> objectRef2, boolean z, Continuation<? super C125611> continuation) {
                        super(2, continuation);
                        this.$address = addressType;
                        this.$lat = objectRef;
                        this.$lang = objectRef2;
                        this.$animate = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C125611 c125611 = new C125611(this.$address, this.$lat, this.$lang, this.$animate, continuation);
                        c125611.L$0 = obj;
                        return c125611;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ShipmentOptionsViewState shipmentOptionsViewState, Continuation<? super ShipmentOptionsViewState> continuation) {
                        return ((C125611) create(shipmentOptionsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ShipmentOptionsViewState.copy$default((ShipmentOptionsViewState) this.L$0, false, this.$address, this.$lat.element, this.$lang.element, null, this.$animate, 17, null);
                    }
                }
            }));
            return;
        }
        List<Address> fromLocationName = geocoder.getFromLocationName(str, 1);
        List<Address> list = fromLocationName;
        if (list != null && !list.isEmpty()) {
            objectRef.element = Double.valueOf(fromLocationName.get(0).getLatitude());
            objectRef2.element = Double.valueOf(fromLocationName.get(0).getLongitude());
        }
        applyMutation(new ShipmentOptionsDuxo$updateAddress$2(address, objectRef, objectRef2, animate, null));
    }
}

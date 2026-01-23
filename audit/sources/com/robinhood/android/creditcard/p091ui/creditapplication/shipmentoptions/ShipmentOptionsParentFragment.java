package com.robinhood.android.creditcard.p091ui.creditapplication.shipmentoptions;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.creditcard.p091ui.creditapplication.address.AddressFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.address.error.AddressErrorFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.navigation.NavigationUtils;
import com.robinhood.android.creditcard.p091ui.creditapplication.shipmentconfirmation.ShipmentConfirmationFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.shipmentoptions.ShipmentOptionsFragment;
import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import com.robinhood.android.models.creditcard.api.graphql.AddressType2;
import com.robinhood.android.models.creditcard.api.graphql.ShipmentOption;
import com.robinhood.android.regiongate.CreditCardRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.io.IOException;
import java.util.Set;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: ShipmentOptionsParentFragment.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002*+B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u000fH\u0016J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J0\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020!H\u0016J\"\u0010#\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\"\u001a\u00020!H\u0016J\t\u0010$\u001a\u00020!H\u0096\u0001R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&X\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsFragment$ParentCallbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/AddressFragment$Callbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/error/AddressErrorFragment$Callbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsDuxo;", "getDuxo", "()Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onSaveAddress", PlaceTypes.ADDRESS, "Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "onEditShipmentAddress", "onEditAddress", "showConfirmation", AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION, "Lcom/robinhood/android/models/creditcard/api/graphql/ShipmentOption;", "toAddressValidationError", "error", "Lcom/robinhood/android/models/creditcard/api/graphql/AddressErrorType;", "isSkippable", "", "sigRequired", "submit", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ShipmentOptionsParentFragment extends BaseFragment implements RegionGated, ShipmentOptionsFragment.ParentCallbacks, AddressFragment.Callbacks, AddressErrorFragment.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public ShipmentOptionsParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.$$delegate_0 = new RegionGated2(CreditCardRegionGate.INSTANCE);
        this.duxo = DuxosKt.duxo(this, ShipmentOptionsDuxo.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShipmentOptionsDuxo getDuxo() {
        return (ShipmentOptionsDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) throws IOException {
        super.onCreate(savedInstanceState);
        ShipmentOptionsDuxo duxo = getDuxo();
        Companion companion = INSTANCE;
        duxo.updateAddress$feature_credit_card_externalDebug(((Args) companion.getArgs((Fragment) this)).getAddress(), false);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, ShipmentOptionsFragment.INSTANCE.newInstance((Parcelable) new ShipmentOptionsFragment.Args(((Args) companion.getArgs((Fragment) this)).getAddress(), ((Args) companion.getArgs((Fragment) this)).getIsSolidGold(), null, null, ((Args) companion.getArgs((Fragment) this)).getEntryPointSource(), null, false, null, false, 384, null)));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C125651(null), 1, null);
    }

    /* compiled from: ShipmentOptionsParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsParentFragment$onViewCreated$1", m3645f = "ShipmentOptionsParentFragment.kt", m3646l = {61}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsParentFragment$onViewCreated$1 */
    static final class C125651 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C125651(Continuation<? super C125651> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ShipmentOptionsParentFragment.this.new C125651(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C125651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<ShipmentOptionsViewState> stateFlow = ShipmentOptionsParentFragment.this.getDuxo().getStateFlow();
                final ShipmentOptionsParentFragment shipmentOptionsParentFragment = ShipmentOptionsParentFragment.this;
                FlowCollector<? super ShipmentOptionsViewState> flowCollector = new FlowCollector() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsParentFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ShipmentOptionsViewState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(ShipmentOptionsViewState shipmentOptionsViewState, Continuation<? super Unit> continuation) {
                        ShipmentOptionsFragment.Companion companion = ShipmentOptionsFragment.INSTANCE;
                        AddressType address = shipmentOptionsViewState.getAddress();
                        if (address == null) {
                            address = ((Args) ShipmentOptionsParentFragment.INSTANCE.getArgs((Fragment) shipmentOptionsParentFragment)).getAddress();
                        }
                        AddressType addressType = address;
                        Companion companion2 = ShipmentOptionsParentFragment.INSTANCE;
                        ShipmentOptionsFragment shipmentOptionsFragment = (ShipmentOptionsFragment) companion.newInstance((Parcelable) new ShipmentOptionsFragment.Args(addressType, ((Args) companion2.getArgs((Fragment) shipmentOptionsParentFragment)).getIsSolidGold(), shipmentOptionsViewState.getLat(), shipmentOptionsViewState.getLong(), ((Args) companion2.getArgs((Fragment) shipmentOptionsParentFragment)).getEntryPointSource(), shipmentOptionsViewState.getOptions(), false, null, false, 384, null));
                        if (shipmentOptionsViewState.getAnimate()) {
                            NavigationUtils.appReplaceFragmentWithoutBackStack(shipmentOptionsParentFragment, shipmentOptionsFragment);
                        } else {
                            boxing.boxInt(shipmentOptionsParentFragment.replaceFragmentWithoutAnimationAndBackStack(shipmentOptionsFragment));
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.address.AddressFragment.Callbacks
    public void onSaveAddress(AddressType address) throws IOException {
        Intrinsics.checkNotNullParameter(address, "address");
        getDuxo().updateAddress$feature_credit_card_externalDebug(address, true);
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsFragment.ParentCallbacks
    public void onEditShipmentAddress() {
        NavigationUtils.appReplaceFragment(this, AddressFragment.INSTANCE.newInstance((Parcelable) new AddressFragment.Args(true)));
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.address.error.AddressErrorFragment.Callbacks
    public void onEditAddress() {
        NavigationUtils.appReplaceFragmentWithoutBackStack(this, AddressFragment.INSTANCE.newInstance((Parcelable) new AddressFragment.Args(true)));
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsFragment.ParentCallbacks
    public void showConfirmation(ShipmentOption option) {
        Intrinsics.checkNotNullParameter(option, "option");
        NavigationUtils.appReplaceFragment(this, ShipmentConfirmationFragment.INSTANCE.newInstance((Parcelable) new ShipmentConfirmationFragment.Args(option)));
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsFragment.ParentCallbacks
    public void toAddressValidationError(AddressType address, AddressType2 error, boolean isSkippable, ShipmentOption option, boolean sigRequired) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(option, "option");
        NavigationUtils.appReplaceFragmentWithoutBackStack(this, AddressErrorFragment.INSTANCE.newInstance((Parcelable) new AddressErrorFragment.Args(address, error, isSkippable, true, option, sigRequired)));
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.address.error.AddressErrorFragment.Callbacks
    public void submit(AddressType address, ShipmentOption option, boolean sigRequired) {
        Intrinsics.checkNotNullParameter(address, "address");
        ShipmentOptionsViewState value = getDuxo().getStateFlow().getValue();
        ShipmentOptionsFragment.Companion companion = ShipmentOptionsFragment.INSTANCE;
        AddressType address2 = value.getAddress();
        if (address2 == null) {
            address2 = ((Args) INSTANCE.getArgs((Fragment) this)).getAddress();
        }
        AddressType addressType = address2;
        Companion companion2 = INSTANCE;
        NavigationUtils.appReplaceFragmentWithoutBackStack(this, companion.newInstance((Parcelable) new ShipmentOptionsFragment.Args(addressType, ((Args) companion2.getArgs((Fragment) this)).getIsSolidGold(), value.getLat(), value.getLong(), ((Args) companion2.getArgs((Fragment) this)).getEntryPointSource(), value.getOptions(), true, option, sigRequired)));
    }

    /* compiled from: ShipmentOptionsParentFragment.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsParentFragment$Args;", "Landroid/os/Parcelable;", PlaceTypes.ADDRESS, "Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "isSolidGold", "", "entryPointSource", "", "<init>", "(Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;ZLjava/lang/String;)V", "getAddress", "()Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "()Z", "getEntryPointSource", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final AddressType address;
        private final String entryPointSource;
        private final boolean isSolidGold;

        /* compiled from: ShipmentOptionsParentFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((AddressType) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.address, flags);
            dest.writeInt(this.isSolidGold ? 1 : 0);
            dest.writeString(this.entryPointSource);
        }

        public Args(AddressType address, boolean z, String str) {
            Intrinsics.checkNotNullParameter(address, "address");
            this.address = address;
            this.isSolidGold = z;
            this.entryPointSource = str;
        }

        public /* synthetic */ Args(AddressType addressType, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(addressType, z, (i & 4) != 0 ? null : str);
        }

        public final AddressType getAddress() {
            return this.address;
        }

        /* renamed from: isSolidGold, reason: from getter */
        public final boolean getIsSolidGold() {
            return this.isSolidGold;
        }

        public final String getEntryPointSource() {
            return this.entryPointSource;
        }
    }

    /* compiled from: ShipmentOptionsParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsParentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsParentFragment;", "Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsParentFragment$Args;", "<init>", "()V", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ShipmentOptionsParentFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(ShipmentOptionsParentFragment shipmentOptionsParentFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, shipmentOptionsParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ShipmentOptionsParentFragment newInstance(Args args) {
            return (ShipmentOptionsParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ShipmentOptionsParentFragment shipmentOptionsParentFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, shipmentOptionsParentFragment, args);
        }
    }
}

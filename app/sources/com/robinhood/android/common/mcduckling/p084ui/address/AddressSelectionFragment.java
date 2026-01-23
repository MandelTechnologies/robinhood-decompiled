package com.robinhood.android.common.mcduckling.p084ui.address;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.mcduckling.C11257R;
import com.robinhood.android.common.mcduckling.address.CardShippingAddress;
import com.robinhood.android.common.mcduckling.address.MailingAddress;
import com.robinhood.android.common.mcduckling.p084ui.address.AddressAdapter;
import com.robinhood.android.common.mcduckling.p084ui.address.AddressSelectionFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.p090rx.ErrorHandlers;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.app.keys.data.ChooseAddressResult;
import com.robinhood.android.navigation.app.keys.data.ChooseAddressSource;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p355ui.identi.UiAddress;
import com.robinhood.models.p355ui.identi.UsAddress;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.StyleResource;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: AddressSelectionFragment.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \\2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003Z[\\B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\"\u0010@\u001a\u00020;2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020B2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\u0010\u0010F\u001a\u00020;2\u0006\u0010G\u001a\u00020HH\u0016J\u0010\u0010I\u001a\u00020;2\u0006\u0010J\u001a\u000202H\u0016J\u001a\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020B2\b\u0010N\u001a\u0004\u0018\u00010?H\u0016J\b\u0010O\u001a\u00020;H\u0002J\u0010\u0010P\u001a\u00020;2\u0006\u0010J\u001a\u000202H\u0002J\u0018\u0010Q\u001a\u00020;2\u0006\u0010R\u001a\u00020S2\u0006\u0010A\u001a\u00020BH\u0002J\t\u0010T\u001a\u00020LH\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001d\u0010\u001aR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0011\u001a\u0004\b!\u0010\"R\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0011\u001a\u0004\b%\u0010\"R\u001b\u0010'\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0011\u001a\u0004\b(\u0010\"R\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u0011\u001a\u0004\b,\u0010-R\u000e\u0010/\u001a\u000200X\u0082.¢\u0006\u0002\n\u0000R/\u00103\u001a\u0004\u0018\u0001022\b\u00101\u001a\u0004\u0018\u0001028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0018\u0010U\u001a\b\u0012\u0004\u0012\u00020W0VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006]"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/address/AddressSelectionFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/mcduckling/ui/address/AddressAdapter$Callbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/common/mcduckling/ui/address/AddressSelectionDuxo;", "getDuxo", "()Lcom/robinhood/android/common/mcduckling/ui/address/AddressSelectionDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "scrollView", "Landroidx/core/widget/NestedScrollView;", "getScrollView", "()Landroidx/core/widget/NestedScrollView;", "scrollView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView$delegate", "billingPrimaryTxt", "Landroid/widget/TextView;", "getBillingPrimaryTxt", "()Landroid/widget/TextView;", "billingPrimaryTxt$delegate", "billingSecondaryTxt", "getBillingSecondaryTxt", "billingSecondaryTxt$delegate", "changeBillingBtn", "Landroid/widget/Button;", "getChangeBillingBtn", "()Landroid/widget/Button;", "changeBillingBtn$delegate", "addNewBtn", "getAddNewBtn", "addNewBtn$delegate", "primaryActionBtn", "getPrimaryActionBtn", "primaryActionBtn$delegate", "callbacks", "Lcom/robinhood/android/common/mcduckling/ui/address/AddressSelectionFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/mcduckling/ui/address/AddressSelectionFragment$Callbacks;", "callbacks$delegate", "addressAdapter", "Lcom/robinhood/android/common/mcduckling/ui/address/AddressAdapter;", "<set-?>", "Lcom/robinhood/android/common/mcduckling/address/CardShippingAddress;", "selectedShippingAddress", "getSelectedShippingAddress", "()Lcom/robinhood/android/common/mcduckling/address/CardShippingAddress;", "setSelectedShippingAddress", "(Lcom/robinhood/android/common/mcduckling/address/CardShippingAddress;)V", "selectedShippingAddress$delegate", "Lkotlin/properties/ReadWriteProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onAddressSelected", "shippingAddress", "onPositiveButtonClicked", "", "id", "passthroughArgs", "showBillingAddressLengthDialog", "showUnrecognizedAddressDialog", "launchAddressChooser", "source", "Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressSource;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AddressSelectionFragment extends BaseFragment implements RegionGated, AddressAdapter.Callbacks {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AddressSelectionFragment.class, "scrollView", "getScrollView()Landroidx/core/widget/NestedScrollView;", 0)), Reflection.property1(new PropertyReference1Impl(AddressSelectionFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)), Reflection.property1(new PropertyReference1Impl(AddressSelectionFragment.class, "billingPrimaryTxt", "getBillingPrimaryTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(AddressSelectionFragment.class, "billingSecondaryTxt", "getBillingSecondaryTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(AddressSelectionFragment.class, "changeBillingBtn", "getChangeBillingBtn()Landroid/widget/Button;", 0)), Reflection.property1(new PropertyReference1Impl(AddressSelectionFragment.class, "addNewBtn", "getAddNewBtn()Landroid/widget/Button;", 0)), Reflection.property1(new PropertyReference1Impl(AddressSelectionFragment.class, "primaryActionBtn", "getPrimaryActionBtn()Landroid/widget/Button;", 0)), Reflection.property1(new PropertyReference1Impl(AddressSelectionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/mcduckling/ui/address/AddressSelectionFragment$Callbacks;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(AddressSelectionFragment.class, "selectedShippingAddress", "getSelectedShippingAddress()Lcom/robinhood/android/common/mcduckling/address/CardShippingAddress;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String PASS_THROUGH_ADDRESS = "address";
    private static final int REQUEST_CHANGE_RESIDENTIAL = 1;
    private static final int REQUEST_NEW_SHIPPING_ADDRESS = 2;
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: addNewBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 addNewBtn;
    private AddressAdapter addressAdapter;

    /* renamed from: billingPrimaryTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 billingPrimaryTxt;

    /* renamed from: billingSecondaryTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 billingSecondaryTxt;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: changeBillingBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 changeBillingBtn;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: primaryActionBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 primaryActionBtn;

    /* renamed from: recyclerView$delegate, reason: from kotlin metadata */
    private final Interfaces2 recyclerView;

    /* renamed from: scrollView$delegate, reason: from kotlin metadata */
    private final Interfaces2 scrollView;

    /* renamed from: selectedShippingAddress$delegate, reason: from kotlin metadata */
    private final Interfaces3 selectedShippingAddress;

    /* compiled from: AddressSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/address/AddressSelectionFragment$Callbacks;", "", "onCardShippingAddressSelected", "", "shippingAddress", "Lcom/robinhood/android/common/mcduckling/address/CardShippingAddress;", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onCardShippingAddressSelected(CardShippingAddress shippingAddress);
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public AddressSelectionFragment() {
        super(C11257R.layout.fragment_address_selection);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, AddressSelectionDuxo.class);
        this.scrollView = bindView(C11257R.id.address_selection_scroll_view);
        this.recyclerView = bindView(C11257R.id.address_selection_recycler_view);
        this.billingPrimaryTxt = bindView(C11257R.id.address_selection_billing_address_primary_section);
        this.billingSecondaryTxt = bindView(C11257R.id.address_selection_billing_address_secondary_section);
        this.changeBillingBtn = bindView(C11257R.id.address_selection_change_billing_address_btn);
        this.addNewBtn = bindView(C11257R.id.address_selection_add_new_address_btn);
        this.primaryActionBtn = bindView(C11257R.id.address_selection_mail_card_btn);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.mcduckling.ui.address.AddressSelectionFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
                if (!(parentFragment instanceof AddressSelectionFragment.Callbacks)) {
                    parentFragment = null;
                }
                AddressSelectionFragment.Callbacks callbacks = (AddressSelectionFragment.Callbacks) parentFragment;
                if (callbacks != null) {
                    return callbacks;
                }
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AddressSelectionFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.selectedShippingAddress = (Interfaces3) BindSavedState2.savedParcelable(this).provideDelegate(this, $$delegatedProperties[8]);
    }

    private final AddressSelectionDuxo getDuxo() {
        return (AddressSelectionDuxo) this.duxo.getValue();
    }

    private final NestedScrollView getScrollView() {
        return (NestedScrollView) this.scrollView.getValue(this, $$delegatedProperties[0]);
    }

    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.recyclerView.getValue(this, $$delegatedProperties[1]);
    }

    private final TextView getBillingPrimaryTxt() {
        return (TextView) this.billingPrimaryTxt.getValue(this, $$delegatedProperties[2]);
    }

    private final TextView getBillingSecondaryTxt() {
        return (TextView) this.billingSecondaryTxt.getValue(this, $$delegatedProperties[3]);
    }

    private final Button getChangeBillingBtn() {
        return (Button) this.changeBillingBtn.getValue(this, $$delegatedProperties[4]);
    }

    private final Button getAddNewBtn() {
        return (Button) this.addNewBtn.getValue(this, $$delegatedProperties[5]);
    }

    private final Button getPrimaryActionBtn() {
        return (Button) this.primaryActionBtn.getValue(this, $$delegatedProperties[6]);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[7]);
    }

    private final CardShippingAddress getSelectedShippingAddress() {
        return (CardShippingAddress) this.selectedShippingAddress.getValue(this, $$delegatedProperties[8]);
    }

    private final void setSelectedShippingAddress(CardShippingAddress cardShippingAddress) {
        this.selectedShippingAddress.setValue(this, $$delegatedProperties[8], cardShippingAddress);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.addressAdapter = new AddressAdapter(this);
        RecyclerView recyclerView = getRecyclerView();
        AddressAdapter addressAdapter = this.addressAdapter;
        if (addressAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addressAdapter");
            addressAdapter = null;
        }
        recyclerView.setAdapter(addressAdapter);
        getScrollView().setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: com.robinhood.android.common.mcduckling.ui.address.AddressSelectionFragment.onViewCreated.1
            @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
            public final void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                float scrollRaisedElevation;
                RhToolbar rhToolbar = AddressSelectionFragment.this.getRhToolbar();
                Intrinsics.checkNotNull(rhToolbar);
                if (i2 == 0) {
                    scrollRaisedElevation = 0.0f;
                } else {
                    RhToolbar rhToolbar2 = AddressSelectionFragment.this.getRhToolbar();
                    Intrinsics.checkNotNull(rhToolbar2);
                    scrollRaisedElevation = rhToolbar2.getScrollRaisedElevation();
                }
                rhToolbar.setElevation(scrollRaisedElevation);
            }
        });
        OnClickListeners.onClick(getChangeBillingBtn(), new Function0() { // from class: com.robinhood.android.common.mcduckling.ui.address.AddressSelectionFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AddressSelectionFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        OnClickListeners.onClick(getAddNewBtn(), new Function0() { // from class: com.robinhood.android.common.mcduckling.ui.address.AddressSelectionFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AddressSelectionFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        ScarletManager2.overrideStyle$default(getPrimaryActionBtn(), ((Args) INSTANCE.getArgs((Fragment) this)).getButtonStyle(), false, 2, null);
        OnClickListeners.onClick(getPrimaryActionBtn(), new Function0() { // from class: com.robinhood.android.common.mcduckling.ui.address.AddressSelectionFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AddressSelectionFragment.onViewCreated$lambda$3(this.f$0);
            }
        });
        Observable observableDistinctUntilChanged = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.common.mcduckling.ui.address.AddressSelectionFragment.onViewCreated.5
            @Override // io.reactivex.functions.Function
            public final List<CardShippingAddress> apply(AddressSelectionState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getShippingAddresses();
            }
        }).filter(new Predicate() { // from class: com.robinhood.android.common.mcduckling.ui.address.AddressSelectionFragment.onViewCreated.6
            @Override // io.reactivex.functions.Predicate
            public final boolean test(List<CardShippingAddress> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return !it.isEmpty();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.mcduckling.ui.address.AddressSelectionFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressSelectionFragment.onViewCreated$lambda$5(this.f$0, (List) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.mcduckling.ui.address.AddressSelectionFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressSelectionFragment.onViewCreated$lambda$6(this.f$0, (AddressSelectionState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(AddressSelectionFragment addressSelectionFragment) {
        addressSelectionFragment.launchAddressChooser(ChooseAddressSource.CASH_MANAGEMENT_RESIDENTIAL, 1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(AddressSelectionFragment addressSelectionFragment) {
        addressSelectionFragment.launchAddressChooser(ChooseAddressSource.CASH_MANAGEMENT_SHIPPING, 2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(AddressSelectionFragment addressSelectionFragment) {
        CardShippingAddress selectedShippingAddress = addressSelectionFragment.getSelectedShippingAddress();
        if (selectedShippingAddress == null) {
            throw new IllegalStateException("Shipping address was not selected");
        }
        if (selectedShippingAddress.isBillingAddress() && addressSelectionFragment.getBillingPrimaryTxt().getText().length() > 30) {
            addressSelectionFragment.showBillingAddressLengthDialog();
        } else {
            CardShippingAddress cardShippingAddressCopy$default = CardShippingAddress.copy$default(selectedShippingAddress, selectedShippingAddress.isBillingAddress() ? null : selectedShippingAddress.getId(), null, false, false, 14, null);
            if (selectedShippingAddress.isRecognized()) {
                addressSelectionFragment.getCallbacks().onCardShippingAddressSelected(cardShippingAddressCopy$default);
            } else {
                addressSelectionFragment.showUnrecognizedAddressDialog(cardShippingAddressCopy$default);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5(AddressSelectionFragment addressSelectionFragment, List list) {
        UUID uuidConsume;
        AddressAdapter addressAdapter = addressSelectionFragment.addressAdapter;
        AddressAdapter addressAdapter2 = null;
        if (addressAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addressAdapter");
            addressAdapter = null;
        }
        Intrinsics.checkNotNull(list);
        addressAdapter.updateAddresses(list);
        UiEvent<UUID> startingAddressIdEvent = addressSelectionFragment.getDuxo().getStartingAddressIdEvent();
        if (startingAddressIdEvent != null && (uuidConsume = startingAddressIdEvent.consume()) != null) {
            AddressAdapter addressAdapter3 = addressSelectionFragment.addressAdapter;
            if (addressAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("addressAdapter");
            } else {
                addressAdapter2 = addressAdapter3;
            }
            addressAdapter2.setStartingSelection(uuidConsume);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6(AddressSelectionFragment addressSelectionFragment, AddressSelectionState viewState) {
        MailingAddress mailingAddress;
        MailingAddress mailingAddress2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        TextView billingPrimaryTxt = addressSelectionFragment.getBillingPrimaryTxt();
        CardShippingAddress billingAddress = viewState.getBillingAddress();
        String secondary = null;
        billingPrimaryTxt.setText((billingAddress == null || (mailingAddress2 = billingAddress.getMailingAddress()) == null) ? null : mailingAddress2.formatPrimary());
        TextView billingSecondaryTxt = addressSelectionFragment.getBillingSecondaryTxt();
        CardShippingAddress billingAddress2 = viewState.getBillingAddress();
        if (billingAddress2 != null && (mailingAddress = billingAddress2.getMailingAddress()) != null) {
            secondary = mailingAddress.formatSecondary();
        }
        billingSecondaryTxt.setText(secondary);
        RhToolbar rhToolbar = addressSelectionFragment.getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setLoadingViewVisible(viewState.isLoading());
        }
        boolean z = (viewState.isLoading() || viewState.getShippingAddresses().isEmpty()) ? false : true;
        addressSelectionFragment.getPrimaryActionBtn().setEnabled(z);
        addressSelectionFragment.getChangeBillingBtn().setEnabled(z);
        addressSelectionFragment.getAddNewBtn().setEnabled(z);
        ErrorHandlers.handleErrorEvent(addressSelectionFragment.getActivityErrorHandler(), viewState.getLoadAddressesError());
        ErrorHandlers.handleErrorEvent(addressSelectionFragment.getActivityErrorHandler(), viewState.getSaveAddressError());
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1) {
            if (resultCode == -1) {
                getDuxo().refresh();
                return;
            }
            return;
        }
        if (requestCode != 2) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        if (resultCode == -1) {
            Intrinsics.checkNotNull(data);
            Parcelable parcelableExtra = data.getParcelableExtra(ChooseAddressResult.EXTRA_ADDRESS_RESULT);
            Intrinsics.checkNotNull(parcelableExtra);
            UiAddress address = ((ChooseAddressResult) parcelableExtra).getAddress();
            if (address instanceof UsAddress) {
                getDuxo().saveShippingAddress((UsAddress) address);
                return;
            }
            RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RhDialogFragment.Builder message = companion.create(contextRequireContext).setTitle(C11048R.string.general_error_title, new Object[0]).setMessage(C11048R.string.general_error_feature_not_available_in_region, new Object[0]);
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            RhDialogFragment.Builder.show$default(message, parentFragmentManager, "country-not-available", false, 4, null);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    @Override // com.robinhood.android.common.mcduckling.ui.address.AddressAdapter.Callbacks
    public void onAddressSelected(CardShippingAddress shippingAddress) {
        Intrinsics.checkNotNullParameter(shippingAddress, "shippingAddress");
        setSelectedShippingAddress(shippingAddress);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C11257R.id.dialog_onboarding_billing_address_length) {
            launchAddressChooser(ChooseAddressSource.CASH_MANAGEMENT_SHIPPING, 2);
            return true;
        }
        if (id == C11257R.id.dialog_onboarding_unrecognized_address) {
            Intrinsics.checkNotNull(passthroughArgs);
            Parcelable parcelable = passthroughArgs.getParcelable("address");
            Intrinsics.checkNotNull(parcelable);
            getCallbacks().onCardShippingAddressSelected((CardShippingAddress) parcelable);
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    private final void showBillingAddressLengthDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setId(C11257R.id.dialog_onboarding_billing_address_length).setMessage(C11257R.string.cash_management_billing_address_length_dialog_message, new Object[0]).setPositiveButton(C11048R.string.general_label_continue, new Object[0]);
        FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, "onboarding-billing-address-length", false, 4, null);
    }

    private final void showUnrecognizedAddressDialog(CardShippingAddress shippingAddress) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("address", shippingAddress);
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder passthroughArgs = companion.create(contextRequireContext).setId(C11257R.id.dialog_onboarding_unrecognized_address).setMessage(C11257R.string.cash_management_unrecognized_address_dialog_message, new Object[0]).setPositiveButton(C11048R.string.general_label_continue, new Object[0]).setNegativeButton(C11048R.string.general_label_back, new Object[0]).setPassthroughArgs(bundle);
        FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(passthroughArgs, supportFragmentManager, "onboarding-unrecognized-address", false, 4, null);
    }

    private final void launchAddressChooser(ChooseAddressSource source, int requestCode) {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        startActivityForResult(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new LegacyIntentKey.ChooseAddress(source, CountryCode.Supported.UnitedStates.INSTANCE, null, null, false, 28, null), null, false, 12, null), requestCode);
    }

    /* compiled from: AddressSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/address/AddressSelectionFragment$Args;", "Landroid/os/Parcelable;", "isMonochromeButton", "", "<init>", "(Z)V", "buttonStyle", "Lcom/robinhood/scarlet/util/resource/ThemedResourceReference;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "getButtonStyle", "()Lcom/robinhood/scarlet/util/resource/ThemedResourceReference;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean isMonochromeButton;

        /* compiled from: AddressSelectionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() != 0);
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
            dest.writeInt(this.isMonochromeButton ? 1 : 0);
        }

        public Args(boolean z) {
            this.isMonochromeButton = z;
        }

        public final ThemedResourceReference<StyleResource> getButtonStyle() {
            int i;
            ResourceType.STYLE style = ResourceType.STYLE.INSTANCE;
            if (this.isMonochromeButton) {
                i = C20690R.attr.primaryMonochromeButtonStyle;
            } else {
                i = C20690R.attr.primaryButtonStyle;
            }
            return new ThemedResourceReference<>(style, i);
        }
    }

    /* compiled from: AddressSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/address/AddressSelectionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/common/mcduckling/ui/address/AddressSelectionFragment;", "Lcom/robinhood/android/common/mcduckling/ui/address/AddressSelectionFragment$Args;", "<init>", "()V", "PASS_THROUGH_ADDRESS", "", "REQUEST_CHANGE_RESIDENTIAL", "", "REQUEST_NEW_SHIPPING_ADDRESS", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<AddressSelectionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(AddressSelectionFragment addressSelectionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, addressSelectionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AddressSelectionFragment newInstance(Args args) {
            return (AddressSelectionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AddressSelectionFragment addressSelectionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, addressSelectionFragment, args);
        }
    }
}

package com.robinhood.android.odyssey.lib.template.address;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.ApiException;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.robinhood.android.address.lib.p061ui.AddressViewTypeAdapter;
import com.robinhood.android.address.lib.p061ui.ManualAddressReason;
import com.robinhood.android.address.lib.p061ui.OnboardingAddressLocationManager;
import com.robinhood.android.address.lib.places.FetchPlaceOnSubscribe;
import com.robinhood.android.address.lib.places.Places2;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.lib.odyssey.databinding.FragmentSdAddressTypeAheadBinding;
import com.robinhood.android.odyssey.lib.utils.ProgressBarUtils;
import com.robinhood.android.odyssey.lib.view.SdAddressInputRow;
import com.robinhood.android.odyssey.lib.view.SdBaseInputRow;
import com.robinhood.android.odyssey.lib.view.SdTextView;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.serverdrivenui.component.ApiSdAddressInputComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdButtonComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdFlexibleComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTextIndividualComponent;
import com.robinhood.models.api.serverdrivenui.page.ApiSdAddressInputPage;
import com.robinhood.models.api.serverdrivenui.page.ApiSdNavigationHeader;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.recyclerview.AlwaysScrollToTopLayoutEnforcer;
import io.reactivex.Observable;
import io.reactivex.Single;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: SdAddressTypeAheadFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0002KLB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u001a\u00105\u001a\u0002022\u0006\u00106\u001a\u0002072\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0010\u00108\u001a\u0002022\u0006\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u000202H\u0002J\u000e\u0010<\u001a\u0002022\u0006\u0010\u001f\u001a\u00020 J\u0010\u0010=\u001a\u0002022\u0006\u0010>\u001a\u00020.H\u0016J\u0010\u0010?\u001a\u0002022\u0006\u0010@\u001a\u00020AH\u0016J\u001a\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u000104H\u0016J\u0010\u0010G\u001a\u00020C2\u0006\u0010H\u001a\u00020IH\u0002J\b\u0010J\u001a\u000202H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b!\u0010\"R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0010\u001a\u0004\b*\u0010+R\u0016\u0010-\u001a\u0004\u0018\u00010.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u0006M"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/address/SdAddressTypeAheadFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/address/lib/ui/AddressViewTypeAdapter$Callbacks;", "<init>", "()V", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "binding", "Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdAddressTypeAheadBinding;", "getBinding", "()Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdAddressTypeAheadBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/odyssey/lib/template/address/SdAddressTypeAheadDuxo;", "getDuxo", "()Lcom/robinhood/android/odyssey/lib/template/address/SdAddressTypeAheadDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onboardingAddressLocationManager", "Lcom/robinhood/android/address/lib/ui/OnboardingAddressLocationManager;", "sessionToken", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "getSessionToken", "()Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "sessionToken$delegate", "Lkotlin/properties/ReadWriteProperty;", "pageData", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdAddressInputPage;", "getPageData", "()Lcom/robinhood/models/api/serverdrivenui/page/ApiSdAddressInputPage;", "pageData$delegate", "layoutEnforcer", "Lcom/robinhood/utils/ui/view/recyclerview/AlwaysScrollToTopLayoutEnforcer;", "adapter", "Lcom/robinhood/android/address/lib/ui/AddressViewTypeAdapter;", "addressCallbacks", "Lcom/robinhood/android/odyssey/lib/template/address/SdAddressTypeAheadFragment$Callbacks;", "getAddressCallbacks", "()Lcom/robinhood/android/odyssey/lib/template/address/SdAddressTypeAheadFragment$Callbacks;", "addressCallbacks$delegate", "screenSource", "", "getScreenSource", "()Ljava/lang/String;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "initialize", "bind", "onAddressSelected", "placeId", "onManualAddressInputSelected", "reason", "Lcom/robinhood/android/address/lib/ui/ManualAddressReason;", "onNegativeButtonClicked", "", "id", "", "passthroughArgs", "isAddressValid", "place", "Lcom/google/android/libraries/places/api/model/Place;", "showAddressInvalidDialog", "Callbacks", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdAddressTypeAheadFragment extends BaseFragment implements AddressViewTypeAdapter.Callbacks {
    private static final String ARG_ADDRESS_INPUT_PAGE_DATA = "addressInputPageData";
    private AddressViewTypeAdapter adapter;

    /* renamed from: addressCallbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 addressCallbacks;
    public AppType appType;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final AlwaysScrollToTopLayoutEnforcer layoutEnforcer;
    private OnboardingAddressLocationManager onboardingAddressLocationManager;

    /* renamed from: pageData$delegate, reason: from kotlin metadata */
    private final Lazy pageData;

    /* renamed from: sessionToken$delegate, reason: from kotlin metadata */
    private final Interfaces3 sessionToken;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SdAddressTypeAheadFragment.class, "binding", "getBinding()Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdAddressTypeAheadBinding;", 0)), Reflection.property1(new PropertyReference1Impl(SdAddressTypeAheadFragment.class, "sessionToken", "getSessionToken()Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", 0)), Reflection.property1(new PropertyReference1Impl(SdAddressTypeAheadFragment.class, "addressCallbacks", "getAddressCallbacks()Lcom/robinhood/android/odyssey/lib/template/address/SdAddressTypeAheadFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SdAddressTypeAheadFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/address/SdAddressTypeAheadFragment$Callbacks;", "", "onValidAddressSelected", "", "place", "Lcom/google/android/libraries/places/api/model/Place;", "parentHeaderProgress", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdNavigationHeader$Progress;", "getParentHeaderProgress", "()Lcom/robinhood/models/api/serverdrivenui/page/ApiSdNavigationHeader$Progress;", "parentHeaderTitle", "", "getParentHeaderTitle", "()Ljava/lang/String;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        ApiSdNavigationHeader.Progress getParentHeaderProgress();

        String getParentHeaderTitle();

        void onValidAddressSelected(Place place);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAddressSelected$lambda$6(SdAddressTypeAheadFragment sdAddressTypeAheadFragment, Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (((ApiException) Throwables.findCause(throwable, ApiException.class)) == null) {
            ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = sdAddressTypeAheadFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, throwable, true, false, 0, null, 56, null);
        }
        return Unit.INSTANCE;
    }

    public SdAddressTypeAheadFragment() {
        super(C20335R.layout.fragment_sd_address_type_ahead);
        this.binding = ViewBinding5.viewBinding(this, SdAddressTypeAheadFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, SdAddressTypeAheadDuxo.class);
        AutocompleteSessionToken autocompleteSessionTokenNewInstance = AutocompleteSessionToken.newInstance();
        Intrinsics.checkNotNullExpressionValue(autocompleteSessionTokenNewInstance, "newInstance(...)");
        this.sessionToken = (Interfaces3) BindSavedState2.savedParcelable(this, autocompleteSessionTokenNewInstance).provideDelegate(this, $$delegatedProperties[1]);
        this.pageData = Fragments2.argument(this, ARG_ADDRESS_INPUT_PAGE_DATA);
        this.layoutEnforcer = new AlwaysScrollToTopLayoutEnforcer();
        this.addressCallbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.odyssey.lib.template.address.SdAddressTypeAheadFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    public final AppType getAppType() {
        AppType appType = this.appType;
        if (appType != null) {
            return appType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appType");
        return null;
    }

    public final void setAppType(AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "<set-?>");
        this.appType = appType;
    }

    private final FragmentSdAddressTypeAheadBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentSdAddressTypeAheadBinding) value;
    }

    private final SdAddressTypeAheadDuxo getDuxo() {
        return (SdAddressTypeAheadDuxo) this.duxo.getValue();
    }

    private final AutocompleteSessionToken getSessionToken() {
        Object value = this.sessionToken.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (AutocompleteSessionToken) value;
    }

    private final ApiSdAddressInputPage getPageData() {
        return (ApiSdAddressInputPage) this.pageData.getValue();
    }

    private final Callbacks getAddressCallbacks() {
        return (Callbacks) this.addressCallbacks.getValue(this, $$delegatedProperties[2]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenSource() {
        return requireBaseActivity().getScreenSource();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getDuxo().setSessionToken(getSessionToken());
        Object systemService = requireContext().getSystemService("location");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        this.onboardingAddressLocationManager = new OnboardingAddressLocationManager((LocationManager) systemService, new C226851(getDuxo()));
    }

    /* compiled from: SdAddressTypeAheadFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.template.address.SdAddressTypeAheadFragment$onCreate$1 */
    /* synthetic */ class C226851 extends FunctionReferenceImpl implements Function1<Location, Unit> {
        C226851(Object obj) {
            super(1, obj, SdAddressTypeAheadDuxo.class, "setLocation", "setLocation(Landroid/location/Location;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Location location) {
            invoke2(location);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Location location) {
            ((SdAddressTypeAheadDuxo) this.receiver).setLocation(location);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initialize();
        if (savedInstanceState == null) {
            bind(getPageData());
        }
        OnboardingAddressLocationManager onboardingAddressLocationManager = this.onboardingAddressLocationManager;
        if (onboardingAddressLocationManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onboardingAddressLocationManager");
            onboardingAddressLocationManager = null;
        }
        onboardingAddressLocationManager.checkPermissionThenSetLastKnownBounds(this);
        RecyclerView recyclerView = getBinding().sdAddressSelectorList;
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));
        Intrinsics.checkNotNull(recyclerView);
        AddressViewTypeAdapter addressViewTypeAdapter = this.adapter;
        if (addressViewTypeAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            addressViewTypeAdapter = null;
        }
        bindAdapter(recyclerView, addressViewTypeAdapter);
        recyclerView.setHasFixedSize(true);
        this.layoutEnforcer.setRecyclerView(getBinding().sdAddressSelectorList);
        if (Build.VERSION.SDK_INT >= 26) {
            getBinding().sdAddressEdt.setImportantForAutofill(1);
            getBinding().sdAddressEdt.setAutofillHints(new String[]{"street-address", "address-line1", "postalAddress"});
        }
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.odyssey.lib.template.address.SdAddressTypeAheadFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdAddressTypeAheadFragment.onViewCreated$lambda$1(this.f$0, (SdAddressTypeAheadViewState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, getBinding().sdAddressInputContainer.textChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C226863(getDuxo()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(SdAddressTypeAheadFragment sdAddressTypeAheadFragment, SdAddressTypeAheadViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (!state.isInInitialState()) {
            LinearLayout sdAddressTitleContainer = sdAddressTypeAheadFragment.getBinding().sdAddressTitleContainer;
            Intrinsics.checkNotNullExpressionValue(sdAddressTitleContainer, "sdAddressTitleContainer");
            sdAddressTitleContainer.setVisibility(8);
            Space extraSpace1 = sdAddressTypeAheadFragment.getBinding().extraSpace1;
            Intrinsics.checkNotNullExpressionValue(extraSpace1, "extraSpace1");
            extraSpace1.setVisibility(8);
            Space extraSpace2 = sdAddressTypeAheadFragment.getBinding().extraSpace2;
            Intrinsics.checkNotNullExpressionValue(extraSpace2, "extraSpace2");
            extraSpace2.setVisibility(8);
            RecyclerView sdAddressSelectorList = sdAddressTypeAheadFragment.getBinding().sdAddressSelectorList;
            Intrinsics.checkNotNullExpressionValue(sdAddressSelectorList, "sdAddressSelectorList");
            sdAddressSelectorList.setVisibility(0);
            SdTextView sdAddressDisclaimer = sdAddressTypeAheadFragment.getBinding().sdAddressDisclaimer;
            Intrinsics.checkNotNullExpressionValue(sdAddressDisclaimer, "sdAddressDisclaimer");
            sdAddressDisclaimer.setVisibility(8);
        }
        RdsProgressBar sdAddressProgressBar = sdAddressTypeAheadFragment.getBinding().sdAddressProgressBar;
        Intrinsics.checkNotNullExpressionValue(sdAddressProgressBar, "sdAddressProgressBar");
        sdAddressProgressBar.setVisibility(state.getShowProgressBar() ? 0 : 8);
        AddressViewTypeAdapter addressViewTypeAdapter = sdAddressTypeAheadFragment.adapter;
        if (addressViewTypeAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            addressViewTypeAdapter = null;
        }
        addressViewTypeAdapter.submitList(state.getViewTypes());
        return Unit.INSTANCE;
    }

    /* compiled from: SdAddressTypeAheadFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.template.address.SdAddressTypeAheadFragment$onViewCreated$3 */
    /* synthetic */ class C226863 extends FunctionReferenceImpl implements Function1<CharSequence, Unit> {
        C226863(Object obj) {
            super(1, obj, SdAddressTypeAheadDuxo.class, "onQueryChanges", "onQueryChanges(Ljava/lang/CharSequence;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
            invoke2(charSequence);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CharSequence p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((SdAddressTypeAheadDuxo) this.receiver).onQueryChanges(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        ApiSdNavigationHeader.Progress parentHeaderProgress = getAddressCallbacks().getParentHeaderProgress();
        if (parentHeaderProgress != null) {
            ProgressBarUtils.updateProgress(toolbar.getProgressBar(), parentHeaderProgress);
        }
        super.configureToolbar(toolbar);
        String parentHeaderTitle = getAddressCallbacks().getParentHeaderTitle();
        if (parentHeaderTitle != null) {
            new MutablePropertyReference0Impl(toolbar) { // from class: com.robinhood.android.odyssey.lib.template.address.SdAddressTypeAheadFragment.configureToolbar.3
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
                public Object get() {
                    return ((RhToolbar) this.receiver).getTitle();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
                public void set(Object obj) {
                    ((RhToolbar) this.receiver).setTitle((CharSequence) obj);
                }
            }.set(parentHeaderTitle);
        }
        toolbar.getProgressBar().setVisibility(parentHeaderProgress != null ? 0 : 8);
    }

    private final void initialize() {
        ApiSdButtonComponent.ApiSdButtonComponentData data;
        ApiSdAddressInputComponent.ApiSdAddressInputComponentData data2 = ((ApiSdAddressInputComponent) ApiSdBaseInputComponents.findAddressComponentById(getPageData().getComponents().getInputs(), ApiSdAddressInputPage.ADDRESS_INPUT_ID)).getData();
        getDuxo().setSupportedCountryCodes(data2.getCountry_codes());
        String manual_address_row = data2.getManual_address_row();
        if (manual_address_row == null) {
            ApiSdButtonComponent secondary_cta = getPageData().getComponents().getSecondary_cta();
            manual_address_row = (secondary_cta == null || (data = secondary_cta.getData()) == null) ? null : data.getText();
            if (manual_address_row == null) {
                throw new IllegalStateException("Either components > inputs > id = address_input > manual_address_row or secondary_cta > data > text must be set");
            }
        }
        AddressViewTypeAdapter addressViewTypeAdapter = new AddressViewTypeAdapter(manual_address_row);
        addressViewTypeAdapter.registerAdapterDataObserver(this.layoutEnforcer);
        this.adapter = addressViewTypeAdapter;
        addressViewTypeAdapter.setCallbacks(this);
        SdAddressInputRow sdAddressInputRow = getBinding().sdAddressInputContainer;
        Observable observableEmpty = Observable.empty();
        Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
        SdBaseInputRow.configInput$default(sdAddressInputRow, observableEmpty, true, true, null, 8, null);
    }

    public final void bind(ApiSdAddressInputPage pageData) {
        Intrinsics.checkNotNullParameter(pageData, "pageData");
        getBinding().sdAddressTitle.bind((ApiSdFlexibleComponent) pageData.getComponents().getTitle());
        getBinding().sdAddressSubtitle.bind((ApiSdFlexibleComponent) pageData.getComponents().getSubtitle());
        SdTextView sdAddressDisclaimer = getBinding().sdAddressDisclaimer;
        Intrinsics.checkNotNullExpressionValue(sdAddressDisclaimer, "sdAddressDisclaimer");
        sdAddressDisclaimer.setVisibility(pageData.getComponents().getDisclosure() != null ? 0 : 8);
        ApiSdTextIndividualComponent disclosure = pageData.getComponents().getDisclosure();
        if (disclosure != null) {
            getBinding().sdAddressDisclaimer.bind((ApiSdFlexibleComponent) disclosure);
        }
        getBinding().sdAddressInputContainer.bind((SdAddressInputRow) ApiSdBaseInputComponents.findAddressComponentById(pageData.getComponents().getInputs(), ApiSdAddressInputPage.ADDRESS_INPUT_ID));
        RdsTextInputEditText sdAddressEdt = getBinding().sdAddressEdt;
        Intrinsics.checkNotNullExpressionValue(sdAddressEdt, "sdAddressEdt");
        ViewsKt.overrideAccessibilityMessage(sdAddressEdt, String.valueOf(pageData.getComponents().getTitle().getData().getText()));
    }

    @Override // com.robinhood.android.address.lib.ui.AddressViewTypeAdapter.Callbacks
    public void onAddressSelected(String placeId) {
        Intrinsics.checkNotNullParameter(placeId, "placeId");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Single singleCreate = Single.create(new FetchPlaceOnSubscribe(contextRequireContext, placeId, getSessionToken(), null, 8, null));
        Intrinsics.checkNotNullExpressionValue(singleCreate, "create(...)");
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(singleCreate), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.odyssey.lib.template.address.SdAddressTypeAheadFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdAddressTypeAheadFragment.onAddressSelected$lambda$5(this.f$0, (FetchPlaceResponse) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.odyssey.lib.template.address.SdAddressTypeAheadFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdAddressTypeAheadFragment.onAddressSelected$lambda$6(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit onAddressSelected$lambda$5(SdAddressTypeAheadFragment sdAddressTypeAheadFragment, FetchPlaceResponse fetchPlaceResponse) {
        if (sdAddressTypeAheadFragment.getAppType() == AppType.RHC) {
            Place place = fetchPlaceResponse.getPlace();
            Intrinsics.checkNotNullExpressionValue(place, "getPlace(...)");
            if (!sdAddressTypeAheadFragment.isAddressValid(place)) {
                sdAddressTypeAheadFragment.showAddressInvalidDialog();
            } else {
                Callbacks addressCallbacks = sdAddressTypeAheadFragment.getAddressCallbacks();
                Place place2 = fetchPlaceResponse.getPlace();
                Intrinsics.checkNotNullExpressionValue(place2, "getPlace(...)");
                addressCallbacks.onValidAddressSelected(place2);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.address.lib.ui.AddressViewTypeAdapter.Callbacks
    public void onManualAddressInputSelected(ManualAddressReason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
        Fragment fragmentRequireParentFragment = requireParentFragment();
        Intrinsics.checkNotNull(fragmentRequireParentFragment, "null cannot be cast to non-null type com.robinhood.android.odyssey.lib.template.address.SdAddressInputFragment");
        ((SdAddressInputFragment) fragmentRequireParentFragment).showManualAddressInput();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C20335R.id.dialog_id_invalid_address) {
            onManualAddressInputSelected(ManualAddressReason.UserAction.INSTANCE);
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    private final boolean isAddressValid(Place place) {
        return (Places2.getStreetAddress(place) == null || Places2.getCity(place) == null || Places2.getZipcode(place) == null) ? false : true;
    }

    private final void showAddressInvalidDialog() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder negativeButton = new RhDialogFragment.Builder(contextRequireContext).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setId(C20335R.id.dialog_id_invalid_address).setTitle(C20335R.string.address_invalid_dialog_title, new Object[0]).setMessage(C20335R.string.address_invalid_dialog_message, new Object[0]).setPositiveButton(C20335R.string.address_invalid_dialog_primary_cta, new Object[0]).setNegativeButton(C20335R.string.address_invalid_dialog_secondary_cta, new Object[0]);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(negativeButton, childFragmentManager, "sd-onboarding-address-invalid", false, 4, null);
    }

    /* compiled from: SdAddressTypeAheadFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/address/SdAddressTypeAheadFragment$Companion;", "", "<init>", "()V", "ARG_ADDRESS_INPUT_PAGE_DATA", "", "newInstance", "Lcom/robinhood/android/odyssey/lib/template/address/SdAddressTypeAheadFragment;", "addressInputPage", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdAddressInputPage;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SdAddressTypeAheadFragment newInstance(ApiSdAddressInputPage addressInputPage) {
            Intrinsics.checkNotNullParameter(addressInputPage, "addressInputPage");
            SdAddressTypeAheadFragment sdAddressTypeAheadFragment = new SdAddressTypeAheadFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(SdAddressTypeAheadFragment.ARG_ADDRESS_INPUT_PAGE_DATA, addressInputPage);
            sdAddressTypeAheadFragment.setArguments(bundle);
            return sdAddressTypeAheadFragment;
        }
    }
}

package com.robinhood.android.odyssey.lib.template.address;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.Place;
import com.robinhood.android.address.lib.p061ui.MapViews;
import com.robinhood.android.address.lib.places.Places2;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.view.StyleableMapView;
import com.robinhood.android.designsystem.selectioncontrol.NewRdsCheckBox;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.lib.odyssey.databinding.FragmentSdAddressMapBinding;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.odyssey.lib.utils.ProgressBarUtils;
import com.robinhood.android.odyssey.lib.view.SdBaseInputRow;
import com.robinhood.android.odyssey.lib.view.SdButton;
import com.robinhood.android.odyssey.lib.view.SdInputRow;
import com.robinhood.models.api.serverdrivenui.component.ApiSdAction;
import com.robinhood.models.api.serverdrivenui.component.ApiSdBaseIndividualComponentData;
import com.robinhood.models.api.serverdrivenui.component.ApiSdButtonComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdCheckboxComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdFlexibleComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdInputComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTextComponentData;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTextIndividualComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTextSubComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.models.api.serverdrivenui.page.ApiSdNavigationHeader;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: SdAddressMapFragment.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u000389:B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u0017H\u0016J\b\u0010\u001e\u001a\u00020\u0017H\u0016J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$H\u0016J\u001a\u0010%\u001a\u00020\u00172\b\u0010&\u001a\u0004\u0018\u00010\u00132\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u00172\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020\u0017H\u0016J\u0010\u00100\u001a\u00020\u00172\u0006\u00101\u001a\u000202H\u0016J\u000e\u00103\u001a\u00020\u00172\u0006\u00104\u001a\u000202J\u0010\u00105\u001a\u00020\u00172\u0006\u00106\u001a\u000207H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/address/SdAddressMapFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseInputRow$Callbacks;", "<init>", "()V", "binding", "Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdAddressMapBinding;", "getBinding", "()Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdAddressMapBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "previousSoftInputMode", "", "callbacks", "Lcom/robinhood/android/odyssey/lib/template/address/SdAddressMapFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/odyssey/lib/template/address/SdAddressMapFragment$Callbacks;", "callbacks$delegate", "screenSource", "", "getScreenSource", "()Ljava/lang/String;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onPause", "onDestroyView", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onComponentAppear", "component", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdBaseIndividualComponentData;", "onComponentAction", "componentId", "action", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdAction;", "handleDeepLink", "url", "Landroid/net/Uri;", "keyboardFocusOnEditText", "editText", "Landroid/widget/EditText;", "onEnterOrDonePressed", "showCustomNumpad", "showNumpad", "", "onLoading", "loading", "onAddressLoaded", "place", "Lcom/google/android/libraries/places/api/model/Place;", "Callbacks", "Args", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdAddressMapFragment extends BaseFragment implements SdBaseInputRow.Callbacks {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private int previousSoftInputMode;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SdAddressMapFragment.class, "binding", "getBinding()Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdAddressMapBinding;", 0)), Reflection.property1(new PropertyReference1Impl(SdAddressMapFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/odyssey/lib/template/address/SdAddressMapFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SdAddressMapFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\f\u001a\u00020\u0003H&R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/address/SdAddressMapFragment$Callbacks;", "", "onAddressConfirm", "", "place", "Lcom/google/android/libraries/places/api/model/Place;", "addressLine2TypedValue", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue$ApiSdString;", "shouldValidateLine2Value", "", "sameAsResidentialValue", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue$ApiSdBoolean;", "onAddressValidationError", "parentHeaderProgress", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdNavigationHeader$Progress;", "getParentHeaderProgress", "()Lcom/robinhood/models/api/serverdrivenui/page/ApiSdNavigationHeader$Progress;", "parentHeaderTitle", "", "getParentHeaderTitle", "()Ljava/lang/String;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        ApiSdNavigationHeader.Progress getParentHeaderProgress();

        String getParentHeaderTitle();

        void onAddressConfirm(Place place, ApiSdTypedValue.ApiSdString addressLine2TypedValue, boolean shouldValidateLine2Value, ApiSdTypedValue.ApiSdBoolean sameAsResidentialValue);

        void onAddressValidationError();
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseInputRow.Callbacks
    public void showCustomNumpad(boolean showNumpad) {
    }

    public SdAddressMapFragment() {
        super(C20335R.layout.fragment_sd_address_map);
        this.binding = ViewBinding5.viewBinding(this, SdAddressMapFragment2.INSTANCE);
        this.previousSoftInputMode = 18;
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.odyssey.lib.template.address.SdAddressMapFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentSdAddressMapBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentSdAddressMapBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenSource() {
        return requireBaseActivity().getScreenSource();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        ApiSdTextComponentData data;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState == null) {
            SdInputRow sdInputRow = getBinding().sdoAddressLine2InputInputContainer;
            Companion companion = INSTANCE;
            sdInputRow.bind((SdInputRow) ((Args) companion.getArgs((Fragment) this)).getAddressLine2Component());
            getBinding().sdoAddressContinueBtn.bind((ApiSdFlexibleComponent) ((Args) companion.getArgs((Fragment) this)).getPrimaryCta());
            ApiSdCheckboxComponent checkboxComponent = ((Args) companion.getArgs((Fragment) this)).getCheckboxComponent();
            if (checkboxComponent != null) {
                ApiSdTextSubComponent display_label = checkboxComponent.getData().getDisplay_label();
                if (display_label != null && (data = display_label.getData()) != null) {
                    getBinding().sdCheckboxLabel.bind((ApiSdFlexibleComponent) new ApiSdTextIndividualComponent(null, data));
                }
                NewRdsCheckBox newRdsCheckBox = getBinding().sdCheckboxWidget;
                ApiSdTypedValue.ApiSdBoolean typed_default_value_object = checkboxComponent.getData().getTyped_default_value_object();
                newRdsCheckBox.setChecked(typed_default_value_object != null ? typed_default_value_object.getValue() : false);
                LinearLayout sdCheckboxRow = getBinding().sdCheckboxRow;
                Intrinsics.checkNotNullExpressionValue(sdCheckboxRow, "sdCheckboxRow");
                sdCheckboxRow.setVisibility(0);
                LinearLayout sdCheckboxRow2 = getBinding().sdCheckboxRow;
                Intrinsics.checkNotNullExpressionValue(sdCheckboxRow2, "sdCheckboxRow");
                OnClickListeners.onClick(sdCheckboxRow2, new Function0() { // from class: com.robinhood.android.odyssey.lib.template.address.SdAddressMapFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SdAddressMapFragment.onViewCreated$lambda$2$lambda$1(this.f$0);
                    }
                });
            }
        }
        SdInputRow sdInputRow2 = getBinding().sdoAddressLine2InputInputContainer;
        Observable<KeyEvent> observableEmpty = Observable.empty();
        Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
        sdInputRow2.configInput(observableEmpty, false, true, null);
        Lifecycle lifecycle = getLifecycle();
        StyleableMapView sdoAddressMapview = getBinding().sdoAddressMapview;
        Intrinsics.checkNotNullExpressionValue(sdoAddressMapview, "sdoAddressMapview");
        lifecycle.addObserver(sdoAddressMapview);
        onAddressLoaded(((Args) INSTANCE.getArgs((Fragment) this)).getPlace());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2$lambda$1(SdAddressMapFragment sdAddressMapFragment) {
        sdAddressMapFragment.getBinding().sdCheckboxWidget.performClick();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.previousSoftInputMode = requireActivity().getWindow().getAttributes().softInputMode;
        requireActivity().getWindow().setSoftInputMode(48);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
        requireActivity().getWindow().setSoftInputMode(this.previousSoftInputMode);
        super.onPause();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Lifecycle lifecycle = getLifecycle();
        StyleableMapView sdoAddressMapview = getBinding().sdoAddressMapview;
        Intrinsics.checkNotNullExpressionValue(sdoAddressMapview, "sdoAddressMapview");
        lifecycle.removeObserver(sdoAddressMapview);
        super.onDestroyView();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        ApiSdNavigationHeader.Progress parentHeaderProgress = getCallbacks().getParentHeaderProgress();
        if (parentHeaderProgress != null) {
            ProgressBarUtils.updateProgress(toolbar.getProgressBar(), parentHeaderProgress);
        }
        super.configureToolbar(toolbar);
        String parentHeaderTitle = getCallbacks().getParentHeaderTitle();
        if (parentHeaderTitle != null) {
            new MutablePropertyReference0Impl(toolbar) { // from class: com.robinhood.android.odyssey.lib.template.address.SdAddressMapFragment.configureToolbar.3
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

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView.Callbacks
    public void onComponentAppear(ApiSdBaseIndividualComponentData component) {
        Intrinsics.checkNotNullParameter(component, "component");
        Fragment fragmentRequireParentFragment = requireParentFragment();
        Intrinsics.checkNotNull(fragmentRequireParentFragment, "null cannot be cast to non-null type com.robinhood.android.odyssey.lib.template.address.SdAddressInputFragment");
        ((SdAddressInputFragment) fragmentRequireParentFragment).onComponentAppear(component);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView.Callbacks
    public void onComponentAction(String componentId, ApiSdAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        getCallbacks().onAddressConfirm(((Args) INSTANCE.getArgs((Fragment) this)).getPlace(), getBinding().sdoAddressLine2InputInputContainer.onSubmitValue(), getBinding().sdoAddressLine2InputInputContainer.getValidationEndpointRequired(), new ApiSdTypedValue.ApiSdBoolean(getBinding().sdCheckboxWidget.getIsChecked()));
        Fragment fragmentRequireParentFragment = requireParentFragment();
        Intrinsics.checkNotNull(fragmentRequireParentFragment, "null cannot be cast to non-null type com.robinhood.android.odyssey.lib.template.address.SdAddressInputFragment");
        ((SdAddressInputFragment) fragmentRequireParentFragment).onComponentAction(componentId, action);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView.Callbacks
    public void handleDeepLink(Uri url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Fragment fragmentRequireParentFragment = requireParentFragment();
        Intrinsics.checkNotNull(fragmentRequireParentFragment, "null cannot be cast to non-null type com.robinhood.android.odyssey.lib.template.address.SdAddressInputFragment");
        ((SdAddressInputFragment) fragmentRequireParentFragment).handleDeepLink(url);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseInputRow.Callbacks
    public void keyboardFocusOnEditText(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        BaseFragment.keyboardFocusOn$default(this, editText, false, 2, null);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseInputRow.Callbacks
    public void onEnterOrDonePressed() {
        if (!getBinding().sdoAddressContinueBtn.isEnabled() || getBinding().sdoAddressContinueBtn.getIsLoading()) {
            return;
        }
        getBinding().sdoAddressContinueBtn.performClick();
    }

    public final void onLoading(boolean loading) {
        getBinding().sdoAddressContinueBtn.setLoading(loading);
    }

    private final void onAddressLoaded(final Place place) {
        final SdButton sdoAddressContinueBtn = getBinding().sdoAddressContinueBtn;
        Intrinsics.checkNotNullExpressionValue(sdoAddressContinueBtn, "sdoAddressContinueBtn");
        OneShotPreDrawListener.add(sdoAddressContinueBtn, new Runnable() { // from class: com.robinhood.android.odyssey.lib.template.address.SdAddressMapFragment$onAddressLoaded$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                View view = sdoAddressContinueBtn;
                StyleableMapView sdoAddressMapview = this.getBinding().sdoAddressMapview;
                Intrinsics.checkNotNullExpressionValue(sdoAddressMapview, "sdoAddressMapview");
                LatLng latLng = place.getLatLng();
                Intrinsics.checkNotNull(latLng);
                double d = latLng.latitude;
                LatLng latLng2 = place.getLatLng();
                Intrinsics.checkNotNull(latLng2);
                double d2 = latLng2.longitude;
                float[] fArr = new float[3];
                Color.colorToHSV(this.requireContext().getColor(C20690R.color.mobius_prime), fArr);
                Float fValueOf = Float.valueOf(ArraysKt.first(fArr));
                int height = view.getHeight();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                MapViews.loadMapImage(sdoAddressMapview, d, d2, fValueOf, Integer.valueOf(height + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0)));
            }
        });
        String address = place.getAddress();
        Intrinsics.checkNotNull(address);
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) address, ',', 0, false, 6, (Object) null);
        if (iIndexOf$default > 0) {
            getBinding().sdoAddressPrimaryTextView.setText(Places2.getStreetAddress(place));
            RhTextView rhTextView = getBinding().sdoAddressSecondaryTextView;
            String strSubstring = address.substring(iIndexOf$default + 1, address.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            int length = strSubstring.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) strSubstring.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            rhTextView.setText(strSubstring.subSequence(i, length + 1).toString());
            return;
        }
        RhTextView sdoAddressSecondaryTextView = getBinding().sdoAddressSecondaryTextView;
        Intrinsics.checkNotNullExpressionValue(sdoAddressSecondaryTextView, "sdoAddressSecondaryTextView");
        sdoAddressSecondaryTextView.setVisibility(8);
        getBinding().sdoAddressPrimaryTextView.setText(address);
    }

    /* compiled from: SdAddressMapFragment.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/address/SdAddressMapFragment$Args;", "Landroid/os/Parcelable;", "place", "Lcom/google/android/libraries/places/api/model/Place;", "primaryCta", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdButtonComponent;", "addressLine2Component", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdInputComponent;", "checkboxComponent", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdCheckboxComponent;", "<init>", "(Lcom/google/android/libraries/places/api/model/Place;Lcom/robinhood/models/api/serverdrivenui/component/ApiSdButtonComponent;Lcom/robinhood/models/api/serverdrivenui/component/ApiSdInputComponent;Lcom/robinhood/models/api/serverdrivenui/component/ApiSdCheckboxComponent;)V", "getPlace", "()Lcom/google/android/libraries/places/api/model/Place;", "getPrimaryCta", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdButtonComponent;", "getAddressLine2Component", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdInputComponent;", "getCheckboxComponent", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdCheckboxComponent;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ApiSdInputComponent addressLine2Component;
        private final ApiSdCheckboxComponent checkboxComponent;
        private final Place place;
        private final ApiSdButtonComponent primaryCta;

        /* compiled from: SdAddressMapFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((Place) parcel.readParcelable(Args.class.getClassLoader()), (ApiSdButtonComponent) parcel.readParcelable(Args.class.getClassLoader()), (ApiSdInputComponent) parcel.readParcelable(Args.class.getClassLoader()), (ApiSdCheckboxComponent) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, Place place, ApiSdButtonComponent apiSdButtonComponent, ApiSdInputComponent apiSdInputComponent, ApiSdCheckboxComponent apiSdCheckboxComponent, int i, Object obj) {
            if ((i & 1) != 0) {
                place = args.place;
            }
            if ((i & 2) != 0) {
                apiSdButtonComponent = args.primaryCta;
            }
            if ((i & 4) != 0) {
                apiSdInputComponent = args.addressLine2Component;
            }
            if ((i & 8) != 0) {
                apiSdCheckboxComponent = args.checkboxComponent;
            }
            return args.copy(place, apiSdButtonComponent, apiSdInputComponent, apiSdCheckboxComponent);
        }

        /* renamed from: component1, reason: from getter */
        public final Place getPlace() {
            return this.place;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiSdButtonComponent getPrimaryCta() {
            return this.primaryCta;
        }

        /* renamed from: component3, reason: from getter */
        public final ApiSdInputComponent getAddressLine2Component() {
            return this.addressLine2Component;
        }

        /* renamed from: component4, reason: from getter */
        public final ApiSdCheckboxComponent getCheckboxComponent() {
            return this.checkboxComponent;
        }

        public final Args copy(Place place, ApiSdButtonComponent primaryCta, ApiSdInputComponent addressLine2Component, ApiSdCheckboxComponent checkboxComponent) {
            Intrinsics.checkNotNullParameter(place, "place");
            Intrinsics.checkNotNullParameter(primaryCta, "primaryCta");
            Intrinsics.checkNotNullParameter(addressLine2Component, "addressLine2Component");
            return new Args(place, primaryCta, addressLine2Component, checkboxComponent);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.place, args.place) && Intrinsics.areEqual(this.primaryCta, args.primaryCta) && Intrinsics.areEqual(this.addressLine2Component, args.addressLine2Component) && Intrinsics.areEqual(this.checkboxComponent, args.checkboxComponent);
        }

        public int hashCode() {
            int iHashCode = ((((this.place.hashCode() * 31) + this.primaryCta.hashCode()) * 31) + this.addressLine2Component.hashCode()) * 31;
            ApiSdCheckboxComponent apiSdCheckboxComponent = this.checkboxComponent;
            return iHashCode + (apiSdCheckboxComponent == null ? 0 : apiSdCheckboxComponent.hashCode());
        }

        public String toString() {
            return "Args(place=" + this.place + ", primaryCta=" + this.primaryCta + ", addressLine2Component=" + this.addressLine2Component + ", checkboxComponent=" + this.checkboxComponent + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.place, flags);
            dest.writeParcelable(this.primaryCta, flags);
            dest.writeParcelable(this.addressLine2Component, flags);
            dest.writeParcelable(this.checkboxComponent, flags);
        }

        public Args(Place place, ApiSdButtonComponent primaryCta, ApiSdInputComponent addressLine2Component, ApiSdCheckboxComponent apiSdCheckboxComponent) {
            Intrinsics.checkNotNullParameter(place, "place");
            Intrinsics.checkNotNullParameter(primaryCta, "primaryCta");
            Intrinsics.checkNotNullParameter(addressLine2Component, "addressLine2Component");
            this.place = place;
            this.primaryCta = primaryCta;
            this.addressLine2Component = addressLine2Component;
            this.checkboxComponent = apiSdCheckboxComponent;
        }

        public final Place getPlace() {
            return this.place;
        }

        public final ApiSdButtonComponent getPrimaryCta() {
            return this.primaryCta;
        }

        public final ApiSdInputComponent getAddressLine2Component() {
            return this.addressLine2Component;
        }

        public final ApiSdCheckboxComponent getCheckboxComponent() {
            return this.checkboxComponent;
        }
    }

    /* compiled from: SdAddressMapFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/address/SdAddressMapFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/odyssey/lib/template/address/SdAddressMapFragment;", "Lcom/robinhood/android/odyssey/lib/template/address/SdAddressMapFragment$Args;", "<init>", "()V", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<SdAddressMapFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(SdAddressMapFragment sdAddressMapFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, sdAddressMapFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SdAddressMapFragment newInstance(Args args) {
            return (SdAddressMapFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SdAddressMapFragment sdAddressMapFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, sdAddressMapFragment, args);
        }
    }
}

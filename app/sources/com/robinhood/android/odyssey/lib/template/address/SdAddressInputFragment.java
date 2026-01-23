package com.robinhood.android.odyssey.lib.template.address;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.address.lib.places.Places2;
import com.robinhood.android.address.lib.places.States;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment;
import com.robinhood.android.odyssey.lib.template.SdBackendMetadata;
import com.robinhood.android.odyssey.lib.template.SdBackendMetadata2;
import com.robinhood.android.odyssey.lib.template.address.SdAddressMapFragment;
import com.robinhood.android.odyssey.lib.template.address.SdAddressStreetNumberFragment;
import com.robinhood.android.odyssey.lib.template.address.SdAddressTypeAheadFragment;
import com.robinhood.android.odyssey.lib.view.SdBaseInputRow;
import com.robinhood.models.api.serverdrivenui.component.ApiSdAction;
import com.robinhood.models.api.serverdrivenui.component.ApiSdBaseInputComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdButtonComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdCheckboxComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdEntityComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdInputComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.models.api.serverdrivenui.page.ApiSdAddressInputPage;
import com.robinhood.models.api.serverdrivenui.page.ApiSdNavigationHeader;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.Activity;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SdAddressInputFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0002H\u0014J\u0010\u0010\"\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010#\u001a\u00020\u001cH\u0016J4\u0010$\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0)0%2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0014J.\u0010-\u001a\u00020 2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010.\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010/\u001a\u00020 H\u0016J\u0010\u00100\u001a\u00020 2\u0006\u00101\u001a\u00020\u001cH\u0014J\u0010\u00102\u001a\u00020 2\u0006\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u00020 H\u0016J\u0010\u00106\u001a\u00020 2\u0006\u00107\u001a\u00020\u001cH\u0016J\u0010\u00108\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u00109\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0006\u0010:\u001a\u00020 J\u0010\u0010;\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/address/SdAddressInputFragment;", "Lcom/robinhood/android/odyssey/lib/template/BaseSdTemplateFragment;", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdAddressInputPage;", "Lcom/robinhood/android/odyssey/lib/template/address/SdAddressTypeAheadFragment$Callbacks;", "Lcom/robinhood/android/odyssey/lib/template/address/SdAddressMapFragment$Callbacks;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseInputRow$Callbacks;", "Lcom/robinhood/android/odyssey/lib/template/address/SdAddressStreetNumberFragment$Callbacks;", "<init>", "()V", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "parentHeaderProgress", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdNavigationHeader$Progress;", "getParentHeaderProgress", "()Lcom/robinhood/models/api/serverdrivenui/page/ApiSdNavigationHeader$Progress;", "parentHeaderTitle", "", "getParentHeaderTitle", "()Ljava/lang/String;", "place", "Lcom/google/android/libraries/places/api/model/Place;", "addressLine2", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue$ApiSdString;", "shouldValidateLine2Value", "", "sameAsResidentialValue", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue$ApiSdBoolean;", "bind", "", "pageData", "onValidAddressSelected", "onBackPressed", "getAndValidateChildEntityValues", "Lkotlin/Pair;", "", "Lcom/robinhood/android/odyssey/lib/template/SdBackendMetadata;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue;", "", "payload", "", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdEntityComponent;", "onAddressConfirm", "addressLine2TypedValue", "onAddressValidationError", "onLoading", "loading", "keyboardFocusOnEditText", "editText", "Landroid/widget/EditText;", "onEnterOrDonePressed", "showCustomNumpad", "showNumpad", "onStreetNumberInput", "onDoNotHaveStreetNumber", "showManualAddressInput", "showMapFragment", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdAddressInputFragment extends BaseSdTemplateFragment<ApiSdAddressInputPage> implements SdAddressTypeAheadFragment.Callbacks, SdAddressMapFragment.Callbacks, SdBaseInputRow.Callbacks, SdAddressStreetNumberFragment.Callbacks {
    public static final int $stable = 8;
    private ApiSdTypedValue.ApiSdString addressLine2;
    public AppType appType;
    private Place place;
    private ApiSdTypedValue.ApiSdBoolean sameAsResidentialValue;
    private boolean shouldValidateLine2Value;

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseInputRow.Callbacks
    public void showCustomNumpad(boolean showNumpad) {
    }

    public SdAddressInputFragment() {
        super(C20335R.layout.fragment_sd_address_input);
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

    @Override // com.robinhood.android.odyssey.lib.template.address.SdAddressTypeAheadFragment.Callbacks, com.robinhood.android.odyssey.lib.template.address.SdAddressMapFragment.Callbacks, com.robinhood.android.odyssey.lib.template.address.SdAddressStreetNumberFragment.Callbacks
    public ApiSdNavigationHeader.Progress getParentHeaderProgress() {
        return getProgress();
    }

    @Override // com.robinhood.android.odyssey.lib.template.address.SdAddressTypeAheadFragment.Callbacks, com.robinhood.android.odyssey.lib.template.address.SdAddressMapFragment.Callbacks, com.robinhood.android.odyssey.lib.template.address.SdAddressStreetNumberFragment.Callbacks
    public String getParentHeaderTitle() {
        ApiSdNavigationHeader navigation_header = getPageData().getNavigation_header();
        if (navigation_header != null) {
            return navigation_header.getTitle();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment
    public void bind(ApiSdAddressInputPage pageData) {
        Intrinsics.checkNotNullParameter(pageData, "pageData");
        setFragment(C20335R.id.fragment_container, SdAddressTypeAheadFragment.INSTANCE.newInstance(pageData));
    }

    @Override // com.robinhood.android.odyssey.lib.template.address.SdAddressTypeAheadFragment.Callbacks
    public void onValidAddressSelected(Place place) {
        Intrinsics.checkNotNullParameter(place, "place");
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
        if (getAppType() == AppType.RHC && Places2.getStreetNumber(place) == null) {
            replaceFragment(SdAddressStreetNumberFragment.INSTANCE.newInstance((Parcelable) new SdAddressStreetNumberFragment.Args(place)));
        } else {
            showMapFragment(place);
        }
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if ((getCurrentFragment() instanceof SdAddressMapFragment) || (getCurrentFragment() instanceof SdAddressStreetNumberFragment)) {
            popLastFragment();
            this.place = null;
            this.addressLine2 = null;
            this.shouldValidateLine2Value = false;
            this.sameAsResidentialValue = null;
            return true;
        }
        return super.onBackPressed();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0069 A[PHI: r3
      0x0069: PHI (r3v14 java.lang.String) = (r3v9 java.lang.String), (r3v11 java.lang.String), (r3v12 java.lang.String), (r3v15 java.lang.String) binds: [B:40:0x00aa, B:34:0x0099, B:26:0x0079, B:19:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.robinhood.android.odyssey.lib.template.BaseSdFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Tuples2<Map<SdBackendMetadata, ApiSdTypedValue>, Set<SdBackendMetadata>> getAndValidateChildEntityValues(List<ApiSdEntityComponent> payload) throws Resources.NotFoundException {
        String zipcode;
        String state;
        Intrinsics.checkNotNullParameter(payload, "payload");
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        for (ApiSdEntityComponent apiSdEntityComponent : payload) {
            ApiSdEntityComponent.ApiSdEntityValue value = apiSdEntityComponent.getValue();
            if (value instanceof ApiSdEntityComponent.ApiSdEntityValue.StaticValue) {
                map.put(SdBackendMetadata2.getSdBackendMetaData(apiSdEntityComponent), ((ApiSdEntityComponent.ApiSdEntityValue.StaticValue) value).getTyped_value_object());
            } else {
                boolean z = value instanceof ApiSdEntityComponent.ApiSdEntityValue.ValueFromComponent;
                if (z && Intrinsics.areEqual(((ApiSdEntityComponent.ApiSdEntityValue.ValueFromComponent) value).getComponent_id(), ApiSdAddressInputPage.ADDRESS_INPUT_ID)) {
                    Place place = this.place;
                    String field = apiSdEntityComponent.getField();
                    String str = "";
                    switch (field.hashCode()) {
                        case -2053263135:
                            if (!field.equals(PlaceTypes.POSTAL_CODE)) {
                                Preconditions.INSTANCE.failUnexpectedItemKotlin(apiSdEntityComponent.getField());
                                throw new ExceptionsH();
                            }
                            if (place != null && (zipcode = Places2.getZipcode(place)) != null) {
                                str = zipcode;
                            }
                            map.put(SdBackendMetadata2.getSdBackendMetaData(apiSdEntityComponent), new ApiSdTypedValue.ApiSdString(str));
                            break;
                            break;
                        case -934795532:
                            if (!field.equals("region")) {
                                Preconditions.INSTANCE.failUnexpectedItemKotlin(apiSdEntityComponent.getField());
                                throw new ExceptionsH();
                            }
                            if (place != null && (state = Places2.getState(place)) != null) {
                                Context contextRequireContext = requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                zipcode = States.convertStateNameToCode(contextRequireContext, state);
                                if (zipcode != null) {
                                }
                            }
                            map.put(SdBackendMetadata2.getSdBackendMetaData(apiSdEntityComponent), new ApiSdTypedValue.ApiSdString(str));
                            break;
                            break;
                        case 102977213:
                            if (!field.equals("line1")) {
                                Preconditions.INSTANCE.failUnexpectedItemKotlin(apiSdEntityComponent.getField());
                                throw new ExceptionsH();
                            }
                            if (place != null && (zipcode = Places2.getStreetAddress(place)) != null) {
                            }
                            map.put(SdBackendMetadata2.getSdBackendMetaData(apiSdEntityComponent), new ApiSdTypedValue.ApiSdString(str));
                            break;
                        case 1900805475:
                            if (!field.equals("locality")) {
                                Preconditions.INSTANCE.failUnexpectedItemKotlin(apiSdEntityComponent.getField());
                                throw new ExceptionsH();
                            }
                            if (place != null && (zipcode = Places2.getCity(place)) != null) {
                            }
                            map.put(SdBackendMetadata2.getSdBackendMetaData(apiSdEntityComponent), new ApiSdTypedValue.ApiSdString(str));
                            break;
                            break;
                        default:
                            Preconditions.INSTANCE.failUnexpectedItemKotlin(apiSdEntityComponent.getField());
                            throw new ExceptionsH();
                    }
                } else if (z && Intrinsics.areEqual(((ApiSdEntityComponent.ApiSdEntityValue.ValueFromComponent) value).getComponent_id(), ApiSdAddressInputPage.ADDRESS_LINE_2_INPUT_ID)) {
                    ApiSdTypedValue.ApiSdString apiSdString = this.addressLine2;
                    if (apiSdString != null) {
                        map.put(SdBackendMetadata2.getSdBackendMetaData(apiSdEntityComponent), apiSdString);
                        if (this.shouldValidateLine2Value) {
                            hashSet.add(SdBackendMetadata2.getSdBackendMetaData(apiSdEntityComponent));
                        }
                    }
                } else {
                    if (!z || !Intrinsics.areEqual(((ApiSdEntityComponent.ApiSdEntityValue.ValueFromComponent) value).getComponent_id(), "address_mailing_same_checkbox")) {
                        Preconditions.INSTANCE.failUnexpectedItemKotlin(value);
                        throw new ExceptionsH();
                    }
                    ApiSdTypedValue.ApiSdBoolean apiSdBoolean = this.sameAsResidentialValue;
                    if (apiSdBoolean == null) {
                        apiSdBoolean = new ApiSdTypedValue.ApiSdBoolean(true);
                    }
                    map.put(SdBackendMetadata2.getSdBackendMetaData(apiSdEntityComponent), apiSdBoolean);
                }
            }
        }
        return Tuples4.m3642to(map, hashSet);
    }

    @Override // com.robinhood.android.odyssey.lib.template.address.SdAddressMapFragment.Callbacks
    public void onAddressConfirm(Place place, ApiSdTypedValue.ApiSdString addressLine2TypedValue, boolean shouldValidateLine2Value, ApiSdTypedValue.ApiSdBoolean sameAsResidentialValue) {
        this.place = place;
        this.addressLine2 = addressLine2TypedValue;
        this.shouldValidateLine2Value = shouldValidateLine2Value;
        this.sameAsResidentialValue = sameAsResidentialValue;
    }

    @Override // com.robinhood.android.odyssey.lib.template.address.SdAddressMapFragment.Callbacks
    public void onAddressValidationError() {
        replaceFragment(SdAddressTypeAheadFragment.INSTANCE.newInstance(getPageData()));
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment
    protected void onLoading(boolean loading) {
        super.onLoading(loading);
        Fragment currentFragment = getCurrentFragment();
        if (currentFragment instanceof SdAddressMapFragment) {
            ((SdAddressMapFragment) currentFragment).onLoading(loading);
        }
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseInputRow.Callbacks
    public void keyboardFocusOnEditText(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        BaseFragment.keyboardFocusOn$default(this, editText, false, 2, null);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseInputRow.Callbacks
    public void onEnterOrDonePressed() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
    }

    @Override // com.robinhood.android.odyssey.lib.template.address.SdAddressStreetNumberFragment.Callbacks
    public void onStreetNumberInput(Place place) {
        Intrinsics.checkNotNullParameter(place, "place");
        showMapFragment(place);
    }

    @Override // com.robinhood.android.odyssey.lib.template.address.SdAddressStreetNumberFragment.Callbacks
    public void onDoNotHaveStreetNumber(Place place) {
        Intrinsics.checkNotNullParameter(place, "place");
        showManualAddressInput();
    }

    public final void showManualAddressInput() {
        ApiSdAction on_click;
        ApiSdButtonComponent.ApiSdButtonComponentData data;
        ApiSdButtonComponent secondary_cta = getPageData().getComponents().getSecondary_cta();
        if (secondary_cta == null || (data = secondary_cta.getData()) == null || (on_click = data.getOn_click()) == null) {
            on_click = getPageData().getComponents().getPrimary_cta().getData().getOn_click();
            Intrinsics.checkNotNull(on_click);
        }
        onComponentAction("android-manual-address-btn", on_click);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    private final void showMapFragment(Place place) {
        ApiSdCheckboxComponent next;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
        SdAddressMapFragment.Companion companion = SdAddressMapFragment.INSTANCE;
        ApiSdButtonComponent primary_cta = getPageData().getComponents().getPrimary_cta();
        ApiSdInputComponent apiSdInputComponent = (ApiSdInputComponent) ApiSdBaseInputComponents.findAddressComponentById(getPageData().getComponents().getInputs(), ApiSdAddressInputPage.ADDRESS_LINE_2_INPUT_ID);
        Iterator it = getPageData().getComponents().getInputs().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = 0;
                break;
            } else {
                next = it.next();
                if (((ApiSdBaseInputComponent) next) instanceof ApiSdCheckboxComponent) {
                    break;
                }
            }
        }
        replaceFragment(companion.newInstance((Parcelable) new SdAddressMapFragment.Args(place, primary_cta, apiSdInputComponent, next instanceof ApiSdCheckboxComponent ? next : null)));
    }
}

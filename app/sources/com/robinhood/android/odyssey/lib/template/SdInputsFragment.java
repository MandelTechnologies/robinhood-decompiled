package com.robinhood.android.odyssey.lib.template;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Space;
import androidx.core.view.ViewGroup2;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.lib.odyssey.databinding.FragmentSdInputsBinding;
import com.robinhood.android.odyssey.lib.legacybottomsheet.InternationalInfoListBottomSheet;
import com.robinhood.android.odyssey.lib.legacybottomsheet.SdDropdownSelectBottomSheet;
import com.robinhood.android.odyssey.lib.view.SdBaseInputRow;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.android.odyssey.lib.view.SdButton;
import com.robinhood.android.odyssey.lib.view.SdDropdownSelectRow;
import com.robinhood.android.odyssey.lib.view.SdInputRow;
import com.robinhood.android.odyssey.lib.view.SdInputsContainerView;
import com.robinhood.android.odyssey.lib.view.SdPhoneInputRow;
import com.robinhood.android.odyssey.lib.view.SdPhoneInputRowWithInternationalInfo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.serverdrivenui.component.ApiSdBaseIndividualComponentData;
import com.robinhood.models.api.serverdrivenui.component.ApiSdComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdFlexibleComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdOption;
import com.robinhood.models.api.serverdrivenui.page.ApiSdInputsPage;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ObservablesAndroid;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SdInputsFragment.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001-B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0002H\u0014J\u001e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0016J\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020\u001dH\u0016J\u0010\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0018H\u0016J\u0010\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u0010H\u0016J\"\u0010*\u001a\u00020\u00102\b\u0010+\u001a\u0004\u0018\u00010\u001d2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001fH\u0016R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/SdInputsFragment;", "Lcom/robinhood/android/odyssey/lib/template/BaseSdTemplateFragment;", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdInputsPage;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseInputRow$Callbacks;", "Lcom/robinhood/android/odyssey/lib/view/SdPhoneInputRowWithInternationalInfo$Callbacks;", "Lcom/robinhood/android/odyssey/lib/view/SdDropdownSelectRow$Callbacks;", "Lcom/robinhood/android/odyssey/lib/legacybottomsheet/SdDropdownSelectBottomSheet$Callbacks;", "<init>", "()V", "binding", "Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdInputsBinding;", "getBinding", "()Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdInputsBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onLoading", "loading", "", "bind", "pageData", "showDropdownSelectBottomSheet", "componentTag", "", "options", "", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdOption;", "onDropdownSelect", AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION, "targetComponentTag", "showCustomNumpad", "showNumpad", "keyboardFocusOnEditText", "editText", "Landroid/widget/EditText;", "onEnterOrDonePressed", "onInternationalInfoBtnClick", "defaultCountryCode", "prohibitedCountryCodes", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdInputsFragment extends BaseSdTemplateFragment<ApiSdInputsPage> implements SdBaseInputRow.Callbacks, SdPhoneInputRowWithInternationalInfo.Callbacks, SdDropdownSelectRow.Callbacks, SdDropdownSelectBottomSheet.Callbacks {
    private static final String INTERNATIONAL_INFO_BOTTOM_SHEET_TAG = "internationalInfoBottomSheetTag";
    private static final String STATE_INPUT_BOTTOM_SHEET_TAG = "stateInputBottomSheetTag";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SdInputsFragment.class, "binding", "getBinding()Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdInputsBinding;", 0))};
    public static final int $stable = 8;

    public SdInputsFragment() {
        super(C20335R.layout.fragment_sd_inputs);
        this.binding = ViewBinding5.viewBinding(this, SdInputsFragment2.INSTANCE);
    }

    private final FragmentSdInputsBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentSdInputsBinding) value;
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Observable<Boolean> observableDistinctUntilChanged = getBinding().sdInputsInputContainer.areAllRequiredFieldsFilled().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C226451(getBinding().sdInputsPrimaryCta));
        LifecycleHost.DefaultImpls.bind$default(this, getBinding().sdInputsNumpad.getKeyEvents(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C226462(getBinding().sdInputsInputContainer));
    }

    /* compiled from: SdInputsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.template.SdInputsFragment$onViewCreated$1 */
    /* synthetic */ class C226451 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        C226451(Object obj) {
            super(1, obj, SdButton.class, "setEnabled", "setEnabled(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((SdButton) this.receiver).setEnabled(z);
        }
    }

    /* compiled from: SdInputsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.template.SdInputsFragment$onViewCreated$2 */
    /* synthetic */ class C226462 extends FunctionReferenceImpl implements Function1<KeyEvent, Unit> {
        C226462(Object obj) {
            super(1, obj, SdInputsContainerView.class, "setNumpadEvents", "setNumpadEvents(Landroid/view/KeyEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(KeyEvent keyEvent) {
            invoke2(keyEvent);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(KeyEvent p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((SdInputsContainerView) this.receiver).setNumpadEvents(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
        super.onPause();
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment
    protected void onLoading(boolean loading) {
        FragmentSdInputsBinding binding = getBinding();
        super.onLoading(loading);
        SdButton sdInputsPrimaryCta = binding.sdInputsPrimaryCta;
        Intrinsics.checkNotNullExpressionValue(sdInputsPrimaryCta, "sdInputsPrimaryCta");
        SdButton sdInputsSecondaryCta = binding.sdInputsSecondaryCta;
        Intrinsics.checkNotNullExpressionValue(sdInputsSecondaryCta, "sdInputsSecondaryCta");
        CtaLoadingUtils.configCtasOnLoading(sdInputsPrimaryCta, sdInputsSecondaryCta, loading);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment
    public void bind(ApiSdInputsPage pageData) {
        Intrinsics.checkNotNullParameter(pageData, "pageData");
        FragmentSdInputsBinding binding = getBinding();
        ApiSdInputsPage.Components components = pageData.getComponents();
        TemplateUtil.bindOnNotNull(binding.sdInputsTitle, components.getTitle());
        TemplateUtil.bindOnNotNull(binding.sdInputsSubtitle, components.getSubtitle());
        TemplateUtil.bindOnNotNull(binding.sdInputHelperText, components.getHelper_text());
        binding.sdInputsPrimaryCta.bind((ApiSdFlexibleComponent) components.getPrimary_cta());
        binding.sdInputsInputContainer.bindList(components.getInputs());
        TemplateUtil.bindOnNotNull(binding.sdInputsSecondaryCta, components.getSecondary_cta());
        TemplateUtil.bindOnNotNull(binding.sdInputsDisclosure, components.getDisclosure());
        SdInputsContainerView sdInputsInputContainer = binding.sdInputsInputContainer;
        Intrinsics.checkNotNullExpressionValue(sdInputsInputContainer, "sdInputsInputContainer");
        for (View view : ViewGroup2.getChildren(sdInputsInputContainer)) {
            if (view instanceof SdInputRow) {
                CharSequence text = binding.sdInputsTitle.getText();
                Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                ((SdInputRow) view).overrideAccessibilityMessage(text);
            } else if (view instanceof SdPhoneInputRowWithInternationalInfo) {
                SdPhoneInputRow phoneInputRow = ((SdPhoneInputRowWithInternationalInfo) view).getPhoneInputRow();
                CharSequence text2 = binding.sdInputsTitle.getText();
                Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                phoneInputRow.overrideAccessibilityMessage(text2);
            }
        }
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdDropdownSelectRow.Callbacks
    public void showDropdownSelectBottomSheet(String componentTag, List<ApiSdOption> options) {
        Intrinsics.checkNotNullParameter(componentTag, "componentTag");
        Intrinsics.checkNotNullParameter(options, "options");
        SdDropdownSelectBottomSheet sdDropdownSelectBottomSheetNewInstance = SdDropdownSelectBottomSheet.INSTANCE.newInstance(componentTag, options);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        sdDropdownSelectBottomSheetNewInstance.show(childFragmentManager, STATE_INPUT_BOTTOM_SHEET_TAG);
    }

    @Override // com.robinhood.android.odyssey.lib.legacybottomsheet.SdDropdownSelectBottomSheet.Callbacks
    public void onDropdownSelect(ApiSdOption option, String targetComponentTag) {
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(targetComponentTag, "targetComponentTag");
        SdBaseView<ApiSdComponent, ApiSdBaseIndividualComponentData, ?> sdBaseViewFindComponentByTag = findComponentByTag(targetComponentTag);
        Intrinsics.checkNotNull(sdBaseViewFindComponentByTag, "null cannot be cast to non-null type com.robinhood.android.odyssey.lib.view.SdDropdownSelectRow");
        ((SdDropdownSelectRow) sdBaseViewFindComponentByTag).setSelectedOption(option);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseInputRow.Callbacks
    public void showCustomNumpad(boolean showNumpad) {
        RdsNumpadView sdInputsNumpad = getBinding().sdInputsNumpad;
        Intrinsics.checkNotNullExpressionValue(sdInputsNumpad, "sdInputsNumpad");
        sdInputsNumpad.setVisibility(showNumpad ? 0 : 8);
        Space sdInputsButtonBottomMargin = getBinding().sdInputsButtonBottomMargin;
        Intrinsics.checkNotNullExpressionValue(sdInputsButtonBottomMargin, "sdInputsButtonBottomMargin");
        sdInputsButtonBottomMargin.setVisibility(showNumpad ? 8 : 0);
        if (showNumpad) {
            Activity.hideKeyboard$default(requireBaseActivity(), false, 1, null);
        }
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseInputRow.Callbacks
    public void keyboardFocusOnEditText(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        BaseFragment.keyboardFocusOn$default(this, editText, false, 2, null);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseInputRow.Callbacks
    public void onEnterOrDonePressed() {
        SdButton sdInputsPrimaryCta = getBinding().sdInputsPrimaryCta;
        Intrinsics.checkNotNullExpressionValue(sdInputsPrimaryCta, "sdInputsPrimaryCta");
        if (!sdInputsPrimaryCta.isEnabled() || sdInputsPrimaryCta.getIsLoading()) {
            return;
        }
        sdInputsPrimaryCta.performClick();
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdPhoneInputRowWithInternationalInfo.Callbacks
    public void onInternationalInfoBtnClick(String defaultCountryCode, List<String> prohibitedCountryCodes) {
        InternationalInfoListBottomSheet internationalInfoListBottomSheet = (InternationalInfoListBottomSheet) InternationalInfoListBottomSheet.INSTANCE.newInstance((Parcelable) new InternationalInfoListBottomSheet.Args(defaultCountryCode, prohibitedCountryCodes));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        internationalInfoListBottomSheet.show(childFragmentManager, INTERNATIONAL_INFO_BOTTOM_SHEET_TAG);
    }
}

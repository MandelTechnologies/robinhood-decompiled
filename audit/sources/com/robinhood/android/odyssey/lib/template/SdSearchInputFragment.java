package com.robinhood.android.odyssey.lib.template;

import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.lib.odyssey.databinding.FragmentSdSearchInputBinding;
import com.robinhood.android.odyssey.lib.view.SdBaseInputRow;
import com.robinhood.android.odyssey.lib.view.SdListOptionsView;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.serverdrivenui.component.ApiSdComponent;
import com.robinhood.models.api.serverdrivenui.page.ApiSdSearchInputPage;
import com.robinhood.utils.extensions.Activity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SdSearchInputFragment.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0013H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/SdSearchInputFragment;", "Lcom/robinhood/android/odyssey/lib/template/BaseSdTemplateFragment;", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdSearchInputPage;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseInputRow$Callbacks;", "<init>", "()V", "binding", "Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdSearchInputBinding;", "getBinding", "()Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdSearchInputBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onStart", "", "setupInputContainer", "bind", "pageData", "onLoading", "loading", "", "onPause", "keyboardFocusOnEditText", "editText", "Landroid/widget/EditText;", "onEnterOrDonePressed", "showCustomNumpad", "showNumpad", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdSearchInputFragment extends BaseSdTemplateFragment<ApiSdSearchInputPage> implements SdBaseInputRow.Callbacks {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SdSearchInputFragment.class, "binding", "getBinding()Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdSearchInputBinding;", 0))};
    public static final int $stable = 8;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    public SdSearchInputFragment() {
        super(C20335R.layout.fragment_sd_search_input);
        this.binding = ViewBinding5.viewBinding(this, SdSearchInputFragment2.INSTANCE);
    }

    private final FragmentSdSearchInputBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentSdSearchInputBinding) value;
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        setupInputContainer();
    }

    private final void setupInputContainer() {
        final FragmentSdSearchInputBinding binding = getBinding();
        LifecycleHost.DefaultImpls.bind$default(this, binding.sdSearchInputInputContainer.textChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.odyssey.lib.template.SdSearchInputFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdSearchInputFragment.setupInputContainer$lambda$1$lambda$0(binding, (CharSequence) obj);
            }
        });
        SdBaseInputRow.configInput$default(binding.sdSearchInputInputContainer, binding.sdSearchInputNumpad.getKeyEvents(), false, true, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupInputContainer$lambda$1$lambda$0(FragmentSdSearchInputBinding fragmentSdSearchInputBinding, CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        SdListOptionsView.filterOptions$default(fragmentSdSearchInputBinding.sdSearchInputListOptionsView, input, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment
    public void bind(ApiSdSearchInputPage pageData) {
        Intrinsics.checkNotNullParameter(pageData, "pageData");
        FragmentSdSearchInputBinding binding = getBinding();
        ApiSdSearchInputPage.Components components = pageData.getComponents();
        TemplateUtil.bindOnNotNull(binding.sdSearchInputTitle, components.getTitle());
        TemplateUtil.bindOnNotNull(binding.sdSearchInputSubtitle, components.getSubtitle());
        TemplateUtil.bindOnNotNull(binding.sdSearchInputInputContainer, components.getSearch());
        binding.sdSearchInputListOptionsView.bind((ApiSdComponent) components.getInput());
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment
    protected void onLoading(boolean loading) {
        FragmentSdSearchInputBinding binding = getBinding();
        super.onLoading(loading);
        binding.sdSearchInputListOptionsView.setClickable(!loading);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
        super.onPause();
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

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseInputRow.Callbacks
    public void showCustomNumpad(boolean showNumpad) {
        RdsNumpadView sdSearchInputNumpad = getBinding().sdSearchInputNumpad;
        Intrinsics.checkNotNullExpressionValue(sdSearchInputNumpad, "sdSearchInputNumpad");
        sdSearchInputNumpad.setVisibility(showNumpad ? 0 : 8);
        if (showNumpad) {
            Activity.hideKeyboard$default(requireBaseActivity(), false, 1, null);
        }
    }
}

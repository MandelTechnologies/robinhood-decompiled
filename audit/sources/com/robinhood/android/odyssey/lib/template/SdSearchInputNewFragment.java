package com.robinhood.android.odyssey.lib.template;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentResultListener;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.lib.odyssey.databinding.FragmentSdSearchInputNewBinding;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorFragmentKey;
import com.robinhood.android.odyssey.lib.view.SdDropdownRow;
import com.robinhood.models.api.serverdrivenui.component.ApiSdComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdFlexibleComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdListOptionsComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdOption;
import com.robinhood.models.api.serverdrivenui.page.ApiSdSearchInputNewPage;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: SdSearchInputNewFragment.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014J\u001a\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J4\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001dH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/SdSearchInputNewFragment;", "Lcom/robinhood/android/odyssey/lib/template/BaseSdTemplateFragment;", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdSearchInputNewPage;", "<init>", "()V", "binding", "Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdSearchInputNewBinding;", "getBinding", "()Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdSearchInputNewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onLoading", "", "loading", "", "bind", "pageData", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "dropDownClick", "title", "", "placeholder", "selectedInput", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdOption;", "options", "Lkotlinx/collections/immutable/PersistentList;", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class SdSearchInputNewFragment extends BaseSdTemplateFragment<ApiSdSearchInputNewPage> {
    public static final String SD_SEARCH_CITIZEN_BUNDLE_KEY = "sdSearchCitizenBundleKey";
    public static final String SD_SEARCH_CITIZEN_REQUEST_KEY = "sdSearchCitizenRequestKey";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SdSearchInputNewFragment.class, "binding", "getBinding()Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdSearchInputNewBinding;", 0))};
    public static final int $stable = 8;

    public SdSearchInputNewFragment() {
        super(C20335R.layout.fragment_sd_search_input_new);
        this.binding = ViewBinding5.viewBinding(this, SdSearchInputNewFragment2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentSdSearchInputNewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentSdSearchInputNewBinding) value;
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment
    protected void onLoading(boolean loading) {
        FragmentSdSearchInputNewBinding binding = getBinding();
        super.onLoading(loading);
        binding.sdSearchInputNewPrimaryCta.setLoading(loading);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment
    public void bind(ApiSdSearchInputNewPage pageData) {
        Intrinsics.checkNotNullParameter(pageData, "pageData");
        FragmentSdSearchInputNewBinding binding = getBinding();
        ApiSdSearchInputNewPage.Components components = pageData.getComponents();
        binding.sdSearchInputNewTitle.bind((ApiSdFlexibleComponent) components.getTitle());
        binding.sdSearchInputNewDropdown.bind((ApiSdComponent) components.getInput());
        TemplateUtil.bindOnNotNull(binding.sdSearchInputNewSubtitle, components.getSubtitle());
        TemplateUtil.bindOnNotNull(binding.sdSearchInputNewDisclosure, components.getDisclosure());
        TemplateUtil.bindOnNotNull(binding.sdSearchInputNewPrimaryCta, components.getPrimary_cta());
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApiSdListOptionsComponent.Data data = getPageData().getComponents().getInput().getData();
        Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.robinhood.models.api.serverdrivenui.component.ApiSdListOptionsComponent.Data.ListOption");
        final List<ApiSdOption> options = ((ApiSdListOptionsComponent.Data.ListOption) data).getOptions();
        getChildFragmentManager().setFragmentResultListener(SD_SEARCH_CITIZEN_REQUEST_KEY, this, new FragmentResultListener() { // from class: com.robinhood.android.odyssey.lib.template.SdSearchInputNewFragment.onViewCreated.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                Intrinsics.checkNotNullParameter(str, "<unused var>");
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                String string2 = bundle.getString(SdSearchInputNewFragment.SD_SEARCH_CITIZEN_BUNDLE_KEY);
                SdDropdownRow sdDropdownRow = SdSearchInputNewFragment.this.getBinding().sdSearchInputNewDropdown;
                List<ApiSdOption> list = options;
                ApiSdOption apiSdOption = null;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (Intrinsics.areEqual(((ApiSdOption) next).getDisplay_label(), string2)) {
                            apiSdOption = next;
                            break;
                        }
                    }
                    apiSdOption = apiSdOption;
                }
                sdDropdownRow.setSelectedOption(apiSdOption);
            }
        });
        final SdDropdownRow sdDropdownRow = getBinding().sdSearchInputNewDropdown;
        sdDropdownRow.setPlaceholder(getPageData().getComponents().getSearch().getData().getPlaceholder());
        sdDropdownRow.setSelectedOption((!Intrinsics.areEqual(getPageData().getComponents().getDefault_to_first_option(), Boolean.TRUE) || options == null) ? null : (ApiSdOption) CollectionsKt.firstOrNull((List) options));
        Intrinsics.checkNotNull(sdDropdownRow);
        OnClickListeners.onClick(sdDropdownRow, new Function0() { // from class: com.robinhood.android.odyssey.lib.template.SdSearchInputNewFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SdSearchInputNewFragment.onViewCreated$lambda$4$lambda$3(this.f$0, sdDropdownRow, options);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new SdSearchInputNewFragment3(sdDropdownRow, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4$lambda$3(SdSearchInputNewFragment sdSearchInputNewFragment, SdDropdownRow sdDropdownRow, List list) {
        ImmutableList3<ApiSdOption> immutableList3PersistentListOf;
        String input_title_override = sdSearchInputNewFragment.getPageData().getComponents().getInput_title_override();
        String placeholder = sdSearchInputNewFragment.getPageData().getComponents().getSearch().getData().getPlaceholder();
        ApiSdOption selectedOption = sdDropdownRow.getSelectedOption();
        if (list == null || (immutableList3PersistentListOf = extensions2.toPersistentList(list)) == null) {
            immutableList3PersistentListOf = extensions2.persistentListOf();
        }
        sdSearchInputNewFragment.dropDownClick(input_title_override, placeholder, selectedOption, immutableList3PersistentListOf);
        return Unit.INSTANCE;
    }

    private final void dropDownClick(String title, String placeholder, ApiSdOption selectedInput, ImmutableList3<ApiSdOption> options) {
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new SdSearchCitizenSelectorFragmentKey(title, placeholder, selectedInput, options), null, 2, null).show(getChildFragmentManager(), "createSdSearchCitizenSelector");
    }
}

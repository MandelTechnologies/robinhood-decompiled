package com.robinhood.android.odyssey.lib.template;

import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.lib.odyssey.databinding.FragmentSdSelectionBinding;
import com.robinhood.android.odyssey.lib.view.SdListOptionsView;
import com.robinhood.android.odyssey.lib.view.SdMultiSelectOptionsView;
import com.robinhood.android.odyssey.lib.view.SdTwoColumnOptionsView;
import com.robinhood.models.api.serverdrivenui.component.ApiSdComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdFlexibleComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdListOptionsComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTextIndividualComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSelectionConfig;
import com.robinhood.models.api.serverdrivenui.page.ApiSdListOptionsPage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: SdSelectionFragment.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0014J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0014R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/SdSelectionFragment;", "Lcom/robinhood/android/odyssey/lib/template/BaseSdTemplateFragment;", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdListOptionsPage;", "<init>", "()V", "binding", "Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdSelectionBinding;", "getBinding", "()Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdSelectionBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "pageData", "bindSelectionConfig", "config", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSelectionConfig;", "onLoading", "loading", "", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdSelectionFragment extends BaseSdTemplateFragment<ApiSdListOptionsPage> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SdSelectionFragment.class, "binding", "getBinding()Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdSelectionBinding;", 0))};
    public static final int $stable = 8;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    public SdSelectionFragment() {
        super(C20335R.layout.fragment_sd_selection);
        this.binding = ViewBinding5.viewBinding(this, SdSelectionFragment2.INSTANCE);
    }

    private final FragmentSdSelectionBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentSdSelectionBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment
    public void bind(ApiSdListOptionsPage pageData) {
        ApiSdFlexibleComponent.Layout layout;
        ApiSdFlexibleComponent.Insets insets;
        ApiSelectionConfig selection_config;
        Intrinsics.checkNotNullParameter(pageData, "pageData");
        FragmentSdSelectionBinding binding = getBinding();
        ApiSdListOptionsPage.Components components = pageData.getComponents();
        TemplateUtil.bindOnNotNull(binding.sdSelectionTitle, components.getTitle());
        TemplateUtil.bindOnNotNull(binding.sdSelectionSubtitle, components.getSubtitle());
        ApiSelectionConfig selection_config2 = components.getSelection_config();
        if (selection_config2 != null) {
            bindSelectionConfig(selection_config2);
        }
        SdMultiSelectOptionsView sdSelectionMultiSelectOptionsView = binding.sdSelectionMultiSelectOptionsView;
        Intrinsics.checkNotNullExpressionValue(sdSelectionMultiSelectOptionsView, "sdSelectionMultiSelectOptionsView");
        sdSelectionMultiSelectOptionsView.setVisibility(8);
        SdListOptionsView sdSelectionListOptionsView = binding.sdSelectionListOptionsView;
        Intrinsics.checkNotNullExpressionValue(sdSelectionListOptionsView, "sdSelectionListOptionsView");
        sdSelectionListOptionsView.setVisibility(8);
        SdTwoColumnOptionsView sdSelectionTwoColumnOptionsView = binding.sdSelectionTwoColumnOptionsView;
        Intrinsics.checkNotNullExpressionValue(sdSelectionTwoColumnOptionsView, "sdSelectionTwoColumnOptionsView");
        sdSelectionTwoColumnOptionsView.setVisibility(8);
        if ((components.getChoices().getData() instanceof ApiSdListOptionsComponent.Data.ListOption) && (selection_config = components.getSelection_config()) != null && selection_config.getAllow_multiple_selection()) {
            binding.sdSelectionMultiSelectOptionsView.bind((ApiSdComponent) components.getChoices());
            SdMultiSelectOptionsView sdSelectionMultiSelectOptionsView2 = binding.sdSelectionMultiSelectOptionsView;
            Intrinsics.checkNotNullExpressionValue(sdSelectionMultiSelectOptionsView2, "sdSelectionMultiSelectOptionsView");
            sdSelectionMultiSelectOptionsView2.setVisibility(0);
        } else if (components.getChoices().getData() instanceof ApiSdListOptionsComponent.Data.ListOption) {
            binding.sdSelectionListOptionsView.bind((ApiSdComponent) components.getChoices());
            SdListOptionsView sdSelectionListOptionsView2 = binding.sdSelectionListOptionsView;
            Intrinsics.checkNotNullExpressionValue(sdSelectionListOptionsView2, "sdSelectionListOptionsView");
            sdSelectionListOptionsView2.setVisibility(0);
        } else if (components.getChoices().getData() instanceof ApiSdListOptionsComponent.Data.TwoColumnOption) {
            binding.sdSelectionTwoColumnOptionsView.bind((ApiSdComponent) components.getChoices());
            SdTwoColumnOptionsView sdSelectionTwoColumnOptionsView2 = binding.sdSelectionTwoColumnOptionsView;
            Intrinsics.checkNotNullExpressionValue(sdSelectionTwoColumnOptionsView2, "sdSelectionTwoColumnOptionsView");
            sdSelectionTwoColumnOptionsView2.setVisibility(0);
        }
        TemplateUtil.bindOnNotNull(binding.sdSelectionDisclosure, components.getDisclosure());
        ApiSdTextIndividualComponent disclosure = components.getDisclosure();
        if (disclosure != null && (layout = disclosure.getLayout()) != null && (insets = layout.getInsets()) != null) {
            binding.sdSelectionDisclosure.setPadding((int) insets.getStart(), (int) insets.getTop(), (int) insets.getEnd(), (int) insets.getBottom());
        }
        TemplateUtil.bindOnNotNull(binding.sdSelectionPrimaryCta, components.getPrimary_cta());
        TemplateUtil.bindOnNotNull(binding.sdSelectionSecondaryCta, components.getSecondary_cta());
    }

    private final void bindSelectionConfig(final ApiSelectionConfig config) {
        final FragmentSdSelectionBinding binding = getBinding();
        binding.sdSelectionMultiSelectOptionsView.setCheckboxPosition(config.getCheckbox_position());
        Integer max_selections = config.getMax_selections();
        if (max_selections != null) {
            binding.sdSelectionMultiSelectOptionsView.setMaxSelections(max_selections.intValue());
        }
        ImmutableList<ApiSelectionConfig.ExclusionRule> exclusion_rules = config.getExclusion_rules();
        if (exclusion_rules != null) {
            binding.sdSelectionMultiSelectOptionsView.setExclusionRules(exclusion_rules);
        }
        if (config.getRequired()) {
            binding.sdSelectionPrimaryCta.setEnabled(false);
            binding.sdSelectionMultiSelectOptionsView.setOnToggledCountChanged(new Function1() { // from class: com.robinhood.android.odyssey.lib.template.SdSelectionFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SdSelectionFragment.bindSelectionConfig$lambda$6$lambda$5(binding, config, ((Integer) obj).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindSelectionConfig$lambda$6$lambda$5(FragmentSdSelectionBinding fragmentSdSelectionBinding, ApiSelectionConfig apiSelectionConfig, int i) {
        fragmentSdSelectionBinding.sdSelectionPrimaryCta.setEnabled(i > 0);
        fragmentSdSelectionBinding.sdSelectionSecondaryCta.setEnabled(!Intrinsics.areEqual(apiSelectionConfig.getDisable_secondary_on_select(), Boolean.TRUE) || i == 0);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment
    protected void onLoading(boolean loading) {
        FragmentSdSelectionBinding binding = getBinding();
        super.onLoading(loading);
        binding.sdSelectionListOptionsView.setClickable(!loading);
        binding.sdSelectionTwoColumnOptionsView.setClickable(!loading);
        binding.sdSelectionPrimaryCta.setLoading(loading);
        binding.sdSelectionSecondaryCta.setEnabled(!loading);
    }
}

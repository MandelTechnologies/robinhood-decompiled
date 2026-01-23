package com.robinhood.android.odyssey.lib.template;

import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.lib.odyssey.databinding.FragmentSdRadioGroupBinding;
import com.robinhood.android.odyssey.lib.view.SdButton;
import com.robinhood.models.api.serverdrivenui.component.ApiSdComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdFlexibleComponent;
import com.robinhood.models.api.serverdrivenui.page.ApiSdRadioGroupPage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SdRadioGroupFragment.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0014J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/SdRadioGroupFragment;", "Lcom/robinhood/android/odyssey/lib/template/BaseSdTemplateFragment;", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdRadioGroupPage;", "<init>", "()V", "binding", "Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdRadioGroupBinding;", "getBinding", "()Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdRadioGroupBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "pageData", "onLoading", "loading", "", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class SdRadioGroupFragment extends BaseSdTemplateFragment<ApiSdRadioGroupPage> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SdRadioGroupFragment.class, "binding", "getBinding()Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdRadioGroupBinding;", 0))};
    public static final int $stable = 8;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    public SdRadioGroupFragment() {
        super(C20335R.layout.fragment_sd_radio_group);
        this.binding = ViewBinding5.viewBinding(this, SdRadioGroupFragment2.INSTANCE);
    }

    private final FragmentSdRadioGroupBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentSdRadioGroupBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment
    public void bind(ApiSdRadioGroupPage pageData) {
        Intrinsics.checkNotNullParameter(pageData, "pageData");
        FragmentSdRadioGroupBinding binding = getBinding();
        ApiSdRadioGroupPage.Components components = pageData.getComponents();
        binding.sdRadioGroupTitle.bind((ApiSdFlexibleComponent) components.getTitle());
        binding.sdRadioGroupSubtitle.bind((ApiSdFlexibleComponent) components.getSubtitle());
        binding.sdRadioGroupContent.bind((ApiSdComponent) components.getContent());
        binding.sdRadioGroupPrimaryCta.bind((ApiSdFlexibleComponent) components.getPrimary_cta());
        TemplateUtil.bindOnNotNull(binding.sdRadioGroupSecondaryCta, components.getSecondary_cta());
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment
    protected void onLoading(boolean loading) {
        FragmentSdRadioGroupBinding binding = getBinding();
        super.onLoading(loading);
        SdButton sdRadioGroupPrimaryCta = binding.sdRadioGroupPrimaryCta;
        Intrinsics.checkNotNullExpressionValue(sdRadioGroupPrimaryCta, "sdRadioGroupPrimaryCta");
        SdButton sdRadioGroupSecondaryCta = binding.sdRadioGroupSecondaryCta;
        Intrinsics.checkNotNullExpressionValue(sdRadioGroupSecondaryCta, "sdRadioGroupSecondaryCta");
        CtaLoadingUtils.configCtasOnLoading(sdRadioGroupPrimaryCta, sdRadioGroupSecondaryCta, loading);
        getBinding().sdRadioGroupContent.setEnabled(!loading);
    }
}

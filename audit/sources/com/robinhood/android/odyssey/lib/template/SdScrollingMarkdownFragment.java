package com.robinhood.android.odyssey.lib.template;

import android.widget.LinearLayout;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.lib.odyssey.databinding.FragmentSdScrollingMarkdownBinding;
import com.robinhood.android.odyssey.lib.template.SdTemplateState2;
import com.robinhood.android.odyssey.lib.view.SdButton;
import com.robinhood.android.odyssey.lib.view.SdScrollViewer;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTextComponentData;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTextIndividualComponent;
import com.robinhood.models.api.serverdrivenui.page.ApiSdScrollingMarkdownPage;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SdScrollingMarkdownFragment.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J$\u0010\u0018\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0014H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/SdScrollingMarkdownFragment;", "Lcom/robinhood/android/odyssey/lib/template/BaseSdTemplateFragment;", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdScrollingMarkdownPage;", "Lcom/robinhood/android/odyssey/lib/view/SdScrollViewer$Callbacks;", "<init>", "()V", "binding", "Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdScrollingMarkdownBinding;", "getBinding", "()Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdScrollingMarkdownBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "pageData", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onLoading", "loading", "", "handleError", "error", "Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData$Error;", "loadContents", "requestedInfo", "", "Lcom/robinhood/android/odyssey/lib/template/LoadContentRequest;", "onFinishLoadingAction", "Lkotlin/Function0;", "onScrollChange", "scrolled", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdScrollingMarkdownFragment extends BaseSdTemplateFragment<ApiSdScrollingMarkdownPage> implements SdScrollViewer.Callbacks {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SdScrollingMarkdownFragment.class, "binding", "getBinding()Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdScrollingMarkdownBinding;", 0))};
    public static final int $stable = 8;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    public SdScrollingMarkdownFragment() {
        super(C20335R.layout.fragment_sd_scrolling_markdown);
        this.binding = ViewBinding5.viewBinding(this, SdScrollingMarkdownFragment2.INSTANCE);
    }

    private final FragmentSdScrollingMarkdownBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentSdScrollingMarkdownBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment
    public void bind(ApiSdScrollingMarkdownPage pageData) {
        Intrinsics.checkNotNullParameter(pageData, "pageData");
        FragmentSdScrollingMarkdownBinding binding = getBinding();
        ApiSdScrollingMarkdownPage.Components components = pageData.getComponents();
        binding.sdScrollingMarkdownScrollViewer.bind(components.getScroll_viewer());
        TemplateUtil.bindOnNotNull(binding.sdScrollingMarkdownPanelText, components.getText_above_primary_cta());
        TemplateUtil.bindOnNotNull(binding.sdScrollingMarkdownPrimaryCta, components.getPrimary_cta());
        TemplateUtil.bindOnNotNull(binding.sdScrollingMarkdownSecondaryCta, components.getSecondary_cta());
        LinearLayout sdScrollingMarkdownPanel = binding.sdScrollingMarkdownPanel;
        Intrinsics.checkNotNullExpressionValue(sdScrollingMarkdownPanel, "sdScrollingMarkdownPanel");
        sdScrollingMarkdownPanel.setVisibility(components.getText_above_primary_cta() != null || components.getPrimary_cta() != null || components.getSecondary_cta() != null ? 0 : 8);
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        ApiSdTextComponentData data;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        ApiSdTextIndividualComponent toolbar2 = getPageData().getComponents().getToolbar();
        toolbar.setTitle((toolbar2 == null || (data = toolbar2.getData()) == null) ? null : data.getText());
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment
    protected void onLoading(boolean loading) {
        FragmentSdScrollingMarkdownBinding binding = getBinding();
        super.onLoading(loading);
        binding.sdScrollingMarkdownPrimaryCta.setLoading(loading);
        binding.sdScrollingMarkdownPrimaryCta.setClickable(!loading);
        SdButton sdScrollingMarkdownSecondaryCta = getBinding().sdScrollingMarkdownSecondaryCta;
        Intrinsics.checkNotNullExpressionValue(sdScrollingMarkdownSecondaryCta, "sdScrollingMarkdownSecondaryCta");
        if (sdScrollingMarkdownSecondaryCta.getVisibility() == 0) {
            binding.sdScrollingMarkdownSecondaryCta.setLoading(loading);
            binding.sdScrollingMarkdownSecondaryCta.setClickable(!loading);
        }
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment
    protected void handleError(SdTemplateState2.Error error) {
        Intrinsics.checkNotNullParameter(error, "error");
        super.handleError(error);
        if (error.getReason() == SdTemplateState2.Error.FailureReason.CONTENT_LOADING) {
            getBinding().sdScrollingMarkdownPrimaryCta.setLoading(true);
            SdButton sdScrollingMarkdownSecondaryCta = getBinding().sdScrollingMarkdownSecondaryCta;
            Intrinsics.checkNotNullExpressionValue(sdScrollingMarkdownSecondaryCta, "sdScrollingMarkdownSecondaryCta");
            if (sdScrollingMarkdownSecondaryCta.getVisibility() == 0) {
                getBinding().sdScrollingMarkdownSecondaryCta.setLoading(true);
            }
        }
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdScrollViewer.Callbacks
    public void loadContents(List<? extends LoadContentRequest> requestedInfo, Function0<Unit> onFinishLoadingAction) {
        Intrinsics.checkNotNullParameter(requestedInfo, "requestedInfo");
        Intrinsics.checkNotNullParameter(onFinishLoadingAction, "onFinishLoadingAction");
        getDuxo().loadContents(requestedInfo, onFinishLoadingAction);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdScrollViewer.Callbacks
    public void onScrollChange(boolean scrolled) {
        requireToolbar().setElevation(scrolled ? requireToolbar().getScrollRaisedElevation() : 0.0f);
    }
}

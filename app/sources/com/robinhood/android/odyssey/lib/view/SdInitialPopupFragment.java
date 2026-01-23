package com.robinhood.android.odyssey.lib.view;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment;
import com.robinhood.models.api.serverdrivenui.component.ApiSdAction;
import com.robinhood.models.api.serverdrivenui.component.ApiSdButtonComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdPopup;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTextComponentData;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTextSubComponent;
import com.robinhood.models.api.serverdrivenui.page.ApiSdPopupPage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SdInitialPopupFragment.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0014J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdInitialPopupFragment;", "Lcom/robinhood/android/odyssey/lib/template/BaseSdTemplateFragment;", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdPopupPage;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnClickListener;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "<init>", "()V", "popupData", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdPopup;", "getPopupData", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdPopup;", "bind", "", "pageData", "onPositiveButtonClicked", "", "id", "", "passthroughArgs", "Landroid/os/Bundle;", "onNegativeButtonClicked", "onDialogDismissed", "onBackPressed", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdInitialPopupFragment extends BaseSdTemplateFragment<ApiSdPopupPage> implements RhDialogFragment.OnClickListener, RhDialogFragment.OnDismissListener {
    public static final int $stable = 8;

    public SdInitialPopupFragment() {
        super(C11048R.layout.parent_fragment_container);
    }

    private final ApiSdPopup getPopupData() {
        return getPageData().getComponents().getPopup();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment
    public void bind(ApiSdPopupPage pageData) {
        ApiSdButtonComponent.ApiSdButtonComponentData data;
        ApiSdTextComponentData data2;
        ApiSdTextComponentData data3;
        Intrinsics.checkNotNullParameter(pageData, "pageData");
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder builderCreate = companion.create(contextRequireContext);
        String id = getPopupData().getId();
        builderCreate.setId(id != null ? id.hashCode() : 0);
        ApiSdTextSubComponent title = getPopupData().getTitle();
        String text = null;
        builderCreate.setTitle((title == null || (data3 = title.getData()) == null) ? null : SdTextUtil.buildSpannableStringForPopup(data3, builderCreate.getContext(), new SdInitialPopupFragment3(this)));
        ApiSdTextSubComponent subtitle = getPopupData().getSubtitle();
        SpannableString spannableStringBuildSpannableStringForPopup = (subtitle == null || (data2 = subtitle.getData()) == null) ? null : SdTextUtil.buildSpannableStringForPopup(data2, builderCreate.getContext(), new SdInitialPopupFragment2(this));
        if (spannableStringBuildSpannableStringForPopup != null) {
            builderCreate.setMessage(spannableStringBuildSpannableStringForPopup);
        }
        ApiSdButtonComponent primary_cta = getPopupData().getPrimary_cta();
        if (primary_cta != null && (data = primary_cta.getData()) != null) {
            text = data.getText();
        }
        builderCreate.setPositiveButton(text);
        ApiSdButtonComponent secondary_cta = getPopupData().getSecondary_cta();
        if (secondary_cta != null) {
            builderCreate.setNegativeButton(secondary_cta.getData().getText());
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(builderCreate, parentFragmentManager, getPopupData().getId(), false, 4, null);
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        ApiSdAction on_click;
        String id2 = getPopupData().getId();
        if (id != (id2 != null ? id2.hashCode() : 0)) {
            return super.onPositiveButtonClicked(id, passthroughArgs);
        }
        ApiSdButtonComponent primary_cta = getPopupData().getPrimary_cta();
        ApiSdButtonComponent.ApiSdButtonComponentData data = primary_cta != null ? primary_cta.getData() : null;
        if (data != null && (on_click = data.getOn_click()) != null) {
            onComponentAction(data.getId(), on_click);
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        ApiSdAction on_click;
        String id2 = getPopupData().getId();
        if (id != (id2 != null ? id2.hashCode() : 0)) {
            return super.onNegativeButtonClicked(id, passthroughArgs);
        }
        ApiSdButtonComponent secondary_cta = getPopupData().getSecondary_cta();
        ApiSdButtonComponent.ApiSdButtonComponentData data = secondary_cta != null ? secondary_cta.getData() : null;
        if (data != null && (on_click = data.getOn_click()) != null) {
            onComponentAction(data.getId(), on_click);
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        requireActivity().finish();
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        requireActivity().finish();
        return true;
    }
}

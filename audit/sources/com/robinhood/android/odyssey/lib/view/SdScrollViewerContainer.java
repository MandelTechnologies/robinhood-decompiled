package com.robinhood.android.odyssey.lib.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroup2;
import com.robinhood.android.odyssey.lib.template.LoadContentRequest;
import com.robinhood.models.api.serverdrivenui.component.ApiSdAlertComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdBannerComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdCheckboxSubComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdFancyAgreementComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdMarkdownContainerSubComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdMarkdownSubComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdScrollViewerContentComponent;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.utils.Preconditions;
import java.util.ArrayList;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SdScrollViewerContainer.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u0010\u001a\u00020\u000fH\u0014J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0014J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\b\u0010\u0018\u001a\u00020\u000fH\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdScrollViewerContainer;", "Lcom/robinhood/android/odyssey/lib/view/SdLinearLayout;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdScrollViewerContentComponent;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "containerCallbacks", "Lcom/robinhood/android/odyssey/lib/view/SdScrollViewerContainer$Callbacks;", "loadContentRequests", "", "Lcom/robinhood/android/odyssey/lib/template/LoadContentRequest;", "initialize", "", "doBeforeAddingChildren", "inflateChild", "Landroid/view/View;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "component", "doAfterRestoringOrBindingChildState", "view", "doAfterAddingChildren", "Callbacks", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdScrollViewerContainer extends SdLinearLayout<ApiSdScrollViewerContentComponent> {
    public static final int $stable = 8;
    private Callbacks containerCallbacks;
    private List<LoadContentRequest> loadContentRequests;

    /* compiled from: SdScrollViewerContainer.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdScrollViewerContainer$Callbacks;", "", "submitLoadContentRequests", "", "requests", "", "Lcom/robinhood/android/odyssey/lib/template/LoadContentRequest;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void submitLoadContentRequests(List<? extends LoadContentRequest> requests);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdScrollViewerContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.loadContentRequests = new ArrayList();
    }

    public final void initialize(Callbacks containerCallbacks) {
        Intrinsics.checkNotNullParameter(containerCallbacks, "containerCallbacks");
        this.containerCallbacks = containerCallbacks;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdLinearLayout
    protected void doBeforeAddingChildren() {
        super.doBeforeAddingChildren();
        this.loadContentRequests.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.odyssey.lib.view.SdLinearLayout
    public View inflateChild(int index, ApiSdScrollViewerContentComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        if (component instanceof ApiSdMarkdownSubComponent) {
            return SdMarkdownView.INSTANCE.inflate((ViewGroup) this);
        }
        if (component instanceof ApiSdMarkdownContainerSubComponent) {
            return SdMarkdownContainerView.INSTANCE.inflate((ViewGroup) this);
        }
        if (component instanceof ApiSdCheckboxSubComponent) {
            return SdCheckboxView.INSTANCE.inflate((ViewGroup) this);
        }
        if (component instanceof ApiSdBannerComponent) {
            return SdBanner.INSTANCE.inflate((ViewGroup) this);
        }
        if (component instanceof ApiSdAlertComponent) {
            return SdAlert.INSTANCE.inflate((ViewGroup) this);
        }
        if (component instanceof ApiSdFancyAgreementComponent) {
            return SdFancyAgreementView.INSTANCE.inflate((ViewGroup) this);
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(component);
        throw new ExceptionsH();
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdLinearLayout
    protected void doAfterRestoringOrBindingChildState(View view, int index) {
        LoadContentRequest.FancyAgreement loadFancyAgreementRequest;
        Intrinsics.checkNotNullParameter(view, "view");
        super.doAfterRestoringOrBindingChildState(view, index);
        if (view instanceof SdMarkdownView) {
            LoadContentRequest.Markdown loadMarkdownRequest = ((SdMarkdownView) view).getLoadMarkdownRequest();
            if (loadMarkdownRequest != null) {
                this.loadContentRequests.add(loadMarkdownRequest);
                return;
            }
            return;
        }
        if (!(view instanceof SdFancyAgreementView) || (loadFancyAgreementRequest = ((SdFancyAgreementView) view).getLoadFancyAgreementRequest()) == null) {
            return;
        }
        this.loadContentRequests.add(loadFancyAgreementRequest);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdLinearLayout
    protected void doAfterAddingChildren() {
        super.doAfterAddingChildren();
        Callbacks callbacks = this.containerCallbacks;
        if (callbacks == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerCallbacks");
            callbacks = null;
        }
        callbacks.submitLoadContentRequests(this.loadContentRequests);
        for (View view : ViewGroup2.getChildren(this)) {
            if (view instanceof SdCheckboxView) {
                ((SdCheckboxView) view).setIsReadyForCheckEvent(true);
            }
        }
    }
}

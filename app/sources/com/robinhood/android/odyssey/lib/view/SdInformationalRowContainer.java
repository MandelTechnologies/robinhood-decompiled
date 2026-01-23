package com.robinhood.android.odyssey.lib.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.robinhood.models.api.serverdrivenui.component.ApiSdInformationalRowComponent;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdInformationalRowContainer.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0014¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdInformationalRowContainer;", "Lcom/robinhood/android/odyssey/lib/view/SdLinearLayout;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdInformationalRowComponent;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "inflateChild", "Landroid/view/View;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "component", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class SdInformationalRowContainer extends SdLinearLayout<ApiSdInformationalRowComponent> {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdInformationalRowContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.odyssey.lib.view.SdLinearLayout
    public View inflateChild(int index, ApiSdInformationalRowComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        return SdInformationalRow.INSTANCE.inflate((ViewGroup) this);
    }
}

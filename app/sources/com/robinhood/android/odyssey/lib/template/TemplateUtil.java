package com.robinhood.android.odyssey.lib.template;

import android.view.View;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.models.api.serverdrivenui.component.ApiSdComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TemplateUtil.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u0000\u001a\u00020\u0001\"\u001a\b\u0000\u0010\u0002*\u00020\u0003*\u0010\u0012\u0004\u0012\u0002H\u0005\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004\"\b\b\u0001\u0010\u0005*\u00020\u0006*\u0002H\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"bindOnNotNull", "", "T", "Landroid/view/View;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView;", "C", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdComponent;", "component", "(Landroid/view/View;Lcom/robinhood/models/api/serverdrivenui/component/ApiSdComponent;)V", "feature-lib-odyssey_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.odyssey.lib.template.TemplateUtilKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class TemplateUtil {
    public static final <T extends View & SdBaseView<C, ?, ?>, C extends ApiSdComponent> void bindOnNotNull(T t, ApiSdComponent apiSdComponent) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        if (apiSdComponent != null) {
            ((SdBaseView) t).bind(apiSdComponent);
        } else {
            t.setVisibility(8);
        }
    }
}

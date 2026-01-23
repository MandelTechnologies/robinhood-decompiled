package com.withpersona.sdk2.inquiry.steps.p423ui.view;

import android.content.Context;
import android.view.View;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentAttributes3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StackGapView.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/view/StackGapView;", "Landroid/view/View;", "Lcom/withpersona/sdk2/inquiry/steps/ui/view/AssociatedHideableView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "associatedComponents", "", "Ljava/lang/ref/WeakReference;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "getAssociatedComponents", "()Ljava/util/List;", "applyHiddenState", "", "componentParams", "", "", "", "triggeringComponentIsHidden", "", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class StackGapView extends View implements AssociatedHideableView {
    private final List<WeakReference<UiComponent>> associatedComponents;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackGapView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.associatedComponents = new ArrayList();
    }

    public final List<WeakReference<UiComponent>> getAssociatedComponents() {
        return this.associatedComponents;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.view.AssociatedHideableView
    public void applyHiddenState(Map<String, ? extends Object> componentParams, boolean triggeringComponentIsHidden) {
        boolean zBooleanValue;
        Boolean value;
        Intrinsics.checkNotNullParameter(componentParams, "componentParams");
        if (triggeringComponentIsHidden) {
            setVisibility(8);
            return;
        }
        Iterator<T> it = this.associatedComponents.iterator();
        loop0: while (true) {
            zBooleanValue = false;
            while (it.hasNext()) {
                UiComponent uiComponent = (UiComponent) ((WeakReference) it.next()).get();
                JsonLogicBoolean hidden = null;
                UiComponentAttributes3 uiComponentAttributes3 = uiComponent instanceof UiComponentAttributes3 ? (UiComponentAttributes3) uiComponent : null;
                if (uiComponentAttributes3 != null) {
                    hidden = uiComponentAttributes3.getHidden();
                }
                if (hidden == null || (value = hidden.getValue(componentParams, uiComponent)) == null) {
                    break;
                } else {
                    zBooleanValue = value.booleanValue();
                }
            }
        }
        setVisibility(zBooleanValue ? 8 : 0);
    }
}

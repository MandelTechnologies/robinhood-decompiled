package com.withpersona.sdk2.inquiry.steps.p423ui;

import android.view.View;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiStepUtils.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/ComponentView;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "component", "Landroid/view/View;", "view", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;)V", "component1", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "component2", "()Landroid/view/View;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "getComponent", "Landroid/view/View;", "getView", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ComponentView {
    private final UiComponent component;
    private final View view;

    /* renamed from: component1, reason: from getter */
    public final UiComponent getComponent() {
        return this.component;
    }

    /* renamed from: component2, reason: from getter */
    public final View getView() {
        return this.view;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComponentView)) {
            return false;
        }
        ComponentView componentView = (ComponentView) other;
        return Intrinsics.areEqual(this.component, componentView.component) && Intrinsics.areEqual(this.view, componentView.view);
    }

    public int hashCode() {
        return (this.component.hashCode() * 31) + this.view.hashCode();
    }

    public String toString() {
        return "ComponentView(component=" + this.component + ", view=" + this.view + ")";
    }

    public ComponentView(UiComponent component, View view) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(view, "view");
        this.component = component;
        this.view = view;
    }

    public final UiComponent getComponent() {
        return this.component;
    }

    public final View getView() {
        return this.view;
    }
}

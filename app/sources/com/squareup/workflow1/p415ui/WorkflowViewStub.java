package com.squareup.workflow1.p415ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.squareup.workflow1.p415ui.androidx.WorkflowLifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WorkflowViewStub.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\b\u0010\"\u001a\u00020\u0007H\u0016J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u0001H\u0002J\u0012\u0010%\u001a\u00020\u00172\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0012\u0010(\u001a\u00020\u00172\b\b\u0001\u0010)\u001a\u00020\u0007H\u0016J\u0010\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u0007H\u0016J\u0016\u0010,\u001a\u00020\u00012\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200R\u001e\u0010\u000b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR&\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00078\u0006@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R,\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00170\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u00061"}, m3636d2 = {"Lcom/squareup/workflow1/ui/WorkflowViewStub;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyle", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "<set-?>", "actual", "getActual", "()Landroid/view/View;", "value", "inflatedId", "getInflatedId", "()I", "setInflatedId", "(I)V", "replaceOldViewInParent", "Lkotlin/Function2;", "Landroid/view/ViewGroup;", "", "getReplaceOldViewInParent", "()Lkotlin/jvm/functions/Function2;", "setReplaceOldViewInParent", "(Lkotlin/jvm/functions/Function2;)V", "updatesVisibility", "", "getUpdatesVisibility", "()Z", "setUpdatesVisibility", "(Z)V", "getVisibility", "propagateSavedStateRegistryOwner", "newView", "setBackground", "background", "Landroid/graphics/drawable/Drawable;", "setId", "id", "setVisibility", "visibility", "update", "rendering", "", "viewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "wf1-core-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class WorkflowViewStub extends View {
    private View actual;
    private int inflatedId;
    private Function2<? super ViewGroup, ? super View, Unit> replaceOldViewInParent;
    private boolean updatesVisibility;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WorkflowViewStub(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ WorkflowViewStub(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WorkflowViewStub(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.actual = this;
        this.updatesVisibility = true;
        this.inflatedId = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WorkflowViewStub, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…fStyle, defStyleRes\n    )");
        setInflatedId(typedArrayObtainStyledAttributes.getResourceId(R$styleable.WorkflowViewStub_inflatedId, -1));
        this.updatesVisibility = typedArrayObtainStyledAttributes.getBoolean(R$styleable.WorkflowViewStub_updatesVisibility, true);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(true);
        this.replaceOldViewInParent = new Function2<ViewGroup, View, Unit>() { // from class: com.squareup.workflow1.ui.WorkflowViewStub$replaceOldViewInParent$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ViewGroup viewGroup, View view) {
                invoke2(viewGroup, view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ViewGroup parent, View newView) {
                Unit unit;
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(newView, "newView");
                int iIndexOfChild = parent.indexOfChild(this.this$0.getActual());
                parent.removeView(this.this$0.getActual());
                ViewGroup.LayoutParams layoutParams = this.this$0.getActual().getLayoutParams();
                if (layoutParams == null) {
                    unit = null;
                } else {
                    parent.addView(newView, iIndexOfChild, layoutParams);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    parent.addView(newView, iIndexOfChild);
                }
            }
        };
    }

    public final View getActual() {
        return this.actual;
    }

    public final boolean getUpdatesVisibility() {
        return this.updatesVisibility;
    }

    public final void setUpdatesVisibility(boolean z) {
        this.updatesVisibility = z;
    }

    public final int getInflatedId() {
        return this.inflatedId;
    }

    public final void setInflatedId(int i) {
        if (i != -1 && i == getId()) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("inflatedId must be distinct from id: ", getResources().getResourceName(getId())).toString());
        }
        this.inflatedId = i;
    }

    @Override // android.view.View
    public void setId(int id) {
        if (id != -1 && id == this.inflatedId) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("id must be distinct from inflatedId: ", getResources().getResourceName(id)).toString());
        }
        super.setId(id);
    }

    public final Function2<ViewGroup, View, Unit> getReplaceOldViewInParent() {
        return this.replaceOldViewInParent;
    }

    public final void setReplaceOldViewInParent(Function2<? super ViewGroup, ? super View, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.replaceOldViewInParent = function2;
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        View view;
        super.setVisibility(visibility);
        if (Intrinsics.areEqual(this.actual, this) || (view = this.actual) == null) {
            return;
        }
        view.setVisibility(visibility);
    }

    @Override // android.view.View
    public int getVisibility() {
        View view = this.actual;
        return (Intrinsics.areEqual(view, this) || view == null) ? super.getVisibility() : this.actual.getVisibility();
    }

    @Override // android.view.View
    public void setBackground(Drawable background) {
        View view;
        super.setBackground(background);
        if (Intrinsics.areEqual(this.actual, this) || (view = this.actual) == null || background == null) {
            return;
        }
        view.setBackground(background);
    }

    public final View update(Object rendering, ViewEnvironment viewEnvironment) {
        WorkflowLifecycleOwner workflowLifecycleOwner;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        View view = this.actual;
        if (!ViewShowRendering.canShowRendering(view, rendering)) {
            view = null;
        }
        if (view != null) {
            ViewShowRendering.showRendering(view, rendering, viewEnvironment);
            return view;
        }
        ViewParent parent = this.actual.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            throw new IllegalStateException("WorkflowViewStub must have a non-null ViewGroup parent");
        }
        View view2 = this.actual;
        if (view2 != this && (workflowLifecycleOwner = WorkflowLifecycleOwner.INSTANCE.get(view2)) != null) {
            workflowLifecycleOwner.destroyOnDetach();
        }
        ViewRegistry viewRegistry = (ViewRegistry) viewEnvironment.get(ViewRegistry.INSTANCE);
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View viewBuildView = ViewRegistry2.buildView(viewRegistry, rendering, viewEnvironment, context, viewGroup, new ViewRegistry4() { // from class: com.squareup.workflow1.ui.WorkflowViewStub$$ExternalSyntheticLambda0
            @Override // com.squareup.workflow1.p415ui.ViewRegistry4
            public final void startView(View view3, Function0 function0) {
                WorkflowViewStub.m26830update$lambda4(view3, function0);
            }
        });
        ViewShowRendering.start(viewBuildView);
        if (getInflatedId() != -1) {
            viewBuildView.setId(getInflatedId());
        }
        if (getUpdatesVisibility()) {
            viewBuildView.setVisibility(getVisibility());
        }
        Drawable background = getBackground();
        if (background != null) {
            viewBuildView.setBackground(background);
        }
        propagateSavedStateRegistryOwner(viewBuildView);
        getReplaceOldViewInParent().invoke(viewGroup, viewBuildView);
        this.actual = viewBuildView;
        return viewBuildView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: update$lambda-4, reason: not valid java name */
    public static final void m26830update$lambda4(View view, Function0 doStart) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(doStart, "doStart");
        WorkflowLifecycleOwner.Companion.installOn$default(WorkflowLifecycleOwner.INSTANCE, view, null, 2, null);
        doStart.invoke();
    }

    private final void propagateSavedStateRegistryOwner(View newView) {
        SavedStateRegistryOwner savedStateRegistryOwner = ViewTreeSavedStateRegistryOwner.get(this);
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (savedStateRegistryOwner != (viewGroup != null ? ViewTreeSavedStateRegistryOwner.get(viewGroup) : null)) {
            ViewTreeSavedStateRegistryOwner.set(newView, savedStateRegistryOwner);
        }
    }
}

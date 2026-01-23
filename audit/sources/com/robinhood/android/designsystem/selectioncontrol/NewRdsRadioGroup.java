package com.robinhood.android.designsystem.selectioncontrol;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewGroup2;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.selectioncontrol.NewRdsRadioGroup;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NewRdsRadioGroup.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001+B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\b\u001a\u00020\t2\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bJ\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\tH\u0014J$\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\t2\b\b\u0001\u0010\"\u001a\u00020\fJ\u0018\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0014H\u0002J\u0006\u0010&\u001a\u00020\tJ\b\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0014H\u0016R$\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00060\u0016R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/designsystem/selectioncontrol/NewRdsRadioGroup;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onCheckedChange", "", "listener", "Lkotlin/Function2;", "", "value", "checkedId", "getCheckedId", "()I", "setCheckedId", "(I)V", "protectFromCheckedChange", "", "passThroughListener", "Lcom/robinhood/android/designsystem/selectioncontrol/NewRdsRadioGroup$PassThroughHierarchyChangeListener;", "onCheckedChangeListener", "setOnHierarchyChangeListener", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "onFinishInflate", "addView", "child", "Landroid/view/View;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "params", "Landroid/view/ViewGroup$LayoutParams;", "check", "id", "setCheckedStateForView", "viewId", "checked", "clearCheck", "getAccessibilityClassName", "", "setEnabled", "enabled", "PassThroughHierarchyChangeListener", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class NewRdsRadioGroup extends LinearLayoutCompat {
    private int checkedId;
    private Function2<? super NewRdsRadioGroup, ? super Integer, Unit> onCheckedChangeListener;
    private final PassThroughHierarchyChangeListener passThroughListener;
    private boolean protectFromCheckedChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewRdsRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.checkedId = -1;
        PassThroughHierarchyChangeListener passThroughHierarchyChangeListener = new PassThroughHierarchyChangeListener();
        this.passThroughListener = passThroughHierarchyChangeListener;
        super.setOnHierarchyChangeListener(passThroughHierarchyChangeListener);
        int[] RdsRadioGroup = C13997R.styleable.RdsRadioGroup;
        Intrinsics.checkNotNullExpressionValue(RdsRadioGroup, "RdsRadioGroup");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsRadioGroup, 0, 0);
        setCheckedId(typedArrayObtainStyledAttributes.getResourceId(C13997R.styleable.RdsRadioGroup_android_checkedButton, -1));
        setOrientation(typedArrayObtainStyledAttributes.getInt(C13997R.styleable.RdsRadioGroup_android_orientation, 1));
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsRadioGroup_android_enabled, isEnabled()));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void onCheckedChange(Function2<? super NewRdsRadioGroup, ? super Integer, Unit> listener) {
        this.onCheckedChangeListener = listener;
    }

    public final int getCheckedId() {
        return this.checkedId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCheckedId(int i) {
        this.checkedId = i;
        Function2<? super NewRdsRadioGroup, ? super Integer, Unit> function2 = this.onCheckedChangeListener;
        if (function2 != null) {
            function2.invoke(this, Integer.valueOf(i));
        }
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.passThroughListener.setOnHierarchyChangeListener(listener);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i = this.checkedId;
        if (i != -1) {
            this.protectFromCheckedChange = true;
            setCheckedStateForView(i, true);
            this.protectFromCheckedChange = false;
            setCheckedId(this.checkedId);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (child instanceof RdsRadioButtonRowView) {
            RdsRadioButtonRowView rdsRadioButtonRowView = (RdsRadioButtonRowView) child;
            if (rdsRadioButtonRowView.isChecked()) {
                this.protectFromCheckedChange = true;
                int i = this.checkedId;
                if (i != -1) {
                    setCheckedStateForView(i, false);
                }
                this.protectFromCheckedChange = false;
                setCheckedId(rdsRadioButtonRowView.getId());
            }
            rdsRadioButtonRowView.setEnabled(isEnabled());
        }
        super.addView(child, index, params);
    }

    public final void check(int id) {
        if (id == -1 || id != this.checkedId) {
            int i = this.checkedId;
            if (i != -1) {
                setCheckedStateForView(i, false);
            }
            if (id != -1) {
                setCheckedStateForView(id, true);
            }
            setCheckedId(id);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCheckedStateForView(int viewId, boolean checked) {
        View viewFindViewById = findViewById(viewId);
        RdsRadioButtonRowView rdsRadioButtonRowView = viewFindViewById instanceof RdsRadioButtonRowView ? (RdsRadioButtonRowView) viewFindViewById : null;
        if (rdsRadioButtonRowView != null) {
            rdsRadioButtonRowView.setChecked(checked);
        }
    }

    public final void clearCheck() {
        check(-1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        String name = RadioGroup.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        for (View view : ViewGroup2.getChildren(this)) {
            if (view instanceof RdsRadioButtonRowView) {
                ((RdsRadioButtonRowView) view).setEnabled(enabled);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NewRdsRadioGroup.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/designsystem/selectioncontrol/NewRdsRadioGroup$PassThroughHierarchyChangeListener;", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "<init>", "(Lcom/robinhood/android/designsystem/selectioncontrol/NewRdsRadioGroup;)V", "onHierarchyChangeListener", "getOnHierarchyChangeListener", "()Landroid/view/ViewGroup$OnHierarchyChangeListener;", "setOnHierarchyChangeListener", "(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V", "onChildViewAdded", "", "parent", "Landroid/view/View;", "child", "onChildViewRemoved", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    final class PassThroughHierarchyChangeListener implements ViewGroup.OnHierarchyChangeListener {
        private ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener;

        public PassThroughHierarchyChangeListener() {
        }

        public final ViewGroup.OnHierarchyChangeListener getOnHierarchyChangeListener() {
            return this.onHierarchyChangeListener;
        }

        public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
            this.onHierarchyChangeListener = onHierarchyChangeListener;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View parent, View child) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(child, "child");
            if (parent == NewRdsRadioGroup.this && (child instanceof RdsRadioButtonRowView)) {
                if (child.getId() == -1) {
                    child.setId(View.generateViewId());
                }
                final NewRdsRadioGroup newRdsRadioGroup = NewRdsRadioGroup.this;
                ((RdsRadioButtonRowView) child).onCheckedChange(new Function2() { // from class: com.robinhood.android.designsystem.selectioncontrol.NewRdsRadioGroup$PassThroughHierarchyChangeListener$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return NewRdsRadioGroup.PassThroughHierarchyChangeListener.onChildViewAdded$lambda$0(newRdsRadioGroup, (RdsSelectionRowView) obj, ((Boolean) obj2).booleanValue());
                    }
                });
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.onHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(parent, child);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onChildViewAdded$lambda$0(NewRdsRadioGroup newRdsRadioGroup, RdsSelectionRowView radioButtonRow, boolean z) {
            Intrinsics.checkNotNullParameter(radioButtonRow, "radioButtonRow");
            if (!newRdsRadioGroup.protectFromCheckedChange) {
                newRdsRadioGroup.protectFromCheckedChange = true;
                if (newRdsRadioGroup.getCheckedId() != -1) {
                    newRdsRadioGroup.setCheckedStateForView(newRdsRadioGroup.getCheckedId(), false);
                }
                newRdsRadioGroup.protectFromCheckedChange = false;
                newRdsRadioGroup.setCheckedId(radioButtonRow.getId());
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View parent, View child) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(child, "child");
            if (parent == NewRdsRadioGroup.this && (child instanceof RdsRadioButtonRowView)) {
                ((RdsRadioButtonRowView) child).onCheckedChange(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.onHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(parent, child);
            }
        }
    }
}

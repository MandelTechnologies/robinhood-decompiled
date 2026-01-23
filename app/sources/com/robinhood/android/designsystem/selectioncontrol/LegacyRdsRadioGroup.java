package com.robinhood.android.designsystem.selectioncontrol;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.RadioGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioButton;
import com.robinhood.android.linking.MobileLinkingDeeplinkConstants;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LegacyRdsRadioGroup.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0003234B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u001b\u001a\u00020\u001cH\u0014J$\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0012\u0010#\u001a\u00020\u001c2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020'H\u0016J\u0006\u0010(\u001a\u00020\u001cJ\u0010\u0010)\u001a\u00020\u001c2\b\b\u0001\u0010*\u001a\u00020\u000fJ%\u0010+\u001a\u00020\u001c2\u001d\u0010,\u001a\u0019\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001c0-¢\u0006\u0002\b.J\u001a\u0010/\u001a\u00020\u001c2\b\b\u0001\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u001aH\u0002R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u00060\u0016R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00060\u0018R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioGroup;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onCheckedChangeListener", "Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioGroup$OnCheckedChangeListener;", "getOnCheckedChangeListener", "()Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioGroup$OnCheckedChangeListener;", "setOnCheckedChangeListener", "(Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioGroup$OnCheckedChangeListener;)V", "value", "", "checkedId", "getCheckedId", "()I", "setCheckedId", "(I)V", "childOnCheckedChangeListener", "Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioGroup$CheckedStateTracker;", "passThroughListener", "Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioGroup$PassThroughHierarchyChangeListener;", "protectFromCheckedChange", "", "onFinishInflate", "", "addView", "child", "Landroid/view/View;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "params", "Landroid/view/ViewGroup$LayoutParams;", "setOnHierarchyChangeListener", "listener", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "getAccessibilityClassName", "", "clearCheck", "check", "id", "onCheckedChanged", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "setCheckedStateForView", "viewId", "checked", "OnCheckedChangeListener", "PassThroughHierarchyChangeListener", "CheckedStateTracker", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class LegacyRdsRadioGroup extends LinearLayoutCompat {
    private int checkedId;
    private final CheckedStateTracker childOnCheckedChangeListener;
    private OnCheckedChangeListener onCheckedChangeListener;
    private final PassThroughHierarchyChangeListener passThroughListener;
    private boolean protectFromCheckedChange;

    /* compiled from: LegacyRdsRadioGroup.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioGroup$OnCheckedChangeListener;", "", "onCheckedChanged", "", MobileLinkingDeeplinkConstants.group_id_param, "Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioGroup;", "checkedId", "", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface OnCheckedChangeListener {
        void onCheckedChanged(LegacyRdsRadioGroup group, int checkedId);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyRdsRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.checkedId = -1;
        this.childOnCheckedChangeListener = new CheckedStateTracker();
        PassThroughHierarchyChangeListener passThroughHierarchyChangeListener = new PassThroughHierarchyChangeListener();
        this.passThroughListener = passThroughHierarchyChangeListener;
        super.setOnHierarchyChangeListener(passThroughHierarchyChangeListener);
        int[] RdsRadioGroup = C13997R.styleable.RdsRadioGroup;
        Intrinsics.checkNotNullExpressionValue(RdsRadioGroup, "RdsRadioGroup");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsRadioGroup, 0, 0);
        setCheckedId(typedArrayObtainStyledAttributes.getResourceId(C13997R.styleable.RdsRadioGroup_android_checkedButton, -1));
        setOrientation(typedArrayObtainStyledAttributes.getInt(C13997R.styleable.RdsRadioGroup_android_orientation, 1));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final OnCheckedChangeListener getOnCheckedChangeListener() {
        return this.onCheckedChangeListener;
    }

    public final void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }

    public final int getCheckedId() {
        return this.checkedId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCheckedId(int i) {
        this.checkedId = i;
        OnCheckedChangeListener onCheckedChangeListener = this.onCheckedChangeListener;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(this, i);
        }
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if ((child instanceof Checkable) && ((Checkable) child).isChecked()) {
            this.protectFromCheckedChange = true;
            int i = this.checkedId;
            if (i != -1) {
                setCheckedStateForView(i, false);
            }
            this.protectFromCheckedChange = false;
            setCheckedId(child.getId());
        }
        super.addView(child, index, params);
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener listener) {
        this.passThroughListener.setOnHierarchyChangeListener(listener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        String name = RadioGroup.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    public final void clearCheck() {
        check(-1);
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

    public final void onCheckedChanged(final Function2<? super LegacyRdsRadioGroup, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.onCheckedChangeListener = new OnCheckedChangeListener() { // from class: com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioGroup.onCheckedChanged.1
            @Override // com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioGroup.OnCheckedChangeListener
            public void onCheckedChanged(LegacyRdsRadioGroup group, int checkedId) {
                Intrinsics.checkNotNullParameter(group, "group");
                block.invoke(group, Integer.valueOf(checkedId));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCheckedStateForView(int viewId, boolean checked) {
        KeyEvent.Callback callbackFindViewById = findViewById(viewId);
        Checkable checkable = callbackFindViewById instanceof Checkable ? (Checkable) callbackFindViewById : null;
        if (checkable != null) {
            checkable.setChecked(checked);
        }
    }

    /* compiled from: LegacyRdsRadioGroup.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioGroup$PassThroughHierarchyChangeListener;", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "<init>", "(Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioGroup;)V", "onHierarchyChangeListener", "getOnHierarchyChangeListener", "()Landroid/view/ViewGroup$OnHierarchyChangeListener;", "setOnHierarchyChangeListener", "(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V", "onChildViewAdded", "", "parent", "Landroid/view/View;", "child", "onChildViewRemoved", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private final class PassThroughHierarchyChangeListener implements ViewGroup.OnHierarchyChangeListener {
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
            if (parent == LegacyRdsRadioGroup.this && (child instanceof LegacyRdsRadioButton)) {
                if (child.getId() == -1) {
                    child.setId(View.generateViewId());
                }
                ((LegacyRdsRadioButton) child).setOnCheckedChangeListener(LegacyRdsRadioGroup.this.childOnCheckedChangeListener);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.onHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(parent, child);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View parent, View child) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(child, "child");
            if (parent == LegacyRdsRadioGroup.this && (child instanceof LegacyRdsRadioButton)) {
                ((LegacyRdsRadioButton) child).setOnCheckedChangeListener(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.onHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(parent, child);
            }
        }
    }

    /* compiled from: LegacyRdsRadioGroup.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioGroup$CheckedStateTracker;", "Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioButton$OnCheckedChangeListener;", "<init>", "(Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioGroup;)V", "onCheckedChanged", "", "radioButton", "Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioButton;", "isChecked", "", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private final class CheckedStateTracker implements LegacyRdsRadioButton.OnCheckedChangeListener {
        public CheckedStateTracker() {
        }

        @Override // com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioButton.OnCheckedChangeListener
        public void onCheckedChanged(LegacyRdsRadioButton radioButton, boolean isChecked) {
            Intrinsics.checkNotNullParameter(radioButton, "radioButton");
            if (LegacyRdsRadioGroup.this.protectFromCheckedChange) {
                return;
            }
            LegacyRdsRadioGroup.this.protectFromCheckedChange = true;
            if (LegacyRdsRadioGroup.this.getCheckedId() != -1) {
                LegacyRdsRadioGroup legacyRdsRadioGroup = LegacyRdsRadioGroup.this;
                legacyRdsRadioGroup.setCheckedStateForView(legacyRdsRadioGroup.getCheckedId(), false);
            }
            LegacyRdsRadioGroup.this.protectFromCheckedChange = false;
            LegacyRdsRadioGroup.this.setCheckedId(radioButton.getId());
        }
    }
}

package com.robinhood.android.designsystem.accordion;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.utils.extensions.TypedArrays3;
import com.robinhood.utils.extensions.ViewsKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RdsAccordionRowView.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001@B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0004J\u0006\u0010\u0018\u001a\u00020\u000fJ\b\u0010\u0019\u001a\u00020\u000fH\u0015J\b\u0010\u001a\u001a\u00020\u000fH\u0002J\u0012\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0013H\u0016J\b\u0010 \u001a\u00020\u0013H\u0017Jg\u0010!\u001a\u00020\u000f2\b\u0010\"\u001a\u0004\u0018\u00010\u00112\b\u0010#\u001a\u0004\u0018\u00010\u00112\b\u0010$\u001a\u0004\u0018\u00010\u00112\b\u0010%\u001a\u0004\u0018\u00010\u00112\b\u0010&\u001a\u0004\u0018\u00010\u00112\b\u0010'\u001a\u0004\u0018\u00010\u00112\b\u0010(\u001a\u0004\u0018\u00010\u00112\b\u0010)\u001a\u0004\u0018\u00010\u00112\b\u0010*\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0002\u0010+J(\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u0011H\u0016J(\u00101\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u00112\u0006\u00103\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u0011H\u0016J\b\u00104\u001a\u00020\u0011H\u0016J\b\u00105\u001a\u00020\u0011H\u0016J\b\u00106\u001a\u00020\u0011H\u0016J\b\u00107\u001a\u00020\u0011H\u0016J\b\u00108\u001a\u00020\u0011H\u0016J\b\u00109\u001a\u00020\u0011H\u0016J\b\u0010:\u001a\u00020\u0013H\u0016J\b\u0010;\u001a\u00020<H\u0014J\u0012\u0010=\u001a\u00020\u000f2\b\u0010>\u001a\u0004\u0018\u00010<H\u0014R\u001a\u0010\b\u001a\u00020\tX\u0084\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010?\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, m3636d2 = {"Lcom/robinhood/android/designsystem/accordion/RdsAccordionRowView;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bodyLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getBodyLayout$annotations", "()V", "getBodyLayout", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "inflateAccordionBody", "", "resId", "", "value", "", "isExpanded", "()Z", "setExpanded", "(Z)V", AnalyticsStrings.BUTTON_FRIDAY_TRADING_SETTING_TOGGLE, "onExpandedStateChanged", "refreshExpandedState", "setOnClickListener", "listener", "Landroid/view/View$OnClickListener;", "setClickable", "clickable", "performClick", "initPaddings", "padding", "paddingHorizontal", "paddingVertical", "paddingLeft", "paddingTop", "paddingRight", "paddingBottom", "paddingStart", "paddingEnd", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "setPadding", "left", "top", "right", "bottom", "setPaddingRelative", "start", "end", "getPaddingTop", "getPaddingBottom", "getPaddingLeft", "getPaddingStart", "getPaddingRight", "getPaddingEnd", "isPaddingRelative", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "isInitialized", "SavedState", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class RdsAccordionRowView extends RdsRowView {
    private final ConstraintLayout bodyLayout;
    private boolean isExpanded;
    private boolean isInitialized;

    protected static /* synthetic */ void getBodyLayout$annotations() {
    }

    protected void onExpandedStateChanged() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsAccordionRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getRowContainerLayout().getContext(), C13997R.layout.merge_rds_accordion_body_layout, getRowContainerLayout());
        ConstraintLayout constraintLayout = (ConstraintLayout) getRowContainerLayout().findViewById(C13997R.id.accordion_body_layout);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "run(...)");
        this.bodyLayout = constraintLayout;
        int[] RdsAccordionRowView = C13997R.styleable.RdsAccordionRowView;
        Intrinsics.checkNotNullExpressionValue(RdsAccordionRowView, "RdsAccordionRowView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsAccordionRowView, 0, 0);
        initPaddings(TypedArrays3.getDimensionPixelSizeOrNull(typedArrayObtainStyledAttributes, C13997R.styleable.RdsAccordionRowView_android_padding), TypedArrays3.getDimensionPixelSizeOrNull(typedArrayObtainStyledAttributes, C13997R.styleable.RdsAccordionRowView_android_paddingHorizontal), TypedArrays3.getDimensionPixelSizeOrNull(typedArrayObtainStyledAttributes, C13997R.styleable.RdsAccordionRowView_android_paddingVertical), TypedArrays3.getDimensionPixelSizeOrNull(typedArrayObtainStyledAttributes, C13997R.styleable.RdsAccordionRowView_android_paddingLeft), TypedArrays3.getDimensionPixelSizeOrNull(typedArrayObtainStyledAttributes, C13997R.styleable.RdsAccordionRowView_android_paddingTop), TypedArrays3.getDimensionPixelSizeOrNull(typedArrayObtainStyledAttributes, C13997R.styleable.RdsAccordionRowView_android_paddingRight), TypedArrays3.getDimensionPixelSizeOrNull(typedArrayObtainStyledAttributes, C13997R.styleable.RdsAccordionRowView_android_paddingBottom), TypedArrays3.getDimensionPixelSizeOrNull(typedArrayObtainStyledAttributes, C13997R.styleable.RdsAccordionRowView_android_paddingStart), TypedArrays3.getDimensionPixelSizeOrNull(typedArrayObtainStyledAttributes, C13997R.styleable.RdsAccordionRowView_android_paddingEnd));
        setExpanded(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsAccordionRowView_expanded, false));
        typedArrayObtainStyledAttributes.recycle();
        setClickable(true);
        setFocusable(true);
        refreshExpandedState();
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegateCompat() { // from class: com.robinhood.android.designsystem.accordion.RdsAccordionRowView.2
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
                int i;
                int i2;
                Object next;
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                if (RdsAccordionRowView.this.getIsExpanded()) {
                    i = C13997R.string.rds_accordion_row_state_description_expanded;
                    i2 = C13997R.string.rds_accordion_row_click_action_label_collapse;
                } else {
                    i = C13997R.string.rds_accordion_row_state_description_collapsed;
                    i2 = C13997R.string.rds_accordion_row_click_action_label_expand;
                }
                info.setStateDescription(ViewsKt.getString(RdsAccordionRowView.this, i));
                List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actionList = info.getActionList();
                Intrinsics.checkNotNullExpressionValue(actionList, "getActionList(...)");
                Iterator<T> it = actionList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (((AccessibilityNodeInfoCompat.AccessibilityActionCompat) next).getId() == 16) {
                            break;
                        }
                    }
                }
                AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = (AccessibilityNodeInfoCompat.AccessibilityActionCompat) next;
                if (accessibilityActionCompat != null) {
                    info.removeAction(accessibilityActionCompat);
                }
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, ViewsKt.getString(RdsAccordionRowView.this, i2)));
            }
        });
        ViewCompat.setAccessibilityDelegate(constraintLayout, new AccessibilityDelegateCompat() { // from class: com.robinhood.android.designsystem.accordion.RdsAccordionRowView.3
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
                Object next;
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actionList = info.getActionList();
                Intrinsics.checkNotNullExpressionValue(actionList, "getActionList(...)");
                Iterator<T> it = actionList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (((AccessibilityNodeInfoCompat.AccessibilityActionCompat) next).getId() == 16) {
                            break;
                        }
                    }
                }
                AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = (AccessibilityNodeInfoCompat.AccessibilityActionCompat) next;
                if (accessibilityActionCompat != null) {
                    info.removeAction(accessibilityActionCompat);
                }
                info.setClickable(false);
            }
        });
        this.isInitialized = true;
    }

    protected final ConstraintLayout getBodyLayout() {
        return this.bodyLayout;
    }

    protected final void inflateAccordionBody(int resId) {
        View.inflate(this.bodyLayout.getContext(), resId, this.bodyLayout);
    }

    /* renamed from: isExpanded, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public final void setExpanded(boolean z) {
        if (this.isExpanded != z) {
            this.isExpanded = z;
            refreshExpandedState();
            if (this.isInitialized) {
                onExpandedStateChanged();
            }
        }
    }

    public final void toggle() {
        setExpanded(!this.isExpanded);
    }

    private final void refreshExpandedState() {
        if (this.isExpanded) {
            setCaret(RdsRowView.Caret.f4106UP);
            this.bodyLayout.setVisibility(0);
        } else {
            setCaret(RdsRowView.Caret.DOWN);
            this.bodyLayout.setVisibility(8);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener listener) {
        if (listener != null) {
            throw new UnsupportedOperationException("Accordion rows cannot have custom click handling.");
        }
        super.setOnClickListener(listener);
    }

    @Override // android.view.View
    public void setClickable(boolean clickable) {
        if (!clickable) {
            throw new UnsupportedOperationException("Accordion rows must always be clickable.");
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean performClick() {
        playSoundEffect(0);
        sendAccessibilityEvent(1);
        toggle();
        return true;
    }

    private final void initPaddings(Integer padding, Integer paddingHorizontal, Integer paddingVertical, Integer paddingLeft, Integer paddingTop, Integer paddingRight, Integer paddingBottom, Integer paddingStart, Integer paddingEnd) {
        super.setPadding(0, 0, 0, 0);
        if (padding != null && padding.intValue() >= 0) {
            int iIntValue = padding.intValue();
            setPadding(iIntValue, iIntValue, iIntValue, iIntValue);
            return;
        }
        int iIntValue2 = paddingLeft != null ? paddingLeft.intValue() : 0;
        int iIntValue3 = paddingTop != null ? paddingTop.intValue() : 0;
        int iIntValue4 = paddingRight != null ? paddingRight.intValue() : 0;
        int iIntValue5 = paddingBottom != null ? paddingBottom.intValue() : 0;
        if (paddingHorizontal != null && paddingHorizontal.intValue() >= 0) {
            iIntValue2 = paddingHorizontal.intValue();
            iIntValue4 = paddingHorizontal.intValue();
        }
        if (paddingVertical != null && paddingVertical.intValue() >= 0) {
            iIntValue3 = paddingVertical.intValue();
            iIntValue5 = paddingVertical.intValue();
        }
        if (paddingStart != null && paddingStart.intValue() >= 0) {
            if (getLayoutDirection() == 0) {
                iIntValue2 = paddingStart.intValue();
            } else {
                iIntValue4 = paddingStart.intValue();
            }
        }
        if (paddingEnd != null && paddingEnd.intValue() >= 0) {
            if (getLayoutDirection() == 0) {
                iIntValue4 = paddingEnd.intValue();
            } else {
                iIntValue2 = paddingEnd.intValue();
            }
        }
        setPadding(iIntValue2, iIntValue3, iIntValue4, iIntValue5);
    }

    @Override // android.view.View
    public void setPadding(int left, int top, int right, int bottom) {
        getRowContentLayout().setPadding(left, top, right, bottom);
        View divider = getDivider();
        ViewGroup.LayoutParams layoutParams = getDivider().getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(left, 0, right, 0);
        divider.setLayoutParams(layoutParams2);
    }

    @Override // android.view.View
    public void setPaddingRelative(int start, int top, int end, int bottom) {
        getRowContentLayout().setPaddingRelative(start, top, end, bottom);
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return getRowContentLayout().getPaddingTop();
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return getRowContentLayout().getPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return getRowContentLayout().getPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return getRowContentLayout().getPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return getRowContentLayout().getPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return getRowContentLayout().getPaddingEnd();
    }

    @Override // android.view.View
    public boolean isPaddingRelative() {
        return getRowContentLayout().isPaddingRelative();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.isExpanded);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNull(state, "null cannot be cast to non-null type com.robinhood.android.designsystem.accordion.RdsAccordionRowView.SavedState");
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        setExpanded(savedState.isExpanded());
    }

    /* compiled from: RdsAccordionRowView.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\t¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/designsystem/accordion/RdsAccordionRowView$SavedState;", "Landroid/os/Parcelable;", "superState", "isExpanded", "", "<init>", "(Landroid/os/Parcelable;Z)V", "getSuperState", "()Landroid/os/Parcelable;", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final /* data */ class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Creator();
        private final boolean isExpanded;
        private final Parcelable superState;

        /* compiled from: RdsAccordionRowView.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavedState(parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public static /* synthetic */ SavedState copy$default(SavedState savedState, Parcelable parcelable, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                parcelable = savedState.superState;
            }
            if ((i & 2) != 0) {
                z = savedState.isExpanded;
            }
            return savedState.copy(parcelable, z);
        }

        /* renamed from: component1, reason: from getter */
        public final Parcelable getSuperState() {
            return this.superState;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsExpanded() {
            return this.isExpanded;
        }

        public final SavedState copy(Parcelable superState, boolean isExpanded) {
            return new SavedState(superState, isExpanded);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SavedState)) {
                return false;
            }
            SavedState savedState = (SavedState) other;
            return Intrinsics.areEqual(this.superState, savedState.superState) && this.isExpanded == savedState.isExpanded;
        }

        public int hashCode() {
            Parcelable parcelable = this.superState;
            return ((parcelable == null ? 0 : parcelable.hashCode()) * 31) + Boolean.hashCode(this.isExpanded);
        }

        public String toString() {
            return "SavedState(superState=" + this.superState + ", isExpanded=" + this.isExpanded + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.superState, flags);
            dest.writeInt(this.isExpanded ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, boolean z) {
            this.superState = parcelable;
            this.isExpanded = z;
        }

        public final Parcelable getSuperState() {
            return this.superState;
        }

        public final boolean isExpanded() {
            return this.isExpanded;
        }
    }
}

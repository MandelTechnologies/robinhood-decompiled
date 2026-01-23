package com.robinhood.android.cart;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.robinhood.android.cart.CartRowView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.utils.extensions.TypedArrays3;
import com.robinhood.utils.extensions.ViewsKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CartAccordionRowView.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0004J\b\u0010&\u001a\u00020\u000fH\u0016J\b\u0010'\u001a\u00020\u000fH\u0002J\u0012\u0010(\u001a\u00020\u000f2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010+\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u0013H\u0016J\b\u0010-\u001a\u00020\u0013H\u0017Jg\u0010.\u001a\u00020\u000f2\b\u0010/\u001a\u0004\u0018\u00010\u00112\b\u00100\u001a\u0004\u0018\u00010\u00112\b\u00101\u001a\u0004\u0018\u00010\u00112\b\u00102\u001a\u0004\u0018\u00010\u00112\b\u00103\u001a\u0004\u0018\u00010\u00112\b\u00104\u001a\u0004\u0018\u00010\u00112\b\u00105\u001a\u0004\u0018\u00010\u00112\b\u00106\u001a\u0004\u0018\u00010\u00112\b\u00107\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0002\u00108J(\u00109\u001a\u00020\u000f2\u0006\u0010:\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u00112\u0006\u0010<\u001a\u00020\u00112\u0006\u0010=\u001a\u00020\u0011H\u0016J(\u0010>\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\u00112\u0006\u0010=\u001a\u00020\u0011H\u0016J\b\u0010A\u001a\u00020\u0011H\u0016J\b\u0010B\u001a\u00020\u0011H\u0016J\b\u0010C\u001a\u00020\u0011H\u0016J\b\u0010D\u001a\u00020\u0011H\u0016J\b\u0010E\u001a\u00020\u0011H\u0016J\b\u0010F\u001a\u00020\u0011H\u0016J\b\u0010G\u001a\u00020\u0013H\u0016R\u001a\u0010\b\u001a\u00020\tX\u0084\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0012\u001a\u0004\u0018\u00010\u0018@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010\u001e\u001a\u0004\u0018\u00010\u00182\b\u0010\u0012\u001a\u0004\u0018\u00010\u0018@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR$\u0010!\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017R&\u0010#\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017¨\u0006H"}, m3636d2 = {"Lcom/robinhood/android/cart/CartAccordionRowView;", "Lcom/robinhood/android/cart/CartRowView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bodyLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getBodyLayout$annotations", "()V", "getBodyLayout", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "inflateAccordionBody", "", "resId", "", "value", "", "isExpanded", "()Z", "setExpanded", "(Z)V", "", "secondaryTextExpanded", "getSecondaryTextExpanded", "()Ljava/lang/CharSequence;", "setSecondaryTextExpanded", "(Ljava/lang/CharSequence;)V", "secondaryTextCollapsed", "getSecondaryTextCollapsed", "setSecondaryTextCollapsed", "isExpandable", "setExpandable", "caretVisible", "getCaretVisible", "setCaretVisible", "toggleExpanded", "refreshExpandedState", "setOnClickListener", "listener", "Landroid/view/View$OnClickListener;", "setClickable", "clickable", "performClick", "initPaddings", "padding", "paddingHorizontal", "paddingVertical", "paddingLeft", "paddingTop", "paddingRight", "paddingBottom", "paddingStart", "paddingEnd", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "setPadding", "left", "top", "right", "bottom", "setPaddingRelative", "start", "end", "getPaddingTop", "getPaddingBottom", "getPaddingLeft", "getPaddingStart", "getPaddingRight", "getPaddingEnd", "isPaddingRelative", "lib-cart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public class CartAccordionRowView extends CartRowView {
    private final ConstraintLayout bodyLayout;
    private boolean caretVisible;
    private boolean isExpandable;
    private boolean isExpanded;
    private CharSequence secondaryTextCollapsed;
    private CharSequence secondaryTextExpanded;

    protected static /* synthetic */ void getBodyLayout$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartAccordionRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getRowContainerLayout().getContext(), C9955R.layout.merge_cart_accordion_body_layout, getRowContainerLayout());
        ConstraintLayout constraintLayout = (ConstraintLayout) getRowContainerLayout().findViewById(C9955R.id.cart_accordion_body_layout);
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
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegateCompat() { // from class: com.robinhood.android.cart.CartAccordionRowView.2
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
                int i;
                int i2;
                Object next;
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                if (CartAccordionRowView.this.getIsExpanded()) {
                    i = C13997R.string.rds_accordion_row_state_description_expanded;
                    i2 = C13997R.string.rds_accordion_row_click_action_label_collapse;
                } else {
                    i = C13997R.string.rds_accordion_row_state_description_collapsed;
                    i2 = C13997R.string.rds_accordion_row_click_action_label_expand;
                }
                info.setStateDescription(ViewsKt.getString(CartAccordionRowView.this, i));
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
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, ViewsKt.getString(CartAccordionRowView.this, i2)));
            }
        });
        ViewCompat.setAccessibilityDelegate(constraintLayout, new AccessibilityDelegateCompat() { // from class: com.robinhood.android.cart.CartAccordionRowView.3
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
        }
    }

    public final CharSequence getSecondaryTextExpanded() {
        return this.secondaryTextExpanded;
    }

    public final void setSecondaryTextExpanded(CharSequence charSequence) {
        this.secondaryTextExpanded = charSequence;
        if (this.isExpanded) {
            getTextViewSecondary().setText(charSequence);
        }
    }

    public final CharSequence getSecondaryTextCollapsed() {
        return this.secondaryTextCollapsed;
    }

    public final void setSecondaryTextCollapsed(CharSequence charSequence) {
        this.secondaryTextCollapsed = charSequence;
        if (this.isExpanded) {
            return;
        }
        getTextViewSecondary().setText(charSequence);
    }

    /* renamed from: isExpandable, reason: from getter */
    public final boolean getIsExpandable() {
        return this.isExpandable;
    }

    public final void setExpandable(boolean z) {
        this.isExpandable = z;
        if (z) {
            getTextViewSecondary().setText(this.isExpanded ? this.secondaryTextExpanded : this.secondaryTextCollapsed);
        }
    }

    public final boolean getCaretVisible() {
        return getCaretViewStubHolder$lib_cart_externalDebug().get().getVisibility() == 0;
    }

    public final void setCaretVisible(boolean z) {
        this.caretVisible = z;
        ((ImageView) getCaretViewStubHolder$lib_cart_externalDebug().get()).setVisibility(z ? 0 : 8);
    }

    public void toggleExpanded() {
        setExpanded(!this.isExpanded);
    }

    private final void refreshExpandedState() {
        if (this.isExpanded) {
            setCaret(getCaretVisible() ? CartRowView.Caret.DOWN : null);
            this.bodyLayout.setVisibility(0);
            setSecondaryText(this.secondaryTextExpanded);
        } else {
            setCaret(getCaretVisible() ? CartRowView.Caret.f3933UP : null);
            this.bodyLayout.setVisibility(8);
            setSecondaryText(this.secondaryTextCollapsed);
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
        toggleExpanded();
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
}

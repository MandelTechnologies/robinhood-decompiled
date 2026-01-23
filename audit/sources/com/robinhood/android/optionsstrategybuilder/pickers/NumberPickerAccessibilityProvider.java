package com.robinhood.android.optionsstrategybuilder.pickers;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.Button;
import com.robinhood.utils.extensions.ContextSystemServices;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: NumberPickerAccessibilityProvider.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\t\b\u0007\u0018\u0000 -2\u00020\u0001:\u0002,-B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0016J\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00020\rH\u0016J!\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0002\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\rH\u0002J\"\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\rJ\"\u0010 \u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010\u0014H\u0002J&\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\r2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000f0%H\u0002J:\u0010&\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010\u00142\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\rH\u0002J(\u0010+\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pickers/NumberPickerAccessibilityProvider;", "Landroid/view/accessibility/AccessibilityNodeProvider;", "numberPicker", "Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker;", "callbacks", "Lcom/robinhood/android/optionsstrategybuilder/pickers/NumberPickerAccessibilityProvider$Callbacks;", "<init>", "(Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker;Lcom/robinhood/android/optionsstrategybuilder/pickers/NumberPickerAccessibilityProvider$Callbacks;)V", "rect", "Landroid/graphics/Rect;", "tempArray", "", "focusedView", "", "createAccessibilityNodeInfo", "Landroid/view/accessibility/AccessibilityNodeInfo;", "virtualViewId", "findAccessibilityNodeInfosByText", "", "searched", "", "performActionNoId", "", "action", "arguments", "Landroid/os/Bundle;", "(ILandroid/os/Bundle;)Ljava/lang/Boolean;", "performVirtualViewAction", "performAction", "sendAccessibilityEventForVirtualView", "", "eventType", "sendAccessibilityEventForVirtualButton", "text", "findAccessibilityNodeInfosByTextInChild", "searchedLowerCase", "outResult", "", "createAccessibilityNodeInfoForVirtualButton", "left", "top", "right", "bottom", "createAccessibilityNodeInfoForRhNumberPicker", "Callbacks", "Companion", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class NumberPickerAccessibilityProvider extends AccessibilityNodeProvider {
    private static final int UNDEFINED = Integer.MIN_VALUE;
    public static final int VIRTUAL_VIEW_ID_DECREMENT = 2;
    public static final int VIRTUAL_VIEW_ID_INCREMENT = 1;
    private final Callbacks callbacks;
    private int focusedView;
    private final RhNumberPicker numberPicker;
    private final Rect rect;
    private final int[] tempArray;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: NumberPickerAccessibilityProvider.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pickers/NumberPickerAccessibilityProvider$Callbacks;", "", "dividerTop", "", "getDividerTop", "()I", "dividerBottom", "getDividerBottom", "virtualDecrementButtonText", "", "getVirtualDecrementButtonText", "()Ljava/lang/String;", "virtualIncrementButtonText", "getVirtualIncrementButtonText", "changeValueByOne", "", "increment", "", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void changeValueByOne(boolean increment);

        int getDividerBottom();

        int getDividerTop();

        String getVirtualDecrementButtonText();

        String getVirtualIncrementButtonText();
    }

    public NumberPickerAccessibilityProvider(RhNumberPicker numberPicker, Callbacks callbacks) {
        Intrinsics.checkNotNullParameter(numberPicker, "numberPicker");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.numberPicker = numberPicker;
        this.callbacks = callbacks;
        this.rect = new Rect();
        this.tempArray = new int[2];
        this.focusedView = Integer.MIN_VALUE;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int virtualViewId) {
        RhNumberPicker rhNumberPicker = this.numberPicker;
        int right = rhNumberPicker.getRight() - rhNumberPicker.getLeft();
        int bottom = rhNumberPicker.getBottom() - rhNumberPicker.getTop();
        if (virtualViewId == -1) {
            return createAccessibilityNodeInfoForRhNumberPicker(rhNumberPicker.getScrollX(), rhNumberPicker.getScrollY(), rhNumberPicker.getScrollX() + right, rhNumberPicker.getScrollY() + bottom);
        }
        if (virtualViewId == 1) {
            return createAccessibilityNodeInfoForVirtualButton(1, this.callbacks.getVirtualIncrementButtonText(), rhNumberPicker.getScrollX(), this.callbacks.getDividerBottom() - rhNumberPicker.getSelectionDividerHeight(), rhNumberPicker.getScrollX() + right, rhNumberPicker.getScrollY() + bottom);
        }
        if (virtualViewId == 2) {
            return createAccessibilityNodeInfoForVirtualButton(2, this.callbacks.getVirtualDecrementButtonText(), rhNumberPicker.getScrollX(), rhNumberPicker.getScrollY(), rhNumberPicker.getScrollX() + right, this.callbacks.getDividerTop() + rhNumberPicker.getSelectionDividerHeight());
        }
        return super.createAccessibilityNodeInfo(virtualViewId);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String searched, int virtualViewId) {
        if (searched == null || searched.length() == 0) {
            return CollectionsKt.emptyList();
        }
        Locale locale = Locale.getDefault(Locale.Category.DISPLAY);
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = searched.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        ArrayList arrayList = new ArrayList();
        if (virtualViewId == -1) {
            findAccessibilityNodeInfosByTextInChild(lowerCase, 2, arrayList);
            findAccessibilityNodeInfosByTextInChild(lowerCase, 1, arrayList);
            return arrayList;
        }
        if (virtualViewId == 1 || virtualViewId == 2) {
            findAccessibilityNodeInfosByTextInChild(lowerCase, virtualViewId, arrayList);
            return arrayList;
        }
        return super.findAccessibilityNodeInfosByText(searched, virtualViewId);
    }

    private final Boolean performActionNoId(int action, Bundle arguments) {
        if (action == 64) {
            if (this.focusedView != -1) {
                this.focusedView = -1;
                this.numberPicker.performAccessibilityAction(action, arguments);
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        if (action == 128) {
            if (this.focusedView == -1) {
                this.focusedView = Integer.MIN_VALUE;
                this.numberPicker.performAccessibilityAction(action, arguments);
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        if (action != 4096) {
            if (action == 8192 || action == 16908344) {
                if (this.numberPicker.isEnabled() && INSTANCE.getHasVirtualDecrementButton(this.numberPicker)) {
                    this.callbacks.changeValueByOne(false);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
            if (action != 16908346) {
                return null;
            }
        }
        if (this.numberPicker.isEnabled() && INSTANCE.getHasVirtualIncrementButton(this.numberPicker)) {
            this.callbacks.changeValueByOne(true);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    private final boolean performVirtualViewAction(int virtualViewId, int action) {
        if (action != 16) {
            if (action == 64) {
                if (this.focusedView != virtualViewId) {
                    this.focusedView = virtualViewId;
                    sendAccessibilityEventForVirtualView(virtualViewId, 32768);
                    this.numberPicker.invalidate();
                    return true;
                }
            } else if (action == 128 && this.focusedView == virtualViewId) {
                this.focusedView = Integer.MIN_VALUE;
                sendAccessibilityEventForVirtualView(virtualViewId, 65536);
                this.numberPicker.invalidate();
                return true;
            }
        } else if (this.numberPicker.isEnabled()) {
            this.callbacks.changeValueByOne(virtualViewId == 1);
            sendAccessibilityEventForVirtualView(virtualViewId, 1);
            return true;
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int virtualViewId, int action, Bundle arguments) {
        if (virtualViewId == -1) {
            Boolean boolPerformActionNoId = performActionNoId(action, arguments);
            return boolPerformActionNoId != null ? boolPerformActionNoId.booleanValue() : super.performAction(virtualViewId, action, arguments);
        }
        if (virtualViewId == 1 || virtualViewId == 2) {
            return performVirtualViewAction(virtualViewId, action);
        }
        return super.performAction(virtualViewId, action, arguments);
    }

    public final void sendAccessibilityEventForVirtualView(int virtualViewId, int eventType) {
        if (virtualViewId != 1) {
            if (virtualViewId == 2 && INSTANCE.getHasVirtualDecrementButton(this.numberPicker)) {
                sendAccessibilityEventForVirtualButton(virtualViewId, eventType, this.callbacks.getVirtualDecrementButtonText());
                return;
            }
            return;
        }
        if (INSTANCE.getHasVirtualIncrementButton(this.numberPicker)) {
            sendAccessibilityEventForVirtualButton(virtualViewId, eventType, this.callbacks.getVirtualIncrementButtonText());
        }
    }

    private final void sendAccessibilityEventForVirtualButton(int virtualViewId, int eventType, String text) {
        RhNumberPicker rhNumberPicker = this.numberPicker;
        Context context = rhNumberPicker.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (ContextSystemServices.getAccessibilityManager(context).isEnabled()) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(eventType);
            accessibilityEventObtain.setClassName(Button.class.getName());
            accessibilityEventObtain.setPackageName(rhNumberPicker.getContext().getPackageName());
            accessibilityEventObtain.getText().add(text);
            accessibilityEventObtain.setEnabled(this.numberPicker.isEnabled());
            accessibilityEventObtain.setSource(this.numberPicker, virtualViewId);
            rhNumberPicker.requestSendAccessibilityEvent(this.numberPicker, accessibilityEventObtain);
        }
    }

    private final void findAccessibilityNodeInfosByTextInChild(String searchedLowerCase, int virtualViewId, List<AccessibilityNodeInfo> outResult) {
        AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo;
        AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo2;
        if (virtualViewId == 1) {
            String strValueOf = String.valueOf(this.callbacks.getVirtualIncrementButtonText());
            Locale locale = Locale.getDefault(Locale.Category.DISPLAY);
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String lowerCase = strValueOf.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase.length() <= 0 || !StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) searchedLowerCase, false, 2, (Object) null) || (accessibilityNodeInfoCreateAccessibilityNodeInfo = createAccessibilityNodeInfo(1)) == null) {
                return;
            }
            outResult.add(accessibilityNodeInfoCreateAccessibilityNodeInfo);
            return;
        }
        if (virtualViewId != 2) {
            return;
        }
        String strValueOf2 = String.valueOf(this.callbacks.getVirtualDecrementButtonText());
        Locale locale2 = Locale.getDefault(Locale.Category.DISPLAY);
        Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
        String lowerCase2 = strValueOf2.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        if (lowerCase2.length() <= 0 || !StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) searchedLowerCase, false, 2, (Object) null) || (accessibilityNodeInfoCreateAccessibilityNodeInfo2 = createAccessibilityNodeInfo(2)) == null) {
            return;
        }
        outResult.add(accessibilityNodeInfoCreateAccessibilityNodeInfo2);
    }

    private final AccessibilityNodeInfo createAccessibilityNodeInfoForVirtualButton(int virtualViewId, String text, int left, int top, int right, int bottom) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        accessibilityNodeInfoObtain.setClassName(Button.class.getName());
        accessibilityNodeInfoObtain.setPackageName(this.numberPicker.getContext().getPackageName());
        accessibilityNodeInfoObtain.setSource(this.numberPicker, virtualViewId);
        accessibilityNodeInfoObtain.setParent(this.numberPicker);
        accessibilityNodeInfoObtain.setText(text);
        accessibilityNodeInfoObtain.setClickable(true);
        accessibilityNodeInfoObtain.setLongClickable(true);
        accessibilityNodeInfoObtain.setEnabled(this.numberPicker.isEnabled());
        accessibilityNodeInfoObtain.setAccessibilityFocused(this.focusedView == virtualViewId);
        Rect rect = this.rect;
        rect.set(left, top, right, bottom);
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        int[] iArr = this.tempArray;
        this.numberPicker.getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        if (this.focusedView != virtualViewId) {
            accessibilityNodeInfoObtain.addAction(64);
        } else {
            accessibilityNodeInfoObtain.addAction(128);
        }
        if (this.numberPicker.isEnabled()) {
            accessibilityNodeInfoObtain.addAction(16);
        }
        Intrinsics.checkNotNullExpressionValue(accessibilityNodeInfoObtain, "apply(...)");
        return accessibilityNodeInfoObtain;
    }

    private final AccessibilityNodeInfo createAccessibilityNodeInfoForRhNumberPicker(int left, int top, int right, int bottom) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        accessibilityNodeInfoObtain.setClassName(RhNumberPicker.class.getName());
        accessibilityNodeInfoObtain.setPackageName(this.numberPicker.getContext().getPackageName());
        accessibilityNodeInfoObtain.setSource(this.numberPicker);
        Companion companion = INSTANCE;
        if (companion.getHasVirtualDecrementButton(this.numberPicker)) {
            accessibilityNodeInfoObtain.addChild(this.numberPicker, 2);
        }
        if (companion.getHasVirtualIncrementButton(this.numberPicker)) {
            accessibilityNodeInfoObtain.addChild(this.numberPicker, 1);
        }
        accessibilityNodeInfoObtain.setParent((View) this.numberPicker.getParentForAccessibility());
        accessibilityNodeInfoObtain.setEnabled(this.numberPicker.isEnabled());
        accessibilityNodeInfoObtain.setScrollable(true);
        accessibilityNodeInfoObtain.setAccessibilityFocused(this.focusedView == -1);
        Rect rect = this.rect;
        rect.set(left, top, right, bottom);
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        if (this.focusedView != -1) {
            accessibilityNodeInfoObtain.addAction(64);
        } else {
            accessibilityNodeInfoObtain.addAction(128);
        }
        if (this.numberPicker.isEnabled()) {
            if (companion.getHasVirtualIncrementButton(this.numberPicker)) {
                accessibilityNodeInfoObtain.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
                accessibilityNodeInfoObtain.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN);
            }
            if (companion.getHasVirtualDecrementButton(this.numberPicker)) {
                accessibilityNodeInfoObtain.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
                accessibilityNodeInfoObtain.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP);
            }
        }
        Intrinsics.checkNotNullExpressionValue(accessibilityNodeInfoObtain, "apply(...)");
        return accessibilityNodeInfoObtain;
    }

    /* compiled from: NumberPickerAccessibilityProvider.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\u00020\t*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u00020\t*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pickers/NumberPickerAccessibilityProvider$Companion;", "", "<init>", "()V", "UNDEFINED", "", "VIRTUAL_VIEW_ID_INCREMENT", "VIRTUAL_VIEW_ID_DECREMENT", "hasVirtualDecrementButton", "", "Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker;", "getHasVirtualDecrementButton", "(Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker;)Z", "hasVirtualIncrementButton", "getHasVirtualIncrementButton", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean getHasVirtualDecrementButton(RhNumberPicker rhNumberPicker) {
            return rhNumberPicker.getWrapSelectorWheelPreferred() || rhNumberPicker.getInternalValue() > rhNumberPicker.getMinValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean getHasVirtualIncrementButton(RhNumberPicker rhNumberPicker) {
            return rhNumberPicker.getWrapSelectorWheelPreferred() || rhNumberPicker.getInternalValue() < rhNumberPicker.getMaxValue();
        }
    }
}

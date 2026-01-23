package com.robinhood.android.optionsstrategybuilder.pickers;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.Scroller;
import androidx.appcompat.widget.AppCompatTextView;
import com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt;
import com.robinhood.android.optionsstrategybuilder.C24876R;
import com.robinhood.android.optionsstrategybuilder.pickers.NumberPickerAccessibilityProvider;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.extensions.TypedArrays3;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;

/* compiled from: RhNumberPicker.kt */
@Metadata(m3635d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u0000 Ð\u00012\u00020\u0001:\u0010É\u0001Ê\u0001Ë\u0001Ì\u0001Í\u0001Î\u0001Ï\u0001Ð\u0001B-\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0083\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u0085\u0001\u001a\u00020\u001c2\u0007\u0010\u0086\u0001\u001a\u00020\u00072\u0007\u0010\u0087\u0001\u001a\u00020\u00072\u0007\u0010\u0088\u0001\u001a\u00020\u00072\u0007\u0010\u0089\u0001\u001a\u00020\u0007H\u0014J\u001c\u0010\u008a\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u008b\u0001\u001a\u00020\u00072\u0007\u0010\u008c\u0001\u001a\u00020\u0007H\u0014J\u0013\u0010\u008d\u0001\u001a\u00020\u001c2\b\u0010\u008e\u0001\u001a\u00030\u008f\u0001H\u0016J\u0013\u0010\u0090\u0001\u001a\u00020\u001c2\b\u0010\u008e\u0001\u001a\u00030\u008f\u0001H\u0017J\u0013\u0010\u0091\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u0092\u0001\u001a\u00020=H\u0002J$\u0010\u0093\u0001\u001a\u00030\u0084\u00012\u0006\u0010A\u001a\u00020B2\u0007\u0010\u0094\u0001\u001a\u00020\u00072\u0007\u0010\u0095\u0001\u001a\u00020?H\u0002J\u0013\u0010\u0096\u0001\u001a\u00020\u001c2\b\u0010\u008e\u0001\u001a\u00030\u008f\u0001H\u0016J\u0013\u0010\u0097\u0001\u001a\u00020\u001c2\b\u0010\u008e\u0001\u001a\u00030\u0098\u0001H\u0016J$\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u001c2\b\u0010\u008e\u0001\u001a\u00030\u0098\u00012\u0007\u0010\u009a\u0001\u001a\u00020\u001cH\u0002¢\u0006\u0003\u0010\u009b\u0001J\u0013\u0010\u009c\u0001\u001a\u00020\u001c2\b\u0010\u008e\u0001\u001a\u00030\u008f\u0001H\u0016J\u0013\u0010\u009d\u0001\u001a\u00020\u001c2\b\u0010\u008e\u0001\u001a\u00030\u008f\u0001H\u0014J\u0013\u0010\u009e\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0007H\u0002J\n\u0010 \u0001\u001a\u00030\u0084\u0001H\u0016J\u001c\u0010¡\u0001\u001a\u00030\u0084\u00012\u0007\u0010¢\u0001\u001a\u00020\u00072\u0007\u0010£\u0001\u001a\u00020\u0007H\u0016J\t\u0010¤\u0001\u001a\u00020\u0007H\u0014J\t\u0010¥\u0001\u001a\u00020\u0007H\u0014J\t\u0010¦\u0001\u001a\u00020\u0007H\u0014J\t\u0010§\u0001\u001a\u00020\u0007H\u0016J\t\u0010¨\u0001\u001a\u00020\u001cH\u0016J\t\u0010©\u0001\u001a\u00020\u001cH\u0016J\t\u0010ª\u0001\u001a\u00020=H\u0014J\t\u0010«\u0001\u001a\u00020=H\u0014J\n\u0010¬\u0001\u001a\u00030\u0084\u0001H\u0014J\n\u0010\u00ad\u0001\u001a\u00030\u0084\u0001H\u0014J\n\u0010®\u0001\u001a\u00030\u0084\u0001H\u0016J\u0014\u0010¯\u0001\u001a\u00030\u0084\u00012\b\u0010°\u0001\u001a\u00030±\u0001H\u0014J\u0014\u0010²\u0001\u001a\u00030\u0084\u00012\b\u0010\u008e\u0001\u001a\u00030³\u0001H\u0016J\t\u0010O\u001a\u00030´\u0001H\u0016J\n\u0010µ\u0001\u001a\u00030\u0084\u0001H\u0002J\n\u0010¶\u0001\u001a\u00030\u0084\u0001H\u0002J\n\u0010·\u0001\u001a\u00030\u0084\u0001H\u0002J\u001c\u0010¸\u0001\u001a\u00030\u0084\u00012\u0007\u0010¹\u0001\u001a\u00020\u00072\u0007\u0010º\u0001\u001a\u00020\u001cH\u0002J\u0012\u0010»\u0001\u001a\u00020\u001c2\u0007\u0010¼\u0001\u001a\u000202H\u0002J\u0013\u0010½\u0001\u001a\u00030\u0084\u00012\u0007\u0010¾\u0001\u001a\u00020\u001cH\u0002J\u0015\u0010¿\u0001\u001a\u00030\u0084\u00012\t\u0010¼\u0001\u001a\u0004\u0018\u000102H\u0002J\u0012\u0010À\u0001\u001a\u00030\u0084\u00012\u0006\u0010G\u001a\u00020HH\u0002J\u0012\u0010Á\u0001\u001a\u00020\u00072\u0007\u0010Â\u0001\u001a\u00020\u0007H\u0002J\u0013\u0010Ã\u0001\u001a\u00030\u0084\u00012\u0007\u0010Â\u0001\u001a\u00020\u0007H\u0002J\u0011\u0010Ä\u0001\u001a\u00020+2\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J\u001c\u0010Å\u0001\u001a\u00030\u0084\u00012\u0007\u0010¾\u0001\u001a\u00020\u001c2\u0007\u0010Æ\u0001\u001a\u00020?H\u0002J\n\u0010Ç\u0001\u001a\u00030\u0084\u0001H\u0002J\t\u0010È\u0001\u001a\u00020\u001cH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u001d\u001a\u00020\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u00078G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R&\u0010 \u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00078\u0006@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u001f\u00106\u001a\u000607R\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b8\u00109R\u000e\u0010<\u001a\u00020=X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020?X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020=X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010A\u001a\u0004\u0018\u00010BX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010C\u001a\n E*\u0004\u0018\u00010D0DX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020HX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010M\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010;\u001a\u0004\bO\u0010PR\u0012\u0010R\u001a\u00060SR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010\u0015\"\u0004\bW\u0010\u0017R6\u0010Y\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010X2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010X@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010^\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010_\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010\u0015\"\u0004\ba\u0010\u0017R$\u0010b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010\u0015\"\u0004\bd\u0010\u0017R\u001c\u0010e\u001a\u0004\u0018\u00010fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u001c\u0010k\u001a\u0004\u0018\u00010lX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR(\u0010r\u001a\u0004\u0018\u00010q2\b\u0010\u0012\u001a\u0004\u0018\u00010q@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u001a\u0010w\u001a\u00020?X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R%\u0010|\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u001c@FX\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R\u0010\u0010\u0081\u0001\u001a\u00030\u0082\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006Ñ\u0001"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "styledAttributes", "Landroid/content/res/TypedArray;", "primaryTextPaint", "Landroid/text/TextPaint;", "selectorWheelItemCount", "minHeight", "selectionDividersDistance", "value", "selectionDividerHeight", "getSelectionDividerHeight", "()I", "setSelectionDividerHeight", "(I)V", "maxHeight", "minWidth", "maxWidth", "hideWheelUntilFocused", "", "primaryTextColor", "getPrimaryTextColor", "setPrimaryTextColor", "colorBackground", "getColorBackground", "setColorBackground", "selectionDivider", "Landroid/graphics/drawable/Drawable;", "virtualButtonPressedDrawable", "selectorMiddleItemIndex", "computeMaxWidth", "selectorTextGapHeight", "selectorIndexToStringCache", "Landroid/util/SparseArray;", "", "selectorIndices", "", "selectorElementHeight", "initialScrollOffset", "currentScrollOffset", "flingScroller", "Landroid/widget/Scroller;", "adjustScroller", "previousScrollerY", "hasInitializedChangeCurrentByOneFromLongPressCommand", "changeCurrentByOneFromLongPressCommand", "Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker$ChangeCurrentByOneFromLongPressCommand;", "getChangeCurrentByOneFromLongPressCommand", "()Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker$ChangeCurrentByOneFromLongPressCommand;", "changeCurrentByOneFromLongPressCommand$delegate", "Lkotlin/Lazy;", "lastDownEventY", "", "lastDownEventTime", "", "lastDownOrMoveEventY", "velocityTracker", "Landroid/view/VelocityTracker;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Landroid/view/ViewConfiguration;", "kotlin.jvm.PlatformType", "wrapSelectorWheel", "scrollState", "Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker$OnScrollListener$ScrollState;", "performClickOnTap", "topSelectionDividerTop", "bottomSelectionDividerBottom", "lastHoveredChildVirtualViewId", "accessibilityNodeProvider", "Lcom/robinhood/android/optionsstrategybuilder/pickers/NumberPickerAccessibilityProvider;", "getAccessibilityNodeProvider", "()Lcom/robinhood/android/optionsstrategybuilder/pickers/NumberPickerAccessibilityProvider;", "accessibilityNodeProvider$delegate", "pressedStateHelper", "Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker$PressedStateHelper;", "lastHandledDownDpadKeyCode", "internalValue", "getValue", "setValue", "", "displayedValues", "getDisplayedValues", "()[Ljava/lang/String;", "setDisplayedValues", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "minValue", "getMinValue", "setMinValue", "maxValue", "getMaxValue", "setMaxValue", "onValueChangeListener", "Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker$OnValueChangeListener;", "getOnValueChangeListener", "()Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker$OnValueChangeListener;", "setOnValueChangeListener", "(Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker$OnValueChangeListener;)V", "onScrollListener", "Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker$OnScrollListener;", "getOnScrollListener", "()Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker$OnScrollListener;", "setOnScrollListener", "(Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker$OnScrollListener;)V", "Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker$Formatter;", "formatter", "getFormatter", "()Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker$Formatter;", "setFormatter", "(Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker$Formatter;)V", "longPressUpdateInterval", "getLongPressUpdateInterval", "()J", "setLongPressUpdateInterval", "(J)V", "wrapSelectorWheelPreferred", "getWrapSelectorWheelPreferred", "()Z", "setWrapSelectorWheelPreferred", "(Z)V", "accessibilityCallbacks", "Lcom/robinhood/android/optionsstrategybuilder/pickers/NumberPickerAccessibilityProvider$Callbacks;", "onLayout", "", UpdatePortfolioResultsScreenKt.ChangeLoggingIdentifier, "left", "top", "right", "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onInterceptTouchEvent", "event", "Landroid/view/MotionEvent;", "onTouchEvent", "onMoveMotionEvent", "currentMoveY", "onUpMotionEvent", "eventY", "eventTime", "dispatchTouchEvent", "dispatchKeyEvent", "Landroid/view/KeyEvent;", "dispatchUpDownKeyEvent", "isDown", "(Landroid/view/KeyEvent;Z)Ljava/lang/Boolean;", "dispatchTrackballEvent", "dispatchHoverEvent", "dispatchHoverEnterEvent", "hoveredVirtualViewId", "computeScroll", "scrollBy", "x", "y", "computeVerticalScrollOffset", "computeVerticalScrollRange", "computeVerticalScrollExtent", "getSolidColor", "performClick", "performLongClick", "getTopFadingEdgeStrength", "getBottomFadingEdgeStrength", "onDetachedFromWindow", "drawableStateChanged", "jumpDrawablesToCurrentState", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onInitializeAccessibilityEvent", "Landroid/view/accessibility/AccessibilityEvent;", "Landroid/view/accessibility/AccessibilityNodeProvider;", "tryComputeMaxWidth", "updateWrapSelectorWheel", "initializeSelectorWheelIndices", "setValueInternal", "current", "notifyChange", "moveToFinalScrollerPosition", "scroller", "changeValueByOne", "increment", "onScrollerFinished", "onScrollStateChange", "getWrappedSelectorIndex", "selectorIndex", "ensureCachedScrollSelectorValue", "formatNumber", "postChangeCurrentByOneFromLongPress", "delayMillis", "removeAllCallbacks", "ensureScrollWheelAdjusted", "OnValueChangeListener", "OnScrollListener", "Formatter", "ManagedButton", "PressedState", "PressedStateHelper", "ChangeCurrentByOneFromLongPressCommand", "Companion", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class RhNumberPicker extends LinearLayout {
    private static final long DEFAULT_LONG_PRESS_UPDATE_INTERVAL = 300;
    private static final int DEFAULT_TOP_AREA_ITEM_COUNT = 1;
    private static final int SELECTOR_ADJUSTMENT_DURATION_MILLIS = 800;
    private static final int SELECTOR_MAX_FLING_VELOCITY_ADJUSTMENT = 1;
    private static final int SIZE_UNSPECIFIED = -1;
    private static final int SNAP_SCROLL_DURATION = 300;
    private static final float TOP_AND_BOTTOM_FADING_EDGE_STRENGTH = 0.9f;
    private final NumberPickerAccessibilityProvider.Callbacks accessibilityCallbacks;

    /* renamed from: accessibilityNodeProvider$delegate, reason: from kotlin metadata */
    private final Lazy accessibilityNodeProvider;
    private final Scroller adjustScroller;
    private int bottomSelectionDividerBottom;

    /* renamed from: changeCurrentByOneFromLongPressCommand$delegate, reason: from kotlin metadata */
    private final Lazy changeCurrentByOneFromLongPressCommand;
    private int colorBackground;
    private final boolean computeMaxWidth;
    private final ViewConfiguration configuration;
    private int currentScrollOffset;
    private String[] displayedValues;
    private final Scroller flingScroller;
    private Formatter formatter;
    private boolean hasInitializedChangeCurrentByOneFromLongPressCommand;
    private final boolean hideWheelUntilFocused;
    private int initialScrollOffset;
    private int internalValue;
    private long lastDownEventTime;
    private float lastDownEventY;
    private float lastDownOrMoveEventY;
    private int lastHandledDownDpadKeyCode;
    private int lastHoveredChildVirtualViewId;
    private long longPressUpdateInterval;
    private final int maxHeight;
    private int maxValue;
    private int maxWidth;
    private final int minHeight;
    private int minValue;
    private final int minWidth;
    private OnScrollListener onScrollListener;
    private OnValueChangeListener onValueChangeListener;
    private boolean performClickOnTap;
    private final PressedStateHelper pressedStateHelper;
    private int previousScrollerY;
    private final TextPaint primaryTextPaint;
    private OnScrollListener.ScrollState scrollState;
    private final Drawable selectionDivider;
    private int selectionDividerHeight;
    private final int selectionDividersDistance;
    private int selectorElementHeight;
    private final SparseArray<String> selectorIndexToStringCache;
    private final int[] selectorIndices;
    private final int selectorMiddleItemIndex;
    private int selectorTextGapHeight;
    private final int selectorWheelItemCount;
    private final TypedArray styledAttributes;
    private int topSelectionDividerTop;
    private VelocityTracker velocityTracker;
    private final Drawable virtualButtonPressedDrawable;
    private boolean wrapSelectorWheel;
    private boolean wrapSelectorWheelPreferred;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RhNumberPicker.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker$Formatter;", "", "format", "", "value", "", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public interface Formatter {
        String format(int value);
    }

    /* compiled from: RhNumberPicker.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker$OnValueChangeListener;", "", "onValueChange", "", "picker", "Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker;", "oldVal", "", "newVal", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public interface OnValueChangeListener {
        void onValueChange(RhNumberPicker picker, int oldVal, int newVal);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RhNumberPicker(Context context, AttributeSet attrs) {
        this(context, attrs, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RhNumberPicker(Context context, AttributeSet attrs, int i) {
        this(context, attrs, i, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        return 0.9f;
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        return 0.9f;
    }

    public /* synthetic */ RhNumberPicker(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i3 & 4) != 0 ? R.attr.numberPickerStyle : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RhNumberPicker(Context context, AttributeSet attrs, int i, int i2) throws Resources.NotFoundException {
        int textSize;
        int i3;
        super(context, attrs, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C24876R.styleable.RhNumberPicker, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.styledAttributes = typedArrayObtainStyledAttributes;
        TextPaint textPaint = new TextPaint(1);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(C24876R.styleable.RhNumberPicker_textAppearance, 0));
        TextPaint paint = appCompatTextView.getPaint();
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(paint.getTextSize());
        textPaint.setTypeface(paint.getTypeface());
        textPaint.setColor(typedArrayObtainStyledAttributes.getColor(C24876R.styleable.RhNumberPicker_primaryTextColor, 0));
        this.primaryTextPaint = textPaint;
        int i4 = (typedArrayObtainStyledAttributes.getInt(C24876R.styleable.RhNumberPicker_topSelectionAreaItemCount, 1) * 2) + 1;
        this.selectorWheelItemCount = i4;
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C24876R.styleable.RhNumberPicker_internalMinHeight, -1);
        this.minHeight = dimensionPixelSize;
        Integer dimensionPixelSizeOrNull = TypedArrays3.getDimensionPixelSizeOrNull(typedArrayObtainStyledAttributes, C24876R.styleable.RhNumberPicker_displayValuePadding);
        if (dimensionPixelSizeOrNull == null) {
            textSize = getResources().getDimensionPixelOffset(C24876R.dimen.default_number_picker_line_height);
        } else {
            textSize = ((int) textPaint.getTextSize()) + (dimensionPixelSizeOrNull.intValue() * 2);
        }
        this.selectionDividersDistance = textSize;
        this.selectionDividerHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C24876R.styleable.RhNumberPicker_selectionDividerHeight, getResources().getDimensionPixelOffset(C24876R.dimen.default_number_picker_divider_height));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C24876R.styleable.RhNumberPicker_internalMaxHeight, (textSize * i4) + ((this.selectionDividerHeight + getResources().getDimensionPixelOffset(C24876R.dimen.default_number_picker_padding)) * 2));
        this.maxHeight = dimensionPixelSize2;
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C24876R.styleable.RhNumberPicker_internalMinWidth, -1);
        this.minWidth = dimensionPixelSize3;
        this.maxWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C24876R.styleable.RhNumberPicker_internalMaxWidth, -1);
        this.hideWheelUntilFocused = typedArrayObtainStyledAttributes.getBoolean(C24876R.styleable.RhNumberPicker_hideWheelUntilFocused, false);
        this.colorBackground = typedArrayObtainStyledAttributes.getColor(C24876R.styleable.RhNumberPicker_solidColor, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C24876R.styleable.RhNumberPicker_selectionDivider);
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setLayoutDirection(getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
        } else {
            drawable = null;
        }
        this.selectionDivider = drawable;
        this.virtualButtonPressedDrawable = typedArrayObtainStyledAttributes.getDrawable(C24876R.styleable.RhNumberPicker_virtualButtonPressedDrawable);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            saveAttributeDataForStyleable(context, C24876R.styleable.RhNumberPicker, attrs, typedArrayObtainStyledAttributes, i, i2);
        }
        if (dimensionPixelSize != -1 && dimensionPixelSize2 != -1 && dimensionPixelSize > dimensionPixelSize2) {
            throw new IllegalArgumentException("minHeight > maxHeight");
        }
        if (dimensionPixelSize3 != -1 && (i3 = this.maxWidth) != -1 && dimensionPixelSize3 > i3) {
            throw new IllegalArgumentException("minWidth > maxWidth");
        }
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        setVerticalFadingEdgeEnabled(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        if (i5 >= 26 && getFocusable() == 16) {
            setFocusable(1);
            setFocusableInTouchMode(true);
        }
        this.selectorMiddleItemIndex = i4 / 2;
        this.computeMaxWidth = this.maxWidth == -1;
        this.selectorIndexToStringCache = new SparseArray<>();
        this.selectorIndices = new int[i4];
        this.initialScrollOffset = Integer.MIN_VALUE;
        this.flingScroller = new Scroller(getContext(), null, true);
        this.adjustScroller = new Scroller(getContext(), new DecelerateInterpolator(2.5f));
        this.changeCurrentByOneFromLongPressCommand = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.optionsstrategybuilder.pickers.RhNumberPicker$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhNumberPicker.changeCurrentByOneFromLongPressCommand_delegate$lambda$6(this.f$0);
            }
        });
        this.configuration = ViewConfiguration.get(context);
        this.scrollState = OnScrollListener.ScrollState.SCROLL_STATE_IDLE;
        this.accessibilityNodeProvider = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.optionsstrategybuilder.pickers.RhNumberPicker$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhNumberPicker.accessibilityNodeProvider_delegate$lambda$7(this.f$0);
            }
        });
        this.pressedStateHelper = new PressedStateHelper();
        this.lastHandledDownDpadKeyCode = -1;
        this.longPressUpdateInterval = 300L;
        this.wrapSelectorWheelPreferred = true;
        this.accessibilityCallbacks = new NumberPickerAccessibilityProvider.Callbacks() { // from class: com.robinhood.android.optionsstrategybuilder.pickers.RhNumberPicker$accessibilityCallbacks$1
            @Override // com.robinhood.android.optionsstrategybuilder.pickers.NumberPickerAccessibilityProvider.Callbacks
            public int getDividerTop() {
                return this.this$0.topSelectionDividerTop;
            }

            @Override // com.robinhood.android.optionsstrategybuilder.pickers.NumberPickerAccessibilityProvider.Callbacks
            public int getDividerBottom() {
                return this.this$0.bottomSelectionDividerBottom;
            }

            @Override // com.robinhood.android.optionsstrategybuilder.pickers.NumberPickerAccessibilityProvider.Callbacks
            public String getVirtualDecrementButtonText() {
                int wrappedSelectorIndex;
                String str;
                if (this.this$0.wrapSelectorWheel) {
                    wrappedSelectorIndex = this.this$0.getWrappedSelectorIndex(r0.internalValue - 1);
                } else {
                    wrappedSelectorIndex = this.this$0.internalValue - 1;
                }
                if (wrappedSelectorIndex < this.this$0.getMinValue()) {
                    return null;
                }
                String[] displayedValues = this.this$0.getDisplayedValues();
                return (displayedValues == null || (str = displayedValues[wrappedSelectorIndex - this.this$0.getMinValue()]) == null) ? this.this$0.formatNumber(wrappedSelectorIndex) : str;
            }

            @Override // com.robinhood.android.optionsstrategybuilder.pickers.NumberPickerAccessibilityProvider.Callbacks
            public String getVirtualIncrementButtonText() {
                int wrappedSelectorIndex;
                String str;
                if (this.this$0.wrapSelectorWheel) {
                    RhNumberPicker rhNumberPicker = this.this$0;
                    wrappedSelectorIndex = rhNumberPicker.getWrappedSelectorIndex(rhNumberPicker.internalValue + 1);
                } else {
                    wrappedSelectorIndex = this.this$0.internalValue + 1;
                }
                if (wrappedSelectorIndex > this.this$0.getMaxValue()) {
                    return null;
                }
                String[] displayedValues = this.this$0.getDisplayedValues();
                return (displayedValues == null || (str = displayedValues[wrappedSelectorIndex - this.this$0.getMinValue()]) == null) ? this.this$0.formatNumber(wrappedSelectorIndex) : str;
            }

            @Override // com.robinhood.android.optionsstrategybuilder.pickers.NumberPickerAccessibilityProvider.Callbacks
            public void changeValueByOne(boolean increment) {
                this.this$0.changeValueByOne(increment);
            }
        };
    }

    public final int getSelectionDividerHeight() {
        return this.selectionDividerHeight;
    }

    public final void setSelectionDividerHeight(int i) {
        this.selectionDividerHeight = i;
        invalidate();
    }

    public final int getPrimaryTextColor() {
        return this.primaryTextPaint.getColor();
    }

    public final void setPrimaryTextColor(int i) {
        this.primaryTextPaint.setColor(i);
        invalidate();
    }

    public final int getColorBackground() {
        return this.colorBackground;
    }

    public final void setColorBackground(int i) {
        if (this.colorBackground == i) {
            return;
        }
        this.colorBackground = i;
        invalidate();
    }

    private final ChangeCurrentByOneFromLongPressCommand getChangeCurrentByOneFromLongPressCommand() {
        return (ChangeCurrentByOneFromLongPressCommand) this.changeCurrentByOneFromLongPressCommand.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChangeCurrentByOneFromLongPressCommand changeCurrentByOneFromLongPressCommand_delegate$lambda$6(RhNumberPicker rhNumberPicker) {
        return rhNumberPicker.new ChangeCurrentByOneFromLongPressCommand();
    }

    private final NumberPickerAccessibilityProvider getAccessibilityNodeProvider() {
        return (NumberPickerAccessibilityProvider) this.accessibilityNodeProvider.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NumberPickerAccessibilityProvider accessibilityNodeProvider_delegate$lambda$7(RhNumberPicker rhNumberPicker) {
        return new NumberPickerAccessibilityProvider(rhNumberPicker, rhNumberPicker.accessibilityCallbacks);
    }

    /* renamed from: getValue, reason: from getter */
    public final int getInternalValue() {
        return this.internalValue;
    }

    public final void setValue(int i) {
        setValueInternal(i, false);
    }

    public final String[] getDisplayedValues() {
        return this.displayedValues;
    }

    public final void setDisplayedValues(String[] strArr) {
        if (this.displayedValues == strArr) {
            return;
        }
        this.displayedValues = strArr;
        initializeSelectorWheelIndices();
        tryComputeMaxWidth();
    }

    public final int getMinValue() {
        return this.minValue;
    }

    public final void setMinValue(int i) {
        if (this.minValue == i) {
            return;
        }
        if (i < 0) {
            throw new IllegalArgumentException("minValue must be >= 0");
        }
        this.minValue = i;
        if (i > this.internalValue) {
            this.internalValue = i;
        }
        updateWrapSelectorWheel();
        initializeSelectorWheelIndices();
        tryComputeMaxWidth();
        invalidate();
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final void setMaxValue(int i) {
        if (this.maxValue == i) {
            return;
        }
        if (i < 0) {
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
        this.maxValue = i;
        if (i < this.internalValue) {
            this.internalValue = i;
        }
        updateWrapSelectorWheel();
        initializeSelectorWheelIndices();
        tryComputeMaxWidth();
        invalidate();
    }

    public final OnValueChangeListener getOnValueChangeListener() {
        return this.onValueChangeListener;
    }

    public final void setOnValueChangeListener(OnValueChangeListener onValueChangeListener) {
        this.onValueChangeListener = onValueChangeListener;
    }

    public final OnScrollListener getOnScrollListener() {
        return this.onScrollListener;
    }

    public final void setOnScrollListener(OnScrollListener onScrollListener) {
        this.onScrollListener = onScrollListener;
    }

    public final Formatter getFormatter() {
        return this.formatter;
    }

    public final void setFormatter(Formatter formatter) {
        if (this.formatter == formatter) {
            return;
        }
        this.formatter = formatter;
        initializeSelectorWheelIndices();
    }

    public final long getLongPressUpdateInterval() {
        return this.longPressUpdateInterval;
    }

    public final void setLongPressUpdateInterval(long j) {
        this.longPressUpdateInterval = j;
    }

    public final boolean getWrapSelectorWheelPreferred() {
        return this.wrapSelectorWheelPreferred;
    }

    public final void setWrapSelectorWheelPreferred(boolean z) {
        this.wrapSelectorWheelPreferred = z;
        updateWrapSelectorWheel();
    }

    /* compiled from: RhNumberPicker.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\bJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker$OnScrollListener;", "", "onScrollStateChange", "", "view", "Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker;", "scrollState", "Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker$OnScrollListener$ScrollState;", "ScrollState", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public interface OnScrollListener {
        void onScrollStateChange(RhNumberPicker view, ScrollState scrollState);

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: RhNumberPicker.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker$OnScrollListener$ScrollState;", "", "<init>", "(Ljava/lang/String;I)V", "SCROLL_STATE_IDLE", "SCROLL_STATE_TOUCH_SCROLL", "SCROLL_STATE_FLING", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ScrollState {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ ScrollState[] $VALUES;
            public static final ScrollState SCROLL_STATE_IDLE = new ScrollState("SCROLL_STATE_IDLE", 0);
            public static final ScrollState SCROLL_STATE_TOUCH_SCROLL = new ScrollState("SCROLL_STATE_TOUCH_SCROLL", 1);
            public static final ScrollState SCROLL_STATE_FLING = new ScrollState("SCROLL_STATE_FLING", 2);

            private static final /* synthetic */ ScrollState[] $values() {
                return new ScrollState[]{SCROLL_STATE_IDLE, SCROLL_STATE_TOUCH_SCROLL, SCROLL_STATE_FLING};
            }

            public static EnumEntries<ScrollState> getEntries() {
                return $ENTRIES;
            }

            private ScrollState(String str, int i) {
            }

            static {
                ScrollState[] scrollStateArr$values = $values();
                $VALUES = scrollStateArr$values;
                $ENTRIES = EnumEntries2.enumEntries(scrollStateArr$values);
            }

            public static ScrollState valueOf(String str) {
                return (ScrollState) Enum.valueOf(ScrollState.class, str);
            }

            public static ScrollState[] values() {
                return (ScrollState[]) $VALUES.clone();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        if (changed) {
            int measuredHeight = getMeasuredHeight();
            initializeSelectorWheelIndices();
            int textSize = (int) this.primaryTextPaint.getTextSize();
            int[] iArr = this.selectorIndices;
            int i = bottom - top;
            int length = (int) (((i - (iArr.length * textSize)) / iArr.length) + 0.5f);
            this.selectorTextGapHeight = length;
            this.selectorElementHeight = length + textSize;
            int fontMetrics = ((int) (((measuredHeight - this.primaryTextPaint.getFontMetrics(null)) / 2.0f) + textSize)) - (this.selectorElementHeight * this.selectorMiddleItemIndex);
            this.initialScrollOffset = fontMetrics;
            this.currentScrollOffset = fontMetrics;
            setFadingEdgeLength((i - textSize) / 2);
            int i2 = this.selectionDividersDistance;
            int i3 = this.selectionDividerHeight;
            int i4 = ((measuredHeight - i2) / 2) - i3;
            this.topSelectionDividerTop = i4;
            this.bottomSelectionDividerBottom = i4 + (i3 * 2) + i2;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int measuredWidth;
        Companion companion = INSTANCE;
        super.onMeasure(companion.makeMeasureSpec(widthMeasureSpec, this.maxWidth), companion.makeMeasureSpec(heightMeasureSpec, this.maxHeight));
        int i = this.minWidth;
        if (i == -1) {
            measuredWidth = View.resolveSizeAndState(Math.max(i, getMeasuredWidth()), widthMeasureSpec, 0);
        } else {
            measuredWidth = getMeasuredWidth();
        }
        int i2 = this.minHeight;
        if (i2 == -1) {
            heightMeasureSpec = View.resolveSizeAndState(Math.max(i2, getMeasuredHeight()), heightMeasureSpec, 0);
        }
        setMeasuredDimension(measuredWidth, heightMeasureSpec);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!isEnabled() || event.getActionMasked() != 0) {
            return false;
        }
        removeAllCallbacks();
        float y = event.getY();
        this.lastDownEventY = y;
        this.lastDownOrMoveEventY = y;
        this.lastDownEventTime = event.getEventTime();
        this.performClickOnTap = false;
        OnScrollListener.ScrollState scrollState = this.scrollState;
        OnScrollListener.ScrollState scrollState2 = OnScrollListener.ScrollState.SCROLL_STATE_IDLE;
        if (scrollState == scrollState2) {
            float f = this.lastDownEventY;
            if (f < this.topSelectionDividerTop) {
                this.pressedStateHelper.m2359x8d4db015(ManagedButton.BUTTON_DECREMENT);
            } else if (f > this.bottomSelectionDividerBottom) {
                this.pressedStateHelper.m2359x8d4db015(ManagedButton.BUTTON_INCREMENT);
            }
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        if (!this.flingScroller.isFinished()) {
            this.flingScroller.forceFinished(true);
            this.adjustScroller.forceFinished(true);
            onScrollerFinished(this.flingScroller);
            onScrollStateChange(scrollState2);
        } else if (!this.adjustScroller.isFinished()) {
            this.flingScroller.forceFinished(true);
            this.adjustScroller.forceFinished(true);
            onScrollerFinished(this.adjustScroller);
        } else {
            float f2 = this.lastDownEventY;
            if (f2 < this.topSelectionDividerTop) {
                postChangeCurrentByOneFromLongPress(false, ViewConfiguration.getLongPressTimeout());
            } else if (f2 > this.bottomSelectionDividerBottom) {
                postChangeCurrentByOneFromLongPress(true, ViewConfiguration.getLongPressTimeout());
            } else {
                this.performClickOnTap = true;
            }
        }
        return true;
    }

    @Override // android.view.View
    @SuppressLint({"Recycle", "ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!isEnabled()) {
            return false;
        }
        VelocityTracker velocityTrackerObtain = this.velocityTracker;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(event);
        int actionMasked = event.getActionMasked();
        if (actionMasked == 1) {
            Intrinsics.checkNotNull(velocityTrackerObtain);
            onUpMotionEvent(velocityTrackerObtain, (int) event.getY(), event.getEventTime());
        } else if (actionMasked == 2) {
            onMoveMotionEvent(event.getY());
        }
        return true;
    }

    private final void onMoveMotionEvent(float currentMoveY) {
        OnScrollListener.ScrollState scrollState = this.scrollState;
        OnScrollListener.ScrollState scrollState2 = OnScrollListener.ScrollState.SCROLL_STATE_TOUCH_SCROLL;
        if (scrollState != scrollState2) {
            if (((int) Math.abs(currentMoveY - this.lastDownEventY)) > this.configuration.getScaledTouchSlop()) {
                removeAllCallbacks();
                onScrollStateChange(scrollState2);
            }
        } else {
            scrollBy(0, (int) (currentMoveY - this.lastDownOrMoveEventY));
            invalidate();
        }
        this.lastDownOrMoveEventY = currentMoveY;
    }

    private final void onUpMotionEvent(VelocityTracker velocityTracker, int eventY, long eventTime) {
        int scaledTouchSlop = this.configuration.getScaledTouchSlop();
        int scaledMinimumFlingVelocity = this.configuration.getScaledMinimumFlingVelocity();
        int scaledMaximumFlingVelocity = this.configuration.getScaledMaximumFlingVelocity();
        removeCallbacks(getChangeCurrentByOneFromLongPressCommand());
        this.pressedStateHelper.cancel();
        velocityTracker.computeCurrentVelocity(1000, scaledMaximumFlingVelocity);
        int yVelocity = (int) velocityTracker.getYVelocity();
        if (Math.abs(yVelocity) > scaledMinimumFlingVelocity) {
            this.previousScrollerY = 0;
            this.flingScroller.fling(0, yVelocity > 0 ? 0 : Integer.MAX_VALUE, 0, yVelocity, 0, 0, 0, Integer.MAX_VALUE);
            invalidate();
            onScrollStateChange(OnScrollListener.ScrollState.SCROLL_STATE_FLING);
        } else {
            int iAbs = (int) Math.abs(eventY - this.lastDownEventY);
            long j = eventTime - this.lastDownEventTime;
            if (iAbs > scaledTouchSlop || j >= ViewConfiguration.getTapTimeout()) {
                ensureScrollWheelAdjusted();
            } else if (this.performClickOnTap) {
                this.performClickOnTap = false;
                performClick();
            } else {
                int i = this.selectorElementHeight;
                int i2 = eventY / i;
                int i3 = this.selectorMiddleItemIndex;
                if (i2 > i3) {
                    changeValueByOne(true);
                    this.pressedStateHelper.buttonTapped$feature_options_strategy_builder_externalDebug(ManagedButton.BUTTON_INCREMENT);
                } else if (eventY / i < i3) {
                    changeValueByOne(false);
                    this.pressedStateHelper.buttonTapped$feature_options_strategy_builder_externalDebug(ManagedButton.BUTTON_DECREMENT);
                }
            }
            onScrollStateChange(OnScrollListener.ScrollState.SCROLL_STATE_IDLE);
        }
        VelocityTracker velocityTracker2 = this.velocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
        }
        this.velocityTracker = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            removeAllCallbacks();
        }
        return super.dispatchTouchEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int keyCode = event.getKeyCode();
        if (keyCode == 19) {
            Boolean boolDispatchUpDownKeyEvent = dispatchUpDownKeyEvent(event, this.internalValue > this.minValue);
            return boolDispatchUpDownKeyEvent != null ? boolDispatchUpDownKeyEvent.booleanValue() : super.dispatchKeyEvent(event);
        }
        if (keyCode == 20) {
            Boolean boolDispatchUpDownKeyEvent2 = dispatchUpDownKeyEvent(event, this.internalValue < this.maxValue);
            return boolDispatchUpDownKeyEvent2 != null ? boolDispatchUpDownKeyEvent2.booleanValue() : super.dispatchKeyEvent(event);
        }
        if (keyCode == 23 || keyCode == 66 || keyCode == 160) {
            removeAllCallbacks();
        }
        return super.dispatchKeyEvent(event);
    }

    private final Boolean dispatchUpDownKeyEvent(KeyEvent event, boolean isDown) {
        int action = event.getAction();
        if (action == 0) {
            if (!this.wrapSelectorWheel && !isDown) {
                return null;
            }
            requestFocus();
            this.lastHandledDownDpadKeyCode = event.getKeyCode();
            removeAllCallbacks();
            if (this.flingScroller.isFinished()) {
                changeValueByOne(event.getKeyCode() == 20);
            }
            return Boolean.TRUE;
        }
        if (action != 1 || this.lastHandledDownDpadKeyCode != event.getKeyCode()) {
            return null;
        }
        this.lastHandledDownDpadKeyCode = -1;
        return Boolean.TRUE;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTrackballEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            removeAllCallbacks();
        }
        return super.dispatchTrackballEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected boolean dispatchHoverEvent(MotionEvent event) {
        int i;
        Intrinsics.checkNotNullParameter(event, "event");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (!ContextSystemServices.getAccessibilityManager(context).isEnabled()) {
            return false;
        }
        int y = (int) event.getY();
        if (y < this.topSelectionDividerTop) {
            i = 2;
        } else {
            i = y > this.bottomSelectionDividerBottom ? 1 : -1;
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 7) {
            int i2 = this.lastHoveredChildVirtualViewId;
            if (i2 == i || i2 == -1) {
                return false;
            }
            getAccessibilityNodeProvider().sendAccessibilityEventForVirtualView(this.lastHoveredChildVirtualViewId, 256);
            dispatchHoverEnterEvent(i);
        } else if (actionMasked == 9) {
            dispatchHoverEnterEvent(i);
        } else if (actionMasked == 10) {
            getAccessibilityNodeProvider().sendAccessibilityEventForVirtualView(i, 256);
            this.lastHoveredChildVirtualViewId = -1;
        }
        return false;
    }

    private final void dispatchHoverEnterEvent(int hoveredVirtualViewId) {
        getAccessibilityNodeProvider().sendAccessibilityEventForVirtualView(hoveredVirtualViewId, 128);
        this.lastHoveredChildVirtualViewId = hoveredVirtualViewId;
        getAccessibilityNodeProvider().performAction(hoveredVirtualViewId, 64, null);
    }

    @Override // android.view.View
    public void computeScroll() {
        Scroller scroller;
        if (!this.flingScroller.isFinished()) {
            scroller = this.flingScroller;
        } else if (this.adjustScroller.isFinished()) {
            return;
        } else {
            scroller = this.adjustScroller;
        }
        scroller.computeScrollOffset();
        int currY = scroller.getCurrY();
        if (this.previousScrollerY == 0) {
            this.previousScrollerY = scroller.getStartY();
        }
        scrollBy(0, currY - this.previousScrollerY);
        this.previousScrollerY = currY;
        if (scroller.isFinished()) {
            onScrollerFinished(scroller);
        } else {
            invalidate();
        }
    }

    @Override // android.view.View
    public void scrollBy(int x, int y) {
        int i;
        int iIntValue;
        int iIntValue2;
        int[] iArr = this.selectorIndices;
        int i2 = this.currentScrollOffset;
        boolean z = this.wrapSelectorWheel;
        if (!z && y > 0 && iArr[this.selectorMiddleItemIndex] <= this.minValue) {
            this.currentScrollOffset = this.initialScrollOffset;
            return;
        }
        if (!z && y < 0 && iArr[this.selectorMiddleItemIndex] >= this.maxValue) {
            this.currentScrollOffset = this.initialScrollOffset;
            return;
        }
        this.currentScrollOffset = y + i2;
        while (true) {
            int i3 = this.currentScrollOffset;
            if (i3 - this.initialScrollOffset <= this.selectorTextGapHeight) {
                break;
            }
            this.currentScrollOffset = i3 - this.selectorElementHeight;
            for (int lastIndex = ArraysKt.getLastIndex(iArr); lastIndex > 0; lastIndex--) {
                iArr[lastIndex] = iArr[lastIndex - 1];
            }
            Integer numValueOf = Integer.valueOf(iArr[1] - 1);
            Integer num = (!this.wrapSelectorWheel || numValueOf.intValue() >= this.minValue) ? numValueOf : null;
            if (num != null) {
                iIntValue2 = num.intValue();
            } else {
                iIntValue2 = this.maxValue;
            }
            iArr[0] = iIntValue2;
            ensureCachedScrollSelectorValue(iIntValue2);
            setValueInternal(iArr[this.selectorMiddleItemIndex], true);
            if (!this.wrapSelectorWheel && iArr[this.selectorMiddleItemIndex] <= this.minValue) {
                this.currentScrollOffset = this.initialScrollOffset;
            }
        }
        while (true) {
            i = this.currentScrollOffset;
            if (i - this.initialScrollOffset >= (-this.selectorTextGapHeight)) {
                break;
            }
            this.currentScrollOffset = i + this.selectorElementHeight;
            int lastIndex2 = ArraysKt.getLastIndex(iArr);
            int i4 = 0;
            while (i4 < lastIndex2) {
                int i5 = i4 + 1;
                iArr[i4] = iArr[i5];
                i4 = i5;
            }
            Integer numValueOf2 = Integer.valueOf(iArr[iArr.length - 2] + 1);
            int iIntValue3 = numValueOf2.intValue();
            if (this.wrapSelectorWheel && iIntValue3 > this.maxValue) {
                numValueOf2 = null;
            }
            if (numValueOf2 != null) {
                iIntValue = numValueOf2.intValue();
            } else {
                iIntValue = this.minValue;
            }
            iArr[ArraysKt.getLastIndex(iArr)] = iIntValue;
            ensureCachedScrollSelectorValue(iIntValue);
            setValueInternal(iArr[this.selectorMiddleItemIndex], true);
            if (!this.wrapSelectorWheel && iArr[this.selectorMiddleItemIndex] >= this.maxValue) {
                this.currentScrollOffset = this.initialScrollOffset;
            }
        }
        if (i2 != i) {
            onScrollChanged(0, i, 0, i2);
        }
    }

    @Override // android.view.View
    protected int computeVerticalScrollOffset() {
        return this.currentScrollOffset;
    }

    @Override // android.view.View
    protected int computeVerticalScrollRange() {
        return ((this.maxValue - this.minValue) + 1) * this.selectorElementHeight;
    }

    @Override // android.view.View
    protected int computeVerticalScrollExtent() {
        return getHeight();
    }

    @Override // android.view.View
    public int getSolidColor() {
        return this.colorBackground;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return true;
    }

    @Override // android.view.View
    public boolean performLongClick() {
        super.performLongClick();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeAllCallbacks();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.selectionDivider;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.selectionDivider;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        boolean zHasFocus = this.hideWheelUntilFocused ? hasFocus() : true;
        float right = (getRight() - getLeft()) / 2.0f;
        float f = this.currentScrollOffset;
        Drawable drawable = this.virtualButtonPressedDrawable;
        if (zHasFocus && drawable != null && this.scrollState == OnScrollListener.ScrollState.SCROLL_STATE_IDLE) {
            boolean decrementVirtualButtonPressed = this.pressedStateHelper.getDecrementVirtualButtonPressed();
            int[] iArr = LinearLayout.PRESSED_STATE_SET;
            if (decrementVirtualButtonPressed) {
                drawable.setState(iArr);
                drawable.setBounds(0, 0, getRight(), this.topSelectionDividerTop);
                drawable.draw(canvas);
            }
            if (this.pressedStateHelper.getIncrementVirtualButtonPressed()) {
                drawable.setState(iArr);
                drawable.setBounds(0, this.bottomSelectionDividerBottom, getRight(), getBottom());
                drawable.draw(canvas);
            }
        }
        for (int i : this.selectorIndices) {
            String str = this.selectorIndexToStringCache.get(i);
            if (zHasFocus) {
                canvas.drawText(str, right, f, this.primaryTextPaint);
            }
            f += this.selectorElementHeight;
        }
        Drawable drawable2 = this.selectionDivider;
        if (drawable2 != null && zHasFocus) {
            int i2 = this.topSelectionDividerTop;
            drawable2.setBounds(0, i2, getRight(), this.selectionDividerHeight + i2);
            drawable2.draw(canvas);
            int i3 = this.bottomSelectionDividerBottom;
            drawable2.setBounds(0, i3 - this.selectionDividerHeight, getRight(), i3);
            drawable2.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.onInitializeAccessibilityEvent(event);
        event.setClassName(RhNumberPicker.class.getName());
        event.setScrollable(true);
        event.setScrollY((this.minValue + this.internalValue) * this.selectorElementHeight);
        event.setMaxScrollY((this.maxValue - this.minValue) * this.selectorElementHeight);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return getAccessibilityNodeProvider();
    }

    private final void tryComputeMaxWidth() {
        Number numberValueOf;
        if (this.computeMaxWidth) {
            String[] strArr = this.displayedValues;
            int i = 0;
            if (strArr != null) {
                if (strArr.length == 0) {
                    numberValueOf = null;
                } else {
                    float fMeasureText = this.primaryTextPaint.measureText(strArr[0]);
                    int lastIndex = ArraysKt.getLastIndex(strArr);
                    int i2 = 1;
                    if (1 <= lastIndex) {
                        while (true) {
                            fMeasureText = Math.max(fMeasureText, this.primaryTextPaint.measureText(strArr[i2]));
                            if (i2 == lastIndex) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                    numberValueOf = Float.valueOf(fMeasureText);
                }
                if (numberValueOf == null) {
                    numberValueOf = 0;
                }
            } else {
                Iterator<Integer> it = RangesKt.until(0, 10).iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                PrimitiveIterators6 primitiveIterators6 = (PrimitiveIterators6) it;
                float fMeasureText2 = this.primaryTextPaint.measureText(INSTANCE.formatNumberWithLocale(primitiveIterators6.nextInt()));
                while (it.hasNext()) {
                    fMeasureText2 = Math.max(fMeasureText2, this.primaryTextPaint.measureText(INSTANCE.formatNumberWithLocale(primitiveIterators6.nextInt())));
                }
                for (int i3 = this.maxValue; i3 > 0; i3 /= 10) {
                    i++;
                }
                numberValueOf = Float.valueOf(i * fMeasureText2);
            }
            int iIntValue = numberValueOf.intValue();
            if (this.maxWidth != iIntValue) {
                this.maxWidth = Math.max(iIntValue, this.minWidth);
                invalidate();
            }
        }
    }

    private final void updateWrapSelectorWheel() {
        this.wrapSelectorWheel = this.maxValue - this.minValue >= this.selectorIndices.length && this.wrapSelectorWheelPreferred;
    }

    private final void initializeSelectorWheelIndices() {
        this.selectorIndexToStringCache.clear();
        int length = this.selectorIndices.length;
        for (int i = 0; i < length; i++) {
            int wrappedSelectorIndex = this.internalValue + (i - this.selectorMiddleItemIndex);
            int[] iArr = this.selectorIndices;
            if (this.wrapSelectorWheel) {
                wrappedSelectorIndex = getWrappedSelectorIndex(wrappedSelectorIndex);
            }
            iArr[i] = wrappedSelectorIndex;
            ensureCachedScrollSelectorValue(this.selectorIndices[i]);
        }
    }

    private final void setValueInternal(int current, boolean notifyChange) {
        int iCoerceIn;
        OnValueChangeListener onValueChangeListener;
        int i = this.internalValue;
        if (i == current) {
            return;
        }
        if (this.wrapSelectorWheel) {
            iCoerceIn = getWrappedSelectorIndex(current);
        } else {
            iCoerceIn = RangesKt.coerceIn(current, this.minValue, this.maxValue);
        }
        this.internalValue = iCoerceIn;
        performHapticFeedback(4);
        if (notifyChange && (onValueChangeListener = this.onValueChangeListener) != null) {
            onValueChangeListener.onValueChange(this, i, this.internalValue);
        }
        initializeSelectorWheelIndices();
        invalidate();
    }

    private final boolean moveToFinalScrollerPosition(Scroller scroller) {
        scroller.forceFinished(true);
        int finalY = scroller.getFinalY() - scroller.getCurrY();
        int i = this.initialScrollOffset - ((this.currentScrollOffset + finalY) % this.selectorElementHeight);
        if (i == 0) {
            return false;
        }
        int iAbs = Math.abs(i);
        int i2 = this.selectorElementHeight;
        scrollBy(0, iAbs > i2 / 2 ? i > 0 ? (finalY + i) - i2 : finalY + i + i2 : finalY + i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeValueByOne(boolean increment) {
        if (!moveToFinalScrollerPosition(this.flingScroller)) {
            moveToFinalScrollerPosition(this.adjustScroller);
        }
        this.previousScrollerY = 0;
        this.flingScroller.startScroll(0, 0, 0, increment ? -this.selectorElementHeight : this.selectorElementHeight, 300);
        invalidate();
    }

    private final void onScrollerFinished(Scroller scroller) {
        if (scroller == this.flingScroller) {
            ensureScrollWheelAdjusted();
            onScrollStateChange(OnScrollListener.ScrollState.SCROLL_STATE_IDLE);
        }
    }

    private final void onScrollStateChange(OnScrollListener.ScrollState scrollState) {
        if (this.scrollState == scrollState) {
            return;
        }
        this.scrollState = scrollState;
        OnScrollListener onScrollListener = this.onScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChange(this, scrollState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getWrappedSelectorIndex(int selectorIndex) {
        int i = this.maxValue;
        if (selectorIndex > i) {
            int i2 = this.minValue;
            return (i2 + ((selectorIndex - i) % (i - i2))) - 1;
        }
        int i3 = this.minValue;
        return selectorIndex < i3 ? (i - ((i3 - selectorIndex) % (i - i3))) + 1 : selectorIndex;
    }

    private final void ensureCachedScrollSelectorValue(int selectorIndex) {
        String number;
        SparseArray<String> sparseArray = this.selectorIndexToStringCache;
        if (sparseArray.get(selectorIndex) != null) {
            return;
        }
        int i = this.minValue;
        if (selectorIndex < i || selectorIndex > this.maxValue) {
            number = "";
        } else {
            String[] strArr = this.displayedValues;
            if (strArr == null || (number = strArr[selectorIndex - i]) == null) {
                number = formatNumber(selectorIndex);
            }
        }
        sparseArray.put(selectorIndex, number);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatNumber(int value) {
        String str;
        Formatter formatter = this.formatter;
        return (formatter == null || (str = formatter.format(value)) == null) ? INSTANCE.formatNumberWithLocale(value) : str;
    }

    private final void postChangeCurrentByOneFromLongPress(boolean increment, long delayMillis) {
        if (this.hasInitializedChangeCurrentByOneFromLongPressCommand) {
            removeCallbacks(getChangeCurrentByOneFromLongPressCommand());
        }
        this.hasInitializedChangeCurrentByOneFromLongPressCommand = true;
        getChangeCurrentByOneFromLongPressCommand().setIncrement(increment);
        postDelayed(getChangeCurrentByOneFromLongPressCommand(), delayMillis);
    }

    private final void removeAllCallbacks() {
        removeCallbacks(getChangeCurrentByOneFromLongPressCommand());
    }

    private final boolean ensureScrollWheelAdjusted() {
        int i = this.initialScrollOffset - this.currentScrollOffset;
        if (i == 0) {
            return false;
        }
        this.previousScrollerY = 0;
        int iAbs = Math.abs(i);
        int i2 = this.selectorElementHeight;
        if (iAbs > i2 / 2) {
            if (i > 0) {
                i2 = -i2;
            }
            i += i2;
        }
        this.adjustScroller.startScroll(0, 0, 0, i, SELECTOR_ADJUSTMENT_DURATION_MILLIS);
        invalidate();
        return true;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RhNumberPicker.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker$ManagedButton;", "", "<init>", "(Ljava/lang/String;I)V", "BUTTON_INCREMENT", "BUTTON_DECREMENT", "NO_BUTTON", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class ManagedButton {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ManagedButton[] $VALUES;
        public static final ManagedButton BUTTON_INCREMENT = new ManagedButton("BUTTON_INCREMENT", 0);
        public static final ManagedButton BUTTON_DECREMENT = new ManagedButton("BUTTON_DECREMENT", 1);
        public static final ManagedButton NO_BUTTON = new ManagedButton("NO_BUTTON", 2);

        private static final /* synthetic */ ManagedButton[] $values() {
            return new ManagedButton[]{BUTTON_INCREMENT, BUTTON_DECREMENT, NO_BUTTON};
        }

        public static EnumEntries<ManagedButton> getEntries() {
            return $ENTRIES;
        }

        private ManagedButton(String str, int i) {
        }

        static {
            ManagedButton[] managedButtonArr$values = $values();
            $VALUES = managedButtonArr$values;
            $ENTRIES = EnumEntries2.enumEntries(managedButtonArr$values);
        }

        public static ManagedButton valueOf(String str) {
            return (ManagedButton) Enum.valueOf(ManagedButton.class, str);
        }

        public static ManagedButton[] values() {
            return (ManagedButton[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RhNumberPicker.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker$PressedState;", "", "<init>", "(Ljava/lang/String;I)V", "MODE_PRESS", "MODE_TAPPED", "NOT_PRESSED", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    private static final class PressedState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PressedState[] $VALUES;
        public static final PressedState MODE_PRESS = new PressedState("MODE_PRESS", 0);
        public static final PressedState MODE_TAPPED = new PressedState("MODE_TAPPED", 1);
        public static final PressedState NOT_PRESSED = new PressedState("NOT_PRESSED", 2);

        private static final /* synthetic */ PressedState[] $values() {
            return new PressedState[]{MODE_PRESS, MODE_TAPPED, NOT_PRESSED};
        }

        public static EnumEntries<PressedState> getEntries() {
            return $ENTRIES;
        }

        private PressedState(String str, int i) {
        }

        static {
            PressedState[] pressedStateArr$values = $values();
            $VALUES = pressedStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(pressedStateArr$values);
        }

        public static PressedState valueOf(String str) {
            return (PressedState) Enum.valueOf(PressedState.class, str);
        }

        public static PressedState[] values() {
            return (PressedState[]) $VALUES.clone();
        }
    }

    /* compiled from: RhNumberPicker.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0015J\u0015\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0017J\b\u0010\u0018\u001a\u00020\u0012H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker$PressedStateHelper;", "Ljava/lang/Runnable;", "<init>", "(Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker;)V", "incrementVirtualButtonPressed", "", "getIncrementVirtualButtonPressed", "()Z", "setIncrementVirtualButtonPressed", "(Z)V", "decrementVirtualButtonPressed", "getDecrementVirtualButtonPressed", "setDecrementVirtualButtonPressed", "managedButton", "Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker$ManagedButton;", "mode", "Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker$PressedState;", "cancel", "", "buttonPressDelayed", "button", "buttonPressDelayed$feature_options_strategy_builder_externalDebug", "buttonTapped", "buttonTapped$feature_options_strategy_builder_externalDebug", "run", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public final class PressedStateHelper implements Runnable {
        private boolean decrementVirtualButtonPressed;
        private boolean incrementVirtualButtonPressed;
        private ManagedButton managedButton = ManagedButton.NO_BUTTON;
        private PressedState mode = PressedState.NOT_PRESSED;

        /* compiled from: RhNumberPicker.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[ManagedButton.values().length];
                try {
                    iArr[ManagedButton.BUTTON_INCREMENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ManagedButton.BUTTON_DECREMENT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ManagedButton.NO_BUTTON.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[PressedState.values().length];
                try {
                    iArr2[PressedState.MODE_PRESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[PressedState.MODE_TAPPED.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[PressedState.NOT_PRESSED.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public PressedStateHelper() {
        }

        public final boolean getIncrementVirtualButtonPressed() {
            return this.incrementVirtualButtonPressed;
        }

        public final void setIncrementVirtualButtonPressed(boolean z) {
            this.incrementVirtualButtonPressed = z;
        }

        public final boolean getDecrementVirtualButtonPressed() {
            return this.decrementVirtualButtonPressed;
        }

        public final void setDecrementVirtualButtonPressed(boolean z) {
            this.decrementVirtualButtonPressed = z;
        }

        public final void cancel() {
            this.mode = PressedState.NOT_PRESSED;
            this.managedButton = ManagedButton.NO_BUTTON;
            RhNumberPicker.this.removeCallbacks(this);
            if (this.incrementVirtualButtonPressed) {
                this.incrementVirtualButtonPressed = false;
                RhNumberPicker.this.invalidate();
            }
            this.decrementVirtualButtonPressed = false;
        }

        /* renamed from: buttonPressDelayed$feature_options_strategy_builder_externalDebug */
        public final void m2359x8d4db015(ManagedButton button) {
            Intrinsics.checkNotNullParameter(button, "button");
            cancel();
            this.mode = PressedState.MODE_PRESS;
            this.managedButton = button;
            RhNumberPicker.this.postDelayed(this, ViewConfiguration.getTapTimeout());
        }

        public final void buttonTapped$feature_options_strategy_builder_externalDebug(ManagedButton button) {
            Intrinsics.checkNotNullParameter(button, "button");
            cancel();
            this.mode = PressedState.MODE_TAPPED;
            this.managedButton = button;
            RhNumberPicker.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = WhenMappings.$EnumSwitchMapping$1[this.mode.ordinal()];
            if (i == 1) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[this.managedButton.ordinal()];
                if (i2 == 1) {
                    this.incrementVirtualButtonPressed = true;
                    RhNumberPicker.this.invalidate();
                    return;
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                } else {
                    this.decrementVirtualButtonPressed = true;
                    RhNumberPicker.this.invalidate();
                    return;
                }
            }
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            int i3 = WhenMappings.$EnumSwitchMapping$0[this.managedButton.ordinal()];
            if (i3 == 1) {
                if (!this.incrementVirtualButtonPressed) {
                    RhNumberPicker.this.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                }
                this.incrementVirtualButtonPressed = !this.incrementVirtualButtonPressed;
                RhNumberPicker.this.invalidate();
                return;
            }
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (!this.decrementVirtualButtonPressed) {
                    RhNumberPicker.this.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                }
                this.decrementVirtualButtonPressed = !this.decrementVirtualButtonPressed;
                RhNumberPicker.this.invalidate();
            }
        }
    }

    /* compiled from: RhNumberPicker.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker$ChangeCurrentByOneFromLongPressCommand;", "Ljava/lang/Runnable;", "<init>", "(Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker;)V", "increment", "", "getIncrement", "()Z", "setIncrement", "(Z)V", "run", "", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public final class ChangeCurrentByOneFromLongPressCommand implements Runnable {
        private boolean increment;

        public ChangeCurrentByOneFromLongPressCommand() {
        }

        public final boolean getIncrement() {
            return this.increment;
        }

        public final void setIncrement(boolean z) {
            this.increment = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            RhNumberPicker.this.changeValueByOne(this.increment);
            RhNumberPicker rhNumberPicker = RhNumberPicker.this;
            rhNumberPicker.postDelayed(this, rhNumberPicker.getLongPressUpdateInterval());
        }
    }

    /* compiled from: RhNumberPicker.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pickers/RhNumberPicker$Companion;", "", "<init>", "()V", "DEFAULT_TOP_AREA_ITEM_COUNT", "", "DEFAULT_LONG_PRESS_UPDATE_INTERVAL", "", "SELECTOR_MAX_FLING_VELOCITY_ADJUSTMENT", "SELECTOR_ADJUSTMENT_DURATION_MILLIS", "SNAP_SCROLL_DURATION", "TOP_AND_BOTTOM_FADING_EDGE_STRENGTH", "", "SIZE_UNSPECIFIED", "formatNumberWithLocale", "", "value", "makeMeasureSpec", "measureSpec", "maxSize", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String formatNumberWithLocale(int value) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.getDefault(Locale.Category.FORMAT), "%d", Arrays.copyOf(new Object[]{Integer.valueOf(value)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int makeMeasureSpec(int measureSpec, int maxSize) {
            if (maxSize != -1) {
                int size = View.MeasureSpec.getSize(measureSpec);
                int mode = View.MeasureSpec.getMode(measureSpec);
                if (mode == Integer.MIN_VALUE) {
                    return View.MeasureSpec.makeMeasureSpec(Math.min(size, maxSize), 1073741824);
                }
                if (mode == 0) {
                    return View.MeasureSpec.makeMeasureSpec(maxSize, 1073741824);
                }
                if (mode != 1073741824) {
                    throw new IllegalArgumentException("Unknown measure mode: " + mode);
                }
            }
            return measureSpec;
        }
    }
}

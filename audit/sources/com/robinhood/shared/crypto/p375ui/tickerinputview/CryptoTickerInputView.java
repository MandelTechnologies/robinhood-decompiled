package com.robinhood.shared.crypto.p375ui.tickerinputview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.icu.text.DecimalFormatSymbols;
import android.icu.util.Currency;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.robinhood.android.navigation.compose.NavTransition2;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.shared.crypto.p375ui.tickerinputview.ColumnManager;
import com.robinhood.utils.extensions.ViewsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.bitbucket.cowwoc.diffmatchpatch.DiffMatchPatch;

/* compiled from: CryptoTickerInputView.kt */
@Metadata(m3635d1 = {"\u0000\u008f\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0019\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\f\n\u0002\b\u0003*\u0001$\b\u0007\u0018\u0000 X2\u00020\u00012\u00020\u0002:\u0002XYB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(H\u0014J\u0010\u0010)\u001a\u00020\u00172\u0006\u0010'\u001a\u00020*H\u0016J\"\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u000100H\u0014J\u0018\u00101\u001a\u00020,2\u0006\u00102\u001a\u00020\b2\u0006\u00103\u001a\u00020\bH\u0014J\u0010\u00104\u001a\u00020,2\u0006\u00105\u001a\u000206H\u0014J(\u00107\u001a\u00020,2\u0006\u00108\u001a\u00020\b2\u0006\u00109\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b2\u0006\u0010;\u001a\u00020\bH\u0014J\b\u0010<\u001a\u00020,H\u0016J\u0006\u0010=\u001a\u00020,J\u000e\u0010>\u001a\u00020,2\u0006\u0010?\u001a\u00020@J\u000e\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u00020@J$\u0010C\u001a\u00020,2\u0006\u0010D\u001a\u00020@2\b\u0010B\u001a\u0004\u0018\u00010@2\b\b\u0002\u0010E\u001a\u00020\u0017H\u0002J*\u0010F\u001a\b\u0012\u0004\u0012\u00020H0G2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020H0G2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020H0GH\u0002J\u001e\u0010K\u001a\b\u0012\u0004\u0012\u00020L0G2\u0006\u0010M\u001a\u00020@2\u0006\u0010N\u001a\u00020@H\u0002J\b\u0010O\u001a\u00020\bH\u0002J\b\u0010P\u001a\u00020\bH\u0002J\b\u0010Q\u001a\u00020,H\u0002J\u0018\u0010R\u001a\b\u0012\u0004\u0012\u00020H0G*\b\u0012\u0004\u0012\u00020H0GH\u0002J\u0018\u0010S\u001a\b\u0012\u0004\u0012\u00020L0G*\b\u0012\u0004\u0012\u00020H0GH\u0002J\u0018\u0010T\u001a\b\u0012\u0004\u0012\u00020L0G*\b\u0012\u0004\u0012\u00020L0GH\u0002J\u0018\u0010U\u001a\u00020@*\u00020@2\n\u0010V\u001a\u00020@\"\u00020WH\u0002R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R&\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b8\u0006@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u0017@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010%¨\u0006Z"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/tickerinputview/CryptoTickerInputView;", "Landroid/view/View;", "Lcom/robinhood/shared/crypto/ui/tickerinputview/ColumnManager$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "Landroid/graphics/Typeface;", "typeface", "getTypeface", "()Landroid/graphics/Typeface;", "setTypeface", "(Landroid/graphics/Typeface;)V", "textColor", "getTextColor", "()I", "setTextColor", "(I)V", "", "alignVerticallyCentered", "getAlignVerticallyCentered", "()Z", "setAlignVerticallyCentered", "(Z)V", "columnManager", "Lcom/robinhood/shared/crypto/ui/tickerinputview/ColumnManager;", "diffMatchPatch", "Lorg/bitbucket/cowwoc/diffmatchpatch/DiffMatchPatch;", "lastMeasuredDesiredWidth", "lastMeasuredDesiredHeight", "accessibilityDelegate", "com/robinhood/shared/crypto/ui/tickerinputview/CryptoTickerInputView$accessibilityDelegate$1", "Lcom/robinhood/shared/crypto/ui/tickerinputview/CryptoTickerInputView$accessibilityDelegate$1;", "dispatchHoverEvent", "event", "Landroid/view/MotionEvent;", "dispatchKeyEvent", "Landroid/view/KeyEvent;", "onFocusChanged", "", "gainFocus", "direction", "previouslyFocusedRect", "Landroid/graphics/Rect;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onSizeChanged", "w", "h", "oldw", "oldh", "onAnimationUpdate", "reset", "transitionTo", "charArray", "", "setValue", "newCharArray", NavTransition2.KEY_TRANSITION, "currentCharArray", "shouldAnimate", "merge", "", "Lorg/bitbucket/cowwoc/diffmatchpatch/DiffMatchPatch$Diff;", "diffs1", "diffs2", "operations", "Lcom/robinhood/shared/crypto/ui/tickerinputview/ColumnManager$Operation;", "fromArray", "toArray", "computeDesiredWidth", "computeDesiredHeight", "checkForRelayout", "flatten", "toOperations", "handleZero", "dropChars", "args", "", "Companion", "CurrencySymbolSide", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CryptoTickerInputView extends View implements ColumnManager.Callbacks {
    public static final float MAX_TEXT_SIZE = 300.0f;
    private final CryptoTickerInputView2 accessibilityDelegate;
    private boolean alignVerticallyCentered;
    private final ColumnManager columnManager;
    private final DiffMatchPatch diffMatchPatch;
    private int lastMeasuredDesiredHeight;
    private int lastMeasuredDesiredWidth;
    private int textColor;
    private Typeface typeface;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Lazy<DecimalFormatSymbols> symbols$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.crypto.ui.tickerinputview.CryptoTickerInputView$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CryptoTickerInputView.symbols_delegate$lambda$8();
        }
    });
    private static final Lazy<Set<Character>> CURRENCY_SYMBOL_SET$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.crypto.ui.tickerinputview.CryptoTickerInputView$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CryptoTickerInputView.CURRENCY_SYMBOL_SET_delegate$lambda$10();
        }
    });
    private static final Lazy<Character> PERCENT_SYMBOL$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.crypto.ui.tickerinputview.CryptoTickerInputView$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Character.valueOf(CryptoTickerInputView.PERCENT_SYMBOL_delegate$lambda$11());
        }
    });
    private static final Lazy<Character> DECIMAL_SEPARATOR$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.crypto.ui.tickerinputview.CryptoTickerInputView$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Character.valueOf(CryptoTickerInputView.DECIMAL_SEPARATOR_delegate$lambda$12());
        }
    });
    private static final Lazy<Character> GROUPING_SEPARATOR$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.crypto.ui.tickerinputview.CryptoTickerInputView$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Character.valueOf(CryptoTickerInputView.GROUPING_SEPARATOR_delegate$lambda$13());
        }
    });

    /* compiled from: CryptoTickerInputView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DiffMatchPatch.Operation.values().length];
            try {
                iArr[DiffMatchPatch.Operation.EQUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DiffMatchPatch.Operation.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DiffMatchPatch.Operation.INSERT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CryptoTickerInputView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CryptoTickerInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CryptoTickerInputView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r9v4, types: [androidx.core.view.AccessibilityDelegateCompat, com.robinhood.shared.crypto.ui.tickerinputview.CryptoTickerInputView$accessibilityDelegate$1] */
    @JvmOverloads
    public CryptoTickerInputView(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.textColor = -16777216;
        this.columnManager = new ColumnManager(300.0f, this, INSTANCE.getCURRENCY_SYMBOL_SET(), null, 8, null);
        this.diffMatchPatch = new DiffMatchPatch();
        ?? r9 = new ExploreByTouchHelper() { // from class: com.robinhood.shared.crypto.ui.tickerinputview.CryptoTickerInputView$accessibilityDelegate$1
            private final Rect bounds;

            @Override // androidx.customview.widget.ExploreByTouchHelper
            protected int getVirtualViewAt(float x, float y) {
                return 0;
            }

            @Override // androidx.customview.widget.ExploreByTouchHelper
            protected boolean onPerformActionForVirtualView(int virtualViewId, int action, Bundle arguments) {
                return false;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this.this$0);
                this.bounds = new Rect();
            }

            @Override // androidx.customview.widget.ExploreByTouchHelper
            protected void getVisibleVirtualViews(List<Integer> virtualViewIds) {
                if (virtualViewIds != null) {
                    virtualViewIds.add(0);
                }
            }

            public final Rect getBounds() {
                return this.bounds;
            }

            @Override // androidx.customview.widget.ExploreByTouchHelper
            protected void onPopulateNodeForVirtualView(int virtualViewId, AccessibilityNodeInfoCompat node) {
                Intrinsics.checkNotNullParameter(node, "node");
                this.this$0.checkForRelayout();
                node.setContentDescription(StringsKt.concatToString(this.this$0.columnManager.getCharArray()));
                node.setClassName(TextView.class.getName());
                node.setPackageName(context.getPackageName());
                node.setVisibleToUser(true);
                ViewsKt.getBounds(this.this$0, this.bounds);
                Rect rect = this.bounds;
                rect.bottom = rect.top + this.this$0.getMeasuredHeight();
                node.setBoundsInParent(this.bounds);
            }
        };
        this.accessibilityDelegate = r9;
        ViewCompat.setAccessibilityDelegate(this, r9);
    }

    public final Typeface getTypeface() {
        return this.typeface;
    }

    public final void setTypeface(Typeface typeface) {
        this.typeface = typeface;
        this.columnManager.setTypeface(typeface);
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final void setTextColor(int i) {
        this.textColor = i;
        this.columnManager.setTextColor(i);
    }

    public final boolean getAlignVerticallyCentered() {
        return this.alignVerticallyCentered;
    }

    public final void setAlignVerticallyCentered(boolean z) {
        this.alignVerticallyCentered = z;
        this.columnManager.setAlignVerticallyCentered(z);
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return dispatchHoverEvent(event) || super.dispatchHoverEvent(event);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return dispatchKeyEvent(event) || super.dispatchKeyEvent(event);
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        onFocusChanged(gainFocus, direction, previouslyFocusedRect);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        this.lastMeasuredDesiredWidth = Math.max(View.MeasureSpec.getSize(widthMeasureSpec), this.lastMeasuredDesiredWidth);
        int iMax = Math.max(computeDesiredHeight(), this.lastMeasuredDesiredHeight);
        this.lastMeasuredDesiredHeight = iMax;
        setMeasuredDimension(this.lastMeasuredDesiredWidth, iMax);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.columnManager.draw(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.columnManager.updateWidth(w);
    }

    @Override // com.robinhood.shared.crypto.ui.tickerinputview.ColumnManager.Callbacks
    public void onAnimationUpdate() {
        invalidate();
        checkForRelayout();
    }

    public final void reset() {
        this.columnManager.reset();
    }

    public final void transitionTo(char[] charArray) {
        Intrinsics.checkNotNullParameter(charArray, "charArray");
        if (Arrays.equals(charArray, this.columnManager.getCharArray())) {
            return;
        }
        transition$default(this, this.columnManager.getCharArray(), charArray, false, 4, null);
    }

    public final void setValue(final char[] newCharArray) {
        Intrinsics.checkNotNullParameter(newCharArray, "newCharArray");
        final char[] charArray = this.columnManager.getCharArray();
        if (Arrays.equals(newCharArray, charArray)) {
            return;
        }
        sendEventForVirtualView(0, 2);
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.robinhood.shared.crypto.ui.tickerinputview.CryptoTickerInputView$setValue$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    this.this$0.transition(charArray, newCharArray, false);
                }
            });
        } else {
            transition(charArray, newCharArray, false);
        }
    }

    static /* synthetic */ void transition$default(CryptoTickerInputView cryptoTickerInputView, char[] cArr, char[] cArr2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        cryptoTickerInputView.transition(cArr, cArr2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void transition(char[] currentCharArray, char[] newCharArray, boolean shouldAnimate) {
        CurrencySymbolSide currencySymbolSide;
        if (newCharArray == null) {
            return;
        }
        List<ColumnManager.Operation> listOperations = operations(currentCharArray, newCharArray);
        if (CollectionsKt.contains(INSTANCE.getCURRENCY_SYMBOL_SET(), ArraysKt.getOrNull(newCharArray, 0))) {
            currencySymbolSide = CurrencySymbolSide.LEFT;
        } else {
            currencySymbolSide = CurrencySymbolSide.RIGHT;
        }
        this.columnManager.apply(listOperations, shouldAnimate, currencySymbolSide);
    }

    private final List<DiffMatchPatch.Diff> merge(List<? extends DiffMatchPatch.Diff> diffs1, List<? extends DiffMatchPatch.Diff> diffs2) {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (i2 <= CollectionsKt.getLastIndex(diffs1) && i3 <= CollectionsKt.getLastIndex(diffs2)) {
            DiffMatchPatch.Diff diff = diffs1.get(i2);
            DiffMatchPatch.Diff diff2 = diffs2.get(i3);
            DiffMatchPatch.Operation operation2 = diff.f10819operation;
            int i4 = operation2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[operation2.ordinal()];
            if (i4 == 1) {
                DiffMatchPatch.Operation operation3 = diff2.f10819operation;
                i = operation3 != null ? WhenMappings.$EnumSwitchMapping$0[operation3.ordinal()] : -1;
                if (i == 1) {
                    arrayList.add(diff);
                } else if (i == 2) {
                    arrayList.add(diff2);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    arrayList.add(diff2);
                    i3++;
                }
                i2++;
                i3++;
            } else if (i4 != 2) {
                if (i4 != 3) {
                    arrayList.add(new DiffMatchPatch.Diff(DiffMatchPatch.Operation.EQUAL, diff.text));
                } else {
                    DiffMatchPatch.Operation operation4 = diff2.f10819operation;
                    i = operation4 != null ? WhenMappings.$EnumSwitchMapping$0[operation4.ordinal()] : -1;
                    if (i == 1) {
                        arrayList.add(diff);
                    } else if (i != 2) {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        arrayList.add(diff2);
                        i3++;
                    } else if (Intrinsics.areEqual(diff.text, diff2.text)) {
                        arrayList.add(new DiffMatchPatch.Diff(DiffMatchPatch.Operation.EQUAL, diff.text));
                    } else {
                        arrayList.add(diff);
                        i2++;
                    }
                }
                i2++;
                i3++;
            } else {
                DiffMatchPatch.Operation operation5 = diff2.f10819operation;
                i = operation5 != null ? WhenMappings.$EnumSwitchMapping$0[operation5.ordinal()] : -1;
                if (i == 1 || i == 2) {
                    arrayList.add(diff);
                    i2++;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (Intrinsics.areEqual(diff.text, diff2.text)) {
                        arrayList.add(new DiffMatchPatch.Diff(DiffMatchPatch.Operation.EQUAL, diff.text));
                        i2++;
                        i3++;
                    } else {
                        arrayList.add(diff);
                        i2++;
                    }
                }
            }
        }
        List<? extends DiffMatchPatch.Diff> listSubList = diffs1.subList(i2, diffs1.size());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listSubList) {
            if (((DiffMatchPatch.Diff) obj).f10819operation != DiffMatchPatch.Operation.EQUAL) {
                arrayList2.add(obj);
            }
        }
        List listPlus = CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2);
        List<? extends DiffMatchPatch.Diff> listSubList2 = diffs2.subList(i3, diffs2.size());
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listSubList2) {
            if (((DiffMatchPatch.Diff) obj2).f10819operation != DiffMatchPatch.Operation.EQUAL) {
                arrayList3.add(obj2);
            }
        }
        return CollectionsKt.plus((Collection) listPlus, (Iterable) arrayList3);
    }

    private final List<ColumnManager.Operation> operations(char[] fromArray, char[] toArray) {
        Companion companion = INSTANCE;
        char[] cArrDropChars = dropChars(fromArray, companion.getGROUPING_SEPARATOR());
        LinkedList<DiffMatchPatch.Diff> linkedListDiffMain = this.diffMatchPatch.diffMain(new String(fromArray), new String(cArrDropChars));
        Intrinsics.checkNotNullExpressionValue(linkedListDiffMain, "diffMain(...)");
        List<DiffMatchPatch.Diff> listFlatten = flatten(linkedListDiffMain);
        char[] cArrDropChars2 = dropChars(toArray, companion.getGROUPING_SEPARATOR());
        LinkedList<DiffMatchPatch.Diff> linkedListDiffMain2 = this.diffMatchPatch.diffMain(new String(cArrDropChars), new String(cArrDropChars2));
        Intrinsics.checkNotNullExpressionValue(linkedListDiffMain2, "diffMain(...)");
        List<DiffMatchPatch.Diff> listMerge = merge(listFlatten, flatten(linkedListDiffMain2));
        LinkedList<DiffMatchPatch.Diff> linkedListDiffMain3 = this.diffMatchPatch.diffMain(new String(cArrDropChars2), new String(toArray));
        Intrinsics.checkNotNullExpressionValue(linkedListDiffMain3, "diffMain(...)");
        return handleZero(toOperations(merge(listMerge, flatten(linkedListDiffMain3))));
    }

    private final int computeDesiredWidth() {
        return ((int) this.columnManager.getWidth()) + getPaddingLeft() + getPaddingRight();
    }

    private final int computeDesiredHeight() {
        return ((int) this.columnManager.getHeight()) + getPaddingTop() + getPaddingBottom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkForRelayout() {
        boolean z = this.lastMeasuredDesiredWidth != computeDesiredWidth();
        boolean z2 = this.lastMeasuredDesiredHeight != computeDesiredHeight();
        if (z || z2) {
            requestLayout();
        }
    }

    private final List<DiffMatchPatch.Diff> flatten(List<? extends DiffMatchPatch.Diff> list) {
        ArrayList arrayList = new ArrayList();
        for (DiffMatchPatch.Diff diff : list) {
            DiffMatchPatch.Operation operation2 = diff.f10819operation;
            String text = diff.text;
            Intrinsics.checkNotNullExpressionValue(text, "text");
            char[] charArray = text.toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
            ArrayList arrayList2 = new ArrayList(charArray.length);
            for (char c : charArray) {
                arrayList2.add(new DiffMatchPatch.Diff(operation2, String.valueOf(c)));
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        return CollectionsKt.toList(arrayList);
    }

    private final List<ColumnManager.Operation> toOperations(List<? extends DiffMatchPatch.Diff> list) {
        ColumnManager.Operation equal;
        List<? extends DiffMatchPatch.Diff> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (DiffMatchPatch.Diff diff : list2) {
            char cCharAt = diff.text.charAt(0);
            DiffMatchPatch.Operation operation2 = diff.f10819operation;
            int i = operation2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[operation2.ordinal()];
            if (i == 1) {
                equal = new ColumnManager.Operation.Equal(cCharAt);
            } else if (i == 2) {
                equal = new ColumnManager.Operation.Delete(cCharAt);
            } else {
                if (i != 3) {
                    throw new IllegalStateException(("should not happen: " + diff.f10819operation).toString());
                }
                Companion companion = INSTANCE;
                equal = new ColumnManager.Operation.Insert(cCharAt, (companion.getCURRENCY_SYMBOL_SET().contains(Character.valueOf(cCharAt)) || cCharAt == companion.getPERCENT_SYMBOL()) ? 48 : 80);
            }
            arrayList.add(equal);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<ColumnManager.Operation> handleZero(List<? extends ColumnManager.Operation> list) {
        ColumnManager.Operation.Transition transition;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ColumnManager.Operation operation2 = (ColumnManager.Operation) obj;
            ColumnManager.Operation operation3 = (ColumnManager.Operation) CollectionsKt.getOrNull(list, i2);
            if ((operation2 instanceof ColumnManager.Operation.Delete) && (operation3 instanceof ColumnManager.Operation.Insert)) {
                if (((ColumnManager.Operation.Delete) operation2).getChar() == '0') {
                    transition = ColumnManager.Operation.Transition.ENTER_BOTTOM;
                } else {
                    transition = ColumnManager.Operation.Transition.ENTER_TOP;
                }
                return CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) list.subList(0, i), (Iterable) CollectionsKt.listOf(new ColumnManager.Operation.Edit(((ColumnManager.Operation.Insert) operation3).getChar(), transition))), (Iterable) list.subList(i + 2, list.size()));
            }
            i = i2;
        }
        return list;
    }

    /* compiled from: CryptoTickerInputView.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0010\f\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0015\u0010\u0012R\u001b\u0010\u0017\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u0018\u0010\u0012R\u000e\u0010\u001a\u001a\u00020\u001bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/tickerinputview/CryptoTickerInputView$Companion;", "", "<init>", "()V", "symbols", "Landroid/icu/text/DecimalFormatSymbols;", "getSymbols", "()Landroid/icu/text/DecimalFormatSymbols;", "symbols$delegate", "Lkotlin/Lazy;", "CURRENCY_SYMBOL_SET", "", "", "getCURRENCY_SYMBOL_SET", "()Ljava/util/Set;", "CURRENCY_SYMBOL_SET$delegate", "PERCENT_SYMBOL", "getPERCENT_SYMBOL", "()C", "PERCENT_SYMBOL$delegate", "DECIMAL_SEPARATOR", "getDECIMAL_SEPARATOR", "DECIMAL_SEPARATOR$delegate", "GROUPING_SEPARATOR", "getGROUPING_SEPARATOR", "GROUPING_SEPARATOR$delegate", "MAX_TEXT_SIZE", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DecimalFormatSymbols getSymbols() {
            Object value = CryptoTickerInputView.symbols$delegate.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (DecimalFormatSymbols) value;
        }

        public final Set<Character> getCURRENCY_SYMBOL_SET() {
            return (Set) CryptoTickerInputView.CURRENCY_SYMBOL_SET$delegate.getValue();
        }

        public final char getPERCENT_SYMBOL() {
            return ((Character) CryptoTickerInputView.PERCENT_SYMBOL$delegate.getValue()).charValue();
        }

        public final char getDECIMAL_SEPARATOR() {
            return ((Character) CryptoTickerInputView.DECIMAL_SEPARATOR$delegate.getValue()).charValue();
        }

        public final char getGROUPING_SEPARATOR() {
            return ((Character) CryptoTickerInputView.GROUPING_SEPARATOR$delegate.getValue()).charValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DecimalFormatSymbols symbols_delegate$lambda$8() {
        return DecimalFormatSymbols.getInstance(CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set CURRENCY_SYMBOL_SET_delegate$lambda$10() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Currency currency = Currency.getInstance("USD");
        CurrencyFormatterLocale.Companion companion = CurrencyFormatterLocale.INSTANCE;
        String symbol = currency.getSymbol(companion.getInstance().getCryptoLocale());
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        char[] charArray = symbol.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        linkedHashSet.add(Character.valueOf(charArray[0]));
        String symbol2 = Currency.getInstance("EUR").getSymbol(companion.getInstance().getCryptoLocale());
        Intrinsics.checkNotNullExpressionValue(symbol2, "getSymbol(...)");
        char[] charArray2 = symbol2.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray2, "toCharArray(...)");
        linkedHashSet.add(Character.valueOf(charArray2[0]));
        for (char c = 'a'; c < '{'; c = (char) (c + 1)) {
            linkedHashSet.add(Character.valueOf(c));
        }
        for (char c2 = 'A'; c2 < '['; c2 = (char) (c2 + 1)) {
            linkedHashSet.add(Character.valueOf(c2));
        }
        linkedHashSet.add((char) 160);
        linkedHashSet.add((char) 8239);
        return linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final char PERCENT_SYMBOL_delegate$lambda$11() {
        return INSTANCE.getSymbols().getPercent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final char DECIMAL_SEPARATOR_delegate$lambda$12() {
        return INSTANCE.getSymbols().getMonetaryDecimalSeparator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final char GROUPING_SEPARATOR_delegate$lambda$13() {
        return INSTANCE.getSymbols().getMonetaryGroupingSeparator();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoTickerInputView.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/tickerinputview/CryptoTickerInputView$CurrencySymbolSide;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CurrencySymbolSide {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CurrencySymbolSide[] $VALUES;
        public static final CurrencySymbolSide LEFT = new CurrencySymbolSide("LEFT", 0);
        public static final CurrencySymbolSide RIGHT = new CurrencySymbolSide("RIGHT", 1);

        private static final /* synthetic */ CurrencySymbolSide[] $values() {
            return new CurrencySymbolSide[]{LEFT, RIGHT};
        }

        public static EnumEntries<CurrencySymbolSide> getEntries() {
            return $ENTRIES;
        }

        private CurrencySymbolSide(String str, int i) {
        }

        static {
            CurrencySymbolSide[] currencySymbolSideArr$values = $values();
            $VALUES = currencySymbolSideArr$values;
            $ENTRIES = EnumEntries2.enumEntries(currencySymbolSideArr$values);
        }

        public static CurrencySymbolSide valueOf(String str) {
            return (CurrencySymbolSide) Enum.valueOf(CurrencySymbolSide.class, str);
        }

        public static CurrencySymbolSide[] values() {
            return (CurrencySymbolSide[]) $VALUES.clone();
        }
    }

    private final char[] dropChars(char[] cArr, char... cArr2) {
        ArrayList arrayList = new ArrayList();
        for (char c : cArr) {
            if (!ArraysKt.contains(cArr2, c)) {
                arrayList.add(Character.valueOf(c));
            }
        }
        return CollectionsKt.toCharArray(arrayList);
    }
}

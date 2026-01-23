package com.robinhood.android.p273ui.transfers.ekiben.p274uk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.robinhood.android.navigation.compose.NavTransition2;
import com.robinhood.android.p273ui.transfers.ekiben.p274uk.ColumnManager;
import com.robinhood.android.tickerinputview.CharArrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bitbucket.cowwoc.diffmatchpatch.DiffMatchPatch;

/* compiled from: TickerInputView.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0019\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0001JB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\bH\u0014J\u0010\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020,H\u0014J(\u0010-\u001a\u00020'2\u0006\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\b2\u0006\u00101\u001a\u00020\bH\u0014J\b\u00102\u001a\u00020'H\u0016J\u000e\u00103\u001a\u00020'2\u0006\u00104\u001a\u000205J\u000e\u00106\u001a\u00020'2\u0006\u00107\u001a\u000205J$\u00108\u001a\u00020'2\u0006\u00109\u001a\u0002052\b\u00107\u001a\u0004\u0018\u0001052\b\b\u0002\u0010:\u001a\u00020\u001eH\u0002J*\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020=0<H\u0002J\u001e\u0010@\u001a\b\u0012\u0004\u0012\u00020A0<2\u0006\u0010B\u001a\u0002052\u0006\u0010C\u001a\u000205H\u0002J\b\u0010D\u001a\u00020\bH\u0002J\b\u0010E\u001a\u00020\bH\u0002J\b\u0010F\u001a\u00020'H\u0002J\u0018\u0010G\u001a\b\u0012\u0004\u0012\u00020=0<*\b\u0012\u0004\u0012\u00020=0<H\u0002J\u0018\u0010H\u001a\b\u0012\u0004\u0012\u00020A0<*\b\u0012\u0004\u0012\u00020=0<H\u0002J\u0018\u0010I\u001a\b\u0012\u0004\u0012\u00020A0<*\b\u0012\u0004\u0012\u00020A0<H\u0002R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R&\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b8\u0006@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%*\u0004\b \u0010!¨\u0006K"}, m3636d2 = {"Lcom/robinhood/android/ui/transfers/ekiben/uk/TickerInputView;", "Landroid/view/View;", "Lcom/robinhood/android/ui/transfers/ekiben/uk/ColumnManager$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "Landroid/graphics/Typeface;", "typeface", "getTypeface", "()Landroid/graphics/Typeface;", "setTypeface", "(Landroid/graphics/Typeface;)V", "textColor", "getTextColor", "()I", "setTextColor", "(I)V", "columnManager", "Lcom/robinhood/android/ui/transfers/ekiben/uk/ColumnManager;", "diffMatchPatch", "Lorg/bitbucket/cowwoc/diffmatchpatch/DiffMatchPatch;", "lastMeasuredDesiredWidth", "lastMeasuredDesiredHeight", "<set-?>", "", "useLegacyTextSizingAndLayout", "getUseLegacyTextSizingAndLayout$delegate", "(Lcom/robinhood/android/ui/transfers/ekiben/uk/TickerInputView;)Ljava/lang/Object;", "getUseLegacyTextSizingAndLayout", "()Z", "setUseLegacyTextSizingAndLayout", "(Z)V", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onSizeChanged", "w", "h", "oldw", "oldh", "onAnimationUpdate", "transitionTo", "charArray", "", "setValue", "newCharArray", NavTransition2.KEY_TRANSITION, "currentCharArray", "shouldAnimate", "merge", "", "Lorg/bitbucket/cowwoc/diffmatchpatch/DiffMatchPatch$Diff;", "diffs1", "diffs2", "operations", "Lcom/robinhood/android/ui/transfers/ekiben/uk/ColumnManager$Operation;", "fromArray", "toArray", "computeDesiredWidth", "computeDesiredHeight", "checkForRelayout", "flatten", "toOperations", "handleZero", "Companion", "lib-uk-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class TickerInputView extends View implements ColumnManager.Callbacks {
    public static final char DECIMAL_SEPARATOR = '.';
    public static final char GROUPING_SEPARATOR = ',';
    public static final float MAX_TEXT_SIZE = 300.0f;
    private final ColumnManager columnManager;
    private final DiffMatchPatch diffMatchPatch;
    private int lastMeasuredDesiredHeight;
    private int lastMeasuredDesiredWidth;
    private int textColor;
    private Typeface typeface;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Set<Character> CURRENCY_SYMBOLS = SetsKt.setOf((Object[]) new Character[]{Character.valueOf(com.robinhood.android.tickerinputview.TickerInputView.CURRENCY_SYMBOL), 163, 'S'});

    /* compiled from: TickerInputView.kt */
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
    public TickerInputView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TickerInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TickerInputView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TickerInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.textColor = -16777216;
        this.columnManager = new ColumnManager(300.0f, this, CURRENCY_SYMBOLS);
        this.diffMatchPatch = new DiffMatchPatch();
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

    public final boolean getUseLegacyTextSizingAndLayout() {
        return this.columnManager.getUseLegacyTextSizingAndLayout();
    }

    public final void setUseLegacyTextSizingAndLayout(boolean z) {
        this.columnManager.setUseLegacyTextSizingAndLayout(z);
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

    @Override // com.robinhood.android.ui.transfers.ekiben.uk.ColumnManager.Callbacks
    public void onAnimationUpdate() {
        invalidate();
        checkForRelayout();
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
        if (isLaidOut() && !isLayoutRequested()) {
            transition(charArray, newCharArray, false);
        } else {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.robinhood.android.ui.transfers.ekiben.uk.TickerInputView$setValue$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    this.this$0.transition(charArray, newCharArray, false);
                }
            });
        }
    }

    static /* synthetic */ void transition$default(TickerInputView tickerInputView, char[] cArr, char[] cArr2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        tickerInputView.transition(cArr, cArr2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void transition(char[] currentCharArray, char[] newCharArray, boolean shouldAnimate) {
        if (newCharArray == null) {
            return;
        }
        this.columnManager.apply(operations(currentCharArray, newCharArray), shouldAnimate);
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
        char[] cArrDropChars = CharArrays.dropChars(fromArray, ',');
        LinkedList<DiffMatchPatch.Diff> linkedListDiffMain = this.diffMatchPatch.diffMain(new String(fromArray), new String(cArrDropChars));
        Intrinsics.checkNotNullExpressionValue(linkedListDiffMain, "diffMain(...)");
        List<DiffMatchPatch.Diff> listFlatten = flatten(linkedListDiffMain);
        char[] cArrDropChars2 = CharArrays.dropChars(toArray, ',');
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

    private final void checkForRelayout() {
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
                equal = new ColumnManager.Operation.Insert(cCharAt, CURRENCY_SYMBOLS.contains(Character.valueOf(cCharAt)) ? 48 : 80);
            }
            arrayList.add(equal);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<ColumnManager.Operation> handleZero(List<? extends ColumnManager.Operation> list) {
        ColumnManager.Operation.Transition transition;
        ColumnManager.Operation operation2 = (ColumnManager.Operation) CollectionsKt.getOrNull(list, 0);
        if (((operation2 instanceof ColumnManager.Operation.Delete) || (operation2 instanceof ColumnManager.Operation.Insert)) && CURRENCY_SYMBOLS.contains(Character.valueOf(operation2.getChar()))) {
            return list;
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ColumnManager.Operation operation3 = (ColumnManager.Operation) obj;
            ColumnManager.Operation operation4 = (ColumnManager.Operation) CollectionsKt.getOrNull(list, i2);
            if ((operation3 instanceof ColumnManager.Operation.Delete) && (operation4 instanceof ColumnManager.Operation.Insert)) {
                if (((ColumnManager.Operation.Delete) operation3).getChar() == '0') {
                    transition = ColumnManager.Operation.Transition.ENTER_BOTTOM;
                } else {
                    transition = ColumnManager.Operation.Transition.ENTER_TOP;
                }
                return CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) list.subList(0, i), (Iterable) CollectionsKt.listOf(new ColumnManager.Operation.Edit(((ColumnManager.Operation.Insert) operation4).getChar(), transition))), (Iterable) list.subList(i + 2, list.size()));
            }
            i = i2;
        }
        return list;
    }

    /* compiled from: TickerInputView.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/ui/transfers/ekiben/uk/TickerInputView$Companion;", "", "<init>", "()V", "CURRENCY_SYMBOLS", "", "", "getCURRENCY_SYMBOLS", "()Ljava/util/Set;", "DECIMAL_SEPARATOR", "GROUPING_SEPARATOR", "MAX_TEXT_SIZE", "", "lib-uk-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Set<Character> getCURRENCY_SYMBOLS() {
            return TickerInputView.CURRENCY_SYMBOLS;
        }
    }
}

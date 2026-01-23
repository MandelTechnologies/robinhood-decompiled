package com.robinhood.android.designsystem.text;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.textview.MaterialTextView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.disposer.ViewScopedObservable;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.ThemeNode;
import com.robinhood.scarlet.view.DefStyleProvider;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import com.robinhood.utils.text.SpannablesKt;
import io.reactivex.Observable;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.Range2;
import kotlin.ranges.RangesKt;
import me.saket.bettermovementmethod.BetterLinkMovementMethod;

/* compiled from: RhTextView.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 92\u00020\u0001:\u00019B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\fJ\u001c\u0010\u000e\u001a\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011J\b\u0010\u001b\u001a\u00020\u000fH\u0014J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0007H\u0014J\u001c\u0010\u001f\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010$\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\u0012\u0010%\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\u0018\u0010\u000e\u001a\u00020\u00132\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0012H\u0002J\u001a\u0010)\u001a\u00020\u000f2\b\b\u0002\u0010*\u001a\u00020\u00132\b\b\u0002\u0010+\u001a\u00020\u0013J\u0018\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.H\u0016J\b\u00100\u001a\u00020\u0007H\u0016J\b\u00101\u001a\u00020\u0007H\u0016J\u0010\u00106\u001a\u00020\u000f2\u0006\u00107\u001a\u000208H\u0016R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R:\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00112\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u00102\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020503X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/designsystem/text/RhTextView;", "Lcom/google/android/material/textview/MaterialTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;I)V", "extraLineHeightPadding", "onLinkClick", "", "action", "Lkotlin/Function1;", "", "", "value", "setOnLinkClick", "(Lkotlin/jvm/functions/Function1;)V", "isStale", "()Z", "setStale", "(Z)V", "onAttachedToWindow", "onCreateDrawableState", "", "extraSpace", "setText", "text", "", "type", "Landroid/widget/TextView$BufferType;", "updateThemedColorSpans", "updateClickableSpans", "textView", "Landroid/widget/TextView;", "url", "setBetterLinkMovementMethod", "override", "longClickEnabled", "setLineSpacing", "add", "", "mult", "getCompoundPaddingTop", "getCompoundPaddingBottom", "weakClickableSpans", "Ljava/util/WeakHashMap;", "Landroid/text/style/ClickableSpan;", "Lcom/robinhood/android/designsystem/text/WeakReferenceClickableSpan;", "onInitializeAccessibilityNodeInfo", SduiFeatureDiscovery3.INFO_TAG, "Landroid/view/accessibility/AccessibilityNodeInfo;", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public class RhTextView extends MaterialTextView {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int[] STALE_STATE_ARRAY = {C13997R.attr.state_stale};
    private int extraLineHeightPadding;
    private boolean isStale;
    private Function1<? super String, Boolean> onLinkClick;
    private final WeakHashMap<ClickableSpan, WeakReferenceClickableSpan> weakClickableSpans;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode()) {
            int[] RhTextView = C13997R.styleable.RhTextView;
            Intrinsics.checkNotNullExpressionValue(RhTextView, "RhTextView");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RhTextView, i, 0);
            if (typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RhTextView_useLinkMovementMethod, false)) {
                setBetterLinkMovementMethod$default(this, false, false, 3, null);
            }
            int iCoerceIn = RangesKt.coerceIn(typedArrayObtainStyledAttributes.getDimensionPixelOffset(C13997R.styleable.RhTextView_shadowRadiusInDp, 0), (Range2<Integer>) new PrimitiveRanges2(0, 25));
            if (iCoerceIn != 0) {
                setShadowLayer(iCoerceIn, getShadowDx(), getShadowDy(), getShadowColor());
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.weakClickableSpans = new WeakHashMap<>();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RhTextView(Context context) {
        this(context, null, INSTANCE.getDefStyleAttr());
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RhTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, INSTANCE.getDefStyleAttr());
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RhTextView(Context context, int i) {
        this(context, null, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void onLinkClick(Function1<? super String, Boolean> action) {
        setOnLinkClick(action);
    }

    private final void setOnLinkClick(Function1<? super String, Boolean> function1) {
        if (Intrinsics.areEqual(this.onLinkClick, function1)) {
            return;
        }
        this.onLinkClick = function1;
        setBetterLinkMovementMethod$default(this, false, false, 3, null);
    }

    /* renamed from: isStale, reason: from getter */
    public final boolean getIsStale() {
        return this.isStale;
    }

    public final void setStale(boolean z) {
        if (this.isStale != z) {
            this.isStale = z;
            refreshDrawableState();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        Observable<ThemeNode> themeChanges;
        ViewScopedObservable viewScopedObservableBindTo$default;
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ScarletManager scarletManagerScarletManagerOrNull = ScarletManager2.scarletManagerOrNull(context);
        if (scarletManagerScarletManagerOrNull == null || (themeChanges = scarletManagerScarletManagerOrNull.getThemeChanges()) == null || (viewScopedObservableBindTo$default = ViewDisposerKt.bindTo$default(themeChanges, this, false, 2, null)) == null) {
            return;
        }
        viewScopedObservableBindTo$default.subscribeKotlin(new Function1() { // from class: com.robinhood.android.designsystem.text.RhTextView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhTextView.onAttachedToWindow$lambda$1(this.f$0, (ThemeNode) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$1(RhTextView rhTextView, ThemeNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhTextView.updateThemedColorSpans(rhTextView.getText());
        rhTextView.invalidate();
        return Unit.INSTANCE;
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int extraSpace) {
        if (this.isStale) {
            int[] iArr = STALE_STATE_ARRAY;
            int[] iArrOnCreateDrawableState = super.onCreateDrawableState(extraSpace + iArr.length);
            Intrinsics.checkNotNullExpressionValue(iArrOnCreateDrawableState, "onCreateDrawableState(...)");
            View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
            return iArrOnCreateDrawableState;
        }
        int[] iArrOnCreateDrawableState2 = super.onCreateDrawableState(extraSpace);
        Intrinsics.checkNotNullExpressionValue(iArrOnCreateDrawableState2, "onCreateDrawableState(...)");
        return iArrOnCreateDrawableState2;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence text, TextView.BufferType type2) {
        updateThemedColorSpans(text);
        updateClickableSpans(text);
        super.setText(text, type2);
    }

    private final void updateThemedColorSpans(CharSequence text) {
        if (text instanceof Spanned) {
            Resources.Theme theme = getContext().getTheme();
            Spanned spanned = (Spanned) text;
            for (ThemableColorSpans2 themableColorSpans2 : (ThemableColorSpans2[]) spanned.getSpans(0, spanned.length(), ThemableColorSpans2.class)) {
                Intrinsics.checkNotNull(theme);
                themableColorSpans2.update(theme);
            }
        }
    }

    private final void updateClickableSpans(CharSequence text) {
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            if (spanned.getSpans(0, spanned.length(), ClickableSpan.class).length == 0) {
                return;
            }
            setBetterLinkMovementMethod$default(this, false, false, 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onLinkClick(TextView textView, String url) {
        Function1<? super String, Boolean> function1;
        RhTextView rhTextView = textView instanceof RhTextView ? (RhTextView) textView : null;
        if (rhTextView != null && (function1 = rhTextView.onLinkClick) != null && function1.invoke(url).booleanValue()) {
            return true;
        }
        WebUtils webUtils = WebUtils.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return webUtils.handleUrl(context, url);
    }

    public static /* synthetic */ void setBetterLinkMovementMethod$default(RhTextView rhTextView, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBetterLinkMovementMethod");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        rhTextView.setBetterLinkMovementMethod(z, z2);
    }

    public final void setBetterLinkMovementMethod(boolean override, boolean longClickEnabled) {
        if (override || getMovementMethod() == null) {
            BetterLinkMovementMethod onLinkClickListener = BetterLinkMovementMethod.newInstance().setOnLinkClickListener(new BetterLinkMovementMethod.OnLinkClickListener() { // from class: com.robinhood.android.designsystem.text.RhTextView.setBetterLinkMovementMethod.1
                @Override // me.saket.bettermovementmethod.BetterLinkMovementMethod.OnLinkClickListener
                public final boolean onClick(TextView textView, String str) {
                    RhTextView rhTextView = RhTextView.this;
                    Intrinsics.checkNotNull(textView);
                    Intrinsics.checkNotNull(str);
                    return rhTextView.onLinkClick(textView, str);
                }
            });
            if (longClickEnabled) {
                onLinkClickListener.setOnLinkLongClickListener(new BetterLinkMovementMethod.OnLinkLongClickListener() { // from class: com.robinhood.android.designsystem.text.RhTextView$setBetterLinkMovementMethod$2$1
                    @Override // me.saket.bettermovementmethod.BetterLinkMovementMethod.OnLinkLongClickListener
                    public final boolean onLongClick(TextView textView, String str) {
                        RhTextView rhTextView = this.this$0;
                        Intrinsics.checkNotNull(textView);
                        Intrinsics.checkNotNull(str);
                        return rhTextView.onLinkClick(textView, str);
                    }
                });
            }
            setMovementMethod(onLinkClickListener);
            setFocusable(false);
            setClickable(false);
            setLongClickable(false);
        }
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float add, float mult) {
        super.setLineSpacing(add, mult);
        this.extraLineHeightPadding = MathKt.roundToInt(add / 2.0f);
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingTop() {
        return super.getCompoundPaddingTop() + this.extraLineHeightPadding;
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingBottom() {
        return super.getCompoundPaddingBottom() + this.extraLineHeightPadding;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        CharSequence text = info.getText();
        if (text != null) {
            int length = text.length();
            CharSequence text2 = getText();
            if (text2 == null || text2.length() == 0) {
                text2 = getHint();
            }
            CharSequence charSequenceSubSequence = text2.subSequence(0, RangesKt.coerceAtMost(text2.length(), length));
            if (charSequenceSubSequence instanceof Spanned) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceSubSequence);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class)) {
                    int spanFlags = spannableStringBuilder.getSpanFlags(obj);
                    if (spanFlags != 0) {
                        PrimitiveRanges2 spanRange = SpannablesKt.getSpanRange(spannableStringBuilder, obj);
                        Intrinsics.checkNotNull(spanRange);
                        WeakReferenceClickableSpan weakReferenceClickableSpan = (ClickableSpan) obj;
                        if (!(weakReferenceClickableSpan instanceof URLSpan)) {
                            linkedHashSet.add(weakReferenceClickableSpan);
                            WeakHashMap<ClickableSpan, WeakReferenceClickableSpan> weakHashMap = this.weakClickableSpans;
                            WeakReferenceClickableSpan weakReferenceClickableSpan2 = weakHashMap.get(weakReferenceClickableSpan);
                            if (weakReferenceClickableSpan2 == null) {
                                weakReferenceClickableSpan2 = new WeakReferenceClickableSpan(weakReferenceClickableSpan);
                                weakHashMap.put(weakReferenceClickableSpan, weakReferenceClickableSpan2);
                            }
                            weakReferenceClickableSpan = weakReferenceClickableSpan2;
                        }
                        if (!Intrinsics.areEqual(obj, weakReferenceClickableSpan)) {
                            if (weakReferenceClickableSpan != null) {
                                SpannablesKt.setSpan(spannableStringBuilder, weakReferenceClickableSpan, spanRange, spanFlags);
                            }
                            spannableStringBuilder.removeSpan(obj);
                        }
                    }
                }
                this.weakClickableSpans.keySet().retainAll(linkedHashSet);
                charSequenceSubSequence = spannableStringBuilder;
            }
            info.setText(charSequenceSubSequence);
        }
    }

    /* compiled from: RhTextView.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/designsystem/text/RhTextView$Companion;", "Lcom/robinhood/scarlet/view/DefStyleProvider;", "<init>", "()V", "STALE_STATE_ARRAY", "", "defStyleAttr", "", "getDefStyleAttr", "()I", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DefStyleProvider {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.scarlet.view.DefStyleProvider
        public int getDefStyleAttr() {
            return 0;
        }

        private Companion() {
        }

        @Override // com.robinhood.scarlet.view.DefStyleProvider
        public int getDefStyleRes() {
            return DefStyleProvider.DefaultImpls.getDefStyleRes(this);
        }
    }
}

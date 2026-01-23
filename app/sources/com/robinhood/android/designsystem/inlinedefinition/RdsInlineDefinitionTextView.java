package com.robinhood.android.designsystem.inlinedefinition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTooltipView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.text.SpannablesKt;
import io.noties.markwon.LinkResolverDef;
import io.noties.markwon.core.MarkwonTheme;
import io.noties.markwon.core.spans.LinkSpan;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: RdsInlineDefinitionTextView.kt */
@Metadata(m3635d1 = {"\u0000½\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001L\b\u0007\u0018\u0000 q2\u00020\u00012\u00020\u0002:\u0002pqB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QJ\u001e\u0010R\u001a\u00020O2\u0006\u0010S\u001a\u00020$2\u0006\u0010T\u001a\u00020$2\u0006\u0010U\u001a\u00020\u0010J\u0010\u0010V\u001a\u00020O2\u0006\u0010W\u001a\u00020XH\u0014J\b\u0010Y\u001a\u00020OH\u0016J\b\u0010Z\u001a\u00020OH\u0016J\f\u0010[\u001a\u00020O*\u00020QH\u0002J \u0010\\\u001a\u00020O2\u0006\u0010W\u001a\u00020X2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020`H\u0002J\u0018\u0010a\u001a\u00020O2\u0006\u0010b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010c\u001a\u00020OH\u0002J\u0010\u0010d\u001a\u00020\u00162\u0006\u0010e\u001a\u00020fH\u0002J\b\u0010g\u001a\u00020hH\u0002J\b\u0010i\u001a\u00020OH\u0002J\b\u0010j\u001a\u00020OH\u0002R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u00100\u001a\u0004\u0018\u0001018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u001d\u00104\u001a\u0004\u0018\u0001058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b6\u00107R\u000e\u0010:\u001a\u00020;X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010<\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u001b\u0010@\u001a\u0002018BX\u0083\u0084\u0002¢\u0006\f\n\u0004\bB\u00109\u001a\u0004\bA\u00103R\u001b\u0010C\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u00109\u001a\u0004\bE\u0010FR\u001b\u0010H\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u00109\u001a\u0004\bI\u0010FR\u0010\u0010K\u001a\u00020LX\u0082\u0004¢\u0006\u0004\n\u0002\u0010MR\u001a\u0010k\u001a\u0004\u0018\u00010l*\u00020m8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bn\u0010o¨\u0006r"}, m3636d2 = {"Lcom/robinhood/android/designsystem/inlinedefinition/RdsInlineDefinitionTextView;", "Lcom/robinhood/android/designsystem/text/RhTextView;", "Lcom/robinhood/android/designsystem/inlinedefinition/RdsInlineDefinitionTooltipView$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "config", "Lcom/robinhood/android/designsystem/inlinedefinition/RdsInlineDefinitionConfig;", "getConfig", "()Lcom/robinhood/android/designsystem/inlinedefinition/RdsInlineDefinitionConfig;", "setConfig", "(Lcom/robinhood/android/designsystem/inlinedefinition/RdsInlineDefinitionConfig;)V", "value", "", "delimiter", "getDelimiter", "()Ljava/lang/String;", "setDelimiter", "(Ljava/lang/String;)V", "", "shouldDimBackground", "getShouldDimBackground", "()Z", "setShouldDimBackground", "(Z)V", "Lcom/robinhood/android/designsystem/inlinedefinition/RdsInlineDefinitionTextView$Callbacks;", "callbacks", "getCallbacks", "()Lcom/robinhood/android/designsystem/inlinedefinition/RdsInlineDefinitionTextView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/designsystem/inlinedefinition/RdsInlineDefinitionTextView$Callbacks;)V", "isShowTooltipAnimating", "selectedWordSpanStart", "", "selectedWordSpanEnd", "smallTextSize", "mediumTextSize", "underlineSpacing", "", "underlineVerticalPaddingSmall", "underlineVerticalPaddingMedium", "underlineVerticalPadding", "underlineStrokeWidth", "theme", "Lio/noties/markwon/core/MarkwonTheme;", "decorView", "Landroid/widget/FrameLayout;", "getDecorView", "()Landroid/widget/FrameLayout;", "definitionTooltipView", "Lcom/robinhood/android/designsystem/inlinedefinition/RdsInlineDefinitionTooltipView;", "getDefinitionTooltipView", "()Lcom/robinhood/android/designsystem/inlinedefinition/RdsInlineDefinitionTooltipView;", "definitionTooltipView$delegate", "Lkotlin/Lazy;", "underlinePath", "Landroid/graphics/Path;", "dottedUnderlinePaint", "Landroid/graphics/Paint;", "getDottedUnderlinePaint", "()Landroid/graphics/Paint;", "dimmedLayout", "getDimmedLayout", "dimmedLayout$delegate", "dimmedLayoutParams", "Landroid/widget/FrameLayout$LayoutParams;", "getDimmedLayoutParams", "()Landroid/widget/FrameLayout$LayoutParams;", "dimmedLayoutParams$delegate", "definitionTooltipLayoutParams", "getDefinitionTooltipLayoutParams", "definitionTooltipLayoutParams$delegate", "linkResolver", "com/robinhood/android/designsystem/inlinedefinition/RdsInlineDefinitionTextView$linkResolver$1", "Lcom/robinhood/android/designsystem/inlinedefinition/RdsInlineDefinitionTextView$linkResolver$1;", "setSpannableString", "", "text", "Landroid/text/SpannableString;", "setInlineDefinitionSpan", "spanStart", "spanEnd", "definition", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onLinkClicked", "onCloseClicked", "replaceLinksWithInlineDefinitions", "drawSpanDottedUnderline", "spannableString", "Landroid/text/Spannable;", "span", "Lcom/robinhood/android/designsystem/inlinedefinition/RdsInlineDefinitionSpan;", "showInlineDefinitionTooltip", "delimitedDefinition", "hideInlineDefinition", "isPointInsideDefinitionTextView", "point", "Landroid/graphics/Point;", "calculateTooltipRect", "Landroid/graphics/Rect;", "boldSelectedWord", "undoBoldSelectedWord", "parentViewGroup", "Landroid/view/ViewGroup;", "Landroid/view/View;", "getParentViewGroup", "(Landroid/view/View;)Landroid/view/ViewGroup;", "Callbacks", "Companion", "lib-design-system-inline-definition_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RdsInlineDefinitionTextView extends RhTextView implements RdsInlineDefinitionTooltipView.Callbacks {
    private static final float DIMMED_OPACITY = 0.7f;
    private static final float MAX_OPACITY = 1.0f;
    private static final float MIN_OPACITY = 0.0f;
    private RdsInlineDefinitionConfig config;

    /* renamed from: definitionTooltipLayoutParams$delegate, reason: from kotlin metadata */
    private final Lazy definitionTooltipLayoutParams;

    /* renamed from: definitionTooltipView$delegate, reason: from kotlin metadata */
    private final Lazy definitionTooltipView;

    /* renamed from: dimmedLayout$delegate, reason: from kotlin metadata */
    @SuppressLint({"ClickableViewAccessibility"})
    private final Lazy dimmedLayout;

    /* renamed from: dimmedLayoutParams$delegate, reason: from kotlin metadata */
    private final Lazy dimmedLayoutParams;
    private boolean isShowTooltipAnimating;
    private final RdsInlineDefinitionTextView3 linkResolver;
    private final int mediumTextSize;
    private int selectedWordSpanEnd;
    private int selectedWordSpanStart;
    private final int smallTextSize;
    private final MarkwonTheme theme;
    private final Path underlinePath;
    private final float underlineSpacing;
    private final float underlineStrokeWidth;
    private final float underlineVerticalPadding;
    private final float underlineVerticalPaddingMedium;
    private final float underlineVerticalPaddingSmall;
    public static final int $stable = 8;

    /* compiled from: RdsInlineDefinitionTextView.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/designsystem/inlinedefinition/RdsInlineDefinitionTextView$Callbacks;", "", "onShowDefinition", "", "onHideDefinition", "lib-design-system-inline-definition_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onHideDefinition();

        void onShowDefinition();
    }

    private final void replaceLinksWithInlineDefinitions(SpannableString spannableString) {
        SpannableString spannableString2;
        LinkSpan[] linkSpanArr = (LinkSpan[]) spannableString.getSpans(0, spannableString.length(), LinkSpan.class);
        int length = linkSpanArr.length;
        int i = 0;
        while (i < length) {
            LinkSpan linkSpan = linkSpanArr[i];
            String link = linkSpan.getLink();
            Intrinsics.checkNotNullExpressionValue(link, "getLink(...)");
            if (StringsKt.startsWith$default(link, getDelimiter(), false, 2, (Object) null)) {
                PrimitiveRanges2 spanRange = SpannablesKt.getSpanRange(spannableString, linkSpan);
                Intrinsics.checkNotNull(spanRange);
                MarkwonTheme markwonTheme = this.theme;
                String link2 = linkSpan.getLink();
                Intrinsics.checkNotNullExpressionValue(link2, "getLink(...)");
                RdsInlineDefinitionSpan rdsInlineDefinitionSpan = new RdsInlineDefinitionSpan(markwonTheme, link2, this.linkResolver);
                spannableString2 = spannableString;
                SpannablesKt.setSpan$default(spannableString2, rdsInlineDefinitionSpan, spanRange, 0, 4, null);
                spannableString2.removeSpan(linkSpan);
                for (Object obj : SpannablesKt.getSpans(spannableString2, StyleSpan.class, spanRange.getFirst(), spanRange.getLast())) {
                    spannableString2.removeSpan((StyleSpan) obj);
                }
            } else {
                spannableString2 = spannableString;
            }
            i++;
            spannableString = spannableString2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r8v6, types: [com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView$linkResolver$1] */
    public RdsInlineDefinitionTextView(final Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.config = new RdsInlineDefinitionConfig(null, false, null, 7, null);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C13997R.dimen.text_size_mobius_regular_small);
        this.smallTextSize = dimensionPixelSize;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C13997R.dimen.text_size_mobius_regular_medium);
        this.mediumTextSize = dimensionPixelSize2;
        this.underlineSpacing = context.getResources().getDimension(C13997R.dimen.rds_spacing_xxsmall);
        float dimension = context.getResources().getDimension(C14010R.dimen.rds_inline_definition_underline_vertical_padding_small);
        this.underlineVerticalPaddingSmall = dimension;
        float dimension2 = context.getResources().getDimension(C14010R.dimen.rds_inline_definition_underline_vertical_padding_medium);
        this.underlineVerticalPaddingMedium = dimension2;
        int textSize = (int) getPaint().getTextSize();
        if (textSize != dimensionPixelSize && textSize == dimensionPixelSize2) {
            dimension = dimension2;
        }
        this.underlineVerticalPadding = dimension;
        this.underlineStrokeWidth = context.getResources().getDimension(C14010R.dimen.rds_inline_definition_underline_stroke_width);
        MarkwonTheme markwonThemeCreate = MarkwonTheme.create(context);
        Intrinsics.checkNotNullExpressionValue(markwonThemeCreate, "create(...)");
        this.theme = markwonThemeCreate;
        this.definitionTooltipView = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RdsInlineDefinitionTextView.definitionTooltipView_delegate$lambda$2(this.f$0);
            }
        });
        this.underlinePath = new Path();
        this.dimmedLayout = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RdsInlineDefinitionTextView.dimmedLayout_delegate$lambda$5(context, this);
            }
        });
        this.dimmedLayoutParams = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RdsInlineDefinitionTextView.dimmedLayoutParams_delegate$lambda$6(this.f$0);
            }
        });
        this.definitionTooltipLayoutParams = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RdsInlineDefinitionTextView.definitionTooltipLayoutParams_delegate$lambda$7();
            }
        });
        this.linkResolver = new LinkResolverDef() { // from class: com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView$linkResolver$1
            @Override // io.noties.markwon.LinkResolverDef, io.noties.markwon.LinkResolver
            public void resolve(View view, String link) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(link, "link");
                if (StringsKt.startsWith$default(link, this.this$0.getDelimiter(), false, 2, (Object) null)) {
                    RdsInlineDefinitionTextView rdsInlineDefinitionTextView = this.this$0;
                    rdsInlineDefinitionTextView.showInlineDefinitionTooltip(link, rdsInlineDefinitionTextView.getDelimiter());
                } else {
                    super.resolve(view, link);
                }
            }
        };
        setMovementMethod(new LinkMovementMethod());
    }

    public final RdsInlineDefinitionConfig getConfig() {
        return this.config;
    }

    public final void setConfig(RdsInlineDefinitionConfig rdsInlineDefinitionConfig) {
        Intrinsics.checkNotNullParameter(rdsInlineDefinitionConfig, "<set-?>");
        this.config = rdsInlineDefinitionConfig;
    }

    public final String getDelimiter() {
        return this.config.getDelimiter();
    }

    public final void setDelimiter(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.config = RdsInlineDefinitionConfig.copy$default(this.config, value, false, null, 6, null);
    }

    public final boolean getShouldDimBackground() {
        return this.config.getShouldDimBackground();
    }

    public final void setShouldDimBackground(boolean z) {
        this.config = RdsInlineDefinitionConfig.copy$default(this.config, null, z, null, 5, null);
    }

    public final Callbacks getCallbacks() {
        return this.config.getCallbacks();
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.config = RdsInlineDefinitionConfig.copy$default(this.config, null, false, callbacks, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FrameLayout getDecorView() {
        View decorView = Views.baseActivity(this).getWindow().getDecorView();
        if (decorView instanceof FrameLayout) {
            return (FrameLayout) decorView;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RdsInlineDefinitionTooltipView getDefinitionTooltipView() {
        return (RdsInlineDefinitionTooltipView) this.definitionTooltipView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RdsInlineDefinitionTooltipView definitionTooltipView_delegate$lambda$2(RdsInlineDefinitionTextView rdsInlineDefinitionTextView) {
        ViewGroup parentViewGroup = rdsInlineDefinitionTextView.getParentViewGroup(rdsInlineDefinitionTextView);
        if (parentViewGroup == null) {
            return null;
        }
        RdsInlineDefinitionTooltipView rdsInlineDefinitionTooltipViewInflate = RdsInlineDefinitionTooltipView.INSTANCE.inflate(parentViewGroup);
        rdsInlineDefinitionTooltipViewInflate.setCallbacks(rdsInlineDefinitionTextView);
        return rdsInlineDefinitionTooltipViewInflate;
    }

    private final Paint getDottedUnderlinePaint() {
        Paint paint = new Paint(1);
        paint.setColor(getLinkTextColors().getDefaultColor());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.underlineStrokeWidth);
        float f = this.underlineSpacing;
        paint.setPathEffect(new DashPathEffect(new float[]{f, f}, 0.0f));
        return paint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FrameLayout getDimmedLayout() {
        return (FrameLayout) this.dimmedLayout.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FrameLayout dimmedLayout_delegate$lambda$5(Context context, final RdsInlineDefinitionTextView rdsInlineDefinitionTextView) {
        View viewInflate = ContextSystemServices.getLayoutInflater(context).inflate(C14010R.layout.include_rds_inline_definition_dimmed_layout, rdsInlineDefinitionTextView.getParentViewGroup(rdsInlineDefinitionTextView), false);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView$dimmedLayout$2$1$1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0 && motionEvent.getAction() != 1) {
                    return false;
                }
                if (this.this$0.isPointInsideDefinitionTextView(new Point(MathKt.roundToInt(motionEvent.getRawX()), MathKt.roundToInt(motionEvent.getRawY())))) {
                    return false;
                }
                this.this$0.hideInlineDefinition();
                return false;
            }
        });
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FrameLayout.LayoutParams getDimmedLayoutParams() {
        return (FrameLayout.LayoutParams) this.dimmedLayoutParams.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FrameLayout.LayoutParams dimmedLayoutParams_delegate$lambda$6(RdsInlineDefinitionTextView rdsInlineDefinitionTextView) {
        View decorView = Views.baseActivity(rdsInlineDefinitionTextView).getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        return new FrameLayout.LayoutParams(-1, decorView.getHeight() - decorView.getRootWindowInsets().getStableInsetBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FrameLayout.LayoutParams getDefinitionTooltipLayoutParams() {
        return (FrameLayout.LayoutParams) this.definitionTooltipLayoutParams.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FrameLayout.LayoutParams definitionTooltipLayoutParams_delegate$lambda$7() {
        return new FrameLayout.LayoutParams(-1, -2);
    }

    public final void setSpannableString(SpannableString text) {
        Intrinsics.checkNotNullParameter(text, "text");
        replaceLinksWithInlineDefinitions(text);
        super.setText(text);
    }

    public final void setInlineDefinitionSpan(int spanStart, int spanEnd, String definition) {
        Intrinsics.checkNotNullParameter(definition, "definition");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        spannableStringBuilder.setSpan(new RdsInlineDefinitionSpan(this.theme, getDelimiter() + definition, this.linkResolver), spanStart, spanEnd, 17);
        super.setText(spannableStringBuilder);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        CharSequence text = getText();
        SpannableString spannableString = text instanceof SpannableString ? (SpannableString) text : null;
        if (spannableString == null) {
            return;
        }
        for (Object obj : SpannablesKt.getSpans(spannableString, RdsInlineDefinitionSpan.class, 0, getText().length())) {
            drawSpanDottedUnderline(canvas, spannableString, (RdsInlineDefinitionSpan) obj);
        }
    }

    @Override // com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTooltipView.Callbacks
    public void onLinkClicked() {
        hideInlineDefinition();
    }

    @Override // com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTooltipView.Callbacks
    public void onCloseClicked() {
        hideInlineDefinition();
    }

    private final void drawSpanDottedUnderline(Canvas canvas, Spannable spannableString, RdsInlineDefinitionSpan span) {
        int spanStart = spannableString.getSpanStart(span);
        int spanEnd = spannableString.getSpanEnd(span);
        int lineForOffset = getLayout().getLineForOffset(spanStart);
        int lineForOffset2 = getLayout().getLineForOffset(spanEnd);
        if (lineForOffset > lineForOffset2) {
            return;
        }
        while (true) {
            int lineStart = getLayout().getLineStart(lineForOffset);
            int lineEnd = getLayout().getLineEnd(lineForOffset);
            int lineBaseline = getLayout().getLineBaseline(lineForOffset);
            float fMeasureText = spanStart > lineStart ? getPaint().measureText(getText(), lineStart, spanStart) : 0.0f;
            float fMeasureText2 = getPaint().measureText(getText(), RangesKt.coerceAtLeast(lineStart, spanStart), RangesKt.coerceAtMost(lineEnd, spanEnd));
            this.underlinePath.reset();
            float f = lineBaseline;
            this.underlinePath.moveTo(fMeasureText, this.underlineVerticalPadding + f);
            this.underlinePath.lineTo(fMeasureText + fMeasureText2, f + this.underlineVerticalPadding);
            canvas.drawPath(this.underlinePath, getDottedUnderlinePaint());
            if (lineForOffset == lineForOffset2) {
                return;
            } else {
                lineForOffset++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void showInlineDefinitionTooltip(String delimitedDefinition, String delimiter) {
        int iIntValue;
        int i;
        ViewGroup parentViewGroup;
        WindowInsets rootWindowInsets;
        Object obj = null;
        String strSubstringAfter$default = StringsKt.substringAfter$default(delimitedDefinition, delimiter, (String) null, 2, (Object) null);
        RdsInlineDefinitionTooltipView definitionTooltipView = getDefinitionTooltipView();
        if (definitionTooltipView != null) {
            definitionTooltipView.setText(strSubstringAfter$default);
        }
        FrameLayout decorView = getDecorView();
        if (decorView != null) {
            int width = (decorView.getWidth() - decorView.getPaddingStart()) - decorView.getPaddingEnd();
            ViewGroup.LayoutParams layoutParams = decorView.getLayoutParams();
            int marginStart = width - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
            ViewGroup.LayoutParams layoutParams2 = decorView.getLayoutParams();
            int marginEnd = marginStart - (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0);
            RdsInlineDefinitionTooltipView definitionTooltipView2 = getDefinitionTooltipView();
            Integer numValueOf = definitionTooltipView2 != null ? Integer.valueOf(definitionTooltipView2.calculateHeight(marginEnd)) : null;
            iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        }
        CharSequence text = getText();
        Intrinsics.checkNotNull(text, "null cannot be cast to non-null type android.text.SpannableString");
        SpannableString spannableString = (SpannableString) text;
        Object[] spans$default = SpannablesKt.getSpans$default(spannableString, LinkSpan.class, 0, 0, 6, null);
        int length = spans$default.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            Object obj2 = spans$default[i2];
            if (Intrinsics.areEqual(((LinkSpan) obj2).getURL(), delimitedDefinition)) {
                obj = obj2;
                break;
            }
            i2++;
        }
        LinkSpan linkSpan = (LinkSpan) obj;
        this.selectedWordSpanStart = spannableString.getSpanStart(linkSpan);
        this.selectedWordSpanEnd = spannableString.getSpanEnd(linkSpan);
        Rect rectCalculateTooltipRect = calculateTooltipRect();
        int i3 = rectCalculateTooltipRect.bottom + iIntValue;
        FrameLayout decorView2 = getDecorView();
        int height = decorView2 != null ? decorView2.getHeight() : 0;
        FrameLayout decorView3 = getDecorView();
        int stableInsetBottom = height - ((decorView3 == null || (rootWindowInsets = decorView3.getRootWindowInsets()) == null) ? 0 : rootWindowInsets.getStableInsetBottom());
        boolean z = stableInsetBottom > 0 && i3 < stableInsetBottom;
        FrameLayout.LayoutParams definitionTooltipLayoutParams = getDefinitionTooltipLayoutParams();
        if (z) {
            i = rectCalculateTooltipRect.bottom;
        } else {
            i = rectCalculateTooltipRect.top - iIntValue;
        }
        definitionTooltipLayoutParams.topMargin = i;
        RdsInlineDefinitionTooltipView definitionTooltipView3 = getDefinitionTooltipView();
        if (definitionTooltipView3 != null && (parentViewGroup = getParentViewGroup(definitionTooltipView3)) != null) {
            parentViewGroup.removeView(getDefinitionTooltipView());
        }
        ViewGroup parentViewGroup2 = getParentViewGroup(getDimmedLayout());
        if (parentViewGroup2 != null) {
            parentViewGroup2.removeView(getDimmedLayout());
        }
        Property property = View.ALPHA;
        Set setMutableSetOf = SetsKt.mutableSetOf(ObjectAnimator.ofFloat(getDefinitionTooltipView(), (Property<RdsInlineDefinitionTooltipView, Float>) property, 0.0f, 1.0f));
        if (getShouldDimBackground()) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getDimmedLayout(), (Property<FrameLayout, Float>) property, 0.0f, DIMMED_OPACITY);
            Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(...)");
            setMutableSetOf.add(objectAnimatorOfFloat);
        } else {
            getDimmedLayout().setAlpha(0.0f);
        }
        boldSelectedWord();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(setMutableSetOf);
        Unit unit = Unit.INSTANCE;
        animatorSet.setDuration(350L);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView$showInlineDefinitionTooltip$lambda$16$lambda$15$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                FrameLayout decorView4 = this.this$0.getDecorView();
                if (decorView4 != null) {
                    decorView4.addView(this.this$0.getDimmedLayout(), this.this$0.getDimmedLayoutParams());
                }
                FrameLayout decorView5 = this.this$0.getDecorView();
                if (decorView5 != null) {
                    decorView5.addView(this.this$0.getDefinitionTooltipView(), this.this$0.getDefinitionTooltipLayoutParams());
                }
                this.this$0.isShowTooltipAnimating = true;
            }
        });
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView$showInlineDefinitionTooltip$lambda$16$lambda$15$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                this.this$0.isShowTooltipAnimating = false;
            }
        });
        animatorSet.start();
        Callbacks callbacks = getCallbacks();
        if (callbacks != null) {
            callbacks.onShowDefinition();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideInlineDefinition() {
        Property property = View.ALPHA;
        Set setMutableSetOf = SetsKt.mutableSetOf(ObjectAnimator.ofFloat(getDefinitionTooltipView(), (Property<RdsInlineDefinitionTooltipView, Float>) property, 1.0f, 0.0f));
        if (getShouldDimBackground()) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getDimmedLayout(), (Property<FrameLayout, Float>) property, DIMMED_OPACITY, 0.0f);
            Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(...)");
            setMutableSetOf.add(objectAnimatorOfFloat);
        }
        undoBoldSelectedWord();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(setMutableSetOf);
        Unit unit = Unit.INSTANCE;
        animatorSet.setDuration(350L);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView$hideInlineDefinition$lambda$19$lambda$18$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ViewGroup parentViewGroup;
                if (this.this$0.isShowTooltipAnimating) {
                    return;
                }
                RdsInlineDefinitionTooltipView definitionTooltipView = this.this$0.getDefinitionTooltipView();
                if (definitionTooltipView != null && (parentViewGroup = this.this$0.getParentViewGroup(definitionTooltipView)) != null) {
                    parentViewGroup.removeView(this.this$0.getDefinitionTooltipView());
                }
                RdsInlineDefinitionTextView rdsInlineDefinitionTextView = this.this$0;
                ViewGroup parentViewGroup2 = rdsInlineDefinitionTextView.getParentViewGroup(rdsInlineDefinitionTextView.getDimmedLayout());
                if (parentViewGroup2 != null) {
                    parentViewGroup2.removeView(this.this$0.getDimmedLayout());
                }
            }
        });
        animatorSet.start();
        Callbacks callbacks = getCallbacks();
        if (callbacks != null) {
            callbacks.onHideDefinition();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPointInsideDefinitionTextView(Point point) {
        Rect rect = new Rect();
        RdsInlineDefinitionTooltipView definitionTooltipView = getDefinitionTooltipView();
        if (definitionTooltipView != null) {
            definitionTooltipView.getDrawingRect(rect);
        }
        int[] iArr = new int[2];
        RdsInlineDefinitionTooltipView definitionTooltipView2 = getDefinitionTooltipView();
        if (definitionTooltipView2 != null) {
            definitionTooltipView2.getLocationOnScreen(iArr);
        }
        rect.offset(iArr[0], iArr[1]);
        return rect.contains(point.x, point.y);
    }

    private final Rect calculateTooltipRect() {
        Rect rect = new Rect();
        Layout layout = getLayout();
        if (layout != null) {
            layout.getLineBounds(layout.getLineForOffset(this.selectedWordSpanEnd), rect);
        }
        Rect rect2 = new Rect();
        getGlobalVisibleRect(rect2);
        int i = rect2.top;
        int compoundPaddingTop = getCompoundPaddingTop() + i;
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i2 = iArr[1];
        if (i > i2) {
            compoundPaddingTop -= i - i2;
        }
        rect.top += compoundPaddingTop;
        rect.bottom += compoundPaddingTop;
        return rect;
    }

    private final void boldSelectedWord() {
        CharSequence text = getText();
        Intrinsics.checkNotNull(text, "null cannot be cast to non-null type android.text.SpannableString");
        SpannableString spannableString = (SpannableString) text;
        spannableString.setSpan(new StyleSpan(1), this.selectedWordSpanStart, this.selectedWordSpanEnd, 17);
        setText(spannableString);
    }

    private final void undoBoldSelectedWord() {
        CharSequence text = getText();
        Intrinsics.checkNotNull(text, "null cannot be cast to non-null type android.text.SpannableString");
        SpannableString spannableString = (SpannableString) text;
        StyleSpan[] styleSpanArr = (StyleSpan[]) spannableString.getSpans(this.selectedWordSpanStart, this.selectedWordSpanEnd, StyleSpan.class);
        Intrinsics.checkNotNull(styleSpanArr);
        for (StyleSpan styleSpan : styleSpanArr) {
            spannableString.removeSpan(styleSpan);
        }
        setText(spannableString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewGroup getParentViewGroup(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }
}

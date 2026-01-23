package com.withpersona.sdk2.inquiry.steps.p423ui.styling;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import androidx.core.widget.TextViewCompat;
import com.robinhood.compose.bento.component.rows.Timeline;
import com.robinhood.utils.extensions.ResourceTypes;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle2;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UtilsKt;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.remoteFonts.FontDownloader;
import com.withpersona.sdk2.inquiry.steps.p423ui.view.ViewUtils5;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TextStyling.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u001a4\u0010\b\u001a\u00020\u0001*\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e\u001a2\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000eH\u0002\u001a\u0014\u0010\u0011\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0007\u001a\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\fH\u0003\u001a\u0012\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016¨\u0006\u0017"}, m3636d2 = {ResourceTypes.STYLE, "", "Landroid/widget/TextView;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;", "excludedStyleElements", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/TextStyleElements;", "setTypeface", "fontName", "", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "onRemoteFontDownloaded", "Lkotlin/Function1;", "Landroid/graphics/Typeface;", "setTextTypeface", "setFontWeight", "getFontWeightValue", "", "setTextJustification", "justification", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class TextStyling2 {

    /* compiled from: TextStyling.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[StyleElements.FontWeight.values().length];
            try {
                iArr[StyleElements.FontWeight.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleElements.FontWeight.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyleElements.FontWeight.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StyleElements.FontWeight.BOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StyleElements.FontWeight.HEAVY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StyleElements.PositionType.values().length];
            try {
                iArr2[StyleElements.PositionType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[StyleElements.PositionType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[StyleElements.PositionType.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ void style$default(TextView textView, TextBasedComponentStyle2 textBasedComponentStyle2, Set set, int i, Object obj) throws IllegalArgumentException {
        if ((i & 2) != 0) {
            set = SetsKt.emptySet();
        }
        style(textView, textBasedComponentStyle2, set);
    }

    public static final void style(TextView textView, TextBasedComponentStyle2 styles, Set<? extends TextStyling> excludedStyleElements) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(styles, "styles");
        Intrinsics.checkNotNullParameter(excludedStyleElements, "excludedStyleElements");
        StyleElements.SizeSet marginValue = styles.getMarginValue();
        if (marginValue != null) {
            ViewUtils5.setMargins(textView, marginValue);
        }
        Integer textColorValue = styles.getTextColorValue();
        if (textColorValue != null) {
            textView.setTextColor(textColorValue.intValue());
        }
        Integer textColorHighlightValue = styles.getTextColorHighlightValue();
        if (textColorHighlightValue != null) {
            textView.setLinkTextColor(textColorHighlightValue.intValue());
        }
        Double fontSizeValue = styles.getFontSizeValue();
        if (fontSizeValue != null) {
            double dDoubleValue = fontSizeValue.doubleValue();
            textView.setTextSize((float) dDoubleValue);
            if (TextViewCompat.getAutoSizeTextType(textView) == 1) {
                int autoSizeMinTextSize = TextViewCompat.getAutoSizeMinTextSize(textView);
                int autoSizeStepGranularity = TextViewCompat.getAutoSizeStepGranularity(textView);
                int spToPx = (int) ExtensionsKt.getSpToPx(dDoubleValue);
                if (autoSizeMinTextSize <= 0) {
                    autoSizeMinTextSize = (int) ExtensionsKt.getSpToPx(12.0d);
                }
                int i = autoSizeStepGranularity > 0 ? autoSizeStepGranularity : 1;
                if (autoSizeMinTextSize > spToPx) {
                    autoSizeMinTextSize = spToPx;
                }
                TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(textView, autoSizeMinTextSize, spToPx, i, 0);
            }
            Double lineHeightValue = styles.getLineHeightValue();
            if (lineHeightValue != null) {
                if (excludedStyleElements.contains(TextStyling.LineHeight)) {
                    lineHeightValue = null;
                }
                if (lineHeightValue != null) {
                    double dDoubleValue2 = lineHeightValue.doubleValue();
                    if (Build.VERSION.SDK_INT >= 28) {
                        textView.setLineSpacing((float) (ExtensionsKt.getDpToPx(dDoubleValue2) - ExtensionsKt.getDpToPx(dDoubleValue)), 1.0f);
                    }
                }
            }
        }
        Double letterSpacingValue = styles.getLetterSpacingValue();
        if (letterSpacingValue != null) {
            textView.setLetterSpacing((float) (letterSpacingValue.doubleValue() / textView.getTextSize()));
        }
        String fontNameValue = styles.getFontNameValue();
        StyleElements.FontWeight fontWeightValue = styles.getFontWeightValue();
        if (fontWeightValue == null) {
            fontWeightValue = StyleElements.FontWeight.NORMAL;
        }
        setTypeface$default(textView, fontNameValue, fontWeightValue, null, 4, null);
        StyleElements.PositionType justificationValue = styles.getJustificationValue();
        if (justificationValue != null) {
            setTextJustification(textView, justificationValue);
        }
    }

    public static /* synthetic */ void setTypeface$default(TextView textView, String str, StyleElements.FontWeight fontWeight, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return TextStyling2.setTypeface$lambda$8((Typeface) obj2);
                }
            };
        }
        setTypeface(textView, str, fontWeight, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setTypeface$lambda$8(Typeface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final void setTypeface(final TextView textView, String str, final StyleElements.FontWeight fontWeight, Function1<? super Typeface, Unit> onRemoteFontDownloaded) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(onRemoteFontDownloaded, "onRemoteFontDownloaded");
        if (str == null) {
            new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TextStyling2.setTypeface$lambda$11(fontWeight, textView);
                }
            };
            return;
        }
        if (fontWeight == null) {
            fontWeight = StyleElements.FontWeight.NORMAL;
        }
        setTextTypeface(textView, str, fontWeight, onRemoteFontDownloaded);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setTypeface$lambda$11(StyleElements.FontWeight fontWeight, TextView textView) {
        if (fontWeight == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            setFontWeight(textView, fontWeight);
        }
        return Unit.INSTANCE;
    }

    private static final void setTextTypeface(final TextView textView, String str, StyleElements.FontWeight fontWeight, final Function1<? super Typeface, Unit> function1) {
        String str2;
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Typeface typeface = UtilsKt.getTypeface(context, str);
        if (typeface != null) {
            textView.setTypeface(typeface);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            setFontWeight(textView, fontWeight);
        }
        FontDownloader companion = FontDownloader.INSTANCE.getInstance();
        Map<String, Map<StyleElements.FontWeight, String>> fontDownloaderMapping = companion.getFontDownloaderMapping();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Map<StyleElements.FontWeight, String>> entry : fontDownloaderMapping.entrySet()) {
            if (Intrinsics.areEqual(entry.getKey(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Map map = (Map) CollectionsKt.firstOrNull(linkedHashMap.values());
        if (map == null || (str2 = (String) map.get(fontWeight)) == null) {
            str2 = map != null ? (String) map.get(StyleElements.FontWeight.NORMAL) : null;
        }
        if (str2 != null) {
            companion.downloadFont(str2, new Function1() { // from class: com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TextStyling2.setTextTypeface$lambda$15(textView, function1, (Typeface) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setTextTypeface$lambda$15(TextView textView, Function1 function1, Typeface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        textView.setTypeface(it);
        function1.invoke(it);
        return Unit.INSTANCE;
    }

    public static final void setFontWeight(TextView textView, StyleElements.FontWeight fontWeight) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        Typeface typefaceCreate = Typeface.create(textView.getTypeface(), getFontWeightValue(fontWeight), false);
        Intrinsics.checkNotNullExpressionValue(typefaceCreate, "create(...)");
        textView.setTypeface(typefaceCreate);
    }

    private static final int getFontWeightValue(StyleElements.FontWeight fontWeight) {
        int i = WhenMappings.$EnumSwitchMapping$0[fontWeight.ordinal()];
        if (i == 1) {
            return 300;
        }
        if (i == 2) {
            return 400;
        }
        if (i == 3) {
            return 500;
        }
        if (i == 4) {
            return Timeline.MIDDLE_META_OFFSET_ANIMATION_DURATION;
        }
        if (i == 5) {
            return 800;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void setTextJustification(TextView textView, StyleElements.PositionType justification) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(justification, "justification");
        int gravity = textView.getGravity() & 112;
        int i = WhenMappings.$EnumSwitchMapping$1[justification.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 8388611;
        } else if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 8388613;
        }
        textView.setGravity(i2);
        textView.setGravity((textView.getGravity() & (-113)) | gravity);
    }
}

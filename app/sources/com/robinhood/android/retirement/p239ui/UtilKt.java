package com.robinhood.android.retirement.p239ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.text.PlatformTextStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.Font2;
import androidx.compose.p011ui.text.font.FontFamily4;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.LineHeightStyle;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.text.style.TextIndent;
import androidx.compose.p011ui.text.style.TextMotion;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.font.C16915R;
import com.robinhood.android.responsive.Density4;
import com.robinhood.android.responsive.Font5;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTypography;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: util.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0012H\u0000\u001a\u0016\u0010\u0013\u001a\u00020\u0012*\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0000\u001a\u0012\u0010\u0016\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018\u001a$\u0010\u0019\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001f\"\u0014\u0010\u0000\u001a\u00020\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0005*\u00020\u00068AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0014\u0010\t\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0016\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"TextPlaceholderShape", "Landroidx/compose/ui/graphics/Shape;", "getTextPlaceholderShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "retirementPromoTitleStyle", "Landroidx/compose/ui/text/TextStyle;", "Lcom/robinhood/compose/bento/theme/BentoTypography;", "getRetirementPromoTitleStyle", "(Lcom/robinhood/compose/bento/theme/BentoTypography;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "retirementRebrandTitleStyle", "getRetirementRebrandTitleStyle", "()Landroidx/compose/ui/text/TextStyle;", "retirementRebrandNeonTitleColor", "Landroidx/compose/ui/graphics/Color;", "getRetirementRebrandNeonTitleColor", "()J", "J", "bentoTextPlaceholder", "Landroidx/compose/ui/Modifier;", "sectionHeaderBottomPadding", "hasTrailingButton", "", "autoLogEvents", "component", "Lcom/robinhood/android/retirement/ui/RetirementComponent;", "logAccountChange", "", "Lcom/robinhood/analytics/EventLogger;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "incoming", "", "outgoing", "feature-retirement-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class UtilKt {
    private static final long retirementRebrandNeonTitleColor;
    private static final TextStyle retirementRebrandTitleStyle;

    @JvmName
    public static final Shape getTextPlaceholderShape(Composer composer, int i) {
        composer.startReplaceGroup(1240183779);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1240183779, i, -1, "com.robinhood.android.retirement.ui.<get-TextPlaceholderShape> (util.kt:29)");
        }
        RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21595getXsmallD9Ej5fM());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return roundedCornerShapeM5327RoundedCornerShape0680j_4;
    }

    @JvmName
    public static final TextStyle getRetirementPromoTitleStyle(BentoTypography bentoTypography, Composer composer, int i) {
        TextStyle textStyleM7655copyp1EtxEg$default;
        Intrinsics.checkNotNullParameter(bentoTypography, "<this>");
        composer.startReplaceGroup(-2014339175);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2014339175, i, -1, "com.robinhood.android.retirement.ui.<get-retirementPromoTitleStyle> (util.kt:36)");
        }
        composer.startReplaceGroup(1250306813);
        boolean z = Density4.isLowDensityScreen(composer, 0) || Font5.isFontEnlarged(composer, 0);
        composer.endReplaceGroup();
        if (z) {
            TextStyle displayCapsuleMedium = bentoTypography.getDisplayCapsuleMedium();
            textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(displayCapsuleMedium, 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, displayCapsuleMedium.m7662getFontSizeXSAIIZE(), null, null, null, 0, 0, null, 16646139, null);
        } else {
            TextStyle bookCoverCapsuleSmall = bentoTypography.getBookCoverCapsuleSmall();
            textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(bookCoverCapsuleSmall, 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextL().getFontFamily(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, bookCoverCapsuleSmall.m7662getFontSizeXSAIIZE(), null, null, null, 0, 0, null, 16646107, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return textStyleM7655copyp1EtxEg$default;
    }

    public static final TextStyle getRetirementRebrandTitleStyle() {
        return retirementRebrandTitleStyle;
    }

    static {
        int i = C16915R.font.martina_regular;
        FontWeight.Companion companion = FontWeight.INSTANCE;
        retirementRebrandTitleStyle = new TextStyle(0L, TextUnit2.getSp(33), companion.getNormal(), (FontStyle) null, (FontSynthesis) null, FontFamily4.FontFamily(Font2.m7691FontYpTlLL0$default(i, companion.getNormal(), 0, 0, 12, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.15d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646105, (DefaultConstructorMarker) null);
        retirementRebrandNeonTitleColor = Color2.Color(4291624704L);
    }

    public static final long getRetirementRebrandNeonTitleColor() {
        return retirementRebrandNeonTitleColor;
    }

    public static final Modifier bentoTextPlaceholder(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.robinhood.android.retirement.ui.UtilKt.bentoTextPlaceholder.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(-460445675);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-460445675, i, -1, "com.robinhood.android.retirement.ui.bentoTextPlaceholder.<anonymous> (util.kt:65)");
                }
                Modifier modifierBentoPlaceholder = ModifiersKt.bentoPlaceholder(composed, true, UtilKt.getTextPlaceholderShape(composer, 0));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierBentoPlaceholder;
            }
        }, 1, null);
    }

    public static /* synthetic */ Modifier sectionHeaderBottomPadding$default(Modifier modifier, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return sectionHeaderBottomPadding(modifier, z);
    }

    public static final Modifier autoLogEvents(Modifier modifier, final RetirementComponent component) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(component, "component");
        return ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.robinhood.android.retirement.ui.UtilKt.autoLogEvents.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(1424294935);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1424294935, i, -1, "com.robinhood.android.retirement.ui.autoLogEvents.<anonymous> (util.kt:84)");
                }
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Component component2 = component.getComponent();
                UserInteractionEventData.Action action = component.getAction();
                Context context = component.getContext();
                if (context == null) {
                    context = userInteractionEventDescriptor.getContext();
                }
                Modifier modifierAutoLogEvents$default = com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(composed, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action, context, component2, null, 35, null), true, false, false, true, false, null, 108, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierAutoLogEvents$default;
            }
        }, 1, null);
    }

    public static final void logAccountChange(EventLogger eventLogger, Screen screen, String incoming, String str) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(incoming, "incoming");
        if (Intrinsics.areEqual(incoming, str) || str == null) {
            return;
        }
        EventLogger.DefaultImpls.logScreenDisappear$default(eventLogger, null, screen, null, null, null, 29, null);
    }

    public static final Modifier sectionHeaderBottomPadding(Modifier modifier, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return PaddingKt.m5146paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(z ? 4 : 12), 7, null);
    }
}

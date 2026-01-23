package com.robinhood.android.optionsupgrade;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect2;
import androidx.compose.p011ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p011ui.graphics.BlendMode;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionOnboardingStyles.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0019\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"setupStatusBarStyle", "", "Lcom/robinhood/android/common/ui/BaseFragment;", ResourceTypes.STYLE, "Lcom/robinhood/android/optionsupgrade/OptionOnboardingStyle;", "removeStatusBarStyle", "drawRetirementColorMask", "Landroidx/compose/ui/Modifier;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "drawRetirementColorMask-4WTKRHQ", "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;", "feature-options-upgrade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingStylesKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionOnboardingStyles2 {
    public static final void setupStatusBarStyle(BaseFragment baseFragment, OptionOnboardingStyles style) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        baseFragment.requireBaseActivity().overrideStatusBarStyle(style.useLightStatusBar());
    }

    public static final void removeStatusBarStyle(BaseFragment baseFragment) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        baseFragment.requireBaseActivity().resetStatusBarStyleOverride();
    }

    /* renamed from: drawRetirementColorMask-4WTKRHQ, reason: not valid java name */
    public static final Modifier m17425drawRetirementColorMask4WTKRHQ(Modifier drawRetirementColorMask, final long j) {
        Intrinsics.checkNotNullParameter(drawRetirementColorMask, "$this$drawRetirementColorMask");
        return DrawModifierKt.drawWithContent(drawRetirementColorMask, new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingStylesKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOnboardingStyles2.drawRetirementColorMask_4WTKRHQ$lambda$1(j, (ContentDrawScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit drawRetirementColorMask_4WTKRHQ$lambda$1(long j, ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        Canvas canvas = drawWithContent.getDrawContext().getCanvas();
        canvas.saveLayer(Rect2.m6565Recttz77jQw(Offset.INSTANCE.m6553getZeroF1C5BW0(), drawWithContent.mo6963getSizeNHjbRc()), AndroidPaint_androidKt.Paint());
        drawWithContent.drawContent();
        DrawScope.m6957drawRectAsUm42w$default(drawWithContent, new SolidColor(j, null), 0L, 0L, 0.0f, null, null, BlendMode.INSTANCE.m6668getSrcIn0nO6VwU(), 62, null);
        canvas.restore();
        return Unit.INSTANCE;
    }
}

package com.robinhood.android.dashboardpill.p096ui;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransition4;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.draw.Scale2;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.graphics.Outline;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.PathFillType;
import androidx.compose.p011ui.graphics.RenderEffect2;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope3;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.layout.SubcomposeLayoutKt;
import androidx.compose.p011ui.layout.SubcomposeMeasureScope;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextMeasurer;
import androidx.compose.p011ui.text.TextMeasurerHelper;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.dashboardpill.C13819R;
import com.robinhood.android.dashboardpill.DashboardPillData;
import com.robinhood.android.dashboardpill.DashboardPillData4;
import com.robinhood.android.dashboardpill.p096ui.DashboardPillButton5;
import com.robinhood.android.font.RhTypeface;
import com.robinhood.android.gold.sparkle.bento.BentoSparkleInfoTag;
import com.robinhood.android.gold.sparkle.compose.GoldSparkleBrush;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: DashboardPillButton.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001ai\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a;\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a;\u0010 \u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u001f\u0010\u001d\u001aK\u0010%\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0003¢\u0006\u0004\b#\u0010$\u001a'\u0010,\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020!2\u0006\u0010)\u001a\u00020(H\u0003¢\u0006\u0004\b*\u0010+\u001a\u001b\u00100\u001a\u00020-*\u00020-2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101\u001a#\u00104\u001a\u00020\u0004*\u00020\u00042\u0006\u00103\u001a\u0002022\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b4\u00105\u001a9\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00110:2\u0006\u00103\u001a\u0002022\u0006\u0010/\u001a\u00020.2\b\b\u0002\u00107\u001a\u0002062\b\b\u0002\u00109\u001a\u000208H\u0003¢\u0006\u0004\b;\u0010<\u001a\u0013\u0010?\u001a\u00020>*\u00020=H\u0002¢\u0006\u0004\b?\u0010@\u001a\u000f\u0010A\u001a\u00020\u0007H\u0003¢\u0006\u0004\bA\u0010B\"\u0014\u0010C\u001a\u00020>8\u0006X\u0086T¢\u0006\u0006\n\u0004\bC\u0010D\"\u0014\u0010E\u001a\u00020>8\u0006X\u0086T¢\u0006\u0006\n\u0004\bE\u0010D\"\u0014\u0010G\u001a\u00020F8\u0006X\u0086T¢\u0006\u0006\n\u0004\bG\u0010H\"\u0014\u0010I\u001a\u00020F8\u0006X\u0086T¢\u0006\u0006\n\u0004\bI\u0010H\"\u0014\u0010J\u001a\u00020=8\u0006X\u0086T¢\u0006\u0006\n\u0004\bJ\u0010K\"\u0014\u0010L\u001a\u00020>8\u0006X\u0086T¢\u0006\u0006\n\u0004\bL\u0010D\"\u0014\u0010M\u001a\u00020F8\u0002X\u0082T¢\u0006\u0006\n\u0004\bM\u0010H\"\u0014\u0010N\u001a\u00020>8\u0002X\u0082T¢\u0006\u0006\n\u0004\bN\u0010D\"\u0014\u0010O\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010H\"\u0014\u0010P\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010H\"\u0014\u0010Q\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010K\"\u0014\u0010R\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010K\"\u0014\u0010S\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010H\"\u0014\u0010T\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010H\"\u0014\u0010U\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006_²\u0006\u000e\u0010W\u001a\u00020(8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010X\u001a\u00020F8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001a\u001a\u00020>8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001b\u001a\u00020>8\n@\nX\u008a\u008e\u0002²\u0006\u0016\u00103\u001a\n Y*\u0004\u0018\u000102028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010Z\u001a\u00020(8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010[\u001a\u0004\u0018\u00010\u000b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010]\u001a\u00020\\8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010^\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, m3636d2 = {"j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/dashboardpill/DashboardPillData;", "pillData", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onClick", "DashboardPillButton", "(Lj$/time/Clock;Lcom/robinhood/android/dashboardpill/DashboardPillData;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lcom/airbnb/lottie/LottieComposition;", "bgComposition", "borderComposition", "", "bgLottieUrl", "borderLottieUrl", "Landroidx/compose/ui/unit/Dp;", "pillWidthDp", "pillHeightDp", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "pillShape", "borderShape", "LottieLayersComposable-_UtchM0", "(Lcom/robinhood/android/dashboardpill/DashboardPillData;Lcom/airbnb/lottie/LottieComposition;Lcom/airbnb/lottie/LottieComposition;Ljava/lang/String;Ljava/lang/String;FFLandroidx/compose/foundation/shape/RoundedCornerShape;Landroidx/compose/foundation/shape/RoundedCornerShape;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LottieLayersComposable", "pillWidth", "pillHeight", "PillPulseComposable-o3XDK20", "(Lcom/robinhood/android/dashboardpill/DashboardPillData;FFLandroidx/compose/ui/Modifier;Landroidx/compose/foundation/shape/RoundedCornerShape;Landroidx/compose/runtime/Composer;II)V", "PillPulseComposable", "TransparentPillPulseComposable-o3XDK20", "TransparentPillPulseComposable", "Landroidx/compose/ui/graphics/Color;", "textTint", "PillButtonComposable-FU0evQE", "(Lj$/time/Clock;Lcom/robinhood/android/dashboardpill/DashboardPillData;JLandroidx/compose/ui/Modifier;Landroidx/compose/foundation/shape/RoundedCornerShape;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PillButtonComposable", "text", ResourceTypes.COLOR, "", "isGoldStyle", "MonospacedText-iJQMabo", "(Ljava/lang/String;JZLandroidx/compose/runtime/Composer;I)V", "MonospacedText", "Landroidx/compose/ui/text/TextStyle;", "Lcom/robinhood/android/dashboardpill/VisualStyle;", "visualStyle", "applyCountdownFont", "(Landroidx/compose/ui/text/TextStyle;Lcom/robinhood/android/dashboardpill/VisualStyle;)Landroidx/compose/ui/text/TextStyle;", "j$/time/Duration", "remainingDuration", "applyStaticWidth", "(Landroidx/compose/ui/Modifier;Lj$/time/Duration;Lcom/robinhood/android/dashboardpill/VisualStyle;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/text/TextMeasurer;", "textMeasurer", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/runtime/State;", "rememberStaticWidth", "(Lj$/time/Duration;Lcom/robinhood/android/dashboardpill/VisualStyle;Landroidx/compose/ui/text/TextMeasurer;Landroidx/compose/ui/unit/Density;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "", "", "numberOfDigits", "(J)I", "CustomDashboardPillButtonPreview", "(Landroidx/compose/runtime/Composer;I)V", "PULSE_DURATION_MS", "I", "PULSE_FREQUENCY_MS", "", "PULSE_X_SCALE", "F", "PULSE_Y_SCALE", "TIMER_REFRESH_INTERVAL_MS", "J", "FADE_IN_DURATION_MS", "PULSE_EXPANSION_DP", "CUSTOM_STYLE_PULSE_FREQUENCY_MS", "CRYPTO_SEASON_PILL_LOTTIE_BORDER_WIDTH", "CUSTOM_BORDER_WIDTH", "CRYPTO_SEASON_PILL_COLOR_LIGHT", "CRYPTO_SEASON_PILL_COLOR_DARK", "PILL_VERTICAL_PADDING", "PILL_VERTICAL_PADDING_PULSE", "DashboardPillTestTag", "Ljava/lang/String;", "shouldFadeIn", "pillAlpha", "kotlin.jvm.PlatformType", "isCountdownComplete", "composition", "Landroidx/compose/ui/geometry/Offset;", "titlePositionInWindow", "maxWidth", "lib-dashboard-pill_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.dashboardpill.ui.DashboardPillButtonKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class DashboardPillButton5 {
    private static final int CUSTOM_STYLE_PULSE_FREQUENCY_MS = 1500;
    public static final String DashboardPillTestTag = "dashboard_pill_test_tag";
    public static final int FADE_IN_DURATION_MS = 500;
    public static final int PULSE_DURATION_MS = 1000;
    private static final float PULSE_EXPANSION_DP = 12.0f;
    public static final int PULSE_FREQUENCY_MS = 3000;
    public static final float PULSE_X_SCALE = 1.2f;
    public static final float PULSE_Y_SCALE = 1.5f;
    public static final long TIMER_REFRESH_INTERVAL_MS = 100;
    private static final float CRYPTO_SEASON_PILL_LOTTIE_BORDER_WIDTH = C2002Dp.m7995constructorimpl(2);
    private static final float CUSTOM_BORDER_WIDTH = C2002Dp.m7995constructorimpl(1);
    private static final long CRYPTO_SEASON_PILL_COLOR_LIGHT = Color2.Color(2146040319);
    private static final long CRYPTO_SEASON_PILL_COLOR_DARK = Color2.Color(0);
    private static final float PILL_VERTICAL_PADDING = C2002Dp.m7995constructorimpl(8);
    private static final float PILL_VERTICAL_PADDING_PULSE = C2002Dp.m7995constructorimpl(6);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomDashboardPillButtonPreview$lambda$61(int i, Composer composer, int i2) {
        CustomDashboardPillButtonPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DashboardPillButton$lambda$10(Clock clock, DashboardPillData dashboardPillData, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        DashboardPillButton(clock, dashboardPillData, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LottieLayersComposable__UtchM0$lambda$18(DashboardPillData dashboardPillData, LottieComposition lottieComposition, LottieComposition lottieComposition2, String str, String str2, float f, float f2, RoundedCornerShape roundedCornerShape, RoundedCornerShape roundedCornerShape2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m13238LottieLayersComposable_UtchM0(dashboardPillData, lottieComposition, lottieComposition2, str, str2, f, f2, roundedCornerShape, roundedCornerShape2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MonospacedText_iJQMabo$lambda$57(String str, long j, boolean z, int i, Composer composer, int i2) {
        m13239MonospacedTextiJQMabo(str, j, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PillButtonComposable_FU0evQE$lambda$42(Clock clock, DashboardPillData dashboardPillData, long j, Modifier modifier, RoundedCornerShape roundedCornerShape, Function0 function0, int i, int i2, Composer composer, int i3) {
        m13240PillButtonComposableFU0evQE(clock, dashboardPillData, j, modifier, roundedCornerShape, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PillPulseComposable_o3XDK20$lambda$19(DashboardPillData dashboardPillData, float f, float f2, Modifier modifier, RoundedCornerShape roundedCornerShape, int i, int i2, Composer composer, int i3) {
        m13241PillPulseComposableo3XDK20(dashboardPillData, f, f2, modifier, roundedCornerShape, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TransparentPillPulseComposable_o3XDK20$lambda$27(DashboardPillData dashboardPillData, float f, float f2, Modifier modifier, RoundedCornerShape roundedCornerShape, int i, int i2, Composer composer, int i3) {
        m13242TransparentPillPulseComposableo3XDK20(dashboardPillData, f, f2, modifier, roundedCornerShape, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* compiled from: DashboardPillButton.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.dashboardpill.ui.DashboardPillButtonKt$DashboardPillButton$4 */
    static final class C138224 implements Function4<AnimatedContentScope, DashboardPillData, Composer, Integer, Unit> {
        final /* synthetic */ LottieComposition $bgComposition;
        final /* synthetic */ String $bgLottieUrl;
        final /* synthetic */ LottieComposition $borderComposition;
        final /* synthetic */ String $borderLottieUrl;
        final /* synthetic */ Clock $clock;
        final /* synthetic */ Density $density;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ long $notificationDotTint;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ SnapshotState4<Float> $pillAlpha$delegate;
        final /* synthetic */ long $textTint;

        C138224(Modifier modifier, SnapshotState4<Float> snapshotState4, Clock clock, long j, Density density, String str, String str2, LottieComposition lottieComposition, LottieComposition lottieComposition2, Function0<Unit> function0, long j2) {
            this.$modifier = modifier;
            this.$pillAlpha$delegate = snapshotState4;
            this.$clock = clock;
            this.$textTint = j;
            this.$density = density;
            this.$bgLottieUrl = str;
            this.$borderLottieUrl = str2;
            this.$bgComposition = lottieComposition;
            this.$borderComposition = lottieComposition2;
            this.$onClick = function0;
            this.$notificationDotTint = j2;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, DashboardPillData dashboardPillData, Composer composer, Integer num) {
            invoke(animatedContentScope, dashboardPillData, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MeasureResult invoke$lambda$14$lambda$11$lambda$10(final Clock clock, final DashboardPillData dashboardPillData, final long j, SnapshotIntState2 snapshotIntState2, SnapshotIntState2 snapshotIntState22, SubcomposeMeasureScope SubcomposeLayout, Constraints constraints) {
            Integer numValueOf;
            Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
            List<Measurable> listSubcompose = SubcomposeLayout.subcompose("pill", ComposableLambda3.composableLambdaInstance(-380738049, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboardpill.ui.DashboardPillButtonKt$DashboardPillButton$4$1$1$1$placeables$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-380738049, i, -1, "com.robinhood.android.dashboardpill.ui.DashboardPillButton.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardPillButton.kt:223)");
                    }
                    DashboardPillButton5.m13240PillButtonComposableFU0evQE(clock, dashboardPillData, j, null, null, null, composer, 0, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubcompose, 10));
            Iterator<T> it = listSubcompose.iterator();
            while (it.hasNext()) {
                arrayList.add(((Measurable) it.next()).mo7239measureBRTryo0(constraints.getValue()));
            }
            Iterator it2 = arrayList.iterator();
            Integer num = null;
            if (it2.hasNext()) {
                numValueOf = Integer.valueOf(((Placeable) it2.next()).getWidth());
                while (it2.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(((Placeable) it2.next()).getWidth());
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
            } else {
                numValueOf = null;
            }
            snapshotIntState2.setIntValue(numValueOf != null ? numValueOf.intValue() : 0);
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                Integer numValueOf3 = Integer.valueOf(((Placeable) it3.next()).getHeight());
                loop1: while (true) {
                    num = numValueOf3;
                    while (it3.hasNext()) {
                        numValueOf3 = Integer.valueOf(((Placeable) it3.next()).getHeight());
                        if (num.compareTo(numValueOf3) < 0) {
                            break;
                        }
                    }
                }
            }
            snapshotIntState22.setIntValue(num != null ? num.intValue() : 0);
            return MeasureScope.layout$default(SubcomposeLayout, 0, 0, null, new Function1() { // from class: com.robinhood.android.dashboardpill.ui.DashboardPillButtonKt$DashboardPillButton$4$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DashboardPillButton5.C138224.invoke$lambda$14$lambda$11$lambda$10$lambda$9((Placeable.PlacementScope) obj);
                }
            }, 4, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$14$lambda$11$lambda$10$lambda$9(Placeable.PlacementScope layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedContentScope AnimatedContent, final DashboardPillData pillData, Composer composer, int i) {
            final SnapshotIntState2 snapshotIntState2;
            Clock clock;
            long j;
            float fM7995constructorimpl;
            BoxScopeInstance boxScopeInstance;
            int i2;
            long j2;
            float f;
            float f2;
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            Intrinsics.checkNotNullParameter(pillData, "pillData");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1229264543, i, -1, "com.robinhood.android.dashboardpill.ui.DashboardPillButton.<anonymous> (DashboardPillButton.kt:211)");
            }
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                composer.updateRememberedValue(objRememberedValue);
            }
            SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotIntState3.mutableIntStateOf(0);
                composer.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotIntState2 snapshotIntState23 = (SnapshotIntState2) objRememberedValue2;
            composer.endReplaceGroup();
            Modifier modifierAlpha = Alpha.alpha(SizeKt.wrapContentSize$default(TestTag3.testTag(this.$modifier, DashboardPillButton5.DashboardPillTestTag), null, false, 3, null), DashboardPillButton5.DashboardPillButton$lambda$5(this.$pillAlpha$delegate));
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment center = companion2.getCenter();
            final Clock clock2 = this.$clock;
            final long j3 = this.$textTint;
            Density density = this.$density;
            String str = this.$bgLottieUrl;
            String str2 = this.$borderLottieUrl;
            LottieComposition lottieComposition = this.$bgComposition;
            LottieComposition lottieComposition2 = this.$borderComposition;
            Function0<Unit> function0 = this.$onClick;
            long j4 = this.$notificationDotTint;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierAlpha);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            composer.startMovableGroup(-1076104357, pillData);
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(clock2) | composer.changedInstance(pillData) | composer.changed(j3);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                snapshotIntState2 = snapshotIntState22;
                Object obj = new Function2() { // from class: com.robinhood.android.dashboardpill.ui.DashboardPillButtonKt$DashboardPillButton$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return DashboardPillButton5.C138224.invoke$lambda$14$lambda$11$lambda$10(clock2, pillData, j3, snapshotIntState2, snapshotIntState23, (SubcomposeMeasureScope) obj2, (Constraints) obj3);
                    }
                };
                clock = clock2;
                j = j3;
                composer.updateRememberedValue(obj);
                objRememberedValue3 = obj;
            } else {
                clock = clock2;
                j = j3;
                snapshotIntState2 = snapshotIntState22;
            }
            composer.endReplaceGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) objRememberedValue3, composer, 0, 1);
            composer.endMovableGroup();
            float fMo5013toDpu2uoSUM = density.mo5013toDpu2uoSUM(snapshotIntState2.getIntValue());
            float fMo5013toDpu2uoSUM2 = density.mo5013toDpu2uoSUM(snapshotIntState23.getIntValue());
            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(fMo5013toDpu2uoSUM2 / 2.0f));
            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl((pillData.getVisualStyle().isCrypto() ? DashboardPillButton5.CRYPTO_SEASON_PILL_LOTTIE_BORDER_WIDTH : DashboardPillButton5.CUSTOM_BORDER_WIDTH) + fMo5013toDpu2uoSUM2) / 2));
            composer.startReplaceGroup(-1076071755);
            if (pillData.isPulsing()) {
                if ((pillData.getVisualStyle() instanceof DashboardPillData4.Custom) && str != null) {
                    composer.startReplaceGroup(1001612049);
                    DashboardPillButton5.m13242TransparentPillPulseComposableo3XDK20(pillData, fMo5013toDpu2uoSUM, fMo5013toDpu2uoSUM2, Modifier.INSTANCE, roundedCornerShapeM5327RoundedCornerShape0680j_4, composer, ((i >> 3) & 14) | 3072, 0);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(1001945020);
                    DashboardPillButton5.m13241PillPulseComposableo3XDK20(pillData, fMo5013toDpu2uoSUM, fMo5013toDpu2uoSUM2, Modifier.INSTANCE, roundedCornerShapeM5327RoundedCornerShape0680j_4, composer, ((i >> 3) & 14) | 3072, 0);
                    composer.endReplaceGroup();
                }
            }
            composer.endReplaceGroup();
            if (!pillData.isPulsing() || !(pillData.getVisualStyle() instanceof DashboardPillData4.Custom) || str == null) {
                fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
            } else {
                fM7995constructorimpl = C2002Dp.m7995constructorimpl(6.0f);
            }
            composer.startReplaceGroup(-1076038333);
            if (str2 == null && str == null) {
                boxScopeInstance = boxScopeInstance2;
                i2 = 1;
                j2 = j4;
                f = fM7995constructorimpl;
                f2 = 0.0f;
            } else {
                boxScopeInstance = boxScopeInstance2;
                i2 = 1;
                j2 = j4;
                f = fM7995constructorimpl;
                f2 = 0.0f;
                DashboardPillButton5.m13238LottieLayersComposable_UtchM0(pillData, lottieComposition, lottieComposition2, str, str2, fMo5013toDpu2uoSUM, fMo5013toDpu2uoSUM2, roundedCornerShapeM5327RoundedCornerShape0680j_4, roundedCornerShapeM5327RoundedCornerShape0680j_42, OffsetKt.m5125offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, fM7995constructorimpl, 1, null), composer, (i >> 3) & 14, 0);
            }
            composer.endReplaceGroup();
            Modifier.Companion companion4 = Modifier.INSTANCE;
            DashboardPillButton5.m13240PillButtonComposableFU0evQE(clock, pillData, j, OffsetKt.m5125offsetVpY3zN4$default(companion4, f2, f, i2, null), null, function0, composer, i & 112, 16);
            composer.startReplaceGroup(-1076009567);
            if (Intrinsics.areEqual(pillData.getShowNotificationDot(), Boolean.TRUE)) {
                BoxKt.Box(Background3.m4872backgroundbw27NRU$default(Clip.clip(SizeKt.m5169size3ABfNKs(boxScopeInstance.align(OffsetKt.m5124offsetVpY3zN4(companion4, C2002Dp.m7995constructorimpl(i2), C2002Dp.m7995constructorimpl(-1)), companion2.getTopEnd()), C2002Dp.m7995constructorimpl(12)), RoundedCornerShape2.getCircleShape()), j2, null, 2, null), composer, 0);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DashboardPillButton$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float DashboardPillButton$lambda$5(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final long MonospacedText_iJQMabo$lambda$46(SnapshotState<Offset> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    private static final Duration PillButtonComposable_FU0evQE$lambda$31(SnapshotState<Duration> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean PillButtonComposable_FU0evQE$lambda$34(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final LottieComposition PillButtonComposable_FU0evQE$lambda$41$lambda$40(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DashboardPillButton(final Clock clock, final DashboardPillData pillData, Modifier modifier, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0<Unit> function02;
        int i5;
        Function0<Unit> function03;
        String bgLottieUrlDark;
        int i6;
        int i7;
        Composer composer2;
        LottieComposition value;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotState snapshotState;
        Composer composer3;
        boolean z;
        boolean zChanged;
        Object objRememberedValue2;
        Color composeColor;
        DashboardPillData4 visualStyle;
        int i8;
        Color colorM6701boximpl;
        long value2;
        DashboardPillData4.Custom custom;
        Object objRememberedValue3;
        Composer composer4;
        final Modifier modifier3;
        final Function0<Unit> function04;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(pillData, "pillData");
        Composer composerStartRestartGroup = composer.startRestartGroup(555139187);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(clock) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(pillData) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                }
                i5 = i3;
                if ((i5 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function04 = function02;
                    composer4 = composerStartRestartGroup;
                } else {
                    Modifier modifier4 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 == 0) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.dashboardpill.ui.DashboardPillButtonKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function03 = (Function0) objRememberedValue4;
                    } else {
                        function03 = function02;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(555139187, i5, -1, "com.robinhood.android.dashboardpill.ui.DashboardPillButton (DashboardPillButton.kt:148)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i10 = BentoTheme.$stable;
                    boolean isDay = bentoTheme.getColors(composerStartRestartGroup, i10).getIsDay();
                    bgLottieUrlDark = isDay ? pillData.getBgLottieUrlDark() : pillData.getBgLottieUrlLight();
                    String borderLottieUrlDark = isDay ? pillData.getBorderLottieUrlDark() : pillData.getBorderLottieUrlLight();
                    composerStartRestartGroup.startReplaceGroup(912830116);
                    if (bgLottieUrlDark == null) {
                        composer2 = composerStartRestartGroup;
                        i6 = 1849434622;
                        i7 = i10;
                        value = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(bgLottieUrlDark)), null, null, null, null, null, composer2, 0, 62).getValue();
                    } else {
                        i6 = 1849434622;
                        i7 = i10;
                        composer2 = composerStartRestartGroup;
                        value = null;
                    }
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(912836364);
                    LottieComposition value3 = borderLottieUrlDark == null ? rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(borderLottieUrlDark)), null, null, null, null, null, composer2, 0, 62).getValue() : null;
                    composer2.endReplaceGroup();
                    boolean z2 = (bgLottieUrlDark == null && value == null) || (borderLottieUrlDark != null && value3 == null);
                    composer2.startReplaceGroup(i6);
                    objRememberedValue = composer2.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.valueOf(z2), null, 2, null);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    snapshotState = (SnapshotState) objRememberedValue;
                    composer2.endReplaceGroup();
                    composer3 = composer2;
                    z = z2;
                    SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(z2 ? 0.0f : 1.0f, AnimationSpecKt.tween$default(500, 0, null, 6, null), 0.0f, "pillFadeIn", null, composer3, 3120, 20);
                    Boolean boolValueOf = Boolean.valueOf(z);
                    composer3.startReplaceGroup(-1633490746);
                    zChanged = composer3.changed(z);
                    objRememberedValue2 = composer3.rememberedValue();
                    if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                        composeColor = null;
                        objRememberedValue2 = new DashboardPillButton6(z, snapshotState, null);
                        composer3.updateRememberedValue(objRememberedValue2);
                    } else {
                        composeColor = null;
                    }
                    composer3.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer3, 0);
                    Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                    visualStyle = pillData.getVisualStyle();
                    if (Intrinsics.areEqual(visualStyle, DashboardPillData4.Rhc.INSTANCE)) {
                        i8 = i7;
                        if (Intrinsics.areEqual(visualStyle, DashboardPillData4.Gold.INSTANCE)) {
                            composer3.startReplaceGroup(912867286);
                            long jet = bentoTheme.getColors(composer3, i8).getJet();
                            composer3.endReplaceGroup();
                            colorM6701boximpl = Color.m6701boximpl(jet);
                        } else if (Intrinsics.areEqual(visualStyle, DashboardPillData4.Market.INSTANCE)) {
                            composer3.startReplaceGroup(912868953);
                            long jM21368getAccent0d7_KjU = bentoTheme.getColors(composer3, i8).m21368getAccent0d7_KjU();
                            composer3.endReplaceGroup();
                            colorM6701boximpl = Color.m6701boximpl(jM21368getAccent0d7_KjU);
                        } else if (Intrinsics.areEqual(visualStyle, DashboardPillData4.Crypto.INSTANCE) || Intrinsics.areEqual(visualStyle, DashboardPillData4.CryptoLive.INSTANCE)) {
                            composer3.startReplaceGroup(912871477);
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i8).m21425getFg0d7_KjU();
                            composer3.endReplaceGroup();
                            colorM6701boximpl = Color.m6701boximpl(jM21425getFg0d7_KjU);
                        } else if (visualStyle instanceof DashboardPillData4.Custom) {
                            composer3.startReplaceGroup(-1765696321);
                            ThemedColorDto textColor = ((DashboardPillData4.Custom) visualStyle).getTextColor();
                            colorM6701boximpl = textColor == null ? composeColor : SduiColors2.toComposeColor(textColor, composer3, 0);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(-1765663958);
                            composer3.endReplaceGroup();
                            colorM6701boximpl = composeColor;
                        }
                    } else {
                        composer3.startReplaceGroup(912865686);
                        i8 = i7;
                        long jet2 = bentoTheme.getColors(composer3, i8).getJet();
                        composer3.endReplaceGroup();
                        colorM6701boximpl = Color.m6701boximpl(jet2);
                    }
                    composer3.startReplaceGroup(912863197);
                    if (colorM6701boximpl == null) {
                        value2 = colorM6701boximpl.getValue();
                    } else if (bentoTheme.getColors(composer3, i8).getIsDay()) {
                        composer3.startReplaceGroup(-1765620247);
                        value2 = bentoTheme.getColors(composer3, i8).getNeon();
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(-1765576630);
                        value2 = bentoTheme.getColors(composer3, i8).getJet();
                        composer3.endReplaceGroup();
                    }
                    composer3.endReplaceGroup();
                    DashboardPillData4 visualStyle2 = pillData.getVisualStyle();
                    custom = !(visualStyle2 instanceof DashboardPillData4.Custom) ? (DashboardPillData4.Custom) visualStyle2 : composeColor;
                    composer3.startReplaceGroup(912880973);
                    if (custom != 0) {
                        ThemedColorDto notificationDotColor = custom.getNotificationDotColor();
                        composer3.startReplaceGroup(912882083);
                        if (notificationDotColor != null) {
                            composeColor = SduiColors2.toComposeColor(notificationDotColor, composer3, 0);
                        }
                        composer3.endReplaceGroup();
                    }
                    composer3.endReplaceGroup();
                    long value4 = composeColor == null ? composeColor.getValue() : value2;
                    composer3.startReplaceGroup(1849434622);
                    objRememberedValue3 = composer3.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.dashboardpill.ui.DashboardPillButtonKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return DashboardPillButton5.DashboardPillButton$lambda$9$lambda$8((AnimatedContentTransitionScope) obj);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    Function1 function1 = (Function1) objRememberedValue3;
                    composer3.endReplaceGroup();
                    Modifier modifier5 = modifier4;
                    Function0<Unit> function05 = function03;
                    AnimatedContentKt.AnimatedContent(pillData, null, function1, null, null, null, ComposableLambda3.rememberComposableLambda(-1229264543, true, new C138224(modifier5, snapshotState4AnimateFloatAsState, clock, value2, density, bgLottieUrlDark, borderLottieUrlDark, value, value3, function05, value4), composer3, 54), composer3, ((i5 >> 3) & 14) | 1573248, 58);
                    composer4 = composer3;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    function04 = function05;
                }
                scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboardpill.ui.DashboardPillButtonKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return DashboardPillButton5.DashboardPillButton$lambda$10(clock, pillData, modifier3, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            function02 = function0;
            i5 = i3;
            if ((i5 & 1171) == 1170) {
                if (i9 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i102 = BentoTheme.$stable;
                boolean isDay2 = bentoTheme2.getColors(composerStartRestartGroup, i102).getIsDay();
                bgLottieUrlDark = isDay2 ? pillData.getBgLottieUrlDark() : pillData.getBgLottieUrlLight();
                String borderLottieUrlDark2 = isDay2 ? pillData.getBorderLottieUrlDark() : pillData.getBorderLottieUrlLight();
                composerStartRestartGroup.startReplaceGroup(912830116);
                if (bgLottieUrlDark == null) {
                }
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(912836364);
                if (borderLottieUrlDark2 == null) {
                }
                composer2.endReplaceGroup();
                if (bgLottieUrlDark == null) {
                    composer2.startReplaceGroup(i6);
                    objRememberedValue = composer2.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue;
                    composer2.endReplaceGroup();
                    composer3 = composer2;
                    z = z2;
                    SnapshotState4<Float> snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(z2 ? 0.0f : 1.0f, AnimationSpecKt.tween$default(500, 0, null, 6, null), 0.0f, "pillFadeIn", null, composer3, 3120, 20);
                    Boolean boolValueOf2 = Boolean.valueOf(z);
                    composer3.startReplaceGroup(-1633490746);
                    zChanged = composer3.changed(z);
                    objRememberedValue2 = composer3.rememberedValue();
                    if (zChanged) {
                        composeColor = null;
                        objRememberedValue2 = new DashboardPillButton6(z, snapshotState, null);
                        composer3.updateRememberedValue(objRememberedValue2);
                        composer3.endReplaceGroup();
                        EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer3, 0);
                        Density density2 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        visualStyle = pillData.getVisualStyle();
                        if (Intrinsics.areEqual(visualStyle, DashboardPillData4.Rhc.INSTANCE)) {
                        }
                        composer3.startReplaceGroup(912863197);
                        if (colorM6701boximpl == null) {
                        }
                        composer3.endReplaceGroup();
                        DashboardPillData4 visualStyle22 = pillData.getVisualStyle();
                        if (!(visualStyle22 instanceof DashboardPillData4.Custom)) {
                        }
                        composer3.startReplaceGroup(912880973);
                        if (custom != 0) {
                        }
                        composer3.endReplaceGroup();
                        if (composeColor == null) {
                        }
                        composer3.startReplaceGroup(1849434622);
                        objRememberedValue3 = composer3.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                        }
                        Function1 function12 = (Function1) objRememberedValue3;
                        composer3.endReplaceGroup();
                        Modifier modifier52 = modifier4;
                        Function0<Unit> function052 = function03;
                        AnimatedContentKt.AnimatedContent(pillData, null, function12, null, null, null, ComposableLambda3.rememberComposableLambda(-1229264543, true, new C138224(modifier52, snapshotState4AnimateFloatAsState2, clock, value2, density2, bgLottieUrlDark, borderLottieUrlDark2, value, value3, function052, value4), composer3, 54), composer3, ((i5 >> 3) & 14) | 1573248, 58);
                        composer4 = composer3;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                        function04 = function052;
                    }
                } else {
                    composer2.startReplaceGroup(i6);
                    objRememberedValue = composer2.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue;
                    composer2.endReplaceGroup();
                    composer3 = composer2;
                    z = z2;
                    SnapshotState4<Float> snapshotState4AnimateFloatAsState22 = AnimateAsState.animateFloatAsState(z2 ? 0.0f : 1.0f, AnimationSpecKt.tween$default(500, 0, null, 6, null), 0.0f, "pillFadeIn", null, composer3, 3120, 20);
                    Boolean boolValueOf22 = Boolean.valueOf(z);
                    composer3.startReplaceGroup(-1633490746);
                    zChanged = composer3.changed(z);
                    objRememberedValue2 = composer3.rememberedValue();
                    if (zChanged) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        function02 = function0;
        i5 = i3;
        if ((i5 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DashboardPillButton$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform DashboardPillButton$lambda$9$lambda$8(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(500, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(500, 0, null, 6, null), 0.0f, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:107:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:239:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0101  */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v82 */
    /* renamed from: LottieLayersComposable-_UtchM0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13238LottieLayersComposable_UtchM0(final DashboardPillData dashboardPillData, final LottieComposition lottieComposition, final LottieComposition lottieComposition2, final String str, final String str2, final float f, final float f2, final RoundedCornerShape roundedCornerShape, final RoundedCornerShape roundedCornerShape2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        LottieComposition lottieComposition3;
        LottieComposition lottieComposition4;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Color color;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        Object obj;
        ?? r3;
        DashboardPillData4 visualStyle;
        Color colorM6701boximpl;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1298775552);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(dashboardPillData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            lottieComposition3 = lottieComposition;
        } else {
            lottieComposition3 = lottieComposition;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(lottieComposition3) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                lottieComposition4 = lottieComposition2;
                i3 |= composerStartRestartGroup.changedInstance(lottieComposition4) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changed(f) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changed(f2) ? 1048576 : 524288;
            }
            if ((i2 & 128) == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= composerStartRestartGroup.changed(roundedCornerShape) ? 8388608 : 4194304;
            }
            if ((i2 & 256) == 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i3 |= composerStartRestartGroup.changed(roundedCornerShape2) ? 67108864 : 33554432;
            }
            i4 = i2 & 512;
            if (i4 != 0) {
                if ((805306368 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 536870912 : 268435456;
                }
                if ((i3 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1298775552, i3, -1, "com.robinhood.android.dashboardpill.ui.LottieLayersComposable (DashboardPillButton.kt:319)");
                    }
                    DashboardPillData4 visualStyle2 = dashboardPillData.getVisualStyle();
                    DashboardPillData4.Custom custom = !(visualStyle2 instanceof DashboardPillData4.Custom) ? (DashboardPillData4.Custom) visualStyle2 : null;
                    ThemedColorDto borderColor = custom == null ? custom.getBorderColor() : null;
                    composerStartRestartGroup.startReplaceGroup(-1712162928);
                    Color composeColor = borderColor != null ? null : SduiColors2.toComposeColor(borderColor, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    int i5 = i3;
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Modifier modifier5 = modifier4;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor);
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    color = composeColor;
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-802687037);
                    if (Intrinsics.areEqual(dashboardPillData.getVisualStyle(), DashboardPillData4.CryptoLive.INSTANCE) || str == null) {
                        composer2 = composerStartRestartGroup;
                        obj = null;
                        r3 = 0;
                    } else {
                        obj = null;
                        r3 = 0;
                        LottieAnimation2.LottieAnimation(lottieComposition3, Modifier.INSTANCE, false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, false, false, null, null, ContentScale.INSTANCE.getNone(), false, false, null, false, null, composerStartRestartGroup, ((i5 >> 3) & 14) | 1572912, 196608, 0, 2064316);
                        composer2 = composerStartRestartGroup;
                    }
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(-802673881);
                    if (str2 == null) {
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        float f3 = CRYPTO_SEASON_PILL_LOTTIE_BORDER_WIDTH;
                        Modifier modifierClip = Clip.clip(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion3, C2002Dp.m7995constructorimpl(f + f3)), C2002Dp.m7995constructorimpl(f3 + f2)), roundedCornerShape2);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), r3);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, r3);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierClip);
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                        Composer composer3 = composer2;
                        LottieAnimation2.LottieAnimation(lottieComposition4, SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, false, false, null, null, ContentScale.INSTANCE.getFillWidth(), false, false, null, false, null, composer3, ((i5 >> 6) & 14) | 1572912, 196608, 0, 2064316);
                        composer2 = composer3;
                        composer2.endNode();
                        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Clip.clip(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion3, f), f2), roundedCornerShape), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getStart(), composer2, 0);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierM4872backgroundbw27NRU$default);
                        Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        composer2.endNode();
                    }
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(-802641000);
                    if (str != null) {
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        Modifier modifierClip2 = Clip.clip(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion4, f), f2), roundedCornerShape);
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer2.changedInstance(dashboardPillData);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.dashboardpill.ui.DashboardPillButtonKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return DashboardPillButton5.LottieLayersComposable__UtchM0$lambda$17$lambda$14$lambda$13(dashboardPillData, (GraphicsLayerScope) obj2);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        Modifier modifierGraphicsLayer = GraphicsLayerModifier6.graphicsLayer(modifierClip2, (Function1) objRememberedValue);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                        int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer2, modifierGraphicsLayer);
                        Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor4);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion2.getSetModifier());
                        Composer composer4 = composer2;
                        LottieAnimation2.LottieAnimation(lottieComposition, boxScopeInstance.matchParentSize(companion4), false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, false, false, null, null, ContentScale.INSTANCE.getFillWidth(), false, false, null, false, null, composer4, ((i5 >> 3) & 14) | 1572864, 196608, 0, 2064316);
                        composer2 = composer4;
                        composer2.endNode();
                    }
                    composer2.endReplaceGroup();
                    visualStyle = dashboardPillData.getVisualStyle();
                    if (!(visualStyle instanceof DashboardPillData4.Custom)) {
                        composer2.startReplaceGroup(888845356);
                        ThemedColorDto overlayColor = ((DashboardPillData4.Custom) visualStyle).getOverlayColor();
                        colorM6701boximpl = overlayColor == null ? null : SduiColors2.toComposeColor(overlayColor, composer2, 0);
                        composer2.endReplaceGroup();
                    } else if (visualStyle.isCrypto()) {
                        composer2.startReplaceGroup(888905806);
                        long j = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).getIsDay() ? CRYPTO_SEASON_PILL_COLOR_LIGHT : CRYPTO_SEASON_PILL_COLOR_DARK;
                        composer2.endReplaceGroup();
                        colorM6701boximpl = Color.m6701boximpl(j);
                    } else {
                        composer2.startReplaceGroup(889125719);
                        composer2.endReplaceGroup();
                        colorM6701boximpl = null;
                    }
                    composer2.startReplaceGroup(-802599993);
                    if (colorM6701boximpl != null) {
                        Modifier modifierAlign = boxScopeInstance.align(ZIndexModifier2.zIndex(Background3.m4872backgroundbw27NRU$default(Clip.clip(SizeKt.m5174width3ABfNKs(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, f2), f), roundedCornerShape), colorM6701boximpl.getValue(), null, 2, null), 3.0f), companion.getCenter());
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getStart(), composer2, 0);
                        int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer2, modifierAlign);
                        Function0<ComposeUiNode> constructor5 = companion2.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor5);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion2.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        composer2.endNode();
                    }
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(-802588131);
                    if (color != null && str2 == null) {
                        BoxKt.Box(BorderKt.m4876borderxT4_qwU(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, f), f2), !visualStyle.isCrypto() ? CRYPTO_SEASON_PILL_LOTTIE_BORDER_WIDTH : CUSTOM_BORDER_WIDTH, color.getValue(), roundedCornerShape), composer2, 0);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboardpill.ui.DashboardPillButtonKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return DashboardPillButton5.LottieLayersComposable__UtchM0$lambda$18(dashboardPillData, lottieComposition, lottieComposition2, str, str2, f, f2, roundedCornerShape, roundedCornerShape2, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 805306368;
            modifier2 = modifier;
            if ((i3 & 306783379) == 306783378) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                DashboardPillData4 visualStyle22 = dashboardPillData.getVisualStyle();
                if (!(visualStyle22 instanceof DashboardPillData4.Custom)) {
                }
                if (custom == null) {
                }
                composerStartRestartGroup.startReplaceGroup(-1712162928);
                if (borderColor != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Alignment.Companion companion5 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getCenter(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                int i52 = i3;
                Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Modifier modifier52 = modifier4;
                Function0<ComposeUiNode> constructor6 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                color = composeColor;
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy4, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap6, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier6, companion22.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-802687037);
                    if (Intrinsics.areEqual(dashboardPillData.getVisualStyle(), DashboardPillData4.CryptoLive.INSTANCE)) {
                        composer2 = composerStartRestartGroup;
                        obj = null;
                        r3 = 0;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(-802673881);
                        if (str2 == null) {
                        }
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(-802641000);
                        if (str != null) {
                        }
                        composer2.endReplaceGroup();
                        visualStyle = dashboardPillData.getVisualStyle();
                        if (!(visualStyle instanceof DashboardPillData4.Custom)) {
                        }
                        composer2.startReplaceGroup(-802599993);
                        if (colorM6701boximpl != null) {
                        }
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(-802588131);
                        if (color != null) {
                            BoxKt.Box(BorderKt.m4876borderxT4_qwU(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, f), f2), !visualStyle.isCrypto() ? CRYPTO_SEASON_PILL_LOTTIE_BORDER_WIDTH : CUSTOM_BORDER_WIDTH, color.getValue(), roundedCornerShape), composer2, 0);
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        lottieComposition4 = lottieComposition2;
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i4 = i2 & 512;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LottieLayersComposable__UtchM0$lambda$17$lambda$14$lambda$13(DashboardPillData dashboardPillData, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        if (dashboardPillData.getVisualStyle().isCrypto()) {
            graphicsLayer.setRenderEffect(RenderEffect2.m6823BlurEffect3YTHUZs$default(32.0f, 32.0f, 0, 4, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0114  */
    /* renamed from: PillPulseComposable-o3XDK20, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13241PillPulseComposableo3XDK20(final DashboardPillData dashboardPillData, final float f, final float f2, Modifier modifier, RoundedCornerShape roundedCornerShape, Composer composer, final int i, final int i2) {
        DashboardPillData dashboardPillData2;
        int i3;
        Modifier modifier2;
        RoundedCornerShape roundedCornerShape2;
        Modifier modifier3;
        int i4;
        RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4;
        DashboardPillData4 visualStyle;
        Color composeColor;
        long jM6725getTransparent0d7_KjU;
        float fFloatValue;
        float f3;
        float f4;
        final RoundedCornerShape roundedCornerShape3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(298362108);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            dashboardPillData2 = dashboardPillData;
        } else if ((i & 6) == 0) {
            dashboardPillData2 = dashboardPillData;
            i3 = (composerStartRestartGroup.changedInstance(dashboardPillData2) ? 4 : 2) | i;
        } else {
            dashboardPillData2 = dashboardPillData;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    roundedCornerShape2 = roundedCornerShape;
                    int i6 = composerStartRestartGroup.changed(roundedCornerShape2) ? 16384 : 8192;
                    i3 |= i6;
                } else {
                    roundedCornerShape2 = roundedCornerShape;
                }
                i3 |= i6;
            } else {
                roundedCornerShape2 = roundedCornerShape;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) == 0) {
                        i4 = i3 & (-57345);
                        roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(100));
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(298362108, i4, -1, "com.robinhood.android.dashboardpill.ui.PillPulseComposable (DashboardPillButton.kt:437)");
                    }
                    visualStyle = dashboardPillData2.getVisualStyle();
                    if (Intrinsics.areEqual(visualStyle, DashboardPillData4.Rhc.INSTANCE)) {
                        composerStartRestartGroup.startReplaceGroup(-1036812222);
                        long jM21368getAccent0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21368getAccent0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                        composeColor = Color.m6701boximpl(jM21368getAccent0d7_KjU);
                    } else if (Intrinsics.areEqual(visualStyle, DashboardPillData4.Gold.INSTANCE)) {
                        composerStartRestartGroup.startReplaceGroup(-1036810522);
                        long cloneLight = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getCloneLight();
                        composerStartRestartGroup.endReplaceGroup();
                        composeColor = Color.m6701boximpl(cloneLight);
                    } else if (Intrinsics.areEqual(visualStyle, DashboardPillData4.Standard.INSTANCE)) {
                        composerStartRestartGroup.startReplaceGroup(-1036808576);
                        long neon = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getNeon();
                        composerStartRestartGroup.endReplaceGroup();
                        composeColor = Color.m6701boximpl(neon);
                    } else if (visualStyle instanceof DashboardPillData4.Custom) {
                        composerStartRestartGroup.startReplaceGroup(-2076232906);
                        ThemedColorDto pulseColor = ((DashboardPillData4.Custom) visualStyle).getPulseColor();
                        composeColor = pulseColor == null ? null : SduiColors2.toComposeColor(pulseColor, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (!Intrinsics.areEqual(visualStyle, DashboardPillData4.Crypto.INSTANCE) && !Intrinsics.areEqual(visualStyle, DashboardPillData4.CryptoLive.INSTANCE) && !Intrinsics.areEqual(visualStyle, DashboardPillData4.Market.INSTANCE)) {
                            composerStartRestartGroup.startReplaceGroup(-1036814805);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-2076114239);
                        composerStartRestartGroup.endReplaceGroup();
                        composeColor = null;
                    }
                    if (composeColor != null) {
                        jM6725getTransparent0d7_KjU = composeColor.getValue();
                    } else {
                        jM6725getTransparent0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
                    }
                    long j = jM6725getTransparent0d7_KjU;
                    composerStartRestartGroup.startReplaceGroup(-1036797937);
                    if (((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                        f3 = 1.2f;
                        f4 = 1.5f;
                        fFloatValue = 0.5f;
                    } else {
                        TweenSpec tweenSpecTween = AnimationSpecKt.tween(1000, 3000, Easing3.getLinearEasing());
                        InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransition4.rememberInfiniteTransition("scaleX", composerStartRestartGroup, 6, 0);
                        RepeatMode repeatMode = RepeatMode.Restart;
                        InfiniteRepeatableSpec infiniteRepeatableSpecM4815infiniteRepeatable9IiC70o$default = AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(tweenSpecTween, repeatMode, 0L, 4, null);
                        int i7 = InfiniteTransition.$stable;
                        int i8 = InfiniteRepeatableSpec.$stable;
                        float fFloatValue2 = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition, 1.0f, 1.2f, infiniteRepeatableSpecM4815infiniteRepeatable9IiC70o$default, "scaleXAnimation", composerStartRestartGroup, i7 | 25008 | (i8 << 9), 0).getValue().floatValue();
                        float fFloatValue3 = InfiniteTransition4.animateFloat(InfiniteTransition4.rememberInfiniteTransition("scaleY", composerStartRestartGroup, 6, 0), 1.0f, 1.5f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(tweenSpecTween, repeatMode, 0L, 4, null), "scaleYAnimation", composerStartRestartGroup, i7 | 25008 | (i8 << 9), 0).getValue().floatValue();
                        fFloatValue = InfiniteTransition4.animateFloat(InfiniteTransition4.rememberInfiniteTransition("pulseState", composerStartRestartGroup, 6, 0), 0.0f, 1.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(tweenSpecTween, repeatMode, 0L, 4, null), "pulseState", composerStartRestartGroup, i7 | 25008 | (i8 << 9), 0).getValue().floatValue();
                        f3 = fFloatValue2;
                        f4 = fFloatValue3;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BoxKt.Box(Background3.m4872backgroundbw27NRU$default(Clip.clip(Scale2.scale(SizeKt.m5171sizeVpY3zN4(modifier3, f, f2), f3, f4), roundedCornerShapeM5327RoundedCornerShape0680j_4), Color.m6705copywmQWz5c$default(j, 1.0f - fFloatValue, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Modifier modifier5 = modifier3;
                    roundedCornerShape3 = roundedCornerShapeM5327RoundedCornerShape0680j_4;
                    modifier4 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    modifier3 = modifier2;
                }
                i4 = i3;
                roundedCornerShapeM5327RoundedCornerShape0680j_4 = roundedCornerShape2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                visualStyle = dashboardPillData2.getVisualStyle();
                if (Intrinsics.areEqual(visualStyle, DashboardPillData4.Rhc.INSTANCE)) {
                }
                if (composeColor != null) {
                }
                long j2 = jM6725getTransparent0d7_KjU;
                composerStartRestartGroup.startReplaceGroup(-1036797937);
                if (((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                BoxKt.Box(Background3.m4872backgroundbw27NRU$default(Clip.clip(Scale2.scale(SizeKt.m5171sizeVpY3zN4(modifier3, f, f2), f3, f4), roundedCornerShapeM5327RoundedCornerShape0680j_4), Color.m6705copywmQWz5c$default(j2, 1.0f - fFloatValue, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier52 = modifier3;
                roundedCornerShape3 = roundedCornerShapeM5327RoundedCornerShape0680j_4;
                modifier4 = modifier52;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                roundedCornerShape3 = roundedCornerShape2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboardpill.ui.DashboardPillButtonKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DashboardPillButton5.PillPulseComposable_o3XDK20$lambda$19(dashboardPillData, f, f2, modifier4, roundedCornerShape3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 16) == 0) {
                    i4 = i3;
                    roundedCornerShapeM5327RoundedCornerShape0680j_4 = roundedCornerShape2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                visualStyle = dashboardPillData2.getVisualStyle();
                if (Intrinsics.areEqual(visualStyle, DashboardPillData4.Rhc.INSTANCE)) {
                }
                if (composeColor != null) {
                }
                long j22 = jM6725getTransparent0d7_KjU;
                composerStartRestartGroup.startReplaceGroup(-1036797937);
                if (((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                BoxKt.Box(Background3.m4872backgroundbw27NRU$default(Clip.clip(Scale2.scale(SizeKt.m5171sizeVpY3zN4(modifier3, f, f2), f3, f4), roundedCornerShapeM5327RoundedCornerShape0680j_4), Color.m6705copywmQWz5c$default(j22, 1.0f - fFloatValue, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier522 = modifier3;
                roundedCornerShape3 = roundedCornerShapeM5327RoundedCornerShape0680j_4;
                modifier4 = modifier522;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0114  */
    /* renamed from: TransparentPillPulseComposable-o3XDK20, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13242TransparentPillPulseComposableo3XDK20(final DashboardPillData dashboardPillData, final float f, final float f2, Modifier modifier, RoundedCornerShape roundedCornerShape, Composer composer, final int i, final int i2) {
        DashboardPillData dashboardPillData2;
        int i3;
        Modifier modifier2;
        RoundedCornerShape roundedCornerShape2;
        RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4;
        int i4;
        Modifier modifier3;
        DashboardPillData4 visualStyle;
        Color composeColor;
        long jM6725getTransparent0d7_KjU;
        final Density density;
        final float fM7995constructorimpl;
        boolean z;
        float fFloatValue;
        float fM7995constructorimpl2;
        final long jM6705copywmQWz5c$default;
        boolean z2;
        boolean zChanged;
        Object obj;
        final RoundedCornerShape roundedCornerShape3;
        Modifier modifier4;
        int i5;
        final RoundedCornerShape roundedCornerShape4;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1546644966);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            dashboardPillData2 = dashboardPillData;
        } else if ((i & 6) == 0) {
            dashboardPillData2 = dashboardPillData;
            i3 = (composerStartRestartGroup.changedInstance(dashboardPillData2) ? 4 : 2) | i;
        } else {
            dashboardPillData2 = dashboardPillData;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    roundedCornerShape2 = roundedCornerShape;
                    int i7 = composerStartRestartGroup.changed(roundedCornerShape2) ? 16384 : 8192;
                    i3 |= i7;
                } else {
                    roundedCornerShape2 = roundedCornerShape;
                }
                i3 |= i7;
            } else {
                roundedCornerShape2 = roundedCornerShape;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                } else {
                    if (i6 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 16) == 0) {
                        roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(100));
                        Modifier modifier6 = modifier2;
                        i4 = i3 & (-57345);
                        modifier3 = modifier6;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1546644966, i4, -1, "com.robinhood.android.dashboardpill.ui.TransparentPillPulseComposable (DashboardPillButton.kt:515)");
                    }
                    visualStyle = dashboardPillData2.getVisualStyle();
                    if (Intrinsics.areEqual(visualStyle, DashboardPillData4.Rhc.INSTANCE)) {
                        composerStartRestartGroup.startReplaceGroup(267139084);
                        long jM21368getAccent0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21368getAccent0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                        composeColor = Color.m6701boximpl(jM21368getAccent0d7_KjU);
                    } else if (Intrinsics.areEqual(visualStyle, DashboardPillData4.Gold.INSTANCE)) {
                        composerStartRestartGroup.startReplaceGroup(267140784);
                        long cloneLight = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getCloneLight();
                        composerStartRestartGroup.endReplaceGroup();
                        composeColor = Color.m6701boximpl(cloneLight);
                    } else if (Intrinsics.areEqual(visualStyle, DashboardPillData4.Standard.INSTANCE)) {
                        composerStartRestartGroup.startReplaceGroup(267142730);
                        long neon = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getNeon();
                        composerStartRestartGroup.endReplaceGroup();
                        composeColor = Color.m6701boximpl(neon);
                    } else if (visualStyle instanceof DashboardPillData4.Custom) {
                        composerStartRestartGroup.startReplaceGroup(-308448084);
                        ThemedColorDto pulseColor = ((DashboardPillData4.Custom) visualStyle).getPulseColor();
                        composeColor = pulseColor == null ? null : SduiColors2.toComposeColor(pulseColor, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (!Intrinsics.areEqual(visualStyle, DashboardPillData4.Crypto.INSTANCE) && !Intrinsics.areEqual(visualStyle, DashboardPillData4.CryptoLive.INSTANCE) && !Intrinsics.areEqual(visualStyle, DashboardPillData4.Market.INSTANCE)) {
                            composerStartRestartGroup.startReplaceGroup(267136501);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-308329417);
                        composerStartRestartGroup.endReplaceGroup();
                        composeColor = null;
                    }
                    if (composeColor != null) {
                        jM6725getTransparent0d7_KjU = composeColor.getValue();
                    } else {
                        jM6725getTransparent0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
                    }
                    long j = jM6725getTransparent0d7_KjU;
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    fM7995constructorimpl = C2002Dp.m7995constructorimpl(PULSE_EXPANSION_DP);
                    composerStartRestartGroup.startReplaceGroup(267155212);
                    if (((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                        fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(fM7995constructorimpl / 2.0f);
                        z = false;
                        fFloatValue = 1.0f;
                    } else {
                        TweenSpec tweenSpecTween = AnimationSpecKt.tween(1000, CUSTOM_STYLE_PULSE_FREQUENCY_MS, Easing3.getLinearEasing());
                        InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransition4.rememberInfiniteTransition("expansion", composerStartRestartGroup, 6, 0);
                        RepeatMode repeatMode = RepeatMode.Restart;
                        InfiniteRepeatableSpec infiniteRepeatableSpecM4815infiniteRepeatable9IiC70o$default = AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(tweenSpecTween, repeatMode, 0L, 4, null);
                        int i8 = InfiniteTransition.$stable;
                        int i9 = InfiniteRepeatableSpec.$stable;
                        z = false;
                        float fM7995constructorimpl3 = C2002Dp.m7995constructorimpl(InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, infiniteRepeatableSpecM4815infiniteRepeatable9IiC70o$default, "expansionAnimation", composerStartRestartGroup, i8 | 25008 | (i9 << 9), 0).getValue().floatValue() * fM7995constructorimpl);
                        fFloatValue = InfiniteTransition4.animateFloat(InfiniteTransition4.rememberInfiniteTransition("pulseState", composerStartRestartGroup, 6, 0), 0.0f, 1.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(tweenSpecTween, repeatMode, 0L, 4, null), "pulseState", composerStartRestartGroup, i8 | 25008 | (i9 << 9), 0).getValue().floatValue();
                        fM7995constructorimpl2 = fM7995constructorimpl3;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(j, 1.0f - fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                    Modifier modifierM5171sizeVpY3zN4 = SizeKt.m5171sizeVpY3zN4(modifier3, f, C2002Dp.m7995constructorimpl(f2 + fM7995constructorimpl));
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    z2 = true;
                    boolean zChanged2 = ((i4 & 112) == 32 ? true : z) | composerStartRestartGroup.changed(fM7995constructorimpl2) | ((i4 & 896) == 256) | composerStartRestartGroup.changed(density);
                    if ((((57344 & i4) ^ 24576) <= 16384 || !composerStartRestartGroup.changed(roundedCornerShapeM5327RoundedCornerShape0680j_4)) && (i4 & 24576) != 16384) {
                        z2 = false;
                    }
                    zChanged = zChanged2 | z2 | composerStartRestartGroup.changed(jM6705copywmQWz5c$default);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        roundedCornerShape3 = roundedCornerShapeM5327RoundedCornerShape0680j_4;
                        final float f3 = fM7995constructorimpl2;
                        modifier4 = modifier3;
                        i5 = 0;
                        obj = new Function1() { // from class: com.robinhood.android.dashboardpill.ui.DashboardPillButtonKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return DashboardPillButton5.TransparentPillPulseComposable_o3XDK20$lambda$26$lambda$25(f, f3, f2, density, fM7995constructorimpl, roundedCornerShape3, jM6705copywmQWz5c$default, (DrawScope) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(obj);
                    } else {
                        modifier4 = modifier3;
                        obj = objRememberedValue;
                        i5 = 0;
                        roundedCornerShape3 = roundedCornerShapeM5327RoundedCornerShape0680j_4;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Canvas2.Canvas(modifierM5171sizeVpY3zN4, (Function1) obj, composerStartRestartGroup, i5);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    roundedCornerShape4 = roundedCornerShape3;
                    modifier5 = modifier4;
                }
                Modifier modifier7 = modifier2;
                i4 = i3;
                modifier3 = modifier7;
                roundedCornerShapeM5327RoundedCornerShape0680j_4 = roundedCornerShape2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                visualStyle = dashboardPillData2.getVisualStyle();
                if (Intrinsics.areEqual(visualStyle, DashboardPillData4.Rhc.INSTANCE)) {
                }
                if (composeColor != null) {
                }
                long j2 = jM6725getTransparent0d7_KjU;
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                fM7995constructorimpl = C2002Dp.m7995constructorimpl(PULSE_EXPANSION_DP);
                composerStartRestartGroup.startReplaceGroup(267155212);
                if (((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(j2, 1.0f - fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                Modifier modifierM5171sizeVpY3zN42 = SizeKt.m5171sizeVpY3zN4(modifier3, f, C2002Dp.m7995constructorimpl(f2 + fM7995constructorimpl));
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                z2 = true;
                boolean zChanged22 = ((i4 & 112) == 32 ? true : z) | composerStartRestartGroup.changed(fM7995constructorimpl2) | ((i4 & 896) == 256) | composerStartRestartGroup.changed(density);
                if (((57344 & i4) ^ 24576) <= 16384) {
                    z2 = false;
                    zChanged = zChanged22 | z2 | composerStartRestartGroup.changed(jM6705copywmQWz5c$default);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        roundedCornerShape3 = roundedCornerShapeM5327RoundedCornerShape0680j_4;
                        final float f32 = fM7995constructorimpl2;
                        modifier4 = modifier3;
                        i5 = 0;
                        obj = new Function1() { // from class: com.robinhood.android.dashboardpill.ui.DashboardPillButtonKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return DashboardPillButton5.TransparentPillPulseComposable_o3XDK20$lambda$26$lambda$25(f, f32, f2, density, fM7995constructorimpl, roundedCornerShape3, jM6705copywmQWz5c$default, (DrawScope) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(obj);
                        composerStartRestartGroup.endReplaceGroup();
                        Canvas2.Canvas(modifierM5171sizeVpY3zN42, (Function1) obj, composerStartRestartGroup, i5);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        roundedCornerShape4 = roundedCornerShape3;
                        modifier5 = modifier4;
                    }
                } else {
                    z2 = false;
                    zChanged = zChanged22 | z2 | composerStartRestartGroup.changed(jM6705copywmQWz5c$default);
                    Object objRememberedValue22 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier5 = modifier2;
                roundedCornerShape4 = roundedCornerShape2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboardpill.ui.DashboardPillButtonKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return DashboardPillButton5.TransparentPillPulseComposable_o3XDK20$lambda$27(dashboardPillData, f, f2, modifier5, roundedCornerShape4, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i6 != 0) {
                }
                if ((i2 & 16) == 0) {
                    Modifier modifier72 = modifier2;
                    i4 = i3;
                    modifier3 = modifier72;
                    roundedCornerShapeM5327RoundedCornerShape0680j_4 = roundedCornerShape2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                visualStyle = dashboardPillData2.getVisualStyle();
                if (Intrinsics.areEqual(visualStyle, DashboardPillData4.Rhc.INSTANCE)) {
                }
                if (composeColor != null) {
                }
                long j22 = jM6725getTransparent0d7_KjU;
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                fM7995constructorimpl = C2002Dp.m7995constructorimpl(PULSE_EXPANSION_DP);
                composerStartRestartGroup.startReplaceGroup(267155212);
                if (((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(j22, 1.0f - fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                Modifier modifierM5171sizeVpY3zN422 = SizeKt.m5171sizeVpY3zN4(modifier3, f, C2002Dp.m7995constructorimpl(f2 + fM7995constructorimpl));
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                z2 = true;
                boolean zChanged222 = ((i4 & 112) == 32 ? true : z) | composerStartRestartGroup.changed(fM7995constructorimpl2) | ((i4 & 896) == 256) | composerStartRestartGroup.changed(density);
                if (((57344 & i4) ^ 24576) <= 16384) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TransparentPillPulseComposable_o3XDK20$lambda$26$lambda$25(float f, float f2, float f3, Density density, float f4, RoundedCornerShape roundedCornerShape, long j, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float f5 = 2;
        float fMo5016toPx0680j_4 = Canvas.mo5016toPx0680j_4(f) + (Canvas.mo5016toPx0680j_4(f2) * f5);
        RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(density.mo5012toDpu2uoSUM((Canvas.mo5016toPx0680j_4(f3) + (Canvas.mo5016toPx0680j_4(f2) * f5)) / 2.0f));
        long jM6575constructorimpl = Size.m6575constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_4) << 32) | (Float.floatToRawIntBits(r6) & 4294967295L));
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32)) - fMo5016toPx0680j_4) / 2.0f;
        float fMo5016toPx0680j_42 = Canvas.mo5016toPx0680j_4(f4) - Canvas.mo5016toPx0680j_4(f2);
        long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_42) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
        float fMo5016toPx0680j_43 = Canvas.mo5016toPx0680j_4(f);
        float fMo5016toPx0680j_44 = Canvas.mo5016toPx0680j_4(f3);
        long jM6575constructorimpl2 = Size.m6575constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_44) & 4294967295L) | (Float.floatToRawIntBits(fMo5016toPx0680j_43) << 32));
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32)) - fMo5016toPx0680j_43) / 2.0f;
        float fMo5016toPx0680j_45 = Canvas.mo5016toPx0680j_4(f4);
        long jM6535constructorimpl2 = Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fMo5016toPx0680j_45) & 4294967295L));
        Path pathM1925x17c948ec = m1925x17c948ec(Canvas, roundedCornerShapeM5327RoundedCornerShape0680j_4, jM6575constructorimpl, jM6535constructorimpl);
        Path pathM1925x17c948ec2 = m1925x17c948ec(Canvas, roundedCornerShape, jM6575constructorimpl2, jM6535constructorimpl2);
        Path Path = AndroidPath_androidKt.Path();
        Path.mo6631setFillTypeoQ8Xj4U(PathFillType.INSTANCE.m6809getEvenOddRgk1Os());
        Path.m6804addPathUv8p0NA$default(Path, pathM1925x17c948ec, 0L, 2, null);
        Path.m6804addPathUv8p0NA$default(Path, pathM1925x17c948ec2, 0L, 2, null);
        DrawScope.m6955drawPathLG529CI$default(Canvas, Path, j, 0.0f, DrawScope3.INSTANCE, null, 0, 52, null);
        return Unit.INSTANCE;
    }

    /* renamed from: TransparentPillPulseComposable_o3XDK20$lambda$26$lambda$25$outlineToPath */
    private static final Path m1925x17c948ec(DrawScope drawScope, RoundedCornerShape roundedCornerShape, long j, long j2) {
        Outline outlineMo4911createOutlinePq9zytI = roundedCornerShape.mo4911createOutlinePq9zytI(j, drawScope.getLayoutDirection(), drawScope);
        if (outlineMo4911createOutlinePq9zytI instanceof Outline.Rounded) {
            Path Path = AndroidPath_androidKt.Path();
            Path.addRoundRect$default(Path, ((Outline.Rounded) outlineMo4911createOutlinePq9zytI).getRoundRect(), null, 2, null);
            Path.mo6632translatek4lQ0M(j2);
            return Path;
        }
        if (outlineMo4911createOutlinePq9zytI instanceof Outline.Rectangle) {
            Path Path2 = AndroidPath_androidKt.Path();
            Path.addRect$default(Path2, ((Outline.Rectangle) outlineMo4911createOutlinePq9zytI).getRect(), null, 2, null);
            Path2.mo6632translatek4lQ0M(j2);
            return Path2;
        }
        if (!(outlineMo4911createOutlinePq9zytI instanceof Outline.Generic)) {
            throw new NoWhenBranchMatchedException();
        }
        Path path = ((Outline.Generic) outlineMo4911createOutlinePq9zytI).getPath();
        path.mo6632translatek4lQ0M(j2);
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0158  */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [androidx.compose.ui.graphics.Shape, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* renamed from: PillButtonComposable-FU0evQE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13240PillButtonComposableFU0evQE(final Clock clock, final DashboardPillData dashboardPillData, final long j, Modifier modifier, RoundedCornerShape roundedCornerShape, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        long j2;
        Modifier modifier2;
        RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4;
        int i4;
        Function0<Unit> function02;
        DashboardPillData4 visualStyle;
        DashboardPillData4.Rhc rhc;
        Color colorM6701boximpl;
        Color color;
        long neon;
        Object objRememberedValue;
        Composer.Companion companion;
        int i5;
        SnapshotMutationPolicy snapshotMutationPolicy;
        Object objRememberedValue2;
        SnapshotState snapshotState;
        SnapshotState snapshotState2;
        ?? r8;
        Composer composer2;
        boolean zChanged;
        Object objRememberedValue3;
        String completionText;
        BentoTheme bentoTheme;
        int i6;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Row6 row6;
        ServerToBentoAssetMapper2 iconAsset;
        String lottieUrlLight;
        int i7;
        Composer composer3;
        DashboardPillData4.Rhc rhc2;
        Modifier modifierApplyStaticWidth;
        String text;
        Composer composer4;
        final Function0<Unit> function03;
        final RoundedCornerShape roundedCornerShape2;
        boolean z;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1863852456);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(clock) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(dashboardPillData) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
            }
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    roundedCornerShapeM5327RoundedCornerShape0680j_4 = roundedCornerShape;
                    int i9 = composerStartRestartGroup.changed(roundedCornerShapeM5327RoundedCornerShape0680j_4) ? 16384 : 8192;
                    i3 |= i9;
                } else {
                    roundedCornerShapeM5327RoundedCornerShape0680j_4 = roundedCornerShape;
                }
                i3 |= i9;
            } else {
                roundedCornerShapeM5327RoundedCornerShape0680j_4 = roundedCornerShape;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
                }
                if ((i3 & 74899) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer4 = composerStartRestartGroup;
                    roundedCornerShape2 = roundedCornerShapeM5327RoundedCornerShape0680j_4;
                    function03 = function02;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(100));
                        }
                        if (i4 != 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.dashboardpill.ui.DashboardPillButtonKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function02 = (Function0) objRememberedValue4;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                    }
                    Modifier modifier3 = modifier2;
                    RoundedCornerShape roundedCornerShape3 = roundedCornerShapeM5327RoundedCornerShape0680j_4;
                    int i10 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1863852456, i10, -1, "com.robinhood.android.dashboardpill.ui.PillButtonComposable (DashboardPillButton.kt:645)");
                    }
                    visualStyle = dashboardPillData.getVisualStyle();
                    rhc = DashboardPillData4.Rhc.INSTANCE;
                    if (!Intrinsics.areEqual(visualStyle, rhc)) {
                        composerStartRestartGroup.startReplaceGroup(160861742);
                        long jM21368getAccent0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21368getAccent0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                        colorM6701boximpl = Color.m6701boximpl(jM21368getAccent0d7_KjU);
                    } else if (Intrinsics.areEqual(visualStyle, DashboardPillData4.Market.INSTANCE)) {
                        composerStartRestartGroup.startReplaceGroup(160863737);
                        long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21368getAccent0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.endReplaceGroup();
                        colorM6701boximpl = Color.m6701boximpl(jM6705copywmQWz5c$default);
                    } else if (Intrinsics.areEqual(visualStyle, DashboardPillData4.Standard.INSTANCE)) {
                        composerStartRestartGroup.startReplaceGroup(160865446);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i11 = BentoTheme.$stable;
                        if (bentoTheme2.getColors(composerStartRestartGroup, i11).getIsDay()) {
                            composerStartRestartGroup.startReplaceGroup(691887789);
                            neon = bentoTheme2.getColors(composerStartRestartGroup, i11).getJet();
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(691938412);
                            neon = bentoTheme2.getColors(composerStartRestartGroup, i11).getNeon();
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        colorM6701boximpl = Color.m6701boximpl(neon);
                    } else if (Intrinsics.areEqual(visualStyle, DashboardPillData4.Crypto.INSTANCE) || Intrinsics.areEqual(visualStyle, DashboardPillData4.CryptoLive.INSTANCE)) {
                        composerStartRestartGroup.startReplaceGroup(160872019);
                        composerStartRestartGroup.endReplaceGroup();
                        colorM6701boximpl = Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU());
                    } else if (visualStyle instanceof DashboardPillData4.Custom) {
                        composerStartRestartGroup.startReplaceGroup(692112632);
                        ThemedColorDto backgroundColor = ((DashboardPillData4.Custom) visualStyle).getBackgroundColor();
                        Color composeColor = backgroundColor == null ? null : SduiColors2.toComposeColor(backgroundColor, composerStartRestartGroup, 0);
                        long value = composeColor != null ? composeColor.getValue() : Color.INSTANCE.m6725getTransparent0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                        colorM6701boximpl = Color.m6701boximpl(value);
                    } else {
                        if (!Intrinsics.areEqual(visualStyle, DashboardPillData4.Gold.INSTANCE)) {
                            composerStartRestartGroup.startReplaceGroup(160859341);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(692204949);
                        composerStartRestartGroup.endReplaceGroup();
                        color = null;
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            i5 = 2;
                            snapshotMutationPolicy = null;
                            objRememberedValue = SnapshotState3.mutableStateOf$default(Duration.ZERO, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            i5 = 2;
                            snapshotMutationPolicy = null;
                        }
                        SnapshotState snapshotState3 = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, i5, snapshotMutationPolicy);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        SnapshotState snapshotState4 = (SnapshotState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(160882661);
                        if (dashboardPillData.getTargetTimestamp() != null) {
                            Instant targetTimestamp = dashboardPillData.getTargetTimestamp();
                            String text2 = dashboardPillData.getText();
                            String completionText2 = dashboardPillData.getCompletionText();
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            boolean zChangedInstance = composerStartRestartGroup.changedInstance(clock) | composerStartRestartGroup.changedInstance(dashboardPillData);
                            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                                z = false;
                                DashboardPillButton8 dashboardPillButton8 = new DashboardPillButton8(clock, dashboardPillData, snapshotState3, snapshotState4, null);
                                snapshotState = snapshotState3;
                                snapshotState2 = snapshotState4;
                                composerStartRestartGroup.updateRememberedValue(dashboardPillButton8);
                                objRememberedValue5 = dashboardPillButton8;
                            } else {
                                snapshotState = snapshotState3;
                                snapshotState2 = snapshotState4;
                                z = false;
                            }
                            Function2 function2 = (Function2) objRememberedValue5;
                            composerStartRestartGroup.endReplaceGroup();
                            composer2 = composerStartRestartGroup;
                            EffectsKt.LaunchedEffect(targetTimestamp, text2, completionText2, function2, composer2, 0);
                            r8 = z;
                        } else {
                            snapshotState = snapshotState3;
                            snapshotState2 = snapshotState4;
                            r8 = snapshotMutationPolicy;
                            composer2 = composerStartRestartGroup;
                        }
                        composer2.endReplaceGroup();
                        Duration durationPillButtonComposable_FU0evQE$lambda$31 = PillButtonComposable_FU0evQE$lambda$31(snapshotState);
                        boolean zPillButtonComposable_FU0evQE$lambda$34 = PillButtonComposable_FU0evQE$lambda$34(snapshotState2);
                        String completionText3 = dashboardPillData.getCompletionText();
                        composer2.startReplaceGroup(-1746271574);
                        zChanged = composer2.changed(durationPillButtonComposable_FU0evQE$lambda$31) | composer2.changed(zPillButtonComposable_FU0evQE$lambda$34) | composer2.changed(completionText3);
                        objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                            if (!PillButtonComposable_FU0evQE$lambda$34(snapshotState2) && dashboardPillData.getCompletionText() != null) {
                                completionText = dashboardPillData.getCompletionText();
                            } else if (!PillButtonComposable_FU0evQE$lambda$31(snapshotState).isZero() || PillButtonComposable_FU0evQE$lambda$31(snapshotState).isNegative()) {
                                completionText = FormattedTimeUntil.TIME_LEFT_NONE;
                            } else {
                                Duration durationPillButtonComposable_FU0evQE$lambda$312 = PillButtonComposable_FU0evQE$lambda$31(snapshotState);
                                Intrinsics.checkNotNullExpressionValue(durationPillButtonComposable_FU0evQE$lambda$312, "PillButtonComposable_FU0evQE$lambda$31(...)");
                                completionText = FormattedTimeUntil.formatted(durationPillButtonComposable_FU0evQE$lambda$312);
                            }
                            objRememberedValue3 = completionText;
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        String str = (String) objRememberedValue3;
                        composer2.endReplaceGroup();
                        Screen screen = ((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
                        Component component = new Component(Component.ComponentType.DASHBOARD_PILL, dashboardPillData.getLoggingIdentifier(), null, 4, null);
                        String text3 = dashboardPillData.getText();
                        String str2 = text3 != null ? "" : text3;
                        String actionUrl = dashboardPillData.getActionUrl();
                        Modifier modifierClip = Clip.clip(ModifiersKt.autoLogEvents$default(modifier3, new UserInteractionEventDescriptor(null, screen, null, new Context(0, 0, 0, str2, null, null, actionUrl != null ? "" : actionUrl, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -73, -1, -1, -1, -1, -1, 16383, null), component, null, 37, null), true, false, false, true, true, null, 76, null), roundedCornerShape3);
                        if (dashboardPillData.getVisualStyle() instanceof DashboardPillData4.Gold) {
                            modifierClip = BentoSparkleInfoTag.sparkleBackground$default(modifierClip, r8, 1, r8);
                        }
                        Modifier modifierM4872backgroundbw27NRU$default = modifierClip;
                        if (color != null) {
                            modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierM4872backgroundbw27NRU$default, color.getValue(), null, 2, null);
                        }
                        Function0<Unit> function04 = function02;
                        Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM4872backgroundbw27NRU$default, false, null, null, function04, 7, null);
                        float f = !dashboardPillData.isPulsing() ? PILL_VERTICAL_PADDING_PULSE : PILL_VERTICAL_PADDING;
                        bentoTheme = BentoTheme.INSTANCE;
                        i6 = BentoTheme.$stable;
                        Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierM4893clickableXHw0xAI$default, bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM(), f);
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterVertically(), composer2, 54);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5143paddingVpY3zN4);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.useNode();
                        } else {
                            composer2.createNode(constructor);
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        row6 = Row6.INSTANCE;
                        iconAsset = dashboardPillData.getIconAsset();
                        lottieUrlLight = dashboardPillData.getLottieUrlLight();
                        String lottieUrlDark = dashboardPillData.getLottieUrlDark();
                        if (iconAsset != null || iconAsset == ServerToBentoAssetMapper2.UNKNOWN) {
                            i7 = i10;
                            composer3 = composer2;
                            rhc2 = rhc;
                            if (lottieUrlLight != null || lottieUrlDark == null) {
                                composer3.startReplaceGroup(-1051642946);
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(-1052391565);
                                LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(!bentoTheme.getColors(composer3, i6).getIsDay() ? C13819R.raw.countdown_pill_dark : Intrinsics.areEqual(dashboardPillData.getVisualStyle(), DashboardPillData4.Gold.INSTANCE) ? C13819R.raw.countdown_pill_gold : C13819R.raw.countdown_pill_neon)), null, null, null, null, null, composer3, 0, 62);
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                float f2 = 16;
                                LottieAnimation2.LottieAnimation(PillButtonComposable_FU0evQE$lambda$41$lambda$40(lottieCompositionResultRememberLottieComposition), SizeKt.m5174width3ABfNKs(SizeKt.m5156height3ABfNKs(companion3, C2002Dp.m7995constructorimpl(f2)), C2002Dp.m7995constructorimpl(f2)), false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, false, false, null, null, null, false, false, null, false, null, composer3, 1572912, 0, 0, 2097084);
                                composer3 = composer3;
                                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion3, bentoTheme.getSpacing(composer3, i6).m21595getXsmallD9Ej5fM()), composer3, 0);
                                composer3.endReplaceGroup();
                            }
                        } else {
                            composer2.startReplaceGroup(-1052705657);
                            Composer composer5 = composer2;
                            rhc2 = rhc;
                            i7 = i10;
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(iconAsset), null, j2, null, null, false, composer5, BentoIcon4.Size16.$stable | 48 | (i10 & 896), 56);
                            composer3 = composer5;
                            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, bentoTheme.getSpacing(composer3, i6).m21595getXsmallD9Ej5fM()), composer3, 0);
                            composer3.endReplaceGroup();
                        }
                        if (!Intrinsics.areEqual(dashboardPillData.getVisualStyle(), rhc2) || dashboardPillData.getTargetTimestamp() == null) {
                            composer3.startReplaceGroup(-1051529331);
                            if (Intrinsics.areEqual(dashboardPillData.getVisualStyle(), rhc2)) {
                                modifierApplyStaticWidth = Modifier.INSTANCE;
                            } else {
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                Duration durationPillButtonComposable_FU0evQE$lambda$313 = PillButtonComposable_FU0evQE$lambda$31(snapshotState);
                                Intrinsics.checkNotNullExpressionValue(durationPillButtonComposable_FU0evQE$lambda$313, "PillButtonComposable_FU0evQE$lambda$31(...)");
                                modifierApplyStaticWidth = applyStaticWidth(companion4, durationPillButtonComposable_FU0evQE$lambda$313, dashboardPillData.getVisualStyle());
                            }
                            Modifier modifierAlignByBaseline = row6.alignByBaseline(modifierApplyStaticWidth);
                            text = dashboardPillData.getText();
                            if (text == null) {
                                text = str;
                            }
                            Composer composer6 = composer3;
                            BentoText2.m20747BentoText38GnDrw(text, modifierAlignByBaseline, Color.m6701boximpl(j), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, applyCountdownFont(bentoTheme.getTypography(composer3, i6).getTextS(), dashboardPillData.getVisualStyle()), composer6, (i7 & 896) | 817889280, 0, 7480);
                            composer4 = composer6;
                            composer4.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(-1050793112);
                            String text4 = dashboardPillData.getText();
                            if (text4 == null) {
                                text4 = str;
                            }
                            composer4 = composer3;
                            m13239MonospacedTextiJQMabo(text4, j, Intrinsics.areEqual(dashboardPillData.getVisualStyle(), DashboardPillData4.Gold.INSTANCE), composer4, (i7 >> 3) & 112);
                            composer3.endReplaceGroup();
                        }
                        composer4.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function03 = function04;
                        modifier2 = modifier3;
                        roundedCornerShape2 = roundedCornerShape3;
                    }
                    color = colorM6701boximpl;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    SnapshotState snapshotState32 = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    SnapshotState snapshotState42 = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(160882661);
                    if (dashboardPillData.getTargetTimestamp() != null) {
                    }
                    composer2.endReplaceGroup();
                    Duration durationPillButtonComposable_FU0evQE$lambda$314 = PillButtonComposable_FU0evQE$lambda$31(snapshotState);
                    boolean zPillButtonComposable_FU0evQE$lambda$342 = PillButtonComposable_FU0evQE$lambda$34(snapshotState2);
                    String completionText32 = dashboardPillData.getCompletionText();
                    composer2.startReplaceGroup(-1746271574);
                    zChanged = composer2.changed(durationPillButtonComposable_FU0evQE$lambda$314) | composer2.changed(zPillButtonComposable_FU0evQE$lambda$342) | composer2.changed(completionText32);
                    objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged) {
                        if (!PillButtonComposable_FU0evQE$lambda$34(snapshotState2)) {
                            if (PillButtonComposable_FU0evQE$lambda$31(snapshotState).isZero()) {
                                completionText = FormattedTimeUntil.TIME_LEFT_NONE;
                                objRememberedValue3 = completionText;
                                composer2.updateRememberedValue(objRememberedValue3);
                                String str3 = (String) objRememberedValue3;
                                composer2.endReplaceGroup();
                                Screen screen2 = ((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
                                Component component2 = new Component(Component.ComponentType.DASHBOARD_PILL, dashboardPillData.getLoggingIdentifier(), null, 4, null);
                                String text32 = dashboardPillData.getText();
                                if (text32 != null) {
                                }
                                String actionUrl2 = dashboardPillData.getActionUrl();
                                Modifier modifierClip2 = Clip.clip(ModifiersKt.autoLogEvents$default(modifier3, new UserInteractionEventDescriptor(null, screen2, null, new Context(0, 0, 0, str2, null, null, actionUrl2 != null ? "" : actionUrl2, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -73, -1, -1, -1, -1, -1, 16383, null), component2, null, 37, null), true, false, false, true, true, null, 76, null), roundedCornerShape3);
                                if (dashboardPillData.getVisualStyle() instanceof DashboardPillData4.Gold) {
                                }
                                Modifier modifierM4872backgroundbw27NRU$default2 = modifierClip2;
                                if (color != null) {
                                }
                                Function0<Unit> function042 = function02;
                                Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifierM4872backgroundbw27NRU$default2, false, null, null, function042, 7, null);
                                if (!dashboardPillData.isPulsing()) {
                                }
                                bentoTheme = BentoTheme.INSTANCE;
                                i6 = BentoTheme.$stable;
                                Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(modifierM4893clickableXHw0xAI$default2, bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM(), f);
                                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterVertically(), composer2, 54);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM5143paddingVpY3zN42);
                                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                                if (composer2.getApplier() == null) {
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting()) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                                    row6 = Row6.INSTANCE;
                                    iconAsset = dashboardPillData.getIconAsset();
                                    lottieUrlLight = dashboardPillData.getLottieUrlLight();
                                    String lottieUrlDark2 = dashboardPillData.getLottieUrlDark();
                                    if (iconAsset != null) {
                                        i7 = i10;
                                        composer3 = composer2;
                                        rhc2 = rhc;
                                        if (lottieUrlLight != null) {
                                            composer3.startReplaceGroup(-1051642946);
                                            composer3.endReplaceGroup();
                                            if (Intrinsics.areEqual(dashboardPillData.getVisualStyle(), rhc2)) {
                                                composer3.startReplaceGroup(-1051529331);
                                                if (Intrinsics.areEqual(dashboardPillData.getVisualStyle(), rhc2)) {
                                                }
                                                Modifier modifierAlignByBaseline2 = row6.alignByBaseline(modifierApplyStaticWidth);
                                                text = dashboardPillData.getText();
                                                if (text == null) {
                                                }
                                                Composer composer62 = composer3;
                                                BentoText2.m20747BentoText38GnDrw(text, modifierAlignByBaseline2, Color.m6701boximpl(j), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, applyCountdownFont(bentoTheme.getTypography(composer3, i6).getTextS(), dashboardPillData.getVisualStyle()), composer62, (i7 & 896) | 817889280, 0, 7480);
                                                composer4 = composer62;
                                                composer4.endReplaceGroup();
                                                composer4.endNode();
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                function03 = function042;
                                                modifier2 = modifier3;
                                                roundedCornerShape2 = roundedCornerShape3;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier4 = modifier2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboardpill.ui.DashboardPillButtonKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return DashboardPillButton5.PillButtonComposable_FU0evQE$lambda$42(clock, dashboardPillData, j, modifier4, roundedCornerShape2, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            function02 = function0;
            if ((i3 & 74899) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if (i4 != 0) {
                    }
                    Modifier modifier32 = modifier2;
                    RoundedCornerShape roundedCornerShape32 = roundedCornerShapeM5327RoundedCornerShape0680j_4;
                    int i102 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    visualStyle = dashboardPillData.getVisualStyle();
                    rhc = DashboardPillData4.Rhc.INSTANCE;
                    if (!Intrinsics.areEqual(visualStyle, rhc)) {
                    }
                    color = colorM6701boximpl;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    SnapshotState snapshotState322 = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    SnapshotState snapshotState422 = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(160882661);
                    if (dashboardPillData.getTargetTimestamp() != null) {
                    }
                    composer2.endReplaceGroup();
                    Duration durationPillButtonComposable_FU0evQE$lambda$3142 = PillButtonComposable_FU0evQE$lambda$31(snapshotState);
                    boolean zPillButtonComposable_FU0evQE$lambda$3422 = PillButtonComposable_FU0evQE$lambda$34(snapshotState2);
                    String completionText322 = dashboardPillData.getCompletionText();
                    composer2.startReplaceGroup(-1746271574);
                    zChanged = composer2.changed(durationPillButtonComposable_FU0evQE$lambda$3142) | composer2.changed(zPillButtonComposable_FU0evQE$lambda$3422) | composer2.changed(completionText322);
                    objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((i3 & 74899) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PillButtonComposable_FU0evQE$lambda$35(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: MonospacedText-iJQMabo, reason: not valid java name */
    private static final void m13239MonospacedTextiJQMabo(final String str, final long j, final boolean z, Composer composer, int i) {
        int i2;
        boolean z2;
        boolean z3;
        Character ch;
        Character ch2;
        String str2 = str;
        int i3 = i;
        Composer composerStartRestartGroup = composer.startRestartGroup(127086678);
        if ((i3 & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            z2 = z;
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(127086678, i2, -1, "com.robinhood.android.dashboardpill.ui.MonospacedText (DashboardPillButton.kt:803)");
            }
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            android.content.Context context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            boolean isDay = bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay();
            TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
            float fMo5015toPxR2X_6o = density.mo5015toPxR2X_6o(textStyleM7655copyp1EtxEg$default.m7662getFontSizeXSAIIZE());
            float fMo5015toPxR2X_6o2 = density.mo5015toPxR2X_6o(TextUnit2.getSp(TextUnit.m8074getValueimpl(textStyleM7655copyp1EtxEg$default.m7668getLineHeightXSAIIZE()) * TextUnit.m8074getValueimpl(textStyleM7655copyp1EtxEg$default.m7662getFontSizeXSAIIZE())));
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                z3 = isDay;
                ch = null;
                objRememberedValue = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L))), null, 2, null);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                z3 = isDay;
                ch = null;
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Character ch3 = ch;
            final boolean z4 = z3;
            final Shader shader = GoldSparkleBrush.m15095sparkleBrushAndShaderDataEPk0efs(Brush.INSTANCE, MonospacedText_iJQMabo$lambda$46(snapshotState), null, composerStartRestartGroup, 6, 2).getShader();
            final TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(fMo5015toPxR2X_6o);
            textPaint.setColor(Color2.m6735toArgb8_81llA(j));
            textPaint.setTypeface(RhTypeface.BOLD.load(context));
            textPaint.setAntiAlias(true);
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            float f = fontMetrics.descent;
            float f2 = fontMetrics.ascent;
            float f3 = f - f2;
            final float f4 = (-f2) + ((fMo5015toPxR2X_6o2 - f3) / 2);
            Iterator<Character> it = new PrimitiveRanges('0', '9').iterator();
            if (it.hasNext()) {
                Character next = it.next();
                if (it.hasNext()) {
                    float fMeasureText = textPaint.measureText(String.valueOf(next.charValue()));
                    while (true) {
                        Character next2 = it.next();
                        float fMeasureText2 = textPaint.measureText(String.valueOf(next2.charValue()));
                        if (Float.compare(fMeasureText, fMeasureText2) < 0) {
                            fMeasureText = fMeasureText2;
                            next = next2;
                        }
                        if (!it.hasNext()) {
                            break;
                        }
                        str2 = str;
                        z2 = z;
                        i3 = i;
                    }
                }
                ch2 = next;
            } else {
                ch2 = ch3;
            }
            Float fValueOf = ch2 != null ? Float.valueOf(textPaint.measureText(String.valueOf(ch2.charValue()))) : ch3;
            final float fFloatValue = fValueOf != 0 ? fValueOf.floatValue() : textPaint.measureText("8");
            int length = str2.length();
            float fMeasureText3 = 0.0f;
            int i5 = 0;
            while (i5 < length) {
                char cCharAt = str2.charAt(i5);
                fMeasureText3 += Character.isDigit(cCharAt) ? fFloatValue : textPaint.measureText(String.valueOf(cCharAt));
                i5++;
                str2 = str;
            }
            Modifier modifierM5171sizeVpY3zN4 = SizeKt.m5171sizeVpY3zN4(Modifier.INSTANCE, density.mo5012toDpu2uoSUM(fMeasureText3), density.mo5012toDpu2uoSUM(f3));
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.dashboardpill.ui.DashboardPillButtonKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DashboardPillButton5.MonospacedText_iJQMabo$lambda$53$lambda$52(snapshotState, (LayoutCoordinates) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierM5171sizeVpY3zN4, (Function1) objRememberedValue2);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChanged = ((i2 & 896) == 256) | composerStartRestartGroup.changed(z4) | composerStartRestartGroup.changedInstance(textPaint) | composerStartRestartGroup.changedInstance(shader) | ((i2 & 14) == 4) | composerStartRestartGroup.changed(fFloatValue) | composerStartRestartGroup.changed(f4);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                final boolean z5 = z2;
                Function1 function1 = new Function1() { // from class: com.robinhood.android.dashboardpill.ui.DashboardPillButtonKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DashboardPillButton5.MonospacedText_iJQMabo$lambda$56$lambda$55(z5, z4, textPaint, shader, str, fFloatValue, f4, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue3 = function1;
            }
            composerStartRestartGroup.endReplaceGroup();
            Canvas2.Canvas(modifierOnGloballyPositioned, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i6 = i3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboardpill.ui.DashboardPillButtonKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DashboardPillButton5.MonospacedText_iJQMabo$lambda$57(str, j, z, i6, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void MonospacedText_iJQMabo$lambda$47(SnapshotState<Offset> snapshotState, long j) {
        snapshotState.setValue(Offset.m6534boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MonospacedText_iJQMabo$lambda$53$lambda$52(SnapshotState snapshotState, LayoutCoordinates layoutCoords) {
        Intrinsics.checkNotNullParameter(layoutCoords, "layoutCoords");
        MonospacedText_iJQMabo$lambda$47(snapshotState, LayoutCoordinates2.positionInWindow(layoutCoords));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MonospacedText_iJQMabo$lambda$56$lambda$55(boolean z, boolean z2, TextPaint textPaint, Shader shader, String str, float f, float f2, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        if (z && z2) {
            textPaint.setShader(shader);
        }
        float f3 = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            float fMeasureText = textPaint.measureText(String.valueOf(cCharAt));
            AndroidCanvas_androidKt.getNativeCanvas(Canvas.getDrawContext().getCanvas()).drawText(String.valueOf(cCharAt), Character.isDigit(cCharAt) ? ((f - fMeasureText) / 2) + f3 : f3, f2, textPaint);
            f3 += fMeasureText;
        }
        return Unit.INSTANCE;
    }

    private static final TextStyle applyCountdownFont(TextStyle textStyle, DashboardPillData4 dashboardPillData4) {
        if (Intrinsics.areEqual(dashboardPillData4, DashboardPillData4.Rhc.INSTANCE)) {
            return TextStyle.m7655copyp1EtxEg$default(textStyle, 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, TextUnit2.getEm(2), null, null, null, 0, 0, null, 16646139, null);
        }
        return TextStyle.m7655copyp1EtxEg$default(textStyle, 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
    }

    private static final Modifier applyStaticWidth(Modifier modifier, final Duration duration, final DashboardPillData4 dashboardPillData4) {
        return ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.robinhood.android.dashboardpill.ui.DashboardPillButtonKt.applyStaticWidth.1
            private static final float invoke$lambda$0(SnapshotState4<C2002Dp> snapshotState4) {
                return snapshotState4.getValue().getValue();
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(-165726487);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-165726487, i, -1, "com.robinhood.android.dashboardpill.ui.applyStaticWidth.<anonymous> (DashboardPillButton.kt:897)");
                }
                Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(composed, invoke$lambda$0(DashboardPillButton5.rememberStaticWidth(duration, dashboardPillData4, null, null, composer, 0, 12)));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierM5174width3ABfNKs;
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState4<C2002Dp> rememberStaticWidth(Duration duration, DashboardPillData4 dashboardPillData4, TextMeasurer textMeasurer, Density density, Composer composer, int i, int i2) {
        composer.startReplaceGroup(211720134);
        boolean z = true;
        TextMeasurer textMeasurerRememberTextMeasurer = (i2 & 4) != 0 ? TextMeasurerHelper.rememberTextMeasurer(0, composer, 0, 1) : textMeasurer;
        Density density2 = (i2 & 8) != 0 ? (Density) composer.consume(CompositionLocalsKt.getLocalDensity()) : density;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(211720134, i, -1, "com.robinhood.android.dashboardpill.ui.rememberStaticWidth (DashboardPillButton.kt:908)");
        }
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(duration);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = Integer.valueOf(Math.max(2, numberOfDigits(duration.toHours())));
            composer.updateRememberedValue(objRememberedValue);
        }
        int iIntValue = ((Number) objRememberedValue).intValue();
        composer.endReplaceGroup();
        TextStyle textStyleApplyCountdownFont = applyCountdownFont(BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextS(), dashboardPillData4);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotState3.mutableStateOf$default(C2002Dp.m7993boximpl(C2002Dp.INSTANCE.m8004getUnspecifiedD9Ej5fM()), null, 2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
        composer.endReplaceGroup();
        Integer numValueOf = Integer.valueOf(iIntValue);
        composer.startReplaceGroup(-1224400529);
        boolean zChanged2 = composer.changed(iIntValue) | ((((i & 896) ^ 384) > 256 && composer.changed(textMeasurerRememberTextMeasurer)) || (i & 384) == 256) | composer.changed(textStyleApplyCountdownFont);
        if ((((i & 7168) ^ 3072) <= 2048 || !composer.changed(density2)) && (i & 3072) != 2048) {
            z = false;
        }
        boolean z2 = zChanged2 | z;
        Object objRememberedValue3 = composer.rememberedValue();
        if (z2 || objRememberedValue3 == companion.getEmpty()) {
            Object dashboardPillButton9 = new DashboardPillButton9(snapshotState, textMeasurerRememberTextMeasurer, textStyleApplyCountdownFont, density2, iIntValue, null);
            composer.updateRememberedValue(dashboardPillButton9);
            objRememberedValue3 = dashboardPillButton9;
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return snapshotState;
    }

    private static final int numberOfDigits(long j) {
        if (j == 0) {
            return 1;
        }
        return ((int) Math.log10(Math.abs(j))) + 1;
    }

    private static final void CustomDashboardPillButtonPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(157603046);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(157603046, i, -1, "com.robinhood.android.dashboardpill.ui.CustomDashboardPillButtonPreview (DashboardPillButton.kt:945)");
            }
            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.INSTANCE), AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor().provides(new UserInteractionEventDescriptor(null, null, null, null, null, null, 63, null))}, DashboardPillButton.INSTANCE.getLambda$909543846$lib_dashboard_pill_externalDebug(), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboardpill.ui.DashboardPillButtonKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DashboardPillButton5.CustomDashboardPillButtonPreview$lambda$61(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

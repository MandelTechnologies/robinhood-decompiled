package com.withpersona.sdk2.inquiry.selfie.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: SelfieOverlayView.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 \u0083\u00012\u00020\u0001:\f\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b(\u0010)JS\u00103\u001a\u00020\r*\u00020*2\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\u001dH\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\rH\u0002¢\u0006\u0004\b5\u0010)J\u000f\u00107\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u000206H\u0002¢\u0006\u0004\b9\u00108J\u000f\u0010:\u001a\u000206H\u0002¢\u0006\u0004\b:\u00108J+\u0010?\u001a\u00020\r*\u00020;2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020;2\u0006\u0010>\u001a\u00020\u001dH\u0002¢\u0006\u0004\b?\u0010@J\u001b\u0010A\u001a\u00020;*\u00020;2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\rH\u0002¢\u0006\u0004\bC\u0010)R\u0016\u0010D\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bJ\u0010IR\u0014\u0010K\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bK\u0010IR\u0014\u0010L\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010IR\u0014\u0010M\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010IR\u0014\u0010N\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010GR\u0014\u0010O\u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0006\n\u0004\bO\u0010GR\u0014\u0010P\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010GR\u0014\u0010Q\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010GR\u0014\u0010R\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010GR\u0014\u0010S\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010TR\u0014\u0010V\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010TR\u0014\u0010W\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010TR\u0014\u0010X\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010TR\u0014\u0010Y\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010TR\u0014\u0010Z\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010TR\u0014\u0010[\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010TR\u0014\u0010\\\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010^\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010]R\u0014\u0010_\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010]R\u0014\u0010`\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010]R\u0014\u0010a\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010]R\u0014\u0010b\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010]R\u0014\u0010c\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010]R\u0014\u0010d\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010]R\u0016\u0010e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010GR\u0016\u0010f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010GR\u0014\u0010g\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010j\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010m\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010o\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010kR\u0018\u0010q\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010s\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010kR\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010tR\u0016\u0010u\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010z\u001a\u00020w*\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bx\u0010yR\u0018\u0010{\u001a\u00020\u0010*\u00020;8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|R+\u0010\u0082\u0001\u001a\u00020\b*\u0002062\u0006\u0010}\u001a\u00020\b8B@BX\u0082\u000e¢\u0006\u000e\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001¨\u0006\u0089\u0001"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "w", "h", "oldw", "oldh", "", "onSizeChanged", "(IIII)V", "", "mirrored", "setIsPreviewMirrored", "(Z)V", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$State;", "newState", "animate", "setState", "(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$State;Z)V", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "brightnessInfo", "setCameraStreamBrightnessInfo", "(Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;)V", "", "intensity", "setIntensity", "(F)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "oldState", "onDirectionChanged", "(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$State;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$State;)V", "updatePaths", "()V", "Landroid/graphics/Path;", "left", "top", "right", "bottom", "startAngle", "sweepAngle", "numTicks", "tickLength", "addDial", "(Landroid/graphics/Path;FFFFFFIF)V", "applyCurrentState", "Landroid/graphics/Paint;", "newArcPaint", "()Landroid/graphics/Paint;", "newArcDialPaint", "newShadowPaint", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$ArcHoverState;", "start", "end", "percent", "interpolate", "(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$ArcHoverState;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$ArcHoverState;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$ArcHoverState;F)V", "focus", "(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$ArcHoverState;F)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$ArcHoverState;", "updateArcDialHighlightClipPaths", "state", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$State;", "currentIntensity", "F", "colorOnSurface", "I", "shadowColor", "accentColor", "arcBaseColor", "arcHighlightColor", "arcInset", "arcGapDegrees", "arcStrokeWidth", "arcDialStrokeWidth", "arcTickLength", "arcTop", "Landroid/graphics/Path;", "arcBottom", "arcLeft", "arcRight", "arcDialLeft", "arcDialRight", "arcDialHighlightClipPathRight", "arcDialHighlightClipPathLeft", "arcTopPaint", "Landroid/graphics/Paint;", "arcBottomPaint", "arcLeftPaint", "arcRightPaint", "shadowPaint", "arcDialLeftPaint", "arcDialRightPaint", "filledArcDialPaint", "arcDialLeftIntensity", "arcDialRightIntensity", "arcHoverState", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$ArcHoverState;", "Landroid/animation/ValueAnimator;", "stateAnimator", "Landroid/animation/ValueAnimator;", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$StateAnimationState;", "stateAnimationState", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$StateAnimationState;", "intensityAnimator", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$IntensityAnimationState;", "intensityAnimationState", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$IntensityAnimationState;", "directionHintAnimator", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "isPreviewMirrored", "Z", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$EndStateConstants;", "getEndState", "(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$State;)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$EndStateConstants;", "endState", "isIdentity", "(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$ArcHoverState;)Z", "value", "getShadowAlpha", "(Landroid/graphics/Paint;)I", "setShadowAlpha", "(Landroid/graphics/Paint;I)V", "shadowAlpha", "Companion", "State", "EndStateConstants", "StateAnimationState", "IntensityAnimationState", "ArcHoverState", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class SelfieOverlayView extends FrameLayout {
    private final int accentColor;
    private final int arcBaseColor;
    private final Path arcBottom;
    private final Paint arcBottomPaint;
    private final Path arcDialHighlightClipPathLeft;
    private final Path arcDialHighlightClipPathRight;
    private final Path arcDialLeft;
    private float arcDialLeftIntensity;
    private final Paint arcDialLeftPaint;
    private final Path arcDialRight;
    private float arcDialRightIntensity;
    private final Paint arcDialRightPaint;
    private final float arcDialStrokeWidth;
    private final float arcGapDegrees;
    private final int arcHighlightColor;
    private final ArcHoverState arcHoverState;
    private final float arcInset;
    private final Path arcLeft;
    private final Paint arcLeftPaint;
    private final Path arcRight;
    private final Paint arcRightPaint;
    private final float arcStrokeWidth;
    private final float arcTickLength;
    private final Path arcTop;
    private final Paint arcTopPaint;
    private SelfieBrightnessInfo brightnessInfo;
    private final int colorOnSurface;
    private float currentIntensity;
    private ValueAnimator directionHintAnimator;
    private final Paint filledArcDialPaint;
    private IntensityAnimationState intensityAnimationState;
    private ValueAnimator intensityAnimator;
    private boolean isPreviewMirrored;
    private final int shadowColor;
    private final Paint shadowPaint;
    private State state;
    private StateAnimationState stateAnimationState;
    private ValueAnimator stateAnimator;

    /* compiled from: SelfieOverlayView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[State.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[State.Finalizing.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SelfieOverlayView.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$State;", "", "<init>", "(Ljava/lang/String;I)V", "Center", "Left", "Right", "None", "Finalizing", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State Center = new State("Center", 0);
        public static final State Left = new State("Left", 1);
        public static final State Right = new State("Right", 2);
        public static final State None = new State("None", 3);
        public static final State Finalizing = new State("Finalizing", 4);

        private static final /* synthetic */ State[] $values() {
            return new State[]{Center, Left, Right, None, Finalizing};
        }

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        private State(String str, int i) {
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(stateArr$values);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SelfieOverlayView.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0014\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B9\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$EndStateConstants;", "", "arcTopAlpha", "", "arcBottomAlpha", "arcLeftAlpha", "arcRightAlpha", "arcDialLeftAlpha", "arcDialRightAlpha", "<init>", "(Ljava/lang/String;IFFFFFF)V", "getArcTopAlpha", "()F", "getArcBottomAlpha", "getArcLeftAlpha", "getArcRightAlpha", "getArcDialLeftAlpha", "getArcDialRightAlpha", "Center", "Left", "Right", "None", "Finalizing", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    private static final class EndStateConstants {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EndStateConstants[] $VALUES;
        private final float arcBottomAlpha;
        private final float arcDialLeftAlpha;
        private final float arcDialRightAlpha;
        private final float arcLeftAlpha;
        private final float arcRightAlpha;
        private final float arcTopAlpha;
        public static final EndStateConstants Center = new EndStateConstants("Center", 0, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f);
        public static final EndStateConstants Left = new EndStateConstants("Left", 1, 0.1f, 0.1f, 0.0f, 0.1f, 1.0f, 0.0f);
        public static final EndStateConstants Right = new EndStateConstants("Right", 2, 0.1f, 0.1f, 0.1f, 0.0f, 0.0f, 1.0f);
        public static final EndStateConstants None = new EndStateConstants("None", 3, 0.1f, 0.1f, 0.1f, 0.1f, 0.0f, 0.0f);
        public static final EndStateConstants Finalizing = new EndStateConstants("Finalizing", 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);

        private static final /* synthetic */ EndStateConstants[] $values() {
            return new EndStateConstants[]{Center, Left, Right, None, Finalizing};
        }

        public static EnumEntries<EndStateConstants> getEntries() {
            return $ENTRIES;
        }

        private EndStateConstants(String str, int i, float f, float f2, float f3, float f4, float f5, float f6) {
            this.arcTopAlpha = f;
            this.arcBottomAlpha = f2;
            this.arcLeftAlpha = f3;
            this.arcRightAlpha = f4;
            this.arcDialLeftAlpha = f5;
            this.arcDialRightAlpha = f6;
        }

        public final float getArcTopAlpha() {
            return this.arcTopAlpha;
        }

        public final float getArcBottomAlpha() {
            return this.arcBottomAlpha;
        }

        public final float getArcLeftAlpha() {
            return this.arcLeftAlpha;
        }

        public final float getArcRightAlpha() {
            return this.arcRightAlpha;
        }

        public final float getArcDialLeftAlpha() {
            return this.arcDialLeftAlpha;
        }

        public final float getArcDialRightAlpha() {
            return this.arcDialRightAlpha;
        }

        static {
            EndStateConstants[] endStateConstantsArr$values = $values();
            $VALUES = endStateConstantsArr$values;
            $ENTRIES = EnumEntries2.enumEntries(endStateConstantsArr$values);
        }

        public static EndStateConstants valueOf(String str) {
            return (EndStateConstants) Enum.valueOf(EndStateConstants.class, str);
        }

        public static EndStateConstants[] values() {
            return (EndStateConstants[]) $VALUES.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SelfieOverlayView.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0082\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b \u0010\u001fR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b&\u0010#R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b'\u0010#R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b(\u0010#R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b)\u0010#R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b*\u0010#R\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b+\u0010#¨\u0006,"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$StateAnimationState;", "", "", "animating", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$State;", "startState", "endState", "", "progress", "startArcTopAlpha", "startArcBottomAlpha", "startArcLeftAlpha", "startArcRightAlpha", "startArcDialLeftAlpha", "startArcDialRightAlpha", "<init>", "(ZLcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$State;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$State;FFFFFFF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getAnimating", "()Z", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$State;", "getStartState", "()Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$State;", "getEndState", "F", "getProgress", "()F", "setProgress", "(F)V", "getStartArcTopAlpha", "getStartArcBottomAlpha", "getStartArcLeftAlpha", "getStartArcRightAlpha", "getStartArcDialLeftAlpha", "getStartArcDialRightAlpha", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    static final /* data */ class StateAnimationState {
        private final boolean animating;
        private final State endState;
        private float progress;
        private final float startArcBottomAlpha;
        private final float startArcDialLeftAlpha;
        private final float startArcDialRightAlpha;
        private final float startArcLeftAlpha;
        private final float startArcRightAlpha;
        private final float startArcTopAlpha;
        private final State startState;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StateAnimationState)) {
                return false;
            }
            StateAnimationState stateAnimationState = (StateAnimationState) other;
            return this.animating == stateAnimationState.animating && this.startState == stateAnimationState.startState && this.endState == stateAnimationState.endState && Float.compare(this.progress, stateAnimationState.progress) == 0 && Float.compare(this.startArcTopAlpha, stateAnimationState.startArcTopAlpha) == 0 && Float.compare(this.startArcBottomAlpha, stateAnimationState.startArcBottomAlpha) == 0 && Float.compare(this.startArcLeftAlpha, stateAnimationState.startArcLeftAlpha) == 0 && Float.compare(this.startArcRightAlpha, stateAnimationState.startArcRightAlpha) == 0 && Float.compare(this.startArcDialLeftAlpha, stateAnimationState.startArcDialLeftAlpha) == 0 && Float.compare(this.startArcDialRightAlpha, stateAnimationState.startArcDialRightAlpha) == 0;
        }

        public int hashCode() {
            return (((((((((((((((((Boolean.hashCode(this.animating) * 31) + this.startState.hashCode()) * 31) + this.endState.hashCode()) * 31) + Float.hashCode(this.progress)) * 31) + Float.hashCode(this.startArcTopAlpha)) * 31) + Float.hashCode(this.startArcBottomAlpha)) * 31) + Float.hashCode(this.startArcLeftAlpha)) * 31) + Float.hashCode(this.startArcRightAlpha)) * 31) + Float.hashCode(this.startArcDialLeftAlpha)) * 31) + Float.hashCode(this.startArcDialRightAlpha);
        }

        public String toString() {
            return "StateAnimationState(animating=" + this.animating + ", startState=" + this.startState + ", endState=" + this.endState + ", progress=" + this.progress + ", startArcTopAlpha=" + this.startArcTopAlpha + ", startArcBottomAlpha=" + this.startArcBottomAlpha + ", startArcLeftAlpha=" + this.startArcLeftAlpha + ", startArcRightAlpha=" + this.startArcRightAlpha + ", startArcDialLeftAlpha=" + this.startArcDialLeftAlpha + ", startArcDialRightAlpha=" + this.startArcDialRightAlpha + ")";
        }

        public StateAnimationState(boolean z, State startState, State endState, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            Intrinsics.checkNotNullParameter(startState, "startState");
            Intrinsics.checkNotNullParameter(endState, "endState");
            this.animating = z;
            this.startState = startState;
            this.endState = endState;
            this.progress = f;
            this.startArcTopAlpha = f2;
            this.startArcBottomAlpha = f3;
            this.startArcLeftAlpha = f4;
            this.startArcRightAlpha = f5;
            this.startArcDialLeftAlpha = f6;
            this.startArcDialRightAlpha = f7;
        }

        public final boolean getAnimating() {
            return this.animating;
        }

        public final State getEndState() {
            return this.endState;
        }

        public final float getProgress() {
            return this.progress;
        }

        public final void setProgress(float f) {
            this.progress = f;
        }

        public final float getStartArcTopAlpha() {
            return this.startArcTopAlpha;
        }

        public final float getStartArcBottomAlpha() {
            return this.startArcBottomAlpha;
        }

        public final float getStartArcLeftAlpha() {
            return this.startArcLeftAlpha;
        }

        public final float getStartArcRightAlpha() {
            return this.startArcRightAlpha;
        }

        public final float getStartArcDialLeftAlpha() {
            return this.startArcDialLeftAlpha;
        }

        public final float getStartArcDialRightAlpha() {
            return this.startArcDialRightAlpha;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SelfieOverlayView.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$IntensityAnimationState;", "", "", "progress", "startIntensity", "endIntensity", "<init>", "(FFF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getProgress", "()F", "setProgress", "(F)V", "getStartIntensity", "setStartIntensity", "getEndIntensity", "setEndIntensity", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    static final /* data */ class IntensityAnimationState {
        private float endIntensity;
        private float progress;
        private float startIntensity;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IntensityAnimationState)) {
                return false;
            }
            IntensityAnimationState intensityAnimationState = (IntensityAnimationState) other;
            return Float.compare(this.progress, intensityAnimationState.progress) == 0 && Float.compare(this.startIntensity, intensityAnimationState.startIntensity) == 0 && Float.compare(this.endIntensity, intensityAnimationState.endIntensity) == 0;
        }

        public int hashCode() {
            return (((Float.hashCode(this.progress) * 31) + Float.hashCode(this.startIntensity)) * 31) + Float.hashCode(this.endIntensity);
        }

        public String toString() {
            return "IntensityAnimationState(progress=" + this.progress + ", startIntensity=" + this.startIntensity + ", endIntensity=" + this.endIntensity + ")";
        }

        public IntensityAnimationState(float f, float f2, float f3) {
            this.progress = f;
            this.startIntensity = f2;
            this.endIntensity = f3;
        }

        public final float getProgress() {
            return this.progress;
        }

        public final void setProgress(float f) {
            this.progress = f;
        }

        public final float getStartIntensity() {
            return this.startIntensity;
        }

        public final float getEndIntensity() {
            return this.endIntensity;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SelfieOverlayView.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0082\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJj\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001a\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001a\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001a\u001a\u0004\b+\u0010\u001c\"\u0004\b,\u0010\u001eR\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001e¨\u0006/"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$ArcHoverState;", "", "", "arcTopTranslateX", "arcTopTranslateY", "arcBottomTranslateX", "arcBottomTranslateY", "arcLeftTranslateX", "arcLeftTranslateY", "arcRightTranslateX", "arcRightTranslateY", "arcThicknessMultiplier", "<init>", "(FFFFFFFFF)V", "copy", "(FFFFFFFFF)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$ArcHoverState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getArcTopTranslateX", "()F", "setArcTopTranslateX", "(F)V", "getArcTopTranslateY", "setArcTopTranslateY", "getArcBottomTranslateX", "setArcBottomTranslateX", "getArcBottomTranslateY", "setArcBottomTranslateY", "getArcLeftTranslateX", "setArcLeftTranslateX", "getArcLeftTranslateY", "setArcLeftTranslateY", "getArcRightTranslateX", "setArcRightTranslateX", "getArcRightTranslateY", "setArcRightTranslateY", "getArcThicknessMultiplier", "setArcThicknessMultiplier", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    static final /* data */ class ArcHoverState {
        private float arcBottomTranslateX;
        private float arcBottomTranslateY;
        private float arcLeftTranslateX;
        private float arcLeftTranslateY;
        private float arcRightTranslateX;
        private float arcRightTranslateY;
        private float arcThicknessMultiplier;
        private float arcTopTranslateX;
        private float arcTopTranslateY;

        public ArcHoverState() {
            this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 511, null);
        }

        public static /* synthetic */ ArcHoverState copy$default(ArcHoverState arcHoverState, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, Object obj) {
            if ((i & 1) != 0) {
                f = arcHoverState.arcTopTranslateX;
            }
            if ((i & 2) != 0) {
                f2 = arcHoverState.arcTopTranslateY;
            }
            if ((i & 4) != 0) {
                f3 = arcHoverState.arcBottomTranslateX;
            }
            if ((i & 8) != 0) {
                f4 = arcHoverState.arcBottomTranslateY;
            }
            if ((i & 16) != 0) {
                f5 = arcHoverState.arcLeftTranslateX;
            }
            if ((i & 32) != 0) {
                f6 = arcHoverState.arcLeftTranslateY;
            }
            if ((i & 64) != 0) {
                f7 = arcHoverState.arcRightTranslateX;
            }
            if ((i & 128) != 0) {
                f8 = arcHoverState.arcRightTranslateY;
            }
            if ((i & 256) != 0) {
                f9 = arcHoverState.arcThicknessMultiplier;
            }
            float f10 = f8;
            float f11 = f9;
            float f12 = f6;
            float f13 = f7;
            float f14 = f5;
            float f15 = f3;
            return arcHoverState.copy(f, f2, f15, f4, f14, f12, f13, f10, f11);
        }

        public final ArcHoverState copy(float arcTopTranslateX, float arcTopTranslateY, float arcBottomTranslateX, float arcBottomTranslateY, float arcLeftTranslateX, float arcLeftTranslateY, float arcRightTranslateX, float arcRightTranslateY, float arcThicknessMultiplier) {
            return new ArcHoverState(arcTopTranslateX, arcTopTranslateY, arcBottomTranslateX, arcBottomTranslateY, arcLeftTranslateX, arcLeftTranslateY, arcRightTranslateX, arcRightTranslateY, arcThicknessMultiplier);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ArcHoverState)) {
                return false;
            }
            ArcHoverState arcHoverState = (ArcHoverState) other;
            return Float.compare(this.arcTopTranslateX, arcHoverState.arcTopTranslateX) == 0 && Float.compare(this.arcTopTranslateY, arcHoverState.arcTopTranslateY) == 0 && Float.compare(this.arcBottomTranslateX, arcHoverState.arcBottomTranslateX) == 0 && Float.compare(this.arcBottomTranslateY, arcHoverState.arcBottomTranslateY) == 0 && Float.compare(this.arcLeftTranslateX, arcHoverState.arcLeftTranslateX) == 0 && Float.compare(this.arcLeftTranslateY, arcHoverState.arcLeftTranslateY) == 0 && Float.compare(this.arcRightTranslateX, arcHoverState.arcRightTranslateX) == 0 && Float.compare(this.arcRightTranslateY, arcHoverState.arcRightTranslateY) == 0 && Float.compare(this.arcThicknessMultiplier, arcHoverState.arcThicknessMultiplier) == 0;
        }

        public int hashCode() {
            return (((((((((((((((Float.hashCode(this.arcTopTranslateX) * 31) + Float.hashCode(this.arcTopTranslateY)) * 31) + Float.hashCode(this.arcBottomTranslateX)) * 31) + Float.hashCode(this.arcBottomTranslateY)) * 31) + Float.hashCode(this.arcLeftTranslateX)) * 31) + Float.hashCode(this.arcLeftTranslateY)) * 31) + Float.hashCode(this.arcRightTranslateX)) * 31) + Float.hashCode(this.arcRightTranslateY)) * 31) + Float.hashCode(this.arcThicknessMultiplier);
        }

        public String toString() {
            return "ArcHoverState(arcTopTranslateX=" + this.arcTopTranslateX + ", arcTopTranslateY=" + this.arcTopTranslateY + ", arcBottomTranslateX=" + this.arcBottomTranslateX + ", arcBottomTranslateY=" + this.arcBottomTranslateY + ", arcLeftTranslateX=" + this.arcLeftTranslateX + ", arcLeftTranslateY=" + this.arcLeftTranslateY + ", arcRightTranslateX=" + this.arcRightTranslateX + ", arcRightTranslateY=" + this.arcRightTranslateY + ", arcThicknessMultiplier=" + this.arcThicknessMultiplier + ")";
        }

        public ArcHoverState(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
            this.arcTopTranslateX = f;
            this.arcTopTranslateY = f2;
            this.arcBottomTranslateX = f3;
            this.arcBottomTranslateY = f4;
            this.arcLeftTranslateX = f5;
            this.arcLeftTranslateY = f6;
            this.arcRightTranslateX = f7;
            this.arcRightTranslateY = f8;
            this.arcThicknessMultiplier = f9;
        }

        public /* synthetic */ ArcHoverState(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4, (i & 16) != 0 ? 0.0f : f5, (i & 32) != 0 ? 0.0f : f6, (i & 64) != 0 ? 0.0f : f7, (i & 128) != 0 ? 0.0f : f8, (i & 256) != 0 ? 1.0f : f9);
        }

        public final float getArcTopTranslateX() {
            return this.arcTopTranslateX;
        }

        public final void setArcTopTranslateX(float f) {
            this.arcTopTranslateX = f;
        }

        public final float getArcTopTranslateY() {
            return this.arcTopTranslateY;
        }

        public final void setArcTopTranslateY(float f) {
            this.arcTopTranslateY = f;
        }

        public final float getArcBottomTranslateX() {
            return this.arcBottomTranslateX;
        }

        public final void setArcBottomTranslateX(float f) {
            this.arcBottomTranslateX = f;
        }

        public final float getArcBottomTranslateY() {
            return this.arcBottomTranslateY;
        }

        public final void setArcBottomTranslateY(float f) {
            this.arcBottomTranslateY = f;
        }

        public final float getArcLeftTranslateX() {
            return this.arcLeftTranslateX;
        }

        public final void setArcLeftTranslateX(float f) {
            this.arcLeftTranslateX = f;
        }

        public final float getArcLeftTranslateY() {
            return this.arcLeftTranslateY;
        }

        public final void setArcLeftTranslateY(float f) {
            this.arcLeftTranslateY = f;
        }

        public final float getArcRightTranslateX() {
            return this.arcRightTranslateX;
        }

        public final void setArcRightTranslateX(float f) {
            this.arcRightTranslateX = f;
        }

        public final float getArcRightTranslateY() {
            return this.arcRightTranslateY;
        }

        public final void setArcRightTranslateY(float f) {
            this.arcRightTranslateY = f;
        }

        public final float getArcThicknessMultiplier() {
            return this.arcThicknessMultiplier;
        }

        public final void setArcThicknessMultiplier(float f) {
            this.arcThicknessMultiplier = f;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.state = State.Center;
        this.colorOnSurface = -1;
        this.shadowColor = -16777216;
        this.accentColor = -13910906;
        this.arcBaseColor = -1;
        this.arcHighlightColor = -13910906;
        this.arcInset = (float) ExtensionsKt.getDpToPx(48.0d);
        this.arcGapDegrees = 20.0f;
        this.arcStrokeWidth = (float) ExtensionsKt.getDpToPx(4.0d);
        this.arcDialStrokeWidth = (float) ExtensionsKt.getDpToPx(2.0d);
        this.arcTickLength = (float) ExtensionsKt.getDpToPx(24.0d);
        this.arcTop = new Path();
        this.arcBottom = new Path();
        this.arcLeft = new Path();
        this.arcRight = new Path();
        this.arcDialLeft = new Path();
        this.arcDialRight = new Path();
        this.arcDialHighlightClipPathRight = new Path();
        this.arcDialHighlightClipPathLeft = new Path();
        this.arcTopPaint = newArcPaint();
        this.arcBottomPaint = newArcPaint();
        this.arcLeftPaint = newArcPaint();
        this.arcRightPaint = newArcPaint();
        this.shadowPaint = newShadowPaint();
        Paint paintNewArcDialPaint = newArcDialPaint();
        paintNewArcDialPaint.setAlpha(0);
        this.arcDialLeftPaint = paintNewArcDialPaint;
        Paint paintNewArcDialPaint2 = newArcDialPaint();
        paintNewArcDialPaint2.setAlpha(0);
        this.arcDialRightPaint = paintNewArcDialPaint2;
        Paint paintNewArcDialPaint3 = newArcDialPaint();
        paintNewArcDialPaint3.setColor(-13910906);
        this.filledArcDialPaint = paintNewArcDialPaint3;
        this.arcHoverState = focus(new ArcHoverState(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 511, null), this.currentIntensity);
        this.brightnessInfo = new SelfieBrightnessInfo(null, 1, null);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        updatePaths();
    }

    public final void setIsPreviewMirrored(boolean mirrored) {
        if (this.isPreviewMirrored == mirrored) {
            return;
        }
        this.isPreviewMirrored = mirrored;
        invalidate();
    }

    public static /* synthetic */ void setState$default(SelfieOverlayView selfieOverlayView, State state, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        selfieOverlayView.setState(state, z);
    }

    public final void setState(State newState, boolean animate) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        StateAnimationState stateAnimationState = this.stateAnimationState;
        if (stateAnimationState != null && stateAnimationState.getAnimating()) {
            StateAnimationState stateAnimationState2 = this.stateAnimationState;
            if ((stateAnimationState2 != null ? stateAnimationState2.getEndState() : null) == newState) {
                return;
            }
        }
        StateAnimationState stateAnimationState3 = this.stateAnimationState;
        if ((stateAnimationState3 == null || !stateAnimationState3.getAnimating()) && this.state == newState) {
            return;
        }
        ValueAnimator valueAnimator = this.stateAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
        }
        if (animate) {
            this.stateAnimationState = new StateAnimationState(true, this.state, newState, 0.0f, this.arcTopPaint.getAlpha() / 255.0f, this.arcBottomPaint.getAlpha() / 255.0f, this.arcLeftPaint.getAlpha() / 255.0f, this.arcRightPaint.getAlpha() / 255.0f, this.arcDialLeftPaint.getAlpha() / 255.0f, this.arcDialRightPaint.getAlpha() / 255.0f);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setStartDelay(0L);
            valueAnimatorOfFloat.setRepeatCount(0);
            valueAnimatorOfFloat.setDuration(400L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView$$ExternalSyntheticLambda2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    SelfieOverlayView.setState$lambda$7$lambda$4(this.f$0, valueAnimator2);
                }
            });
            Intrinsics.checkNotNull(valueAnimatorOfFloat);
            valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView$setState$lambda$7$$inlined$doOnEnd$1
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
                    SelfieOverlayView.StateAnimationState stateAnimationState4 = this.this$0.stateAnimationState;
                    if (stateAnimationState4 != null) {
                        SelfieOverlayView.State state = this.this$0.state;
                        this.this$0.state = stateAnimationState4.getEndState();
                        this.this$0.onDirectionChanged(state, stateAnimationState4.getEndState());
                    }
                    this.this$0.stateAnimationState = null;
                }
            });
            valueAnimatorOfFloat.start();
            this.stateAnimator = valueAnimatorOfFloat;
            return;
        }
        State state = this.state;
        this.state = newState;
        this.stateAnimationState = null;
        applyCurrentState();
        onDirectionChanged(state, newState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setState$lambda$7$lambda$4(SelfieOverlayView selfieOverlayView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        StateAnimationState stateAnimationState = selfieOverlayView.stateAnimationState;
        if (stateAnimationState != null) {
            stateAnimationState.setProgress(it.getAnimatedFraction());
        }
        selfieOverlayView.applyCurrentState();
    }

    public final void setCameraStreamBrightnessInfo(SelfieBrightnessInfo brightnessInfo) {
        if (brightnessInfo == null) {
            brightnessInfo = new SelfieBrightnessInfo(null, 1, null);
        }
        this.brightnessInfo = brightnessInfo;
        invalidate();
    }

    public final void setIntensity(float intensity) {
        if (this.currentIntensity == intensity) {
            return;
        }
        float fCoerceIn = RangesKt.coerceIn(intensity, 0.0f, 1.0f);
        ValueAnimator valueAnimator = this.intensityAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
        }
        this.intensityAnimationState = new IntensityAnimationState(0.0f, this.currentIntensity, fCoerceIn);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setStartDelay(0L);
        valueAnimatorOfFloat.setRepeatCount(0);
        valueAnimatorOfFloat.setDuration(200L);
        if (this.state == State.Center) {
            final ArcHoverState arcHoverStateCopy$default = ArcHoverState.copy$default(this.arcHoverState, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 511, null);
            final ArcHoverState arcHoverStateFocus = focus(new ArcHoverState(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 511, null), fCoerceIn);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    SelfieOverlayView.setIntensity$lambda$12$lambda$9(this.f$0, arcHoverStateCopy$default, arcHoverStateFocus, valueAnimator2);
                }
            });
        } else {
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView$$ExternalSyntheticLambda1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    SelfieOverlayView.setIntensity$lambda$12$lambda$10(this.f$0, valueAnimator2);
                }
            });
        }
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView$setIntensity$lambda$12$$inlined$doOnEnd$1
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
                this.this$0.intensityAnimationState = null;
            }
        });
        valueAnimatorOfFloat.start();
        this.intensityAnimator = valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setIntensity$lambda$12$lambda$9(SelfieOverlayView selfieOverlayView, ArcHoverState arcHoverState, ArcHoverState arcHoverState2, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        selfieOverlayView.interpolate(selfieOverlayView.arcHoverState, arcHoverState, arcHoverState2, it.getAnimatedFraction());
        IntensityAnimationState intensityAnimationState = selfieOverlayView.intensityAnimationState;
        if (intensityAnimationState != null) {
            intensityAnimationState.setProgress(it.getAnimatedFraction());
        }
        selfieOverlayView.applyCurrentState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setIntensity$lambda$12$lambda$10(SelfieOverlayView selfieOverlayView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        IntensityAnimationState intensityAnimationState = selfieOverlayView.intensityAnimationState;
        if (intensityAnimationState != null) {
            intensityAnimationState.setProgress(it.getAnimatedFraction());
        }
        selfieOverlayView.applyCurrentState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDirectionChanged(State oldState, final State newState) {
        if (oldState == newState) {
            return;
        }
        ValueAnimator valueAnimator = this.directionHintAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
        }
        if (isIdentity(this.arcHoverState)) {
            onDirectionChanged$playDirectionAnimation(newState, this);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setStartDelay(0L);
        valueAnimatorOfFloat.setRepeatCount(0);
        valueAnimatorOfFloat.setDuration(250L);
        final ArcHoverState arcHoverStateCopy$default = ArcHoverState.copy$default(this.arcHoverState, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 511, null);
        final ArcHoverState arcHoverState = new ArcHoverState(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 511, null);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView$$ExternalSyntheticLambda3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                SelfieOverlayView.onDirectionChanged$lambda$23$lambda$20(this.f$0, arcHoverStateCopy$default, arcHoverState, valueAnimator2);
            }
        });
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView$onDirectionChanged$lambda$23$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (booleanRef.element) {
                    return;
                }
                SelfieOverlayView.onDirectionChanged$playDirectionAnimation(newState, this);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                booleanRef.element = true;
            }
        });
        valueAnimatorOfFloat.start();
        this.directionHintAnimator = valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDirectionChanged$playDirectionAnimation(State state, final SelfieOverlayView selfieOverlayView) {
        int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i != 1) {
            if (i == 2) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                valueAnimatorOfFloat.setRepeatMode(2);
                valueAnimatorOfFloat.setStartDelay(0L);
                valueAnimatorOfFloat.setRepeatCount(-1);
                valueAnimatorOfFloat.setDuration(700L);
                final ArcHoverState arcHoverStateCopy$default = ArcHoverState.copy$default(selfieOverlayView.arcHoverState, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 511, null);
                final ArcHoverState arcHoverState = new ArcHoverState(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 511, null);
                arcHoverState.setArcLeftTranslateX(-((float) ExtensionsKt.getPxToDp(48.0d)));
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView$$ExternalSyntheticLambda4
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        SelfieOverlayView.onDirectionChanged$playDirectionAnimation$lambda$16$lambda$15(this.f$0, arcHoverStateCopy$default, arcHoverState, valueAnimator);
                    }
                });
                valueAnimatorOfFloat.start();
                selfieOverlayView.directionHintAnimator = valueAnimatorOfFloat;
                return;
            }
            if (i != 3) {
                if (i != 4 && i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat2.setRepeatMode(2);
            valueAnimatorOfFloat2.setStartDelay(0L);
            valueAnimatorOfFloat2.setRepeatCount(-1);
            valueAnimatorOfFloat2.setDuration(700L);
            final ArcHoverState arcHoverStateCopy$default2 = ArcHoverState.copy$default(selfieOverlayView.arcHoverState, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 511, null);
            final ArcHoverState arcHoverState2 = new ArcHoverState(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 511, null);
            arcHoverState2.setArcRightTranslateX((float) ExtensionsKt.getPxToDp(48.0d));
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView$$ExternalSyntheticLambda5
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SelfieOverlayView.onDirectionChanged$playDirectionAnimation$lambda$19$lambda$18(this.f$0, arcHoverStateCopy$default2, arcHoverState2, valueAnimator);
                }
            });
            valueAnimatorOfFloat2.start();
            selfieOverlayView.directionHintAnimator = valueAnimatorOfFloat2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDirectionChanged$playDirectionAnimation$lambda$16$lambda$15(SelfieOverlayView selfieOverlayView, ArcHoverState arcHoverState, ArcHoverState arcHoverState2, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        selfieOverlayView.interpolate(selfieOverlayView.arcHoverState, arcHoverState, arcHoverState2, it.getAnimatedFraction());
        selfieOverlayView.applyCurrentState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDirectionChanged$playDirectionAnimation$lambda$19$lambda$18(SelfieOverlayView selfieOverlayView, ArcHoverState arcHoverState, ArcHoverState arcHoverState2, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        selfieOverlayView.interpolate(selfieOverlayView.arcHoverState, arcHoverState, arcHoverState2, it.getAnimatedFraction());
        selfieOverlayView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDirectionChanged$lambda$23$lambda$20(SelfieOverlayView selfieOverlayView, ArcHoverState arcHoverState, ArcHoverState arcHoverState2, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        selfieOverlayView.interpolate(selfieOverlayView.arcHoverState, arcHoverState, arcHoverState2, it.getAnimatedFraction());
        selfieOverlayView.invalidate();
    }

    private final void updatePaths() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.arcGapDegrees / 2.0f;
        this.arcTop.reset();
        Path path = this.arcTop;
        float f2 = this.arcInset;
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        path.addArc(f2, f2, f3 - f2, f4 - f2, f + 225.0f, 90.0f - this.arcGapDegrees);
        this.arcBottom.reset();
        Path path2 = this.arcBottom;
        float f5 = this.arcInset;
        path2.addArc(f5, f5, f3 - f5, f4 - f5, f + 45.0f, 90.0f - this.arcGapDegrees);
        this.arcLeft.reset();
        Path path3 = this.arcLeft;
        float f6 = this.arcInset;
        float f7 = f + 135.0f;
        path3.addArc(f6, f6, f3 - f6, f4 - f6, f7, 90.0f - this.arcGapDegrees);
        this.arcRight.reset();
        Path path4 = this.arcRight;
        float f8 = this.arcInset;
        float f9 = f + 315.0f;
        path4.addArc(f8, f8, f3 - f8, f4 - f8, f9, 90.0f - this.arcGapDegrees);
        this.arcDialLeft.reset();
        Path path5 = this.arcDialLeft;
        float f10 = this.arcInset;
        addDial(path5, f10, f10, f3 - f10, f4 - f10, f7, 90.0f - this.arcGapDegrees, 30, this.arcTickLength);
        this.arcDialRight.reset();
        Path path6 = this.arcDialRight;
        float f11 = this.arcInset;
        addDial(path6, f11, f11, f3 - f11, f4 - f11, f9, 90.0f - this.arcGapDegrees, 30, this.arcTickLength);
        invalidate();
    }

    private final void addDial(Path path, float f, float f2, float f3, float f4, float f5, float f6, int i, float f7) {
        int i2 = i;
        float f8 = (f3 - f) / 2.0f;
        float f9 = f8 + f;
        float f10 = f8 + f2;
        float f11 = f7 / 2;
        double radians = Math.toRadians(f5);
        double radians2 = Math.toRadians(f6) / (i2 - 1);
        int i3 = 0;
        while (i3 < i2) {
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d = f8 - f11;
            float f12 = f9;
            float f13 = f10;
            float f14 = f11;
            double d2 = f8 + f11;
            path.moveTo(((float) (d * dCos)) + f12, ((float) (d * dSin)) + f13);
            path.lineTo(((float) (dCos * d2)) + f12, ((float) (d2 * dSin)) + f13);
            radians += radians2;
            i3++;
            f11 = f14;
            f8 = f8;
            f9 = f12;
            i2 = i;
            f10 = f13;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int iSave;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float arcTopTranslateX = this.arcHoverState.getArcTopTranslateX();
        float arcTopTranslateY = this.arcHoverState.getArcTopTranslateY();
        int iSave2 = canvas.save();
        canvas.translate(arcTopTranslateX, arcTopTranslateY);
        try {
            if (this.brightnessInfo.getTopBrightness() > 0.5f) {
                setShadowAlpha(this.shadowPaint, (int) (this.arcTopPaint.getAlpha() * (((this.brightnessInfo.getTopBrightness() - 0.5f) * 0.66f) + 0.0f)));
                canvas.drawPath(this.arcTop, this.shadowPaint);
            }
            canvas.drawPath(this.arcTop, this.arcTopPaint);
            canvas.restoreToCount(iSave2);
            float arcBottomTranslateX = this.arcHoverState.getArcBottomTranslateX();
            float arcBottomTranslateY = this.arcHoverState.getArcBottomTranslateY();
            int iSave3 = canvas.save();
            canvas.translate(arcBottomTranslateX, arcBottomTranslateY);
            try {
                if (this.brightnessInfo.getBottomBrightness() > 0.5f) {
                    setShadowAlpha(this.shadowPaint, (int) (this.arcBottomPaint.getAlpha() * (((this.brightnessInfo.getBottomBrightness() - 0.5f) * 0.66f) + 0.0f)));
                    canvas.drawPath(this.arcBottom, this.shadowPaint);
                }
                canvas.drawPath(this.arcBottom, this.arcBottomPaint);
                canvas.restoreToCount(iSave3);
                float rightBrightness = this.isPreviewMirrored ? this.brightnessInfo.getRightBrightness() : this.brightnessInfo.getLeftBrightness();
                float leftBrightness = this.isPreviewMirrored ? this.brightnessInfo.getLeftBrightness() : this.brightnessInfo.getRightBrightness();
                if (this.arcDialLeftPaint.getAlpha() > 0) {
                    iSave = canvas.save();
                    try {
                        canvas.translate(this.arcHoverState.getArcLeftTranslateX(), this.arcHoverState.getArcLeftTranslateY());
                        if (rightBrightness > 0.5f) {
                            setShadowAlpha(this.shadowPaint, (int) (this.arcDialLeftPaint.getAlpha() * (((rightBrightness - 0.5f) * 0.66f) + 0.0f)));
                            canvas.drawPath(this.arcDialLeft, this.shadowPaint);
                        }
                        canvas.drawPath(this.arcDialLeft, this.arcDialLeftPaint);
                        canvas.clipPath(this.arcDialHighlightClipPathLeft);
                        canvas.drawPath(this.arcDialLeft, this.filledArcDialPaint);
                        canvas.restoreToCount(iSave);
                    } finally {
                    }
                }
                if (this.arcLeftPaint.getAlpha() > 0) {
                    float arcLeftTranslateX = this.arcHoverState.getArcLeftTranslateX();
                    float arcLeftTranslateY = this.arcHoverState.getArcLeftTranslateY();
                    iSave2 = canvas.save();
                    canvas.translate(arcLeftTranslateX, arcLeftTranslateY);
                    if (rightBrightness > 0.5f) {
                        try {
                            setShadowAlpha(this.shadowPaint, (int) (this.arcLeftPaint.getAlpha() * (((rightBrightness - 0.5f) * 0.66f) + 0.0f)));
                            canvas.drawPath(this.arcLeft, this.shadowPaint);
                        } finally {
                        }
                    }
                    canvas.drawPath(this.arcLeft, this.arcLeftPaint);
                    canvas.restoreToCount(iSave2);
                }
                if (this.arcDialRightPaint.getAlpha() > 0) {
                    int iSave4 = canvas.save();
                    try {
                        canvas.translate(this.arcHoverState.getArcRightTranslateX(), this.arcHoverState.getArcRightTranslateY());
                        if (leftBrightness > 0.5f) {
                            setShadowAlpha(this.shadowPaint, (int) (this.arcDialRightPaint.getAlpha() * (((leftBrightness - 0.5f) * 0.66f) + 0.0f)));
                            canvas.drawPath(this.arcDialRight, this.shadowPaint);
                        }
                        canvas.drawPath(this.arcDialRight, this.arcDialRightPaint);
                        canvas.clipPath(this.arcDialHighlightClipPathRight);
                        canvas.drawPath(this.arcDialRight, this.filledArcDialPaint);
                        canvas.restoreToCount(iSave4);
                    } finally {
                        canvas.restoreToCount(iSave4);
                    }
                }
                if (this.arcRightPaint.getAlpha() > 0) {
                    float arcRightTranslateX = this.arcHoverState.getArcRightTranslateX();
                    float arcRightTranslateY = this.arcHoverState.getArcRightTranslateY();
                    iSave = canvas.save();
                    canvas.translate(arcRightTranslateX, arcRightTranslateY);
                    if (leftBrightness > 0.5f) {
                        try {
                            setShadowAlpha(this.shadowPaint, (int) (this.arcRightPaint.getAlpha() * ((0.66f * (leftBrightness - 0.5f)) + 0.0f)));
                            canvas.drawPath(this.arcRight, this.shadowPaint);
                        } finally {
                            canvas.restoreToCount(iSave);
                        }
                    }
                    canvas.drawPath(this.arcRight, this.arcRightPaint);
                    canvas.restoreToCount(iSave);
                }
            } finally {
                canvas.restoreToCount(iSave3);
            }
        } finally {
            canvas.restoreToCount(iSave2);
        }
    }

    private final void applyCurrentState() {
        float arcTopAlpha;
        float arcBottomAlpha;
        float arcLeftAlpha;
        float arcRightAlpha;
        float arcDialLeftAlpha;
        float arcDialRightAlpha;
        float f;
        float endIntensity;
        StateAnimationState stateAnimationState = this.stateAnimationState;
        IntensityAnimationState intensityAnimationState = this.intensityAnimationState;
        if (stateAnimationState != null) {
            float progress = stateAnimationState.getProgress();
            EndStateConstants endState = getEndState(stateAnimationState.getEndState());
            float startArcTopAlpha = stateAnimationState.getStartArcTopAlpha();
            arcTopAlpha = ((endState.getArcTopAlpha() - startArcTopAlpha) * progress) + startArcTopAlpha;
            float startArcBottomAlpha = stateAnimationState.getStartArcBottomAlpha();
            arcBottomAlpha = ((endState.getArcBottomAlpha() - startArcBottomAlpha) * progress) + startArcBottomAlpha;
            float startArcLeftAlpha = stateAnimationState.getStartArcLeftAlpha();
            arcLeftAlpha = ((endState.getArcLeftAlpha() - startArcLeftAlpha) * progress) + startArcLeftAlpha;
            float startArcRightAlpha = stateAnimationState.getStartArcRightAlpha();
            arcRightAlpha = ((endState.getArcRightAlpha() - startArcRightAlpha) * progress) + startArcRightAlpha;
            float startArcDialLeftAlpha = stateAnimationState.getStartArcDialLeftAlpha();
            arcDialLeftAlpha = ((endState.getArcDialLeftAlpha() - startArcDialLeftAlpha) * progress) + startArcDialLeftAlpha;
            float startArcDialRightAlpha = stateAnimationState.getStartArcDialRightAlpha();
            arcDialRightAlpha = ((endState.getArcDialRightAlpha() - startArcDialRightAlpha) * progress) + startArcDialRightAlpha;
        } else {
            arcTopAlpha = getEndState(this.state).getArcTopAlpha();
            arcBottomAlpha = getEndState(this.state).getArcBottomAlpha();
            arcLeftAlpha = getEndState(this.state).getArcLeftAlpha();
            arcRightAlpha = getEndState(this.state).getArcRightAlpha();
            arcDialLeftAlpha = getEndState(this.state).getArcDialLeftAlpha();
            arcDialRightAlpha = getEndState(this.state).getArcDialRightAlpha();
        }
        if (intensityAnimationState != null) {
            endIntensity = ((intensityAnimationState.getEndIntensity() - intensityAnimationState.getStartIntensity()) * intensityAnimationState.getProgress()) + intensityAnimationState.getStartIntensity();
            this.currentIntensity = endIntensity;
            f = (arcTopAlpha - 0.1f) / 1.0f;
        } else {
            f = (arcTopAlpha - 0.1f) / 1.0f;
            endIntensity = this.currentIntensity;
        }
        float f2 = ((arcBottomAlpha - 0.1f) / 1.0f) * endIntensity;
        float f3 = ((arcLeftAlpha - 0.1f) / 1.0f) * endIntensity;
        float f4 = ((arcRightAlpha - 0.1f) / 1.0f) * endIntensity;
        float f5 = ((arcDialLeftAlpha - 0.1f) / 1.0f) * endIntensity;
        float f6 = ((arcDialRightAlpha - 0.1f) / 1.0f) * endIntensity;
        this.arcTopPaint.setColor(ColorUtils.blendARGB(this.arcBaseColor, this.arcHighlightColor, f * endIntensity));
        this.arcBottomPaint.setColor(ColorUtils.blendARGB(this.arcBaseColor, this.arcHighlightColor, f2));
        this.arcLeftPaint.setColor(ColorUtils.blendARGB(this.arcBaseColor, this.arcHighlightColor, f3));
        this.arcRightPaint.setColor(ColorUtils.blendARGB(this.arcBaseColor, this.arcHighlightColor, f4));
        boolean z = (this.arcDialLeftIntensity == f5 && this.arcDialRightIntensity == f6) ? false : true;
        this.arcDialLeftIntensity = f5;
        this.arcDialRightIntensity = f6;
        float f7 = 255;
        this.arcTopPaint.setAlpha((int) (arcTopAlpha * f7));
        this.arcBottomPaint.setAlpha((int) (arcBottomAlpha * f7));
        this.arcLeftPaint.setAlpha((int) (arcLeftAlpha * f7));
        this.arcRightPaint.setAlpha((int) (arcRightAlpha * f7));
        this.arcDialLeftPaint.setAlpha((int) (arcDialLeftAlpha * f7));
        this.arcDialRightPaint.setAlpha((int) (arcDialRightAlpha * f7));
        this.arcTopPaint.setStrokeWidth(this.arcStrokeWidth * this.arcHoverState.getArcThicknessMultiplier());
        this.arcBottomPaint.setStrokeWidth(this.arcStrokeWidth * this.arcHoverState.getArcThicknessMultiplier());
        this.arcLeftPaint.setStrokeWidth(this.arcStrokeWidth * this.arcHoverState.getArcThicknessMultiplier());
        this.arcRightPaint.setStrokeWidth(this.arcStrokeWidth * this.arcHoverState.getArcThicknessMultiplier());
        if (z) {
            updateArcDialHighlightClipPaths();
        }
        invalidate();
    }

    private final Paint newArcPaint() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(this.colorOnSurface);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.arcStrokeWidth);
        paint.setStrokeCap(Paint.Cap.ROUND);
        return paint;
    }

    private final Paint newArcDialPaint() {
        Paint paintNewArcPaint = newArcPaint();
        paintNewArcPaint.setStrokeWidth(this.arcDialStrokeWidth);
        return paintNewArcPaint;
    }

    private final Paint newShadowPaint() {
        Paint paintNewArcPaint = newArcPaint();
        paintNewArcPaint.setStrokeWidth(this.arcStrokeWidth);
        paintNewArcPaint.setColor(this.shadowColor);
        paintNewArcPaint.setShadowLayer(this.arcStrokeWidth * 2, 0.0f, 0.0f, this.shadowColor);
        return paintNewArcPaint;
    }

    private final EndStateConstants getEndState(State state) {
        int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1) {
            return EndStateConstants.Center;
        }
        if (i == 2) {
            return EndStateConstants.Left;
        }
        if (i == 3) {
            return EndStateConstants.Right;
        }
        if (i == 4) {
            return EndStateConstants.None;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return EndStateConstants.Finalizing;
    }

    private final void interpolate(ArcHoverState arcHoverState, ArcHoverState arcHoverState2, ArcHoverState arcHoverState3, float f) {
        float arcTopTranslateX = arcHoverState2.getArcTopTranslateX();
        arcHoverState.setArcTopTranslateX(((arcHoverState3.getArcTopTranslateX() - arcTopTranslateX) * f) + arcTopTranslateX);
        float arcTopTranslateY = arcHoverState2.getArcTopTranslateY();
        arcHoverState.setArcTopTranslateY(((arcHoverState3.getArcTopTranslateY() - arcTopTranslateY) * f) + arcTopTranslateY);
        float arcBottomTranslateX = arcHoverState2.getArcBottomTranslateX();
        arcHoverState.setArcBottomTranslateX(((arcHoverState3.getArcBottomTranslateX() - arcBottomTranslateX) * f) + arcBottomTranslateX);
        float arcBottomTranslateY = arcHoverState2.getArcBottomTranslateY();
        arcHoverState.setArcBottomTranslateY(((arcHoverState3.getArcBottomTranslateY() - arcBottomTranslateY) * f) + arcBottomTranslateY);
        float arcLeftTranslateX = arcHoverState2.getArcLeftTranslateX();
        arcHoverState.setArcLeftTranslateX(((arcHoverState3.getArcLeftTranslateX() - arcLeftTranslateX) * f) + arcLeftTranslateX);
        float arcLeftTranslateY = arcHoverState2.getArcLeftTranslateY();
        arcHoverState.setArcLeftTranslateY(((arcHoverState3.getArcLeftTranslateY() - arcLeftTranslateY) * f) + arcLeftTranslateY);
        float arcRightTranslateX = arcHoverState2.getArcRightTranslateX();
        arcHoverState.setArcRightTranslateX(((arcHoverState3.getArcRightTranslateX() - arcRightTranslateX) * f) + arcRightTranslateX);
        float arcRightTranslateY = arcHoverState2.getArcRightTranslateY();
        arcHoverState.setArcRightTranslateY(((arcHoverState3.getArcRightTranslateY() - arcRightTranslateY) * f) + arcRightTranslateY);
        float arcThicknessMultiplier = arcHoverState2.getArcThicknessMultiplier();
        arcHoverState.setArcThicknessMultiplier(((arcHoverState3.getArcThicknessMultiplier() - arcThicknessMultiplier) * f) + arcThicknessMultiplier);
    }

    private final boolean isIdentity(ArcHoverState arcHoverState) {
        return arcHoverState.getArcTopTranslateX() == 0.0f && arcHoverState.getArcTopTranslateY() == 0.0f && arcHoverState.getArcBottomTranslateX() == 0.0f && arcHoverState.getArcBottomTranslateY() == 0.0f && arcHoverState.getArcLeftTranslateX() == 0.0f && arcHoverState.getArcLeftTranslateY() == 0.0f && arcHoverState.getArcRightTranslateX() == 0.0f && arcHoverState.getArcRightTranslateY() == 0.0f && arcHoverState.getArcThicknessMultiplier() == 1.0f;
    }

    private final ArcHoverState focus(ArcHoverState arcHoverState, float f) {
        float pxToDp = (float) ExtensionsKt.getPxToDp(48.0d);
        arcHoverState.setArcTopTranslateX(0.0f);
        float f2 = pxToDp * f;
        arcHoverState.setArcTopTranslateY(f2);
        arcHoverState.setArcBottomTranslateX(0.0f);
        float f3 = (-pxToDp) * f;
        arcHoverState.setArcBottomTranslateY(f3);
        arcHoverState.setArcLeftTranslateX(f2);
        arcHoverState.setArcLeftTranslateY(0.0f);
        arcHoverState.setArcRightTranslateX(f3);
        arcHoverState.setArcRightTranslateY(0.0f);
        arcHoverState.setArcThicknessMultiplier(f + 1.0f);
        return arcHoverState;
    }

    private final void updateArcDialHighlightClipPaths() {
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float f = measuredWidth / 2.0f;
        float f2 = measuredHeight / 2.0f;
        Path path = this.arcDialHighlightClipPathLeft;
        float f3 = this.arcDialLeftIntensity * 45.0f;
        path.reset();
        path.moveTo(f, f2);
        path.arcTo(0.0f, 0.0f, measuredWidth, measuredHeight, 180.0f - f3, f3 * 2.0f, false);
        path.close();
        Path path2 = this.arcDialHighlightClipPathRight;
        float f4 = this.arcDialRightIntensity * 45.0f;
        path2.reset();
        path2.moveTo(f, f2);
        path2.arcTo(0.0f, 0.0f, measuredWidth, measuredHeight, -f4, f4 * 2.0f, false);
        path2.close();
    }

    private final void setShadowAlpha(Paint paint, int i) {
        if (paint.getAlpha() == i) {
            return;
        }
        paint.setShadowLayer(this.arcStrokeWidth * 2, 0.0f, 0.0f, ColorUtils.setAlphaComponent(this.shadowColor, i));
        paint.setAlpha(i);
    }
}

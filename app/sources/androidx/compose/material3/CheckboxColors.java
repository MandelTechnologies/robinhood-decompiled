package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimation;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.state.ToggleableState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Checkbox.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0088\u0001\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u001f\u0010\u001dJ\u001a\u0010\"\u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b*\u0010)R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b+\u0010)R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b,\u0010)R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b-\u0010)R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b.\u0010)R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b/\u0010)R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b0\u0010)R\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b1\u0010)R\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b2\u0010)R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b3\u0010)R\u001d\u0010\u000e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b4\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, m3636d2 = {"Landroidx/compose/material3/CheckboxColors;", "", "Landroidx/compose/ui/graphics/Color;", "checkedCheckmarkColor", "uncheckedCheckmarkColor", "checkedBoxColor", "uncheckedBoxColor", "disabledCheckedBoxColor", "disabledUncheckedBoxColor", "disabledIndeterminateBoxColor", "checkedBorderColor", "uncheckedBorderColor", "disabledBorderColor", "disabledUncheckedBorderColor", "disabledIndeterminateBorderColor", "<init>", "(JJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-2qZNXz8", "(JJJJJJJJJJJJ)Landroidx/compose/material3/CheckboxColors;", "copy", "Landroidx/compose/ui/state/ToggleableState;", "state", "Landroidx/compose/runtime/State;", "checkmarkColor$material3_release", "(Landroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "checkmarkColor", "", "enabled", "boxColor$material3_release", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "boxColor", "borderColor$material3_release", "borderColor", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getCheckedCheckmarkColor-0d7_KjU", "()J", "getUncheckedCheckmarkColor-0d7_KjU", "getCheckedBoxColor-0d7_KjU", "getUncheckedBoxColor-0d7_KjU", "getDisabledCheckedBoxColor-0d7_KjU", "getDisabledUncheckedBoxColor-0d7_KjU", "getDisabledIndeterminateBoxColor-0d7_KjU", "getCheckedBorderColor-0d7_KjU", "getUncheckedBorderColor-0d7_KjU", "getDisabledBorderColor-0d7_KjU", "getDisabledUncheckedBorderColor-0d7_KjU", "getDisabledIndeterminateBorderColor-0d7_KjU", "material3_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckboxColors {
    private final long checkedBorderColor;
    private final long checkedBoxColor;
    private final long checkedCheckmarkColor;
    private final long disabledBorderColor;
    private final long disabledCheckedBoxColor;
    private final long disabledIndeterminateBorderColor;
    private final long disabledIndeterminateBoxColor;
    private final long disabledUncheckedBorderColor;
    private final long disabledUncheckedBoxColor;
    private final long uncheckedBorderColor;
    private final long uncheckedBoxColor;
    private final long uncheckedCheckmarkColor;

    /* compiled from: Checkbox.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.f174On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ CheckboxColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12);
    }

    private CheckboxColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.checkedCheckmarkColor = j;
        this.uncheckedCheckmarkColor = j2;
        this.checkedBoxColor = j3;
        this.uncheckedBoxColor = j4;
        this.disabledCheckedBoxColor = j5;
        this.disabledUncheckedBoxColor = j6;
        this.disabledIndeterminateBoxColor = j7;
        this.checkedBorderColor = j8;
        this.uncheckedBorderColor = j9;
        this.disabledBorderColor = j10;
        this.disabledUncheckedBorderColor = j11;
        this.disabledIndeterminateBorderColor = j12;
    }

    /* renamed from: copy-2qZNXz8, reason: not valid java name */
    public final CheckboxColors m5734copy2qZNXz8(long checkedCheckmarkColor, long uncheckedCheckmarkColor, long checkedBoxColor, long uncheckedBoxColor, long disabledCheckedBoxColor, long disabledUncheckedBoxColor, long disabledIndeterminateBoxColor, long checkedBorderColor, long uncheckedBorderColor, long disabledBorderColor, long disabledUncheckedBorderColor, long disabledIndeterminateBorderColor) {
        return new CheckboxColors(checkedCheckmarkColor != 16 ? checkedCheckmarkColor : this.checkedCheckmarkColor, uncheckedCheckmarkColor != 16 ? uncheckedCheckmarkColor : this.uncheckedCheckmarkColor, checkedBoxColor != 16 ? checkedBoxColor : this.checkedBoxColor, uncheckedBoxColor != 16 ? uncheckedBoxColor : this.uncheckedBoxColor, disabledCheckedBoxColor != 16 ? disabledCheckedBoxColor : this.disabledCheckedBoxColor, disabledUncheckedBoxColor != 16 ? disabledUncheckedBoxColor : this.disabledUncheckedBoxColor, disabledIndeterminateBoxColor != 16 ? disabledIndeterminateBoxColor : this.disabledIndeterminateBoxColor, checkedBorderColor != 16 ? checkedBorderColor : this.checkedBorderColor, uncheckedBorderColor != 16 ? uncheckedBorderColor : this.uncheckedBorderColor, disabledBorderColor != 16 ? disabledBorderColor : this.disabledBorderColor, disabledUncheckedBorderColor != 16 ? disabledUncheckedBorderColor : this.disabledUncheckedBorderColor, disabledIndeterminateBorderColor != 16 ? disabledIndeterminateBorderColor : this.disabledIndeterminateBorderColor, null);
    }

    public final SnapshotState4<Color> checkmarkColor$material3_release(ToggleableState toggleableState, Composer composer, int i) {
        long j;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-507585681, i, -1, "androidx.compose.material3.CheckboxColors.checkmarkColor (Checkbox.kt:481)");
        }
        ToggleableState toggleableState2 = ToggleableState.Off;
        if (toggleableState == toggleableState2) {
            j = this.uncheckedCheckmarkColor;
        } else {
            j = this.checkedCheckmarkColor;
        }
        SnapshotState4<Color> snapshotState4M4805animateColorAsStateeuL9pac = SingleValueAnimation.m4805animateColorAsStateeuL9pac(j, AnimationSpecKt.tween$default(toggleableState == toggleableState2 ? 100 : 50, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return snapshotState4M4805animateColorAsStateeuL9pac;
    }

    public final SnapshotState4<Color> boxColor$material3_release(boolean z, ToggleableState toggleableState, Composer composer, int i) {
        long j;
        SnapshotState4<Color> snapshotState4RememberUpdatedState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(360729865, i, -1, "androidx.compose.material3.CheckboxColors.boxColor (Checkbox.kt:501)");
        }
        if (z) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i2 == 1 || i2 == 2) {
                j = this.checkedBoxColor;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j = this.uncheckedBoxColor;
            }
        } else {
            int i3 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i3 == 1) {
                j = this.disabledCheckedBoxColor;
            } else if (i3 == 2) {
                j = this.disabledIndeterminateBoxColor;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j = this.disabledUncheckedBoxColor;
            }
        }
        long j2 = j;
        if (z) {
            composer.startReplaceGroup(-392211906);
            snapshotState4RememberUpdatedState = SingleValueAnimation.m4805animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(toggleableState == ToggleableState.Off ? 100 : 50, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-392031362);
            snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m6701boximpl(j2), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return snapshotState4RememberUpdatedState;
    }

    public final SnapshotState4<Color> borderColor$material3_release(boolean z, ToggleableState toggleableState, Composer composer, int i) {
        long j;
        SnapshotState4<Color> snapshotState4RememberUpdatedState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1009643462, i, -1, "androidx.compose.material3.CheckboxColors.borderColor (Checkbox.kt:534)");
        }
        if (z) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i2 == 1 || i2 == 2) {
                j = this.checkedBorderColor;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j = this.uncheckedBorderColor;
            }
        } else {
            int i3 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i3 == 1) {
                j = this.disabledBorderColor;
            } else if (i3 == 2) {
                j = this.disabledIndeterminateBorderColor;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j = this.disabledUncheckedBorderColor;
            }
        }
        long j2 = j;
        if (z) {
            composer.startReplaceGroup(-1725816497);
            snapshotState4RememberUpdatedState = SingleValueAnimation.m4805animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(toggleableState == ToggleableState.Off ? 100 : 50, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1725635953);
            snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m6701boximpl(j2), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return snapshotState4RememberUpdatedState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof CheckboxColors)) {
            return false;
        }
        CheckboxColors checkboxColors = (CheckboxColors) other;
        return Color.m6707equalsimpl0(this.checkedCheckmarkColor, checkboxColors.checkedCheckmarkColor) && Color.m6707equalsimpl0(this.uncheckedCheckmarkColor, checkboxColors.uncheckedCheckmarkColor) && Color.m6707equalsimpl0(this.checkedBoxColor, checkboxColors.checkedBoxColor) && Color.m6707equalsimpl0(this.uncheckedBoxColor, checkboxColors.uncheckedBoxColor) && Color.m6707equalsimpl0(this.disabledCheckedBoxColor, checkboxColors.disabledCheckedBoxColor) && Color.m6707equalsimpl0(this.disabledUncheckedBoxColor, checkboxColors.disabledUncheckedBoxColor) && Color.m6707equalsimpl0(this.disabledIndeterminateBoxColor, checkboxColors.disabledIndeterminateBoxColor) && Color.m6707equalsimpl0(this.checkedBorderColor, checkboxColors.checkedBorderColor) && Color.m6707equalsimpl0(this.uncheckedBorderColor, checkboxColors.uncheckedBorderColor) && Color.m6707equalsimpl0(this.disabledBorderColor, checkboxColors.disabledBorderColor) && Color.m6707equalsimpl0(this.disabledUncheckedBorderColor, checkboxColors.disabledUncheckedBorderColor) && Color.m6707equalsimpl0(this.disabledIndeterminateBorderColor, checkboxColors.disabledIndeterminateBorderColor);
    }

    public int hashCode() {
        return (((((((((((((((((((((Color.m6713hashCodeimpl(this.checkedCheckmarkColor) * 31) + Color.m6713hashCodeimpl(this.uncheckedCheckmarkColor)) * 31) + Color.m6713hashCodeimpl(this.checkedBoxColor)) * 31) + Color.m6713hashCodeimpl(this.uncheckedBoxColor)) * 31) + Color.m6713hashCodeimpl(this.disabledCheckedBoxColor)) * 31) + Color.m6713hashCodeimpl(this.disabledUncheckedBoxColor)) * 31) + Color.m6713hashCodeimpl(this.disabledIndeterminateBoxColor)) * 31) + Color.m6713hashCodeimpl(this.checkedBorderColor)) * 31) + Color.m6713hashCodeimpl(this.uncheckedBorderColor)) * 31) + Color.m6713hashCodeimpl(this.disabledBorderColor)) * 31) + Color.m6713hashCodeimpl(this.disabledUncheckedBorderColor)) * 31) + Color.m6713hashCodeimpl(this.disabledIndeterminateBorderColor);
    }
}

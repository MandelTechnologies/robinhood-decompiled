package androidx.compose.material;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Chip.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ#\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0002\u0010\u0012J#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0002\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\n\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u000b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, m3636d2 = {"Landroidx/compose/material/DefaultSelectableChipColors;", "Landroidx/compose/material/SelectableChipColors;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "leadingIconColor", "disabledBackgroundColor", "disabledContentColor", "disabledLeadingIconColor", "selectedBackgroundColor", "selectedContentColor", "selectedLeadingIconColor", "(JJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "Landroidx/compose/runtime/State;", "enabled", "", "selected", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "equals", "other", "", "hashCode", "", "material_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.material.DefaultSelectableChipColors, reason: use source file name */
/* loaded from: classes4.dex */
final class Chip4 implements Chip5 {
    private final long backgroundColor;
    private final long contentColor;
    private final long disabledBackgroundColor;
    private final long disabledContentColor;
    private final long disabledLeadingIconColor;
    private final long leadingIconColor;
    private final long selectedBackgroundColor;
    private final long selectedContentColor;
    private final long selectedLeadingIconColor;

    public /* synthetic */ Chip4(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9);
    }

    private Chip4(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.backgroundColor = j;
        this.contentColor = j2;
        this.leadingIconColor = j3;
        this.disabledBackgroundColor = j4;
        this.disabledContentColor = j5;
        this.disabledLeadingIconColor = j6;
        this.selectedBackgroundColor = j7;
        this.selectedContentColor = j8;
        this.selectedLeadingIconColor = j9;
    }

    @Override // androidx.compose.material.Chip5
    public SnapshotState4<Color> backgroundColor(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceGroup(-403836585);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-403836585, i, -1, "androidx.compose.material.DefaultSelectableChipColors.backgroundColor (Chip.kt:638)");
        }
        if (!z) {
            j = this.disabledBackgroundColor;
        } else if (!z2) {
            j = this.backgroundColor;
        } else {
            j = this.selectedBackgroundColor;
        }
        SnapshotState4<Color> snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m6701boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return snapshotState4RememberUpdatedState;
    }

    @Override // androidx.compose.material.Chip5
    public SnapshotState4<Color> contentColor(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceGroup(2025240134);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2025240134, i, -1, "androidx.compose.material.DefaultSelectableChipColors.contentColor (Chip.kt:649)");
        }
        if (!z) {
            j = this.disabledContentColor;
        } else if (!z2) {
            j = this.contentColor;
        } else {
            j = this.selectedContentColor;
        }
        SnapshotState4<Color> snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m6701boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return snapshotState4RememberUpdatedState;
    }

    @Override // androidx.compose.material.Chip5
    public SnapshotState4<Color> leadingIconColor(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceGroup(189838188);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(189838188, i, -1, "androidx.compose.material.DefaultSelectableChipColors.leadingIconColor (Chip.kt:660)");
        }
        if (!z) {
            j = this.disabledLeadingIconColor;
        } else if (!z2) {
            j = this.leadingIconColor;
        } else {
            j = this.selectedLeadingIconColor;
        }
        SnapshotState4<Color> snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m6701boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return snapshotState4RememberUpdatedState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || Chip4.class != other.getClass()) {
            return false;
        }
        Chip4 chip4 = (Chip4) other;
        return Color.m6707equalsimpl0(this.backgroundColor, chip4.backgroundColor) && Color.m6707equalsimpl0(this.contentColor, chip4.contentColor) && Color.m6707equalsimpl0(this.leadingIconColor, chip4.leadingIconColor) && Color.m6707equalsimpl0(this.disabledBackgroundColor, chip4.disabledBackgroundColor) && Color.m6707equalsimpl0(this.disabledContentColor, chip4.disabledContentColor) && Color.m6707equalsimpl0(this.disabledLeadingIconColor, chip4.disabledLeadingIconColor) && Color.m6707equalsimpl0(this.selectedBackgroundColor, chip4.selectedBackgroundColor) && Color.m6707equalsimpl0(this.selectedContentColor, chip4.selectedContentColor) && Color.m6707equalsimpl0(this.selectedLeadingIconColor, chip4.selectedLeadingIconColor);
    }

    public int hashCode() {
        return (((((((((((((((Color.m6713hashCodeimpl(this.backgroundColor) * 31) + Color.m6713hashCodeimpl(this.contentColor)) * 31) + Color.m6713hashCodeimpl(this.leadingIconColor)) * 31) + Color.m6713hashCodeimpl(this.disabledBackgroundColor)) * 31) + Color.m6713hashCodeimpl(this.disabledContentColor)) * 31) + Color.m6713hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m6713hashCodeimpl(this.selectedBackgroundColor)) * 31) + Color.m6713hashCodeimpl(this.selectedContentColor)) * 31) + Color.m6713hashCodeimpl(this.selectedLeadingIconColor);
    }
}

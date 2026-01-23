package com.robinhood.compose.bento.component.rows;

import androidx.compose.material3.SwitchColors;
import androidx.compose.material3.SwitchDefaults;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.compose.theme.style.ToggleRowStyle;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoToggleRow.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"By\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020 H\u0007¢\u0006\u0002\u0010!R\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0013\u0010\u0007\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\u000f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016¨\u0006#"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoToggleRowColors;", "", "fgColor", "Landroidx/compose/ui/graphics/Color;", "fgColorSecondary", "fgColorDisabled", "checkedThumbColor", "checkedTrackColor", "uncheckedBorderColor", "uncheckedThumbColor", "uncheckedTrackColor", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "disabledUncheckedBorderColor", "enabled", "", "<init>", "(JJJJJJJJJJJJJZ)V", "J", "getCheckedTrackColor-0d7_KjU", "()J", "fg", "getFg-0d7_KjU", "fgSecondary", "getFgSecondary-0d7_KjU", "resolveOrFg", ResourceTypes.COLOR, "resolveOrFg-afOx6l0", "(Landroidx/compose/ui/graphics/Color;)J", "switchColors", "Landroidx/compose/material3/SwitchColors;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SwitchColors;", "Companion", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.rows.BentoToggleRowColors, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoToggleRow {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long checkedThumbColor;
    private final long checkedTrackColor;
    private final long disabledCheckedThumbColor;
    private final long disabledCheckedTrackColor;
    private final long disabledUncheckedBorderColor;
    private final long disabledUncheckedThumbColor;
    private final long disabledUncheckedTrackColor;
    private final boolean enabled;
    private final long fgColor;
    private final long fgColorDisabled;
    private final long fgColorSecondary;
    private final long uncheckedBorderColor;
    private final long uncheckedThumbColor;
    private final long uncheckedTrackColor;

    public /* synthetic */ BentoToggleRow(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z);
    }

    private BentoToggleRow(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z) {
        this.fgColor = j;
        this.fgColorSecondary = j2;
        this.fgColorDisabled = j3;
        this.checkedThumbColor = j4;
        this.checkedTrackColor = j5;
        this.uncheckedBorderColor = j6;
        this.uncheckedThumbColor = j7;
        this.uncheckedTrackColor = j8;
        this.disabledCheckedThumbColor = j9;
        this.disabledCheckedTrackColor = j10;
        this.disabledUncheckedThumbColor = j11;
        this.disabledUncheckedTrackColor = j12;
        this.disabledUncheckedBorderColor = j13;
        this.enabled = z;
    }

    /* renamed from: getCheckedTrackColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getCheckedTrackColor() {
        return this.checkedTrackColor;
    }

    /* renamed from: getFg-0d7_KjU, reason: not valid java name */
    public final long m21007getFg0d7_KjU() {
        return this.enabled ? this.fgColor : this.fgColorDisabled;
    }

    /* renamed from: getFgSecondary-0d7_KjU, reason: not valid java name */
    public final long m21008getFgSecondary0d7_KjU() {
        return this.enabled ? this.fgColorSecondary : this.fgColorDisabled;
    }

    /* renamed from: resolveOrFg-afOx6l0, reason: not valid java name */
    public final long m21009resolveOrFgafOx6l0(Color color) {
        if (color == null || !this.enabled) {
            return m21007getFg0d7_KjU();
        }
        return color.getValue();
    }

    public final SwitchColors switchColors(Composer composer, int i) {
        composer.startReplaceGroup(766790655);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(766790655, i, -1, "com.robinhood.compose.bento.component.rows.BentoToggleRowColors.switchColors (BentoToggleRow.kt:385)");
        }
        SwitchDefaults switchDefaults = SwitchDefaults.INSTANCE;
        long j = this.checkedThumbColor;
        long j2 = this.checkedTrackColor;
        SwitchColors switchColorsM5980colorsV1nXRL4 = switchDefaults.m5980colorsV1nXRL4(j, j2, 0L, j2, this.uncheckedThumbColor, this.uncheckedTrackColor, this.uncheckedBorderColor, 0L, this.disabledCheckedThumbColor, this.disabledCheckedTrackColor, 0L, 0L, this.disabledUncheckedThumbColor, this.disabledUncheckedTrackColor, this.disabledUncheckedBorderColor, 0L, composer, 0, SwitchDefaults.$stable << 18, 35972);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return switchColorsM5980colorsV1nXRL4;
    }

    /* compiled from: BentoToggleRow.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoToggleRowColors$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/compose/bento/component/rows/BentoToggleRowColors;", "enabled", "", ResourceTypes.STYLE, "Lcom/robinhood/compose/theme/style/ToggleRowStyle;", "(ZLcom/robinhood/compose/theme/style/ToggleRowStyle;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/rows/BentoToggleRowColors;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.rows.BentoToggleRowColors$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BentoToggleRow create(boolean z, ToggleRowStyle style, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(style, "style");
            composer.startReplaceGroup(-699155998);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-699155998, i, -1, "com.robinhood.compose.bento.component.rows.BentoToggleRowColors.Companion.create (BentoToggleRow.kt:407)");
            }
            long jM22054getFgColor0d7_KjU = style.m22054getFgColor0d7_KjU();
            long jM22056getFgColorSecondary0d7_KjU = style.m22056getFgColorSecondary0d7_KjU();
            long jM22055getFgColorDisabled0d7_KjU = style.m22055getFgColorDisabled0d7_KjU();
            long jM22048getCheckedTrackColor0d7_KjU = style.m22048getCheckedTrackColor0d7_KjU();
            BentoToggleRow bentoToggleRow = new BentoToggleRow(jM22054getFgColor0d7_KjU, jM22056getFgColorSecondary0d7_KjU, jM22055getFgColorDisabled0d7_KjU, style.m22047getCheckedThumbColor0d7_KjU(), jM22048getCheckedTrackColor0d7_KjU, style.m22057getUncheckedBorderColor0d7_KjU(), style.m22058getUncheckedThumbColor0d7_KjU(), style.m22059getUncheckedTrackColor0d7_KjU(), style.m22049getDisabledCheckedThumbColor0d7_KjU(), style.m22050getDisabledCheckedTrackColor0d7_KjU(), style.m22052getDisabledUncheckedThumbColor0d7_KjU(), style.m22053getDisabledUncheckedTrackColor0d7_KjU(), style.m22051getDisabledUncheckedBorderColor0d7_KjU(), z, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return bentoToggleRow;
        }
    }
}

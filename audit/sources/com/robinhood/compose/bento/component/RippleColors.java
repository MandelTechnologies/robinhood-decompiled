package com.robinhood.compose.bento.component;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InfoTags.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u0007¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u0007¢\u0006\u0002\u0010\u0015R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0013\u0010\r\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007R\u0013\u0010\u000f\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0010\u0010\u0007R\u0013\u0010\u0011\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/RippleColors;", "", "<init>", "()V", "rippleJet", "Landroidx/compose/ui/graphics/Color;", "getRippleJet-0d7_KjU", "()J", "J", "rippleNova", "getRippleNova-0d7_KjU", "rippleForeground1Day", "getRippleForeground1Day-0d7_KjU", "rippleForeground1Night", "getRippleForeground1Night-0d7_KjU", "rippleBackground1Day", "getRippleBackground1Day-0d7_KjU", "rippleBackground1Night", "getRippleBackground1Night-0d7_KjU", "rippleBackground1", "Landroidx/compose/runtime/State;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "rippleForeground1", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
final class RippleColors {
    public static final RippleColors INSTANCE = new RippleColors();
    private static final long rippleBackground1Day;
    private static final long rippleBackground1Night;
    private static final long rippleForeground1Day;
    private static final long rippleForeground1Night;
    private static final long rippleJet;
    private static final long rippleNova;

    private RippleColors() {
    }

    static {
        long jColor = Color2.Color(872415231);
        rippleJet = jColor;
        long jColor2 = Color2.Color(436207616);
        rippleNova = jColor2;
        rippleForeground1Day = jColor;
        rippleForeground1Night = jColor2;
        rippleBackground1Day = jColor2;
        rippleBackground1Night = jColor;
    }

    /* renamed from: getRippleJet-0d7_KjU, reason: not valid java name */
    public final long m20831getRippleJet0d7_KjU() {
        return rippleJet;
    }

    /* renamed from: getRippleNova-0d7_KjU, reason: not valid java name */
    public final long m20832getRippleNova0d7_KjU() {
        return rippleNova;
    }

    /* renamed from: getRippleForeground1Day-0d7_KjU, reason: not valid java name */
    public final long m20829getRippleForeground1Day0d7_KjU() {
        return rippleForeground1Day;
    }

    /* renamed from: getRippleForeground1Night-0d7_KjU, reason: not valid java name */
    public final long m20830getRippleForeground1Night0d7_KjU() {
        return rippleForeground1Night;
    }

    /* renamed from: getRippleBackground1Day-0d7_KjU, reason: not valid java name */
    public final long m20827getRippleBackground1Day0d7_KjU() {
        return rippleBackground1Day;
    }

    /* renamed from: getRippleBackground1Night-0d7_KjU, reason: not valid java name */
    public final long m20828getRippleBackground1Night0d7_KjU() {
        return rippleBackground1Night;
    }

    public final SnapshotState4<Color> rippleBackground1(Composer composer, int i) {
        composer.startReplaceGroup(-339853823);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-339853823, i, -1, "com.robinhood.compose.bento.component.RippleColors.rippleBackground1 (InfoTags.kt:279)");
        }
        final boolean isDay = BentoTheme.INSTANCE.getColors(composer, 6).getIsDay();
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(isDay);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<Color>() { // from class: com.robinhood.compose.bento.component.RippleColors$rippleBackground1$1$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Color invoke() {
                    return Color.m6701boximpl(m20833invoke0d7_KjU());
                }

                /* renamed from: invoke-0d7_KjU, reason: not valid java name */
                public final long m20833invoke0d7_KjU() {
                    return isDay ? RippleColors.INSTANCE.m20827getRippleBackground1Day0d7_KjU() : RippleColors.INSTANCE.m20828getRippleBackground1Night0d7_KjU();
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        SnapshotState4<Color> snapshotState4DerivedStateOf = SnapshotStateKt.derivedStateOf((Function0) objRememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return snapshotState4DerivedStateOf;
    }

    public final SnapshotState4<Color> rippleForeground1(Composer composer, int i) {
        composer.startReplaceGroup(1809562710);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1809562710, i, -1, "com.robinhood.compose.bento.component.RippleColors.rippleForeground1 (InfoTags.kt:287)");
        }
        final boolean isDay = BentoTheme.INSTANCE.getColors(composer, 6).getIsDay();
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(isDay);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<Color>() { // from class: com.robinhood.compose.bento.component.RippleColors$rippleForeground1$1$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Color invoke() {
                    return Color.m6701boximpl(m20834invoke0d7_KjU());
                }

                /* renamed from: invoke-0d7_KjU, reason: not valid java name */
                public final long m20834invoke0d7_KjU() {
                    return isDay ? RippleColors.INSTANCE.m20829getRippleForeground1Day0d7_KjU() : RippleColors.INSTANCE.m20830getRippleForeground1Night0d7_KjU();
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        SnapshotState4<Color> snapshotState4DerivedStateOf = SnapshotStateKt.derivedStateOf((Function0) objRememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return snapshotState4DerivedStateOf;
    }
}

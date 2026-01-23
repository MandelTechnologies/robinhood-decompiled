package com.robinhood.android.event.gamedetail.p130ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeltaDirection.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"getBentoColor", "Landroidx/compose/ui/graphics/Color;", "Lcom/robinhood/android/event/gamedetail/ui/DeltaDirection;", "(Lcom/robinhood/android/event/gamedetail/ui/DeltaDirection;Landroidx/compose/runtime/Composer;I)J", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.gamedetail.ui.DeltaDirectionKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class DeltaDirection2 {

    /* compiled from: DeltaDirection.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.event.gamedetail.ui.DeltaDirectionKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeltaDirection.values().length];
            try {
                iArr[DeltaDirection.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeltaDirection.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeltaDirection.NEUTRAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final long getBentoColor(DeltaDirection deltaDirection, Composer composer, int i) {
        long jM21456getPositive0d7_KjU;
        Intrinsics.checkNotNullParameter(deltaDirection, "<this>");
        composer.startReplaceGroup(1035339199);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1035339199, i, -1, "com.robinhood.android.event.gamedetail.ui.getBentoColor (DeltaDirection.kt:13)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[deltaDirection.ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(-1471438137);
            jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU();
            composer.endReplaceGroup();
        } else if (i2 == 2) {
            composer.startReplaceGroup(-1471436153);
            jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21452getNegative0d7_KjU();
            composer.endReplaceGroup();
        } else {
            if (i2 != 3) {
                composer.startReplaceGroup(-1471440019);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-1471431934);
            jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21426getFg20d7_KjU();
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM21456getPositive0d7_KjU;
    }
}

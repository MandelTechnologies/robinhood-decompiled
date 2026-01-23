package com.robinhood.android.lib.screener;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.lib.screener.ScreenTableCells;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.extensions.StringsKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DisplayScreenerCells.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
final class DisplayScreenerCellsKt$IconCell$1 implements Function3<BoxScope, Composer, Integer, Unit> {
    final /* synthetic */ ScreenTableCells.Icon $cell;
    final /* synthetic */ Function0<Unit> $onDataDisplayClicked;
    final /* synthetic */ Function2<Boolean, UUID, Unit> $onWatchlistToggled;
    final /* synthetic */ C2002Dp $width;

    /* compiled from: DisplayScreenerCells.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ServerToBentoAssetMapper2.values().length];
            try {
                iArr[ServerToBentoAssetMapper2.BUBBLE_CHECKED_24.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ServerToBentoAssetMapper2.BUBBLE_PLUS_24.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ServerToBentoAssetMapper2.EDIT_SURFACE_24.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    DisplayScreenerCellsKt$IconCell$1(C2002Dp c2002Dp, ScreenTableCells.Icon icon, Function2<? super Boolean, ? super UUID, Unit> function2, Function0<Unit> function0) {
        this.$width = c2002Dp;
        this.$cell = icon;
        this.$onWatchlistToggled = function2;
        this.$onDataDisplayClicked = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        invoke(boxScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxScope ScreenerBaseCell, Composer composer, int i) {
        int i2;
        long jM21425getFg0d7_KjU;
        Intrinsics.checkNotNullParameter(ScreenerBaseCell, "$this$ScreenerBaseCell");
        if ((i & 6) == 0) {
            i2 = (composer.changed(ScreenerBaseCell) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1389539235, i2, -1, "com.robinhood.android.lib.screener.IconCell.<anonymous> (DisplayScreenerCells.kt:141)");
        }
        composer.startReplaceGroup(387624780);
        if (this.$width != null && this.$cell.getIcon().getAsset() == ServerToBentoAssetMapper2.EDIT_SURFACE_24) {
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(ScreenerBaseCell.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composer, 0, 4);
        }
        composer.endReplaceGroup();
        BentoIcon4 icon = this.$cell.getIcon();
        Integer contentDescription = this.$cell.getContentDescription();
        composer.startReplaceGroup(387635676);
        Function0 function0 = null;
        String strStringResource = contentDescription == null ? null : StringResources_androidKt.stringResource(contentDescription.intValue(), composer, 0);
        composer.endReplaceGroup();
        if (this.$cell.getUseFg2()) {
            composer.startReplaceGroup(-868126800);
            jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21426getFg20d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-868068303);
            jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
            composer.endReplaceGroup();
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[this.$cell.getIcon().getAsset().ordinal()];
        if (i3 == 1) {
            composer.startReplaceGroup(-867920092);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$onWatchlistToggled) | composer.changedInstance(this.$cell);
            final Function2<Boolean, UUID, Unit> function2 = this.$onWatchlistToggled;
            final ScreenTableCells.Icon icon2 = this.$cell;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$IconCell$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DisplayScreenerCellsKt$IconCell$1.invoke$lambda$2$lambda$1(function2, icon2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.endReplaceGroup();
        } else if (i3 == 2) {
            composer.startReplaceGroup(-867778267);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged2 = composer.changed(this.$onWatchlistToggled) | composer.changedInstance(this.$cell);
            final Function2<Boolean, UUID, Unit> function22 = this.$onWatchlistToggled;
            final ScreenTableCells.Icon icon3 = this.$cell;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$IconCell$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DisplayScreenerCellsKt$IconCell$1.invoke$lambda$4$lambda$3(function22, icon3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            function0 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.endReplaceGroup();
        } else if (i3 != 3) {
            composer.startReplaceGroup(-867548000);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-867637341);
            composer.startReplaceGroup(5004770);
            boolean zChanged3 = composer.changed(this.$onDataDisplayClicked);
            final Function0<Unit> function02 = this.$onDataDisplayClicked;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$IconCell$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DisplayScreenerCellsKt$IconCell$1.invoke$lambda$6$lambda$5(function02);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            function0 = (Function0) objRememberedValue3;
            composer.endReplaceGroup();
            composer.endReplaceGroup();
        }
        BentoIcon2.m20644BentoIconFU0evQE(icon, strStringResource, jM21425getFg0d7_KjU, null, function0, false, composer, BentoIcon4.$stable, 40);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(Function2 function2, ScreenTableCells.Icon icon) {
        function2.invoke(Boolean.FALSE, StringsKt.toUuid(icon.getInstrumentId()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(Function2 function2, ScreenTableCells.Icon icon) {
        function2.invoke(Boolean.TRUE, StringsKt.toUuid(icon.getInstrumentId()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}

package com.robinhood.android.equityscreener.table;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.equities.contracts.screeners.SaveScreenerContract;
import com.robinhood.android.equities.contracts.screeners.SaveScreenerOptionsContract;
import com.robinhood.android.equities.contracts.screeners.ScreenerOverflowActionsContract;
import com.robinhood.android.equityscreener.C15652R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.equityscreener.models.p294db.Screener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: EquityScreenerTableFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class EquityScreenerTableFragment$ComposeContent$2$1$1$4 implements Function3<Row5, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState4<EquityScreenerTableViewState> $viewState$delegate;
    final /* synthetic */ EquityScreenerTableFragment this$0;

    EquityScreenerTableFragment$ComposeContent$2$1$1$4(SnapshotState4<EquityScreenerTableViewState> snapshotState4, EquityScreenerTableFragment equityScreenerTableFragment) {
        this.$viewState$delegate = snapshotState4;
        this.this$0 = equityScreenerTableFragment;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
        invoke(row5, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(SnapshotState4 snapshotState4, EquityScreenerTableFragment equityScreenerTableFragment) {
        String id;
        Screener screener = EquityScreenerTableFragment.ComposeContent$lambda$0(snapshotState4).getScreener();
        if (screener != null && (id = screener.getId()) != null) {
            Navigator.DefaultImpls.createDialogFragment$default(equityScreenerTableFragment.getNavigator(), new ScreenerOverflowActionsContract.Key(id), null, 2, null).show(equityScreenerTableFragment.getChildFragmentManager(), "screener-overflow-actions-sheet");
        }
        return Unit.INSTANCE;
    }

    public final void invoke(Row5 ScreenerCollapsingToolbar, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(ScreenerCollapsingToolbar, "$this$ScreenerCollapsingToolbar");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(ScreenerCollapsingToolbar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1164162701, i2, -1, "com.robinhood.android.equityscreener.table.EquityScreenerTableFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EquityScreenerTableFragment.kt:226)");
        }
        composer.startReplaceGroup(2068860872);
        if (EquityScreenerTableFragment.ComposeContent$lambda$0(this.$viewState$delegate).getHasBeenSaved()) {
            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.DOTS_ANDROID_24);
            long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
            String strStringResource = StringResources_androidKt.stringResource(C15652R.string.overflow, composer, 0);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$viewState$delegate) | composer.changedInstance(this.this$0);
            final SnapshotState4<EquityScreenerTableViewState> snapshotState4 = this.$viewState$delegate;
            final EquityScreenerTableFragment equityScreenerTableFragment = this.this$0;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableFragment$ComposeContent$2$1$1$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EquityScreenerTableFragment$ComposeContent$2$1$1$4.invoke$lambda$2$lambda$1(snapshotState4, equityScreenerTableFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource, jM21425getFg0d7_KjU, null, (Function0) objRememberedValue, false, composer, BentoIcon4.Size24.$stable, 40);
        }
        composer.endReplaceGroup();
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i3 = BentoTheme.$stable;
        Modifier modifierAlign = ScreenerCollapsingToolbar.align(SizeKt.fillMaxHeight$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null), Alignment.INSTANCE.getCenterVertically());
        String strStringResource2 = StringResources_androidKt.stringResource(EquityScreenerTableFragment.ComposeContent$lambda$0(this.$viewState$delegate).getSaveButtonResId(), composer, 0);
        BentoTextButton3.Size size = BentoTextButton3.Size.f5147M;
        boolean savable = EquityScreenerTableFragment.ComposeContent$lambda$0(this.$viewState$delegate).getSavable();
        long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU();
        composer.startReplaceGroup(-1633490746);
        boolean zChanged2 = composer.changed(this.$viewState$delegate) | composer.changedInstance(this.this$0);
        final SnapshotState4<EquityScreenerTableViewState> snapshotState42 = this.$viewState$delegate;
        final EquityScreenerTableFragment equityScreenerTableFragment2 = this.this$0;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableFragment$ComposeContent$2$1$1$4$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EquityScreenerTableFragment$ComposeContent$2$1$1$4.invoke$lambda$7$lambda$6(snapshotState42, equityScreenerTableFragment2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue2, strStringResource2, modifierAlign, null, size, savable, Color.m6701boximpl(jM21425getFg0d7_KjU2), composer, 24576, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(SnapshotState4 snapshotState4, EquityScreenerTableFragment equityScreenerTableFragment) {
        Screener screener = EquityScreenerTableFragment.ComposeContent$lambda$0(snapshotState4).getScreener();
        if (screener != null) {
            if (!EquityScreenerTableFragment.ComposeContent$lambda$0(snapshotState4).getHasBeenSaved()) {
                equityScreenerTableFragment.openSaveBottomSheet(new SaveScreenerContract.SaveType.Save(screener.getId()));
            } else {
                String id = screener.getId();
                if (StringsKt.isBlank(id)) {
                    id = null;
                }
                if (id != null) {
                    Navigator.DefaultImpls.createDialogFragment$default(equityScreenerTableFragment.getNavigator(), new SaveScreenerOptionsContract.Key(id, screener.getDisplayName()), null, 2, null).show(equityScreenerTableFragment.getChildFragmentManager(), "save-screener-options-bottom-sheet");
                }
            }
        }
        return Unit.INSTANCE;
    }
}

package com.robinhood.android.equities.taxlots.table;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.LineHeightStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.android.equities.taxlots.C14807R;
import com.robinhood.android.equities.taxlots.UtilsKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import equity_trading_tax_lots.proto.p460v1.TaxLotTerm;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TaxLotsDateAndTermCell.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.taxlots.table.TaxLotsDateAndTermCellKt$TaxLotsDateCellComposable$1, reason: use source file name */
/* loaded from: classes3.dex */
final class TaxLotsDateAndTermCell5 implements Function3<BoxScope, Composer, Integer, Unit> {
    final /* synthetic */ int $rowIndex;
    final /* synthetic */ TaxLotsDateAndTermCell $taxLotsDateAndTermCell;
    final /* synthetic */ C2002Dp $width;

    /* compiled from: TaxLotsDateAndTermCell.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equities.taxlots.table.TaxLotsDateAndTermCellKt$TaxLotsDateCellComposable$1$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TaxLotTerm.values().length];
            try {
                iArr[TaxLotTerm.SHORT_TERM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TaxLotTerm.LONG_TERM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TaxLotTerm.MIXED_TERM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TaxLotTerm.OTHER_TERM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TaxLotTerm.TAX_LOT_TERM_UNSPECIFIED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    TaxLotsDateAndTermCell5(C2002Dp c2002Dp, int i, TaxLotsDateAndTermCell taxLotsDateAndTermCell) {
        this.$width = c2002Dp;
        this.$rowIndex = i;
        this.$taxLotsDateAndTermCell = taxLotsDateAndTermCell;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        invoke(boxScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2$lambda$1(int i, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        SemanticsPropertiesKt.setTestTag(semantics, "tax_lot_date_" + (i + 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(BoxScope TaxLotsBaseCell, Composer composer, int i) {
        Modifier modifierWeight$default;
        String date;
        Intrinsics.checkNotNullParameter(TaxLotsBaseCell, "$this$TaxLotsBaseCell");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1291999863, i, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsDateCellComposable.<anonymous> (TaxLotsDateAndTermCell.kt:55)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null);
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        C2002Dp c2002Dp = this.$width;
        final int i3 = this.$rowIndex;
        TaxLotsDateAndTermCell taxLotsDateAndTermCell = this.$taxLotsDateAndTermCell;
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        Row6 row6 = Row6.INSTANCE;
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 10, null);
        if (c2002Dp != null) {
            c2002Dp.getValue();
            modifierWeight$default = Row5.weight$default(row6, modifierM5146paddingqDBjuR0$default, 1.0f, false, 2, null);
            if (modifierWeight$default == null) {
                modifierWeight$default = modifierM5146paddingqDBjuR0$default;
            }
        }
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(i3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsDateAndTermCellKt$TaxLotsDateCellComposable$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotsDateAndTermCell5.invoke$lambda$3$lambda$2$lambda$1(i3, (SemanticsPropertyReceiver) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifierWeight$default, false, (Function1) objRememberedValue, 1, null);
        composer.startReplaceGroup(2100184087);
        if (c2002Dp == null) {
            date = "99/99/99";
        } else {
            date = taxLotsDateAndTermCell.getDate();
            if (date == null) {
                date = StringResources_androidKt.stringResource(C14807R.string.tax_lots_table_empty_text, composer, 0);
            }
        }
        composer.endReplaceGroup();
        TextStyle textS = bentoTheme.getTypography(composer, i2).getTextS();
        TextAlign.Companion companion3 = TextAlign.INSTANCE;
        BentoText2.m20747BentoText38GnDrw(date, modifierSemantics$default, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 1, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(textS, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, companion3.m7920getEnde0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), composer, 805306368, 0, 7672);
        int i4 = WhenMappings.$EnumSwitchMapping$0[taxLotsDateAndTermCell.getTerm().ordinal()];
        if (i4 == 1 || i4 == 2) {
            composer.startReplaceGroup(681704605);
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(taxLotsDateAndTermCell.getTerm() == TaxLotTerm.LONG_TERM ? ServerToBentoAssetMapper2.TAX_LOTS_LONG_TERM_16 : ServerToBentoAssetMapper2.TAX_LOTS_SHORT_TERM_16), UtilsKt.stringValue(taxLotsDateAndTermCell.getTerm(), composer, 0), bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 11, null), null, false, composer, BentoIcon4.Size16.$stable, 48);
            composer.endReplaceGroup();
        } else {
            if (i4 != 3 && i4 != 4 && i4 != 5) {
                composer.startReplaceGroup(2100198195);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(682483697);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C14807R.string.tax_lots_term_dash, composer, 0), SizeKt.m5169size3ABfNKs(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 11, null), C2002Dp.m7995constructorimpl(16)), null, null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, i2).getTextS(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, companion3.m7919getCentere0LSkKk(), 0, 0L, null, null, new LineHeightStyle(LineHeightStyle.Alignment.INSTANCE.m7889getCenterPIaL0Z0(), LineHeightStyle.Trim.INSTANCE.m7911getNoneEVpEnUU(), (DefaultConstructorMarker) null), 0, 0, null, 15695871, null), composer, 0, 0, 8188);
            composer.endReplaceGroup();
        }
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

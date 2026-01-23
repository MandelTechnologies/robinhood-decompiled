package com.robinhood.android.advisory.portfolio.holdings;

import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.Updater;
import com.robinhood.android.advisory.portfolio.C9151R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HoldingsDrillDownScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$HoldingsDrillDownScreen$1$1$1$1$1$3, reason: use source file name */
/* loaded from: classes7.dex */
final class HoldingsDrillDownScreen4 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ HoldingsDrillDownViewState3 $currentTab;
    final /* synthetic */ DisclosureBottomSheet $disclosureBottomSheet;
    final /* synthetic */ SnapshotState<Boolean> $disclosureBottomSheetVisible$delegate;

    HoldingsDrillDownScreen4(DisclosureBottomSheet disclosureBottomSheet, HoldingsDrillDownViewState3 holdingsDrillDownViewState3, SnapshotState<Boolean> snapshotState) {
        this.$disclosureBottomSheet = disclosureBottomSheet;
        this.$currentTab = holdingsDrillDownViewState3;
        this.$disclosureBottomSheetVisible$delegate = snapshotState;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-973640326, i, -1, "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HoldingsDrillDownScreen.kt:208)");
        }
        boolean z = this.$disclosureBottomSheet != null;
        HoldingsDrillDownViewState3 holdingsDrillDownViewState3 = this.$currentTab;
        final SnapshotState<Boolean> snapshotState = this.$disclosureBottomSheetVisible$delegate;
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        String str = Formats.getHundredthPercentFormat().format(holdingsDrillDownViewState3.getPercentage());
        String string2 = StringResource2.getString(holdingsDrillDownViewState3.getDescription(), composer, StringResource.$stable);
        composer.startReplaceGroup(16307953);
        float fM7995constructorimpl = z ? C2002Dp.m7995constructorimpl(0) : BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM();
        composer.endReplaceGroup();
        HoldingsDrillDownScreen.SubAssetCategoryDescriptionText(str, string2, PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, 0.0f, fM7995constructorimpl, composer, 6, 1), composer, 0, 0);
        composer.startReplaceGroup(16318933);
        if (z) {
            String strStringResource = StringResources_androidKt.stringResource(C9151R.string.portfolio_holdings_interest_earning_disclosure, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
            FontWeight bold = FontWeight.INSTANCE.getBold();
            TextDecoration underline = TextDecoration.INSTANCE.getUnderline();
            long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU();
            Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), composer, 6, 1);
            composer.startReplaceGroup(5004770);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$HoldingsDrillDownScreen$1$1$1$1$1$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HoldingsDrillDownScreen4.invoke$lambda$2$lambda$1$lambda$0(snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(strStringResource, ClickableKt.m4893clickableXHw0xAI$default(modifierM21622defaultHorizontalPaddingWMci_g0, false, null, null, (Function0) objRememberedValue, 7, null), Color.m6701boximpl(jM21426getFg20d7_KjU), null, bold, underline, null, 0, false, 0, 0, null, 0, textM, composer, 221184, 0, 8136);
        }
        composer.endReplaceGroup();
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) throws Resources.NotFoundException {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(SnapshotState snapshotState) {
        HoldingsDrillDownScreen.HoldingsDrillDownScreen$lambda$5(snapshotState, true);
        return Unit.INSTANCE;
    }
}

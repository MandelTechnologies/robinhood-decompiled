package com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown;

import advisory.portfolio_reveal.proto.p007v1.PortfolioRevealAssetClassBreakdownDto;
import advisory.portfolio_reveal.proto.p007v1.PortfolioRevealAssetClassBreakdownRowDto;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdjustPortfolioButton;
import com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AssetClassBreakdownData;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoAccordionRow;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AdvisoryPortfolioRevealAssetBreakdownComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001f\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\t\u001aK\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u008e\u0002"}, m3636d2 = {"toUiModel", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/breakdown/AssetClassBreakdownData;", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassBreakdownDto;", "AssetClassAccordionRow", "", "row", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/breakdown/AssetClassBreakdownData$Row;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/breakdown/AssetClassBreakdownData$Row;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AdvisoryPortfolioRevealAssetBreakdownComposable", "assetClassBreakdown", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "source", "", "onBackClicked", "Lkotlin/Function0;", "onAdjustPortfolioClicked", "(Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/breakdown/AssetClassBreakdownData;Lcom/robinhood/models/api/BrokerageAccountType;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "feature-advisory-onboarding_externalDebug", "isExpanded", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisoryPortfolioRevealAssetBreakdownComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisoryPortfolioRevealAssetBreakdownComposable$lambda$8(AssetClassBreakdownData assetClassBreakdownData, BrokerageAccountType brokerageAccountType, String str, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AdvisoryPortfolioRevealAssetBreakdownComposable(assetClassBreakdownData, brokerageAccountType, str, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetClassAccordionRow$lambda$7(AssetClassBreakdownData.Row row, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AssetClassAccordionRow(row, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$9(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final AssetClassBreakdownData toUiModel(PortfolioRevealAssetClassBreakdownDto portfolioRevealAssetClassBreakdownDto) {
        Intrinsics.checkNotNullParameter(portfolioRevealAssetClassBreakdownDto, "<this>");
        String title = portfolioRevealAssetClassBreakdownDto.getTitle();
        String subtitle = portfolioRevealAssetClassBreakdownDto.getSubtitle();
        String disclosure = portfolioRevealAssetClassBreakdownDto.getDisclosure();
        String screen_identifier = portfolioRevealAssetClassBreakdownDto.getScreen_identifier();
        List<PortfolioRevealAssetClassBreakdownRowDto> rows = portfolioRevealAssetClassBreakdownDto.getRows();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(rows, 10));
        for (PortfolioRevealAssetClassBreakdownRowDto portfolioRevealAssetClassBreakdownRowDto : rows) {
            arrayList.add(new AssetClassBreakdownData.Row(portfolioRevealAssetClassBreakdownRowDto.getTitle(), portfolioRevealAssetClassBreakdownRowDto.getAllocation_percentage(), portfolioRevealAssetClassBreakdownRowDto.getDescription(), portfolioRevealAssetClassBreakdownRowDto.getRow_identifier()));
        }
        return new AssetClassBreakdownData(title, subtitle, disclosure, screen_identifier, extensions2.toPersistentList(arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AssetClassAccordionRow(final AssetClassBreakdownData.Row row, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean zChanged;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2075269591);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(row) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2075269591, i3, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AssetClassAccordionRow (AdvisoryPortfolioRevealAssetBreakdownComposable.kt:75)");
                }
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AdvisoryPortfolioRevealAssetBreakdownComposable.AssetClassAccordionRow$lambda$2$lambda$1();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                boolean zAssetClassAccordionRow$lambda$3 = AssetClassAccordionRow$lambda$3(snapshotState);
                BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) null, row.getTitle(), (String) null, (String) null, (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.SingleLine(row.getAllocationPercentage()), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, (DefaultConstructorMarker) null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(snapshotState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AdvisoryPortfolioRevealAssetBreakdownComposable.AssetClassAccordionRow$lambda$6$lambda$5(snapshotState, ((Boolean) obj).booleanValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoAccordionRow.BentoAccordionRow(modifierFillMaxWidth$default, zAssetClassAccordionRow$lambda$3, bentoBaseRowState, (Function1) objRememberedValue2, ComposableLambda3.rememberComposableLambda(-1557276334, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownComposableKt.AssetClassAccordionRow.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1557276334, i5, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AssetClassAccordionRow.<anonymous> (AdvisoryPortfolioRevealAssetBreakdownComposable.kt:90)");
                        }
                        String description = row.getDescription();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(description, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getTextS(), composer2, 0, 0, 8186);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (BentoBaseRowState.$stable << 6) | 24576, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvisoryPortfolioRevealAssetBreakdownComposable.AssetClassAccordionRow$lambda$7(row, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            boolean zAssetClassAccordionRow$lambda$32 = AssetClassAccordionRow$lambda$3(snapshotState);
            BentoBaseRowState bentoBaseRowState2 = new BentoBaseRowState((BentoBaseRowState.Start) null, row.getTitle(), (String) null, (String) null, (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.SingleLine(row.getAllocationPercentage()), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, (DefaultConstructorMarker) null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(snapshotState);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AdvisoryPortfolioRevealAssetBreakdownComposable.AssetClassAccordionRow$lambda$6$lambda$5(snapshotState, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
                BentoAccordionRow.BentoAccordionRow(modifierFillMaxWidth$default2, zAssetClassAccordionRow$lambda$32, bentoBaseRowState2, (Function1) objRememberedValue2, ComposableLambda3.rememberComposableLambda(-1557276334, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownComposableKt.AssetClassAccordionRow.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1557276334, i5, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AssetClassAccordionRow.<anonymous> (AdvisoryPortfolioRevealAssetBreakdownComposable.kt:90)");
                        }
                        String description = row.getDescription();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(description, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getTextS(), composer2, 0, 0, 8186);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (BentoBaseRowState.$stable << 6) | 24576, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState AssetClassAccordionRow$lambda$2$lambda$1() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    private static final void AssetClassAccordionRow$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetClassAccordionRow$lambda$6$lambda$5(SnapshotState snapshotState, boolean z) {
        AssetClassAccordionRow$lambda$4(snapshotState, z);
        return Unit.INSTANCE;
    }

    private static final boolean AssetClassAccordionRow$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AdvisoryPortfolioRevealAssetBreakdownComposable(final AssetClassBreakdownData assetClassBreakdown, final BrokerageAccountType brokerageAccountType, final String source, Function0<Unit> onBackClicked, Function0<Unit> onAdjustPortfolioClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Function0<Unit> function0;
        final Function0<Unit> function02;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(assetClassBreakdown, "assetClassBreakdown");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Intrinsics.checkNotNullParameter(onAdjustPortfolioClicked, "onAdjustPortfolioClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1883294228);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(assetClassBreakdown) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(brokerageAccountType.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(source) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClicked) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAdjustPortfolioClicked) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1883294228, i3, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownComposable (AdvisoryPortfolioRevealAssetBreakdownComposable.kt:107)");
                }
                final Screen screen = new Screen(Screen.Name.ADVISORY_PORTFOLIO_REVEAL_REGION_DETAILS, null, assetClassBreakdown.getScreenIdentifier(), null, 10, null);
                int i5 = i3;
                function0 = onAdjustPortfolioClicked;
                final Context context = new Context(0, 0, 0, null, null, null, null, null, 0, null, source, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(brokerageAccountType), null, null, null, false, false, null, null, null, null, 1022, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -257, -1, -1, 16383, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU();
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU();
                function02 = onBackClicked;
                composer2 = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, ComposableLambda3.rememberComposableLambda(1317951184, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownComposableKt.AdvisoryPortfolioRevealAssetBreakdownComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i7) {
                        if ((i7 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1317951184, i7, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownComposable.<anonymous> (AdvisoryPortfolioRevealAssetBreakdownComposable.kt:123)");
                        }
                        Function2<Composer, Integer, Unit> function2M11095getLambda$274774973$feature_advisory_onboarding_externalDebug = AdvisoryPortfolioRevealAssetBreakdownComposable3.INSTANCE.m11095getLambda$274774973$feature_advisory_onboarding_externalDebug();
                        final Function0<Unit> function03 = function02;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(958727791, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownComposableKt.AdvisoryPortfolioRevealAssetBreakdownComposable.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 6) == 0) {
                                    i8 |= (i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(958727791, i8, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownComposable.<anonymous>.<anonymous> (AdvisoryPortfolioRevealAssetBreakdownComposable.kt:126)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function03, composer4, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54);
                        final Function0<Unit> function04 = function0;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M11095getLambda$274774973$feature_advisory_onboarding_externalDebug, null, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-1072524818, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownComposableKt.AdvisoryPortfolioRevealAssetBreakdownComposable.1.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer4, Integer num) {
                                invoke(row5, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 BentoAppBar, Composer composer4, int i8) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 17) == 16 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1072524818, i8, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownComposable.<anonymous>.<anonymous> (AdvisoryPortfolioRevealAssetBreakdownComposable.kt:131)");
                                }
                                AdjustPortfolioButton.AdjustPortfolioButton(function04, null, composer4, 0, 2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, false, false, null, null, 0L, null, composer3, 3462, 0, 2034);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(-931830235, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownComposableKt.AdvisoryPortfolioRevealAssetBreakdownComposable.2
                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i7) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        int i8 = (i7 & 6) == 0 ? i7 | (composer3.changed(paddingValues) ? 4 : 2) : i7;
                        if ((i8 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-931830235, i8, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownComposable.<anonymous> (AdvisoryPortfolioRevealAssetBreakdownComposable.kt:138)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(PaddingKt.padding(ModifiersKt.logScreenTransitions(companion, new UserInteractionEventDescriptor(null, screen, null, context, null, null, 53, null)), paddingValues), 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        AssetClassBreakdownData assetClassBreakdownData = assetClassBreakdown;
                        Screen screen2 = screen;
                        Context context2 = context;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierVerticalScroll$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i9 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(assetClassBreakdownData.getTitle(), com.robinhood.compose.bento.util.PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, bentoTheme2.getSpacing(composer3, i9).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composer3, i9).m21593getSmallD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i9).getDisplayCapsuleMedium(), composer3, 0, 0, 8188);
                        BentoText2.m20747BentoText38GnDrw(assetClassBreakdownData.getSubtitle(), com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme2.getSpacing(composer3, i9).m21592getMediumD9Ej5fM(), 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i9).getTextM(), composer3, 0, 0, 8188);
                        composer3.startReplaceGroup(1828819417);
                        for (AssetClassBreakdownData.Row row : assetClassBreakdownData.getRows()) {
                            AdvisoryPortfolioRevealAssetBreakdownComposable.AssetClassAccordionRow(row, ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, screen2, null, context2, new Component(Component.ComponentType.ROW, row.getIdentifier(), null, 4, null), null, 37, null), true, false, false, true, false, null, 108, null), composer3, 0, 0);
                        }
                        composer3.endReplaceGroup();
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                        int i10 = BentoTheme.$stable;
                        BentoMarkdownText2.BentoMarkdownText(assetClassBreakdownData.getDisclosure(), com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion3, bentoTheme3.getSpacing(composer3, i10).m21592getMediumD9Ej5fM()), BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme3.getTypography(composer3, i10).getTextS(), 0, bentoTheme3.getColors(composer3, i10).m21426getFg20d7_KjU(), 0L, false, composer3, BentoMarkdownText.$stable << 15, 26), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 24);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composer2, ((i5 >> 15) & 14) | 805306416, 316);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function02 = onBackClicked;
                function0 = onAdjustPortfolioClicked;
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Function0<Unit> function03 = function0;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvisoryPortfolioRevealAssetBreakdownComposable.AdvisoryPortfolioRevealAssetBreakdownComposable$lambda$8(assetClassBreakdown, brokerageAccountType, source, function02, function03, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final Screen screen2 = new Screen(Screen.Name.ADVISORY_PORTFOLIO_REVEAL_REGION_DETAILS, null, assetClassBreakdown.getScreenIdentifier(), null, 10, null);
            int i52 = i3;
            function0 = onAdjustPortfolioClicked;
            final Context context2 = new Context(0, 0, 0, null, null, null, null, null, 0, null, source, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(brokerageAccountType), null, null, null, false, false, null, null, null, null, 1022, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -257, -1, -1, 16383, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            long jM21371getBg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU();
            long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU();
            function02 = onBackClicked;
            composer2 = composerStartRestartGroup;
            Modifier modifier52 = modifier4;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, ComposableLambda3.rememberComposableLambda(1317951184, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownComposableKt.AdvisoryPortfolioRevealAssetBreakdownComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i7) {
                    if ((i7 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1317951184, i7, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownComposable.<anonymous> (AdvisoryPortfolioRevealAssetBreakdownComposable.kt:123)");
                    }
                    Function2<Composer, Integer, Unit> function2M11095getLambda$274774973$feature_advisory_onboarding_externalDebug = AdvisoryPortfolioRevealAssetBreakdownComposable3.INSTANCE.m11095getLambda$274774973$feature_advisory_onboarding_externalDebug();
                    final Function0<Unit> function032 = function02;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(958727791, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownComposableKt.AdvisoryPortfolioRevealAssetBreakdownComposable.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                            invoke(bentoAppBarScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i8 & 6) == 0) {
                                i8 |= (i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(958727791, i8, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownComposable.<anonymous>.<anonymous> (AdvisoryPortfolioRevealAssetBreakdownComposable.kt:126)");
                            }
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function032, composer4, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54);
                    final Function0<Unit> function04 = function0;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M11095getLambda$274774973$feature_advisory_onboarding_externalDebug, null, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-1072524818, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownComposableKt.AdvisoryPortfolioRevealAssetBreakdownComposable.1.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer4, Integer num) {
                            invoke(row5, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Row5 BentoAppBar, Composer composer4, int i8) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i8 & 17) == 16 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1072524818, i8, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownComposable.<anonymous>.<anonymous> (AdvisoryPortfolioRevealAssetBreakdownComposable.kt:131)");
                            }
                            AdjustPortfolioButton.AdjustPortfolioButton(function04, null, composer4, 0, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, false, false, null, null, 0L, null, composer3, 3462, 0, 2034);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, jM21371getBg0d7_KjU2, jM21425getFg0d7_KjU2, null, ComposableLambda3.rememberComposableLambda(-931830235, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownComposableKt.AdvisoryPortfolioRevealAssetBreakdownComposable.2
                public final void invoke(PaddingValues paddingValues, Composer composer3, int i7) {
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    int i8 = (i7 & 6) == 0 ? i7 | (composer3.changed(paddingValues) ? 4 : 2) : i7;
                    if ((i8 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-931830235, i8, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownComposable.<anonymous> (AdvisoryPortfolioRevealAssetBreakdownComposable.kt:138)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(PaddingKt.padding(ModifiersKt.logScreenTransitions(companion, new UserInteractionEventDescriptor(null, screen2, null, context2, null, null, 53, null)), paddingValues), 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    AssetClassBreakdownData assetClassBreakdownData = assetClassBreakdown;
                    Screen screen22 = screen2;
                    Context context22 = context2;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierVerticalScroll$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                    int i9 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(assetClassBreakdownData.getTitle(), com.robinhood.compose.bento.util.PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, bentoTheme22.getSpacing(composer3, i9).m21590getDefaultD9Ej5fM(), bentoTheme22.getSpacing(composer3, i9).m21593getSmallD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composer3, i9).getDisplayCapsuleMedium(), composer3, 0, 0, 8188);
                    BentoText2.m20747BentoText38GnDrw(assetClassBreakdownData.getSubtitle(), com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme22.getSpacing(composer3, i9).m21592getMediumD9Ej5fM(), 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composer3, i9).getTextM(), composer3, 0, 0, 8188);
                    composer3.startReplaceGroup(1828819417);
                    for (AssetClassBreakdownData.Row row : assetClassBreakdownData.getRows()) {
                        AdvisoryPortfolioRevealAssetBreakdownComposable.AssetClassAccordionRow(row, ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, screen22, null, context22, new Component(Component.ComponentType.ROW, row.getIdentifier(), null, 4, null), null, 37, null), true, false, false, true, false, null, 108, null), composer3, 0, 0);
                    }
                    composer3.endReplaceGroup();
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                    int i10 = BentoTheme.$stable;
                    BentoMarkdownText2.BentoMarkdownText(assetClassBreakdownData.getDisclosure(), com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion3, bentoTheme3.getSpacing(composer3, i10).m21592getMediumD9Ej5fM()), BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme3.getTypography(composer3, i10).getTextS(), 0, bentoTheme3.getColors(composer3, i10).m21426getFg20d7_KjU(), 0L, false, composer3, BentoMarkdownText.$stable << 15, 26), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 24);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composer2, ((i52 >> 15) & 14) | 805306416, 316);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-349516146);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-349516146, i, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.Preview (AdvisoryPortfolioRevealAssetBreakdownComposable.kt:200)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, Boolean.TRUE, null, null, AdvisoryPortfolioRevealAssetBreakdownComposable3.INSTANCE.m11094getLambda$2099927082$feature_advisory_onboarding_externalDebug(), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvisoryPortfolioRevealAssetBreakdownComposable.Preview$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

package com.robinhood.android.advisory.tlh.gnl;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Rotate;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.robinhood.android.advisory.tlh.C9369R;
import com.robinhood.android.advisory.tlh.Components2;
import com.robinhood.android.advisory.tlh.gnl.GainsAndLossesSectionKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoChip;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.advisory.p304db.tlh.TaxGainsAndLossesResponse;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestDashboard;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GainsAndLossesSection.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0006\u001aC\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0013²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002²\u0006\f\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u008a\u008e\u0002²\u0006\n\u0010\u001a\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u0010\u001b\u001a\u00020\u0015X\u008a\u008e\u0002"}, m3636d2 = {"GnlSection", "", "section", "Lcom/robinhood/models/advisory/db/tlh/TaxGainsAndLossesResponse$Section;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/advisory/db/tlh/TaxGainsAndLossesResponse$Section;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "GainsAndLossesMainSection", ResourceTypes.STYLE, "Lcom/robinhood/android/advisory/tlh/gnl/GainsAndLossesStyle;", "viewState", "Lcom/robinhood/android/advisory/tlh/gnl/GainsAndLossesViewState;", "onExitClicked", "Lkotlin/Function0;", "headerData", "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestDashboard$GainsAndLossesSectionHeader;", "(Lcom/robinhood/android/advisory/tlh/gnl/GainsAndLossesStyle;Lcom/robinhood/android/advisory/tlh/gnl/GainsAndLossesViewState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestDashboard$GainsAndLossesSectionHeader;Landroidx/compose/runtime/Composer;II)V", "GainsAndLossesSectionPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-tax-loss-harvesting_externalDebug", "expanded", "", "rotation", "", "activeAccountNumber", "", "accountSwitcherBottomSheetOpen", "aboutBottomSheetOpen"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class GainsAndLossesSectionKt {

    /* compiled from: GainsAndLossesSection.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GainsAndLossesStyle.values().length];
            try {
                iArr[GainsAndLossesStyle.FULL_PAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GainsAndLossesStyle.DASHBOARD_SECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GainsAndLossesMainSection$lambda$38(GainsAndLossesStyle gainsAndLossesStyle, GainsAndLossesViewState gainsAndLossesViewState, Modifier modifier, Function0 function0, TaxLossHarvestDashboard.GainsAndLossesSectionHeader gainsAndLossesSectionHeader, int i, int i2, Composer composer, int i3) {
        GainsAndLossesMainSection(gainsAndLossesStyle, gainsAndLossesViewState, modifier, function0, gainsAndLossesSectionHeader, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GainsAndLossesSectionPreview$lambda$39(int i, Composer composer, int i2) {
        GainsAndLossesSectionPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GnlSection$lambda$7(TaxGainsAndLossesResponse.Section section, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GnlSection(section, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void GnlSection(final TaxGainsAndLossesResponse.Section section, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        Composer composer2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1598891753);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(section) ? 4 : 2);
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
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1598891753, i3, -1, "com.robinhood.android.advisory.tlh.gnl.GnlSection (GainsAndLossesSection.kt:61)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                final SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(!GnlSection$lambda$1(snapshotState) ? 180.0f : 360.0f, null, 0.0f, "gnl_row_expansion_anim", null, composer2, 3072, 22);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifier3);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                composer2.startReplaceGroup(5004770);
                objRememberedValue2 = composer2.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesSectionKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GainsAndLossesSectionKt.GnlSection$lambda$6$lambda$5$lambda$4(snapshotState);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                Modifier modifier4 = modifier3;
                BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(companion3, false, null, null, (Function0) objRememberedValue2, 7, null), null, null, ComposableLambda3.rememberComposableLambda(-744361764, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesSectionKt$GnlSection$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-744361764, i5, -1, "com.robinhood.android.advisory.tlh.gnl.GnlSection.<anonymous>.<anonymous> (GainsAndLossesSection.kt:76)");
                        }
                        BentoText2.m20747BentoText38GnDrw(section.getTitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), null, ComposableLambda3.rememberComposableLambda(158558814, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesSectionKt$GnlSection$1$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(158558814, i5, -1, "com.robinhood.android.advisory.tlh.gnl.GnlSection.<anonymous>.<anonymous> (GainsAndLossesSection.kt:81)");
                        }
                        BentoText2.m20747BentoText38GnDrw(section.getAmount(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), ComposableLambda3.rememberComposableLambda(-1537464545, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesSectionKt$GnlSection$1$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1537464545, i5, -1, "com.robinhood.android.advisory.tlh.gnl.GnlSection.<anonymous>.<anonymous> (GainsAndLossesSection.kt:86)");
                        }
                        IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(ServerToBentoAssetMapper2.CARET_DOWN_16.getResourceId(), composer3, 0), "Caret", Rotate.rotate(Modifier.INSTANCE, GainsAndLossesSectionKt.GnlSection$lambda$3(snapshotState4AnimateFloatAsState)), BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21427getFg30d7_KjU(), composer3, 48, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), true, false, false, null, composer2, 14355456, 0, 1814);
                AnimatedVisibilityKt.AnimatedVisibility(column6, GnlSection$lambda$1(snapshotState), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(-1265557961, true, new GainsAndLossesSectionKt$GnlSection$1$5(section, snapshotState), composer2, 54), composer2, 1572870, 30);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesSectionKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GainsAndLossesSectionKt.GnlSection$lambda$7(section, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            final SnapshotState4<Float> snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(!GnlSection$lambda$1(snapshotState2) ? 180.0f : 360.0f, null, 0.0f, "gnl_row_expansion_anim", null, composer2, 3072, 22);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifier3);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composer2.getApplier() == null) {
            }
            composer2.startReusableNode();
            if (!composer2.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                composer2.startReplaceGroup(5004770);
                objRememberedValue2 = composer2.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                composer2.endReplaceGroup();
                Modifier modifier42 = modifier3;
                BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(companion32, false, null, null, (Function0) objRememberedValue2, 7, null), null, null, ComposableLambda3.rememberComposableLambda(-744361764, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesSectionKt$GnlSection$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-744361764, i5, -1, "com.robinhood.android.advisory.tlh.gnl.GnlSection.<anonymous>.<anonymous> (GainsAndLossesSection.kt:76)");
                        }
                        BentoText2.m20747BentoText38GnDrw(section.getTitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), null, ComposableLambda3.rememberComposableLambda(158558814, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesSectionKt$GnlSection$1$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(158558814, i5, -1, "com.robinhood.android.advisory.tlh.gnl.GnlSection.<anonymous>.<anonymous> (GainsAndLossesSection.kt:81)");
                        }
                        BentoText2.m20747BentoText38GnDrw(section.getAmount(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), ComposableLambda3.rememberComposableLambda(-1537464545, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesSectionKt$GnlSection$1$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1537464545, i5, -1, "com.robinhood.android.advisory.tlh.gnl.GnlSection.<anonymous>.<anonymous> (GainsAndLossesSection.kt:86)");
                        }
                        IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(ServerToBentoAssetMapper2.CARET_DOWN_16.getResourceId(), composer3, 0), "Caret", Rotate.rotate(Modifier.INSTANCE, GainsAndLossesSectionKt.GnlSection$lambda$3(snapshotState4AnimateFloatAsState2)), BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21427getFg30d7_KjU(), composer3, 48, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), true, false, false, null, composer2, 14355456, 0, 1814);
                AnimatedVisibilityKt.AnimatedVisibility(column62, GnlSection$lambda$1(snapshotState2), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(-1265557961, true, new GainsAndLossesSectionKt$GnlSection$1$5(section, snapshotState2), composer2, 54), composer2, 1572870, 30);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GnlSection$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GnlSection$lambda$6$lambda$5$lambda$4(SnapshotState snapshotState) {
        GnlSection$lambda$2(snapshotState, !GnlSection$lambda$1(snapshotState));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String GainsAndLossesMainSection$lambda$12(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean GainsAndLossesMainSection$lambda$15(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean GainsAndLossesMainSection$lambda$18(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean GnlSection$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float GnlSection$lambda$3(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* compiled from: GainsAndLossesSection.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesSectionKt$GainsAndLossesMainSection$5 */
    static final class C94225 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<Boolean> $accountSwitcherBottomSheetOpen$delegate;
        final /* synthetic */ SnapshotState<String> $activeAccountNumber$delegate;
        final /* synthetic */ GainsAndLossesViewState $viewState;

        C94225(GainsAndLossesViewState gainsAndLossesViewState, SnapshotState<String> snapshotState, SnapshotState<Boolean> snapshotState2) {
            this.$viewState = gainsAndLossesViewState;
            this.$activeAccountNumber$delegate = snapshotState;
            this.$accountSwitcherBottomSheetOpen$delegate = snapshotState2;
        }

        public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
            final SnapshotState<Boolean> snapshotState;
            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-745567524, i, -1, "com.robinhood.android.advisory.tlh.gnl.GainsAndLossesMainSection.<anonymous> (GainsAndLossesSection.kt:316)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 1, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            GainsAndLossesViewState gainsAndLossesViewState = this.$viewState;
            SnapshotState<String> snapshotState2 = this.$activeAccountNumber$delegate;
            SnapshotState<Boolean> snapshotState3 = this.$accountSwitcherBottomSheetOpen$delegate;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            SnapshotState<String> snapshotState4 = snapshotState2;
            SnapshotState<Boolean> snapshotState5 = snapshotState3;
            boolean z = true;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C9369R.string.gains_and_losses_account_switcher_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8190);
            TaxGainsAndLossesResponse response = gainsAndLossesViewState.getResponse();
            List<TaxGainsAndLossesResponse.AccountSnapshot> accountSnapshots = response != null ? response.getAccountSnapshots() : null;
            composer.startReplaceGroup(-2015395939);
            if (accountSnapshots != null) {
                for (final TaxGainsAndLossesResponse.AccountSnapshot accountSnapshot : accountSnapshots) {
                    BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                    String accountDisplayName = accountSnapshot.getAccountDisplayName();
                    boolean zAreEqual = Intrinsics.areEqual(accountSnapshot.getAccountNumber(), GainsAndLossesSectionKt.GainsAndLossesMainSection$lambda$12(snapshotState4));
                    BentoSelectionRowState.IconPosition.Leading leading = new BentoSelectionRowState.IconPosition.Leading(ComposableLambda3.rememberComposableLambda(-1863492766, z, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesSectionKt$GainsAndLossesMainSection$5$1$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i3) {
                            if ((i3 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1863492766, i3, -1, "com.robinhood.android.advisory.tlh.gnl.GainsAndLossesMainSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GainsAndLossesSection.kt:334)");
                            }
                            ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(accountSnapshot.getAccountIcon());
                            if (serverToBentoAssetMapper2FromServerValue == null) {
                                serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.ROBINHOOD_24;
                            }
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(serverToBentoAssetMapper2FromServerValue), null, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU(), null, null, false, composer2, BentoIcon4.Size24.$stable | 48, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54));
                    composer.startReplaceGroup(-1746271574);
                    final SnapshotState<String> snapshotState6 = snapshotState4;
                    boolean zChanged = composer.changed(snapshotState6) | composer.changedInstance(accountSnapshot);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        snapshotState = snapshotState5;
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesSectionKt$GainsAndLossesMainSection$5$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return GainsAndLossesSectionKt.C94225.invoke$lambda$7$lambda$2$lambda$1$lambda$0(accountSnapshot, snapshotState6, snapshotState);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    } else {
                        snapshotState = snapshotState5;
                    }
                    composer.endReplaceGroup();
                    snapshotState4 = snapshotState6;
                    BentoSelectionRow2.BentoSelectionRow(null, type2, accountDisplayName, zAreEqual, null, false, leading, false, false, false, (Function0) objRememberedValue, composer, (BentoSelectionRowState.IconPosition.Leading.$stable << 18) | 48, 0, 945);
                    snapshotState5 = snapshotState;
                    z = true;
                }
            }
            final SnapshotState<String> snapshotState7 = snapshotState4;
            final SnapshotState<Boolean> snapshotState8 = snapshotState5;
            composer.endReplaceGroup();
            BentoSelectionRowState.Type type3 = BentoSelectionRowState.Type.RadioButton;
            String strStringResource = StringResources_androidKt.stringResource(C9369R.string.gains_and_losses_all_accounts, composer, 0);
            boolean z2 = GainsAndLossesSectionKt.GainsAndLossesMainSection$lambda$12(snapshotState7) == null;
            BentoSelectionRowState.IconPosition.Leading leading2 = new BentoSelectionRowState.IconPosition.Leading(ComposableSingletons$GainsAndLossesSectionKt.INSTANCE.m11279getLambda$103388291$feature_tax_loss_harvesting_externalDebug());
            composer.startReplaceGroup(-1633490746);
            boolean zChanged2 = composer.changed(snapshotState7);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesSectionKt$GainsAndLossesMainSection$5$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GainsAndLossesSectionKt.C94225.invoke$lambda$7$lambda$4$lambda$3(snapshotState7, snapshotState8);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoSelectionRow2.BentoSelectionRow(null, type3, strStringResource, z2, null, false, leading2, false, false, false, (Function0) objRememberedValue2, composer, (BentoSelectionRowState.IconPosition.Leading.$stable << 18) | 48, 0, 945);
            Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            String strStringResource2 = StringResources_androidKt.stringResource(C9369R.string.gains_and_losses_account_switcher_close, composer, 0);
            BentoButtons.Type type4 = BentoButtons.Type.Primary;
            composer.startReplaceGroup(5004770);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesSectionKt$GainsAndLossesMainSection$5$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GainsAndLossesSectionKt.C94225.invoke$lambda$7$lambda$6$lambda$5(snapshotState8);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue3, strStringResource2, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, type4, false, false, null, null, null, null, false, null, composer, 24582, 0, 8168);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
            invoke(rhModalBottomSheet5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$2$lambda$1$lambda$0(TaxGainsAndLossesResponse.AccountSnapshot accountSnapshot, SnapshotState snapshotState, SnapshotState snapshotState2) {
            GainsAndLossesSectionKt.GainsAndLossesMainSection$lambda$13(snapshotState, accountSnapshot.getAccountNumber());
            GainsAndLossesSectionKt.GainsAndLossesMainSection$lambda$16(snapshotState2, false);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$4$lambda$3(SnapshotState snapshotState, SnapshotState snapshotState2) {
            GainsAndLossesSectionKt.GainsAndLossesMainSection$lambda$13(snapshotState, null);
            GainsAndLossesSectionKt.GainsAndLossesMainSection$lambda$16(snapshotState2, false);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6$lambda$5(SnapshotState snapshotState) {
            GainsAndLossesSectionKt.GainsAndLossesMainSection$lambda$16(snapshotState, false);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GainsAndLossesMainSection$lambda$13(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0193 A[PHI: r8
      0x0193: PHI (r8v52 java.util.List<com.robinhood.models.advisory.db.tlh.TaxGainsAndLossesResponse$Section>) = 
      (r8v13 java.util.List<com.robinhood.models.advisory.db.tlh.TaxGainsAndLossesResponse$Section>)
      (r8v54 java.util.List<com.robinhood.models.advisory.db.tlh.TaxGainsAndLossesResponse$Section>)
     binds: [B:110:0x019c, B:105:0x0190] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:285:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GainsAndLossesMainSection(final GainsAndLossesStyle style, final GainsAndLossesViewState viewState, Modifier modifier, Function0<Unit> function0, TaxLossHarvestDashboard.GainsAndLossesSectionHeader gainsAndLossesSectionHeader, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0<Unit> function02;
        int i5;
        TaxLossHarvestDashboard.GainsAndLossesSectionHeader gainsAndLossesSectionHeader2;
        Function0<Unit> function03;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        String strGainsAndLossesMainSection$lambda$12;
        List<TaxGainsAndLossesResponse.Section> list;
        List<TaxGainsAndLossesResponse.Section> aggregatedAccountsSections;
        TaxGainsAndLossesResponse response;
        TaxGainsAndLossesResponse.AccountSnapshot accountSnapshot;
        String accountDisplayName;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int i6;
        int i7;
        Modifier modifier3;
        SnapshotState snapshotState;
        SnapshotState snapshotState2;
        final SnapshotState snapshotState3;
        TaxGainsAndLossesResponse.GainsAndLossesFullScreenData fullScreenData;
        TaxGainsAndLossesResponse.GainsAndLossesFullScreenData fullScreenData2;
        int i8;
        Object objRememberedValue4;
        final SnapshotState snapshotState4;
        Function0<Unit> function04;
        TaxLossHarvestDashboard.BottomSheet bottomSheet;
        int i9;
        final Function0<Unit> function05;
        final TaxLossHarvestDashboard.GainsAndLossesSectionHeader gainsAndLossesSectionHeader3;
        final Modifier modifier4;
        List<TaxGainsAndLossesResponse.AccountSnapshot> accountSnapshots;
        Object next;
        List<TaxGainsAndLossesResponse.AccountSnapshot> accountSnapshots2;
        Object next2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(207343591);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(style.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(viewState) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        gainsAndLossesSectionHeader2 = gainsAndLossesSectionHeader;
                        i3 |= composerStartRestartGroup.changedInstance(gainsAndLossesSectionHeader2) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier5 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i4 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesSectionKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function03 = (Function0) objRememberedValue5;
                        } else {
                            function03 = function02;
                        }
                        TaxLossHarvestDashboard.GainsAndLossesSectionHeader gainsAndLossesSectionHeader4 = i5 == 0 ? null : gainsAndLossesSectionHeader2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(207343591, i3, -1, "com.robinhood.android.advisory.tlh.gnl.GainsAndLossesMainSection (GainsAndLossesSection.kt:156)");
                        }
                        Object[] objArr = new Object[0];
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesSectionKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return GainsAndLossesSectionKt.GainsAndLossesMainSection$lambda$11$lambda$10();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        SnapshotState snapshotState5 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        SnapshotState snapshotState6 = (SnapshotState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        SnapshotState snapshotState7 = (SnapshotState) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        strGainsAndLossesMainSection$lambda$12 = GainsAndLossesMainSection$lambda$12(snapshotState5);
                        if (strGainsAndLossesMainSection$lambda$12 == null) {
                            TaxGainsAndLossesResponse response2 = viewState.getResponse();
                            if (response2 != null) {
                                aggregatedAccountsSections = response2.getAggregatedAccountsSections();
                                list = aggregatedAccountsSections;
                                response = viewState.getResponse();
                                if (response == null || (accountSnapshots = response.getAccountSnapshots()) == null) {
                                    accountSnapshot = null;
                                } else {
                                    Iterator<T> it = accountSnapshots.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            next = null;
                                            break;
                                        } else {
                                            next = it.next();
                                            if (Intrinsics.areEqual(((TaxGainsAndLossesResponse.AccountSnapshot) next).getAccountNumber(), GainsAndLossesMainSection$lambda$12(snapshotState5))) {
                                                break;
                                            }
                                        }
                                    }
                                    accountSnapshot = (TaxGainsAndLossesResponse.AccountSnapshot) next;
                                }
                                accountDisplayName = accountSnapshot == null ? accountSnapshot.getAccountDisplayName() : null;
                                Arrangement arrangement = Arrangement.INSTANCE;
                                Arrangement.Vertical top = arrangement.getTop();
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.useNode();
                                } else {
                                    composerStartRestartGroup.createNode(constructor);
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                composerStartRestartGroup.startReplaceGroup(505289689);
                                Modifier modifierVerticalScroll$default = style != GainsAndLossesStyle.FULL_PAGE ? ScrollKt.verticalScroll$default(Column5.weight$default(column6, Modifier.INSTANCE, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null) : Modifier.INSTANCE;
                                composerStartRestartGroup.endReplaceGroup();
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.useNode();
                                } else {
                                    composerStartRestartGroup.createNode(constructor2);
                                }
                                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                i6 = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
                                if (i6 != 1) {
                                    i7 = i3;
                                    modifier3 = modifier5;
                                    snapshotState = snapshotState6;
                                    snapshotState2 = snapshotState5;
                                    snapshotState3 = snapshotState7;
                                    composerStartRestartGroup.startReplaceGroup(88162611);
                                    TaxGainsAndLossesResponse response3 = viewState.getResponse();
                                    String screenTitle = (response3 == null || (fullScreenData2 = response3.getFullScreenData()) == null) ? null : fullScreenData2.getScreenTitle();
                                    composerStartRestartGroup.startReplaceGroup(-135701095);
                                    if (screenTitle == null) {
                                        screenTitle = StringResources_androidKt.stringResource(C9369R.string.gains_and_losses_title, composerStartRestartGroup, 0);
                                    }
                                    String str = screenTitle;
                                    composerStartRestartGroup.endReplaceGroup();
                                    TaxGainsAndLossesResponse response4 = viewState.getResponse();
                                    String screenSubtitle = (response4 == null || (fullScreenData = response4.getFullScreenData()) == null) ? null : fullScreenData.getScreenSubtitle();
                                    composerStartRestartGroup.startReplaceGroup(-135695873);
                                    if (screenSubtitle == null) {
                                        screenSubtitle = StringResources_androidKt.stringResource(C9369R.string.gains_and_losses_subtitle, composerStartRestartGroup, 0);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    Components2.TaxLossHarvestingScreenHeader(str, screenSubtitle, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 7, null), false, composerStartRestartGroup, 0, 8);
                                    composerStartRestartGroup.endReplaceGroup();
                                    Unit unit = Unit.INSTANCE;
                                } else {
                                    if (i6 != 2) {
                                        composerStartRestartGroup.startReplaceGroup(-135704010);
                                        composerStartRestartGroup.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composerStartRestartGroup.startReplaceGroup(88802761);
                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i11 = BentoTheme.$stable;
                                    snapshotState = snapshotState6;
                                    Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i11).m21595getXsmallD9Ej5fM(), composerStartRestartGroup, 6, 1);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21622defaultHorizontalPaddingWMci_g0);
                                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                        composerStartRestartGroup.createNode(constructor3);
                                    } else {
                                        composerStartRestartGroup.useNode();
                                    }
                                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                                    Row6 row6 = Row6.INSTANCE;
                                    String title = gainsAndLossesSectionHeader4 != null ? gainsAndLossesSectionHeader4.getTitle() : null;
                                    composerStartRestartGroup.startReplaceGroup(714786074);
                                    if (title == null) {
                                        title = StringResources_androidKt.stringResource(C9369R.string.gains_and_losses_title, composerStartRestartGroup, 0);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    i7 = i3;
                                    modifier3 = modifier5;
                                    snapshotState3 = snapshotState7;
                                    snapshotState2 = snapshotState5;
                                    BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i11).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8190);
                                    composerStartRestartGroup = composerStartRestartGroup;
                                    composerStartRestartGroup.startReplaceGroup(714793101);
                                    if ((gainsAndLossesSectionHeader4 != null ? gainsAndLossesSectionHeader4.getInfoIcon() : null) != null && gainsAndLossesSectionHeader4.getBottomSheet() != null) {
                                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion4, bentoTheme.getSpacing(composerStartRestartGroup, i11).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                                        BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24);
                                        String strStringResource = StringResources_androidKt.stringResource(C9369R.string.gains_and_losses_info_icon_description, composerStartRestartGroup, 0);
                                        long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i11).m21426getFg20d7_KjU();
                                        composerStartRestartGroup.startReplaceGroup(5004770);
                                        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue6 = new Function0() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesSectionKt$$ExternalSyntheticLambda3
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return GainsAndLossesSectionKt.m1735x7edffa41(snapshotState3);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource, jM21426getFg20d7_KjU, modifierM5146paddingqDBjuR0$default, (Function0) objRememberedValue6, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 24576, 32);
                                        composerStartRestartGroup = composerStartRestartGroup;
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.endReplaceGroup();
                                    Unit unit2 = Unit.INSTANCE;
                                }
                                composerStartRestartGroup.startReplaceGroup(-135637434);
                                if (accountDisplayName != null) {
                                    i8 = 0;
                                    accountDisplayName = StringResources_androidKt.stringResource(C9369R.string.gains_and_losses_all_accounts, composerStartRestartGroup, 0);
                                } else {
                                    i8 = 0;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 6, i8);
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue4 != Composer.INSTANCE.getEmpty()) {
                                    snapshotState4 = snapshotState;
                                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesSectionKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return GainsAndLossesSectionKt.m1736xad443beb(snapshotState4);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                } else {
                                    snapshotState4 = snapshotState;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Composer composer2 = composerStartRestartGroup;
                                BentoChip.BentoDropdownChip((Function0) objRememberedValue4, modifierM21623defaultHorizontalPaddingrAjV9yQ, false, null, accountDisplayName, composer2, 6, 12);
                                composerStartRestartGroup = composer2;
                                composerStartRestartGroup.startReplaceGroup(-135629326);
                                if (list != null) {
                                    Iterator<T> it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        GnlSection((TaxGainsAndLossesResponse.Section) it2.next(), null, composerStartRestartGroup, 0, 2);
                                    }
                                    Unit unit3 = Unit.INSTANCE;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.startReplaceGroup(505378717);
                                if (style != GainsAndLossesStyle.FULL_PAGE) {
                                    Modifier.Companion companion5 = Modifier.INSTANCE;
                                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                    int i12 = BentoTheme.$stable;
                                    Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion5, bentoTheme2.getSpacing(composerStartRestartGroup, i12).m21590getDefaultD9Ej5fM());
                                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i12).m21590getDefaultD9Ej5fM()), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                                    int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
                                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                        composerStartRestartGroup.createNode(constructor4);
                                    } else {
                                        composerStartRestartGroup.useNode();
                                    }
                                    Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy3, companion6.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion6.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion6.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                        composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                        composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion6.getSetModifier());
                                    Column6 column62 = Column6.INSTANCE;
                                    String disclosureMarkdown = accountSnapshot != null ? accountSnapshot.getDisclosureMarkdown() : null;
                                    composerStartRestartGroup.startReplaceGroup(1114169534);
                                    if (disclosureMarkdown != null) {
                                        BentoMarkdownText2.BentoMarkdownText(disclosureMarkdown, SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), MarkdownStyle.m16260copyR0sFphs$default(BentoMarkdownText.INSTANCE.getStyle(composerStartRestartGroup, BentoMarkdownText.$stable), null, null, null, null, null, null, null, bentoTheme2.getColors(composerStartRestartGroup, i12).m21426getFg20d7_KjU(), null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), null, 1407, null), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, (MarkdownStyle.$stable << 6) | 48, 24);
                                        composerStartRestartGroup = composerStartRestartGroup;
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    Composer composer3 = composerStartRestartGroup;
                                    bottomSheet = null;
                                    Function0<Unit> function06 = function03;
                                    BentoButtonKt.m20586BentoButtonEikTQX8(function06, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composerStartRestartGroup, 0), SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), null, null, false, false, null, null, null, null, false, null, composer3, ((i7 >> 9) & 14) | 384, 0, 8184);
                                    function04 = function06;
                                    composerStartRestartGroup = composer3;
                                    composerStartRestartGroup.endNode();
                                } else {
                                    function04 = function03;
                                    bottomSheet = null;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.startReplaceGroup(1688854046);
                                if (GainsAndLossesMainSection$lambda$18(snapshotState3)) {
                                    TaxLossHarvestDashboard.BottomSheet bottomSheet2 = gainsAndLossesSectionHeader4 != null ? gainsAndLossesSectionHeader4.getBottomSheet() : bottomSheet;
                                    if (bottomSheet2 != null) {
                                        composerStartRestartGroup.startReplaceGroup(5004770);
                                        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue7 = new Function0() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesSectionKt$$ExternalSyntheticLambda5
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return GainsAndLossesSectionKt.GainsAndLossesMainSection$lambda$35$lambda$34$lambda$33(snapshotState3);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        i9 = 54;
                                        Composer composer4 = composerStartRestartGroup;
                                        RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue7, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(1977290692, true, new GainsAndLossesSectionKt$GainsAndLossesMainSection$3$2(bottomSheet2, snapshotState3), composerStartRestartGroup, 54), composer4, 1572870, 62);
                                        composerStartRestartGroup = composer4;
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    if (GainsAndLossesMainSection$lambda$15(snapshotState4)) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    function05 = function04;
                                    gainsAndLossesSectionHeader3 = gainsAndLossesSectionHeader4;
                                    modifier4 = modifier3;
                                } else {
                                    i9 = 54;
                                    composerStartRestartGroup.endReplaceGroup();
                                    if (GainsAndLossesMainSection$lambda$15(snapshotState4)) {
                                        composerStartRestartGroup.startReplaceGroup(5004770);
                                        Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue8 = new Function0() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesSectionKt$$ExternalSyntheticLambda6
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return GainsAndLossesSectionKt.GainsAndLossesMainSection$lambda$37$lambda$36(snapshotState4);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        Composer composer5 = composerStartRestartGroup;
                                        RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue8, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-745567524, true, new C94225(viewState, snapshotState2, snapshotState4), composerStartRestartGroup, i9), composer5, 1572870, 62);
                                        composerStartRestartGroup = composer5;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    function05 = function04;
                                    gainsAndLossesSectionHeader3 = gainsAndLossesSectionHeader4;
                                    modifier4 = modifier3;
                                }
                            } else {
                                list = null;
                                response = viewState.getResponse();
                                if (response == null) {
                                    accountSnapshot = null;
                                    if (accountSnapshot == null) {
                                    }
                                    Arrangement arrangement2 = Arrangement.INSTANCE;
                                    Arrangement.Vertical top2 = arrangement2.getTop();
                                    Alignment.Companion companion22 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
                                    ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor5 = companion32.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy4, companion32.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap5, companion32.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl.getInserting()) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier5, companion32.getSetModifier());
                                        Column6 column63 = Column6.INSTANCE;
                                        composerStartRestartGroup.startReplaceGroup(505289689);
                                        if (style != GainsAndLossesStyle.FULL_PAGE) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getStart(), composerStartRestartGroup, 0);
                                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                                        Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                                        if (composerStartRestartGroup.getApplier() == null) {
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (composerStartRestartGroup.getInserting()) {
                                        }
                                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                                        if (!composerM6388constructorimpl2.getInserting()) {
                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                                            i6 = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
                                            if (i6 != 1) {
                                            }
                                            composerStartRestartGroup.startReplaceGroup(-135637434);
                                            if (accountDisplayName != null) {
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 6, i8);
                                            composerStartRestartGroup.startReplaceGroup(5004770);
                                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue4 != Composer.INSTANCE.getEmpty()) {
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            Composer composer22 = composerStartRestartGroup;
                                            BentoChip.BentoDropdownChip((Function0) objRememberedValue4, modifierM21623defaultHorizontalPaddingrAjV9yQ2, false, null, accountDisplayName, composer22, 6, 12);
                                            composerStartRestartGroup = composer22;
                                            composerStartRestartGroup.startReplaceGroup(-135629326);
                                            if (list != null) {
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            composerStartRestartGroup.endNode();
                                            composerStartRestartGroup.startReplaceGroup(505378717);
                                            if (style != GainsAndLossesStyle.FULL_PAGE) {
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            composerStartRestartGroup.endNode();
                                            composerStartRestartGroup.startReplaceGroup(1688854046);
                                            if (GainsAndLossesMainSection$lambda$18(snapshotState3)) {
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            TaxGainsAndLossesResponse response5 = viewState.getResponse();
                            if (response5 == null || (accountSnapshots2 = response5.getAccountSnapshots()) == null) {
                                aggregatedAccountsSections = null;
                                if (aggregatedAccountsSections == null) {
                                    list = aggregatedAccountsSections;
                                    response = viewState.getResponse();
                                    if (response == null) {
                                    }
                                }
                            } else {
                                Iterator<T> it3 = accountSnapshots2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        next2 = null;
                                        break;
                                    } else {
                                        next2 = it3.next();
                                        if (Intrinsics.areEqual(((TaxGainsAndLossesResponse.AccountSnapshot) next2).getAccountNumber(), strGainsAndLossesMainSection$lambda$12)) {
                                            break;
                                        }
                                    }
                                }
                                TaxGainsAndLossesResponse.AccountSnapshot accountSnapshot2 = (TaxGainsAndLossesResponse.AccountSnapshot) next2;
                                if (accountSnapshot2 != null) {
                                    aggregatedAccountsSections = accountSnapshot2.getSections();
                                }
                                if (aggregatedAccountsSections == null) {
                                }
                            }
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        function05 = function02;
                        gainsAndLossesSectionHeader3 = gainsAndLossesSectionHeader2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesSectionKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return GainsAndLossesSectionKt.GainsAndLossesMainSection$lambda$38(style, viewState, modifier4, function05, gainsAndLossesSectionHeader3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                gainsAndLossesSectionHeader2 = gainsAndLossesSectionHeader;
                if ((i3 & 9363) == 9362) {
                    if (i10 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
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
                    SnapshotState snapshotState52 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    SnapshotState snapshotState62 = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                    }
                    SnapshotState snapshotState72 = (SnapshotState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    strGainsAndLossesMainSection$lambda$12 = GainsAndLossesMainSection$lambda$12(snapshotState52);
                    if (strGainsAndLossesMainSection$lambda$12 == null) {
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function02 = function0;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            gainsAndLossesSectionHeader2 = gainsAndLossesSectionHeader;
            if ((i3 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function02 = function0;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        gainsAndLossesSectionHeader2 = gainsAndLossesSectionHeader;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState GainsAndLossesMainSection$lambda$11$lambda$10() {
        return SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GainsAndLossesMainSection$lambda$16(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GainsAndLossesMainSection$lambda$19(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GainsAndLossesMainSection$lambda$32$lambda$29$lambda$25$lambda$24$lambda$23 */
    public static final Unit m1735x7edffa41(SnapshotState snapshotState) {
        GainsAndLossesMainSection$lambda$19(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GainsAndLossesMainSection$lambda$32$lambda$29$lambda$27$lambda$26 */
    public static final Unit m1736xad443beb(SnapshotState snapshotState) {
        GainsAndLossesMainSection$lambda$16(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GainsAndLossesMainSection$lambda$35$lambda$34$lambda$33(SnapshotState snapshotState) {
        GainsAndLossesMainSection$lambda$19(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GainsAndLossesMainSection$lambda$37$lambda$36(SnapshotState snapshotState) {
        GainsAndLossesMainSection$lambda$16(snapshotState, false);
        return Unit.INSTANCE;
    }

    private static final void GainsAndLossesSectionPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-935435468);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-935435468, i, -1, "com.robinhood.android.advisory.tlh.gnl.GainsAndLossesSectionPreview (GainsAndLossesSection.kt:387)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$GainsAndLossesSectionKt.INSTANCE.m11280getLambda$67570452$feature_tax_loss_harvesting_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesSectionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GainsAndLossesSectionKt.GainsAndLossesSectionPreview$lambda$39(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

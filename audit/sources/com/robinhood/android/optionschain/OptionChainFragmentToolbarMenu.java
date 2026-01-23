package com.robinhood.android.optionschain;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBar4;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionChainFragmentToolbarMenu.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aQ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"OptionChainFragmentToolbarMenu", "", "state", "Lcom/robinhood/android/optionschain/OptionChainToolbarMenuState;", "onClearButtonTapped", "Lkotlin/Function0;", "onSettingsIconTapped", "nuxRemainingBlinks", "", "onNuxBlinkComplete", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/optionschain/OptionChainToolbarMenuState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-options-chain_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.OptionChainFragmentToolbarMenuKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionChainFragmentToolbarMenu {

    /* compiled from: OptionChainFragmentToolbarMenu.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionschain.OptionChainFragmentToolbarMenuKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionChainViewState3.values().length];
            try {
                iArr[OptionChainViewState3.GEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionChainViewState3.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionChainFragmentToolbarMenu$lambda$6$lambda$1(OptionChainToolbarMenuState optionChainToolbarMenuState, Function0 function0, Function0 function02, int i, Function0 function03, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        OptionChainFragmentToolbarMenu(optionChainToolbarMenuState, function0, function02, i, function03, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionChainFragmentToolbarMenu$lambda$7(OptionChainToolbarMenuState optionChainToolbarMenuState, Function0 function0, Function0 function02, int i, Function0 function03, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        OptionChainFragmentToolbarMenu(optionChainToolbarMenuState, function0, function02, i, function03, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0212  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionChainFragmentToolbarMenu(final OptionChainToolbarMenuState state, final Function0<Unit> onClearButtonTapped, final Function0<Unit> onSettingsIconTapped, final int i, final Function0<Unit> onNuxBlinkComplete, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i6;
        Modifier modifier3;
        Composer composer2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer composer3;
        Composer composer4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClearButtonTapped, "onClearButtonTapped");
        Intrinsics.checkNotNullParameter(onSettingsIconTapped, "onSettingsIconTapped");
        Intrinsics.checkNotNullParameter(onNuxBlinkComplete, "onNuxBlinkComplete");
        Composer composerStartRestartGroup = composer.startRestartGroup(-382777656);
        int currentMarker = composerStartRestartGroup.getCurrentMarker();
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onClearButtonTapped) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onSettingsIconTapped) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onNuxBlinkComplete) ? 16384 : 8192;
            }
            i5 = i3 & 32;
            if (i5 != 0) {
                if ((196608 & i2) == 0) {
                    modifier2 = modifier;
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                }
                if ((74899 & i4) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-382777656, i4, -1, "com.robinhood.android.optionschain.OptionChainFragmentToolbarMenu (OptionChainFragmentToolbarMenu.kt:29)");
                    }
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-671709959);
                    composerStartRestartGroup.startReplaceGroup(1363803716);
                    if (state.getShowClearButton()) {
                        i6 = i4;
                        modifier3 = modifier5;
                        composer2 = composerStartRestartGroup;
                        i7 = currentMarker;
                        i8 = 1849434622;
                        i9 = 0;
                        i10 = 2;
                    } else {
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSource2.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        modifier3 = modifier5;
                        i6 = i4;
                        i9 = 0;
                        i10 = 2;
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(ClickableKt.m4891clickableO2vRcR0$default(companion2, (InteractionSource3) objRememberedValue, null, false, null, null, onClearButtonTapped, 28, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                        i7 = currentMarker;
                        i8 = 1849434622;
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C11048R.string.general_label_clear, composerStartRestartGroup, 0), modifierM5144paddingVpY3zN4$default, null, null, null, null, null, 0, false, 1, 0, null, 0, null, composerStartRestartGroup, 805306368, 0, 15868);
                        composer2 = composerStartRestartGroup;
                    }
                    composer2.endReplaceGroup();
                    i11 = WhenMappings.$EnumSwitchMapping$0[state.getChainSettingsIcon().ordinal()];
                    if (i11 == 1) {
                        if (i11 != i10) {
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.endToMarker(i7);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup2 != null) {
                            final Modifier modifier6 = modifier3;
                            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.OptionChainFragmentToolbarMenuKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return OptionChainFragmentToolbarMenu.OptionChainFragmentToolbarMenu$lambda$6$lambda$1(state, onClearButtonTapped, onSettingsIconTapped, i, onNuxBlinkComplete, modifier6, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.SETTINGS_24;
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    float fMo5012toDpu2uoSUM = density.mo5012toDpu2uoSUM(density.mo5016toPx0680j_4(OptionSideBySideChainTopAppBar4.getSbsNuxDotStrokeRadius()) * 1.3f);
                    composer2.startReplaceGroup(1363836492);
                    Modifier modifierDrawNuxDot = Modifier.INSTANCE;
                    if (state.getNuxDotOnSettingsIcon()) {
                        composer2.startReplaceGroup(447612162);
                        modifierDrawNuxDot = OptionSideBySideChainTopAppBar4.drawNuxDot(modifierDrawNuxDot, false, 0, null, composer2, 48, 6);
                        composer2.endReplaceGroup();
                        i12 = i9;
                        i13 = i8;
                        composer3 = composer2;
                    } else if (state.getBlinkNuxDotOnSettingsIcon()) {
                        composer2.startReplaceGroup(447619260);
                        int i14 = i6 >> 3;
                        i12 = i9;
                        i13 = i8;
                        Composer composer5 = composer2;
                        modifierDrawNuxDot = OptionSideBySideChainTopAppBar4.drawNuxDot(PaddingKt.m5146paddingqDBjuR0$default(modifierDrawNuxDot, 0.0f, fMo5012toDpu2uoSUM, fMo5012toDpu2uoSUM, fMo5012toDpu2uoSUM, 1, null), true, i, onNuxBlinkComplete, composer5, (i14 & 896) | 48 | (i14 & 7168), 0);
                        composer3 = composer5;
                        composer3.endReplaceGroup();
                    } else {
                        i12 = i9;
                        i13 = i8;
                        composer3 = composer2;
                        composer3.startReplaceGroup(447626733);
                        composer3.endReplaceGroup();
                    }
                    Modifier modifier7 = modifierDrawNuxDot;
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(i13);
                    Object objRememberedValue2 = composer3.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = InteractionSource2.MutableInteractionSource();
                        composer3.updateRememberedValue(objRememberedValue2);
                    }
                    composer3.endReplaceGroup();
                    Composer composer6 = composer3;
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(serverToBentoAssetMapper2), StringResources_androidKt.stringResource(C24135R.string.option_chain_settings_title_content_description, composer3, i12), BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU(), ClickableKt.m4891clickableO2vRcR0$default(modifier7, (InteractionSource3) objRememberedValue2, null, false, null, null, onSettingsIconTapped, 28, null), null, false, composer6, BentoIcon4.Size24.$stable, 48);
                    composer4 = composer6;
                    composer4.endReplaceGroup();
                    composer4.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    composer4 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.OptionChainFragmentToolbarMenuKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OptionChainFragmentToolbarMenu.OptionChainFragmentToolbarMenu$lambda$7(state, onClearButtonTapped, onSettingsIconTapped, i, onNuxBlinkComplete, modifier4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 196608;
            modifier2 = modifier;
            if ((74899 & i4) != 74898) {
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-671709959);
                    composerStartRestartGroup.startReplaceGroup(1363803716);
                    if (state.getShowClearButton()) {
                    }
                    composer2.endReplaceGroup();
                    i11 = WhenMappings.$EnumSwitchMapping$0[state.getChainSettingsIcon().ordinal()];
                    if (i11 == 1) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i3 & 16) == 0) {
        }
        i5 = i3 & 32;
        if (i5 != 0) {
        }
        modifier2 = modifier;
        if ((74899 & i4) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}

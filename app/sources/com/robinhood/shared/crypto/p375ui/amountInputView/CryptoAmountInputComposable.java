package com.robinhood.shared.crypto.p375ui.amountInputView;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.draw.Rotate;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.shared.crypto.p375ui.C38572R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: CryptoAmountInputComposable.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a_\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"CryptoAmountInputView", "", "amountText", "", "estimatedConversionAmount", "currencySymbol", "showCurrencyOnTop", "", "event", "Lcom/robinhood/compose/duxo/ComposeUiEvent;", "Lcom/robinhood/shared/crypto/ui/amountInputView/CryptoAmountInputEvent;", "onCurrencySwapModeClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "currencySwapEnabled", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/robinhood/compose/duxo/ComposeUiEvent;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "lib-crypto-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.amountInputView.CryptoAmountInputComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoAmountInputComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoAmountInputView$lambda$3(String str, String str2, String str3, boolean z, ComposeUiEvent composeUiEvent, Function0 function0, Modifier modifier, boolean z2, int i, int i2, Composer composer, int i3) {
        CryptoAmountInputView(str, str2, str3, z, composeUiEvent, function0, modifier, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoAmountInputView(final String amountText, final String estimatedConversionAmount, final String currencySymbol, final boolean z, final ComposeUiEvent<CryptoAmountInputEvent> composeUiEvent, final Function0<Unit> onCurrencySwapModeClick, Modifier modifier, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        Modifier modifier3;
        boolean z4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier modifier4;
        int i5;
        Composer composer2;
        int i6;
        Composer composer3;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer4;
        final boolean z5;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(amountText, "amountText");
        Intrinsics.checkNotNullParameter(estimatedConversionAmount, "estimatedConversionAmount");
        Intrinsics.checkNotNullParameter(currencySymbol, "currencySymbol");
        Intrinsics.checkNotNullParameter(onCurrencySwapModeClick, "onCurrencySwapModeClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1246403244);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(amountText) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(estimatedConversionAmount) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(currencySymbol) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(composeUiEvent) : composerStartRestartGroup.changedInstance(composeUiEvent) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCurrencySwapModeClick) ? 131072 : 65536;
        }
        int i7 = i2 & 64;
        if (i7 != 0) {
            i3 |= 1572864;
        } else {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 != 0) {
                if ((12582912 & i) == 0) {
                    z3 = z2;
                    i3 |= composerStartRestartGroup.changed(z3) ? 8388608 : 4194304;
                }
                if ((4793491 & i3) == 4793490 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier5 = modifier2;
                    z5 = z3;
                    composer4 = composerStartRestartGroup;
                } else {
                    modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    z4 = i4 == 0 ? true : z3;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1246403244, i3, -1, "com.robinhood.shared.crypto.ui.amountInputView.CryptoAmountInputView (CryptoAmountInputComposable.kt:43)");
                    }
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1008890424);
                    if (z || StringsKt.isBlank(currencySymbol)) {
                        modifier4 = modifier3;
                        i5 = i3;
                        composer2 = composerStartRestartGroup;
                        i6 = 1;
                    } else {
                        composer2 = composerStartRestartGroup;
                        i5 = i3;
                        modifier4 = modifier3;
                        i6 = 1;
                        BentoText2.m20747BentoText38GnDrw(currencySymbol, column6.align(Modifier.INSTANCE, companion.getCenterHorizontally()), null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getDisplayCapsuleMedium(), composer2, (i3 >> 6) & 14, 0, 8188);
                    }
                    composer2.endReplaceGroup();
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    composer3 = composer2;
                    CryptoTickerInputComposable2.TickerInputWrapper(amountText, composeUiEvent, SizeKt.fillMaxWidth$default(companion3, 0.0f, i6, null), composer3, (i5 & 14) | 384 | (ComposeUiEvent.$stable << 3) | ((i5 >> 9) & 112), 0);
                    Modifier modifierAlign = column6.align(companion3, companion.getCenterHorizontally());
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composer3, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierAlign);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.useNode();
                    } else {
                        composer3.createNode(constructor2);
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i8 = BentoTheme.$stable;
                    int i9 = i5 >> 3;
                    BentoText2.m20747BentoText38GnDrw(estimatedConversionAmount, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i8).getTextM(), composer3, i9 & 14, 0, 8190);
                    composer3.startReplaceGroup(-1687674902);
                    if (z4) {
                        composer4 = composer3;
                    } else {
                        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Clip.clip(PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme.getSpacing(composer3, i8).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(12))), bentoTheme.getColors(composer3, i8).m21372getBg20d7_KjU(), null, 2, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierM4872backgroundbw27NRU$default);
                        Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.TRANSFERS_16), StringResources_androidKt.stringResource(C38572R.string.switch_currency_input, composer3, 0), bentoTheme.getColors(composer3, i8).m21425getFg0d7_KjU(), PaddingKt.m5143paddingVpY3zN4(Rotate.rotate(companion3, 90.0f), bentoTheme.getSpacing(composer3, i8).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer3, i8).m21595getXsmallD9Ej5fM()), onCurrencySwapModeClick, true, composer3, BentoIcon4.Size16.$stable | 196608 | (i9 & 57344), 0);
                        composer4 = composer3;
                        composer4.endNode();
                    }
                    composer4.endReplaceGroup();
                    composer4.endNode();
                    composer4.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    modifier5 = modifier4;
                }
                scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.amountInputView.CryptoAmountInputComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoAmountInputComposable.CryptoAmountInputView$lambda$3(amountText, estimatedConversionAmount, currencySymbol, z, composeUiEvent, onCurrencySwapModeClick, modifier5, z5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 12582912;
            z3 = z2;
            if ((4793491 & i3) == 4793490) {
                if (i7 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Vertical top2 = arrangement2.getTop();
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1008890424);
                    if (z) {
                        modifier4 = modifier3;
                        i5 = i3;
                        composer2 = composerStartRestartGroup;
                        i6 = 1;
                        composer2.endReplaceGroup();
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        composer3 = composer2;
                        CryptoTickerInputComposable2.TickerInputWrapper(amountText, composeUiEvent, SizeKt.fillMaxWidth$default(companion32, 0.0f, i6, null), composer3, (i5 & 14) | 384 | (ComposeUiEvent.$stable << 3) | ((i5 >> 9) & 112), 0);
                        Modifier modifierAlign2 = column62.align(companion32, companion4.getCenterHorizontally());
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion4.getCenterVertically(), composer3, 48);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer3, modifierAlign2);
                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                        if (composer3.getApplier() == null) {
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                            Row6 row62 = Row6.INSTANCE;
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i82 = BentoTheme.$stable;
                            int i92 = i5 >> 3;
                            BentoText2.m20747BentoText38GnDrw(estimatedConversionAmount, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i82).getTextM(), composer3, i92 & 14, 0, 8190);
                            composer3.startReplaceGroup(-1687674902);
                            if (z4) {
                            }
                            composer4.endReplaceGroup();
                            composer4.endNode();
                            composer4.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z5 = z4;
                            modifier5 = modifier4;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 128;
        if (i4 != 0) {
        }
        z3 = z2;
        if ((4793491 & i3) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}

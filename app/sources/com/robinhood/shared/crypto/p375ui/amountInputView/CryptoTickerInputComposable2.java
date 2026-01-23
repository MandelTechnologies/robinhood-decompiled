package com.robinhood.shared.crypto.p375ui.amountInputView;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import com.robinhood.android.common.util.AnimationUtils;
import com.robinhood.android.font.C16915R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.shared.crypto.p375ui.amountInputView.CryptoAmountInputEvent;
import com.robinhood.shared.crypto.p375ui.tickerinputview.CryptoTickerInputView;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.p409ui.color.ThemeColors;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoTickerInputComposable.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a/\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u008e\u0002"}, m3636d2 = {"CryptoAmountInputComposable", "", "state", "Lcom/robinhood/shared/crypto/ui/amountInputView/CryptoAmountInputState;", "event", "Lcom/robinhood/compose/duxo/ComposeUiEvent;", "Lcom/robinhood/shared/crypto/ui/amountInputView/CryptoAmountInputEvent;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/crypto/ui/amountInputView/CryptoAmountInputState;Lcom/robinhood/compose/duxo/ComposeUiEvent;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TickerInputWrapper", "amountText", "", "(Ljava/lang/String;Lcom/robinhood/compose/duxo/ComposeUiEvent;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-crypto-ui_externalDebug", "previousInput", "shakeInput", "", "resetInput", "forceRedrawCounter", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.amountInputView.CryptoTickerInputComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoTickerInputComposable2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoAmountInputComposable$lambda$2(CryptoAmountInputState cryptoAmountInputState, ComposeUiEvent composeUiEvent, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoAmountInputComposable(cryptoAmountInputState, composeUiEvent, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TickerInputWrapper$lambda$15(String str, ComposeUiEvent composeUiEvent, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TickerInputWrapper(str, composeUiEvent, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TickerInputWrapper$lambda$23(String str, ComposeUiEvent composeUiEvent, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TickerInputWrapper(str, composeUiEvent, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoAmountInputComposable(final CryptoAmountInputState state, final ComposeUiEvent<CryptoAmountInputEvent> composeUiEvent, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier modifier3;
        Column6 column6;
        String subtitle;
        Composer composer2;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1757209345);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(composeUiEvent) : composerStartRestartGroup.changedInstance(composeUiEvent) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1757209345, i3, -1, "com.robinhood.shared.crypto.ui.amountInputView.CryptoAmountInputComposable (CryptoTickerInputComposable.kt:33)");
                }
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                if (!state.getLoading()) {
                    composerStartRestartGroup.startReplaceGroup(1761005178);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(column62.align(companion3, companion.getCenterHorizontally()), true, null, 2, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    modifier3 = modifier5;
                    BentoText2.m20747BentoText38GnDrw(" 0 ", modifierBentoPlaceholder$default, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getBookCoverCapsuleLarge(), composerStartRestartGroup, 6, 0, 8188);
                    composerStartRestartGroup = composerStartRestartGroup;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    column6 = column62;
                } else {
                    modifier3 = modifier5;
                    composerStartRestartGroup.startReplaceGroup(1761350704);
                    column6 = column62;
                    TickerInputWrapper(state.getAmountText(), composeUiEvent, null, composerStartRestartGroup, (ComposeUiEvent.$stable << 3) | (i3 & 112), 4);
                    composerStartRestartGroup.endReplaceGroup();
                }
                subtitle = state.getSubtitle();
                composerStartRestartGroup.startReplaceGroup(1580843729);
                if (subtitle != null) {
                    composer2 = composerStartRestartGroup;
                } else {
                    Modifier modifierBentoPlaceholder$default2 = ModifiersKt.bentoPlaceholder$default(column6.align(Modifier.INSTANCE, companion.getCenterHorizontally()), state.getLoading(), null, 2, null);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(subtitle, modifierBentoPlaceholder$default2, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i6).getTextM(), composer2, 0, 0, 8184);
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.amountInputView.CryptoTickerInputComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoTickerInputComposable2.CryptoAmountInputComposable$lambda$2(state, composeUiEvent, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                Column6 column622 = Column6.INSTANCE;
                if (!state.getLoading()) {
                }
                subtitle = state.getSubtitle();
                composerStartRestartGroup.startReplaceGroup(1580843729);
                if (subtitle != null) {
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TickerInputWrapper(final String amountText, final ComposeUiEvent<CryptoAmountInputEvent> composeUiEvent, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Object objRememberedValue4;
        Object obj;
        final SnapshotIntState2 snapshotIntState2;
        final SnapshotState snapshotState;
        SnapshotState snapshotState2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(amountText, "amountText");
        Composer composerStartRestartGroup = composer.startRestartGroup(1313485889);
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
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(composeUiEvent) : composerStartRestartGroup.changedInstance(composeUiEvent) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i3;
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1313485889, i4, -1, "com.robinhood.shared.crypto.ui.amountInputView.TickerInputWrapper (CryptoTickerInputComposable.kt:74)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default("", null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final SnapshotState snapshotState4 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                SnapshotState snapshotState5 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotIntState3.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                if (!((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                    composerStartRestartGroup.startReplaceGroup(-1387969403);
                    final Modifier modifier5 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(amountText, PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier4, 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getBookCoverCapsuleLarge(), composerStartRestartGroup, i4 & 14, 0, 8124);
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.amountInputView.CryptoTickerInputComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return CryptoTickerInputComposable2.TickerInputWrapper$lambda$15(amountText, composeUiEvent, modifier5, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                Modifier modifier6 = modifier4;
                composerStartRestartGroup.startReplaceGroup(-1387546749);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i6 = i4 & 14;
                boolean z = i6 == 4;
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.shared.crypto.ui.amountInputView.CryptoTickerInputComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return CryptoTickerInputComposable2.TickerInputWrapper$lambda$18$lambda$17(amountText, snapshotState3, (Context) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                Function1 function1 = (Function1) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean z2 = i6 == 4;
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue6 == companion.getEmpty()) {
                    snapshotIntState2 = snapshotIntState22;
                    snapshotState = snapshotState5;
                    obj = new Function1() { // from class: com.robinhood.shared.crypto.ui.amountInputView.CryptoTickerInputComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return CryptoTickerInputComposable2.TickerInputWrapper$lambda$21$lambda$20(amountText, snapshotIntState2, snapshotState, snapshotState3, snapshotState4, (CryptoTickerInputView) obj2);
                        }
                    };
                    snapshotState2 = snapshotState4;
                    composerStartRestartGroup.updateRememberedValue(obj);
                } else {
                    obj = objRememberedValue6;
                    snapshotIntState2 = snapshotIntState22;
                    snapshotState2 = snapshotState4;
                    snapshotState = snapshotState5;
                }
                composerStartRestartGroup.endReplaceGroup();
                AndroidView_androidKt.AndroidView(function1, modifier6, (Function1) obj, composerStartRestartGroup, (i4 >> 3) & 112, 0);
                CryptoAmountInputEvent cryptoAmountInputEventConsume = composeUiEvent != null ? composeUiEvent.consume() : null;
                if (Intrinsics.areEqual(cryptoAmountInputEventConsume, CryptoAmountInputEvent.ModeChangedEvent.INSTANCE)) {
                    TickerInputWrapper$lambda$11(snapshotState, true);
                } else if (Intrinsics.areEqual(cryptoAmountInputEventConsume, CryptoAmountInputEvent.ShakeInputEvent.INSTANCE)) {
                    TickerInputWrapper$lambda$8(snapshotState2, true);
                } else if (Intrinsics.areEqual(cryptoAmountInputEventConsume, CryptoAmountInputEvent.ForceRedrawEvent.INSTANCE)) {
                    Integer numValueOf = Integer.valueOf(snapshotIntState2.getIntValue());
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new CryptoTickerInputComposable3(snapshotIntState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composerStartRestartGroup, 0);
                } else if (cryptoAmountInputEventConsume != null) {
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.amountInputView.CryptoTickerInputComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return CryptoTickerInputComposable2.TickerInputWrapper$lambda$23(amountText, composeUiEvent, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotState snapshotState32 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            final SnapshotState snapshotState42 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            SnapshotState snapshotState52 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
            }
            SnapshotIntState2 snapshotIntState222 = (SnapshotIntState2) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            if (!((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void TickerInputWrapper$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final void TickerInputWrapper$lambda$11(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final boolean TickerInputWrapper$lambda$10(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final String TickerInputWrapper$lambda$4(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean TickerInputWrapper$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoTickerInputView TickerInputWrapper$lambda$18$lambda$17(String str, SnapshotState snapshotState, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        CryptoTickerInputView cryptoTickerInputView = new CryptoTickerInputView(context, null, 0, 6, null);
        cryptoTickerInputView.setClipToOutline(true);
        cryptoTickerInputView.setTypeface(ContextsUiExtensions.getFont(context, C16915R.font.capsule_sans_medium));
        cryptoTickerInputView.setAlignVerticallyCentered(true);
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        cryptoTickerInputView.setValue(charArray);
        snapshotState.setValue(str);
        return cryptoTickerInputView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TickerInputWrapper$lambda$21$lambda$20(String str, SnapshotIntState2 snapshotIntState2, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotState snapshotState3, CryptoTickerInputView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTag(Integer.valueOf(snapshotIntState2.getIntValue()));
        if (TickerInputWrapper$lambda$10(snapshotState)) {
            view.reset();
            TickerInputWrapper$lambda$11(snapshotState, false);
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setTextColor(ThemeColors.getThemeColor(context, C20690R.attr.colorForeground1));
        if (!StringsKt.isBlank(TickerInputWrapper$lambda$4(snapshotState2)) && !Intrinsics.areEqual(TickerInputWrapper$lambda$4(snapshotState2), str)) {
            char[] charArray = str.toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
            view.transitionTo(charArray);
        } else if (!Intrinsics.areEqual(TickerInputWrapper$lambda$4(snapshotState2), str)) {
            char[] charArray2 = str.toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray2, "toCharArray(...)");
            view.setValue(charArray2);
        }
        snapshotState2.setValue(str);
        if (TickerInputWrapper$lambda$7(snapshotState3)) {
            AnimationUtils.animateErrorShake$default(AnimationUtils.INSTANCE, view, 0L, 0.05f, 1, null);
            TickerInputWrapper$lambda$8(snapshotState3, false);
        }
        return Unit.INSTANCE;
    }
}

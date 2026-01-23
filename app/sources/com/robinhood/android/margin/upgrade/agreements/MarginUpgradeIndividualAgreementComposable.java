package com.robinhood.android.margin.upgrade.agreements;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.instant.p160ui.InstantRetirementAgreementComponents;
import com.robinhood.android.margin.upgrade.C21137R;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoCheckbox2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MarginUpgradeIndividualAgreementComposable.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aE\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0005X\u008a\u008e\u0002"}, m3636d2 = {"MarginUpgradeIndividualAgreementComposable", "", InstantRetirementAgreementComponents.MarkdownTag, "", "isGold", "", "isUk", "disclaimerStringRes", "", "onAccepted", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;ZZILkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-margin-upgrade_externalDebug", "hasEverScrolledToEnd", "isScrolledToEnd", "disclaimerChecked", "shouldScrollToEnd"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeIndividualAgreementComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MarginUpgradeIndividualAgreementComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginUpgradeIndividualAgreementComposable$lambda$23(String str, boolean z, boolean z2, int i, Function0 function0, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        MarginUpgradeIndividualAgreementComposable(str, z, z2, i, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0203  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MarginUpgradeIndividualAgreementComposable(final String markdown, final boolean z, final boolean z2, final int i, final Function0<Unit> onAccepted, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        final ScrollState scrollStateRememberScrollState;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotState snapshotState;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Object objRememberedValue4;
        int i5;
        Object objRememberedValue5;
        final SnapshotState snapshotState2;
        boolean zChanged;
        Object objRememberedValue6;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final SnapshotState snapshotState3;
        Modifier.Companion companion2;
        int i6;
        final SnapshotState snapshotState4;
        BentoTheme bentoTheme;
        float f;
        int i7;
        String strStringResource;
        int i8;
        Object objRememberedValue7;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(markdown, "markdown");
        Intrinsics.checkNotNullParameter(onAccepted, "onAccepted");
        Composer composerStartRestartGroup = composer.startRestartGroup(-68846590);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(markdown) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onAccepted) ? 16384 : 8192;
        }
        int i9 = i3 & 32;
        if (i9 == 0) {
            if ((196608 & i2) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i4) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-68846590, i4, -1, "com.robinhood.android.margin.upgrade.agreements.MarginUpgradeIndividualAgreementComposable (MarginUpgradeIndividualAgreementComposable.kt:38)");
                }
                scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                int i10 = i4;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeIndividualAgreementComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(MarginUpgradeIndividualAgreementComposable.MarginUpgradeIndividualAgreementComposable$lambda$4$lambda$3(scrollStateRememberScrollState));
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Boolean boolValueOf = Boolean.valueOf(MarginUpgradeIndividualAgreementComposable$lambda$5(snapshotState42));
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new MarginUpgradeIndividualAgreementComposable2(snapshotState42, snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 != companion.getEmpty()) {
                    i5 = 2;
                    objRememberedValue4 = SnapshotState3.mutableStateOf$default(Boolean.valueOf(!z2), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    i5 = 2;
                }
                final SnapshotState snapshotState5 = (SnapshotState) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, i5, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                snapshotState2 = (SnapshotState) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                Boolean boolValueOf2 = Boolean.valueOf(MarginUpgradeIndividualAgreementComposable$lambda$11(snapshotState2));
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = composerStartRestartGroup.changed(scrollStateRememberScrollState);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new MarginUpgradeIndividualAgreementComposable3(scrollStateRememberScrollState, snapshotState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 0);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i11 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifier4, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i11).m21590getDefaultD9Ej5fM(), 7, null);
                Modifier modifier5 = modifier4;
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion5 = Modifier.INSTANCE;
                Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion5, bentoTheme2.getSpacing(composerStartRestartGroup, i11).m21592getMediumD9Ej5fM());
                String strStringResource2 = StringResources_androidKt.stringResource(C21137R.string.margin_upgrade_agreement_title, composerStartRestartGroup, 0);
                TextStyle displayCapsuleMedium = bentoTheme2.getTypography(composerStartRestartGroup, i11).getDisplayCapsuleMedium();
                TextAlign.Companion companion6 = TextAlign.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(strStringResource2, modifierM21618defaultFillMaxWidthPadding3ABfNKs, null, null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, 0, 0, 8124);
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion5, 0.0f, 1, null), 1.0f, false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                BentoMarkdownText2.BentoMarkdownText(markdown, (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, i10 & 14, 30);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.startReplaceGroup(-824986855);
                if (MarginUpgradeIndividualAgreementComposable$lambda$1(snapshotState)) {
                    snapshotState3 = snapshotState;
                    companion2 = companion5;
                    i6 = i11;
                    snapshotState4 = snapshotState5;
                    bentoTheme = bentoTheme2;
                    f = 0.0f;
                    i7 = 0;
                } else {
                    Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion5, bentoTheme2.getSpacing(composerStartRestartGroup, i11).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = new Function0() { // from class: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeIndividualAgreementComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MarginUpgradeIndividualAgreementComposable.m2158x2805b24(snapshotState5);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, false, null, null, (Function0) objRememberedValue8, 7, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getCenter(), companion3.getCenterVertically(), composerStartRestartGroup, 54);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1674516819);
                    if (z2) {
                        boolean zMarginUpgradeIndividualAgreementComposable$lambda$8 = MarginUpgradeIndividualAgreementComposable$lambda$8(snapshotState5);
                        float fM21593getSmallD9Ej5fM = bentoTheme2.getSpacing(composerStartRestartGroup, i11).m21593getSmallD9Ej5fM();
                        bentoTheme = bentoTheme2;
                        i6 = i11;
                        snapshotState4 = snapshotState5;
                        f = 0.0f;
                        snapshotState3 = snapshotState;
                        i7 = 0;
                        Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion5, 0.0f, 0.0f, fM21593getSmallD9Ej5fM, 0.0f, 11, null);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue9 == companion.getEmpty()) {
                            objRememberedValue9 = new Function1() { // from class: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeIndividualAgreementComposableKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return MarginUpgradeIndividualAgreementComposable.m2159x79216f69(snapshotState4, ((Boolean) obj).booleanValue());
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                        }
                        Function1 function1 = (Function1) objRememberedValue9;
                        composerStartRestartGroup.endReplaceGroup();
                        companion2 = companion5;
                        BentoCheckbox2.m20599BentoCheckboxSj8uqqQ(modifierM5146paddingqDBjuR0$default2, zMarginUpgradeIndividualAgreementComposable$lambda$8, false, null, function1, composerStartRestartGroup, 24576, 12);
                    } else {
                        snapshotState3 = snapshotState;
                        companion2 = companion5;
                        i6 = i11;
                        snapshotState4 = snapshotState5;
                        bentoTheme = bentoTheme2;
                        f = 0.0f;
                        i7 = 0;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(i, composerStartRestartGroup, (i10 >> 9) & 14), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(z2 ? companion6.m7924getStarte0LSkKk() : companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextS(), composerStartRestartGroup, 0, 0, 8122);
                    composerStartRestartGroup.endNode();
                }
                composerStartRestartGroup.endReplaceGroup();
                if (!z2) {
                    composerStartRestartGroup.startReplaceGroup(196304426);
                    strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_action_accept, composerStartRestartGroup, i7);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (MarginUpgradeIndividualAgreementComposable$lambda$1(snapshotState3)) {
                    composerStartRestartGroup.startReplaceGroup(196411531);
                    strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_action_agree, composerStartRestartGroup, i7);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(196491914);
                    strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_action_review, composerStartRestartGroup, i7);
                    composerStartRestartGroup.endReplaceGroup();
                }
                String str = strStringResource;
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                i8 = (i10 & 57344) != 16384 ? 1 : i7;
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (i8 == 0 || objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new Function0() { // from class: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeIndividualAgreementComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MarginUpgradeIndividualAgreementComposable.m2160x21ba82d8(onAccepted, snapshotState3, snapshotState2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                Function0 function0 = (Function0) objRememberedValue7;
                composerStartRestartGroup.endReplaceGroup();
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(196970895);
                    BentoButtonKt.m20586BentoButtonEikTQX8(function0, str, com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), f, 2, null), null, null, (MarginUpgradeIndividualAgreementComposable$lambda$8(snapshotState4) || !MarginUpgradeIndividualAgreementComposable$lambda$1(snapshotState3)) ? 1 : i7, false, null, null, null, null, false, null, composerStartRestartGroup, 0, 0, 8152);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(196772216);
                    BentoButtonKt.BentoGoldButton((Function0<Unit>) function0, str, com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion2, f, 1, null), (BentoButtons.Icon.Size16) null, (BentoButtons.Type) null, false, false, (String) null, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeIndividualAgreementComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MarginUpgradeIndividualAgreementComposable.MarginUpgradeIndividualAgreementComposable$lambda$23(markdown, z, z2, i, onAccepted, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 196608;
        modifier2 = modifier;
        if ((74899 & i4) == 74898) {
            if (i9 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            int i102 = i4;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            SnapshotState4 snapshotState422 = (SnapshotState4) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Boolean boolValueOf3 = Boolean.valueOf(MarginUpgradeIndividualAgreementComposable$lambda$5(snapshotState422));
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 != companion.getEmpty()) {
            }
            final SnapshotState snapshotState52 = (SnapshotState) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
            }
            snapshotState2 = (SnapshotState) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            Boolean boolValueOf22 = Boolean.valueOf(MarginUpgradeIndividualAgreementComposable$lambda$11(snapshotState2));
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChanged = composerStartRestartGroup.changed(scrollStateRememberScrollState);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue6 = new MarginUpgradeIndividualAgreementComposable3(scrollStateRememberScrollState, snapshotState2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 0);
                BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                int i112 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(modifier4, 0.0f, 0.0f, 0.0f, bentoTheme22.getSpacing(composerStartRestartGroup, i112).m21590getDefaultD9Ej5fM(), 7, null);
                Modifier modifier52 = modifier4;
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Vertical top2 = arrangement2.getTop();
                Alignment.Companion companion32 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion32.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default3);
                ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion42.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion42.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion42.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion42.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion42.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Modifier.Companion companion52 = Modifier.INSTANCE;
                    Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs2 = com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion52, bentoTheme22.getSpacing(composerStartRestartGroup, i112).m21592getMediumD9Ej5fM());
                    String strStringResource22 = StringResources_androidKt.stringResource(C21137R.string.margin_upgrade_agreement_title, composerStartRestartGroup, 0);
                    TextStyle displayCapsuleMedium2 = bentoTheme22.getTypography(composerStartRestartGroup, i112).getDisplayCapsuleMedium();
                    TextAlign.Companion companion62 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(strStringResource22, modifierM21618defaultFillMaxWidthPadding3ABfNKs2, null, null, null, null, TextAlign.m7912boximpl(companion62.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium2, composerStartRestartGroup, 0, 0, 8124);
                    Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(Column5.weight$default(column62, com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion52, 0.0f, 1, null), 1.0f, false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion32.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
                    Function0<ComposeUiNode> constructor22 = companion42.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion42.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion42.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion42.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion42.getSetModifier());
                        BentoMarkdownText2.BentoMarkdownText(markdown, (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, i102 & 14, 30);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.startReplaceGroup(-824986855);
                        if (MarginUpgradeIndividualAgreementComposable$lambda$1(snapshotState)) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        if (!z2) {
                        }
                        String str2 = strStringResource;
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        if ((i102 & 57344) != 16384) {
                        }
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (i8 == 0) {
                            objRememberedValue7 = new Function0() { // from class: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeIndividualAgreementComposableKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return MarginUpgradeIndividualAgreementComposable.m2160x21ba82d8(onAccepted, snapshotState3, snapshotState2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                            Function0 function02 = (Function0) objRememberedValue7;
                            composerStartRestartGroup.endReplaceGroup();
                            if (z) {
                            }
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MarginUpgradeIndividualAgreementComposable$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MarginUpgradeIndividualAgreementComposable$lambda$4$lambda$3(ScrollState scrollState) {
        return scrollState.getValue() == scrollState.getMaxValue();
    }

    private static final void MarginUpgradeIndividualAgreementComposable$lambda$9(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MarginUpgradeIndividualAgreementComposable$lambda$12(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MarginUpgradeIndividualAgreementComposable$lambda$22$lambda$16$lambda$15 */
    public static final Unit m2158x2805b24(SnapshotState snapshotState) {
        MarginUpgradeIndividualAgreementComposable$lambda$9(snapshotState, !MarginUpgradeIndividualAgreementComposable$lambda$8(snapshotState));
        return Unit.INSTANCE;
    }

    private static final boolean MarginUpgradeIndividualAgreementComposable$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MarginUpgradeIndividualAgreementComposable$lambda$11(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MarginUpgradeIndividualAgreementComposable$lambda$5(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final boolean MarginUpgradeIndividualAgreementComposable$lambda$8(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MarginUpgradeIndividualAgreementComposable$lambda$22$lambda$19$lambda$18$lambda$17 */
    public static final Unit m2159x79216f69(SnapshotState snapshotState, boolean z) {
        MarginUpgradeIndividualAgreementComposable$lambda$9(snapshotState, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MarginUpgradeIndividualAgreementComposable$lambda$22$lambda$21$lambda$20 */
    public static final Unit m2160x21ba82d8(Function0 function0, SnapshotState snapshotState, SnapshotState snapshotState2) {
        if (MarginUpgradeIndividualAgreementComposable$lambda$1(snapshotState)) {
            function0.invoke();
        } else {
            MarginUpgradeIndividualAgreementComposable$lambda$12(snapshotState2, true);
        }
        return Unit.INSTANCE;
    }
}

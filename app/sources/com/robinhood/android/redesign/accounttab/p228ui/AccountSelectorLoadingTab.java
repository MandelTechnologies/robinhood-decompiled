package com.robinhood.android.redesign.accounttab.p228ui;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
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
import com.robinhood.compose.bento.util.ModifiersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountSelectorLoadingTab.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a>\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032%\b\u0002\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005H\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"AccountSelectorLoadingTab", "", "modifier", "Landroidx/compose/ui/Modifier;", "onMeasurementsConfirmed", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Dp;", "Lkotlin/ParameterName;", "name", "height", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "lib-account-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesign.accounttab.ui.AccountSelectorLoadingTabKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class AccountSelectorLoadingTab {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectorLoadingTab$lambda$6(Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        AccountSelectorLoadingTab(modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountSelectorLoadingTab(Modifier modifier, Function1<? super C2002Dp, Unit> function1, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        final Function1<? super C2002Dp, Unit> function12;
        final Function1<? super C2002Dp, Unit> function13;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-983666787);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                function12 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                function13 = i5 == 0 ? null : function12;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-983666787, i3, -1, "com.robinhood.android.redesign.accounttab.ui.AccountSelectorLoadingTab (AccountSelectorLoadingTab.kt:34)");
                }
                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(12));
                final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceGroup(-410955537);
                Modifier modifierClip = Clip.clip(modifier3, roundedCornerShapeM5327RoundedCornerShape0680j_4);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(BorderKt.m4876borderxT4_qwU(Background3.m4872backgroundbw27NRU$default(modifierClip, bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), null, 2, null), C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composerStartRestartGroup, i6).m21427getFg30d7_KjU(), roundedCornerShapeM5327RoundedCornerShape0680j_4), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM());
                if (function13 != null) {
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChanged = composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(function13);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorLoadingTabKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AccountSelectorLoadingTab.AccountSelectorLoadingTab$lambda$3$lambda$2$lambda$1(density, function13, (LayoutCoordinates) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierM5143paddingVpY3zN4, (Function1) objRememberedValue);
                    if (modifierOnGloballyPositioned != null) {
                        modifierM5143paddingVpY3zN4 = modifierOnGloballyPositioned;
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
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
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifier4 = modifier3;
                Function1<? super C2002Dp, Unit> function14 = function13;
                BentoText2.m20747BentoText38GnDrw("Loading Account", ModifiersKt.bentoPlaceholder$default(companion3, true, null, 2, null), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 24582, 0, 16364);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                BentoText2.m20747BentoText38GnDrw("$10,000.00", ModifiersKt.bentoPlaceholder$default(companion3, true, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 6, 0, 16380);
                Alignment.Vertical centerVertically = companion.getCenterVertically();
                Modifier modifierAlpha = Alpha.alpha(companion3, 1.0f);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlpha);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.STOCK_UP_12), null, bentoTheme.getColors(composerStartRestartGroup, i6).m21456getPositive0d7_KjU(), ModifiersKt.bentoPlaceholder$default(companion3, true, null, 2, null), null, false, composerStartRestartGroup, BentoIcon4.Size12.$stable | 48, 48);
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21597getXxsmallD9Ej5fM()), composerStartRestartGroup, 0);
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw("+10.00%", ModifiersKt.bentoPlaceholder$default(companion3, true, null, 2, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21456getPositive0d7_KjU()), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, null, composer2, 817889286, 0, 15736);
                composer2.endNode();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function12 = function14;
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorLoadingTabKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountSelectorLoadingTab.AccountSelectorLoadingTab$lambda$6(modifier2, function12, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        function12 = function1;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(12));
            final Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            composerStartRestartGroup.startReplaceGroup(-410955537);
            Modifier modifierClip2 = Clip.clip(modifier3, roundedCornerShapeM5327RoundedCornerShape0680j_42);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(BorderKt.m4876borderxT4_qwU(Background3.m4872backgroundbw27NRU$default(modifierClip2, bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), null, 2, null), C2002Dp.m7995constructorimpl(1), bentoTheme2.getColors(composerStartRestartGroup, i62).m21427getFg30d7_KjU(), roundedCornerShapeM5327RoundedCornerShape0680j_42), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM());
            if (function13 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN42);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifier42 = modifier3;
                Function1<? super C2002Dp, Unit> function142 = function13;
                BentoText2.m20747BentoText38GnDrw("Loading Account", ModifiersKt.bentoPlaceholder$default(companion32, true, null, 2, null), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 24582, 0, 16364);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                BentoText2.m20747BentoText38GnDrw("$10,000.00", ModifiersKt.bentoPlaceholder$default(companion32, true, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 6, 0, 16380);
                Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
                Modifier modifierAlpha2 = Alpha.alpha(companion32, 1.0f);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlpha2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.STOCK_UP_12), null, bentoTheme2.getColors(composerStartRestartGroup, i62).m21456getPositive0d7_KjU(), ModifiersKt.bentoPlaceholder$default(companion32, true, null, 2, null), null, false, composerStartRestartGroup, BentoIcon4.Size12.$stable | 48, 48);
                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21597getXxsmallD9Ej5fM()), composerStartRestartGroup, 0);
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw("+10.00%", ModifiersKt.bentoPlaceholder$default(companion32, true, null, 2, null), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i62).m21456getPositive0d7_KjU()), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, null, composer2, 817889286, 0, 15736);
                    composer2.endNode();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function12 = function142;
                    modifier2 = modifier42;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectorLoadingTab$lambda$3$lambda$2$lambda$1(Density density, Function1 function1, LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
        float fMo5013toDpu2uoSUM = density.mo5013toDpu2uoSUM((int) (layoutCoordinates.mo7241getSizeYbymL2g() & 4294967295L));
        if (C2002Dp.m7994compareTo0680j_4(fMo5013toDpu2uoSUM, C2002Dp.m7995constructorimpl(0)) > 0) {
            function1.invoke(C2002Dp.m7993boximpl(fMo5013toDpu2uoSUM));
        }
        return Unit.INSTANCE;
    }
}

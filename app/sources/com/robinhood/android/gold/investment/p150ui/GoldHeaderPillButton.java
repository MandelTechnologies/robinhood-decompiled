package com.robinhood.android.gold.investment.p150ui;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.gold.investment.model.GoldHeaderPillData;
import com.robinhood.android.gold.sparkle.bento.BentoSparkleInfoTag;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GoldHeaderPillButton.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001aQ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002"}, m3636d2 = {"GoldHeaderPillButton", "", "goldInvestmentPillData", "Lcom/robinhood/android/gold/investment/model/GoldHeaderPillData;", "modifier", "Landroidx/compose/ui/Modifier;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "textTint", "Landroidx/compose/ui/graphics/Color;", "loading", "", "onClick", "Lkotlin/Function0;", "GoldHeaderPillButton-fWhpE4E", "(Lcom/robinhood/android/gold/investment/model/GoldHeaderPillData;Landroidx/compose/ui/Modifier;Lcom/robinhood/rosetta/eventlogging/Screen;JZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lib-gold-investment-pill_externalDebug", "size", "Landroidx/compose/ui/unit/IntSize;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.investment.ui.GoldHeaderPillButtonKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldHeaderPillButton {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldHeaderPillButton_fWhpE4E$lambda$10(GoldHeaderPillData goldHeaderPillData, Modifier modifier, Screen screen, long j, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        m15057GoldHeaderPillButtonfWhpE4E(goldHeaderPillData, modifier, screen, j, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0130  */
    /* renamed from: GoldHeaderPillButton-fWhpE4E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15057GoldHeaderPillButtonfWhpE4E(final GoldHeaderPillData goldInvestmentPillData, Modifier modifier, Screen screen, long j, boolean z, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Screen screen2;
        long j2;
        int i4;
        boolean z2;
        int i5;
        Function0<Unit> function02;
        char c;
        long jet;
        long j3;
        Function0<Unit> function03;
        Screen screen3;
        int i6;
        final boolean z3;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean z4;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        BentoTheme bentoTheme;
        long j4;
        int i7;
        final boolean z5;
        final Screen screen4;
        final Modifier modifier3;
        final Function0<Unit> function04;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(goldInvestmentPillData, "goldInvestmentPillData");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1627853601);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(goldInvestmentPillData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    screen2 = screen;
                    int i9 = composerStartRestartGroup.changedInstance(screen2) ? 256 : 128;
                    i3 |= i9;
                } else {
                    screen2 = screen;
                }
                i3 |= i9;
            } else {
                screen2 = screen;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    j2 = j;
                    int i10 = composerStartRestartGroup.changed(j2) ? 2048 : 1024;
                    i3 |= i10;
                } else {
                    j2 = j;
                }
                i3 |= i10;
            } else {
                j2 = j;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                    function02 = function0;
                    c = ' ';
                } else {
                    function02 = function0;
                    c = ' ';
                    if ((i & 196608) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
                    }
                }
                if ((i3 & 74899) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    screen4 = screen2;
                    j5 = j2;
                    function04 = function02;
                    z5 = z2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            screen2 = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
                        }
                        if ((i2 & 8) == 0) {
                            jet = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getJet();
                            i3 &= -7169;
                        } else {
                            jet = j;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if (i5 != 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.gold.investment.ui.GoldHeaderPillButtonKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            function02 = (Function0) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        j3 = jet;
                        function03 = function02;
                        screen3 = screen2;
                        i6 = i3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        j3 = j;
                        i6 = i3;
                        function03 = function02;
                        screen3 = screen2;
                    }
                    z3 = z2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1627853601, i6, -1, "com.robinhood.android.gold.investment.ui.GoldHeaderPillButton (GoldHeaderPillButton.kt:57)");
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(IntSize.m8055boximpl(IntSize.INSTANCE.m8064getZeroYbymL2g()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(BentoSparkleInfoTag.sparkleBackground$default(Clip.clip(modifier2, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(100))), null, 1, null), !z3, null, null, function03, 6, null);
                    Function0<Unit> function05 = function03;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i11 = BentoTheme.$stable;
                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierM4893clickableXHw0xAI$default, bentoTheme2.getSpacing(composerStartRestartGroup, i11).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i11).m21593getSmallD9Ej5fM());
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    z4 = (57344 & i6) != 16384;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z4 || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.gold.investment.ui.GoldHeaderPillButtonKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return GoldHeaderPillButton.GoldHeaderPillButton_fWhpE4E$lambda$6$lambda$5(z3, snapshotState, (IntSize) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Screen screen5 = screen3;
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(OnRemeasuredModifier2.onSizeChanged(modifierM5143paddingVpY3zN4, (Function1) objRememberedValue2), new UserInteractionEventDescriptor(null, screen3, null, null, new Component(Component.ComponentType.BUTTON, goldInvestmentPillData.getLoggingIdentifier(), null, 4, null), null, 45, null), true, false, false, true, true, null, 76, null);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    if (z3) {
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceGroup(112748039);
                        ServerToBentoAssetMapper2 iconAsset = goldInvestmentPillData.getIconAsset();
                        composer2.startReplaceGroup(1666207111);
                        if (iconAsset == null || iconAsset == ServerToBentoAssetMapper2.UNKNOWN) {
                            bentoTheme = bentoTheme2;
                            j4 = j3;
                            i7 = i11;
                        } else {
                            bentoTheme = bentoTheme2;
                            i7 = i11;
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(iconAsset), null, j3, null, null, false, composer2, BentoIcon4.Size16.$stable | 48 | ((i6 >> 3) & 896), 56);
                            j4 = j3;
                            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, bentoTheme.getSpacing(composer2, i7).m21595getXsmallD9Ej5fM()), composer2, 0);
                        }
                        composer2.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(goldInvestmentPillData.getLabel(), null, Color.m6701boximpl(j4), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextS(), composer2, ((i6 >> 3) & 896) | 24576, 0, 8170);
                        composer2.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(112007263);
                        Modifier modifierM5174width3ABfNKs = ((int) (GoldHeaderPillButton_fWhpE4E$lambda$3(snapshotState) >> c)) == 0 ? Modifier.INSTANCE : SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (GoldHeaderPillButton_fWhpE4E$lambda$3(snapshotState) >> c)));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5174width3ABfNKs);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(BoxScopeInstance.INSTANCE.align(Modifier.INSTANCE, companion2.getCenter()), BentoProgressIndicator3.f5151S, j3, composerStartRestartGroup, ((i6 >> 3) & 896) | 48, 0);
                        composer2 = composerStartRestartGroup;
                        composer2.endNode();
                        Unit unit = Unit.INSTANCE;
                        composer2.endReplaceGroup();
                        j4 = j3;
                    }
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z3;
                    screen4 = screen5;
                    modifier3 = modifier2;
                    function04 = function05;
                    j5 = j4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.investment.ui.GoldHeaderPillButtonKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return GoldHeaderPillButton.GoldHeaderPillButton_fWhpE4E$lambda$10(goldInvestmentPillData, modifier3, screen4, j5, z5, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            z2 = z;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((i3 & 74899) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if ((i2 & 8) == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    j3 = jet;
                    function03 = function02;
                    screen3 = screen2;
                    i6 = i3;
                    z3 = z2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(BentoSparkleInfoTag.sparkleBackground$default(Clip.clip(modifier2, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(100))), null, 1, null), !z3, null, null, function03, 6, null);
                    Function0<Unit> function052 = function03;
                    BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                    int i112 = BentoTheme.$stable;
                    Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(modifierM4893clickableXHw0xAI$default2, bentoTheme22.getSpacing(composerStartRestartGroup, i112).m21590getDefaultD9Ej5fM(), bentoTheme22.getSpacing(composerStartRestartGroup, i112).m21593getSmallD9Ej5fM());
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    if ((57344 & i6) != 16384) {
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z4) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.gold.investment.ui.GoldHeaderPillButtonKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return GoldHeaderPillButton.GoldHeaderPillButton_fWhpE4E$lambda$6$lambda$5(z3, snapshotState, (IntSize) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        Screen screen52 = screen3;
                        Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(OnRemeasuredModifier2.onSizeChanged(modifierM5143paddingVpY3zN42, (Function1) objRememberedValue2), new UserInteractionEventDescriptor(null, screen3, null, null, new Component(Component.ComponentType.BUTTON, goldInvestmentPillData.getLoggingIdentifier(), null, 4, null), null, 45, null), true, false, false, true, true, null, 76, null);
                        Alignment.Companion companion22 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion22.getCenterVertically(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default2);
                        ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                            Row6 row62 = Row6.INSTANCE;
                            if (z3) {
                            }
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z5 = z3;
                            screen4 = screen52;
                            modifier3 = modifier2;
                            function04 = function052;
                            j5 = j4;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        z2 = z;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((i3 & 74899) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void GoldHeaderPillButton_fWhpE4E$lambda$4(SnapshotState<IntSize> snapshotState, long j) {
        snapshotState.setValue(IntSize.m8055boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldHeaderPillButton_fWhpE4E$lambda$6$lambda$5(boolean z, SnapshotState snapshotState, IntSize intSize) {
        if (!z) {
            GoldHeaderPillButton_fWhpE4E$lambda$4(snapshotState, intSize.getPackedValue());
        }
        return Unit.INSTANCE;
    }

    private static final long GoldHeaderPillButton_fWhpE4E$lambda$3(SnapshotState<IntSize> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }
}

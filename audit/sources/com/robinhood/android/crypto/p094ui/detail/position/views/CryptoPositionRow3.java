package com.robinhood.android.crypto.p094ui.detail.position.views;

import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.PathEffect;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.charts.PieChart2;
import com.robinhood.android.charts.model.Pie;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.crypto.C12757R;
import com.robinhood.android.crypto.p094ui.detail.position.views.CryptoPositionRow3;
import com.robinhood.android.crypto.p094ui.detail.position.views.CryptoPositionRowState;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.component.rows.BentoDataRowDefaults;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.tooltips.popup.PopupPositioning;
import com.robinhood.tooltips.popup.PopupTooltipKt;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;

/* compiled from: CryptoPositionRow.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ag\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aH\u0010\u0010\u001a\u00020\u0005*\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"CryptoPositionRow", "", "state", "Lcom/robinhood/android/crypto/ui/detail/position/views/CryptoPositionRowState;", "modifier", "Landroidx/compose/ui/Modifier;", "labelUnderlineColor", "Landroidx/compose/ui/graphics/Color;", "onLabelClicked", "Lkotlin/Function0;", "onTooltipClicked", "Lkotlin/Function1;", "Lcom/robinhood/android/crypto/ui/detail/position/views/CryptoPositionRowState$TooltipType;", "onTooltipAppear", "CryptoPositionRow-FU0evQE", "(Lcom/robinhood/android/crypto/ui/detail/position/views/CryptoPositionRowState;Landroidx/compose/ui/Modifier;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "optimizedCostReturnCalculationsTooltip", "onAppear", "onClick", "onLinkClicked", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "CryptoPositionRowPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.detail.position.views.CryptoPositionRowKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoPositionRow3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPositionRowPreview$lambda$32(int i, Composer composer, int i2) {
        CryptoPositionRowPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPositionRow_FU0evQE$lambda$31(CryptoPositionRowState cryptoPositionRowState, Modifier modifier, long j, Function0 function0, Function1 function1, Function1 function12, int i, int i2, Composer composer, int i3) {
        m13110CryptoPositionRowFU0evQE(cryptoPositionRowState, modifier, j, function0, function1, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPositionRow_FU0evQE$lambda$3$lambda$2(CryptoPositionRowState.TooltipType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPositionRow_FU0evQE$lambda$5$lambda$4(CryptoPositionRowState.TooltipType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0929  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0938  */
    /* JADX WARN: Removed duplicated region for block: B:269:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0132  */
    /* renamed from: CryptoPositionRow-FU0evQE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13110CryptoPositionRowFU0evQE(final CryptoPositionRowState state, Modifier modifier, long j, Function0<Unit> function0, Function1<? super CryptoPositionRowState.TooltipType, Unit> function1, Function1<? super CryptoPositionRowState.TooltipType, Unit> function12, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long jM21426getFg20d7_KjU;
        int i4;
        Function0<Unit> function02;
        int i5;
        Function1<? super CryptoPositionRowState.TooltipType, Unit> function13;
        int i6;
        Function1<? super CryptoPositionRowState.TooltipType, Unit> function14;
        int i7;
        final Function1<? super CryptoPositionRowState.TooltipType, Unit> function15;
        final long j2;
        Function0<Unit> function03;
        final Function1<? super CryptoPositionRowState.TooltipType, Unit> function16;
        Modifier modifier3;
        Function0<Unit> function04;
        Modifier modifierDrawBehind;
        Function1<? super CryptoPositionRowState.TooltipType, Unit> function17;
        Modifier modifier4;
        Arrangement arrangement;
        Function0<Unit> function05;
        int i8;
        boolean z;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        CryptoPositionRowState.TextTrailingContent textTrailingContent;
        Composer composer2;
        final Function1<? super CryptoPositionRowState.TooltipType, Unit> function18;
        final Modifier modifier5;
        final Function0<Unit> function06;
        Row6 row6;
        Modifier modifier6;
        Modifier modifierDrawBehind2;
        int i9;
        Modifier.Companion companion;
        int i10;
        CryptoPositionRowState.TextTrailingContent textTrailingContent2;
        Composer composer3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(848111250);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                jM21426getFg20d7_KjU = j;
                i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changed(jM21426getFg20d7_KjU)) ? 256 : 128;
            } else {
                jM21426getFg20d7_KjU = j;
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
                        function13 = function1;
                        i3 |= composerStartRestartGroup.changedInstance(function13) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                        function14 = function12;
                    } else {
                        function14 = function12;
                        if ((i & 196608) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function14) ? 131072 : 65536;
                        }
                    }
                    if ((i3 & 74899) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                                jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU();
                            }
                            if (i4 != 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.position.views.CryptoPositionRowKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function02 = (Function0) objRememberedValue;
                            }
                            if (i5 != 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.position.views.CryptoPositionRowKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return CryptoPositionRow3.CryptoPositionRow_FU0evQE$lambda$3$lambda$2((CryptoPositionRowState.TooltipType) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function13 = (Function1) objRememberedValue2;
                            }
                            if (i6 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.position.views.CryptoPositionRowKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return CryptoPositionRow3.CryptoPositionRow_FU0evQE$lambda$5$lambda$4((CryptoPositionRowState.TooltipType) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                i7 = i3;
                                function15 = (Function1) objRememberedValue3;
                                j2 = jM21426getFg20d7_KjU;
                                function03 = function02;
                                function16 = function13;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(848111250, i7, -1, "com.robinhood.android.crypto.ui.detail.position.views.CryptoPositionRow (CryptoPositionRow.kt:64)");
                            }
                            if (state.isCondensed()) {
                                composerStartRestartGroup.startReplaceGroup(-1209833033);
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                                BentoDataRowDefaults bentoDataRowDefaults = BentoDataRowDefaults.INSTANCE;
                                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.m5155defaultMinSizeVpY3zN4$default(modifierFillMaxWidth$default, 0.0f, bentoDataRowDefaults.m20962getCondensedMinHeightD9Ej5fM(), 1, null), bentoDataRowDefaults.m20963getCondensedVerticalPaddingD9Ej5fM(), composerStartRestartGroup, 0, 0);
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier, companion2.getSetModifier());
                                Row6 row62 = Row6.INSTANCE;
                                composerStartRestartGroup.startReplaceGroup(1058781661);
                                composerStartRestartGroup.startReplaceGroup(1058750046);
                                composerStartRestartGroup.startReplaceGroup(1058726516);
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                Modifier modifierWrapContentWidth$default = SizeKt.wrapContentWidth$default(companion3, null, false, 3, null);
                                final CryptoPositionRowState.TooltipType tooltipType = state.getTooltipType();
                                if (tooltipType != null) {
                                    composerStartRestartGroup.startReplaceGroup(1058728106);
                                    if (!Intrinsics.areEqual(tooltipType, CryptoPositionRowState.TooltipType.OptimizedCostReturnCalculations.INSTANCE)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                                    boolean zChanged = ((i7 & 458752) == 131072) | composerStartRestartGroup.changed(tooltipType);
                                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.position.views.CryptoPositionRowKt$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CryptoPositionRow3.CryptoPositionRow_FU0evQE$lambda$17$lambda$10$lambda$7$lambda$6(function15, tooltipType);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                    }
                                    Function0 function07 = (Function0) objRememberedValue4;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                                    row6 = row62;
                                    boolean zChanged2 = ((i7 & 57344) == 16384) | composerStartRestartGroup.changed(tooltipType);
                                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                    if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue5 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.position.views.CryptoPositionRowKt$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CryptoPositionRow3.CryptoPositionRow_FU0evQE$lambda$17$lambda$10$lambda$9$lambda$8(function16, tooltipType);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    modifierDrawBehind2 = optimizedCostReturnCalculationsTooltip(modifierWrapContentWidth$default, function07, (Function0) objRememberedValue5, function03, AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable), ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen());
                                    modifier6 = modifierWrapContentWidth$default;
                                    composerStartRestartGroup.endReplaceGroup();
                                    if (modifierDrawBehind2 == null) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    if (state.getShowDottedLabelUnderline()) {
                                        i9 = i7;
                                        companion = companion3;
                                        function05 = function03;
                                        i10 = 5004770;
                                    } else {
                                        i9 = i7;
                                        companion = companion3;
                                        i10 = 5004770;
                                        function05 = function03;
                                        modifierDrawBehind2 = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifierDrawBehind2, false, null, null, function03, 7, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.TEXT_VIEW, state.getAnalyticsIdentifier(), null, 4, null), new ComponentHierarchy(new Component(Component.ComponentType.POSITION_SECTION, null, null, 6, null), null, null, null, null, 30, null), 15, null), false, false, false, true, false, null, 110, null);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    if (state.getShowDottedLabelUnderline()) {
                                        composerStartRestartGroup.startReplaceGroup(i10);
                                        boolean z2 = (((i9 & 896) ^ 384) > 256 && composerStartRestartGroup.changed(j2)) || (i9 & 384) == 256;
                                        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                        if (z2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue6 = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.position.views.CryptoPositionRowKt$$ExternalSyntheticLambda6
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return CryptoPositionRow3.m1907x69178147(j2, (DrawScope) obj);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        modifierDrawBehind2 = DrawModifierKt.drawBehind(modifierDrawBehind2, (Function1) objRememberedValue6);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    String string2 = StringResource2.getString(state.getLabel(), composerStartRestartGroup, StringResource.$stable);
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i12 = BentoTheme.$stable;
                                    BentoText2.m20747BentoText38GnDrw(string2, modifierDrawBehind2, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i12).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i12).getTextM(), composerStartRestartGroup, 0, 0, 8184);
                                    Modifier.Companion companion4 = companion;
                                    Spacer2.Spacer(Row5.weight$default(row6, companion4, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                                    BentoText2.m20748BentoTextQnj7Zds(state.getText(), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i12).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composerStartRestartGroup, i12).getTextM(), composerStartRestartGroup, 0, 0, 8186);
                                    textTrailingContent2 = state.getTextTrailingContent();
                                    composerStartRestartGroup.startReplaceGroup(1058822328);
                                    if (textTrailingContent2 == null) {
                                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion4, bentoTheme.getSpacing(composerStartRestartGroup, i12).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                                        if (!(textTrailingContent2 instanceof CryptoPositionRowState.TextTrailingContent.PieChart)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        float fMo5016toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(2));
                                        composerStartRestartGroup.startReplaceGroup(1058831933);
                                        float fMo5011toDpGaN1DYA = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5011toDpGaN1DYA(bentoTheme.getTypography(composerStartRestartGroup, i12).getTextM().m7662getFontSizeXSAIIZE());
                                        composerStartRestartGroup.endReplaceGroup();
                                        PieChart2.m11980PieChartcEmTA8(SizeKt.m5169size3ABfNKs(companion4, fMo5011toDpGaN1DYA), CollectionsKt.listOf(new Pie.Slice(((CryptoPositionRowState.TextTrailingContent.PieChart) textTrailingContent2).getPercentage(), bentoTheme.getColors(composerStartRestartGroup, i12).m21368getAccent0d7_KjU(), null, 4, null)), new Stroke(fMo5016toPx0680j_4, 0.0f, StrokeCap.INSTANCE.m6849getRoundKaPHkGw(), 0, null, 26, null), false, false, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i12).m21373getBg30d7_KjU()), 0.0f, 0.0f, composerStartRestartGroup, Pie.Slice.$stable << 3, EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                                        composer3 = composerStartRestartGroup;
                                    } else {
                                        composer3 = composerStartRestartGroup;
                                    }
                                    composer3.endReplaceGroup();
                                    composer3.endNode();
                                    composer3.endReplaceGroup();
                                    composer2 = composer3;
                                    function17 = function16;
                                    modifier4 = modifier2;
                                } else {
                                    row6 = row62;
                                    modifier6 = modifierWrapContentWidth$default;
                                }
                                modifierDrawBehind2 = modifier6;
                                composerStartRestartGroup.endReplaceGroup();
                                if (state.getShowDottedLabelUnderline()) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                if (state.getShowDottedLabelUnderline()) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                String string22 = StringResource2.getString(state.getLabel(), composerStartRestartGroup, StringResource.$stable);
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i122 = BentoTheme.$stable;
                                BentoText2.m20747BentoText38GnDrw(string22, modifierDrawBehind2, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i122).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i122).getTextM(), composerStartRestartGroup, 0, 0, 8184);
                                Modifier.Companion companion42 = companion;
                                Spacer2.Spacer(Row5.weight$default(row6, companion42, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                                BentoText2.m20748BentoTextQnj7Zds(state.getText(), null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i122).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, null, bentoTheme2.getTypography(composerStartRestartGroup, i122).getTextM(), composerStartRestartGroup, 0, 0, 8186);
                                textTrailingContent2 = state.getTextTrailingContent();
                                composerStartRestartGroup.startReplaceGroup(1058822328);
                                if (textTrailingContent2 == null) {
                                }
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                composer3.endReplaceGroup();
                                composer2 = composer3;
                                function17 = function16;
                                modifier4 = modifier2;
                            } else {
                                int i13 = i7;
                                Function0<Unit> function08 = function03;
                                composerStartRestartGroup.startReplaceGroup(-1205325819);
                                BentoDataRowDefaults bentoDataRowDefaults2 = BentoDataRowDefaults.INSTANCE;
                                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.m5155defaultMinSizeVpY3zN4$default(modifier2, 0.0f, bentoDataRowDefaults2.m20962getCondensedMinHeightD9Ej5fM(), 1, null), bentoDataRowDefaults2.m20963getCondensedVerticalPaddingD9Ej5fM(), composerStartRestartGroup, 0, 0);
                                Alignment.Companion companion5 = Alignment.INSTANCE;
                                Alignment.Horizontal start = companion5.getStart();
                                Arrangement arrangement2 = Arrangement.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement2.getTop(), start, composerStartRestartGroup, 48);
                                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
                                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor2);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy, companion6.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier2, companion6.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                composerStartRestartGroup.startReplaceGroup(1589722402);
                                composerStartRestartGroup.startReplaceGroup(1589690787);
                                composerStartRestartGroup.startReplaceGroup(1589667257);
                                Modifier.Companion companion7 = Modifier.INSTANCE;
                                Modifier modifierWrapContentWidth$default2 = SizeKt.wrapContentWidth$default(companion7, null, false, 3, null);
                                final CryptoPositionRowState.TooltipType tooltipType2 = state.getTooltipType();
                                if (tooltipType2 != null) {
                                    composerStartRestartGroup.startReplaceGroup(1589668847);
                                    if (!Intrinsics.areEqual(tooltipType2, CryptoPositionRowState.TooltipType.OptimizedCostReturnCalculations.INSTANCE)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                                    boolean zChanged3 = composerStartRestartGroup.changed(tooltipType2) | ((i13 & 458752) == 131072);
                                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                    if (zChanged3 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue7 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.position.views.CryptoPositionRowKt$$ExternalSyntheticLambda7
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CryptoPositionRow3.m1908xd1ca8767(function15, tooltipType2);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                    }
                                    Function0 function09 = (Function0) objRememberedValue7;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                                    boolean zChanged4 = composerStartRestartGroup.changed(tooltipType2) | ((i13 & 57344) == 16384);
                                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                    if (zChanged4 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue8 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.position.views.CryptoPositionRowKt$$ExternalSyntheticLambda8
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CryptoPositionRow3.m1909x325696d5(function16, tooltipType2);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    modifierDrawBehind = optimizedCostReturnCalculationsTooltip(modifierWrapContentWidth$default2, function09, (Function0) objRememberedValue8, function08, AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable), ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen());
                                    modifier3 = modifierWrapContentWidth$default2;
                                    function04 = function08;
                                    composerStartRestartGroup.endReplaceGroup();
                                    if (modifierDrawBehind == null) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    if (state.getShowDottedLabelUnderline()) {
                                        function17 = function16;
                                        modifier4 = modifier2;
                                        arrangement = arrangement2;
                                        function05 = function04;
                                        i8 = 48;
                                        z = true;
                                    } else {
                                        function17 = function16;
                                        modifier4 = modifier2;
                                        arrangement = arrangement2;
                                        i8 = 48;
                                        z = true;
                                        function05 = function04;
                                        modifierDrawBehind = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifierDrawBehind, false, null, null, function04, 7, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.TEXT_VIEW, state.getAnalyticsIdentifier(), null, 4, null), new ComponentHierarchy(new Component(Component.ComponentType.POSITION_SECTION, null, null, 6, null), null, null, null, null, 30, null), 15, null), false, false, false, true, false, null, 110, null);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    if (state.getShowDottedLabelUnderline()) {
                                        composerStartRestartGroup.startReplaceGroup(5004770);
                                        boolean z3 = ((((i13 & 896) ^ 384) <= 256 || !composerStartRestartGroup.changed(j2)) && (i13 & 384) != 256) ? false : z;
                                        Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                                        if (z3 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue9 = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.position.views.CryptoPositionRowKt$$ExternalSyntheticLambda9
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return CryptoPositionRow3.m1910xb84d37e1(j2, (DrawScope) obj);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        modifierDrawBehind = DrawModifierKt.drawBehind(modifierDrawBehind, (Function1) objRememberedValue9);
                                    }
                                    Modifier modifier7 = modifierDrawBehind;
                                    composerStartRestartGroup.endReplaceGroup();
                                    String string3 = StringResource2.getString(state.getLabel(), composerStartRestartGroup, StringResource.$stable);
                                    BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                    int i14 = BentoTheme.$stable;
                                    BentoText2.m20747BentoText38GnDrw(string3, modifier7, Color.m6701boximpl(bentoTheme3.getColors(composerStartRestartGroup, i14).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composerStartRestartGroup, i14).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme3.getSpacing(composerStartRestartGroup, i14).m21595getXsmallD9Ej5fM()), companion5.getCenterVertically(), composerStartRestartGroup, i8);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion7);
                                    Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                        composerStartRestartGroup.useNode();
                                    } else {
                                        composerStartRestartGroup.createNode(constructor3);
                                    }
                                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion6.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion6.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion6.getSetModifier());
                                    Row6 row63 = Row6.INSTANCE;
                                    BentoText2.m20748BentoTextQnj7Zds(state.getText(), null, Color.m6701boximpl(bentoTheme3.getColors(composerStartRestartGroup, i14).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, null, bentoTheme3.getTypography(composerStartRestartGroup, i14).getTextM(), composerStartRestartGroup, 0, 0, 8186);
                                    textTrailingContent = state.getTextTrailingContent();
                                    composerStartRestartGroup.startReplaceGroup(-1934919399);
                                    if (textTrailingContent instanceof CryptoPositionRowState.TextTrailingContent.PieChart) {
                                        composer2 = composerStartRestartGroup;
                                        if (textTrailingContent != null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    } else {
                                        float fMo5016toPx0680j_42 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(2));
                                        composerStartRestartGroup.startReplaceGroup(-1934912418);
                                        float fMo5011toDpGaN1DYA2 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5011toDpGaN1DYA(bentoTheme3.getTypography(composerStartRestartGroup, i14).getTextL().m7662getFontSizeXSAIIZE());
                                        composerStartRestartGroup.endReplaceGroup();
                                        PieChart2.m11980PieChartcEmTA8(SizeKt.m5169size3ABfNKs(companion7, fMo5011toDpGaN1DYA2), CollectionsKt.listOf(new Pie.Slice(((CryptoPositionRowState.TextTrailingContent.PieChart) textTrailingContent).getPercentage(), bentoTheme3.getColors(composerStartRestartGroup, i14).m21368getAccent0d7_KjU(), null, 4, null)), new Stroke(fMo5016toPx0680j_42, 0.0f, StrokeCap.INSTANCE.m6849getRoundKaPHkGw(), 0, null, 26, null), false, false, Color.m6701boximpl(bentoTheme3.getColors(composerStartRestartGroup, i14).m21373getBg30d7_KjU()), 0.0f, 0.0f, composerStartRestartGroup, Pie.Slice.$stable << 3, EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                                        composer2 = composerStartRestartGroup;
                                    }
                                    composer2.endReplaceGroup();
                                    composer2.endNode();
                                    composer2.endNode();
                                    composer2.endReplaceGroup();
                                } else {
                                    modifier3 = modifierWrapContentWidth$default2;
                                    function04 = function08;
                                }
                                modifierDrawBehind = modifier3;
                                composerStartRestartGroup.endReplaceGroup();
                                if (state.getShowDottedLabelUnderline()) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                if (state.getShowDottedLabelUnderline()) {
                                }
                                Modifier modifier72 = modifierDrawBehind;
                                composerStartRestartGroup.endReplaceGroup();
                                String string32 = StringResource2.getString(state.getLabel(), composerStartRestartGroup, StringResource.$stable);
                                BentoTheme bentoTheme32 = BentoTheme.INSTANCE;
                                int i142 = BentoTheme.$stable;
                                BentoText2.m20747BentoText38GnDrw(string32, modifier72, Color.m6701boximpl(bentoTheme32.getColors(composerStartRestartGroup, i142).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme32.getTypography(composerStartRestartGroup, i142).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                                MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme32.getSpacing(composerStartRestartGroup, i142).m21595getXsmallD9Ej5fM()), companion5.getCenterVertically(), composerStartRestartGroup, i8);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion7);
                                Function0<ComposeUiNode> constructor32 = companion6.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy22, companion6.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap32, companion6.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion6.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting()) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier32, companion6.getSetModifier());
                                    Row6 row632 = Row6.INSTANCE;
                                    BentoText2.m20748BentoTextQnj7Zds(state.getText(), null, Color.m6701boximpl(bentoTheme32.getColors(composerStartRestartGroup, i142).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, null, bentoTheme32.getTypography(composerStartRestartGroup, i142).getTextM(), composerStartRestartGroup, 0, 0, 8186);
                                    textTrailingContent = state.getTextTrailingContent();
                                    composerStartRestartGroup.startReplaceGroup(-1934919399);
                                    if (textTrailingContent instanceof CryptoPositionRowState.TextTrailingContent.PieChart) {
                                    }
                                    composer2.endReplaceGroup();
                                    composer2.endNode();
                                    composer2.endNode();
                                    composer2.endReplaceGroup();
                                }
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function18 = function17;
                            modifier5 = modifier4;
                            function06 = function05;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                        }
                        function15 = function14;
                        function03 = function02;
                        function16 = function13;
                        i7 = i3;
                        j2 = jM21426getFg20d7_KjU;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (state.isCondensed()) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function18 = function17;
                        modifier5 = modifier4;
                        function06 = function05;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier5 = modifier2;
                        function15 = function14;
                        j2 = jM21426getFg20d7_KjU;
                        function06 = function02;
                        function18 = function13;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.position.views.CryptoPositionRowKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CryptoPositionRow3.CryptoPositionRow_FU0evQE$lambda$31(state, modifier5, j2, function06, function18, function15, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                function13 = function1;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                if ((i3 & 74899) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                        }
                        if ((i2 & 4) != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 == 0) {
                            function15 = function14;
                            function03 = function02;
                            function16 = function13;
                            i7 = i3;
                            j2 = jM21426getFg20d7_KjU;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (state.isCondensed()) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function18 = function17;
                        modifier5 = modifier4;
                        function06 = function05;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function02 = function0;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            function13 = function1;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            if ((i3 & 74899) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function02 = function0;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        function13 = function1;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        if ((i3 & 74899) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPositionRow_FU0evQE$lambda$17$lambda$10$lambda$7$lambda$6(Function1 function1, CryptoPositionRowState.TooltipType tooltipType) {
        function1.invoke(tooltipType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPositionRow_FU0evQE$lambda$17$lambda$10$lambda$9$lambda$8(Function1 function1, CryptoPositionRowState.TooltipType tooltipType) {
        function1.invoke(tooltipType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoPositionRow_FU0evQE$lambda$17$lambda$14$lambda$13$lambda$12 */
    public static final Unit m1907x69178147(long j, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        float fMo5016toPx0680j_4 = drawBehind.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(1));
        float f = 2;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L)) - (fMo5016toPx0680j_4 / f)) - 8;
        DrawScope.m6951drawLineNGM6Ib0$default(drawBehind, j, Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L)), Offset.m6535constructorimpl((4294967295L & Float.floatToRawIntBits(fIntBitsToFloat)) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32))) << 32)), fMo5016toPx0680j_4, 0, PathEffect.INSTANCE.dashPathEffect(new float[]{drawBehind.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f)), drawBehind.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f))}, 0.0f), 0.0f, null, 0, 464, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoPositionRow_FU0evQE$lambda$30$lambda$26$lambda$25$lambda$24 */
    public static final Unit m1910xb84d37e1(long j, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        float fMo5016toPx0680j_4 = drawBehind.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(1));
        float f = 2;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L)) - (fMo5016toPx0680j_4 / f)) - 8;
        DrawScope.m6951drawLineNGM6Ib0$default(drawBehind, j, Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L)), Offset.m6535constructorimpl((4294967295L & Float.floatToRawIntBits(fIntBitsToFloat)) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32))) << 32)), fMo5016toPx0680j_4, 0, PathEffect.INSTANCE.dashPathEffect(new float[]{drawBehind.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f)), drawBehind.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f))}, 0.0f), 0.0f, null, 0, 464, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoPositionRow_FU0evQE$lambda$30$lambda$22$lambda$19$lambda$18 */
    public static final Unit m1908xd1ca8767(Function1 function1, CryptoPositionRowState.TooltipType tooltipType) {
        function1.invoke(tooltipType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoPositionRow_FU0evQE$lambda$30$lambda$22$lambda$21$lambda$20 */
    public static final Unit m1909x325696d5(Function1 function1, CryptoPositionRowState.TooltipType tooltipType) {
        function1.invoke(tooltipType);
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoPositionRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.ui.detail.position.views.CryptoPositionRowKt$optimizedCostReturnCalculationsTooltip$1 */
    static final class C134341 implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ Screen $eventScreen;
        final /* synthetic */ Function0<Unit> $onAppear;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ Function0<Unit> $onLinkClicked;

        C134341(EventLogger eventLogger, Screen screen, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
            this.$eventLogger = eventLogger;
            this.$eventScreen = screen;
            this.$onClick = function0;
            this.$onAppear = function02;
            this.$onLinkClicked = function03;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        public final Modifier invoke(Modifier composed, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceGroup(1227686914);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1227686914, i, -1, "com.robinhood.android.crypto.ui.detail.position.views.optimizedCostReturnCalculationsTooltip.<anonymous> (CryptoPositionRow.kt:279)");
            }
            PopupPositioning popupPositioning = PopupPositioning.ABOVE;
            Duration.Companion companion = Duration.INSTANCE;
            long duration = Duration3.toDuration(10, DurationUnitJvm.SECONDS);
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
            Boolean bool = Boolean.TRUE;
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventScreen) | composer.changed(this.$onClick);
            final EventLogger eventLogger = this.$eventLogger;
            final Screen screen = this.$eventScreen;
            final Function0<Unit> function0 = this.$onClick;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.position.views.CryptoPositionRowKt$optimizedCostReturnCalculationsTooltip$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoPositionRow3.C134341.invoke$lambda$1$lambda$0(eventLogger, screen, function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function02 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventScreen) | composer.changed(this.$onAppear);
            final EventLogger eventLogger2 = this.$eventLogger;
            final Screen screen2 = this.$eventScreen;
            final Function0<Unit> function03 = this.$onAppear;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.position.views.CryptoPositionRowKt$optimizedCostReturnCalculationsTooltip$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoPositionRow3.C134341.invoke$lambda$3$lambda$2(eventLogger2, screen2, function03);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierM26519popupTooltipBgaGok8 = PopupTooltipKt.m26519popupTooltipBgaGok8(composed, (16232 & 1) != 0 ? Boolean.TRUE : bool, (16232 & 2) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            } : function02, (16232 & 4) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            } : (Function0) objRememberedValue2, (16232 & 8) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            } : null, (16232 & 16) != 0 ? PopupPositioning.FREE : popupPositioning, (16232 & 32) != 0 ? null : Duration.m28726boximpl(duration), (16232 & 64) != 0 ? null : null, (16232 & 128) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 256) != 0, (16232 & 512) != 0 ? C2002Dp.m7995constructorimpl(0) : fM7995constructorimpl2, (16232 & 1024) != 0 ? C2002Dp.m7995constructorimpl(0) : fM7995constructorimpl, (16232 & 2048) != 0 ? null : null, (16232 & 4096) != 0 ? EnterTransition.INSTANCE.getNone() : null, (16232 & 8192) != 0 ? ExitTransition.INSTANCE.getNone() : null, ComposableLambda3.rememberComposableLambda(2009011747, true, new AnonymousClass3(this.$eventLogger, this.$eventScreen, this.$onLinkClicked), composer, 54));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierM26519popupTooltipBgaGok8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, Screen screen, Function0 function0) {
            EventLogger.DefaultImpls.logAppear$default(eventLogger, null, screen, new Component(Component.ComponentType.TOOLTIP, "calculation_updated", null, 4, null), new ComponentHierarchy(new Component(Component.ComponentType.TEXT_VIEW, "average_cost", null, 4, null), new Component(Component.ComponentType.POSITION_SECTION, null, null, 6, null), null, null, null, 28, null), null, 17, null);
            function0.invoke();
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoPositionRow.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.crypto.ui.detail.position.views.CryptoPositionRowKt$optimizedCostReturnCalculationsTooltip$1$3, reason: invalid class name */
        static final class AnonymousClass3 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ EventLogger $eventLogger;
            final /* synthetic */ Screen $eventScreen;
            final /* synthetic */ Function0<Unit> $onLinkClicked;

            AnonymousClass3(EventLogger eventLogger, Screen screen, Function0<Unit> function0) {
                this.$eventLogger = eventLogger;
                this.$eventScreen = screen;
                this.$onLinkClicked = function0;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2009011747, i, -1, "com.robinhood.android.crypto.ui.detail.position.views.optimizedCostReturnCalculationsTooltip.<anonymous>.<anonymous> (CryptoPositionRow.kt:302)");
                }
                Modifier modifierM5176widthInVpY3zN4$default = SizeKt.m5176widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, C2002Dp.m7995constructorimpl(280), 1, null);
                String strStringResource = StringResources_androidKt.stringResource(C12757R.string.crypto_position_avg_cost_return_optimized_tooltip_text, composer, 0);
                String strStringResource2 = StringResources_androidKt.stringResource(C12757R.string.crypto_position_avg_cost_return_optimized_tooltip_link_text, composer, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventScreen) | composer.changed(this.$onLinkClicked);
                final EventLogger eventLogger = this.$eventLogger;
                final Screen screen = this.$eventScreen;
                final Function0<Unit> function0 = this.$onLinkClicked;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.position.views.CryptoPositionRowKt$optimizedCostReturnCalculationsTooltip$1$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoPositionRow3.C134341.AnonymousClass3.invoke$lambda$1$lambda$0(eventLogger, screen, function0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(strStringResource, strStringResource2, (Function0) objRememberedValue, modifierM5176widthInVpY3zN4$default, jM21425getFg0d7_KjU, 0L, textM, 0, composer, 3072, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Screen screen, Function0 function0) {
                Component.ComponentType componentType = Component.ComponentType.TEXT_VIEW;
                EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(componentType, AnalyticsStrings.BUTTON_PROFIT_LOSS_CHART_LEARN_MORE, null, 4, null), new ComponentHierarchy(new Component(Component.ComponentType.TOOLTIP, "calculation_updated", null, 4, null), new Component(componentType, "average_cost", null, 4, null), new Component(Component.ComponentType.POSITION_SECTION, null, null, 6, null), null, null, 24, null), null, false, 49, null);
                function0.invoke();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Screen screen, Function0 function0) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(Component.ComponentType.TOOLTIP, "calculation_updated", null, 4, null), new ComponentHierarchy(new Component(Component.ComponentType.TEXT_VIEW, "average_cost", null, 4, null), new Component(Component.ComponentType.POSITION_SECTION, null, null, 6, null), null, null, null, 28, null), null, false, 49, null);
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    private static final Modifier optimizedCostReturnCalculationsTooltip(Modifier modifier, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, EventLogger eventLogger, Screen screen) {
        return ComposedModifier2.composed$default(modifier, null, new C134341(eventLogger, screen, function02, function0, function03), 1, null);
    }

    private static final void CryptoPositionRowPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(356774377);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(356774377, i, -1, "com.robinhood.android.crypto.ui.detail.position.views.CryptoPositionRowPreview (CryptoPositionRow.kt:365)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, BentoTheme4.POSITIVE, CryptoPositionRow.INSTANCE.getLambda$1351385393$feature_crypto_externalDebug(), composerStartRestartGroup, 113246208, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.position.views.CryptoPositionRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoPositionRow3.CryptoPositionRowPreview$lambda$32(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

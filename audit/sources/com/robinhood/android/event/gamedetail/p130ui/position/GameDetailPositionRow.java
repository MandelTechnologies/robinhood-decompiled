package com.robinhood.android.event.gamedetail.p130ui.position;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GameDetailPositionRow.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aH\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072'\b\u0002\u0010\b\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"EMPTY_PLACEHOLDER", "", "GameDetailPositionRow", "", "row", "Lcom/robinhood/android/event/gamedetail/ui/position/GameDetailPositionRowState;", "modifier", "Landroidx/compose/ui/Modifier;", "onPositionClick", "Lkotlin/Function1;", "Ljava/util/UUID;", "Lkotlin/ParameterName;", "name", "contractId", "(Lcom/robinhood/android/event/gamedetail/ui/position/GameDetailPositionRowState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.ui.position.GameDetailPositionRowKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class GameDetailPositionRow {
    private static final String EMPTY_PLACEHOLDER = "     ";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailPositionRow$lambda$4(GameDetailPositionRowState gameDetailPositionRowState, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        GameDetailPositionRow(gameDetailPositionRowState, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GameDetailPositionRow(final GameDetailPositionRowState row, Modifier modifier, Function1<? super UUID, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super UUID, Unit> function12;
        final Function1<? super UUID, Unit> function13;
        final Modifier modifier3;
        final Function1<? super UUID, Unit> function14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(row, "row");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1348508557);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(row) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    function12 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
                }
                if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    function13 = i4 == 0 ? null : function12;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1348508557, i3, -1, "com.robinhood.android.event.gamedetail.ui.position.GameDetailPositionRow (GameDetailPositionRow.kt:63)");
                    }
                    composerStartRestartGroup.startReplaceGroup(1163408534);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                    if (function13 == null) {
                        Modifier.Companion companion = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChanged = ((i3 & 14) == 4) | composerStartRestartGroup.changed(function13);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.position.GameDetailPositionRowKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return GameDetailPositionRow.GameDetailPositionRow$lambda$2$lambda$1$lambda$0(function13, row);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null);
                        Modifier modifier5 = modifierM4893clickableXHw0xAI$default == null ? modifierFillMaxWidth$default : modifierM4893clickableXHw0xAI$default;
                        composerStartRestartGroup.endReplaceGroup();
                        String loggingIdentifier = row.getLoggingIdentifier();
                        Component.ComponentType componentType = Component.ComponentType.ROW;
                        String loggingIdentifier2 = row.getLoggingIdentifier();
                        if (loggingIdentifier2 == null) {
                            loggingIdentifier2 = "";
                        }
                        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(ModifiersKt.autoLogEvents$default(modifier5, new UserInteractionEventDescriptor(loggingIdentifier, null, null, null, new Component(componentType, loggingIdentifier2, null, 4, null), null, 46, null), false, false, false, true, false, null, 110, null), row.getRowBackgroundColor(composerStartRestartGroup, i3 & 14), null, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
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
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        LocalShowPlaceholder.Loadable(row.isLoading(), null, null, ComposableLambda3.rememberComposableLambda(-431878791, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.position.GameDetailPositionRowKt$GameDetailPositionRow$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i6) {
                                if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-431878791, i6, -1, "com.robinhood.android.event.gamedetail.ui.position.GameDetailPositionRow.<anonymous>.<anonymous> (GameDetailPositionRow.kt:87)");
                                }
                                final GameDetailPositionRowState gameDetailPositionRowState = row;
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1031390262, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.position.GameDetailPositionRowKt$GameDetailPositionRow$2$1.1
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
                                            ComposerKt.traceEventStart(1031390262, i7, -1, "com.robinhood.android.event.gamedetail.ui.position.GameDetailPositionRow.<anonymous>.<anonymous>.<anonymous> (GameDetailPositionRow.kt:89)");
                                        }
                                        StringResource leftPrimary = gameDetailPositionRowState.getLeftPrimary();
                                        composer3.startReplaceGroup(-971400991);
                                        String string2 = leftPrimary == null ? null : StringResource2.getString(leftPrimary, composer3, StringResource.$stable);
                                        composer3.endReplaceGroup();
                                        if (string2 == null) {
                                            string2 = "     ";
                                        }
                                        BentoText2.m20747BentoText38GnDrw(string2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextM(), 0L, 0L, gameDetailPositionRowState.isLeftPrimaryTextBolded() ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer3, 0, 0, 8190);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54);
                                final GameDetailPositionRowState gameDetailPositionRowState2 = row;
                                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-2037911241, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.position.GameDetailPositionRowKt$GameDetailPositionRow$2$1.2
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
                                            ComposerKt.traceEventStart(-2037911241, i7, -1, "com.robinhood.android.event.gamedetail.ui.position.GameDetailPositionRow.<anonymous>.<anonymous>.<anonymous> (GameDetailPositionRow.kt:97)");
                                        }
                                        StringResource leftSecondary = gameDetailPositionRowState2.getLeftSecondary();
                                        if (leftSecondary != null) {
                                            String string2 = StringResource2.getString(leftSecondary, composer3, StringResource.$stable);
                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                            int i8 = BentoTheme.$stable;
                                            BentoText2.m20747BentoText38GnDrw(string2, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i8).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i8).getTextS(), composer3, 0, 0, 8186);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54);
                                final GameDetailPositionRowState gameDetailPositionRowState3 = row;
                                BentoBaseRowLayout.BentoBaseRowLayout(null, null, null, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, ComposableLambda3.rememberComposableLambda(-812245448, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.position.GameDetailPositionRowKt$GameDetailPositionRow$2$1.3
                                    public final void invoke(Composer composer3, int i7) {
                                        if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-812245448, i7, -1, "com.robinhood.android.event.gamedetail.ui.position.GameDetailPositionRow.<anonymous>.<anonymous>.<anonymous> (GameDetailPositionRow.kt:106)");
                                        }
                                        Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
                                        GameDetailPositionRowState gameDetailPositionRowState4 = gameDetailPositionRowState3;
                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, composer3, 48);
                                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, companion3);
                                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor2);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                        Column6 column62 = Column6.INSTANCE;
                                        String rightPrimary = gameDetailPositionRowState4.getRightPrimary();
                                        if (rightPrimary == null) {
                                            rightPrimary = "     ";
                                        }
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i8 = BentoTheme.$stable;
                                        TextStyle textM = bentoTheme.getTypography(composer3, i8).getTextM();
                                        long rightPrimaryColor = gameDetailPositionRowState4.getRightPrimaryColor(composer3, 0);
                                        BentoText2.m20747BentoText38GnDrw(rightPrimary, null, Color.m6701boximpl(rightPrimaryColor), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textM, composer3, 24576, 0, 8170);
                                        composer3.startReplaceGroup(1622468825);
                                        if (gameDetailPositionRowState4.getRightSecondary() != null) {
                                            BentoText2.m20747BentoText38GnDrw(StringResource2.getString(gameDetailPositionRowState4.getRightSecondary(), composer3, StringResource.$stable), null, Color.m6701boximpl(bentoTheme.getColors(composer3, i8).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i8).getTextS(), composer3, 0, 0, 8186);
                                        }
                                        composer3.endReplaceGroup();
                                        composer3.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }
                                }, composer2, 54), null, true, false, false, null, composer2, 12807168, 0, 1863);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        function14 = function13;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function14 = function12;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.ui.position.GameDetailPositionRowKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return GameDetailPositionRow.GameDetailPositionRow$lambda$4(row, modifier3, function14, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            function12 = function1;
            if ((i3 & 147) != 146) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(1163408534);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                if (function13 == null) {
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        function12 = function1;
        if ((i3 & 147) != 146) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailPositionRow$lambda$2$lambda$1$lambda$0(Function1 function1, GameDetailPositionRowState gameDetailPositionRowState) {
        function1.invoke(gameDetailPositionRowState.isSelected() ? null : gameDetailPositionRowState.getContractId());
        return Unit.INSTANCE;
    }
}

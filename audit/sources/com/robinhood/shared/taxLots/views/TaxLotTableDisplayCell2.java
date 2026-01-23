package com.robinhood.shared.taxLots.views;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.shared.taxLots.views.TaxLotDisplayCellState;
import com.robinhood.shared.taxLots.views.TaxLotTableDisplayCell2;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TaxLotTableDisplayCell.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a?\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001aQ\u0010\n\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"TaxLotTableDisplayCell", "", "T", "state", "Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState;", "onTapAction", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TextContent", "textContent", "Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState$TextContent;", "defaultTextColor", "Landroidx/compose/ui/graphics/Color;", "enabled", "", "TextContent-8V94_ZQ", "(Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState$TextContent;JLkotlin/jvm/functions/Function1;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TaxLotTableDisplayCellPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-lot-table-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.taxLots.views.TaxLotTableDisplayCellKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class TaxLotTableDisplayCell2 {

    /* compiled from: TaxLotTableDisplayCell.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.taxLots.views.TaxLotTableDisplayCellKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TaxLotDisplayCellState.ContentAlignment.values().length];
            try {
                iArr[TaxLotDisplayCellState.ContentAlignment.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TaxLotDisplayCellState.ContentAlignment.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotTableDisplayCell$lambda$5(TaxLotDisplayCellState taxLotDisplayCellState, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TaxLotTableDisplayCell(taxLotDisplayCellState, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotTableDisplayCellPreview$lambda$11(int i, Composer composer, int i2) {
        TaxLotTableDisplayCellPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextContent_8V94_ZQ$lambda$10(TaxLotDisplayCellState.TextContent textContent, long j, Function1 function1, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m25786TextContent8V94_ZQ(textContent, j, function1, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void TaxLotTableDisplayCell(final TaxLotDisplayCellState<T> state, final Function1<? super T, Unit> onTapAction, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final T tapAction;
        int i4;
        Alignment.Horizontal start;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onTapAction, "onTapAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(922050520);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTapAction) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(922050520, i3, -1, "com.robinhood.shared.taxLots.views.TaxLotTableDisplayCell (TaxLotTableDisplayCell.kt:28)");
                }
                composerStartRestartGroup.startReplaceGroup(1327294903);
                Modifier modifierM5176widthInVpY3zN4$default = SizeKt.m5176widthInVpY3zN4$default(modifier4, C2002Dp.m7995constructorimpl(90), 0.0f, 2, null);
                tapAction = state.getTapAction();
                if (tapAction != null) {
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSource2.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = ((i3 & 112) == 32) | composerStartRestartGroup.changedInstance(tapAction);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.taxLots.views.TaxLotTableDisplayCellKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TaxLotTableDisplayCell2.TaxLotTableDisplayCell$lambda$3$lambda$2$lambda$1(onTapAction, tapAction);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierM5176widthInVpY3zN4$default, interactionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                    if (modifierM4891clickableO2vRcR0$default != null) {
                        modifierM5176widthInVpY3zN4$default = modifierM4891clickableO2vRcR0$default;
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierM5176widthInVpY3zN4$default, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM());
                i4 = WhenMappings.$EnumSwitchMapping$0[state.getContentAlignment().ordinal()];
                if (i4 != 1) {
                    start = Alignment.INSTANCE.getStart();
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    start = Alignment.INSTANCE.getEnd();
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), start, composerStartRestartGroup, 6);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs);
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
                Column6 column6 = Column6.INSTANCE;
                int i7 = (i3 << 3) & 896;
                m25786TextContent8V94_ZQ(state.getPrimaryTextContent(), bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), onTapAction, state.getEnabled(), null, composerStartRestartGroup, i7, 16);
                composerStartRestartGroup.startReplaceGroup(1981257264);
                if (state.getSecondaryTextContent() != null) {
                    m25786TextContent8V94_ZQ(state.getSecondaryTextContent(), bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU(), onTapAction, state.getEnabled(), null, composerStartRestartGroup, i7, 16);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.taxLots.views.TaxLotTableDisplayCellKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TaxLotTableDisplayCell2.TaxLotTableDisplayCell$lambda$5(state, onTapAction, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1327294903);
            Modifier modifierM5176widthInVpY3zN4$default2 = SizeKt.m5176widthInVpY3zN4$default(modifier4, C2002Dp.m7995constructorimpl(90), 0.0f, 2, null);
            tapAction = state.getTapAction();
            if (tapAction != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            Modifier modifierM5142padding3ABfNKs2 = PaddingKt.m5142padding3ABfNKs(modifierM5176widthInVpY3zN4$default2, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM());
            i4 = WhenMappings.$EnumSwitchMapping$0[state.getContentAlignment().ordinal()];
            if (i4 != 1) {
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), start, composerStartRestartGroup, 6);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs2);
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
                Column6 column62 = Column6.INSTANCE;
                int i72 = (i3 << 3) & 896;
                m25786TextContent8V94_ZQ(state.getPrimaryTextContent(), bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU(), onTapAction, state.getEnabled(), null, composerStartRestartGroup, i72, 16);
                composerStartRestartGroup.startReplaceGroup(1981257264);
                if (state.getSecondaryTextContent() != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotTableDisplayCell$lambda$3$lambda$2$lambda$1(Function1 function1, Object obj) {
        function1.invoke(obj);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d1  */
    /* renamed from: TextContent-8V94_ZQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final <T> void m25786TextContent8V94_ZQ(final TaxLotDisplayCellState.TextContent<T> textContent, final long j, final Function1<? super T, Unit> function1, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z2;
        long jM21427getFg30d7_KjU;
        long jM21427getFg30d7_KjU2;
        int i4;
        Color colorM6701boximpl;
        Color colorM6701boximpl2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-573847364);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(textContent) : composerStartRestartGroup.changedInstance(textContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-573847364, i3, -1, "com.robinhood.shared.taxLots.views.TextContent (TaxLotTableDisplayCell.kt:70)");
                }
                Arrangement arrangement = Arrangement.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21595getXsmallD9Ej5fM()), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                String text = textContent.getText();
                TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i6).getTextS();
                if (z) {
                    z2 = false;
                    composerStartRestartGroup.startReplaceGroup(552869613);
                    jM21427getFg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21427getFg30d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(552776489);
                    TaxLotDisplayCellState.ColorOverride colorOverride = textContent.getColorOverride();
                    if (colorOverride == null) {
                        colorM6701boximpl2 = null;
                        z2 = false;
                    } else {
                        z2 = false;
                        colorM6701boximpl2 = Color.m6701boximpl(colorOverride.getBentoColor(composerStartRestartGroup, 0));
                    }
                    jM21427getFg30d7_KjU = colorM6701boximpl2 != null ? colorM6701boximpl2.getValue() : j;
                    composerStartRestartGroup.endReplaceGroup();
                }
                BentoText2.m20747BentoText38GnDrw(text, null, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS, composerStartRestartGroup, 0, 0, 8186);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.startReplaceGroup(1541858233);
                if (textContent.getTrailingIcon() != null) {
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    Composer.Companion companion3 = Composer.INSTANCE;
                    if (objRememberedValue == companion3.getEmpty()) {
                        objRememberedValue = InteractionSource2.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean z3 = true;
                    boolean z4 = (i3 & 896) == 256;
                    if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !composerStartRestartGroup.changedInstance(textContent))) {
                        z3 = false;
                    }
                    boolean z5 = z4 | z3;
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z5 || objRememberedValue2 == companion3.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.taxLots.views.TaxLotTableDisplayCellKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TaxLotTableDisplayCell2.TextContent_8V94_ZQ$lambda$9$lambda$8$lambda$7(function1, textContent);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(companion2, interactionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                    BentoIcon4 icon = textContent.getTrailingIcon().getIcon();
                    if (z) {
                        composerStartRestartGroup.startReplaceGroup(553401883);
                        TaxLotDisplayCellState.ColorOverride colorOverride2 = textContent.getTrailingIcon().getColorOverride();
                        composerStartRestartGroup.startReplaceGroup(1541874122);
                        if (colorOverride2 == null) {
                            colorM6701boximpl = null;
                            i4 = 0;
                        } else {
                            i4 = 0;
                            colorM6701boximpl = Color.m6701boximpl(colorOverride2.getBentoColor(composerStartRestartGroup, 0));
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        if (colorM6701boximpl == null) {
                            TaxLotDisplayCellState.ColorOverride colorOverride3 = textContent.getColorOverride();
                            colorM6701boximpl = colorOverride3 == null ? null : Color.m6701boximpl(colorOverride3.getBentoColor(composerStartRestartGroup, i4));
                        }
                        jM21427getFg30d7_KjU2 = colorM6701boximpl != null ? colorM6701boximpl.getValue() : j;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(553600965);
                        jM21427getFg30d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i6).m21427getFg30d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    BentoIcon2.m20644BentoIconFU0evQE(icon, null, jM21427getFg30d7_KjU2, modifierM4891clickableO2vRcR0$default, null, false, composerStartRestartGroup, BentoIcon4.$stable | 48, 48);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.taxLots.views.TaxLotTableDisplayCellKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TaxLotTableDisplayCell2.TextContent_8V94_ZQ$lambda$10(textContent, j, function1, z, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Arrangement arrangement2 = Arrangement.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21595getXsmallD9Ej5fM()), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion4.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                String text2 = textContent.getText();
                TextStyle textS2 = bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextS();
                if (z) {
                }
                BentoText2.m20747BentoText38GnDrw(text2, null, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS2, composerStartRestartGroup, 0, 0, 8186);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.startReplaceGroup(1541858233);
                if (textContent.getTrailingIcon() != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextContent_8V94_ZQ$lambda$9$lambda$8$lambda$7(Function1 function1, TaxLotDisplayCellState.TextContent textContent) {
        function1.invoke(textContent.getTrailingIcon().getTapAction());
        return Unit.INSTANCE;
    }

    /* compiled from: TaxLotTableDisplayCell.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.taxLots.views.TaxLotTableDisplayCellKt$TaxLotTableDisplayCellPreview$1 */
    static final class C400841 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ List<TaxLotDisplayCellState<Unit>> $rowStates;

        C400841(List<TaxLotDisplayCellState<Unit>> list) {
            this.$rowStates = list;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(654359563, i, -1, "com.robinhood.shared.taxLots.views.TaxLotTableDisplayCellPreview.<anonymous> (TaxLotTableDisplayCell.kt:175)");
            }
            List<TaxLotDisplayCellState<Unit>> list = this.$rowStates;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            composer.startReplaceGroup(-1911666550);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                TaxLotDisplayCellState taxLotDisplayCellState = (TaxLotDisplayCellState) it.next();
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, Color.INSTANCE.m6719getDarkGray0d7_KjU(), null, 2, null);
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.taxLots.views.TaxLotTableDisplayCellKt$TaxLotTableDisplayCellPreview$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TaxLotTableDisplayCell2.C400841.invoke$lambda$3$lambda$2$lambda$1$lambda$0((Unit) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                TaxLotTableDisplayCell2.TaxLotTableDisplayCell(taxLotDisplayCellState, (Function1) objRememberedValue, modifierM4872backgroundbw27NRU$default, composer, BentoIcon4.$stable | 432, 0);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2$lambda$1$lambda$0(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void TaxLotTableDisplayCellPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-119727021);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-119727021, i, -1, "com.robinhood.shared.taxLots.views.TaxLotTableDisplayCellPreview (TaxLotTableDisplayCell.kt:150)");
            }
            int i2 = 6;
            DefaultConstructorMarker defaultConstructorMarker = null;
            TaxLotDisplayCellState.IconContent iconContent = null;
            TaxLotDisplayCellState taxLotDisplayCellState = new TaxLotDisplayCellState(new TaxLotDisplayCellState.TextContent("5/1/23", null, null, 6, null), new TaxLotDisplayCellState.TextContent("Long-term", 0 == true ? 1 : 0, iconContent, i2, defaultConstructorMarker), TaxLotDisplayCellState.ContentAlignment.START, null, false, 24, null);
            TaxLotDisplayCellState.TextContent textContent = new TaxLotDisplayCellState.TextContent("$1,831.73", 0 == true ? 1 : 0, iconContent, i2, defaultConstructorMarker);
            TaxLotDisplayCellState.ContentAlignment contentAlignment = TaxLotDisplayCellState.ContentAlignment.END;
            TaxLotDisplayCellState taxLotDisplayCellState2 = new TaxLotDisplayCellState(textContent, null, contentAlignment, iconContent, false, 26, null);
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            TaxLotDisplayCellState.TextContent textContent2 = null;
            TaxLotDisplayCellState.ColorOverride colorOverride = null;
            boolean z = false;
            TaxLotDisplayCellState.TextContent textContent3 = null;
            boolean z2 = false;
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(654359563, true, new C400841(CollectionsKt.listOf((Object[]) new TaxLotDisplayCellState[]{taxLotDisplayCellState, taxLotDisplayCellState2, new TaxLotDisplayCellState(new TaxLotDisplayCellState.TextContent("+$1,528.86", TaxLotDisplayCellState.ColorOverride.POSITIVE, 0 == true ? 1 : 0, 4, defaultConstructorMarker2), textContent2, contentAlignment, colorOverride, z, 26, defaultConstructorMarker2), new TaxLotDisplayCellState(new TaxLotDisplayCellState.TextContent("2.92", colorOverride, null, 6, defaultConstructorMarker2), textContent3, contentAlignment, colorOverride, z2, 26, defaultConstructorMarker2)})), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.taxLots.views.TaxLotTableDisplayCellKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaxLotTableDisplayCell2.TaxLotTableDisplayCellPreview$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

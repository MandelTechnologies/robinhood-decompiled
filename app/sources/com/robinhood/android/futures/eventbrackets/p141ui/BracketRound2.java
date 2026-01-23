package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BracketRound.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aZ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001a)\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"BracketRound", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/futures/eventbrackets/ui/BracketRoundData;", "visibleRoundIndex", "", "offsetPercentage", "", "hasOutChannel", "", "onCardClick", "Lkotlin/Function1;", "Ljava/util/UUID;", "Lkotlin/ParameterName;", "name", "cardId", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/futures/eventbrackets/ui/BracketRoundData;IFZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SpacerWithOutChannel", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "thickness", "Landroidx/compose/ui/unit/Dp;", "SpacerWithOutChannel-vJenqF0", "(JFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-event-brackets_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketRoundKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BracketRound2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BracketRound$lambda$4(BracketRoundData bracketRoundData, int i, float f, boolean z, Function1 function1, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        BracketRound(bracketRoundData, i, f, z, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpacerWithOutChannel_vJenqF0$lambda$7(long j, float f, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m14638SpacerWithOutChannelvJenqF0(j, f, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BracketRound(final BracketRoundData data, final int i, final float f, final boolean z, final Function1<? super UUID, Unit> onCardClick, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        boolean z2;
        Modifier modifier4;
        int i5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onCardClick, "onCardClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1758312710);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(data) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onCardClick) ? 16384 : 8192;
        }
        int i6 = i3 & 32;
        if (i6 == 0) {
            if ((196608 & i2) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i4) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1758312710, i4, -1, "com.robinhood.android.futures.eventbrackets.ui.BracketRound (BracketRound.kt:37)");
                }
                Modifier modifierThen = modifier5.then(i != 0 ? Alpha.alpha(Modifier.INSTANCE, 1 - f) : Modifier.INSTANCE);
                int i7 = 0;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                boolean z3 = i <= 0;
                composerStartRestartGroup.startReplaceGroup(1447461990);
                int i8 = 0;
                for (BracketGameOverviewCardData bracketGameOverviewCardData : data.getCards()) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    final BracketGameOverviewCardData bracketGameOverviewCardData2 = bracketGameOverviewCardData;
                    int i10 = i8 % 2 == 0 ? 1 : i7;
                    composerStartRestartGroup.startReplaceGroup(1447463652);
                    if (z3 && i10 != 0) {
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BracketHeightCalculationUtils.topSpacerCardHeight(i, f)), composerStartRestartGroup, i7);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1447474325);
                    if (!z3 || !z) {
                        z2 = z3;
                        modifier4 = modifier5;
                        i5 = i7;
                    } else if (i10 == 0) {
                        composerStartRestartGroup.startReplaceGroup(-324142575);
                        modifier4 = modifier5;
                        z2 = z3;
                        m14638SpacerWithOutChannelvJenqF0(BracketStyle.INSTANCE.getBorderColor(composerStartRestartGroup, 6), C2002Dp.m7995constructorimpl(1), SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BracketHeightCalculationUtils.midOutChannelSpacerHeight(i, f)), composerStartRestartGroup, 48, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i5 = 0;
                    } else {
                        z2 = z3;
                        modifier4 = modifier5;
                        if (i8 > 1) {
                            composerStartRestartGroup.startReplaceGroup(-323709660);
                            i5 = 0;
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BracketHeightCalculationUtils.groupGapsSpacerHeight(i, f)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            i5 = 0;
                            composerStartRestartGroup.startReplaceGroup(-323536680);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BracketMatchOverviewCardWithChannels3 bracketMatchOverviewCardWithChannels3 = !z ? null : i10 != 0 ? BracketMatchOverviewCardWithChannels3.DOWN : BracketMatchOverviewCardWithChannels3.f4154UP;
                    float f2 = i == 1 ? 1 - f : 1.0f;
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    int i11 = ((57344 & i4) == 16384 ? 1 : i5) | (composerStartRestartGroup.changed(bracketGameOverviewCardData2) ? 1 : 0);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (i11 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketRoundKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return BracketRound2.BracketRound$lambda$3$lambda$2$lambda$1$lambda$0(onCardClick, bracketGameOverviewCardData2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z4 = z2;
                    int i12 = i5;
                    Composer composer2 = composerStartRestartGroup;
                    BracketMatchOverviewCardWithChannels.BracketMatchOverviewCardWithChannels(z4, bracketMatchOverviewCardWithChannels3, bracketGameOverviewCardData2, f2, function0, null, composer2, 0, 32);
                    z3 = z4;
                    composerStartRestartGroup = composer2;
                    i8 = i9;
                    modifier5 = modifier4;
                    i7 = i12;
                }
                Modifier modifier6 = modifier5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketRoundKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BracketRound2.BracketRound$lambda$4(data, i, f, z, onCardClick, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 196608;
        modifier2 = modifier;
        if ((74899 & i4) == 74898) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierThen2 = modifier5.then(i != 0 ? Alpha.alpha(Modifier.INSTANCE, 1 - f) : Modifier.INSTANCE);
            int i72 = 0;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                if (i <= 0) {
                }
                composerStartRestartGroup.startReplaceGroup(1447461990);
                int i82 = 0;
                while (r17.hasNext()) {
                }
                Modifier modifier62 = modifier5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier62;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BracketRound$lambda$3$lambda$2$lambda$1$lambda$0(Function1 function1, BracketGameOverviewCardData bracketGameOverviewCardData) {
        function1.invoke(bracketGameOverviewCardData.getCardId());
        return Unit.INSTANCE;
    }

    /* renamed from: SpacerWithOutChannel-vJenqF0, reason: not valid java name */
    private static final void m14638SpacerWithOutChannelvJenqF0(final long j, final float f, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(651647426);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(651647426, i3, -1, "com.robinhood.android.futures.eventbrackets.ui.SpacerWithOutChannel (BracketRound.kt:94)");
            }
            Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(modifier, BracketMatchOverviewCardWithChannels.getTotalCardWidthWithChannels());
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketRoundKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BracketRound2.SpacerWithOutChannel_vJenqF0$lambda$6$lambda$5(f, j, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Spacer2.Spacer(DrawModifierKt.drawBehind(modifierM5174width3ABfNKs, (Function1) objRememberedValue), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketRoundKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BracketRound2.SpacerWithOutChannel_vJenqF0$lambda$7(j, f, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpacerWithOutChannel_vJenqF0$lambda$6$lambda$5(float f, long j, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        float fMo5016toPx0680j_4 = drawBehind.mo5016toPx0680j_4(f);
        long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L));
        DrawScope.m6951drawLineNGM6Ib0$default(drawBehind, j, jM6535constructorimpl, Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), fMo5016toPx0680j_4, 0, null, 0.0f, null, 0, 496, null);
        return Unit.INSTANCE;
    }
}

package com.robinhood.android.investFlow.search.item;

import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.investFlow.search.item.DiscoveryItemViewState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: DiscoveryCards.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001aC\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a0\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\n2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0010H\u0003¢\u0006\u0002\u0010\u0011\u001a\f\u0010\u0016\u001a\u00020\n*\u00020\nH\u0002\u001a/\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u001b\u001a\u0017\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u001f\u001a\u0017\u0010 \u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u001f\"\u0014\u0010\u0012\u001a\u00020\u00138CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u000e\u0010\u001c\u001a\u00020\u001dX\u0082T¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"InvestFlowHorizontalCards", "", "cardList", "Lkotlinx/collections/immutable/ImmutableList;", "Ljava/util/UUID;", "selectedIds", "callbacks", "Lcom/robinhood/android/investFlow/search/item/DiscoveryItemCallbacks;", "sectionListId", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/investFlow/search/item/DiscoveryItemCallbacks;Ljava/util/UUID;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "InvestFlowCardCarousel", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "CardShape", "Landroidx/compose/ui/graphics/Shape;", "getCardShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "cardSize", "InvestFlowCard", "state", "Lcom/robinhood/android/investFlow/search/item/DiscoveryItemViewState;", "listId", "(Lcom/robinhood/android/investFlow/search/item/DiscoveryItemViewState;Ljava/util/UUID;Lcom/robinhood/android/investFlow/search/item/DiscoveryItemCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PlaceholderCardCount", "", "InvestFlowPlaceholderCardCarousel", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "InvestFlowPlaceholderCard", "feature-invest-flow_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investFlow.search.item.DiscoveryCardsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class DiscoveryCards3 {
    private static final int PlaceholderCardCount = 4;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestFlowCard$lambda$5(DiscoveryItemViewState discoveryItemViewState, UUID uuid, DiscoveryItems discoveryItems, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InvestFlowCard(discoveryItemViewState, uuid, discoveryItems, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestFlowCardCarousel$lambda$4(Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        InvestFlowCardCarousel(modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestFlowHorizontalCards$lambda$3(ImmutableList immutableList, ImmutableList immutableList2, DiscoveryItems discoveryItems, UUID uuid, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InvestFlowHorizontalCards(immutableList, immutableList2, discoveryItems, uuid, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestFlowPlaceholderCard$lambda$9(Modifier modifier, int i, int i2, Composer composer, int i3) {
        InvestFlowPlaceholderCard(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestFlowPlaceholderCardCarousel$lambda$8(Modifier modifier, int i, int i2, Composer composer, int i3) {
        InvestFlowPlaceholderCardCarousel(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void InvestFlowHorizontalCards(final ImmutableList<UUID> cardList, final ImmutableList<UUID> selectedIds, final DiscoveryItems callbacks, final UUID sectionListId, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(cardList, "cardList");
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(sectionListId, "sectionListId");
        Composer composerStartRestartGroup = composer.startRestartGroup(1398635908);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(cardList) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(selectedIds) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(sectionListId) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1398635908, i3, -1, "com.robinhood.android.investFlow.search.item.InvestFlowHorizontalCards (DiscoveryCards.kt:41)");
            }
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(cardList) | composerStartRestartGroup.changedInstance(selectedIds) | composerStartRestartGroup.changedInstance(sectionListId) | ((i3 & 896) == 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(callbacks)));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.investFlow.search.item.DiscoveryCardsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DiscoveryCards3.InvestFlowHorizontalCards$lambda$2$lambda$1(cardList, selectedIds, sectionListId, callbacks, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            InvestFlowCardCarousel(modifier3, (Function1) objRememberedValue, composerStartRestartGroup, (i3 >> 12) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investFlow.search.item.DiscoveryCardsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DiscoveryCards3.InvestFlowHorizontalCards$lambda$3(cardList, selectedIds, callbacks, sectionListId, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void InvestFlowCardCarousel(final Modifier modifier, final Function1<? super LazyListScope, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1727491410);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1727491410, i3, -1, "com.robinhood.android.investFlow.search.item.InvestFlowCardCarousel (DiscoveryCards.kt:59)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM());
            Modifier modifier2 = modifier;
            LazyDslKt.LazyRow(modifier2, null, PaddingKt.m5137PaddingValuesYgX7TsA$default(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), false, horizontalOrVerticalM5089spacedBy0680j_4, null, null, false, null, function1, composerStartRestartGroup, (i3 & 14) | ((i3 << 24) & 1879048192), 490);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investFlow.search.item.DiscoveryCardsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DiscoveryCards3.InvestFlowCardCarousel$lambda$4(modifier, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @JvmName
    private static final Shape getCardShape(Composer composer, int i) {
        composer.startReplaceGroup(-632537811);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-632537811, i, -1, "com.robinhood.android.investFlow.search.item.<get-CardShape> (DiscoveryCards.kt:72)");
        }
        RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return roundedCornerShapeM5327RoundedCornerShape0680j_4;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InvestFlowCard(final DiscoveryItemViewState state, final UUID listId, final DiscoveryItems callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(141034458);
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
            i3 |= composerStartRestartGroup.changedInstance(listId) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(141034458, i3, -1, "com.robinhood.android.investFlow.search.item.InvestFlowCard (DiscoveryCards.kt:85)");
                }
                int i5 = i3 & 14;
                CardKt.m5548CardFjzlyU(ModifiersKt.bentoPlaceholder(DiscoveryItems3.discoveryItemClickable(Clip.clip(cardSize(modifier4), getCardShape(composerStartRestartGroup, 0)), state, listId, callbacks), state instanceof DiscoveryItemViewState.Loading, getCardShape(composerStartRestartGroup, 0)), getCardShape(composerStartRestartGroup, 0), DiscoveryItems3.getBackgroundColor(state, composerStartRestartGroup, i5), 0L, BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), DiscoveryItems3.getBorderColor(state, composerStartRestartGroup, i5)), 0.0f, ComposableLambda3.rememberComposableLambda(1414096509, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investFlow.search.item.DiscoveryCardsKt.InvestFlowCard.1
                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1414096509, i6, -1, "com.robinhood.android.investFlow.search.item.InvestFlowCard.<anonymous> (DiscoveryCards.kt:103)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM());
                        DiscoveryItemViewState discoveryItemViewState = state;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5142padding3ABfNKs);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getCenterVertically(), composer2, 54);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        String symbol = discoveryItemViewState.getSymbol();
                        FontWeight.Companion companion4 = FontWeight.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(symbol, null, null, null, companion4.getBold(), null, null, 0, false, 1, 0, null, 0, null, composer2, 805330944, 0, 15854);
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.BUBBLE_CHECKED_24), discoveryItemViewState.getSelected() ? "checked" : null, bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU(), Alpha.alpha(companion, discoveryItemViewState.getSelected() ? 1.0f : 0.0f), null, false, composer2, BentoIcon4.Size24.$stable, 48);
                        composer2.endNode();
                        Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer2, 0);
                        BentoText2.m20747BentoText38GnDrw(discoveryItemViewState.getName(), null, null, null, null, null, null, 0, false, 2, 0, null, 0, null, composer2, 805306368, 0, 15870);
                        BentoText2.m20747BentoText38GnDrw(discoveryItemViewState.getPrice(), null, null, null, companion4.getBold(), null, null, 0, false, 1, 0, null, 0, null, composer2, 805330944, 0, 15854);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 40);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investFlow.search.item.DiscoveryCardsKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DiscoveryCards3.InvestFlowCard$lambda$5(state, listId, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i52 = i3 & 14;
            CardKt.m5548CardFjzlyU(ModifiersKt.bentoPlaceholder(DiscoveryItems3.discoveryItemClickable(Clip.clip(cardSize(modifier4), getCardShape(composerStartRestartGroup, 0)), state, listId, callbacks), state instanceof DiscoveryItemViewState.Loading, getCardShape(composerStartRestartGroup, 0)), getCardShape(composerStartRestartGroup, 0), DiscoveryItems3.getBackgroundColor(state, composerStartRestartGroup, i52), 0L, BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), DiscoveryItems3.getBorderColor(state, composerStartRestartGroup, i52)), 0.0f, ComposableLambda3.rememberComposableLambda(1414096509, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investFlow.search.item.DiscoveryCardsKt.InvestFlowCard.1
                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1414096509, i6, -1, "com.robinhood.android.investFlow.search.item.InvestFlowCard.<anonymous> (DiscoveryCards.kt:103)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM());
                    DiscoveryItemViewState discoveryItemViewState = state;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5142padding3ABfNKs);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getCenterVertically(), composer2, 54);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    String symbol = discoveryItemViewState.getSymbol();
                    FontWeight.Companion companion4 = FontWeight.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(symbol, null, null, null, companion4.getBold(), null, null, 0, false, 1, 0, null, 0, null, composer2, 805330944, 0, 15854);
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.BUBBLE_CHECKED_24), discoveryItemViewState.getSelected() ? "checked" : null, bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU(), Alpha.alpha(companion, discoveryItemViewState.getSelected() ? 1.0f : 0.0f), null, false, composer2, BentoIcon4.Size24.$stable, 48);
                    composer2.endNode();
                    Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer2, 0);
                    BentoText2.m20747BentoText38GnDrw(discoveryItemViewState.getName(), null, null, null, null, null, null, 0, false, 2, 0, null, 0, null, composer2, 805306368, 0, 15870);
                    BentoText2.m20747BentoText38GnDrw(discoveryItemViewState.getPrice(), null, null, null, companion4.getBold(), null, null, 0, false, 1, 0, null, 0, null, composer2, 805330944, 0, 15854);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 40);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final Modifier cardSize(Modifier modifier) {
        return SizeKt.m5171sizeVpY3zN4(modifier, C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE));
    }

    public static final void InvestFlowPlaceholderCardCarousel(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1036827696);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1036827696, i3, -1, "com.robinhood.android.investFlow.search.item.InvestFlowPlaceholderCardCarousel (DiscoveryCards.kt:142)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.investFlow.search.item.DiscoveryCardsKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DiscoveryCards3.InvestFlowPlaceholderCardCarousel$lambda$7$lambda$6((LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            InvestFlowCardCarousel(modifier, (Function1) objRememberedValue, composerStartRestartGroup, (i3 & 14) | 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investFlow.search.item.DiscoveryCardsKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DiscoveryCards3.InvestFlowPlaceholderCardCarousel$lambda$8(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestFlowPlaceholderCardCarousel$lambda$7$lambda$6(LazyListScope InvestFlowCardCarousel) {
        Intrinsics.checkNotNullParameter(InvestFlowCardCarousel, "$this$InvestFlowCardCarousel");
        LazyListScope.items$default(InvestFlowCardCarousel, 4, null, null, DiscoveryCards.INSTANCE.m15519getLambda$168728465$feature_invest_flow_externalDebug(), 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InvestFlowPlaceholderCard(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1019555920);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1019555920, i3, -1, "com.robinhood.android.investFlow.search.item.InvestFlowPlaceholderCard (DiscoveryCards.kt:155)");
            }
            BoxKt.Box(ModifiersKt.bentoPlaceholder(cardSize(modifier), true, getCardShape(composerStartRestartGroup, 0)), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investFlow.search.item.DiscoveryCardsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DiscoveryCards3.InvestFlowPlaceholderCard$lambda$9(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestFlowHorizontalCards$lambda$2$lambda$1(final ImmutableList immutableList, final ImmutableList immutableList2, final UUID uuid, final DiscoveryItems discoveryItems, LazyListScope InvestFlowCardCarousel) {
        Intrinsics.checkNotNullParameter(InvestFlowCardCarousel, "$this$InvestFlowCardCarousel");
        final C19404x36eaea9e c19404x36eaea9e = new Function1() { // from class: com.robinhood.android.investFlow.search.item.DiscoveryCardsKt$InvestFlowHorizontalCards$lambda$2$lambda$1$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(UUID uuid2) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((UUID) obj);
            }
        };
        InvestFlowCardCarousel.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.investFlow.search.item.DiscoveryCardsKt$InvestFlowHorizontalCards$lambda$2$lambda$1$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c19404x36eaea9e.invoke(immutableList.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.investFlow.search.item.DiscoveryCardsKt$InvestFlowHorizontalCards$lambda$2$lambda$1$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                UUID uuid2 = (UUID) immutableList.get(i);
                composer.startReplaceGroup(2021353234);
                DiscoveryItems3.DiscoveryItem(uuid2, immutableList2, uuid, DiscoveryItems2.Card, discoveryItems, null, null, composer, 3072, 96);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}

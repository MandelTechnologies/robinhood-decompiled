package com.robinhood.shared.cards.compose;

import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.material3.SwipeToDismissBoxKt;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.material3.SwipeToDismissBoxValue;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Scale2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.shared.cards.compose.SwipeableStackState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SwipeableStackComposable.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001av\u0010\u000f\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072/\u0010\u000e\u001a+\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0017²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002²\u0006\f\u0010\u0013\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0014\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0016\u001a\u00020\u00158\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/shared/cards/compose/SwipeableStackState$CardInStack;", "T", "Lcom/robinhood/shared/cards/compose/SwipeableStackState;", "state", "Lkotlin/Function1;", "", "onCardDismissed", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function4;", "Landroidx/compose/foundation/layout/RowScope;", "", "Lkotlin/Function0;", "Lkotlin/ExtensionFunctionType;", "cardContentAtIndex", "SwipeableStackComposable", "(Lcom/robinhood/shared/cards/compose/SwipeableStackState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function6;Landroidx/compose/runtime/Composer;II)V", "", "scale", "isDismissable", "isNotDismissed", "Landroidx/compose/ui/unit/Dp;", "offsetY", "lib-cards-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.cards.compose.SwipeableStackComposableKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class SwipeableStackComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeableStackComposable$lambda$15(SwipeableStackState swipeableStackState, Function1 function1, Modifier modifier, Function6 function6, int i, int i2, Composer composer, int i3) {
        SwipeableStackComposable(swipeableStackState, function1, modifier, function6, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends SwipeableStackState.CardInStack> void SwipeableStackComposable(final SwipeableStackState<T> state, final Function1<? super T, Unit> onCardDismissed, Modifier modifier, final Function6<? super Row5, ? super T, ? super Boolean, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function6, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        SnapshotState4 snapshotState4;
        Continuation continuation;
        int i5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function6<? super Row5, ? super T, ? super Boolean, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> cardContentAtIndex = function6;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onCardDismissed, "onCardDismissed");
        Intrinsics.checkNotNullParameter(cardContentAtIndex, "cardContentAtIndex");
        Composer composerStartRestartGroup = composer.startRestartGroup(1301467977);
        int i6 = 4;
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
            i3 |= composerStartRestartGroup.changedInstance(onCardDismissed) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(cardContentAtIndex) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1301467977, i4, -1, "com.robinhood.shared.cards.compose.SwipeableStackComposable (SwipeableStackComposable.kt:41)");
                }
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                composerStartRestartGroup.startReplaceGroup(-714095385);
                int i8 = 0;
                for (T t : state.getUndismissedItems()) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    final T t2 = t;
                    boolean zIsTopCard = state.isTopCard(i8);
                    float fPositionFromTopAfterDismissals = state.positionFromTopAfterDismissals(i8);
                    Modifier modifier5 = modifier4;
                    Composer composer3 = composerStartRestartGroup;
                    final SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(1.0f - (state.getHiddenCardScale() * fPositionFromTopAfterDismissals), null, 0.0f, "cardScaleAnimationLabel", null, composer3, 3072, 22);
                    composer3.startReplaceGroup(1849434622);
                    Object objRememberedValue2 = composer3.rememberedValue();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objRememberedValue2 == companion2.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.cards.compose.SwipeableStackComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(SwipeableStackComposable3.SwipeableStackComposable$lambda$14$lambda$13$lambda$2$lambda$1(snapshotState4AnimateFloatAsState));
                            }
                        });
                        composer3.updateRememberedValue(objRememberedValue2);
                    }
                    final SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue2;
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer3.changedInstance(t2);
                    Object objRememberedValue3 = composer3.rememberedValue();
                    if (zChangedInstance || objRememberedValue3 == companion2.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.cards.compose.SwipeableStackComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(SwipeableStackComposable3.SwipeableStackComposable$lambda$14$lambda$13$lambda$5$lambda$4(t2, snapshotState42, (SwipeToDismissBoxValue) obj));
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    Function1 function1 = (Function1) objRememberedValue3;
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(5004770);
                    boolean z = (i4 & 14) == i6 || ((i4 & 8) != 0 && composer3.changedInstance(state));
                    Object objRememberedValue4 = composer3.rememberedValue();
                    if (z || objRememberedValue4 == companion2.getEmpty()) {
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.cards.compose.SwipeableStackComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Float.valueOf(SwipeableStackComposable3.SwipeableStackComposable$lambda$14$lambda$13$lambda$7$lambda$6(state, ((Float) obj).floatValue()));
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue4);
                    }
                    composer3.endReplaceGroup();
                    final SwipeToDismissBoxState swipeToDismissBoxStateRememberSwipeToDismissBoxState = SwipeToDismissBoxKt.rememberSwipeToDismissBoxState(null, function1, (Function1) objRememberedValue4, composer3, 0, 1);
                    Composer composer4 = composer3;
                    composer4.startReplaceGroup(1849434622);
                    Object objRememberedValue5 = composer4.rememberedValue();
                    if (objRememberedValue5 == companion2.getEmpty()) {
                        objRememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.cards.compose.SwipeableStackComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(SwipeableStackComposable3.SwipeableStackComposable$lambda$14$lambda$13$lambda$9$lambda$8(swipeToDismissBoxStateRememberSwipeToDismissBoxState));
                            }
                        });
                        composer4.updateRememberedValue(objRememberedValue5);
                    }
                    SnapshotState4 snapshotState43 = (SnapshotState4) objRememberedValue5;
                    composer4.endReplaceGroup();
                    composer4.startReplaceGroup(-714059260);
                    if (SwipeableStackComposable$lambda$14$lambda$13$lambda$10(snapshotState43)) {
                        snapshotState4 = snapshotState43;
                        i5 = i4;
                        CoroutineScope coroutineScope2 = coroutineScope;
                        coroutineScope = coroutineScope2;
                        continuation = null;
                        SwipeToDismissBoxKt.SwipeToDismissBox(swipeToDismissBoxStateRememberSwipeToDismissBoxState, SwipeableStackComposable.INSTANCE.getLambda$2044217549$lib_cards_compose_externalDebug(), Scale2.scale(OffsetKt.m5125offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, SwipeableStackComposable$lambda$14$lambda$13$lambda$11(AnimateAsState.m4812animateDpAsStateAjpBEmI(C2002Dp.m7995constructorimpl(state.m24787getVerticalSpacingBetweenCardsD9Ej5fM() * fPositionFromTopAfterDismissals), null, "cardOffsetYAnimationLabel", null, composer4, 384, 10)), 1, null), SwipeableStackComposable$lambda$14$lambda$13$lambda$0(snapshotState4AnimateFloatAsState)), false, false, false, ComposableLambda3.rememberComposableLambda(-1880559000, true, new SwipeableStackComposable4(cardContentAtIndex, t2, zIsTopCard, coroutineScope2, swipeToDismissBoxStateRememberSwipeToDismissBoxState), composer4, 54), composer4, SwipeToDismissBoxState.$stable | 1572912, 56);
                        composer4 = composer4;
                    } else {
                        snapshotState4 = snapshotState43;
                        continuation = null;
                        i5 = i4;
                    }
                    composer4.endReplaceGroup();
                    String id = t2.getId();
                    Boolean boolValueOf = Boolean.valueOf(SwipeableStackComposable$lambda$14$lambda$13$lambda$10(snapshotState4));
                    composer4.startReplaceGroup(-1746271574);
                    boolean zChangedInstance2 = ((i5 & 112) == 32) | composer4.changedInstance(t2);
                    Object objRememberedValue6 = composer4.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue6 == companion2.getEmpty()) {
                        objRememberedValue6 = new SwipeableStackComposable6(onCardDismissed, t2, snapshotState4, continuation);
                        composer4.updateRememberedValue(objRememberedValue6);
                    }
                    composer4.endReplaceGroup();
                    EffectsKt.LaunchedEffect(id, boolValueOf, (Function2) objRememberedValue6, composer4, 0);
                    cardContentAtIndex = function6;
                    composerStartRestartGroup = composer4;
                    i8 = i9;
                    modifier4 = modifier5;
                    i4 = i5;
                    i6 = 4;
                }
                Modifier modifier6 = modifier4;
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.cards.compose.SwipeableStackComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SwipeableStackComposable3.SwipeableStackComposable$lambda$15(state, onCardDismissed, modifier3, function6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        i4 = i3;
        if ((i4 & 1171) == 1170) {
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                CoroutineScope coroutineScope3 = (CoroutineScope) objRememberedValue;
                composerStartRestartGroup.startReplaceGroup(-714095385);
                int i82 = 0;
                while (r16.hasNext()) {
                }
                Modifier modifier62 = modifier4;
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier62;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SwipeableStackComposable$lambda$14$lambda$13$lambda$2$lambda$1(SnapshotState4 snapshotState4) {
        return SwipeableStackComposable$lambda$14$lambda$13$lambda$0(snapshotState4) == 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SwipeableStackComposable$lambda$14$lambda$13$lambda$5$lambda$4(SwipeableStackState.CardInStack cardInStack, SnapshotState4 snapshotState4, SwipeToDismissBoxValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return SwipeableStackComposable$lambda$14$lambda$13$lambda$3(snapshotState4) && !cardInStack.isFixed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SwipeableStackComposable$lambda$14$lambda$13$lambda$7$lambda$6(SwipeableStackState swipeableStackState, float f) {
        return f * swipeableStackState.getCardThreshold();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SwipeableStackComposable$lambda$14$lambda$13$lambda$9$lambda$8(SwipeToDismissBoxState swipeToDismissBoxState) {
        return (swipeToDismissBoxState.getCurrentValue() == SwipeToDismissBoxValue.StartToEnd || swipeToDismissBoxState.getCurrentValue() == SwipeToDismissBoxValue.EndToStart) ? false : true;
    }

    private static final float SwipeableStackComposable$lambda$14$lambda$13$lambda$0(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SwipeableStackComposable$lambda$14$lambda$13$lambda$10(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final float SwipeableStackComposable$lambda$14$lambda$13$lambda$11(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    private static final boolean SwipeableStackComposable$lambda$14$lambda$13$lambda$3(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }
}

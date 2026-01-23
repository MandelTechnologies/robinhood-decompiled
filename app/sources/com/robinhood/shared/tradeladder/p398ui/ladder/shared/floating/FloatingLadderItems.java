package com.robinhood.shared.tradeladder.p398ui.ladder.shared.floating;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.shared.tradeladder.p398ui.ladder.animations.LadderAnimations2;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.OrderPillData;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.floating.FloatingLadderItems;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FloatingLadderItems.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aq\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017H\u0003¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001d²\u0006\f\u0010\u001b\u001a\u00020\u00018\nX\u008a\u0084\u0002²\u0006\f\u0010\u001c\u001a\u00020\u00018\nX\u008a\u0084\u0002"}, m3636d2 = {"Landroidx/compose/foundation/layout/BoxScope;", "", "fadedOut", "isFloatingLastPriceVisible", "isFloatingLastPriceOnTop", "Lcom/robinhood/utils/resource/StringResource;", "lastPriceLabel", "", "lastPriceIndex", "marketClosedHeader", "l2DataUnavailableHeader", "instrumentHaltedHeader", "Landroidx/compose/foundation/lazy/LazyListState;", "ladderLazyListState", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/OrderPillData;", "offscreenOrders", "", "FloatingLadderItems", "(Landroidx/compose/foundation/layout/BoxScope;ZZZLcom/robinhood/utils/resource/StringResource;ILcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Landroidx/compose/foundation/lazy/LazyListState;Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/runtime/Composer;II)V", "isVisible", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "content", "FloatingHeaderAnimatedVisibilityContent", "(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "isFloatingMessageVisibleOnTop", "isFloatingMessageVisibleOnBottom", "lib-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingLadderItemsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class FloatingLadderItems {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingHeaderAnimatedVisibilityContent$lambda$6(boolean z, Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        FloatingHeaderAnimatedVisibilityContent(z, modifier, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingLadderItems$lambda$5(BoxScope boxScope, boolean z, boolean z2, boolean z3, StringResource stringResource, int i, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, LazyListState lazyListState, ImmutableList immutableList, int i2, int i3, Composer composer, int i4) {
        FloatingLadderItems(boxScope, z, z2, z3, stringResource, i, stringResource2, stringResource3, stringResource4, lazyListState, immutableList, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void FloatingLadderItems(final BoxScope boxScope, final boolean z, final boolean z2, final boolean z3, final StringResource lastPriceLabel, final int i, final StringResource stringResource, StringResource stringResource2, StringResource stringResource3, LazyListState lazyListState, ImmutableList<OrderPillData> immutableList, Composer composer, final int i2, final int i3) {
        int i4;
        final StringResource stringResource4;
        final StringResource stringResource5;
        final ImmutableList<OrderPillData> immutableList2;
        Composer composer2;
        int i5;
        BoxScope boxScope2 = boxScope;
        boolean z4 = z;
        StringResource stringResource6 = stringResource2;
        final LazyListState ladderLazyListState = lazyListState;
        Intrinsics.checkNotNullParameter(boxScope2, "<this>");
        Intrinsics.checkNotNullParameter(lastPriceLabel, "lastPriceLabel");
        Intrinsics.checkNotNullParameter(ladderLazyListState, "ladderLazyListState");
        Composer composerStartRestartGroup = composer.startRestartGroup(784431970);
        int i6 = (i2 & 6) == 0 ? (composerStartRestartGroup.changed(boxScope2) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(z4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i6 |= (32768 & i2) == 0 ? composerStartRestartGroup.changed(lastPriceLabel) : composerStartRestartGroup.changedInstance(lastPriceLabel) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 = i;
            i6 |= composerStartRestartGroup.changed(i4) ? 131072 : 65536;
        } else {
            i4 = i;
        }
        if ((i2 & 1572864) == 0) {
            i6 |= (i2 & 2097152) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i6 |= (i2 & 16777216) == 0 ? composerStartRestartGroup.changed(stringResource6) : composerStartRestartGroup.changedInstance(stringResource6) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i6 |= (i2 & 134217728) == 0 ? composerStartRestartGroup.changed(stringResource3) : composerStartRestartGroup.changedInstance(stringResource3) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i6 |= composerStartRestartGroup.changed(ladderLazyListState) ? 536870912 : 268435456;
        }
        int i7 = (i3 & 6) == 0 ? i3 | ((i3 & 8) == 0 ? composerStartRestartGroup.changed(immutableList) : composerStartRestartGroup.changedInstance(immutableList) ? 4 : 2) : i3;
        if ((i6 & 306783379) != 306783378 || (i7 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(784431970, i6, i7, "com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingLadderItems (FloatingLadderItems.kt:35)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            if (stringResource3 == null) {
                composerStartRestartGroup.startReplaceGroup(96425035);
                if (stringResource6 == null) {
                    composerStartRestartGroup.startReplaceGroup(96458794);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    Modifier modifierAlign = boxScope2.align(companion, z3 ? companion2.getTopCenter() : companion2.getBottomCenter());
                    int i8 = i6;
                    C410091 c410091 = new C410091(lastPriceLabel, z3, coroutineScope, ladderLazyListState, i4);
                    ladderLazyListState = ladderLazyListState;
                    composer2 = composerStartRestartGroup;
                    stringResource4 = stringResource3;
                    immutableList2 = immutableList;
                    FloatingHeaderAnimatedVisibilityContent(z2, modifierAlign, ComposableLambda3.rememberComposableLambda(-1072728216, true, c410091, composerStartRestartGroup, 54), composer2, ((i8 >> 6) & 14) | 384, 0);
                    composer2.startReplaceGroup(-2075073133);
                    if (z2) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                        FloatingHeaderAnimatedVisibilityContent(stringResource != null, companion, ComposableLambda3.rememberComposableLambda(472367149, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingLadderItemsKt.FloatingLadderItems.2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i9) {
                                if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(472367149, i9, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingLadderItems.<anonymous> (FloatingLadderItems.kt:64)");
                                }
                                if (stringResource != null) {
                                    FloatingLadderHeader.FloatingLadderHeader(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CLOCK_16), stringResource, null, composer3, BentoIcon4.Size16.$stable | (StringResource.$stable << 3), 4);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 432, 0);
                    }
                    composer2.endReplaceGroup();
                    SnapshotState4 snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf((!(z2 && z3) && stringResource == null) ? i5 : 1), composer2, i5);
                    SnapshotState4 snapshotState4RememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf((!z2 || z3) ? i5 : 1), composer2, i5);
                    if (immutableList2 != null) {
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList2, 10));
                        for (final OrderPillData orderPillData : immutableList2) {
                            boolean z5 = !z4;
                            boolean zFloatingLadderItems$lambda$0 = FloatingLadderItems$lambda$0(snapshotState4RememberUpdatedState);
                            boolean zFloatingLadderItems$lambda$1 = FloatingLadderItems$lambda$1(snapshotState4RememberUpdatedState2);
                            composer2.startReplaceGroup(-1746271574);
                            boolean zChangedInstance = ((i8 & 1879048192) == 536870912) | composer2.changedInstance(coroutineScope) | composer2.changedInstance(orderPillData);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingLadderItemsKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return FloatingLadderItems.FloatingLadderItems$lambda$4$lambda$3$lambda$2(coroutineScope, orderPillData, ladderLazyListState);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceGroup();
                            ArrayList arrayList2 = arrayList;
                            Composer composer3 = composer2;
                            FloatingLadderOffScreenOrderPillKt.FloatingLadderOffScreenOrderPill(boxScope2, orderPillData, z5, zFloatingLadderItems$lambda$0, zFloatingLadderItems$lambda$1, (Function0) objRememberedValue2, composer3, (i8 & 14) | (StringResource.$stable << 3));
                            composer2 = composer3;
                            arrayList2.add(Unit.INSTANCE);
                            boxScope2 = boxScope;
                            z4 = z;
                            stringResource6 = stringResource6;
                            arrayList = arrayList2;
                        }
                    }
                    stringResource5 = stringResource6;
                    composer2.endReplaceGroup();
                } else {
                    stringResource4 = stringResource3;
                    stringResource5 = stringResource6;
                    immutableList2 = immutableList;
                    composerStartRestartGroup.startReplaceGroup(99326108);
                    FloatingHeaderAnimatedVisibilityContent(true, Modifier.INSTANCE, ComposableLambda3.rememberComposableLambda(-802180033, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingLadderItemsKt.FloatingLadderItems.4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i9) {
                            if ((i9 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-802180033, i9, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingLadderItems.<anonymous> (FloatingLadderItems.kt:107)");
                            }
                            FloatingLadderHeader.FloatingLadderHeader(new BentoIcon4.Size16(ServerToBentoAssetMapper2.TRIANGLE_ALERT_16), stringResource5, null, composer4, BentoIcon4.Size16.$stable | (StringResource.$stable << 3), 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 438, 0);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                    Unit unit = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
            } else {
                stringResource4 = stringResource3;
                stringResource5 = stringResource6;
                immutableList2 = immutableList;
                composerStartRestartGroup.startReplaceGroup(99689893);
                FloatingHeaderAnimatedVisibilityContent(true, Modifier.INSTANCE, ComposableLambda3.rememberComposableLambda(535034362, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingLadderItemsKt.FloatingLadderItems.5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                        invoke(composer4, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer4, int i9) {
                        if ((i9 & 3) == 2 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(535034362, i9, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingLadderItems.<anonymous> (FloatingLadderItems.kt:118)");
                        }
                        FloatingLadderHeader.FloatingLadderHeader(new BentoIcon4.Size16(ServerToBentoAssetMapper2.TRIANGLE_ALERT_16), stringResource4, null, composer4, BentoIcon4.Size16.$stable | (StringResource.$stable << 3), 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 438, 0);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            stringResource4 = stringResource3;
            stringResource5 = stringResource6;
            composer2 = composerStartRestartGroup;
            immutableList2 = immutableList;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final StringResource stringResource7 = stringResource5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingLadderItemsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FloatingLadderItems.FloatingLadderItems$lambda$5(boxScope, z, z2, z3, lastPriceLabel, i, stringResource, stringResource7, stringResource4, ladderLazyListState, immutableList2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: FloatingLadderItems.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingLadderItemsKt$FloatingLadderItems$1 */
    static final class C410091 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ CoroutineScope $coroutineScope;
        final /* synthetic */ boolean $isFloatingLastPriceOnTop;
        final /* synthetic */ LazyListState $ladderLazyListState;
        final /* synthetic */ int $lastPriceIndex;
        final /* synthetic */ StringResource $lastPriceLabel;

        C410091(StringResource stringResource, boolean z, CoroutineScope coroutineScope, LazyListState lazyListState, int i) {
            this.$lastPriceLabel = stringResource;
            this.$isFloatingLastPriceOnTop = z;
            this.$coroutineScope = coroutineScope;
            this.$ladderLazyListState = lazyListState;
            this.$lastPriceIndex = i;
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
                ComposerKt.traceEventStart(-1072728216, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingLadderItems.<anonymous> (FloatingLadderItems.kt:44)");
            }
            StringResource stringResource = this.$lastPriceLabel;
            boolean z = this.$isFloatingLastPriceOnTop;
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(this.$coroutineScope) | composer.changed(this.$ladderLazyListState) | composer.changed(this.$lastPriceIndex);
            final CoroutineScope coroutineScope = this.$coroutineScope;
            final LazyListState lazyListState = this.$ladderLazyListState;
            final int i2 = this.$lastPriceIndex;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingLadderItemsKt$FloatingLadderItems$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FloatingLadderItems.C410091.invoke$lambda$1$lambda$0(coroutineScope, lazyListState, i2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            FloatingLastPrice4.FloatingLastPrice(stringResource, z, ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null), composer, StringResource.$stable, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(CoroutineScope coroutineScope, LazyListState lazyListState, int i) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FloatingLadderItems2(lazyListState, i, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    private static final boolean FloatingLadderItems$lambda$0(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final boolean FloatingLadderItems$lambda$1(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingLadderItems$lambda$4$lambda$3$lambda$2(CoroutineScope coroutineScope, OrderPillData orderPillData, LazyListState lazyListState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FloatingLadderItems3(orderPillData, lazyListState, null), 3, null);
        return Unit.INSTANCE;
    }

    private static final void FloatingHeaderAnimatedVisibilityContent(boolean z, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final boolean z2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-599889020);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-599889020, i3, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingHeaderAnimatedVisibilityContent (FloatingLadderItems.kt:131)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(z, modifier2, LadderAnimations2.getLadderFadeInAnimation(), LadderAnimations2.getLadderFadeOutAnimation(), (String) null, ComposableLambda3.rememberComposableLambda(-606250068, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingLadderItemsKt.FloatingHeaderAnimatedVisibilityContent.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                    invoke(animatedVisibilityScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-606250068, i5, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingHeaderAnimatedVisibilityContent.<anonymous> (FloatingLadderItems.kt:138)");
                    }
                    function2.invoke(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 200064 | (i3 & 112), 16);
            z2 = z;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            z2 = z;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingLadderItemsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FloatingLadderItems.FloatingHeaderAnimatedVisibilityContent$lambda$6(z2, modifier3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

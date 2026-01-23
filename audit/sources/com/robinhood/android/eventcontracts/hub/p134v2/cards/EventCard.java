package com.robinhood.android.eventcontracts.hub.p134v2.cards;

import androidx.compose.animation.AnimationModifier;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.graphics.TransformOrigin;
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
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.eventcontracts.hub.p134v2.cards.EventCard;
import com.robinhood.android.eventcontracts.hub.p134v2.home.HubDefaultCategoryContentViewState2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EventCard.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a^\u0010\u0010\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00028\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00040\tH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006#²\u0006\u0014\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00078\n@\nX\u008a\u008e\u0002²\u0006\u0012\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\u001b\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001c\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002²\u0006\u0012\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u001f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\"\u001a\u00020!8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/home/HubCardComponent;", "componentState", "Landroidx/compose/ui/Modifier;", "modifier", "", "EventCard", "(Lcom/robinhood/android/eventcontracts/hub/v2/home/HubCardComponent;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "STATE", "state", "Lkotlin/Function1;", "", "contentKey", "Lkotlin/ParameterName;", "name", "targetState", "content", "FlipBox", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "PreviewCardFlip", "(Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/animation/core/TweenSpec;", "", "animationSpec", "Landroidx/compose/animation/core/TweenSpec;", "halfProgressRotationDegrees", "F", "currentState", "currentKey", "targetKey", "flipRotation", "alpha", "Lkotlin/Function0;", "reset", "", "isFront", "feature-hub-v2_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.cards.EventCardKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventCard {
    private static final TweenSpec<Float> animationSpec = AnimationSpecKt.tween$default(333, 0, new CubicBezierEasing(0.33f, 0.0f, 0.0f, 1.0f), 2, null);
    private static final float halfProgressRotationDegrees = 90.0f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventCard$lambda$2(HubDefaultCategoryContentViewState2 hubDefaultCategoryContentViewState2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EventCard(hubDefaultCategoryContentViewState2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlipBox$lambda$27(Object obj, Function1 function1, Modifier modifier, Function3 function3, int i, int i2, Composer composer, int i3) {
        FlipBox(obj, function1, modifier, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewCardFlip$lambda$33(int i, Composer composer, int i2) {
        PreviewCardFlip(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void EventCard(HubDefaultCategoryContentViewState2 componentState, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final HubDefaultCategoryContentViewState2 hubDefaultCategoryContentViewState2;
        Intrinsics.checkNotNullParameter(componentState, "componentState");
        Composer composerStartRestartGroup = composer.startRestartGroup(2055963466);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(componentState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            hubDefaultCategoryContentViewState2 = componentState;
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2055963466, i3, -1, "com.robinhood.android.eventcontracts.hub.v2.cards.EventCard (EventCard.kt:36)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.EventCardKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EventCard.EventCard$lambda$1$lambda$0((HubDefaultCategoryContentViewState2) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            hubDefaultCategoryContentViewState2 = componentState;
            FlipBox(hubDefaultCategoryContentViewState2, (Function1) objRememberedValue, null, ComposableLambda3.rememberComposableLambda(-842098302, true, new Function3<HubDefaultCategoryContentViewState2, Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.EventCardKt.EventCard.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(HubDefaultCategoryContentViewState2 hubDefaultCategoryContentViewState22, Composer composer2, Integer num) {
                    invoke(hubDefaultCategoryContentViewState22, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(HubDefaultCategoryContentViewState2 targetState, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(targetState, "targetState");
                    if ((i5 & 6) == 0) {
                        i5 |= composer2.changed(targetState) ? 4 : 2;
                    }
                    if ((i5 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-842098302, i5, -1, "com.robinhood.android.eventcontracts.hub.v2.cards.EventCard.<anonymous> (EventCard.kt:41)");
                    }
                    if (targetState instanceof FinalEventCardViewState) {
                        composer2.startReplaceGroup(-1802613387);
                        FinalEventCard.FinalEventCard((FinalEventCardViewState) targetState, modifier, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (targetState instanceof LiveEventCardViewState) {
                        composer2.startReplaceGroup(-1802607552);
                        LiveEventCardKt.LiveEventCard((LiveEventCardViewState) targetState, modifier, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (targetState instanceof UpcomingEventCardViewState) {
                        composer2.startReplaceGroup(-1802601896);
                        UpcomingEventCard.UpcomingEventCard((UpcomingEventCardViewState) targetState, modifier, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-45956640);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.EventCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventCard.EventCard$lambda$2(hubDefaultCategoryContentViewState2, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object EventCard$lambda$1$lambda$0(HubDefaultCategoryContentViewState2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Reflection.getOrCreateKotlinClass(it.getClass());
    }

    /* compiled from: EventCard.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.eventcontracts.hub.v2.cards.EventCardKt$PreviewCardFlip$2 */
    static final class C165362 implements Function3<Boolean, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<Boolean> $isFront$delegate;

        C165362(SnapshotState<Boolean> snapshotState) {
            this.$isFront$delegate = snapshotState;
        }

        public final void invoke(boolean z, Composer composer, int i) {
            int i2;
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(z) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(484457786, i2, -1, "com.robinhood.android.eventcontracts.hub.v2.cards.PreviewCardFlip.<anonymous> (EventCard.kt:150)");
            }
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(100)), z ? Color.INSTANCE.m6724getRed0d7_KjU() : Color.INSTANCE.m6717getBlue0d7_KjU(), null, 2, null);
            composer.startReplaceGroup(5004770);
            final SnapshotState<Boolean> snapshotState = this.$isFront$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.EventCardKt$PreviewCardFlip$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EventCard.C165362.invoke$lambda$1$lambda$0(snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM4872backgroundbw27NRU$default, false, null, null, (Function0) objRememberedValue, 7, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4893clickableXHw0xAI$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.m6028Text4IGK_g("123", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Composer composer, Integer num) {
            invoke(bool.booleanValue(), composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
            EventCard.PreviewCardFlip$lambda$30(snapshotState, !EventCard.PreviewCardFlip$lambda$29(snapshotState));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0211  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final <STATE> void FlipBox(final STATE state, final Function1<? super STATE, ? extends Object> function1, Modifier modifier, final Function3<? super STATE, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        SnapshotState4 snapshotState4;
        Object objRememberedValue3;
        SnapshotState4 snapshotState42;
        Object objRememberedValue4;
        final SnapshotFloatState2 snapshotFloatState2;
        Object objRememberedValue5;
        Object objRememberedValue6;
        SnapshotState4 snapshotState43;
        SnapshotFloatState2 snapshotFloatState22;
        SnapshotState snapshotState;
        final boolean z;
        boolean zChanged;
        Object objRememberedValue7;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object eventCard2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(133148876);
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
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(133148876, i3, -1, "com.robinhood.android.eventcontracts.hub.v2.cards.FlipBox (EventCard.kt:78)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(state, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                int i5 = i3 & 8;
                final SnapshotState4 snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(state, composerStartRestartGroup, i3 & 14);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.EventCardKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EventCard.FlipBox$lambda$8$lambda$7(function1, snapshotState2);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotState4 = (SnapshotState4) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.EventCardKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EventCard.FlipBox$lambda$11$lambda$10(function1, snapshotState4RememberUpdatedState);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                snapshotState42 = (SnapshotState4) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotFloatState3.mutableFloatStateOf(1.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                final SnapshotFloatState2 snapshotFloatState23 = (SnapshotFloatState2) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.EventCardKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EventCard.FlipBox$lambda$20$lambda$19(snapshotFloatState2, snapshotFloatState23);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState4 snapshotState4RememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState((Function0) objRememberedValue6, composerStartRestartGroup, 6);
                if (Intrinsics.areEqual(snapshotState4.getValue(), snapshotState42.getValue())) {
                    composerStartRestartGroup.startReplaceGroup(-1910904144);
                    Object value = snapshotState42.getValue();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    boolean zChanged2 = composerStartRestartGroup.changed(snapshotState4RememberUpdatedState2) | composerStartRestartGroup.changed(snapshotState4RememberUpdatedState);
                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue8 == companion.getEmpty()) {
                        eventCard2 = new EventCard2(snapshotState4RememberUpdatedState2, snapshotFloatState2, snapshotFloatState23, snapshotState4RememberUpdatedState, snapshotState2, null);
                        snapshotFloatState22 = snapshotFloatState23;
                        snapshotState43 = snapshotState4RememberUpdatedState;
                        snapshotState = snapshotState2;
                        composerStartRestartGroup.updateRememberedValue(eventCard2);
                    } else {
                        eventCard2 = objRememberedValue8;
                        snapshotState43 = snapshotState4RememberUpdatedState;
                        snapshotFloatState22 = snapshotFloatState23;
                        snapshotState = snapshotState2;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(value, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) eventCard2, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    snapshotState43 = snapshotState4RememberUpdatedState;
                    snapshotFloatState22 = snapshotFloatState23;
                    snapshotState = snapshotState2;
                    composerStartRestartGroup.startReplaceGroup(-1910450521);
                    Unit unit = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChanged3 = composerStartRestartGroup.changed(snapshotState43) | composerStartRestartGroup.changed(snapshotState4RememberUpdatedState2);
                    Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3 || objRememberedValue9 == companion.getEmpty()) {
                        objRememberedValue9 = new EventCard3(snapshotState43, snapshotState, snapshotState4RememberUpdatedState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue9, composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                }
                z = snapshotFloatState2.getFloatValue() < halfProgressRotationDegrees;
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChanged = composerStartRestartGroup.changed(z);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue7 == companion.getEmpty()) {
                    final SnapshotFloatState2 snapshotFloatState24 = snapshotFloatState22;
                    objRememberedValue7 = new Function1() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.EventCardKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return EventCard.FlipBox$lambda$25$lambda$24(z, snapshotFloatState2, snapshotFloatState24, (GraphicsLayerScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierAnimateContentSize$default = AnimationModifier.animateContentSize$default(GraphicsLayerModifier6.graphicsLayer(modifier2, (Function1) objRememberedValue7), null, null, 3, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAnimateContentSize$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function3.invoke((!Intrinsics.areEqual(snapshotState4.getValue(), snapshotState42.getValue()) || z) ? (Object) snapshotState43.getValue() : (Object) snapshotState.getValue(), composerStartRestartGroup, Integer.valueOf(((i3 >> 6) & 112) | i5));
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier3 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.EventCardKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EventCard.FlipBox$lambda$27(state, function1, modifier3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
        if ((i3 & 1171) == 1170) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotState snapshotState22 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            int i52 = i3 & 8;
            final SnapshotState4 snapshotState4RememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(state, composerStartRestartGroup, i3 & 14);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            snapshotState4 = (SnapshotState4) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            snapshotState42 = (SnapshotState4) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
            }
            snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
            }
            final SnapshotFloatState2 snapshotFloatState232 = (SnapshotFloatState2) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            SnapshotState4 snapshotState4RememberUpdatedState22 = SnapshotStateKt.rememberUpdatedState((Function0) objRememberedValue6, composerStartRestartGroup, 6);
            if (Intrinsics.areEqual(snapshotState4.getValue(), snapshotState42.getValue())) {
            }
            if (snapshotFloatState2.getFloatValue() < halfProgressRotationDegrees) {
            }
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChanged = composerStartRestartGroup.changed(z);
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                final SnapshotFloatState2 snapshotFloatState242 = snapshotFloatState22;
                objRememberedValue7 = new Function1() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.EventCardKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EventCard.FlipBox$lambda$25$lambda$24(z, snapshotFloatState2, snapshotFloatState242, (GraphicsLayerScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierAnimateContentSize$default2 = AnimationModifier.animateContentSize$default(GraphicsLayerModifier6.graphicsLayer(modifier2, (Function1) objRememberedValue7), null, null, 3, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAnimateContentSize$default2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    if (Intrinsics.areEqual(snapshotState4.getValue(), snapshotState42.getValue())) {
                        function3.invoke((!Intrinsics.areEqual(snapshotState4.getValue(), snapshotState42.getValue()) || z) ? (Object) snapshotState43.getValue() : (Object) snapshotState.getValue(), composerStartRestartGroup, Integer.valueOf(((i3 >> 6) & 112) | i52));
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
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
    public static final Object FlipBox$lambda$8$lambda$7(Function1 function1, SnapshotState snapshotState) {
        return function1.invoke(snapshotState.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object FlipBox$lambda$11$lambda$10(Function1 function1, SnapshotState4 snapshotState4) {
        return function1.invoke(snapshotState4.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0<Unit> FlipBox$lambda$21(SnapshotState4<? extends Function0<Unit>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PreviewCardFlip$lambda$29(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlipBox$lambda$20$lambda$19(SnapshotFloatState2 snapshotFloatState2, SnapshotFloatState2 snapshotFloatState22) {
        snapshotFloatState2.setFloatValue(0.0f);
        snapshotFloatState22.setFloatValue(1.0f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlipBox$lambda$25$lambda$24(boolean z, SnapshotFloatState2 snapshotFloatState2, SnapshotFloatState2 snapshotFloatState22, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setRotationX(snapshotFloatState2.getFloatValue());
        graphicsLayer.setCameraDistance(graphicsLayer.getDensity() * 8.0f);
        graphicsLayer.mo6764setTransformOrigin__ExYCQ(TransformOrigin.INSTANCE.m6875getCenterSzJe1aQ());
        graphicsLayer.setAlpha(snapshotFloatState22.getFloatValue());
        if (z) {
            graphicsLayer.setScaleY(-1.0f);
        }
        return Unit.INSTANCE;
    }

    private static final void PreviewCardFlip(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-682149512);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-682149512, i, -1, "com.robinhood.android.eventcontracts.hub.v2.cards.PreviewCardFlip (EventCard.kt:146)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Boolean boolValueOf = Boolean.valueOf(PreviewCardFlip$lambda$29(snapshotState));
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.EventCardKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            FlipBox(boolValueOf, (Function1) objRememberedValue2, null, ComposableLambda3.rememberComposableLambda(484457786, true, new C165362(snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.EventCardKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventCard.PreviewCardFlip$lambda$33(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PreviewCardFlip$lambda$30(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }
}

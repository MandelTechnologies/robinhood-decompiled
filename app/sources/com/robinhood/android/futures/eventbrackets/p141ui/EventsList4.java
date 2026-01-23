package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.font.FontWeight;
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
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: EventsList.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001ab\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\t2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aj\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00022\u0006\u0010\b\u001a\u00020\u00072!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001ax\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00022\u0006\u0010\b\u001a\u00020\u00072!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017H\u0003¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006\"²\u0006\u0018\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0\t8\nX\u008a\u0084\u0002"}, m3636d2 = {"Landroidx/compose/foundation/lazy/LazyListState;", "listState", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketRoundData;", "rounds", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationState;", "navigationState", "Landroidx/compose/ui/unit/Dp;", "contentBottomPadding", "Lkotlin/Function1;", "Ljava/util/UUID;", "Lkotlin/ParameterName;", "name", "cardId", "", "onCardClick", "Landroidx/compose/ui/Modifier;", "modifier", "AllEventsList-jIwJxvA", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationState;FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AllEventsList", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketGameOverviewCardData;", "cards", "Lkotlin/Function0;", "emptyCardStackFallback", "EventsList-osbwsH8", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlinx/collections/immutable/ImmutableList;FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "EventsList", "", "regions", "EventsList--b7W0Lw", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "", "numberOfCardsInRound", "feature-event-brackets_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.eventbrackets.ui.EventsListKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventsList4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AllEventsList_jIwJxvA$lambda$4(LazyListState lazyListState, ImmutableList immutableList, BracketNavigationInfo3 bracketNavigationInfo3, float f, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m14651AllEventsListjIwJxvA(lazyListState, immutableList, bracketNavigationInfo3, f, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventsList__b7W0Lw$lambda$13(LazyListState lazyListState, ImmutableList immutableList, ImmutableList immutableList2, float f, Function1 function1, Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        m14652EventsListb7W0Lw(lazyListState, immutableList, immutableList2, f, function1, modifier, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventsList__b7W0Lw$lambda$6(LazyListState lazyListState, ImmutableList immutableList, ImmutableList immutableList2, float f, Function1 function1, Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        m14652EventsListb7W0Lw(lazyListState, immutableList, immutableList2, f, function1, modifier, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventsList_osbwsH8$lambda$5(LazyListState lazyListState, ImmutableList immutableList, float f, Function1 function1, Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        m14653EventsListosbwsH8(lazyListState, immutableList, f, function1, modifier, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0139  */
    /* renamed from: AllEventsList-jIwJxvA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14651AllEventsListjIwJxvA(final LazyListState listState, final ImmutableList<BracketRoundData> rounds, final BracketNavigationInfo3 navigationState, final float f, final Function1<? super UUID, Unit> onCardClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        boolean z;
        Object objRememberedValue;
        SnapshotState4 snapshotState4RememberUpdatedState;
        boolean zChanged;
        Object objRememberedValue2;
        BracketRoundData bracketRoundData;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(listState, "listState");
        Intrinsics.checkNotNullParameter(rounds, "rounds");
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(onCardClick, "onCardClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(38621570);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(listState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(rounds) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(navigationState) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onCardClick) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                }
                if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(38621570, i3, -1, "com.robinhood.android.futures.eventbrackets.ui.AllEventsList (EventsList.kt:40)");
                    }
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    z = (i3 & 112) != 32;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.futures.eventbrackets.ui.EventsListKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Integer.valueOf(EventsList4.AllEventsList_jIwJxvA$lambda$1$lambda$0(rounds, ((Integer) obj).intValue()));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState((Function1) objRememberedValue, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChanged = ((i3 & 896) != 256) | composerStartRestartGroup.changed(snapshotState4RememberUpdatedState) | ((i3 & 14) == 4);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new EventsList5(navigationState, snapshotState4RememberUpdatedState, listState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(navigationState, listState, (Function2) objRememberedValue2, composerStartRestartGroup, ((i3 >> 6) & 14) | ((i3 << 3) & 112));
                    bracketRoundData = (BracketRoundData) CollectionsKt.getOrNull(rounds, navigationState.getCurrentRoundIndex());
                    if (bracketRoundData != null || (immutableListPersistentListOf = bracketRoundData.getCards()) == null) {
                        ImmutableList<BracketGameOverviewCardData> immutableListPersistentListOf = extensions2.persistentListOf();
                    }
                    Modifier modifier5 = modifier4;
                    m14652EventsListb7W0Lw(listState, immutableListPersistentListOf, navigationState.availableRegions(navigationState.getCurrentRoundIndex()), f, onCardClick, modifier5, null, composerStartRestartGroup, i3 & 523278, 64);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.ui.EventsListKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return EventsList4.AllEventsList_jIwJxvA$lambda$4(listState, rounds, navigationState, f, onCardClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            modifier2 = modifier;
            if ((74899 & i3) != 74898) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                if ((i3 & 112) != 32) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.futures.eventbrackets.ui.EventsListKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(EventsList4.AllEventsList_jIwJxvA$lambda$1$lambda$0(rounds, ((Integer) obj).intValue()));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState((Function1) objRememberedValue, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChanged = ((i3 & 896) != 256) | composerStartRestartGroup.changed(snapshotState4RememberUpdatedState) | ((i3 & 14) == 4);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = new EventsList5(navigationState, snapshotState4RememberUpdatedState, listState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(navigationState, listState, (Function2) objRememberedValue2, composerStartRestartGroup, ((i3 >> 6) & 14) | ((i3 << 3) & 112));
                        bracketRoundData = (BracketRoundData) CollectionsKt.getOrNull(rounds, navigationState.getCurrentRoundIndex());
                        if (bracketRoundData != null) {
                            ImmutableList<BracketGameOverviewCardData> immutableListPersistentListOf2 = extensions2.persistentListOf();
                            Modifier modifier52 = modifier4;
                            m14652EventsListb7W0Lw(listState, immutableListPersistentListOf2, navigationState.availableRegions(navigationState.getCurrentRoundIndex()), f, onCardClick, modifier52, null, composerStartRestartGroup, i3 & 523278, 64);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((74899 & i3) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final int AllEventsList_jIwJxvA$lambda$1$lambda$0(ImmutableList immutableList, int i) {
        return ((BracketRoundData) immutableList.get(i)).getNumberOfCards();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Integer, Integer> AllEventsList_jIwJxvA$lambda$2(SnapshotState4<? extends Function1<? super Integer, Integer>> snapshotState4) {
        return (Function1) snapshotState4.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* renamed from: EventsList-osbwsH8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14653EventsListosbwsH8(final LazyListState listState, final ImmutableList<BracketGameOverviewCardData> cards, final float f, final Function1<? super UUID, Unit> onCardClick, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function22;
        final Function2<? super Composer, ? super Integer, Unit> lambda$1673541562$feature_event_brackets_externalDebug;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(listState, "listState");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(onCardClick, "onCardClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1628581535);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(listState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(cards) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCardClick) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    function22 = function2;
                    i3 |= composerStartRestartGroup.changedInstance(function22) ? 131072 : 65536;
                }
                if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    lambda$1673541562$feature_event_brackets_externalDebug = function22;
                } else {
                    if (i5 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    lambda$1673541562$feature_event_brackets_externalDebug = i4 == 0 ? EventsList.INSTANCE.getLambda$1673541562$feature_event_brackets_externalDebug() : function22;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1628581535, i3, -1, "com.robinhood.android.futures.eventbrackets.ui.EventsList (EventsList.kt:98)");
                    }
                    int i6 = (i3 & 14) | 384 | (i3 & 112);
                    int i7 = i3 << 3;
                    m14652EventsListb7W0Lw(listState, cards, extensions2.persistentListOf(), f, onCardClick, modifier2, lambda$1673541562$feature_event_brackets_externalDebug, composerStartRestartGroup, i6 | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (i7 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.ui.EventsListKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return EventsList4.EventsList_osbwsH8$lambda$5(listState, cards, f, onCardClick, modifier2, lambda$1673541562$feature_event_brackets_externalDebug, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            function22 = function2;
            if ((74899 & i3) == 74898) {
                if (i5 != 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i62 = (i3 & 14) | 384 | (i3 & 112);
                int i72 = i3 << 3;
                m14652EventsListb7W0Lw(listState, cards, extensions2.persistentListOf(), f, onCardClick, modifier2, lambda$1673541562$feature_event_brackets_externalDebug, composerStartRestartGroup, i62 | (i72 & 7168) | (57344 & i72) | (458752 & i72) | (i72 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        function22 = function2;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0135  */
    /* renamed from: EventsList--b7W0Lw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m14652EventsListb7W0Lw(final LazyListState lazyListState, final ImmutableList<BracketGameOverviewCardData> immutableList, final ImmutableList<String> immutableList2, final float f, final Function1<? super UUID, Unit> function1, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        final LazyListState lazyListState2;
        int i3;
        float f2;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function22;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1592234325);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            lazyListState2 = lazyListState;
        } else if ((i & 6) == 0) {
            lazyListState2 = lazyListState;
            i3 = (composerStartRestartGroup.changed(lazyListState2) ? 4 : 2) | i;
        } else {
            lazyListState2 = lazyListState;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(immutableList) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(immutableList2) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            f2 = f;
        } else {
            f2 = f;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
            }
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
                function22 = function2;
            } else {
                function22 = function2;
                if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                }
            }
            if ((i3 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                Function2<? super Composer, ? super Integer, Unit> function2M14647getLambda$1943606138$feature_event_brackets_externalDebug = i4 == 0 ? EventsList.INSTANCE.m14647getLambda$1943606138$feature_event_brackets_externalDebug() : function22;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1592234325, i3, -1, "com.robinhood.android.futures.eventbrackets.ui.EventsList (EventsList.kt:117)");
                }
                composerStartRestartGroup.startReplaceGroup(-1128818385);
                if (!immutableList.isEmpty()) {
                    function2M14647getLambda$1943606138$feature_event_brackets_externalDebug.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 18) & 14));
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        final Modifier modifier5 = modifier4;
                        final Function2<? super Composer, ? super Integer, Unit> function24 = function2M14647getLambda$1943606138$feature_event_brackets_externalDebug;
                        final float f3 = f2;
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.ui.EventsListKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return EventsList4.EventsList__b7W0Lw$lambda$6(lazyListState2, immutableList, immutableList2, f3, function1, modifier5, function24, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                Modifier modifier6 = modifier4;
                Function2<? super Composer, ? super Integer, Unit> function25 = function2M14647getLambda$1943606138$feature_event_brackets_externalDebug;
                composerStartRestartGroup.endReplaceGroup();
                Arrangement arrangement = Arrangement.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM());
                PaddingValues paddingValuesM5139PaddingValuesa9UjIt4$default = PaddingKt.m5139PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, f, 7, null);
                Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(modifier6, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean z = ((i3 & 896) == 256) | ((i3 & 112) == 32) | ((57344 & i3) == 16384);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.futures.eventbrackets.ui.EventsListKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return EventsList4.EventsList__b7W0Lw$lambda$12$lambda$11(immutableList2, immutableList, function1, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                LazyDslKt.LazyColumn(modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, lazyListState, paddingValuesM5139PaddingValuesa9UjIt4$default, false, horizontalOrVerticalM5089spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, (i3 << 3) & 112, 488);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier6;
                function23 = function25;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function23 = function22;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.ui.EventsListKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EventsList4.EventsList__b7W0Lw$lambda$13(lazyListState, immutableList, immutableList2, f, function1, modifier3, function23, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        if ((i3 & 599187) == 599186) {
            if (i5 == 0) {
            }
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(-1128818385);
            if (!immutableList.isEmpty()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventsList__b7W0Lw$lambda$12$lambda$11(final ImmutableList immutableList, final ImmutableList immutableList2, final Function1 function1, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        boolean zIsEmpty = immutableList.isEmpty();
        final boolean z = !zIsEmpty;
        final int size = !zIsEmpty ? immutableList2.size() / immutableList.size() : Integer.MAX_VALUE;
        LazyColumn.items(immutableList2.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.futures.eventbrackets.ui.EventsListKt$EventsList__b7W0Lw$lambda$12$lambda$11$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                immutableList2.get(i);
                return null;
            }
        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.eventbrackets.ui.EventsListKt$EventsList__b7W0Lw$lambda$12$lambda$11$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                float fM7995constructorimpl;
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
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
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                final BracketGameOverviewCardData bracketGameOverviewCardData = (BracketGameOverviewCardData) immutableList2.get(i);
                composer.startReplaceGroup(1638466648);
                int i4 = i % size;
                if (z && i4 == 0) {
                    composer.startReplaceGroup(1638586586);
                    String str = (String) immutableList.get(i / size);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i5).m21590getDefaultD9Ej5fM(), 7, null), Color.m6701boximpl(bentoTheme.getColors(composer, i5).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 1, 0, null, 0, bentoTheme.getTypography(composer, i5).getTextM(), composer, 805330944, 0, 7656);
                    composer.startReplaceGroup(-1633490746);
                    boolean zChanged = composer.changed(function1) | composer.changed(bracketGameOverviewCardData);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function1 function12 = function1;
                        objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.futures.eventbrackets.ui.EventsListKt$EventsList$3$1$1$1$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function12.invoke(bracketGameOverviewCardData.getCardId());
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    BracketMatchOverviewCardKt.BracketMatchOverviewCard(bracketGameOverviewCardData, (Function0) objRememberedValue, companion, composer, 384, 0);
                    composer.endNode();
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(1639410349);
                    boolean z2 = z && i4 == size - 1;
                    boolean z3 = i == CollectionsKt.getLastIndex(immutableList2);
                    composer.startReplaceGroup(-1633490746);
                    boolean zChanged2 = composer.changed(function1) | composer.changed(bracketGameOverviewCardData);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        final Function1 function13 = function1;
                        objRememberedValue2 = new Function0<Unit>() { // from class: com.robinhood.android.futures.eventbrackets.ui.EventsListKt$EventsList$3$1$1$2$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function13.invoke(bracketGameOverviewCardData.getCardId());
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    Function0 function0 = (Function0) objRememberedValue2;
                    composer.endReplaceGroup();
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    composer.startReplaceGroup(329992393);
                    if (!z2 || z3) {
                        fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
                    } else {
                        fM7995constructorimpl = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM();
                    }
                    float f = fM7995constructorimpl;
                    composer.endReplaceGroup();
                    BracketMatchOverviewCardKt.BracketMatchOverviewCard(bracketGameOverviewCardData, function0, PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, f, 7, null), composer, 0, 0);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}

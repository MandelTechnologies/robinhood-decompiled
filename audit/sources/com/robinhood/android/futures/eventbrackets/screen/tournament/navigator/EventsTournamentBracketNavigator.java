package com.robinhood.android.futures.eventbrackets.screen.tournament.navigator;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProvider2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.futures.eventbrackets.C17135R;
import com.robinhood.android.futures.eventbrackets.p141ui.BracketNavigationInfo3;
import com.robinhood.android.futures.eventbrackets.screen.tournament.navigator.EventsTournamentBracketNavigator;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoChip;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;

/* compiled from: EventsTournamentBracketNavigator.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001ae\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t26\u0010\n\u001a2\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0011\u001a\u0085\u0001\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\f2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u001f2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0004\b!\u0010\"\u001ac\u0010#\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\f2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\f2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u001f2\u0006\u0010*\u001a\u00020\u001a2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0004\b+\u0010,\u001a \u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010/\u001a\u00020\fH\u0003¨\u00060²\u0006\n\u00101\u001a\u00020\u001aX\u008a\u008e\u0002²\u0006\n\u00102\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u00103\u001a\u00020\fX\u008a\u008e\u0002"}, m3636d2 = {"EventsTournamentBracketNavigator", "", "navigationState", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "NavigationOptionsBottomSheet", "onDismiss", "Lkotlin/Function0;", "onSelected", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "roundIndex", "regionIndex", "(Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "NavigationOptionsList", "selectedLeftIndex", "selectedRightIndex", "leftOptions", "Lkotlinx/collections/immutable/ImmutableList;", "", "rightOptions", "isRightOptionSelectable", "", "itemHeight", "Landroidx/compose/ui/unit/Dp;", "numDisplayItems", "onLeftSelectedIndexChange", "Lkotlin/Function1;", "onRightSelectedIndexChange", "NavigationOptionsList-zadm560", "(IILkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;ZFILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "InfiniteCircularList", "numDisplayedItems", "options", "contentAlignment", "Landroidx/compose/ui/Alignment;", "latestSelectedIndex", "onSelectedIndexChange", "isSelectable", "InfiniteCircularList-gSuKmCU", "(FILkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Alignment;ILkotlin/jvm/functions/Function1;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "initialFirstVisibleItemIndex", "optionsSize", "initialSelectedIndex", "feature-event-brackets_externalDebug", "showEventsTournamentNavigatorBottomSheet", "latestSelectedRoundIndex", "latestSelectedRegionIndex"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.navigator.EventsTournamentBracketNavigatorKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventsTournamentBracketNavigator {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventsTournamentBracketNavigator$lambda$0(BracketNavigationInfo3 bracketNavigationInfo3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EventsTournamentBracketNavigator(bracketNavigationInfo3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventsTournamentBracketNavigator$lambda$11(BracketNavigationInfo3 bracketNavigationInfo3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EventsTournamentBracketNavigator(bracketNavigationInfo3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InfiniteCircularList_gSuKmCU$lambda$18(float f, int i, ImmutableList immutableList, Alignment alignment, int i2, Function1 function1, boolean z, Modifier modifier, int i3, int i4, Composer composer, int i5) {
        m14612InfiniteCircularListgSuKmCU(f, i, immutableList, alignment, i2, function1, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationOptionsBottomSheet$lambda$12(BracketNavigationInfo3 bracketNavigationInfo3, Function0 function0, Function2 function2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        NavigationOptionsBottomSheet(bracketNavigationInfo3, function0, function2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationOptionsList_zadm560$lambda$14(int i, int i2, ImmutableList immutableList, ImmutableList immutableList2, boolean z, float f, int i3, Function1 function1, Function1 function12, Modifier modifier, int i4, int i5, Composer composer, int i6) {
        m14613NavigationOptionsListzadm560(i, i2, immutableList, immutableList2, z, f, i3, function1, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EventsTournamentBracketNavigator(final BracketNavigationInfo3 navigationState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        String currentRoundName;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-63298189);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(navigationState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-63298189, i3, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.navigator.EventsTournamentBracketNavigator (EventsTournamentBracketNavigator.kt:47)");
                }
                currentRoundName = navigationState.getCurrentRoundName();
                if (currentRoundName != null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.navigator.EventsTournamentBracketNavigatorKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return EventsTournamentBracketNavigator.EventsTournamentBracketNavigator$lambda$0(navigationState, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                StringBuilder sb = new StringBuilder();
                sb.append(currentRoundName);
                if (navigationState.getCurrentRegion() != null) {
                    sb.append(" · ");
                    sb.append(navigationState.getCurrentRegion());
                }
                String string2 = sb.toString();
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.navigator.EventsTournamentBracketNavigatorKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EventsTournamentBracketNavigator.EventsTournamentBracketNavigator$lambda$6$lambda$5(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoChip.BentoActionChip((Function0) objRememberedValue2, modifier3, false, null, string2, composerStartRestartGroup, (i3 & 112) | 6, 12);
                if (EventsTournamentBracketNavigator$lambda$2(snapshotState)) {
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.navigator.EventsTournamentBracketNavigatorKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return EventsTournamentBracketNavigator.EventsTournamentBracketNavigator$lambda$8$lambda$7(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    Function0 function0 = (Function0) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    int i5 = i3 & 14;
                    boolean z = i5 == 4;
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function2() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.navigator.EventsTournamentBracketNavigatorKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return EventsTournamentBracketNavigator.EventsTournamentBracketNavigator$lambda$10$lambda$9(navigationState, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    NavigationOptionsBottomSheet(navigationState, function0, (Function2) objRememberedValue4, null, composerStartRestartGroup, i5 | 48, 8);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.navigator.EventsTournamentBracketNavigatorKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EventsTournamentBracketNavigator.EventsTournamentBracketNavigator$lambda$11(navigationState, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            currentRoundName = navigationState.getCurrentRoundName();
            if (currentRoundName != null) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void EventsTournamentBracketNavigator$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventsTournamentBracketNavigator$lambda$6$lambda$5(SnapshotState snapshotState) {
        EventsTournamentBracketNavigator$lambda$3(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventsTournamentBracketNavigator$lambda$8$lambda$7(SnapshotState snapshotState) {
        EventsTournamentBracketNavigator$lambda$3(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventsTournamentBracketNavigator$lambda$10$lambda$9(BracketNavigationInfo3 bracketNavigationInfo3, int i, int i2) {
        bracketNavigationInfo3.moveToNewBracketLocation(i, i2);
        return Unit.INSTANCE;
    }

    private static final boolean EventsTournamentBracketNavigator$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final void NavigationOptionsBottomSheet(final BracketNavigationInfo3 bracketNavigationInfo3, final Function0<Unit> function0, final Function2<? super Integer, ? super Integer, Unit> function2, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(277769842);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(bracketNavigationInfo3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(277769842, i3, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.navigator.NavigationOptionsBottomSheet (EventsTournamentBracketNavigator.kt:86)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-236570233, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.navigator.EventsTournamentBracketNavigatorKt.NavigationOptionsBottomSheet.1

                /* compiled from: EventsTournamentBracketNavigator.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.navigator.EventsTournamentBracketNavigatorKt$NavigationOptionsBottomSheet$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
                    final /* synthetic */ BracketNavigationInfo3 $navigationState;
                    final /* synthetic */ Function0<Unit> $onDismiss;
                    final /* synthetic */ Function2<Integer, Integer, Unit> $onSelected;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(BracketNavigationInfo3 bracketNavigationInfo3, Function2<? super Integer, ? super Integer, Unit> function2, Function0<Unit> function0) {
                        this.$navigationState = bracketNavigationInfo3;
                        this.$onSelected = function2;
                        this.$onDismiss = function0;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
                        invoke(rhModalBottomSheet5, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                        if ((i & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-622543218, i, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.navigator.NavigationOptionsBottomSheet.<anonymous>.<anonymous> (EventsTournamentBracketNavigator.kt:92)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i2 = BentoTheme.$stable;
                        Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        final BracketNavigationInfo3 bracketNavigationInfo3 = this.$navigationState;
                        final Function2<Integer, Integer, Unit> function2 = this.$onSelected;
                        final Function0<Unit> function0 = this.$onDismiss;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5145paddingqDBjuR0);
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
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17135R.string.events_tournament_bracket_navigator_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8190);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM()), composer, 0);
                        Object[] objArr = {Integer.valueOf(bracketNavigationInfo3.getCurrentRoundIndex())};
                        composer.startReplaceGroup(5004770);
                        boolean zChanged = composer.changed(bracketNavigationInfo3);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.navigator.EventsTournamentBracketNavigatorKt$NavigationOptionsBottomSheet$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return EventsTournamentBracketNavigator.C171911.AnonymousClass1.invoke$lambda$14$lambda$1$lambda$0(bracketNavigationInfo3);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composer, 0, 6);
                        Object[] objArr2 = {Integer.valueOf(bracketNavigationInfo3.getCurrentRegionIndex())};
                        composer.startReplaceGroup(5004770);
                        boolean zChanged2 = composer.changed(bracketNavigationInfo3);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.navigator.EventsTournamentBracketNavigatorKt$NavigationOptionsBottomSheet$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return EventsTournamentBracketNavigator.C171911.AnonymousClass1.invoke$lambda$14$lambda$5$lambda$4(bracketNavigationInfo3);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composer, 0, 6);
                        ImmutableList<String> availableRounds = bracketNavigationInfo3.getAvailableRounds();
                        ImmutableList3<String> availableRegions = bracketNavigationInfo3.getAvailableRegions();
                        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(40);
                        int intValue = snapshotIntState2.getIntValue();
                        int intValue2 = snapshotIntState22.getIntValue();
                        boolean zRoundHasRegions = bracketNavigationInfo3.roundHasRegions(snapshotIntState2.getIntValue());
                        composer.startReplaceGroup(5004770);
                        boolean zChanged3 = composer.changed(snapshotIntState2);
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.navigator.EventsTournamentBracketNavigatorKt$NavigationOptionsBottomSheet$1$1$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return EventsTournamentBracketNavigator.C171911.AnonymousClass1.invoke$lambda$14$lambda$9$lambda$8(snapshotIntState2, ((Integer) obj).intValue());
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        Function1 function1 = (Function1) objRememberedValue3;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChanged4 = composer.changed(snapshotIntState22);
                        Object objRememberedValue4 = composer.rememberedValue();
                        if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.navigator.EventsTournamentBracketNavigatorKt$NavigationOptionsBottomSheet$1$1$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return EventsTournamentBracketNavigator.C171911.AnonymousClass1.invoke$lambda$14$lambda$11$lambda$10(snapshotIntState22, ((Integer) obj).intValue());
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue4);
                        }
                        composer.endReplaceGroup();
                        EventsTournamentBracketNavigator.m14613NavigationOptionsListzadm560(intValue, intValue2, availableRounds, availableRegions, zRoundHasRegions, fM7995constructorimpl, 3, function1, (Function1) objRememberedValue4, null, composer, 1769472, 512);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM()), composer, 0);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer, 0);
                        composer.startReplaceGroup(-1224400529);
                        boolean zChanged5 = composer.changed(function2) | composer.changed(snapshotIntState2) | composer.changed(snapshotIntState22) | composer.changed(function0);
                        Object objRememberedValue5 = composer.rememberedValue();
                        if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function0() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.navigator.EventsTournamentBracketNavigatorKt$NavigationOptionsBottomSheet$1$1$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return EventsTournamentBracketNavigator.C171911.AnonymousClass1.invoke$lambda$14$lambda$13$lambda$12(function2, function0, snapshotIntState2, snapshotIntState22);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue5);
                        }
                        composer.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue5, strStringResource, modifierFillMaxWidth$default, null, null, false, false, null, null, null, null, false, null, composer, 384, 0, 8184);
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final SnapshotIntState2 invoke$lambda$14$lambda$1$lambda$0(BracketNavigationInfo3 bracketNavigationInfo3) {
                        return SnapshotIntState3.mutableIntStateOf(bracketNavigationInfo3.getCurrentRoundIndex());
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final SnapshotIntState2 invoke$lambda$14$lambda$5$lambda$4(BracketNavigationInfo3 bracketNavigationInfo3) {
                        return SnapshotIntState3.mutableIntStateOf(bracketNavigationInfo3.getCurrentRegionIndex());
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$14$lambda$9$lambda$8(SnapshotIntState2 snapshotIntState2, int i) {
                        snapshotIntState2.setIntValue(i);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$14$lambda$11$lambda$10(SnapshotIntState2 snapshotIntState2, int i) {
                        snapshotIntState2.setIntValue(i);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$14$lambda$13$lambda$12(Function2 function2, Function0 function0, SnapshotIntState2 snapshotIntState2, SnapshotIntState2 snapshotIntState22) {
                        function2.invoke(Integer.valueOf(snapshotIntState2.getIntValue()), Integer.valueOf(snapshotIntState22.getIntValue()));
                        function0.invoke();
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-236570233, i5, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.navigator.NavigationOptionsBottomSheet.<anonymous> (EventsTournamentBracketNavigator.kt:88)");
                    }
                    Function0<Unit> function02 = function0;
                    RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(function02, modifier, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-622543218, true, new AnonymousClass1(bracketNavigationInfo3, function2, function02), composer2, 54), composer2, 1572864, 60);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.navigator.EventsTournamentBracketNavigatorKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventsTournamentBracketNavigator.NavigationOptionsBottomSheet$lambda$12(bracketNavigationInfo3, function0, function2, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f5  */
    /* renamed from: NavigationOptionsList-zadm560, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14613NavigationOptionsListzadm560(final int i, final int i2, final ImmutableList<String> immutableList, final ImmutableList<String> immutableList2, final boolean z, final float f, final int i3, final Function1<? super Integer, Unit> function1, final Function1<? super Integer, Unit> function12, Modifier modifier, Composer composer, final int i4, final int i5) {
        int i6;
        ImmutableList<String> immutableList3;
        float f2;
        int i7;
        Function1<? super Integer, Unit> function13;
        Function1<? super Integer, Unit> function14;
        int i8;
        int i9;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Row6 row6;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-15847612);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else {
            if ((i4 & 48) == 0) {
                i6 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
            }
            if ((i5 & 4) == 0) {
                i6 |= 384;
                immutableList3 = immutableList;
            } else {
                immutableList3 = immutableList;
                if ((i4 & 384) == 0) {
                    i6 |= composerStartRestartGroup.changed(immutableList3) ? 256 : 128;
                }
            }
            if ((i5 & 8) == 0) {
                i6 |= 3072;
            } else {
                if ((i4 & 3072) == 0) {
                    i6 |= composerStartRestartGroup.changed(immutableList2) ? 2048 : 1024;
                }
                if ((i5 & 16) != 0) {
                    i6 |= 24576;
                } else {
                    if ((i4 & 24576) == 0) {
                        i6 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
                    }
                    if ((i5 & 32) == 0) {
                        i6 |= 196608;
                        f2 = f;
                    } else {
                        f2 = f;
                        if ((i4 & 196608) == 0) {
                            i6 |= composerStartRestartGroup.changed(f2) ? 131072 : 65536;
                        }
                    }
                    if ((i5 & 64) == 0) {
                        i6 |= 1572864;
                        i7 = i3;
                    } else {
                        i7 = i3;
                        if ((i4 & 1572864) == 0) {
                            i6 |= composerStartRestartGroup.changed(i7) ? 1048576 : 524288;
                        }
                    }
                    if ((i5 & 128) == 0) {
                        i6 |= 12582912;
                    } else {
                        if ((i4 & 12582912) == 0) {
                            function13 = function1;
                            i6 |= composerStartRestartGroup.changedInstance(function13) ? 8388608 : 4194304;
                        }
                        if ((i5 & 256) == 0) {
                            if ((i4 & 100663296) == 0) {
                                function14 = function12;
                                i6 |= composerStartRestartGroup.changedInstance(function14) ? 67108864 : 33554432;
                            }
                            i8 = i5 & 512;
                            if (i8 == 0) {
                                i6 |= 805306368;
                                i9 = 1572864;
                                modifier2 = modifier;
                            } else {
                                i9 = 1572864;
                                modifier2 = modifier;
                                if ((i4 & 805306368) == 0) {
                                    i6 |= composerStartRestartGroup.changed(modifier2) ? 536870912 : 268435456;
                                }
                            }
                            if ((i6 & 306783379) != 306783378 && composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                composer2 = composerStartRestartGroup;
                            } else {
                                if (i8 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-15847612, i6, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.navigator.NavigationOptionsList (EventsTournamentBracketNavigator.kt:154)");
                                }
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
                                Alignment.Companion companion = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, companion.getTop(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Row6 row62 = Row6.INSTANCE;
                                boolean z2 = !immutableList3.isEmpty() || immutableList2.isEmpty();
                                composerStartRestartGroup.startReplaceGroup(460443033);
                                if (immutableList3.isEmpty()) {
                                    Modifier modifierWeight$default = Row5.weight$default(row62, Modifier.INSTANCE, 1.0f, false, 2, null);
                                    row6 = row62;
                                    Alignment center = z2 ? companion.getCenter() : companion.getCenterEnd();
                                    int i10 = i6 >> 15;
                                    m14612InfiniteCircularListgSuKmCU(f2, i7, immutableList3, center, i, function13, true, modifierWeight$default, composerStartRestartGroup, (i10 & 112) | (i10 & 14) | i9 | (i6 & 896) | ((i6 << 12) & 57344) | ((i6 >> 6) & 458752), 0);
                                } else {
                                    row6 = row62;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(460460274);
                                if (immutableList2.isEmpty()) {
                                    composer2 = composerStartRestartGroup;
                                    m14612InfiniteCircularListgSuKmCU(f, i3, immutableList2, z2 ? companion.getCenter() : companion.getCenterStart(), i2, function14, z, Row5.weight$default(row6, Modifier.INSTANCE, 1.0f, false, 2, null), composer2, ((i6 >> 15) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i6 >> 3) & 896) | (57344 & (i6 << 9)) | ((i6 >> 9) & 458752) | (3670016 & (i6 << 6)), 0);
                                } else {
                                    composer2 = composerStartRestartGroup;
                                }
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                            final Modifier modifier3 = modifier2;
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.navigator.EventsTournamentBracketNavigatorKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return EventsTournamentBracketNavigator.NavigationOptionsList_zadm560$lambda$14(i, i2, immutableList, immutableList2, z, f, i3, function1, function12, modifier3, i4, i5, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i6 |= 100663296;
                        function14 = function12;
                        i8 = i5 & 512;
                        if (i8 == 0) {
                        }
                        if ((i6 & 306783379) != 306783378) {
                            if (i8 != 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = Arrangement.INSTANCE.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
                            Alignment.Companion companion3 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_42, companion3.getTop(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                                Row6 row622 = Row6.INSTANCE;
                                if (immutableList3.isEmpty()) {
                                    composerStartRestartGroup.startReplaceGroup(460443033);
                                    if (immutableList3.isEmpty()) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(460460274);
                                    if (immutableList2.isEmpty()) {
                                    }
                                    composer2.endReplaceGroup();
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                }
                            }
                        }
                        final Modifier modifier32 = modifier2;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    function13 = function1;
                    if ((i5 & 256) == 0) {
                    }
                    function14 = function12;
                    i8 = i5 & 512;
                    if (i8 == 0) {
                    }
                    if ((i6 & 306783379) != 306783378) {
                    }
                    final Modifier modifier322 = modifier2;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                if ((i5 & 32) == 0) {
                }
                if ((i5 & 64) == 0) {
                }
                if ((i5 & 128) == 0) {
                }
                function13 = function1;
                if ((i5 & 256) == 0) {
                }
                function14 = function12;
                i8 = i5 & 512;
                if (i8 == 0) {
                }
                if ((i6 & 306783379) != 306783378) {
                }
                final Modifier modifier3222 = modifier2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i5 & 16) != 0) {
            }
            if ((i5 & 32) == 0) {
            }
            if ((i5 & 64) == 0) {
            }
            if ((i5 & 128) == 0) {
            }
            function13 = function1;
            if ((i5 & 256) == 0) {
            }
            function14 = function12;
            i8 = i5 & 512;
            if (i8 == 0) {
            }
            if ((i6 & 306783379) != 306783378) {
            }
            final Modifier modifier32222 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i5 & 4) == 0) {
        }
        if ((i5 & 8) == 0) {
        }
        if ((i5 & 16) != 0) {
        }
        if ((i5 & 32) == 0) {
        }
        if ((i5 & 64) == 0) {
        }
        if ((i5 & 128) == 0) {
        }
        function13 = function1;
        if ((i5 & 256) == 0) {
        }
        function14 = function12;
        i8 = i5 & 512;
        if (i8 == 0) {
        }
        if ((i6 & 306783379) != 306783378) {
        }
        final Modifier modifier322222 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014b  */
    /* renamed from: InfiniteCircularList-gSuKmCU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m14612InfiniteCircularListgSuKmCU(final float f, final int i, final ImmutableList<String> immutableList, final Alignment alignment, final int i2, final Function1<? super Integer, Unit> function1, final boolean z, Modifier modifier, Composer composer, final int i3, final int i4) {
        int i5;
        ImmutableList<String> immutableList2;
        Alignment alignment2;
        Function1<? super Integer, Unit> function12;
        boolean z2;
        int i6;
        Modifier modifier2;
        final float fMo5016toPx0680j_4;
        LazyListState lazyListStateRememberLazyListState;
        boolean zChanged;
        Object objRememberedValue;
        LazyListState lazyListState;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(404688162);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else {
            if ((i3 & 384) == 0) {
                immutableList2 = immutableList;
                i5 |= composerStartRestartGroup.changed(immutableList2) ? 256 : 128;
            }
            if ((i4 & 8) == 0) {
                i5 |= 3072;
            } else {
                if ((i3 & 3072) == 0) {
                    alignment2 = alignment;
                    i5 |= composerStartRestartGroup.changed(alignment2) ? 2048 : 1024;
                }
                if ((i4 & 16) != 0) {
                    i5 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    i5 |= composerStartRestartGroup.changed(i2) ? 16384 : 8192;
                }
                if ((i4 & 32) == 0) {
                    if ((i3 & 196608) == 0) {
                        function12 = function1;
                        i5 |= composerStartRestartGroup.changedInstance(function12) ? 131072 : 65536;
                    }
                    if ((i4 & 64) == 0) {
                        i5 |= 1572864;
                        z2 = z;
                    } else {
                        z2 = z;
                        if ((i3 & 1572864) == 0) {
                            i5 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
                        }
                    }
                    i6 = i4 & 128;
                    if (i6 == 0) {
                        i5 |= 12582912;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        if ((i3 & 12582912) == 0) {
                            i5 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
                        }
                    }
                    if ((i5 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        if (i6 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        Modifier modifier3 = modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(404688162, i5, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.navigator.InfiniteCircularList (EventsTournamentBracketNavigator.kt:198)");
                        }
                        fMo5016toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(f) / 2;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(initialFirstVisibleItemIndex(immutableList2.size(), i, i2), 0, composerStartRestartGroup, 0, 2);
                        Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(modifier3, C2002Dp.m7995constructorimpl(i * f));
                        FlingBehavior flingBehaviorRememberSnapFlingBehavior = LazyListSnapLayoutInfoProvider2.rememberSnapFlingBehavior(lazyListStateRememberLazyListState, null, composerStartRestartGroup, 0, 2);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChanged = ((i5 & 896) != 256) | ((i5 & 14) != 4) | composerStartRestartGroup.changed(fMo5016toPx0680j_4) | ((57344 & i5) != 16384) | ((458752 & i5) != 131072) | ((i5 & 7168) != 2048) | ((i5 & 3670016) != 1048576);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            final ImmutableList<String> immutableList3 = immutableList2;
                            final Alignment alignment3 = alignment2;
                            final boolean z3 = z2;
                            lazyListState = lazyListStateRememberLazyListState;
                            final Function1<? super Integer, Unit> function13 = function12;
                            Function1 function14 = new Function1() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.navigator.EventsTournamentBracketNavigatorKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return EventsTournamentBracketNavigator.InfiniteCircularList_gSuKmCU$lambda$17$lambda$16(immutableList3, f, fMo5016toPx0680j_4, i2, function13, alignment3, z3, (LazyListScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function14);
                            objRememberedValue = function14;
                        } else {
                            lazyListState = lazyListStateRememberLazyListState;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        modifier2 = modifier3;
                        LazyDslKt.LazyColumn(modifierM5156height3ABfNKs, lazyListState, null, false, null, null, flingBehaviorRememberSnapFlingBehavior, false, null, (Function1) objRememberedValue, composer2, 0, 444);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier4 = modifier2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.navigator.EventsTournamentBracketNavigatorKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return EventsTournamentBracketNavigator.InfiniteCircularList_gSuKmCU$lambda$18(f, i, immutableList, alignment, i2, function1, z, modifier4, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 196608;
                function12 = function1;
                if ((i4 & 64) == 0) {
                }
                i6 = i4 & 128;
                if (i6 == 0) {
                }
                if ((i5 & 4793491) == 4793490) {
                    if (i6 != 0) {
                    }
                    Modifier modifier32 = modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    fMo5016toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(f) / 2;
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(initialFirstVisibleItemIndex(immutableList2.size(), i, i2), 0, composerStartRestartGroup, 0, 2);
                    Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(modifier32, C2002Dp.m7995constructorimpl(i * f));
                    FlingBehavior flingBehaviorRememberSnapFlingBehavior2 = LazyListSnapLayoutInfoProvider2.rememberSnapFlingBehavior(lazyListStateRememberLazyListState, null, composerStartRestartGroup, 0, 2);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChanged = ((i5 & 896) != 256) | ((i5 & 14) != 4) | composerStartRestartGroup.changed(fMo5016toPx0680j_4) | ((57344 & i5) != 16384) | ((458752 & i5) != 131072) | ((i5 & 7168) != 2048) | ((i5 & 3670016) != 1048576);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        final ImmutableList immutableList32 = immutableList2;
                        final Alignment alignment32 = alignment2;
                        final boolean z32 = z2;
                        lazyListState = lazyListStateRememberLazyListState;
                        final Function1 function132 = function12;
                        Function1 function142 = new Function1() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.navigator.EventsTournamentBracketNavigatorKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return EventsTournamentBracketNavigator.InfiniteCircularList_gSuKmCU$lambda$17$lambda$16(immutableList32, f, fMo5016toPx0680j_4, i2, function132, alignment32, z32, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function142);
                        objRememberedValue = function142;
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        modifier2 = modifier32;
                        LazyDslKt.LazyColumn(modifierM5156height3ABfNKs2, lazyListState, null, false, null, null, flingBehaviorRememberSnapFlingBehavior2, false, null, (Function1) objRememberedValue, composer2, 0, 444);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            alignment2 = alignment;
            if ((i4 & 16) != 0) {
            }
            if ((i4 & 32) == 0) {
            }
            function12 = function1;
            if ((i4 & 64) == 0) {
            }
            i6 = i4 & 128;
            if (i6 == 0) {
            }
            if ((i5 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        immutableList2 = immutableList;
        if ((i4 & 8) == 0) {
        }
        alignment2 = alignment;
        if ((i4 & 16) != 0) {
        }
        if ((i4 & 32) == 0) {
        }
        function12 = function1;
        if ((i4 & 64) == 0) {
        }
        i6 = i4 & 128;
        if (i6 == 0) {
        }
        if ((i5 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InfiniteCircularList_gSuKmCU$lambda$17$lambda$16(ImmutableList immutableList, float f, float f2, int i, Function1 function1, Alignment alignment, boolean z, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.items$default(LazyColumn, Integer.MAX_VALUE, null, null, ComposableLambda3.composableLambdaInstance(-1992659388, true, new EventsTournamentBracketNavigator2(immutableList, f, f2, i, function1, alignment, z)), 6, null);
        return Unit.INSTANCE;
    }

    private static final int initialFirstVisibleItemIndex(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        return (1073741823 - (1073741823 % i)) + (i3 - (i2 / 2));
    }
}

package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.create;

import androidx.compose.material3.TabKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerComposable3;
import com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateScreenerOrListComposable3;
import com.robinhood.android.redesigninvesting.investingmonitor.p232ui.create.InvestingMonitorNewTabComposable3;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.equityscreener.models.api.ScreenerOrder;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.shared.portfolio.lists.p391ui.modals.create.CreateWatchlistComposable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InvestingMonitorNewTabComposable.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0007\u001a\u001b\u0010\b\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u008e\u0002"}, m3636d2 = {"InvestingMonitorNewTabComposable", "", "onWatchlistCreated", "Lkotlin/Function1;", "Lcom/robinhood/models/db/CuratedList;", "onScreenerCreated", "Lcom/robinhood/equityscreener/models/db/Screener;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "AddNewTab", "onClick", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-investing-monitor_externalDebug", "bottomSheetState", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/create/State;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.create.InvestingMonitorNewTabComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class InvestingMonitorNewTabComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddNewTab$lambda$8(Function0 function0, int i, Composer composer, int i2) {
        AddNewTab(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestingMonitorNewTabComposable$lambda$7(Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        InvestingMonitorNewTabComposable(function1, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void InvestingMonitorNewTabComposable(final Function1<? super CuratedList, Unit> onWatchlistCreated, final Function1<? super Screener, Unit> onScreenerCreated, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onWatchlistCreated, "onWatchlistCreated");
        Intrinsics.checkNotNullParameter(onScreenerCreated, "onScreenerCreated");
        Composer composerStartRestartGroup = composer.startRestartGroup(155350509);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onWatchlistCreated) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onScreenerCreated) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(155350509, i2, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.create.InvestingMonitorNewTabComposable (InvestingMonitorNewTabComposable.kt:44)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(InvestingMonitorNewTabComposable4.HIDE_BOTTOMSHEET, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.create.InvestingMonitorNewTabComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InvestingMonitorNewTabComposable3.InvestingMonitorNewTabComposable$lambda$4$lambda$3(snapshotState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            AddNewTab((Function0) objRememberedValue2, composerStartRestartGroup, 6);
            if (InvestingMonitorNewTabComposable$lambda$1(snapshotState) != InvestingMonitorNewTabComposable4.HIDE_BOTTOMSHEET) {
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.create.InvestingMonitorNewTabComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InvestingMonitorNewTabComposable3.InvestingMonitorNewTabComposable$lambda$6$lambda$5(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue3, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(380141345, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.create.InvestingMonitorNewTabComposableKt.InvestingMonitorNewTabComposable.3

                    /* compiled from: InvestingMonitorNewTabComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.create.InvestingMonitorNewTabComposableKt$InvestingMonitorNewTabComposable$3$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ SnapshotState<InvestingMonitorNewTabComposable4> $bottomSheetState$delegate;
                        final /* synthetic */ Function1<Screener, Unit> $onScreenerCreated;
                        final /* synthetic */ Function1<CuratedList, Unit> $onWatchlistCreated;
                        final /* synthetic */ RhModalBottomSheet5 $this_RhModalBottomSheet;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(RhModalBottomSheet5 rhModalBottomSheet5, Function1<? super CuratedList, Unit> function1, Function1<? super Screener, Unit> function12, SnapshotState<InvestingMonitorNewTabComposable4> snapshotState) {
                            this.$this_RhModalBottomSheet = rhModalBottomSheet5;
                            this.$onWatchlistCreated = function1;
                            this.$onScreenerCreated = function12;
                            this.$bottomSheetState$delegate = snapshotState;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2(SnapshotState snapshotState) {
                            InvestingMonitorNewTabComposable3.InvestingMonitorNewTabComposable$lambda$2(snapshotState, InvestingMonitorNewTabComposable4.CREATE_WATCHLIST);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$5$lambda$4(RhModalBottomSheet5 rhModalBottomSheet5) {
                            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
                            InvestingMonitorNewTabComposable3.InvestingMonitorNewTabComposable$lambda$2(snapshotState, InvestingMonitorNewTabComposable4.CREATE_SCREENER);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$7$lambda$6(RhModalBottomSheet5 rhModalBottomSheet5, Function1 function1, CuratedList curatedList) {
                            Intrinsics.checkNotNullParameter(curatedList, "curatedList");
                            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
                            function1.invoke(curatedList);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$9$lambda$8(SnapshotState snapshotState) {
                            InvestingMonitorNewTabComposable3.InvestingMonitorNewTabComposable$lambda$2(snapshotState, InvestingMonitorNewTabComposable4.SHOW_BOTTOMSHEET);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$11$lambda$10(Screener it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$13$lambda$12(Function1 function1, RhModalBottomSheet5 rhModalBottomSheet5, Screener screener) {
                            Intrinsics.checkNotNullParameter(screener, "screener");
                            function1.invoke(screener);
                            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$15$lambda$14(SnapshotState snapshotState) {
                            InvestingMonitorNewTabComposable3.InvestingMonitorNewTabComposable$lambda$2(snapshotState, InvestingMonitorNewTabComposable4.SHOW_BOTTOMSHEET);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-816122068, i, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.create.InvestingMonitorNewTabComposable.<anonymous>.<anonymous> (InvestingMonitorNewTabComposable.kt:60)");
                            }
                            if (InvestingMonitorNewTabComposable3.InvestingMonitorNewTabComposable$lambda$1(this.$bottomSheetState$delegate) == InvestingMonitorNewTabComposable4.SHOW_BOTTOMSHEET) {
                                composer.startReplaceGroup(1685711980);
                                composer.startReplaceGroup(5004770);
                                final SnapshotState<InvestingMonitorNewTabComposable4> snapshotState = this.$bottomSheetState$delegate;
                                Object objRememberedValue = composer.rememberedValue();
                                Composer.Companion companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.create.InvestingMonitorNewTabComposableKt$InvestingMonitorNewTabComposable$3$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return InvestingMonitorNewTabComposable3.C265173.AnonymousClass1.invoke$lambda$1$lambda$0(snapshotState);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                Function0 function0 = (Function0) objRememberedValue;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(5004770);
                                final SnapshotState<InvestingMonitorNewTabComposable4> snapshotState2 = this.$bottomSheetState$delegate;
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.create.InvestingMonitorNewTabComposableKt$InvestingMonitorNewTabComposable$3$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return InvestingMonitorNewTabComposable3.C265173.AnonymousClass1.invoke$lambda$3$lambda$2(snapshotState2);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                Function0 function02 = (Function0) objRememberedValue2;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(this.$this_RhModalBottomSheet);
                                final RhModalBottomSheet5 rhModalBottomSheet5 = this.$this_RhModalBottomSheet;
                                Object objRememberedValue3 = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.create.InvestingMonitorNewTabComposableKt$InvestingMonitorNewTabComposable$3$1$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return InvestingMonitorNewTabComposable3.C265173.AnonymousClass1.invoke$lambda$5$lambda$4(rhModalBottomSheet5);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue3);
                                }
                                composer.endReplaceGroup();
                                CreateScreenerOrListComposable3.CreateScreenerOrListComposable(function0, function02, (Function0) objRememberedValue3, null, composer, 54, 8);
                                composer.endReplaceGroup();
                            } else if (InvestingMonitorNewTabComposable3.InvestingMonitorNewTabComposable$lambda$1(this.$bottomSheetState$delegate) == InvestingMonitorNewTabComposable4.CREATE_WATCHLIST) {
                                composer.startReplaceGroup(1685729418);
                                composer.startReplaceGroup(-1633490746);
                                boolean zChangedInstance2 = composer.changedInstance(this.$this_RhModalBottomSheet) | composer.changed(this.$onWatchlistCreated);
                                final RhModalBottomSheet5 rhModalBottomSheet52 = this.$this_RhModalBottomSheet;
                                final Function1<CuratedList, Unit> function1 = this.$onWatchlistCreated;
                                Object objRememberedValue4 = composer.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.create.InvestingMonitorNewTabComposableKt$InvestingMonitorNewTabComposable$3$1$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return InvestingMonitorNewTabComposable3.C265173.AnonymousClass1.invoke$lambda$7$lambda$6(rhModalBottomSheet52, function1, (CuratedList) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue4);
                                }
                                Function1 function12 = (Function1) objRememberedValue4;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(5004770);
                                final SnapshotState<InvestingMonitorNewTabComposable4> snapshotState3 = this.$bottomSheetState$delegate;
                                Object objRememberedValue5 = composer.rememberedValue();
                                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.create.InvestingMonitorNewTabComposableKt$InvestingMonitorNewTabComposable$3$1$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return InvestingMonitorNewTabComposable3.C265173.AnonymousClass1.invoke$lambda$9$lambda$8(snapshotState3);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue5);
                                }
                                composer.endReplaceGroup();
                                CreateWatchlistComposable.CreateWatchlistComposable(function12, (Function0) objRememberedValue5, null, null, composer, 48, 12);
                                composer.endReplaceGroup();
                            } else if (InvestingMonitorNewTabComposable3.InvestingMonitorNewTabComposable$lambda$1(this.$bottomSheetState$delegate) == InvestingMonitorNewTabComposable4.CREATE_SCREENER) {
                                composer.startReplaceGroup(1685743944);
                                ScreenerOrder screenerOrder = (ScreenerOrder) ScreenerOrder.INSTANCE.getDefault();
                                composer.startReplaceGroup(1849434622);
                                Object objRememberedValue6 = composer.rememberedValue();
                                Composer.Companion companion2 = Composer.INSTANCE;
                                if (objRememberedValue6 == companion2.getEmpty()) {
                                    objRememberedValue6 = new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.create.InvestingMonitorNewTabComposableKt$InvestingMonitorNewTabComposable$3$1$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return InvestingMonitorNewTabComposable3.C265173.AnonymousClass1.invoke$lambda$11$lambda$10((Screener) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue6);
                                }
                                Function1 function13 = (Function1) objRememberedValue6;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(-1633490746);
                                boolean zChanged = composer.changed(this.$onScreenerCreated) | composer.changedInstance(this.$this_RhModalBottomSheet);
                                final Function1<Screener, Unit> function14 = this.$onScreenerCreated;
                                final RhModalBottomSheet5 rhModalBottomSheet53 = this.$this_RhModalBottomSheet;
                                Object objRememberedValue7 = composer.rememberedValue();
                                if (zChanged || objRememberedValue7 == companion2.getEmpty()) {
                                    objRememberedValue7 = new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.create.InvestingMonitorNewTabComposableKt$InvestingMonitorNewTabComposable$3$1$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return InvestingMonitorNewTabComposable3.C265173.AnonymousClass1.invoke$lambda$13$lambda$12(function14, rhModalBottomSheet53, (Screener) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue7);
                                }
                                Function1 function15 = (Function1) objRememberedValue7;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(5004770);
                                final SnapshotState<InvestingMonitorNewTabComposable4> snapshotState4 = this.$bottomSheetState$delegate;
                                Object objRememberedValue8 = composer.rememberedValue();
                                if (objRememberedValue8 == companion2.getEmpty()) {
                                    objRememberedValue8 = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.create.InvestingMonitorNewTabComposableKt$InvestingMonitorNewTabComposable$3$1$$ExternalSyntheticLambda7
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return InvestingMonitorNewTabComposable3.C265173.AnonymousClass1.invoke$lambda$15$lambda$14(snapshotState4);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue8);
                                }
                                composer.endReplaceGroup();
                                CreateScreenerComposable3.CreateScreenerComposable(screenerOrder, function13, function15, (Function0) objRememberedValue8, null, composer, 3120, 16);
                                composer.endReplaceGroup();
                            } else {
                                composer.startReplaceGroup(718991510);
                                composer.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer2, Integer num) {
                        invoke(rhModalBottomSheet5, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer2, int i3) {
                        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                        if ((i3 & 6) == 0) {
                            i3 |= (i3 & 8) == 0 ? composer2.changed(RhModalBottomSheet) : composer2.changedInstance(RhModalBottomSheet) ? 4 : 2;
                        }
                        if ((i3 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(380141345, i3, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.create.InvestingMonitorNewTabComposable.<anonymous> (InvestingMonitorNewTabComposable.kt:59)");
                        }
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-816122068, true, new AnonymousClass1(RhModalBottomSheet, onWatchlistCreated, onScreenerCreated, snapshotState), composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 62);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.create.InvestingMonitorNewTabComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestingMonitorNewTabComposable3.InvestingMonitorNewTabComposable$lambda$7(onWatchlistCreated, onScreenerCreated, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestingMonitorNewTabComposable$lambda$4$lambda$3(SnapshotState snapshotState) {
        snapshotState.setValue(InvestingMonitorNewTabComposable4.SHOW_BOTTOMSHEET);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestingMonitorNewTabComposable$lambda$6$lambda$5(SnapshotState snapshotState) {
        snapshotState.setValue(InvestingMonitorNewTabComposable4.HIDE_BOTTOMSHEET);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestingMonitorNewTabComposable4 InvestingMonitorNewTabComposable$lambda$1(SnapshotState<InvestingMonitorNewTabComposable4> snapshotState) {
        return snapshotState.getValue();
    }

    private static final void AddNewTab(final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(171635280);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(171635280, i2, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.create.AddNewTab (InvestingMonitorNewTabComposable.kt:106)");
            }
            TabKt.m5981TabbogVsAg(false, function0, null, true, 0L, 0L, null, InvestingMonitorNewTabComposable.INSTANCE.getLambda$995210365$feature_investing_monitor_externalDebug(), composerStartRestartGroup, ((i2 << 3) & 112) | 12585990, 116);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.create.InvestingMonitorNewTabComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestingMonitorNewTabComposable3.AddNewTab$lambda$8(function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InvestingMonitorNewTabComposable$lambda$2(SnapshotState<InvestingMonitorNewTabComposable4> snapshotState, InvestingMonitorNewTabComposable4 investingMonitorNewTabComposable4) {
        snapshotState.setValue(investingMonitorNewTabComposable4);
    }
}

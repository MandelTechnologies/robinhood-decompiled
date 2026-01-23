package com.robinhood.shared.recurring.p392ui.edit;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerDefaults;
import androidx.compose.material3.DatePickerDialog_androidKt;
import androidx.compose.material3.DatePickerFormatter;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DatePickerState;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SelectableDates;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler5;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBarState;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.appbar.NavIconButton;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.shared.recurring.p392ui.edit.RecurringFrequencySelectionComposable;
import com.robinhood.shared.recurring.p392ui.edit.RecurringFrequencySelectionState;
import com.robinhood.utils.datetime.DayOfWeeks;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.DayOfWeek;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.ZoneOffset;
import p479j$.time.chrono.ChronoLocalDate;

/* compiled from: RecurringFrequencySelectionComposable.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a]\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0005X\u008a\u008e\u0002"}, m3636d2 = {"RecurringFrequencySelectionComposable", "", "state", "Lcom/robinhood/shared/recurring/ui/edit/RecurringFrequencySelectionState;", "showDatePickerOnFirstOpen", "", "onFrequencySelected", "Lkotlin/Function1;", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "onDateSelected", "", "primaryButtonOnClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/recurring/ui/edit/RecurringFrequencySelectionState;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RecurringFrequencySelectionPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-recurring-ui_externalDebug", "showDateSelector"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class RecurringFrequencySelectionComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringFrequencySelectionComposable$lambda$0(RecurringFrequencySelectionState recurringFrequencySelectionState, boolean z, Function1 function1, Function1 function12, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RecurringFrequencySelectionComposable(recurringFrequencySelectionState, z, function1, function12, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringFrequencySelectionPreview$lambda$1(int i, Composer composer, int i2) {
        RecurringFrequencySelectionPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void RecurringFrequencySelectionComposable(final RecurringFrequencySelectionState state, final boolean z, final Function1<? super ApiInvestmentSchedule.Frequency, Unit> onFrequencySelected, final Function1<? super Long, Unit> onDateSelected, final Function0<Unit> primaryButtonOnClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onFrequencySelected, "onFrequencySelected");
        Intrinsics.checkNotNullParameter(onDateSelected, "onDateSelected");
        Intrinsics.checkNotNullParameter(primaryButtonOnClick, "primaryButtonOnClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1190924258);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onFrequencySelected) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDateSelected) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(primaryButtonOnClick) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 131072 : 65536;
        }
        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1190924258, i3, -1, "com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposable (RecurringFrequencySelectionComposable.kt:66)");
            }
            final Modifier modifier4 = modifier3;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1044311149, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposableKt.RecurringFrequencySelectionComposable.1
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
                        ComposerKt.traceEventStart(1044311149, i5, -1, "com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposable.<anonymous> (RecurringFrequencySelectionComposable.kt:68)");
                    }
                    Modifier modifier5 = modifier4;
                    final RecurringFrequencySelectionState recurringFrequencySelectionState = state;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1562597937, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposableKt.RecurringFrequencySelectionComposable.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1562597937, i6, -1, "com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposable.<anonymous>.<anonymous> (RecurringFrequencySelectionComposable.kt:71)");
                            }
                            final RecurringFrequencySelectionState recurringFrequencySelectionState2 = recurringFrequencySelectionState;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(1398444254, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposableKt.RecurringFrequencySelectionComposable.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i7) {
                                    if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1398444254, i7, -1, "com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposable.<anonymous>.<anonymous>.<anonymous> (RecurringFrequencySelectionComposable.kt:72)");
                                    }
                                    StringResource appBarTitle = recurringFrequencySelectionState2.getAppBarTitle();
                                    if (appBarTitle != null) {
                                        BentoText2.m20747BentoText38GnDrw(StringResource2.getString(appBarTitle, composer4, StringResource.$stable), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer4, 0, 0, 16382);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, ComposableLambda3.rememberComposableLambda(641147698, true, new AnonymousClass2(recurringFrequencySelectionState), composer3, 54), null, null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composer3, 12583302, 0, 1914);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: RecurringFrequencySelectionComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposableKt$RecurringFrequencySelectionComposable$1$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                            final /* synthetic */ RecurringFrequencySelectionState $state;

                            AnonymousClass2(RecurringFrequencySelectionState recurringFrequencySelectionState) {
                                this.$state = recurringFrequencySelectionState;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                invoke(bentoAppBarScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i & 17) == 16 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(641147698, i, -1, "com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposable.<anonymous>.<anonymous>.<anonymous> (RecurringFrequencySelectionComposable.kt:74)");
                                }
                                OnBackPressedDispatcherOwner current = BackHandler5.INSTANCE.getCurrent(composer, BackHandler5.$stable);
                                final OnBackPressedDispatcher onBackPressedDispatcher = current != null ? current.getOnBackPressedDispatcher() : null;
                                NavigationType navigationType = this.$state.getNavigationType();
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(onBackPressedDispatcher);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposableKt$RecurringFrequencySelectionComposable$1$1$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return RecurringFrequencySelectionComposable.C395841.AnonymousClass1.AnonymousClass2.invoke$lambda$1$lambda$0(onBackPressedDispatcher);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                NavIconButton.m21673NavIconButtonww6aTOc(navigationType, (Function0) objRememberedValue, null, 0L, composer, 0, 12);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
                                if (onBackPressedDispatcher != null) {
                                    onBackPressedDispatcher.onBackPressed();
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer2, 54);
                    final RecurringFrequencySelectionState recurringFrequencySelectionState2 = state;
                    final Function0<Unit> function0 = primaryButtonOnClick;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-788397454, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposableKt.RecurringFrequencySelectionComposable.1.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-788397454, i6, -1, "com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposable.<anonymous>.<anonymous> (RecurringFrequencySelectionComposable.kt:84)");
                            }
                            BentoButtonBar2.BentoButtonBar(recurringFrequencySelectionState2.getButtonBarState(), PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), null, function0, null, composer3, BentoButtonBarState.$stable, 20);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1089779268, true, new AnonymousClass3(state, z, onFrequencySelected, onDateSelected), composer2, 54), composer2, 805306800, 504);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: RecurringFrequencySelectionComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposableKt$RecurringFrequencySelectionComposable$1$3, reason: invalid class name */
                static final class AnonymousClass3 implements Function3<PaddingValues, Composer, Integer, Unit> {
                    final /* synthetic */ Function1<Long, Unit> $onDateSelected;
                    final /* synthetic */ Function1<ApiInvestmentSchedule.Frequency, Unit> $onFrequencySelected;
                    final /* synthetic */ boolean $showDatePickerOnFirstOpen;
                    final /* synthetic */ RecurringFrequencySelectionState $state;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass3(RecurringFrequencySelectionState recurringFrequencySelectionState, boolean z, Function1<? super ApiInvestmentSchedule.Frequency, Unit> function1, Function1<? super Long, Unit> function12) {
                        this.$state = recurringFrequencySelectionState;
                        this.$showDatePickerOnFirstOpen = z;
                        this.$onFrequencySelected = function1;
                        this.$onDateSelected = function12;
                    }

                    private static final boolean invoke$lambda$1(SnapshotState<Boolean> snapshotState) {
                        return snapshotState.getValue().booleanValue();
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                        invoke(paddingValues, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void invoke$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
                        snapshotState.setValue(Boolean.valueOf(z));
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$10$lambda$5$lambda$4$lambda$3(SnapshotState snapshotState) {
                        invoke$lambda$2(snapshotState, true);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$10$lambda$9$lambda$8(RecurringFrequencySelectionState recurringFrequencySelectionState, final Function1 function1, LazyListScope LazyColumn) {
                        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                        final ImmutableList<RecurringFrequencySelectionState.FrequencyOption> frequencyOptions = recurringFrequencySelectionState.getFrequencyOptions();
                        final C39577xc6e2ccf3 c39577xc6e2ccf3 = new Function1() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposableKt$RecurringFrequencySelectionComposable$1$3$invoke$lambda$10$lambda$9$lambda$8$$inlined$items$default$1
                            @Override // kotlin.jvm.functions.Function1
                            public final Void invoke(RecurringFrequencySelectionState.FrequencyOption frequencyOption) {
                                return null;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return invoke((RecurringFrequencySelectionState.FrequencyOption) obj);
                            }
                        };
                        LazyColumn.items(frequencyOptions.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposableKt$RecurringFrequencySelectionComposable$1$3$invoke$lambda$10$lambda$9$lambda$8$$inlined$items$default$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                return invoke(num.intValue());
                            }

                            public final Object invoke(int i) {
                                return c39577xc6e2ccf3.invoke(frequencyOptions.get(i));
                            }
                        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposableKt$RecurringFrequencySelectionComposable$1$3$invoke$lambda$10$lambda$9$lambda$8$$inlined$items$default$4
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
                                final RecurringFrequencySelectionState.FrequencyOption frequencyOption = (RecurringFrequencySelectionState.FrequencyOption) frequencyOptions.get(i);
                                composer.startReplaceGroup(-2102239928);
                                BentoSelectionRowState selectionRow = frequencyOption.getSelectionRow();
                                composer.startReplaceGroup(-1633490746);
                                boolean zChanged = composer.changed(function1) | composer.changedInstance(frequencyOption);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    final Function1 function12 = function1;
                                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposableKt$RecurringFrequencySelectionComposable$1$3$1$2$1$1$1$1
                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            function12.invoke(frequencyOption.getFrequency());
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                BentoSelectionRow2.BentoSelectionRow(null, selectionRow, (Function0) objRememberedValue, composer, BentoSelectionRowState.$stable << 3, 1);
                                composer.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                        return Unit.INSTANCE;
                    }

                    /* compiled from: RecurringFrequencySelectionComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposableKt$RecurringFrequencySelectionComposable$1$3$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ DatePickerState $datePickerState;
                        final /* synthetic */ Function1<Long, Unit> $onDateSelected;
                        final /* synthetic */ SnapshotState<Boolean> $showDateSelector$delegate;
                        final /* synthetic */ RecurringFrequencySelectionState $state;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass2(SnapshotState<Boolean> snapshotState, DatePickerState datePickerState, Function1<? super Long, Unit> function1, RecurringFrequencySelectionState recurringFrequencySelectionState) {
                            this.$showDateSelector$delegate = snapshotState;
                            this.$datePickerState = datePickerState;
                            this.$onDateSelected = function1;
                            this.$state = recurringFrequencySelectionState;
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
                                ComposerKt.traceEventStart(-1021061111, i, -1, "com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposable.<anonymous>.<anonymous>.<anonymous> (RecurringFrequencySelectionComposable.kt:148)");
                            }
                            composer.startReplaceGroup(5004770);
                            final SnapshotState<Boolean> snapshotState = this.$showDateSelector$delegate;
                            Object objRememberedValue = composer.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposableKt$RecurringFrequencySelectionComposable$1$3$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return RecurringFrequencySelectionComposable.C395841.AnonymousClass3.AnonymousClass2.invoke$lambda$1$lambda$0(snapshotState);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Function0 function0 = (Function0) objRememberedValue;
                            composer.endReplaceGroup();
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-402544073, true, new C507532(this.$datePickerState, this.$onDateSelected, this.$showDateSelector$delegate), composer, 54);
                            DatePickerColors datePickerColorsM5827colorsbSRYm20 = DatePickerDefaults.INSTANCE.m5827colorsbSRYm20(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composer, 0, 0, 196608, 33554430);
                            final RecurringFrequencySelectionState recurringFrequencySelectionState = this.$state;
                            final DatePickerState datePickerState = this.$datePickerState;
                            DatePickerDialog_androidKt.m5829DatePickerDialogGmEhDVc(function0, composableLambdaRememberComposableLambda, null, null, null, 0.0f, datePickerColorsM5827colorsbSRYm20, null, ComposableLambda3.rememberComposableLambda(1865657664, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposableKt.RecurringFrequencySelectionComposable.1.3.2.3
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer2, Integer num) {
                                    invoke(column5, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Column5 DatePickerDialog, Composer composer2, int i2) {
                                    long jM21425getFg0d7_KjU;
                                    Intrinsics.checkNotNullParameter(DatePickerDialog, "$this$DatePickerDialog");
                                    if ((i2 & 17) == 16 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1865657664, i2, -1, "com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecurringFrequencySelectionComposable.kt:169)");
                                    }
                                    composer2.startReplaceGroup(1849434622);
                                    Object objRememberedValue2 = composer2.rememberedValue();
                                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                        composer2.updateRememberedValue(objRememberedValue2);
                                    }
                                    final DatePickerFormatter datePickerFormatter = (DatePickerFormatter) objRememberedValue2;
                                    composer2.endReplaceGroup();
                                    if (recurringFrequencySelectionState.getDisableToday()) {
                                        composer2.startReplaceGroup(-1363982539);
                                        jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21427getFg30d7_KjU();
                                        composer2.endReplaceGroup();
                                    } else {
                                        composer2.startReplaceGroup(-1363900234);
                                        jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU();
                                        composer2.endReplaceGroup();
                                    }
                                    long j = jM21425getFg0d7_KjU;
                                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Modifier.INSTANCE, ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                                    DatePickerDefaults datePickerDefaults = DatePickerDefaults.INSTANCE;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i3 = BentoTheme.$stable;
                                    DatePickerColors datePickerColorsM5827colorsbSRYm202 = datePickerDefaults.m5827colorsbSRYm20(bentoTheme.getColors(composer2, i3).m21371getBg0d7_KjU(), bentoTheme.getColors(composer2, i3).m21425getFg0d7_KjU(), bentoTheme.getColors(composer2, i3).m21425getFg0d7_KjU(), bentoTheme.getColors(composer2, i3).m21425getFg0d7_KjU(), bentoTheme.getColors(composer2, i3).m21425getFg0d7_KjU(), bentoTheme.getColors(composer2, i3).m21425getFg0d7_KjU(), bentoTheme.getColors(composer2, i3).m21425getFg0d7_KjU(), bentoTheme.getColors(composer2, i3).m21427getFg30d7_KjU(), bentoTheme.getColors(composer2, i3).m21425getFg0d7_KjU(), bentoTheme.getColors(composer2, i3).m21371getBg0d7_KjU(), bentoTheme.getColors(composer2, i3).m21427getFg30d7_KjU(), bentoTheme.getColors(composer2, i3).m21425getFg0d7_KjU(), bentoTheme.getColors(composer2, i3).m21427getFg30d7_KjU(), bentoTheme.getColors(composer2, i3).m21425getFg0d7_KjU(), bentoTheme.getColors(composer2, i3).m21427getFg30d7_KjU(), bentoTheme.getColors(composer2, i3).m21371getBg0d7_KjU(), bentoTheme.getColors(composer2, i3).m21373getBg30d7_KjU(), bentoTheme.getColors(composer2, i3).m21425getFg0d7_KjU(), bentoTheme.getColors(composer2, i3).m21427getFg30d7_KjU(), j, bentoTheme.getColors(composer2, i3).m21371getBg0d7_KjU(), bentoTheme.getColors(composer2, i3).m21371getBg0d7_KjU(), bentoTheme.getColors(composer2, i3).m21425getFg0d7_KjU(), bentoTheme.getColors(composer2, i3).m21427getFg30d7_KjU(), null, composer2, 0, 0, 196608, 16777216);
                                    final DatePickerState datePickerState2 = datePickerState;
                                    DatePickerKt.DatePicker(datePickerState2, modifierVerticalScroll$default, datePickerFormatter, null, ComposableLambda3.rememberComposableLambda(1509199539, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposableKt.RecurringFrequencySelectionComposable.1.3.2.3.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i4) {
                                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1509199539, i4, -1, "com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecurringFrequencySelectionComposable.kt:185)");
                                            }
                                            float f = 12;
                                            DatePickerDefaults.INSTANCE.m5825DatePickerHeadline3kbWawI(datePickerState2.getSelectedDateMillis(), datePickerState2.mo5839getDisplayModejFl4v0(), datePickerFormatter, androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, androidx.compose.foundation.layout.PaddingKt.m5138PaddingValuesa9UjIt4(C2002Dp.m7995constructorimpl(24), C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f))), composer3, 24576, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer2, 54), false, datePickerColorsM5827colorsbSRYm202, composer2, 224256, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer, 54), composer, 100663350, 188);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: RecurringFrequencySelectionComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposableKt$RecurringFrequencySelectionComposable$1$3$2$2, reason: invalid class name and collision with other inner class name */
                        static final class C507532 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ DatePickerState $datePickerState;
                            final /* synthetic */ Function1<Long, Unit> $onDateSelected;
                            final /* synthetic */ SnapshotState<Boolean> $showDateSelector$delegate;

                            /* JADX WARN: Multi-variable type inference failed */
                            C507532(DatePickerState datePickerState, Function1<? super Long, Unit> function1, SnapshotState<Boolean> snapshotState) {
                                this.$datePickerState = datePickerState;
                                this.$onDateSelected = function1;
                                this.$showDateSelector$delegate = snapshotState;
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
                                    ComposerKt.traceEventStart(-402544073, i, -1, "com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecurringFrequencySelectionComposable.kt:151)");
                                }
                                Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
                                boolean z = this.$datePickerState.getSelectedDateMillis() != null;
                                composer.startReplaceGroup(-1746271574);
                                boolean zChanged = composer.changed(this.$datePickerState) | composer.changed(this.$onDateSelected);
                                final DatePickerState datePickerState = this.$datePickerState;
                                final Function1<Long, Unit> function1 = this.$onDateSelected;
                                final SnapshotState<Boolean> snapshotState = this.$showDateSelector$delegate;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposableKt$RecurringFrequencySelectionComposable$1$3$2$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return RecurringFrequencySelectionComposable.C395841.AnonymousClass3.AnonymousClass2.C507532.invoke$lambda$1$lambda$0(datePickerState, function1, snapshotState);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, "Done", modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, null, z, false, null, null, null, null, false, null, composer, 48, 0, 8152);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(DatePickerState datePickerState, Function1 function1, SnapshotState snapshotState) {
                                Long selectedDateMillis = datePickerState.getSelectedDateMillis();
                                if (selectedDateMillis != null) {
                                    AnonymousClass3.invoke$lambda$2(snapshotState, false);
                                    function1.invoke(selectedDateMillis);
                                    return Unit.INSTANCE;
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
                            AnonymousClass3.invoke$lambda$2(snapshotState, false);
                            return Unit.INSTANCE;
                        }
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                        int i2;
                        final SnapshotState snapshotState;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i & 6) == 0) {
                            i2 = i | (composer.changed(paddingValues) ? 4 : 2);
                        } else {
                            i2 = i;
                        }
                        if ((i2 & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1089779268, i2, -1, "com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposable.<anonymous>.<anonymous> (RecurringFrequencySelectionComposable.kt:91)");
                        }
                        composer.startReplaceGroup(1849434622);
                        boolean z = this.$showDatePickerOnFirstOpen;
                        Object objRememberedValue = composer.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                        composer.endReplaceGroup();
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), paddingValues);
                        final RecurringFrequencySelectionState recurringFrequencySelectionState = this.$state;
                        final Function1<ApiInvestmentSchedule.Frequency, Unit> function1 = this.$onFrequencySelected;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i3 = BentoTheme.$stable;
                        Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN4 = PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion2, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21595getXsmallD9Ej5fM());
                        StringResource title = recurringFrequencySelectionState.getTitle();
                        int i4 = StringResource.$stable;
                        BentoText2.m20747BentoText38GnDrw(StringResource2.getString(title, composer, i4), modifierM21620defaultFillMaxWidthPaddingVpY3zN4, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
                        Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion2, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composer, 48);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                        if (composer.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor2);
                        } else {
                            composer.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(StringResource2.getString(recurringFrequencySelectionState.getSubtitle(), composer, i4), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
                        String string2 = StringResource2.getString(recurringFrequencySelectionState.getNextExecutionDate(), composer, i4);
                        BentoTextButton3.Icon.Size12 size12 = new BentoTextButton3.Icon.Size12(ServerToBentoAssetMapper2.CARET_DOWN_12, BentoTextButton3.Icon.Position.Trailing);
                        composer.startReplaceGroup(5004770);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            snapshotState = snapshotState2;
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposableKt$RecurringFrequencySelectionComposable$1$3$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return RecurringFrequencySelectionComposable.C395841.AnonymousClass3.invoke$lambda$10$lambda$5$lambda$4$lambda$3(snapshotState);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        } else {
                            snapshotState = snapshotState2;
                        }
                        composer.endReplaceGroup();
                        BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue2, string2, null, size12, null, false, null, composer, (BentoTextButton3.Icon.Size12.$stable << 9) | 6, 116);
                        composer.endNode();
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM()), composer, 0);
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer.changedInstance(recurringFrequencySelectionState) | composer.changed(function1);
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposableKt$RecurringFrequencySelectionComposable$1$3$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return RecurringFrequencySelectionComposable.C395841.AnonymousClass3.invoke$lambda$10$lambda$9$lambda$8(recurringFrequencySelectionState, function1, (LazyListScope) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        composer.endReplaceGroup();
                        LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (Function1) objRememberedValue3, composer, 0, 511);
                        composer.endNode();
                        if (invoke$lambda$1(snapshotState)) {
                            Long lValueOf = Long.valueOf(this.$state.getCurrentSelectedDate().atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli());
                            final RecurringFrequencySelectionState recurringFrequencySelectionState2 = this.$state;
                            DatePickerState datePickerStateM5835rememberDatePickerStateEU0dCGE = DatePickerKt.m5835rememberDatePickerStateEU0dCGE(lValueOf, null, null, 0, new SelectableDates() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposableKt$RecurringFrequencySelectionComposable$1$3$datePickerState$1
                                @Override // androidx.compose.material3.SelectableDates
                                public boolean isSelectableDate(long utcTimeMillis) {
                                    LocalDate localDateMo3459a = Instant.ofEpochMilli(utcTimeMillis).atZone(ZoneOffset.UTC).mo3459a();
                                    if (localDateMo3459a.compareTo((ChronoLocalDate) recurringFrequencySelectionState2.getMinSelectableDate()) < 0 || localDateMo3459a.compareTo((ChronoLocalDate) recurringFrequencySelectionState2.getMaxSelectableDate()) > 0) {
                                        return false;
                                    }
                                    if (recurringFrequencySelectionState2.getWeekendEnabled()) {
                                        return true;
                                    }
                                    DayOfWeek dayOfWeek = localDateMo3459a.getDayOfWeek();
                                    Intrinsics.checkNotNullExpressionValue(dayOfWeek, "getDayOfWeek(...)");
                                    return DayOfWeeks.isWorkingDay(dayOfWeek);
                                }

                                @Override // androidx.compose.material3.SelectableDates
                                public boolean isSelectableYear(int year) {
                                    return year >= recurringFrequencySelectionState2.getMinSelectableDate().getYear() && year <= recurringFrequencySelectionState2.getMaxSelectableDate().getYear();
                                }
                            }, composer, 0, 14);
                            Boolean bool = Boolean.TRUE;
                            BentoTheme2.BentoTheme(null, null, null, null, bool, bool, null, null, ComposableLambda3.rememberComposableLambda(-1021061111, true, new AnonymousClass2(snapshotState, datePickerStateM5835rememberDatePickerStateEU0dCGE, this.$onDateSelected, this.$state), composer, 54), composer, 100884480, EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecurringFrequencySelectionComposable.RecurringFrequencySelectionComposable$lambda$0(state, z, onFrequencySelected, onDateSelected, primaryButtonOnClick, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void RecurringFrequencySelectionPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1571987808);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1571987808, i, -1, "com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionPreview (RecurringFrequencySelectionComposable.kt:256)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(358652184, true, new C395871(LocalDate.m3377of(1987, 11, 10)), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecurringFrequencySelectionComposable.RecurringFrequencySelectionPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: RecurringFrequencySelectionComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposableKt$RecurringFrequencySelectionPreview$1 */
    static final class C395871 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ LocalDate $localDate;

        C395871(LocalDate localDate) {
            this.$localDate = localDate;
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
                ComposerKt.traceEventStart(358652184, i, -1, "com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionPreview.<anonymous> (RecurringFrequencySelectionComposable.kt:259)");
            }
            StringResource.Companion companion = StringResource.INSTANCE;
            StringResource stringResourceInvoke = companion.invoke("Buy BTC");
            StringResource stringResourceInvoke2 = companion.invoke("Edit frequency");
            StringResource stringResourceInvoke3 = companion.invoke("Next order on");
            StringResource stringResourceInvoke4 = companion.invoke("Nov 10, 1987");
            ApiInvestmentSchedule.Frequency frequency = ApiInvestmentSchedule.Frequency.DAILY;
            BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
            ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(new RecurringFrequencySelectionState.FrequencyOption(frequency, new BentoSelectionRowState(type2, "Every day", true, (BentoBaseRowState.Text) new BentoBaseRowState.Text.Plain("Seven days a week"), false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2032, (DefaultConstructorMarker) null)), new RecurringFrequencySelectionState.FrequencyOption(ApiInvestmentSchedule.Frequency.WEEKLY, new BentoSelectionRowState(type2, "Every week", false, (BentoBaseRowState.Text) new BentoBaseRowState.Text.Plain("Monday"), false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2032, (DefaultConstructorMarker) null)), new RecurringFrequencySelectionState.FrequencyOption(ApiInvestmentSchedule.Frequency.BIWEEKLY, new BentoSelectionRowState(type2, "Every two weeks", false, (BentoBaseRowState.Text) new BentoBaseRowState.Text.Plain("Monday"), false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2032, (DefaultConstructorMarker) null)), new RecurringFrequencySelectionState.FrequencyOption(ApiInvestmentSchedule.Frequency.MONTHLY, new BentoSelectionRowState(type2, "Every month", false, (BentoBaseRowState.Text) new BentoBaseRowState.Text.Plain("On the 10th"), false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2032, (DefaultConstructorMarker) null)));
            BentoButtonBarState bentoButtonBarState = new BentoButtonBarState(null, null, false, null, "Continue", false, null, true, null, false, null, false, 3951, null);
            LocalDate localDate = this.$localDate;
            Intrinsics.checkNotNull(localDate);
            LocalDate localDate2 = this.$localDate;
            Intrinsics.checkNotNull(localDate2);
            LocalDate localDatePlusDays = this.$localDate.plusDays(30L);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
            RecurringFrequencySelectionState recurringFrequencySelectionState = new RecurringFrequencySelectionState(stringResourceInvoke, stringResourceInvoke2, stringResourceInvoke3, stringResourceInvoke4, immutableList3PersistentListOf, false, bentoButtonBarState, localDate, localDate2, localDatePlusDays, false, NavigationType.PUSH, true, 32, null);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposableKt$RecurringFrequencySelectionPreview$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RecurringFrequencySelectionComposable.C395871.invoke$lambda$1$lambda$0((ApiInvestmentSchedule.Frequency) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposableKt$RecurringFrequencySelectionPreview$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RecurringFrequencySelectionComposable.C395871.invoke$lambda$3$lambda$2(((Long) obj).longValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function12 = (Function1) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringFrequencySelectionComposableKt$RecurringFrequencySelectionPreview$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            RecurringFrequencySelectionComposable.RecurringFrequencySelectionComposable(recurringFrequencySelectionState, false, function1, function12, (Function0) objRememberedValue3, null, composer, 28080, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(ApiInvestmentSchedule.Frequency it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(long j) {
            return Unit.INSTANCE;
        }
    }
}

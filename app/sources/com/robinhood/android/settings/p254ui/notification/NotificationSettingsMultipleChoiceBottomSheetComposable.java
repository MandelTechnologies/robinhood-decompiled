package com.robinhood.android.settings.p254ui.notification;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhSelectionBottomSheet4;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.settings.p254ui.notification.NotificationSettingsMultipleChoiceBottomSheetComposable;
import com.robinhood.android.settings.p254ui.notification.NotificationSettingsMultipleChoiceBottomSheetFragment;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NotificationSettingsMultipleChoiceBottomSheetComposable.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\n\u001aG\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\u0010\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u008a\u008e\u0002"}, m3636d2 = {"NotificationSettingsMultipleChoiceBottomSheetComposable", "", "args", "Lcom/robinhood/android/settings/ui/notification/NotificationSettingsMultipleChoiceBottomSheetFragment$Args;", "onSelectedValuesChanged", "Lkotlin/Function1;", "", "", "dismiss", "Lkotlin/Function0;", "(Lcom/robinhood/android/settings/ui/notification/NotificationSettingsMultipleChoiceBottomSheetFragment$Args;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "NotificationSettingsMultipleChoiceBottomSheet", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/settings/ui/notification/NotificationSettingsMultipleChoiceBottomSheetFragment$Args;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-settings_externalRelease", "selectedValuesSet"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettingsMultipleChoiceBottomSheetComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class NotificationSettingsMultipleChoiceBottomSheetComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NotificationSettingsMultipleChoiceBottomSheet$lambda$1(NotificationSettingsMultipleChoiceBottomSheetFragment.Args args, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        NotificationSettingsMultipleChoiceBottomSheet(args, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NotificationSettingsMultipleChoiceBottomSheetComposable$lambda$0(NotificationSettingsMultipleChoiceBottomSheetFragment.Args args, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        NotificationSettingsMultipleChoiceBottomSheetComposable(args, function1, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void NotificationSettingsMultipleChoiceBottomSheetComposable(final NotificationSettingsMultipleChoiceBottomSheetFragment.Args args, final Function1<? super Set<String>, Unit> onSelectedValuesChanged, final Function0<Unit> dismiss, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(onSelectedValuesChanged, "onSelectedValuesChanged");
        Intrinsics.checkNotNullParameter(dismiss, "dismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(1121322354);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(args) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSelectedValuesChanged) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(dismiss) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1121322354, i2, -1, "com.robinhood.android.settings.ui.notification.NotificationSettingsMultipleChoiceBottomSheetComposable (NotificationSettingsMultipleChoiceBottomSheetComposable.kt:30)");
            }
            CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor().provides(new UserInteractionEventDescriptor(null, args.getScreen(), null, null, null, new ComponentHierarchy(new Component(Component.ComponentType.BOTTOM_SHEET, args.getRootIdentifier(), null, 4, null), null, null, null, null, 30, null), 29, null)), ComposableLambda3.rememberComposableLambda(488593586, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettingsMultipleChoiceBottomSheetComposableKt.NotificationSettingsMultipleChoiceBottomSheetComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(488593586, i3, -1, "com.robinhood.android.settings.ui.notification.NotificationSettingsMultipleChoiceBottomSheetComposable.<anonymous> (NotificationSettingsMultipleChoiceBottomSheetComposable.kt:42)");
                    }
                    NotificationSettingsMultipleChoiceBottomSheetFragment.Args args2 = args;
                    NotificationSettingsMultipleChoiceBottomSheetComposable.NotificationSettingsMultipleChoiceBottomSheet(args2, onSelectedValuesChanged, dismiss, ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, args2.getScreen(), null, null, new Component(Component.ComponentType.BOTTOM_SHEET, args.getRootIdentifier(), null, 4, null), null, 45, null), true, false, false, false, false, null, 108, null), composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettingsMultipleChoiceBottomSheetComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NotificationSettingsMultipleChoiceBottomSheetComposable.NotificationSettingsMultipleChoiceBottomSheetComposable$lambda$0(args, onSelectedValuesChanged, dismiss, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NotificationSettingsMultipleChoiceBottomSheet(final NotificationSettingsMultipleChoiceBottomSheetFragment.Args args, final Function1<? super Set<String>, Unit> function1, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1732607148);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(args) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
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
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1732607148, i3, -1, "com.robinhood.android.settings.ui.notification.NotificationSettingsMultipleChoiceBottomSheet (NotificationSettingsMultipleChoiceBottomSheetComposable.kt:67)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(777230431, true, new C284081(args, function1, function0, modifier3, AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable)), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettingsMultipleChoiceBottomSheetComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NotificationSettingsMultipleChoiceBottomSheetComposable.NotificationSettingsMultipleChoiceBottomSheet$lambda$1(args, function1, function0, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: NotificationSettingsMultipleChoiceBottomSheetComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettingsMultipleChoiceBottomSheetComposableKt$NotificationSettingsMultipleChoiceBottomSheet$1 */
    static final class C284081 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ NotificationSettingsMultipleChoiceBottomSheetFragment.Args $args;
        final /* synthetic */ Function0<Unit> $dismiss;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<Set<String>, Unit> $onSelectedValuesChanged;

        /* JADX WARN: Multi-variable type inference failed */
        C284081(NotificationSettingsMultipleChoiceBottomSheetFragment.Args args, Function1<? super Set<String>, Unit> function1, Function0<Unit> function0, Modifier modifier, EventLogger eventLogger) {
            this.$args = args;
            this.$onSelectedValuesChanged = function1;
            this.$dismiss = function0;
            this.$modifier = modifier;
            this.$eventLogger = eventLogger;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence invoke$lambda$6$lambda$5(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SnapshotState invoke$lambda$1$lambda$0(NotificationSettingsMultipleChoiceBottomSheetFragment.Args args) {
            return SnapshotState3.mutableStateOf$default(CollectionsKt.toSet(args.getSelectedValues()), null, 2, null);
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(777230431, i, -1, "com.robinhood.android.settings.ui.notification.NotificationSettingsMultipleChoiceBottomSheet.<anonymous> (NotificationSettingsMultipleChoiceBottomSheetComposable.kt:70)");
            }
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Object[] objArr = new Object[0];
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$args);
            final NotificationSettingsMultipleChoiceBottomSheetFragment.Args args = this.$args;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettingsMultipleChoiceBottomSheetComposableKt$NotificationSettingsMultipleChoiceBottomSheet$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NotificationSettingsMultipleChoiceBottomSheetComposable.C284081.invoke$lambda$1$lambda$0(args);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composer, 0, 6);
            Set<String> setInvoke$lambda$2 = invoke$lambda$2(snapshotState);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$onSelectedValuesChanged) | composer.changed(snapshotState);
            Function1<Set<String>, Unit> function1 = this.$onSelectedValuesChanged;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new NotificationSettingsMultipleChoiceBottomSheetComposable2(function1, snapshotState, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(setInvoke$lambda$2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, 0);
            String title = this.$args.getTitle();
            String subtitle = this.$args.getSubtitle();
            Component.ComponentType componentType = Component.ComponentType.BUTTON;
            Set<String> setInvoke$lambda$22 = invoke$lambda$2(snapshotState);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettingsMultipleChoiceBottomSheetComposableKt$NotificationSettingsMultipleChoiceBottomSheet$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return NotificationSettingsMultipleChoiceBottomSheetComposable.C284081.invoke$lambda$6$lambda$5((String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            RhSelectionBottomSheet4.RhSelectionBottomSheetLayout(true, title, this.$dismiss, ComposableLambda3.rememberComposableLambda(812888599, true, new AnonymousClass3(this.$args, userInteractionEventDescriptor, snapshotState, this.$eventLogger), composer, 54), this.$modifier, subtitle, null, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(componentType, CollectionsKt.joinToString$default(setInvoke$lambda$22, null, null, null, 0, null, (Function1) objRememberedValue3, 31, null), null, 4, null), null, 47, null), composer, 3078, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set<String> invoke$lambda$2(SnapshotState<Set<String>> snapshotState) {
            return snapshotState.getValue();
        }

        /* compiled from: NotificationSettingsMultipleChoiceBottomSheetComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettingsMultipleChoiceBottomSheetComposableKt$NotificationSettingsMultipleChoiceBottomSheet$1$3, reason: invalid class name */
        static final class AnonymousClass3 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ NotificationSettingsMultipleChoiceBottomSheetFragment.Args $args;
            final /* synthetic */ UserInteractionEventDescriptor $currentEventDescriptor;
            final /* synthetic */ EventLogger $eventLogger;
            final /* synthetic */ SnapshotState<Set<String>> $selectedValuesSet$delegate;

            AnonymousClass3(NotificationSettingsMultipleChoiceBottomSheetFragment.Args args, UserInteractionEventDescriptor userInteractionEventDescriptor, SnapshotState<Set<String>> snapshotState, EventLogger eventLogger) {
                this.$args = args;
                this.$currentEventDescriptor = userInteractionEventDescriptor;
                this.$selectedValuesSet$delegate = snapshotState;
                this.$eventLogger = eventLogger;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$2$lambda$1$lambda$0(NotificationSettingsMultipleChoiceBottomSheetFragment.Args args, boolean z, NotificationSettingsMultipleChoiceBottomSheetFragment.Args.ChoiceItem choiceItem, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, SnapshotState snapshotState) {
                UserInteractionEventData.Action action;
                if (args.getCanSelectMultiple()) {
                    Set mutableSet = CollectionsKt.toMutableSet(C284081.invoke$lambda$2(snapshotState));
                    if (z) {
                        mutableSet.remove(choiceItem.getValue());
                    } else {
                        mutableSet.add(choiceItem.getValue());
                    }
                    C284081.invoke$lambda$3(snapshotState, mutableSet);
                    Screen screen = userInteractionEventDescriptor.getScreen();
                    Component component = new Component(Component.ComponentType.ROW, choiceItem.getValue(), null, 4, null);
                    ComponentHierarchy componentHierarchy = userInteractionEventDescriptor.getComponentHierarchy();
                    if (z) {
                        action = UserInteractionEventData.Action.DESELECT;
                    } else {
                        action = UserInteractionEventData.Action.SELECT;
                    }
                    EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, component, componentHierarchy, null, false, 48, null);
                } else {
                    C284081.invoke$lambda$3(snapshotState, SetsKt.setOf(choiceItem.getValue()));
                    EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.SELECT, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.ROW, choiceItem.getValue(), null, 4, null), userInteractionEventDescriptor.getComponentHierarchy(), null, false, 48, null);
                }
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                final UserInteractionEventDescriptor userInteractionEventDescriptor;
                final SnapshotState<Set<String>> snapshotState;
                final EventLogger eventLogger;
                NotificationSettingsMultipleChoiceBottomSheetFragment.Args args;
                Composer composer2 = composer;
                if ((i & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(812888599, i, -1, "com.robinhood.android.settings.ui.notification.NotificationSettingsMultipleChoiceBottomSheet.<anonymous>.<anonymous> (NotificationSettingsMultipleChoiceBottomSheetComposable.kt:90)");
                }
                ImmutableList<NotificationSettingsMultipleChoiceBottomSheetFragment.Args.ChoiceItem> choices = this.$args.getChoices();
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = this.$currentEventDescriptor;
                NotificationSettingsMultipleChoiceBottomSheetFragment.Args args2 = this.$args;
                SnapshotState<Set<String>> snapshotState2 = this.$selectedValuesSet$delegate;
                EventLogger eventLogger2 = this.$eventLogger;
                int i2 = 0;
                for (NotificationSettingsMultipleChoiceBottomSheetFragment.Args.ChoiceItem choiceItem : choices) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    final NotificationSettingsMultipleChoiceBottomSheetFragment.Args.ChoiceItem choiceItem2 = choiceItem;
                    final boolean zContains = C284081.invoke$lambda$2(snapshotState2).contains(choiceItem2.getValue());
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, null, null, new Component(Component.ComponentType.ROW, choiceItem2.getValue(), null, 4, null), null, 47, null), true, false, false, false, false, null, 108, null);
                    BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(args2.getCanSelectMultiple() ? BentoSelectionRowState.Type.Checkbox : BentoSelectionRowState.Type.RadioButton, choiceItem2.getTitle(), zContains, (BentoBaseRowState.Text) null, false, i2 != CollectionsKt.getLastIndex(args2.getChoices()), (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2008, (DefaultConstructorMarker) null);
                    composer2.startReplaceGroup(-1224400529);
                    boolean zChangedInstance = composer2.changedInstance(args2) | composer2.changed(snapshotState2) | composer2.changed(zContains) | composer2.changed(choiceItem2) | composer2.changedInstance(userInteractionEventDescriptor2) | composer2.changedInstance(eventLogger2);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        userInteractionEventDescriptor = userInteractionEventDescriptor2;
                        final NotificationSettingsMultipleChoiceBottomSheetFragment.Args args3 = args2;
                        snapshotState = snapshotState2;
                        eventLogger = eventLogger2;
                        Function0 function0 = new Function0() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettingsMultipleChoiceBottomSheetComposableKt$NotificationSettingsMultipleChoiceBottomSheet$1$3$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return NotificationSettingsMultipleChoiceBottomSheetComposable.C284081.AnonymousClass3.invoke$lambda$2$lambda$1$lambda$0(args3, zContains, choiceItem2, userInteractionEventDescriptor, eventLogger, snapshotState);
                            }
                        };
                        args = args3;
                        composer2.updateRememberedValue(function0);
                        objRememberedValue = function0;
                    } else {
                        args = args2;
                        snapshotState = snapshotState2;
                        userInteractionEventDescriptor = userInteractionEventDescriptor2;
                        eventLogger = eventLogger2;
                    }
                    composer2.endReplaceGroup();
                    BentoSelectionRow2.BentoSelectionRow(modifierAutoLogEvents$default, bentoSelectionRowState, (Function0) objRememberedValue, composer2, BentoSelectionRowState.$stable << 3, 0);
                    composer2 = composer;
                    args2 = args;
                    userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                    eventLogger2 = eventLogger;
                    snapshotState2 = snapshotState;
                    i2 = i3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$3(SnapshotState<Set<String>> snapshotState, Set<String> set) {
            snapshotState.setValue(set);
        }
    }
}

package com.robinhood.shared.portfolio.lists.p391ui.modals.add;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.GenericErrorResponse;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.rosetta.converters.brokerage.Securities;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.ListsContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.lists.quickadd.OnUpdateCuratedListItemCallbacks;
import com.robinhood.shared.portfolio.contracts.AddToListsBottomSheetKey;
import com.robinhood.shared.portfolio.lists.p391ui.C39419R;
import com.robinhood.shared.portfolio.lists.p391ui.modals.add.AddToListsBottomSheetFragment;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AddToListsBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0016\u001a\u00020\u0017H\u0017¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0017H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListsBottomSheetFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "callbacks", "Lcom/robinhood/shared/lists/quickadd/OnUpdateCuratedListItemCallbacks;", "getCallbacks", "()Lcom/robinhood/shared/lists/quickadd/OnUpdateCuratedListItemCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "dismissingByUserAction", "", "baseDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "getBaseDescriptor", "()Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "dismiss", "Companion", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class AddToListsBottomSheetFragment extends GenericComposeBottomSheetDialogFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(OnUpdateCuratedListItemCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetFragment$special$$inlined$targetFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment targetFragment = CallbacksProperty.getTargetFragment();
            if (targetFragment != null) {
                return targetFragment;
            }
            throw new IllegalStateException("Required value was null.");
        }
    });
    private boolean dismissingByUserAction;
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AddToListsBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/lists/quickadd/OnUpdateCuratedListItemCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(AddToListsBottomSheetFragment addToListsBottomSheetFragment, int i, Composer composer, int i2) {
        addToListsBottomSheetFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OnUpdateCuratedListItemCallbacks getCallbacks() {
        return (OnUpdateCuratedListItemCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserInteractionEventDescriptor getBaseDescriptor() {
        ListsContext.AddToListFlow addToListFlow;
        Companion companion = INSTANCE;
        Screen eventScreen = ((AddToListsBottomSheetKey) companion.getArgs((Fragment) this)).getEventScreen();
        Component component = new Component(Component.ComponentType.ADD_TO_LIST_BOTTOM_SHEET, null, null, 6, null);
        String string2 = ((AddToListsBottomSheetKey) companion.getArgs((Fragment) this)).getSecurity().getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Asset asset = new Asset(string2, Securities.toProtobuf(((AddToListsBottomSheetKey) companion.getArgs((Fragment) this)).getSecurity()), null, null, 12, null);
        if (((AddToListsBottomSheetKey) companion.getArgs((Fragment) this)).isSingleSelect()) {
            addToListFlow = ListsContext.AddToListFlow.SINGLE_SELECTION;
        } else {
            addToListFlow = ListsContext.AddToListFlow.MULTI_SELECTION;
        }
        return new UserInteractionEventDescriptor(null, eventScreen, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, asset, null, null, null, null, null, new ListsContext(addToListFlow, null, 0, 0, null, null, 0, false, 0, 0, null, null, 4094, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1064961, -1, -1, -1, -1, -1, 16383, null), component, null, 37, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-299749987);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-299749987, i2, -1, "com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetFragment.ComposeContent (AddToListsBottomSheetFragment.kt:58)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1340139179, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-1340139179, i3, -1, "com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetFragment.ComposeContent.<anonymous> (AddToListsBottomSheetFragment.kt:60)");
                    }
                    final AddToListsBottomSheetFragment addToListsBottomSheetFragment = AddToListsBottomSheetFragment.this;
                    BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(108219251, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetFragment.ComposeContent.1.1
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
                                ComposerKt.traceEventStart(108219251, i4, -1, "com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetFragment.ComposeContent.<anonymous>.<anonymous> (AddToListsBottomSheetFragment.kt:61)");
                            }
                            final AddToListsBottomSheetFragment addToListsBottomSheetFragment2 = addToListsBottomSheetFragment;
                            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-359137666, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetFragment.ComposeContent.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i5) {
                                    if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-359137666, i5, -1, "com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (AddToListsBottomSheetFragment.kt:62)");
                                    }
                                    AutoLoggingCompositionLocals.EventLoggable(addToListsBottomSheetFragment2.getBaseDescriptor(), ComposableLambda3.rememberComposableLambda(-1242581655, true, new C507471(addToListsBottomSheetFragment2), composer4, 54), composer4, 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* compiled from: AddToListsBottomSheetFragment.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetFragment$ComposeContent$1$1$1$1, reason: invalid class name and collision with other inner class name */
                                static final class C507471 implements Function2<Composer, Integer, Unit> {
                                    final /* synthetic */ AddToListsBottomSheetFragment this$0;

                                    C507471(AddToListsBottomSheetFragment addToListsBottomSheetFragment) {
                                        this.this$0 = addToListsBottomSheetFragment;
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
                                            ComposerKt.traceEventStart(-1242581655, i, -1, "com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddToListsBottomSheetFragment.kt:65)");
                                        }
                                        composer.startReplaceGroup(5004770);
                                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                                        final AddToListsBottomSheetFragment addToListsBottomSheetFragment = this.this$0;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetFragment$ComposeContent$1$1$1$1$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return AddToListsBottomSheetFragment.C394471.AnonymousClass1.C507461.C507471.invoke$lambda$1$lambda$0(addToListsBottomSheetFragment, (CuratedList) obj);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        Function1 function1 = (Function1) objRememberedValue;
                                        composer.endReplaceGroup();
                                        composer.startReplaceGroup(5004770);
                                        boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                                        final AddToListsBottomSheetFragment addToListsBottomSheetFragment2 = this.this$0;
                                        Object objRememberedValue2 = composer.rememberedValue();
                                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new Function2() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetFragment$ComposeContent$1$1$1$1$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    return AddToListsBottomSheetFragment.C394471.AnonymousClass1.C507461.C507471.invoke$lambda$3$lambda$2(addToListsBottomSheetFragment2, (ImmutableList) obj, (ImmutableList) obj2);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue2);
                                        }
                                        Function2 function2 = (Function2) objRememberedValue2;
                                        composer.endReplaceGroup();
                                        composer.startReplaceGroup(5004770);
                                        boolean zChangedInstance3 = composer.changedInstance(this.this$0);
                                        final AddToListsBottomSheetFragment addToListsBottomSheetFragment3 = this.this$0;
                                        Object objRememberedValue3 = composer.rememberedValue();
                                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetFragment$ComposeContent$1$1$1$1$$ExternalSyntheticLambda2
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return AddToListsBottomSheetFragment.C394471.AnonymousClass1.C507461.C507471.invoke$lambda$5$lambda$4(addToListsBottomSheetFragment3, (Throwable) obj);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer.endReplaceGroup();
                                        AddToListsBottomSheetComposable.AddToListsBottomSheetComposable(function1, function2, (Function1) objRememberedValue3, null, null, composer, 0, 24);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(AddToListsBottomSheetFragment addToListsBottomSheetFragment, CuratedList selectedList) {
                                        Intrinsics.checkNotNullParameter(selectedList, "selectedList");
                                        addToListsBottomSheetFragment.getCallbacks().onAddToCuratedList(((AddToListsBottomSheetKey) AddToListsBottomSheetFragment.INSTANCE.getArgs((Fragment) addToListsBottomSheetFragment)).getSecurity(), selectedList);
                                        addToListsBottomSheetFragment.dismissingByUserAction = true;
                                        addToListsBottomSheetFragment.dismiss();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$3$lambda$2(AddToListsBottomSheetFragment addToListsBottomSheetFragment, ImmutableList listsToAdd, ImmutableList listsToRemove) {
                                        Intrinsics.checkNotNullParameter(listsToAdd, "listsToAdd");
                                        Intrinsics.checkNotNullParameter(listsToRemove, "listsToRemove");
                                        addToListsBottomSheetFragment.getCallbacks().onUpdateCuratedLists(((AddToListsBottomSheetKey) AddToListsBottomSheetFragment.INSTANCE.getArgs((Fragment) addToListsBottomSheetFragment)).getSecurity(), listsToAdd, listsToRemove);
                                        addToListsBottomSheetFragment.dismissingByUserAction = true;
                                        addToListsBottomSheetFragment.dismiss();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$5$lambda$4(AddToListsBottomSheetFragment addToListsBottomSheetFragment, Throwable t) {
                                        String string2;
                                        Intrinsics.checkNotNullParameter(t, "t");
                                        ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(t);
                                        GenericErrorResponse genericErrorResponse = errorResponseExtractErrorResponse instanceof GenericErrorResponse ? (GenericErrorResponse) errorResponseExtractErrorResponse : null;
                                        if (genericErrorResponse == null || (string2 = genericErrorResponse.getDisplayErrorText()) == null) {
                                            string2 = addToListsBottomSheetFragment.getString(C39419R.string.load_lists_generic_error_message);
                                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                        }
                                        FragmentActivity fragmentActivityRequireActivity = addToListsBottomSheetFragment.requireActivity();
                                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                                        Snackbars.show(fragmentActivityRequireActivity, string2, -1);
                                        return Unit.INSTANCE;
                                    }
                                }
                            }, composer3, 54), composer3, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AddToListsBottomSheetFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        super.dismiss();
        if (this.dismissingByUserAction) {
            return;
        }
        EventLogger.DefaultImpls.logUserInteractionEvent$default(getEventLogger(), UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(getBaseDescriptor(), null, null, UserInteractionEventData.Action.DISMISS, null, null, null, 59, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
    }

    /* compiled from: AddToListsBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListsBottomSheetFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListsBottomSheetFragment;", "Lcom/robinhood/shared/portfolio/contracts/AddToListsBottomSheetKey;", "<init>", "()V", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<AddToListsBottomSheetFragment, AddToListsBottomSheetKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public AddToListsBottomSheetFragment createDialogFragment(AddToListsBottomSheetKey addToListsBottomSheetKey) {
            return (AddToListsBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, addToListsBottomSheetKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AddToListsBottomSheetKey getArgs(AddToListsBottomSheetFragment addToListsBottomSheetFragment) {
            return (AddToListsBottomSheetKey) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, addToListsBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AddToListsBottomSheetFragment newInstance(AddToListsBottomSheetKey addToListsBottomSheetKey) {
            return (AddToListsBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, addToListsBottomSheetKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AddToListsBottomSheetFragment addToListsBottomSheetFragment, AddToListsBottomSheetKey addToListsBottomSheetKey) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, addToListsBottomSheetFragment, addToListsBottomSheetKey);
        }
    }
}

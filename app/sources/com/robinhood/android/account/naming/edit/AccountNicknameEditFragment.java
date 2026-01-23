package com.robinhood.android.account.naming.edit;

import android.content.Context;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.account.contracts.naming.EditAccountNicknameFragmentKey;
import com.robinhood.android.account.contracts.naming.EditNicknameCallback;
import com.robinhood.android.account.naming.common.AccountNicknameEvent;
import com.robinhood.android.account.naming.common.AccountNicknameScreen;
import com.robinhood.android.account.naming.common.AccountNicknameViewState;
import com.robinhood.android.account.naming.edit.AccountNicknameEditFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
import com.robinhood.rosetta.converters.brokerage.ManagementTypes2;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AccountNicknameEditFragment.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0016\u001a\u00020\u0017H\u0017¢\u0006\u0002\u0010\u0018R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u0084\u0002²\u0006\u0012\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/account/naming/edit/AccountNicknameEditFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/account/naming/edit/AccountNicknameEditDuxo;", "getDuxo", "()Lcom/robinhood/android/account/naming/edit/AccountNicknameEditDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callback", "Lcom/robinhood/android/account/contracts/naming/AccountEditNicknameCallback;", "getCallback", "()Lcom/robinhood/android/account/contracts/naming/AccountEditNicknameCallback;", "callback$delegate", "Lkotlin/properties/ReadOnlyProperty;", "toolbarVisible", "", "getToolbarVisible", "()Z", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-account-naming_externalDebug", "state", "Lcom/robinhood/android/account/naming/common/AccountNicknameViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/account/naming/common/AccountNicknameEvent;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AccountNicknameEditFragment extends GenericComposeFragment {
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AccountNicknameEditFragment.class, "callback", "getCallback()Lcom/robinhood/android/account/contracts/naming/AccountEditNicknameCallback;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, AccountNicknameEditDuxo.class);

    /* renamed from: callback$delegate, reason: from kotlin metadata */
    private final Interfaces2 callback = new CallbacksProperty(Reflection.getOrCreateKotlinClass(EditNicknameCallback.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.account.naming.edit.AccountNicknameEditFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
            if (!(parentFragment instanceof EditNicknameCallback)) {
                parentFragment = null;
            }
            EditNicknameCallback editNicknameCallback = (EditNicknameCallback) parentFragment;
            if (editNicknameCallback != null) {
                return editNicknameCallback;
            }
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof EditNicknameCallback) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final boolean useDesignSystemToolbar = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(AccountNicknameEditFragment accountNicknameEditFragment, int i, Composer composer, int i2) {
        accountNicknameEditFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccountNicknameEditDuxo getDuxo() {
        return (AccountNicknameEditDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditNicknameCallback getCallback() {
        return (EditNicknameCallback) this.callback.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        EventConsumer<AccountNicknameEvent> eventConsumerInvoke;
        Composer composerStartRestartGroup = composer.startRestartGroup(1094548762);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1094548762, i2, -1, "com.robinhood.android.account.naming.edit.AccountNicknameEditFragment.ComposeContent (AccountNicknameEditFragment.kt:36)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final Event<AccountNicknameEvent> eventComposeContent$lambda$1 = ComposeContent$lambda$1(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            if (eventComposeContent$lambda$1 != null && (eventComposeContent$lambda$1.getData() instanceof AccountNicknameEvent.OnSaveSuccess) && (eventConsumerInvoke = eventComposeContent$lambda$1.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(eventComposeContent$lambda$1, new Function1() { // from class: com.robinhood.android.account.naming.edit.AccountNicknameEditFragment$ComposeContent$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m10790invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m10790invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        this.getCallback().onAccountNicknameUpdated();
                    }
                });
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1647038097, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.account.naming.edit.AccountNicknameEditFragment.ComposeContent.2
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
                        ComposerKt.traceEventStart(-1647038097, i3, -1, "com.robinhood.android.account.naming.edit.AccountNicknameEditFragment.ComposeContent.<anonymous> (AccountNicknameEditFragment.kt:45)");
                    }
                    Screen screen = new Screen(Screen.Name.EDIT_ACCOUNT_NICKNAME, null, null, null, 14, null);
                    Companion companion = AccountNicknameEditFragment.INSTANCE;
                    String source = ((EditAccountNicknameFragmentKey) companion.getArgs((Fragment) AccountNicknameEditFragment.this)).getSource();
                    if (source == null) {
                        source = "";
                    }
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, source, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(AccountNicknameEditFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getBrokerageAccountType()), ((EditAccountNicknameFragmentKey) companion.getArgs((Fragment) AccountNicknameEditFragment.this)).getAccountNumber(), ManagementTypes2.toProtobuf(AccountNicknameEditFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getManagementType()), null, false, false, null, null, null, null, 1016, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -257, -1, -1, 16383, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(679878116, true, new AnonymousClass1(AccountNicknameEditFragment.this, snapshotState4CollectAsStateWithLifecycle), composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: AccountNicknameEditFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.account.naming.edit.AccountNicknameEditFragment$ComposeContent$2$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotState4<AccountNicknameViewState> $state$delegate;
                    final /* synthetic */ AccountNicknameEditFragment this$0;

                    AnonymousClass1(AccountNicknameEditFragment accountNicknameEditFragment, SnapshotState4<AccountNicknameViewState> snapshotState4) {
                        this.this$0 = accountNicknameEditFragment;
                        this.$state$delegate = snapshotState4;
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
                            ComposerKt.traceEventStart(679878116, i, -1, "com.robinhood.android.account.naming.edit.AccountNicknameEditFragment.ComposeContent.<anonymous>.<anonymous> (AccountNicknameEditFragment.kt:58)");
                        }
                        AccountNicknameViewState accountNicknameViewStateComposeContent$lambda$0 = AccountNicknameEditFragment.ComposeContent$lambda$0(this.$state$delegate);
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final AccountNicknameEditFragment accountNicknameEditFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.account.naming.edit.AccountNicknameEditFragment$ComposeContent$2$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AccountNicknameEditFragment.C81482.AnonymousClass1.invoke$lambda$1$lambda$0(accountNicknameEditFragment, (String) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function1 function1 = (Function1) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composer.changedInstance(this.this$0) | composer.changed(this.$state$delegate);
                        final AccountNicknameEditFragment accountNicknameEditFragment2 = this.this$0;
                        final SnapshotState4<AccountNicknameViewState> snapshotState4 = this.$state$delegate;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.account.naming.edit.AccountNicknameEditFragment$ComposeContent$2$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AccountNicknameEditFragment.C81482.AnonymousClass1.invoke$lambda$3$lambda$2(accountNicknameEditFragment2, snapshotState4);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        Function0 function0 = (Function0) objRememberedValue2;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance3 = composer.changedInstance(this.this$0);
                        final AccountNicknameEditFragment accountNicknameEditFragment3 = this.this$0;
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.account.naming.edit.AccountNicknameEditFragment$ComposeContent$2$1$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AccountNicknameEditFragment.C81482.AnonymousClass1.invoke$lambda$5$lambda$4(accountNicknameEditFragment3);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        composer.endReplaceGroup();
                        AccountNicknameScreen.AccountNicknameScreen(accountNicknameViewStateComposeContent$lambda$0, function1, function0, (Function0) objRememberedValue3, new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.SAVE, null, new Component(Component.ComponentType.BUTTON, "submit", null, 4, null), null, 43, null), ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null), composer, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(AccountNicknameEditFragment accountNicknameEditFragment, String it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        accountNicknameEditFragment.getDuxo().onNicknameChanged(it);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(AccountNicknameEditFragment accountNicknameEditFragment, SnapshotState4 snapshotState4) {
                        accountNicknameEditFragment.getDuxo().onSaveClicked(AccountNicknameEditFragment.ComposeContent$lambda$0(snapshotState4).getNickname());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$5$lambda$4(AccountNicknameEditFragment accountNicknameEditFragment) {
                        accountNicknameEditFragment.requireBaseActivity().onBackPressed();
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.account.naming.edit.AccountNicknameEditFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountNicknameEditFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AccountNicknameEditFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/account/naming/edit/AccountNicknameEditFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/account/naming/edit/AccountNicknameEditFragment;", "Lcom/robinhood/android/account/contracts/naming/EditAccountNicknameFragmentKey;", "<init>", "()V", "feature-account-naming_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AccountNicknameEditFragment, EditAccountNicknameFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(EditAccountNicknameFragmentKey editAccountNicknameFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, editAccountNicknameFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public EditAccountNicknameFragmentKey getArgs(AccountNicknameEditFragment accountNicknameEditFragment) {
            return (EditAccountNicknameFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, accountNicknameEditFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AccountNicknameEditFragment newInstance(EditAccountNicknameFragmentKey editAccountNicknameFragmentKey) {
            return (AccountNicknameEditFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, editAccountNicknameFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AccountNicknameEditFragment accountNicknameEditFragment, EditAccountNicknameFragmentKey editAccountNicknameFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, accountNicknameEditFragment, editAccountNicknameFragmentKey);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountNicknameViewState ComposeContent$lambda$0(SnapshotState4<AccountNicknameViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<AccountNicknameEvent> ComposeContent$lambda$1(SnapshotState4<Event<AccountNicknameEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }
}

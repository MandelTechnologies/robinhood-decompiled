package com.robinhood.android.internalassettransfers.accountselection;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.internalassettransfers.accountselection.AccountSelectionEvent;
import com.robinhood.android.internalassettransfers.accountselection.AccountSelectionFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AccountSelectionFragment.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\r\u0010\u001a\u001a\u00020\u0015H\u0017¢\u0006\u0002\u0010\u001bR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionCallbacks;", "getCallbacks", "()Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDuxo;", "getDuxo", "()Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "toolbarVisible", "", "getToolbarVisible", "()Z", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Args", "Companion", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class AccountSelectionFragment extends GenericComposeFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AccountSelectionCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof AccountSelectionCallbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, AccountSelectionDuxo.class);
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AccountSelectionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(AccountSelectionFragment accountSelectionFragment, int i, Composer composer, int i2) {
        accountSelectionFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccountSelectionCallbacks getCallbacks() {
        return (AccountSelectionCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccountSelectionDuxo getDuxo() {
        return (AccountSelectionDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* compiled from: AccountSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionFragment$onViewCreated$1", m3645f = "AccountSelectionFragment.kt", m3646l = {36}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionFragment$onViewCreated$1 */
    static final class C190181 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C190181(Continuation<? super C190181> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountSelectionFragment.this.new C190181(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C190181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AccountSelectionFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionFragment$onViewCreated$1$1", m3645f = "AccountSelectionFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Event<AccountSelectionEvent>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AccountSelectionFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AccountSelectionFragment accountSelectionFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = accountSelectionFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Event<AccountSelectionEvent> event, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(event, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                EventConsumer eventConsumer;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final Event event = (Event) this.L$0;
                if (event != null) {
                    final AccountSelectionFragment accountSelectionFragment = this.this$0;
                    if ((event.getData() instanceof AccountSelectionEvent.NavigateToFragment) && (eventConsumer = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer.consume(event, new Function1() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionFragment$onViewCreated$1$1$invokeSuspend$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m15380invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m15380invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                AccountSelectionEvent.NavigateToFragment navigateToFragment = (AccountSelectionEvent.NavigateToFragment) event.getData();
                                Navigator navigator = accountSelectionFragment.getNavigator();
                                Context contextRequireContext = accountSelectionFragment.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, navigateToFragment.getFragmentKey(), false, false, false, null, false, null, false, false, null, null, 4092, null);
                            }
                        });
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<AccountSelectionEvent>> eventFlow = AccountSelectionFragment.this.getDuxo().getEventFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AccountSelectionFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(eventFlow, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C190181(null), 1, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1688016729);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1688016729, i2, -1, "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionFragment.ComposeContent (AccountSelectionFragment.kt:47)");
            }
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new AccountSelectionFragment2(this, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.INTERNAL_ASSET_TRANSFER_ACCOUNT_SELECTION, null, null, null, 14, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, ((Args) INSTANCE.getArgs((Fragment) this)).getSource(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(1041315342, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionFragment.ComposeContent.2

                /* compiled from: AccountSelectionFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionFragment$ComposeContent$2$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ AccountSelectionFragment this$0;

                    AnonymousClass1(AccountSelectionFragment accountSelectionFragment) {
                        this.this$0 = accountSelectionFragment;
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
                            ComposerKt.traceEventStart(-395177511, i, -1, "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionFragment.ComposeContent.<anonymous>.<anonymous> (AccountSelectionFragment.kt:62)");
                        }
                        AccountSelectionCallbacks callbacks = this.this$0.getCallbacks();
                        Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null);
                        AccountSelectionDuxo duxo = this.this$0.getDuxo();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final AccountSelectionFragment accountSelectionFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionFragment$ComposeContent$2$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AccountSelectionFragment.C190172.AnonymousClass1.invoke$lambda$1$lambda$0(accountSelectionFragment);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        AccountSelectionComposableKt.AccountSelectionComposable(callbacks, (Function0) objRememberedValue, duxo, modifierLogScreenTransitions$default, composer, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(AccountSelectionFragment accountSelectionFragment) {
                        accountSelectionFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                        return Unit.INSTANCE;
                    }
                }

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
                        ComposerKt.traceEventStart(1041315342, i3, -1, "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionFragment.ComposeContent.<anonymous> (AccountSelectionFragment.kt:61)");
                    }
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-395177511, true, new AnonymousClass1(AccountSelectionFragment.this), composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountSelectionFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AccountSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionFragment$Args;", "Landroid/os/Parcelable;", "source", "", "accountTypeFilter", "Lcom/robinhood/models/api/BrokerageAccountType;", "sinkRhsAccountNumber", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "getAccountTypeFilter", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getSinkRhsAccountNumber", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final BrokerageAccountType accountTypeFilter;
        private final String sinkRhsAccountNumber;
        private final String source;

        /* compiled from: AccountSelectionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readInt() == 0 ? null : BrokerageAccountType.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, BrokerageAccountType brokerageAccountType, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.source;
            }
            if ((i & 2) != 0) {
                brokerageAccountType = args.accountTypeFilter;
            }
            if ((i & 4) != 0) {
                str2 = args.sinkRhsAccountNumber;
            }
            return args.copy(str, brokerageAccountType, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component2, reason: from getter */
        public final BrokerageAccountType getAccountTypeFilter() {
            return this.accountTypeFilter;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSinkRhsAccountNumber() {
            return this.sinkRhsAccountNumber;
        }

        public final Args copy(String source, BrokerageAccountType accountTypeFilter, String sinkRhsAccountNumber) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new Args(source, accountTypeFilter, sinkRhsAccountNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.source, args.source) && this.accountTypeFilter == args.accountTypeFilter && Intrinsics.areEqual(this.sinkRhsAccountNumber, args.sinkRhsAccountNumber);
        }

        public int hashCode() {
            int iHashCode = this.source.hashCode() * 31;
            BrokerageAccountType brokerageAccountType = this.accountTypeFilter;
            int iHashCode2 = (iHashCode + (brokerageAccountType == null ? 0 : brokerageAccountType.hashCode())) * 31;
            String str = this.sinkRhsAccountNumber;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Args(source=" + this.source + ", accountTypeFilter=" + this.accountTypeFilter + ", sinkRhsAccountNumber=" + this.sinkRhsAccountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.source);
            BrokerageAccountType brokerageAccountType = this.accountTypeFilter;
            if (brokerageAccountType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(brokerageAccountType.name());
            }
            dest.writeString(this.sinkRhsAccountNumber);
        }

        public Args(String source, BrokerageAccountType brokerageAccountType, String str) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.source = source;
            this.accountTypeFilter = brokerageAccountType;
            this.sinkRhsAccountNumber = str;
        }

        public final String getSource() {
            return this.source;
        }

        public final BrokerageAccountType getAccountTypeFilter() {
            return this.accountTypeFilter;
        }

        public final String getSinkRhsAccountNumber() {
            return this.sinkRhsAccountNumber;
        }
    }

    /* compiled from: AccountSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionFragment;", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionFragment$Args;", "<init>", "()V", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<AccountSelectionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(AccountSelectionFragment accountSelectionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, accountSelectionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AccountSelectionFragment newInstance(Args args) {
            return (AccountSelectionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AccountSelectionFragment accountSelectionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, accountSelectionFragment, args);
        }
    }
}

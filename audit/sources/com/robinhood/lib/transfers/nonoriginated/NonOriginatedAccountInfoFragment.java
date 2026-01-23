package com.robinhood.lib.transfers.nonoriginated;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.view.result.ActivityResultCaller;
import bff_money_movement.service.p019v1.NonOriginatedTransferTypeDto;
import bff_money_movement.service.p019v1.RobinhoodAccountDto;
import bff_money_movement.service.p019v1.StandardScreenDataDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoDuxo5;
import com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoFragment;
import com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoViewState;
import com.robinhood.rosetta.common.CurrencyDto;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: NonOriginatedAccountInfoFragment.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0003!\"#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0015\u001a\u00020\u0016H\u0017¢\u0006\u0002\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0016\u0010\u001d\u001a\u00020\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006$²\u0006\n\u0010%\u001a\u00020&X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoDuxo;", "getDuxo", "()Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoEvent;", "Callbacks", "Args", "Companion", "feature-lib-non-originated-transfer-info_externalDebug", "viewState", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class NonOriginatedAccountInfoFragment extends GenericComposeFragment implements AutoLoggableFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
            if (!(parentFragment instanceof NonOriginatedAccountInfoFragment.Callbacks)) {
                parentFragment = null;
            }
            NonOriginatedAccountInfoFragment.Callbacks callbacks = (NonOriginatedAccountInfoFragment.Callbacks) parentFragment;
            if (callbacks != null) {
                return callbacks;
            }
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof NonOriginatedAccountInfoFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, NonOriginatedAccountInfoDuxo.class);
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(NonOriginatedAccountInfoFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: NonOriginatedAccountInfoFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoFragment$Callbacks;", "", "showConfirmation", "", "screenData", "Lbff_money_movement/service/v1/StandardScreenDataDto;", "exitNonOriginatedAccountInfo", "feature-lib-non-originated-transfer-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void exitNonOriginatedAccountInfo();

        void showConfirmation(StandardScreenDataDto screenData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(NonOriginatedAccountInfoFragment nonOriginatedAccountInfoFragment, int i, Composer composer, int i2) {
        nonOriginatedAccountInfoFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<NonOriginatedAccountInfoDuxo5> event) {
        EventConsumer<NonOriginatedAccountInfoDuxo5> eventConsumerInvoke;
        EventConsumer<NonOriginatedAccountInfoDuxo5> eventConsumerInvoke2;
        if ((event.getData() instanceof NonOriginatedAccountInfoDuxo5.ShowConfirmation) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoFragment$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m22565invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m22565invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.getCallbacks().showConfirmation(((NonOriginatedAccountInfoDuxo5.ShowConfirmation) event.getData()).getScreenData());
                }
            });
        }
        if (!(event.getData() instanceof NonOriginatedAccountInfoDuxo5.Exit) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoFragment$handleEvent$$inlined$consumeIfType$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m22566invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22566invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.getCallbacks().exitNonOriginatedAccountInfo();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NonOriginatedAccountInfoDuxo getDuxo() {
        return (NonOriginatedAccountInfoDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Companion companion = INSTANCE;
        Screen.Name screenName = ((Args) companion.getArgs((Fragment) this)).getScreenName();
        if (screenName == null) {
            screenName = Screen.Name.NAME_UNSPECIFIED;
        }
        return new Screen(screenName, null, ((Args) companion.getArgs((Fragment) this)).getTransferType() + "_" + ((Args) companion.getArgs((Fragment) this)).getCurrency(), null, 10, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1955630926);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1955630926, i2, -1, "com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoFragment.ComposeContent (NonOriginatedAccountInfoFragment.kt:51)");
            }
            NonOriginatedAccountInfoViewState nonOriginatedAccountInfoViewStateComposeContent$lambda$0 = ComposeContent$lambda$0(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            if (nonOriginatedAccountInfoViewStateComposeContent$lambda$0 instanceof NonOriginatedAccountInfoViewState.Loaded) {
                composerStartRestartGroup.startReplaceGroup(-1030227007);
                NonOriginatedAccountInfoComposable3.NonOriginatedAccountInfoComposable(getEventScreen(), ((NonOriginatedAccountInfoViewState.Loaded) nonOriginatedAccountInfoViewStateComposeContent$lambda$0).getState(), getDuxo(), WindowInsetsPadding6.windowInsetsPadding(Modifier.INSTANCE, WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getSafeContent(WindowInsets.INSTANCE, composerStartRestartGroup, 6), WindowInsetsSides.INSTANCE.m5198getBottomJoeWqyM())), composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (nonOriginatedAccountInfoViewStateComposeContent$lambda$0 instanceof NonOriginatedAccountInfoViewState.Loading) {
                composerStartRestartGroup.startReplaceGroup(-1834333953);
                LoadingScreenComposablesKt.ListLoadingScreenComposable(null, true, false, 0, composerStartRestartGroup, 48, 13);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(nonOriginatedAccountInfoViewStateComposeContent$lambda$0 instanceof NonOriginatedAccountInfoViewState.Error)) {
                    composerStartRestartGroup.startReplaceGroup(-1834351017);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-1834330505);
                ErrorScreenComposable.ErrorScreenComposable(null, null, 0, null, null, null, null, false, composerStartRestartGroup, 12582912, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NonOriginatedAccountInfoFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: NonOriginatedAccountInfoFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoFragment$onViewCreated$1", m3645f = "NonOriginatedAccountInfoFragment.kt", m3646l = {74}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoFragment$onViewCreated$1 */
    static final class C334171 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C334171(Continuation<? super C334171> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NonOriginatedAccountInfoFragment.this.new C334171(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C334171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: NonOriginatedAccountInfoFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ NonOriginatedAccountInfoFragment $tmp0;

            AnonymousClass1(NonOriginatedAccountInfoFragment nonOriginatedAccountInfoFragment) {
                this.$tmp0 = nonOriginatedAccountInfoFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, NonOriginatedAccountInfoFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<NonOriginatedAccountInfoDuxo5> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C334171.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<NonOriginatedAccountInfoDuxo5>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(NonOriginatedAccountInfoFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(NonOriginatedAccountInfoFragment.this);
                this.label = 1;
                if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleEvent(NonOriginatedAccountInfoFragment nonOriginatedAccountInfoFragment, Event event, Continuation continuation) {
            nonOriginatedAccountInfoFragment.handleEvent(event);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C334171(null), 1, null);
    }

    private static final NonOriginatedAccountInfoViewState ComposeContent$lambda$0(SnapshotState4<? extends NonOriginatedAccountInfoViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: NonOriginatedAccountInfoFragment.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoFragment$Args;", "Landroid/os/Parcelable;", "transferType", "Lbff_money_movement/service/v1/NonOriginatedTransferTypeDto;", "currency", "Lcom/robinhood/rosetta/common/CurrencyDto;", "robinhoodAccount", "Lbff_money_movement/service/v1/RobinhoodAccountDto;", "screenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "<init>", "(Lbff_money_movement/service/v1/NonOriginatedTransferTypeDto;Lcom/robinhood/rosetta/common/CurrencyDto;Lbff_money_movement/service/v1/RobinhoodAccountDto;Lcom/robinhood/rosetta/eventlogging/Screen$Name;)V", "getTransferType", "()Lbff_money_movement/service/v1/NonOriginatedTransferTypeDto;", "getCurrency", "()Lcom/robinhood/rosetta/common/CurrencyDto;", "getRobinhoodAccount", "()Lbff_money_movement/service/v1/RobinhoodAccountDto;", "getScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-non-originated-transfer-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final CurrencyDto currency;
        private final RobinhoodAccountDto robinhoodAccount;
        private final Screen.Name screenName;
        private final NonOriginatedTransferTypeDto transferType;

        /* compiled from: NonOriginatedAccountInfoFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((NonOriginatedTransferTypeDto) parcel.readParcelable(Args.class.getClassLoader()), (CurrencyDto) parcel.readParcelable(Args.class.getClassLoader()), (RobinhoodAccountDto) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() == 0 ? null : Screen.Name.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, NonOriginatedTransferTypeDto nonOriginatedTransferTypeDto, CurrencyDto currencyDto, RobinhoodAccountDto robinhoodAccountDto, Screen.Name name, int i, Object obj) {
            if ((i & 1) != 0) {
                nonOriginatedTransferTypeDto = args.transferType;
            }
            if ((i & 2) != 0) {
                currencyDto = args.currency;
            }
            if ((i & 4) != 0) {
                robinhoodAccountDto = args.robinhoodAccount;
            }
            if ((i & 8) != 0) {
                name = args.screenName;
            }
            return args.copy(nonOriginatedTransferTypeDto, currencyDto, robinhoodAccountDto, name);
        }

        /* renamed from: component1, reason: from getter */
        public final NonOriginatedTransferTypeDto getTransferType() {
            return this.transferType;
        }

        /* renamed from: component2, reason: from getter */
        public final CurrencyDto getCurrency() {
            return this.currency;
        }

        /* renamed from: component3, reason: from getter */
        public final RobinhoodAccountDto getRobinhoodAccount() {
            return this.robinhoodAccount;
        }

        /* renamed from: component4, reason: from getter */
        public final Screen.Name getScreenName() {
            return this.screenName;
        }

        public final Args copy(NonOriginatedTransferTypeDto transferType, CurrencyDto currency, RobinhoodAccountDto robinhoodAccount, Screen.Name screenName) {
            Intrinsics.checkNotNullParameter(transferType, "transferType");
            Intrinsics.checkNotNullParameter(currency, "currency");
            return new Args(transferType, currency, robinhoodAccount, screenName);
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
            return this.transferType == args.transferType && this.currency == args.currency && Intrinsics.areEqual(this.robinhoodAccount, args.robinhoodAccount) && this.screenName == args.screenName;
        }

        public int hashCode() {
            int iHashCode = ((this.transferType.hashCode() * 31) + this.currency.hashCode()) * 31;
            RobinhoodAccountDto robinhoodAccountDto = this.robinhoodAccount;
            int iHashCode2 = (iHashCode + (robinhoodAccountDto == null ? 0 : robinhoodAccountDto.hashCode())) * 31;
            Screen.Name name = this.screenName;
            return iHashCode2 + (name != null ? name.hashCode() : 0);
        }

        public String toString() {
            return "Args(transferType=" + this.transferType + ", currency=" + this.currency + ", robinhoodAccount=" + this.robinhoodAccount + ", screenName=" + this.screenName + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.transferType, flags);
            dest.writeParcelable(this.currency, flags);
            dest.writeParcelable(this.robinhoodAccount, flags);
            Screen.Name name = this.screenName;
            if (name == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(name.name());
            }
        }

        public Args(NonOriginatedTransferTypeDto transferType, CurrencyDto currency, RobinhoodAccountDto robinhoodAccountDto, Screen.Name name) {
            Intrinsics.checkNotNullParameter(transferType, "transferType");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.transferType = transferType;
            this.currency = currency;
            this.robinhoodAccount = robinhoodAccountDto;
            this.screenName = name;
        }

        public /* synthetic */ Args(NonOriginatedTransferTypeDto nonOriginatedTransferTypeDto, CurrencyDto currencyDto, RobinhoodAccountDto robinhoodAccountDto, Screen.Name name, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(nonOriginatedTransferTypeDto, currencyDto, (i & 4) != 0 ? null : robinhoodAccountDto, (i & 8) != 0 ? null : name);
        }

        public final NonOriginatedTransferTypeDto getTransferType() {
            return this.transferType;
        }

        public final CurrencyDto getCurrency() {
            return this.currency;
        }

        public final RobinhoodAccountDto getRobinhoodAccount() {
            return this.robinhoodAccount;
        }

        public final Screen.Name getScreenName() {
            return this.screenName;
        }
    }

    /* compiled from: NonOriginatedAccountInfoFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoFragment;", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoFragment$Args;", "<init>", "()V", "feature-lib-non-originated-transfer-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<NonOriginatedAccountInfoFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(NonOriginatedAccountInfoFragment nonOriginatedAccountInfoFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, nonOriginatedAccountInfoFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public NonOriginatedAccountInfoFragment newInstance(Args args) {
            return (NonOriginatedAccountInfoFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(NonOriginatedAccountInfoFragment nonOriginatedAccountInfoFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, nonOriginatedAccountInfoFragment, args);
        }
    }
}

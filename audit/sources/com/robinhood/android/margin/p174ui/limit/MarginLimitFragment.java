package com.robinhood.android.margin.p174ui.limit;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.lib.margin.api.ApiMarginInvestingInfo;
import com.robinhood.android.margin.C20999R;
import com.robinhood.android.margin.p174ui.limit.MarginLimitEvent;
import com.robinhood.android.margin.p174ui.limit.MarginLimitFragment;
import com.robinhood.android.margin.p174ui.limit.MarginLimitStateProvider3;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.numpad.BentoNumpad3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.util.Money;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.resource.StringResource;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: MarginLimitFragment.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 -2\u00020\u0001:\u0003+,-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\r\u0010\u0017\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007¢\u0006\u0002\u0010\u001cJA\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110%H\u0007¢\u0006\u0002\u0010&J\b\u0010'\u001a\u00020\u0011H\u0016J\u0010\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020*H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006.²\u0006\u0012\u0010/\u001a\n\u0012\u0004\u0012\u000201\u0018\u000100X\u008a\u0084\u0002²\u0006\n\u00102\u001a\u000203X\u008a\u0084\u0002²\u0006\n\u00104\u001a\u00020#X\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/margin/ui/limit/MarginLimitFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/margin/ui/limit/MarginLimitFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/margin/ui/limit/MarginLimitDuxo;", "getDuxo", "()Lcom/robinhood/android/margin/ui/limit/MarginLimitDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onAttach", "", "context", "Landroid/content/Context;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "MarginLimitScreen", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SetMarginLimitButtonComposable", "marginLimitButtonText", "", "marginLimitButtonType", "Lcom/robinhood/compose/bento/component/BentoButtons$Type;", "enabled", "", "onMarginLimitButtonClicked", "Lkotlin/Function0;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/BentoButtons$Type;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "onStart", "confirmMarginLimit", "newMarginLimit", "Lcom/robinhood/models/util/Money;", "Callbacks", "Args", "Companion", "feature-margin_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitEvent;", "viewState", "Lcom/robinhood/android/margin/ui/limit/MarginLimitViewState;", "showNumpad"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MarginLimitFragment extends GenericComposeFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.margin.ui.limit.MarginLimitFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof MarginLimitFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, MarginLimitDuxo.class);
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MarginLimitFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/margin/ui/limit/MarginLimitFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MarginLimitFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitFragment$Callbacks;", "", "onMarginLimitConfirmed", "", "marginLimit", "Lcom/robinhood/models/util/Money;", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onMarginLimitConfirmed(Money marginLimit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(MarginLimitFragment marginLimitFragment, int i, Composer composer, int i2) throws Resources.NotFoundException {
        marginLimitFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginLimitScreen$lambda$10(MarginLimitFragment marginLimitFragment, Modifier modifier, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        marginLimitFragment.MarginLimitScreen(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SetMarginLimitButtonComposable$lambda$13(MarginLimitFragment marginLimitFragment, String str, Modifier modifier, BentoButtons.Type type2, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        marginLimitFragment.SetMarginLimitButtonComposable(str, modifier, type2, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MarginLimitDuxo getDuxo() {
        return (MarginLimitDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (context instanceof Callbacks) {
            return;
        }
        throw new IllegalArgumentException((context + " must implement " + Callbacks.class.getName()).toString());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) throws Resources.NotFoundException {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1749009228);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1749009228, i2, -1, "com.robinhood.android.margin.ui.limit.MarginLimitFragment.ComposeContent (MarginLimitFragment.kt:63)");
            }
            MarginLimitScreen(null, composerStartRestartGroup, (i2 << 3) & 112, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.ui.limit.MarginLimitFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarginLimitFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @SuppressLint({"FlowOperatorInvokedInComposition"})
    public final void MarginLimitScreen(Modifier modifier, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        final Modifier modifier2;
        int i3;
        Composer composer2;
        EventConsumer<MarginLimitEvent> eventConsumerInvoke;
        EventConsumer<MarginLimitEvent> eventConsumerInvoke2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1505846027);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1505846027, i3, -1, "com.robinhood.android.margin.ui.limit.MarginLimitFragment.MarginLimitScreen (MarginLimitFragment.kt:69)");
            }
            final StateFlow<Event<MarginLimitEvent>> eventFlow = getDuxo().getEventFlow();
            composerStartRestartGroup.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.margin.ui.limit.MarginLimitFragment$MarginLimitScreen$$inlined$collectEventAsStateWithLifecycle$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.margin.ui.limit.MarginLimitFragment$MarginLimitScreen$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.margin.ui.limit.MarginLimitFragment$MarginLimitScreen$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "MarginLimitFragment.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.margin.ui.limit.MarginLimitFragment$MarginLimitScreen$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Event event = (Event) obj;
                            if ((event != null ? event.getData() : null) instanceof MarginLimitEvent) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                    Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            Event<MarginLimitEvent> value = eventFlow.getValue();
            Event<MarginLimitEvent> event = value;
            CharSequence text = null;
            if (!((event != null ? event.getData() : null) instanceof MarginLimitEvent)) {
                value = null;
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceGroup();
            SnapshotState4 snapshotState4CollectAsState = SnapshotStateKt.collectAsState(getDuxo().getStateFlow(), null, composerStartRestartGroup, 0, 1);
            FragmentActivity activity = getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.robinhood.android.margin.ui.limit.MarginLimitActivity");
            MarginLimitActivity marginLimitActivity = (MarginLimitActivity) activity;
            StringResource availableMarginText = MarginLimitScreen$lambda$2(snapshotState4CollectAsState).getAvailableMarginText();
            if (availableMarginText != null) {
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                text = availableMarginText.getText(resources);
            }
            String strValueOf = String.valueOf(text);
            boolean z = MarginLimitScreen$lambda$2(snapshotState4CollectAsState).getRemoveLimitButtonVisible() || ((Args) INSTANCE.getArgs((Fragment) this)).getForceShowRemoveLimitButton();
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.margin.ui.limit.MarginLimitFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MarginLimitFragment.MarginLimitScreen$lambda$4$lambda$3();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            final Event<MarginLimitEvent> eventMarginLimitScreen$lambda$1 = MarginLimitScreen$lambda$1(snapshotState4CollectAsStateWithLifecycle);
            if (eventMarginLimitScreen$lambda$1 != null) {
                if ((eventMarginLimitScreen$lambda$1.getData() instanceof MarginLimitEvent.RequestFocusForMarginLimitInput) && (eventConsumerInvoke2 = eventMarginLimitScreen$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke2.consume(eventMarginLimitScreen$lambda$1, new Function1() { // from class: com.robinhood.android.margin.ui.limit.MarginLimitFragment$MarginLimitScreen$lambda$9$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m16205invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m16205invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            MarginLimitFragment.MarginLimitScreen$lambda$6(snapshotState, true);
                        }
                    });
                }
                if ((eventMarginLimitScreen$lambda$1.getData() instanceof MarginLimitEvent.RemoveFocusForMarginLimitInput) && (eventConsumerInvoke = eventMarginLimitScreen$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventMarginLimitScreen$lambda$1, new Function1() { // from class: com.robinhood.android.margin.ui.limit.MarginLimitFragment$MarginLimitScreen$lambda$9$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m16206invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m16206invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            MarginLimitFragment.MarginLimitScreen$lambda$6(snapshotState, false);
                        }
                    });
                }
            }
            ScaffoldKt.m5939ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.systemBarsPadding(modifier3), ComposableLambda3.rememberComposableLambda(933861071, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.ui.limit.MarginLimitFragment.MarginLimitScreen.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                /* compiled from: MarginLimitFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.margin.ui.limit.MarginLimitFragment$MarginLimitScreen$2$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                    final /* synthetic */ MarginLimitFragment this$0;

                    AnonymousClass1(MarginLimitFragment marginLimitFragment) {
                        this.this$0 = marginLimitFragment;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                        invoke(bentoAppBarScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i & 6) == 0) {
                            i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                        }
                        if ((i & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-816633520, i, -1, "com.robinhood.android.margin.ui.limit.MarginLimitFragment.MarginLimitScreen.<anonymous>.<anonymous> (MarginLimitFragment.kt:93)");
                        }
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final MarginLimitFragment marginLimitFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.margin.ui.limit.MarginLimitFragment$MarginLimitScreen$2$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return MarginLimitFragment.C210942.AnonymousClass1.invoke$lambda$1$lambda$0(marginLimitFragment);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(MarginLimitFragment marginLimitFragment) {
                        marginLimitFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                        return Unit.INSTANCE;
                    }
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(933861071, i5, -1, "com.robinhood.android.margin.ui.limit.MarginLimitFragment.MarginLimitScreen.<anonymous> (MarginLimitFragment.kt:91)");
                    }
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(MarginLimitFragment2.INSTANCE.m16198getLambda$923567876$feature_margin_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-816633520, true, new AnonymousClass1(MarginLimitFragment.this), composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(1157099226, true, new C210953(strValueOf, snapshotState4CollectAsState, marginLimitActivity, z, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, 444);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.ui.limit.MarginLimitFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarginLimitFragment.MarginLimitScreen$lambda$10(this.f$0, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState MarginLimitScreen$lambda$4$lambda$3() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MarginLimitScreen$lambda$6(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final Event<MarginLimitEvent> MarginLimitScreen$lambda$1(SnapshotState4<Event<MarginLimitEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarginLimitViewState MarginLimitScreen$lambda$2(SnapshotState4<MarginLimitViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MarginLimitScreen$lambda$5(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* compiled from: MarginLimitFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.margin.ui.limit.MarginLimitFragment$MarginLimitScreen$3 */
    static final class C210953 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ String $availableMargin;
        final /* synthetic */ MarginLimitActivity $parentActivity;
        final /* synthetic */ boolean $removeMarginLimitBtnVisibility;
        final /* synthetic */ SnapshotState<Boolean> $showNumpad$delegate;
        final /* synthetic */ SnapshotState4<MarginLimitViewState> $viewState$delegate;

        C210953(String str, SnapshotState4<MarginLimitViewState> snapshotState4, MarginLimitActivity marginLimitActivity, boolean z, SnapshotState<Boolean> snapshotState) {
            this.$availableMargin = str;
            this.$viewState$delegate = snapshotState4;
            this.$parentActivity = marginLimitActivity;
            this.$removeMarginLimitBtnVisibility = z;
            this.$showNumpad$delegate = snapshotState;
        }

        public final void invoke(PaddingValues padding, Composer composer, int i) {
            int i2;
            int i3;
            Intrinsics.checkNotNullParameter(padding, "padding");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(padding) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1157099226, i2, -1, "com.robinhood.android.margin.ui.limit.MarginLimitFragment.MarginLimitScreen.<anonymous> (MarginLimitFragment.kt:101)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierPadding = PaddingKt.padding(companion, padding);
            final MarginLimitFragment marginLimitFragment = MarginLimitFragment.this;
            String str = this.$availableMargin;
            final SnapshotState4<MarginLimitViewState> snapshotState4 = this.$viewState$delegate;
            final MarginLimitActivity marginLimitActivity = this.$parentActivity;
            boolean z = this.$removeMarginLimitBtnVisibility;
            SnapshotState<Boolean> snapshotState = this.$showNumpad$delegate;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
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
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null);
            String string2 = marginLimitFragment.getString(MarginLimitFragment.MarginLimitScreen$lambda$2(snapshotState4).getTitleText());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer, i4).getDisplayCapsuleMedium();
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(string2, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer, 0, 0, 8124);
            Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i4).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
            String string3 = marginLimitFragment.getString(MarginLimitFragment.MarginLimitScreen$lambda$2(snapshotState4).getDescriptionText());
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            BentoText2.m20747BentoText38GnDrw(string3, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer, 0, 0, 16316);
            Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer, 0);
            MarginLimitInputComposable.MarginLimitInputComposable(MarginLimitFragment.MarginLimitScreen$lambda$2(snapshotState4).getMarginLimitDisplayData(), com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), composer, 0, 0);
            Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer, 0);
            BentoText2.m20747BentoText38GnDrw(str, com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i4).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), Color.m6701boximpl(bentoTheme.getColors(composer, i4).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i4).getTextS(), composer, 0, 0, 8120);
            Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2 = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i4).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
            String string4 = marginLimitFragment.getString(MarginLimitFragment.MarginLimitScreen$lambda$2(snapshotState4).getSetMarginLimitButtonText());
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            boolean setMarginLimitButtonEnabled = MarginLimitFragment.MarginLimitScreen$lambda$2(snapshotState4).getSetMarginLimitButtonEnabled();
            composer.startReplaceGroup(-1746271574);
            boolean zChanged = composer.changed(snapshotState4) | composer.changedInstance(marginLimitFragment) | composer.changedInstance(marginLimitActivity);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.margin.ui.limit.MarginLimitFragment$MarginLimitScreen$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MarginLimitFragment.C210953.invoke$lambda$7$lambda$2$lambda$1(snapshotState4, marginLimitFragment, marginLimitActivity);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            marginLimitFragment.SetMarginLimitButtonComposable(string4, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2, null, setMarginLimitButtonEnabled, (Function0) objRememberedValue, composer, 0, 4);
            composer.startReplaceGroup(1551858050);
            if (z) {
                Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default3 = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i4).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                String strStringResource = StringResources_androidKt.stringResource(C20999R.string.remove_margin_limit_cta, composer, 0);
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(marginLimitFragment);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.margin.ui.limit.MarginLimitFragment$MarginLimitScreen$3$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MarginLimitFragment.C210953.invoke$lambda$7$lambda$4$lambda$3(marginLimitFragment);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                i3 = 5004770;
                marginLimitFragment.SetMarginLimitButtonComposable(strStringResource, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default3, type2, false, (Function0) objRememberedValue2, composer, 384, 8);
            } else {
                i3 = 5004770;
            }
            composer.endReplaceGroup();
            composer.startReplaceGroup(1551874914);
            if (MarginLimitFragment.MarginLimitScreen$lambda$5(snapshotState)) {
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i4).m21590getDefaultD9Ej5fM(), 1, null);
                boolean inputViewEnabled = MarginLimitFragment.MarginLimitScreen$lambda$2(snapshotState4).getInputViewEnabled();
                composer.startReplaceGroup(i3);
                boolean zChangedInstance2 = composer.changedInstance(marginLimitFragment);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.margin.ui.limit.MarginLimitFragment$MarginLimitScreen$3$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MarginLimitFragment.C210953.invoke$lambda$7$lambda$6$lambda$5(marginLimitFragment, (KeyEvent) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                BentoNumpad3.BentoNumpad(modifierM5144paddingVpY3zN4$default, (Function1) objRememberedValue3, true, null, true, inputViewEnabled, composer, 28032, 0);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$2$lambda$1(SnapshotState4 snapshotState4, MarginLimitFragment marginLimitFragment, MarginLimitActivity marginLimitActivity) {
            MarginLimitStateProvider3 validation = MarginLimitFragment.MarginLimitScreen$lambda$2(snapshotState4).getValidation();
            if (validation != null) {
                if (validation instanceof MarginLimitStateProvider3.Valid) {
                    marginLimitFragment.confirmMarginLimit(((MarginLimitStateProvider3.Valid) validation).getNewMarginLimit());
                } else if (validation instanceof MarginLimitStateProvider3.ZeroMarginLimit) {
                    marginLimitActivity.showZeroMarginDialog();
                } else if (validation instanceof MarginLimitStateProvider3.BelowCurrentMarginUse) {
                    marginLimitActivity.showBelowCurrentMarginUse(((MarginLimitStateProvider3.BelowCurrentMarginUse) validation).getCurrentGoldUsed());
                } else if (validation instanceof MarginLimitStateProvider3.AboveGoldBuyingPower) {
                    marginLimitActivity.showAboveGoldBuyingPower();
                } else {
                    if (!(validation instanceof MarginLimitStateProvider3.ViewAccountDeficit)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    marginLimitActivity.viewAccountDeficitAction();
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$4$lambda$3(MarginLimitFragment marginLimitFragment) {
            marginLimitFragment.getCallbacks().onMarginLimitConfirmed(null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6$lambda$5(MarginLimitFragment marginLimitFragment, KeyEvent it) {
            Intrinsics.checkNotNullParameter(it, "it");
            marginLimitFragment.getDuxo().consumeKeyEvent(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void SetMarginLimitButtonComposable(final String marginLimitButtonText, Modifier modifier, BentoButtons.Type type2, boolean z, final Function0<Unit> onMarginLimitButtonClicked, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        Object objRememberedValue;
        final BentoButtons.Type type3;
        final boolean z4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(marginLimitButtonText, "marginLimitButtonText");
        Intrinsics.checkNotNullParameter(onMarginLimitButtonClicked, "onMarginLimitButtonClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1849296045);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(marginLimitButtonText) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(type2 == null ? -1 : type2.ordinal()) ? 256 : 128;
            }
            i5 = i2 & 8;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onMarginLimitButtonClicked) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    BentoButtons.Type type4 = i4 == 0 ? BentoButtons.Type.Primary : type2;
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1849296045, i3, -1, "com.robinhood.android.margin.ui.limit.MarginLimitFragment.SetMarginLimitButtonComposable (MarginLimitFragment.kt:187)");
                    }
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    z3 = (i3 & 57344) == 16384;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.margin.ui.limit.MarginLimitFragment$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MarginLimitFragment.SetMarginLimitButtonComposable$lambda$12$lambda$11(onMarginLimitButtonClicked);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    int i7 = (i3 << 3) & 1008;
                    int i8 = i3 << 6;
                    int i9 = (57344 & i8) | i7 | (i8 & 458752);
                    type3 = type4;
                    Modifier modifier5 = modifier4;
                    z4 = z2;
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, marginLimitButtonText, modifier5, null, type3, z4, false, null, null, null, null, false, null, composerStartRestartGroup, i9, 0, 8136);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    type3 = type2;
                    modifier3 = modifier2;
                    z4 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.ui.limit.MarginLimitFragment$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return MarginLimitFragment.SetMarginLimitButtonComposable$lambda$13(this.f$0, marginLimitButtonText, modifier3, type3, z4, onMarginLimitButtonClicked, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            z2 = z;
            if ((i2 & 16) != 0) {
            }
            if ((i3 & 9363) != 9362) {
                if (i6 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                if ((i3 & 57344) == 16384) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z3) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.margin.ui.limit.MarginLimitFragment$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MarginLimitFragment.SetMarginLimitButtonComposable$lambda$12$lambda$11(onMarginLimitButtonClicked);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    int i72 = (i3 << 3) & 1008;
                    int i82 = i3 << 6;
                    int i92 = (57344 & i82) | i72 | (i82 & 458752);
                    type3 = type4;
                    Modifier modifier52 = modifier4;
                    z4 = z2;
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, marginLimitButtonText, modifier52, null, type3, z4, false, null, null, null, null, false, null, composerStartRestartGroup, i92, 0, 8136);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z2 = z;
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SetMarginLimitButtonComposable$lambda$12$lambda$11(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getDuxo().onFocusChange();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void confirmMarginLimit(Money newMarginLimit) {
        getCallbacks().onMarginLimitConfirmed(newMarginLimit);
    }

    /* compiled from: MarginLimitFragment.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitFragment$Args;", "Landroid/os/Parcelable;", "marginInvestingInfo", "Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;", "forceShowRemoveLimitButton", "", "userLocale", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "(Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;ZLcom/robinhood/iso/countrycode/CountryCode$Supported;)V", "getMarginInvestingInfo", "()Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;", "getForceShowRemoveLimitButton", "()Z", "getUserLocale", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean forceShowRemoveLimitButton;
        private final ApiMarginInvestingInfo marginInvestingInfo;
        private final CountryCode.Supported userLocale;

        /* compiled from: MarginLimitFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((ApiMarginInvestingInfo) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0, (CountryCode.Supported) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ApiMarginInvestingInfo apiMarginInvestingInfo, boolean z, CountryCode.Supported supported, int i, Object obj) {
            if ((i & 1) != 0) {
                apiMarginInvestingInfo = args.marginInvestingInfo;
            }
            if ((i & 2) != 0) {
                z = args.forceShowRemoveLimitButton;
            }
            if ((i & 4) != 0) {
                supported = args.userLocale;
            }
            return args.copy(apiMarginInvestingInfo, z, supported);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiMarginInvestingInfo getMarginInvestingInfo() {
            return this.marginInvestingInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getForceShowRemoveLimitButton() {
            return this.forceShowRemoveLimitButton;
        }

        /* renamed from: component3, reason: from getter */
        public final CountryCode.Supported getUserLocale() {
            return this.userLocale;
        }

        public final Args copy(ApiMarginInvestingInfo marginInvestingInfo, boolean forceShowRemoveLimitButton, CountryCode.Supported userLocale) {
            Intrinsics.checkNotNullParameter(marginInvestingInfo, "marginInvestingInfo");
            Intrinsics.checkNotNullParameter(userLocale, "userLocale");
            return new Args(marginInvestingInfo, forceShowRemoveLimitButton, userLocale);
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
            return Intrinsics.areEqual(this.marginInvestingInfo, args.marginInvestingInfo) && this.forceShowRemoveLimitButton == args.forceShowRemoveLimitButton && Intrinsics.areEqual(this.userLocale, args.userLocale);
        }

        public int hashCode() {
            return (((this.marginInvestingInfo.hashCode() * 31) + Boolean.hashCode(this.forceShowRemoveLimitButton)) * 31) + this.userLocale.hashCode();
        }

        public String toString() {
            return "Args(marginInvestingInfo=" + this.marginInvestingInfo + ", forceShowRemoveLimitButton=" + this.forceShowRemoveLimitButton + ", userLocale=" + this.userLocale + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.marginInvestingInfo, flags);
            dest.writeInt(this.forceShowRemoveLimitButton ? 1 : 0);
            dest.writeSerializable(this.userLocale);
        }

        public Args(ApiMarginInvestingInfo marginInvestingInfo, boolean z, CountryCode.Supported userLocale) {
            Intrinsics.checkNotNullParameter(marginInvestingInfo, "marginInvestingInfo");
            Intrinsics.checkNotNullParameter(userLocale, "userLocale");
            this.marginInvestingInfo = marginInvestingInfo;
            this.forceShowRemoveLimitButton = z;
            this.userLocale = userLocale;
        }

        public final ApiMarginInvestingInfo getMarginInvestingInfo() {
            return this.marginInvestingInfo;
        }

        public final boolean getForceShowRemoveLimitButton() {
            return this.forceShowRemoveLimitButton;
        }

        public final CountryCode.Supported getUserLocale() {
            return this.userLocale;
        }
    }

    /* compiled from: MarginLimitFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitFragment;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitFragment$Args;", "<init>", "()V", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MarginLimitFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(MarginLimitFragment marginLimitFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, marginLimitFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MarginLimitFragment newInstance(Args args) {
            return (MarginLimitFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MarginLimitFragment marginLimitFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, marginLimitFragment, args);
        }
    }
}

package com.robinhood.android.internalassettransfers.customselection;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.internalassettransfers.AccountSelection;
import com.robinhood.android.internalassettransfers.AssetSelection;
import com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionEvent;
import com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment;
import com.robinhood.android.internalassettransfers.customselection.equity.ShareSelection;
import com.robinhood.android.internalassettransfers.validation.AccountFeatureParityBottomSheet2;
import com.robinhood.android.internalassettransfers.validation.AccountFeatureParityBottomSheetData;
import com.robinhood.android.margin.contracts.EnableMarginInvestingKey;
import com.robinhood.android.margin.contracts.EnableMarginInvestingKey2;
import com.robinhood.android.models.internalassettransfers.p193db.EligibleAsset;
import com.robinhood.android.models.internalassettransfers.p193db.EligibleAssets;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: InternalAssetTransferCustomSelectionFragment.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0003\u0018\u0019\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0014\u001a\u00020\u0015H\u0017¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b²\u0006\u0012\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dX\u008a\u0084\u0002²\u0006\f\u0010\u001f\u001a\u0004\u0018\u00010 X\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\"X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionDuxo;", "getDuxo", "()Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "toolbarVisible", "", "getToolbarVisible", "()Z", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "navigateToMargin", "Callbacks", "Args", "Companion", "feature-internal-asset-transfers_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent;", "bottomSheetData", "Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityBottomSheetData;", "viewState", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InternalAssetTransferCustomSelectionFragment extends GenericComposeFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof InternalAssetTransferCustomSelectionFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, InternalAssetTransferCustomSelectionDuxo.class);
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InternalAssetTransferCustomSelectionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InternalAssetTransferCustomSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u001e\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H&J\u001e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\u0003H&J\b\u0010\u0017\u001a\u00020\u0003H&R\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionFragment$Callbacks;", "", "onEditEquity", "", "asset", "Lcom/robinhood/android/models/internalassettransfers/db/EligibleAsset;", "sharesSelectedForTransfer", "Lcom/robinhood/android/internalassettransfers/customselection/equity/ShareSelection;", "selectedEquity", "instrumentId", "Ljava/util/UUID;", "unselectEquity", "clearAssetSelectionClicked", "isCashVisible", "", "instrumentIds", "", "selectAllClicked", "cashBalanceSelected", "cashBalanceUnselected", "cashBalanceClicked", "onInfoBannerLinkClicked", "completeSelection", "navigateBackFromCustomSelectionScreenToReviewScreen", "assetSelectionFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/internalassettransfers/AssetSelection;", "getAssetSelectionFlow", "()Lkotlinx/coroutines/flow/Flow;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void cashBalanceClicked();

        void cashBalanceSelected();

        void cashBalanceUnselected();

        void clearAssetSelectionClicked(boolean isCashVisible, List<UUID> instrumentIds);

        void completeSelection();

        Flow<AssetSelection> getAssetSelectionFlow();

        void navigateBackFromCustomSelectionScreenToReviewScreen();

        void onEditEquity(EligibleAsset asset, ShareSelection sharesSelectedForTransfer);

        void onInfoBannerLinkClicked();

        void selectAllClicked(boolean isCashVisible, List<UUID> instrumentIds);

        void selectedEquity(UUID instrumentId);

        void unselectEquity(UUID instrumentId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$18(InternalAssetTransferCustomSelectionFragment internalAssetTransferCustomSelectionFragment, int i, Composer composer, int i2) {
        internalAssetTransferCustomSelectionFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InternalAssetTransferCustomSelectionDuxo getDuxo() {
        return (InternalAssetTransferCustomSelectionDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        EventConsumer<InternalAssetTransferCustomSelectionEvent> eventConsumerInvoke;
        EventConsumer<InternalAssetTransferCustomSelectionEvent> eventConsumerInvoke2;
        EventConsumer<InternalAssetTransferCustomSelectionEvent> eventConsumerInvoke3;
        EventConsumer<InternalAssetTransferCustomSelectionEvent> eventConsumerInvoke4;
        EventConsumer<InternalAssetTransferCustomSelectionEvent> eventConsumerInvoke5;
        EventConsumer<InternalAssetTransferCustomSelectionEvent> eventConsumerInvoke6;
        EventConsumer<InternalAssetTransferCustomSelectionEvent> eventConsumerInvoke7;
        EventConsumer<InternalAssetTransferCustomSelectionEvent> eventConsumerInvoke8;
        EventConsumer<InternalAssetTransferCustomSelectionEvent> eventConsumerInvoke9;
        EventConsumer<InternalAssetTransferCustomSelectionEvent> eventConsumerInvoke10;
        EventConsumer<InternalAssetTransferCustomSelectionEvent> eventConsumerInvoke11;
        EventConsumer<InternalAssetTransferCustomSelectionEvent> eventConsumerInvoke12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-760006919);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-760006919, i2, -1, "com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment.ComposeContent (InternalAssetTransferCustomSelectionFragment.kt:59)");
            }
            final StateFlow<Event<InternalAssetTransferCustomSelectionEvent>> eventFlow = getDuxo().getEventFlow();
            composerStartRestartGroup.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "InternalAssetTransferCustomSelectionFragment.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                            if ((event != null ? event.getData() : null) instanceof InternalAssetTransferCustomSelectionEvent) {
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
            Event<InternalAssetTransferCustomSelectionEvent> value = eventFlow.getValue();
            Event<InternalAssetTransferCustomSelectionEvent> event = value;
            if (!((event != null ? event.getData() : null) instanceof InternalAssetTransferCustomSelectionEvent)) {
                value = null;
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            final Event<InternalAssetTransferCustomSelectionEvent> eventComposeContent$lambda$0 = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
            if (eventComposeContent$lambda$0 != null && (eventComposeContent$lambda$0.getData() instanceof InternalAssetTransferCustomSelectionEvent.NavigateToCashSelectionScreen) && (eventConsumerInvoke12 = eventComposeContent$lambda$0.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke12.consume(eventComposeContent$lambda$0, new Function1() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment$ComposeContent$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m15399invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m15399invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        this.getCallbacks().cashBalanceClicked();
                    }
                });
            }
            final Event<InternalAssetTransferCustomSelectionEvent> eventComposeContent$lambda$02 = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
            if (eventComposeContent$lambda$02 != null && (eventComposeContent$lambda$02.getData() instanceof InternalAssetTransferCustomSelectionEvent.ClearAssetSelection) && (eventConsumerInvoke11 = eventComposeContent$lambda$02.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke11.consume(eventComposeContent$lambda$02, new Function1() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment$ComposeContent$$inlined$consumeIfType$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m15403invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m15403invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        InternalAssetTransferCustomSelectionEvent.ClearAssetSelection clearAssetSelection = (InternalAssetTransferCustomSelectionEvent.ClearAssetSelection) eventComposeContent$lambda$02.getData();
                        this.getCallbacks().clearAssetSelectionClicked(clearAssetSelection.isCashVisible(), clearAssetSelection.getInstrumentIds());
                    }
                });
            }
            final Event<InternalAssetTransferCustomSelectionEvent> eventComposeContent$lambda$03 = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
            if (eventComposeContent$lambda$03 != null && (eventComposeContent$lambda$03.getData() instanceof InternalAssetTransferCustomSelectionEvent.SelectAssets) && (eventConsumerInvoke10 = eventComposeContent$lambda$03.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke10.consume(eventComposeContent$lambda$03, new Function1() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment$ComposeContent$$inlined$consumeIfType$3
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m15404invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m15404invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        InternalAssetTransferCustomSelectionEvent.SelectAssets selectAssets = (InternalAssetTransferCustomSelectionEvent.SelectAssets) eventComposeContent$lambda$03.getData();
                        this.getCallbacks().selectAllClicked(selectAssets.isCashVisible(), selectAssets.getInstrumentIds());
                    }
                });
            }
            final Event<InternalAssetTransferCustomSelectionEvent> eventComposeContent$lambda$04 = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
            if (eventComposeContent$lambda$04 != null && (eventComposeContent$lambda$04.getData() instanceof InternalAssetTransferCustomSelectionEvent.SelectCashSelection) && (eventConsumerInvoke9 = eventComposeContent$lambda$04.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke9.consume(eventComposeContent$lambda$04, new Function1() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment$ComposeContent$$inlined$consumeIfType$4
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m15405invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m15405invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        this.getCallbacks().cashBalanceSelected();
                    }
                });
            }
            final Event<InternalAssetTransferCustomSelectionEvent> eventComposeContent$lambda$05 = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
            if (eventComposeContent$lambda$05 != null && (eventComposeContent$lambda$05.getData() instanceof InternalAssetTransferCustomSelectionEvent.UnselectCashSelection) && (eventConsumerInvoke8 = eventComposeContent$lambda$05.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke8.consume(eventComposeContent$lambda$05, new Function1() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment$ComposeContent$$inlined$consumeIfType$5
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m15406invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m15406invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        this.getCallbacks().cashBalanceUnselected();
                    }
                });
            }
            final Event<InternalAssetTransferCustomSelectionEvent> eventComposeContent$lambda$06 = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
            if (eventComposeContent$lambda$06 != null && (eventComposeContent$lambda$06.getData() instanceof InternalAssetTransferCustomSelectionEvent.EditEquitySelection) && (eventConsumerInvoke7 = eventComposeContent$lambda$06.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke7.consume(eventComposeContent$lambda$06, new Function1() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment$ComposeContent$$inlined$consumeIfType$6
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m15407invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m15407invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        InternalAssetTransferCustomSelectionEvent.EditEquitySelection editEquitySelection = (InternalAssetTransferCustomSelectionEvent.EditEquitySelection) eventComposeContent$lambda$06.getData();
                        this.getCallbacks().onEditEquity(editEquitySelection.getAsset(), editEquitySelection.getExistingSelection());
                    }
                });
            }
            final Event<InternalAssetTransferCustomSelectionEvent> eventComposeContent$lambda$07 = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
            if (eventComposeContent$lambda$07 != null && (eventComposeContent$lambda$07.getData() instanceof InternalAssetTransferCustomSelectionEvent.NavigateToNonTransferableAssetsScreen) && (eventConsumerInvoke6 = eventComposeContent$lambda$07.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke6.consume(eventComposeContent$lambda$07, new Function1() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment$ComposeContent$$inlined$consumeIfType$7
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m15408invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m15408invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        this.getCallbacks().onInfoBannerLinkClicked();
                    }
                });
            }
            final Event<InternalAssetTransferCustomSelectionEvent> eventComposeContent$lambda$08 = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
            if (eventComposeContent$lambda$08 != null && (eventComposeContent$lambda$08.getData() instanceof InternalAssetTransferCustomSelectionEvent.SelectEquity) && (eventConsumerInvoke5 = eventComposeContent$lambda$08.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke5.consume(eventComposeContent$lambda$08, new Function1() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment$ComposeContent$$inlined$consumeIfType$8
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m15409invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m15409invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        this.getCallbacks().selectedEquity(((InternalAssetTransferCustomSelectionEvent.SelectEquity) eventComposeContent$lambda$08.getData()).getInstrumentId());
                    }
                });
            }
            final Event<InternalAssetTransferCustomSelectionEvent> eventComposeContent$lambda$09 = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
            if (eventComposeContent$lambda$09 != null && (eventComposeContent$lambda$09.getData() instanceof InternalAssetTransferCustomSelectionEvent.UnselectEquity) && (eventConsumerInvoke4 = eventComposeContent$lambda$09.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke4.consume(eventComposeContent$lambda$09, new Function1() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment$ComposeContent$$inlined$consumeIfType$9
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m15410invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m15410invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        this.getCallbacks().unselectEquity(((InternalAssetTransferCustomSelectionEvent.UnselectEquity) eventComposeContent$lambda$09.getData()).getInstrumentId());
                    }
                });
            }
            final Event<InternalAssetTransferCustomSelectionEvent> eventComposeContent$lambda$010 = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
            if (eventComposeContent$lambda$010 != null && (eventComposeContent$lambda$010.getData() instanceof InternalAssetTransferCustomSelectionEvent.NavigateToAgreementsScreen) && (eventConsumerInvoke3 = eventComposeContent$lambda$010.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke3.consume(eventComposeContent$lambda$010, new Function1() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment$ComposeContent$$inlined$consumeIfType$10
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m15400invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m15400invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        this.getCallbacks().completeSelection();
                    }
                });
            }
            final Event<InternalAssetTransferCustomSelectionEvent> eventComposeContent$lambda$011 = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
            if (eventComposeContent$lambda$011 != null && (eventComposeContent$lambda$011.getData() instanceof InternalAssetTransferCustomSelectionEvent.EnableMarginAlert) && (eventConsumerInvoke2 = eventComposeContent$lambda$011.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke2.consume(eventComposeContent$lambda$011, new Function1() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment$ComposeContent$$inlined$consumeIfType$11
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m15401invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m15401invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        InternalAssetTransferCustomSelectionFragment.ComposeContent$lambda$3(snapshotState, ((InternalAssetTransferCustomSelectionEvent.EnableMarginAlert) eventComposeContent$lambda$011.getData()).getBottomSheetData());
                    }
                });
            }
            final Event<InternalAssetTransferCustomSelectionEvent> eventComposeContent$lambda$012 = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
            if (eventComposeContent$lambda$012 != null && (eventComposeContent$lambda$012.getData() instanceof InternalAssetTransferCustomSelectionEvent.NavigateBackToReviewScreen) && (eventConsumerInvoke = eventComposeContent$lambda$012.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(eventComposeContent$lambda$012, new Function1() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment$ComposeContent$$inlined$consumeIfType$12
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m15402invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m15402invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        this.getCallbacks().navigateBackFromCustomSelectionScreenToReviewScreen();
                    }
                });
            }
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new InternalAssetTransferCustomSelectionFragment2(this, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(671485380, true, new C1913914(SnapshotStateKt.collectAsState(getDuxo().getStateFlow(), null, composerStartRestartGroup, 0, 1), this, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternalAssetTransferCustomSelectionFragment.ComposeContent$lambda$18(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final Event<InternalAssetTransferCustomSelectionEvent> ComposeContent$lambda$0(SnapshotState4<Event<InternalAssetTransferCustomSelectionEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InternalAssetTransferCustomSelectionViewState ComposeContent$lambda$17(SnapshotState4<InternalAssetTransferCustomSelectionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountFeatureParityBottomSheetData ComposeContent$lambda$2(SnapshotState<AccountFeatureParityBottomSheetData> snapshotState) {
        return snapshotState.getValue();
    }

    /* compiled from: InternalAssetTransferCustomSelectionFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment$ComposeContent$14 */
    static final class C1913914 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<AccountFeatureParityBottomSheetData> $bottomSheetData$delegate;
        final /* synthetic */ SnapshotState4<InternalAssetTransferCustomSelectionViewState> $viewState$delegate;
        final /* synthetic */ InternalAssetTransferCustomSelectionFragment this$0;

        C1913914(SnapshotState4<InternalAssetTransferCustomSelectionViewState> snapshotState4, InternalAssetTransferCustomSelectionFragment internalAssetTransferCustomSelectionFragment, SnapshotState<AccountFeatureParityBottomSheetData> snapshotState) {
            this.$viewState$delegate = snapshotState4;
            this.this$0 = internalAssetTransferCustomSelectionFragment;
            this.$bottomSheetData$delegate = snapshotState;
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
                ComposerKt.traceEventStart(671485380, i, -1, "com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment.ComposeContent.<anonymous> (InternalAssetTransferCustomSelectionFragment.kt:108)");
            }
            InternalAssetTransferCustomSelectionViewState internalAssetTransferCustomSelectionViewStateComposeContent$lambda$17 = InternalAssetTransferCustomSelectionFragment.ComposeContent$lambda$17(this.$viewState$delegate);
            final InternalAssetTransferCustomSelectionFragment internalAssetTransferCustomSelectionFragment = this.this$0;
            InternalAssetTransferCustomSelectionKt.InternalAssetTransferCustomSelection(internalAssetTransferCustomSelectionViewStateComposeContent$lambda$17, new InternalAssetTransferCustomSelectionCallbacks() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment.ComposeContent.14.1
                @Override // com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionCallbacks
                public void onEquityRowClicked(String instrumentId) {
                    Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
                    internalAssetTransferCustomSelectionFragment.getDuxo().onEquityRowClicked(instrumentId);
                }

                @Override // com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionCallbacks
                public void onEquityCheckClicked(String instrumentId) {
                    Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
                    internalAssetTransferCustomSelectionFragment.getDuxo().onEquityCheckClicked(instrumentId);
                }

                @Override // com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionCallbacks
                public void onCashRowClicked() {
                    internalAssetTransferCustomSelectionFragment.getDuxo().cashBalanceClicked();
                }

                @Override // com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionCallbacks
                public void onCashCheckClicked() {
                    internalAssetTransferCustomSelectionFragment.getDuxo().cashBalanceChecked();
                }

                @Override // com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionCallbacks
                public void onClearButtonClicked(boolean isCashVisible, List<UUID> instrumentIds) {
                    Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
                    internalAssetTransferCustomSelectionFragment.getDuxo().clearSelections(isCashVisible, instrumentIds);
                }

                @Override // com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionCallbacks
                public void onSelectAllButtonClicked(boolean isCashVisible, List<UUID> instrumentIds) {
                    Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
                    internalAssetTransferCustomSelectionFragment.getDuxo().selectAssets(isCashVisible, instrumentIds);
                }

                @Override // com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionCallbacks
                public void onBackNavigationClicked() {
                    internalAssetTransferCustomSelectionFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                }

                @Override // com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionCallbacks
                public void onSearchValueChanged(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    internalAssetTransferCustomSelectionFragment.getDuxo().searchValueChanged(value);
                }

                @Override // com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionCallbacks
                public void onInfoBannerLinkClicked() {
                    internalAssetTransferCustomSelectionFragment.getDuxo().onInfoBannerLinkClicked();
                }

                @Override // com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionCallbacks
                public void completeSelection() {
                    InternalAssetTransferCustomSelectionDuxo.onContinueClicked$default(internalAssetTransferCustomSelectionFragment.getDuxo(), false, 1, null);
                }

                @Override // com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionCallbacks
                public void navigateToAgreementsScreen() {
                    internalAssetTransferCustomSelectionFragment.getDuxo().navigateToAgreementsScreen();
                }

                @Override // com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionCallbacks
                public void tryAgainPresubmitWarning() {
                    InternalAssetTransferCustomSelectionDuxo.onContinueClicked$default(internalAssetTransferCustomSelectionFragment.getDuxo(), false, 1, null);
                }
            }, null, composer, 0, 4);
            AccountFeatureParityBottomSheetData accountFeatureParityBottomSheetDataComposeContent$lambda$2 = InternalAssetTransferCustomSelectionFragment.ComposeContent$lambda$2(this.$bottomSheetData$delegate);
            if (accountFeatureParityBottomSheetDataComposeContent$lambda$2 != null) {
                final InternalAssetTransferCustomSelectionFragment internalAssetTransferCustomSelectionFragment2 = this.this$0;
                final SnapshotState<AccountFeatureParityBottomSheetData> snapshotState = this.$bottomSheetData$delegate;
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(internalAssetTransferCustomSelectionFragment2);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment$ComposeContent$14$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InternalAssetTransferCustomSelectionFragment.C1913914.invoke$lambda$6$lambda$1$lambda$0(internalAssetTransferCustomSelectionFragment2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance2 = composer.changedInstance(internalAssetTransferCustomSelectionFragment2);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment$ComposeContent$14$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InternalAssetTransferCustomSelectionFragment.C1913914.invoke$lambda$6$lambda$3$lambda$2(internalAssetTransferCustomSelectionFragment2, snapshotState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function0 function02 = (Function0) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment$ComposeContent$14$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InternalAssetTransferCustomSelectionFragment.C1913914.invoke$lambda$6$lambda$5$lambda$4(snapshotState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                AccountFeatureParityBottomSheet2.AccountFeatureParityBottomSheet(accountFeatureParityBottomSheetDataComposeContent$lambda$2, function0, function02, (Function0) objRememberedValue3, composer, StringResource.$stable | 3072);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$1$lambda$0(InternalAssetTransferCustomSelectionFragment internalAssetTransferCustomSelectionFragment) {
            internalAssetTransferCustomSelectionFragment.navigateToMargin();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$3$lambda$2(InternalAssetTransferCustomSelectionFragment internalAssetTransferCustomSelectionFragment, SnapshotState snapshotState) {
            InternalAssetTransferCustomSelectionFragment.ComposeContent$lambda$3(snapshotState, null);
            internalAssetTransferCustomSelectionFragment.getDuxo().onContinueClicked(true);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5$lambda$4(SnapshotState snapshotState) {
            InternalAssetTransferCustomSelectionFragment.ComposeContent$lambda$3(snapshotState, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ComposeContent$lambda$3(SnapshotState<AccountFeatureParityBottomSheetData> snapshotState, AccountFeatureParityBottomSheetData accountFeatureParityBottomSheetData) {
        snapshotState.setValue(accountFeatureParityBottomSheetData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateToMargin() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new EnableMarginInvestingKey(((Args) INSTANCE.getArgs((Fragment) this)).getAccountSelection().getSinkAccount().getRhsAccountNumber(), "iat_flow", EnableMarginInvestingKey2.InternalAssetTransfer.INSTANCE, false, false, 24, null), null, false, null, null, 60, null);
    }

    /* compiled from: InternalAssetTransferCustomSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001fHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionFragment$Args;", "Landroid/os/Parcelable;", "source", "", "eligibleAssets", "Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "assetSelection", "Lcom/robinhood/android/internalassettransfers/AssetSelection;", "accountSelection", "Lcom/robinhood/android/internalassettransfers/AccountSelection;", "shouldAbortIatFlow", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;Lcom/robinhood/android/internalassettransfers/AssetSelection;Lcom/robinhood/android/internalassettransfers/AccountSelection;Z)V", "getSource", "()Ljava/lang/String;", "getEligibleAssets", "()Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "getAssetSelection", "()Lcom/robinhood/android/internalassettransfers/AssetSelection;", "getAccountSelection", "()Lcom/robinhood/android/internalassettransfers/AccountSelection;", "getShouldAbortIatFlow", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final AccountSelection accountSelection;
        private final AssetSelection assetSelection;
        private final EligibleAssets eligibleAssets;
        private final boolean shouldAbortIatFlow;
        private final String source;

        /* compiled from: InternalAssetTransferCustomSelectionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), (EligibleAssets) parcel.readParcelable(Args.class.getClassLoader()), AssetSelection.CREATOR.createFromParcel(parcel), AccountSelection.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, EligibleAssets eligibleAssets, AssetSelection assetSelection, AccountSelection accountSelection, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.source;
            }
            if ((i & 2) != 0) {
                eligibleAssets = args.eligibleAssets;
            }
            if ((i & 4) != 0) {
                assetSelection = args.assetSelection;
            }
            if ((i & 8) != 0) {
                accountSelection = args.accountSelection;
            }
            if ((i & 16) != 0) {
                z = args.shouldAbortIatFlow;
            }
            boolean z2 = z;
            AssetSelection assetSelection2 = assetSelection;
            return args.copy(str, eligibleAssets, assetSelection2, accountSelection, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component2, reason: from getter */
        public final EligibleAssets getEligibleAssets() {
            return this.eligibleAssets;
        }

        /* renamed from: component3, reason: from getter */
        public final AssetSelection getAssetSelection() {
            return this.assetSelection;
        }

        /* renamed from: component4, reason: from getter */
        public final AccountSelection getAccountSelection() {
            return this.accountSelection;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShouldAbortIatFlow() {
            return this.shouldAbortIatFlow;
        }

        public final Args copy(String source, EligibleAssets eligibleAssets, AssetSelection assetSelection, AccountSelection accountSelection, boolean shouldAbortIatFlow) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(eligibleAssets, "eligibleAssets");
            Intrinsics.checkNotNullParameter(assetSelection, "assetSelection");
            Intrinsics.checkNotNullParameter(accountSelection, "accountSelection");
            return new Args(source, eligibleAssets, assetSelection, accountSelection, shouldAbortIatFlow);
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
            return Intrinsics.areEqual(this.source, args.source) && Intrinsics.areEqual(this.eligibleAssets, args.eligibleAssets) && Intrinsics.areEqual(this.assetSelection, args.assetSelection) && Intrinsics.areEqual(this.accountSelection, args.accountSelection) && this.shouldAbortIatFlow == args.shouldAbortIatFlow;
        }

        public int hashCode() {
            return (((((((this.source.hashCode() * 31) + this.eligibleAssets.hashCode()) * 31) + this.assetSelection.hashCode()) * 31) + this.accountSelection.hashCode()) * 31) + Boolean.hashCode(this.shouldAbortIatFlow);
        }

        public String toString() {
            return "Args(source=" + this.source + ", eligibleAssets=" + this.eligibleAssets + ", assetSelection=" + this.assetSelection + ", accountSelection=" + this.accountSelection + ", shouldAbortIatFlow=" + this.shouldAbortIatFlow + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.source);
            dest.writeParcelable(this.eligibleAssets, flags);
            this.assetSelection.writeToParcel(dest, flags);
            this.accountSelection.writeToParcel(dest, flags);
            dest.writeInt(this.shouldAbortIatFlow ? 1 : 0);
        }

        public Args(String source, EligibleAssets eligibleAssets, AssetSelection assetSelection, AccountSelection accountSelection, boolean z) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(eligibleAssets, "eligibleAssets");
            Intrinsics.checkNotNullParameter(assetSelection, "assetSelection");
            Intrinsics.checkNotNullParameter(accountSelection, "accountSelection");
            this.source = source;
            this.eligibleAssets = eligibleAssets;
            this.assetSelection = assetSelection;
            this.accountSelection = accountSelection;
            this.shouldAbortIatFlow = z;
        }

        public final String getSource() {
            return this.source;
        }

        public final EligibleAssets getEligibleAssets() {
            return this.eligibleAssets;
        }

        public final AssetSelection getAssetSelection() {
            return this.assetSelection;
        }

        public final AccountSelection getAccountSelection() {
            return this.accountSelection;
        }

        public final boolean getShouldAbortIatFlow() {
            return this.shouldAbortIatFlow;
        }
    }

    /* compiled from: InternalAssetTransferCustomSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionFragment;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionFragment$Args;", "<init>", "()V", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<InternalAssetTransferCustomSelectionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(InternalAssetTransferCustomSelectionFragment internalAssetTransferCustomSelectionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, internalAssetTransferCustomSelectionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InternalAssetTransferCustomSelectionFragment newInstance(Args args) {
            return (InternalAssetTransferCustomSelectionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InternalAssetTransferCustomSelectionFragment internalAssetTransferCustomSelectionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, internalAssetTransferCustomSelectionFragment, args);
        }
    }
}

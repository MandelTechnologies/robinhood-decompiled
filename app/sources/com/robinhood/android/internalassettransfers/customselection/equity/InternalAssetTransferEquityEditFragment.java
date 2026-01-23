package com.robinhood.android.internalassettransfers.customselection.equity;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditEvent;
import com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditFragment;
import com.robinhood.android.models.internalassettransfers.p193db.EligibleAsset;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.NoSuchElementException;
import java.util.UUID;
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

/* compiled from: InternalAssetTransferEquityEditFragment.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0003\u0017\u0018\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0014\u001a\u00020\u0015H\u0017¢\u0006\u0002\u0010\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u0084\u0002²\u0006\u0012\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditDuxo;", "getDuxo", "()Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "toolbarVisible", "", "getToolbarVisible", "()Z", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Args", "Companion", "feature-internal-asset-transfers_externalDebug", "viewState", "Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditEvent;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InternalAssetTransferEquityEditFragment extends GenericComposeFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof InternalAssetTransferEquityEditFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, InternalAssetTransferEquityEditDuxo.class);
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InternalAssetTransferEquityEditFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InternalAssetTransferEquityEditFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditFragment$Callbacks;", "", "onEquityEditComplete", "", "instrumentId", "Ljava/util/UUID;", "shareSelection", "Lcom/robinhood/android/internalassettransfers/customselection/equity/ShareSelection;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onEquityEditComplete(UUID instrumentId, ShareSelection shareSelection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(InternalAssetTransferEquityEditFragment internalAssetTransferEquityEditFragment, int i, Composer composer, int i2) {
        internalAssetTransferEquityEditFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InternalAssetTransferEquityEditDuxo getDuxo() {
        return (InternalAssetTransferEquityEditDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        EventConsumer<InternalAssetTransferEquityEditEvent> eventConsumerInvoke;
        Composer composerStartRestartGroup = composer.startRestartGroup(988244700);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(988244700, i2, -1, "com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditFragment.ComposeContent (InternalAssetTransferEquityEditFragment.kt:37)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final Event<InternalAssetTransferEquityEditEvent> eventComposeContent$lambda$1 = ComposeContent$lambda$1(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            if (eventComposeContent$lambda$1 != null && (eventComposeContent$lambda$1.getData() instanceof InternalAssetTransferEquityEditEvent.ShareSelectionMade) && (eventConsumerInvoke = eventComposeContent$lambda$1.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(eventComposeContent$lambda$1, new Function1() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditFragment$ComposeContent$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m15416invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m15416invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        InternalAssetTransferEquityEditEvent.ShareSelectionMade shareSelectionMade = (InternalAssetTransferEquityEditEvent.ShareSelectionMade) eventComposeContent$lambda$1.getData();
                        this.getCallbacks().onEquityEditComplete(shareSelectionMade.getInstrumentId(), shareSelectionMade.getShareSelection());
                    }
                });
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.INTERNAL_ASSET_TRANSFER_EDIT_EQUITY, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-87223535, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditFragment.ComposeContent.2

                /* compiled from: InternalAssetTransferEquityEditFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditFragment$ComposeContent$2$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotState4<InternalAssetTransferEquityEditViewState> $viewState$delegate;
                    final /* synthetic */ InternalAssetTransferEquityEditFragment this$0;

                    AnonymousClass1(InternalAssetTransferEquityEditFragment internalAssetTransferEquityEditFragment, SnapshotState4<InternalAssetTransferEquityEditViewState> snapshotState4) {
                        this.this$0 = internalAssetTransferEquityEditFragment;
                        this.$viewState$delegate = snapshotState4;
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
                            ComposerKt.traceEventStart(489760092, i, -1, "com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditFragment.ComposeContent.<anonymous>.<anonymous> (InternalAssetTransferEquityEditFragment.kt:54)");
                        }
                        Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null);
                        Companion companion = InternalAssetTransferEquityEditFragment.INSTANCE;
                        String symbol = ((Args) companion.getArgs((Fragment) this.this$0)).getAsset().getSymbol();
                        BigDecimal availableShares = ((Args) companion.getArgs((Fragment) this.this$0)).getAsset().getAvailableShares();
                        InternalAssetTransferEquityEditViewState internalAssetTransferEquityEditViewStateComposeContent$lambda$0 = InternalAssetTransferEquityEditFragment.ComposeContent$lambda$0(this.$viewState$delegate);
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final InternalAssetTransferEquityEditFragment internalAssetTransferEquityEditFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditFragment$ComposeContent$2$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return InternalAssetTransferEquityEditFragment.C191812.AnonymousClass1.invoke$lambda$1$lambda$0(internalAssetTransferEquityEditFragment, (ShareSelection2) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function1 function1 = (Function1) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                        final InternalAssetTransferEquityEditFragment internalAssetTransferEquityEditFragment2 = this.this$0;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditFragment$ComposeContent$2$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return InternalAssetTransferEquityEditFragment.C191812.AnonymousClass1.invoke$lambda$3$lambda$2(internalAssetTransferEquityEditFragment2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        Function0 function0 = (Function0) objRememberedValue2;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance3 = composer.changedInstance(this.this$0);
                        final InternalAssetTransferEquityEditFragment internalAssetTransferEquityEditFragment3 = this.this$0;
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditFragment$ComposeContent$2$1$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return InternalAssetTransferEquityEditFragment.C191812.AnonymousClass1.invoke$lambda$5$lambda$4(internalAssetTransferEquityEditFragment3);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        Function0 function02 = (Function0) objRememberedValue3;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance4 = composer.changedInstance(this.this$0);
                        final InternalAssetTransferEquityEditFragment internalAssetTransferEquityEditFragment4 = this.this$0;
                        Object objRememberedValue4 = composer.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditFragment$ComposeContent$2$1$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return InternalAssetTransferEquityEditFragment.C191812.AnonymousClass1.invoke$lambda$7$lambda$6(internalAssetTransferEquityEditFragment4, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue4);
                        }
                        Function1 function12 = (Function1) objRememberedValue4;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance5 = composer.changedInstance(this.this$0);
                        final InternalAssetTransferEquityEditFragment internalAssetTransferEquityEditFragment5 = this.this$0;
                        Object objRememberedValue5 = composer.rememberedValue();
                        if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function1() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditFragment$ComposeContent$2$1$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return InternalAssetTransferEquityEditFragment.C191812.AnonymousClass1.invoke$lambda$9$lambda$8(internalAssetTransferEquityEditFragment5, (KeyEvent) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue5);
                        }
                        composer.endReplaceGroup();
                        InternalAssetTransferEquityEdit4.InternalAssetTransferEquityEdit(symbol, availableShares, internalAssetTransferEquityEditViewStateComposeContent$lambda$0, function1, function0, function02, function12, (Function1) objRememberedValue5, modifierLogScreenTransitions$default, composer, StringResource.$stable << 6, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(InternalAssetTransferEquityEditFragment internalAssetTransferEquityEditFragment) {
                        internalAssetTransferEquityEditFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(InternalAssetTransferEquityEditFragment internalAssetTransferEquityEditFragment, ShareSelection2 selectionType) {
                        Intrinsics.checkNotNullParameter(selectionType, "selectionType");
                        internalAssetTransferEquityEditFragment.getDuxo().onSelectionTypeTapped(selectionType);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$5$lambda$4(InternalAssetTransferEquityEditFragment internalAssetTransferEquityEditFragment) {
                        internalAssetTransferEquityEditFragment.getDuxo().onConfirmClicked();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$7$lambda$6(InternalAssetTransferEquityEditFragment internalAssetTransferEquityEditFragment, boolean z) {
                        internalAssetTransferEquityEditFragment.getDuxo().updateUserCurrentlyEditing(z);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$9$lambda$8(InternalAssetTransferEquityEditFragment internalAssetTransferEquityEditFragment, KeyEvent keyEvent) {
                        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
                        internalAssetTransferEquityEditFragment.getDuxo().onKeyEvent(keyEvent);
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
                        ComposerKt.traceEventStart(-87223535, i3, -1, "com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditFragment.ComposeContent.<anonymous> (InternalAssetTransferEquityEditFragment.kt:53)");
                    }
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(489760092, true, new AnonymousClass1(InternalAssetTransferEquityEditFragment.this, snapshotState4CollectAsStateWithLifecycle), composer2, 54), composer2, 6);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternalAssetTransferEquityEditFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: InternalAssetTransferEquityEditFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditFragment$Args;", "Landroid/os/Parcelable;", "asset", "Lcom/robinhood/android/models/internalassettransfers/db/EligibleAsset;", "existingShareSelection", "Lcom/robinhood/android/internalassettransfers/customselection/equity/ShareSelection;", "<init>", "(Lcom/robinhood/android/models/internalassettransfers/db/EligibleAsset;Lcom/robinhood/android/internalassettransfers/customselection/equity/ShareSelection;)V", "getAsset", "()Lcom/robinhood/android/models/internalassettransfers/db/EligibleAsset;", "getExistingShareSelection", "()Lcom/robinhood/android/internalassettransfers/customselection/equity/ShareSelection;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final EligibleAsset asset;
        private final ShareSelection existingShareSelection;

        /* compiled from: InternalAssetTransferEquityEditFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((EligibleAsset) parcel.readParcelable(Args.class.getClassLoader()), (ShareSelection) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, EligibleAsset eligibleAsset, ShareSelection shareSelection, int i, Object obj) {
            if ((i & 1) != 0) {
                eligibleAsset = args.asset;
            }
            if ((i & 2) != 0) {
                shareSelection = args.existingShareSelection;
            }
            return args.copy(eligibleAsset, shareSelection);
        }

        /* renamed from: component1, reason: from getter */
        public final EligibleAsset getAsset() {
            return this.asset;
        }

        /* renamed from: component2, reason: from getter */
        public final ShareSelection getExistingShareSelection() {
            return this.existingShareSelection;
        }

        public final Args copy(EligibleAsset asset, ShareSelection existingShareSelection) {
            Intrinsics.checkNotNullParameter(asset, "asset");
            Intrinsics.checkNotNullParameter(existingShareSelection, "existingShareSelection");
            return new Args(asset, existingShareSelection);
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
            return Intrinsics.areEqual(this.asset, args.asset) && Intrinsics.areEqual(this.existingShareSelection, args.existingShareSelection);
        }

        public int hashCode() {
            return (this.asset.hashCode() * 31) + this.existingShareSelection.hashCode();
        }

        public String toString() {
            return "Args(asset=" + this.asset + ", existingShareSelection=" + this.existingShareSelection + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.asset, flags);
            dest.writeParcelable(this.existingShareSelection, flags);
        }

        public Args(EligibleAsset asset, ShareSelection existingShareSelection) {
            Intrinsics.checkNotNullParameter(asset, "asset");
            Intrinsics.checkNotNullParameter(existingShareSelection, "existingShareSelection");
            this.asset = asset;
            this.existingShareSelection = existingShareSelection;
        }

        public final EligibleAsset getAsset() {
            return this.asset;
        }

        public final ShareSelection getExistingShareSelection() {
            return this.existingShareSelection;
        }
    }

    /* compiled from: InternalAssetTransferEquityEditFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditFragment;", "Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditFragment$Args;", "<init>", "()V", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<InternalAssetTransferEquityEditFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(InternalAssetTransferEquityEditFragment internalAssetTransferEquityEditFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, internalAssetTransferEquityEditFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InternalAssetTransferEquityEditFragment newInstance(Args args) {
            return (InternalAssetTransferEquityEditFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InternalAssetTransferEquityEditFragment internalAssetTransferEquityEditFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, internalAssetTransferEquityEditFragment, args);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InternalAssetTransferEquityEditViewState ComposeContent$lambda$0(SnapshotState4<InternalAssetTransferEquityEditViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<InternalAssetTransferEquityEditEvent> ComposeContent$lambda$1(SnapshotState4<Event<InternalAssetTransferEquityEditEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }
}

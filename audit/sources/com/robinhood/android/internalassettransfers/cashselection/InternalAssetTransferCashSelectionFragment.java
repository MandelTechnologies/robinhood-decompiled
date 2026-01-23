package com.robinhood.android.internalassettransfers.cashselection;

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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.internalassettransfers.AssetSelection;
import com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionEvent;
import com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionFragment;
import com.robinhood.android.models.internalassettransfers.p193db.EligibleAssets;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.math.BigDecimal;
import java.util.NoSuchElementException;
import kotlin.Lazy;
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

/* compiled from: InternalAssetTransferCashSelectionFragment.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0003\u0017\u0018\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0014\u001a\u00020\u0015H\u0017¢\u0006\u0002\u0010\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a²\u0006\u0012\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cX\u008a\u0084\u0002²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionDuxo;", "getDuxo", "()Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "toolbarVisible", "", "getToolbarVisible", "()Z", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Args", "Companion", "feature-internal-asset-transfers_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionEvent;", "viewState", "Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InternalAssetTransferCashSelectionFragment extends GenericComposeFragment {
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InternalAssetTransferCashSelectionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, InternalAssetTransferCashSelectionDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof InternalAssetTransferCashSelectionFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* compiled from: InternalAssetTransferCashSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionFragment$Callbacks;", "", "cashBalanceConfirmed", "", AnalyticsStrings.BUTTON_GROUP_TITLE_CASH, "Ljava/math/BigDecimal;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void cashBalanceConfirmed(BigDecimal cash);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(InternalAssetTransferCashSelectionFragment internalAssetTransferCashSelectionFragment, int i, Composer composer, int i2) {
        internalAssetTransferCashSelectionFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InternalAssetTransferCashSelectionDuxo getDuxo() {
        return (InternalAssetTransferCashSelectionDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        EventConsumer<InternalAssetTransferCashSelectionEvent> eventConsumerInvoke;
        Composer composerStartRestartGroup = composer.startRestartGroup(1568524475);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1568524475, i2, -1, "com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionFragment.ComposeContent (InternalAssetTransferCashSelectionFragment.kt:33)");
            }
            final Event<InternalAssetTransferCashSelectionEvent> eventComposeContent$lambda$0 = ComposeContent$lambda$0(SnapshotStateKt.collectAsState(getDuxo().getEventFlow(), null, composerStartRestartGroup, 0, 1));
            if (eventComposeContent$lambda$0 != null && (eventComposeContent$lambda$0.getData() instanceof InternalAssetTransferCashSelectionEvent.CashAmountConfirmed) && (eventConsumerInvoke = eventComposeContent$lambda$0.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(eventComposeContent$lambda$0, new Function1() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionFragment$ComposeContent$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m15388invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m15388invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        this.getCallbacks().cashBalanceConfirmed(((InternalAssetTransferCashSelectionEvent.CashAmountConfirmed) eventComposeContent$lambda$0.getData()).getCash());
                    }
                });
            }
            final SnapshotState4 snapshotState4CollectAsState = SnapshotStateKt.collectAsState(getDuxo().getStateFlow(), null, composerStartRestartGroup, 0, 1);
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.INTERNAL_ASSET_TRANSFER_EDIT_CASH, null, null, null, 14, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, ((Args) INSTANCE.getArgs((Fragment) this)).getSource(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(1929057446, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionFragment.ComposeContent.2
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
                        ComposerKt.traceEventStart(1929057446, i3, -1, "com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionFragment.ComposeContent.<anonymous> (InternalAssetTransferCashSelectionFragment.kt:47)");
                    }
                    final SnapshotState4<InternalAssetTransferCashSelectionViewState> snapshotState4 = snapshotState4CollectAsState;
                    final InternalAssetTransferCashSelectionFragment internalAssetTransferCashSelectionFragment = this;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(965877307, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionFragment.ComposeContent.2.1
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
                                ComposerKt.traceEventStart(965877307, i4, -1, "com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionFragment.ComposeContent.<anonymous>.<anonymous> (InternalAssetTransferCashSelectionFragment.kt:48)");
                            }
                            InternalAssetTransferCashSelectionViewState internalAssetTransferCashSelectionViewStateComposeContent$lambda$2 = InternalAssetTransferCashSelectionFragment.ComposeContent$lambda$2(snapshotState4);
                            Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null);
                            final InternalAssetTransferCashSelectionFragment internalAssetTransferCashSelectionFragment2 = internalAssetTransferCashSelectionFragment;
                            InternalAssetTransferCashSelection5.InternalAssetTransferCashSelection(internalAssetTransferCashSelectionViewStateComposeContent$lambda$2, new InternalAssetTransferCashSelection4() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionFragment.ComposeContent.2.1.1
                                @Override // com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelection4
                                public void onNavigationBackClicked() {
                                    internalAssetTransferCashSelectionFragment2.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                                }

                                @Override // com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelection4
                                public void onEntireBalanceQuantityClicked() {
                                    internalAssetTransferCashSelectionFragment2.getDuxo().onEntireBalanceQuantityClicked();
                                }

                                @Override // com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelection4
                                public void onSpecificAmountQuantityClicked() {
                                    internalAssetTransferCashSelectionFragment2.getDuxo().onSpecificAmountQuantityClicked();
                                }

                                @Override // com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelection4
                                public void onUpdateButtonClicked() {
                                    internalAssetTransferCashSelectionFragment2.getDuxo().onCashAmountConfirm();
                                }

                                @Override // com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelection4
                                public void onConfirmButtonClicked() {
                                    internalAssetTransferCashSelectionFragment2.getDuxo().onCashAmountConfirm();
                                }

                                @Override // com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelection4
                                public void onCashAmountValueChanged(KeyEvent keyEvent) {
                                    Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
                                    internalAssetTransferCashSelectionFragment2.getDuxo().onKeyEvent(keyEvent);
                                }
                            }, modifierLogScreenTransitions$default, composer3, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternalAssetTransferCashSelectionFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final Event<InternalAssetTransferCashSelectionEvent> ComposeContent$lambda$0(SnapshotState4<Event<InternalAssetTransferCashSelectionEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InternalAssetTransferCashSelectionViewState ComposeContent$lambda$2(SnapshotState4<InternalAssetTransferCashSelectionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: InternalAssetTransferCashSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionFragment$Args;", "Landroid/os/Parcelable;", "source", "", "eligibleAssets", "Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "assetSelection", "Lcom/robinhood/android/internalassettransfers/AssetSelection;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;Lcom/robinhood/android/internalassettransfers/AssetSelection;)V", "getSource", "()Ljava/lang/String;", "getEligibleAssets", "()Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "getAssetSelection", "()Lcom/robinhood/android/internalassettransfers/AssetSelection;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final AssetSelection assetSelection;
        private final EligibleAssets eligibleAssets;
        private final String source;

        /* compiled from: InternalAssetTransferCashSelectionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), (EligibleAssets) parcel.readParcelable(Args.class.getClassLoader()), AssetSelection.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, EligibleAssets eligibleAssets, AssetSelection assetSelection, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.source;
            }
            if ((i & 2) != 0) {
                eligibleAssets = args.eligibleAssets;
            }
            if ((i & 4) != 0) {
                assetSelection = args.assetSelection;
            }
            return args.copy(str, eligibleAssets, assetSelection);
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

        public final Args copy(String source, EligibleAssets eligibleAssets, AssetSelection assetSelection) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(eligibleAssets, "eligibleAssets");
            Intrinsics.checkNotNullParameter(assetSelection, "assetSelection");
            return new Args(source, eligibleAssets, assetSelection);
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
            return Intrinsics.areEqual(this.source, args.source) && Intrinsics.areEqual(this.eligibleAssets, args.eligibleAssets) && Intrinsics.areEqual(this.assetSelection, args.assetSelection);
        }

        public int hashCode() {
            return (((this.source.hashCode() * 31) + this.eligibleAssets.hashCode()) * 31) + this.assetSelection.hashCode();
        }

        public String toString() {
            return "Args(source=" + this.source + ", eligibleAssets=" + this.eligibleAssets + ", assetSelection=" + this.assetSelection + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.source);
            dest.writeParcelable(this.eligibleAssets, flags);
            this.assetSelection.writeToParcel(dest, flags);
        }

        public Args(String source, EligibleAssets eligibleAssets, AssetSelection assetSelection) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(eligibleAssets, "eligibleAssets");
            Intrinsics.checkNotNullParameter(assetSelection, "assetSelection");
            this.source = source;
            this.eligibleAssets = eligibleAssets;
            this.assetSelection = assetSelection;
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
    }

    /* compiled from: InternalAssetTransferCashSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionFragment;", "Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionFragment$Args;", "<init>", "()V", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<InternalAssetTransferCashSelectionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(InternalAssetTransferCashSelectionFragment internalAssetTransferCashSelectionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, internalAssetTransferCashSelectionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InternalAssetTransferCashSelectionFragment newInstance(Args args) {
            return (InternalAssetTransferCashSelectionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InternalAssetTransferCashSelectionFragment internalAssetTransferCashSelectionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, internalAssetTransferCashSelectionFragment, args);
        }
    }
}

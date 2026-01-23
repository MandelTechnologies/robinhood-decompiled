package com.robinhood.android.acats.plaid.transfer.partial;

import android.content.Context;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.acats.C7376R;
import com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferViewState;
import com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsContract;
import com.robinhood.android.acatsin.partials.AcatsInPartialTransferParentContract;
import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import com.robinhood.android.acatsin.util.Eithers;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.models.api.bonfire.ApiAcatsAccountContentsResponse;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AcatsPlaidPartialTransferFragment.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020\u0012H\u0016J\r\u0010-\u001a\u00020)H\u0017¢\u0006\u0002\u0010.R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u0012X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0012X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0018\u0010#\u001a\u00060$j\u0002`%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u00060²\u0006\n\u00101\u001a\u000202X\u008a\u0084\u0002²\u0006\f\u00103\u001a\u0004\u0018\u000104X\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "duxo", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferDuxo;", "getDuxo", "()Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "toolbarVisible", "", "getToolbarVisible", "()Z", "childFragmentsShouldNotConfigureToolbar", "getChildFragmentsShouldNotConfigureToolbar", "callbacks", "Lcom/robinhood/android/acatsin/partials/AcatsInPartialTransferParentContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/acatsin/partials/AcatsInPartialTransferParentContract$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "confirmOnBackPress", "Landroidx/compose/runtime/MutableState;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onBackPressed", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "lib-acats-plaid_externalDebug", "viewState", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferViewState;", "lastEditAsset", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowData;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsPlaidPartialTransferFragment extends GenericComposeFragment implements AutoLoggableFragment {
    public EventLogger eventLogger;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsPlaidPartialTransferFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/acatsin/partials/AcatsInPartialTransferParentContract$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, AcatsPlaidPartialTransferDuxo.class);
    private final boolean childFragmentsShouldNotConfigureToolbar = true;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AcatsInPartialTransferParentContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof AcatsInPartialTransferParentContract.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final SnapshotState<Boolean> confirmOnBackPress = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$35(AcatsPlaidPartialTransferFragment acatsPlaidPartialTransferFragment, int i, Composer composer, int i2) {
        acatsPlaidPartialTransferFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
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
    public final AcatsPlaidPartialTransferDuxo getDuxo() {
        return (AcatsPlaidPartialTransferDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getChildFragmentsShouldNotConfigureToolbar() {
        return this.childFragmentsShouldNotConfigureToolbar;
    }

    private final AcatsInPartialTransferParentContract.Callbacks getCallbacks() {
        return (AcatsInPartialTransferParentContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = Screen.Name.ACATS_IN_PARTIAL_TRANSFER;
        Companion companion = INSTANCE;
        return new Screen(name, ((AcatsPlaidPartialTransferKey) companion.getArgs((Fragment) this)).getScreenContext().getSource(), Eithers.getLoggingIdentifier(((AcatsPlaidPartialTransferKey) companion.getArgs((Fragment) this)).getBrokerageOrDtcNumber()), null, 8, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return ((AcatsPlaidPartialTransferKey) INSTANCE.getArgs((Fragment) this)).getScreenContext().toEventContext();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (this.confirmOnBackPress.getValue().booleanValue()) {
            return false;
        }
        this.confirmOnBackPress.setValue(Boolean.TRUE);
        return true;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        SnapshotState4 snapshotState4;
        Function1 function1;
        final CoroutineScope coroutineScope;
        int i3;
        Composer.Companion companion;
        final ModalBottomSheetState modalBottomSheetState;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1262334193);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(this) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1262334193, i2, -1, "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferFragment.ComposeContent (AcatsPlaidPartialTransferFragment.kt:76)");
            }
            final SnapshotState4 snapshotState4CollectAsState = SnapshotStateKt.collectAsState(getDuxo().getStateFlow(), null, composerStartRestartGroup, 0, 1);
            AcatsPlaidPartialTransferViewState acatsPlaidPartialTransferViewStateComposeContent$lambda$0 = ComposeContent$lambda$0(snapshotState4CollectAsState);
            AcatsPlaidPartialTransferViewState.Ready ready = acatsPlaidPartialTransferViewStateComposeContent$lambda$0 instanceof AcatsPlaidPartialTransferViewState.Ready ? (AcatsPlaidPartialTransferViewState.Ready) acatsPlaidPartialTransferViewStateComposeContent$lambda$0 : null;
            AcatsPlaidPartialTransferAssetRowData editAssetState = ready != null ? ready.getEditAssetState() : null;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChanged = composerStartRestartGroup.changed(editAssetState) | composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new AcatsPlaidPartialTransferFragment2(editAssetState, snapshotState, this, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(editAssetState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue3;
            ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Hidden;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged2 = composerStartRestartGroup.changed(snapshotState4CollectAsState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == companion2.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(AcatsPlaidPartialTransferFragment.ComposeContent$lambda$6$lambda$5(snapshotState4CollectAsState, (ModalBottomSheetValue) obj));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            final ModalBottomSheetState modalBottomSheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(modalBottomSheetValue, null, (Function1) objRememberedValue4, false, composerStartRestartGroup, 6, 10);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope2) | composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changedInstance(modalBottomSheetStateRememberModalBottomSheetState);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == companion2.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferFragment$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AcatsPlaidPartialTransferFragment.ComposeContent$lambda$8$lambda$7(coroutineScope2, this, modalBottomSheetStateRememberModalBottomSheetState, (AcatsPlaidPartialTransferDuxo3) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Function1 function12 = (Function1) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1922322835);
            if (this.confirmOnBackPress.getValue().booleanValue()) {
                String strStringResource = StringResources_androidKt.stringResource(C7376R.string.acats_plaid_partial_transfer_onback_alert_title, composerStartRestartGroup, 0);
                BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C7376R.string.acats_plaid_partial_transfer_onback_alert_body, composerStartRestartGroup, 0));
                String strStringResource2 = StringResources_androidKt.stringResource(C7376R.string.acats_plaid_partial_transfer_onback_alert_confirm, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue6 == companion2.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferFragment$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AcatsPlaidPartialTransferFragment.ComposeContent$lambda$10$lambda$9(this.f$0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue6);
                String strStringResource3 = StringResources_androidKt.stringResource(C7376R.string.acats_plaid_partial_transfer_onback_alert_cancel, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue7 == companion2.getEmpty()) {
                    objRememberedValue7 = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferFragment$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AcatsPlaidPartialTransferFragment.ComposeContent$lambda$12$lambda$11(this.f$0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoAlertButton bentoAlertButton2 = new BentoAlertButton(strStringResource3, (Function0) objRememberedValue7);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance4 || objRememberedValue8 == companion2.getEmpty()) {
                    objRememberedValue8 = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferFragment$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AcatsPlaidPartialTransferFragment.ComposeContent$lambda$14$lambda$13(this.f$0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i4 = BentoAlertDialog2.Body.Text.$stable << 3;
                int i5 = BentoAlertButton.$stable;
                int i6 = i4 | (i5 << 6) | (i5 << 12);
                function1 = function12;
                snapshotState4 = snapshotState4CollectAsState;
                companion = companion2;
                modalBottomSheetState = modalBottomSheetStateRememberModalBottomSheetState;
                i3 = 5004770;
                coroutineScope = coroutineScope2;
                BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, bentoAlertButton2, null, false, null, (Function0) objRememberedValue8, composerStartRestartGroup, i6, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                snapshotState4 = snapshotState4CollectAsState;
                function1 = function12;
                coroutineScope = coroutineScope2;
                i3 = 5004770;
                companion = companion2;
                modalBottomSheetState = modalBottomSheetStateRememberModalBottomSheetState;
            }
            composerStartRestartGroup.endReplaceGroup();
            AcatsPlaidPartialTransferViewState acatsPlaidPartialTransferViewStateComposeContent$lambda$02 = ComposeContent$lambda$0(snapshotState4);
            Companion companion3 = INSTANCE;
            AcatsInScreenContext screenContext = ((AcatsPlaidPartialTransferKey) companion3.getArgs((Fragment) this)).getScreenContext();
            boolean hasSubZero = ((AcatsPlaidPartialTransferKey) companion3.getArgs((Fragment) this)).getHasSubZero();
            composerStartRestartGroup.startReplaceGroup(i3);
            boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance5 || objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferFragment$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AcatsPlaidPartialTransferFragment.ComposeContent$lambda$16$lambda$15(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            Function0 function0 = (Function0) objRememberedValue9;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(i3);
            boolean zChangedInstance6 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance6 || objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferFragment$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AcatsPlaidPartialTransferFragment.ComposeContent$lambda$18$lambda$17(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            Function0 function02 = (Function0) objRememberedValue10;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(i3);
            boolean zChangedInstance7 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance7 || objRememberedValue11 == companion.getEmpty()) {
                objRememberedValue11 = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferFragment$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AcatsPlaidPartialTransferFragment.ComposeContent$lambda$20$lambda$19(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            Function0 function03 = (Function0) objRememberedValue11;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance8 = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changedInstance(modalBottomSheetState);
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance8 || objRememberedValue12 == companion.getEmpty()) {
                objRememberedValue12 = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferFragment$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AcatsPlaidPartialTransferFragment.ComposeContent$lambda$22$lambda$21(coroutineScope, this, modalBottomSheetState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            Function0 function04 = (Function0) objRememberedValue12;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(i3);
            boolean zChangedInstance9 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance9 || objRememberedValue13 == companion.getEmpty()) {
                objRememberedValue13 = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferFragment$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AcatsPlaidPartialTransferFragment.ComposeContent$lambda$24$lambda$23(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
            }
            Function0 function05 = (Function0) objRememberedValue13;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(i3);
            boolean zChangedInstance10 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance10 || objRememberedValue14 == companion.getEmpty()) {
                objRememberedValue14 = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AcatsPlaidPartialTransferFragment.ComposeContent$lambda$26$lambda$25(this.f$0, (AcatsPlaidPartialTransferDuxo6) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
            }
            Function1 function13 = (Function1) objRememberedValue14;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(i3);
            boolean zChangedInstance11 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance11 || objRememberedValue15 == companion.getEmpty()) {
                objRememberedValue15 = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferFragment$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AcatsPlaidPartialTransferFragment.ComposeContent$lambda$28$lambda$27(this.f$0, (AcatsPlaidPartialTransferAssetRowData) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
            }
            Function1 function14 = (Function1) objRememberedValue15;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance12 = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changedInstance(modalBottomSheetState);
            Object objRememberedValue16 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance12 || objRememberedValue16 == companion.getEmpty()) {
                objRememberedValue16 = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferFragment$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AcatsPlaidPartialTransferFragment.ComposeContent$lambda$30$lambda$29(coroutineScope, this, modalBottomSheetState, (AcatsPlaidPartialTransferDuxo3) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
            }
            Function1 function15 = (Function1) objRememberedValue16;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            final Function1 function16 = function1;
            boolean zChangedInstance13 = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changed(function16);
            Object objRememberedValue17 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance13 || objRememberedValue17 == companion.getEmpty()) {
                objRememberedValue17 = new Function2() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferFragment$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AcatsPlaidPartialTransferFragment.ComposeContent$lambda$32$lambda$31(this.f$0, function16, (AcatsPlaidPartialTransferAssetRowData) obj, ((Boolean) obj2).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
            }
            Function2 function2 = (Function2) objRememberedValue17;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance14 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue18 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance14 || objRememberedValue18 == companion.getEmpty()) {
                objRememberedValue18 = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferFragment$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AcatsPlaidPartialTransferFragment.ComposeContent$lambda$34$lambda$33(this.f$0, (AcatsPlaidPartialTransferDuxo3) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
            }
            composerStartRestartGroup.endReplaceGroup();
            Composer composer2 = composerStartRestartGroup;
            AcatsPlaidPartialTransferComposable.AcatsPlaidPartialTransferComposable(acatsPlaidPartialTransferViewStateComposeContent$lambda$02, modalBottomSheetState, screenContext, function0, function02, function03, function04, function05, function13, function14, function15, function2, (Function1) objRememberedValue18, hasSubZero, composer2, (ModalBottomSheetState.$stable << 3) | (AcatsInScreenContext.$stable << 6), 0);
            composerStartRestartGroup = composer2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferFragment$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsPlaidPartialTransferFragment.ComposeContent$lambda$35(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final AcatsPlaidPartialTransferViewState ComposeContent$lambda$0(SnapshotState4<? extends AcatsPlaidPartialTransferViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AcatsPlaidPartialTransferAssetRowData ComposeContent$lambda$2(SnapshotState<AcatsPlaidPartialTransferAssetRowData> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ComposeContent$lambda$6$lambda$5(SnapshotState4 snapshotState4, ModalBottomSheetValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ComposeContent$lambda$0(snapshotState4).getRemoveAssetConfirmationState() == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$8$lambda$7(CoroutineScope coroutineScope, AcatsPlaidPartialTransferFragment acatsPlaidPartialTransferFragment, ModalBottomSheetState modalBottomSheetState, AcatsPlaidPartialTransferDuxo3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AcatsPlaidPartialTransferFragment5(acatsPlaidPartialTransferFragment, it, modalBottomSheetState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$10$lambda$9(AcatsPlaidPartialTransferFragment acatsPlaidPartialTransferFragment) {
        acatsPlaidPartialTransferFragment.requireBaseActivity().onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$12$lambda$11(AcatsPlaidPartialTransferFragment acatsPlaidPartialTransferFragment) {
        acatsPlaidPartialTransferFragment.confirmOnBackPress.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$14$lambda$13(AcatsPlaidPartialTransferFragment acatsPlaidPartialTransferFragment) {
        acatsPlaidPartialTransferFragment.confirmOnBackPress.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$16$lambda$15(AcatsPlaidPartialTransferFragment acatsPlaidPartialTransferFragment) {
        acatsPlaidPartialTransferFragment.confirmOnBackPress.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$24$lambda$23(AcatsPlaidPartialTransferFragment acatsPlaidPartialTransferFragment) {
        EventLogger.DefaultImpls.logTap$default(acatsPlaidPartialTransferFragment.getEventLogger(), null, acatsPlaidPartialTransferFragment.getEventScreen(), new Component(Component.ComponentType.BUTTON, "review_unsupported_assets", null, 4, null), null, acatsPlaidPartialTransferFragment.getScreenEventContext(), false, 41, null);
        Navigator navigator = acatsPlaidPartialTransferFragment.getNavigator();
        Context contextRequireContext = acatsPlaidPartialTransferFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Companion companion = INSTANCE;
        String contraAccountNumber = ((AcatsPlaidPartialTransferKey) companion.getArgs((Fragment) acatsPlaidPartialTransferFragment)).getContraAccountNumber();
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new AcatsInPlaidUnsupportedAssetsContract.Key(((AcatsPlaidPartialTransferKey) companion.getArgs((Fragment) acatsPlaidPartialTransferFragment)).getRhsAccountNumber(), ((AcatsPlaidPartialTransferKey) companion.getArgs((Fragment) acatsPlaidPartialTransferFragment)).getBrokerageOrDtcNumber(), contraAccountNumber, ((AcatsPlaidPartialTransferKey) companion.getArgs((Fragment) acatsPlaidPartialTransferFragment)).getPlaidAccessTokenId(), ((AcatsPlaidPartialTransferKey) companion.getArgs((Fragment) acatsPlaidPartialTransferFragment)).getSupportedContentTypes().contains(ApiAcatsAccountContentsResponse.SupportedContentType.OPTIONS), ((AcatsPlaidPartialTransferKey) companion.getArgs((Fragment) acatsPlaidPartialTransferFragment)).getSupportedContentTypes().contains(ApiAcatsAccountContentsResponse.SupportedContentType.MARGIN), ((AcatsPlaidPartialTransferKey) companion.getArgs((Fragment) acatsPlaidPartialTransferFragment)).getScreenContext()), false, false, false, null, false, null, false, false, null, null, 4084, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$26$lambda$25(AcatsPlaidPartialTransferFragment acatsPlaidPartialTransferFragment, AcatsPlaidPartialTransferDuxo6 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        EventLogger eventLogger = acatsPlaidPartialTransferFragment.getEventLogger();
        Screen eventScreen = acatsPlaidPartialTransferFragment.getEventScreen();
        Component.ComponentType componentType = Component.ComponentType.BUTTON;
        String lowerCase = it.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, eventScreen, new Component(componentType, "filter-" + lowerCase, null, 4, null), null, acatsPlaidPartialTransferFragment.getScreenEventContext(), false, 41, null);
        acatsPlaidPartialTransferFragment.getDuxo().onFilterClicked(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$28$lambda$27(AcatsPlaidPartialTransferFragment acatsPlaidPartialTransferFragment, AcatsPlaidPartialTransferAssetRowData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        EventLogger.DefaultImpls.logTap$default(acatsPlaidPartialTransferFragment.getEventLogger(), null, acatsPlaidPartialTransferFragment.getEventScreen(), new Component(Component.ComponentType.BUTTON, it.editLoggingIdentifier(), null, 4, null), null, acatsPlaidPartialTransferFragment.getScreenEventContext(), false, 41, null);
        acatsPlaidPartialTransferFragment.getDuxo().editSelectedRow(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$18$lambda$17(AcatsPlaidPartialTransferFragment acatsPlaidPartialTransferFragment) {
        acatsPlaidPartialTransferFragment.getDuxo().clearEditState();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$20$lambda$19(AcatsPlaidPartialTransferFragment acatsPlaidPartialTransferFragment) {
        EventLogger.DefaultImpls.logTap$default(acatsPlaidPartialTransferFragment.getEventLogger(), null, acatsPlaidPartialTransferFragment.getEventScreen(), new Component(Component.ComponentType.BUTTON, "confirm_partial_transfer", null, 4, null), null, acatsPlaidPartialTransferFragment.getScreenEventContext(), false, 41, null);
        acatsPlaidPartialTransferFragment.getCallbacks().onBuildPartialTransferComplete(acatsPlaidPartialTransferFragment.getDuxo().buildUiAcatsAssets());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$34$lambda$33(AcatsPlaidPartialTransferFragment acatsPlaidPartialTransferFragment, AcatsPlaidPartialTransferDuxo3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        acatsPlaidPartialTransferFragment.getDuxo().updateAssetTransferAmount(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$32$lambda$31(AcatsPlaidPartialTransferFragment acatsPlaidPartialTransferFragment, Function1 function1, AcatsPlaidPartialTransferAssetRowData asset, boolean z) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        if (z) {
            EventLogger.DefaultImpls.logSwipe$default(acatsPlaidPartialTransferFragment.getEventLogger(), null, acatsPlaidPartialTransferFragment.getEventScreen(), new Component(Component.ComponentType.BUTTON, asset.editLoggingIdentifier(), null, 4, null), null, acatsPlaidPartialTransferFragment.getScreenEventContext(), false, 41, null);
        }
        function1.invoke(asset.getType());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$30$lambda$29(CoroutineScope coroutineScope, AcatsPlaidPartialTransferFragment acatsPlaidPartialTransferFragment, ModalBottomSheetState modalBottomSheetState, AcatsPlaidPartialTransferDuxo3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AcatsPlaidPartialTransferFragment3(acatsPlaidPartialTransferFragment, it, modalBottomSheetState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$22$lambda$21(CoroutineScope coroutineScope, AcatsPlaidPartialTransferFragment acatsPlaidPartialTransferFragment, ModalBottomSheetState modalBottomSheetState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AcatsPlaidPartialTransferFragment4(acatsPlaidPartialTransferFragment, modalBottomSheetState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsPlaidPartialTransferFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferFragment;", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferKey;", "<init>", "()V", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AcatsPlaidPartialTransferFragment, AcatsPlaidPartialTransferKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AcatsPlaidPartialTransferKey acatsPlaidPartialTransferKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, acatsPlaidPartialTransferKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AcatsPlaidPartialTransferKey getArgs(AcatsPlaidPartialTransferFragment acatsPlaidPartialTransferFragment) {
            return (AcatsPlaidPartialTransferKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, acatsPlaidPartialTransferFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsPlaidPartialTransferFragment newInstance(AcatsPlaidPartialTransferKey acatsPlaidPartialTransferKey) {
            return (AcatsPlaidPartialTransferFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, acatsPlaidPartialTransferKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsPlaidPartialTransferFragment acatsPlaidPartialTransferFragment, AcatsPlaidPartialTransferKey acatsPlaidPartialTransferKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, acatsPlaidPartialTransferFragment, acatsPlaidPartialTransferKey);
        }
    }
}

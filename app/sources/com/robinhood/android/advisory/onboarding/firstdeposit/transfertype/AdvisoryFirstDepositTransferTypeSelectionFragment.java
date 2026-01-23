package com.robinhood.android.advisory.onboarding.firstdeposit.transfertype;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFirstDepositTransferTypeSelectionFragment;
import com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsEvent;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.models.retirement.api.contributions.ContributionYear;
import com.robinhood.android.udf.event.Event;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.advisory.api.contribution.ApiAdvisoryFirstTimeContributionViewModel;
import com.robinhood.models.advisory.api.contribution.ApiAdvisoryFirstTimeContributionViewModel2;
import com.robinhood.models.advisory.api.contribution.ApiAdvisoryFirstTimeContributionViewModel3;
import com.robinhood.models.advisory.api.contribution.ApiAdvisoryFirstTimeContributionViewModel4;
import com.robinhood.models.advisory.api.contribution.TransferAccountInfo;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.util.Money;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
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

/* compiled from: AdvisoryFirstDepositTransferTypeSelectionFragment.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0003()*B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0017\u001a\u00020\u0018H\u0017¢\u0006\u0002\u0010\u0019J*\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u0018H\u0016J\b\u0010$\u001a\u00020\u0018H\u0016J\u0010\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020'H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006+²\u0006\n\u0010,\u001a\u00020-X\u008a\u0084\u0002²\u0006\u0012\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010.X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFirstDepositTransferTypeSelectionFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsCallbacks;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "callbacks", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFirstDepositTransferTypeSelectionFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFirstDepositTransferTypeSelectionFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsDuxo;", "getDuxo", "()Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onSelection", "selection", "Lcom/robinhood/models/advisory/api/contribution/FirstTimeTransferType;", "viewModel", "Lcom/robinhood/models/advisory/api/contribution/ApiAdvisoryFirstTimeContributionViewModel;", "rowLoggingIdentifier", "", "sourceTransferAccountInfo", "Lcom/robinhood/models/advisory/api/contribution/TransferAccountInfo;", "onBackClicked", "onRetryClicked", "handleEvent", "event", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsEvent;", "Callbacks", "Args", "Companion", "feature-advisory-onboarding_externalDebug", "state", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsViewState;", "Lcom/robinhood/android/udf/event/Event;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AdvisoryFirstDepositTransferTypeSelectionFragment extends GenericComposeFragment implements AdvisoryFundingMethodsScreen {
    public static final int $stable = 0;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AdvisoryFirstDepositTransferTypeSelectionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFirstDepositTransferTypeSelectionFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFirstDepositTransferTypeSelectionFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
            if (!(parentFragment instanceof AdvisoryFirstDepositTransferTypeSelectionFragment.Callbacks)) {
                parentFragment = null;
            }
            AdvisoryFirstDepositTransferTypeSelectionFragment.Callbacks callbacks = (AdvisoryFirstDepositTransferTypeSelectionFragment.Callbacks) parentFragment;
            if (callbacks != null) {
                return callbacks;
            }
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof AdvisoryFirstDepositTransferTypeSelectionFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, AdvisoryFundingMethodsDuxo.class);

    /* compiled from: AdvisoryFirstDepositTransferTypeSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J&\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H&J*\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H&¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFirstDepositTransferTypeSelectionFragment$Callbacks;", "", "showAgreements", "", "applicationId", "Ljava/util/UUID;", "showAssetTransferTimeline", "timeline", "Lcom/robinhood/models/advisory/api/contribution/FundingMethodTimeline;", "loggingIdentifier", "", "onRetirementContributionSelected", "contributionYears", "", "Lcom/robinhood/android/models/retirement/api/contributions/ContributionYear;", "minimumContribution", "Lcom/robinhood/models/util/Money;", "onDepositSelected", "minimumDeposit", "viewModel", "Lcom/robinhood/models/advisory/api/contribution/ContributionViewModel$MoneyTransferViewModel;", "sourceTransferAccountInfo", "Lcom/robinhood/models/advisory/api/contribution/TransferAccountInfo;", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onDepositSelected(UUID applicationId, Money minimumDeposit, ApiAdvisoryFirstTimeContributionViewModel2.MoneyTransferViewModel viewModel, TransferAccountInfo sourceTransferAccountInfo);

        void onRetirementContributionSelected(UUID applicationId, List<ContributionYear> contributionYears, Money minimumContribution);

        void showAgreements(UUID applicationId);

        void showAssetTransferTimeline(UUID applicationId, ApiAdvisoryFirstTimeContributionViewModel4 timeline, String loggingIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(AdvisoryFirstDepositTransferTypeSelectionFragment advisoryFirstDepositTransferTypeSelectionFragment, int i, Composer composer, int i2) {
        advisoryFirstDepositTransferTypeSelectionFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final AdvisoryFundingMethodsDuxo getDuxo() {
        return (AdvisoryFundingMethodsDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-770691214);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-770691214, i2, -1, "com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFirstDepositTransferTypeSelectionFragment.ComposeContent (AdvisoryFirstDepositTransferTypeSelectionFragment.kt:58)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            AdvisoryFundingMethodsViewState advisoryFundingMethodsViewStateComposeContent$lambda$0 = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
            Companion companion = INSTANCE;
            String source = ((Args) companion.getArgs((Fragment) this)).getSource();
            if (source == null) {
                source = "";
            }
            AdvisoryFundingMethodsScreen2.AdvisoryFundingMethodsScreen(advisoryFundingMethodsViewStateComposeContent$lambda$0, source, ((Args) companion.getArgs((Fragment) this)).getBrokerageAccountType(), this, null, composerStartRestartGroup, (i2 << 9) & 7168, 16);
            composerStartRestartGroup = composerStartRestartGroup;
            Event<AdvisoryFundingMethodsEvent> eventComposeContent$lambda$1 = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged = ((i2 & 14) == 4) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new AdvisoryFirstDepositTransferTypeSelectionFragment2(this, snapshotState4CollectAsStateWithLifecycle2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(eventComposeContent$lambda$1, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFirstDepositTransferTypeSelectionFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvisoryFirstDepositTransferTypeSelectionFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreen
    public void onSelection(ApiAdvisoryFirstTimeContributionViewModel3 selection, ApiAdvisoryFirstTimeContributionViewModel viewModel, String rowLoggingIdentifier, TransferAccountInfo sourceTransferAccountInfo) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(rowLoggingIdentifier, "rowLoggingIdentifier");
        getDuxo().onSelection(selection, viewModel, rowLoggingIdentifier, sourceTransferAccountInfo);
    }

    private static final AdvisoryFundingMethodsViewState ComposeContent$lambda$0(SnapshotState4<? extends AdvisoryFundingMethodsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Event<AdvisoryFundingMethodsEvent> ComposeContent$lambda$1(SnapshotState4<Event<AdvisoryFundingMethodsEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreen
    public void onBackClicked() {
        requireBaseActivity().onBackPressed();
    }

    @Override // com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreen
    public void onRetryClicked() {
        getDuxo().retry();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(AdvisoryFundingMethodsEvent event) {
        if (event instanceof AdvisoryFundingMethodsEvent.Deposit) {
            AdvisoryFundingMethodsEvent.Deposit deposit = (AdvisoryFundingMethodsEvent.Deposit) event;
            getCallbacks().onDepositSelected(((Args) INSTANCE.getArgs((Fragment) this)).getApplicationId(), deposit.getMinimumDeposit(), deposit.getViewModel(), deposit.getSourceTransferAccountInfo());
            return;
        }
        if (event instanceof AdvisoryFundingMethodsEvent.RetirementContribution) {
            AdvisoryFundingMethodsEvent.RetirementContribution retirementContribution = (AdvisoryFundingMethodsEvent.RetirementContribution) event;
            getCallbacks().onRetirementContributionSelected(((Args) INSTANCE.getArgs((Fragment) this)).getApplicationId(), retirementContribution.getContributionYears(), retirementContribution.getMinimumContribution());
        } else if (event instanceof AdvisoryFundingMethodsEvent.AssetTransferTimeline) {
            AdvisoryFundingMethodsEvent.AssetTransferTimeline assetTransferTimeline = (AdvisoryFundingMethodsEvent.AssetTransferTimeline) event;
            getCallbacks().showAssetTransferTimeline(((Args) INSTANCE.getArgs((Fragment) this)).getApplicationId(), assetTransferTimeline.getTimeline(), assetTransferTimeline.getLoggingIdentifier());
        } else {
            if (!Intrinsics.areEqual(event, AdvisoryFundingMethodsEvent.ShowAgreements.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            getCallbacks().showAgreements(((Args) INSTANCE.getArgs((Fragment) this)).getApplicationId());
        }
    }

    /* compiled from: AdvisoryFirstDepositTransferTypeSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFirstDepositTransferTypeSelectionFragment$Args;", "Landroid/os/Parcelable;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "applicationId", "Ljava/util/UUID;", "source", "", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Ljava/util/UUID;Ljava/lang/String;)V", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getApplicationId", "()Ljava/util/UUID;", "getSource", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID applicationId;
        private final BrokerageAccountType brokerageAccountType;
        private final String source;

        /* compiled from: AdvisoryFirstDepositTransferTypeSelectionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(BrokerageAccountType.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, BrokerageAccountType brokerageAccountType, UUID uuid, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                brokerageAccountType = args.brokerageAccountType;
            }
            if ((i & 2) != 0) {
                uuid = args.applicationId;
            }
            if ((i & 4) != 0) {
                str = args.source;
            }
            return args.copy(brokerageAccountType, uuid, str);
        }

        /* renamed from: component1, reason: from getter */
        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getApplicationId() {
            return this.applicationId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final Args copy(BrokerageAccountType brokerageAccountType, UUID applicationId, String source) {
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            return new Args(brokerageAccountType, applicationId, source);
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
            return this.brokerageAccountType == args.brokerageAccountType && Intrinsics.areEqual(this.applicationId, args.applicationId) && Intrinsics.areEqual(this.source, args.source);
        }

        public int hashCode() {
            int iHashCode = ((this.brokerageAccountType.hashCode() * 31) + this.applicationId.hashCode()) * 31;
            String str = this.source;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Args(brokerageAccountType=" + this.brokerageAccountType + ", applicationId=" + this.applicationId + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.brokerageAccountType.name());
            dest.writeSerializable(this.applicationId);
            dest.writeString(this.source);
        }

        public Args(BrokerageAccountType brokerageAccountType, UUID applicationId, String str) {
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            this.brokerageAccountType = brokerageAccountType;
            this.applicationId = applicationId;
            this.source = str;
        }

        public /* synthetic */ Args(BrokerageAccountType brokerageAccountType, UUID uuid, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(brokerageAccountType, uuid, (i & 4) != 0 ? null : str);
        }

        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        public final UUID getApplicationId() {
            return this.applicationId;
        }

        public final String getSource() {
            return this.source;
        }
    }

    /* compiled from: AdvisoryFirstDepositTransferTypeSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFirstDepositTransferTypeSelectionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFirstDepositTransferTypeSelectionFragment;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFirstDepositTransferTypeSelectionFragment$Args;", "<init>", "()V", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<AdvisoryFirstDepositTransferTypeSelectionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(AdvisoryFirstDepositTransferTypeSelectionFragment advisoryFirstDepositTransferTypeSelectionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, advisoryFirstDepositTransferTypeSelectionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AdvisoryFirstDepositTransferTypeSelectionFragment newInstance(Args args) {
            return (AdvisoryFirstDepositTransferTypeSelectionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AdvisoryFirstDepositTransferTypeSelectionFragment advisoryFirstDepositTransferTypeSelectionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, advisoryFirstDepositTransferTypeSelectionFragment, args);
        }
    }
}

package com.robinhood.android.internalassettransfers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.WindowCompat;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.assettransfers.contracts.InternalAssetTransfer;
import com.robinhood.android.assettransfers.contracts.InternalAssetTransferHistory;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.internalassettransfers.InternalAssetTransferEvent;
import com.robinhood.android.internalassettransfers.accountselection.AccountSelectionCallbacks;
import com.robinhood.android.internalassettransfers.accountselection.AccountSelectionFragment;
import com.robinhood.android.internalassettransfers.accountselection.UiIatAccount;
import com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListFragment;
import com.robinhood.android.internalassettransfers.agreements.InternalAssetTransferAgreementFragment;
import com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionFragment;
import com.robinhood.android.internalassettransfers.confirmation.InternalAssetTransferConfirmationFragment;
import com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment;
import com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditFragment;
import com.robinhood.android.internalassettransfers.customselection.equity.ShareSelection;
import com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryFragment;
import com.robinhood.android.internalassettransfers.intro.InternalAssetTransferIntroFragment;
import com.robinhood.android.internalassettransfers.intro.prefs.ShouldSkipInternalAssetTransferIntroPref;
import com.robinhood.android.internalassettransfers.preselect.LoadPreselectedAccountsCallbacks;
import com.robinhood.android.internalassettransfers.preselect.LoadPreselectedAccountsFragment;
import com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarnFragment;
import com.robinhood.android.internalassettransfers.presubmissionwarn.PresubmissionChecksAlertSheet;
import com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewFragment;
import com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetsFragment;
import com.robinhood.android.internalassettransfers.review.models.UiAssets;
import com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionFragment;
import com.robinhood.android.models.internalassettransfers.p193db.EligibleAsset;
import com.robinhood.android.models.internalassettransfers.p193db.EligibleAssets;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.remote.assets.LottieUrl;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: InternalAssetTransferActivity.kt */
@Metadata(m3635d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 k2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r:\u0002klB\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\u0016\u0010*\u001a\u00020'2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,H\u0002J\b\u0010.\u001a\u00020'H\u0016J\b\u0010/\u001a\u00020'H\u0016J\u001e\u00100\u001a\u00020'2\u0006\u00101\u001a\u00020\u001d2\f\u00102\u001a\b\u0012\u0004\u0012\u00020403H\u0016J \u00105\u001a\u00020'2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020:H\u0016J\u0018\u0010;\u001a\u00020'2\u0006\u00101\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020\u001eH\u0016J\b\u0010=\u001a\u00020'H\u0016J\u0010\u0010>\u001a\u00020'2\u0006\u0010?\u001a\u00020@H\u0016J\u0010\u0010A\u001a\u00020'2\u0006\u0010B\u001a\u00020@H\u0016J\u0018\u0010C\u001a\u00020'2\u0006\u0010D\u001a\u00020\u001e2\u0006\u0010E\u001a\u000207H\u0016J\b\u0010F\u001a\u00020'H\u0016J\u0010\u0010G\u001a\u00020'2\u0006\u0010D\u001a\u00020\u001eH\u0016J\b\u0010H\u001a\u00020'H\u0016J\b\u0010I\u001a\u00020'H\u0016J\b\u0010J\u001a\u00020'H\u0016J\u001e\u0010K\u001a\u00020'2\u0006\u0010L\u001a\u00020M2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020O03H\u0016J\u001e\u0010P\u001a\u00020'2\u0006\u0010L\u001a\u00020M2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020O03H\u0016J\b\u0010Q\u001a\u00020'H\u0016J\b\u0010R\u001a\u00020'H\u0016J\u0010\u0010S\u001a\u00020'2\u0006\u0010T\u001a\u00020OH\u0016J\u0010\u0010U\u001a\u00020'2\u0006\u0010T\u001a\u00020OH\u0016J\b\u0010V\u001a\u00020'H\u0016J\u0018\u0010W\u001a\u00020'2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[H\u0016J\b\u0010\\\u001a\u00020'H\u0016J\u0016\u0010]\u001a\u00020'2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020_03H\u0016J\b\u0010`\u001a\u00020'H\u0016J\u0010\u0010a\u001a\u00020'2\u0006\u0010b\u001a\u00020cH\u0016J\u0018\u0010d\u001a\u00020'2\u0006\u0010T\u001a\u00020O2\u0006\u0010e\u001a\u00020[H\u0016J \u0010f\u001a\u00020'2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020:H\u0016J\b\u0010g\u001a\u00020'H\u0016J\b\u0010h\u001a\u00020'H\u0016J\b\u0010i\u001a\u00020'H\u0002J\b\u0010j\u001a\u00020'H\u0002R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR(\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001c0\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001aR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006m"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/InternalAssetTransferActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/internalassettransfers/intro/InternalAssetTransferIntroFragment$Callbacks;", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionCallbacks;", "Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$SelectSourceSinkAccountCallbacks;", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementFragment$Callbacks;", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewFragment$Callbacks;", "Lcom/robinhood/android/internalassettransfers/confirmation/InternalAssetTransferConfirmationFragment$Callbacks;", "Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionFragment$Callbacks;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionFragment$Callbacks;", "Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionFragment$Callbacks;", "Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditFragment$Callbacks;", "Lcom/robinhood/android/internalassettransfers/preselect/LoadPreselectedAccountsCallbacks;", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/InternalAssetTransferPreSubmissionWarnFragment$Callbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/internalassettransfers/InternalAssetTransferDuxo;", "getDuxo", "()Lcom/robinhood/android/internalassettransfers/InternalAssetTransferDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "assetSelectionFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/internalassettransfers/AssetSelection;", "getAssetSelectionFlow", "()Lkotlinx/coroutines/flow/Flow;", "accountSelectionFlow", "Lkotlin/Pair;", "Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$AccountSelectionType;", "", "getAccountSelectionFlow", "shouldSkipInternalAssetTransferIntroScreenPref", "Lcom/robinhood/prefs/BooleanPreference;", "getShouldSkipInternalAssetTransferIntroScreenPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setShouldSkipInternalAssetTransferIntroScreenPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/internalassettransfers/InternalAssetTransferEvent;", "onContinueClicked", "onClearAccountSelections", "onRowClicked", "selectionType", "options", "", "Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$Args$AccountSelectionOption;", "onAccountsSelected", "source", "Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "sink", "sourceEligibleAssets", "Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "onAccountSelected", "rhsAccountNumber", "onAgreementSign", "onAssetsRowClick", "transferableAssets", "Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;", "onInfoBannerClick", "nonTransferableAssets", "onSubmitButtonClick", "assetTransferUuid", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "onEditTransferSelectionClick", "onViewTransferDetails", "onFullAssetTransfer", "onPartialAssetTransfer", "cashBalanceClicked", "clearAssetSelectionClicked", "isCashVisible", "", "instrumentIds", "Ljava/util/UUID;", "selectAllClicked", "cashBalanceSelected", "cashBalanceUnselected", "selectedEquity", "instrumentId", "unselectEquity", "onInfoBannerLinkClicked", "onEditEquity", "asset", "Lcom/robinhood/android/models/internalassettransfers/db/EligibleAsset;", "sharesSelectedForTransfer", "Lcom/robinhood/android/internalassettransfers/customselection/equity/ShareSelection;", "completeSelection", "navigateToPreSubmissionWarnsScreen", "alerts", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/PresubmissionChecksAlertSheet;", "navigateBackFromCustomSelectionScreenToReviewScreen", "cashBalanceConfirmed", AnalyticsStrings.BUTTON_GROUP_TITLE_CASH, "Ljava/math/BigDecimal;", "onEquityEditComplete", "shareSelection", "onPreselectedAccountsLoaded", "onPreselectedAccountsIncompatible", "navigateToAgreementScreen", "setAccountSelectionFragment", "prefetchLottieAssets", "Companion", "InvestorProfileQuestionArgs", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InternalAssetTransferActivity extends BaseActivity implements InternalAssetTransferIntroFragment.Callbacks, AccountSelectionCallbacks, AccountSelectionListFragment.SelectSourceSinkAccountCallbacks, InternalAssetTransferAgreementFragment.Callbacks, InternalAssetTransferReviewFragment.Callbacks, InternalAssetTransferConfirmationFragment.Callbacks, InternalAssetTransferTypeSelectionFragment.Callbacks, InternalAssetTransferCustomSelectionFragment.Callbacks, InternalAssetTransferCashSelectionFragment.Callbacks, InternalAssetTransferEquityEditFragment.Callbacks, LoadPreselectedAccountsCallbacks, InternalAssetTransferPreSubmissionWarnFragment.Callbacks {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    @ShouldSkipInternalAssetTransferIntroPref
    public BooleanPreference shouldSkipInternalAssetTransferIntroScreenPref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<InternalAssetTransferEvent> event) {
        EventConsumer<InternalAssetTransferEvent> eventConsumerInvoke;
        EventConsumer<InternalAssetTransferEvent> eventConsumerInvoke2;
        EventConsumer<InternalAssetTransferEvent> eventConsumerInvoke3;
        EventConsumer<InternalAssetTransferEvent> eventConsumerInvoke4;
        EventConsumer<InternalAssetTransferEvent> eventConsumerInvoke5;
        EventConsumer<InternalAssetTransferEvent> eventConsumerInvoke6;
        EventConsumer<InternalAssetTransferEvent> eventConsumerInvoke7;
        EventConsumer<InternalAssetTransferEvent> eventConsumerInvoke8;
        if ((event.getData() instanceof InternalAssetTransferEvent.NavigateToFullPartialChoiceScreen) && (eventConsumerInvoke8 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke8.consume(event, new Function1() { // from class: com.robinhood.android.internalassettransfers.InternalAssetTransferActivity$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m15357invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m15357invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    InternalAssetTransferEvent.NavigateToFullPartialChoiceScreen navigateToFullPartialChoiceScreen = (InternalAssetTransferEvent.NavigateToFullPartialChoiceScreen) event.getData();
                    this.replaceFragment((InternalAssetTransferTypeSelectionFragment) InternalAssetTransferTypeSelectionFragment.INSTANCE.newInstance((Parcelable) new InternalAssetTransferTypeSelectionFragment.Args(navigateToFullPartialChoiceScreen.getSource(), navigateToFullPartialChoiceScreen.getSinkAccount(), navigateToFullPartialChoiceScreen.getSourceAccount(), navigateToFullPartialChoiceScreen.getSourceEligibleAssets())));
                }
            });
        }
        if ((event.getData() instanceof InternalAssetTransferEvent.NavigateToAgreementsScreen) && (eventConsumerInvoke7 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke7.consume(event, new Function1() { // from class: com.robinhood.android.internalassettransfers.InternalAssetTransferActivity$handleEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m15358invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m15358invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.replaceFragment(InternalAssetTransferAgreementFragment.INSTANCE.newInstance((Parcelable) new InternalAssetTransferAgreementFragment.Args(((InternalAssetTransferEvent.NavigateToAgreementsScreen) event.getData()).getSource())));
                }
            });
        }
        if ((event.getData() instanceof InternalAssetTransferEvent.NavigateToReviewScreen) && (eventConsumerInvoke6 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke6.consume(event, new Function1() { // from class: com.robinhood.android.internalassettransfers.InternalAssetTransferActivity$handleEvent$$inlined$consumeIfType$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m15359invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m15359invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    InternalAssetTransferEvent.NavigateToReviewScreen navigateToReviewScreen = (InternalAssetTransferEvent.NavigateToReviewScreen) event.getData();
                    this.replaceFragment(InternalAssetTransferReviewFragment.INSTANCE.newInstance((Parcelable) new InternalAssetTransferReviewFragment.Args(navigateToReviewScreen.getAccountSelection().getSourceAccount(), navigateToReviewScreen.getAccountSelection().getSinkAccount(), navigateToReviewScreen.getAssetsToTransfer(), navigateToReviewScreen.getNonTransferableAssetsToDisplay(), navigateToReviewScreen.getSource())));
                }
            });
        }
        if ((event.getData() instanceof InternalAssetTransferEvent.NavigateToReviewAssetsScreen) && (eventConsumerInvoke5 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke5.consume(event, new Function1() { // from class: com.robinhood.android.internalassettransfers.InternalAssetTransferActivity$handleEvent$$inlined$consumeIfType$4
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m15360invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m15360invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    InternalAssetTransferEvent.NavigateToReviewAssetsScreen navigateToReviewAssetsScreen = (InternalAssetTransferEvent.NavigateToReviewAssetsScreen) event.getData();
                    this.replaceFragment(InternalAssetTransferReviewAssetsFragment.INSTANCE.newInstance((Parcelable) new InternalAssetTransferReviewAssetsFragment.Args(navigateToReviewAssetsScreen.getAssets(), navigateToReviewAssetsScreen.getSource(), false, 4, null)));
                }
            });
        }
        if ((event.getData() instanceof InternalAssetTransferEvent.NavigateToAgreementsScreen) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.internalassettransfers.InternalAssetTransferActivity$handleEvent$$inlined$consumeIfType$5
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m15361invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m15361invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.replaceFragment(InternalAssetTransferAgreementFragment.INSTANCE.newInstance((Parcelable) new InternalAssetTransferAgreementFragment.Args(((InternalAssetTransferEvent.NavigateToAgreementsScreen) event.getData()).getSource())));
                }
            });
        }
        if ((event.getData() instanceof InternalAssetTransferEvent.NavigateToCustomSelectionScreen) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.internalassettransfers.InternalAssetTransferActivity$handleEvent$$inlined$consumeIfType$6
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m15362invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m15362invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    InternalAssetTransferEvent.NavigateToCustomSelectionScreen navigateToCustomSelectionScreen = (InternalAssetTransferEvent.NavigateToCustomSelectionScreen) event.getData();
                    this.replaceFragment(InternalAssetTransferCustomSelectionFragment.INSTANCE.newInstance((Parcelable) new InternalAssetTransferCustomSelectionFragment.Args(navigateToCustomSelectionScreen.getSource(), navigateToCustomSelectionScreen.getSourceEligibleAssets(), navigateToCustomSelectionScreen.getAssetSelection(), navigateToCustomSelectionScreen.getAccountSelection(), navigateToCustomSelectionScreen.getAbortTheFlow())));
                }
            });
        }
        if ((event.getData() instanceof InternalAssetTransferEvent.NavigateToCashBalanceScreen) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.internalassettransfers.InternalAssetTransferActivity$handleEvent$$inlined$consumeIfType$7
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m15363invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m15363invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    InternalAssetTransferEvent.NavigateToCashBalanceScreen navigateToCashBalanceScreen = (InternalAssetTransferEvent.NavigateToCashBalanceScreen) event.getData();
                    this.replaceFragment(InternalAssetTransferCashSelectionFragment.INSTANCE.newInstance((Parcelable) new InternalAssetTransferCashSelectionFragment.Args(navigateToCashBalanceScreen.getSource(), navigateToCashBalanceScreen.getSourceEligibleAssets(), navigateToCashBalanceScreen.getAssetSelection())));
                }
            });
        }
        if (!(event.getData() instanceof InternalAssetTransferEvent.NavigateToPreSubmissionWarnsScreen) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.internalassettransfers.InternalAssetTransferActivity$handleEvent$$inlined$consumeIfType$8
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m15364invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m15364invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                InternalAssetTransferEvent.NavigateToPreSubmissionWarnsScreen navigateToPreSubmissionWarnsScreen = (InternalAssetTransferEvent.NavigateToPreSubmissionWarnsScreen) event.getData();
                this.replaceFragment(InternalAssetTransferPreSubmissionWarnFragment.INSTANCE.newInstance((Parcelable) new InternalAssetTransferPreSubmissionWarnFragment.Args(navigateToPreSubmissionWarnsScreen.getSource(), navigateToPreSubmissionWarnsScreen.getAlerts())));
            }
        });
    }

    public InternalAssetTransferActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.duxo = DuxosKt.duxo(this, InternalAssetTransferDuxo.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InternalAssetTransferDuxo getDuxo() {
        return (InternalAssetTransferDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment.Callbacks
    public Flow<AssetSelection> getAssetSelectionFlow() {
        return getDuxo().getAssetSelectionFlow();
    }

    @Override // com.robinhood.android.internalassettransfers.accountselection.AccountSelectionCallbacks
    public Flow<Tuples2<AccountSelectionListFragment.AccountSelectionType, String>> getAccountSelectionFlow() {
        return getDuxo().getAccountSelectionFlow();
    }

    public final BooleanPreference getShouldSkipInternalAssetTransferIntroScreenPref() {
        BooleanPreference booleanPreference = this.shouldSkipInternalAssetTransferIntroScreenPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shouldSkipInternalAssetTransferIntroScreenPref");
        return null;
    }

    public final void setShouldSkipInternalAssetTransferIntroScreenPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.shouldSkipInternalAssetTransferIntroScreenPref = booleanPreference;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        prefetchLottieAssets();
        if (savedInstanceState == null) {
            Companion companion = INSTANCE;
            InternalAssetTransfer.PreselectedAccounts preselectedAccounts = ((InternalAssetTransfer) companion.getExtras((Activity) this)).getPreselectedAccounts();
            if ((preselectedAccounts != null ? preselectedAccounts.getSourceRhsAccountNumber() : null) != null) {
                String sourceRhsAccountNumber = preselectedAccounts.getSourceRhsAccountNumber();
                if (sourceRhsAccountNumber != null) {
                    setFragment(C11048R.id.fragment_container, LoadPreselectedAccountsFragment.INSTANCE.newInstance((Parcelable) new LoadPreselectedAccountsFragment.Args(sourceRhsAccountNumber, preselectedAccounts.getSinkRhsAccountNumber())));
                }
            } else if (getShouldSkipInternalAssetTransferIntroScreenPref().get()) {
                setAccountSelectionFragment();
            } else {
                setFragment(C11048R.id.fragment_container, InternalAssetTransferIntroFragment.INSTANCE.newInstance((Parcelable) new InternalAssetTransferIntroFragment.Args(((InternalAssetTransfer) companion.getExtras((Activity) this)).getSource())));
            }
        }
        BaseActivity.collectDuxoState$default(this, null, new C189722(null), 1, null);
    }

    /* compiled from: InternalAssetTransferActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.InternalAssetTransferActivity$onCreate$2", m3645f = "InternalAssetTransferActivity.kt", m3646l = {111}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.InternalAssetTransferActivity$onCreate$2 */
    static final class C189722 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C189722(Continuation<? super C189722> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternalAssetTransferActivity.this.new C189722(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C189722) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: InternalAssetTransferActivity.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.internalassettransfers.InternalAssetTransferActivity$onCreate$2$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<Event<InternalAssetTransferEvent>, Continuation<? super Unit>, Object>, ContinuationImpl6 {
            AnonymousClass1(Object obj) {
                super(2, obj, InternalAssetTransferActivity.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Event<InternalAssetTransferEvent> event, Continuation<? super Unit> continuation) {
                return C189722.invokeSuspend$handleEvent((InternalAssetTransferActivity) this.receiver, event, continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(InternalAssetTransferActivity.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(InternalAssetTransferActivity.this);
                this.label = 1;
                if (FlowKt.collectLatest(flowFilterNotNull, anonymousClass1, this) == coroutine_suspended) {
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
        public static final /* synthetic */ Object invokeSuspend$handleEvent(InternalAssetTransferActivity internalAssetTransferActivity, Event event, Continuation continuation) {
            internalAssetTransferActivity.handleEvent(event);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.internalassettransfers.intro.InternalAssetTransferIntroFragment.Callbacks
    public void onContinueClicked() {
        AccountSelectionFragment.Companion companion = AccountSelectionFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        String source = ((InternalAssetTransfer) companion2.getExtras((Activity) this)).getSource();
        BrokerageAccountType accountTypeFilter = ((InternalAssetTransfer) companion2.getExtras((Activity) this)).getAccountTypeFilter();
        InternalAssetTransfer.PreselectedAccounts preselectedAccounts = ((InternalAssetTransfer) companion2.getExtras((Activity) this)).getPreselectedAccounts();
        replaceFragment(companion.newInstance((Parcelable) new AccountSelectionFragment.Args(source, accountTypeFilter, preselectedAccounts != null ? preselectedAccounts.getSinkRhsAccountNumber() : null)));
    }

    @Override // com.robinhood.android.internalassettransfers.intro.InternalAssetTransferIntroFragment.Callbacks
    public void onClearAccountSelections() {
        getDuxo().clearAccountSelection();
    }

    @Override // com.robinhood.android.internalassettransfers.accountselection.AccountSelectionCallbacks
    public void onRowClicked(AccountSelectionListFragment.AccountSelectionType selectionType, List<AccountSelectionListFragment.Args.AccountSelectionOption> options) {
        Intrinsics.checkNotNullParameter(selectionType, "selectionType");
        Intrinsics.checkNotNullParameter(options, "options");
        AccountSelectionListFragment accountSelectionListFragment = (AccountSelectionListFragment) AccountSelectionListFragment.INSTANCE.newInstance((Parcelable) new AccountSelectionListFragment.Args(selectionType, options, ((InternalAssetTransfer) INSTANCE.getExtras((Activity) this)).getSource()));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        accountSelectionListFragment.show(supportFragmentManager, "account-selection-list");
    }

    @Override // com.robinhood.android.internalassettransfers.accountselection.AccountSelectionCallbacks
    public void onAccountsSelected(UiIatAccount source, UiIatAccount sink, EligibleAssets sourceEligibleAssets) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(sourceEligibleAssets, "sourceEligibleAssets");
        getDuxo().setAccountSelection(source, sink);
        getDuxo().setSourceEligibleAssets(sourceEligibleAssets);
        getDuxo().navigateToTransferTypeSelectionOrAgreementsScreen();
    }

    @Override // com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListFragment.SelectSourceSinkAccountCallbacks
    public void onAccountSelected(AccountSelectionListFragment.AccountSelectionType selectionType, String rhsAccountNumber) {
        Intrinsics.checkNotNullParameter(selectionType, "selectionType");
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        getDuxo().selectAccount(selectionType, rhsAccountNumber);
    }

    @Override // com.robinhood.android.internalassettransfers.agreements.InternalAssetTransferAgreementFragment.Callbacks
    public void onAgreementSign() {
        getDuxo().navigateToReviewScreen();
    }

    @Override // com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewFragment.Callbacks
    public void onAssetsRowClick(UiAssets transferableAssets) {
        Intrinsics.checkNotNullParameter(transferableAssets, "transferableAssets");
        replaceFragment(InternalAssetTransferReviewAssetsFragment.INSTANCE.newInstance((Parcelable) new InternalAssetTransferReviewAssetsFragment.Args(transferableAssets, ((InternalAssetTransfer) INSTANCE.getExtras((Activity) this)).getSource(), false, 4, null)));
    }

    @Override // com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewFragment.Callbacks
    public void onInfoBannerClick(UiAssets nonTransferableAssets) {
        Intrinsics.checkNotNullParameter(nonTransferableAssets, "nonTransferableAssets");
        getDuxo().navigateToNonTransferableAssetList();
    }

    @Override // com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewFragment.Callbacks
    public void onSubmitButtonClick(String assetTransferUuid, UiIatAccount sinkAccount) {
        Intrinsics.checkNotNullParameter(assetTransferUuid, "assetTransferUuid");
        Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
        Companion companion = INSTANCE;
        replaceFragment(InternalAssetTransferConfirmationFragment.INSTANCE.newInstance((Parcelable) new InternalAssetTransferConfirmationFragment.Args(assetTransferUuid, sinkAccount, ((InternalAssetTransfer) companion.getExtras((Activity) this)).getSource(), ((InternalAssetTransfer) companion.getExtras((Activity) this)).getExitToSinkAccountDashboard())));
    }

    @Override // com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewFragment.Callbacks
    public void onEditTransferSelectionClick() {
        getDuxo().onPartialTransferSelected(true);
    }

    @Override // com.robinhood.android.internalassettransfers.confirmation.InternalAssetTransferConfirmationFragment.Callbacks
    public void onViewTransferDetails(String assetTransferUuid) {
        Intrinsics.checkNotNullParameter(assetTransferUuid, "assetTransferUuid");
        UUID uuidFromString = UUID.fromString(assetTransferUuid);
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        replaceFragment(InternalAssetTransferHistoryFragment.INSTANCE.newInstance((Parcelable) new InternalAssetTransferHistory(uuidFromString)));
    }

    @Override // com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionFragment.Callbacks
    public void onFullAssetTransfer() {
        getDuxo().onFullTransferSelected();
    }

    @Override // com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionFragment.Callbacks
    public void onPartialAssetTransfer() {
        getDuxo().onPartialTransferSelected(false);
    }

    @Override // com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment.Callbacks
    public void cashBalanceClicked() {
        getDuxo().navigateToCashBalanceScreen();
    }

    @Override // com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment.Callbacks
    public void clearAssetSelectionClicked(boolean isCashVisible, List<UUID> instrumentIds) {
        Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
        getDuxo().clearAssetSelection(isCashVisible, instrumentIds);
    }

    @Override // com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment.Callbacks
    public void selectAllClicked(boolean isCashVisible, List<UUID> instrumentIds) {
        Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
        getDuxo().selectAssets(isCashVisible, instrumentIds);
    }

    @Override // com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment.Callbacks
    public void cashBalanceSelected() {
        getDuxo().cashBalanceSelected();
    }

    @Override // com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment.Callbacks
    public void cashBalanceUnselected() {
        getDuxo().cashBalanceUnselected();
    }

    @Override // com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment.Callbacks
    public void selectedEquity(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        getDuxo().selectEquity(instrumentId);
    }

    @Override // com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment.Callbacks
    public void unselectEquity(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        getDuxo().unselectEquity(instrumentId);
    }

    @Override // com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment.Callbacks
    public void onInfoBannerLinkClicked() {
        getDuxo().navigateToNonTransferableAssetList();
    }

    @Override // com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment.Callbacks
    public void onEditEquity(EligibleAsset asset, ShareSelection sharesSelectedForTransfer) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(sharesSelectedForTransfer, "sharesSelectedForTransfer");
        replaceFragment(InternalAssetTransferEquityEditFragment.INSTANCE.newInstance((Parcelable) new InternalAssetTransferEquityEditFragment.Args(asset, sharesSelectedForTransfer)));
    }

    @Override // com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment.Callbacks
    public void completeSelection() {
        getDuxo().continueFromCustomSelection();
    }

    @Override // com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewFragment.Callbacks
    public void navigateToPreSubmissionWarnsScreen(List<PresubmissionChecksAlertSheet> alerts) {
        Intrinsics.checkNotNullParameter(alerts, "alerts");
        getDuxo().navigateToPreSubmissionWarnsScreen(alerts);
    }

    @Override // com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment.Callbacks
    public void navigateBackFromCustomSelectionScreenToReviewScreen() {
        popFragments(2);
        getDuxo().navigateToReviewScreen();
    }

    @Override // com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionFragment.Callbacks
    public void cashBalanceConfirmed(BigDecimal cash) {
        Intrinsics.checkNotNullParameter(cash, "cash");
        popLastFragment();
        getDuxo().cashBalanceConfirmed(cash);
    }

    @Override // com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditFragment.Callbacks
    public void onEquityEditComplete(UUID instrumentId, ShareSelection shareSelection) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(shareSelection, "shareSelection");
        popLastFragment();
        getDuxo().makeEquityShareSelection(instrumentId, shareSelection);
    }

    @Override // com.robinhood.android.internalassettransfers.preselect.LoadPreselectedAccountsCallbacks
    public void onPreselectedAccountsLoaded(UiIatAccount source, UiIatAccount sink, EligibleAssets sourceEligibleAssets) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(sourceEligibleAssets, "sourceEligibleAssets");
        getDuxo().setAccountSelection(source, sink);
        getDuxo().setSourceEligibleAssets(sourceEligibleAssets);
        setFragment(C11048R.id.fragment_container, InternalAssetTransferTypeSelectionFragment.INSTANCE.newInstance((Parcelable) new InternalAssetTransferTypeSelectionFragment.Args(((InternalAssetTransfer) INSTANCE.getExtras((Activity) this)).getSource(), sink, source, sourceEligibleAssets)));
    }

    @Override // com.robinhood.android.internalassettransfers.preselect.LoadPreselectedAccountsCallbacks
    public void onPreselectedAccountsIncompatible() {
        setAccountSelectionFragment();
    }

    @Override // com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarnFragment.Callbacks
    public void navigateToAgreementScreen() {
        getDuxo().navigateToAgreementsScreen();
    }

    private final void setAccountSelectionFragment() {
        int i = C11048R.id.fragment_container;
        AccountSelectionFragment.Companion companion = AccountSelectionFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        String source = ((InternalAssetTransfer) companion2.getExtras((Activity) this)).getSource();
        BrokerageAccountType accountTypeFilter = ((InternalAssetTransfer) companion2.getExtras((Activity) this)).getAccountTypeFilter();
        InternalAssetTransfer.PreselectedAccounts preselectedAccounts = ((InternalAssetTransfer) companion2.getExtras((Activity) this)).getPreselectedAccounts();
        setFragment(i, companion.newInstance((Parcelable) new AccountSelectionFragment.Args(source, accountTypeFilter, preselectedAccounts != null ? preselectedAccounts.getSinkRhsAccountNumber() : null)));
    }

    private final void prefetchLottieAssets() {
        LottieUrl.IAT_INTRO_DARK.prefetch(this);
        LottieUrl.IAT_CONFIRMATION_LIGHT.prefetch(this);
        LottieUrl.IAT_CONFIRMATION_DARK.prefetch(this);
    }

    /* compiled from: InternalAssetTransferActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/InternalAssetTransferActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/internalassettransfers/InternalAssetTransferActivity;", "Lcom/robinhood/android/assettransfers/contracts/InternalAssetTransfer;", "<init>", "()V", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<InternalAssetTransferActivity, InternalAssetTransfer> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public InternalAssetTransfer getExtras(InternalAssetTransferActivity internalAssetTransferActivity) {
            return (InternalAssetTransfer) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, internalAssetTransferActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, InternalAssetTransfer internalAssetTransfer) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, internalAssetTransfer);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, InternalAssetTransfer internalAssetTransfer) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, internalAssetTransfer);
        }
    }

    /* compiled from: InternalAssetTransferActivity.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/InternalAssetTransferActivity$InvestorProfileQuestionArgs;", "Landroid/os/Parcelable;", "productContext", "", "rhfAccountNumber", "questionKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProductContext", "()Ljava/lang/String;", "getRhfAccountNumber", "getQuestionKey", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InvestorProfileQuestionArgs implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<InvestorProfileQuestionArgs> CREATOR = new Creator();
        private final String productContext;
        private final String questionKey;
        private final String rhfAccountNumber;

        /* compiled from: InternalAssetTransferActivity.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InvestorProfileQuestionArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvestorProfileQuestionArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InvestorProfileQuestionArgs(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvestorProfileQuestionArgs[] newArray(int i) {
                return new InvestorProfileQuestionArgs[i];
            }
        }

        public static /* synthetic */ InvestorProfileQuestionArgs copy$default(InvestorProfileQuestionArgs investorProfileQuestionArgs, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = investorProfileQuestionArgs.productContext;
            }
            if ((i & 2) != 0) {
                str2 = investorProfileQuestionArgs.rhfAccountNumber;
            }
            if ((i & 4) != 0) {
                str3 = investorProfileQuestionArgs.questionKey;
            }
            return investorProfileQuestionArgs.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getProductContext() {
            return this.productContext;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRhfAccountNumber() {
            return this.rhfAccountNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final String getQuestionKey() {
            return this.questionKey;
        }

        public final InvestorProfileQuestionArgs copy(String productContext, String rhfAccountNumber, String questionKey) {
            Intrinsics.checkNotNullParameter(productContext, "productContext");
            Intrinsics.checkNotNullParameter(rhfAccountNumber, "rhfAccountNumber");
            Intrinsics.checkNotNullParameter(questionKey, "questionKey");
            return new InvestorProfileQuestionArgs(productContext, rhfAccountNumber, questionKey);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InvestorProfileQuestionArgs)) {
                return false;
            }
            InvestorProfileQuestionArgs investorProfileQuestionArgs = (InvestorProfileQuestionArgs) other;
            return Intrinsics.areEqual(this.productContext, investorProfileQuestionArgs.productContext) && Intrinsics.areEqual(this.rhfAccountNumber, investorProfileQuestionArgs.rhfAccountNumber) && Intrinsics.areEqual(this.questionKey, investorProfileQuestionArgs.questionKey);
        }

        public int hashCode() {
            return (((this.productContext.hashCode() * 31) + this.rhfAccountNumber.hashCode()) * 31) + this.questionKey.hashCode();
        }

        public String toString() {
            return "InvestorProfileQuestionArgs(productContext=" + this.productContext + ", rhfAccountNumber=" + this.rhfAccountNumber + ", questionKey=" + this.questionKey + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.productContext);
            dest.writeString(this.rhfAccountNumber);
            dest.writeString(this.questionKey);
        }

        public InvestorProfileQuestionArgs(String productContext, String rhfAccountNumber, String questionKey) {
            Intrinsics.checkNotNullParameter(productContext, "productContext");
            Intrinsics.checkNotNullParameter(rhfAccountNumber, "rhfAccountNumber");
            Intrinsics.checkNotNullParameter(questionKey, "questionKey");
            this.productContext = productContext;
            this.rhfAccountNumber = rhfAccountNumber;
            this.questionKey = questionKey;
        }

        public final String getProductContext() {
            return this.productContext;
        }

        public final String getRhfAccountNumber() {
            return this.rhfAccountNumber;
        }

        public final String getQuestionKey() {
            return this.questionKey;
        }
    }
}

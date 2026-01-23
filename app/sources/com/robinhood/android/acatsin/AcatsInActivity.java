package com.robinhood.android.acatsin;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.plaid.internal.EnumC7081g;
import com.plaid.link.OpenPlaidLink;
import com.plaid.link.Plaid;
import com.plaid.link.PlaidKotlinFunctionsKt;
import com.plaid.link.configuration.LinkLogLevel;
import com.plaid.link.configuration.LinkTokenConfiguration;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkResult;
import com.plaid.link.result.LinkSuccess;
import com.robinhood.android.acats.contracts.AcatsIn;
import com.robinhood.android.acats.plaid.AcatsPlaidContract;
import com.robinhood.android.acats.plaid.AcatsPlaidFragment;
import com.robinhood.android.acats.plaid.cannotcomplete.AcatsInCannotCompleteContract;
import com.robinhood.android.acats.plaid.partialsupport.AcatsInPlaidPartialTransferSupportedContract;
import com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferKey;
import com.robinhood.android.acatsin.AcatsInEvent;
import com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsContract;
import com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberContract;
import com.robinhood.android.acatsin.agreement.AcatsInAgreementContract;
import com.robinhood.android.acatsin.asset.AcatsInReviewAssetsContract;
import com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsContract;
import com.robinhood.android.acatsin.borrowingfee.BorrowingFeeBottomSheetFragment;
import com.robinhood.android.acatsin.borrowingfee.BorrowingFeeBottomSheetKey;
import com.robinhood.android.acatsin.borrowingfee.UiShortPositionFeeData;
import com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchContract;
import com.robinhood.android.acatsin.confirmation.AcatsInConfirmationContract;
import com.robinhood.android.acatsin.confirmeligible.AcatsInConfirmEligibleContract;
import com.robinhood.android.acatsin.confirmname.AcatsInConfirmAccountNameContract;
import com.robinhood.android.acatsin.consolidatedintro.AcatsInConsolidatedIntroContract;
import com.robinhood.android.acatsin.dtcentry.AcatsInDtcEntryContract;
import com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginContract;
import com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginFragment;
import com.robinhood.android.acatsin.enableoptions.AcatsInEnableOptionsContract;
import com.robinhood.android.acatsin.enableoptions.AcatsInEnableOptionsFragment;
import com.robinhood.android.acatsin.failedtransferbottomsheet.FailedTransferBottomSheet;
import com.robinhood.android.acatsin.failedtransferbottomsheet.FailedTransferBottomSheetKey;
import com.robinhood.android.acatsin.intro.AcatsInIntroContract;
import com.robinhood.android.acatsin.namechange.AcatsInNameChangeFragment;
import com.robinhood.android.acatsin.partials.AcatsInPartialTransferParentContract;
import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroContract;
import com.robinhood.android.acatsin.positionchecklist.alternate.AcatsInPositionChecklistImNotSureAlternateContract;
import com.robinhood.android.acatsin.positionchecklist.alternate.ineligible.AcatsInPositionChecklistIneligibleAlternateContract;
import com.robinhood.android.acatsin.submit.AcatsInSubmitContract;
import com.robinhood.android.acatsin.util.AcatsFlowStep;
import com.robinhood.android.acatsin.util.AcatsFlowStep2;
import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import com.robinhood.android.acatsin.util.Eithers;
import com.robinhood.android.acatsin.util.names.NamesOnAccount;
import com.robinhood.android.common.BuildConfig;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.p088ui.C11839R;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.databinding.ActivityFragmentContainerWithRdsLoadingViewBinding;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.history.contracts.DetailType;
import com.robinhood.android.history.contracts.LegacyDetailFragmentKey;
import com.robinhood.android.home.contracts.MainActivityIntentKey;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelection6;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.options.contracts.OptionOnboarding;
import com.robinhood.android.options.contracts.OptionOnboarding2;
import com.robinhood.android.options.contracts.OptionOnboarding4;
import com.robinhood.android.retirement.contracts.RetirementIntentKeys3;
import com.robinhood.android.retirement.contracts.RetirementMatchRateSelection;
import com.robinhood.android.serverclientcomponents.alert.ClientComponentAlertFragment;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.models.acats.p299db.bonfire.AccountContentItem;
import com.robinhood.models.acats.p299db.bonfire.AvailableAccount;
import com.robinhood.models.acats.p299db.p300ui.CapabilityStatus;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.AcatsTransferHubBottomSheetDetails;
import com.robinhood.models.api.bonfire.ApiAcatsAccountContentsResponse;
import com.robinhood.models.api.bonfire.ApiAvailableAccount;
import com.robinhood.models.api.bonfire.ApiAvailableDestinationsResponse;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.models.p355ui.UiSlipAgreements;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.Either;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import microgram.android.RemoteMicrogramApplication;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: AcatsInActivity.kt */
@Metadata(m3635d1 = {"\u0000Ê\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u009a\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u00112\u00020\u00122\u00020\u00132\u00020\u00142\u00020\u00152\u00020\u0016:\u0002\u009a\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u00108\u001a\u00020,H\u0016J\u0012\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0014J\b\u0010=\u001a\u00020:H\u0014J\b\u0010>\u001a\u00020:H\u0016J\b\u0010?\u001a\u00020:H\u0016J\u0018\u0010@\u001a\u00020:2\u0006\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u00020,H\u0016J\b\u0010C\u001a\u00020:H\u0016J\b\u0010D\u001a\u00020:H\u0016J\u0010\u0010E\u001a\u00020:2\u0006\u0010F\u001a\u00020GH\u0016J\b\u0010H\u001a\u00020:H\u0016J\u0010\u0010I\u001a\u00020:2\u0006\u0010J\u001a\u00020KH\u0016J\u0010\u0010L\u001a\u00020:2\u0006\u0010M\u001a\u00020NH\u0016J\u0010\u0010O\u001a\u00020:2\u0006\u0010P\u001a\u00020NH\u0016J\u0010\u0010Q\u001a\u00020:2\u0006\u0010R\u001a\u00020NH\u0016J\u0010\u0010S\u001a\u00020:2\u0006\u0010T\u001a\u00020UH\u0016J.\u0010V\u001a\u00020:2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020Y0X2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0X2\b\u0010\\\u001a\u0004\u0018\u00010NH\u0016J\u0016\u0010]\u001a\u00020:2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020N0XH\u0016J\b\u0010_\u001a\u00020:H\u0016J\b\u0010`\u001a\u00020:H\u0016J\u0018\u0010a\u001a\u00020:2\u0006\u0010b\u001a\u00020N2\u0006\u0010c\u001a\u00020dH\u0016J\u0010\u0010e\u001a\u00020:2\u0006\u0010f\u001a\u00020,H\u0016J\u0010\u0010g\u001a\u00020:2\u0006\u0010f\u001a\u00020,H\u0016J\b\u0010h\u001a\u00020:H\u0016J\b\u0010i\u001a\u00020:H\u0016J\b\u0010j\u001a\u00020:H\u0016J\u0016\u0010k\u001a\u00020:2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020m0XH\u0016J\u0018\u0010n\u001a\u00020:2\u000e\u0010o\u001a\n\u0012\u0004\u0012\u00020p\u0018\u00010XH\u0016J\b\u0010q\u001a\u00020:H\u0016J\u0010\u0010r\u001a\u00020:2\u0006\u0010s\u001a\u00020tH\u0002J\u0010\u0010u\u001a\u00020:2\u0006\u0010v\u001a\u00020wH\u0002J\u0016\u0010x\u001a\u00020:2\f\u0010y\u001a\b\u0012\u0004\u0012\u00020z0XH\u0002J\u001c\u0010{\u001a\u00020:2\u0012\u0010|\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020N0}H\u0016J\b\u0010~\u001a\u00020:H\u0016J\u0016\u0010\u007f\u001a\u00020:2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020m0XH\u0016J\u0013\u0010\u0080\u0001\u001a\u00020:2\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0016J\t\u0010\u0083\u0001\u001a\u00020:H\u0016J\u0013\u0010\u0084\u0001\u001a\u00020:2\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0016J\u0012\u0010\u0085\u0001\u001a\u00020:2\u0007\u0010\u0086\u0001\u001a\u00020,H\u0016J\u001d\u0010\u0087\u0001\u001a\u00020,2\u0007\u0010\u0088\u0001\u001a\u00020.2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010<H\u0016J\u0013\u0010\u008a\u0001\u001a\u00020,2\b\u0010\u008b\u0001\u001a\u00030\u008c\u0001H\u0016J'\u0010\u008d\u0001\u001a\u00020:2\u0007\u0010\u008e\u0001\u001a\u00020.2\u0007\u0010\u008f\u0001\u001a\u00020.2\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0091\u0001H\u0014J\t\u0010\u0092\u0001\u001a\u00020:H\u0016J#\u0010\u0093\u0001\u001a\u00030\u0094\u0001*\u00030\u0095\u00012\b\u0010\u0096\u0001\u001a\u00030\u0097\u00012\b\u0010\u0098\u0001\u001a\u00030\u0099\u0001H\u0002R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\u000e\u0010+\u001a\u00020,X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020100X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020,X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050100X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\b\u0012\u0004\u0012\u00020700X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u009b\u0001"}, m3636d2 = {"Lcom/robinhood/android/acatsin/AcatsInActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/acatsin/intro/AcatsInIntroContract$Callbacks;", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchContract$Callbacks;", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsContract$Callbacks;", "Lcom/robinhood/android/acatsin/dtcentry/AcatsInDtcEntryContract$Callbacks;", "Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberContract$Callbacks;", "Lcom/robinhood/android/acatsin/confirmname/AcatsInConfirmAccountNameContract$Callbacks;", "Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsContract$Callbacks;", "Lcom/robinhood/android/acats/plaid/partialsupport/AcatsInPlaidPartialTransferSupportedContract$Callbacks;", "Lcom/robinhood/android/acatsin/positionchecklist/alternate/AcatsInPositionChecklistImNotSureAlternateContract$Callbacks;", "Lcom/robinhood/android/acatsin/positionchecklist/alternate/ineligible/AcatsInPositionChecklistIneligibleAlternateContract$Callbacks;", "Lcom/robinhood/android/acatsin/confirmeligible/AcatsInConfirmEligibleContract$Callbacks;", "Lcom/robinhood/android/acatsin/enablemargin/AcatsInEnableMarginContract$Callbacks;", "Lcom/robinhood/android/acatsin/enableoptions/AcatsInEnableOptionsContract$Callbacks;", "Lcom/robinhood/android/acatsin/partials/AcatsInPartialTransferParentContract$Callbacks;", "Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementContract$Callbacks;", "Lcom/robinhood/android/acatsin/submit/AcatsInSubmitContract$Callbacks;", "Lcom/robinhood/android/acatsin/confirmation/AcatsInConfirmationContract$Callbacks;", "Lcom/robinhood/android/acats/plaid/cannotcomplete/AcatsInCannotCompleteContract$Callbacks;", "Lcom/robinhood/android/acatsin/plaidintro/AcatsInPlaidIntroContract$Callbacks;", "Lcom/robinhood/android/serverclientcomponents/alert/ClientComponentAlertFragment$Callbacks;", "Lcom/robinhood/android/acatsin/consolidatedintro/AcatsInConsolidatedIntroContract$Callbacks;", "<init>", "()V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "duxo", "Lcom/robinhood/android/acatsin/AcatsInDuxo;", "getDuxo", "()Lcom/robinhood/android/acatsin/AcatsInDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/common/ui/databinding/ActivityFragmentContainerWithRdsLoadingViewBinding;", "getBinding", "()Lcom/robinhood/android/common/ui/databinding/ActivityFragmentContainerWithRdsLoadingViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "shouldPromptForLockScreen", "", "flowNavigationEventCount", "", "matchRateSelectionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/android/retirement/contracts/RetirementMatchRateSelection;", "isOptionsUpgradeLaunched", "optionOnboardingLauncher", "Lcom/robinhood/android/options/contracts/OptionOnboarding;", "linkAccountToPlaid", "Lcom/plaid/link/configuration/LinkTokenConfiguration;", "requiresAuthentication", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onBackPressed", "onBackFromIntro", "onForwardFromIntro", "success", "bonusShown", "onBackFromIntroConsolidated", "onForwardFromIntroConsolidated", "onBrokerageSelected", "brokerage", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "onManualBrokerageEntrySelected", "onRhsAccountSelected", "account", "Lcom/robinhood/models/acats/db/bonfire/AvailableAccount;", "onDeeplinkSelected", "deeplink", "", "onDtcNumberEntered", "dtcNumber", "onAccountNumberEntered", "accountNumber", "onAccountNamesConfirmed", "accountNames", "Lcom/robinhood/android/acatsin/util/names/NamesOnAccount;", "onAccountContentsDeclared", "selectedContent", "", "Lcom/robinhood/models/acats/db/bonfire/AccountContentItem;", "supportedContentTypes", "Lcom/robinhood/models/api/bonfire/ApiAcatsAccountContentsResponse$SupportedContentType;", "buildPartialBannerContentfulId", "onAccountContentsUnsure", "unsupportedContents", "onFullTransferSelected", "onFullTransferReselected", "onEnableOptions", "rhsAccountNumber", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "onOptionsEnableResult", "isEnabled", "onMarginEnableResult", "onShowBorrowingFeeDetails", "onPlaidPartialTransferSelected", "onPartialTransferSelected", "onBuildPartialTransferComplete", "assets", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "onSlipAgreementsUpdated", "slipAgreements", "Lcom/robinhood/models/ui/UiSlipAgreements$Agreement;", "onAgreementAccepted", "handleEvent", "event", "Lcom/robinhood/android/acatsin/AcatsInEvent;", "showFailedTransferBottomSheet", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/models/api/bonfire/AcatsTransferHubBottomSheetDetails;", "showBorrowingFeeBottomSheet", "shortPositionFeeData", "Lcom/robinhood/android/acatsin/borrowingfee/UiShortPositionFeeData;", "showNameChangeFragment", "brokerageOrDtcNumber", "Lcom/robinhood/utils/Either;", "onIneligibleAlternateExit", "onAssetsClicked", "onAcatsSubmitted", "acatsTransferId", "Ljava/util/UUID;", "onConfirmationDoneClicked", "onViewDetailsClicked", "onAccountInfoMethodSelected", "isPlaid", "onPrimaryButtonClicked", "dialogId", "passthroughArgs", "onActionClicked", "button", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "onActivityResult", "requestCode", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "onComplete", "mapToFragment", "Landroidx/fragment/app/Fragment;", "Lcom/robinhood/android/acatsin/util/AcatsFlowStep;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "state", "Lcom/robinhood/android/acatsin/AcatsInDataState;", "Companion", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInActivity extends BaseActivity implements AcatsInIntroContract.Callbacks, AcatsInBrokerageSearchContract.Callbacks, AcatsInAvailableDestinationsContract.Callbacks, AcatsInDtcEntryContract.Callbacks, AcatsInAccountNumberContract.Callbacks, AcatsInConfirmAccountNameContract.Callbacks, AcatsInAccountContentsContract.Callbacks, AcatsInPlaidPartialTransferSupportedContract.Callbacks, AcatsInPositionChecklistImNotSureAlternateContract.Callbacks, AcatsInPositionChecklistIneligibleAlternateContract.Callbacks, AcatsInConfirmEligibleContract.Callbacks, AcatsInEnableMarginContract.Callbacks, AcatsInEnableOptionsContract.Callbacks, AcatsInPartialTransferParentContract.Callbacks, AcatsInAgreementContract.Callbacks, AcatsInSubmitContract.Callbacks, AcatsInConfirmationContract.Callbacks, AcatsInCannotCompleteContract.Callbacks, AcatsInPlaidIntroContract.Callbacks, ClientComponentAlertFragment.Callbacks, AcatsInConsolidatedIntroContract.Callbacks {
    public static final String INELIGIBLE_DIALOG_ID = "cant_acats";
    private static final int REQUEST_SUITABILITY = 1;
    private int flowNavigationEventCount;
    private boolean isOptionsUpgradeLaunched;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsInActivity.class, "binding", "getBinding()Lcom/robinhood/android/common/ui/databinding/ActivityFragmentContainerWithRdsLoadingViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, AcatsInDuxo.class);

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding = ViewBinding5.viewBinding(this, AcatsInActivity2.INSTANCE);
    private boolean shouldPromptForLockScreen = true;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<RetirementMatchRateSelection>> matchRateSelectionLauncher = registerForActivityResult(new RetirementIntentKeys3(new Function0() { // from class: com.robinhood.android.acatsin.AcatsInActivity$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f$0.getNavigator();
        }
    }), new ActivityResultCallback() { // from class: com.robinhood.android.acatsin.AcatsInActivity$matchRateSelectionLauncher$2
        @Override // androidx.view.result.ActivityResultCallback
        public final void onActivityResult(RetirementIntentKeys3.Result result) {
            if (result instanceof RetirementIntentKeys3.Result.Success) {
                this.this$0.getDuxo().matchRateSelected();
            } else {
                if (!(result instanceof RetirementIntentKeys3.Result.Canceled) && result != null) {
                    throw new NoWhenBranchMatchedException();
                }
                this.this$0.onBackPressed();
            }
        }
    });
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<OptionOnboarding>> optionOnboardingLauncher = registerForActivityResult(new OptionOnboarding4(new Function0() { // from class: com.robinhood.android.acatsin.AcatsInActivity$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f$0.getNavigator();
        }
    }), new ActivityResultCallback() { // from class: com.robinhood.android.acatsin.AcatsInActivity$optionOnboardingLauncher$2
        @Override // androidx.view.result.ActivityResultCallback
        public final void onActivityResult(OptionOnboarding4.Result result) {
            if (Intrinsics.areEqual(result, OptionOnboarding4.Result.Success.INSTANCE)) {
                if (this.this$0.isOptionsUpgradeLaunched) {
                    this.this$0.onOptionsEnableResult(true);
                }
            } else if (Intrinsics.areEqual(result, OptionOnboarding4.Result.Failure.INSTANCE)) {
                this.this$0.onOptionsEnableResult(false);
            } else if (!Intrinsics.areEqual(result, OptionOnboarding4.Result.Canceled.INSTANCE) && result != null) {
                throw new NoWhenBranchMatchedException();
            }
        }
    });
    private final ActivityResultLauncher<LinkTokenConfiguration> linkAccountToPlaid = registerForActivityResult(new OpenPlaidLink(), new ActivityResultCallback() { // from class: com.robinhood.android.acatsin.AcatsInActivity$linkAccountToPlaid$1
        @Override // androidx.view.result.ActivityResultCallback
        public final void onActivityResult(LinkResult it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it instanceof LinkSuccess) {
                this.this$0.getDuxo().onPlaidLinkSuccess((LinkSuccess) it);
            } else if (it instanceof LinkExit) {
                this.this$0.getDuxo().onPlaidLinkExit((LinkExit) it);
            }
        }
    });

    /* compiled from: AcatsInActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AcatsFlowStep.values().length];
            try {
                iArr[AcatsFlowStep.INTRO_SWIPIES_BONUS_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AcatsFlowStep.INTRO_SWIPIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AcatsFlowStep.INTRO_CONSOLIDATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AcatsFlowStep.BROKERAGE_SEARCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AcatsFlowStep.MANUAL_BROKERAGE_ENTRY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AcatsFlowStep.AVAILABLE_DESTINATIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AcatsFlowStep.PLAID_INTRO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AcatsFlowStep.PLAID_ACCOUNT_NUMBER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AcatsFlowStep.ENTER_ACCOUNT_NUMBER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AcatsFlowStep.CONFIRM_ACCOUNT_NAME.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AcatsFlowStep.ACCOUNT_CONTENTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AcatsFlowStep.PLAID_PARTIAL_TRANSFER_SUPPORTED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[AcatsFlowStep.POSITION_CHECKLIST_INELIGIBLE_ALTERNATE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[AcatsFlowStep.POSITION_CHECKLIST_NOT_SURE_ALTERNATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[AcatsFlowStep.CONFIRM_ELIGIBLE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[AcatsFlowStep.RECONFIRM_ELIGIBLE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[AcatsFlowStep.ENABLE_MARGIN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[AcatsFlowStep.ENABLE_OPTIONS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[AcatsFlowStep.PARTIAL_TRANSFER_FLOW.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[AcatsFlowStep.PLAID_PARTIAL_TRANSFER_EDIT.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[AcatsFlowStep.AGREEMENT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[AcatsFlowStep.REVIEW_AND_SUBMIT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[AcatsFlowStep.CANNOT_COMPLETE_CONFIRMATION.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[AcatsFlowStep.CONFIRMATION.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.acatsin.agreement.AcatsInAgreementContract.Callbacks
    public AcatsInAgreementContract.Key buildAgreementContract(String str, AcatsInScreenContext acatsInScreenContext, Either<ApiBrokerage, String> either, boolean z, AcatsFlowStep2 acatsFlowStep2, UUID uuid) {
        return AcatsInAgreementContract.Callbacks.DefaultImpls.buildAgreementContract(this, str, acatsInScreenContext, either, z, acatsFlowStep2, uuid);
    }

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AcatsInDuxo getDuxo() {
        return (AcatsInDuxo) this.duxo.getValue();
    }

    private final ActivityFragmentContainerWithRdsLoadingViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ActivityFragmentContainerWithRdsLoadingViewBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    /* renamed from: requiresAuthentication, reason: from getter */
    public boolean getShouldPromptForLockScreen() {
        return this.shouldPromptForLockScreen;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        this.shouldPromptForLockScreen = savedInstanceState == null;
        super.onCreate(savedInstanceState);
        setContentView(C11839R.layout.activity_fragment_container_with_rds_loading_view);
        popEntireFragmentBackstack();
        BaseActivity.collectDuxoState$default(this, null, new C76891(null), 1, null);
        ShimmerLoadingView rdsLoadingView = getBinding().rdsLoadingView;
        Intrinsics.checkNotNullExpressionValue(rdsLoadingView, "rdsLoadingView");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(rdsLoadingView, InsetSides.INSTANCE.m26683getTopXedK2Rk());
        getBinding().rdsLoadingView.show();
        Plaid.setLinkEventListener(new Function1() { // from class: com.robinhood.android.acatsin.AcatsInActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInActivity.onCreate$lambda$2(this.f$0, (LinkEvent) obj);
            }
        });
    }

    /* compiled from: AcatsInActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInActivity$onCreate$1", m3645f = "AcatsInActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.AcatsInActivity$onCreate$1 */
    static final class C76891 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C76891(Continuation<? super C76891> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInActivity.this.new C76891(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C76891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<AcatsInEvent>> eventFlow = AcatsInActivity.this.getDuxo().getEventFlow();
                final AcatsInActivity acatsInActivity = AcatsInActivity.this;
                FlowCollector<? super Event<AcatsInEvent>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.acatsin.AcatsInActivity.onCreate.1.1
                    public final Object emit(final Event<AcatsInEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<AcatsInEvent> eventConsumerInvoke;
                        if (event != null) {
                            final AcatsInActivity acatsInActivity2 = acatsInActivity;
                            if ((event.getData() instanceof AcatsInEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.acatsin.AcatsInActivity$onCreate$1$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m10678invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m10678invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        acatsInActivity2.handleEvent((AcatsInEvent) event.getData());
                                    }
                                });
                            }
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<AcatsInEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }
                };
                this.label = 1;
                if (eventFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(AcatsInActivity acatsInActivity, LinkEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        acatsInActivity.getDuxo().handlePlaidLinkEvent(it);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        Plaid.clearLinkEventListener();
        super.onDestroy();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.flowNavigationEventCount > 1 && getSupportFragmentManager().getBackStackEntryCount() == 1) {
            getUserLeapManager().setPendingSurvey(Survey.ACATS_IN_ABANDONED_FLOW);
        }
        super.onBackPressed();
    }

    @Override // com.robinhood.android.acatsin.intro.AcatsInIntroContract.Callbacks
    public void onBackFromIntro() {
        finish();
    }

    @Override // com.robinhood.android.acatsin.intro.AcatsInIntroContract.Callbacks
    public void onForwardFromIntro(boolean success, boolean bonusShown) {
        if (success) {
            getDuxo().setIntroShown();
        }
        getDuxo().completeStepForPromo(AcatsFlowStep.INTRO_SWIPIES);
    }

    @Override // com.robinhood.android.acatsin.consolidatedintro.AcatsInConsolidatedIntroContract.Callbacks
    public void onBackFromIntroConsolidated() {
        finish();
    }

    @Override // com.robinhood.android.acatsin.consolidatedintro.AcatsInConsolidatedIntroContract.Callbacks
    public void onForwardFromIntroConsolidated() {
        getDuxo().setIntroShown();
        getDuxo().completeStepForPromo(AcatsFlowStep.INTRO_CONSOLIDATED);
    }

    @Override // com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchContract.Callbacks
    public void onBrokerageSelected(ApiBrokerage brokerage) {
        Intrinsics.checkNotNullParameter(brokerage, "brokerage");
        getDuxo().onBrokerageSelected(brokerage);
    }

    @Override // com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchContract.Callbacks
    public void onManualBrokerageEntrySelected() {
        getDuxo().onManualBrokerageEntrySelected();
    }

    @Override // com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsContract.Callbacks
    public void onRhsAccountSelected(AvailableAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        getDuxo().onRhsAccountSelected(account);
        getDuxo().completeStepForPromo(AcatsFlowStep.AVAILABLE_DESTINATIONS);
    }

    @Override // com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsContract.Callbacks
    public void onDeeplinkSelected(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Navigator.DefaultImpls.handleDeepLink$default(getNavigator(), this, Uri.parse(deeplink), null, null, false, null, 60, null);
    }

    @Override // com.robinhood.android.acatsin.dtcentry.AcatsInDtcEntryContract.Callbacks
    public void onDtcNumberEntered(String dtcNumber) {
        Intrinsics.checkNotNullParameter(dtcNumber, "dtcNumber");
        getDuxo().onDtcNumberEntered(dtcNumber);
        getDuxo().completeStep(AcatsFlowStep.MANUAL_BROKERAGE_ENTRY);
    }

    @Override // com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberContract.Callbacks
    public void onAccountNumberEntered(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        getDuxo().onAccountNumberEntered(accountNumber);
        getDuxo().completeStep(AcatsFlowStep.ENTER_ACCOUNT_NUMBER);
    }

    @Override // com.robinhood.android.acatsin.confirmname.AcatsInConfirmAccountNameContract.Callbacks
    public void onAccountNamesConfirmed(NamesOnAccount accountNames) {
        Intrinsics.checkNotNullParameter(accountNames, "accountNames");
        getDuxo().onAccountNameConfirmed(accountNames);
        getDuxo().completeStep(AcatsFlowStep.CONFIRM_ACCOUNT_NAME);
    }

    @Override // com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsContract.Callbacks
    public void onAccountContentsDeclared(List<AccountContentItem> selectedContent, List<? extends ApiAcatsAccountContentsResponse.SupportedContentType> supportedContentTypes, String buildPartialBannerContentfulId) {
        Intrinsics.checkNotNullParameter(selectedContent, "selectedContent");
        Intrinsics.checkNotNullParameter(supportedContentTypes, "supportedContentTypes");
        getDuxo().onAccountContentsDeclared(selectedContent, supportedContentTypes, buildPartialBannerContentfulId);
        getDuxo().completeStep(AcatsFlowStep.ACCOUNT_CONTENTS);
    }

    @Override // com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsContract.Callbacks
    public void onAccountContentsUnsure(List<String> unsupportedContents) {
        Intrinsics.checkNotNullParameter(unsupportedContents, "unsupportedContents");
        getDuxo().setUnsupportedAccountContents(unsupportedContents);
        getDuxo().showAlternate(AcatsFlowStep.POSITION_CHECKLIST_NOT_SURE_ALTERNATE);
    }

    @Override // com.robinhood.android.acatsin.positionchecklist.alternate.AcatsInPositionChecklistImNotSureAlternateContract.Callbacks, com.robinhood.android.acatsin.confirmeligible.AcatsInConfirmEligibleContract.Callbacks
    public void onFullTransferSelected() {
        getDuxo().onFullTransferSelected();
    }

    @Override // com.robinhood.android.acatsin.confirmeligible.AcatsInConfirmEligibleContract.Callbacks
    public void onFullTransferReselected() {
        getDuxo().completeStep(AcatsFlowStep.RECONFIRM_ELIGIBLE);
    }

    @Override // com.robinhood.android.acatsin.enableoptions.AcatsInEnableOptionsContract.Callbacks
    public void onEnableOptions(String rhsAccountNumber, BrokerageAccountType brokerageAccountType) {
        String str;
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        this.isOptionsUpgradeLaunched = true;
        if (brokerageAccountType == BrokerageAccountType.JOINT_TENANCY_WITH_ROS) {
            str = OptionOnboarding.OptionOnboardingSource.Legacy.SOURCE_ACATS_JOINT_ACCOUNT;
        } else {
            str = OptionOnboarding.OptionOnboardingSource.Legacy.SOURCE_ACATS;
        }
        NavigationActivityResultContract3.launch$default(this.optionOnboardingLauncher, new OptionOnboarding(new OptionOnboarding2.AccountNumber(rhsAccountNumber), new OptionOnboarding.OptionOnboardingSource.Legacy(str), null, 4, null), null, false, 6, null);
    }

    @Override // com.robinhood.android.acatsin.enableoptions.AcatsInEnableOptionsContract.Callbacks
    public void onOptionsEnableResult(boolean isEnabled) {
        getDuxo().onOptionsEnableResult(isEnabled);
    }

    @Override // com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginContract.Callbacks
    public void onMarginEnableResult(boolean isEnabled) {
        getDuxo().onMarginEnableResult(isEnabled);
    }

    @Override // com.robinhood.android.acats.plaid.partialsupport.AcatsInPlaidPartialTransferSupportedContract.Callbacks, com.robinhood.android.acatsin.confirmeligible.AcatsInConfirmEligibleContract.Callbacks
    public void onShowBorrowingFeeDetails() {
        getDuxo().showBorrowingFeeBottomSheet();
    }

    @Override // com.robinhood.android.acats.plaid.partialsupport.AcatsInPlaidPartialTransferSupportedContract.Callbacks, com.robinhood.android.acatsin.confirmeligible.AcatsInConfirmEligibleContract.Callbacks
    public void onPlaidPartialTransferSelected() {
        getDuxo().completeStep(AcatsFlowStep.PLAID_PARTIAL_TRANSFER_SUPPORTED);
    }

    @Override // com.robinhood.android.acatsin.positionchecklist.alternate.AcatsInPositionChecklistImNotSureAlternateContract.Callbacks, com.robinhood.android.acatsin.positionchecklist.alternate.ineligible.AcatsInPositionChecklistIneligibleAlternateContract.Callbacks, com.robinhood.android.acatsin.confirmeligible.AcatsInConfirmEligibleContract.Callbacks
    public void onPartialTransferSelected() {
        getDuxo().showAlternate(AcatsFlowStep.PARTIAL_TRANSFER_FLOW);
    }

    @Override // com.robinhood.android.acatsin.partials.AcatsInPartialTransferParentContract.Callbacks
    public void onBuildPartialTransferComplete(List<? extends UiAcatsAsset> assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        getDuxo().onBuildPartialTransferComplete(assets);
    }

    @Override // com.robinhood.android.acatsin.agreement.AcatsInAgreementContract.Callbacks
    public void onSlipAgreementsUpdated(List<UiSlipAgreements.Agreement> slipAgreements) {
        getDuxo().setSlipAgreements(slipAgreements);
    }

    @Override // com.robinhood.android.acatsin.agreement.AcatsInAgreementContract.Callbacks
    public void onAgreementAccepted() {
        getDuxo().completeStep(AcatsFlowStep.AGREEMENT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(AcatsInEvent event) {
        Function1 c76871;
        String promoId;
        if (Intrinsics.areEqual(event, AcatsInEvent.FlowCompleteEvent.INSTANCE)) {
            finish();
            return;
        }
        if (event instanceof AcatsInEvent.FlowNavigationEvent) {
            AcatsInEvent.FlowNavigationEvent flowNavigationEvent = (AcatsInEvent.FlowNavigationEvent) event;
            if (flowNavigationEvent.getFlowStep() == AcatsFlowStep.CONFIRMATION && flowNavigationEvent.getDataState().isPersonalizedPromo() && (promoId = flowNavigationEvent.getDataState().getPromoId()) != null && promoId.length() != 0 && !flowNavigationEvent.getDataState().getRequiresCoOwnerSignature()) {
                startActivity(Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), this, new MicrogramRouterFragmentKey(new RemoteMicrogramApplication("app-promo-education", null, 2, null), "robinhood://promo-education?promotion_name=" + flowNavigationEvent.getDataState().getPromoId() + "&layout_context=confirmation", null, null, null, 28, null), false, false, false, null, false, true, false, false, false, null, false, 8052, null));
                finish();
                return;
            }
            this.flowNavigationEventCount++;
            Fragment fragmentMapToFragment = mapToFragment(flowNavigationEvent.getFlowStep(), getNavigator(), flowNavigationEvent.getDataState());
            if ((getCurrentFragment() instanceof AcatsPlaidFragment) || (((getCurrentFragment() instanceof AcatsInEnableOptionsFragment) && flowNavigationEvent.getDataState().getOptionsCapabilityStatus() == CapabilityStatus.ENABLED) || ((getCurrentFragment() instanceof AcatsInEnableMarginFragment) && flowNavigationEvent.getDataState().getMarginCapabilityStatus() == CapabilityStatus.ENABLED))) {
                c76871 = new C76871(this);
            } else {
                c76871 = new C76882(this);
            }
            c76871.invoke(fragmentMapToFragment);
            getBinding().rdsLoadingView.hide();
            this.shouldPromptForLockScreen = flowNavigationEvent.getShouldPromptForLockScreen();
            return;
        }
        if (event instanceof AcatsInEvent.MatchRateSelectionEvent) {
            NavigationActivityResultContract3.launch$default(this.matchRateSelectionLauncher, new RetirementMatchRateSelection(ApiMatchRateSelection6.ACATS), null, false, 6, null);
            return;
        }
        if (event instanceof AcatsInEvent.OpenPromoFlow) {
            AcatsInEvent.OpenPromoFlow openPromoFlow = (AcatsInEvent.OpenPromoFlow) event;
            startActivity(Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), this, new MicrogramRouterFragmentKey(new RemoteMicrogramApplication("app-acats-promo", null, 2, null), openPromoFlow.getDeeplink(), null, null, null, 28, null), false, false, false, null, false, true, false, false, false, null, false, 8052, null));
            if (openPromoFlow.getShouldFinishActivity()) {
                finish();
                return;
            }
            return;
        }
        if (event instanceof AcatsInEvent.ShowFailedTransferBottomSheet) {
            showFailedTransferBottomSheet(((AcatsInEvent.ShowFailedTransferBottomSheet) event).getDetails());
        } else {
            if (!(event instanceof AcatsInEvent.ShowBorrowingFeeBottomSheet)) {
                throw new NoWhenBranchMatchedException();
            }
            showBorrowingFeeBottomSheet(extensions2.toImmutableList(((AcatsInEvent.ShowBorrowingFeeBottomSheet) event).getShortPositionsWithFees()));
        }
    }

    /* compiled from: AcatsInActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.acatsin.AcatsInActivity$handleEvent$1 */
    /* synthetic */ class C76871 extends FunctionReferenceImpl implements Function1<Fragment, Integer> {
        C76871(Object obj) {
            super(1, obj, AcatsInActivity.class, "replaceFragmentWithoutBackStack", "replaceFragmentWithoutBackStack(Landroidx/fragment/app/Fragment;)I", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Fragment p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return Integer.valueOf(((AcatsInActivity) this.receiver).replaceFragmentWithoutBackStack(p0));
        }
    }

    /* compiled from: AcatsInActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.acatsin.AcatsInActivity$handleEvent$2 */
    /* synthetic */ class C76882 extends FunctionReferenceImpl implements Function1<Fragment, Integer> {
        C76882(Object obj) {
            super(1, obj, AcatsInActivity.class, "replaceFragment", "replaceFragment(Landroidx/fragment/app/Fragment;)I", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Fragment p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return Integer.valueOf(((AcatsInActivity) this.receiver).replaceFragment(p0));
        }
    }

    private final void showFailedTransferBottomSheet(AcatsTransferHubBottomSheetDetails details) {
        if (getSupportFragmentManager().findFragmentByTag(FailedTransferBottomSheet.DIALOG_TAG) != null) {
            return;
        }
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new FailedTransferBottomSheetKey(details), null, 2, null).show(getSupportFragmentManager(), FailedTransferBottomSheet.DIALOG_TAG);
    }

    private final void showBorrowingFeeBottomSheet(List<UiShortPositionFeeData> shortPositionFeeData) {
        if (getSupportFragmentManager().findFragmentByTag(BorrowingFeeBottomSheetFragment.DIALOG_TAG) != null) {
            return;
        }
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new BorrowingFeeBottomSheetKey(extensions2.toImmutableList(shortPositionFeeData)), null, 2, null).show(getSupportFragmentManager(), BorrowingFeeBottomSheetFragment.DIALOG_TAG);
    }

    @Override // com.robinhood.android.acatsin.confirmname.AcatsInConfirmAccountNameContract.Callbacks
    public void showNameChangeFragment(Either<ApiBrokerage, String> brokerageOrDtcNumber) {
        Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
        replaceFragment(AcatsInNameChangeFragment.INSTANCE.newInstance((Parcelable) new AcatsInNameChangeFragment.Args(brokerageOrDtcNumber)));
    }

    @Override // com.robinhood.android.acatsin.positionchecklist.alternate.ineligible.AcatsInPositionChecklistIneligibleAlternateContract.Callbacks
    public void onIneligibleAlternateExit() {
        finish();
    }

    @Override // com.robinhood.android.acatsin.submit.AcatsInSubmitContract.Callbacks
    public void onAssetsClicked(List<? extends UiAcatsAsset> assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new AcatsInReviewAssetsContract.Key(assets, false, null, null, null, null, 62, null), null, 2, null));
    }

    @Override // com.robinhood.android.acatsin.submit.AcatsInSubmitContract.Callbacks
    public void onAcatsSubmitted(UUID acatsTransferId) {
        Intrinsics.checkNotNullParameter(acatsTransferId, "acatsTransferId");
        getDuxo().onAcatsSubmitted(acatsTransferId);
    }

    @Override // com.robinhood.android.acatsin.confirmation.AcatsInConfirmationContract.Callbacks
    public void onConfirmationDoneClicked() {
        startActivity(Navigator.DefaultImpls.createIntent$default(getNavigator(), this, MainActivityIntentKey.INSTANCE, null, true, 4, null));
        finish();
    }

    @Override // com.robinhood.android.acatsin.confirmation.AcatsInConfirmationContract.Callbacks
    public void onViewDetailsClicked(UUID acatsTransferId) {
        Intrinsics.checkNotNullParameter(acatsTransferId, "acatsTransferId");
        finish();
        startActivity(Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), this, LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.ACATS_TRANSFER, acatsTransferId, null, false, 12, null), false, false, false, null, false, false, false, false, false, null, false, 8188, null));
    }

    @Override // com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroContract.Callbacks
    public void onAccountInfoMethodSelected(boolean isPlaid) {
        getDuxo().onInfoEntryMethodSelected(isPlaid);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
    public boolean onPrimaryButtonClicked(int dialogId, Bundle passthroughArgs) {
        if (dialogId == C7725R.id.dialog_id_cant_acats_restricted || dialogId == C7725R.id.dialog_id_cant_acats_control_person) {
            finish();
            return true;
        }
        return super.onPrimaryButtonClicked(dialogId, passthroughArgs);
    }

    @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
    public boolean onActionClicked(ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag(INELIGIBLE_DIALOG_ID);
        if (fragmentFindFragmentByTag != null) {
            BaseDialogFragment baseDialogFragment = fragmentFindFragmentByTag instanceof BaseDialogFragment ? (BaseDialogFragment) fragmentFindFragmentByTag : null;
            if (baseDialogFragment != null) {
                baseDialogFragment.dismiss();
            }
        }
        GenericAction typedAction = button.getTypedAction();
        if (typedAction instanceof GenericAction.DeeplinkAction) {
            return Navigator.DefaultImpls.handleDeepLink$default(getNavigator(), this, ((GenericAction.DeeplinkAction) typedAction).getUri(), null, null, false, null, 44, null);
        }
        if (!(typedAction instanceof GenericAction.DismissAction)) {
            return false;
        }
        onBackPressed();
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != 1 || resultCode == -1) {
            return;
        }
        finish();
    }

    @Override // com.robinhood.android.acats.plaid.cannotcomplete.AcatsInCannotCompleteContract.Callbacks
    public void onComplete() {
        getDuxo().completeStep(AcatsFlowStep.CANNOT_COMPLETE_CONFIRMATION);
    }

    /* compiled from: AcatsInActivity.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/acatsin/AcatsInActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/acatsin/AcatsInActivity;", "Lcom/robinhood/android/acats/contracts/AcatsIn;", "<init>", "()V", "REQUEST_SUITABILITY", "", "INELIGIBLE_DIALOG_ID", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<AcatsInActivity, AcatsIn> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public AcatsIn getExtras(AcatsInActivity acatsInActivity) {
            return (AcatsIn) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, acatsInActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, AcatsIn acatsIn) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, acatsIn);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, AcatsIn acatsIn) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, acatsIn);
        }
    }

    private final Fragment mapToFragment(AcatsFlowStep acatsFlowStep, Navigator navigator, AcatsInDataState acatsInDataState) {
        List<ApiAvailableAccount> available_accounts;
        List<ApiAvailableAccount> available_accounts2;
        List<ApiAvailableAccount> available_accounts3;
        List<ApiAvailableAccount> available_accounts4;
        boolean z = true;
        int size = 0;
        switch (WhenMappings.$EnumSwitchMapping$0[acatsFlowStep.ordinal()]) {
            case 1:
                return Navigator.DefaultImpls.createFragment$default(navigator, new AcatsInIntroContract.Key(acatsInDataState.getScreenContext(), true, acatsInDataState.getAcatsBonusPromoInfo()), null, 2, null);
            case 2:
                return Navigator.DefaultImpls.createFragment$default(navigator, new AcatsInIntroContract.Key(acatsInDataState.getScreenContext(), false, acatsInDataState.getAcatsBonusPromoInfo()), null, 2, null);
            case 3:
                return Navigator.DefaultImpls.createFragment$default(navigator, new AcatsInConsolidatedIntroContract.Key(acatsInDataState.getScreenContext()), null, 2, null);
            case 4:
                AvailableAccount rhsAccount = acatsInDataState.getRhsAccount();
                if (rhsAccount == null) {
                    ApiAvailableDestinationsResponse availableDestinations = acatsInDataState.getAvailableDestinations();
                    if (availableDestinations != null && (available_accounts = availableDestinations.getAvailable_accounts()) != null) {
                        size = available_accounts.size();
                    }
                    throw new IllegalStateException(("can't advance acats flow without a selected RHS account. State has " + size + " accounts.").toString());
                }
                AcatsInScreenContext screenContext = acatsInDataState.getScreenContext();
                if (acatsInDataState.getDefaultRhsAccount() == null && !acatsInDataState.isAccountPreselected()) {
                    z = false;
                }
                return Navigator.DefaultImpls.createFragment$default(navigator, new AcatsInBrokerageSearchContract.Key(screenContext, z, rhsAccount.getRhsAccountNumber()), null, 2, null);
            case 5:
                return Navigator.DefaultImpls.createFragment$default(navigator, new AcatsInDtcEntryContract.Key(acatsInDataState.getScreenContext()), null, 2, null);
            case 6:
                return Navigator.DefaultImpls.createFragment$default(navigator, new AcatsInAvailableDestinationsContract.Key(acatsInDataState.getScreenContext(), false, 2, null), null, 2, null);
            case 7:
                return Navigator.DefaultImpls.createFragment$default(navigator, new AcatsInPlaidIntroContract.Key(acatsInDataState.getScreenContext()), null, 2, null);
            case 8:
                final String plaidLinkToken = acatsInDataState.getPlaidLinkToken();
                if (plaidLinkToken != null) {
                    this.linkAccountToPlaid.launch(PlaidKotlinFunctionsKt.linkTokenConfiguration(new Function1() { // from class: com.robinhood.android.acatsin.AcatsInActivity$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AcatsInActivity.mapToFragment$lambda$6$lambda$5(plaidLinkToken, (LinkTokenConfiguration.Builder) obj);
                        }
                    }));
                    Unit unit = Unit.INSTANCE;
                }
                return Navigator.DefaultImpls.createFragment$default(navigator, AcatsPlaidContract.Key.INSTANCE, null, 2, null);
            case 9:
                Either<ApiBrokerage, String> brokerageOrDtcNumber = acatsInDataState.getBrokerageOrDtcNumber();
                if (brokerageOrDtcNumber == null) {
                    throw new IllegalStateException("can't advance acats flow without a brokerage or DTC number");
                }
                AvailableAccount rhsAccount2 = acatsInDataState.getRhsAccount();
                if (rhsAccount2 == null) {
                    ApiAvailableDestinationsResponse availableDestinations2 = acatsInDataState.getAvailableDestinations();
                    if (availableDestinations2 != null && (available_accounts2 = availableDestinations2.getAvailable_accounts()) != null) {
                        size = available_accounts2.size();
                    }
                    throw new IllegalStateException(("can't advance acats flow without a selected RHS account. State has " + size + " accounts.").toString());
                }
                return Navigator.DefaultImpls.createFragment$default(navigator, new AcatsInAccountNumberContract.Key(acatsInDataState.getScreenContext(), brokerageOrDtcNumber, rhsAccount2.getRhsAccountNumber(), false, rhsAccount2.getBrokerageAccountType(), 8, null), null, 2, null);
            case 10:
                Either<ApiBrokerage, String> brokerageOrDtcNumber2 = acatsInDataState.getBrokerageOrDtcNumber();
                if (brokerageOrDtcNumber2 == null) {
                    throw new IllegalStateException("can't advance acats flow without a brokerage or DTC number");
                }
                AvailableAccount rhsAccount3 = acatsInDataState.getRhsAccount();
                if (rhsAccount3 == null) {
                    ApiAvailableDestinationsResponse availableDestinations3 = acatsInDataState.getAvailableDestinations();
                    if (availableDestinations3 != null && (available_accounts3 = availableDestinations3.getAvailable_accounts()) != null) {
                        size = available_accounts3.size();
                    }
                    throw new IllegalStateException(("can't advance acats flow without a selected RHS account. State has " + size + " accounts.").toString());
                }
                return Navigator.DefaultImpls.createFragment$default(navigator, new AcatsInConfirmAccountNameContract.Key(acatsInDataState.getScreenContext(), brokerageOrDtcNumber2, rhsAccount3), null, 2, null);
            case 11:
                Either<ApiBrokerage, String> brokerageOrDtcNumber3 = acatsInDataState.getBrokerageOrDtcNumber();
                if (brokerageOrDtcNumber3 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                AvailableAccount rhsAccount4 = acatsInDataState.getRhsAccount();
                if (rhsAccount4 == null) {
                    ApiAvailableDestinationsResponse availableDestinations4 = acatsInDataState.getAvailableDestinations();
                    if (availableDestinations4 != null && (available_accounts4 = availableDestinations4.getAvailable_accounts()) != null) {
                        size = available_accounts4.size();
                    }
                    throw new IllegalStateException(("can't advance acats flow without a selected RHS account. State has " + size + " accounts.").toString());
                }
                return Navigator.DefaultImpls.createFragment$default(navigator, new AcatsInAccountContentsContract.Key(acatsInDataState.getScreenContext(), brokerageOrDtcNumber3, rhsAccount4.getAccountNumber()), null, 2, null);
            case 12:
                AvailableAccount rhsAccount5 = acatsInDataState.getRhsAccount();
                String rhsAccountNumber = rhsAccount5 != null ? rhsAccount5.getRhsAccountNumber() : null;
                if (rhsAccountNumber == null) {
                    throw new IllegalStateException("RHS account number required");
                }
                Either<ApiBrokerage, String> brokerageOrDtcNumber4 = acatsInDataState.getBrokerageOrDtcNumber();
                if (brokerageOrDtcNumber4 == null) {
                    throw new IllegalStateException("Brokerage or DTC number required");
                }
                String contraAccountNumber = acatsInDataState.getContraAccountNumber();
                if (contraAccountNumber == null) {
                    throw new IllegalStateException("Contra account number required");
                }
                String plaidAccessTokenId = acatsInDataState.getPlaidAccessTokenId();
                if (plaidAccessTokenId == null) {
                    throw new IllegalStateException("Plaid access token ID required");
                }
                String name = Eithers.getName(acatsInDataState.getBrokerageOrDtcNumber());
                if (name == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                return Navigator.DefaultImpls.createFragment$default(navigator, new AcatsInPlaidPartialTransferSupportedContract.Key(rhsAccountNumber, brokerageOrDtcNumber4, contraAccountNumber, plaidAccessTokenId, name, acatsInDataState.getPlaidSupportedContentTypes().contains(ApiAcatsAccountContentsResponse.SupportedContentType.OPTIONS), acatsInDataState.getPlaidSupportedContentTypes().contains(ApiAcatsAccountContentsResponse.SupportedContentType.MARGIN), acatsInDataState.getScreenContext()), null, 2, null);
            case 13:
                Either<ApiBrokerage, String> brokerageOrDtcNumber5 = acatsInDataState.getBrokerageOrDtcNumber();
                if (brokerageOrDtcNumber5 == null) {
                    throw new IllegalStateException("can't advance acats flow without a brokerage or DTC number");
                }
                AvailableAccount rhsAccount6 = acatsInDataState.getRhsAccount();
                BrokerageAccountType brokerageAccountType = rhsAccount6 != null ? rhsAccount6.getBrokerageAccountType() : null;
                if (brokerageAccountType == null) {
                    throw new IllegalStateException("can't advance acats flow without a brokerage account type");
                }
                AcatsInScreenContext screenContext2 = acatsInDataState.getScreenContext();
                List<AccountContentItem> selectedPartialAccountContents = acatsInDataState.getSelectedPartialAccountContents();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(selectedPartialAccountContents, 10));
                Iterator<T> it = selectedPartialAccountContents.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AccountContentItem) it.next()).getName());
                }
                return Navigator.DefaultImpls.createFragment$default(navigator, new AcatsInPositionChecklistIneligibleAlternateContract.Key(screenContext2, brokerageOrDtcNumber5, brokerageAccountType, arrayList), null, 2, null);
            case 14:
                Either<ApiBrokerage, String> brokerageOrDtcNumber6 = acatsInDataState.getBrokerageOrDtcNumber();
                if (brokerageOrDtcNumber6 == null) {
                    throw new IllegalStateException("can't advance acats flow without a brokerage or DTC number");
                }
                return Navigator.DefaultImpls.createFragment$default(navigator, new AcatsInPositionChecklistImNotSureAlternateContract.Key(acatsInDataState.getScreenContext(), brokerageOrDtcNumber6, acatsInDataState.getUnsupportedContentTypes()), null, 2, null);
            case 15:
                Either<ApiBrokerage, String> brokerageOrDtcNumber7 = acatsInDataState.getBrokerageOrDtcNumber();
                if (brokerageOrDtcNumber7 == null) {
                    throw new IllegalStateException("can't advance acats flow without a brokerage or DTC number");
                }
                return Navigator.DefaultImpls.createFragment$default(navigator, new AcatsInConfirmEligibleContract.Key(acatsInDataState.getScreenContext(), brokerageOrDtcNumber7, acatsInDataState.getHasPlaidAssets(), false, acatsInDataState.getInAcatsRejectedImprovementsExperiment() || !acatsInDataState.getHasPlaidAssets(), acatsInDataState.getHasShortEquityPositions()), null, 2, null);
            case 16:
                Either<ApiBrokerage, String> brokerageOrDtcNumber8 = acatsInDataState.getBrokerageOrDtcNumber();
                if (brokerageOrDtcNumber8 == null) {
                    throw new IllegalStateException("can't advance acats flow without a brokerage or DTC number");
                }
                return Navigator.DefaultImpls.createFragment$default(navigator, new AcatsInConfirmEligibleContract.Key(acatsInDataState.getScreenContext(), brokerageOrDtcNumber8, acatsInDataState.getHasPlaidAssets(), true, acatsInDataState.getInAcatsRejectedImprovementsExperiment() || !acatsInDataState.getHasPlaidAssets(), acatsInDataState.getHasShortEquityPositions()), null, 2, null);
            case 17:
                AvailableAccount rhsAccount7 = acatsInDataState.getRhsAccount();
                String accountNumber = rhsAccount7 != null ? rhsAccount7.getAccountNumber() : null;
                if (accountNumber == null) {
                    throw new IllegalStateException("account number required");
                }
                return Navigator.DefaultImpls.createFragment$default(navigator, new AcatsInEnableMarginContract.Key(acatsInDataState.getScreenContext(), accountNumber), null, 2, null);
            case 18:
                AvailableAccount rhsAccount8 = acatsInDataState.getRhsAccount();
                if (rhsAccount8 == null) {
                    throw new IllegalStateException("RHS account required");
                }
                Either<ApiBrokerage, String> brokerageOrDtcNumber9 = acatsInDataState.getBrokerageOrDtcNumber();
                if (brokerageOrDtcNumber9 == null) {
                    throw new IllegalStateException("Brokerage or DTC number required");
                }
                return Navigator.DefaultImpls.createFragment$default(navigator, new AcatsInEnableOptionsContract.Key(rhsAccount8.getRhsAccountNumber(), rhsAccount8.getBrokerageAccountType(), brokerageOrDtcNumber9, acatsInDataState.getScreenContext()), null, 2, null);
            case 19:
                AcatsInScreenContext screenContext3 = acatsInDataState.getScreenContext();
                Either<ApiBrokerage, String> brokerageOrDtcNumber10 = acatsInDataState.getBrokerageOrDtcNumber();
                if (brokerageOrDtcNumber10 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                AvailableAccount rhsAccount9 = acatsInDataState.getRhsAccount();
                String rhsAccountNumber2 = rhsAccount9 != null ? rhsAccount9.getRhsAccountNumber() : null;
                AvailableAccount rhsAccount10 = acatsInDataState.getRhsAccount();
                String accountNumber2 = rhsAccount10 != null ? rhsAccount10.getAccountNumber() : null;
                AvailableAccount rhsAccount11 = acatsInDataState.getRhsAccount();
                BrokerageAccountType brokerageAccountType2 = rhsAccount11 != null ? rhsAccount11.getBrokerageAccountType() : null;
                AvailableAccount rhsAccount12 = acatsInDataState.getRhsAccount();
                return Navigator.DefaultImpls.createFragment$default(navigator, new AcatsInPartialTransferParentContract.Key(screenContext3, brokerageOrDtcNumber10, rhsAccountNumber2, accountNumber2, brokerageAccountType2, rhsAccount12 != null ? rhsAccount12.getTitle() : null, CollectionsKt.toSet(acatsInDataState.getSupportedContentTypes()), acatsInDataState.getBuildPartialBannerContentfulId(), null, false, acatsInDataState.getInSubzeroExperiment(), 768, null), null, 2, null);
            case 20:
                AvailableAccount rhsAccount13 = acatsInDataState.getRhsAccount();
                String rhsAccountNumber3 = rhsAccount13 != null ? rhsAccount13.getRhsAccountNumber() : null;
                if (rhsAccountNumber3 == null) {
                    throw new IllegalStateException("RHS account number required");
                }
                Either<ApiBrokerage, String> brokerageOrDtcNumber11 = acatsInDataState.getBrokerageOrDtcNumber();
                if (brokerageOrDtcNumber11 == null) {
                    throw new IllegalStateException("Brokerage or DTC number required");
                }
                String contraAccountNumber2 = acatsInDataState.getContraAccountNumber();
                if (contraAccountNumber2 == null) {
                    throw new IllegalStateException("Contra account number required");
                }
                String plaidAccessTokenId2 = acatsInDataState.getPlaidAccessTokenId();
                if (plaidAccessTokenId2 == null) {
                    throw new IllegalStateException("Plaid access token ID required");
                }
                return Navigator.DefaultImpls.createFragment$default(navigator, new AcatsPlaidPartialTransferKey(rhsAccountNumber3, contraAccountNumber2, brokerageOrDtcNumber11, plaidAccessTokenId2, acatsInDataState.getPlaidSupportedContentTypes(), acatsInDataState.getScreenContext(), acatsInDataState.getInSubzeroExperiment()), null, 2, null);
            case 21:
                Either<ApiBrokerage, String> brokerageOrDtcNumber12 = acatsInDataState.getBrokerageOrDtcNumber();
                if (brokerageOrDtcNumber12 == null) {
                    throw new IllegalStateException("can't advance acats flow without a brokerage or DTC number");
                }
                AvailableAccount rhsAccount14 = acatsInDataState.getRhsAccount();
                String rhsAccountNumber4 = rhsAccount14 != null ? rhsAccount14.getRhsAccountNumber() : null;
                if (rhsAccountNumber4 == null) {
                    throw new IllegalStateException("can't advance acats flow without an RHS account number");
                }
                return Navigator.DefaultImpls.createFragment$default(navigator, AcatsInAgreementContract.Callbacks.DefaultImpls.buildAgreementContract$default(this, rhsAccountNumber4, acatsInDataState.getScreenContext(), brokerageOrDtcNumber12, false, null, null, 56, null), null, 2, null);
            case 22:
                Either<ApiBrokerage, String> brokerageOrDtcNumber13 = acatsInDataState.getBrokerageOrDtcNumber();
                if (brokerageOrDtcNumber13 == null) {
                    throw new IllegalStateException("cannot submit ACATS in request with no brokerage or DTC number");
                }
                String contraAccountNumber3 = acatsInDataState.getContraAccountNumber();
                if (contraAccountNumber3 == null) {
                    throw new IllegalStateException("cannot submit ACATS in request with no account number");
                }
                NamesOnAccount accountNames = acatsInDataState.getAccountNames();
                if (accountNames == null) {
                    throw new IllegalStateException("cannot submit ACATS in request with no account names");
                }
                AvailableAccount rhsAccount15 = acatsInDataState.getRhsAccount();
                String rhsAccountNumber5 = rhsAccount15 != null ? rhsAccount15.getRhsAccountNumber() : null;
                if (rhsAccountNumber5 == null) {
                    throw new IllegalStateException("can't advance acats flow without an RHS account number");
                }
                AcatsInScreenContext screenContext4 = acatsInDataState.getScreenContext();
                AvailableAccount rhsAccount16 = acatsInDataState.getRhsAccount();
                return Navigator.DefaultImpls.createFragment$default(navigator, new AcatsInSubmitContract.Key(screenContext4, brokerageOrDtcNumber13, rhsAccount16 != null ? rhsAccount16.getTitle() : null, contraAccountNumber3, accountNames, acatsInDataState.getAssetsToSubmit(), rhsAccountNumber5, acatsInDataState.getTaxableAccountBonusRateString(), acatsInDataState.getSelectedAccountType(), acatsInDataState.getSlipAgreements(), acatsInDataState.getRequiresCoOwnerSignature()), null, 2, null);
            case 23:
                AvailableAccount rhsAccount17 = acatsInDataState.getRhsAccount();
                String rhsAccountNumber6 = rhsAccount17 != null ? rhsAccount17.getRhsAccountNumber() : null;
                if (rhsAccountNumber6 == null) {
                    throw new IllegalStateException("RHS account number required");
                }
                Either<ApiBrokerage, String> brokerageOrDtcNumber14 = acatsInDataState.getBrokerageOrDtcNumber();
                if (brokerageOrDtcNumber14 == null) {
                    throw new IllegalStateException("Brokerage or DTC number required");
                }
                String contraAccountNumber4 = acatsInDataState.getContraAccountNumber();
                if (contraAccountNumber4 == null) {
                    throw new IllegalStateException("Contra account number required");
                }
                String plaidAccessTokenId3 = acatsInDataState.getPlaidAccessTokenId();
                if (plaidAccessTokenId3 == null) {
                    throw new IllegalStateException("Plaid access token ID required");
                }
                String name2 = Eithers.getName(brokerageOrDtcNumber14);
                if (name2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                return Navigator.DefaultImpls.createFragment$default(navigator, new AcatsInCannotCompleteContract.Key(acatsInDataState.getScreenContext(), rhsAccountNumber6, acatsInDataState.getBrokerageOrDtcNumber(), name2, contraAccountNumber4, plaidAccessTokenId3), null, 2, null);
            case 24:
                UUID submittedAcatsTransferId = acatsInDataState.getSubmittedAcatsTransferId();
                if (submittedAcatsTransferId == null) {
                    throw new IllegalStateException("cannot show confirmation with no acatsTransferId");
                }
                Either<ApiBrokerage, String> brokerageOrDtcNumber15 = acatsInDataState.getBrokerageOrDtcNumber();
                if (brokerageOrDtcNumber15 == null) {
                    throw new IllegalStateException("cannot show confirmation with no brokerage or DTC number");
                }
                return Navigator.DefaultImpls.createFragment$default(navigator, new AcatsInConfirmationContract.Key(acatsInDataState.getScreenContext(), brokerageOrDtcNumber15, submittedAcatsTransferId, acatsInDataState.getConfirmationTitle(), acatsInDataState.getConfirmationDescription(), acatsInDataState.getShowGoldConfirmationScreen(), false, 64, null), null, 2, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapToFragment$lambda$6$lambda$5(String str, LinkTokenConfiguration.Builder linkTokenConfiguration) {
        Intrinsics.checkNotNullParameter(linkTokenConfiguration, "$this$linkTokenConfiguration");
        linkTokenConfiguration.setToken(str);
        linkTokenConfiguration.setLogLevel(BuildConfig.DEBUG ? LinkLogLevel.VERBOSE : LinkLogLevel.ERROR);
        return Unit.INSTANCE;
    }
}

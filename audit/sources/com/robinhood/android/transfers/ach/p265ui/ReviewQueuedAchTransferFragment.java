package com.robinhood.android.transfers.ach.p265ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.data.store.logging.utils.LoggingUtils4;
import com.robinhood.android.maxonboarding.FromOnboardingCallbacks;
import com.robinhood.android.transfers.ach.p265ui.BaseReviewAchTransferFragment;
import com.robinhood.android.transfers.ach.p265ui.ReviewQueuedAchTransferFragment;
import com.robinhood.android.transfers.contracts.transfercontext.CreateIavAccountData;
import com.robinhood.android.transfers.lib.ExtensionsKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.cashier.RhAccountType;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.eventlogging.Article;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.CXIssue;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.DirectDepositContext;
import com.robinhood.rosetta.eventlogging.DirectDepositSwitcherContext;
import com.robinhood.rosetta.eventlogging.EducationHome;
import com.robinhood.rosetta.eventlogging.EducationSeries;
import com.robinhood.rosetta.eventlogging.EducationTour;
import com.robinhood.rosetta.eventlogging.EducationTourOutro;
import com.robinhood.rosetta.eventlogging.EducationTourOutroTooltip;
import com.robinhood.rosetta.eventlogging.EducationTourSection;
import com.robinhood.rosetta.eventlogging.Feedback;
import com.robinhood.rosetta.eventlogging.FundingContext;
import com.robinhood.rosetta.eventlogging.InAppComm;
import com.robinhood.rosetta.eventlogging.InAppSurvey;
import com.robinhood.rosetta.eventlogging.LearningAnswer;
import com.robinhood.rosetta.eventlogging.LearningLesson;
import com.robinhood.rosetta.eventlogging.LearningMatchingExercise;
import com.robinhood.rosetta.eventlogging.LearningMatchingExerciseBucket;
import com.robinhood.rosetta.eventlogging.LearningMatchingExerciseEntity;
import com.robinhood.rosetta.eventlogging.LearningSection;
import com.robinhood.rosetta.eventlogging.List;
import com.robinhood.rosetta.eventlogging.ListsContext;
import com.robinhood.rosetta.eventlogging.NetworkContext;
import com.robinhood.rosetta.eventlogging.NewsFeedItem;
import com.robinhood.rosetta.eventlogging.OrderKind;
import com.robinhood.rosetta.eventlogging.PlaidEventData;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.rosetta.eventlogging.SafetyLabelInfoTag;
import com.robinhood.rosetta.eventlogging.SafetyLabelLesson;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.TransactionDisputeContext;
import com.robinhood.rosetta.eventlogging.TransferContext;
import com.robinhood.rosetta.eventlogging.URLComponents;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.shared.transfers.contracts.context.IavSource;
import com.robinhood.shared.transfers.contracts.context.PlaidIavMetadata;
import com.robinhood.store.achrelationship.QueuedTransferStore;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import retrofit2.Response;

/* compiled from: ReviewQueuedAchTransferFragment.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 =2\u00020\u0001:\u0002<=B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u00102\u001a\u00020)H\u0002J\u001c\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020605042\u0006\u00107\u001a\u000208H\u0002J\u0010\u00109\u001a\u00020)2\u0006\u0010:\u001a\u00020;H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u0014\u0010.\u001a\u00020/8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u0006>"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ReviewQueuedAchTransferFragment;", "Lcom/robinhood/android/transfers/ach/ui/BaseReviewAchTransferFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "queuedTransferStore", "Lcom/robinhood/store/achrelationship/QueuedTransferStore;", "getQueuedTransferStore", "()Lcom/robinhood/store/achrelationship/QueuedTransferStore;", "setQueuedTransferStore", "(Lcom/robinhood/store/achrelationship/QueuedTransferStore;)V", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "getUserStore", "()Lcom/robinhood/shared/store/user/UserStore;", "setUserStore", "(Lcom/robinhood/shared/store/user/UserStore;)V", "callbacks", "Lcom/robinhood/android/transfers/ach/ui/ReviewQueuedAchTransferFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/ach/ui/ReviewQueuedAchTransferFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", ReviewQueuedAchTransferFragment.EXTRA_RH_ACCOUNT_TYPE, "Lcom/robinhood/models/api/cashier/RhAccountType;", "getRhAccountType", "()Lcom/robinhood/models/api/cashier/RhAccountType;", "rhAccountType$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "direction", "Lcom/robinhood/models/db/TransferDirection;", "getDirection", "()Lcom/robinhood/models/db/TransferDirection;", "submitQueuedDepositWithData", "submitQueuedDeposit", "Lio/reactivex/Single;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/AchRelationship;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/transfers/contracts/transfercontext/CreateIavAccountData;", "onSuccess", "result", "Lcom/robinhood/android/transfers/ach/ui/BaseReviewAchTransferFragment$AchTransferResult;", "Callbacks", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class ReviewQueuedAchTransferFragment extends BaseReviewAchTransferFragment {
    private static final String EXTRA_RH_ACCOUNT_TYPE = "rhAccountType";
    public EventLogger eventLogger;
    public ExperimentsStore experimentsStore;
    public QueuedTransferStore queuedTransferStore;
    public UserStore userStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ReviewQueuedAchTransferFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/ach/ui/ReviewQueuedAchTransferFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ach.ui.ReviewQueuedAchTransferFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof ReviewQueuedAchTransferFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: rhAccountType$delegate, reason: from kotlin metadata */
    private final Lazy rhAccountType = Fragments2.argument(this, EXTRA_RH_ACCOUNT_TYPE);

    /* compiled from: ReviewQueuedAchTransferFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ReviewQueuedAchTransferFragment$Callbacks;", "Lcom/robinhood/android/maxonboarding/FromOnboardingCallbacks;", "onQueuedTransferInitiated", "", "verificationDocumentRequestId", "Ljava/util/UUID;", "achTransfer", "Lcom/robinhood/transfers/models/db/AchTransfer;", "amountMoney", "Lcom/robinhood/models/util/Money;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends FromOnboardingCallbacks {
        void onQueuedTransferInitiated(UUID verificationDocumentRequestId, AchTransfer achTransfer, Money amountMoney);
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

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    public final QueuedTransferStore getQueuedTransferStore() {
        QueuedTransferStore queuedTransferStore = this.queuedTransferStore;
        if (queuedTransferStore != null) {
            return queuedTransferStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("queuedTransferStore");
        return null;
    }

    public final void setQueuedTransferStore(QueuedTransferStore queuedTransferStore) {
        Intrinsics.checkNotNullParameter(queuedTransferStore, "<set-?>");
        this.queuedTransferStore = queuedTransferStore;
    }

    public final UserStore getUserStore() {
        UserStore userStore = this.userStore;
        if (userStore != null) {
            return userStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userStore");
        return null;
    }

    public final void setUserStore(UserStore userStore) {
        Intrinsics.checkNotNullParameter(userStore, "<set-?>");
        this.userStore = userStore;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final RhAccountType getRhAccountType() {
        return (RhAccountType) this.rhAccountType.getValue();
    }

    @Override // com.robinhood.android.transfers.ach.p265ui.BaseReviewAchTransferFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        onLoading();
        submitQueuedDepositWithData();
    }

    @Override // com.robinhood.android.transfers.ach.p265ui.BaseReviewAchTransferFragment
    protected TransferDirection getDirection() {
        return TransferDirection.DEPOSIT;
    }

    private final void submitQueuedDepositWithData() {
        CreateIavAccountData accountData = getTransferContext().getAccountData();
        Intrinsics.checkNotNull(accountData);
        Single<R> map = submitQueuedDeposit(accountData).map(new Function() { // from class: com.robinhood.android.transfers.ach.ui.ReviewQueuedAchTransferFragment.submitQueuedDepositWithData.1
            @Override // io.reactivex.functions.Function
            public final BaseReviewAchTransferFragment.AchTransferResult apply(Optional<AchRelationship> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                return new BaseReviewAchTransferFragment.AchTransferResult(optional.component1(), null, null, 6, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        bind(SinglesAndroid.observeOnMainThread(map), LifecycleEvent.ON_STOP).subscribeKotlin(new C301292(this), new C301303(this));
    }

    /* compiled from: ReviewQueuedAchTransferFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ach.ui.ReviewQueuedAchTransferFragment$submitQueuedDepositWithData$2 */
    /* synthetic */ class C301292 extends FunctionReferenceImpl implements Function1<BaseReviewAchTransferFragment.AchTransferResult, Unit> {
        C301292(Object obj) {
            super(1, obj, ReviewQueuedAchTransferFragment.class, "onSuccess", "onSuccess(Lcom/robinhood/android/transfers/ach/ui/BaseReviewAchTransferFragment$AchTransferResult;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BaseReviewAchTransferFragment.AchTransferResult achTransferResult) {
            invoke2(achTransferResult);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(BaseReviewAchTransferFragment.AchTransferResult p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ReviewQueuedAchTransferFragment) this.receiver).onSuccess(p0);
        }
    }

    /* compiled from: ReviewQueuedAchTransferFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ach.ui.ReviewQueuedAchTransferFragment$submitQueuedDepositWithData$3 */
    /* synthetic */ class C301303 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C301303(Object obj) {
            super(1, obj, ReviewQueuedAchTransferFragment.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ReviewQueuedAchTransferFragment) this.receiver).onError(p0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Single<Optional<AchRelationship>> submitQueuedDeposit(CreateIavAccountData data) {
        PlaidIavMetadata plaidIavMetadata = getTransferContext().getPlaidIavMetadata();
        Intrinsics.checkNotNull(plaidIavMetadata);
        String institutionId = plaidIavMetadata.getInstitutionId();
        String str = institutionId == null ? "" : institutionId;
        String institutionName = plaidIavMetadata.getInstitutionName();
        String str2 = institutionName == null ? "" : institutionName;
        String linkSessionId = plaidIavMetadata.getLinkSessionId();
        String str3 = null;
        final PlaidEventData plaidEventData = new PlaidEventData(null, null, null, null, null, null, str3, str, str2, null, linkSessionId == null ? "" : linkSessionId, null, null, null, null, null, null, null, null, null, 1047167, null);
        com.robinhood.rosetta.eventlogging.Money moneyForLogging = ExtensionsKt.toMoneyForLogging(getAmount());
        TransferContext.PaymentInstrument paymentInstrument = TransferContext.PaymentInstrument.ACH;
        String string2 = com.robinhood.android.transfers.ach.util.ExtensionsKt.getSessionId(this).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        final TransferContext transferContext = new TransferContext(moneyForLogging, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, paymentInstrument, str3, string2, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, null);
        QueuedTransferStore queuedTransferStore = getQueuedTransferStore();
        String access_token = data.getAccess_token();
        String iav_account_id = data.getAccount().getIav_account_id();
        BigDecimal amount = getAmount();
        RhAccountType rhAccountType = getRhAccountType();
        PlaidIavMetadata plaidIavMetadata2 = getTransferContext().getPlaidIavMetadata();
        Intrinsics.checkNotNull(plaidIavMetadata2);
        return queuedTransferStore.postQueuedIavDeposit(access_token, iav_account_id, amount, rhAccountType, plaidIavMetadata2, new Function1() { // from class: com.robinhood.android.transfers.ach.ui.ReviewQueuedAchTransferFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReviewQueuedAchTransferFragment.submitQueuedDeposit$lambda$1(this.f$0, plaidEventData, transferContext, (Response) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.ach.ui.ReviewQueuedAchTransferFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReviewQueuedAchTransferFragment.submitQueuedDeposit$lambda$2(this.f$0, plaidEventData, transferContext, (Throwable) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.ach.ui.ReviewQueuedAchTransferFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReviewQueuedAchTransferFragment.submitQueuedDeposit$lambda$3(plaidEventData, transferContext, (Response) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.ach.ui.ReviewQueuedAchTransferFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReviewQueuedAchTransferFragment.submitQueuedDeposit$lambda$4(plaidEventData, transferContext, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventData submitQueuedDeposit$lambda$1(ReviewQueuedAchTransferFragment reviewQueuedAchTransferFragment, PlaidEventData plaidEventData, TransferContext transferContext, Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        PlaidIavMetadata plaidIavMetadata = reviewQueuedAchTransferFragment.getTransferContext().getPlaidIavMetadata();
        Intrinsics.checkNotNull(plaidIavMetadata);
        reviewQueuedAchTransferFragment.getAnalytics().logPlaidIavEventPostSdk("QueuedDepositSuccess", null, plaidIavMetadata.getLinkSessionId(), plaidIavMetadata.getInstitutionId(), plaidIavMetadata.getInstitutionName(), plaidIavMetadata.getSourceTag());
        IavSource iavSource = reviewQueuedAchTransferFragment.getTransferContext().getIavSource();
        if (iavSource == null) {
            iavSource = IavSource.NONE;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i4 = 0;
        String str5 = null;
        String str6 = null;
        Screen screen = null;
        String str7 = null;
        Asset asset = null;
        List list = null;
        NewsFeedItem newsFeedItem = null;
        Feedback feedback = null;
        CXIssue cXIssue = null;
        InAppSurvey inAppSurvey = null;
        ListsContext listsContext = null;
        DirectDepositContext directDepositContext = null;
        DirectDepositSwitcherContext directDepositSwitcherContext = null;
        RecurringContext recurringContext = null;
        OrderKind orderKind = null;
        InAppComm inAppComm = null;
        LearningLesson learningLesson = null;
        LearningSection learningSection = null;
        LearningMatchingExercise learningMatchingExercise = null;
        LearningAnswer learningAnswer = null;
        LearningMatchingExerciseEntity learningMatchingExerciseEntity = null;
        LearningMatchingExerciseBucket learningMatchingExerciseBucket = null;
        SafetyLabelInfoTag safetyLabelInfoTag = null;
        SafetyLabelLesson safetyLabelLesson = null;
        String str8 = null;
        EducationTour educationTour = null;
        EducationTourSection educationTourSection = null;
        EducationTourOutroTooltip educationTourOutroTooltip = null;
        EducationTourOutro educationTourOutro = null;
        EducationSeries educationSeries = null;
        EducationHome educationHome = null;
        FundingContext fundingContext = null;
        URLComponents uRLComponents = null;
        Article article = null;
        TransactionDisputeContext transactionDisputeContext = null;
        return new UserInteractionEventData(UserInteractionEventData.EventType.NETWORK, null, null, null, new com.robinhood.rosetta.eventlogging.Context(i, i2, i3, str, str2, str3, str4, Context.ProductTag.QUEUED_DEPOSIT, i4, str5, iavSource.name(), str6, screen, str7, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str8, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, LoggingUtils4.toNetworkContext((Response<?>) response, NetworkContext.Tag.SUBMIT_QUEUED_DEPOSIT), plaidEventData, null, transferContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1153, -90113, -1, -1, -1, -1, 16383, null), null, null, 110, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventData submitQueuedDeposit$lambda$2(ReviewQueuedAchTransferFragment reviewQueuedAchTransferFragment, PlaidEventData plaidEventData, TransferContext transferContext, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        PlaidIavMetadata plaidIavMetadata = reviewQueuedAchTransferFragment.getTransferContext().getPlaidIavMetadata();
        Intrinsics.checkNotNull(plaidIavMetadata);
        reviewQueuedAchTransferFragment.getAnalytics().logPlaidIavEventPostSdk("QueuedDepositFailure", throwable, plaidIavMetadata.getLinkSessionId(), plaidIavMetadata.getInstitutionId(), plaidIavMetadata.getInstitutionName(), plaidIavMetadata.getSourceTag());
        IavSource iavSource = reviewQueuedAchTransferFragment.getTransferContext().getIavSource();
        if (iavSource == null) {
            iavSource = IavSource.NONE;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i4 = 0;
        String str5 = null;
        String str6 = null;
        Screen screen = null;
        String str7 = null;
        Asset asset = null;
        List list = null;
        NewsFeedItem newsFeedItem = null;
        Feedback feedback = null;
        CXIssue cXIssue = null;
        InAppSurvey inAppSurvey = null;
        ListsContext listsContext = null;
        DirectDepositContext directDepositContext = null;
        DirectDepositSwitcherContext directDepositSwitcherContext = null;
        RecurringContext recurringContext = null;
        OrderKind orderKind = null;
        InAppComm inAppComm = null;
        LearningLesson learningLesson = null;
        LearningSection learningSection = null;
        LearningMatchingExercise learningMatchingExercise = null;
        LearningAnswer learningAnswer = null;
        LearningMatchingExerciseEntity learningMatchingExerciseEntity = null;
        LearningMatchingExerciseBucket learningMatchingExerciseBucket = null;
        SafetyLabelInfoTag safetyLabelInfoTag = null;
        SafetyLabelLesson safetyLabelLesson = null;
        String str8 = null;
        EducationTour educationTour = null;
        EducationTourSection educationTourSection = null;
        EducationTourOutroTooltip educationTourOutroTooltip = null;
        EducationTourOutro educationTourOutro = null;
        EducationSeries educationSeries = null;
        EducationHome educationHome = null;
        FundingContext fundingContext = null;
        URLComponents uRLComponents = null;
        Article article = null;
        TransactionDisputeContext transactionDisputeContext = null;
        return new UserInteractionEventData(UserInteractionEventData.EventType.NETWORK, null, null, null, new com.robinhood.rosetta.eventlogging.Context(i, i2, i3, str, str2, str3, str4, Context.ProductTag.QUEUED_DEPOSIT, i4, str5, iavSource.name(), str6, screen, str7, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str8, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, LoggingUtils4.toNetworkContext(throwable, NetworkContext.Tag.SUBMIT_QUEUED_DEPOSIT), plaidEventData, null, transferContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1153, -90113, -1, -1, -1, -1, 16383, null), null, null, 110, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventData submitQueuedDeposit$lambda$3(PlaidEventData plaidEventData, TransferContext transferContext, Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i4 = 0;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Screen screen = null;
        String str8 = null;
        Asset asset = null;
        List list = null;
        NewsFeedItem newsFeedItem = null;
        Feedback feedback = null;
        CXIssue cXIssue = null;
        InAppSurvey inAppSurvey = null;
        ListsContext listsContext = null;
        DirectDepositContext directDepositContext = null;
        DirectDepositSwitcherContext directDepositSwitcherContext = null;
        RecurringContext recurringContext = null;
        OrderKind orderKind = null;
        InAppComm inAppComm = null;
        LearningLesson learningLesson = null;
        LearningSection learningSection = null;
        LearningMatchingExercise learningMatchingExercise = null;
        LearningAnswer learningAnswer = null;
        LearningMatchingExerciseEntity learningMatchingExerciseEntity = null;
        LearningMatchingExerciseBucket learningMatchingExerciseBucket = null;
        SafetyLabelInfoTag safetyLabelInfoTag = null;
        SafetyLabelLesson safetyLabelLesson = null;
        String str9 = null;
        EducationTour educationTour = null;
        EducationTourSection educationTourSection = null;
        EducationTourOutroTooltip educationTourOutroTooltip = null;
        EducationTourOutro educationTourOutro = null;
        EducationSeries educationSeries = null;
        EducationHome educationHome = null;
        FundingContext fundingContext = null;
        URLComponents uRLComponents = null;
        Article article = null;
        TransactionDisputeContext transactionDisputeContext = null;
        return new UserInteractionEventData(UserInteractionEventData.EventType.NETWORK, null, null, null, new com.robinhood.rosetta.eventlogging.Context(i, i2, i3, str, str2, str3, str4, Context.ProductTag.QUEUED_DEPOSIT, i4, str5, str6, str7, screen, str8, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str9, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, LoggingUtils4.toNetworkContext((Response<?>) response, NetworkContext.Tag.IAV_CREATE_RELATIONSHIP), plaidEventData, null, transferContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, -90113, -1, -1, -1, -1, 16383, null), null, null, 110, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventData submitQueuedDeposit$lambda$4(PlaidEventData plaidEventData, TransferContext transferContext, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i4 = 0;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Screen screen = null;
        String str8 = null;
        Asset asset = null;
        List list = null;
        NewsFeedItem newsFeedItem = null;
        Feedback feedback = null;
        CXIssue cXIssue = null;
        InAppSurvey inAppSurvey = null;
        ListsContext listsContext = null;
        DirectDepositContext directDepositContext = null;
        DirectDepositSwitcherContext directDepositSwitcherContext = null;
        RecurringContext recurringContext = null;
        OrderKind orderKind = null;
        InAppComm inAppComm = null;
        LearningLesson learningLesson = null;
        LearningSection learningSection = null;
        LearningMatchingExercise learningMatchingExercise = null;
        LearningAnswer learningAnswer = null;
        LearningMatchingExerciseEntity learningMatchingExerciseEntity = null;
        LearningMatchingExerciseBucket learningMatchingExerciseBucket = null;
        SafetyLabelInfoTag safetyLabelInfoTag = null;
        SafetyLabelLesson safetyLabelLesson = null;
        String str9 = null;
        EducationTour educationTour = null;
        EducationTourSection educationTourSection = null;
        EducationTourOutroTooltip educationTourOutroTooltip = null;
        EducationTourOutro educationTourOutro = null;
        EducationSeries educationSeries = null;
        EducationHome educationHome = null;
        FundingContext fundingContext = null;
        URLComponents uRLComponents = null;
        Article article = null;
        TransactionDisputeContext transactionDisputeContext = null;
        return new UserInteractionEventData(UserInteractionEventData.EventType.NETWORK, null, null, null, new com.robinhood.rosetta.eventlogging.Context(i, i2, i3, str, str2, str3, str4, Context.ProductTag.QUEUED_DEPOSIT, i4, str5, str6, str7, screen, str8, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str9, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, LoggingUtils4.toNetworkContext(throwable, NetworkContext.Tag.IAV_CREATE_RELATIONSHIP), plaidEventData, null, transferContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, -90113, -1, -1, -1, -1, 16383, null), null, null, 110, null);
    }

    @Override // com.robinhood.android.transfers.ach.p265ui.BaseReviewAchTransferFragment
    public void onSuccess(BaseReviewAchTransferFragment.AchTransferResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        super.onSuccess(result);
        getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_QUEUED_DEPOSIT);
        Callbacks callbacks = getCallbacks();
        AchRelationship achRelationship = result.getAchRelationship();
        callbacks.onQueuedTransferInitiated(achRelationship != null ? achRelationship.getDocumentRequestId() : null, result.getAchTransfer(), Money3.toMoney(getAmount(), Currencies.USD));
    }

    /* compiled from: ReviewQueuedAchTransferFragment.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ReviewQueuedAchTransferFragment$Companion;", "", "<init>", "()V", "EXTRA_RH_ACCOUNT_TYPE", "", "newInstance", "Lcom/robinhood/android/transfers/ach/ui/ReviewQueuedAchTransferFragment;", "transferContext", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "amount", "Ljava/math/BigDecimal;", ReviewQueuedAchTransferFragment.EXTRA_RH_ACCOUNT_TYPE, "Lcom/robinhood/models/api/cashier/RhAccountType;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ReviewQueuedAchTransferFragment newInstance(com.robinhood.android.transfers.contracts.transfercontext.TransferContext transferContext, BigDecimal amount, RhAccountType rhAccountType) {
            Intrinsics.checkNotNullParameter(transferContext, "transferContext");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(rhAccountType, "rhAccountType");
            ReviewQueuedAchTransferFragment reviewQueuedAchTransferFragment = new ReviewQueuedAchTransferFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("extraTransferContext", transferContext);
            bundle.putSerializable(BaseReviewAchTransferFragment.EXTRA_AMOUNT, amount);
            bundle.putSerializable(ReviewQueuedAchTransferFragment.EXTRA_RH_ACCOUNT_TYPE, rhAccountType);
            reviewQueuedAchTransferFragment.setArguments(bundle);
            return reviewQueuedAchTransferFragment;
        }
    }
}

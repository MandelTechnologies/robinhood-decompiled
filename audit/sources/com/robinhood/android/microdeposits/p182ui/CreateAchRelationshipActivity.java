package com.robinhood.android.microdeposits.p182ui;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.transition.TransitionInflater;
import android.view.View;
import androidx.fragment.app.FragmentTransaction;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.ach.contracts.AchRelationshipDocumentRequestSource;
import com.robinhood.android.banking.lib.C9631R;
import com.robinhood.android.banking.util.Contexts3;
import com.robinhood.android.banking.util.DeactivatedAccountUtils;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.microdeposits.p182ui.AchAccountNumberFragment;
import com.robinhood.android.microdeposits.p182ui.AchCheckingOrSavingsFragment;
import com.robinhood.android.microdeposits.p182ui.AchRelationshipCreatedFragment;
import com.robinhood.android.microdeposits.p182ui.AchRoutingNumberFragment;
import com.robinhood.android.microdeposits.p182ui.AchSubmissionFragment;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.fragment.ReplaceFragmentBuilder;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.models.api.ApiAchRelationship;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.transfers.contracts.CreateAchRelationship;
import com.robinhood.shared.transfers.contracts.context.IavSource;
import com.robinhood.shared.transfers.contracts.context.PlaidIavMetadata;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: CreateAchRelationshipActivity.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 R2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001RB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010:\u001a\u000207H\u0016J\u0010\u0010;\u001a\u0002072\u0006\u0010<\u001a\u00020=H\u0016J\u001a\u0010>\u001a\u00020?2\u0006\u0010<\u001a\u00020=2\b\u0010@\u001a\u0004\u0018\u000109H\u0016J\u001a\u0010A\u001a\u00020?2\u0006\u0010<\u001a\u00020=2\b\u0010@\u001a\u0004\u0018\u000109H\u0016J\b\u0010B\u001a\u00020?H\u0016J\u0010\u0010C\u001a\u0002072\u0006\u0010$\u001a\u00020#H\u0016J$\u0010D\u001a\u0002072\u0006\u0010,\u001a\u00020+2\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020+0FH\u0016J\u0010\u0010H\u001a\u0002072\u0006\u00102\u001a\u00020+H\u0016J\u0010\u0010I\u001a\u0002072\u0006\u0010J\u001a\u00020?H\u0016J\u0010\u0010K\u001a\u0002072\u0006\u0010L\u001a\u00020MH\u0016J\u0010\u0010N\u001a\u0002072\u0006\u0010O\u001a\u00020PH\u0016J\b\u0010Q\u001a\u000207H\u0016R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR/\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\"\u001a\u0004\u0018\u00010#8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R/\u0010,\u001a\u0004\u0018\u00010+2\b\u0010\"\u001a\u0004\u0018\u00010+8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010*\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R/\u00102\u001a\u0004\u0018\u00010+2\b\u0010\"\u001a\u0004\u0018\u00010+8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010*\u001a\u0004\b3\u0010.\"\u0004\b4\u00100¨\u0006S"}, m3636d2 = {"Lcom/robinhood/android/microdeposits/ui/CreateAchRelationshipActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/microdeposits/ui/AchCheckingOrSavingsFragment$Callbacks;", "Lcom/robinhood/android/microdeposits/ui/AchRoutingNumberFragment$Callbacks;", "Lcom/robinhood/android/microdeposits/ui/AchAccountNumberFragment$Callbacks;", "Lcom/robinhood/android/microdeposits/ui/AchSubmissionFragment$Callbacks;", "Lcom/robinhood/android/microdeposits/ui/AchRelationshipCreatedFragment$Callbacks;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "<init>", "()V", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "getTransferAccountStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "setTransferAccountStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;)V", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "getCardManager", "()Lcom/robinhood/android/common/util/CardManager;", "setCardManager", "(Lcom/robinhood/android/common/util/CardManager;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "iavSource", "Lcom/robinhood/shared/transfers/contracts/context/IavSource;", "getIavSource$feature_microdeposits_externalDebug", "()Lcom/robinhood/shared/transfers/contracts/context/IavSource;", "iavSource$delegate", "Lkotlin/Lazy;", "<set-?>", "Lcom/robinhood/models/api/ApiAchRelationship$BankAccountType;", "bankAccountType", "getBankAccountType", "()Lcom/robinhood/models/api/ApiAchRelationship$BankAccountType;", "setBankAccountType", "(Lcom/robinhood/models/api/ApiAchRelationship$BankAccountType;)V", "bankAccountType$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "routingNumber", "getRoutingNumber", "()Ljava/lang/String;", "setRoutingNumber", "(Ljava/lang/String;)V", "routingNumber$delegate", "accountNumber", "getAccountNumber", "setAccountNumber", "accountNumber$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "finish", "onDialogDismissed", "id", "", "onPositiveButtonClicked", "", "passthroughArgs", "onNegativeButtonClicked", "shouldPromptForLockscreen", "onBankAccountTypeSelected", "onRoutingNumberEntered", "sharedElements", "", "Landroid/view/View;", "onAccountNumberEntered", "onAccountLinked", "isQueued", "onAccountLinkError", "t", "", "onDocumentsRequestedForAccount", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "onComplete", "Companion", "feature-microdeposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CreateAchRelationshipActivity extends BaseActivity implements AchCheckingOrSavingsFragment.Callbacks, AchRoutingNumberFragment.Callbacks, AchAccountNumberFragment.Callbacks, AchSubmissionFragment.Callbacks, AchRelationshipCreatedFragment.Callbacks, RhDialogFragment.OnDismissListener {

    /* renamed from: accountNumber$delegate, reason: from kotlin metadata */
    private final Interfaces3 accountNumber;
    public AnalyticsLogger analytics;

    /* renamed from: bankAccountType$delegate, reason: from kotlin metadata */
    private final Interfaces3 bankAccountType;
    public CardManager cardManager;

    /* renamed from: iavSource$delegate, reason: from kotlin metadata */
    private final Lazy iavSource;

    /* renamed from: routingNumber$delegate, reason: from kotlin metadata */
    private final Interfaces3 routingNumber;
    public TransferAccountStore transferAccountStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(CreateAchRelationshipActivity.class, "bankAccountType", "getBankAccountType()Lcom/robinhood/models/api/ApiAchRelationship$BankAccountType;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CreateAchRelationshipActivity.class, "routingNumber", "getRoutingNumber()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CreateAchRelationshipActivity.class, "accountNumber", "getAccountNumber()Ljava/lang/String;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public CreateAchRelationshipActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.iavSource = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.microdeposits.ui.CreateAchRelationshipActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateAchRelationshipActivity.iavSource_delegate$lambda$0(this.f$0);
            }
        });
        Interfaces interfacesSavedSerializable = BindSavedState2.savedSerializable(this);
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.bankAccountType = (Interfaces3) interfacesSavedSerializable.provideDelegate(this, kPropertyArr[0]);
        this.routingNumber = BindSavedState2.savedString(this).provideDelegate(this, kPropertyArr[1]);
        this.accountNumber = BindSavedState2.savedString(this).provideDelegate(this, kPropertyArr[2]);
    }

    public final TransferAccountStore getTransferAccountStore() {
        TransferAccountStore transferAccountStore = this.transferAccountStore;
        if (transferAccountStore != null) {
            return transferAccountStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transferAccountStore");
        return null;
    }

    public final void setTransferAccountStore(TransferAccountStore transferAccountStore) {
        Intrinsics.checkNotNullParameter(transferAccountStore, "<set-?>");
        this.transferAccountStore = transferAccountStore;
    }

    public final CardManager getCardManager() {
        CardManager cardManager = this.cardManager;
        if (cardManager != null) {
            return cardManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cardManager");
        return null;
    }

    public final void setCardManager(CardManager cardManager) {
        Intrinsics.checkNotNullParameter(cardManager, "<set-?>");
        this.cardManager = cardManager;
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IavSource iavSource_delegate$lambda$0(CreateAchRelationshipActivity createAchRelationshipActivity) {
        return ((CreateAchRelationship) INSTANCE.getExtras((Activity) createAchRelationshipActivity)).getIavSource();
    }

    public final IavSource getIavSource$feature_microdeposits_externalDebug() {
        return (IavSource) this.iavSource.getValue();
    }

    private final ApiAchRelationship.BankAccountType getBankAccountType() {
        return (ApiAchRelationship.BankAccountType) this.bankAccountType.getValue(this, $$delegatedProperties[0]);
    }

    private final void setBankAccountType(ApiAchRelationship.BankAccountType bankAccountType) {
        this.bankAccountType.setValue(this, $$delegatedProperties[0], bankAccountType);
    }

    private final String getRoutingNumber() {
        return (String) this.routingNumber.getValue(this, $$delegatedProperties[1]);
    }

    private final void setRoutingNumber(String str) {
        this.routingNumber.setValue(this, $$delegatedProperties[1], str);
    }

    private final String getAccountNumber() {
        return (String) this.accountNumber.getValue(this, $$delegatedProperties[2]);
    }

    private final void setAccountNumber(String str) {
        this.accountNumber.setValue(this, $$delegatedProperties[2], str);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (((CreateAchRelationship) INSTANCE.getExtras((Activity) this)).getTheme() == ColorTheme.DARK) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), DayNightOverlay.NIGHT, null, 2, null);
        }
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, AchCheckingOrSavingsFragment.INSTANCE.newInstance());
        }
        DeactivatedAccountUtils.preventDeactivatedUsersFromProceeding(this, getTransferAccountStore(), C9631R.string.linking_deactivated_account_message);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, android.app.Activity
    public void finish() {
        PlaidIavMetadata plaidIavMetadata = ((CreateAchRelationship) INSTANCE.getExtras((Activity) this)).getPlaidIavMetadata();
        if (plaidIavMetadata != null) {
            getAnalytics().logPlaidIavEventPostSdk("CancelFlow", null, plaidIavMetadata.getLinkSessionId(), plaidIavMetadata.getInstitutionId(), plaidIavMetadata.getInstitutionName(), plaidIavMetadata.getSourceTag());
        }
        super.finish();
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C9631R.id.dialog_id_deactivated_account) {
            finish();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C9631R.id.dialog_id_deactivated_account) {
            finish();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C9631R.id.dialog_id_deactivated_account) {
            Navigators3.showContactSupportTriageFragment$default(getNavigator(), this, null, false, 6, null);
            finish();
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean shouldPromptForLockscreen() {
        return !getIavSource$feature_microdeposits_externalDebug().getIsQueued();
    }

    @Override // com.robinhood.android.microdeposits.ui.AchCheckingOrSavingsFragment.Callbacks
    public void onBankAccountTypeSelected(ApiAchRelationship.BankAccountType bankAccountType) {
        Intrinsics.checkNotNullParameter(bankAccountType, "bankAccountType");
        setBankAccountType(bankAccountType);
        setCurrentFragmentTransitionSuccess();
        replaceFragment(AchRoutingNumberFragment.INSTANCE.newInstance());
    }

    @Override // com.robinhood.android.microdeposits.ui.AchRoutingNumberFragment.Callbacks
    public void onRoutingNumberEntered(String routingNumber, final Map<View, String> sharedElements) {
        Intrinsics.checkNotNullParameter(routingNumber, "routingNumber");
        Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
        setRoutingNumber(routingNumber);
        setCurrentFragmentTransitionSuccess();
        AchAccountNumberFragment achAccountNumberFragment = (AchAccountNumberFragment) AchAccountNumberFragment.INSTANCE.newInstance((Parcelable) new AchAccountNumberFragment.Args(routingNumber));
        TransitionInflater transitionInflaterFrom = TransitionInflater.from(this);
        achAccountNumberFragment.setSharedElementEnterTransition(transitionInflaterFrom.inflateTransition(R.transition.move));
        achAccountNumberFragment.setEnterTransition(transitionInflaterFrom.inflateTransition(R.transition.fade));
        new ReplaceFragmentBuilder(achAccountNumberFragment).setModifier(new Function1() { // from class: com.robinhood.android.microdeposits.ui.CreateAchRelationshipActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateAchRelationshipActivity.onRoutingNumberEntered$lambda$2(sharedElements, (FragmentTransaction) obj);
            }
        }).setUseDefaultAnimation(false).buildAndExecute(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onRoutingNumberEntered$lambda$2(Map map, FragmentTransaction ft) {
        Intrinsics.checkNotNullParameter(ft, "ft");
        for (Map.Entry entry : map.entrySet()) {
            ft.addSharedElement((View) entry.getKey(), (String) entry.getValue());
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.microdeposits.ui.AchAccountNumberFragment.Callbacks
    public void onAccountNumberEntered(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        setAccountNumber(accountNumber);
        setCurrentFragmentTransitionSuccess();
        AchSubmissionFragment.Companion companion = AchSubmissionFragment.INSTANCE;
        ApiAchRelationship.BankAccountType bankAccountType = getBankAccountType();
        Intrinsics.checkNotNull(bankAccountType);
        String routingNumber = getRoutingNumber();
        Intrinsics.checkNotNull(routingNumber);
        replaceFragment(companion.newInstance(bankAccountType, routingNumber, accountNumber));
    }

    @Override // com.robinhood.android.microdeposits.ui.AchSubmissionFragment.Callbacks
    public void onAccountLinked(boolean isQueued) {
        setCurrentFragmentTransitionSuccess();
        if (isQueued) {
            getCardManager().invalidateCardsBestEffort();
        }
        replaceFragment(AchRelationshipCreatedFragment.INSTANCE.newInstance(isQueued));
    }

    @Override // com.robinhood.android.microdeposits.ui.AchSubmissionFragment.Callbacks
    public void onAccountLinkError(Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        setCurrentFragmentTransitionReason(TransitionReason.ACH_ACCOUNT_LINK_ERROR);
        popLastFragment();
        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, this, t, false, false, 0, null, 60, null);
    }

    @Override // com.robinhood.android.microdeposits.ui.AchSubmissionFragment.Callbacks
    public void onDocumentsRequestedForAccount(AchRelationship achRelationship) {
        Intrinsics.checkNotNullParameter(achRelationship, "achRelationship");
        AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_NEEDS_APPROVAL_RELATIONSHIP_IN_MICRODEPOSITS, "", null, null, achRelationship.getId().toString(), "ach_relationship", null, null, 204, null);
        Contexts3.startAchRelationshipDocumentRequest$default(this, achRelationship, ApiDocumentRequest.Type.BANK_STATEMENT, AchRelationshipDocumentRequestSource.MICRODEPOSITS, null, ((CreateAchRelationship) INSTANCE.getExtras((Activity) this)).getTheme(), 8, null);
        finish();
    }

    @Override // com.robinhood.android.microdeposits.ui.AchRelationshipCreatedFragment.Callbacks
    public void onComplete() {
        setResult(-1);
        finish();
    }

    /* compiled from: CreateAchRelationshipActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/microdeposits/ui/CreateAchRelationshipActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/microdeposits/ui/CreateAchRelationshipActivity;", "Lcom/robinhood/shared/transfers/contracts/CreateAchRelationship;", "<init>", "()V", "feature-microdeposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<CreateAchRelationshipActivity, CreateAchRelationship> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public CreateAchRelationship getExtras(CreateAchRelationshipActivity createAchRelationshipActivity) {
            return (CreateAchRelationship) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, createAchRelationshipActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, CreateAchRelationship createAchRelationship) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, createAchRelationship);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, CreateAchRelationship createAchRelationship) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, createAchRelationship);
        }
    }
}

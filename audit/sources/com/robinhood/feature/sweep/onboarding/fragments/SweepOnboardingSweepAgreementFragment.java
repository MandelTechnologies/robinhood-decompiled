package com.robinhood.feature.sweep.onboarding.fragments;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.JointAccountsOnboardingService;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.SignSweepAgreementsRequestDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.onboarding.p085ui.BaseAgreementFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.sweep.SweepOnboardingEventLogger;
import com.robinhood.feature.sweep.onboarding.C33184R;
import com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingSweepAgreementFragment;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.ApiGoldSweepAgreement;
import com.robinhood.models.p320db.Account;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.common.agreementview.RdsAgreementView;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.reactivex.Observable;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: SweepOnboardingSweepAgreementFragment.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 82\u00020\u0001:\u0003678B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020'H\u0016J\b\u0010.\u001a\u00020'H\u0016J\b\u0010/\u001a\u00020'H\u0016J\u0010\u00100\u001a\u00020'2\u0006\u00101\u001a\u000202H\u0016J\u0010\u00103\u001a\u00020'2\u0006\u0010(\u001a\u000204H\u0016J\b\u00105\u001a\u00020'H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0007R\u0014\u0010\"\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0007R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingSweepAgreementFragment;", "Lcom/robinhood/android/common/onboarding/ui/BaseAgreementFragment;", "<init>", "()V", "excludeFromAnalyticsLogging", "", "getExcludeFromAnalyticsLogging", "()Z", "callbacks", "Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingSweepAgreementFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingSweepAgreementFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "sweepOnboardingEventLogger", "Lcom/robinhood/android/lib/sweep/SweepOnboardingEventLogger;", "getSweepOnboardingEventLogger", "()Lcom/robinhood/android/lib/sweep/SweepOnboardingEventLogger;", "setSweepOnboardingEventLogger", "(Lcom/robinhood/android/lib/sweep/SweepOnboardingEventLogger;)V", "jointAccountsOnboardingService", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/JointAccountsOnboardingService;", "getJointAccountsOnboardingService", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/JointAccountsOnboardingService;", "setJointAccountsOnboardingService", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/JointAccountsOnboardingService;)V", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "forAchromatic", "getForAchromatic", "forGold", "getForGold", "analyticsScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "onStart", "onResume", "onStop", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onAgreementAccepted", "Lcom/robinhood/shared/common/agreementview/RdsAgreementView;", "onAgreementRecorded", "Callbacks", "Args", "Companion", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class SweepOnboardingSweepAgreementFragment extends BaseAgreementFragment {
    public AccountProvider accountProvider;
    public JointAccountsOnboardingService jointAccountsOnboardingService;
    public SweepOnboardingEventLogger sweepOnboardingEventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SweepOnboardingSweepAgreementFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingSweepAgreementFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final boolean excludeFromAnalyticsLogging = true;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingSweepAgreementFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof SweepOnboardingSweepAgreementFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final Screen analyticsScreen = new Screen(Screen.Name.SWEEP_ONBOARDING_AGREEMENT, null, null, null, 14, null);

    /* compiled from: SweepOnboardingSweepAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingSweepAgreementFragment$Callbacks;", "", "onSweepAgreementAccepted", "", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSweepAgreementAccepted();
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseAgreementFragment
    public void onAgreementRecorded() {
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromAnalyticsLogging() {
        return this.excludeFromAnalyticsLogging;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    public final SweepOnboardingEventLogger getSweepOnboardingEventLogger() {
        SweepOnboardingEventLogger sweepOnboardingEventLogger = this.sweepOnboardingEventLogger;
        if (sweepOnboardingEventLogger != null) {
            return sweepOnboardingEventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sweepOnboardingEventLogger");
        return null;
    }

    public final void setSweepOnboardingEventLogger(SweepOnboardingEventLogger sweepOnboardingEventLogger) {
        Intrinsics.checkNotNullParameter(sweepOnboardingEventLogger, "<set-?>");
        this.sweepOnboardingEventLogger = sweepOnboardingEventLogger;
    }

    public final JointAccountsOnboardingService getJointAccountsOnboardingService() {
        JointAccountsOnboardingService jointAccountsOnboardingService = this.jointAccountsOnboardingService;
        if (jointAccountsOnboardingService != null) {
            return jointAccountsOnboardingService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("jointAccountsOnboardingService");
        return null;
    }

    public final void setJointAccountsOnboardingService(JointAccountsOnboardingService jointAccountsOnboardingService) {
        Intrinsics.checkNotNullParameter(jointAccountsOnboardingService, "<set-?>");
        this.jointAccountsOnboardingService = jointAccountsOnboardingService;
    }

    public final AccountProvider getAccountProvider() {
        AccountProvider accountProvider = this.accountProvider;
        if (accountProvider != null) {
            return accountProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountProvider");
        return null;
    }

    public final void setAccountProvider(AccountProvider accountProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "<set-?>");
        this.accountProvider = accountProvider;
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseAgreementFragment
    protected boolean getForAchromatic() {
        return Intrinsics.areEqual(((Args) INSTANCE.getArgs((Fragment) this)).isGold(), Boolean.FALSE);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseAgreementFragment
    protected boolean getForGold() {
        return Intrinsics.areEqual(((Args) INSTANCE.getArgs((Fragment) this)).isGold(), Boolean.TRUE);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseAgreementFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        List<String> listEmptyList;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) this)).getSweepAgreement() == null) {
            return;
        }
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        getAgreementView().setGravity(8388611);
        RdsAgreementView agreementView = getAgreementView();
        ApiGoldSweepAgreement sweepAgreement = ((Args) companion.getArgs((Fragment) this)).getSweepAgreement();
        Intrinsics.checkNotNull(sweepAgreement);
        agreementView.setTitleTxtText(sweepAgreement.getTitle());
        RdsAgreementView agreementView2 = getAgreementView();
        ApiGoldSweepAgreement sweepAgreement2 = ((Args) companion.getArgs((Fragment) this)).getSweepAgreement();
        if (sweepAgreement2 == null || (listEmptyList = sweepAgreement2.getAdditionalCheckboxes()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        agreementView2.setAdditionalCheckboxes(listEmptyList);
        ApiGoldSweepAgreement sweepAgreement3 = ((Args) companion.getArgs((Fragment) this)).getSweepAgreement();
        Intrinsics.checkNotNull(sweepAgreement3);
        String description = sweepAgreement3.getDescription();
        if (description != null) {
            getAgreementView().setHeaderTxtText(description);
        }
        ApiGoldSweepAgreement sweepAgreement4 = ((Args) companion.getArgs((Fragment) this)).getSweepAgreement();
        Intrinsics.checkNotNull(sweepAgreement4);
        String footer = sweepAgreement4.getFooter();
        if (footer != null) {
            getAgreementView().setDescriptionTxtText(footer);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getSweepOnboardingEventLogger().logTap(this.analyticsScreen, UserInteractionEventData.Action.BACK);
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getSweepOnboardingEventLogger().logScreenAppear(this.analyticsScreen);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ApiGoldSweepAgreement sweepAgreement = ((Args) INSTANCE.getArgs((Fragment) this)).getSweepAgreement();
        if (sweepAgreement != null) {
            BaseAgreementFragment.loadIdentiAgreement$default(this, sweepAgreement.getAgreementType(), false, sweepAgreement.getTitle(), 2, null);
        } else {
            new Function0() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingSweepAgreementFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SweepOnboardingSweepAgreementFragment.onResume$lambda$3(this.f$0);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(SweepOnboardingSweepAgreementFragment sweepOnboardingSweepAgreementFragment) {
        String string2 = sweepOnboardingSweepAgreementFragment.getString(C33184R.string.cash_sweep_onboarding_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        BaseAgreementFragment.loadIdentiAgreement$default(sweepOnboardingSweepAgreementFragment, "cash_sweep_agreement", false, string2, 2, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        getSweepOnboardingEventLogger().logScreenDisappear(this.analyticsScreen);
        super.onStop();
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseAgreementFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitleAlpha(0.0f);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseAgreementFragment, com.robinhood.shared.common.agreementview.RdsAgreementView.OnAgreementAcceptedListener
    public void onAgreementAccepted(RdsAgreementView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        getSweepOnboardingEventLogger().logTap(this.analyticsScreen, UserInteractionEventData.Action.CONTINUE);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C332001(view, null), 3, null);
    }

    /* compiled from: SweepOnboardingSweepAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingSweepAgreementFragment$onAgreementAccepted$1", m3645f = "SweepOnboardingSweepAgreementFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, 155, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingSweepAgreementFragment$onAgreementAccepted$1 */
    static final class C332001 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ RdsAgreementView $view;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C332001(RdsAgreementView rdsAgreementView, Continuation<? super C332001> continuation) {
            super(2, continuation);
            this.$view = rdsAgreementView;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SweepOnboardingSweepAgreementFragment.this.new C332001(this.$view, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C332001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
        
            if (r6 == r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
        
            if (r6 == r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
        
            if (r1.SignSweepAgreements(r3, r5) == r0) goto L29;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Account account;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    String accountNumber = ((Args) SweepOnboardingSweepAgreementFragment.INSTANCE.getArgs((Fragment) SweepOnboardingSweepAgreementFragment.this)).getAccountNumber();
                    if (accountNumber != null) {
                        Observable<Account> observableStreamAccount = SweepOnboardingSweepAgreementFragment.this.getAccountProvider().streamAccount(accountNumber);
                        this.label = 1;
                        obj = RxAwait3.awaitFirst(observableStreamAccount, this);
                    } else {
                        Observable<Account> observableStreamIndividualAccount = SweepOnboardingSweepAgreementFragment.this.getAccountProvider().streamIndividualAccount();
                        this.label = 2;
                        obj = RxAwait3.awaitFirst(observableStreamIndividualAccount, this);
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    account = (Account) obj;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        SweepOnboardingSweepAgreementFragment.this.getCallbacks().onSweepAgreementAccepted();
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    account = (Account) obj;
                }
                if (account.getBrokerageAccountType() != BrokerageAccountType.JOINT_TENANCY_WITH_ROS) {
                    SweepOnboardingSweepAgreementFragment.super.onAgreementAccepted(this.$view);
                    Unit unit = Unit.INSTANCE;
                } else {
                    JointAccountsOnboardingService jointAccountsOnboardingService = SweepOnboardingSweepAgreementFragment.this.getJointAccountsOnboardingService();
                    SignSweepAgreementsRequestDto signSweepAgreementsRequestDto = new SignSweepAgreementsRequestDto(account.getAccountNumber());
                    this.label = 3;
                }
                SweepOnboardingSweepAgreementFragment.this.getCallbacks().onSweepAgreementAccepted();
                return Unit.INSTANCE;
            } catch (Throwable th) {
                SweepOnboardingSweepAgreementFragment.this.getActivityErrorHandler().invoke2(th);
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: SweepOnboardingSweepAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingSweepAgreementFragment$Args;", "Landroid/os/Parcelable;", "sweepAgreement", "Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;", "isGold", "", "accountNumber", "", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;Ljava/lang/Boolean;Ljava/lang/String;)V", "getSweepAgreement", "()Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAccountNumber", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingSweepAgreementFragment$Args;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final Boolean isGold;
        private final ApiGoldSweepAgreement sweepAgreement;

        /* compiled from: SweepOnboardingSweepAgreementFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ApiGoldSweepAgreement apiGoldSweepAgreement = (ApiGoldSweepAgreement) parcel.readParcelable(Args.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Args(apiGoldSweepAgreement, boolValueOf, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ApiGoldSweepAgreement apiGoldSweepAgreement, Boolean bool, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                apiGoldSweepAgreement = args.sweepAgreement;
            }
            if ((i & 2) != 0) {
                bool = args.isGold;
            }
            if ((i & 4) != 0) {
                str = args.accountNumber;
            }
            return args.copy(apiGoldSweepAgreement, bool, str);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiGoldSweepAgreement getSweepAgreement() {
            return this.sweepAgreement;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsGold() {
            return this.isGold;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Args copy(ApiGoldSweepAgreement sweepAgreement, Boolean isGold, String accountNumber) {
            return new Args(sweepAgreement, isGold, accountNumber);
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
            return Intrinsics.areEqual(this.sweepAgreement, args.sweepAgreement) && Intrinsics.areEqual(this.isGold, args.isGold) && Intrinsics.areEqual(this.accountNumber, args.accountNumber);
        }

        public int hashCode() {
            ApiGoldSweepAgreement apiGoldSweepAgreement = this.sweepAgreement;
            int iHashCode = (apiGoldSweepAgreement == null ? 0 : apiGoldSweepAgreement.hashCode()) * 31;
            Boolean bool = this.isGold;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.accountNumber;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Args(sweepAgreement=" + this.sweepAgreement + ", isGold=" + this.isGold + ", accountNumber=" + this.accountNumber + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            int iBooleanValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.sweepAgreement, flags);
            Boolean bool = this.isGold;
            if (bool == null) {
                iBooleanValue = 0;
            } else {
                dest.writeInt(1);
                iBooleanValue = bool.booleanValue();
            }
            dest.writeInt(iBooleanValue);
            dest.writeString(this.accountNumber);
        }

        public Args(ApiGoldSweepAgreement apiGoldSweepAgreement, Boolean bool, String str) {
            this.sweepAgreement = apiGoldSweepAgreement;
            this.isGold = bool;
            this.accountNumber = str;
        }

        public /* synthetic */ Args(ApiGoldSweepAgreement apiGoldSweepAgreement, Boolean bool, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : apiGoldSweepAgreement, (i & 2) != 0 ? null : bool, str);
        }

        public final ApiGoldSweepAgreement getSweepAgreement() {
            return this.sweepAgreement;
        }

        public final Boolean isGold() {
            return this.isGold;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: SweepOnboardingSweepAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingSweepAgreementFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingSweepAgreementFragment;", "Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingSweepAgreementFragment$Args;", "<init>", "()V", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<SweepOnboardingSweepAgreementFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(SweepOnboardingSweepAgreementFragment sweepOnboardingSweepAgreementFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, sweepOnboardingSweepAgreementFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SweepOnboardingSweepAgreementFragment newInstance(Args args) {
            return (SweepOnboardingSweepAgreementFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SweepOnboardingSweepAgreementFragment sweepOnboardingSweepAgreementFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, sweepOnboardingSweepAgreementFragment, args);
        }
    }
}

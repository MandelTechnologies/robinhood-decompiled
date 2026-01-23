package com.robinhood.android.account.store.onboarding;

import bonfire.proto.idl.accounts.p028v1.AccountDashboardFooterRequestDto;
import bonfire.proto.idl.accounts.p028v1.AccountDashboardFooterResponseDto;
import bonfire.proto.idl.accounts.p028v1.AccountOnboardingEligibilityRequestDto;
import bonfire.proto.idl.accounts.p028v1.AccountOnboardingEligibilityResponseDto;
import bonfire.proto.idl.accounts.p028v1.AccountsService;
import bonfire.proto.idl.accounts.p028v1.CreateApplicationRequestDto;
import bonfire.proto.idl.accounts.p028v1.CreateApplicationResponseDto;
import bonfire.proto.idl.accounts.p028v1.FundingOptionsRequestDto;
import bonfire.proto.idl.accounts.p028v1.FundingOptionsResponseDto;
import com.robinhood.android.account.models.onboarding.FundingOptionsViewModel;
import com.robinhood.android.account.models.onboarding.FundingOptionsViewModel2;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
import com.robinhood.rosetta.converters.brokerage.ManagementTypes2;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import p479j$.time.Clock;
import p479j$.time.Duration;
import rosetta.account.BrokerageAccountTypeDto;
import rosetta.account.ManagementTypeDto;

/* compiled from: AccountOnboardingStore.kt */
@Metadata(m3635d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0086@¢\u0006\u0002\u0010!J2\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00142\b\u0010%\u001a\u0004\u0018\u00010\u00142\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020)H\u0086@¢\u0006\u0002\u0010*J \u0010+\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0086@¢\u0006\u0002\u0010,J\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00160.2\u0006\u0010$\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\tX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00160\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00160\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/account/store/onboarding/AccountOnboardingStore;", "Lcom/robinhood/store/Store;", "accountsService", "Lbonfire/proto/idl/accounts/v1/AccountsService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lbonfire/proto/idl/accounts/v1/AccountsService;Lcom/robinhood/store/StoreBundle;)V", "createApplicationEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lbonfire/proto/idl/accounts/v1/CreateApplicationRequestDto;", "Lbonfire/proto/idl/accounts/v1/CreateApplicationResponseDto;", "fundingOptionsEndpoint", "Lbonfire/proto/idl/accounts/v1/FundingOptionsRequestDto;", "Lbonfire/proto/idl/accounts/v1/FundingOptionsResponseDto;", "accountEligibilityEndpoint", "Lbonfire/proto/idl/accounts/v1/AccountOnboardingEligibilityRequestDto;", "Lbonfire/proto/idl/accounts/v1/AccountOnboardingEligibilityResponseDto;", "accountDashboardFooterCache", "", "", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lbonfire/proto/idl/accounts/v1/AccountDashboardFooterResponseDto;", "accountDashboardFooterEndpoint", "Lbonfire/proto/idl/accounts/v1/AccountDashboardFooterRequestDto;", "accountDashboardFooterQuery", "Lcom/robinhood/android/moria/db/Query;", "createApplication", "nickname", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "managementType", "Lcom/robinhood/models/api/ManagementType;", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/api/ManagementType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAccountFundingOptions", "Lcom/robinhood/android/account/models/onboarding/FundingOptionsViewModel;", "accountNumber", "entryPoint", "location", "Lbonfire/proto/idl/accounts/v1/FundingOptionsRequestDto$LocationDto;", "layout", "Lbonfire/proto/idl/accounts/v1/FundingOptionsRequestDto$LayoutDto;", "(Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/accounts/v1/FundingOptionsRequestDto$LocationDto;Lbonfire/proto/idl/accounts/v1/FundingOptionsRequestDto$LayoutDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAccountEligibility", "(Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/api/ManagementType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamAccountDashboardFooter", "Lkotlinx/coroutines/flow/Flow;", "lib-store-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AccountOnboardingStore extends Store {
    private final Map<String, StateFlow2<AccountDashboardFooterResponseDto>> accountDashboardFooterCache;
    private final Endpoint<AccountDashboardFooterRequestDto, AccountDashboardFooterResponseDto> accountDashboardFooterEndpoint;
    private final Query<String, AccountDashboardFooterResponseDto> accountDashboardFooterQuery;
    private final Endpoint<AccountOnboardingEligibilityRequestDto, AccountOnboardingEligibilityResponseDto> accountEligibilityEndpoint;
    private final AccountsService accountsService;
    private final Endpoint<CreateApplicationRequestDto, CreateApplicationResponseDto> createApplicationEndpoint;
    private final Endpoint<FundingOptionsRequestDto, FundingOptionsResponseDto> fundingOptionsEndpoint;

    /* compiled from: AccountOnboardingStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.account.store.onboarding.AccountOnboardingStore", m3645f = "AccountOnboardingStore.kt", m3646l = {97}, m3647m = "createApplication")
    /* renamed from: com.robinhood.android.account.store.onboarding.AccountOnboardingStore$createApplication$1 */
    static final class C81751 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C81751(Continuation<? super C81751> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountOnboardingStore.this.createApplication(null, null, null, this);
        }
    }

    /* compiled from: AccountOnboardingStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.account.store.onboarding.AccountOnboardingStore", m3645f = "AccountOnboardingStore.kt", m3646l = {113}, m3647m = "getAccountFundingOptions")
    /* renamed from: com.robinhood.android.account.store.onboarding.AccountOnboardingStore$getAccountFundingOptions$1 */
    static final class C81761 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C81761(Continuation<? super C81761> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountOnboardingStore.this.getAccountFundingOptions(null, null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountOnboardingStore(AccountsService accountsService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountsService, "accountsService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountsService = accountsService;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.createApplicationEndpoint = Endpoint.Companion.create$default(companion, new AccountOnboardingStore6(accountsService), storeBundle.getLogoutKillswitch(), new AccountOnboardingStore7(null), storeBundle.getClock(), null, 16, null);
        this.fundingOptionsEndpoint = Endpoint.Companion.create$default(companion, new AccountOnboardingStore8(accountsService), storeBundle.getLogoutKillswitch(), new AccountOnboardingStore9(null), storeBundle.getClock(), null, 16, null);
        this.accountEligibilityEndpoint = Endpoint.Companion.create$default(companion, new AccountOnboardingStore4(accountsService), storeBundle.getLogoutKillswitch(), new AccountOnboardingStore5(null), storeBundle.getClock(), null, 16, null);
        this.accountDashboardFooterCache = new LinkedHashMap();
        AccountOnboardingStore2 accountOnboardingStore2 = new AccountOnboardingStore2(accountsService);
        LogoutKillswitch logoutKillswitch = storeBundle.getLogoutKillswitch();
        AccountOnboardingStore3 accountOnboardingStore3 = new AccountOnboardingStore3(this, null);
        Clock clock = storeBundle.getClock();
        Duration durationOfHours = Duration.ofHours(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfHours, "ofHours(...)");
        this.accountDashboardFooterEndpoint = companion.createWithParams(accountOnboardingStore2, logoutKillswitch, accountOnboardingStore3, clock, new DefaultStaleDecider(durationOfHours, storeBundle.getClock()));
        this.accountDashboardFooterQuery = Store.create$default(this, Query.INSTANCE, "accountDashboardFooterQuery", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.android.account.store.onboarding.AccountOnboardingStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOnboardingStore.accountDashboardFooterQuery$lambda$0(this.f$0, (String) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.account.store.onboarding.AccountOnboardingStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOnboardingStore.accountDashboardFooterQuery$lambda$2(this.f$0, (String) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job accountDashboardFooterQuery$lambda$0(AccountOnboardingStore accountOnboardingStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Endpoint<AccountDashboardFooterRequestDto, AccountDashboardFooterResponseDto> endpoint = accountOnboardingStore.accountDashboardFooterEndpoint;
        AccountDashboardFooterRequestDto accountDashboardFooterRequestDto = new AccountDashboardFooterRequestDto(accountNumber);
        StateFlow2<AccountDashboardFooterResponseDto> stateFlow2 = accountOnboardingStore.accountDashboardFooterCache.get(accountNumber);
        return Endpoint.DefaultImpls.refresh$default(endpoint, accountDashboardFooterRequestDto, (stateFlow2 != null ? stateFlow2.getValue() : null) == null, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow accountDashboardFooterQuery$lambda$2(AccountOnboardingStore accountOnboardingStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Map<String, StateFlow2<AccountDashboardFooterResponseDto>> map = accountOnboardingStore.accountDashboardFooterCache;
        StateFlow2<AccountDashboardFooterResponseDto> stateFlow2MutableStateFlow = map.get(accountNumber);
        if (stateFlow2MutableStateFlow == null) {
            stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(null);
            map.put(accountNumber, stateFlow2MutableStateFlow);
        }
        return stateFlow2MutableStateFlow;
    }

    public static /* synthetic */ Object createApplication$default(AccountOnboardingStore accountOnboardingStore, String str, BrokerageAccountType brokerageAccountType, ManagementType managementType, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return accountOnboardingStore.createApplication(str, brokerageAccountType, managementType, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createApplication(String str, BrokerageAccountType brokerageAccountType, ManagementType managementType, Continuation<? super String> continuation) {
        C81751 c81751;
        if (continuation instanceof C81751) {
            c81751 = (C81751) continuation;
            int i = c81751.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c81751.label = i - Integer.MIN_VALUE;
            } else {
                c81751 = new C81751(continuation);
            }
        }
        Object objRaw = c81751.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c81751.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRaw);
            Endpoint<CreateApplicationRequestDto, CreateApplicationResponseDto> endpoint = this.createApplicationEndpoint;
            CreateApplicationRequestDto createApplicationRequestDto = new CreateApplicationRequestDto(BrokerageAccountTypeDto.INSTANCE.fromProto(BrokerageAccountTypes3.toProtobuf(brokerageAccountType)), ManagementTypeDto.INSTANCE.fromProto(ManagementTypes2.toProtobuf(managementType)), false, false, false, false, str, 60, null);
            c81751.label = 1;
            objRaw = endpoint.raw(createApplicationRequestDto, c81751);
            if (objRaw == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRaw);
        }
        return ((CreateApplicationResponseDto) objRaw).getApplication_id();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAccountFundingOptions(String str, String str2, FundingOptionsRequestDto.LocationDto locationDto, FundingOptionsRequestDto.LayoutDto layoutDto, Continuation<? super FundingOptionsViewModel> continuation) {
        C81761 c81761;
        if (continuation instanceof C81761) {
            c81761 = (C81761) continuation;
            int i = c81761.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c81761.label = i - Integer.MIN_VALUE;
            } else {
                c81761 = new C81761(continuation);
            }
        }
        Object objRaw = c81761.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c81761.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRaw);
            Endpoint<FundingOptionsRequestDto, FundingOptionsResponseDto> endpoint = this.fundingOptionsEndpoint;
            FundingOptionsRequestDto fundingOptionsRequestDto = new FundingOptionsRequestDto(str, str2, locationDto, layoutDto);
            c81761.label = 1;
            objRaw = endpoint.raw(fundingOptionsRequestDto, c81761);
            if (objRaw == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRaw);
        }
        return FundingOptionsViewModel2.toDbModel((FundingOptionsResponseDto) objRaw);
    }

    public final Object getAccountEligibility(BrokerageAccountType brokerageAccountType, ManagementType managementType, Continuation<? super AccountOnboardingEligibilityResponseDto> continuation) {
        rosetta.account.ManagementType protobuf;
        return Endpoint.DefaultImpls.forceFetch$default(this.accountEligibilityEndpoint, new AccountOnboardingEligibilityRequestDto(BrokerageAccountTypeDto.INSTANCE.fromProto(BrokerageAccountTypes3.toProtobuf(brokerageAccountType)), (managementType == null || (protobuf = ManagementTypes2.toProtobuf(managementType)) == null) ? null : ManagementTypeDto.INSTANCE.fromProto(protobuf)), null, continuation, 2, null);
    }

    public final Flow<AccountDashboardFooterResponseDto> streamAccountDashboardFooter(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return this.accountDashboardFooterQuery.asFlow(accountNumber);
    }
}

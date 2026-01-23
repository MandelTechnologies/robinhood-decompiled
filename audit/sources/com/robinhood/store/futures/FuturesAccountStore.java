package com.robinhood.store.futures;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import com.robinhood.android.idl.common.pagination.IdlPaginationEndpoint;
import com.robinhood.android.idl.common.pagination.IdlPaginationEndpoint2;
import com.robinhood.android.lib.api.futures.FuturesBrokebackApi;
import com.robinhood.android.models.futures.api.ApiFuturesBuyingPower;
import com.robinhood.android.models.futures.api.account.FuturesAccountType;
import com.robinhood.android.models.futures.dao.FuturesAccountDao;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.models.futures.p192ui.CreateFuturesAccountResult;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.ceres.p284v1.AccountFuturesEligibilityStatusDto;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.CreateFuturesAccountRequestDto;
import com.robinhood.ceres.p284v1.EvaluateCheckpointSuitabilityRequestDto;
import com.robinhood.ceres.p284v1.EvaluateCheckpointSuitabilityResponseDto;
import com.robinhood.ceres.p284v1.GetAccountsResponseDto;
import com.robinhood.ceres.p284v1.GetCheckpointSuitabilityRequestDto;
import com.robinhood.ceres.p284v1.GetCheckpointSuitabilityResponseDto;
import com.robinhood.ceres.p284v1.MarkAttestationsSignedRequestDto;
import com.robinhood.ceres.p284v1.SuitabilityCheckpointDto;
import com.robinhood.models.p320db.Account;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.futures.idl.FuturesPaginationExtensions;
import com.robinhood.store.futures.mib.MiBFuturesAccountPlugin;
import com.robinhood.store.futures.mib.MiBFuturesAccountProvider;
import com.robinhood.store.futures.mib.MiBFuturesState;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.Uuids;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Timeout6;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import timber.log.Timber;

/* compiled from: FuturesAccountStore.kt */
@Metadata(m3635d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0.2\b\u0010/\u001a\u0004\u0018\u00010\u001cH\u0002J\u0018\u00100\u001a\b\u0012\u0004\u0012\u00020\u001c0.2\b\u0010/\u001a\u0004\u0018\u00010\u001cH\u0002J\u0006\u00101\u001a\u00020\u0019J\u0018\u00102\u001a\b\u0012\u0004\u0012\u00020\u00160.2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u001cJ\u001e\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150.2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001cJ\u001e\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00150.2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001cJ\u0018\u00106\u001a\b\u0012\u0004\u0012\u00020 0.2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001cJ\u001a\u00107\u001a\u0004\u0018\u00010\u001c2\b\u0010/\u001a\u0004\u0018\u00010\u001cH\u0086@¢\u0006\u0002\u00108J\u001c\u00109\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u001cH\u0086@¢\u0006\u0002\u00108J\u001a\u0010:\u001a\u00020 2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u001cH\u0086@¢\u0006\u0002\u00108J\u001c\u0010;\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u001cH\u0086@¢\u0006\u0002\u00108J\u001a\u0010<\u001a\u00020\u001c2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u001cH\u0086@¢\u0006\u0002\u00108J\u0018\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00160.2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u001cJ\u001e\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150.2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u001cJ\u001e\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00150.2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u001cJ\u0018\u0010@\u001a\b\u0012\u0004\u0012\u00020 0.2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u001cJ\u001e\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150.2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001cJ\u001a\u0010B\u001a\u00020 2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u001cH\u0086@¢\u0006\u0002\u00108J\u001c\u0010C\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u001cH\u0086@¢\u0006\u0002\u00108J\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020)0.2\u0006\u00104\u001a\u00020\u001cJ\u0018\u0010E\u001a\u0004\u0018\u00010 2\u0006\u0010F\u001a\u00020GH\u0086@¢\u0006\u0002\u0010HJ\u0016\u0010I\u001a\u00020\u00122\u0006\u00104\u001a\u00020\u001cH\u0086@¢\u0006\u0002\u00108J\u0018\u0010M\u001a\b\u0012\u0004\u0012\u00020K0.2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u001cJ\u0016\u0010N\u001a\u00020\u00192\u0006\u0010O\u001a\u00020\u001cH\u0086@¢\u0006\u0002\u00108J\u0018\u0010P\u001a\u0004\u0018\u00010Q2\u0006\u0010R\u001a\u00020SH\u0086@¢\u0006\u0002\u0010TJ\u0018\u0010U\u001a\u0004\u0018\u00010V2\u0006\u0010R\u001a\u00020SH\u0086@¢\u0006\u0002\u0010TJ\u000e\u0010W\u001a\u00020XH\u0096A¢\u0006\u0002\u0010YJ\u0011\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0.H\u0096\u0001J\u0011\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\\0.H\u0096\u0001J\u0011\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\\0.H\u0096\u0001J\u000f\u0010^\u001a\b\u0012\u0004\u0012\u00020X0.H\u0096\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001a0\u0018X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\"X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020)0+X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020)0\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010J\u001a\b\u0012\u0004\u0012\u00020K0(X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020K0+X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020K0\"X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006_"}, m3636d2 = {"Lcom/robinhood/store/futures/FuturesAccountStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/store/futures/mib/MiBFuturesAccountProvider;", "accountDao", "Lcom/robinhood/android/models/futures/dao/FuturesAccountDao;", "futuresBrokebackApi", "Lcom/robinhood/android/lib/api/futures/FuturesBrokebackApi;", "ceres", "Lcom/robinhood/ceres/v1/Ceres;", "mibFuturesAccountPlugin", "Lcom/robinhood/store/futures/mib/MiBFuturesAccountPlugin;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/models/futures/dao/FuturesAccountDao;Lcom/robinhood/android/lib/api/futures/FuturesBrokebackApi;Lcom/robinhood/ceres/v1/Ceres;Lcom/robinhood/store/futures/mib/MiBFuturesAccountPlugin;Lcom/robinhood/store/StoreBundle;)V", "createAccountEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/ceres/v1/CreateFuturesAccountRequestDto;", "Lcom/robinhood/android/models/futures/ui/CreateFuturesAccountResult;", "signAttestationEndpoint", "Lcom/robinhood/ceres/v1/MarkAttestationsSignedRequestDto;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "allAccountsEndpoint", "Lcom/robinhood/android/idl/common/pagination/IdlPaginatedEndpoint;", "", "Lcom/robinhood/ceres/v1/GetAccountsResponseDto;", "accountsEndpoint", "", "getAccountsEndpoint$lib_store_futures_externalDebug", "()Lcom/robinhood/android/idl/common/pagination/IdlPaginatedEndpoint;", "cachedFuturesAccountId", "Ljava/util/UUID;", "queryFuturesAccount", "Lcom/robinhood/android/moria/db/Query;", "cachedEventContractSwapsAccountId", "queryEventContractSwapsAccount", "getQueryEventContractSwapsAccount$lib_store_futures_externalDebug", "()Lcom/robinhood/android/moria/db/Query;", "accountEligibilityStatusCache", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/robinhood/ceres/v1/AccountFuturesEligibilityStatusDto;", "accountEligibilityStatusEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "queryFuturesEligibilityStatus", "streamRhsAccountNumberAllowedForFutures", "Lkotlinx/coroutines/flow/Flow;", "optionalRhsAccountNumber", "streamNotNullRhsAccountNumberAllowedForFutures", "refreshAllAccounts", "streamFuturesAccount", "streamOptionalFuturesAccount", "rhsAccountNumber", "streamOptionalFuturesAccountId", "streamFuturesAccountId", "getRhdAccountNumber", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFuturesAccountIdOrNull", "getFuturesAccountId", "getFuturesAccountIdStringOrNull", "getFuturesAccountIdString", "streamEventContractSwapsAccount", "streamOptionalEventContractSwapsAccount", "streamOptionalEventContractSwapsAccountId", "streamEventContractSwapsAccountId", "streamOptionalEventContractSwapsAccountForced", "getEventContractSwapsAccountId", "getEventContractSwapsAccountIdOrNull", "streamFuturesAccountEligibilityStatus", "getRhdAccountId", "accountType", "Lcom/robinhood/android/models/futures/api/account/FuturesAccountType;", "(Lcom/robinhood/android/models/futures/api/account/FuturesAccountType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createAccount", "buyingPowerCache", "Lcom/robinhood/android/models/futures/api/ApiFuturesBuyingPower;", "buyingPowerEndpoint", "streamBuyingPower", "signEventAttestationIfNecessary", "attestation", "evaluateSuitability", "Lcom/robinhood/ceres/v1/EvaluateCheckpointSuitabilityResponseDto;", "checkpoint", "Lcom/robinhood/ceres/v1/SuitabilityCheckpointDto;", "(Lcom/robinhood/ceres/v1/SuitabilityCheckpointDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkSuitability", "Lcom/robinhood/ceres/v1/GetCheckpointSuitabilityResponseDto;", "forceGetMibFuturesState", "Lcom/robinhood/store/futures/mib/MiBFuturesState;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamRhsAccountNumberWithFuturesAccountAllowed", "streamRhsAccountWithFuturesAccount", "Lcom/robinhood/models/db/Account;", "streamRhsAccountWithFuturesAccountAllowed", "streamUserMiBFuturesState", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class FuturesAccountStore extends Store implements MiBFuturesAccountProvider {
    private final FuturesAccountDao accountDao;
    private final SharedFlow2<AccountFuturesEligibilityStatusDto> accountEligibilityStatusCache;
    private final Endpoint<String, AccountFuturesEligibilityStatusDto> accountEligibilityStatusEndpoint;
    private final IdlPaginationEndpoint<String, GetAccountsResponseDto> accountsEndpoint;
    private final IdlPaginationEndpoint<Unit, GetAccountsResponseDto> allAccountsEndpoint;
    private final SharedFlow2<ApiFuturesBuyingPower> buyingPowerCache;
    private final Endpoint<String, ApiFuturesBuyingPower> buyingPowerEndpoint;
    private UUID cachedEventContractSwapsAccountId;
    private UUID cachedFuturesAccountId;
    private final Ceres ceres;
    private final PostEndpoint<CreateFuturesAccountRequestDto, CreateFuturesAccountResult> createAccountEndpoint;
    private final FuturesBrokebackApi futuresBrokebackApi;
    private final MiBFuturesAccountPlugin mibFuturesAccountPlugin;
    private final Query<String, Optional<FuturesAccount>> queryEventContractSwapsAccount;
    private final Query<String, Optional<FuturesAccount>> queryFuturesAccount;
    private final Query<String, AccountFuturesEligibilityStatusDto> queryFuturesEligibilityStatus;
    private final PostEndpoint<MarkAttestationsSignedRequestDto, Optional<FuturesAccount>> signAttestationEndpoint;
    private final Query<String, ApiFuturesBuyingPower> streamBuyingPower;

    /* compiled from: FuturesAccountStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FuturesAccountType.values().length];
            try {
                iArr[FuturesAccountType.FUTURES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FuturesAccountType.EVENT_CONTRACT_SWAPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FuturesAccountType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: FuturesAccountStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesAccountStore", m3645f = "FuturesAccountStore.kt", m3646l = {426, 428, 434}, m3647m = "checkSuitability")
    /* renamed from: com.robinhood.store.futures.FuturesAccountStore$checkSuitability$1 */
    static final class C414321 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C414321(Continuation<? super C414321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesAccountStore.this.checkSuitability(null, this);
        }
    }

    /* compiled from: FuturesAccountStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesAccountStore", m3645f = "FuturesAccountStore.kt", m3646l = {404, 406, 412}, m3647m = "evaluateSuitability")
    /* renamed from: com.robinhood.store.futures.FuturesAccountStore$evaluateSuitability$1 */
    static final class C414341 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C414341(Continuation<? super C414341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesAccountStore.this.evaluateSuitability(null, this);
        }
    }

    /* compiled from: FuturesAccountStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesAccountStore", m3645f = "FuturesAccountStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE}, m3647m = "getEventContractSwapsAccountId")
    /* renamed from: com.robinhood.store.futures.FuturesAccountStore$getEventContractSwapsAccountId$1 */
    static final class C414361 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C414361(Continuation<? super C414361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesAccountStore.this.getEventContractSwapsAccountId(null, this);
        }
    }

    /* compiled from: FuturesAccountStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesAccountStore", m3645f = "FuturesAccountStore.kt", m3646l = {333}, m3647m = "getEventContractSwapsAccountIdOrNull")
    /* renamed from: com.robinhood.store.futures.FuturesAccountStore$getEventContractSwapsAccountIdOrNull$1 */
    static final class C414371 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C414371(Continuation<? super C414371> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesAccountStore.this.getEventContractSwapsAccountIdOrNull(null, this);
        }
    }

    /* compiled from: FuturesAccountStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesAccountStore", m3645f = "FuturesAccountStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE}, m3647m = "getFuturesAccountId")
    /* renamed from: com.robinhood.store.futures.FuturesAccountStore$getFuturesAccountId$1 */
    static final class C414381 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C414381(Continuation<? super C414381> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesAccountStore.this.getFuturesAccountId(null, this);
        }
    }

    /* compiled from: FuturesAccountStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesAccountStore", m3645f = "FuturesAccountStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE}, m3647m = "getFuturesAccountIdOrNull")
    /* renamed from: com.robinhood.store.futures.FuturesAccountStore$getFuturesAccountIdOrNull$1 */
    static final class C414391 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C414391(Continuation<? super C414391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesAccountStore.this.getFuturesAccountIdOrNull(null, this);
        }
    }

    /* compiled from: FuturesAccountStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesAccountStore", m3645f = "FuturesAccountStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE}, m3647m = "getFuturesAccountIdString")
    /* renamed from: com.robinhood.store.futures.FuturesAccountStore$getFuturesAccountIdString$1 */
    static final class C414401 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C414401(Continuation<? super C414401> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesAccountStore.this.getFuturesAccountIdString(null, this);
        }
    }

    /* compiled from: FuturesAccountStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesAccountStore", m3645f = "FuturesAccountStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE}, m3647m = "getFuturesAccountIdStringOrNull")
    /* renamed from: com.robinhood.store.futures.FuturesAccountStore$getFuturesAccountIdStringOrNull$1 */
    static final class C414411 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C414411(Continuation<? super C414411> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesAccountStore.this.getFuturesAccountIdStringOrNull(null, this);
        }
    }

    /* compiled from: FuturesAccountStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesAccountStore", m3645f = "FuturesAccountStore.kt", m3646l = {389, 391}, m3647m = "signEventAttestationIfNecessary")
    /* renamed from: com.robinhood.store.futures.FuturesAccountStore$signEventAttestationIfNecessary$1 */
    static final class C414421 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C414421(Continuation<? super C414421> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesAccountStore.this.signEventAttestationIfNecessary(null, this);
        }
    }

    @Override // com.robinhood.store.futures.mib.MiBFuturesAccountProvider
    public Object forceGetMibFuturesState(Continuation<? super MiBFuturesState> continuation) {
        return this.mibFuturesAccountPlugin.forceGetMibFuturesState(continuation);
    }

    @Override // com.robinhood.store.futures.mib.MiBFuturesAccountProvider
    public Flow<String> streamRhsAccountNumberWithFuturesAccountAllowed() {
        return this.mibFuturesAccountPlugin.streamRhsAccountNumberWithFuturesAccountAllowed();
    }

    @Override // com.robinhood.store.futures.mib.MiBFuturesAccountProvider
    public Flow<Account> streamRhsAccountWithFuturesAccount() {
        return this.mibFuturesAccountPlugin.streamRhsAccountWithFuturesAccount();
    }

    @Override // com.robinhood.store.futures.mib.MiBFuturesAccountProvider
    public Flow<Account> streamRhsAccountWithFuturesAccountAllowed() {
        return this.mibFuturesAccountPlugin.streamRhsAccountWithFuturesAccountAllowed();
    }

    @Override // com.robinhood.store.futures.mib.MiBFuturesAccountProvider
    public Flow<MiBFuturesState> streamUserMiBFuturesState() {
        return this.mibFuturesAccountPlugin.streamUserMiBFuturesState();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAccountStore(FuturesAccountDao accountDao, FuturesBrokebackApi futuresBrokebackApi, Ceres ceres, MiBFuturesAccountPlugin mibFuturesAccountPlugin, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountDao, "accountDao");
        Intrinsics.checkNotNullParameter(futuresBrokebackApi, "futuresBrokebackApi");
        Intrinsics.checkNotNullParameter(ceres, "ceres");
        Intrinsics.checkNotNullParameter(mibFuturesAccountPlugin, "mibFuturesAccountPlugin");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountDao = accountDao;
        this.futuresBrokebackApi = futuresBrokebackApi;
        this.ceres = ceres;
        this.mibFuturesAccountPlugin = mibFuturesAccountPlugin;
        PostEndpoint.Companion companion = PostEndpoint.INSTANCE;
        this.createAccountEndpoint = companion.create(new FuturesAccountStore$createAccountEndpoint$1(this, null), new FuturesAccountStore$createAccountEndpoint$2(this, null));
        this.signAttestationEndpoint = companion.create(new FuturesAccountStore$signAttestationEndpoint$1(this, null), new FuturesAccountStore$signAttestationEndpoint$2(this, null));
        IdlPaginationEndpoint.Companion companion2 = IdlPaginationEndpoint.INSTANCE;
        this.allAccountsEndpoint = IdlPaginationEndpoint.Companion.create$default(companion2, new FuturesAccountStore$allAccountsEndpoint$1(this, null), new Function1() { // from class: com.robinhood.store.futures.FuturesAccountStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesAccountStore.allAccountsEndpoint$lambda$0((GetAccountsResponseDto) obj);
            }
        }, new Function1() { // from class: com.robinhood.store.futures.FuturesAccountStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesAccountStore.allAccountsEndpoint$lambda$1((GetAccountsResponseDto) obj);
            }
        }, getLogoutKillswitch(), new FuturesAccountStore$allAccountsEndpoint$4(this, null), storeBundle.getClock(), null, 64, null);
        this.accountsEndpoint = IdlPaginationEndpoint.Companion.create$default(companion2, new FuturesAccountStore$accountsEndpoint$1(this, null), new Function1() { // from class: com.robinhood.store.futures.FuturesAccountStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesAccountStore.accountsEndpoint$lambda$2((GetAccountsResponseDto) obj);
            }
        }, new Function1() { // from class: com.robinhood.store.futures.FuturesAccountStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesAccountStore.accountsEndpoint$lambda$3((GetAccountsResponseDto) obj);
            }
        }, getLogoutKillswitch(), new FuturesAccountStore$accountsEndpoint$4(this, null), storeBundle.getClock(), null, 64, null);
        Query.Companion companion3 = Query.INSTANCE;
        this.queryFuturesAccount = Query.Companion.create$default(companion3, storeBundle.getRxFactory(), "queryFuturesAccount", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.store.futures.FuturesAccountStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesAccountStore.queryFuturesAccount$lambda$4(this.f$0, (String) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.futures.FuturesAccountStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesAccountStore.queryFuturesAccount$lambda$7(this.f$0, (String) obj);
            }
        }, false, 16, null);
        this.queryEventContractSwapsAccount = Query.Companion.create$default(companion3, storeBundle.getRxFactory(), "queryEventContractSwapsAccount", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.store.futures.FuturesAccountStore$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesAccountStore.queryEventContractSwapsAccount$lambda$8(this.f$0, (String) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.futures.FuturesAccountStore$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesAccountStore.queryEventContractSwapsAccount$lambda$11(this.f$0, (String) obj);
            }
        }, false, 16, null);
        this.accountEligibilityStatusCache = SharedFlow4.MutableSharedFlow$default(1, 0, null, 6, null);
        Endpoint.Companion companion4 = Endpoint.INSTANCE;
        Endpoint<String, AccountFuturesEligibilityStatusDto> endpointCreate$default = Endpoint.Companion.create$default(companion4, new FuturesAccountStore$accountEligibilityStatusEndpoint$1(this, null), getLogoutKillswitch(), new FuturesAccountStore$accountEligibilityStatusEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.accountEligibilityStatusEndpoint = endpointCreate$default;
        this.queryFuturesEligibilityStatus = Store.create$default(this, companion3, "queryFuturesEligibilityStatus", CollectionsKt.listOf(new PollEach(getStoreScope(), new FuturesAccountStore$queryFuturesEligibilityStatus$1(endpointCreate$default))), new Function1() { // from class: com.robinhood.store.futures.FuturesAccountStore$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesAccountStore.queryFuturesEligibilityStatus$lambda$12(this.f$0, (String) obj);
            }
        }, false, 8, null);
        this.buyingPowerCache = SharedFlow4.MutableSharedFlow$default(1, 0, null, 6, null);
        Endpoint<String, ApiFuturesBuyingPower> endpointCreate$default2 = Endpoint.Companion.create$default(companion4, new FuturesAccountStore$buyingPowerEndpoint$1(this, null), storeBundle.getLogoutKillswitch(), new FuturesAccountStore$buyingPowerEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.buyingPowerEndpoint = endpointCreate$default2;
        this.streamBuyingPower = Store.create$default(this, companion3, "streamFuturesBuyingPower", CollectionsKt.listOf(new PollEach(getStoreScope(), new C414431(endpointCreate$default2))), new Function1() { // from class: com.robinhood.store.futures.FuturesAccountStore$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesAccountStore.streamBuyingPower$lambda$23(this.f$0, (String) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdlPaginationCursor allAccountsEndpoint$lambda$0(GetAccountsResponseDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return FuturesPaginationExtensions.toIdlPaginationCursor(it.getPrevious());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdlPaginationCursor allAccountsEndpoint$lambda$1(GetAccountsResponseDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return FuturesPaginationExtensions.toIdlPaginationCursor(it.getNext());
    }

    public final IdlPaginationEndpoint<String, GetAccountsResponseDto> getAccountsEndpoint$lib_store_futures_externalDebug() {
        return this.accountsEndpoint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdlPaginationCursor accountsEndpoint$lambda$2(GetAccountsResponseDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return FuturesPaginationExtensions.toIdlPaginationCursor(it.getPrevious());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdlPaginationCursor accountsEndpoint$lambda$3(GetAccountsResponseDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return FuturesPaginationExtensions.toIdlPaginationCursor(it.getNext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job queryFuturesAccount$lambda$4(FuturesAccountStore futuresAccountStore, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return IdlPaginationEndpoint.DefaultImpls.refreshAllPages$default(futuresAccountStore.accountsEndpoint, it, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryFuturesAccount$lambda$7(FuturesAccountStore futuresAccountStore, String rhsAccountNumber) {
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        final Flow<List<FuturesAccount>> accounts2 = futuresAccountStore.accountDao.getAccounts(rhsAccountNumber);
        return FlowKt.onEach(new Flow<Optional<? extends FuturesAccount>>() { // from class: com.robinhood.store.futures.FuturesAccountStore$queryFuturesAccount$lambda$7$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Optional<? extends FuturesAccount>> flowCollector, Continuation continuation) {
                Object objCollect = accounts2.collect(new C414212(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.futures.FuturesAccountStore$queryFuturesAccount$lambda$7$$inlined$map$1$2 */
            public static final class C414212<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesAccountStore$queryFuturesAccount$lambda$7$$inlined$map$1$2", m3645f = "FuturesAccountStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.futures.FuturesAccountStore$queryFuturesAccount$lambda$7$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C414212.this.emit(null, this);
                    }
                }

                public C414212(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    T next;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Iterator<T> it = ((List) obj).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it.next();
                            if (((FuturesAccount) next).getAccountType() == FuturesAccountType.FUTURES) {
                                break;
                            }
                        }
                        Optional optionalAsOptional = Optional3.asOptional(next);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(optionalAsOptional, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        }, new FuturesAccountStore$queryFuturesAccount$2$2(futuresAccountStore, null));
    }

    /* renamed from: getQueryEventContractSwapsAccount$lib_store_futures_externalDebug */
    public final Query<String, Optional<FuturesAccount>> m2961x278c8be4() {
        return this.queryEventContractSwapsAccount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job queryEventContractSwapsAccount$lambda$8(FuturesAccountStore futuresAccountStore, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return IdlPaginationEndpoint.DefaultImpls.refreshAllPages$default(futuresAccountStore.accountsEndpoint, it, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryEventContractSwapsAccount$lambda$11(FuturesAccountStore futuresAccountStore, String rhsAccountNumber) {
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        final Flow<List<FuturesAccount>> accounts2 = futuresAccountStore.accountDao.getAccounts(rhsAccountNumber);
        return FlowKt.onEach(new Flow<Optional<? extends FuturesAccount>>() { // from class: com.robinhood.store.futures.FuturesAccountStore$queryEventContractSwapsAccount$lambda$11$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Optional<? extends FuturesAccount>> flowCollector, Continuation continuation) {
                Object objCollect = accounts2.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.futures.FuturesAccountStore$queryEventContractSwapsAccount$lambda$11$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesAccountStore$queryEventContractSwapsAccount$lambda$11$$inlined$map$1$2", m3645f = "FuturesAccountStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.futures.FuturesAccountStore$queryEventContractSwapsAccount$lambda$11$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    T next;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Iterator<T> it = ((List) obj).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it.next();
                            if (((FuturesAccount) next).getAccountType() == FuturesAccountType.EVENT_CONTRACT_SWAPS) {
                                break;
                            }
                        }
                        Optional optionalAsOptional = Optional3.asOptional(next);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(optionalAsOptional, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        }, new FuturesAccountStore$queryEventContractSwapsAccount$2$2(futuresAccountStore, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryFuturesEligibilityStatus$lambda$12(FuturesAccountStore futuresAccountStore, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return FlowKt.asSharedFlow(futuresAccountStore.accountEligibilityStatusCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<String> streamRhsAccountNumberAllowedForFutures(String optionalRhsAccountNumber) {
        if (optionalRhsAccountNumber != null) {
            return FlowKt.flowOf(optionalRhsAccountNumber);
        }
        return streamRhsAccountNumberWithFuturesAccountAllowed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<String> streamNotNullRhsAccountNumberAllowedForFutures(String optionalRhsAccountNumber) {
        return FlowKt.filterNotNull(streamRhsAccountNumberAllowedForFutures(optionalRhsAccountNumber));
    }

    public final void refreshAllAccounts() {
        IdlPaginationEndpoint2.refreshAllPages$default(this.allAccountsEndpoint, false, 1, null);
    }

    public static /* synthetic */ Flow streamFuturesAccount$default(FuturesAccountStore futuresAccountStore, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return futuresAccountStore.streamFuturesAccount(str);
    }

    public final Flow<FuturesAccount> streamFuturesAccount(String optionalRhsAccountNumber) {
        final Flow<Optional<FuturesAccount>> flowStreamOptionalFuturesAccount = streamOptionalFuturesAccount(optionalRhsAccountNumber);
        return new Flow<FuturesAccount>() { // from class: com.robinhood.store.futures.FuturesAccountStore$streamFuturesAccount$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super FuturesAccount> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamOptionalFuturesAccount.collect(new C414242(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.futures.FuturesAccountStore$streamFuturesAccount$$inlined$mapNotNull$1$2 */
            public static final class C414242<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesAccountStore$streamFuturesAccount$$inlined$mapNotNull$1$2", m3645f = "FuturesAccountStore.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.store.futures.FuturesAccountStore$streamFuturesAccount$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C414242.this.emit(null, this);
                    }
                }

                public C414242(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Object orNull = ((Optional) obj).getOrNull();
                        if (orNull != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(orNull, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
    }

    public static /* synthetic */ Flow streamOptionalFuturesAccount$default(FuturesAccountStore futuresAccountStore, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return futuresAccountStore.streamOptionalFuturesAccount(str);
    }

    public final Flow<Optional<FuturesAccount>> streamOptionalFuturesAccount(String rhsAccountNumber) {
        return FlowKt.transformLatest(streamNotNullRhsAccountNumberAllowedForFutures(rhsAccountNumber), new C41430xf4061801(null, this));
    }

    public static /* synthetic */ Flow streamOptionalFuturesAccountId$default(FuturesAccountStore futuresAccountStore, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return futuresAccountStore.streamOptionalFuturesAccountId(str);
    }

    public final Flow<Optional<UUID>> streamOptionalFuturesAccountId(String rhsAccountNumber) {
        final Flow<Optional<FuturesAccount>> flowStreamOptionalFuturesAccount = streamOptionalFuturesAccount(rhsAccountNumber);
        return FlowKt.distinctUntilChanged(new Flow<Optional<? extends UUID>>() { // from class: com.robinhood.store.futures.FuturesAccountStore$streamOptionalFuturesAccountId$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Optional<? extends UUID>> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamOptionalFuturesAccount.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.futures.FuturesAccountStore$streamOptionalFuturesAccountId$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesAccountStore$streamOptionalFuturesAccountId$$inlined$map$1$2", m3645f = "FuturesAccountStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.futures.FuturesAccountStore$streamOptionalFuturesAccountId$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        FuturesAccount futuresAccount = (FuturesAccount) ((Optional) obj).component1();
                        Optional optionalAsOptional = Optional3.asOptional(futuresAccount != null ? futuresAccount.getId() : null);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(optionalAsOptional, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        });
    }

    public static /* synthetic */ Flow streamFuturesAccountId$default(FuturesAccountStore futuresAccountStore, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return futuresAccountStore.streamFuturesAccountId(str);
    }

    public final Flow<UUID> streamFuturesAccountId(String rhsAccountNumber) {
        final Flow<FuturesAccount> flowStreamFuturesAccount = streamFuturesAccount(rhsAccountNumber);
        return new Flow<UUID>() { // from class: com.robinhood.store.futures.FuturesAccountStore$streamFuturesAccountId$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super UUID> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamFuturesAccount.collect(new C414252(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.futures.FuturesAccountStore$streamFuturesAccountId$$inlined$mapNotNull$1$2 */
            public static final class C414252<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesAccountStore$streamFuturesAccountId$$inlined$mapNotNull$1$2", m3645f = "FuturesAccountStore.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.store.futures.FuturesAccountStore$streamFuturesAccountId$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C414252.this.emit(null, this);
                    }
                }

                public C414252(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        UUID id = ((FuturesAccount) obj).getId();
                        if (id != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(id, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
    }

    public final Object getRhdAccountNumber(String str, Continuation<? super String> continuation) {
        final Flow<FuturesAccount> flowStreamFuturesAccount = streamFuturesAccount(str);
        return FlowKt.firstOrNull(new Flow<String>() { // from class: com.robinhood.store.futures.FuturesAccountStore$getRhdAccountNumber$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation2) {
                Object objCollect = flowStreamFuturesAccount.collect(new C414192(flowCollector), continuation2);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.futures.FuturesAccountStore$getRhdAccountNumber$$inlined$mapNotNull$1$2 */
            public static final class C414192<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesAccountStore$getRhdAccountNumber$$inlined$mapNotNull$1$2", m3645f = "FuturesAccountStore.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.store.futures.FuturesAccountStore$getRhdAccountNumber$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C414192.this.emit(null, this);
                    }
                }

                public C414192(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        String rhdAccountNumber = ((FuturesAccount) obj).getRhdAccountNumber();
                        if (rhdAccountNumber != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(rhdAccountNumber, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        }, continuation);
    }

    public static /* synthetic */ Object getFuturesAccountIdOrNull$default(FuturesAccountStore futuresAccountStore, String str, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return futuresAccountStore.getFuturesAccountIdOrNull(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getFuturesAccountIdOrNull(String str, Continuation<? super UUID> continuation) {
        C414391 c414391;
        if (continuation instanceof C414391) {
            c414391 = (C414391) continuation;
            int i = c414391.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c414391.label = i - Integer.MIN_VALUE;
            } else {
                c414391 = new C414391(continuation);
            }
        }
        Object objFirstOrNull = c414391.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c414391.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            UUID uuid = this.cachedFuturesAccountId;
            if (uuid != null) {
                return uuid;
            }
            Flow<FuturesAccount> flowStreamFuturesAccount = streamFuturesAccount(str);
            c414391.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowStreamFuturesAccount, c414391);
            if (objFirstOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirstOrNull);
        }
        FuturesAccount futuresAccount = (FuturesAccount) objFirstOrNull;
        if (futuresAccount != null) {
            return futuresAccount.getId();
        }
        return null;
    }

    public static /* synthetic */ Object getFuturesAccountId$default(FuturesAccountStore futuresAccountStore, String str, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return futuresAccountStore.getFuturesAccountId(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getFuturesAccountId(String str, Continuation<? super UUID> continuation) {
        C414381 c414381;
        if (continuation instanceof C414381) {
            c414381 = (C414381) continuation;
            int i = c414381.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c414381.label = i - Integer.MIN_VALUE;
            } else {
                c414381 = new C414381(continuation);
            }
        }
        Object objFirst = c414381.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c414381.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            UUID uuid = this.cachedFuturesAccountId;
            if (uuid != null) {
                return uuid;
            }
            Flow<FuturesAccount> flowStreamFuturesAccount = streamFuturesAccount(str);
            c414381.label = 1;
            objFirst = FlowKt.first(flowStreamFuturesAccount, c414381);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirst);
        }
        return ((FuturesAccount) objFirst).getId();
    }

    public static /* synthetic */ Object getFuturesAccountIdStringOrNull$default(FuturesAccountStore futuresAccountStore, String str, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return futuresAccountStore.getFuturesAccountIdStringOrNull(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getFuturesAccountIdStringOrNull(String str, Continuation<? super String> continuation) {
        C414411 c414411;
        if (continuation instanceof C414411) {
            c414411 = (C414411) continuation;
            int i = c414411.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c414411.label = i - Integer.MIN_VALUE;
            } else {
                c414411 = new C414411(continuation);
            }
        }
        Object futuresAccountIdOrNull = c414411.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c414411.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(futuresAccountIdOrNull);
            c414411.label = 1;
            futuresAccountIdOrNull = getFuturesAccountIdOrNull(str, c414411);
            if (futuresAccountIdOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(futuresAccountIdOrNull);
        }
        UUID uuid = (UUID) futuresAccountIdOrNull;
        if (uuid != null) {
            return Uuids.safeToString(uuid);
        }
        return null;
    }

    public static /* synthetic */ Object getFuturesAccountIdString$default(FuturesAccountStore futuresAccountStore, String str, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return futuresAccountStore.getFuturesAccountIdString(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getFuturesAccountIdString(String str, Continuation<? super String> continuation) {
        C414401 c414401;
        if (continuation instanceof C414401) {
            c414401 = (C414401) continuation;
            int i = c414401.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c414401.label = i - Integer.MIN_VALUE;
            } else {
                c414401 = new C414401(continuation);
            }
        }
        Object futuresAccountId = c414401.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c414401.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(futuresAccountId);
            c414401.label = 1;
            futuresAccountId = getFuturesAccountId(str, c414401);
            if (futuresAccountId == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(futuresAccountId);
        }
        return Uuids.safeToString((UUID) futuresAccountId);
    }

    public static /* synthetic */ Flow streamEventContractSwapsAccount$default(FuturesAccountStore futuresAccountStore, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return futuresAccountStore.streamEventContractSwapsAccount(str);
    }

    public final Flow<FuturesAccount> streamEventContractSwapsAccount(String optionalRhsAccountNumber) {
        final Flow<Optional<FuturesAccount>> flowStreamOptionalEventContractSwapsAccount = streamOptionalEventContractSwapsAccount(optionalRhsAccountNumber);
        return new Flow<FuturesAccount>() { // from class: com.robinhood.store.futures.FuturesAccountStore$streamEventContractSwapsAccount$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super FuturesAccount> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamOptionalEventContractSwapsAccount.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.futures.FuturesAccountStore$streamEventContractSwapsAccount$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesAccountStore$streamEventContractSwapsAccount$$inlined$mapNotNull$1$2", m3645f = "FuturesAccountStore.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.store.futures.FuturesAccountStore$streamEventContractSwapsAccount$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Object orNull = ((Optional) obj).getOrNull();
                        if (orNull != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(orNull, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
    }

    public static /* synthetic */ Flow streamOptionalEventContractSwapsAccount$default(FuturesAccountStore futuresAccountStore, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return futuresAccountStore.streamOptionalEventContractSwapsAccount(str);
    }

    public final Flow<Optional<FuturesAccount>> streamOptionalEventContractSwapsAccount(String optionalRhsAccountNumber) {
        return FlowKt.transformLatest(streamNotNullRhsAccountNumberAllowedForFutures(optionalRhsAccountNumber), new C41426xd64c43c5(null, this));
    }

    public static /* synthetic */ Flow streamOptionalEventContractSwapsAccountId$default(FuturesAccountStore futuresAccountStore, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return futuresAccountStore.streamOptionalEventContractSwapsAccountId(str);
    }

    public final Flow<Optional<UUID>> streamOptionalEventContractSwapsAccountId(String optionalRhsAccountNumber) {
        final Flow<Optional<FuturesAccount>> flowStreamOptionalEventContractSwapsAccount = streamOptionalEventContractSwapsAccount(optionalRhsAccountNumber);
        return FlowKt.distinctUntilChanged(new Flow<Optional<? extends UUID>>() { // from class: com.robinhood.store.futures.FuturesAccountStore$streamOptionalEventContractSwapsAccountId$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Optional<? extends UUID>> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamOptionalEventContractSwapsAccount.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.futures.FuturesAccountStore$streamOptionalEventContractSwapsAccountId$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesAccountStore$streamOptionalEventContractSwapsAccountId$$inlined$map$1$2", m3645f = "FuturesAccountStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.futures.FuturesAccountStore$streamOptionalEventContractSwapsAccountId$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        FuturesAccount futuresAccount = (FuturesAccount) ((Optional) obj).component1();
                        Optional optionalAsOptional = Optional3.asOptional(futuresAccount != null ? futuresAccount.getId() : null);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(optionalAsOptional, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        });
    }

    public static /* synthetic */ Flow streamEventContractSwapsAccountId$default(FuturesAccountStore futuresAccountStore, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return futuresAccountStore.streamEventContractSwapsAccountId(str);
    }

    public final Flow<UUID> streamEventContractSwapsAccountId(String optionalRhsAccountNumber) {
        final Flow<FuturesAccount> flowStreamEventContractSwapsAccount = streamEventContractSwapsAccount(optionalRhsAccountNumber);
        return new Flow<UUID>() { // from class: com.robinhood.store.futures.FuturesAccountStore$streamEventContractSwapsAccountId$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super UUID> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamEventContractSwapsAccount.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.futures.FuturesAccountStore$streamEventContractSwapsAccountId$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesAccountStore$streamEventContractSwapsAccountId$$inlined$mapNotNull$1$2", m3645f = "FuturesAccountStore.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.store.futures.FuturesAccountStore$streamEventContractSwapsAccountId$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        UUID id = ((FuturesAccount) obj).getId();
                        if (id != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(id, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
    }

    public static /* synthetic */ Flow streamOptionalEventContractSwapsAccountForced$default(FuturesAccountStore futuresAccountStore, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return futuresAccountStore.streamOptionalEventContractSwapsAccountForced(str);
    }

    /* compiled from: FuturesAccountStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/models/futures/db/FuturesAccount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesAccountStore$streamOptionalEventContractSwapsAccountForced$1", m3645f = "FuturesAccountStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE, EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE, 300, EnumC7081g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.store.futures.FuturesAccountStore$streamOptionalEventContractSwapsAccountForced$1 */
    static final class C414441 extends ContinuationImpl7 implements Function2<FlowCollector<? super Optional<? extends FuturesAccount>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $rhsAccountNumber;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C414441(String str, Continuation<? super C414441> continuation) {
            super(2, continuation);
            this.$rhsAccountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C414441 c414441 = FuturesAccountStore.this.new C414441(this.$rhsAccountNumber, continuation);
            c414441.L$0 = obj;
            return c414441;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Optional<? extends FuturesAccount>> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super Optional<FuturesAccount>>) flowCollector, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super Optional<FuturesAccount>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C414441) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, r8, r7) != r0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00e0, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r3, r8, r7) != r0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0103, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r3, r8, r7) == r0) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00e3  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            String str;
            String str2;
            FlowCollector flowCollector2;
            Optional optional;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                    Flow flowStreamRhsAccountNumberAllowedForFutures = FuturesAccountStore.this.streamRhsAccountNumberAllowedForFutures(this.$rhsAccountNumber);
                    this.L$0 = flowCollector3;
                    this.label = 1;
                    Object objFirstOrNull = FlowKt.firstOrNull(flowStreamRhsAccountNumberAllowedForFutures, this);
                    if (objFirstOrNull != coroutine_suspended) {
                        flowCollector = flowCollector3;
                        obj = objFirstOrNull;
                        str = (String) obj;
                        if (str != null) {
                            Optional2 optional2 = Optional2.INSTANCE;
                            this.L$0 = flowCollector;
                            this.label = 2;
                            if (flowCollector.emit(optional2, this) != coroutine_suspended) {
                                Flow flowTransformLatest = FlowKt.transformLatest(FuturesAccountStore.this.streamNotNullRhsAccountNumberAllowedForFutures(this.$rhsAccountNumber), new C41427xe0e1897f(null, FuturesAccountStore.this));
                                this.L$0 = null;
                                this.label = 3;
                                break;
                            }
                        } else {
                            Flow<Optional<FuturesAccount>> flowAsFlow = FuturesAccountStore.this.m2961x278c8be4().asFlow(str);
                            this.L$0 = flowCollector;
                            this.L$1 = str;
                            this.label = 4;
                            Object objFirstOrNull2 = FlowKt.firstOrNull(flowAsFlow, this);
                            if (objFirstOrNull2 != coroutine_suspended) {
                                FlowCollector flowCollector4 = flowCollector;
                                str2 = str;
                                obj = objFirstOrNull2;
                                flowCollector2 = flowCollector4;
                                optional = (Optional) obj;
                                if ((optional == null ? (FuturesAccount) optional.getOrNull() : null) != null) {
                                    Flow flowTransformLatest2 = FlowKt.transformLatest(FuturesAccountStore.this.getAccountsEndpoint$lib_store_futures_externalDebug().forceFetchAllPages(str2), new C41428xe0e18980(null, FuturesAccountStore.this, str2));
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.label = 7;
                                    break;
                                } else {
                                    this.L$0 = flowCollector2;
                                    this.L$1 = str2;
                                    this.label = 5;
                                    if (flowCollector2.emit(optional, this) != coroutine_suspended) {
                                        Flow<Optional<FuturesAccount>> flowAsFlow2 = FuturesAccountStore.this.m2961x278c8be4().asFlow(str2);
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.label = 6;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    flowCollector = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    str = (String) obj;
                    if (str != null) {
                    }
                    return coroutine_suspended;
                case 2:
                    flowCollector = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest3 = FlowKt.transformLatest(FuturesAccountStore.this.streamNotNullRhsAccountNumberAllowedForFutures(this.$rhsAccountNumber), new C41427xe0e1897f(null, FuturesAccountStore.this));
                    this.L$0 = null;
                    this.label = 3;
                    break;
                case 3:
                case 6:
                case 7:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 4:
                    str2 = (String) this.L$1;
                    flowCollector2 = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    optional = (Optional) obj;
                    if ((optional == null ? (FuturesAccount) optional.getOrNull() : null) != null) {
                    }
                    return coroutine_suspended;
                case 5:
                    str2 = (String) this.L$1;
                    flowCollector2 = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    Flow<Optional<FuturesAccount>> flowAsFlow22 = FuturesAccountStore.this.m2961x278c8be4().asFlow(str2);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 6;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Flow<Optional<FuturesAccount>> streamOptionalEventContractSwapsAccountForced(String rhsAccountNumber) {
        return FlowKt.distinctUntilChanged(FlowKt.flow(new C414441(rhsAccountNumber, null)));
    }

    public static /* synthetic */ Object getEventContractSwapsAccountId$default(FuturesAccountStore futuresAccountStore, String str, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return futuresAccountStore.getEventContractSwapsAccountId(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getEventContractSwapsAccountId(String str, Continuation<? super UUID> continuation) {
        C414361 c414361;
        if (continuation instanceof C414361) {
            c414361 = (C414361) continuation;
            int i = c414361.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c414361.label = i - Integer.MIN_VALUE;
            } else {
                c414361 = new C414361(continuation);
            }
        }
        Object objFirst = c414361.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c414361.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            UUID uuid = this.cachedEventContractSwapsAccountId;
            if (uuid != null) {
                return uuid;
            }
            Flow<FuturesAccount> flowStreamEventContractSwapsAccount = streamEventContractSwapsAccount(str);
            c414361.label = 1;
            objFirst = FlowKt.first(flowStreamEventContractSwapsAccount, c414361);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirst);
        }
        return ((FuturesAccount) objFirst).getId();
    }

    public static /* synthetic */ Object getEventContractSwapsAccountIdOrNull$default(FuturesAccountStore futuresAccountStore, String str, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return futuresAccountStore.getEventContractSwapsAccountIdOrNull(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getEventContractSwapsAccountIdOrNull(String str, Continuation<? super UUID> continuation) {
        C414371 c414371;
        if (continuation instanceof C414371) {
            c414371 = (C414371) continuation;
            int i = c414371.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c414371.label = i - Integer.MIN_VALUE;
            } else {
                c414371 = new C414371(continuation);
            }
        }
        Object objFirstOrNull = c414371.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c414371.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            UUID uuid = this.cachedEventContractSwapsAccountId;
            if (uuid != null) {
                return uuid;
            }
            Flow<FuturesAccount> flowStreamEventContractSwapsAccount = streamEventContractSwapsAccount(str);
            c414371.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowStreamEventContractSwapsAccount, c414371);
            if (objFirstOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirstOrNull);
        }
        FuturesAccount futuresAccount = (FuturesAccount) objFirstOrNull;
        if (futuresAccount != null) {
            return futuresAccount.getId();
        }
        return null;
    }

    public final Flow<AccountFuturesEligibilityStatusDto> streamFuturesAccountEligibilityStatus(String rhsAccountNumber) {
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        return this.queryFuturesEligibilityStatus.asFlow(rhsAccountNumber);
    }

    public final Object getRhdAccountId(FuturesAccountType futuresAccountType, Continuation<? super UUID> continuation) {
        int i = WhenMappings.$EnumSwitchMapping$0[futuresAccountType.ordinal()];
        if (i == 1) {
            return getFuturesAccountIdOrNull$default(this, null, continuation, 1, null);
        }
        if (i == 2) {
            return getEventContractSwapsAccountIdOrNull$default(this, null, continuation, 1, null);
        }
        if (i == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Object createAccount(String str, Continuation<? super CreateFuturesAccountResult> continuation) {
        return PostEndpoint.DefaultImpls.post$default(this.createAccountEndpoint, new CreateFuturesAccountRequestDto(null, str, true, 1, null), null, continuation, 2, null);
    }

    /* compiled from: FuturesAccountStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.store.futures.FuturesAccountStore$streamBuyingPower$1 */
    /* synthetic */ class C414431 extends AdaptedFunctionReference implements Function1<String, Flow<? extends ApiFuturesBuyingPower>> {
        C414431(Object obj) {
            super(1, obj, Endpoint.class, "poll", "poll(Ljava/lang/Object;Ljava/time/Duration;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Flow<ApiFuturesBuyingPower> invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return Endpoint.DefaultImpls.poll$default((Endpoint) this.receiver, p0, null, null, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamBuyingPower$lambda$23(FuturesAccountStore futuresAccountStore, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return FlowKt.asSharedFlow(futuresAccountStore.buyingPowerCache);
    }

    public static /* synthetic */ Flow streamBuyingPower$default(FuturesAccountStore futuresAccountStore, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return futuresAccountStore.streamBuyingPower(str);
    }

    public final Flow<ApiFuturesBuyingPower> streamBuyingPower(String optionalRhsAccountNumber) {
        return FlowKt.distinctUntilChanged(FlowKt.transformLatest(streamNotNullRhsAccountNumberAllowedForFutures(optionalRhsAccountNumber), new FuturesAccountStore$streamBuyingPower$$inlined$flatMapLatest$1(null, this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a6, code lost:
    
        if (com.robinhood.android.moria.network.PostEndpoint.DefaultImpls.post$default(r1, r5, null, r4, 2, null) == r0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object signEventAttestationIfNecessary(String str, Continuation<? super Unit> continuation) {
        C414421 c414421;
        if (continuation instanceof C414421) {
            c414421 = (C414421) continuation;
            int i = c414421.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c414421.label = i - Integer.MIN_VALUE;
            } else {
                c414421 = new C414421(continuation);
            }
        }
        C414421 c4144212 = c414421;
        Object objFirstOrNull = c4144212.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4144212.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            Flow flowStreamEventContractSwapsAccount$default = streamEventContractSwapsAccount$default(this, null, 1, null);
            c4144212.L$0 = str;
            c4144212.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowStreamEventContractSwapsAccount$default, c4144212);
            if (objFirstOrNull != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirstOrNull);
            return Unit.INSTANCE;
        }
        str = (String) c4144212.L$0;
        ResultKt.throwOnFailure(objFirstOrNull);
        FuturesAccount futuresAccount = (FuturesAccount) objFirstOrNull;
        if (futuresAccount == null) {
            return Unit.INSTANCE;
        }
        List<String> signedAttestations = futuresAccount.getSignedAttestations();
        if (!(signedAttestations instanceof Collection) || !signedAttestations.isEmpty()) {
            Iterator<T> it = signedAttestations.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual((String) it.next(), str)) {
                    break;
                }
            }
        }
        PostEndpoint<MarkAttestationsSignedRequestDto, Optional<FuturesAccount>> postEndpoint = this.signAttestationEndpoint;
        MarkAttestationsSignedRequestDto markAttestationsSignedRequestDto = new MarkAttestationsSignedRequestDto(Uuids.safeToString(futuresAccount.getId()), null, CollectionsKt.listOf(str), 2, null);
        c4144212.L$0 = null;
        c4144212.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
    
        if (r9 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:13:0x002c, B:39:0x0088, B:20:0x003e, B:34:0x0072, B:36:0x0076, B:23:0x0046, B:29:0x005c, B:31:0x0060, B:26:0x004d), top: B:44:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object evaluateSuitability(SuitabilityCheckpointDto suitabilityCheckpointDto, Continuation<? super EvaluateCheckpointSuitabilityResponseDto> continuation) {
        C414341 c414341;
        String str;
        if (continuation instanceof C414341) {
            c414341 = (C414341) continuation;
            int i = c414341.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c414341.label = i - Integer.MIN_VALUE;
            } else {
                c414341 = new C414341(continuation);
            }
        }
        Object objFirstOrNull = c414341.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c414341.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objFirstOrNull);
                Flow<String> flowStreamRhsAccountNumberAllowedForFutures = streamRhsAccountNumberAllowedForFutures(null);
                c414341.L$0 = suitabilityCheckpointDto;
                c414341.label = 1;
                objFirstOrNull = FlowKt.firstOrNull(flowStreamRhsAccountNumberAllowedForFutures, c414341);
                if (objFirstOrNull == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 == 1) {
                suitabilityCheckpointDto = (SuitabilityCheckpointDto) c414341.L$0;
                ResultKt.throwOnFailure(objFirstOrNull);
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objFirstOrNull);
                    return (EvaluateCheckpointSuitabilityResponseDto) objFirstOrNull;
                }
                suitabilityCheckpointDto = (SuitabilityCheckpointDto) c414341.L$0;
                ResultKt.throwOnFailure(objFirstOrNull);
                str = (String) objFirstOrNull;
                if (str == null) {
                    return null;
                }
                Ceres ceres = this.ceres;
                EvaluateCheckpointSuitabilityRequestDto evaluateCheckpointSuitabilityRequestDto = new EvaluateCheckpointSuitabilityRequestDto(str, suitabilityCheckpointDto);
                c414341.L$0 = null;
                c414341.label = 3;
                objFirstOrNull = ceres.EvaluateCheckpointSuitability(evaluateCheckpointSuitabilityRequestDto, c414341);
            }
            str = (String) objFirstOrNull;
            if (str == null) {
                C414352 c414352 = new C414352(null);
                c414341.L$0 = suitabilityCheckpointDto;
                c414341.label = 2;
                objFirstOrNull = Timeout6.withTimeout(5000L, c414352, c414341);
                if (objFirstOrNull == coroutine_suspended) {
                }
                str = (String) objFirstOrNull;
                if (str == null) {
                }
            } else if (str == null) {
            }
            return coroutine_suspended;
        } catch (Exception e) {
            Timber.INSTANCE.mo3355e(e, "Error occurred when running FuturesAccountStore.evaluateSuitability", new Object[0]);
            return null;
        }
    }

    /* compiled from: FuturesAccountStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesAccountStore$evaluateSuitability$2", m3645f = "FuturesAccountStore.kt", m3646l = {407}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.futures.FuturesAccountStore$evaluateSuitability$2 */
    static final class C414352 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        int label;

        C414352(Continuation<? super C414352> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FuturesAccountStore.this.new C414352(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((C414352) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Flow flowStreamNotNullRhsAccountNumberAllowedForFutures = FuturesAccountStore.this.streamNotNullRhsAccountNumberAllowedForFutures(null);
            this.label = 1;
            Object objFirstOrNull = FlowKt.firstOrNull(flowStreamNotNullRhsAccountNumberAllowedForFutures, this);
            return objFirstOrNull == coroutine_suspended ? coroutine_suspended : objFirstOrNull;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
    
        if (r9 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:13:0x002c, B:39:0x0088, B:20:0x003e, B:34:0x0072, B:36:0x0076, B:23:0x0046, B:29:0x005c, B:31:0x0060, B:26:0x004d), top: B:44:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object checkSuitability(SuitabilityCheckpointDto suitabilityCheckpointDto, Continuation<? super GetCheckpointSuitabilityResponseDto> continuation) {
        C414321 c414321;
        String str;
        if (continuation instanceof C414321) {
            c414321 = (C414321) continuation;
            int i = c414321.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c414321.label = i - Integer.MIN_VALUE;
            } else {
                c414321 = new C414321(continuation);
            }
        }
        Object objFirstOrNull = c414321.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c414321.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objFirstOrNull);
                Flow<String> flowStreamRhsAccountNumberAllowedForFutures = streamRhsAccountNumberAllowedForFutures(null);
                c414321.L$0 = suitabilityCheckpointDto;
                c414321.label = 1;
                objFirstOrNull = FlowKt.firstOrNull(flowStreamRhsAccountNumberAllowedForFutures, c414321);
                if (objFirstOrNull == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 == 1) {
                suitabilityCheckpointDto = (SuitabilityCheckpointDto) c414321.L$0;
                ResultKt.throwOnFailure(objFirstOrNull);
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objFirstOrNull);
                    return (GetCheckpointSuitabilityResponseDto) objFirstOrNull;
                }
                suitabilityCheckpointDto = (SuitabilityCheckpointDto) c414321.L$0;
                ResultKt.throwOnFailure(objFirstOrNull);
                str = (String) objFirstOrNull;
                if (str == null) {
                    return null;
                }
                Ceres ceres = this.ceres;
                GetCheckpointSuitabilityRequestDto getCheckpointSuitabilityRequestDto = new GetCheckpointSuitabilityRequestDto(str, suitabilityCheckpointDto);
                c414321.L$0 = null;
                c414321.label = 3;
                objFirstOrNull = ceres.GetCheckpointSuitability(getCheckpointSuitabilityRequestDto, c414321);
            }
            str = (String) objFirstOrNull;
            if (str == null) {
                C414332 c414332 = new C414332(null);
                c414321.L$0 = suitabilityCheckpointDto;
                c414321.label = 2;
                objFirstOrNull = Timeout6.withTimeout(5000L, c414332, c414321);
                if (objFirstOrNull == coroutine_suspended) {
                }
                str = (String) objFirstOrNull;
                if (str == null) {
                }
            } else if (str == null) {
            }
            return coroutine_suspended;
        } catch (Exception e) {
            Timber.INSTANCE.mo3355e(e, "Error occurred when running FuturesAccountStore.checkSuitability", new Object[0]);
            return null;
        }
    }

    /* compiled from: FuturesAccountStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesAccountStore$checkSuitability$2", m3645f = "FuturesAccountStore.kt", m3646l = {429}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.futures.FuturesAccountStore$checkSuitability$2 */
    static final class C414332 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        int label;

        C414332(Continuation<? super C414332> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FuturesAccountStore.this.new C414332(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((C414332) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Flow flowStreamNotNullRhsAccountNumberAllowedForFutures = FuturesAccountStore.this.streamNotNullRhsAccountNumberAllowedForFutures(null);
            this.label = 1;
            Object objFirstOrNull = FlowKt.firstOrNull(flowStreamNotNullRhsAccountNumberAllowedForFutures, this);
            return objFirstOrNull == coroutine_suspended ? coroutine_suspended : objFirstOrNull;
        }
    }
}

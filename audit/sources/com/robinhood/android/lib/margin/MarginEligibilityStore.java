package com.robinhood.android.lib.margin;

import bonfire.proto.idl.margin.p036v1.GetMultiAccountEligibilityRequestDto;
import bonfire.proto.idl.margin.p036v1.GetMultiAccountEligibilityResponseDto;
import bonfire.proto.idl.margin.p036v1.MultiAccountEligibilityContextDto;
import bonfire.proto.idl.margin.p036v1.MultiAccountEligibilityService;
import com.robinhood.android.lib.margin.api.ApiMarginEligibility;
import com.robinhood.android.lib.margin.api.ApiMarginEligibility2;
import com.robinhood.android.lib.margin.api.MarginInvestingApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.models.p320db.Account;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: MarginEligibilityStore.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001$B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0086@¢\u0006\u0002\u0010\u001aJ\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u0018\u001a\u00020\u0019J \u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0086@¢\u0006\u0002\u0010\u001aJ\u001e\u0010 \u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"H\u0086@¢\u0006\u0002\u0010#R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/MarginEligibilityStore;", "Lcom/robinhood/store/Store;", "marginInvestingApi", "Lcom/robinhood/android/lib/margin/api/MarginInvestingApi;", "multiAccountMarginEligibilityService", "Lbonfire/proto/idl/margin/v1/MultiAccountEligibilityService;", "marginUpgradeRestrictionStore", "Lcom/robinhood/android/lib/margin/MarginUpgradeRestrictionStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/margin/api/MarginInvestingApi;Lbonfire/proto/idl/margin/v1/MultiAccountEligibilityService;Lcom/robinhood/android/lib/margin/MarginUpgradeRestrictionStore;Lcom/robinhood/store/StoreBundle;)V", "getEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/lib/margin/MarginEligibilityStore$Request;", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility;", "postEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "multiAccountMarginEligibilityEndpoint", "Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityRequestDto;", "Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;", "getMarginEligibility", "accountNumber", "", "skip2kCheck", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isMarginInvestingEligible", "Lkotlinx/coroutines/flow/Flow;", "account", "Lcom/robinhood/models/db/Account;", "updateMarginEligibilityCooldown", "getMultiAccountMarginEligibility", "context", "Lbonfire/proto/idl/margin/v1/MultiAccountEligibilityContextDto;", "(Ljava/lang/String;Lbonfire/proto/idl/margin/v1/MultiAccountEligibilityContextDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Request", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MarginEligibilityStore extends Store {
    private final Endpoint<Request, ApiMarginEligibility> getEndpoint;
    private final MarginInvestingApi marginInvestingApi;
    private final MarginUpgradeRestrictionStore marginUpgradeRestrictionStore;
    private final Endpoint<GetMultiAccountEligibilityRequestDto, GetMultiAccountEligibilityResponseDto> multiAccountMarginEligibilityEndpoint;
    private final MultiAccountEligibilityService multiAccountMarginEligibilityService;
    private final PostEndpoint<Request, ApiMarginEligibility> postEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginEligibilityStore(MarginInvestingApi marginInvestingApi, MultiAccountEligibilityService multiAccountMarginEligibilityService, MarginUpgradeRestrictionStore marginUpgradeRestrictionStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(marginInvestingApi, "marginInvestingApi");
        Intrinsics.checkNotNullParameter(multiAccountMarginEligibilityService, "multiAccountMarginEligibilityService");
        Intrinsics.checkNotNullParameter(marginUpgradeRestrictionStore, "marginUpgradeRestrictionStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.marginInvestingApi = marginInvestingApi;
        this.multiAccountMarginEligibilityService = multiAccountMarginEligibilityService;
        this.marginUpgradeRestrictionStore = marginUpgradeRestrictionStore;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.getEndpoint = Endpoint.Companion.create$default(companion, new MarginEligibilityStore2(this, null), getLogoutKillswitch(), new MarginEligibilityStore3(null), storeBundle.getClock(), null, 16, null);
        this.postEndpoint = PostEndpoint.INSTANCE.create(new MarginEligibilityStore6(this, null), new MarginEligibilityStore7(null));
        this.multiAccountMarginEligibilityEndpoint = Endpoint.Companion.create$default(companion, new MarginEligibilityStore4(multiAccountMarginEligibilityService), getLogoutKillswitch(), new MarginEligibilityStore5(null), storeBundle.getClock(), null, 16, null);
    }

    public static /* synthetic */ Object getMarginEligibility$default(MarginEligibilityStore marginEligibilityStore, String str, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return marginEligibilityStore.getMarginEligibility(str, z, continuation);
    }

    public final Object getMarginEligibility(String str, boolean z, Continuation<? super ApiMarginEligibility> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.getEndpoint, new Request(str, z), null, continuation, 2, null);
    }

    public static /* synthetic */ Flow isMarginInvestingEligible$default(MarginEligibilityStore marginEligibilityStore, Account account, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return marginEligibilityStore.isMarginInvestingEligible(account, z);
    }

    public final Flow<Boolean> isMarginInvestingEligible(final Account account, final boolean skip2kCheck) {
        Intrinsics.checkNotNullParameter(account, "account");
        final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.marginUpgradeRestrictionStore.hasNoUpgradeRestriction(account));
        return new Flow<Boolean>() { // from class: com.robinhood.android.lib.margin.MarginEligibilityStore$isMarginInvestingEligible$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.lib.margin.MarginEligibilityStore$isMarginInvestingEligible$$inlined$map$1$2 */
            public static final class C203142<T> implements FlowCollector {
                final /* synthetic */ Account $account$inlined;
                final /* synthetic */ boolean $skip2kCheck$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ MarginEligibilityStore this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.lib.margin.MarginEligibilityStore$isMarginInvestingEligible$$inlined$map$1$2", m3645f = "MarginEligibilityStore.kt", m3646l = {52, 50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.lib.margin.MarginEligibilityStore$isMarginInvestingEligible$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C203142.this.emit(null, this);
                    }
                }

                public C203142(FlowCollector flowCollector, MarginEligibilityStore marginEligibilityStore, Account account, boolean z) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = marginEligibilityStore;
                    this.$account$inlined = account;
                    this.$skip2kCheck$inlined = z;
                }

                /* JADX WARN: Code restructure failed: missing block: B:42:0x00ab, code lost:
                
                    if (r10.emit(r9, r0) == r1) goto L43;
                 */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    FlowCollector flowCollector;
                    Throwable th;
                    FlowCollector flowCollector2;
                    Object objM28550constructorimpl;
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
                    boolean z = false;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        flowCollector = this.$this_unsafeFlow;
                        if (((Boolean) obj).booleanValue()) {
                            MarginEligibilityStore marginEligibilityStore = this.this$0;
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                String accountNumber = this.$account$inlined.getAccountNumber();
                                boolean z2 = this.$skip2kCheck$inlined;
                                anonymousClass1.L$0 = flowCollector;
                                anonymousClass1.label = 1;
                                Object marginEligibility = marginEligibilityStore.getMarginEligibility(accountNumber, z2, anonymousClass1);
                                if (marginEligibility != coroutine_suspended) {
                                    obj2 = marginEligibility;
                                    flowCollector2 = flowCollector;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                flowCollector2 = flowCollector;
                                Result.Companion companion2 = Result.INSTANCE;
                                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                                if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) == null) {
                                }
                                flowCollector = flowCollector2;
                                Boolean boolBoxBoolean = boxing.boxBoolean(z);
                                anonymousClass1.L$0 = null;
                                anonymousClass1.label = 2;
                            }
                        } else {
                            Boolean boolBoxBoolean2 = boxing.boxBoolean(z);
                            anonymousClass1.L$0 = null;
                            anonymousClass1.label = 2;
                        }
                        return coroutine_suspended;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    }
                    flowCollector2 = (FlowCollector) anonymousClass1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj2);
                    } catch (Throwable th3) {
                        th = th3;
                        Result.Companion companion22 = Result.INSTANCE;
                        objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                        if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) == null) {
                        }
                        flowCollector = flowCollector2;
                        Boolean boolBoxBoolean22 = boxing.boxBoolean(z);
                        anonymousClass1.L$0 = null;
                        anonymousClass1.label = 2;
                    }
                    objM28550constructorimpl = Result.m28550constructorimpl((ApiMarginEligibility) obj2);
                    if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) == null) {
                        ApiMarginEligibility apiMarginEligibility = (ApiMarginEligibility) objM28550constructorimpl;
                        if (apiMarginEligibility.getMarginUpgradeBlocked() == null || Intrinsics.areEqual(apiMarginEligibility.getMarginUpgradeBlocked().getType(), ApiMarginEligibility2.ALREADY_ENABLED)) {
                            z = true;
                        }
                    }
                    flowCollector = flowCollector2;
                    Boolean boolBoxBoolean222 = boxing.boxBoolean(z);
                    anonymousClass1.L$0 = null;
                    anonymousClass1.label = 2;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = flowDistinctUntilChanged.collect(new C203142(flowCollector, this, account, skip2kCheck), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public static /* synthetic */ Object updateMarginEligibilityCooldown$default(MarginEligibilityStore marginEligibilityStore, String str, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return marginEligibilityStore.updateMarginEligibilityCooldown(str, z, continuation);
    }

    public final Object updateMarginEligibilityCooldown(String str, boolean z, Continuation<? super ApiMarginEligibility> continuation) {
        return PostEndpoint.DefaultImpls.post$default(this.postEndpoint, new Request(str, z), null, continuation, 2, null);
    }

    public final Object getMultiAccountMarginEligibility(String str, MultiAccountEligibilityContextDto multiAccountEligibilityContextDto, Continuation<? super GetMultiAccountEligibilityResponseDto> continuation) {
        return this.multiAccountMarginEligibilityEndpoint.raw(new GetMultiAccountEligibilityRequestDto(str, multiAccountEligibilityContextDto), continuation);
    }

    /* compiled from: MarginEligibilityStore.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/MarginEligibilityStore$Request;", "", "accountNumber", "", "skipMin2kEquityCheck", "", "<init>", "(Ljava/lang/String;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getSkipMin2kEquityCheck", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Request {
        private final String accountNumber;
        private final boolean skipMin2kEquityCheck;

        public static /* synthetic */ Request copy$default(Request request, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = request.accountNumber;
            }
            if ((i & 2) != 0) {
                z = request.skipMin2kEquityCheck;
            }
            return request.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSkipMin2kEquityCheck() {
            return this.skipMin2kEquityCheck;
        }

        public final Request copy(String accountNumber, boolean skipMin2kEquityCheck) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new Request(accountNumber, skipMin2kEquityCheck);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.accountNumber, request.accountNumber) && this.skipMin2kEquityCheck == request.skipMin2kEquityCheck;
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + Boolean.hashCode(this.skipMin2kEquityCheck);
        }

        public String toString() {
            return "Request(accountNumber=" + this.accountNumber + ", skipMin2kEquityCheck=" + this.skipMin2kEquityCheck + ")";
        }

        public Request(String accountNumber, boolean z) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
            this.skipMin2kEquityCheck = z;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final boolean getSkipMin2kEquityCheck() {
            return this.skipMin2kEquityCheck;
        }
    }
}

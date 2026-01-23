package com.robinhood.android.lib.margin;

import com.robinhood.android.lib.margin.api.MarginBrokebackApi;
import com.robinhood.android.lib.margin.api.models.ApiMarginUpgradeRestriction;
import com.robinhood.android.lib.margin.p167db.dao.MarginUpgradeRestrictionDao;
import com.robinhood.android.lib.margin.p167db.models.MarginUpgradeRestriction;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.models.p320db.Account;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: MarginUpgradeRestrictionStore.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f2\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/MarginUpgradeRestrictionStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/android/lib/margin/db/dao/MarginUpgradeRestrictionDao;", "api", "Lcom/robinhood/android/lib/margin/api/MarginBrokebackApi;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/android/lib/margin/db/dao/MarginUpgradeRestrictionDao;Lcom/robinhood/android/lib/margin/api/MarginBrokebackApi;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/android/lib/margin/api/models/ApiMarginUpgradeRestriction;", "getMarginUpgradeRestriction", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/lib/margin/db/models/MarginUpgradeRestriction;", "accountNumber", "forceRefresh", "", "hasNoUpgradeRestriction", "account", "Lcom/robinhood/models/db/Account;", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MarginUpgradeRestrictionStore extends Store {
    private final MarginBrokebackApi api;
    private final MarginUpgradeRestrictionDao dao;
    private final Endpoint<String, ApiMarginUpgradeRestriction> endpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginUpgradeRestrictionStore(StoreBundle storeBundle, MarginUpgradeRestrictionDao dao, MarginBrokebackApi api) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(api, "api");
        this.dao = dao;
        this.api = api;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new MarginUpgradeRestrictionStore2(this, null), getLogoutKillswitch(), new MarginUpgradeRestrictionStore3(this, null), storeBundle.getClock(), null, 16, null);
    }

    public static /* synthetic */ Flow getMarginUpgradeRestriction$default(MarginUpgradeRestrictionStore marginUpgradeRestrictionStore, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return marginUpgradeRestrictionStore.getMarginUpgradeRestriction(str, z);
    }

    /* compiled from: MarginUpgradeRestrictionStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/lib/margin/db/models/MarginUpgradeRestriction;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.margin.MarginUpgradeRestrictionStore$getMarginUpgradeRestriction$1", m3645f = "MarginUpgradeRestrictionStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.margin.MarginUpgradeRestrictionStore$getMarginUpgradeRestriction$1 */
    static final class C203161 extends ContinuationImpl7 implements Function2<FlowCollector<? super MarginUpgradeRestriction>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ boolean $forceRefresh;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C203161(String str, boolean z, Continuation<? super C203161> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$forceRefresh = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginUpgradeRestrictionStore.this.new C203161(this.$accountNumber, this.$forceRefresh, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super MarginUpgradeRestriction> flowCollector, Continuation<? super Unit> continuation) {
            return ((C203161) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Endpoint.DefaultImpls.refresh$default(MarginUpgradeRestrictionStore.this.endpoint, this.$accountNumber, this.$forceRefresh, null, 4, null);
            return Unit.INSTANCE;
        }
    }

    public final Flow<MarginUpgradeRestriction> getMarginUpgradeRestriction(String accountNumber, boolean forceRefresh) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return FlowKt.onStart(this.dao.get(accountNumber), new C203161(accountNumber, forceRefresh, null));
    }

    public final Flow<Boolean> hasNoUpgradeRestriction(Account account) {
        Intrinsics.checkNotNullParameter(account, "account");
        if (account.isMargin()) {
            return FlowKt.flowOf(Boolean.TRUE);
        }
        final Flow marginUpgradeRestriction$default = getMarginUpgradeRestriction$default(this, account.getAccountNumber(), false, 2, null);
        return new Flow<Boolean>() { // from class: com.robinhood.android.lib.margin.MarginUpgradeRestrictionStore$hasNoUpgradeRestriction$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.lib.margin.MarginUpgradeRestrictionStore$hasNoUpgradeRestriction$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.lib.margin.MarginUpgradeRestrictionStore$hasNoUpgradeRestriction$$inlined$map$1$2", m3645f = "MarginUpgradeRestrictionStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.lib.margin.MarginUpgradeRestrictionStore$hasNoUpgradeRestriction$$inlined$map$1$2$1, reason: invalid class name */
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
                        MarginUpgradeRestriction marginUpgradeRestriction = (MarginUpgradeRestriction) obj;
                        Boolean boolBoxBoolean = boxing.boxBoolean(marginUpgradeRestriction == null || marginUpgradeRestriction.getType() == null);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
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

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = marginUpgradeRestriction$default.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}

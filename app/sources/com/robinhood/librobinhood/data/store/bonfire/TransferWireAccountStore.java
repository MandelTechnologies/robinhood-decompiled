package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.ApiTransferAccountsResponse;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentConstants;
import com.robinhood.models.api.bonfire.wires.RecipientType;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount6;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.transfers.api.TransferType;
import com.robinhood.utils.LogoutKillswitch;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: TransferWireAccountStore.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00172\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001c\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R&\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R&\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R&\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/TransferWireAccountStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "transfersBonfireApi", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/store/StoreBundle;)V", "Lcom/robinhood/models/api/bonfire/wires/RecipientType;", "recipientType", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/moria/network/Endpoint;", "", "", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "createEndpoint", "(Lcom/robinhood/models/api/bonfire/wires/RecipientType;Lj$/time/Clock;)Lcom/robinhood/android/moria/network/Endpoint;", "", "force", "Lkotlinx/coroutines/Job;", "refresh", "(Lcom/robinhood/models/api/bonfire/wires/RecipientType;Z)Lkotlinx/coroutines/Job;", "Lio/reactivex/Observable;", "streamOutgoingWiresAccountByRecipientType", "(Lcom/robinhood/models/api/bonfire/wires/RecipientType;)Lio/reactivex/Observable;", "", "id", "deleteOutgoingWireAccount", "(Lcom/robinhood/models/api/bonfire/wires/RecipientType;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "firstPartyAccountsCache", "Lkotlinx/coroutines/flow/MutableStateFlow;", "thirdPartyAccountsCache", "firstPartyEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "thirdPartyEndpoint", "Lcom/robinhood/android/moria/db/Query;", "query", "Lcom/robinhood/android/moria/db/Query;", "lib-store-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class TransferWireAccountStore extends Store {
    private final StateFlow2<List<TransferAccount>> firstPartyAccountsCache;
    private final Endpoint<Unit, List<TransferAccount>> firstPartyEndpoint;
    private final Query<RecipientType, List<TransferAccount>> query;
    private final StateFlow2<List<TransferAccount>> thirdPartyAccountsCache;
    private final Endpoint<Unit, List<TransferAccount>> thirdPartyEndpoint;
    private final TransfersBonfireApi transfersBonfireApi;

    /* compiled from: TransferWireAccountStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecipientType.values().length];
            try {
                iArr[RecipientType.FIRST_PARTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecipientType.THIRD_PARTY_OTHERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecipientType.THIRD_PARTY_HOME_CLOSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RecipientType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: TransferWireAccountStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.TransferWireAccountStore", m3645f = "TransferWireAccountStore.kt", m3646l = {84, 98}, m3647m = "deleteOutgoingWireAccount")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.TransferWireAccountStore$deleteOutgoingWireAccount$1 */
    static final class C346221 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C346221(Continuation<? super C346221> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransferWireAccountStore.this.deleteOutgoingWireAccount(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferWireAccountStore(TransfersBonfireApi transfersBonfireApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.transfersBonfireApi = transfersBonfireApi;
        this.firstPartyAccountsCache = StateFlow4.MutableStateFlow(CollectionsKt.emptyList());
        this.thirdPartyAccountsCache = StateFlow4.MutableStateFlow(CollectionsKt.emptyList());
        this.firstPartyEndpoint = createEndpoint(RecipientType.FIRST_PARTY, storeBundle.getClock());
        this.thirdPartyEndpoint = createEndpoint(RecipientType.THIRD_PARTY_OTHERS, storeBundle.getClock());
        this.query = Store.create$default(this, Query.INSTANCE, "wireTransferAccounts", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.TransferWireAccountStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferWireAccountStore.query$lambda$0(this.f$0, (RecipientType) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.TransferWireAccountStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferWireAccountStore.query$lambda$1(this.f$0, (RecipientType) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job query$lambda$0(TransferWireAccountStore transferWireAccountStore, RecipientType recipientType) {
        Endpoint<Unit, List<TransferAccount>> endpoint;
        Intrinsics.checkNotNullParameter(recipientType, "recipientType");
        int i = WhenMappings.$EnumSwitchMapping$0[recipientType.ordinal()];
        if (i == 1) {
            endpoint = transferWireAccountStore.firstPartyEndpoint;
        } else {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    throw new IllegalStateException("Not supported yet!");
                }
                throw new NoWhenBranchMatchedException();
            }
            endpoint = transferWireAccountStore.thirdPartyEndpoint;
        }
        return Endpoint8.refresh$default(endpoint, false, null, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(TransferWireAccountStore transferWireAccountStore, RecipientType recipientType) {
        Intrinsics.checkNotNullParameter(recipientType, "recipientType");
        int i = WhenMappings.$EnumSwitchMapping$0[recipientType.ordinal()];
        if (i == 1) {
            return transferWireAccountStore.firstPartyAccountsCache;
        }
        if (i == 2) {
            return transferWireAccountStore.thirdPartyAccountsCache;
        }
        if (i == 3 || i == 4) {
            throw new IllegalStateException("Not supported yet!");
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Job refresh(RecipientType recipientType, boolean force) {
        Endpoint<Unit, List<TransferAccount>> endpoint;
        Intrinsics.checkNotNullParameter(recipientType, "recipientType");
        int i = WhenMappings.$EnumSwitchMapping$0[recipientType.ordinal()];
        if (i == 1) {
            endpoint = this.firstPartyEndpoint;
        } else {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    throw new IllegalStateException("Not supported yet!");
                }
                throw new NoWhenBranchMatchedException();
            }
            endpoint = this.thirdPartyEndpoint;
        }
        return Endpoint8.refresh$default(endpoint, force, null, 2, null);
    }

    public final Observable<List<TransferAccount>> streamOutgoingWiresAccountByRecipientType(RecipientType recipientType) {
        Intrinsics.checkNotNullParameter(recipientType, "recipientType");
        return asObservable(this.query.asFlow(recipientType));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b6, code lost:
    
        if (r7.emit(r2, r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deleteOutgoingWireAccount(RecipientType recipientType, String str, Continuation<? super Unit> continuation) {
        C346221 c346221;
        StateFlow2<List<TransferAccount>> stateFlow2;
        if (continuation instanceof C346221) {
            c346221 = (C346221) continuation;
            int i = c346221.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c346221.label = i - Integer.MIN_VALUE;
            } else {
                c346221 = new C346221(continuation);
            }
        }
        Object obj = c346221.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c346221.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi;
            c346221.L$0 = recipientType;
            c346221.L$1 = str;
            c346221.label = 1;
            if (transfersBonfireApi.unlinkPaymentInstrument(PaymentInstrumentConstants.OUTGOING_WIRE_SERVER_VALUE, str, c346221) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        str = (String) c346221.L$1;
        recipientType = (RecipientType) c346221.L$0;
        ResultKt.throwOnFailure(obj);
        int i3 = WhenMappings.$EnumSwitchMapping$0[recipientType.ordinal()];
        if (i3 == 1) {
            stateFlow2 = this.firstPartyAccountsCache;
        } else {
            if (i3 != 2) {
                if (i3 == 3 || i3 == 4) {
                    throw new IllegalStateException("Not supported yet!");
                }
                throw new NoWhenBranchMatchedException();
            }
            stateFlow2 = this.thirdPartyAccountsCache;
        }
        List mutableList = CollectionsKt.toMutableList((Collection) stateFlow2.getValue());
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : mutableList) {
            if (!Intrinsics.areEqual(((TransferAccount) obj2).getAccountId(), str)) {
                arrayList.add(obj2);
            }
        }
        c346221.L$0 = null;
        c346221.L$1 = null;
        c346221.label = 2;
    }

    /* compiled from: TransferWireAccountStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.TransferWireAccountStore$createEndpoint$1", m3645f = "TransferWireAccountStore.kt", m3646l = {112}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.TransferWireAccountStore$createEndpoint$1 */
    static final class C346201 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super List<? extends TransferAccount>>, Object> {
        final /* synthetic */ RecipientType $recipientType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346201(RecipientType recipientType, Continuation<? super C346201> continuation) {
            super(2, continuation);
            this.$recipientType = recipientType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TransferWireAccountStore.this.new C346201(this.$recipientType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Unit unit, Continuation<? super List<? extends TransferAccount>> continuation) {
            return invoke2(unit, (Continuation<? super List<TransferAccount>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Unit unit, Continuation<? super List<TransferAccount>> continuation) {
            return ((C346201) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TransfersBonfireApi transfersBonfireApi = TransferWireAccountStore.this.transfersBonfireApi;
                RecipientType recipientType = this.$recipientType;
                TransferType transferType = TransferType.OUTGOING_WIRE;
                this.label = 1;
                obj = TransfersBonfireApi.DefaultImpls.getTransferAccounts$default(transfersBonfireApi, false, recipientType, transferType, this, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List<ApiTransferAccount> results = ((ApiTransferAccountsResponse) obj).getResults();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
            Iterator<T> it = results.iterator();
            while (it.hasNext()) {
                arrayList.add(TransferAccount6.toDbModel((ApiTransferAccount) it.next()));
            }
            return arrayList;
        }
    }

    private final Endpoint<Unit, List<TransferAccount>> createEndpoint(RecipientType recipientType, Clock clock) {
        Endpoint.Companion companion = Endpoint.INSTANCE;
        C346201 c346201 = new C346201(recipientType, null);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        C346212 c346212 = new C346212(recipientType, this, null);
        Duration durationOfMinutes = Duration.ofMinutes(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        return companion.create(c346201, logoutKillswitch, c346212, clock, new DefaultStaleDecider(durationOfMinutes, clock));
    }

    /* compiled from: TransferWireAccountStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "", "Lcom/robinhood/models/db/bonfire/TransferAccount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.TransferWireAccountStore$createEndpoint$2", m3645f = "TransferWireAccountStore.kt", m3646l = {128}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.TransferWireAccountStore$createEndpoint$2 */
    static final class C346212 extends ContinuationImpl7 implements Function2<List<? extends TransferAccount>, Continuation<? super Unit>, Object> {
        final /* synthetic */ RecipientType $recipientType;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TransferWireAccountStore this$0;

        /* compiled from: TransferWireAccountStore.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.librobinhood.data.store.bonfire.TransferWireAccountStore$createEndpoint$2$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RecipientType.values().length];
                try {
                    iArr[RecipientType.FIRST_PARTY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RecipientType.THIRD_PARTY_OTHERS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RecipientType.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[RecipientType.THIRD_PARTY_HOME_CLOSING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346212(RecipientType recipientType, TransferWireAccountStore transferWireAccountStore, Continuation<? super C346212> continuation) {
            super(2, continuation);
            this.$recipientType = recipientType;
            this.this$0 = transferWireAccountStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C346212 c346212 = new C346212(this.$recipientType, this.this$0, continuation);
            c346212.L$0 = obj;
            return c346212;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends TransferAccount> list, Continuation<? super Unit> continuation) {
            return invoke2((List<TransferAccount>) list, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<TransferAccount> list, Continuation<? super Unit> continuation) {
            return ((C346212) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            StateFlow2 stateFlow2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List list = (List) this.L$0;
                int i2 = WhenMappings.$EnumSwitchMapping$0[this.$recipientType.ordinal()];
                if (i2 == 1) {
                    stateFlow2 = this.this$0.firstPartyAccountsCache;
                } else {
                    if (i2 != 2) {
                        if (i2 == 3 || i2 == 4) {
                            throw new IllegalStateException("Not supported yet!");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    stateFlow2 = this.this$0.thirdPartyAccountsCache;
                }
                this.label = 1;
                if (stateFlow2.emit(list, this) == coroutine_suspended) {
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
    }
}

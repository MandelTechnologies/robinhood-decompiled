package com.robinhood.librobinhood.data.store.suitability;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.base.SuitabilityStore;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxAwait3;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: TraderSuitabilityStore.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J0\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0016H\u0096@¢\u0006\u0002\u0010\u0017J0\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010\u001aJ,\u0010\u001b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0010\u0012\b\u0012\u00060\u0011j\u0002`\u001c0\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u001dJ\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/suitability/TraderSuitabilityStore;", "Lcom/robinhood/store/base/SuitabilityStore;", "Lcom/robinhood/store/Store;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "investmentProfileStore", "Lcom/robinhood/librobinhood/data/store/identi/InvestmentProfileStore;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/identi/InvestmentProfileStore;Lcom/robinhood/librobinhood/data/store/OrderStore;Lcom/robinhood/store/StoreBundle;)V", "shouldForceSuitability", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Pair;", "", "", "accountNumber", "side", "Lcom/robinhood/models/db/OrderSide;", "(Ljava/lang/String;Lcom/robinhood/models/db/OrderSide;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/db/EquityOrderSide;", "(Ljava/lang/String;Lcom/robinhood/models/db/EquityOrderSide;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "positionEffect", "Lcom/robinhood/models/db/OrderPositionEffect;", "(Ljava/lang/String;Lcom/robinhood/models/db/OrderPositionEffect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkQuestionnaireForAccount", "Lcom/robinhood/store/base/SuitabilityQuestionnaireContext;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSuitabilityQuestionnaireContext", "lib-store-suitability_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class TraderSuitabilityStore extends Store implements SuitabilityStore {
    private final AccountProvider accountProvider;
    private final InvestmentProfileStore investmentProfileStore;
    private final OrderStore orderStore;

    /* compiled from: TraderSuitabilityStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrokerageAccountType.values().length];
            try {
                iArr[BrokerageAccountType.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokerageAccountType.IRA_ROTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: TraderSuitabilityStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.suitability.TraderSuitabilityStore", m3645f = "TraderSuitabilityStore.kt", m3646l = {67}, m3647m = "checkQuestionnaireForAccount")
    /* renamed from: com.robinhood.librobinhood.data.store.suitability.TraderSuitabilityStore$checkQuestionnaireForAccount$1 */
    static final class C348861 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C348861(Continuation<? super C348861> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TraderSuitabilityStore.this.checkQuestionnaireForAccount(null, this);
        }
    }

    /* compiled from: TraderSuitabilityStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.suitability.TraderSuitabilityStore", m3645f = "TraderSuitabilityStore.kt", m3646l = {93}, m3647m = "getSuitabilityQuestionnaireContext")
    /* renamed from: com.robinhood.librobinhood.data.store.suitability.TraderSuitabilityStore$getSuitabilityQuestionnaireContext$1 */
    static final class C348881 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C348881(Continuation<? super C348881> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TraderSuitabilityStore.this.getSuitabilityQuestionnaireContext(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TraderSuitabilityStore(AccountProvider accountProvider, InvestmentProfileStore investmentProfileStore, OrderStore orderStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(investmentProfileStore, "investmentProfileStore");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountProvider = accountProvider;
        this.investmentProfileStore = investmentProfileStore;
        this.orderStore = orderStore;
    }

    @Override // com.robinhood.store.base.SuitabilityStore
    public Object shouldForceSuitability(String str, OrderSide orderSide, Continuation<? super Flow<Tuples2<Boolean, String>>> continuation) {
        if (orderSide != OrderSide.BUY) {
            return FlowKt.flowOf(Tuples4.m3642to(boxing.boxBoolean(false), ""));
        }
        return checkQuestionnaireForAccount(str, continuation);
    }

    @Override // com.robinhood.store.base.SuitabilityStore
    public Object shouldForceSuitability(String str, EquityOrderSide equityOrderSide, Continuation<? super Flow<Tuples2<Boolean, String>>> continuation) {
        if (equityOrderSide != EquityOrderSide.BUY) {
            return FlowKt.flowOf(Tuples4.m3642to(boxing.boxBoolean(false), ""));
        }
        return checkQuestionnaireForAccount(str, continuation);
    }

    @Override // com.robinhood.store.base.SuitabilityStore
    public Object shouldForceSuitability(String str, OrderPositionEffect orderPositionEffect, Continuation<? super Flow<Tuples2<Boolean, String>>> continuation) {
        if (orderPositionEffect == OrderPositionEffect.CLOSE) {
            return FlowKt.flowOf(Tuples4.m3642to(boxing.boxBoolean(false), ""));
        }
        return checkQuestionnaireForAccount(str, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object checkQuestionnaireForAccount(String str, Continuation<? super Flow<Tuples2<Boolean, String>>> continuation) {
        C348861 c348861;
        if (continuation instanceof C348861) {
            c348861 = (C348861) continuation;
            int i = c348861.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c348861.label = i - Integer.MIN_VALUE;
            } else {
                c348861 = new C348861(continuation);
            }
        }
        Object suitabilityQuestionnaireContext = c348861.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c348861.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(suitabilityQuestionnaireContext);
            this.orderStore.refreshSinglePage(false);
            c348861.L$0 = str;
            c348861.label = 1;
            suitabilityQuestionnaireContext = getSuitabilityQuestionnaireContext(str, c348861);
            if (suitabilityQuestionnaireContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c348861.L$0;
            ResultKt.throwOnFailure(suitabilityQuestionnaireContext);
        }
        String str2 = (String) suitabilityQuestionnaireContext;
        if (str2 == null) {
            return FlowKt.flowOf(Tuples4.m3642to(boxing.boxBoolean(false), ""));
        }
        return FlowKt.flowCombine(Context7.buffer$default(RxConvert.asFlow(this.investmentProfileStore.getQuestionnaireCompleted(str2, str)), Integer.MAX_VALUE, null, 2, null), this.orderStore.hasAtLeastOneOrderForAccount(str), new C348872(str2, null));
    }

    /* compiled from: TraderSuitabilityStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "completed", "hasAtLeastOneOrder"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.suitability.TraderSuitabilityStore$checkQuestionnaireForAccount$2", m3645f = "TraderSuitabilityStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.suitability.TraderSuitabilityStore$checkQuestionnaireForAccount$2 */
    static final class C348872 extends ContinuationImpl7 implements Function3<Boolean, Boolean, Continuation<? super Tuples2<? extends Boolean, ? extends String>>, Object> {
        final /* synthetic */ String $context;
        /* synthetic */ boolean Z$0;
        /* synthetic */ boolean Z$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C348872(String str, Continuation<? super C348872> continuation) {
            super(3, continuation);
            this.$context = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Continuation<? super Tuples2<? extends Boolean, ? extends String>> continuation) {
            return invoke(bool.booleanValue(), bool2.booleanValue(), (Continuation<? super Tuples2<Boolean, String>>) continuation);
        }

        public final Object invoke(boolean z, boolean z2, Continuation<? super Tuples2<Boolean, String>> continuation) {
            C348872 c348872 = new C348872(this.$context, continuation);
            c348872.Z$0 = z;
            c348872.Z$1 = z2;
            return c348872.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Tuples4.m3642to(boxing.boxBoolean(!this.Z$0 && this.Z$1), this.$context);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.store.base.SuitabilityStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getSuitabilityQuestionnaireContext(String str, Continuation<? super String> continuation) {
        C348881 c348881;
        if (continuation instanceof C348881) {
            c348881 = (C348881) continuation;
            int i = c348881.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c348881.label = i - Integer.MIN_VALUE;
            } else {
                c348881 = new C348881(continuation);
            }
        }
        Object objAwaitFirst = c348881.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c348881.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitFirst);
            Observable<Account> observableStreamAccount = this.accountProvider.streamAccount(str);
            c348881.label = 1;
            objAwaitFirst = RxAwait3.awaitFirst(observableStreamAccount, c348881);
            if (objAwaitFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwaitFirst);
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[((Account) objAwaitFirst).getBrokerageAccountType().ordinal()];
        if (i3 == 1) {
            return QuestionnaireContexts.SECOND_TRADE;
        }
        if (i3 == 2) {
            return QuestionnaireContexts.SUITABILITY_ROTH_IRA;
        }
        if (i3 == 3) {
            return QuestionnaireContexts.SUITABILITY_TRADITIONAL_IRA;
        }
        if (i3 != 4) {
            return null;
        }
        return QuestionnaireContexts.JOINT_ACCOUNT_SECOND_TRADE;
    }
}

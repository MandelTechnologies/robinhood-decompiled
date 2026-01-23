package com.stripe.android.cards;

import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.BinRange;
import com.stripe.android.model.CardBrand;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CardAccountRangeService.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001>B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010&R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010'R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R0\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b1\u00102R*\u00104\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b4\u00105\u0012\u0004\b:\u0010\u001e\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0013\u0010=\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006?"}, m3636d2 = {"Lcom/stripe/android/cards/CardAccountRangeService;", "", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "cardAccountRangeRepository", "Lkotlin/coroutines/CoroutineContext;", "uiContext", "workContext", "Lcom/stripe/android/cards/StaticCardAccountRanges;", "staticCardAccountRanges", "Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;", "accountRangeResultListener", "Lkotlin/Function0;", "", "isCbcEligible", "<init>", "(Lcom/stripe/android/cards/CardAccountRangeRepository;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/StaticCardAccountRanges;Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;Lkotlin/jvm/functions/Function0;)V", "", "Lcom/stripe/android/model/AccountRange;", "accountRanges", "shouldQueryRepository", "(Ljava/util/List;)Z", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "cardNumber", "shouldQueryAccountRange", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;)Z", "", "onCardNumberChanged", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;)V", "queryAccountRangeRepository", "cancelAccountRangeRepositoryJob", "()V", "updateAccountRangesResult", "(Ljava/util/List;)V", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "Lkotlin/coroutines/CoroutineContext;", "Lcom/stripe/android/cards/StaticCardAccountRanges;", "getStaticCardAccountRanges", "()Lcom/stripe/android/cards/StaticCardAccountRanges;", "Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;", "Lkotlin/jvm/functions/Function0;", "Lkotlinx/coroutines/flow/StateFlow;", "isLoading", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/cards/Bin;", "lastBin", "Lcom/stripe/android/cards/Bin;", "<set-?>", "Ljava/util/List;", "getAccountRanges", "()Ljava/util/List;", "Lkotlinx/coroutines/Job;", "accountRangeRepositoryJob", "Lkotlinx/coroutines/Job;", "getAccountRangeRepositoryJob", "()Lkotlinx/coroutines/Job;", "setAccountRangeRepositoryJob", "(Lkotlinx/coroutines/Job;)V", "getAccountRangeRepositoryJob$annotations", "getAccountRange", "()Lcom/stripe/android/model/AccountRange;", "accountRange", "AccountRangeResultListener", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class CardAccountRangeService {
    private Job accountRangeRepositoryJob;
    private final AccountRangeResultListener accountRangeResultListener;
    private List<AccountRange> accountRanges;
    private final CardAccountRangeRepository cardAccountRangeRepository;
    private final Function0<Boolean> isCbcEligible;
    private final StateFlow<Boolean> isLoading;
    private Bin lastBin;
    private final StaticCardAccountRanges staticCardAccountRanges;
    private final CoroutineContext uiContext;
    private final CoroutineContext workContext;

    /* compiled from: CardAccountRangeService.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;", "", "onAccountRangesResult", "", "accountRanges", "", "Lcom/stripe/android/model/AccountRange;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface AccountRangeResultListener {
        void onAccountRangesResult(List<AccountRange> accountRanges);
    }

    /* compiled from: CardAccountRangeService.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardBrand.values().length];
            try {
                iArr[CardBrand.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardBrand.UnionPay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CardAccountRangeService(CardAccountRangeRepository cardAccountRangeRepository, CoroutineContext uiContext, CoroutineContext workContext, StaticCardAccountRanges staticCardAccountRanges, AccountRangeResultListener accountRangeResultListener, Function0<Boolean> isCbcEligible) {
        Intrinsics.checkNotNullParameter(cardAccountRangeRepository, "cardAccountRangeRepository");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(staticCardAccountRanges, "staticCardAccountRanges");
        Intrinsics.checkNotNullParameter(accountRangeResultListener, "accountRangeResultListener");
        Intrinsics.checkNotNullParameter(isCbcEligible, "isCbcEligible");
        this.cardAccountRangeRepository = cardAccountRangeRepository;
        this.uiContext = uiContext;
        this.workContext = workContext;
        this.staticCardAccountRanges = staticCardAccountRanges;
        this.accountRangeResultListener = accountRangeResultListener;
        this.isCbcEligible = isCbcEligible;
        this.isLoading = cardAccountRangeRepository.getLoading();
        this.accountRanges = CollectionsKt.emptyList();
    }

    public final StaticCardAccountRanges getStaticCardAccountRanges() {
        return this.staticCardAccountRanges;
    }

    public final List<AccountRange> getAccountRanges() {
        return this.accountRanges;
    }

    public final AccountRange getAccountRange() {
        return (AccountRange) CollectionsKt.firstOrNull((List) this.accountRanges);
    }

    public final void onCardNumberChanged(CardNumber.Unvalidated cardNumber) {
        List<AccountRange> listEmptyList;
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        boolean zBooleanValue = this.isCbcEligible.invoke().booleanValue();
        if (zBooleanValue && cardNumber.getLength() < 8) {
            updateAccountRangesResult(CollectionsKt.emptyList());
            return;
        }
        if (this.isCbcEligible.invoke().booleanValue()) {
            listEmptyList = CbcTestCardDelegate.INSTANCE.onCardNumberChanged(cardNumber);
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (!listEmptyList.isEmpty()) {
            updateAccountRangesResult(listEmptyList);
            return;
        }
        List<AccountRange> listFilter = this.staticCardAccountRanges.filter(cardNumber);
        if (zBooleanValue) {
            queryAccountRangeRepository(cardNumber);
        } else if (listFilter.isEmpty() || shouldQueryRepository(listFilter)) {
            queryAccountRangeRepository(cardNumber);
        } else {
            updateAccountRangesResult(listFilter);
        }
    }

    public final /* synthetic */ void queryAccountRangeRepository(CardNumber.Unvalidated cardNumber) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        if (shouldQueryAccountRange(cardNumber)) {
            cancelAccountRangeRepositoryJob();
            this.accountRanges = CollectionsKt.emptyList();
            this.accountRangeRepositoryJob = BuildersKt__Builders_commonKt.launch$default(CoroutineScope2.CoroutineScope(this.workContext), null, null, new C425111(cardNumber, this, null), 3, null);
        }
    }

    /* compiled from: CardAccountRangeService.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.cards.CardAccountRangeService$queryAccountRangeRepository$1", m3645f = "CardAccountRangeService.kt", m3646l = {86, 91}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.cards.CardAccountRangeService$queryAccountRangeRepository$1 */
    static final class C425111 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CardNumber.Unvalidated $cardNumber;
        int label;
        final /* synthetic */ CardAccountRangeService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C425111(CardNumber.Unvalidated unvalidated, CardAccountRangeService cardAccountRangeService, Continuation<? super C425111> continuation) {
            super(2, continuation);
            this.$cardNumber = unvalidated;
            this.this$0 = cardAccountRangeService;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C425111(this.$cardNumber, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C425111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        
            if (r7 == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r1, r4, r6) != r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List list;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$cardNumber.getBin() != null) {
                    CardAccountRangeRepository cardAccountRangeRepository = this.this$0.cardAccountRangeRepository;
                    CardNumber.Unvalidated unvalidated = this.$cardNumber;
                    this.label = 1;
                    obj = cardAccountRangeRepository.getAccountRanges(unvalidated, this);
                } else {
                    list = null;
                    CoroutineContext coroutineContext = this.this$0.uiContext;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, list, null);
                    this.label = 2;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            list = (List) obj;
            CoroutineContext coroutineContext2 = this.this$0.uiContext;
            AnonymousClass1 anonymousClass12 = new AnonymousClass1(this.this$0, list, null);
            this.label = 2;
        }

        /* compiled from: CardAccountRangeService.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.stripe.android.cards.CardAccountRangeService$queryAccountRangeRepository$1$1", m3645f = "CardAccountRangeService.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.stripe.android.cards.CardAccountRangeService$queryAccountRangeRepository$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<AccountRange> $accountRanges;
            int label;
            final /* synthetic */ CardAccountRangeService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CardAccountRangeService cardAccountRangeService, List<AccountRange> list, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cardAccountRangeService;
                this.$accountRanges = list;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$accountRanges, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CardAccountRangeService cardAccountRangeService = this.this$0;
                List<AccountRange> listEmptyList = this.$accountRanges;
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                cardAccountRangeService.updateAccountRangesResult(listEmptyList);
                return Unit.INSTANCE;
            }
        }
    }

    public final void cancelAccountRangeRepositoryJob() {
        Job job = this.accountRangeRepositoryJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.accountRangeRepositoryJob = null;
    }

    public final void updateAccountRangesResult(List<AccountRange> accountRanges) {
        Intrinsics.checkNotNullParameter(accountRanges, "accountRanges");
        this.accountRanges = accountRanges;
        this.accountRangeResultListener.onAccountRangesResult(accountRanges);
    }

    private final boolean shouldQueryRepository(List<AccountRange> accountRanges) {
        AccountRange accountRange = (AccountRange) CollectionsKt.firstOrNull((List) accountRanges);
        CardBrand brand = accountRange != null ? accountRange.getBrand() : null;
        int i = brand == null ? -1 : WhenMappings.$EnumSwitchMapping$0[brand.ordinal()];
        return i == 1 || i == 2;
    }

    private final boolean shouldQueryAccountRange(CardNumber.Unvalidated cardNumber) {
        AccountRange accountRange;
        BinRange binRange;
        boolean z = getAccountRange() == null || cardNumber.getBin() == null || !(((accountRange = getAccountRange()) == null || (binRange = accountRange.getBinRange()) == null || binRange.matches(cardNumber)) && Intrinsics.areEqual(cardNumber.getBin(), this.lastBin));
        this.lastBin = cardNumber.getBin();
        return z;
    }
}

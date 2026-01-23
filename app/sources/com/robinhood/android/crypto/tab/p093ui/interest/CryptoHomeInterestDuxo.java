package com.robinhood.android.crypto.tab.p093ui.interest;

import com.robinhood.android.lib.formats.datetime.LocalizedDateTimeFormatter;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoCashInterestStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.rosetta.common.CurrencyDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import moneytree.p510v1.GetMembershipDetailsResponseDto;
import moneytree.p510v1.VendorDto;
import p479j$.time.Clock;

/* compiled from: CryptoHomeInterestDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestDataState;", "Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestViewState;", "Lcom/robinhood/librobinhood/data/store/CryptoCashInterestStore;", "cryptoCashInterestStore", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;", "localizedDateTimeFormatter", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoCashInterestStore;Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;Lj$/time/Clock;Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "", "onCreate", "()V", "Lcom/robinhood/librobinhood/data/store/CryptoCashInterestStore;", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoHomeInterestDuxo extends BaseDuxo<CryptoHomeInterestDataState, CryptoHomeInterestViewState> {
    public static final int $stable = 8;
    private final CryptoCashInterestStore cryptoCashInterestStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoHomeInterestDuxo(CryptoCashInterestStore cryptoCashInterestStore, LocalizedDateTimeFormatter localizedDateTimeFormatter, Clock clock, CryptoHomeInterestStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new CryptoHomeInterestDataState(null, localizedDateTimeFormatter, clock, 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(cryptoCashInterestStore, "cryptoCashInterestStore");
        Intrinsics.checkNotNullParameter(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.cryptoCashInterestStore = cryptoCashInterestStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C131581(null));
    }

    /* compiled from: CryptoHomeInterestDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestDuxo$onCreate$1", m3645f = "CryptoHomeInterestDuxo.kt", m3646l = {45}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestDuxo$onCreate$1 */
    static final class C131581 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C131581(Continuation<? super C131581> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoHomeInterestDuxo.this.new C131581(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C131581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoCashInterestStore cryptoCashInterestStore = CryptoHomeInterestDuxo.this.cryptoCashInterestStore;
                VendorDto vendorDto = VendorDto.VENDOR_JPM;
                CurrencyDto currencyDto = CurrencyDto.EUR;
                cryptoCashInterestStore.refreshMembershipDetails(vendorDto, currencyDto, true);
                Flow<GetMembershipDetailsResponseDto> flowStreamMembershipDetails = CryptoHomeInterestDuxo.this.cryptoCashInterestStore.streamMembershipDetails(vendorDto, currencyDto);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoHomeInterestDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamMembershipDetails, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoHomeInterestDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "membership", "Lmoneytree/v1/GetMembershipDetailsResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestDuxo$onCreate$1$1", m3645f = "CryptoHomeInterestDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GetMembershipDetailsResponseDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoHomeInterestDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoHomeInterestDuxo cryptoHomeInterestDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoHomeInterestDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GetMembershipDetailsResponseDto getMembershipDetailsResponseDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(getMembershipDetailsResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoHomeInterestDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestDuxo$onCreate$1$1$1", m3645f = "CryptoHomeInterestDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497571 extends ContinuationImpl7 implements Function2<CryptoHomeInterestDataState, Continuation<? super CryptoHomeInterestDataState>, Object> {
                final /* synthetic */ GetMembershipDetailsResponseDto $membership;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497571(GetMembershipDetailsResponseDto getMembershipDetailsResponseDto, Continuation<? super C497571> continuation) {
                    super(2, continuation);
                    this.$membership = getMembershipDetailsResponseDto;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497571 c497571 = new C497571(this.$membership, continuation);
                    c497571.L$0 = obj;
                    return c497571;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoHomeInterestDataState cryptoHomeInterestDataState, Continuation<? super CryptoHomeInterestDataState> continuation) {
                    return ((C497571) create(cryptoHomeInterestDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoHomeInterestDataState.copy$default((CryptoHomeInterestDataState) this.L$0, this.$membership, null, null, 6, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C497571((GetMembershipDetailsResponseDto) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}

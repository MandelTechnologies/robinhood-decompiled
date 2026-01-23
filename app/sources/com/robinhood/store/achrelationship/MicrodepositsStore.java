package com.robinhood.store.achrelationship;

import com.robinhood.android.api.cashier.Cashier;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.transfers.lib.lastused.PaymentMethodLastUsagesPref;
import com.robinhood.android.transfers.lib.lastused.UpdatePaymentMethodLastUsed;
import com.robinhood.api.retrofit.Ach;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.prefs.DefaultAchRelationship;
import com.robinhood.librobinhood.data.prefs.HasQueuedDepositPref;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.AchRelationshipStore4;
import com.robinhood.librobinhood.data.store.AchRelationshipStore6;
import com.robinhood.models.api.AchVerificationRequest;
import com.robinhood.models.api.ApiAchRelationship;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.AchRelationship2;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.math.BigDecimal;
import java.util.UUID;
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

/* compiled from: MicrodepositsStore.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001BW\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dJ'\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0002\u0010&J\u0010\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020)H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m3636d2 = {"Lcom/robinhood/store/achrelationship/MicrodepositsStore;", "Lcom/robinhood/store/Store;", "hasQueuedDepositPref", "Lcom/robinhood/prefs/BooleanPreference;", "defaultAchRelationshipPref", "Lcom/robinhood/prefs/StringPreference;", "paymentMethodLastUsagesPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "ach", "Lcom/robinhood/api/retrofit/Ach;", "cashier", "Lcom/robinhood/android/api/cashier/Cashier;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringToLongMapPreference;Lcom/robinhood/api/retrofit/Ach;Lcom/robinhood/android/api/cashier/Cashier;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/store/StoreBundle;)V", "createAchRelationship", "Lio/reactivex/Single;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/AchRelationship;", "bankAccountType", "Lcom/robinhood/models/api/ApiAchRelationship$BankAccountType;", "bankAccountNumber", "", "bankRoutingNumber", Card.Icon.VERIFY, "Lio/reactivex/Completable;", "achRhId", "Ljava/util/UUID;", "amountOne", "", "amountTwo", "(Ljava/util/UUID;Ljava/lang/Integer;Ljava/lang/Integer;)Lio/reactivex/Completable;", "createQueuedTransfer", "request", "Lcom/robinhood/models/api/AchVerificationRequest;", "lib-store-ach-relationship_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class MicrodepositsStore extends Store {
    private final AccountProvider accountProvider;
    private final Ach ach;
    private final AchRelationshipStore achRelationshipStore;
    private final Cashier cashier;
    private final StringPreference defaultAchRelationshipPref;
    private final BooleanPreference hasQueuedDepositPref;
    private final StringToLongMapPreference paymentMethodLastUsagesPref;
    private final UserStore userStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicrodepositsStore(@HasQueuedDepositPref BooleanPreference hasQueuedDepositPref, @DefaultAchRelationship StringPreference defaultAchRelationshipPref, @PaymentMethodLastUsagesPref StringToLongMapPreference paymentMethodLastUsagesPref, Ach ach, Cashier cashier, AccountProvider accountProvider, AchRelationshipStore achRelationshipStore, UserStore userStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(hasQueuedDepositPref, "hasQueuedDepositPref");
        Intrinsics.checkNotNullParameter(defaultAchRelationshipPref, "defaultAchRelationshipPref");
        Intrinsics.checkNotNullParameter(paymentMethodLastUsagesPref, "paymentMethodLastUsagesPref");
        Intrinsics.checkNotNullParameter(ach, "ach");
        Intrinsics.checkNotNullParameter(cashier, "cashier");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.hasQueuedDepositPref = hasQueuedDepositPref;
        this.defaultAchRelationshipPref = defaultAchRelationshipPref;
        this.paymentMethodLastUsagesPref = paymentMethodLastUsagesPref;
        this.ach = ach;
        this.cashier = cashier;
        this.accountProvider = accountProvider;
        this.achRelationshipStore = achRelationshipStore;
        this.userStore = userStore;
    }

    public final Single<Optional<AchRelationship>> createAchRelationship(final ApiAchRelationship.BankAccountType bankAccountType, final String bankAccountNumber, final String bankRoutingNumber) {
        Intrinsics.checkNotNullParameter(bankAccountType, "bankAccountType");
        Intrinsics.checkNotNullParameter(bankAccountNumber, "bankAccountNumber");
        Intrinsics.checkNotNullParameter(bankRoutingNumber, "bankRoutingNumber");
        Single singleFlatMap = this.accountProvider.forceFetchHasBrokerageAccountIfNotCached().flatMap(new Function() { // from class: com.robinhood.store.achrelationship.MicrodepositsStore.createAchRelationship.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Optional<AchRelationship>> apply(Boolean hasBrokerageAccount) {
                Intrinsics.checkNotNullParameter(hasBrokerageAccount, "hasBrokerageAccount");
                if (!hasBrokerageAccount.booleanValue()) {
                    MicrodepositsStore.this.userStore.refresh(false);
                    Single<User> singleFirstOrError = MicrodepositsStore.this.userStore.getUser().firstOrError();
                    final MicrodepositsStore microdepositsStore = MicrodepositsStore.this;
                    final String str = bankAccountNumber;
                    final ApiAchRelationship.BankAccountType bankAccountType2 = bankAccountType;
                    final String str2 = bankRoutingNumber;
                    return singleFirstOrError.flatMap(new Function() { // from class: com.robinhood.store.achrelationship.MicrodepositsStore.createAchRelationship.1.2
                        @Override // io.reactivex.functions.Function
                        public final SingleSource<? extends Optional> apply(User user) {
                            Intrinsics.checkNotNullParameter(user, "user");
                            MicrodepositsStore microdepositsStore2 = microdepositsStore;
                            BigDecimal ZERO = BigDecimal.ZERO;
                            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                            return microdepositsStore2.createQueuedTransfer(new AchVerificationRequest(ZERO, user.getFullName(), str, bankAccountType2, str2)).andThen(Single.just(Optional.INSTANCE.m2972of(null)));
                        }
                    });
                }
                return MicrodepositsStore.this.achRelationshipStore.createAchRelationship(bankRoutingNumber, bankAccountNumber, bankAccountType).map(new Function() { // from class: com.robinhood.store.achrelationship.MicrodepositsStore.createAchRelationship.1.1
                    @Override // io.reactivex.functions.Function
                    public final Optional<AchRelationship> apply(ApiAchRelationship apiAchRelationship) {
                        Intrinsics.checkNotNullParameter(apiAchRelationship, "apiAchRelationship");
                        return Optional.INSTANCE.m2972of(AchRelationship2.toDbModel(apiAchRelationship));
                    }
                }).firstOrError();
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    public final Completable verify(final UUID achRhId, Integer amountOne, Integer amountTwo) {
        Intrinsics.checkNotNullParameter(achRhId, "achRhId");
        if (!AchRelationshipStore4.microdepositAmountValid(amountOne) || !AchRelationshipStore4.microdepositAmountValid(amountTwo)) {
            Completable completableError = Completable.error(new AchRelationshipStore6());
            Intrinsics.checkNotNullExpressionValue(completableError, "error(...)");
            return completableError;
        }
        Completable completableSubscribeOn = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C412951(achRhId, amountOne, amountTwo, null), 1, null).doOnComplete(new Action() { // from class: com.robinhood.store.achrelationship.MicrodepositsStore.verify.2
            @Override // io.reactivex.functions.Action
            public final void run() {
                StringToLongMapPreference stringToLongMapPreference = MicrodepositsStore.this.paymentMethodLastUsagesPref;
                String string2 = achRhId.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                UpdatePaymentMethodLastUsed.updatePaymentMethodLastUsed(stringToLongMapPreference, string2);
                MicrodepositsStore.this.defaultAchRelationshipPref.set(achRhId.toString());
            }
        }).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(completableSubscribeOn, "subscribeOn(...)");
        return completableSubscribeOn;
    }

    /* compiled from: MicrodepositsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.achrelationship.MicrodepositsStore$verify$1", m3645f = "MicrodepositsStore.kt", m3646l = {96}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.achrelationship.MicrodepositsStore$verify$1 */
    static final class C412951 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $achRhId;
        final /* synthetic */ Integer $amountOne;
        final /* synthetic */ Integer $amountTwo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C412951(UUID uuid, Integer num, Integer num2, Continuation<? super C412951> continuation) {
            super(2, continuation);
            this.$achRhId = uuid;
            this.$amountOne = num;
            this.$amountTwo = num2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MicrodepositsStore.this.new C412951(this.$achRhId, this.$amountOne, this.$amountTwo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C412951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Cashier cashier = MicrodepositsStore.this.cashier;
                UUID uuid = this.$achRhId;
                String strValueOf = String.valueOf(this.$amountOne);
                String strValueOf2 = String.valueOf(this.$amountTwo);
                this.label = 1;
                if (cashier.verifyMicrodeposits(uuid, strValueOf, strValueOf2, this) == coroutine_suspended) {
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

    /* compiled from: MicrodepositsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.achrelationship.MicrodepositsStore$createQueuedTransfer$1", m3645f = "MicrodepositsStore.kt", m3646l = {117}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.achrelationship.MicrodepositsStore$createQueuedTransfer$1 */
    static final class C412921 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AchVerificationRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C412921(AchVerificationRequest achVerificationRequest, Continuation<? super C412921> continuation) {
            super(2, continuation);
            this.$request = achVerificationRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MicrodepositsStore.this.new C412921(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C412921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Ach ach = MicrodepositsStore.this.ach;
                AchVerificationRequest achVerificationRequest = this.$request;
                this.label = 1;
                if (ach.postQueuedAchVerification(achVerificationRequest, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final Completable createQueuedTransfer(final AchVerificationRequest request) {
        Completable completableSubscribeOn = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C412921(request, null), 1, null).doOnComplete(new Action() { // from class: com.robinhood.store.achrelationship.MicrodepositsStore.createQueuedTransfer.2
            @Override // io.reactivex.functions.Action
            public final void run() {
                MicrodepositsStore.this.hasQueuedDepositPref.set(true);
            }
        }).onErrorResumeNext(new Function() { // from class: com.robinhood.store.achrelationship.MicrodepositsStore.createQueuedTransfer.3
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(final Throwable t) {
                Intrinsics.checkNotNullParameter(t, "t");
                Integer httpStatusCode = Throwables.getHttpStatusCode(t);
                if (httpStatusCode != null && httpStatusCode.intValue() == 400) {
                    return MicrodepositsStore.this.achRelationshipStore.createAchRelationship(request.getBank_routing_number(), request.getBank_account_number(), request.getBank_account_type()).ignoreElements().onErrorResumeNext(new Function() { // from class: com.robinhood.store.achrelationship.MicrodepositsStore.createQueuedTransfer.3.1
                        @Override // io.reactivex.functions.Function
                        public final CompletableSource apply(Throwable t1) {
                            Intrinsics.checkNotNullParameter(t1, "t1");
                            return Completable.error(t);
                        }
                    });
                }
                return Completable.error(t);
            }
        }).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(completableSubscribeOn, "subscribeOn(...)");
        return completableSubscribeOn;
    }
}

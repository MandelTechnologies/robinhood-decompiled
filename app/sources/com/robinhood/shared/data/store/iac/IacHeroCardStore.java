package com.robinhood.shared.data.store.iac;

import com.robinhood.models.api.ApiIacActionRequest;
import com.robinhood.models.api.ApiIacHeroCard;
import com.robinhood.models.api.ApiIacHeroCard2;
import com.robinhood.models.api.ApiIacHeroCardLocationArg;
import com.robinhood.models.api.ApiIacHeroCardResponse;
import com.robinhood.models.api.IacDismissMethod;
import com.robinhood.models.p320db.herocard.IacHeroCard;
import com.robinhood.shared.api.iac.IacHeroCardBonfireApi;
import com.robinhood.shared.data.store.iac.heroCard.IacHeroCardDismissalFilter;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.logging.CrashReporter;
import java.util.UUID;
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

/* compiled from: IacHeroCardStore.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010\u0017J \u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016H\u0086@¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/data/store/iac/IacHeroCardStore;", "Lcom/robinhood/store/Store;", "heroCardApi", "Lcom/robinhood/shared/api/iac/IacHeroCardBonfireApi;", "heroCardFilter", "Lcom/robinhood/shared/data/store/iac/heroCard/IacHeroCardDismissalFilter;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/shared/api/iac/IacHeroCardBonfireApi;Lcom/robinhood/shared/data/store/iac/heroCard/IacHeroCardDismissalFilter;Lcom/robinhood/store/StoreBundle;)V", "getIacHeroCard", "Lcom/robinhood/models/db/herocard/IacHeroCard;", "locationArg", "Lcom/robinhood/models/api/ApiIacHeroCardLocationArg;", "(Lcom/robinhood/models/api/ApiIacHeroCardLocationArg;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markIacHeroCardSeen", "", "receiptUuid", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markIacHeroCardTapped", "action", "", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markIacHeroCardDismissed", "cardIdentifier", "lib-store-iac_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public class IacHeroCardStore extends Store {
    private final IacHeroCardBonfireApi heroCardApi;
    private final IacHeroCardDismissalFilter heroCardFilter;

    /* compiled from: IacHeroCardStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.data.store.iac.IacHeroCardStore", m3645f = "IacHeroCardStore.kt", m3646l = {30}, m3647m = "getIacHeroCard")
    /* renamed from: com.robinhood.shared.data.store.iac.IacHeroCardStore$getIacHeroCard$1 */
    static final class C386811 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C386811(Continuation<? super C386811> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IacHeroCardStore.this.getIacHeroCard(null, this);
        }
    }

    /* compiled from: IacHeroCardStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.data.store.iac.IacHeroCardStore", m3645f = "IacHeroCardStore.kt", m3646l = {69}, m3647m = "markIacHeroCardDismissed")
    /* renamed from: com.robinhood.shared.data.store.iac.IacHeroCardStore$markIacHeroCardDismissed$1 */
    static final class C386821 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C386821(Continuation<? super C386821> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IacHeroCardStore.this.markIacHeroCardDismissed(null, null, this);
        }
    }

    /* compiled from: IacHeroCardStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.data.store.iac.IacHeroCardStore", m3645f = "IacHeroCardStore.kt", m3646l = {50}, m3647m = "markIacHeroCardSeen")
    /* renamed from: com.robinhood.shared.data.store.iac.IacHeroCardStore$markIacHeroCardSeen$1 */
    static final class C386831 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C386831(Continuation<? super C386831> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IacHeroCardStore.this.markIacHeroCardSeen(null, this);
        }
    }

    /* compiled from: IacHeroCardStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.data.store.iac.IacHeroCardStore", m3645f = "IacHeroCardStore.kt", m3646l = {59}, m3647m = "markIacHeroCardTapped")
    /* renamed from: com.robinhood.shared.data.store.iac.IacHeroCardStore$markIacHeroCardTapped$1 */
    static final class C386841 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C386841(Continuation<? super C386841> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IacHeroCardStore.this.markIacHeroCardTapped(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IacHeroCardStore(IacHeroCardBonfireApi heroCardApi, IacHeroCardDismissalFilter heroCardFilter, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(heroCardApi, "heroCardApi");
        Intrinsics.checkNotNullParameter(heroCardFilter, "heroCardFilter");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.heroCardApi = heroCardApi;
        this.heroCardFilter = heroCardFilter;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getIacHeroCard(ApiIacHeroCardLocationArg apiIacHeroCardLocationArg, Continuation<? super IacHeroCard> continuation) {
        C386811 c386811;
        Object objM28550constructorimpl;
        ApiIacHeroCard hero_card;
        if (continuation instanceof C386811) {
            c386811 = (C386811) continuation;
            int i = c386811.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c386811.label = i - Integer.MIN_VALUE;
            } else {
                c386811 = new C386811(continuation);
            }
        }
        Object heroCard = c386811.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c386811.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(heroCard);
                Result.Companion companion = Result.INSTANCE;
                IacHeroCardBonfireApi iacHeroCardBonfireApi = this.heroCardApi;
                String location = apiIacHeroCardLocationArg.getLocation();
                UUID instrumentId = apiIacHeroCardLocationArg.getInstrumentId();
                UUID currencyPairId = apiIacHeroCardLocationArg.getCurrencyPairId();
                c386811.L$0 = apiIacHeroCardLocationArg;
                c386811.label = 1;
                heroCard = iacHeroCardBonfireApi.getHeroCard(location, instrumentId, currencyPairId, c386811);
                if (heroCard == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apiIacHeroCardLocationArg = (ApiIacHeroCardLocationArg) c386811.L$0;
                ResultKt.throwOnFailure(heroCard);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((ApiIacHeroCardResponse) heroCard);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, thM28553exceptionOrNullimpl, false, null, 4, null);
        }
        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
            objM28550constructorimpl = null;
        }
        ApiIacHeroCardResponse apiIacHeroCardResponse = (ApiIacHeroCardResponse) objM28550constructorimpl;
        if (apiIacHeroCardResponse == null || (hero_card = apiIacHeroCardResponse.getHero_card()) == null) {
            return null;
        }
        if (!this.heroCardFilter.filterByCardIdentifier(hero_card.getCard_identifier())) {
            hero_card = null;
        }
        if (hero_card != null) {
            return ApiIacHeroCard2.toDbModel(hero_card, apiIacHeroCardLocationArg);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object markIacHeroCardSeen(UUID uuid, Continuation<? super Boolean> continuation) {
        C386831 c386831;
        Object objM28550constructorimpl;
        if (continuation instanceof C386831) {
            c386831 = (C386831) continuation;
            int i = c386831.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c386831.label = i - Integer.MIN_VALUE;
            } else {
                c386831 = new C386831(continuation);
            }
        }
        Object obj = c386831.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c386831.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Result.Companion companion = Result.INSTANCE;
                IacHeroCardBonfireApi iacHeroCardBonfireApi = this.heroCardApi;
                c386831.label = 1;
                if (iacHeroCardBonfireApi.postHeroCardSeen(uuid, c386831) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        return boxing.boxBoolean(Result.m28556isSuccessimpl(objM28550constructorimpl));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object markIacHeroCardTapped(UUID uuid, String str, Continuation<? super Boolean> continuation) {
        C386841 c386841;
        Object objM28550constructorimpl;
        if (continuation instanceof C386841) {
            c386841 = (C386841) continuation;
            int i = c386841.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c386841.label = i - Integer.MIN_VALUE;
            } else {
                c386841 = new C386841(continuation);
            }
        }
        Object obj = c386841.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c386841.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Result.Companion companion = Result.INSTANCE;
                IacHeroCardBonfireApi iacHeroCardBonfireApi = this.heroCardApi;
                ApiIacActionRequest apiIacActionRequest = new ApiIacActionRequest(str);
                c386841.label = 1;
                if (iacHeroCardBonfireApi.postHeroCardTapped(uuid, apiIacActionRequest, c386841) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        return boxing.boxBoolean(Result.m28556isSuccessimpl(objM28550constructorimpl));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object markIacHeroCardDismissed(UUID uuid, String str, Continuation<? super Boolean> continuation) {
        C386821 c386821;
        Object objM28550constructorimpl;
        if (continuation instanceof C386821) {
            c386821 = (C386821) continuation;
            int i = c386821.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c386821.label = i - Integer.MIN_VALUE;
            } else {
                c386821 = new C386821(continuation);
            }
        }
        Object obj = c386821.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c386821.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.heroCardFilter.recordDismissal(str);
                Result.Companion companion = Result.INSTANCE;
                IacHeroCardBonfireApi iacHeroCardBonfireApi = this.heroCardApi;
                IacDismissMethod iacDismissMethod = IacDismissMethod.PASSIVE;
                c386821.label = 1;
                if (iacHeroCardBonfireApi.postHeroCardDismissed(uuid, iacDismissMethod, c386821) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        return boxing.boxBoolean(Result.m28556isSuccessimpl(objM28550constructorimpl));
    }
}

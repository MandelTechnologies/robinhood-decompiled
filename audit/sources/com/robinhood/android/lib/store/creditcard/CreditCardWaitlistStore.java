package com.robinhood.android.lib.store.creditcard;

import com.robinhood.android.api.creditcard.waitlist.CreditCardWaitlistApi;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.lib.store.creditcard.prefs.CreditCardWaitlistReferralCodePref;
import com.robinhood.models.api.bonfire.waitlist.ApiEmailWaitlistSpot;
import com.robinhood.prefs.StringPreference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CreditCardWaitlistStore.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ\"\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0086@¢\u0006\u0002\u0010\u0011J4\u0010\u0012\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u00132\u001e\b\u0004\u0010\u0014\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00130\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0015H\u0082H¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/lib/store/creditcard/CreditCardWaitlistStore;", "Lcom/robinhood/store/Store;", "creditCardWaitlistReferralCode", "Lcom/robinhood/prefs/StringPreference;", "waitlistApi", "Lcom/robinhood/android/api/creditcard/waitlist/CreditCardWaitlistApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/android/api/creditcard/waitlist/CreditCardWaitlistApi;Lcom/robinhood/store/StoreBundle;)V", "getWaitlistStatus", "Lcom/robinhood/models/api/bonfire/waitlist/ApiEmailWaitlistSpot;", "email", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "joinWaitlist", "source", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withScopeContext", "T", CarResultComposable2.BODY, "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CreditCardWaitlistStore extends Store {
    public static final int $stable = 8;
    private final StringPreference creditCardWaitlistReferralCode;
    private final CreditCardWaitlistApi waitlistApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditCardWaitlistStore(@CreditCardWaitlistReferralCodePref StringPreference creditCardWaitlistReferralCode, CreditCardWaitlistApi waitlistApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(creditCardWaitlistReferralCode, "creditCardWaitlistReferralCode");
        Intrinsics.checkNotNullParameter(waitlistApi, "waitlistApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.creditCardWaitlistReferralCode = creditCardWaitlistReferralCode;
        this.waitlistApi = waitlistApi;
    }

    public static /* synthetic */ Object joinWaitlist$default(CreditCardWaitlistStore creditCardWaitlistStore, String str, String str2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return creditCardWaitlistStore.joinWaitlist(str, str2, continuation);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: CreditCardWaitlistStore.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.store.creditcard.CreditCardWaitlistStore$withScopeContext$2", m3645f = "CreditCardWaitlistStore.kt", m3646l = {37}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.store.creditcard.CreditCardWaitlistStore$withScopeContext$2 */
    public static final class C205652<T> extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ Function1<Continuation<? super T>, Object> $body;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C205652(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super C205652> continuation) {
            super(2, continuation);
            this.$body = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C205652(this.$body, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((C205652) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Function1<Continuation<? super T>, Object> function1 = this.$body;
            this.label = 1;
            Object objInvoke = function1.invoke(this);
            return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            return this.$body.invoke(this);
        }
    }

    private final <T> Object withScopeContext(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        CoroutineContext coroutineContext = getStoreScope().getCoroutineContext();
        C205652 c205652 = new C205652(function1, null);
        InlineMarker.mark(0);
        Object objWithContext = BuildersKt.withContext(coroutineContext, c205652, continuation);
        InlineMarker.mark(1);
        return objWithContext;
    }

    public final Object getWaitlistStatus(String str, Continuation<? super ApiEmailWaitlistSpot> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new CreditCardWaitlistStore2(null, this, str), continuation);
    }

    public final Object joinWaitlist(String str, String str2, Continuation<? super ApiEmailWaitlistSpot> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new CreditCardWaitlistStore3(null, this, str, str2), continuation);
    }
}

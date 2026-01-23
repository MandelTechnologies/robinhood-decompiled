package com.robinhood.librobinhood.data.store;

import com.robinhood.api.retrofit.Nummus;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiCryptoActivation;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.extensions.Throwables;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoUpgradeStore.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0086@¢\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u000bJ\u000e\u0010\r\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "nummus", "Lcom/robinhood/api/retrofit/Nummus;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/api/retrofit/Nummus;)V", "fetchActivations", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiCryptoActivation;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createActivation", "fetchCryptoUpgradeEligibility", "Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore$CryptoUpgradeEligibility;", "CryptoUpgradeEligibility", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoUpgradeStore extends Store {
    private final Nummus nummus;

    /* compiled from: CryptoUpgradeStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoUpgradeStore", m3645f = "CryptoUpgradeStore.kt", m3646l = {42}, m3647m = "fetchCryptoUpgradeEligibility")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoUpgradeStore$fetchCryptoUpgradeEligibility$1 */
    static final class C337821 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C337821(Continuation<? super C337821> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoUpgradeStore.this.fetchCryptoUpgradeEligibility(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoUpgradeStore(StoreBundle storeBundle, Nummus nummus2) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(nummus2, "nummus");
        this.nummus = nummus2;
    }

    /* compiled from: CryptoUpgradeStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore$CryptoUpgradeEligibility;", "", "<init>", "()V", "Eligible", "NotEligible", "Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore$CryptoUpgradeEligibility$Eligible;", "Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore$CryptoUpgradeEligibility$NotEligible;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class CryptoUpgradeEligibility {
        public /* synthetic */ CryptoUpgradeEligibility(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CryptoUpgradeEligibility() {
        }

        /* compiled from: CryptoUpgradeStore.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore$CryptoUpgradeEligibility$Eligible;", "Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore$CryptoUpgradeEligibility;", "externalStatusCode", "", "<init>", "(Ljava/lang/String;)V", "getExternalStatusCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Eligible extends CryptoUpgradeEligibility {
            private final String externalStatusCode;

            public static /* synthetic */ Eligible copy$default(Eligible eligible, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = eligible.externalStatusCode;
                }
                return eligible.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getExternalStatusCode() {
                return this.externalStatusCode;
            }

            public final Eligible copy(String externalStatusCode) {
                return new Eligible(externalStatusCode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Eligible) && Intrinsics.areEqual(this.externalStatusCode, ((Eligible) other).externalStatusCode);
            }

            public int hashCode() {
                String str = this.externalStatusCode;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "Eligible(externalStatusCode=" + this.externalStatusCode + ")";
            }

            public Eligible(String str) {
                super(null);
                this.externalStatusCode = str;
            }

            public final String getExternalStatusCode() {
                return this.externalStatusCode;
            }
        }

        /* compiled from: CryptoUpgradeStore.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore$CryptoUpgradeEligibility$NotEligible;", "Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore$CryptoUpgradeEligibility;", "<init>", "()V", "HasExternalStatusCode", "RequestError", "Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore$CryptoUpgradeEligibility$NotEligible$HasExternalStatusCode;", "Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore$CryptoUpgradeEligibility$NotEligible$RequestError;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static abstract class NotEligible extends CryptoUpgradeEligibility {
            public /* synthetic */ NotEligible(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private NotEligible() {
                super(null);
            }

            /* compiled from: CryptoUpgradeStore.kt */
            @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore$CryptoUpgradeEligibility$NotEligible$HasExternalStatusCode;", "Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore$CryptoUpgradeEligibility$NotEligible;", "externalStatusCode", "", "<init>", "(Ljava/lang/String;)V", "getExternalStatusCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class HasExternalStatusCode extends NotEligible {
                private final String externalStatusCode;

                public static /* synthetic */ HasExternalStatusCode copy$default(HasExternalStatusCode hasExternalStatusCode, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = hasExternalStatusCode.externalStatusCode;
                    }
                    return hasExternalStatusCode.copy(str);
                }

                /* renamed from: component1, reason: from getter */
                public final String getExternalStatusCode() {
                    return this.externalStatusCode;
                }

                public final HasExternalStatusCode copy(String externalStatusCode) {
                    Intrinsics.checkNotNullParameter(externalStatusCode, "externalStatusCode");
                    return new HasExternalStatusCode(externalStatusCode);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof HasExternalStatusCode) && Intrinsics.areEqual(this.externalStatusCode, ((HasExternalStatusCode) other).externalStatusCode);
                }

                public int hashCode() {
                    return this.externalStatusCode.hashCode();
                }

                public String toString() {
                    return "HasExternalStatusCode(externalStatusCode=" + this.externalStatusCode + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public HasExternalStatusCode(String externalStatusCode) {
                    super(null);
                    Intrinsics.checkNotNullParameter(externalStatusCode, "externalStatusCode");
                    this.externalStatusCode = externalStatusCode;
                }

                public final String getExternalStatusCode() {
                    return this.externalStatusCode;
                }
            }

            /* compiled from: CryptoUpgradeStore.kt */
            @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore$CryptoUpgradeEligibility$NotEligible$RequestError;", "Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore$CryptoUpgradeEligibility$NotEligible;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class RequestError extends NotEligible {
                public static final RequestError INSTANCE = new RequestError();

                public boolean equals(Object other) {
                    return this == other || (other instanceof RequestError);
                }

                public int hashCode() {
                    return -1060922102;
                }

                public String toString() {
                    return "RequestError";
                }

                private RequestError() {
                    super(null);
                }
            }
        }
    }

    public final Object fetchActivations(Continuation<? super PaginatedResult<ApiCryptoActivation>> continuation) {
        return this.nummus.getActivations(continuation);
    }

    public final Object createActivation(Continuation<? super ApiCryptoActivation> continuation) {
        return this.nummus.createActivation(new ApiCryptoActivation.Request(ApiCryptoActivation.TYPE_NEW_ACCOUNT, false, 2, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchCryptoUpgradeEligibility(Continuation<? super CryptoUpgradeEligibility> continuation) throws Exception {
        C337821 c337821;
        if (continuation instanceof C337821) {
            c337821 = (C337821) continuation;
            int i = c337821.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c337821.label = i - Integer.MIN_VALUE;
            } else {
                c337821 = new C337821(continuation);
            }
        }
        Object objCreateActivation = c337821.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c337821.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCreateActivation);
                ApiCryptoActivation.Request request = new ApiCryptoActivation.Request(ApiCryptoActivation.TYPE_NEW_ACCOUNT, true);
                Nummus nummus2 = this.nummus;
                c337821.label = 1;
                objCreateActivation = nummus2.createActivation(request, c337821);
                if (objCreateActivation == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCreateActivation);
            }
            String external_status_code = ((ApiCryptoActivation) objCreateActivation).getExternal_status_code();
            if (external_status_code != null && !Intrinsics.areEqual(external_status_code, "ineligible_jurisdiction2") && !Intrinsics.areEqual(external_status_code, "ineligible_jurisdiction3")) {
                return new CryptoUpgradeEligibility.NotEligible.HasExternalStatusCode(external_status_code);
            }
            return new CryptoUpgradeEligibility.Eligible(external_status_code);
        } catch (Exception e) {
            if (Throwables.is4xxHttpException(e)) {
                return CryptoUpgradeEligibility.NotEligible.RequestError.INSTANCE;
            }
            throw e;
        }
    }
}

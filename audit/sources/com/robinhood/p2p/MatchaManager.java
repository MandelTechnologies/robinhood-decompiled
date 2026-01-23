package com.robinhood.p2p;

import com.robinhood.android.models.matcha.api.ApiLatestSoftAttribution;
import com.robinhood.android.models.matcha.api.MatchaTransactionType;
import com.robinhood.android.models.matcha.api.OnboardingEntryPoint;
import com.robinhood.android.models.matcha.api.OnboardingEntryPoint2;
import com.robinhood.api.matcha.MatchaApi;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.MatchaOnboardingDataPref;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MatchaManager.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/p2p/MatchaManager;", "", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "matchaApi", "Lcom/robinhood/api/matcha/MatchaApi;", "matchaOnboardingDataPref", "Lcom/robinhood/prefs/StringPreference;", "<init>", "(Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/api/matcha/MatchaApi;Lcom/robinhood/prefs/StringPreference;)V", "transactionArgsAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/p2p/MatchaManager$TransactionArgs;", "saveTransactionForOnboarding", "", "transactionId", "", "transactionType", "getTransactionForOnboarding", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "TransactionArgs", "lib-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes22.dex */
public final class MatchaManager {
    public static final int $stable = 8;
    private final MatchaApi matchaApi;
    private final StringPreference matchaOnboardingDataPref;
    private final JsonAdapter<TransactionArgs> transactionArgsAdapter;

    /* compiled from: MatchaManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.p2p.MatchaManager", m3645f = "MatchaManager.kt", m3646l = {54}, m3647m = "getTransactionForOnboarding")
    /* renamed from: com.robinhood.p2p.MatchaManager$getTransactionForOnboarding$1 */
    static final class C359561 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C359561(Continuation<? super C359561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MatchaManager.this.getTransactionForOnboarding(this);
        }
    }

    public MatchaManager(LazyMoshi moshi, MatchaApi matchaApi, @MatchaOnboardingDataPref StringPreference matchaOnboardingDataPref) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(matchaApi, "matchaApi");
        Intrinsics.checkNotNullParameter(matchaOnboardingDataPref, "matchaOnboardingDataPref");
        this.matchaApi = matchaApi;
        this.matchaOnboardingDataPref = matchaOnboardingDataPref;
        Types types = Types.INSTANCE;
        this.transactionArgsAdapter = moshi.adapter(new TypeToken<TransactionArgs>() { // from class: com.robinhood.p2p.MatchaManager$special$$inlined$getAdapter$1
        }.getType());
    }

    /* compiled from: MatchaManager.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/p2p/MatchaManager$TransactionArgs;", "", "transactionId", "", "transactionType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTransactionId", "()Ljava/lang/String;", "getTransactionType", "entryPointIdentifier", "getEntryPointIdentifier", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TransactionArgs {
        public static final int $stable = 0;
        private final String transactionId;
        private final String transactionType;

        public static /* synthetic */ TransactionArgs copy$default(TransactionArgs transactionArgs, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = transactionArgs.transactionId;
            }
            if ((i & 2) != 0) {
                str2 = transactionArgs.transactionType;
            }
            return transactionArgs.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTransactionId() {
            return this.transactionId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTransactionType() {
            return this.transactionType;
        }

        public final TransactionArgs copy(String transactionId, String transactionType) {
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            Intrinsics.checkNotNullParameter(transactionType, "transactionType");
            return new TransactionArgs(transactionId, transactionType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransactionArgs)) {
                return false;
            }
            TransactionArgs transactionArgs = (TransactionArgs) other;
            return Intrinsics.areEqual(this.transactionId, transactionArgs.transactionId) && Intrinsics.areEqual(this.transactionType, transactionArgs.transactionType);
        }

        public int hashCode() {
            return (this.transactionId.hashCode() * 31) + this.transactionType.hashCode();
        }

        public String toString() {
            return "TransactionArgs(transactionId=" + this.transactionId + ", transactionType=" + this.transactionType + ")";
        }

        public TransactionArgs(String transactionId, String transactionType) {
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            Intrinsics.checkNotNullParameter(transactionType, "transactionType");
            this.transactionId = transactionId;
            this.transactionType = transactionType;
        }

        public final String getTransactionId() {
            return this.transactionId;
        }

        public final String getTransactionType() {
            return this.transactionType;
        }

        public final String getEntryPointIdentifier() {
            OnboardingEntryPoint onboardingEntryPoint;
            MatchaTransactionType matchaTransactionTypeFromServerValue = MatchaTransactionType.INSTANCE.fromServerValue(this.transactionType);
            if (matchaTransactionTypeFromServerValue == null || (onboardingEntryPoint = OnboardingEntryPoint2.getOnboardingEntryPoint(matchaTransactionTypeFromServerValue)) == null) {
                return null;
            }
            return onboardingEntryPoint.getIdentifier();
        }
    }

    public final void saveTransactionForOnboarding(String transactionId, String transactionType) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        this.matchaOnboardingDataPref.set(this.transactionArgsAdapter.toJson(new TransactionArgs(transactionId, transactionType)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getTransactionForOnboarding(Continuation<? super TransactionArgs> continuation) {
        C359561 c359561;
        TransactionArgs transactionArgsFromJson;
        if (continuation instanceof C359561) {
            c359561 = (C359561) continuation;
            int i = c359561.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c359561.label = i - Integer.MIN_VALUE;
            } else {
                c359561 = new C359561(continuation);
            }
        }
        Object latestSoftAttribution = c359561.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c359561.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(latestSoftAttribution);
            if (this.matchaOnboardingDataPref.mo23850isSet()) {
                String str = this.matchaOnboardingDataPref.get();
                if (str == null || (transactionArgsFromJson = this.transactionArgsAdapter.fromJson(str)) == null) {
                    return null;
                }
                this.matchaOnboardingDataPref.delete();
                return transactionArgsFromJson;
            }
            MatchaApi matchaApi = this.matchaApi;
            c359561.label = 1;
            latestSoftAttribution = matchaApi.getLatestSoftAttribution(c359561);
            if (latestSoftAttribution == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(latestSoftAttribution);
        }
        ApiLatestSoftAttribution apiLatestSoftAttribution = (ApiLatestSoftAttribution) latestSoftAttribution;
        return new TransactionArgs(apiLatestSoftAttribution.getTransaction_id(), apiLatestSoftAttribution.getType().getServerValue());
    }
}

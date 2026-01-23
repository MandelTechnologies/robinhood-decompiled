package com.robinhood.librobinhood.data.store.bonfire.slip;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.api.retrofit.SlipApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.ApiSlipOnboardingFlow;
import com.robinhood.models.p355ui.UiSlipAgreements;
import com.robinhood.models.p355ui.UiSlipAgreementsSection;
import com.robinhood.store.AsyncResult;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import io.reactivex.Completable;
import io.reactivex.Single;
import io.reactivex.functions.Action;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.HexExtensions;
import kotlin.text.HexFormat;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SlipAgreementsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002./B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ4\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u00182\u0006\u0010\u0019\u001a\u00020\u00142\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ6\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00142\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0086@¢\u0006\u0002\u0010 J\"\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00182\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014J.\u0010\"\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020\u00142\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010%J<\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110*2\u0006\u0010\u0019\u001a\u00020\u00142\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010%H\u0086@¢\u0006\u0002\u0010+J\u000e\u0010,\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u0012\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipAgreementsStore;", "Lcom/robinhood/store/Store;", "slipApi", "Lcom/robinhood/api/retrofit/SlipApi;", "slipHubCardStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipHubCardStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/SlipApi;Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipHubCardStore;Lcom/robinhood/store/StoreBundle;)V", "getSlipAgreementsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipAgreementsStore$SlipAgreementsParams;", "Lcom/robinhood/models/ui/UiSlipAgreements;", "postSlipAgreementsEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipAgreementsStore$PostSlipAgreementParams;", "", "getSlipAgreementsSectionEndpoint", "Lkotlin/Pair;", "", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/ui/UiSlipAgreementsSection;", "getSlipAgreements", "Lio/reactivex/Single;", "accountNumber", "source", "onboardingFlow", "Lcom/robinhood/models/api/ApiSlipOnboardingFlow;", "isQuickEnrollment", "", "getSlipAgreementsInUI", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/ApiSlipOnboardingFlow;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSlipAgreementsSection", "acceptAgreements", "Lio/reactivex/Completable;", "agreements", "", "Lcom/robinhood/models/ui/UiSlipAgreements$Agreement;", "agreementsV2", "Lcom/robinhood/models/ui/UiSlipAgreements$AgreementV2;", "acceptAgreementsBlocking", "Lcom/robinhood/store/AsyncResult;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSha256", "content", "SlipAgreementsParams", "PostSlipAgreementParams", "lib-store-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class SlipAgreementsStore extends Store {
    private final Endpoint<SlipAgreementsParams, UiSlipAgreements> getSlipAgreementsEndpoint;
    private final Endpoint<Tuples2<String, String>, Optional<UiSlipAgreementsSection>> getSlipAgreementsSectionEndpoint;
    private final PostEndpoint<PostSlipAgreementParams, Unit> postSlipAgreementsEndpoint;
    private final SlipHubCardStore slipHubCardStore;

    /* compiled from: SlipAgreementsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.slip.SlipAgreementsStore", m3645f = "SlipAgreementsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE}, m3647m = "acceptAgreementsBlocking")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.slip.SlipAgreementsStore$acceptAgreementsBlocking$1 */
    static final class C347711 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C347711(Continuation<? super C347711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SlipAgreementsStore.this.acceptAgreementsBlocking(null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlipAgreementsStore(SlipApi slipApi, SlipHubCardStore slipHubCardStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(slipApi, "slipApi");
        Intrinsics.checkNotNullParameter(slipHubCardStore, "slipHubCardStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.slipHubCardStore = slipHubCardStore;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.getSlipAgreementsEndpoint = Endpoint.Companion.create$default(companion, new SlipAgreementsStore2(slipApi, null), getLogoutKillswitch(), new SlipAgreementsStore3(null), storeBundle.getClock(), null, 16, null);
        this.postSlipAgreementsEndpoint = PostEndpoint.INSTANCE.create(new SlipAgreementsStore6(slipApi, this, null), new SlipAgreementsStore7(null));
        this.getSlipAgreementsSectionEndpoint = Endpoint.Companion.create$default(companion, new SlipAgreementsStore4(slipApi, null), getLogoutKillswitch(), new SlipAgreementsStore5(null), storeBundle.getClock(), null, 16, null);
    }

    /* compiled from: SlipAgreementsStore.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipAgreementsStore$SlipAgreementsParams;", "", "source", "", "onboardingFlow", "Lcom/robinhood/models/api/ApiSlipOnboardingFlow;", "accountNumber", "isQuickEnrollment", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/ApiSlipOnboardingFlow;Ljava/lang/String;Z)V", "getSource", "()Ljava/lang/String;", "getOnboardingFlow", "()Lcom/robinhood/models/api/ApiSlipOnboardingFlow;", "getAccountNumber", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "lib-store-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SlipAgreementsParams {
        private final String accountNumber;
        private final boolean isQuickEnrollment;
        private final ApiSlipOnboardingFlow onboardingFlow;
        private final String source;

        public static /* synthetic */ SlipAgreementsParams copy$default(SlipAgreementsParams slipAgreementsParams, String str, ApiSlipOnboardingFlow apiSlipOnboardingFlow, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = slipAgreementsParams.source;
            }
            if ((i & 2) != 0) {
                apiSlipOnboardingFlow = slipAgreementsParams.onboardingFlow;
            }
            if ((i & 4) != 0) {
                str2 = slipAgreementsParams.accountNumber;
            }
            if ((i & 8) != 0) {
                z = slipAgreementsParams.isQuickEnrollment;
            }
            return slipAgreementsParams.copy(str, apiSlipOnboardingFlow, str2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiSlipOnboardingFlow getOnboardingFlow() {
            return this.onboardingFlow;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsQuickEnrollment() {
            return this.isQuickEnrollment;
        }

        public final SlipAgreementsParams copy(String source, ApiSlipOnboardingFlow onboardingFlow, String accountNumber, boolean isQuickEnrollment) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new SlipAgreementsParams(source, onboardingFlow, accountNumber, isQuickEnrollment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SlipAgreementsParams)) {
                return false;
            }
            SlipAgreementsParams slipAgreementsParams = (SlipAgreementsParams) other;
            return Intrinsics.areEqual(this.source, slipAgreementsParams.source) && this.onboardingFlow == slipAgreementsParams.onboardingFlow && Intrinsics.areEqual(this.accountNumber, slipAgreementsParams.accountNumber) && this.isQuickEnrollment == slipAgreementsParams.isQuickEnrollment;
        }

        public int hashCode() {
            String str = this.source;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            ApiSlipOnboardingFlow apiSlipOnboardingFlow = this.onboardingFlow;
            return ((((iHashCode + (apiSlipOnboardingFlow != null ? apiSlipOnboardingFlow.hashCode() : 0)) * 31) + this.accountNumber.hashCode()) * 31) + Boolean.hashCode(this.isQuickEnrollment);
        }

        public String toString() {
            return "SlipAgreementsParams(source=" + this.source + ", onboardingFlow=" + this.onboardingFlow + ", accountNumber=" + this.accountNumber + ", isQuickEnrollment=" + this.isQuickEnrollment + ")";
        }

        public SlipAgreementsParams(String str, ApiSlipOnboardingFlow apiSlipOnboardingFlow, String accountNumber, boolean z) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.source = str;
            this.onboardingFlow = apiSlipOnboardingFlow;
            this.accountNumber = accountNumber;
            this.isQuickEnrollment = z;
        }

        public final String getSource() {
            return this.source;
        }

        public final ApiSlipOnboardingFlow getOnboardingFlow() {
            return this.onboardingFlow;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final boolean isQuickEnrollment() {
            return this.isQuickEnrollment;
        }
    }

    /* compiled from: SlipAgreementsStore.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipAgreementsStore$PostSlipAgreementParams;", "", "accountNumber", "", "agreements", "", "Lcom/robinhood/models/ui/UiSlipAgreements$Agreement;", "agreementsV2", "Lcom/robinhood/models/ui/UiSlipAgreements$AgreementV2;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getAccountNumber", "()Ljava/lang/String;", "getAgreements", "()Ljava/util/List;", "getAgreementsV2", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PostSlipAgreementParams {
        private final String accountNumber;
        private final List<UiSlipAgreements.Agreement> agreements;
        private final List<UiSlipAgreements.AgreementV2> agreementsV2;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PostSlipAgreementParams copy$default(PostSlipAgreementParams postSlipAgreementParams, String str, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = postSlipAgreementParams.accountNumber;
            }
            if ((i & 2) != 0) {
                list = postSlipAgreementParams.agreements;
            }
            if ((i & 4) != 0) {
                list2 = postSlipAgreementParams.agreementsV2;
            }
            return postSlipAgreementParams.copy(str, list, list2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final List<UiSlipAgreements.Agreement> component2() {
            return this.agreements;
        }

        public final List<UiSlipAgreements.AgreementV2> component3() {
            return this.agreementsV2;
        }

        public final PostSlipAgreementParams copy(String accountNumber, List<UiSlipAgreements.Agreement> agreements, List<UiSlipAgreements.AgreementV2> agreementsV2) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(agreements, "agreements");
            return new PostSlipAgreementParams(accountNumber, agreements, agreementsV2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PostSlipAgreementParams)) {
                return false;
            }
            PostSlipAgreementParams postSlipAgreementParams = (PostSlipAgreementParams) other;
            return Intrinsics.areEqual(this.accountNumber, postSlipAgreementParams.accountNumber) && Intrinsics.areEqual(this.agreements, postSlipAgreementParams.agreements) && Intrinsics.areEqual(this.agreementsV2, postSlipAgreementParams.agreementsV2);
        }

        public int hashCode() {
            int iHashCode = ((this.accountNumber.hashCode() * 31) + this.agreements.hashCode()) * 31;
            List<UiSlipAgreements.AgreementV2> list = this.agreementsV2;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "PostSlipAgreementParams(accountNumber=" + this.accountNumber + ", agreements=" + this.agreements + ", agreementsV2=" + this.agreementsV2 + ")";
        }

        public PostSlipAgreementParams(String accountNumber, List<UiSlipAgreements.Agreement> agreements, List<UiSlipAgreements.AgreementV2> list) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(agreements, "agreements");
            this.accountNumber = accountNumber;
            this.agreements = agreements;
            this.agreementsV2 = list;
        }

        public /* synthetic */ PostSlipAgreementParams(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, (i & 4) != 0 ? null : list2);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final List<UiSlipAgreements.Agreement> getAgreements() {
            return this.agreements;
        }

        public final List<UiSlipAgreements.AgreementV2> getAgreementsV2() {
            return this.agreementsV2;
        }
    }

    public static /* synthetic */ Single getSlipAgreements$default(SlipAgreementsStore slipAgreementsStore, String str, String str2, ApiSlipOnboardingFlow apiSlipOnboardingFlow, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            apiSlipOnboardingFlow = null;
        }
        return slipAgreementsStore.getSlipAgreements(str, str2, apiSlipOnboardingFlow, z);
    }

    /* compiled from: SlipAgreementsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/ui/UiSlipAgreements;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.slip.SlipAgreementsStore$getSlipAgreements$1", m3645f = "SlipAgreementsStore.kt", m3646l = {110}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.slip.SlipAgreementsStore$getSlipAgreements$1 */
    static final class C347721 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UiSlipAgreements>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ boolean $isQuickEnrollment;
        final /* synthetic */ ApiSlipOnboardingFlow $onboardingFlow;
        final /* synthetic */ String $source;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C347721(String str, ApiSlipOnboardingFlow apiSlipOnboardingFlow, String str2, boolean z, Continuation<? super C347721> continuation) {
            super(2, continuation);
            this.$source = str;
            this.$onboardingFlow = apiSlipOnboardingFlow;
            this.$accountNumber = str2;
            this.$isQuickEnrollment = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SlipAgreementsStore.this.new C347721(this.$source, this.$onboardingFlow, this.$accountNumber, this.$isQuickEnrollment, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UiSlipAgreements> continuation) {
            return ((C347721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = SlipAgreementsStore.this.getSlipAgreementsEndpoint;
            SlipAgreementsParams slipAgreementsParams = new SlipAgreementsParams(this.$source, this.$onboardingFlow, this.$accountNumber, this.$isQuickEnrollment);
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, slipAgreementsParams, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<UiSlipAgreements> getSlipAgreements(String accountNumber, String source, ApiSlipOnboardingFlow onboardingFlow, boolean isQuickEnrollment) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C347721(source, onboardingFlow, accountNumber, isQuickEnrollment, null), 1, null);
    }

    public static /* synthetic */ Object getSlipAgreementsInUI$default(SlipAgreementsStore slipAgreementsStore, String str, String str2, ApiSlipOnboardingFlow apiSlipOnboardingFlow, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            apiSlipOnboardingFlow = null;
        }
        return slipAgreementsStore.getSlipAgreementsInUI(str, str2, apiSlipOnboardingFlow, z, continuation);
    }

    public final Object getSlipAgreementsInUI(String str, String str2, ApiSlipOnboardingFlow apiSlipOnboardingFlow, boolean z, Continuation<? super UiSlipAgreements> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.getSlipAgreementsEndpoint, new SlipAgreementsParams(str2, apiSlipOnboardingFlow, str, z), null, continuation, 2, null);
    }

    /* compiled from: SlipAgreementsStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/ui/UiSlipAgreementsSection;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.slip.SlipAgreementsStore$getSlipAgreementsSection$1", m3645f = "SlipAgreementsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.slip.SlipAgreementsStore$getSlipAgreementsSection$1 */
    static final class C347731 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends UiSlipAgreementsSection>>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ String $source;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C347731(String str, String str2, Continuation<? super C347731> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$source = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SlipAgreementsStore.this.new C347731(this.$accountNumber, this.$source, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends UiSlipAgreementsSection>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Optional<UiSlipAgreementsSection>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<UiSlipAgreementsSection>> continuation) {
            return ((C347731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = SlipAgreementsStore.this.getSlipAgreementsSectionEndpoint;
            Tuples2 tuples2M3642to = Tuples4.m3642to(this.$accountNumber, this.$source);
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, tuples2M3642to, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<Optional<UiSlipAgreementsSection>> getSlipAgreementsSection(String accountNumber, String source) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(source, "source");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C347731(accountNumber, source, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Completable acceptAgreements$default(SlipAgreementsStore slipAgreementsStore, String str, List list, List list2, int i, Object obj) {
        if ((i & 4) != 0) {
            list2 = null;
        }
        return slipAgreementsStore.acceptAgreements(str, list, list2);
    }

    /* compiled from: SlipAgreementsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.slip.SlipAgreementsStore$acceptAgreements$1", m3645f = "SlipAgreementsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.slip.SlipAgreementsStore$acceptAgreements$1 */
    static final class C347691 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ List<UiSlipAgreements.Agreement> $agreements;
        final /* synthetic */ List<UiSlipAgreements.AgreementV2> $agreementsV2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C347691(String str, List<UiSlipAgreements.Agreement> list, List<UiSlipAgreements.AgreementV2> list2, Continuation<? super C347691> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$agreements = list;
            this.$agreementsV2 = list2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SlipAgreementsStore.this.new C347691(this.$accountNumber, this.$agreements, this.$agreementsV2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C347691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = SlipAgreementsStore.this.postSlipAgreementsEndpoint;
                PostSlipAgreementParams postSlipAgreementParams = new PostSlipAgreementParams(this.$accountNumber, this.$agreements, this.$agreementsV2);
                this.label = 1;
                if (PostEndpoint.DefaultImpls.post$default(postEndpoint, postSlipAgreementParams, null, this, 2, null) == coroutine_suspended) {
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

    public final Completable acceptAgreements(String accountNumber, List<UiSlipAgreements.Agreement> agreements, List<UiSlipAgreements.AgreementV2> agreementsV2) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(agreements, "agreements");
        Completable completableDoOnComplete = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C347691(accountNumber, agreements, agreementsV2, null), 1, null).doOnComplete(new Action() { // from class: com.robinhood.librobinhood.data.store.bonfire.slip.SlipAgreementsStore.acceptAgreements.2
            @Override // io.reactivex.functions.Action
            public final void run() {
                SlipAgreementsStore.this.slipHubCardStore.refreshAllAccounts(true);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableDoOnComplete, "doOnComplete(...)");
        return completableDoOnComplete;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object acceptAgreementsBlocking$default(SlipAgreementsStore slipAgreementsStore, String str, List list, List list2, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            list2 = null;
        }
        return slipAgreementsStore.acceptAgreementsBlocking(str, list, list2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object acceptAgreementsBlocking(String str, List<UiSlipAgreements.Agreement> list, List<UiSlipAgreements.AgreementV2> list2, Continuation<? super AsyncResult<Unit>> continuation) {
        C347711 c347711;
        if (continuation instanceof C347711) {
            c347711 = (C347711) continuation;
            int i = c347711.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c347711.label = i - Integer.MIN_VALUE;
            } else {
                c347711 = new C347711(continuation);
            }
        }
        C347711 c3477112 = c347711;
        Object obj = c3477112.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3477112.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint<PostSlipAgreementParams, Unit> postEndpoint = this.postSlipAgreementsEndpoint;
                PostSlipAgreementParams postSlipAgreementParams = new PostSlipAgreementParams(str, list, list2);
                c3477112.label = 1;
                if (PostEndpoint.DefaultImpls.post$default(postEndpoint, postSlipAgreementParams, null, c3477112, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.slipHubCardStore.refreshAllAccounts(true);
            return new AsyncResult.Success(Unit.INSTANCE);
        } catch (Exception e) {
            return new AsyncResult.Failure(e);
        }
    }

    public final String getSha256(String content) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(content, "content");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = content.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNull(bArrDigest);
        return HexExtensions.toHexString$default(bArrDigest, (HexFormat) null, 1, (Object) null);
    }
}

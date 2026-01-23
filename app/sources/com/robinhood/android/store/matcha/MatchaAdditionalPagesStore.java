package com.robinhood.android.store.matcha;

import com.robinhood.android.models.matcha.api.MatchaAdditionalPagesResponse;
import com.robinhood.android.models.matcha.api.MatchaTransactionType;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.matcha.MatchaApi;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaAdditionalPagesStore.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/store/matcha/MatchaAdditionalPagesStore;", "Lcom/robinhood/store/Store;", "matchaApi", "Lcom/robinhood/api/matcha/MatchaApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/matcha/MatchaApi;Lcom/robinhood/store/StoreBundle;)V", "transferAdditionalPagesEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/android/models/matcha/api/MatchaAdditionalPagesResponse;", "requestAdditionalPagesEndpoint", "getAdditionalPages", "transactionType", "Lcom/robinhood/android/models/matcha/api/MatchaTransactionType;", "transactionId", "(Lcom/robinhood/android/models/matcha/api/MatchaTransactionType;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class MatchaAdditionalPagesStore extends Store {
    private final MatchaApi matchaApi;
    private final Endpoint<String, MatchaAdditionalPagesResponse> requestAdditionalPagesEndpoint;
    private final Endpoint<String, MatchaAdditionalPagesResponse> transferAdditionalPagesEndpoint;

    /* compiled from: MatchaAdditionalPagesStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MatchaTransactionType.values().length];
            try {
                iArr[MatchaTransactionType.MATCHA_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MatchaTransactionType.MATCHA_TRANSFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchaAdditionalPagesStore(MatchaApi matchaApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(matchaApi, "matchaApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.matchaApi = matchaApi;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.transferAdditionalPagesEndpoint = Endpoint.Companion.create$default(companion, new MatchaAdditionalPagesStore4(this, null), getLogoutKillswitch(), new MatchaAdditionalPagesStore5(null), storeBundle.getClock(), null, 16, null);
        this.requestAdditionalPagesEndpoint = Endpoint.Companion.create$default(companion, new MatchaAdditionalPagesStore2(this, null), getLogoutKillswitch(), new MatchaAdditionalPagesStore3(null), storeBundle.getClock(), null, 16, null);
    }

    public final Object getAdditionalPages(MatchaTransactionType matchaTransactionType, String str, Continuation<? super MatchaAdditionalPagesResponse> continuation) {
        int i = WhenMappings.$EnumSwitchMapping$0[matchaTransactionType.ordinal()];
        if (i == 1) {
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(this.requestAdditionalPagesEndpoint, str, null, continuation, 2, null);
            return objForceFetch$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objForceFetch$default : (MatchaAdditionalPagesResponse) objForceFetch$default;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Object objForceFetch$default2 = Endpoint.DefaultImpls.forceFetch$default(this.transferAdditionalPagesEndpoint, str, null, continuation, 2, null);
        return objForceFetch$default2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objForceFetch$default2 : (MatchaAdditionalPagesResponse) objForceFetch$default2;
    }
}

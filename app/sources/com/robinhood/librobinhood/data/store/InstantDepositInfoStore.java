package com.robinhood.librobinhood.data.store;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.retrofit.BonfireApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.models.api.bonfire.ApiInstantDepositInfo;
import com.robinhood.models.serverdriven.api.ApiRichText;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.functions.Function;
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

/* compiled from: InstantDepositInfoStore.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/InstantDepositInfoStore;", "Lcom/robinhood/store/Store;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "bonfireApi", "Lcom/robinhood/api/retrofit/BonfireApi;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/api/retrofit/BonfireApi;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/api/bonfire/ApiInstantDepositInfo;", "getAdditionalInstantDepositInfo", "Lio/reactivex/Maybe;", "Lcom/robinhood/models/serverdriven/db/RichText;", "lib-store-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class InstantDepositInfoStore extends Store {
    private final AccountProvider accountProvider;
    private final BonfireApi bonfireApi;
    private final Endpoint<Unit, ApiInstantDepositInfo> endpoint;
    private final ExperimentsStore experimentsStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstantDepositInfoStore(AccountProvider accountProvider, BonfireApi bonfireApi, ExperimentsStore experimentsStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountProvider = accountProvider;
        this.bonfireApi = bonfireApi;
        this.experimentsStore = experimentsStore;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new InstantDepositInfoStore2(this, null), getLogoutKillswitch(), new InstantDepositInfoStore3(null), storeBundle.getClock(), null, 16, null);
    }

    public final Maybe<RichText> getAdditionalInstantDepositInfo() {
        Maybe<RichText> maybeFlatMapMaybe = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiment.CRYPTO_RESTRICTIONS_INFO_KS.INSTANCE}, false, null, 6, null).first(Boolean.FALSE).flatMapMaybe(new Function() { // from class: com.robinhood.librobinhood.data.store.InstantDepositInfoStore.getAdditionalInstantDepositInfo.1
            @Override // io.reactivex.functions.Function
            public final MaybeSource<? extends RichText> apply(Boolean isKillswitchEnabled) {
                Intrinsics.checkNotNullParameter(isKillswitchEnabled, "isKillswitchEnabled");
                if (isKillswitchEnabled.booleanValue()) {
                    return Maybe.empty();
                }
                InstantDepositInfoStore instantDepositInfoStore = InstantDepositInfoStore.this;
                return RxFactory.DefaultImpls.rxMaybe$default(instantDepositInfoStore, null, new AnonymousClass1(instantDepositInfoStore, null), 1, null);
            }

            /* compiled from: InstantDepositInfoStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/serverdriven/db/RichText;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.InstantDepositInfoStore$getAdditionalInstantDepositInfo$1$1", m3645f = "InstantDepositInfoStore.kt", m3646l = {48}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.librobinhood.data.store.InstantDepositInfoStore$getAdditionalInstantDepositInfo$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super RichText>, Object> {
                int label;
                final /* synthetic */ InstantDepositInfoStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(InstantDepositInfoStore instantDepositInfoStore, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = instantDepositInfoStore;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RichText> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    ApiRichText description;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Endpoint endpoint = this.this$0.endpoint;
                        Unit unit = Unit.INSTANCE;
                        this.label = 1;
                        obj = Endpoint.DefaultImpls.fetch$default(endpoint, unit, null, this, 2, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    ApiInstantDepositInfo apiInstantDepositInfo = (ApiInstantDepositInfo) obj;
                    if (apiInstantDepositInfo == null || (description = apiInstantDepositInfo.getDescription()) == null) {
                        return null;
                    }
                    return description.toDbModel();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(maybeFlatMapMaybe, "flatMapMaybe(...)");
        return maybeFlatMapMaybe;
    }
}

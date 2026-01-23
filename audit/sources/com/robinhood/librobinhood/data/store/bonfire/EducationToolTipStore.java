package com.robinhood.librobinhood.data.store.bonfire;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.api.education.EducationApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.shared.models.api.bonfire.education.ApiEducationToolTipRequest;
import com.robinhood.shared.models.api.bonfire.education.ApiEducationToolTipResponse;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: EducationToolTipStore.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\nJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\nR \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/EducationToolTipStore;", "Lcom/robinhood/store/Store;", "educationApi", "Lcom/robinhood/android/api/education/EducationApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/education/EducationApi;Lcom/robinhood/store/StoreBundle;)V", "toolTipRelays", "", "", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/shared/models/api/bonfire/education/ApiEducationToolTipResponse;", "getToolTipEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/shared/models/api/bonfire/education/ApiEducationToolTipRequest;", "streamToolTip", "Lio/reactivex/Observable;", "id", "accountNumber", "postToolTipEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "", "markToolTipSeen", "Lkotlinx/coroutines/Job;", "lib-store-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class EducationToolTipStore extends Store {
    private final Endpoint<ApiEducationToolTipRequest, ApiEducationToolTipResponse> getToolTipEndpoint;
    private final PostEndpoint<ApiEducationToolTipRequest, Unit> postToolTipEndpoint;
    private final Map<String, BehaviorRelay<ApiEducationToolTipResponse>> toolTipRelays;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationToolTipStore(EducationApi educationApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(educationApi, "educationApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.toolTipRelays = new LinkedHashMap();
        this.getToolTipEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new EducationToolTipStore2(educationApi, null), getLogoutKillswitch(), new EducationToolTipStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.postToolTipEndpoint = PostEndpoint.INSTANCE.create(new EducationToolTipStore4(educationApi, null), new EducationToolTipStore5(null));
    }

    public final Observable<ApiEducationToolTipResponse> streamToolTip(String id, String accountNumber) {
        Intrinsics.checkNotNullParameter(id, "id");
        Endpoint.DefaultImpls.refresh$default(this.getToolTipEndpoint, new ApiEducationToolTipRequest(id, accountNumber), true, null, 4, null);
        Map<String, BehaviorRelay<ApiEducationToolTipResponse>> map = this.toolTipRelays;
        BehaviorRelay<ApiEducationToolTipResponse> behaviorRelayCreate = map.get(id);
        if (behaviorRelayCreate == null) {
            behaviorRelayCreate = BehaviorRelay.create();
            Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
            map.put(id, behaviorRelayCreate);
        }
        return behaviorRelayCreate;
    }

    /* compiled from: EducationToolTipStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.EducationToolTipStore$markToolTipSeen$1", m3645f = "EducationToolTipStore.kt", m3646l = {60}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.EducationToolTipStore$markToolTipSeen$1 */
    static final class C345011 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ String $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C345011(String str, String str2, Continuation<? super C345011> continuation) {
            super(2, continuation);
            this.$id = str;
            this.$accountNumber = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EducationToolTipStore.this.new C345011(this.$id, this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C345011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C345011 c345011;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = EducationToolTipStore.this.postToolTipEndpoint;
                ApiEducationToolTipRequest apiEducationToolTipRequest = new ApiEducationToolTipRequest(this.$id, this.$accountNumber);
                this.label = 1;
                c345011 = this;
                if (PostEndpoint.DefaultImpls.post$default(postEndpoint, apiEducationToolTipRequest, null, c345011, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c345011 = this;
            }
            Endpoint.DefaultImpls.refresh$default(EducationToolTipStore.this.getToolTipEndpoint, new ApiEducationToolTipRequest(c345011.$id, c345011.$accountNumber), true, null, 4, null);
            return Unit.INSTANCE;
        }
    }

    public final Job markToolTipSeen(String id, String accountNumber) {
        Intrinsics.checkNotNullParameter(id, "id");
        return BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C345011(id, accountNumber, null), 3, null);
    }
}

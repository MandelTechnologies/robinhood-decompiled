package com.robinhood.android.lib.store.creditcard;

import com.robinhood.android.api.creditcard.CreditCardApi;
import com.robinhood.android.models.creditcard.api.graphql.FeatureType;
import com.robinhood.android.models.creditcard.api.graphql.FeaturesQueryRequest;
import com.robinhood.android.models.creditcard.api.graphql.FeaturesQueryRequestVariables;
import com.robinhood.android.models.creditcard.api.graphql.FeaturesRequest;
import com.robinhood.android.models.creditcard.api.graphql.FeaturesResponse;
import com.robinhood.android.models.creditcard.api.graphql.GraphqlQueryResponse;
import com.robinhood.utils.logging.CrashReporter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CreditCardStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n¨\u0006\u0003"}, m3636d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;", "com/robinhood/android/lib/store/creditcard/CreditCardStore$withScopeContext$2"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.store.creditcard.CreditCardStore$getGoldBasicEligibility$$inlined$withScopeContext$1", m3645f = "CreditCardStore.kt", m3646l = {696}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.store.creditcard.CreditCardStore$getGoldBasicEligibility$$inlined$withScopeContext$1 */
/* loaded from: classes8.dex */
public final class C20543xf58d5b0 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ CreditCardStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20543xf58d5b0(Continuation continuation, CreditCardStore creditCardStore) {
        super(2, continuation);
        this.this$0 = creditCardStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C20543xf58d5b0(continuation, this.this$0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((C20543xf58d5b0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FeaturesResponse featuresResponse;
        List<FeaturesResponse.Feature> features;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        boolean z = true;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.this$0.identityId.get();
                if (str != null) {
                    CreditCardApi creditCardApi = this.this$0.creditCardApi;
                    FeaturesQueryRequest featuresQueryRequest = new FeaturesQueryRequest(null, null, new FeaturesQueryRequestVariables(new FeaturesRequest(str, CollectionsKt.listOf(FeatureType.SHOW_RH_GOLD_BASIC.getServerValue()))), 3, null);
                    this.label = 1;
                    obj = creditCardApi.features(featuresQueryRequest, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (featuresResponse != null || (features = featuresResponse.getFeatures()) == null) {
                    z = false;
                } else {
                    List<FeaturesResponse.Feature> list = features;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((FeaturesResponse.Feature) it.next()).getName());
                    }
                    if (arrayList.contains(FeatureType.SHOW_RH_GOLD_BASIC)) {
                    }
                }
                return boxing.boxBoolean(z);
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GraphqlQueryResponse graphqlQueryResponse = (GraphqlQueryResponse) obj;
            featuresResponse = graphqlQueryResponse != null ? (FeaturesResponse) graphqlQueryResponse.getData() : null;
            if (featuresResponse != null) {
                z = false;
            }
            return boxing.boxBoolean(z);
        } catch (Throwable th) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
            return boxing.boxBoolean(false);
        }
    }
}

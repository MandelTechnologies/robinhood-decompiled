package com.robinhood.shared.feature.discovery.p382ui;

import com.robinhood.models.api.FeatureDiscoveryLocation;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FeatureDiscoveryComponent.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.feature.discovery.ui.FeatureDiscoveryComponentKt$FeatureDiscoveryComponent$2$1", m3645f = "FeatureDiscoveryComponent.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.feature.discovery.ui.FeatureDiscoveryComponentKt$FeatureDiscoveryComponent$2$1, reason: use source file name */
/* loaded from: classes6.dex */
final class FeatureDiscoveryComponent3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountNumber;
    final /* synthetic */ FeatureDiscoveryDuxo $duxo;
    final /* synthetic */ FeatureDiscoveryLocation $location;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeatureDiscoveryComponent3(FeatureDiscoveryDuxo featureDiscoveryDuxo, FeatureDiscoveryLocation featureDiscoveryLocation, String str, Continuation<? super FeatureDiscoveryComponent3> continuation) {
        super(2, continuation);
        this.$duxo = featureDiscoveryDuxo;
        this.$location = featureDiscoveryLocation;
        this.$accountNumber = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FeatureDiscoveryComponent3(this.$duxo, this.$location, this.$accountNumber, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FeatureDiscoveryComponent3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$duxo.setArguments(this.$location, this.$accountNumber);
        return Unit.INSTANCE;
    }
}

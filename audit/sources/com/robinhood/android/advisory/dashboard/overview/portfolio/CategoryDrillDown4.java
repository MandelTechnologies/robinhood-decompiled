package com.robinhood.android.advisory.dashboard.overview.portfolio;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CategoryDrillDown.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.portfolio.CategoryDrillDownKt$CategoryDrillDown$activeAsset$1$1$1", m3645f = "CategoryDrillDown.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.advisory.dashboard.overview.portfolio.CategoryDrillDownKt$CategoryDrillDown$activeAsset$1$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class CategoryDrillDown4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $activeAssetIndex;
    final /* synthetic */ int $numSlices;
    final /* synthetic */ Function0<Unit> $onBackClicked;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CategoryDrillDown4(int i, int i2, Function0<Unit> function0, Continuation<? super CategoryDrillDown4> continuation) {
        super(2, continuation);
        this.$activeAssetIndex = i;
        this.$numSlices = i2;
        this.$onBackClicked = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CategoryDrillDown4(this.$activeAssetIndex, this.$numSlices, this.$onBackClicked, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CategoryDrillDown4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Attempted to fetch an asset at index " + this.$activeAssetIndex), false, new EventMetadata(SentryTeam.RAD, null, MapsKt.mapOf(Tuples4.m3642to(ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, boxing.boxInt(this.$activeAssetIndex)), Tuples4.m3642to("assets_size", boxing.boxInt(this.$numSlices))), 2, null), 2, null);
        this.$onBackClicked.invoke();
        return Unit.INSTANCE;
    }
}

package com.robinhood.android.lib.margin.hub;

import bonfire.proto.idl.margin.p036v1.GetMaintenanceTableRequestDto;
import bonfire.proto.idl.margin.p036v1.GetMaintenanceTableResponseDto;
import bonfire.proto.idl.margin.p036v1.MaintenanceTableService;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.margin.hub.MarginHubStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MarginHubStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lbonfire/proto/idl/margin/v1/GetMaintenanceTableResponseDto;", "params", "Lcom/robinhood/android/lib/margin/hub/MarginHubStore$MarginMaintenanceTableRequestParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.margin.hub.MarginHubStore$marginMaintenanceTableEndpoint$1", m3645f = "MarginHubStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.lib.margin.hub.MarginHubStore$marginMaintenanceTableEndpoint$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MarginHubStore4 extends ContinuationImpl7 implements Function2<MarginHubStore.MarginMaintenanceTableRequestParams, Continuation<? super GetMaintenanceTableResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarginHubStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginHubStore4(MarginHubStore marginHubStore, Continuation<? super MarginHubStore4> continuation) {
        super(2, continuation);
        this.this$0 = marginHubStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarginHubStore4 marginHubStore4 = new MarginHubStore4(this.this$0, continuation);
        marginHubStore4.L$0 = obj;
        return marginHubStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MarginHubStore.MarginMaintenanceTableRequestParams marginMaintenanceTableRequestParams, Continuation<? super GetMaintenanceTableResponseDto> continuation) {
        return ((MarginHubStore4) create(marginMaintenanceTableRequestParams, continuation)).invokeSuspend(Unit.INSTANCE);
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
        MarginHubStore.MarginMaintenanceTableRequestParams marginMaintenanceTableRequestParams = (MarginHubStore.MarginMaintenanceTableRequestParams) this.L$0;
        MaintenanceTableService maintenanceTableService = this.this$0.maintenanceTableService;
        GetMaintenanceTableRequestDto getMaintenanceTableRequestDto = new GetMaintenanceTableRequestDto(marginMaintenanceTableRequestParams.getAccountNumber(), marginMaintenanceTableRequestParams.getSortBy(), marginMaintenanceTableRequestParams.getSortDirection());
        this.label = 1;
        Object objGetMaintenanceTable = maintenanceTableService.GetMaintenanceTable(getMaintenanceTableRequestDto, this);
        return objGetMaintenanceTable == coroutine_suspended ? coroutine_suspended : objGetMaintenanceTable;
    }
}

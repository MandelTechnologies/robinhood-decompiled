package com.robinhood.android.lib.margin.hub;

import bonfire.proto.idl.margin.p036v1.GetMaintenanceTableResponseDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.margin.hub.p168db.models.MarginMaintenanceTableView;
import com.robinhood.android.lib.margin.hub.p168db.models.MarginMaintenanceTableView2;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;

/* compiled from: MarginHubStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lbonfire/proto/idl/margin/v1/GetMaintenanceTableResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.margin.hub.MarginHubStore$marginMaintenanceTableEndpoint$2", m3645f = "MarginHubStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.margin.hub.MarginHubStore$marginMaintenanceTableEndpoint$2, reason: use source file name */
/* loaded from: classes8.dex */
final class MarginHubStore5 extends ContinuationImpl7 implements Function2<GetMaintenanceTableResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarginHubStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginHubStore5(MarginHubStore marginHubStore, Continuation<? super MarginHubStore5> continuation) {
        super(2, continuation);
        this.this$0 = marginHubStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarginHubStore5 marginHubStore5 = new MarginHubStore5(this.this$0, continuation);
        marginHubStore5.L$0 = obj;
        return marginHubStore5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetMaintenanceTableResponseDto getMaintenanceTableResponseDto, Continuation<? super Unit> continuation) {
        return ((MarginHubStore5) create(getMaintenanceTableResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GetMaintenanceTableResponseDto getMaintenanceTableResponseDto = (GetMaintenanceTableResponseDto) this.L$0;
            Map map = this.this$0.marginMaintenanceTableViews;
            String account_number = getMaintenanceTableResponseDto.getAccount_number();
            Object objMutableSharedFlow$default = map.get(account_number);
            if (objMutableSharedFlow$default == null) {
                objMutableSharedFlow$default = SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
                map.put(account_number, objMutableSharedFlow$default);
            }
            MarginMaintenanceTableView dbModel = MarginMaintenanceTableView2.toDbModel(getMaintenanceTableResponseDto);
            this.label = 1;
            if (((SharedFlow2) objMutableSharedFlow$default).emit(dbModel, this) == coroutine_suspended) {
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

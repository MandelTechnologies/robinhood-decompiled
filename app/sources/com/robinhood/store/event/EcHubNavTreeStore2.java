package com.robinhood.store.event;

import com.robinhood.android.models.event.p186db.predictionmarkets.EcHubNavNode3;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService;
import com.robinhood.prediction_markets.proto.p361v1.idl.ListChildNavigationNodesRequestDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.ListChildNavigationNodesResponseDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.NavigationNodeDto;
import com.robinhood.store.event.EcHubNavTreeStore;
import com.robinhood.store.util.PredictionMarketsRequestHeaderDelegate2;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.extensions.Uuids;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EcHubNavTreeStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/store/event/PartialTree;", "params", "Lcom/robinhood/store/event/EcHubNavTreeStore$GetNavNodesParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EcHubNavTreeStore$getNavNodesEndpoint$1", m3645f = "EcHubNavTreeStore.kt", m3646l = {51, 46}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.store.event.EcHubNavTreeStore$getNavNodesEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class EcHubNavTreeStore2 extends ContinuationImpl7 implements Function2<EcHubNavTreeStore.GetNavNodesParams, Continuation<? super PartialTree>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ EcHubNavTreeStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EcHubNavTreeStore2(EcHubNavTreeStore ecHubNavTreeStore, Continuation<? super EcHubNavTreeStore2> continuation) {
        super(2, continuation);
        this.this$0 = ecHubNavTreeStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EcHubNavTreeStore2 ecHubNavTreeStore2 = new EcHubNavTreeStore2(this.this$0, continuation);
        ecHubNavTreeStore2.L$0 = obj;
        return ecHubNavTreeStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EcHubNavTreeStore.GetNavNodesParams getNavNodesParams, Continuation<? super PartialTree> continuation) {
        return ((EcHubNavTreeStore2) create(getNavNodesParams, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af A[LOOP:0: B:27:0x00a9->B:29:0x00af, LOOP_END] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LayoutService layoutService;
        ListChildNavigationNodesRequestDto listChildNavigationNodesRequestDto;
        EcHubNavTreeStore.GetNavNodesParams getNavNodesParams;
        EcHubNavTreeStore.GetNavNodesParams getNavNodesParams2;
        Iterator<T> it;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            EcHubNavTreeStore.GetNavNodesParams getNavNodesParams3 = (EcHubNavTreeStore.GetNavNodesParams) this.L$0;
            layoutService = this.this$0.layoutService;
            UUID parentId = getNavNodesParams3.getParentId();
            listChildNavigationNodesRequestDto = new ListChildNavigationNodesRequestDto(parentId != null ? Uuids.safeToString(parentId) : null);
            PredictionMarketsRequestHeaderDelegate2 predictionMarketsRequestHeaderDelegate2 = this.this$0.requestHeaderPlugin;
            this.L$0 = getNavNodesParams3;
            this.L$1 = layoutService;
            this.L$2 = listChildNavigationNodesRequestDto;
            this.label = 1;
            Object objBuildRequestHeader = predictionMarketsRequestHeaderDelegate2.buildRequestHeader(this);
            if (objBuildRequestHeader != coroutine_suspended) {
                getNavNodesParams = getNavNodesParams3;
                obj = objBuildRequestHeader;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            getNavNodesParams2 = (EcHubNavTreeStore.GetNavNodesParams) this.L$0;
            ResultKt.throwOnFailure(obj);
            ListChildNavigationNodesResponseDto listChildNavigationNodesResponseDto = (ListChildNavigationNodesResponseDto) ((Response) obj).getData();
            boolean z = getNavNodesParams2.getParentId() == null;
            UUID uuid = StringsKt.toUuid(listChildNavigationNodesResponseDto.getNode_id());
            List<NavigationNodeDto> nodes = listChildNavigationNodesResponseDto.getNodes();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(nodes, 10));
            it = nodes.iterator();
            while (it.hasNext()) {
                arrayList.add(EcHubNavNode3.toDbModel((NavigationNodeDto) it.next()));
            }
            return new PartialTree(z, uuid, arrayList);
        }
        listChildNavigationNodesRequestDto = (ListChildNavigationNodesRequestDto) this.L$2;
        layoutService = (LayoutService) this.L$1;
        getNavNodesParams = (EcHubNavTreeStore.GetNavNodesParams) this.L$0;
        ResultKt.throwOnFailure(obj);
        Request<ListChildNavigationNodesRequestDto> request = new Request<>(listChildNavigationNodesRequestDto, (Map) obj);
        this.L$0 = getNavNodesParams;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
        obj = layoutService.ListChildNavigationNodes(request, this);
        if (obj != coroutine_suspended) {
            getNavNodesParams2 = getNavNodesParams;
            ListChildNavigationNodesResponseDto listChildNavigationNodesResponseDto2 = (ListChildNavigationNodesResponseDto) ((Response) obj).getData();
            if (getNavNodesParams2.getParentId() == null) {
            }
            UUID uuid2 = StringsKt.toUuid(listChildNavigationNodesResponseDto2.getNode_id());
            List<NavigationNodeDto> nodes2 = listChildNavigationNodesResponseDto2.getNodes();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(nodes2, 10));
            it = nodes2.iterator();
            while (it.hasNext()) {
            }
            return new PartialTree(z, uuid2, arrayList2);
        }
        return coroutine_suspended;
    }
}

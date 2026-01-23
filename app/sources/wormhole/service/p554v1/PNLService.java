package wormhole.service.p554v1;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PNLService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0013H¦@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lwormhole/service/v1/PNLService;", "", "Lwormhole/service/v1/GetSupportedAssetClassesRequestDto;", "request", "Lwormhole/service/v1/GetSupportedAssetClassesResponseDto;", "GetSupportedAssetClasses", "(Lwormhole/service/v1/GetSupportedAssetClassesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto;", "Lwormhole/service/v1/GetRealizedGainLossItemsResponseDto;", "GetRealizedGainLossItems", "(Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwormhole/service/v1/GetRealizedGainLossItemRequestDto;", "Lwormhole/service/v1/GetRealizedGainLossItemResponseDto;", "GetRealizedGainLossItem", "(Lwormhole/service/v1/GetRealizedGainLossItemRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwormhole/service/v1/GetRealizedGainLossGroupsRequestDto;", "Lwormhole/service/v1/GetRealizedGainLossGroupsResponseDto;", "GetRealizedGainLossGroups", "(Lwormhole/service/v1/GetRealizedGainLossGroupsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwormhole/service/v1/GetRealizedPerformanceSummaryRequestDto;", "Lwormhole/service/v1/GetRealizedPerformanceSummaryResponseDto;", "GetRealizedPerformanceSummary", "(Lwormhole/service/v1/GetRealizedPerformanceSummaryRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public interface PNLService {

    /* compiled from: PNLService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "wormhole.service.v1.PNLService$DefaultImpls", m3645f = "PNLService.kt", m3646l = {25}, m3647m = "GetRealizedGainLossGroups")
    /* renamed from: wormhole.service.v1.PNLService$GetRealizedGainLossGroups$1 */
    static final class C491691 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C491691(Continuation<? super C491691> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetRealizedGainLossGroups(null, null, this);
        }
    }

    /* compiled from: PNLService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "wormhole.service.v1.PNLService$DefaultImpls", m3645f = "PNLService.kt", m3646l = {21}, m3647m = "GetRealizedGainLossItem")
    /* renamed from: wormhole.service.v1.PNLService$GetRealizedGainLossItem$1 */
    static final class C491701 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C491701(Continuation<? super C491701> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetRealizedGainLossItem(null, null, this);
        }
    }

    /* compiled from: PNLService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "wormhole.service.v1.PNLService$DefaultImpls", m3645f = "PNLService.kt", m3646l = {17}, m3647m = "GetRealizedGainLossItems")
    /* renamed from: wormhole.service.v1.PNLService$GetRealizedGainLossItems$1 */
    static final class C491711 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C491711(Continuation<? super C491711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetRealizedGainLossItems(null, null, this);
        }
    }

    /* compiled from: PNLService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "wormhole.service.v1.PNLService$DefaultImpls", m3645f = "PNLService.kt", m3646l = {29}, m3647m = "GetRealizedPerformanceSummary")
    /* renamed from: wormhole.service.v1.PNLService$GetRealizedPerformanceSummary$1 */
    static final class C491721 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C491721(Continuation<? super C491721> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetRealizedPerformanceSummary(null, null, this);
        }
    }

    /* compiled from: PNLService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "wormhole.service.v1.PNLService$DefaultImpls", m3645f = "PNLService.kt", m3646l = {13}, m3647m = "GetSupportedAssetClasses")
    /* renamed from: wormhole.service.v1.PNLService$GetSupportedAssetClasses$1 */
    static final class C491731 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C491731(Continuation<? super C491731> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetSupportedAssetClasses(null, null, this);
        }
    }

    Object GetRealizedGainLossGroups(GetRealizedGainLossGroupsRequestDto getRealizedGainLossGroupsRequestDto, Continuation<? super GetRealizedGainLossGroupsResponseDto> continuation);

    Object GetRealizedGainLossItem(GetRealizedGainLossItemRequestDto getRealizedGainLossItemRequestDto, Continuation<? super GetRealizedGainLossItemResponseDto> continuation);

    Object GetRealizedGainLossItems(GetRealizedGainLossItemsRequestDto getRealizedGainLossItemsRequestDto, Continuation<? super GetRealizedGainLossItemsResponseDto> continuation);

    Object GetRealizedPerformanceSummary(GetRealizedPerformanceSummaryRequestDto getRealizedPerformanceSummaryRequestDto, Continuation<? super GetRealizedPerformanceSummaryResponseDto> continuation);

    Object GetSupportedAssetClasses(GetSupportedAssetClassesRequestDto getSupportedAssetClassesRequestDto, Continuation<? super GetSupportedAssetClassesResponseDto> continuation);

    /* compiled from: PNLService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetSupportedAssetClasses(PNLService pNLService, Request<GetSupportedAssetClassesRequestDto> request, Continuation<? super Response<GetSupportedAssetClassesResponseDto>> continuation) {
            C491731 c491731;
            if (continuation instanceof C491731) {
                c491731 = (C491731) continuation;
                int i = c491731.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c491731.label = i - Integer.MIN_VALUE;
                } else {
                    c491731 = new C491731(continuation);
                }
            }
            Object objGetSupportedAssetClasses = c491731.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c491731.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetSupportedAssetClasses);
                GetSupportedAssetClassesRequestDto data = request.getData();
                c491731.label = 1;
                objGetSupportedAssetClasses = pNLService.GetSupportedAssetClasses(data, c491731);
                if (objGetSupportedAssetClasses == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetSupportedAssetClasses);
            }
            return new Response(objGetSupportedAssetClasses, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetRealizedGainLossItems(PNLService pNLService, Request<GetRealizedGainLossItemsRequestDto> request, Continuation<? super Response<GetRealizedGainLossItemsResponseDto>> continuation) {
            C491711 c491711;
            if (continuation instanceof C491711) {
                c491711 = (C491711) continuation;
                int i = c491711.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c491711.label = i - Integer.MIN_VALUE;
                } else {
                    c491711 = new C491711(continuation);
                }
            }
            Object objGetRealizedGainLossItems = c491711.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c491711.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetRealizedGainLossItems);
                GetRealizedGainLossItemsRequestDto data = request.getData();
                c491711.label = 1;
                objGetRealizedGainLossItems = pNLService.GetRealizedGainLossItems(data, c491711);
                if (objGetRealizedGainLossItems == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetRealizedGainLossItems);
            }
            return new Response(objGetRealizedGainLossItems, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetRealizedGainLossItem(PNLService pNLService, Request<GetRealizedGainLossItemRequestDto> request, Continuation<? super Response<GetRealizedGainLossItemResponseDto>> continuation) {
            C491701 c491701;
            if (continuation instanceof C491701) {
                c491701 = (C491701) continuation;
                int i = c491701.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c491701.label = i - Integer.MIN_VALUE;
                } else {
                    c491701 = new C491701(continuation);
                }
            }
            Object objGetRealizedGainLossItem = c491701.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c491701.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetRealizedGainLossItem);
                GetRealizedGainLossItemRequestDto data = request.getData();
                c491701.label = 1;
                objGetRealizedGainLossItem = pNLService.GetRealizedGainLossItem(data, c491701);
                if (objGetRealizedGainLossItem == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetRealizedGainLossItem);
            }
            return new Response(objGetRealizedGainLossItem, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetRealizedGainLossGroups(PNLService pNLService, Request<GetRealizedGainLossGroupsRequestDto> request, Continuation<? super Response<GetRealizedGainLossGroupsResponseDto>> continuation) {
            C491691 c491691;
            if (continuation instanceof C491691) {
                c491691 = (C491691) continuation;
                int i = c491691.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c491691.label = i - Integer.MIN_VALUE;
                } else {
                    c491691 = new C491691(continuation);
                }
            }
            Object objGetRealizedGainLossGroups = c491691.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c491691.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetRealizedGainLossGroups);
                GetRealizedGainLossGroupsRequestDto data = request.getData();
                c491691.label = 1;
                objGetRealizedGainLossGroups = pNLService.GetRealizedGainLossGroups(data, c491691);
                if (objGetRealizedGainLossGroups == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetRealizedGainLossGroups);
            }
            return new Response(objGetRealizedGainLossGroups, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetRealizedPerformanceSummary(PNLService pNLService, Request<GetRealizedPerformanceSummaryRequestDto> request, Continuation<? super Response<GetRealizedPerformanceSummaryResponseDto>> continuation) {
            C491721 c491721;
            if (continuation instanceof C491721) {
                c491721 = (C491721) continuation;
                int i = c491721.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c491721.label = i - Integer.MIN_VALUE;
                } else {
                    c491721 = new C491721(continuation);
                }
            }
            Object objGetRealizedPerformanceSummary = c491721.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c491721.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetRealizedPerformanceSummary);
                GetRealizedPerformanceSummaryRequestDto data = request.getData();
                c491721.label = 1;
                objGetRealizedPerformanceSummary = pNLService.GetRealizedPerformanceSummary(data, c491721);
                if (objGetRealizedPerformanceSummary == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetRealizedPerformanceSummary);
            }
            return new Response(objGetRealizedPerformanceSummary, null, 2, null);
        }
    }
}

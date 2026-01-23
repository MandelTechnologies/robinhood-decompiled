package com.robinhood.store.futures.arsenal;

import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract3;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesMarginRequirement;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesMarginRequirement2;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct5;
import com.robinhood.arsenal.proto.p281v1.idl.FuturesContractDto;
import com.robinhood.arsenal.proto.p281v1.idl.GetFuturesContractRequestDto;
import com.robinhood.arsenal.proto.p281v1.idl.GetFuturesProductRequestDto;
import com.robinhood.arsenal.proto.p281v1.idl.GetMarginRequirementRequestDto;
import com.robinhood.arsenal.proto.p281v1.idl.GetTradingSessionsRequestDto;
import com.robinhood.arsenal.proto.p281v1.idl.InstrumentService;
import com.robinhood.arsenal.proto.p281v1.idl.ListFuturesContractsRequestDto;
import com.robinhood.arsenal.proto.p281v1.idl.ListFuturesContractsResponseDto;
import com.robinhood.arsenal.proto.p281v1.idl.ListFuturesProductsRequestDto;
import com.robinhood.arsenal.proto.p281v1.idl.ListFuturesProductsResponseDto;
import com.robinhood.arsenal.proto.p281v1.idl.MarginRequirementDto;
import com.robinhood.arsenal.proto.p281v1.idl.ProductDto;
import com.robinhood.arsenal.proto.p281v1.idl.TradingSessionsDto;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.extensions.Uuids;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;

/* compiled from: ArsenalServiceExt.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0004\u0010\u0005\u001a(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0080@¢\u0006\u0004\b\b\u0010\t\u001a\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u000b\u0010\u0005\u001a\u001c\u0010\r\u001a\u00020\f*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\r\u0010\u0005\u001a(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0006*\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0080@¢\u0006\u0004\b\u000f\u0010\t\u001a$\u0010\u0013\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0080@¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0018\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0080@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/InstrumentService;", "Ljava/util/UUID;", "contractId", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", "getFuturesContract", "(Lcom/robinhood/arsenal/proto/v1/idl/InstrumentService;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "contractIds", "getFuturesContracts", "(Lcom/robinhood/arsenal/proto/v1/idl/InstrumentService;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "productId", "getFuturesContractsByProduct", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;", "getFuturesProduct", "productIds", "getFuturesProducts", "j$/time/LocalDate", InquiryField.DateField.TYPE, "Lcom/robinhood/arsenal/proto/v1/idl/TradingSessionsDto;", "getFuturesContractTradingSessions", "(Lcom/robinhood/arsenal/proto/v1/idl/InstrumentService;Ljava/util/UUID;Lj$/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/arsenal/proto/v1/idl/GetMarginRequirementRequestDto;", "request", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesMarginRequirement;", "getMarginRequirement", "(Lcom/robinhood/arsenal/proto/v1/idl/InstrumentService;Lcom/robinhood/arsenal/proto/v1/idl/GetMarginRequirementRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-futures_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.store.futures.arsenal.ArsenalServiceExtKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ArsenalServiceExt {

    /* compiled from: ArsenalServiceExt.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.arsenal.ArsenalServiceExtKt", m3645f = "ArsenalServiceExt.kt", m3646l = {22}, m3647m = "getFuturesContract")
    /* renamed from: com.robinhood.store.futures.arsenal.ArsenalServiceExtKt$getFuturesContract$1 */
    static final class C414841 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C414841(Continuation<? super C414841> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ArsenalServiceExt.getFuturesContract(null, null, this);
        }
    }

    /* compiled from: ArsenalServiceExt.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.arsenal.ArsenalServiceExtKt", m3645f = "ArsenalServiceExt.kt", m3646l = {28}, m3647m = "getFuturesContracts")
    /* renamed from: com.robinhood.store.futures.arsenal.ArsenalServiceExtKt$getFuturesContracts$1 */
    static final class C414851 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C414851(Continuation<? super C414851> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ArsenalServiceExt.getFuturesContracts(null, null, this);
        }
    }

    /* compiled from: ArsenalServiceExt.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.arsenal.ArsenalServiceExtKt", m3645f = "ArsenalServiceExt.kt", m3646l = {34}, m3647m = "getFuturesContractsByProduct")
    /* renamed from: com.robinhood.store.futures.arsenal.ArsenalServiceExtKt$getFuturesContractsByProduct$1 */
    static final class C414861 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C414861(Continuation<? super C414861> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ArsenalServiceExt.getFuturesContractsByProduct(null, null, this);
        }
    }

    /* compiled from: ArsenalServiceExt.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.arsenal.ArsenalServiceExtKt", m3645f = "ArsenalServiceExt.kt", m3646l = {40}, m3647m = "getFuturesProduct")
    /* renamed from: com.robinhood.store.futures.arsenal.ArsenalServiceExtKt$getFuturesProduct$1 */
    static final class C414871 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C414871(Continuation<? super C414871> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ArsenalServiceExt.getFuturesProduct(null, null, this);
        }
    }

    /* compiled from: ArsenalServiceExt.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.arsenal.ArsenalServiceExtKt", m3645f = "ArsenalServiceExt.kt", m3646l = {44}, m3647m = "getFuturesProducts")
    /* renamed from: com.robinhood.store.futures.arsenal.ArsenalServiceExtKt$getFuturesProducts$1 */
    static final class C414881 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C414881(Continuation<? super C414881> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ArsenalServiceExt.getFuturesProducts(null, null, this);
        }
    }

    /* compiled from: ArsenalServiceExt.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.arsenal.ArsenalServiceExtKt", m3645f = "ArsenalServiceExt.kt", m3646l = {61}, m3647m = "getMarginRequirement")
    /* renamed from: com.robinhood.store.futures.arsenal.ArsenalServiceExtKt$getMarginRequirement$1 */
    static final class C414891 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C414891(Continuation<? super C414891> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ArsenalServiceExt.getMarginRequirement(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object getFuturesContract(InstrumentService instrumentService, UUID uuid, Continuation<? super FuturesContract> continuation) {
        C414841 c414841;
        if (continuation instanceof C414841) {
            c414841 = (C414841) continuation;
            int i = c414841.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c414841.label = i - Integer.MIN_VALUE;
            } else {
                c414841 = new C414841(continuation);
            }
        }
        Object objGetFuturesContract = c414841.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c414841.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFuturesContract);
            GetFuturesContractRequestDto getFuturesContractRequestDto = new GetFuturesContractRequestDto(Uuids.safeToString(uuid));
            c414841.label = 1;
            objGetFuturesContract = instrumentService.GetFuturesContract(getFuturesContractRequestDto, c414841);
            if (objGetFuturesContract == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFuturesContract);
        }
        return FuturesContract3.toDbModel((FuturesContractDto) objGetFuturesContract);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object getFuturesContracts(InstrumentService instrumentService, List<UUID> list, Continuation<? super List<FuturesContract>> continuation) {
        C414851 c414851;
        if (continuation instanceof C414851) {
            c414851 = (C414851) continuation;
            int i = c414851.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c414851.label = i - Integer.MIN_VALUE;
            } else {
                c414851 = new C414851(continuation);
            }
        }
        Object objListFuturesContracts = c414851.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c414851.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListFuturesContracts);
            ListFuturesContractsRequestDto listFuturesContractsRequestDto = new ListFuturesContractsRequestDto(null, CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null), 1, null);
            c414851.label = 1;
            objListFuturesContracts = instrumentService.ListFuturesContracts(listFuturesContractsRequestDto, c414851);
            if (objListFuturesContracts == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListFuturesContracts);
        }
        List<FuturesContractDto> results = ((ListFuturesContractsResponseDto) objListFuturesContracts).getResults();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
        Iterator<T> it = results.iterator();
        while (it.hasNext()) {
            arrayList.add(FuturesContract3.toDbModel((FuturesContractDto) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object getFuturesContractsByProduct(InstrumentService instrumentService, UUID uuid, Continuation<? super List<FuturesContract>> continuation) {
        C414861 c414861;
        if (continuation instanceof C414861) {
            c414861 = (C414861) continuation;
            int i = c414861.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c414861.label = i - Integer.MIN_VALUE;
            } else {
                c414861 = new C414861(continuation);
            }
        }
        Object objListFuturesContracts = c414861.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c414861.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListFuturesContracts);
            ListFuturesContractsRequestDto listFuturesContractsRequestDto = new ListFuturesContractsRequestDto(Uuids.safeToString(uuid), null, 2, null);
            c414861.label = 1;
            objListFuturesContracts = instrumentService.ListFuturesContracts(listFuturesContractsRequestDto, c414861);
            if (objListFuturesContracts == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListFuturesContracts);
        }
        List<FuturesContractDto> results = ((ListFuturesContractsResponseDto) objListFuturesContracts).getResults();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
        Iterator<T> it = results.iterator();
        while (it.hasNext()) {
            arrayList.add(FuturesContract3.toDbModel((FuturesContractDto) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object getFuturesProduct(InstrumentService instrumentService, UUID uuid, Continuation<? super FuturesProduct> continuation) {
        C414871 c414871;
        if (continuation instanceof C414871) {
            c414871 = (C414871) continuation;
            int i = c414871.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c414871.label = i - Integer.MIN_VALUE;
            } else {
                c414871 = new C414871(continuation);
            }
        }
        Object objGetFuturesProduct = c414871.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c414871.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFuturesProduct);
            GetFuturesProductRequestDto getFuturesProductRequestDto = new GetFuturesProductRequestDto(Uuids.safeToString(uuid));
            c414871.label = 1;
            objGetFuturesProduct = instrumentService.GetFuturesProduct(getFuturesProductRequestDto, c414871);
            if (objGetFuturesProduct == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFuturesProduct);
        }
        return FuturesProduct5.toDbModel((ProductDto) objGetFuturesProduct);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object getFuturesProducts(InstrumentService instrumentService, List<UUID> list, Continuation<? super List<FuturesProduct>> continuation) {
        C414881 c414881;
        if (continuation instanceof C414881) {
            c414881 = (C414881) continuation;
            int i = c414881.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c414881.label = i - Integer.MIN_VALUE;
            } else {
                c414881 = new C414881(continuation);
            }
        }
        Object objListFuturesProducts = c414881.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c414881.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListFuturesProducts);
            ListFuturesProductsRequestDto listFuturesProductsRequestDto = new ListFuturesProductsRequestDto(CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null));
            c414881.label = 1;
            objListFuturesProducts = instrumentService.ListFuturesProducts(listFuturesProductsRequestDto, c414881);
            if (objListFuturesProducts == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListFuturesProducts);
        }
        List<ProductDto> results = ((ListFuturesProductsResponseDto) objListFuturesProducts).getResults();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
        Iterator<T> it = results.iterator();
        while (it.hasNext()) {
            arrayList.add(FuturesProduct5.toDbModel((ProductDto) it.next()));
        }
        return arrayList;
    }

    public static final Object getFuturesContractTradingSessions(InstrumentService instrumentService, UUID uuid, LocalDate localDate, Continuation<? super TradingSessionsDto> continuation) {
        String strSafeToString = Uuids.safeToString(uuid);
        String string2 = localDate.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return instrumentService.GetTradingSessions(new GetTradingSessionsRequestDto(strSafeToString, string2), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object getMarginRequirement(InstrumentService instrumentService, GetMarginRequirementRequestDto getMarginRequirementRequestDto, Continuation<? super FuturesMarginRequirement> continuation) {
        C414891 c414891;
        if (continuation instanceof C414891) {
            c414891 = (C414891) continuation;
            int i = c414891.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c414891.label = i - Integer.MIN_VALUE;
            } else {
                c414891 = new C414891(continuation);
            }
        }
        Object objGetMarginRequirement = c414891.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c414891.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetMarginRequirement);
            c414891.L$0 = getMarginRequirementRequestDto;
            c414891.label = 1;
            objGetMarginRequirement = instrumentService.GetMarginRequirement(getMarginRequirementRequestDto, c414891);
            if (objGetMarginRequirement == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            getMarginRequirementRequestDto = (GetMarginRequirementRequestDto) c414891.L$0;
            ResultKt.throwOnFailure(objGetMarginRequirement);
        }
        return FuturesMarginRequirement2.toDbModel((MarginRequirementDto) objGetMarginRequirement, StringsKt.toUuid(getMarginRequirementRequestDto.getContract_id()));
    }
}

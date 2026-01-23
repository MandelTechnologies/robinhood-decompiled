package com.robinhood.android.investmentstracker;

import accio.service.p003v1.SpanDto;
import bff_money_movement.service.p019v1.BffMoneyMovementService;
import bff_money_movement.service.p019v1.InvestmentsTrackerGetPageRequestDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerGetPageResponseDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerPageTypeDto;
import com.robinhood.android.charts.models.p080db.SpanOption;
import com.robinhood.utils.logging.CrashReporter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InvestmentsTrackerUpdateCenter.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0016\u001a\u00020\u0007J\u000e\u0010\u0017\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001b\u001a\u00020\u0012J\u0016\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u001eJ\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015J\u0010\u0010\"\u001a\u0004\u0018\u00010\u00132\u0006\u0010!\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/InvestmentsTrackerUpdateCenter;", "", "bffMoneyMovementService", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "<init>", "(Lbff_money_movement/service/v1/BffMoneyMovementService;)V", "refreshDelay", "", "currentSpan", "Laccio/service/v1/SpanDto;", "baseHomeRequest", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerUpdateCenter$PageRequest;", "baseAllocationsRequest", "getPageRequests", "", "accountRequests", "currentGetPageRequestResults", "", "Lbff_money_movement/service/v1/InvestmentsTrackerPageTypeDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerGetPageResponseDto;", "currentAccountPageResults", "", "getRefreshDelay", "refresh", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPageResponseForType", "pageType", "setSpanOption", "spanDto", "(Laccio/service/v1/SpanDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addAccountToRefresh", "", "accountId", "getAccountResponseForId", "PageRequest", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InvestmentsTrackerUpdateCenter {
    public static final int $stable = 8;
    private final List<PageRequest> accountRequests;
    private final PageRequest baseAllocationsRequest;
    private final PageRequest baseHomeRequest;
    private final BffMoneyMovementService bffMoneyMovementService;
    private final Map<String, InvestmentsTrackerGetPageResponseDto> currentAccountPageResults;
    private final Map<InvestmentsTrackerPageTypeDto, InvestmentsTrackerGetPageResponseDto> currentGetPageRequestResults;
    private SpanDto currentSpan;
    private final List<PageRequest> getPageRequests;
    private final long refreshDelay;

    /* compiled from: InvestmentsTrackerUpdateCenter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.InvestmentsTrackerUpdateCenter", m3645f = "InvestmentsTrackerUpdateCenter.kt", m3646l = {85, 94}, m3647m = "refresh")
    /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerUpdateCenter$refresh$1 */
    static final class C195001 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C195001(Continuation<? super C195001> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InvestmentsTrackerUpdateCenter.this.refresh(this);
        }
    }

    public InvestmentsTrackerUpdateCenter(BffMoneyMovementService bffMoneyMovementService) {
        Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
        this.bffMoneyMovementService = bffMoneyMovementService;
        this.refreshDelay = 15000L;
        this.currentSpan = InvestmentsTrackerUtilityFunctions.toSpanDto((SpanOption) CollectionsKt.first((List) InvestmentsTrackerUtilityFunctions.getSpanOptionList(null, false)));
        InvestmentsTrackerPageTypeDto investmentsTrackerPageTypeDto = InvestmentsTrackerPageTypeDto.HOME;
        SpanDto spanDto = this.currentSpan;
        String id = TimeZone.getDefault().getID();
        Intrinsics.checkNotNullExpressionValue(id, "getID(...)");
        PageRequest pageRequest = new PageRequest(new InvestmentsTrackerGetPageRequestDto(investmentsTrackerPageTypeDto, spanDto, id, null, 8, null));
        this.baseHomeRequest = pageRequest;
        InvestmentsTrackerPageTypeDto investmentsTrackerPageTypeDto2 = InvestmentsTrackerPageTypeDto.ALLOCATION_VIEW;
        SpanDto spanDto2 = this.currentSpan;
        String id2 = TimeZone.getDefault().getID();
        Intrinsics.checkNotNullExpressionValue(id2, "getID(...)");
        PageRequest pageRequest2 = new PageRequest(new InvestmentsTrackerGetPageRequestDto(investmentsTrackerPageTypeDto2, spanDto2, id2, null, 8, null));
        this.baseAllocationsRequest = pageRequest2;
        this.getPageRequests = CollectionsKt.mutableListOf(pageRequest, pageRequest2);
        this.accountRequests = new ArrayList();
        this.currentGetPageRequestResults = new LinkedHashMap();
        this.currentAccountPageResults = new LinkedHashMap();
    }

    /* compiled from: InvestmentsTrackerUpdateCenter.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/InvestmentsTrackerUpdateCenter$PageRequest;", "", "requestDto", "Lbff_money_movement/service/v1/InvestmentsTrackerGetPageRequestDto;", "<init>", "(Lbff_money_movement/service/v1/InvestmentsTrackerGetPageRequestDto;)V", "getRequestDto", "()Lbff_money_movement/service/v1/InvestmentsTrackerGetPageRequestDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PageRequest {
        public static final int $stable = 8;
        private final InvestmentsTrackerGetPageRequestDto requestDto;

        public static /* synthetic */ PageRequest copy$default(PageRequest pageRequest, InvestmentsTrackerGetPageRequestDto investmentsTrackerGetPageRequestDto, int i, Object obj) {
            if ((i & 1) != 0) {
                investmentsTrackerGetPageRequestDto = pageRequest.requestDto;
            }
            return pageRequest.copy(investmentsTrackerGetPageRequestDto);
        }

        /* renamed from: component1, reason: from getter */
        public final InvestmentsTrackerGetPageRequestDto getRequestDto() {
            return this.requestDto;
        }

        public final PageRequest copy(InvestmentsTrackerGetPageRequestDto requestDto) {
            Intrinsics.checkNotNullParameter(requestDto, "requestDto");
            return new PageRequest(requestDto);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PageRequest) && Intrinsics.areEqual(this.requestDto, ((PageRequest) other).requestDto);
        }

        public int hashCode() {
            return this.requestDto.hashCode();
        }

        public String toString() {
            return "PageRequest(requestDto=" + this.requestDto + ")";
        }

        public PageRequest(InvestmentsTrackerGetPageRequestDto requestDto) {
            Intrinsics.checkNotNullParameter(requestDto, "requestDto");
            this.requestDto = requestDto;
        }

        public final InvestmentsTrackerGetPageRequestDto getRequestDto() {
            return this.requestDto;
        }
    }

    public final long getRefreshDelay() {
        return this.refreshDelay;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d1, code lost:
    
        if (r14 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060 A[Catch: Exception -> 0x0035, TryCatch #0 {Exception -> 0x0035, blocks: (B:13:0x0030, B:38:0x00d4, B:31:0x009f, B:33:0x00a5, B:35:0x00b5, B:20:0x004a, B:29:0x0086, B:24:0x005a, B:26:0x0060, B:30:0x0096, B:23:0x0051), top: B:43:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096 A[Catch: Exception -> 0x0035, TryCatch #0 {Exception -> 0x0035, blocks: (B:13:0x0030, B:38:0x00d4, B:31:0x009f, B:33:0x00a5, B:35:0x00b5, B:20:0x004a, B:29:0x0086, B:24:0x005a, B:26:0x0060, B:30:0x0096, B:23:0x0051), top: B:43:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5 A[Catch: Exception -> 0x0035, TryCatch #0 {Exception -> 0x0035, blocks: (B:13:0x0030, B:38:0x00d4, B:31:0x009f, B:33:0x00a5, B:35:0x00b5, B:20:0x004a, B:29:0x0086, B:24:0x005a, B:26:0x0060, B:30:0x0096, B:23:0x0051), top: B:43:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0083 -> B:29:0x0086). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d1 -> B:38:0x00d4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refresh(Continuation<? super Unit> continuation) {
        C195001 c195001;
        Iterator it;
        Iterator it2;
        if (continuation instanceof C195001) {
            c195001 = (C195001) continuation;
            int i = c195001.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c195001.label = i - Integer.MIN_VALUE;
            } else {
                c195001 = new C195001(continuation);
            }
        }
        Object objInvestmentsTrackerGetPage = c195001.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c195001.label;
        try {
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 4, null);
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInvestmentsTrackerGetPage);
            it = this.getPageRequests.iterator();
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String account_id = (String) c195001.L$1;
                it2 = (Iterator) c195001.L$0;
                ResultKt.throwOnFailure(objInvestmentsTrackerGetPage);
                this.currentAccountPageResults.put(account_id, (InvestmentsTrackerGetPageResponseDto) objInvestmentsTrackerGetPage);
                while (it2.hasNext()) {
                    PageRequest pageRequest = (PageRequest) it2.next();
                    account_id = pageRequest.getRequestDto().getAccount_id();
                    if (account_id != null) {
                        InvestmentsTrackerGetPageRequestDto investmentsTrackerGetPageRequestDtoCopy$default = InvestmentsTrackerGetPageRequestDto.copy$default(pageRequest.getRequestDto(), null, this.currentSpan, null, null, 13, null);
                        BffMoneyMovementService bffMoneyMovementService = this.bffMoneyMovementService;
                        c195001.L$0 = it2;
                        c195001.L$1 = account_id;
                        c195001.label = 2;
                        objInvestmentsTrackerGetPage = bffMoneyMovementService.InvestmentsTrackerGetPage(investmentsTrackerGetPageRequestDtoCopy$default, c195001);
                    }
                }
                return Unit.INSTANCE;
            }
            PageRequest pageRequest2 = (PageRequest) c195001.L$1;
            it = (Iterator) c195001.L$0;
            ResultKt.throwOnFailure(objInvestmentsTrackerGetPage);
            this.currentGetPageRequestResults.put(pageRequest2.getRequestDto().getPage_type(), (InvestmentsTrackerGetPageResponseDto) objInvestmentsTrackerGetPage);
            if (it.hasNext()) {
                pageRequest2 = (PageRequest) it.next();
                InvestmentsTrackerGetPageRequestDto investmentsTrackerGetPageRequestDtoCopy$default2 = InvestmentsTrackerGetPageRequestDto.copy$default(pageRequest2.getRequestDto(), null, this.currentSpan, null, null, 13, null);
                BffMoneyMovementService bffMoneyMovementService2 = this.bffMoneyMovementService;
                c195001.L$0 = it;
                c195001.L$1 = pageRequest2;
                c195001.label = 1;
                objInvestmentsTrackerGetPage = bffMoneyMovementService2.InvestmentsTrackerGetPage(investmentsTrackerGetPageRequestDtoCopy$default2, c195001);
                if (objInvestmentsTrackerGetPage == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.currentGetPageRequestResults.put(pageRequest2.getRequestDto().getPage_type(), (InvestmentsTrackerGetPageResponseDto) objInvestmentsTrackerGetPage);
                if (it.hasNext()) {
                    it2 = this.accountRequests.iterator();
                    while (it2.hasNext()) {
                    }
                    return Unit.INSTANCE;
                }
            }
        }
    }

    public final InvestmentsTrackerGetPageResponseDto getPageResponseForType(InvestmentsTrackerPageTypeDto pageType) {
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        return this.currentGetPageRequestResults.get(pageType);
    }

    public final Object setSpanOption(SpanDto spanDto, Continuation<? super Unit> continuation) {
        this.currentSpan = spanDto;
        Object objRefresh = refresh(continuation);
        return objRefresh == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRefresh : Unit.INSTANCE;
    }

    public final boolean addAccountToRefresh(String accountId) {
        Object next;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Iterator<T> it = this.accountRequests.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((PageRequest) next).getRequestDto().getAccount_id(), accountId)) {
                break;
            }
        }
        boolean z = next == null;
        this.accountRequests.add(new PageRequest(new InvestmentsTrackerGetPageRequestDto(InvestmentsTrackerPageTypeDto.ACCOUNT, this.currentSpan, null, accountId, 4, null)));
        return z;
    }

    public final InvestmentsTrackerGetPageResponseDto getAccountResponseForId(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return this.currentAccountPageResults.get(accountId);
    }
}

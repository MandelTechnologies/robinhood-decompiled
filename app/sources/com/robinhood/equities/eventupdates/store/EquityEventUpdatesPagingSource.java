package com.robinhood.equities.eventupdates.store;

import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.arsenal.proto.p281v1.idl.EquityEventUpdateDto;
import com.robinhood.arsenal.proto.p281v1.idl.EquityService;
import com.robinhood.arsenal.proto.p281v1.idl.InstrumentEventUpdatesDto;
import com.robinhood.arsenal.proto.p281v1.idl.ListEquityEventUpdatesRequestDto;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import timber.log.Timber;

/* compiled from: EquityEventUpdatesPagingSource.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\f\u001a\u0004\u0018\u00010\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000eH\u0016J(\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0096@¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/equities/eventupdates/store/EquityEventUpdatesPagingSource;", "Landroidx/paging/PagingSource;", "", "Lcom/robinhood/arsenal/proto/v1/idl/EquityEventUpdateDto;", "arsenalEquityService", "Lcom/robinhood/arsenal/proto/v1/idl/EquityService;", "instrumentId", "Ljava/util/UUID;", "pageSize", "", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/EquityService;Ljava/util/UUID;I)V", "getRefreshKey", "state", "Landroidx/paging/PagingState;", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-equity-event-updates_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class EquityEventUpdatesPagingSource extends PagingSource<String, EquityEventUpdateDto> {
    public static final int $stable = 8;
    private final EquityService arsenalEquityService;
    private final UUID instrumentId;
    private final int pageSize;

    /* compiled from: EquityEventUpdatesPagingSource.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.equities.eventupdates.store.EquityEventUpdatesPagingSource", m3645f = "EquityEventUpdatesPagingSource.kt", m3646l = {30}, m3647m = AnalyticsStrings.NOTIF_STACK_EVENT_LOAD)
    /* renamed from: com.robinhood.equities.eventupdates.store.EquityEventUpdatesPagingSource$load$1 */
    static final class C331051 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C331051(Continuation<? super C331051> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EquityEventUpdatesPagingSource.this.load(null, this);
        }
    }

    public EquityEventUpdatesPagingSource(EquityService arsenalEquityService, UUID instrumentId, int i) {
        Intrinsics.checkNotNullParameter(arsenalEquityService, "arsenalEquityService");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        this.arsenalEquityService = arsenalEquityService;
        this.instrumentId = instrumentId;
        this.pageSize = i;
    }

    @Override // androidx.paging.PagingSource
    public String getRefreshKey(PagingState<String, EquityEventUpdateDto> state) {
        PagingSource.LoadResult.Page<String, EquityEventUpdateDto> pageClosestPageToPosition;
        Intrinsics.checkNotNullParameter(state, "state");
        Integer anchorPosition = state.getAnchorPosition();
        if (anchorPosition == null || (pageClosestPageToPosition = state.closestPageToPosition(anchorPosition.intValue())) == null) {
            return null;
        }
        return pageClosestPageToPosition.getNextKey();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.paging.PagingSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object load(PagingSource.LoadParams<String> loadParams, Continuation<? super PagingSource.LoadResult<String, EquityEventUpdateDto>> continuation) {
        C331051 c331051;
        if (continuation instanceof C331051) {
            c331051 = (C331051) continuation;
            int i = c331051.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c331051.label = i - Integer.MIN_VALUE;
            } else {
                c331051 = new C331051(continuation);
            }
        }
        Object objListEquityEventUpdates = c331051.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c331051.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objListEquityEventUpdates);
                EquityService equityService = this.arsenalEquityService;
                String string2 = this.instrumentId.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                int i3 = this.pageSize;
                String key = loadParams.getKey();
                if (key == null) {
                    key = "";
                }
                ListEquityEventUpdatesRequestDto listEquityEventUpdatesRequestDto = new ListEquityEventUpdatesRequestDto(string2, i3, key);
                c331051.label = 1;
                objListEquityEventUpdates = equityService.ListEquityEventUpdates(listEquityEventUpdatesRequestDto, c331051);
                if (objListEquityEventUpdates == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objListEquityEventUpdates);
            }
            InstrumentEventUpdatesDto instrumentEventUpdatesDto = (InstrumentEventUpdatesDto) objListEquityEventUpdates;
            String next_page_token = instrumentEventUpdatesDto.getNext_page_token();
            if (next_page_token.length() <= 0) {
                next_page_token = null;
            }
            return new PagingSource.LoadResult.Page(instrumentEventUpdatesDto.getEvent_updates(), null, next_page_token);
        } catch (Exception e) {
            Timber.INSTANCE.mo3355e(e, "Error loading equity event updates for instrument " + this.instrumentId, new Object[0]);
            return new PagingSource.LoadResult.Error(e);
        }
    }
}

package com.robinhood.android.portfolio.positionsSortOptions;

import com.robinhood.android.models.portfolio.PositionsSortOptions;
import com.robinhood.android.models.portfolio.PositionsSortPreference;
import com.robinhood.android.models.portfolio.api.PositionsSortDirection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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

/* compiled from: PositionsSortOptionsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsDuxo$onStart$1$1", m3645f = "PositionsSortOptionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class PositionsSortOptionsDuxo5 extends ContinuationImpl7 implements Function2<PositionsSortOptionsDataState, Continuation<? super PositionsSortOptionsDataState>, Object> {
    final /* synthetic */ List<String> $allowedSortQueries;
    final /* synthetic */ boolean $checkSortQueries;
    final /* synthetic */ PositionsSortDirection $initialSortDirection;
    final /* synthetic */ String $initialSortQuery;
    final /* synthetic */ boolean $isCurrentQueryAllowed;
    final /* synthetic */ Map<String, String> $queryTitleMap;
    final /* synthetic */ PositionsSortOptions $sortOptions;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PositionsSortOptionsDuxo5(List<String> list, PositionsSortOptions positionsSortOptions, String str, PositionsSortDirection positionsSortDirection, boolean z, Map<String, String> map, boolean z2, Continuation<? super PositionsSortOptionsDuxo5> continuation) {
        super(2, continuation);
        this.$allowedSortQueries = list;
        this.$sortOptions = positionsSortOptions;
        this.$initialSortQuery = str;
        this.$initialSortDirection = positionsSortDirection;
        this.$isCurrentQueryAllowed = z;
        this.$queryTitleMap = map;
        this.$checkSortQueries = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PositionsSortOptionsDuxo5 positionsSortOptionsDuxo5 = new PositionsSortOptionsDuxo5(this.$allowedSortQueries, this.$sortOptions, this.$initialSortQuery, this.$initialSortDirection, this.$isCurrentQueryAllowed, this.$queryTitleMap, this.$checkSortQueries, continuation);
        positionsSortOptionsDuxo5.L$0 = obj;
        return positionsSortOptionsDuxo5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PositionsSortOptionsDataState positionsSortOptionsDataState, Continuation<? super PositionsSortOptionsDataState> continuation) {
        return ((PositionsSortOptionsDuxo5) create(positionsSortOptionsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        PositionsSortPreference positionsSortPreference;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PositionsSortOptionsDataState positionsSortOptionsDataState = (PositionsSortOptionsDataState) this.L$0;
        List<String> list = this.$allowedSortQueries;
        Map<String, String> map = this.$queryTitleMap;
        List<PositionsSortOptions.SortOption> arrayList = new ArrayList<>();
        Iterator<T> it = list.iterator();
        while (true) {
            positionsSortPreference = null;
            positionsSortPreference = null;
            positionsSortPreference = null;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            String str2 = map.get(str);
            PositionsSortOptions.SortOption sortOption = str2 != null ? new PositionsSortOptions.SortOption(str2, str) : null;
            if (sortOption != null) {
                arrayList.add(sortOption);
            }
        }
        if (!this.$checkSortQueries) {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = this.$sortOptions.getOptions();
        }
        List<PositionsSortOptions.SortOption> list2 = arrayList;
        if (this.$initialSortQuery != null && this.$initialSortDirection != null && this.$isCurrentQueryAllowed) {
            positionsSortPreference = new PositionsSortPreference(this.$initialSortQuery, this.$initialSortDirection);
        }
        return PositionsSortOptionsDataState.copy$default(positionsSortOptionsDataState, null, null, list2, positionsSortPreference, false, false, 51, null);
    }
}

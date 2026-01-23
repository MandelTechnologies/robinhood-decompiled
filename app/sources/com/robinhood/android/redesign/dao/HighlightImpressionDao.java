package com.robinhood.android.redesign.dao;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.redesign.model.HighlightImpression;
import com.robinhood.utils.room.dao.BaseDaos;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: HighlightImpressionDao.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\tH§@¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H§@¢\u0006\u0002\u0010\u000fJ\u001e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H§@¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/redesign/dao/HighlightImpressionDao;", "Lcom/robinhood/utils/room/dao/InsertDao;", "Lcom/robinhood/android/redesign/model/HighlightImpression;", "getImpression", "impressionId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBadgeImpression", "getImpressions", "", "impressionIds", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createImpression", "", AnalyticsStrings.NOTIF_STACK_EVENT_IMPRESSION, "(Lcom/robinhood/android/redesign/model/HighlightImpression;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateImpression", "firstSeenAt", "", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-db-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface HighlightImpressionDao extends BaseDaos<HighlightImpression> {
    Object createImpression(HighlightImpression highlightImpression, Continuation<? super Unit> continuation);

    Object getBadgeImpression(String str, Continuation<? super HighlightImpression> continuation);

    Object getImpression(String str, Continuation<? super HighlightImpression> continuation);

    Object getImpressions(List<String> list, Continuation<? super List<HighlightImpression>> continuation);

    Object updateImpression(String str, long j, Continuation<? super Unit> continuation);
}

package androidx.room.paging;

import androidx.room.RoomRawQuery;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: Add missing generic type declarations: [Value] */
/* compiled from: LimitOffsetPagingSource.android.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class LimitOffsetPagingSource$implementation$1<Value> extends FunctionReferenceImpl implements Function3<RoomRawQuery, Integer, Continuation<? super List<? extends Value>>, Object>, ContinuationImpl6 {
    LimitOffsetPagingSource$implementation$1(Object obj) {
        super(3, obj, LimitOffsetPagingSource.class, "convertRows", "convertRows(Landroidx/room/RoomRawQuery;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final Object invoke(RoomRawQuery roomRawQuery, int i, Continuation<? super List<? extends Value>> continuation) {
        return ((LimitOffsetPagingSource) this.receiver).convertRows(roomRawQuery, i, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(RoomRawQuery roomRawQuery, Integer num, Object obj) {
        return invoke(roomRawQuery, num.intValue(), (Continuation) obj);
    }
}

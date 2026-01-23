package string.compareToDate;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.Instant;
import operation.StandardLogicOperation;
import string.StringUnwrapStrategy;
import utils.AnyUtils;

/* compiled from: CompareToDate.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n*\b\u0012\u0004\u0012\u00020\u00070\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lstring/compareToDate/CompareToDate;", "Loperation/StandardLogicOperation;", "Lstring/StringUnwrapStrategy;", "<init>", "()V", "", "", "Lkotlinx/datetime/Instant;", "toDateComparator", "(Ljava/util/List;)Ljava/util/List;", "", "invokeCompare", "(Ljava/util/List;)Ljava/lang/Integer;", "expression", WebsocketGatewayConstants.DATA_KEY, "evaluateLogic", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lstring/compareToDate/ComparePrecisionDateFormatter;", "formatter", "Lstring/compareToDate/ComparePrecisionDateFormatter;", "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class CompareToDate implements StandardLogicOperation, StringUnwrapStrategy {
    public static final CompareToDate INSTANCE = new CompareToDate();
    private static final ComparePrecisionDateFormatter formatter = new ComparePrecisionDateFormatter();

    private CompareToDate() {
    }

    @Override // operation.StandardLogicOperation
    public Object evaluateLogic(Object expression, Object data) {
        List<Instant> dateComparator = toDateComparator(AnyUtils.getAsList(expression));
        if (dateComparator != null) {
            return invokeCompare(dateComparator);
        }
        return null;
    }

    private final List<Instant> toDateComparator(List<? extends Object> list) {
        Object objM28550constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Object obj = list.get(2);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            ComparePrecision comparePrecisionValueOf = ComparePrecision.valueOf((String) obj);
            ComparePrecisionDateFormatter comparePrecisionDateFormatter = formatter;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            Instant date = comparePrecisionDateFormatter.formatDate((String) obj2, comparePrecisionValueOf);
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            objM28550constructorimpl = Result.m28550constructorimpl(CollectionsKt.listOf((Object[]) new Instant[]{date, comparePrecisionDateFormatter.formatDate((String) obj3, comparePrecisionValueOf)}));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
            objM28550constructorimpl = null;
        }
        return (List) objM28550constructorimpl;
    }

    private final Integer invokeCompare(List<Instant> list) {
        Object objM28550constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(Integer.valueOf(((Instant) CollectionsKt.first((List) list)).compareTo((Instant) CollectionsKt.last((List) list))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (!Result.m28556isSuccessimpl(objM28550constructorimpl)) {
            if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                objM28550constructorimpl = null;
            }
            return (Integer) objM28550constructorimpl;
        }
        int iIntValue = ((Number) objM28550constructorimpl).intValue();
        if (iIntValue > 0) {
            return 1;
        }
        if (iIntValue < 0) {
            return -1;
        }
        return 0;
    }
}

package array;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import operation.StandardLogicOperation;
import utils.AnyUtils;

/* compiled from: JoinToString.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u0004\u0018\u00010\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Larray/JoinToString;", "Loperation/StandardLogicOperation;", "<init>", "()V", "", "", "Larray/JoinToStringArguments;", "toOperationArguments", "(Ljava/util/List;)Larray/JoinToStringArguments;", "", "checkLimitArg", "(Ljava/util/List;)Ljava/lang/Integer;", "", "join", "(Larray/JoinToStringArguments;)Ljava/lang/String;", "expression", WebsocketGatewayConstants.DATA_KEY, "evaluateLogic", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class JoinToString implements StandardLogicOperation {
    public static final JoinToString INSTANCE = new JoinToString();

    private JoinToString() {
    }

    @Override // operation.StandardLogicOperation
    public Object evaluateLogic(Object expression, Object data) {
        JoinToStringArguments operationArguments = toOperationArguments(AnyUtils.getAsList(expression));
        if (operationArguments != null) {
            return join(operationArguments);
        }
        return null;
    }

    private final JoinToStringArguments toOperationArguments(List<? extends Object> list) {
        Object objM28550constructorimpl;
        JoinToStringArguments joinToStringArguments;
        try {
            Result.Companion companion = Result.INSTANCE;
            Integer numCheckLimitArg = INSTANCE.checkLimitArg(list);
            if (numCheckLimitArg != null) {
                int iIntValue = numCheckLimitArg.intValue();
                List<Object> asList = AnyUtils.getAsList(list.get(0));
                Object obj = list.get(1);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                Object obj2 = list.get(2);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                String str2 = (String) obj2;
                Object obj3 = list.get(3);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                Object obj4 = list.get(5);
                Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                joinToStringArguments = new JoinToStringArguments(asList, str, str2, (String) obj3, iIntValue, (String) obj4);
            } else {
                joinToStringArguments = null;
            }
            objM28550constructorimpl = Result.m28550constructorimpl(joinToStringArguments);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) == null) {
            return (JoinToStringArguments) objM28550constructorimpl;
        }
        return null;
    }

    private final Integer checkLimitArg(List<? extends Object> list) {
        Object obj = list.get(4);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Number");
        Number number = (Number) obj;
        if (number.doubleValue() != number.intValue()) {
            number = null;
        }
        if (number != null) {
            return Integer.valueOf(number.intValue());
        }
        return null;
    }

    private final String join(JoinToStringArguments joinToStringArguments) {
        return CollectionsKt.joinToString$default(joinToStringArguments.getElementsToJoin(), joinToStringArguments.getSeparator(), joinToStringArguments.getPrefix(), joinToStringArguments.getPostfix(), joinToStringArguments.getLimit(), joinToStringArguments.getTruncated(), null, 32, null);
    }
}

package operations.string;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import operation.StandardLogicOperation;
import operations.string.StringUnwrapStrategy;
import utils.AnyUtils;
import utils.ListUtils3;
import utils.StringUtils2;

/* compiled from: Substr.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0000\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0014\u0010\t\u001a\u00020\n*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0014\u0010\f\u001a\u00020\n*\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002J\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0005*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u001c\u0010\u0010\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u001c\u0010\u0011\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u001c\u0010\u0012\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u0014\u0010\u0013\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002J$\u0010\u0014\u001a\u00020\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0002¨\u0006\u0016"}, m3636d2 = {"Loperations/string/Substr;", "Loperation/StandardLogicOperation;", "Loperations/string/StringUnwrapStrategy;", "()V", "evaluateLogic", "", "expression", "", WebsocketGatewayConstants.DATA_KEY, "constrainNegativeStartIndex", "", "startIndex", "constrainOutOfBoundsCharsCount", "sourceStringLength", "fromStartIndexToEndIndex", "charsCount", "negativeArgsSubstring", "negativeStartIndexSubString", "notNegativeArgsSubstring", "startIndexSubstring", "substringOrEmpty", "", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes25.dex */
public final class Substr implements StandardLogicOperation, StringUnwrapStrategy {
    public static final Substr INSTANCE = new Substr();

    private Substr() {
    }

    public List<String> unwrapValueAsString(Object obj) {
        return StringUnwrapStrategy.DefaultImpls.unwrapValueAsString(this, obj);
    }

    @Override // operation.StandardLogicOperation
    public String evaluateLogic(Object expression, Object data) {
        List<? extends Object> asList = AnyUtils.getAsList(expression);
        return INSTANCE.substringOrEmpty(asList, StringUtils2.getIntOrZero(String.valueOf(ListUtils3.secondOrNull(asList))), StringUtils2.getIntOrZero(String.valueOf(ListUtils3.thirdOrNull(asList))));
    }

    private final String substringOrEmpty(List<? extends Object> list, int i, int i2) {
        Object objM28550constructorimpl;
        String strJoinToString$default = CollectionsKt.joinToString$default(unwrapValueAsString(CollectionsKt.firstOrNull((List) list)), ",", null, null, 0, null, null, 62, null);
        try {
            Result.Companion companion = Result.INSTANCE;
            if (list.size() == 2) {
                strJoinToString$default = INSTANCE.startIndexSubstring(strJoinToString$default, i);
            } else if (list.size() > 2) {
                strJoinToString$default = INSTANCE.fromStartIndexToEndIndex(strJoinToString$default, i, i2);
            }
            objM28550constructorimpl = Result.m28550constructorimpl(strJoinToString$default);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
            objM28550constructorimpl = null;
        }
        String str = (String) objM28550constructorimpl;
        return str == null ? "" : str;
    }

    private final String startIndexSubstring(String str, int i) {
        if (i >= 0) {
            String strSubstring = str.substring(i);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            return strSubstring;
        }
        if (Math.abs(i) > str.length()) {
            return str;
        }
        String strSubstring2 = str.substring(str.length() + i);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
        return strSubstring2;
    }

    private final String fromStartIndexToEndIndex(String str, int i, int i2) {
        if (i >= 0 && i2 > 0) {
            return notNegativeArgsSubstring(str, i, i2);
        }
        if (i >= 0 && i2 < 0) {
            String strSubstring = str.substring(i, str.length() + i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }
        if (i < 0 && i2 < 0) {
            return negativeArgsSubstring(str, i, i2);
        }
        if (i >= 0 || i2 <= 0) {
            return null;
        }
        return negativeStartIndexSubString(str, i, i2);
    }

    private final String notNegativeArgsSubstring(String str, int i, int i2) {
        String strSubstring = str.substring(i, constrainOutOfBoundsCharsCount(i2 + i, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    private final String negativeArgsSubstring(String str, int i, int i2) {
        String strSubstring = str.substring(constrainNegativeStartIndex(str, i), constrainOutOfBoundsCharsCount(str.length() + i2, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    private final String negativeStartIndexSubString(String str, int i, int i2) {
        int iConstrainNegativeStartIndex = constrainNegativeStartIndex(str, i);
        String strSubstring = str.substring(iConstrainNegativeStartIndex, constrainOutOfBoundsCharsCount(i2 + iConstrainNegativeStartIndex, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    private final int constrainNegativeStartIndex(String str, int i) {
        Integer numValueOf = Integer.valueOf(str.length() + i);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    private final int constrainOutOfBoundsCharsCount(int i, int i2) {
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() > i2) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i2;
    }
}

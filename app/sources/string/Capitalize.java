package string;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import operation.StandardLogicOperation;
import string.StringUnwrapStrategy;

/* compiled from: Capitalize.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, m3636d2 = {"Lstring/Capitalize;", "Loperation/StandardLogicOperation;", "Lstring/StringUnwrapStrategy;", "()V", "evaluateLogic", "", "expression", WebsocketGatewayConstants.DATA_KEY, "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes28.dex */
public final class Capitalize implements StandardLogicOperation, StringUnwrapStrategy {
    public static final Capitalize INSTANCE = new Capitalize();

    private Capitalize() {
    }

    public String unwrapValueAsString(Object obj) {
        return StringUnwrapStrategy.DefaultImpls.unwrapValueAsString(this, obj);
    }

    @Override // operation.StandardLogicOperation
    public Object evaluateLogic(Object expression, Object data) {
        String strUnwrapValueAsString = unwrapValueAsString(expression);
        if (strUnwrapValueAsString == null) {
            return null;
        }
        if (strUnwrapValueAsString.length() <= 0) {
            return strUnwrapValueAsString;
        }
        StringBuilder sb = new StringBuilder();
        String strValueOf = String.valueOf(strUnwrapValueAsString.charAt(0));
        Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        sb.append((Object) upperCase);
        String strSubstring = strUnwrapValueAsString.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        sb.append(strSubstring);
        return sb.toString();
    }
}

package string;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import operation.StandardLogicOperation;
import string.StringUnwrapStrategy;

/* compiled from: Lowercase.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, m3636d2 = {"Lstring/Lowercase;", "Loperation/StandardLogicOperation;", "Lstring/StringUnwrapStrategy;", "()V", "evaluateLogic", "", "expression", WebsocketGatewayConstants.DATA_KEY, "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class Lowercase implements StandardLogicOperation, StringUnwrapStrategy {
    public static final Lowercase INSTANCE = new Lowercase();

    private Lowercase() {
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
        String lowerCase = strUnwrapValueAsString.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }
}

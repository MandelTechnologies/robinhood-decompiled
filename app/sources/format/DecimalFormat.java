package format;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import format.DecimalFormatter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import operation.StandardLogicOperation;

/* compiled from: DecimalFormat.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, m3636d2 = {"Lformat/DecimalFormat;", "Loperation/StandardLogicOperation;", "Lformat/DecimalFormatter;", "()V", "evaluateLogic", "", "expression", WebsocketGatewayConstants.DATA_KEY, "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class DecimalFormat implements StandardLogicOperation, DecimalFormatter {
    public static final DecimalFormat INSTANCE = new DecimalFormat();

    private DecimalFormat() {
    }

    public String formatDecimal(Object obj, Object obj2, Function2<? super String, ? super Double, String> function2) {
        return DecimalFormatter.DefaultImpls.formatDecimal(this, obj, obj2, function2);
    }

    @Override // operation.StandardLogicOperation
    public Object evaluateLogic(Object expression, Object data) {
        return formatDecimal(expression, data, new Function2<String, Double, String>() { // from class: format.DecimalFormat.evaluateLogic.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ String invoke(String str, Double d) {
                return invoke(str, d.doubleValue());
            }

            public final String invoke(String formatSequence, double d) {
                Intrinsics.checkNotNullParameter(formatSequence, "formatSequence");
                String str = String.format(formatSequence, Double.valueOf(d));
                Intrinsics.checkNotNullExpressionValue(str, "format(formatSequence, arg)");
                return str;
            }
        });
    }
}

package string;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import operation.StandardLogicOperation;
import string.Trim3;
import utils.AnyUtils;

/* compiled from: Trim.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u0004\u0018\u00010\u0007*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b*\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lstring/Trim;", "Loperation/StandardLogicOperation;", "Lstring/StringUnwrapStrategy;", "<init>", "()V", "", "", "Lstring/TrimArguments;", "toOperationArguments", "(Ljava/util/List;)Lstring/TrimArguments;", "", "Lstring/TrimMode;", "toTrimMode", "(Ljava/lang/String;)Lstring/TrimMode;", "invokeTrim", "(Lstring/TrimArguments;)Ljava/lang/String;", "expression", WebsocketGatewayConstants.DATA_KEY, "evaluateLogic", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class Trim implements StandardLogicOperation, StringUnwrapStrategy {
    public static final Trim INSTANCE = new Trim();

    private Trim() {
    }

    @Override // operation.StandardLogicOperation
    public Object evaluateLogic(Object expression, Object data) {
        TrimArguments operationArguments = toOperationArguments(AnyUtils.getAsList(expression));
        if (operationArguments != null) {
            return invokeTrim(operationArguments);
        }
        return null;
    }

    private final TrimArguments toOperationArguments(List<? extends Object> list) {
        Object objM28550constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Object obj = list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = list.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            char cSingle = StringsKt.single((String) obj2);
            Trim trim = INSTANCE;
            Object obj3 = list.get(2);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            objM28550constructorimpl = Result.m28550constructorimpl(new TrimArguments((String) obj, cSingle, trim.toTrimMode((String) obj3)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) == null) {
            return (TrimArguments) objM28550constructorimpl;
        }
        return null;
    }

    private final Trim3 toTrimMode(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 100571) {
                if (iHashCode != 109757538) {
                    if (iHashCode == 2144573977 && str.equals("bothEnds")) {
                        return Trim3.BothEnds.INSTANCE;
                    }
                } else if (str.equals("start")) {
                    return Trim3.Start.INSTANCE;
                }
            } else if (str.equals("end")) {
                return Trim3.End.INSTANCE;
            }
        }
        throw new IllegalStateException("Invalid TrimMode value");
    }

    private final String invokeTrim(TrimArguments trimArguments) {
        Trim3 mode = trimArguments.getMode();
        if (Intrinsics.areEqual(mode, Trim3.Start.INSTANCE)) {
            return StringsKt.trimStart(trimArguments.getText(), trimArguments.getChar());
        }
        if (Intrinsics.areEqual(mode, Trim3.End.INSTANCE)) {
            return StringsKt.trimEnd(trimArguments.getText(), trimArguments.getChar());
        }
        if (Intrinsics.areEqual(mode, Trim3.BothEnds.INSTANCE)) {
            return StringsKt.trim(trimArguments.getText(), trimArguments.getChar());
        }
        throw new NoWhenBranchMatchedException();
    }
}

package string;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import operation.StandardLogicOperation;
import utils.AnyUtils;

/* compiled from: Split.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004*\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lstring/Split;", "Loperation/StandardLogicOperation;", "<init>", "()V", "", "", "Lstring/SplitArguments;", "toOperationArguments", "(Ljava/util/List;)Lstring/SplitArguments;", "", "invokeSplit", "(Lstring/SplitArguments;)Ljava/util/List;", "expression", WebsocketGatewayConstants.DATA_KEY, "evaluateLogic", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes28.dex */
public final class Split implements StandardLogicOperation {
    public static final Split INSTANCE = new Split();

    private Split() {
    }

    @Override // operation.StandardLogicOperation
    public Object evaluateLogic(Object expression, Object data) {
        SplitArguments operationArguments = toOperationArguments(AnyUtils.getAsList(expression));
        if (operationArguments != null) {
            return invokeSplit(operationArguments);
        }
        return null;
    }

    private final SplitArguments toOperationArguments(List<? extends Object> list) {
        Object objM28550constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Object obj = list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = list.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            objM28550constructorimpl = Result.m28550constructorimpl(new SplitArguments((String) obj, (List) obj2));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) == null) {
            return (SplitArguments) objM28550constructorimpl;
        }
        return null;
    }

    private final List<String> invokeSplit(SplitArguments splitArguments) {
        List<Object> delimiters = splitArguments.getDelimiters();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(delimiters, 10));
        for (Object obj : delimiters) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) obj);
        }
        String[] strArr = (String[]) CollectionsKt.toSet(arrayList).toArray(new String[0]);
        return StringsKt.split$default((CharSequence) splitArguments.getText(), (String[]) Arrays.copyOf(strArr, strArr.length), false, 0, 6, (Object) null);
    }
}

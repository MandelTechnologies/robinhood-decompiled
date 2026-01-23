package string;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import operation.StandardLogicOperation;
import utils.AnyUtils;

/* compiled from: Match.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u0004\u0018\u00010\u0007*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0015\u001a\u00020\u00122\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0012*\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Lstring/Match;", "Loperation/StandardLogicOperation;", "Lstring/StringUnwrapStrategy;", "<init>", "()V", "", "", "Lstring/MatchArguments;", "toOperationArguments", "(Ljava/util/List;)Lstring/MatchArguments;", "options", "", "Lkotlin/text/RegexOption;", "convertArrayToRegexOptions", "(Ljava/util/List;)Ljava/util/Set;", "", "regexPattern", "text", "", "matchBasic", "(Ljava/lang/String;Ljava/lang/String;)Z", "matchWithOptions", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Z", "invokeRegex", "(Lstring/MatchArguments;)Z", "expression", WebsocketGatewayConstants.DATA_KEY, "evaluateLogic", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes28.dex */
public final class Match implements StandardLogicOperation, StringUnwrapStrategy {
    public static final Match INSTANCE = new Match();

    private Match() {
    }

    @Override // operation.StandardLogicOperation
    public Object evaluateLogic(Object expression, Object data) {
        MatchArguments operationArguments = toOperationArguments(AnyUtils.getAsList(expression));
        if (operationArguments != null) {
            return Boolean.valueOf(invokeRegex(operationArguments));
        }
        return null;
    }

    private final MatchArguments toOperationArguments(List<? extends Object> list) {
        Object objM28550constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Object obj = list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = list.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = list.get(2);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            objM28550constructorimpl = Result.m28550constructorimpl(new MatchArguments((String) obj, (String) obj2, (List) obj3));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) == null) {
            return (MatchArguments) objM28550constructorimpl;
        }
        return null;
    }

    private final Set<RegexOption> convertArrayToRegexOptions(List<? extends Object> options) {
        List<? extends Object> list = options;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Object obj : list) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            arrayList.add(RegexOption.valueOf((String) obj));
        }
        return CollectionsKt.toSet(arrayList);
    }

    private final boolean matchBasic(String regexPattern, String text) {
        return new Regex(regexPattern).matches(text);
    }

    private final boolean matchWithOptions(List<? extends Object> options, String regexPattern, String text) {
        Set<RegexOption> setConvertArrayToRegexOptions = convertArrayToRegexOptions(options);
        Regex regex = new Regex(regexPattern, setConvertArrayToRegexOptions);
        Set<RegexOption> set = setConvertArrayToRegexOptions;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (((RegexOption) it.next()) == RegexOption.MULTILINE) {
                    List listSplit$default = StringsKt.split$default((CharSequence) text, new String[]{"\n"}, false, 0, 6, (Object) null);
                    if ((listSplit$default instanceof Collection) && listSplit$default.isEmpty()) {
                        return true;
                    }
                    Iterator it2 = listSplit$default.iterator();
                    while (it2.hasNext()) {
                        if (!regex.matches((String) it2.next())) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return regex.matches(text);
    }

    private final boolean invokeRegex(MatchArguments matchArguments) {
        List<Object> regexOptions = matchArguments.getRegexOptions();
        if (regexOptions == null || regexOptions.isEmpty()) {
            return matchBasic(matchArguments.getRegexPattern(), matchArguments.getText());
        }
        return matchWithOptions(matchArguments.getRegexOptions(), matchArguments.getRegexPattern(), matchArguments.getText());
    }
}

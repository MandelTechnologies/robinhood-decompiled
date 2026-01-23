package string;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import utils.AnyUtils;

/* compiled from: StringUnwrapStrategy.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m3636d2 = {"Lstring/StringUnwrapStrategy;", "", "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public interface StringUnwrapStrategy {

    /* compiled from: StringUnwrapStrategy.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static String unwrapValueAsString(StringUnwrapStrategy stringUnwrapStrategy, Object obj) {
            List<Object> asList = AnyUtils.getAsList(obj);
            if (asList.size() <= 1) {
                Object objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) asList);
                if (objFirstOrNull instanceof String) {
                    return (String) objFirstOrNull;
                }
            }
            return null;
        }
    }
}

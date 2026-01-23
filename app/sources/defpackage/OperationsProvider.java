package defpackage;

import array.Distinct;
import array.Find;
import array.JoinToString;
import array.Size;
import array.Sort;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import encoding.Encode;
import format.DecimalFormat;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import operation.FunctionalLogicOperation;
import operation.StandardLogicOperation;
import string.Capitalize;
import string.IsBlank;
import string.Length;
import string.Lowercase;
import string.Match;
import string.Replace;
import string.Split;
import string.ToArray;
import string.Trim;
import string.Uppercase;
import string.compareToDate.CompareToDate;

/* compiled from: OperationsProvider.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\f"}, m3636d2 = {"LOperationsProvider;", "", "()V", "functionalOperations", "", "", "Loperation/FunctionalLogicOperation;", "getFunctionalOperations", "()Ljava/util/Map;", "standardOperations", "Loperation/StandardLogicOperation;", "getStandardOperations", "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class OperationsProvider {
    public static final OperationsProvider INSTANCE = new OperationsProvider();
    private static final Map<String, StandardLogicOperation> standardOperations = MapsKt.mutableMapOf(Tuples4.m3642to("capitalize", Capitalize.INSTANCE), Tuples4.m3642to("isBlank", IsBlank.INSTANCE), Tuples4.m3642to("length", Length.INSTANCE), Tuples4.m3642to("lowercase", Lowercase.INSTANCE), Tuples4.m3642to("replace", Replace.INSTANCE), Tuples4.m3642to("uppercase", Uppercase.INSTANCE), Tuples4.m3642to("toArray", ToArray.INSTANCE), Tuples4.m3642to("decimalFormat", DecimalFormat.INSTANCE), Tuples4.m3642to("encode", Encode.INSTANCE), Tuples4.m3642to("match", Match.INSTANCE), Tuples4.m3642to("compareToDate", CompareToDate.INSTANCE), Tuples4.m3642to("split", Split.INSTANCE), Tuples4.m3642to("currentTime", CurrentTimeMillis.INSTANCE), Tuples4.m3642to("size", Size.INSTANCE), Tuples4.m3642to(AnalyticsStrings.BUTTON_LIST_SORT, Sort.INSTANCE), Tuples4.m3642to("distinct", Distinct.INSTANCE), Tuples4.m3642to("joinToString", JoinToString.INSTANCE), Tuples4.m3642to("drop", Drop.INSTANCE), Tuples4.m3642to("reverse", Reverse.INSTANCE), Tuples4.m3642to("trim", Trim.INSTANCE));
    private static final Map<String, FunctionalLogicOperation> functionalOperations = MapsKt.mutableMapOf(Tuples4.m3642to("find", Find.INSTANCE));

    private OperationsProvider() {
    }

    public final Map<String, StandardLogicOperation> getStandardOperations() {
        return standardOperations;
    }

    public final Map<String, FunctionalLogicOperation> getFunctionalOperations() {
        return functionalOperations;
    }
}

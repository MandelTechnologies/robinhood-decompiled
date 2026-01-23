package evaluation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import operation.FunctionalLogicOperation;
import operation.StandardLogicOperation;

/* compiled from: LogicOperations.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, m3636d2 = {"Levaluation/LogicOperations;", "", "", "", "Loperation/StandardLogicOperation;", "standardOperations", "Loperation/FunctionalLogicOperation;", "functionalOperations", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getStandardOperations", "()Ljava/util/Map;", "getFunctionalOperations", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class LogicOperations {
    private final Map<String, FunctionalLogicOperation> functionalOperations;
    private final Map<String, StandardLogicOperation> standardOperations;

    /* JADX WARN: Multi-variable type inference failed */
    public LogicOperations() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogicOperations)) {
            return false;
        }
        LogicOperations logicOperations = (LogicOperations) other;
        return Intrinsics.areEqual(this.standardOperations, logicOperations.standardOperations) && Intrinsics.areEqual(this.functionalOperations, logicOperations.functionalOperations);
    }

    public int hashCode() {
        return (this.standardOperations.hashCode() * 31) + this.functionalOperations.hashCode();
    }

    public String toString() {
        return "LogicOperations(standardOperations=" + this.standardOperations + ", functionalOperations=" + this.functionalOperations + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LogicOperations(Map<String, ? extends StandardLogicOperation> standardOperations, Map<String, ? extends FunctionalLogicOperation> functionalOperations) {
        Intrinsics.checkNotNullParameter(standardOperations, "standardOperations");
        Intrinsics.checkNotNullParameter(functionalOperations, "functionalOperations");
        this.standardOperations = standardOperations;
        this.functionalOperations = functionalOperations;
    }

    public /* synthetic */ LogicOperations(Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt.emptyMap() : map, (i & 2) != 0 ? MapsKt.emptyMap() : map2);
    }

    public final Map<String, StandardLogicOperation> getStandardOperations() {
        return this.standardOperations;
    }

    public final Map<String, FunctionalLogicOperation> getFunctionalOperations() {
        return this.functionalOperations;
    }
}

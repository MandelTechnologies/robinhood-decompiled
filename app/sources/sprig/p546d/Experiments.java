package sprig.p546d;

import com.singular.sdk.internal.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m3636d2 = {"Lsprig/d/a;", "", "Lorg/json/JSONObject;", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "", "toString", "", "hashCode", "other", "", "equals", "", "Lsprig/d/d;", "Ljava/util/List;", "getExperiments", "()Ljava/util/List;", "experiments", "<init>", "(Ljava/util/List;)V", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
@SourceDebugExtension
/* renamed from: sprig.d.a, reason: from toString */
/* loaded from: classes28.dex */
public final /* data */ class Experiments {

    /* renamed from: a, reason: from kotlin metadata and from toString */
    private final List<OptimizelyData> experiments;

    public Experiments(List<OptimizelyData> experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.experiments = experiments;
    }

    /* renamed from: a */
    public final JSONObject m4141a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        List<OptimizelyData> list = this.experiments;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((OptimizelyData) it.next()).m4146a());
        }
        jSONObject.put("experiments", new JSONArray((Collection<?>) arrayList));
        return jSONObject;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Experiments) && Intrinsics.areEqual(this.experiments, ((Experiments) other).experiments);
    }

    public int hashCode() {
        return this.experiments.hashCode();
    }

    public String toString() {
        return "Experiments(experiments=" + this.experiments + ')';
    }
}

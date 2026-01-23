package sprig.p546d;

import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r¨\u0006\u0014"}, m3636d2 = {"Lsprig/d/d;", "", "Lorg/json/JSONObject;", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "b", "getVariation", "variation", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
/* renamed from: sprig.d.d, reason: from toString */
/* loaded from: classes28.dex */
public final /* data */ class OptimizelyData {

    /* renamed from: a, reason: from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    private final String variation;

    public OptimizelyData(String id, String variation) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(variation, "variation");
        this.id = id;
        this.variation = variation;
    }

    /* renamed from: a */
    public final JSONObject m4146a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.id);
        jSONObject.put("variation", this.variation);
        return jSONObject;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptimizelyData)) {
            return false;
        }
        OptimizelyData optimizelyData = (OptimizelyData) other;
        return Intrinsics.areEqual(this.id, optimizelyData.id) && Intrinsics.areEqual(this.variation, optimizelyData.variation);
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.variation.hashCode();
    }

    public String toString() {
        return "OptimizelyData(id=" + this.id + ", variation=" + this.variation + ')';
    }
}

package sprig.p546d;

import com.singular.sdk.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0013\u001a\u00020\u0001\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0002J\"\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\tJ\n\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0007J\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u0003\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u0001H\u0007J.\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\tH\u0007J\u0018\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0001H\u0007R\u0014\u0010\u0013\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017¨\u0006\u001b"}, m3636d2 = {"Lsprig/d/e;", "", "variable", "c", "d", "Lsprig/d/d;", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "", "userId", "", "attributes", "Lsprig/d/a;", "config", "b", "experimentName", "variation", "", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Ljava/lang/Object;", Constants.RequestParamsKeys.SDK_VERSION_KEY, "Lkotlin/Function1;", "", "", "Lkotlin/jvm/functions/Function1;", "errorReporter", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
@SourceDebugExtension
/* renamed from: sprig.d.e */
/* loaded from: classes28.dex */
public final class C49007e {

    /* renamed from: a, reason: from kotlin metadata */
    private final Object sdk;

    /* renamed from: b, reason: from kotlin metadata */
    private final Function1<Throwable, Unit> errorReporter;

    /* JADX WARN: Multi-variable type inference failed */
    public C49007e(Object sdk, Function1<? super Throwable, Unit> errorReporter) {
        Intrinsics.checkNotNullParameter(sdk, "sdk");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        this.sdk = sdk;
        this.errorReporter = errorReporter;
    }

    /* renamed from: c */
    private final Object m4148c(Object variable) {
        return C49008f.m4156a(new C49005c("getId", this.errorReporter), variable);
    }

    /* renamed from: d */
    private final Object m4149d(Object variable) {
        return C49008f.m4156a(new C49005c("getValue", this.errorReporter), variable);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Experiments m4152a(String userId, Map<String, String> attributes) {
        List listEmptyList;
        Map<String, ?> mapM4153b;
        Set<String> setKeySet;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Object objM4150a = m4150a();
        if (objM4150a == null || (mapM4153b = m4153b(objM4150a)) == null || (setKeySet = mapM4153b.keySet()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                Object objM4151a = m4151a((String) it.next(), userId, attributes);
                if (objM4151a != null) {
                    arrayList.add(objM4151a);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                CollectionsKt.addAll(arrayList2, m4154e(it2.next()));
            }
            List listFilterNotNull = CollectionsKt.filterNotNull(arrayList2);
            if (listFilterNotNull != null) {
                listEmptyList = new ArrayList();
                Iterator it3 = listFilterNotNull.iterator();
                while (it3.hasNext()) {
                    OptimizelyData optimizelyDataM4147a = m4147a(it3.next());
                    if (optimizelyDataM4147a != null) {
                        listEmptyList.add(optimizelyDataM4147a);
                    }
                }
            }
        }
        return new Experiments(listEmptyList);
    }

    /* renamed from: b */
    public final Map<String, ?> m4153b(Object config) {
        Intrinsics.checkNotNullParameter(config, "config");
        Object objM4155a = C49008f.m4155a(new C49004b("experimentsMap", this.errorReporter), config);
        if (objM4155a instanceof Map) {
            return (Map) objM4155a;
        }
        return null;
    }

    /* renamed from: e */
    public final List<Object> m4154e(Object variation) {
        Intrinsics.checkNotNullParameter(variation, "variation");
        Object objM4156a = C49008f.m4156a(new C49005c("getFeatureVariableUsageInstances", this.errorReporter), variation);
        List<Object> list = objM4156a instanceof List ? (List) objM4156a : null;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* renamed from: a */
    public final Object m4150a() {
        return C49008f.m4156a(new C49005c("getOptimizelyConfig", this.errorReporter), this.sdk);
    }

    /* renamed from: a */
    public final Object m4151a(String experimentName, String userId, Map<String, String> attributes) {
        Intrinsics.checkNotNullParameter(experimentName, "experimentName");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        return C49008f.m4157a(new C49005c("getVariation", this.errorReporter), this.sdk, new Class[]{String.class, String.class, Map.class}, new Object[]{experimentName, userId, attributes});
    }

    /* renamed from: a */
    private final OptimizelyData m4147a(Object variable) {
        String string2;
        Object objM4149d;
        String string3;
        Object objM4148c = m4148c(variable);
        if (objM4148c == null || (string2 = objM4148c.toString()) == null || (objM4149d = m4149d(variable)) == null || (string3 = objM4149d.toString()) == null || string2.length() <= 0 || string3.length() <= 0) {
            return null;
        }
        return new OptimizelyData(string2, string3);
    }
}

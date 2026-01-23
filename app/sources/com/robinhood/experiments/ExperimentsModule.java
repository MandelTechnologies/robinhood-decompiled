package com.robinhood.experiments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ExperimentsModule.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\u0017\u0012\u0004\u0012\u00020\u0006\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0007¢\u0006\u0002\b\b0\u00052\u0015\u0010\t\u001a\u0011\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0007¢\u0006\u0002\b\b0\nH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/experiments/ExperimentsModule;", "", "<init>", "()V", "provideExperimentsByName", "", "", "Lcom/robinhood/experiments/ExperimentDeclaration;", "Lkotlin/jvm/JvmSuppressWildcards;", "experiments", "", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class ExperimentsModule {
    public static final ExperimentsModule INSTANCE = new ExperimentsModule();

    private ExperimentsModule() {
    }

    public final Map<String, ExperimentDeclaration<?>> provideExperimentsByName(Set<ExperimentDeclaration<?>> experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (ExperimentDeclaration<?> experimentDeclaration : experiments) {
            String serverName = experimentDeclaration.getServerName();
            if (!linkedHashMap.containsKey(serverName)) {
                linkedHashMap.put(serverName, experimentDeclaration);
            } else {
                Object arrayList = linkedHashMap2.get(serverName);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap2.put(serverName, arrayList);
                }
                ((Collection) arrayList).add(experimentDeclaration);
            }
        }
        if (linkedHashMap2.isEmpty()) {
            return linkedHashMap;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("One or more experiments have been defined multiple times. ");
        sb.append("Please define each experiment only once. Issues found:");
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            sb.append("\n  - \"");
            sb.append(str);
            sb.append("\" -> " + list);
        }
        throw new IllegalStateException(sb.toString().toString());
    }
}

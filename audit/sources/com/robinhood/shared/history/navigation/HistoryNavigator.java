package com.robinhood.shared.history.navigation;

import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.singular.sdk.internal.SLRemoteConfiguration;
import dagger.Lazy;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmSuppressWildcards;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HistoryNavigator.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "", "detailResolvers", "Ldagger/Lazy;", "", "Lcom/robinhood/shared/history/navigation/HistoryDetailResolver;", "legacyHistoryDetailResolver", "Lcom/robinhood/shared/history/navigation/LegacyHistoryDetailResolver;", "<init>", "(Ldagger/Lazy;Ldagger/Lazy;)V", "mappedDetailResolvers", "", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "getMappedDetailResolvers", "()Ljava/util/Map;", "mappedDetailResolvers$delegate", "Lkotlin/Lazy;", SLRemoteConfiguration.Constants.RESOLVE_JSON_KEY, "Lcom/robinhood/android/navigation/keys/FragmentKey;", "reference", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "isFromCryptoSource", "", "fromDeepLink", "lib-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class HistoryNavigator {
    public static final int $stable = 8;
    private final Lazy<Set<HistoryDetailResolver>> detailResolvers;
    private final Lazy<LegacyHistoryDetailResolver> legacyHistoryDetailResolver;

    /* renamed from: mappedDetailResolvers$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy mappedDetailResolvers;

    public HistoryNavigator(Lazy<Set<HistoryDetailResolver>> detailResolvers, Lazy<LegacyHistoryDetailResolver> legacyHistoryDetailResolver) {
        Intrinsics.checkNotNullParameter(detailResolvers, "detailResolvers");
        Intrinsics.checkNotNullParameter(legacyHistoryDetailResolver, "legacyHistoryDetailResolver");
        this.detailResolvers = detailResolvers;
        this.legacyHistoryDetailResolver = legacyHistoryDetailResolver;
        this.mappedDetailResolvers = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.history.navigation.HistoryNavigator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HistoryNavigator.mappedDetailResolvers_delegate$lambda$2(this.f$0);
            }
        });
    }

    private final Map<HistoryTransactionType, HistoryDetailResolver> getMappedDetailResolvers() {
        return (Map) this.mappedDetailResolvers.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map mappedDetailResolvers_delegate$lambda$2(HistoryNavigator historyNavigator) {
        Set<HistoryDetailResolver> set = historyNavigator.detailResolvers.get();
        Intrinsics.checkNotNullExpressionValue(set, "get(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            HistoryTransactionType historyTransactionType = ((HistoryDetailResolver) obj).getHistoryTransactionType();
            Object arrayList = linkedHashMap.get(historyTransactionType);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(historyTransactionType, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            if (((List) entry.getValue()).size() > 1) {
                throw new IllegalStateException(("Multiple history detail resolvers found for " + entry.getKey()).toString());
            }
            linkedHashMap2.put(key, (HistoryDetailResolver) CollectionsKt.first((List) entry.getValue()));
        }
        return linkedHashMap2;
    }

    public static /* synthetic */ FragmentKey resolve$default(HistoryNavigator historyNavigator, TransactionReference transactionReference, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return historyNavigator.resolve(transactionReference, z, z2);
    }

    public final FragmentKey resolve(TransactionReference reference, boolean isFromCryptoSource, boolean fromDeepLink) {
        FragmentKey fragmentKeyResolve;
        Intrinsics.checkNotNullParameter(reference, "reference");
        HistoryDetailResolver historyDetailResolver = getMappedDetailResolvers().get(reference.getSourceType());
        if (historyDetailResolver != null && (fragmentKeyResolve = historyDetailResolver.resolve(reference, isFromCryptoSource, fromDeepLink)) != null) {
            return fragmentKeyResolve;
        }
        FragmentKey fragmentKeyResolve2 = this.legacyHistoryDetailResolver.get().resolve(reference, isFromCryptoSource, fromDeepLink);
        if (fragmentKeyResolve2 != null) {
            return fragmentKeyResolve2;
        }
        throw new IllegalStateException(("No history detail resolver found for " + reference.getSourceType()).toString());
    }
}

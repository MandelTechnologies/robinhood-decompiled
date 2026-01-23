package com.robinhood.api.utils;

import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.api.utils.ItemStaleDecider;
import com.robinhood.models.p320db.StaleConfig;
import com.robinhood.models.p320db.Staleable;
import com.robinhood.utils.datetime.Durations;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: DefaultStaleDecider.kt */
@kotlin.Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R<\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0013j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b`\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u001bj\b\u0012\u0004\u0012\u00020\u0006`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/api/utils/DefaultStaleDecider;", "Lcom/robinhood/api/utils/ItemStaleDecider;", "Lcom/robinhood/models/db/StaleConfig;", "specification", "<init>", "(Lcom/robinhood/models/db/StaleConfig;)V", "", "key", "j$/time/Instant", "lastUpdatedAt", "", "invoke", "(Ljava/lang/String;Lj$/time/Instant;)Ljava/lang/Boolean;", "Lcom/robinhood/models/db/Staleable;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "", "update", "(Lcom/robinhood/models/db/Staleable;)V", "Lcom/robinhood/models/db/StaleConfig;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "receivedAtMap", "Ljava/util/HashMap;", "getReceivedAtMap", "()Ljava/util/HashMap;", "getReceivedAtMap$annotations", "()V", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "shortTimeoutIds", "Ljava/util/HashSet;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes16.dex */
public class DefaultStaleDecider implements ItemStaleDecider {
    private final HashMap<String, Instant> receivedAtMap;
    private final HashSet<String> shortTimeoutIds;
    private final StaleConfig specification;

    public static /* synthetic */ void getReceivedAtMap$annotations() {
    }

    public DefaultStaleDecider(StaleConfig specification) {
        Intrinsics.checkNotNullParameter(specification, "specification");
        this.specification = specification;
        this.receivedAtMap = new HashMap<>();
        this.shortTimeoutIds = new HashSet<>();
    }

    @Override // com.robinhood.api.utils.ItemStaleDecider
    public void updateAll(Iterable<? extends Staleable> iterable) {
        ItemStaleDecider.DefaultImpls.updateAll(this, iterable);
    }

    public final HashMap<String, Instant> getReceivedAtMap() {
        return this.receivedAtMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    @Override // com.robinhood.api.utils.ItemStaleDecider, kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Boolean invoke(String key, Instant lastUpdatedAt) {
        Intrinsics.checkNotNullParameter(key, "key");
        Instant instant = this.receivedAtMap.get(key);
        if (instant != null) {
            if (lastUpdatedAt != null && instant.compareTo(lastUpdatedAt) <= 0) {
                instant = null;
            }
            if (instant != null) {
                lastUpdatedAt = instant;
            }
        } else if (lastUpdatedAt == null) {
            return Boolean.TRUE;
        }
        return Boolean.valueOf(Durations.since(lastUpdatedAt).compareTo(this.shortTimeoutIds.contains(key) ? this.specification.getShortStaleTimeout() : this.specification.getNormalStaleTimeout()) >= 0);
    }

    @Override // com.robinhood.api.utils.ItemStaleDecider
    public void update(Staleable item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String staleableId = item.getStaleableId();
        if (item.getRequiresShortStaleTimeout()) {
            this.shortTimeoutIds.add(staleableId);
        } else {
            this.shortTimeoutIds.remove(staleableId);
        }
        this.receivedAtMap.put(staleableId, item.getReceivedAt());
    }
}

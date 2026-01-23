package com.robinhood.api.utils;

import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.models.p320db.Staleable;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: ItemStaleDecider.kt */
@kotlin.Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0004\bf\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0001J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/api/utils/ItemStaleDecider;", "Lkotlin/Function2;", "", "j$/time/Instant", "", "Lcom/robinhood/models/db/Staleable;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "", "update", "(Lcom/robinhood/models/db/Staleable;)V", "", "items", "updateAll", "(Ljava/lang/Iterable;)V", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface ItemStaleDecider extends Function2<String, Instant, Boolean> {
    @Override // kotlin.jvm.functions.Function2
    /* synthetic */ Boolean invoke(String str, Instant instant);

    void update(Staleable item);

    void updateAll(Iterable<? extends Staleable> items);

    /* compiled from: ItemStaleDecider.kt */
    @kotlin.Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static void updateAll(ItemStaleDecider itemStaleDecider, Iterable<? extends Staleable> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            Iterator<? extends Staleable> it = items.iterator();
            while (it.hasNext()) {
                itemStaleDecider.update(it.next());
            }
        }
    }
}

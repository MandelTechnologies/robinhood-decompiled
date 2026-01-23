package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LadderGestureAwareLazyColumn.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b!\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\r\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0097\u0001¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\r\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0096\u0001¢\u0006\u0004\b\r\u0010\u0010J\u0090\u0001\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112#\u0010\u0007\u001a\u001f\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2#\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b2,\u0010\u0017\u001a(\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\n0\u0016¢\u0006\u0002\b\u000bH\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019Jk\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112#\u0010\u0007\u001a\u001f\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2,\u0010\u0017\u001a(\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\n0\u0016¢\u0006\u0002\b\u000bH\u0097\u0001¢\u0006\u0004\b\u0018\u0010\u001aJ=\u0010\u001b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0097\u0001¢\u0006\u0004\b\u001b\u0010\u0010JC\u0010\u001b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u001d\u0010\f\u001a\u0019\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u0016¢\u0006\u0002\b\u000bH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/LadderLazyListScope;", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderGestureParent;", "Landroidx/compose/foundation/lazy/LazyListScope;", "lazyListScope", "<init>", "(Landroidx/compose/foundation/lazy/LazyListScope;)V", "", "key", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "Lkotlin/ExtensionFunctionType;", "content", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "contentType", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "", "count", "Lkotlin/ParameterName;", "name", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "Lkotlin/Function2;", "itemContent", "items", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "stickyHeader", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function4;)V", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class LadderLazyListScope implements LadderGestureParent, LazyListScope {
    public static final int $stable = 8;
    private final /* synthetic */ LazyListScope $$delegate_0;

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void item(Object key, Object contentType, Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.$$delegate_0.item(key, contentType, content);
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    @Deprecated
    public /* synthetic */ void item(Object key, Function3 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.$$delegate_0.item(key, content);
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void items(int count, Function1<? super Integer, ? extends Object> key, Function1<? super Integer, ? extends Object> contentType, Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        this.$$delegate_0.items(count, key, contentType, itemContent);
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    @Deprecated
    public /* synthetic */ void items(int count, Function1 key, Function4 itemContent) {
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        this.$$delegate_0.items(count, key, itemContent);
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    @Deprecated
    public /* synthetic */ void stickyHeader(Object key, Object contentType, Function3 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.$$delegate_0.stickyHeader(key, contentType, content);
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void stickyHeader(Object key, Object contentType, Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.$$delegate_0.stickyHeader(key, contentType, content);
    }

    public LadderLazyListScope(LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "lazyListScope");
        this.$$delegate_0 = lazyListScope;
    }
}

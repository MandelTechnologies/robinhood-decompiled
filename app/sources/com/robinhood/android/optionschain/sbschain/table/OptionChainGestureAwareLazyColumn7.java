package com.robinhood.android.optionschain.sbschain.table;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.optionschain.sbschain.table.gestures.DragTarget;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainGestureAwareLazyColumn.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0010\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0002\b\u000eH\u0097\u0001¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0010\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0002\b\u000eH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0013J\u0090\u0001\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\n\u0018\u00010\f2#\u0010\u0012\u001a\u001f\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n0\f2,\u0010\u001a\u001a(\u0012\u0004\u0012\u00020\r\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00070\u0019¢\u0006\u0002\b\u000eH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJk\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\n\u0018\u00010\f2,\u0010\u001a\u001a(\u0012\u0004\u0012\u00020\r\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00070\u0019¢\u0006\u0002\b\u000eH\u0097\u0001¢\u0006\u0004\b\u001b\u0010\u001dJ=\u0010\u001e\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0002\b\u000eH\u0097\u0001¢\u0006\u0004\b\u001e\u0010\u0013JC\u0010\u001e\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\u001d\u0010\u000f\u001a\u0019\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u0019¢\u0006\u0002\b\u000eH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/OptionChainLazyListScope;", "Landroidx/compose/foundation/lazy/LazyListScope;", "lazyListScope", "<init>", "(Landroidx/compose/foundation/lazy/LazyListScope;)V", "Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget;", "dragTarget", "", "updatePotentialDragTarget", "(Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget;)V", "", "key", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Lkotlin/ExtensionFunctionType;", "content", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "contentType", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "", "count", "Lkotlin/ParameterName;", "name", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "Lkotlin/Function2;", "itemContent", "items", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "stickyHeader", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function4;)V", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionChainLazyListScope, reason: use source file name */
/* loaded from: classes11.dex */
public abstract class OptionChainGestureAwareLazyColumn7 implements LazyListScope {
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

    public abstract void updatePotentialDragTarget(DragTarget dragTarget);

    public OptionChainGestureAwareLazyColumn7(LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "lazyListScope");
        this.$$delegate_0 = lazyListScope;
    }
}

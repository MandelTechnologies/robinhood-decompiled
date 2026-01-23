package com.robinhood.utils.compose.extensions;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LazyListScope.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0083\u0002\u0010\u0014\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u000428\b\b\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00040\u00062:\b\u0006\u0010\u000e\u001a4\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00062X\b\u0004\u0010\u0013\u001aR\u0012\u0004\u0012\u00020\u0010\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0002\b\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, m3636d2 = {"T", "Landroidx/compose/foundation/lazy/LazyListScope;", "", "items", "", "keyPrefix", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "key", "", "contentType", "Lkotlin/Function4;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "Lkotlin/ExtensionFunctionType;", "itemContent", "itemsIndexedWithPrefix", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function6;)V", "lib-utils-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.compose.extensions.LazyListScopeKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class LazyListScope2 {
    public static /* synthetic */ void itemsIndexedWithPrefix$default(LazyListScope lazyListScope, List items, String keyPrefix, Function2 key, Function2 contentType, Function6 itemContent, int i, Object obj) {
        if ((i & 8) != 0) {
            contentType = new Function2() { // from class: com.robinhood.utils.compose.extensions.LazyListScopeKt.itemsIndexedWithPrefix.1
                public final Void invoke(int i2, Object obj2) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(keyPrefix, "keyPrefix");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        LazyListScope3 lazyListScope3 = new LazyListScope3(keyPrefix, key);
        lazyListScope.items(items.size(), new C418452(lazyListScope3, items), new C418463(contentType, items), ComposableLambda3.composableLambdaInstance(1694499883, true, new C418474(itemContent, items, lazyListScope3)));
    }

    public static final <T> void itemsIndexedWithPrefix(LazyListScope lazyListScope, List<? extends T> items, String keyPrefix, Function2<? super Integer, ? super T, String> key, Function2<? super Integer, ? super T, ? extends Object> contentType, Function6<? super LazyItemScope, ? super Integer, ? super T, ? super String, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(keyPrefix, "keyPrefix");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        LazyListScope3 lazyListScope3 = new LazyListScope3(keyPrefix, key);
        lazyListScope.items(items.size(), new C418452(lazyListScope3, items), new C418463(contentType, items), ComposableLambda3.composableLambdaInstance(1694499883, true, new C418474(itemContent, items, lazyListScope3)));
    }

    /* compiled from: LazyListScope.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    /* renamed from: com.robinhood.utils.compose.extensions.LazyListScopeKt$itemsIndexedWithPrefix$2 */
    public static final class C418452 implements Function1<Integer, Object> {
        final /* synthetic */ Function2<Integer, T, String> $generateKey;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: Multi-variable type inference failed */
        public C418452(Function2<? super Integer, ? super T, String> function2, List<? extends T> list) {
            this.$generateKey = function2;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final Object invoke(int i) {
            return this.$generateKey.invoke(Integer.valueOf(i), this.$items.get(i));
        }
    }

    /* compiled from: LazyListScope.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    /* renamed from: com.robinhood.utils.compose.extensions.LazyListScopeKt$itemsIndexedWithPrefix$3 */
    public static final class C418463 implements Function1<Integer, Object> {
        final /* synthetic */ Function2<Integer, T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: Multi-variable type inference failed */
        public C418463(Function2<? super Integer, ? super T, ? extends Object> function2, List<? extends T> list) {
            this.$contentType = function2;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final Object invoke(int i) {
            return this.$contentType.invoke(Integer.valueOf(i), this.$items.get(i));
        }
    }

    /* compiled from: LazyListScope.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    /* renamed from: com.robinhood.utils.compose.extensions.LazyListScopeKt$itemsIndexedWithPrefix$4 */
    public static final class C418474 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function2<Integer, T, String> $generateKey;
        final /* synthetic */ Function6<LazyItemScope, Integer, T, String, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: Multi-variable type inference failed */
        public C418474(Function6<? super LazyItemScope, ? super Integer, ? super T, ? super String, ? super Composer, ? super Integer, Unit> function6, List<? extends T> list, Function2<? super Integer, ? super T, String> function2) {
            this.$itemContent = function6;
            this.$items = list;
            this.$generateKey = function2;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
            int i3;
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i2 & 6) == 0) {
                i3 = (composer.changed(items) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= composer.changed(i) ? 32 : 16;
            }
            if ((i3 & 147) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1694499883, i3, -1, "com.robinhood.utils.compose.extensions.itemsIndexedWithPrefix.<anonymous> (LazyListScope.kt:31)");
            }
            this.$itemContent.invoke(items, Integer.valueOf(i), this.$items.get(i), this.$generateKey.invoke(Integer.valueOf(i), this.$items.get(i)), composer, Integer.valueOf(i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}

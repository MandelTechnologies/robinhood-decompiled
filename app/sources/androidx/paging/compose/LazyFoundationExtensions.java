package androidx.paging.compose;

import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LazyFoundationExtensions.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001ah\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022*\b\u0002\u0010\b\u001a$\u0012\u0018\u0012\u00168\u0000¢\u0006\u0002\b\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"", "T", "Landroidx/paging/compose/LazyPagingItems;", "Lkotlin/Function1;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ParameterName;", "name", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "key", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "itemKey", "(Landroidx/paging/compose/LazyPagingItems;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "paging-compose_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: androidx.paging.compose.LazyFoundationExtensionsKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class LazyFoundationExtensions {
    public static final <T> Function1<Integer, Object> itemKey(final LazyPagingItems<T> lazyPagingItems, final Function1<T, ? extends Object> function1) {
        Intrinsics.checkNotNullParameter(lazyPagingItems, "<this>");
        return new Function1<Integer, Object>() { // from class: androidx.paging.compose.LazyFoundationExtensionsKt.itemKey.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                if (function1 == null) {
                    return PagingPlaceholderKey_androidKt.getPagingPlaceholderKey(i);
                }
                Object objPeek = lazyPagingItems.peek(i);
                return objPeek == null ? PagingPlaceholderKey_androidKt.getPagingPlaceholderKey(i) : function1.invoke(objPeek);
            }
        };
    }
}

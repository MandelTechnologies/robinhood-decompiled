package com.robinhood.android.investFlow.search;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.investFlow.search.item.DiscoveryCards3;
import com.robinhood.android.investFlow.search.item.DiscoveryChips;
import com.robinhood.android.investFlow.search.item.DiscoveryItems;
import com.robinhood.investflow.models.api.sdui.ApiInvestFlowComponentType;
import com.robinhood.utils.logging.CrashReporter;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: DiscoverySection.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m3636d2 = {"discoverySections", "", "Landroidx/compose/foundation/lazy/LazyListScope;", "sections", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/investFlow/search/DiscoverySection;", "selectedIds", "Ljava/util/UUID;", "callbacks", "Lcom/robinhood/android/investFlow/search/item/DiscoveryItemCallbacks;", "feature-invest-flow_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.search.DiscoverySectionKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class DiscoverySection2 {

    /* compiled from: DiscoverySection.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.investFlow.search.DiscoverySectionKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiInvestFlowComponentType.values().length];
            try {
                iArr[ApiInvestFlowComponentType.CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiInvestFlowComponentType.CHIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiInvestFlowComponentType.ROW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiInvestFlowComponentType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void discoverySections(LazyListScope lazyListScope, ImmutableList<DiscoverySection> sections, final ImmutableList<UUID> selectedIds, final DiscoveryItems callbacks) {
        LazyListScope lazyListScope2 = lazyListScope;
        Intrinsics.checkNotNullParameter(lazyListScope2, "<this>");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        for (final DiscoverySection discoverySection : sections) {
            DiscoveryScreen4.optionalSduiItems(lazyListScope2, discoverySection.getHeader());
            int i = WhenMappings.$EnumSwitchMapping$0[discoverySection.getComponentType().ordinal()];
            if (i == 1) {
                final UUID listId = discoverySection.getListId();
                if (listId == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                lazyListScope2 = lazyListScope;
                LazyListScope.item$default(lazyListScope2, listId, null, ComposableLambda3.composableLambdaInstance(325323664, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.investFlow.search.DiscoverySectionKt.discoverySections.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                        invoke(lazyItemScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope item, Composer composer, int i2) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i2 & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(325323664, i2, -1, "com.robinhood.android.investFlow.search.discoverySections.<anonymous> (DiscoverySection.kt:39)");
                        }
                        DiscoveryCards3.InvestFlowHorizontalCards(discoverySection.getAssetIds(), selectedIds, callbacks, listId, null, composer, 0, 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 2, null);
            } else if (i == 2) {
                final UUID listId2 = discoverySection.getListId();
                if (listId2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                LazyListScope.item$default(lazyListScope2, listId2, null, ComposableLambda3.composableLambdaInstance(404669575, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.investFlow.search.DiscoverySectionKt.discoverySections.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                        invoke(lazyItemScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope item, Composer composer, int i2) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i2 & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(404669575, i2, -1, "com.robinhood.android.investFlow.search.discoverySections.<anonymous> (DiscoverySection.kt:52)");
                        }
                        DiscoveryChips.InvestFlowChipGrid(discoverySection.getAssetIds(), selectedIds, callbacks, listId2, null, composer, 0, 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 2, null);
                lazyListScope2 = lazyListScope;
            } else {
                if (i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new DiscoverySection3(discoverySection.getListId()), false, null, 6, null);
            }
            DiscoveryScreen4.optionalSduiItems(lazyListScope2, discoverySection.getFooter());
        }
    }
}

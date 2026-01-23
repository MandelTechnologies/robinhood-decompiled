package com.robinhood.utils.compose.reorderable;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.utils.compose.reorderable.ReorderableSectionData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.Job;

/* compiled from: ReorderableSectionData.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/utils/compose/reorderable/ReorderableSectionData;", "", "HeaderCallData", "SectionItemData", "lib-utils-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface ReorderableSectionData {

    /* compiled from: ReorderableSectionData.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0099\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00126\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u0005\u0012:\b\u0002\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012:\b\u0002\u0010\u0012\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005\u00126\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u000e0\u0005\u0012\u008d\u0001\u0010\u001c\u001a\u0088\u0001\u0012\u0004\u0012\u00020\u0015\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0018\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\u0019¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u000e0\u0014¢\u0006\u0002\b\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J@\u0010!\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"JB\u0010#\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b$\u0010%JB\u0010&\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b&\u0010\"J@\u0010'\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u000e0\u0005HÆ\u0003¢\u0006\u0004\b'\u0010\"J\u0097\u0001\u0010(\u001a\u0088\u0001\u0012\u0004\u0012\u00020\u0015\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0018\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\u0019¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u000e0\u0014¢\u0006\u0002\b\u001bHÆ\u0003¢\u0006\u0004\b(\u0010)J°\u0003\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u000328\b\u0002\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u00052:\b\u0002\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00052\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2:\b\u0002\u0010\u0012\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000528\b\u0002\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u000e0\u00052\u008f\u0001\b\u0002\u0010\u001c\u001a\u0088\u0001\u0012\u0004\u0012\u00020\u0015\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0018\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\u0019¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u000e0\u0014¢\u0006\u0002\b\u001bHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b,\u0010 J\u0010\u0010-\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\u00162\b\u0010/\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b3\u0010 RG\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\"RI\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b6\u0010\"R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\b8\u0010%RI\u0010\u0012\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b9\u0010\"RG\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u000e0\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u00104\u001a\u0004\b:\u0010\"R\u009e\u0001\u0010\u001c\u001a\u0088\u0001\u0012\u0004\u0012\u00020\u0015\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0018\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\u0019¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u000e0\u0014¢\u0006\u0002\b\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010;\u001a\u0004\b<\u0010)¨\u0006="}, m3636d2 = {"Lcom/robinhood/utils/compose/reorderable/ReorderableSectionData$HeaderCallData;", "T", "", "", "keyPrefix", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "itemKey", "contentType", "Lkotlin/Function0;", "", "onDragStart", "startIndex", "targetIndex", "onDragUpdate", "onDragFinish", "Lkotlin/Function6;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "isDragItem", "expanded", "Lkotlin/Function1;", "setExpanded", "Lkotlin/ExtensionFunctionType;", "itemContent", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function8;)V", "component1", "()Ljava/lang/String;", "component2", "()Lkotlin/jvm/functions/Function2;", "component3", "component4", "()Lkotlin/jvm/functions/Function0;", "component5", "component6", "component7", "()Lkotlin/jvm/functions/Function8;", "copy", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function8;)Lcom/robinhood/utils/compose/reorderable/ReorderableSectionData$HeaderCallData;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKeyPrefix", "Lkotlin/jvm/functions/Function2;", "getItemKey", "getContentType", "Lkotlin/jvm/functions/Function0;", "getOnDragStart", "getOnDragUpdate", "getOnDragFinish", "Lkotlin/jvm/functions/Function8;", "getItemContent", "lib-utils-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class HeaderCallData<T> {
        public static final int $stable = 0;
        private final Function2<Integer, T, Object> contentType;
        private final Function8<LazyItemScope, T, Integer, Boolean, Boolean, Function1<? super Boolean, Unit>, Composer, Integer, Unit> itemContent;
        private final Function2<Integer, T, String> itemKey;
        private final String keyPrefix;
        private final Function2<Integer, Integer, Unit> onDragFinish;
        private final Function0<Unit> onDragStart;
        private final Function2<Integer, Integer, Unit> onDragUpdate;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$0(int i, Object obj) {
            return obj;
        }

        public static /* synthetic */ HeaderCallData copy$default(HeaderCallData headerCallData, String str, Function2 function2, Function2 function22, Function0 function0, Function2 function23, Function2 function24, Function8 function8, int i, Object obj) {
            if ((i & 1) != 0) {
                str = headerCallData.keyPrefix;
            }
            if ((i & 2) != 0) {
                function2 = headerCallData.itemKey;
            }
            if ((i & 4) != 0) {
                function22 = headerCallData.contentType;
            }
            if ((i & 8) != 0) {
                function0 = headerCallData.onDragStart;
            }
            if ((i & 16) != 0) {
                function23 = headerCallData.onDragUpdate;
            }
            if ((i & 32) != 0) {
                function24 = headerCallData.onDragFinish;
            }
            if ((i & 64) != 0) {
                function8 = headerCallData.itemContent;
            }
            Function2 function25 = function24;
            Function8 function82 = function8;
            Function2 function26 = function23;
            Function2 function27 = function22;
            return headerCallData.copy(str, function2, function27, function0, function26, function25, function82);
        }

        /* renamed from: component1, reason: from getter */
        public final String getKeyPrefix() {
            return this.keyPrefix;
        }

        public final Function2<Integer, T, String> component2() {
            return this.itemKey;
        }

        public final Function2<Integer, T, Object> component3() {
            return this.contentType;
        }

        public final Function0<Unit> component4() {
            return this.onDragStart;
        }

        public final Function2<Integer, Integer, Unit> component5() {
            return this.onDragUpdate;
        }

        public final Function2<Integer, Integer, Unit> component6() {
            return this.onDragFinish;
        }

        public final Function8<LazyItemScope, T, Integer, Boolean, Boolean, Function1<? super Boolean, Unit>, Composer, Integer, Unit> component7() {
            return this.itemContent;
        }

        public final HeaderCallData<T> copy(String keyPrefix, Function2<? super Integer, ? super T, String> itemKey, Function2<? super Integer, ? super T, ? extends Object> contentType, Function0<Unit> onDragStart, Function2<? super Integer, ? super Integer, Unit> onDragUpdate, Function2<? super Integer, ? super Integer, Unit> onDragFinish, Function8<? super LazyItemScope, ? super T, ? super Integer, ? super Boolean, ? super Boolean, ? super Function1<? super Boolean, Unit>, ? super Composer, ? super Integer, Unit> itemContent) {
            Intrinsics.checkNotNullParameter(keyPrefix, "keyPrefix");
            Intrinsics.checkNotNullParameter(itemKey, "itemKey");
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(onDragFinish, "onDragFinish");
            Intrinsics.checkNotNullParameter(itemContent, "itemContent");
            return new HeaderCallData<>(keyPrefix, itemKey, contentType, onDragStart, onDragUpdate, onDragFinish, itemContent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeaderCallData)) {
                return false;
            }
            HeaderCallData headerCallData = (HeaderCallData) other;
            return Intrinsics.areEqual(this.keyPrefix, headerCallData.keyPrefix) && Intrinsics.areEqual(this.itemKey, headerCallData.itemKey) && Intrinsics.areEqual(this.contentType, headerCallData.contentType) && Intrinsics.areEqual(this.onDragStart, headerCallData.onDragStart) && Intrinsics.areEqual(this.onDragUpdate, headerCallData.onDragUpdate) && Intrinsics.areEqual(this.onDragFinish, headerCallData.onDragFinish) && Intrinsics.areEqual(this.itemContent, headerCallData.itemContent);
        }

        public int hashCode() {
            int iHashCode = ((((this.keyPrefix.hashCode() * 31) + this.itemKey.hashCode()) * 31) + this.contentType.hashCode()) * 31;
            Function0<Unit> function0 = this.onDragStart;
            int iHashCode2 = (iHashCode + (function0 == null ? 0 : function0.hashCode())) * 31;
            Function2<Integer, Integer, Unit> function2 = this.onDragUpdate;
            return ((((iHashCode2 + (function2 != null ? function2.hashCode() : 0)) * 31) + this.onDragFinish.hashCode()) * 31) + this.itemContent.hashCode();
        }

        public String toString() {
            return "HeaderCallData(keyPrefix=" + this.keyPrefix + ", itemKey=" + this.itemKey + ", contentType=" + this.contentType + ", onDragStart=" + this.onDragStart + ", onDragUpdate=" + this.onDragUpdate + ", onDragFinish=" + this.onDragFinish + ", itemContent=" + this.itemContent + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public HeaderCallData(String keyPrefix, Function2<? super Integer, ? super T, String> itemKey, Function2<? super Integer, ? super T, ? extends Object> contentType, Function0<Unit> function0, Function2<? super Integer, ? super Integer, Unit> function2, Function2<? super Integer, ? super Integer, Unit> onDragFinish, Function8<? super LazyItemScope, ? super T, ? super Integer, ? super Boolean, ? super Boolean, ? super Function1<? super Boolean, Unit>, ? super Composer, ? super Integer, Unit> itemContent) {
            Intrinsics.checkNotNullParameter(keyPrefix, "keyPrefix");
            Intrinsics.checkNotNullParameter(itemKey, "itemKey");
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(onDragFinish, "onDragFinish");
            Intrinsics.checkNotNullParameter(itemContent, "itemContent");
            this.keyPrefix = keyPrefix;
            this.itemKey = itemKey;
            this.contentType = contentType;
            this.onDragStart = function0;
            this.onDragUpdate = function2;
            this.onDragFinish = onDragFinish;
            this.itemContent = itemContent;
        }

        public final String getKeyPrefix() {
            return this.keyPrefix;
        }

        public final Function2<Integer, T, String> getItemKey() {
            return this.itemKey;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ HeaderCallData(java.lang.String r9, kotlin.jvm.functions.Function2 r10, kotlin.jvm.functions.Function2 r11, kotlin.jvm.functions.Function0 r12, kotlin.jvm.functions.Function2 r13, kotlin.jvm.functions.Function2 r14, kotlin.jvm.functions.Function8 r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
            /*
                r8 = this;
                r0 = r16 & 4
                if (r0 == 0) goto L9
                com.robinhood.utils.compose.reorderable.ReorderableSectionData$HeaderCallData$$ExternalSyntheticLambda0 r11 = new com.robinhood.utils.compose.reorderable.ReorderableSectionData$HeaderCallData$$ExternalSyntheticLambda0
                r11.<init>()
            L9:
                r3 = r11
                r11 = r16 & 8
                r0 = 0
                if (r11 == 0) goto L11
                r4 = r0
                goto L12
            L11:
                r4 = r12
            L12:
                r11 = r16 & 16
                if (r11 == 0) goto L1d
                r5 = r0
                r1 = r9
                r2 = r10
                r6 = r14
                r7 = r15
                r0 = r8
                goto L23
            L1d:
                r5 = r13
                r0 = r8
                r1 = r9
                r2 = r10
                r6 = r14
                r7 = r15
            L23:
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.utils.compose.reorderable.ReorderableSectionData.HeaderCallData.<init>(java.lang.String, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function8, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final Function2<Integer, T, Object> getContentType() {
            return this.contentType;
        }

        public final Function0<Unit> getOnDragStart() {
            return this.onDragStart;
        }

        public final Function2<Integer, Integer, Unit> getOnDragUpdate() {
            return this.onDragUpdate;
        }

        public final Function2<Integer, Integer, Unit> getOnDragFinish() {
            return this.onDragFinish;
        }

        public final Function8<LazyItemScope, T, Integer, Boolean, Boolean, Function1<? super Boolean, Unit>, Composer, Integer, Unit> getItemContent() {
            return this.itemContent;
        }
    }

    /* compiled from: ReorderableSectionData.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b.\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u008f\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00126\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\b\u0012:\b\u0002\u0010\u000f\u001a4\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b\u0012Q\u0010\u0017\u001aM\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0011\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00010\u0012¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u0010\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0014\u0012\u0080\u0001\u0010$\u001a|\u0012\u0004\u0012\u00020\u001e\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00190\u001d¢\u0006\u0002\b#¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b)\u0010*J@\u0010+\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\bHÆ\u0003¢\u0006\u0004\b+\u0010,JB\u0010-\u001a4\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0006\u0012\u0004\u0018\u00010\u00030\bHÆ\u0003¢\u0006\u0004\b-\u0010,J[\u0010.\u001aM\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0011\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00010\u0012¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u0010HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b2\u00101J\u0010\u00105\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b3\u00104J\u008a\u0001\u00106\u001a|\u0012\u0004\u0012\u00020\u001e\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00190\u001d¢\u0006\u0002\b#HÆ\u0003¢\u0006\u0004\b6\u00107J®\u0003\u0010:\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u000628\b\u0002\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\b2:\b\u0002\u0010\u000f\u001a4\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b2S\b\u0002\u0010\u0017\u001aM\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0011\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00010\u0012¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u00102\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00142\u0082\u0001\b\u0002\u0010$\u001a|\u0012\u0004\u0012\u00020\u001e\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00190\u001d¢\u0006\u0002\b#HÆ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010;\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b;\u0010*J\u0010\u0010<\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b<\u0010=J\u001a\u0010?\u001a\u00020\u00042\b\u0010>\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b?\u0010@R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010(R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\bD\u0010*RG\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010E\u001a\u0004\bF\u0010,RI\u0010\u000f\u001a4\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010E\u001a\u0004\bG\u0010,Rb\u0010\u0017\u001aM\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0011\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00010\u0012¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u00108\u0006¢\u0006\f\n\u0004\b\u0017\u0010H\u001a\u0004\bI\u0010/R\u001f\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010J\u001a\u0004\bK\u00101R\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001b\u0010J\u001a\u0004\bL\u00101R\u0017\u0010\u001c\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001c\u0010M\u001a\u0004\bN\u00104R\u0091\u0001\u0010$\u001a|\u0012\u0004\u0012\u00020\u001e\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00190\u001d¢\u0006\u0002\b#8\u0006¢\u0006\f\n\u0004\b$\u0010O\u001a\u0004\bP\u00107¨\u0006Q"}, m3636d2 = {"Lcom/robinhood/utils/compose/reorderable/ReorderableSectionData$SectionItemData;", "T", "S", "", "", "itemsConsistentSize", "", "keyPrefix", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "itemKey", "contentType", "Lkotlin/Function3;", "headerItem", "", "reorderedItems", "Lkotlin/time/Duration;", "delay", "Lkotlinx/coroutines/Job;", "onReorder", "Lkotlin/Function0;", "", "onDragStart", "onDragFinish", "reorderDebounceDelay", "Lkotlin/Function6;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "parentItem", AnalyticsStrings.BUTTON_EARNINGS_PREVIEW, "sectionItemIndex", "isDragItem", "Lkotlin/ExtensionFunctionType;", "itemContent", "<init>", "(ZLjava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLkotlin/jvm/functions/Function8;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "()Lkotlin/jvm/functions/Function2;", "component4", "component5", "()Lkotlin/jvm/functions/Function3;", "component6", "()Lkotlin/jvm/functions/Function0;", "component7", "component8-UwyO8pc", "()J", "component8", "component9", "()Lkotlin/jvm/functions/Function8;", "copy-G-WJXV0", "(ZLjava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLkotlin/jvm/functions/Function8;)Lcom/robinhood/utils/compose/reorderable/ReorderableSectionData$SectionItemData;", "copy", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getItemsConsistentSize", "Ljava/lang/String;", "getKeyPrefix", "Lkotlin/jvm/functions/Function2;", "getItemKey", "getContentType", "Lkotlin/jvm/functions/Function3;", "getOnReorder", "Lkotlin/jvm/functions/Function0;", "getOnDragStart", "getOnDragFinish", "J", "getReorderDebounceDelay-UwyO8pc", "Lkotlin/jvm/functions/Function8;", "getItemContent", "lib-utils-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SectionItemData<T, S> {
        public static final int $stable = 0;
        private final Function2<Integer, S, Object> contentType;
        private final Function8<LazyItemScope, T, S, Boolean, Integer, Boolean, Composer, Integer, Unit> itemContent;
        private final Function2<Integer, S, String> itemKey;
        private final boolean itemsConsistentSize;
        private final String keyPrefix;
        private final Function0<Unit> onDragFinish;
        private final Function0<Unit> onDragStart;
        private final Function3<T, List<? extends S>, Duration, Job> onReorder;
        private final long reorderDebounceDelay;

        public /* synthetic */ SectionItemData(boolean z, String str, Function2 function2, Function2 function22, Function3 function3, Function0 function0, Function0 function02, long j, Function8 function8, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, str, function2, function22, function3, function0, function02, j, function8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$0(int i, Object obj) {
            return obj;
        }

        /* renamed from: copy-G-WJXV0$default, reason: not valid java name */
        public static /* synthetic */ SectionItemData m26637copyGWJXV0$default(SectionItemData sectionItemData, boolean z, String str, Function2 function2, Function2 function22, Function3 function3, Function0 function0, Function0 function02, long j, Function8 function8, int i, Object obj) {
            if ((i & 1) != 0) {
                z = sectionItemData.itemsConsistentSize;
            }
            if ((i & 2) != 0) {
                str = sectionItemData.keyPrefix;
            }
            if ((i & 4) != 0) {
                function2 = sectionItemData.itemKey;
            }
            if ((i & 8) != 0) {
                function22 = sectionItemData.contentType;
            }
            if ((i & 16) != 0) {
                function3 = sectionItemData.onReorder;
            }
            if ((i & 32) != 0) {
                function0 = sectionItemData.onDragStart;
            }
            if ((i & 64) != 0) {
                function02 = sectionItemData.onDragFinish;
            }
            if ((i & 128) != 0) {
                j = sectionItemData.reorderDebounceDelay;
            }
            if ((i & 256) != 0) {
                function8 = sectionItemData.itemContent;
            }
            Function8 function82 = function8;
            long j2 = j;
            Function0 function03 = function0;
            Function0 function04 = function02;
            Function3 function32 = function3;
            Function2 function23 = function2;
            return sectionItemData.m26639copyGWJXV0(z, str, function23, function22, function32, function03, function04, j2, function82);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getItemsConsistentSize() {
            return this.itemsConsistentSize;
        }

        /* renamed from: component2, reason: from getter */
        public final String getKeyPrefix() {
            return this.keyPrefix;
        }

        public final Function2<Integer, S, String> component3() {
            return this.itemKey;
        }

        public final Function2<Integer, S, Object> component4() {
            return this.contentType;
        }

        public final Function3<T, List<? extends S>, Duration, Job> component5() {
            return this.onReorder;
        }

        public final Function0<Unit> component6() {
            return this.onDragStart;
        }

        public final Function0<Unit> component7() {
            return this.onDragFinish;
        }

        /* renamed from: component8-UwyO8pc, reason: not valid java name and from getter */
        public final long getReorderDebounceDelay() {
            return this.reorderDebounceDelay;
        }

        public final Function8<LazyItemScope, T, S, Boolean, Integer, Boolean, Composer, Integer, Unit> component9() {
            return this.itemContent;
        }

        /* renamed from: copy-G-WJXV0, reason: not valid java name */
        public final SectionItemData<T, S> m26639copyGWJXV0(boolean itemsConsistentSize, String keyPrefix, Function2<? super Integer, ? super S, String> itemKey, Function2<? super Integer, ? super S, ? extends Object> contentType, Function3<? super T, ? super List<? extends S>, ? super Duration, ? extends Job> onReorder, Function0<Unit> onDragStart, Function0<Unit> onDragFinish, long reorderDebounceDelay, Function8<? super LazyItemScope, ? super T, ? super S, ? super Boolean, ? super Integer, ? super Boolean, ? super Composer, ? super Integer, Unit> itemContent) {
            Intrinsics.checkNotNullParameter(keyPrefix, "keyPrefix");
            Intrinsics.checkNotNullParameter(itemKey, "itemKey");
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(onReorder, "onReorder");
            Intrinsics.checkNotNullParameter(itemContent, "itemContent");
            return new SectionItemData<>(itemsConsistentSize, keyPrefix, itemKey, contentType, onReorder, onDragStart, onDragFinish, reorderDebounceDelay, itemContent, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SectionItemData)) {
                return false;
            }
            SectionItemData sectionItemData = (SectionItemData) other;
            return this.itemsConsistentSize == sectionItemData.itemsConsistentSize && Intrinsics.areEqual(this.keyPrefix, sectionItemData.keyPrefix) && Intrinsics.areEqual(this.itemKey, sectionItemData.itemKey) && Intrinsics.areEqual(this.contentType, sectionItemData.contentType) && Intrinsics.areEqual(this.onReorder, sectionItemData.onReorder) && Intrinsics.areEqual(this.onDragStart, sectionItemData.onDragStart) && Intrinsics.areEqual(this.onDragFinish, sectionItemData.onDragFinish) && Duration.m28733equalsimpl0(this.reorderDebounceDelay, sectionItemData.reorderDebounceDelay) && Intrinsics.areEqual(this.itemContent, sectionItemData.itemContent);
        }

        public int hashCode() {
            int iHashCode = ((((((((Boolean.hashCode(this.itemsConsistentSize) * 31) + this.keyPrefix.hashCode()) * 31) + this.itemKey.hashCode()) * 31) + this.contentType.hashCode()) * 31) + this.onReorder.hashCode()) * 31;
            Function0<Unit> function0 = this.onDragStart;
            int iHashCode2 = (iHashCode + (function0 == null ? 0 : function0.hashCode())) * 31;
            Function0<Unit> function02 = this.onDragFinish;
            return ((((iHashCode2 + (function02 != null ? function02.hashCode() : 0)) * 31) + Duration.m28747hashCodeimpl(this.reorderDebounceDelay)) * 31) + this.itemContent.hashCode();
        }

        public String toString() {
            return "SectionItemData(itemsConsistentSize=" + this.itemsConsistentSize + ", keyPrefix=" + this.keyPrefix + ", itemKey=" + this.itemKey + ", contentType=" + this.contentType + ", onReorder=" + this.onReorder + ", onDragStart=" + this.onDragStart + ", onDragFinish=" + this.onDragFinish + ", reorderDebounceDelay=" + Duration.m28761toStringimpl(this.reorderDebounceDelay) + ", itemContent=" + this.itemContent + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        private SectionItemData(boolean z, String keyPrefix, Function2<? super Integer, ? super S, String> itemKey, Function2<? super Integer, ? super S, ? extends Object> contentType, Function3<? super T, ? super List<? extends S>, ? super Duration, ? extends Job> onReorder, Function0<Unit> function0, Function0<Unit> function02, long j, Function8<? super LazyItemScope, ? super T, ? super S, ? super Boolean, ? super Integer, ? super Boolean, ? super Composer, ? super Integer, Unit> itemContent) {
            Intrinsics.checkNotNullParameter(keyPrefix, "keyPrefix");
            Intrinsics.checkNotNullParameter(itemKey, "itemKey");
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(onReorder, "onReorder");
            Intrinsics.checkNotNullParameter(itemContent, "itemContent");
            this.itemsConsistentSize = z;
            this.keyPrefix = keyPrefix;
            this.itemKey = itemKey;
            this.contentType = contentType;
            this.onReorder = onReorder;
            this.onDragStart = function0;
            this.onDragFinish = function02;
            this.reorderDebounceDelay = j;
            this.itemContent = itemContent;
        }

        public final boolean getItemsConsistentSize() {
            return this.itemsConsistentSize;
        }

        public final String getKeyPrefix() {
            return this.keyPrefix;
        }

        public final Function2<Integer, S, String> getItemKey() {
            return this.itemKey;
        }

        public /* synthetic */ SectionItemData(boolean z, String str, Function2 function2, Function2 function22, Function3 function3, Function0 function0, Function0 function02, long j, Function8 function8, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, str, function2, (i & 8) != 0 ? new Function2() { // from class: com.robinhood.utils.compose.reorderable.ReorderableSectionData$SectionItemData$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReorderableSectionData.SectionItemData._init_$lambda$0(((Integer) obj).intValue(), obj2);
                }
            } : function22, function3, (i & 32) != 0 ? null : function0, (i & 64) != 0 ? null : function02, (i & 128) != 0 ? ReorderableListStateKt.getDefaultReorderDebounceDelay() : j, function8, null);
        }

        public final Function2<Integer, S, Object> getContentType() {
            return this.contentType;
        }

        public final Function3<T, List<? extends S>, Duration, Job> getOnReorder() {
            return this.onReorder;
        }

        public final Function0<Unit> getOnDragStart() {
            return this.onDragStart;
        }

        public final Function0<Unit> getOnDragFinish() {
            return this.onDragFinish;
        }

        /* renamed from: getReorderDebounceDelay-UwyO8pc, reason: not valid java name */
        public final long m26640getReorderDebounceDelayUwyO8pc() {
            return this.reorderDebounceDelay;
        }

        public final Function8<LazyItemScope, T, S, Boolean, Integer, Boolean, Composer, Integer, Unit> getItemContent() {
            return this.itemContent;
        }
    }
}

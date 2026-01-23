package com.robinhood.compose.bento.component;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TopBarScrollState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010\t\u001a\u001a\u0010\n\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0001\u001a\u001a\u0010\n\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0001\"\u0015\u0010\u000f\u001a\u00020\u0010*\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0012\"\u0015\u0010\u0013\u001a\u00020\u0010*\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0016²\u0006\f\u0010\b\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002²\u0006\n\u0010\u0006\u001a\u00020\u0007X\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002"}, m3636d2 = {"rememberTopBarScrollState", "Lcom/robinhood/compose/bento/component/TopBarScrollState;", "initial", "", "(FLandroidx/compose/runtime/Composer;II)Lcom/robinhood/compose/bento/component/TopBarScrollState;", "deriveTopBarValue", "scrollPosition", "", "topBarHeight", "(ILjava/lang/Integer;)F", "scrollableTopBarState", "Landroidx/compose/ui/Modifier;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "topBarScrollState", "isScrolledToTheEnd", "", "Landroidx/compose/foundation/lazy/LazyListState;", "(Landroidx/compose/foundation/lazy/LazyListState;)Z", "canBeScrolled", "getCanBeScrolled", "listState", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.TopBarScrollStateKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class TopBarScrollState3 {
    public static final TopBarScrollState rememberTopBarScrollState(final float f, Composer composer, int i, int i2) {
        composer.startReplaceGroup(688606051);
        boolean z = true;
        if ((i2 & 1) != 0) {
            f = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(688606051, i, -1, "com.robinhood.compose.bento.component.rememberTopBarScrollState (TopBarScrollState.kt:47)");
        }
        Object[] objArr = new Object[0];
        Saver<TopBarScrollState, Float> saver = TopBarScrollState.INSTANCE.getSaver();
        composer.startReplaceGroup(5004770);
        if ((((i & 14) ^ 6) <= 4 || !composer.changed(f)) && (i & 6) != 4) {
            z = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.compose.bento.component.TopBarScrollStateKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TopBarScrollState3.rememberTopBarScrollState$lambda$1$lambda$0(f);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        TopBarScrollState topBarScrollState = (TopBarScrollState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return topBarScrollState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TopBarScrollState rememberTopBarScrollState$lambda$1$lambda$0(float f) {
        return new TopBarScrollState(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float deriveTopBarValue(int i, Integer num) {
        if (num == null) {
            return 0.0f;
        }
        if (i > num.intValue()) {
            return 1.0f;
        }
        return i / num.intValue();
    }

    /* compiled from: TopBarScrollState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.compose.bento.component.TopBarScrollStateKt$scrollableTopBarState$1 */
    static final class C325331 implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ ScrollState $scrollState;
        final /* synthetic */ TopBarScrollState $topBarScrollState;

        C325331(ScrollState scrollState, TopBarScrollState topBarScrollState) {
            this.$scrollState = scrollState;
            this.$topBarScrollState = topBarScrollState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Integer invoke$lambda$1(SnapshotState<Integer> snapshotState) {
            return snapshotState.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(SnapshotState snapshotState, IntSize intSize) {
            snapshotState.setValue(Integer.valueOf((int) (intSize.getPackedValue() & 4294967295L)));
            return Unit.INSTANCE;
        }

        public final Modifier invoke(Modifier composed, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceGroup(-1811075642);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1811075642, i, -1, "com.robinhood.compose.bento.component.scrollableTopBarState.<anonymous> (TopBarScrollState.kt:73)");
            }
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            Integer numValueOf = Integer.valueOf(this.$scrollState.getValue());
            Integer numInvoke$lambda$1 = invoke$lambda$1(snapshotState);
            composer.startReplaceGroup(-1746271574);
            boolean zChanged = composer.changed(this.$scrollState) | composer.changed(this.$topBarScrollState);
            ScrollState scrollState = this.$scrollState;
            TopBarScrollState topBarScrollState = this.$topBarScrollState;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new TopBarScrollState4(scrollState, topBarScrollState, snapshotState, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(numValueOf, numInvoke$lambda$1, (Function2) objRememberedValue2, composer, 0);
            composer.startReplaceGroup(5004770);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.compose.bento.component.TopBarScrollStateKt$scrollableTopBarState$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TopBarScrollState3.C325331.invoke$lambda$5$lambda$4(snapshotState, (IntSize) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            Modifier modifierOnSizeChanged = OnRemeasuredModifier2.onSizeChanged(composed, (Function1) objRememberedValue3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierOnSizeChanged;
        }
    }

    public static final Modifier scrollableTopBarState(Modifier modifier, ScrollState scrollState, TopBarScrollState topBarScrollState) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(topBarScrollState, "topBarScrollState");
        return ComposedModifier2.composed$default(modifier, null, new C325331(scrollState, topBarScrollState), 1, null);
    }

    /* compiled from: TopBarScrollState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.compose.bento.component.TopBarScrollStateKt$scrollableTopBarState$2 */
    static final class C325342 implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ LazyListState $listState;
        final /* synthetic */ TopBarScrollState $topBarScrollState;

        C325342(TopBarScrollState topBarScrollState, LazyListState lazyListState) {
            this.$topBarScrollState = topBarScrollState;
            this.$listState = lazyListState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$2(SnapshotState4<Integer> snapshotState4) {
            return snapshotState4.getValue().intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Integer invoke$lambda$4(SnapshotState<Integer> snapshotState) {
            return snapshotState.getValue();
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        public final Modifier invoke(Modifier composed, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceGroup(-1074547861);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1074547861, i, -1, "com.robinhood.compose.bento.component.scrollableTopBarState.<anonymous> (TopBarScrollState.kt:122)");
            }
            composer.startReplaceGroup(1849434622);
            final LazyListState lazyListState = this.$listState;
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.compose.bento.component.TopBarScrollStateKt$scrollableTopBarState$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(TopBarScrollState3.C325342.invoke$lambda$1$lambda$0(lazyListState));
                    }
                });
                composer.updateRememberedValue(objRememberedValue);
            }
            SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
            composer.endReplaceGroup();
            Integer numValueOf = Integer.valueOf(invoke$lambda$2(snapshotState4));
            Integer numInvoke$lambda$4 = invoke$lambda$4(snapshotState);
            composer.startReplaceGroup(-1746271574);
            boolean zChanged = composer.changed(this.$topBarScrollState);
            TopBarScrollState topBarScrollState = this.$topBarScrollState;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new TopBarScrollState5(topBarScrollState, snapshotState4, snapshotState, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(numValueOf, numInvoke$lambda$4, (Function2) objRememberedValue3, composer, 0);
            composer.startReplaceGroup(5004770);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.compose.bento.component.TopBarScrollStateKt$scrollableTopBarState$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TopBarScrollState3.C325342.invoke$lambda$8$lambda$7(snapshotState, (IntSize) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            Modifier modifierOnSizeChanged = OnRemeasuredModifier2.onSizeChanged(composed, (Function1) objRememberedValue4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierOnSizeChanged;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$1$lambda$0(LazyListState lazyListState) {
            if (!TopBarScrollState3.getCanBeScrolled(lazyListState)) {
                return 0;
            }
            if (lazyListState.getFirstVisibleItemIndex() > 0 || TopBarScrollState3.isScrolledToTheEnd(lazyListState)) {
                return Integer.MAX_VALUE;
            }
            return lazyListState.getFirstVisibleItemScrollOffset();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$7(SnapshotState snapshotState, IntSize intSize) {
            snapshotState.setValue(Integer.valueOf((int) (intSize.getPackedValue() & 4294967295L)));
            return Unit.INSTANCE;
        }
    }

    public static final boolean isScrolledToTheEnd(LazyListState lazyListState) {
        Intrinsics.checkNotNullParameter(lazyListState, "<this>");
        if (lazyListState.getLayoutInfo().getVisibleItemsInfo().isEmpty()) {
            return true;
        }
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.last((List) lazyListState.getLayoutInfo().getVisibleItemsInfo());
        return (lazyListItemInfo.getIndex() == lazyListState.getLayoutInfo().getTotalItemsCount() - 1) && (lazyListItemInfo.getSize() + lazyListItemInfo.getOffset() <= lazyListState.getLayoutInfo().getViewportEndOffset() + lazyListState.getLayoutInfo().getViewportStartOffset());
    }

    public static final boolean getCanBeScrolled(LazyListState lazyListState) {
        Intrinsics.checkNotNullParameter(lazyListState, "<this>");
        if (lazyListState.getLayoutInfo().getTotalItemsCount() == 0) {
            return false;
        }
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.first((List) lazyListState.getLayoutInfo().getVisibleItemsInfo());
        return (lazyListItemInfo.getIndex() == 0 && lazyListItemInfo.getOffset() == 0 && ((LazyListItemInfo) CollectionsKt.last((List) lazyListState.getLayoutInfo().getVisibleItemsInfo())).getIndex() + 1 == lazyListState.getLayoutInfo().getTotalItemsCount() && isScrolledToTheEnd(lazyListState)) ? false : true;
    }

    public static final Modifier scrollableTopBarState(Modifier modifier, LazyListState listState, TopBarScrollState topBarScrollState) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(listState, "listState");
        Intrinsics.checkNotNullParameter(topBarScrollState, "topBarScrollState");
        return ComposedModifier2.composed$default(modifier, null, new C325342(topBarScrollState, listState), 1, null);
    }
}

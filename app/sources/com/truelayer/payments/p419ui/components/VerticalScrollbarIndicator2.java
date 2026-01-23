package com.truelayer.payments.p419ui.components;

import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.CornerRadius2;
import androidx.compose.p011ui.geometry.OffsetKt;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.geometry.SizeKt;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import com.plaid.internal.EnumC7081g;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: VerticalScrollbarIndicator.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m3636d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.components.VerticalScrollbarIndicatorKt$verticalScrollIndicator$1, reason: use source file name */
/* loaded from: classes12.dex */
final class VerticalScrollbarIndicator2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ float $offsetX;
    final /* synthetic */ LazyListState $state;
    final /* synthetic */ float $width;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerticalScrollbarIndicator2(LazyListState lazyListState, float f, float f2) {
        super(3);
        this.$state = lazyListState;
        this.$width = f;
        this.$offsetX = f2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(729584061);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(729584061, i, -1, "com.truelayer.payments.ui.components.verticalScrollIndicator.<anonymous> (VerticalScrollbarIndicator.kt:25)");
        }
        float f = this.$state.isScrollInProgress() ? 0.6f : 0.0f;
        int i2 = this.$state.isScrollInProgress() ? 150 : 500;
        composer.startReplaceableGroup(-2061384280);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default(0, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-2061384221);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotState3.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
        composer.endReplaceableGroup();
        final SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(invoke$lambda$4(snapshotState2), null, 0.0f, null, null, composer, 0, 30);
        final SnapshotState4<Float> snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(f, AnimationSpecKt.tween$default(i2, 0, null, 6, null), 0.0f, null, null, composer, 0, 28);
        final long onSurface = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface();
        boolean z = this.$state.isScrollInProgress() || invoke$lambda$7(snapshotState4AnimateFloatAsState2) > 0.0f;
        composer.startReplaceableGroup(-2061383823);
        boolean zChanged = composer.changed(this.$state) | composer.changed(z) | composer.changed(onSurface) | composer.changed(this.$width) | composer.changed(this.$offsetX) | composer.changed(snapshotState4AnimateFloatAsState) | composer.changed(snapshotState4AnimateFloatAsState2);
        final LazyListState lazyListState = this.$state;
        final float f2 = this.$width;
        final float f3 = this.$offsetX;
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
            final boolean z2 = z;
            objRememberedValue3 = new Function1<ContentDrawScope, Unit>() { // from class: com.truelayer.payments.ui.components.VerticalScrollbarIndicatorKt$verticalScrollIndicator$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                    invoke2(contentDrawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ContentDrawScope drawWithContent) {
                    Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
                    drawWithContent.drawContent();
                    LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.firstOrNull((List) lazyListState.getLayoutInfo().getVisibleItemsInfo());
                    Integer numValueOf = lazyListItemInfo != null ? Integer.valueOf(lazyListItemInfo.getIndex()) : null;
                    if (!z2 || numValueOf == null) {
                        return;
                    }
                    float fM6580getHeightimpl = Size.m6580getHeightimpl(drawWithContent.mo6963getSizeNHjbRc()) / lazyListState.getLayoutInfo().getTotalItemsCount();
                    VerticalScrollbarIndicator2.invoke$lambda$5(snapshotState2, numValueOf.intValue() * fM6580getHeightimpl);
                    int size = lazyListState.getLayoutInfo().getVisibleItemsInfo().size();
                    if (Math.abs(size - VerticalScrollbarIndicator2.invoke$lambda$1(snapshotState)) > 1) {
                        VerticalScrollbarIndicator2.invoke$lambda$2(snapshotState, size);
                    }
                    DrawScope.m6960drawRoundRectuAw5IA$default(drawWithContent, onSurface, OffsetKt.Offset((Size.m6583getWidthimpl(drawWithContent.mo6963getSizeNHjbRc()) - drawWithContent.mo5016toPx0680j_4(f2)) - drawWithContent.mo5016toPx0680j_4(f3), VerticalScrollbarIndicator2.invoke$lambda$6(snapshotState4AnimateFloatAsState)), SizeKt.Size(drawWithContent.mo5016toPx0680j_4(f2), VerticalScrollbarIndicator2.invoke$lambda$1(snapshotState) * fM6580getHeightimpl), CornerRadius2.CornerRadius(drawWithContent.mo5016toPx0680j_4(f2), drawWithContent.mo5016toPx0680j_4(f2)), null, VerticalScrollbarIndicator2.invoke$lambda$7(snapshotState4AnimateFloatAsState2), null, 0, EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE, null);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        Modifier modifierDrawWithContent = DrawModifierKt.drawWithContent(composed, (Function1) objRememberedValue3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifierDrawWithContent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2(SnapshotState<Integer> snapshotState, int i) {
        snapshotState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$5(SnapshotState<Float> snapshotState, float f) {
        snapshotState.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$1(SnapshotState<Integer> snapshotState) {
        return snapshotState.getValue().intValue();
    }

    private static final float invoke$lambda$4(SnapshotState<Float> snapshotState) {
        return snapshotState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$6(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$7(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }
}

package androidx.compose.animation;

import androidx.compose.p011ui.layout.IntrinsicMeasurable;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.IntSize;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AnimatedVisibility.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u000f\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u00020\u0012*\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0017\u001a\u00020\u0012*\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J)\u0010\u0018\u001a\u00020\u0012*\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0015J)\u0010\u0019\u001a\u00020\u0012*\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, m3636d2 = {"Landroidx/compose/animation/AnimatedEnterExitMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/animation/AnimatedVisibilityScopeImpl;", "scope", "<init>", "(Landroidx/compose/animation/AnimatedVisibilityScopeImpl;)V", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "Landroidx/compose/animation/AnimatedVisibilityScopeImpl;", "getScope", "()Landroidx/compose/animation/AnimatedVisibilityScopeImpl;", "", "hasLookaheadOccurred", "Z", "getHasLookaheadOccurred", "()Z", "setHasLookaheadOccurred", "(Z)V", "animation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class AnimatedEnterExitMeasurePolicy implements MeasurePolicy {
    private boolean hasLookaheadOccurred;
    private final AnimatedVisibilityScopeImpl scope;

    @Override // androidx.compose.p011ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            Placeable placeableMo7239measureBRTryo0 = list.get(i).mo7239measureBRTryo0(j);
            iMax = Math.max(iMax, placeableMo7239measureBRTryo0.getWidth());
            iMax2 = Math.max(iMax2, placeableMo7239measureBRTryo0.getHeight());
            arrayList.add(placeableMo7239measureBRTryo0);
        }
        if (measureScope.isLookingAhead()) {
            this.hasLookaheadOccurred = true;
            this.scope.getTargetSize$animation_release().setValue(IntSize.m8055boximpl(IntSize.m8056constructorimpl((4294967295L & iMax2) | (iMax << 32))));
        } else if (!this.hasLookaheadOccurred) {
            this.scope.getTargetSize$animation_release().setValue(IntSize.m8055boximpl(IntSize.m8056constructorimpl((4294967295L & iMax2) | (iMax << 32))));
        }
        return MeasureScope.layout$default(measureScope, iMax, iMax2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                List<Placeable> list2 = arrayList;
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Placeable.PlacementScope.place$default(placementScope, list2.get(i2), 0, 0, 0.0f, 4, null);
                }
            }
        }, 4, null);
    }

    @Override // androidx.compose.p011ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMaxIntrinsicHeight = list.get(0).maxIntrinsicHeight(i);
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i2 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iMaxIntrinsicHeight2 = list.get(i2).maxIntrinsicHeight(i);
                if (iMaxIntrinsicHeight2 > iMaxIntrinsicHeight) {
                    iMaxIntrinsicHeight = iMaxIntrinsicHeight2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return iMaxIntrinsicHeight;
    }

    @Override // androidx.compose.p011ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMaxIntrinsicWidth = list.get(0).maxIntrinsicWidth(i);
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i2 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iMaxIntrinsicWidth2 = list.get(i2).maxIntrinsicWidth(i);
                if (iMaxIntrinsicWidth2 > iMaxIntrinsicWidth) {
                    iMaxIntrinsicWidth = iMaxIntrinsicWidth2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return iMaxIntrinsicWidth;
    }

    @Override // androidx.compose.p011ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMinIntrinsicHeight = list.get(0).minIntrinsicHeight(i);
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i2 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iMinIntrinsicHeight2 = list.get(i2).minIntrinsicHeight(i);
                if (iMinIntrinsicHeight2 > iMinIntrinsicHeight) {
                    iMinIntrinsicHeight = iMinIntrinsicHeight2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return iMinIntrinsicHeight;
    }

    @Override // androidx.compose.p011ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMinIntrinsicWidth = list.get(0).minIntrinsicWidth(i);
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i2 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iMinIntrinsicWidth2 = list.get(i2).minIntrinsicWidth(i);
                if (iMinIntrinsicWidth2 > iMinIntrinsicWidth) {
                    iMinIntrinsicWidth = iMinIntrinsicWidth2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return iMinIntrinsicWidth;
    }

    public AnimatedEnterExitMeasurePolicy(AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl) {
        this.scope = animatedVisibilityScopeImpl;
    }
}

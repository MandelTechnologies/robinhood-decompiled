package androidx.compose.foundation.lazy.layout;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.Constraints2;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LazyLayoutPrefetchState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "lazyLayoutPrefetchState", "traversablePrefetchState", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Constraints;", "ZeroConstraints", "J", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class LazyLayoutPrefetchStateKt {
    private static final long ZeroConstraints = Constraints2.Constraints$default(0, 0, 0, 0, 5, null);

    public static final Modifier traversablePrefetchState(Modifier modifier, LazyLayoutPrefetchState lazyLayoutPrefetchState) {
        Modifier modifierThen;
        return (lazyLayoutPrefetchState == null || (modifierThen = modifier.then(new TraversablePrefetchStateModifierElement(lazyLayoutPrefetchState))) == null) ? modifier : modifierThen;
    }
}

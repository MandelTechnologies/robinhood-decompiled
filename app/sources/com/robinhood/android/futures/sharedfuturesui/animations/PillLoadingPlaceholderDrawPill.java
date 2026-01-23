package com.robinhood.android.futures.sharedfuturesui.animations;

import androidx.compose.p011ui.graphics.BlendMode;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PillLoadingPlaceholderModifier.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ3\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/futures/sharedfuturesui/animations/PillLoadingPlaceholderDrawPill;", "", "drawPill", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "dotMaxRadius", "", "center", "Landroidx/compose/ui/geometry/Offset;", "radius", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "drawPill-iUh5c1k", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJFJ)V", "Companion", "lib-shared-futures-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface PillLoadingPlaceholderDrawPill {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* renamed from: drawPill-iUh5c1k */
    void mo14256drawPilliUh5c1k(DrawScope drawScope, float f, long j, float f2, long j2);

    /* compiled from: PillLoadingPlaceholderModifier.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/futures/sharedfuturesui/animations/PillLoadingPlaceholderDrawPill$Companion;", "", "<init>", "()V", "Default", "Lcom/robinhood/android/futures/sharedfuturesui/animations/PillLoadingPlaceholderDrawPill;", "getDefault", "()Lcom/robinhood/android/futures/sharedfuturesui/animations/PillLoadingPlaceholderDrawPill;", "lib-shared-futures-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final PillLoadingPlaceholderDrawPill Default = new PillLoadingPlaceholderDrawPill() { // from class: com.robinhood.android.futures.sharedfuturesui.animations.PillLoadingPlaceholderDrawPill$Companion$Default$1
            @Override // com.robinhood.android.futures.sharedfuturesui.animations.PillLoadingPlaceholderDrawPill
            /* renamed from: drawPill-iUh5c1k */
            public final void mo14256drawPilliUh5c1k(DrawScope PillLoadingPlaceholderDrawPill, float f, long j, float f2, long j2) {
                Intrinsics.checkNotNullParameter(PillLoadingPlaceholderDrawPill, "$this$PillLoadingPlaceholderDrawPill");
                DrawScope.m6946drawCircleV9BoPsw$default(PillLoadingPlaceholderDrawPill, PillLoadingPlaceholderModifierKt.m14742dotRadialGradientqcb84PM(j2, j, f2), f, j, 0.0f, null, null, BlendMode.INSTANCE.m6667getSrcAtop0nO6VwU(), 56, null);
            }
        };

        private Companion() {
        }

        public final PillLoadingPlaceholderDrawPill getDefault() {
            return Default;
        }
    }
}

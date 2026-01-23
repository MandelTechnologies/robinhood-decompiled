package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.TextPointerIcon_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.pointer.PointerIcon5;
import androidx.compose.p011ui.node.DpTouchBoundsExpansion;
import androidx.compose.p011ui.node.TouchBoundsExpansion3;
import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StylusHandwriting.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r\"\u001a\u0010\u0011\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "", "enabled", "showHoverIcon", "Lkotlin/Function0;", "", "onHandwritingSlopExceeded", "stylusHandwriting", "(Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "HandwritingBoundsVerticalOffset", "F", "getHandwritingBoundsVerticalOffset", "()F", "HandwritingBoundsHorizontalOffset", "getHandwritingBoundsHorizontalOffset", "Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "HandwritingBoundsExpansion", "Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "getHandwritingBoundsExpansion", "()Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.text.handwriting.StylusHandwritingKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class StylusHandwriting2 {
    private static final DpTouchBoundsExpansion HandwritingBoundsExpansion;
    private static final float HandwritingBoundsHorizontalOffset;
    private static final float HandwritingBoundsVerticalOffset;

    public static final Modifier stylusHandwriting(Modifier modifier, boolean z, boolean z2, Function0<Unit> function0) {
        if (!z || !StylusHandwriting_androidKt.isStylusHandwritingSupported()) {
            return modifier;
        }
        if (z2) {
            modifier = PointerIcon5.stylusHoverIcon(modifier, TextPointerIcon_androidKt.getHandwritingPointerIcon(), false, HandwritingBoundsExpansion);
        }
        return modifier.then(new StylusHandwritingElement(function0));
    }

    static {
        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(40);
        HandwritingBoundsVerticalOffset = fM7995constructorimpl;
        float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(10);
        HandwritingBoundsHorizontalOffset = fM7995constructorimpl2;
        HandwritingBoundsExpansion = TouchBoundsExpansion3.m7406DpTouchBoundsExpansiona9UjIt4(fM7995constructorimpl2, fM7995constructorimpl, fM7995constructorimpl2, fM7995constructorimpl);
    }

    public static final DpTouchBoundsExpansion getHandwritingBoundsExpansion() {
        return HandwritingBoundsExpansion;
    }
}

package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p011ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AndroidOverscroll.android.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0012J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0012J\r\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0012J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0012J\r\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0012J\r\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u0012J\r\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u0012J\r\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u0012J\r\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u0012J\r\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u0012J\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\n¢\u0006\u0004\b \u0010\u001fJ\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010\u001fJ\r\u0010\"\u001a\u00020\n¢\u0006\u0004\b\"\u0010\u001fJ\r\u0010#\u001a\u00020\n¢\u0006\u0004\b#\u0010\u001fJ\r\u0010$\u001a\u00020\n¢\u0006\u0004\b$\u0010\u001fJ\r\u0010%\u001a\u00020\n¢\u0006\u0004\b%\u0010\u001fJ\r\u0010&\u001a\u00020\n¢\u0006\u0004\b&\u0010\u001fJ\u0018\u0010+\u001a\u00020\r2\u0006\u0010(\u001a\u00020'ø\u0001\u0000¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u001c\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b(\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100R\u0018\u00102\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00100R\u0018\u00104\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00100R\u0018\u00105\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00100R\u0018\u00106\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00100R\u0018\u00107\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00100R\u001a\u00108\u001a\u00020\u0010*\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u001a\u0010:\u001a\u00020\u0010*\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u00109\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, m3636d2 = {"Landroidx/compose/foundation/EdgeEffectWrapper;", "", "Landroid/content/Context;", "context", "", "glowColor", "<init>", "(Landroid/content/Context;I)V", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroid/widget/EdgeEffect;", "createEdgeEffect", "(Landroidx/compose/foundation/gestures/Orientation;)Landroid/widget/EdgeEffect;", "", "finishAll", "()V", "", "isTopStretched", "()Z", "isBottomStretched", "isLeftStretched", "isRightStretched", "isTopNegationStretched", "isBottomNegationStretched", "isLeftNegationStretched", "isRightNegationStretched", "isTopAnimating", "isBottomAnimating", "isLeftAnimating", "isRightAnimating", "getOrCreateTopEffect", "()Landroid/widget/EdgeEffect;", "getOrCreateBottomEffect", "getOrCreateLeftEffect", "getOrCreateRightEffect", "getOrCreateTopEffectNegation", "getOrCreateBottomEffectNegation", "getOrCreateLeftEffectNegation", "getOrCreateRightEffectNegation", "Landroidx/compose/ui/unit/IntSize;", "size", "updateSize-ozmzZPI", "(J)V", "updateSize", "Landroid/content/Context;", "I", "J", "topEffect", "Landroid/widget/EdgeEffect;", "bottomEffect", "leftEffect", "rightEffect", "topEffectNegation", "bottomEffectNegation", "leftEffectNegation", "rightEffectNegation", "isStretched", "(Landroid/widget/EdgeEffect;)Z", "isAnimating", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class EdgeEffectWrapper {
    private EdgeEffect bottomEffect;
    private EdgeEffect bottomEffectNegation;
    private final Context context;
    private final int glowColor;
    private EdgeEffect leftEffect;
    private EdgeEffect leftEffectNegation;
    private EdgeEffect rightEffect;
    private EdgeEffect rightEffectNegation;
    private long size = IntSize.INSTANCE.m8064getZeroYbymL2g();
    private EdgeEffect topEffect;
    private EdgeEffect topEffectNegation;

    public EdgeEffectWrapper(Context context, int i) {
        this.context = context;
        this.glowColor = i;
    }

    public final void finishAll() {
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            edgeEffect.finish();
        }
        EdgeEffect edgeEffect2 = this.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.finish();
        }
        EdgeEffect edgeEffect3 = this.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.finish();
        }
        EdgeEffect edgeEffect4 = this.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.finish();
        }
        EdgeEffect edgeEffect5 = this.topEffectNegation;
        if (edgeEffect5 != null) {
            edgeEffect5.finish();
        }
        EdgeEffect edgeEffect6 = this.bottomEffectNegation;
        if (edgeEffect6 != null) {
            edgeEffect6.finish();
        }
        EdgeEffect edgeEffect7 = this.leftEffectNegation;
        if (edgeEffect7 != null) {
            edgeEffect7.finish();
        }
        EdgeEffect edgeEffect8 = this.rightEffectNegation;
        if (edgeEffect8 != null) {
            edgeEffect8.finish();
        }
    }

    public final boolean isTopStretched() {
        return isStretched(this.topEffect);
    }

    public final boolean isBottomStretched() {
        return isStretched(this.bottomEffect);
    }

    public final boolean isLeftStretched() {
        return isStretched(this.leftEffect);
    }

    public final boolean isRightStretched() {
        return isStretched(this.rightEffect);
    }

    public final boolean isTopNegationStretched() {
        return isStretched(this.topEffectNegation);
    }

    public final boolean isBottomNegationStretched() {
        return isStretched(this.bottomEffectNegation);
    }

    public final boolean isLeftNegationStretched() {
        return isStretched(this.leftEffectNegation);
    }

    public final boolean isRightNegationStretched() {
        return isStretched(this.rightEffectNegation);
    }

    private final boolean isStretched(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect) == 0.0f);
    }

    public final boolean isTopAnimating() {
        return isAnimating(this.topEffect);
    }

    public final boolean isBottomAnimating() {
        return isAnimating(this.bottomEffect);
    }

    public final boolean isLeftAnimating() {
        return isAnimating(this.leftEffect);
    }

    public final boolean isRightAnimating() {
        return isAnimating(this.rightEffect);
    }

    private final boolean isAnimating(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public final EdgeEffect getOrCreateTopEffect() {
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect(Orientation.Vertical);
        this.topEffect = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    public final EdgeEffect getOrCreateBottomEffect() {
        EdgeEffect edgeEffect = this.bottomEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect(Orientation.Vertical);
        this.bottomEffect = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    public final EdgeEffect getOrCreateLeftEffect() {
        EdgeEffect edgeEffect = this.leftEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect(Orientation.Horizontal);
        this.leftEffect = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    public final EdgeEffect getOrCreateRightEffect() {
        EdgeEffect edgeEffect = this.rightEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect(Orientation.Horizontal);
        this.rightEffect = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    public final EdgeEffect getOrCreateTopEffectNegation() {
        EdgeEffect edgeEffect = this.topEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect(Orientation.Vertical);
        this.topEffectNegation = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    public final EdgeEffect getOrCreateBottomEffectNegation() {
        EdgeEffect edgeEffect = this.bottomEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect(Orientation.Vertical);
        this.bottomEffectNegation = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    public final EdgeEffect getOrCreateLeftEffectNegation() {
        EdgeEffect edgeEffect = this.leftEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect(Orientation.Horizontal);
        this.leftEffectNegation = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    public final EdgeEffect getOrCreateRightEffectNegation() {
        EdgeEffect edgeEffect = this.rightEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect(Orientation.Horizontal);
        this.rightEffectNegation = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    private final EdgeEffect createEdgeEffect(Orientation orientation) {
        EdgeEffect edgeEffectCreate = EdgeEffectCompat.INSTANCE.create(this.context);
        edgeEffectCreate.setColor(this.glowColor);
        if (!IntSize.m8058equalsimpl0(this.size, IntSize.INSTANCE.m8064getZeroYbymL2g())) {
            if (orientation == Orientation.Vertical) {
                long j = this.size;
                edgeEffectCreate.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return edgeEffectCreate;
            }
            long j2 = this.size;
            edgeEffectCreate.setSize((int) (j2 & 4294967295L), (int) (j2 >> 32));
        }
        return edgeEffectCreate;
    }

    /* renamed from: updateSize-ozmzZPI, reason: not valid java name */
    public final void m4909updateSizeozmzZPI(long size) {
        this.size = size;
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            edgeEffect.setSize((int) (size >> 32), (int) (size & 4294967295L));
        }
        EdgeEffect edgeEffect2 = this.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.setSize((int) (size >> 32), (int) (size & 4294967295L));
        }
        EdgeEffect edgeEffect3 = this.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.setSize((int) (size & 4294967295L), (int) (size >> 32));
        }
        EdgeEffect edgeEffect4 = this.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.setSize((int) (size & 4294967295L), (int) (size >> 32));
        }
        EdgeEffect edgeEffect5 = this.topEffectNegation;
        if (edgeEffect5 != null) {
            edgeEffect5.setSize((int) (size >> 32), (int) (size & 4294967295L));
        }
        EdgeEffect edgeEffect6 = this.bottomEffectNegation;
        if (edgeEffect6 != null) {
            edgeEffect6.setSize((int) (size >> 32), (int) (size & 4294967295L));
        }
        EdgeEffect edgeEffect7 = this.leftEffectNegation;
        if (edgeEffect7 != null) {
            edgeEffect7.setSize((int) (size & 4294967295L), (int) (size >> 32));
        }
        EdgeEffect edgeEffect8 = this.rightEffectNegation;
        if (edgeEffect8 != null) {
            edgeEffect8.setSize((int) (4294967295L & size), (int) (size >> 32));
        }
    }
}

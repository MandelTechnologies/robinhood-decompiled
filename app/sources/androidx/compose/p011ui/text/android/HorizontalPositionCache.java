package androidx.compose.p011ui.text.android;

import com.robinhood.android.instant.p160ui.InstantRetirementSplashScreen;
import kotlin.Metadata;

/* compiled from: TextLayout.android.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Landroidx/compose/ui/text/android/HorizontalPositionCache;", "", "Landroidx/compose/ui/text/android/TextLayout;", "layout", "<init>", "(Landroidx/compose/ui/text/android/TextLayout;)V", "", "offset", "", "upstream", "cache", InstantRetirementSplashScreen.PrimaryButtonTag, "", "get", "(IZZZ)F", "getPrimaryDownstream", "(I)F", "getPrimaryUpstream", "getSecondaryDownstream", "getSecondaryUpstream", "Landroidx/compose/ui/text/android/TextLayout;", "getLayout", "()Landroidx/compose/ui/text/android/TextLayout;", "cachedKey", "I", "cachedValue", "F", "ui-text_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
final class HorizontalPositionCache {
    private int cachedKey = -1;
    private float cachedValue;
    private final TextLayout layout;

    public HorizontalPositionCache(TextLayout textLayout) {
        this.layout = textLayout;
    }

    public final float getPrimaryDownstream(int offset) {
        return get(offset, false, false, true);
    }

    public final float getPrimaryUpstream(int offset) {
        return get(offset, true, true, true);
    }

    public final float getSecondaryDownstream(int offset) {
        return get(offset, false, false, false);
    }

    public final float getSecondaryUpstream(int offset) {
        return get(offset, true, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final float get(int offset, boolean upstream, boolean cache2, boolean primary) {
        boolean z;
        float secondaryHorizontal;
        int i = 1;
        if (upstream) {
            int lineForOffset = LayoutCompat_androidKt.getLineForOffset(this.layout.getLayout(), offset, upstream);
            z = offset == this.layout.getLineStart(lineForOffset) || offset == this.layout.getLineEnd(lineForOffset);
        }
        int i2 = offset * 4;
        if (!primary) {
            i = z ? 2 : 3;
        } else if (z) {
            i = 0;
        }
        int i3 = i2 + i;
        if (this.cachedKey == i3) {
            return this.cachedValue;
        }
        if (primary) {
            secondaryHorizontal = this.layout.getPrimaryHorizontal(offset, upstream);
        } else {
            secondaryHorizontal = this.layout.getSecondaryHorizontal(offset, upstream);
        }
        if (cache2) {
            this.cachedKey = i3;
            this.cachedValue = secondaryHorizontal;
        }
        return secondaryHorizontal;
    }
}

package androidx.compose.p011ui.spatial;

import androidx.collection.IntObjectMap2;
import androidx.collection.IntObjectMap3;
import androidx.compose.p011ui.node.DelegatableNode;
import androidx.compose.p011ui.node.DelegatableNode2;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.p011ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ThrottledCallbacks.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u00002\u00020\u0001:\u0001AB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000b\u001a\u00020\n2\n\u0010\u0005\u001a\u00060\u0004R\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ@\u0010\u0014\u001a\u00020\n2\n\u0010\u0005\u001a\u00060\u0004R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013JH\u0010\u0018\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0004R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b&\u0010%J\u0015\u0010'\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b'\u0010%R!\u0010)\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00000(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R(\u0010-\u001a\b\u0018\u00010\u0004R\u00020\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00103\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u0010%R(\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000e\u00104\u001a\u0004\b8\u00106\"\u0004\b9\u0010%R(\u0010\u000f\u001a\u00020\r8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000f\u00104\u001a\u0004\b:\u00106\"\u0004\b;\u0010%R*\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0011\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, m3636d2 = {"Landroidx/compose/ui/spatial/ThrottledCallbacks;", "", "<init>", "()V", "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "entry", "", "topLeft", "bottomRight", "currentMillis", "", "fireWithUpdatedRect", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJJ)V", "Landroidx/compose/ui/unit/IntOffset;", "windowOffset", "screenOffset", "Landroidx/compose/ui/graphics/Matrix;", "viewToWindowMatrix", "fire-WY9HvpM", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJ[FJ)V", "fire", "minDeadline", "debounceEntry-b8qMvQI", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJ[FJJ)J", "debounceEntry", "screen", "window", "matrix", "", "updateOffsets-bT0EZQs", "(JJ[F)Z", "updateOffsets", "", "id", "fireOnUpdatedRect", "(IJJJ)V", "fireOnRectChangedEntries", "(J)V", "fireGlobalChangeEntries", "triggerDebounced", "Landroidx/collection/MutableIntObjectMap;", "rectChangedMap", "Landroidx/collection/MutableIntObjectMap;", "getRectChangedMap", "()Landroidx/collection/MutableIntObjectMap;", "globalChangeEntries", "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "getGlobalChangeEntries", "()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "setGlobalChangeEntries", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V", "minDebounceDeadline", "J", "getMinDebounceDeadline", "()J", "setMinDebounceDeadline", "getWindowOffset-nOcc-ac", "setWindowOffset--gyyYBs", "getScreenOffset-nOcc-ac", "setScreenOffset--gyyYBs", "[F", "getViewToWindowMatrix-3i98HWw", "()[F", "setViewToWindowMatrix-Q8lPUPs", "([F)V", "Entry", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ThrottledCallbacks {
    private Entry globalChangeEntries;
    private long screenOffset;
    private float[] viewToWindowMatrix;
    private long windowOffset;
    private final IntObjectMap3<Entry> rectChangedMap = IntObjectMap2.mutableIntObjectMapOf();
    private long minDebounceDeadline = -1;

    public ThrottledCallbacks() {
        IntOffset.Companion companion = IntOffset.INSTANCE;
        this.windowOffset = companion.m8047getZeronOccac();
        this.screenOffset = companion.m8047getZeronOccac();
    }

    /* compiled from: ThrottledCallbacks.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0004\u0018\u00002\u00020\u0001J:\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n0\u00198\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR(\u0010 \u001a\b\u0018\u00010\u0000R\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b&\u0010\u0011\"\u0004\b'\u0010(R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b)\u0010\u0011\"\u0004\b*\u0010(R\"\u0010+\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u000f\u001a\u0004\b,\u0010\u0011\"\u0004\b-\u0010(R\"\u0010.\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u000f\u001a\u0004\b/\u0010\u0011\"\u0004\b0\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00061"}, m3636d2 = {"Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "", "", "topLeft", "bottomRight", "Landroidx/compose/ui/unit/IntOffset;", "windowOffset", "screenOffset", "Landroidx/compose/ui/graphics/Matrix;", "viewToWindowMatrix", "", "fire-9b-9wPM", "(JJJJ[F)V", "fire", "throttleMillis", "J", "getThrottleMillis", "()J", "debounceMillis", "getDebounceMillis", "Landroidx/compose/ui/node/DelegatableNode;", "node", "Landroidx/compose/ui/node/DelegatableNode;", "getNode", "()Landroidx/compose/ui/node/DelegatableNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "callback", "Lkotlin/jvm/functions/Function1;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/spatial/ThrottledCallbacks;", "next", "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "getNext", "()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "setNext", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V", "getTopLeft", "setTopLeft", "(J)V", "getBottomRight", "setBottomRight", "lastInvokeMillis", "getLastInvokeMillis", "setLastInvokeMillis", "lastUninvokedFireMillis", "getLastUninvokedFireMillis", "setLastUninvokedFireMillis", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public final class Entry {
        private long bottomRight;
        private final Function1<RelativeLayoutBounds, Unit> callback;
        private final long debounceMillis;
        private long lastInvokeMillis;
        private long lastUninvokedFireMillis;
        private Entry next;
        private final DelegatableNode node;
        private final long throttleMillis;
        private long topLeft;

        public final long getThrottleMillis() {
            return this.throttleMillis;
        }

        public final long getDebounceMillis() {
            return this.debounceMillis;
        }

        public final DelegatableNode getNode() {
            return this.node;
        }

        public final Entry getNext() {
            return this.next;
        }

        public final long getTopLeft() {
            return this.topLeft;
        }

        public final void setTopLeft(long j) {
            this.topLeft = j;
        }

        public final long getBottomRight() {
            return this.bottomRight;
        }

        public final void setBottomRight(long j) {
            this.bottomRight = j;
        }

        public final long getLastInvokeMillis() {
            return this.lastInvokeMillis;
        }

        public final void setLastInvokeMillis(long j) {
            this.lastInvokeMillis = j;
        }

        public final long getLastUninvokedFireMillis() {
            return this.lastUninvokedFireMillis;
        }

        public final void setLastUninvokedFireMillis(long j) {
            this.lastUninvokedFireMillis = j;
        }

        /* renamed from: fire-9b-9wPM, reason: not valid java name */
        public final void m7510fire9b9wPM(long topLeft, long bottomRight, long windowOffset, long screenOffset, float[] viewToWindowMatrix) {
            RelativeLayoutBounds relativeLayoutBoundsM7511rectInfoForQMZNJw = ThrottledCallbacks2.m7511rectInfoForQMZNJw(this.node, topLeft, bottomRight, windowOffset, screenOffset, viewToWindowMatrix);
            if (relativeLayoutBoundsM7511rectInfoForQMZNJw == null) {
                return;
            }
            this.callback.invoke(relativeLayoutBoundsM7511rectInfoForQMZNJw);
        }
    }

    public final long getMinDebounceDeadline() {
        return this.minDebounceDeadline;
    }

    /* renamed from: updateOffsets-bT0EZQs, reason: not valid java name */
    public final boolean m7509updateOffsetsbT0EZQs(long screen, long window, float[] matrix) {
        boolean z;
        if (IntOffset.m8037equalsimpl0(window, this.windowOffset)) {
            z = false;
        } else {
            this.windowOffset = window;
            z = true;
        }
        if (!IntOffset.m8037equalsimpl0(screen, this.screenOffset)) {
            this.screenOffset = screen;
            z = true;
        }
        if (matrix == null) {
            return z;
        }
        this.viewToWindowMatrix = matrix;
        return true;
    }

    public final void fireOnUpdatedRect(int id, long topLeft, long bottomRight, long currentMillis) {
        for (Entry next = this.rectChangedMap.get(id); next != null; next = next.getNext()) {
            fireWithUpdatedRect(next, topLeft, bottomRight, currentMillis);
        }
    }

    public final void fireOnRectChangedEntries(long currentMillis) {
        ThrottledCallbacks throttledCallbacks = this;
        long j = throttledCallbacks.windowOffset;
        long j2 = throttledCallbacks.screenOffset;
        float[] fArr = throttledCallbacks.viewToWindowMatrix;
        IntObjectMap3<Entry> intObjectMap3 = throttledCallbacks.rectChangedMap;
        Object[] objArr = intObjectMap3.values;
        long[] jArr = intObjectMap3.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j3 = jArr[i];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                long j4 = j3;
                int i3 = 0;
                while (i3 < i2) {
                    if ((j4 & 255) < 128) {
                        Entry next = (Entry) objArr[(i << 3) + i3];
                        while (next != null) {
                            int i4 = i3;
                            Entry entry = next;
                            throttledCallbacks.m7508fireWY9HvpM(entry, j, j2, fArr, currentMillis);
                            next = entry.getNext();
                            throttledCallbacks = this;
                            i3 = i4;
                        }
                    }
                    j4 >>= 8;
                    i3++;
                    throttledCallbacks = this;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            }
            i++;
            throttledCallbacks = this;
        }
    }

    public final void fireGlobalChangeEntries(long currentMillis) {
        long j = this.windowOffset;
        long j2 = this.screenOffset;
        float[] fArr = this.viewToWindowMatrix;
        Entry entry = this.globalChangeEntries;
        if (entry != null) {
            for (Entry next = entry; next != null; next = next.getNext()) {
                LayoutNode layoutNodeRequireLayoutNode = DelegatableNode2.requireLayoutNode(next.getNode());
                long offsetFromRoot = layoutNodeRequireLayoutNode.getOffsetFromRoot();
                long lastSize = layoutNodeRequireLayoutNode.getLastSize();
                next.setTopLeft(offsetFromRoot);
                next.setBottomRight(((IntOffset.m8038getXimpl(offsetFromRoot) + ((int) (lastSize >> 32))) << 32) | ((IntOffset.m8039getYimpl(offsetFromRoot) + ((int) (lastSize & 4294967295L))) & 4294967295L));
                m7508fireWY9HvpM(next, j, j2, fArr, currentMillis);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008c A[LOOP:0: B:8:0x0023->B:25:0x008c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096 A[EDGE_INSN: B:39:0x0096->B:27:0x0096 BREAK  A[LOOP:0: B:8:0x0023->B:25:0x008c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void triggerDebounced(long currentMillis) {
        long j;
        long jM7507debounceEntryb8qMvQI;
        int i;
        if (this.minDebounceDeadline > currentMillis) {
            return;
        }
        long j2 = this.windowOffset;
        long j3 = this.screenOffset;
        float[] fArr = this.viewToWindowMatrix;
        IntObjectMap3<Entry> intObjectMap3 = this.rectChangedMap;
        Object[] objArr = intObjectMap3.values;
        long[] jArr = intObjectMap3.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            jM7507debounceEntryb8qMvQI = Long.MAX_VALUE;
            while (true) {
                long j4 = jArr[i2];
                j = Long.MAX_VALUE;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    long j5 = j4;
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j5 & 255) < 128) {
                            Entry next = (Entry) objArr[(i2 << 3) + i4];
                            while (next != null) {
                                int i5 = i2;
                                Entry entry = next;
                                jM7507debounceEntryb8qMvQI = m7507debounceEntryb8qMvQI(entry, j2, j3, fArr, currentMillis, jM7507debounceEntryb8qMvQI);
                                i4 = i4;
                                next = entry.getNext();
                                i2 = i5;
                            }
                            i = i4;
                        } else {
                            i = i4;
                        }
                        j5 >>= 8;
                        i4 = i + 1;
                        i2 = i2;
                    }
                    int i6 = i2;
                    if (i3 != 8) {
                        break;
                    }
                    i2 = i6;
                    if (i2 != length) {
                        break;
                    } else {
                        i2++;
                    }
                } else if (i2 != length) {
                }
            }
        } else {
            j = Long.MAX_VALUE;
            jM7507debounceEntryb8qMvQI = Long.MAX_VALUE;
        }
        Entry next2 = this.globalChangeEntries;
        if (next2 != null) {
            long jM7507debounceEntryb8qMvQI2 = jM7507debounceEntryb8qMvQI;
            while (next2 != null) {
                jM7507debounceEntryb8qMvQI2 = m7507debounceEntryb8qMvQI(next2, j2, j3, fArr, currentMillis, jM7507debounceEntryb8qMvQI2);
                next2 = next2.getNext();
            }
            jM7507debounceEntryb8qMvQI = jM7507debounceEntryb8qMvQI2;
        }
        if (jM7507debounceEntryb8qMvQI == j) {
            jM7507debounceEntryb8qMvQI = -1;
        }
        this.minDebounceDeadline = jM7507debounceEntryb8qMvQI;
    }

    private final void fireWithUpdatedRect(Entry entry, long topLeft, long bottomRight, long currentMillis) {
        long lastInvokeMillis = entry.getLastInvokeMillis();
        long throttleMillis = entry.getThrottleMillis();
        long debounceMillis = entry.getDebounceMillis();
        boolean z = currentMillis - lastInvokeMillis >= throttleMillis;
        boolean z2 = debounceMillis == 0;
        boolean z3 = throttleMillis == 0;
        entry.setTopLeft(topLeft);
        entry.setBottomRight(bottomRight);
        boolean z4 = !(z2 || z3) || z2;
        if (z && z4) {
            entry.setLastUninvokedFireMillis(-1L);
            entry.setLastInvokeMillis(currentMillis);
            entry.m7510fire9b9wPM(topLeft, bottomRight, this.windowOffset, this.screenOffset, this.viewToWindowMatrix);
        } else {
            if (z2) {
                return;
            }
            entry.setLastUninvokedFireMillis(currentMillis);
            long j = this.minDebounceDeadline;
            long j2 = currentMillis + debounceMillis;
            if (j <= 0 || j2 >= j) {
                return;
            }
            this.minDebounceDeadline = j;
        }
    }

    /* renamed from: fire-WY9HvpM, reason: not valid java name */
    private final void m7508fireWY9HvpM(Entry entry, long windowOffset, long screenOffset, float[] viewToWindowMatrix, long currentMillis) {
        boolean z = currentMillis - entry.getLastInvokeMillis() > entry.getThrottleMillis();
        boolean z2 = entry.getDebounceMillis() == 0;
        entry.setLastUninvokedFireMillis(currentMillis);
        if (z && z2) {
            entry.setLastInvokeMillis(currentMillis);
            entry.m7510fire9b9wPM(entry.getTopLeft(), entry.getBottomRight(), windowOffset, screenOffset, viewToWindowMatrix);
        }
        if (z2) {
            return;
        }
        long j = this.minDebounceDeadline;
        long debounceMillis = entry.getDebounceMillis() + currentMillis;
        if (j <= 0 || debounceMillis >= j) {
            return;
        }
        this.minDebounceDeadline = j;
    }

    /* renamed from: debounceEntry-b8qMvQI, reason: not valid java name */
    private final long m7507debounceEntryb8qMvQI(Entry entry, long windowOffset, long screenOffset, float[] viewToWindowMatrix, long currentMillis, long minDeadline) {
        if (entry.getDebounceMillis() <= 0 || entry.getLastUninvokedFireMillis() <= 0) {
            return minDeadline;
        }
        if (currentMillis - entry.getLastUninvokedFireMillis() > entry.getDebounceMillis()) {
            entry.setLastInvokeMillis(currentMillis);
            entry.setLastUninvokedFireMillis(-1L);
            entry.m7510fire9b9wPM(entry.getTopLeft(), entry.getBottomRight(), windowOffset, screenOffset, viewToWindowMatrix);
            return minDeadline;
        }
        return Math.min(minDeadline, entry.getLastUninvokedFireMillis() + entry.getDebounceMillis());
    }
}

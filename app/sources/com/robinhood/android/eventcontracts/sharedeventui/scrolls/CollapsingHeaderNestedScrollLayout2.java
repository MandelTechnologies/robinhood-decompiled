package com.robinhood.android.eventcontracts.sharedeventui.scrolls;

import androidx.compose.runtime.SnapshotFloatState2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollapsingHeaderNestedScrollLayout.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/scrolls/CollapsingHeaderNestedScrollState;", "", "maxHeaderHeightState", "Landroidx/compose/runtime/MutableFloatState;", "connection", "Lcom/robinhood/android/eventcontracts/sharedeventui/scrolls/CollapsingHeaderNestedScrollConnection;", "<init>", "(Landroidx/compose/runtime/MutableFloatState;Lcom/robinhood/android/eventcontracts/sharedeventui/scrolls/CollapsingHeaderNestedScrollConnection;)V", "getMaxHeaderHeightState$lib_shared_event_ui_externalDebug", "()Landroidx/compose/runtime/MutableFloatState;", "getConnection$lib_shared_event_ui_externalDebug", "()Lcom/robinhood/android/eventcontracts/sharedeventui/scrolls/CollapsingHeaderNestedScrollConnection;", "headerAlpha", "", "getHeaderAlpha", "()F", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.scrolls.CollapsingHeaderNestedScrollState, reason: use source file name */
/* loaded from: classes3.dex */
public final class CollapsingHeaderNestedScrollLayout2 {
    public static final int $stable = 0;
    private final CollapsingHeaderNestedScrollConnection connection;
    private final SnapshotFloatState2 maxHeaderHeightState;

    public CollapsingHeaderNestedScrollLayout2(SnapshotFloatState2 maxHeaderHeightState, CollapsingHeaderNestedScrollConnection connection) {
        Intrinsics.checkNotNullParameter(maxHeaderHeightState, "maxHeaderHeightState");
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.maxHeaderHeightState = maxHeaderHeightState;
        this.connection = connection;
    }

    /* renamed from: getMaxHeaderHeightState$lib_shared_event_ui_externalDebug, reason: from getter */
    public final SnapshotFloatState2 getMaxHeaderHeightState() {
        return this.maxHeaderHeightState;
    }

    /* renamed from: getConnection$lib_shared_event_ui_externalDebug, reason: from getter */
    public final CollapsingHeaderNestedScrollConnection getConnection() {
        return this.connection;
    }

    public final float getHeaderAlpha() {
        return this.connection.getHeaderAlpha();
    }
}

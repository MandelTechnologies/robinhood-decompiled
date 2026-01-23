package com.robinhood.compose.common;

import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.saveable.ListSaver;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.Saver5;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: DotProgressIndicators.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001b\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR+\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\rR$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00038G@@X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\r¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/compose/common/DotProgressIndicatorState;", "", "activeCount", "", "totalCount", "<init>", "(II)V", "getTotalCount", "()I", "<set-?>", "_activeCount", "get_activeCount", "set_activeCount", "(I)V", "_activeCount$delegate", "Landroidx/compose/runtime/MutableIntState;", "value", "getActiveCount", "setActiveCount$lib_compose_common_externalDebug", "Companion", "lib-compose-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.common.DotProgressIndicatorState, reason: use source file name */
/* loaded from: classes15.dex */
public final class DotProgressIndicators {
    public static final int $stable = 0;
    public static final long MAX_COUNT = 10;

    /* renamed from: _activeCount$delegate, reason: from kotlin metadata */
    private final SnapshotIntState2 _activeCount;
    private final int totalCount;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Saver<DotProgressIndicators, Object> Saver = ListSaver.listSaver(new Function2() { // from class: com.robinhood.compose.common.DotProgressIndicatorState$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return DotProgressIndicators.Saver$lambda$0((Saver5) obj, (DotProgressIndicators) obj2);
        }
    }, new Function1() { // from class: com.robinhood.compose.common.DotProgressIndicatorState$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return DotProgressIndicators.Saver$lambda$1((List) obj);
        }
    });

    /* JADX WARN: Illegal instructions before constructor call */
    public DotProgressIndicators() {
        int i = 0;
        this(i, i, 3, null);
    }

    public DotProgressIndicators(int i, int i2) {
        this.totalCount = i2;
        this._activeCount = SnapshotIntState3.mutableIntStateOf(i);
    }

    public /* synthetic */ DotProgressIndicators(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 1 : i2);
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    private final int get_activeCount() {
        return this._activeCount.getIntValue();
    }

    private final void set_activeCount(int i) {
        this._activeCount.setIntValue(i);
    }

    public final int getActiveCount() {
        return get_activeCount();
    }

    public final void setActiveCount$lib_compose_common_externalDebug(int i) {
        int iCoerceIn = RangesKt.coerceIn(i, 0, this.totalCount);
        if (iCoerceIn != get_activeCount()) {
            set_activeCount(iCoerceIn);
        }
    }

    /* compiled from: DotProgressIndicators.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/compose/common/DotProgressIndicatorState$Companion;", "", "<init>", "()V", "MAX_COUNT", "", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Lcom/robinhood/compose/common/DotProgressIndicatorState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "lib-compose-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.common.DotProgressIndicatorState$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<DotProgressIndicators, Object> getSaver() {
            return DotProgressIndicators.Saver;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List Saver$lambda$0(Saver5 listSaver, DotProgressIndicators it) {
        Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
        Intrinsics.checkNotNullParameter(it, "it");
        return CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(it.get_activeCount()), Integer.valueOf(it.totalCount)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DotProgressIndicators Saver$lambda$1(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object obj = it.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj).intValue();
        Object obj2 = it.get(1);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        return new DotProgressIndicators(iIntValue, ((Integer) obj2).intValue());
    }
}

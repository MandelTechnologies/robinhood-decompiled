package com.robinhood.android.common.history.p082ui;

import androidx.recyclerview.widget.DiffUtil;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HistoryEventDiffCallbacks.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"!\u0010\u0003\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"eventCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "diffCallback", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent$Companion;", "getDiffCallback", "(Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent$Companion;)Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "lib-history-row_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.history.ui.HistoryEventDiffCallbacksKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class HistoryEventDiffCallbacks {
    private static final DiffUtil.ItemCallback<StatefulHistoryEvent<?>> eventCallback = DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.common.history.ui.HistoryEventDiffCallbacksKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return HistoryEventDiffCallbacks.eventCallback$lambda$0((StatefulHistoryEvent) obj);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object eventCallback$lambda$0(StatefulHistoryEvent byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return byEquality.getHistoryEvent().getSortKey();
    }

    public static final DiffUtil.ItemCallback<? super StatefulHistoryEvent<?>> getDiffCallback(StatefulHistoryEvent.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return eventCallback;
    }
}

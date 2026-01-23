package com.salesforce.android.smi.core.internal;

import com.salesforce.android.smi.common.internal.util.SingletonHolder;
import com.salesforce.android.smi.core.events.CoreEvent;
import com.salesforce.android.smi.core.internal.CoreEventFlow;
import com.salesforce.android.smi.core.internal.util.AbstractEventFlow;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CoreEventFlow.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m3636d2 = {"Lcom/salesforce/android/smi/core/internal/CoreEventFlow;", "Lcom/salesforce/android/smi/core/internal/util/AbstractEventFlow;", "Lcom/salesforce/android/smi/core/events/CoreEvent;", "<init>", "()V", "Companion", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CoreEventFlow extends AbstractEventFlow<CoreEvent> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ CoreEventFlow(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: CoreEventFlow.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/salesforce/android/smi/core/internal/CoreEventFlow$Companion;", "Lcom/salesforce/android/smi/common/internal/util/SingletonHolder;", "Lcom/salesforce/android/smi/core/internal/CoreEventFlow;", "", "<init>", "()V", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion extends SingletonHolder<CoreEventFlow, Unit> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(new Function1() { // from class: com.salesforce.android.smi.core.internal.CoreEventFlow$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CoreEventFlow.Companion._init_$lambda$0((Unit) obj);
                }
            }, null, null, 6, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CoreEventFlow _init_$lambda$0(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new CoreEventFlow(null);
        }
    }

    private CoreEventFlow() {
        super(0, null, 3, null);
    }
}

package com.squareup.workflow1.p415ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Compatible.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/squareup/workflow1/ui/Compatible;", "", "compatibilityKey", "", "getCompatibilityKey", "()Ljava/lang/String;", "Companion", "wf1-core-common"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface Compatible {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    String getCompatibilityKey();

    /* compiled from: Compatible.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¨\u0006\u0007"}, m3636d2 = {"Lcom/squareup/workflow1/ui/Compatible$Companion;", "", "()V", "keyFor", "", "value", "name", "wf1-core-common"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ String keyFor$default(Companion companion, Object obj, String str, int i, Object obj2) {
            if ((i & 2) != 0) {
                str = "";
            }
            return companion.keyFor(obj, str);
        }

        public final String keyFor(Object value, String name) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(name, "name");
            Compatible compatible = value instanceof Compatible ? (Compatible) value : null;
            String compatibilityKey = compatible != null ? compatible.getCompatibilityKey() : null;
            if (compatibilityKey == null) {
                compatibilityKey = value.getClass().getName();
            }
            return Intrinsics.stringPlus(compatibilityKey, name.length() == 0 ? "" : Intrinsics.stringPlus("+", name));
        }
    }
}

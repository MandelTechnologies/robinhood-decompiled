package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* compiled from: VersionRequirement.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable, reason: use source file name */
/* loaded from: classes21.dex */
public final class VersionRequirement2 {
    public static final Companion Companion = new Companion(null);
    private static final VersionRequirement2 EMPTY = new VersionRequirement2(CollectionsKt.emptyList());
    private final List<ProtoBuf.VersionRequirement> infos;

    public /* synthetic */ VersionRequirement2(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    private VersionRequirement2(List<ProtoBuf.VersionRequirement> list) {
        this.infos = list;
    }

    /* compiled from: VersionRequirement.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable$Companion */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final VersionRequirement2 getEMPTY() {
            return VersionRequirement2.EMPTY;
        }

        public final VersionRequirement2 create(ProtoBuf.VersionRequirementTable table) {
            Intrinsics.checkNotNullParameter(table, "table");
            if (table.getRequirementCount() == 0) {
                return getEMPTY();
            }
            List<ProtoBuf.VersionRequirement> requirementList = table.getRequirementList();
            Intrinsics.checkNotNullExpressionValue(requirementList, "getRequirementList(...)");
            return new VersionRequirement2(requirementList, null);
        }
    }
}

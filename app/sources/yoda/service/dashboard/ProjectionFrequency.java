package yoda.service.dashboard;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProjectionFrequency.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lyoda/service/dashboard/ProjectionFrequency;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PROJECTION_FREQUENCY_UNSPECIFIED", "PROJECTION_FREQUENCY_MONTHLY", "Companion", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class ProjectionFrequency implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProjectionFrequency[] $VALUES;

    @JvmField
    public static final ProtoAdapter<ProjectionFrequency> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ProjectionFrequency PROJECTION_FREQUENCY_MONTHLY;
    public static final ProjectionFrequency PROJECTION_FREQUENCY_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ ProjectionFrequency[] $values() {
        return new ProjectionFrequency[]{PROJECTION_FREQUENCY_UNSPECIFIED, PROJECTION_FREQUENCY_MONTHLY};
    }

    @JvmStatic
    public static final ProjectionFrequency fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<ProjectionFrequency> getEntries() {
        return $ENTRIES;
    }

    private ProjectionFrequency(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final ProjectionFrequency projectionFrequency = new ProjectionFrequency("PROJECTION_FREQUENCY_UNSPECIFIED", 0, 0);
        PROJECTION_FREQUENCY_UNSPECIFIED = projectionFrequency;
        PROJECTION_FREQUENCY_MONTHLY = new ProjectionFrequency("PROJECTION_FREQUENCY_MONTHLY", 1, 1);
        ProjectionFrequency[] projectionFrequencyArr$values = $values();
        $VALUES = projectionFrequencyArr$values;
        $ENTRIES = EnumEntries2.enumEntries(projectionFrequencyArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ProjectionFrequency.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<ProjectionFrequency>(orCreateKotlinClass, syntax, projectionFrequency) { // from class: yoda.service.dashboard.ProjectionFrequency$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public ProjectionFrequency fromValue(int value) {
                return ProjectionFrequency.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: ProjectionFrequency.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lyoda/service/dashboard/ProjectionFrequency$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lyoda/service/dashboard/ProjectionFrequency;", "fromValue", "value", "", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ProjectionFrequency fromValue(int value) {
            if (value == 0) {
                return ProjectionFrequency.PROJECTION_FREQUENCY_UNSPECIFIED;
            }
            if (value != 1) {
                return null;
            }
            return ProjectionFrequency.PROJECTION_FREQUENCY_MONTHLY;
        }
    }

    public static ProjectionFrequency valueOf(String str) {
        return (ProjectionFrequency) Enum.valueOf(ProjectionFrequency.class, str);
    }

    public static ProjectionFrequency[] values() {
        return (ProjectionFrequency[]) $VALUES.clone();
    }
}

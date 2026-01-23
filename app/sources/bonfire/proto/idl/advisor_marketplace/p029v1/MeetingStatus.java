package bonfire.proto.idl.advisor_marketplace.p029v1;

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
/* compiled from: MeetingStatus.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/MeetingStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "MEETING_STATUS_UNSPECIFIED", "MEETING_STATUS_CONFIRMED", "MEETING_STATUS_RESCHEDULED_BY_ADVISOR", "MEETING_STATUS_RESCHEDULED_BY_USER", "MEETING_STATUS_CANCELLED", "MEETING_STATUS_COMPLETED", "Companion", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class MeetingStatus implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MeetingStatus[] $VALUES;

    @JvmField
    public static final ProtoAdapter<MeetingStatus> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final MeetingStatus MEETING_STATUS_CANCELLED;
    public static final MeetingStatus MEETING_STATUS_COMPLETED;
    public static final MeetingStatus MEETING_STATUS_CONFIRMED;
    public static final MeetingStatus MEETING_STATUS_RESCHEDULED_BY_ADVISOR;
    public static final MeetingStatus MEETING_STATUS_RESCHEDULED_BY_USER;
    public static final MeetingStatus MEETING_STATUS_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ MeetingStatus[] $values() {
        return new MeetingStatus[]{MEETING_STATUS_UNSPECIFIED, MEETING_STATUS_CONFIRMED, MEETING_STATUS_RESCHEDULED_BY_ADVISOR, MEETING_STATUS_RESCHEDULED_BY_USER, MEETING_STATUS_CANCELLED, MEETING_STATUS_COMPLETED};
    }

    @JvmStatic
    public static final MeetingStatus fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<MeetingStatus> getEntries() {
        return $ENTRIES;
    }

    private MeetingStatus(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final MeetingStatus meetingStatus = new MeetingStatus("MEETING_STATUS_UNSPECIFIED", 0, 0);
        MEETING_STATUS_UNSPECIFIED = meetingStatus;
        MEETING_STATUS_CONFIRMED = new MeetingStatus("MEETING_STATUS_CONFIRMED", 1, 1);
        MEETING_STATUS_RESCHEDULED_BY_ADVISOR = new MeetingStatus("MEETING_STATUS_RESCHEDULED_BY_ADVISOR", 2, 2);
        MEETING_STATUS_RESCHEDULED_BY_USER = new MeetingStatus("MEETING_STATUS_RESCHEDULED_BY_USER", 3, 3);
        MEETING_STATUS_CANCELLED = new MeetingStatus("MEETING_STATUS_CANCELLED", 4, 4);
        MEETING_STATUS_COMPLETED = new MeetingStatus("MEETING_STATUS_COMPLETED", 5, 5);
        MeetingStatus[] meetingStatusArr$values = $values();
        $VALUES = meetingStatusArr$values;
        $ENTRIES = EnumEntries2.enumEntries(meetingStatusArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MeetingStatus.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<MeetingStatus>(orCreateKotlinClass, syntax, meetingStatus) { // from class: bonfire.proto.idl.advisor_marketplace.v1.MeetingStatus$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public MeetingStatus fromValue(int value) {
                return MeetingStatus.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: MeetingStatus.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/MeetingStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbonfire/proto/idl/advisor_marketplace/v1/MeetingStatus;", "fromValue", "value", "", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MeetingStatus fromValue(int value) {
            if (value == 0) {
                return MeetingStatus.MEETING_STATUS_UNSPECIFIED;
            }
            if (value == 1) {
                return MeetingStatus.MEETING_STATUS_CONFIRMED;
            }
            if (value == 2) {
                return MeetingStatus.MEETING_STATUS_RESCHEDULED_BY_ADVISOR;
            }
            if (value == 3) {
                return MeetingStatus.MEETING_STATUS_RESCHEDULED_BY_USER;
            }
            if (value == 4) {
                return MeetingStatus.MEETING_STATUS_CANCELLED;
            }
            if (value != 5) {
                return null;
            }
            return MeetingStatus.MEETING_STATUS_COMPLETED;
        }
    }

    public static MeetingStatus valueOf(String str) {
        return (MeetingStatus) Enum.valueOf(MeetingStatus.class, str);
    }

    public static MeetingStatus[] values() {
        return (MeetingStatus[]) $VALUES.clone();
    }
}

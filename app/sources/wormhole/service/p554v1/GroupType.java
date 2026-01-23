package wormhole.service.p554v1;

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
/* compiled from: GroupType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lwormhole/service/v1/GroupType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "GROUP_TYPE_UNSPECIFIED", "GROUP_TYPE_SYMBOL", "Companion", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class GroupType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GroupType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<GroupType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final GroupType GROUP_TYPE_SYMBOL;
    public static final GroupType GROUP_TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ GroupType[] $values() {
        return new GroupType[]{GROUP_TYPE_UNSPECIFIED, GROUP_TYPE_SYMBOL};
    }

    @JvmStatic
    public static final GroupType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<GroupType> getEntries() {
        return $ENTRIES;
    }

    private GroupType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final GroupType groupType = new GroupType("GROUP_TYPE_UNSPECIFIED", 0, 0);
        GROUP_TYPE_UNSPECIFIED = groupType;
        GROUP_TYPE_SYMBOL = new GroupType("GROUP_TYPE_SYMBOL", 1, 1);
        GroupType[] groupTypeArr$values = $values();
        $VALUES = groupTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(groupTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GroupType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<GroupType>(orCreateKotlinClass, syntax, groupType) { // from class: wormhole.service.v1.GroupType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public GroupType fromValue(int value) {
                return GroupType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: GroupType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lwormhole/service/v1/GroupType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lwormhole/service/v1/GroupType;", "fromValue", "value", "", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final GroupType fromValue(int value) {
            if (value == 0) {
                return GroupType.GROUP_TYPE_UNSPECIFIED;
            }
            if (value != 1) {
                return null;
            }
            return GroupType.GROUP_TYPE_SYMBOL;
        }
    }

    public static GroupType valueOf(String str) {
        return (GroupType) Enum.valueOf(GroupType.class, str);
    }

    public static GroupType[] values() {
        return (GroupType[]) $VALUES.clone();
    }
}

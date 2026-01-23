package rosetta.mainst;

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
/* compiled from: ModificationRequestState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lrosetta/mainst/ModificationRequestState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "MODIFICATION_REQUEST_STATE_UNSPECIFIED", "MODIFICATION_REQUEST_STATE_UNPROCESSED", "MODIFICATION_REQUEST_STATE_PENDING_UPDATE", "MODIFICATION_REQUEST_STATE_PROCESSED", "MODIFICATION_REQUEST_STATE_REJECTED", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class ModificationRequestState implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ModificationRequestState[] $VALUES;

    @JvmField
    public static final ProtoAdapter<ModificationRequestState> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ModificationRequestState MODIFICATION_REQUEST_STATE_PENDING_UPDATE;
    public static final ModificationRequestState MODIFICATION_REQUEST_STATE_PROCESSED;
    public static final ModificationRequestState MODIFICATION_REQUEST_STATE_REJECTED;
    public static final ModificationRequestState MODIFICATION_REQUEST_STATE_UNPROCESSED;
    public static final ModificationRequestState MODIFICATION_REQUEST_STATE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ ModificationRequestState[] $values() {
        return new ModificationRequestState[]{MODIFICATION_REQUEST_STATE_UNSPECIFIED, MODIFICATION_REQUEST_STATE_UNPROCESSED, MODIFICATION_REQUEST_STATE_PENDING_UPDATE, MODIFICATION_REQUEST_STATE_PROCESSED, MODIFICATION_REQUEST_STATE_REJECTED};
    }

    @JvmStatic
    public static final ModificationRequestState fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<ModificationRequestState> getEntries() {
        return $ENTRIES;
    }

    private ModificationRequestState(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final ModificationRequestState modificationRequestState = new ModificationRequestState("MODIFICATION_REQUEST_STATE_UNSPECIFIED", 0, 0);
        MODIFICATION_REQUEST_STATE_UNSPECIFIED = modificationRequestState;
        MODIFICATION_REQUEST_STATE_UNPROCESSED = new ModificationRequestState("MODIFICATION_REQUEST_STATE_UNPROCESSED", 1, 1);
        MODIFICATION_REQUEST_STATE_PENDING_UPDATE = new ModificationRequestState("MODIFICATION_REQUEST_STATE_PENDING_UPDATE", 2, 2);
        MODIFICATION_REQUEST_STATE_PROCESSED = new ModificationRequestState("MODIFICATION_REQUEST_STATE_PROCESSED", 3, 3);
        MODIFICATION_REQUEST_STATE_REJECTED = new ModificationRequestState("MODIFICATION_REQUEST_STATE_REJECTED", 4, 4);
        ModificationRequestState[] modificationRequestStateArr$values = $values();
        $VALUES = modificationRequestStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(modificationRequestStateArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ModificationRequestState.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<ModificationRequestState>(orCreateKotlinClass, syntax, modificationRequestState) { // from class: rosetta.mainst.ModificationRequestState$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public ModificationRequestState fromValue(int value) {
                return ModificationRequestState.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: ModificationRequestState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/mainst/ModificationRequestState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/mainst/ModificationRequestState;", "fromValue", "value", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ModificationRequestState fromValue(int value) {
            if (value == 0) {
                return ModificationRequestState.MODIFICATION_REQUEST_STATE_UNSPECIFIED;
            }
            if (value == 1) {
                return ModificationRequestState.MODIFICATION_REQUEST_STATE_UNPROCESSED;
            }
            if (value == 2) {
                return ModificationRequestState.MODIFICATION_REQUEST_STATE_PENDING_UPDATE;
            }
            if (value == 3) {
                return ModificationRequestState.MODIFICATION_REQUEST_STATE_PROCESSED;
            }
            if (value != 4) {
                return null;
            }
            return ModificationRequestState.MODIFICATION_REQUEST_STATE_REJECTED;
        }
    }

    public static ModificationRequestState valueOf(String str) {
        return (ModificationRequestState) Enum.valueOf(ModificationRequestState.class, str);
    }

    public static ModificationRequestState[] values() {
        return (ModificationRequestState[]) $VALUES.clone();
    }
}

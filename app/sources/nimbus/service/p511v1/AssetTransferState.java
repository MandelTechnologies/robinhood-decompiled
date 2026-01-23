package nimbus.service.p511v1;

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
/* compiled from: AssetTransferState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lnimbus/service/v1/AssetTransferState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STATE_UNSPECIFIED", "INITIATED", "SOURCE_HOLDS_PLACED", "DESTINATION_ADJUSTMENTS_MADE", "SUCCEEDED", "FAILED", "Companion", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class AssetTransferState implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AssetTransferState[] $VALUES;

    @JvmField
    public static final ProtoAdapter<AssetTransferState> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final AssetTransferState DESTINATION_ADJUSTMENTS_MADE;
    public static final AssetTransferState FAILED;
    public static final AssetTransferState INITIATED;
    public static final AssetTransferState SOURCE_HOLDS_PLACED;
    public static final AssetTransferState STATE_UNSPECIFIED;
    public static final AssetTransferState SUCCEEDED;
    private final int value;

    private static final /* synthetic */ AssetTransferState[] $values() {
        return new AssetTransferState[]{STATE_UNSPECIFIED, INITIATED, SOURCE_HOLDS_PLACED, DESTINATION_ADJUSTMENTS_MADE, SUCCEEDED, FAILED};
    }

    @JvmStatic
    public static final AssetTransferState fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<AssetTransferState> getEntries() {
        return $ENTRIES;
    }

    private AssetTransferState(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final AssetTransferState assetTransferState = new AssetTransferState("STATE_UNSPECIFIED", 0, 0);
        STATE_UNSPECIFIED = assetTransferState;
        INITIATED = new AssetTransferState("INITIATED", 1, 1);
        SOURCE_HOLDS_PLACED = new AssetTransferState("SOURCE_HOLDS_PLACED", 2, 2);
        DESTINATION_ADJUSTMENTS_MADE = new AssetTransferState("DESTINATION_ADJUSTMENTS_MADE", 3, 3);
        SUCCEEDED = new AssetTransferState("SUCCEEDED", 4, 4);
        FAILED = new AssetTransferState("FAILED", 5, 5);
        AssetTransferState[] assetTransferStateArr$values = $values();
        $VALUES = assetTransferStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(assetTransferStateArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AssetTransferState.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<AssetTransferState>(orCreateKotlinClass, syntax, assetTransferState) { // from class: nimbus.service.v1.AssetTransferState$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public AssetTransferState fromValue(int value) {
                return AssetTransferState.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: AssetTransferState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lnimbus/service/v1/AssetTransferState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lnimbus/service/v1/AssetTransferState;", "fromValue", "value", "", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AssetTransferState fromValue(int value) {
            if (value == 0) {
                return AssetTransferState.STATE_UNSPECIFIED;
            }
            if (value == 1) {
                return AssetTransferState.INITIATED;
            }
            if (value == 2) {
                return AssetTransferState.SOURCE_HOLDS_PLACED;
            }
            if (value == 3) {
                return AssetTransferState.DESTINATION_ADJUSTMENTS_MADE;
            }
            if (value == 4) {
                return AssetTransferState.SUCCEEDED;
            }
            if (value != 5) {
                return null;
            }
            return AssetTransferState.FAILED;
        }
    }

    public static AssetTransferState valueOf(String str) {
        return (AssetTransferState) Enum.valueOf(AssetTransferState.class, str);
    }

    public static AssetTransferState[] values() {
        return (AssetTransferState[]) $VALUES.clone();
    }
}

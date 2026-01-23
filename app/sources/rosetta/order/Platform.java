package rosetta.order;

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
/* compiled from: Platform.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lrosetta/order/Platform;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ORDER_PLATFORM_UNSPECIFIED", "ORDER_PLATFORM_BLACK_WIDOW", "ORDER_PLATFORM_ANDROID", "ORDER_PLATFORM_IOS", "ORDER_PLATFORM_WEB", "Companion", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class Platform implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Platform[] $VALUES;

    @JvmField
    public static final ProtoAdapter<Platform> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Platform ORDER_PLATFORM_ANDROID;
    public static final Platform ORDER_PLATFORM_BLACK_WIDOW;
    public static final Platform ORDER_PLATFORM_IOS;
    public static final Platform ORDER_PLATFORM_UNSPECIFIED;
    public static final Platform ORDER_PLATFORM_WEB;
    private final int value;

    private static final /* synthetic */ Platform[] $values() {
        return new Platform[]{ORDER_PLATFORM_UNSPECIFIED, ORDER_PLATFORM_BLACK_WIDOW, ORDER_PLATFORM_ANDROID, ORDER_PLATFORM_IOS, ORDER_PLATFORM_WEB};
    }

    @JvmStatic
    public static final Platform fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<Platform> getEntries() {
        return $ENTRIES;
    }

    private Platform(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final Platform platform = new Platform("ORDER_PLATFORM_UNSPECIFIED", 0, 0);
        ORDER_PLATFORM_UNSPECIFIED = platform;
        ORDER_PLATFORM_BLACK_WIDOW = new Platform("ORDER_PLATFORM_BLACK_WIDOW", 1, 1);
        ORDER_PLATFORM_ANDROID = new Platform("ORDER_PLATFORM_ANDROID", 2, 2);
        ORDER_PLATFORM_IOS = new Platform("ORDER_PLATFORM_IOS", 3, 3);
        ORDER_PLATFORM_WEB = new Platform("ORDER_PLATFORM_WEB", 4, 4);
        Platform[] platformArr$values = $values();
        $VALUES = platformArr$values;
        $ENTRIES = EnumEntries2.enumEntries(platformArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Platform.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<Platform>(orCreateKotlinClass, syntax, platform) { // from class: rosetta.order.Platform$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public Platform fromValue(int value) {
                return Platform.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: Platform.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/order/Platform$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/order/Platform;", "fromValue", "value", "", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Platform fromValue(int value) {
            if (value == 0) {
                return Platform.ORDER_PLATFORM_UNSPECIFIED;
            }
            if (value == 1) {
                return Platform.ORDER_PLATFORM_BLACK_WIDOW;
            }
            if (value == 2) {
                return Platform.ORDER_PLATFORM_ANDROID;
            }
            if (value == 3) {
                return Platform.ORDER_PLATFORM_IOS;
            }
            if (value != 4) {
                return null;
            }
            return Platform.ORDER_PLATFORM_WEB;
        }
    }

    public static Platform valueOf(String str) {
        return (Platform) Enum.valueOf(Platform.class, str);
    }

    public static Platform[] values() {
        return (Platform[]) $VALUES.clone();
    }
}

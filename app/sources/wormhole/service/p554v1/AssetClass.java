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
/* compiled from: AssetClass.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lwormhole/service/v1/AssetClass;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ASSET_CLASS_UNSPECIFIED", "ASSET_CLASS_EQUITY", "ASSET_CLASS_OPTION", "ASSET_CLASS_CRYPTO", "Companion", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class AssetClass implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AssetClass[] $VALUES;

    @JvmField
    public static final ProtoAdapter<AssetClass> ADAPTER;
    public static final AssetClass ASSET_CLASS_CRYPTO;
    public static final AssetClass ASSET_CLASS_EQUITY;
    public static final AssetClass ASSET_CLASS_OPTION;
    public static final AssetClass ASSET_CLASS_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ AssetClass[] $values() {
        return new AssetClass[]{ASSET_CLASS_UNSPECIFIED, ASSET_CLASS_EQUITY, ASSET_CLASS_OPTION, ASSET_CLASS_CRYPTO};
    }

    @JvmStatic
    public static final AssetClass fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<AssetClass> getEntries() {
        return $ENTRIES;
    }

    private AssetClass(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final AssetClass assetClass = new AssetClass("ASSET_CLASS_UNSPECIFIED", 0, 0);
        ASSET_CLASS_UNSPECIFIED = assetClass;
        ASSET_CLASS_EQUITY = new AssetClass("ASSET_CLASS_EQUITY", 1, 1);
        ASSET_CLASS_OPTION = new AssetClass("ASSET_CLASS_OPTION", 2, 2);
        ASSET_CLASS_CRYPTO = new AssetClass("ASSET_CLASS_CRYPTO", 3, 3);
        AssetClass[] assetClassArr$values = $values();
        $VALUES = assetClassArr$values;
        $ENTRIES = EnumEntries2.enumEntries(assetClassArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AssetClass.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<AssetClass>(orCreateKotlinClass, syntax, assetClass) { // from class: wormhole.service.v1.AssetClass$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public AssetClass fromValue(int value) {
                return AssetClass.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: AssetClass.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lwormhole/service/v1/AssetClass$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lwormhole/service/v1/AssetClass;", "fromValue", "value", "", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AssetClass fromValue(int value) {
            if (value == 0) {
                return AssetClass.ASSET_CLASS_UNSPECIFIED;
            }
            if (value == 1) {
                return AssetClass.ASSET_CLASS_EQUITY;
            }
            if (value == 2) {
                return AssetClass.ASSET_CLASS_OPTION;
            }
            if (value != 3) {
                return null;
            }
            return AssetClass.ASSET_CLASS_CRYPTO;
        }
    }

    public static AssetClass valueOf(String str) {
        return (AssetClass) Enum.valueOf(AssetClass.class, str);
    }

    public static AssetClass[] values() {
        return (AssetClass[]) $VALUES.clone();
    }
}

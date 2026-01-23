package microgram.networking;

import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.Enums4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonTypes.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/networking/DataEncodingType;", "", "(Ljava/lang/String;I)V", "STRING", "BASE64_BYTES", "Companion", "microgram-networking"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* renamed from: microgram.networking.DataEncodingType, reason: use source file name */
/* loaded from: classes14.dex */
public final class CommonTypes3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CommonTypes3[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @SerialName("string")
    public static final CommonTypes3 STRING = new CommonTypes3("STRING", 0);

    @SerialName("base64_bytes")
    public static final CommonTypes3 BASE64_BYTES = new CommonTypes3("BASE64_BYTES", 1);

    private static final /* synthetic */ CommonTypes3[] $values() {
        return new CommonTypes3[]{STRING, BASE64_BYTES};
    }

    public static EnumEntries<CommonTypes3> getEntries() {
        return $ENTRIES;
    }

    public static CommonTypes3 valueOf(String str) {
        return (CommonTypes3) Enum.valueOf(CommonTypes3.class, str);
    }

    public static CommonTypes3[] values() {
        return (CommonTypes3[]) $VALUES.clone();
    }

    /* compiled from: CommonTypes.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/networking/DataEncodingType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/networking/DataEncodingType;", "microgram-networking"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: microgram.networking.DataEncodingType$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) CommonTypes3.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<CommonTypes3> serializer() {
            return get$cachedSerializer();
        }
    }

    private CommonTypes3(String str, int i) {
    }

    static {
        CommonTypes3[] commonTypes3Arr$values = $values();
        $VALUES = commonTypes3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(commonTypes3Arr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: microgram.networking.DataEncodingType.Companion.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return Enums4.createAnnotatedEnumSerializer("microgram.networking.DataEncodingType", CommonTypes3.values(), new String[]{"string", "base64_bytes"}, new Annotation[][]{null, null}, null);
            }
        });
    }
}

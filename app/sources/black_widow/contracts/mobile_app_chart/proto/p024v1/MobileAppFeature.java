package black_widow.contracts.mobile_app_chart.proto.p024v1;

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
/* compiled from: MobileAppFeature.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileAppFeature;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "MOBILE_APP_FEATURE_UNSPECIFIED", "MOBILE_APP_FEATURE_EQUITIES_TRADING", "MOBILE_APP_FEATURE_CRYPTO_TRADING", "MOBILE_APP_FEATURE_DRAW_TOOLS", "MOBILE_APP_FEATURE_SCROLLING_INTERVAL_PICKER", "MOBILE_APP_FEATURE_EQUITIES_SHORTING", "MOBILE_APP_FEATURE_LOADING_SKELETON", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class MobileAppFeature implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MobileAppFeature[] $VALUES;

    @JvmField
    public static final ProtoAdapter<MobileAppFeature> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final MobileAppFeature MOBILE_APP_FEATURE_CRYPTO_TRADING;
    public static final MobileAppFeature MOBILE_APP_FEATURE_DRAW_TOOLS;
    public static final MobileAppFeature MOBILE_APP_FEATURE_EQUITIES_SHORTING;
    public static final MobileAppFeature MOBILE_APP_FEATURE_EQUITIES_TRADING;
    public static final MobileAppFeature MOBILE_APP_FEATURE_LOADING_SKELETON;
    public static final MobileAppFeature MOBILE_APP_FEATURE_SCROLLING_INTERVAL_PICKER;
    public static final MobileAppFeature MOBILE_APP_FEATURE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ MobileAppFeature[] $values() {
        return new MobileAppFeature[]{MOBILE_APP_FEATURE_UNSPECIFIED, MOBILE_APP_FEATURE_EQUITIES_TRADING, MOBILE_APP_FEATURE_CRYPTO_TRADING, MOBILE_APP_FEATURE_DRAW_TOOLS, MOBILE_APP_FEATURE_SCROLLING_INTERVAL_PICKER, MOBILE_APP_FEATURE_EQUITIES_SHORTING, MOBILE_APP_FEATURE_LOADING_SKELETON};
    }

    @JvmStatic
    public static final MobileAppFeature fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<MobileAppFeature> getEntries() {
        return $ENTRIES;
    }

    private MobileAppFeature(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final MobileAppFeature mobileAppFeature = new MobileAppFeature("MOBILE_APP_FEATURE_UNSPECIFIED", 0, 0);
        MOBILE_APP_FEATURE_UNSPECIFIED = mobileAppFeature;
        MOBILE_APP_FEATURE_EQUITIES_TRADING = new MobileAppFeature("MOBILE_APP_FEATURE_EQUITIES_TRADING", 1, 1);
        MOBILE_APP_FEATURE_CRYPTO_TRADING = new MobileAppFeature("MOBILE_APP_FEATURE_CRYPTO_TRADING", 2, 2);
        MOBILE_APP_FEATURE_DRAW_TOOLS = new MobileAppFeature("MOBILE_APP_FEATURE_DRAW_TOOLS", 3, 3);
        MOBILE_APP_FEATURE_SCROLLING_INTERVAL_PICKER = new MobileAppFeature("MOBILE_APP_FEATURE_SCROLLING_INTERVAL_PICKER", 4, 4);
        MOBILE_APP_FEATURE_EQUITIES_SHORTING = new MobileAppFeature("MOBILE_APP_FEATURE_EQUITIES_SHORTING", 5, 5);
        MOBILE_APP_FEATURE_LOADING_SKELETON = new MobileAppFeature("MOBILE_APP_FEATURE_LOADING_SKELETON", 6, 6);
        MobileAppFeature[] mobileAppFeatureArr$values = $values();
        $VALUES = mobileAppFeatureArr$values;
        $ENTRIES = EnumEntries2.enumEntries(mobileAppFeatureArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MobileAppFeature.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<MobileAppFeature>(orCreateKotlinClass, syntax, mobileAppFeature) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.MobileAppFeature$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public MobileAppFeature fromValue(int value) {
                return MobileAppFeature.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: MobileAppFeature.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileAppFeature$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileAppFeature;", "fromValue", "value", "", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MobileAppFeature fromValue(int value) {
            switch (value) {
                case 0:
                    return MobileAppFeature.MOBILE_APP_FEATURE_UNSPECIFIED;
                case 1:
                    return MobileAppFeature.MOBILE_APP_FEATURE_EQUITIES_TRADING;
                case 2:
                    return MobileAppFeature.MOBILE_APP_FEATURE_CRYPTO_TRADING;
                case 3:
                    return MobileAppFeature.MOBILE_APP_FEATURE_DRAW_TOOLS;
                case 4:
                    return MobileAppFeature.MOBILE_APP_FEATURE_SCROLLING_INTERVAL_PICKER;
                case 5:
                    return MobileAppFeature.MOBILE_APP_FEATURE_EQUITIES_SHORTING;
                case 6:
                    return MobileAppFeature.MOBILE_APP_FEATURE_LOADING_SKELETON;
                default:
                    return null;
            }
        }
    }

    public static MobileAppFeature valueOf(String str) {
        return (MobileAppFeature) Enum.valueOf(MobileAppFeature.class, str);
    }

    public static MobileAppFeature[] values() {
        return (MobileAppFeature[]) $VALUES.clone();
    }
}

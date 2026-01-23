package black_widow_bff.model.p025v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Deprecated;
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
/* compiled from: AppChannel.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\u0081\u0002\u0018\u0000 \u001d2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001dB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001e"}, m3636d2 = {"Lblack_widow_bff/model/v1/AppChannel;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "APP_CHANNEL_UNSPECIFIED", "PRODUCTION", "BASELINE", "CANARY", "BETA", "ALPHA", "LOCAL", "APOLLO", "BROWSER_TESTS", "QA_PROD", "QA_DEV", "LOCAL_TEST", "ANDROID_APP_BETA", "ANDROID_APP_DEV", "ANDROID_APP_NIGHTLY", "ANDROID_APP_PROD", "IOS_APP_BETA", "IOS_APP_DEV", "IOS_APP_NIGHTLY", "IOS_APP_PROD", "Companion", "black_widow_bff.service.v1.model_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class AppChannel implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AppChannel[] $VALUES;

    @JvmField
    public static final ProtoAdapter<AppChannel> ADAPTER;
    public static final AppChannel ALPHA;
    public static final AppChannel ANDROID_APP_BETA;
    public static final AppChannel ANDROID_APP_DEV;
    public static final AppChannel ANDROID_APP_NIGHTLY;
    public static final AppChannel ANDROID_APP_PROD;
    public static final AppChannel APOLLO;
    public static final AppChannel APP_CHANNEL_UNSPECIFIED;
    public static final AppChannel BASELINE;
    public static final AppChannel BETA;

    @Deprecated
    public static final AppChannel BROWSER_TESTS;
    public static final AppChannel CANARY;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final AppChannel IOS_APP_BETA;
    public static final AppChannel IOS_APP_DEV;
    public static final AppChannel IOS_APP_NIGHTLY;
    public static final AppChannel IOS_APP_PROD;
    public static final AppChannel LOCAL;
    public static final AppChannel LOCAL_TEST;
    public static final AppChannel PRODUCTION;
    public static final AppChannel QA_DEV;
    public static final AppChannel QA_PROD;
    private final int value;

    private static final /* synthetic */ AppChannel[] $values() {
        return new AppChannel[]{APP_CHANNEL_UNSPECIFIED, PRODUCTION, BASELINE, CANARY, BETA, ALPHA, LOCAL, APOLLO, BROWSER_TESTS, QA_PROD, QA_DEV, LOCAL_TEST, ANDROID_APP_BETA, ANDROID_APP_DEV, ANDROID_APP_NIGHTLY, ANDROID_APP_PROD, IOS_APP_BETA, IOS_APP_DEV, IOS_APP_NIGHTLY, IOS_APP_PROD};
    }

    @JvmStatic
    public static final AppChannel fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<AppChannel> getEntries() {
        return $ENTRIES;
    }

    private AppChannel(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final AppChannel appChannel = new AppChannel("APP_CHANNEL_UNSPECIFIED", 0, 0);
        APP_CHANNEL_UNSPECIFIED = appChannel;
        PRODUCTION = new AppChannel("PRODUCTION", 1, 1);
        BASELINE = new AppChannel("BASELINE", 2, 2);
        CANARY = new AppChannel("CANARY", 3, 3);
        BETA = new AppChannel("BETA", 4, 4);
        ALPHA = new AppChannel("ALPHA", 5, 5);
        LOCAL = new AppChannel("LOCAL", 6, 6);
        APOLLO = new AppChannel("APOLLO", 7, 7);
        BROWSER_TESTS = new AppChannel("BROWSER_TESTS", 8, 8);
        QA_PROD = new AppChannel("QA_PROD", 9, 9);
        QA_DEV = new AppChannel("QA_DEV", 10, 10);
        LOCAL_TEST = new AppChannel("LOCAL_TEST", 11, 11);
        ANDROID_APP_BETA = new AppChannel("ANDROID_APP_BETA", 12, 12);
        ANDROID_APP_DEV = new AppChannel("ANDROID_APP_DEV", 13, 13);
        ANDROID_APP_NIGHTLY = new AppChannel("ANDROID_APP_NIGHTLY", 14, 14);
        ANDROID_APP_PROD = new AppChannel("ANDROID_APP_PROD", 15, 15);
        IOS_APP_BETA = new AppChannel("IOS_APP_BETA", 16, 16);
        IOS_APP_DEV = new AppChannel("IOS_APP_DEV", 17, 17);
        IOS_APP_NIGHTLY = new AppChannel("IOS_APP_NIGHTLY", 18, 18);
        IOS_APP_PROD = new AppChannel("IOS_APP_PROD", 19, 19);
        AppChannel[] appChannelArr$values = $values();
        $VALUES = appChannelArr$values;
        $ENTRIES = EnumEntries2.enumEntries(appChannelArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AppChannel.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<AppChannel>(orCreateKotlinClass, syntax, appChannel) { // from class: black_widow_bff.model.v1.AppChannel$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public AppChannel fromValue(int value) {
                return AppChannel.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: AppChannel.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lblack_widow_bff/model/v1/AppChannel$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lblack_widow_bff/model/v1/AppChannel;", "fromValue", "value", "", "black_widow_bff.service.v1.model_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AppChannel fromValue(int value) {
            switch (value) {
                case 0:
                    return AppChannel.APP_CHANNEL_UNSPECIFIED;
                case 1:
                    return AppChannel.PRODUCTION;
                case 2:
                    return AppChannel.BASELINE;
                case 3:
                    return AppChannel.CANARY;
                case 4:
                    return AppChannel.BETA;
                case 5:
                    return AppChannel.ALPHA;
                case 6:
                    return AppChannel.LOCAL;
                case 7:
                    return AppChannel.APOLLO;
                case 8:
                    return AppChannel.BROWSER_TESTS;
                case 9:
                    return AppChannel.QA_PROD;
                case 10:
                    return AppChannel.QA_DEV;
                case 11:
                    return AppChannel.LOCAL_TEST;
                case 12:
                    return AppChannel.ANDROID_APP_BETA;
                case 13:
                    return AppChannel.ANDROID_APP_DEV;
                case 14:
                    return AppChannel.ANDROID_APP_NIGHTLY;
                case 15:
                    return AppChannel.ANDROID_APP_PROD;
                case 16:
                    return AppChannel.IOS_APP_BETA;
                case 17:
                    return AppChannel.IOS_APP_DEV;
                case 18:
                    return AppChannel.IOS_APP_NIGHTLY;
                case 19:
                    return AppChannel.IOS_APP_PROD;
                default:
                    return null;
            }
        }
    }

    public static AppChannel valueOf(String str) {
        return (AppChannel) Enum.valueOf(AppChannel.class, str);
    }

    public static AppChannel[] values() {
        return (AppChannel[]) $VALUES.clone();
    }
}

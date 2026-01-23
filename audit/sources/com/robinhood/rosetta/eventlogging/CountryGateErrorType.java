package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.educationtour.EducationTourScreenNames;
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
/* compiled from: CountryGateErrorType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CountryGateErrorType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", EducationTourScreenNames.UNSPECIFIED_SCREEN, "DEEPLINK", "APP_NAVIGATION", "API", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CountryGateErrorType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CountryGateErrorType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<CountryGateErrorType> ADAPTER;
    public static final CountryGateErrorType API;
    public static final CountryGateErrorType APP_NAVIGATION;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final CountryGateErrorType DEEPLINK;
    public static final CountryGateErrorType UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ CountryGateErrorType[] $values() {
        return new CountryGateErrorType[]{UNSPECIFIED, DEEPLINK, APP_NAVIGATION, API};
    }

    @JvmStatic
    public static final CountryGateErrorType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<CountryGateErrorType> getEntries() {
        return $ENTRIES;
    }

    private CountryGateErrorType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final CountryGateErrorType countryGateErrorType = new CountryGateErrorType(EducationTourScreenNames.UNSPECIFIED_SCREEN, 0, 0);
        UNSPECIFIED = countryGateErrorType;
        DEEPLINK = new CountryGateErrorType("DEEPLINK", 1, 1);
        APP_NAVIGATION = new CountryGateErrorType("APP_NAVIGATION", 2, 2);
        API = new CountryGateErrorType("API", 3, 3);
        CountryGateErrorType[] countryGateErrorTypeArr$values = $values();
        $VALUES = countryGateErrorTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(countryGateErrorTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CountryGateErrorType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<CountryGateErrorType>(orCreateKotlinClass, syntax, countryGateErrorType) { // from class: com.robinhood.rosetta.eventlogging.CountryGateErrorType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public CountryGateErrorType fromValue(int value) {
                return CountryGateErrorType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: CountryGateErrorType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CountryGateErrorType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/CountryGateErrorType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CountryGateErrorType fromValue(int value) {
            if (value == 0) {
                return CountryGateErrorType.UNSPECIFIED;
            }
            if (value == 1) {
                return CountryGateErrorType.DEEPLINK;
            }
            if (value == 2) {
                return CountryGateErrorType.APP_NAVIGATION;
            }
            if (value != 3) {
                return null;
            }
            return CountryGateErrorType.API;
        }
    }

    public static CountryGateErrorType valueOf(String str) {
        return (CountryGateErrorType) Enum.valueOf(CountryGateErrorType.class, str);
    }

    public static CountryGateErrorType[] values() {
        return (CountryGateErrorType[]) $VALUES.clone();
    }
}

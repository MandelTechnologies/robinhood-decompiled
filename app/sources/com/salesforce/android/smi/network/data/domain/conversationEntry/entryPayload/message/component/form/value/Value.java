package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.form.value;

import android.net.Uri;
import com.salesforce.android.smi.common.internal.util.URLUtils;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: Value.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000f2\u00020\u0001:\b\b\t\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value;", "", "valueType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value$ValueType;", "<init>", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value$ValueType;)V", "getValueType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value$ValueType;", "ValueType", "TextValue", "IntegerValue", "DoubleValue", "UrlValue", "DateValue", "DateTimeValue", "Companion", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value$DateTimeValue;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value$DateValue;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value$DoubleValue;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value$IntegerValue;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value$TextValue;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value$UrlValue;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class Value {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ValueType valueType;

    public /* synthetic */ Value(ValueType valueType, DefaultConstructorMarker defaultConstructorMarker) {
        this(valueType);
    }

    private Value(ValueType valueType) {
        this.valueType = valueType;
    }

    public final ValueType getValueType() {
        return this.valueType;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Value.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value$ValueType;", "", "<init>", "(Ljava/lang/String;I)V", "TextValue", "IntegerValue", "DoubleValue", "UrlValue", "DateValue", "DateTimeValue", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class ValueType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ValueType[] $VALUES;
        public static final ValueType TextValue = new ValueType("TextValue", 0);
        public static final ValueType IntegerValue = new ValueType("IntegerValue", 1);
        public static final ValueType DoubleValue = new ValueType("DoubleValue", 2);
        public static final ValueType UrlValue = new ValueType("UrlValue", 3);
        public static final ValueType DateValue = new ValueType("DateValue", 4);
        public static final ValueType DateTimeValue = new ValueType("DateTimeValue", 5);

        private static final /* synthetic */ ValueType[] $values() {
            return new ValueType[]{TextValue, IntegerValue, DoubleValue, UrlValue, DateValue, DateTimeValue};
        }

        public static EnumEntries<ValueType> getEntries() {
            return $ENTRIES;
        }

        private ValueType(String str, int i) {
        }

        static {
            ValueType[] valueTypeArr$values = $values();
            $VALUES = valueTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(valueTypeArr$values);
        }

        public static ValueType valueOf(String str) {
            return (ValueType) Enum.valueOf(ValueType.class, str);
        }

        public static ValueType[] values() {
            return (ValueType[]) $VALUES.clone();
        }
    }

    /* compiled from: Value.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value$TextValue;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value;", "textValue", "", "<init>", "(Ljava/lang/String;)V", "getTextValue", "()Ljava/lang/String;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class TextValue extends Value {
        private final String textValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextValue(String textValue) {
            super(ValueType.TextValue, null);
            Intrinsics.checkNotNullParameter(textValue, "textValue");
            this.textValue = textValue;
        }

        public final String getTextValue() {
            return this.textValue;
        }
    }

    /* compiled from: Value.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value$IntegerValue;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value;", "integerValue", "", "<init>", "(I)V", "getIntegerValue", "()I", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class IntegerValue extends Value {
        private final int integerValue;

        public IntegerValue(int i) {
            super(ValueType.IntegerValue, null);
            this.integerValue = i;
        }

        public final int getIntegerValue() {
            return this.integerValue;
        }
    }

    /* compiled from: Value.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value$DoubleValue;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value;", "doubleValue", "", "<init>", "(D)V", "getDoubleValue", "()D", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class DoubleValue extends Value {
        private final double doubleValue;

        public DoubleValue(double d) {
            super(ValueType.DoubleValue, null);
            this.doubleValue = d;
        }

        public final double getDoubleValue() {
            return this.doubleValue;
        }
    }

    /* compiled from: Value.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value$UrlValue;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value;", "urlValue", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getUrlValue", "()Landroid/net/Uri;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class UrlValue extends Value {
        private final Uri urlValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UrlValue(Uri urlValue) {
            super(ValueType.UrlValue, null);
            Intrinsics.checkNotNullParameter(urlValue, "urlValue");
            this.urlValue = urlValue;
        }

        public final Uri getUrlValue() {
            return this.urlValue;
        }
    }

    /* compiled from: Value.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value$DateValue;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value;", "dateValue", "", "<init>", "(Ljava/lang/String;)V", "getDateValue", "()Ljava/lang/String;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class DateValue extends Value {
        private final String dateValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DateValue(String dateValue) {
            super(ValueType.DateValue, null);
            Intrinsics.checkNotNullParameter(dateValue, "dateValue");
            this.dateValue = dateValue;
        }

        public final String getDateValue() {
            return this.dateValue;
        }
    }

    /* compiled from: Value.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value$DateTimeValue;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value;", "dateTimeValue", "", "<init>", "(Ljava/lang/String;)V", "getDateTimeValue", "()Ljava/lang/String;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class DateTimeValue extends Value {
        private final String dateTimeValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DateTimeValue(String dateTimeValue) {
            super(ValueType.DateTimeValue, null);
            Intrinsics.checkNotNullParameter(dateTimeValue, "dateTimeValue");
            this.dateTimeValue = dateTimeValue;
        }

        public final String getDateTimeValue() {
            return this.dateTimeValue;
        }
    }

    /* compiled from: Value.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value$Companion;", "", "<init>", "()V", "stringValueToResponseValue", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value;", "value", "", "valueType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value$ValueType;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {

        /* compiled from: Value.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ValueType.values().length];
                try {
                    iArr[ValueType.TextValue.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ValueType.IntegerValue.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ValueType.DoubleValue.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ValueType.UrlValue.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ValueType.DateValue.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ValueType.DateTimeValue.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Value stringValueToResponseValue(String value, ValueType valueType) {
            Integer intOrNull;
            Double doubleOrNull;
            switch (valueType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[valueType.ordinal()]) {
                case 1:
                    if (value != null) {
                        return new TextValue(value);
                    }
                    return null;
                case 2:
                    if (value == null || (intOrNull = StringsKt.toIntOrNull(value)) == null) {
                        return null;
                    }
                    return new IntegerValue(intOrNull.intValue());
                case 3:
                    if (value == null || (doubleOrNull = StringsKt.toDoubleOrNull(value)) == null) {
                        return null;
                    }
                    return new DoubleValue(doubleOrNull.doubleValue());
                case 4:
                    Uri toUriOrNull = URLUtils.INSTANCE.getToUriOrNull(value);
                    if (toUriOrNull != null) {
                        return new UrlValue(toUriOrNull);
                    }
                    return null;
                case 5:
                    if (value != null) {
                        return new DateValue(value);
                    }
                    return null;
                case 6:
                    if (value != null) {
                        return new DateTimeValue(value);
                    }
                    return null;
                default:
                    if (value != null) {
                        return new TextValue(value);
                    }
                    return null;
            }
        }
    }
}

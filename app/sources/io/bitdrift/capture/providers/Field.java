package io.bitdrift.capture.providers;

import io.bitdrift.capture.providers.FieldProvider4;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FieldProvider.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0012HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, m3636d2 = {"Lio/bitdrift/capture/providers/Field;", "", "key", "", "value", "Lio/bitdrift/capture/providers/FieldValue;", "(Ljava/lang/String;Lio/bitdrift/capture/providers/FieldValue;)V", "byteArrayValue", "", "getByteArrayValue", "()[B", "getKey", "()Ljava/lang/String;", "stringValue", "getStringValue", "getValue", "()Lio/bitdrift/capture/providers/FieldValue;", "valueType", "", "getValueType", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class Field {
    private final String key;
    private final FieldProvider4 value;

    public static /* synthetic */ Field copy$default(Field field, String str, FieldProvider4 fieldProvider4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = field.key;
        }
        if ((i & 2) != 0) {
            fieldProvider4 = field.value;
        }
        return field.copy(str, fieldProvider4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final FieldProvider4 getValue() {
        return this.value;
    }

    public final Field copy(String key, FieldProvider4 value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return new Field(key, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Field)) {
            return false;
        }
        Field field = (Field) other;
        return Intrinsics.areEqual(this.key, field.key) && Intrinsics.areEqual(this.value, field.value);
    }

    public int hashCode() {
        return (this.key.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return "Field(key=" + this.key + ", value=" + this.value + ')';
    }

    public Field(String key, FieldProvider4 value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.key = key;
        this.value = value;
    }

    public final String getKey() {
        return this.key;
    }

    public final FieldProvider4 getValue() {
        return this.value;
    }

    public final String getStringValue() {
        FieldProvider4 fieldProvider4 = this.value;
        if (fieldProvider4 instanceof FieldProvider4.StringField) {
            return ((FieldProvider4.StringField) fieldProvider4).getStringValue();
        }
        if (fieldProvider4 instanceof FieldProvider4.BinaryField) {
            throw new UnsupportedOperationException();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final byte[] getByteArrayValue() {
        FieldProvider4 fieldProvider4 = this.value;
        if (fieldProvider4 instanceof FieldProvider4.BinaryField) {
            return ((FieldProvider4.BinaryField) fieldProvider4).getByteArrayValue();
        }
        if (fieldProvider4 instanceof FieldProvider4.StringField) {
            throw new UnsupportedOperationException();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int getValueType() {
        FieldProvider4 fieldProvider4 = this.value;
        if (fieldProvider4 instanceof FieldProvider4.BinaryField) {
            return 0;
        }
        if (fieldProvider4 instanceof FieldProvider4.StringField) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }
}

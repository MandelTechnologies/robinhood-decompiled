package io.bitdrift.capture.providers;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: FieldProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lio/bitdrift/capture/providers/FieldValue;", "", "()V", "BinaryField", "StringField", "Lio/bitdrift/capture/providers/FieldValue$BinaryField;", "Lio/bitdrift/capture/providers/FieldValue$StringField;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: io.bitdrift.capture.providers.FieldValue, reason: use source file name */
/* loaded from: classes14.dex */
public abstract class FieldProvider4 {
    public /* synthetic */ FieldProvider4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FieldProvider4() {
    }

    /* compiled from: FieldProvider.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Lio/bitdrift/capture/providers/FieldValue$StringField;", "Lio/bitdrift/capture/providers/FieldValue;", "stringValue", "", "(Ljava/lang/String;)V", "getStringValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: io.bitdrift.capture.providers.FieldValue$StringField */
    public static final /* data */ class StringField extends FieldProvider4 {
        private final String stringValue;

        public static /* synthetic */ StringField copy$default(StringField stringField, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stringField.stringValue;
            }
            return stringField.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getStringValue() {
            return this.stringValue;
        }

        public final StringField copy(String stringValue) {
            Intrinsics.checkNotNullParameter(stringValue, "stringValue");
            return new StringField(stringValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StringField) && Intrinsics.areEqual(this.stringValue, ((StringField) other).stringValue);
        }

        public int hashCode() {
            return this.stringValue.hashCode();
        }

        public final String getStringValue() {
            return this.stringValue;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringField(String stringValue) {
            super(null);
            Intrinsics.checkNotNullParameter(stringValue, "stringValue");
            this.stringValue = stringValue;
        }

        public String toString() {
            return this.stringValue;
        }
    }

    /* compiled from: FieldProvider.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m3636d2 = {"Lio/bitdrift/capture/providers/FieldValue$BinaryField;", "Lio/bitdrift/capture/providers/FieldValue;", "byteArrayValue", "", "([B)V", "getByteArrayValue", "()[B", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: io.bitdrift.capture.providers.FieldValue$BinaryField */
    public static final /* data */ class BinaryField extends FieldProvider4 {
        private final byte[] byteArrayValue;

        public static /* synthetic */ BinaryField copy$default(BinaryField binaryField, byte[] bArr, int i, Object obj) {
            if ((i & 1) != 0) {
                bArr = binaryField.byteArrayValue;
            }
            return binaryField.copy(bArr);
        }

        /* renamed from: component1, reason: from getter */
        public final byte[] getByteArrayValue() {
            return this.byteArrayValue;
        }

        public final BinaryField copy(byte[] byteArrayValue) {
            Intrinsics.checkNotNullParameter(byteArrayValue, "byteArrayValue");
            return new BinaryField(byteArrayValue);
        }

        public final byte[] getByteArrayValue() {
            return this.byteArrayValue;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BinaryField(byte[] byteArrayValue) {
            super(null);
            Intrinsics.checkNotNullParameter(byteArrayValue, "byteArrayValue");
            this.byteArrayValue = byteArrayValue;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.areEqual(BinaryField.class, other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.checkNotNull(other, "null cannot be cast to non-null type io.bitdrift.capture.providers.FieldValue.BinaryField");
            return Arrays.equals(this.byteArrayValue, ((BinaryField) other).byteArrayValue);
        }

        public int hashCode() {
            return Arrays.hashCode(this.byteArrayValue);
        }

        public String toString() {
            return new String(this.byteArrayValue, Charsets.UTF_8);
        }
    }
}

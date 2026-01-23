package com.withpersona.sdk2.inquiry;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: InquiryField.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryField;", "", "<init>", "()V", "IntegerField", "BooleanField", "StringField", "FloatField", "DateField", "DatetimeField", "ChoicesField", "MultiChoicesField", "UnknownField", "Lcom/withpersona/sdk2/inquiry/InquiryField$BooleanField;", "Lcom/withpersona/sdk2/inquiry/InquiryField$ChoicesField;", "Lcom/withpersona/sdk2/inquiry/InquiryField$DateField;", "Lcom/withpersona/sdk2/inquiry/InquiryField$DatetimeField;", "Lcom/withpersona/sdk2/inquiry/InquiryField$FloatField;", "Lcom/withpersona/sdk2/inquiry/InquiryField$IntegerField;", "Lcom/withpersona/sdk2/inquiry/InquiryField$MultiChoicesField;", "Lcom/withpersona/sdk2/inquiry/InquiryField$StringField;", "Lcom/withpersona/sdk2/inquiry/InquiryField$UnknownField;", "inquiry-dynamic-feature_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public abstract class InquiryField {
    public /* synthetic */ InquiryField(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private InquiryField() {
    }

    /* compiled from: InquiryField.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryField$IntegerField;", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "value", "", "<init>", "(Ljava/lang/Integer;)V", "getValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "inquiry-dynamic-feature_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class IntegerField extends InquiryField {
        private final Integer value;

        public IntegerField(Integer num) {
            super(null);
            this.value = num;
        }

        public final Integer getValue() {
            return this.value;
        }
    }

    /* compiled from: InquiryField.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryField$BooleanField;", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "value", "", "<init>", "(Ljava/lang/Boolean;)V", "getValue", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "inquiry-dynamic-feature_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class BooleanField extends InquiryField {
        private final Boolean value;

        public BooleanField(Boolean bool) {
            super(null);
            this.value = bool;
        }

        public final Boolean getValue() {
            return this.value;
        }
    }

    /* compiled from: InquiryField.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryField$StringField;", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "inquiry-dynamic-feature_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class StringField extends InquiryField {
        private final String value;

        public StringField(String str) {
            super(null);
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: InquiryField.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryField$FloatField;", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "value", "", "<init>", "(Ljava/lang/Float;)V", "getValue", "()Ljava/lang/Float;", "Ljava/lang/Float;", "inquiry-dynamic-feature_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class FloatField extends InquiryField {
        private final Float value;

        public FloatField(Float f) {
            super(null);
            this.value = f;
        }

        public final Float getValue() {
            return this.value;
        }
    }

    /* compiled from: InquiryField.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryField$DateField;", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "value", "Ljava/util/Date;", "<init>", "(Ljava/util/Date;)V", "getValue", "()Ljava/util/Date;", "inquiry-dynamic-feature_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class DateField extends InquiryField {
        private final Date value;

        public DateField(Date date) {
            super(null);
            this.value = date;
        }

        public final Date getValue() {
            return this.value;
        }
    }

    /* compiled from: InquiryField.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryField$DatetimeField;", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "value", "Ljava/util/Date;", "<init>", "(Ljava/util/Date;)V", "getValue", "()Ljava/util/Date;", "inquiry-dynamic-feature_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class DatetimeField extends InquiryField {
        private final Date value;

        public DatetimeField(Date date) {
            super(null);
            this.value = date;
        }

        public final Date getValue() {
            return this.value;
        }
    }

    /* compiled from: InquiryField.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryField$ChoicesField;", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "inquiry-dynamic-feature_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class ChoicesField extends InquiryField {
        private final String value;

        public ChoicesField(String str) {
            super(null);
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: InquiryField.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryField$MultiChoicesField;", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "value", "", "", "<init>", "([Ljava/lang/String;)V", "getValue", "()[Ljava/lang/String;", "[Ljava/lang/String;", "inquiry-dynamic-feature_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class MultiChoicesField extends InquiryField {
        private final String[] value;

        public MultiChoicesField(String[] strArr) {
            super(null);
            this.value = strArr;
        }

        public final String[] getValue() {
            return this.value;
        }
    }

    /* compiled from: InquiryField.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryField$UnknownField;", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "type", "", "<init>", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "inquiry-dynamic-feature_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class UnknownField extends InquiryField {
        private final String type;

        public UnknownField(String str) {
            super(null);
            this.type = str;
        }

        public final String getType() {
            return this.type;
        }
    }
}

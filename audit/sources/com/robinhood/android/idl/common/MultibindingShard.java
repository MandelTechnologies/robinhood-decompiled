package com.robinhood.android.idl.common;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* compiled from: MultibindingShard.kt */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\b\u0012\u0006\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/idl/common/MultibindingShard;", "", InquiryField.FloatField.TYPE2, "Lcom/robinhood/android/idl/common/MultibindingShard$Number;", "()Lcom/robinhood/android/idl/common/MultibindingShard$Number;", "Number", "lib-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@kotlin.annotation.Target
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention
/* loaded from: classes10.dex */
public @interface MultibindingShard {
    Number number();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MultibindingShard.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/idl/common/MultibindingShard$Number;", "", "<init>", "(Ljava/lang/String;I)V", "_0", "_1", "_2", "_3", "_4", "_5", "_6", "_7", "_8", "_9", "lib-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Number {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Number[] $VALUES;

        /* renamed from: _0 */
        public static final Number f4184_0 = new Number("_0", 0);

        /* renamed from: _1 */
        public static final Number f4185_1 = new Number("_1", 1);

        /* renamed from: _2 */
        public static final Number f4186_2 = new Number("_2", 2);

        /* renamed from: _3 */
        public static final Number f4187_3 = new Number("_3", 3);

        /* renamed from: _4 */
        public static final Number f4188_4 = new Number("_4", 4);

        /* renamed from: _5 */
        public static final Number f4189_5 = new Number("_5", 5);

        /* renamed from: _6 */
        public static final Number f4190_6 = new Number("_6", 6);

        /* renamed from: _7 */
        public static final Number f4191_7 = new Number("_7", 7);

        /* renamed from: _8 */
        public static final Number f4192_8 = new Number("_8", 8);

        /* renamed from: _9 */
        public static final Number f4193_9 = new Number("_9", 9);

        private static final /* synthetic */ Number[] $values() {
            return new Number[]{f4184_0, f4185_1, f4186_2, f4187_3, f4188_4, f4189_5, f4190_6, f4191_7, f4192_8, f4193_9};
        }

        public static EnumEntries<Number> getEntries() {
            return $ENTRIES;
        }

        private Number(String str, int i) {
        }

        static {
            Number[] numberArr$values = $values();
            $VALUES = numberArr$values;
            $ENTRIES = EnumEntries2.enumEntries(numberArr$values);
        }

        public static Number valueOf(String str) {
            return (Number) Enum.valueOf(Number.class, str);
        }

        public static Number[] values() {
            return (Number[]) $VALUES.clone();
        }
    }
}

package com.robinhood.android.crypto.costbasis.details.entry;

import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: InputRow.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0014\u0015\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r\u0082\u0001\u0002\u0017\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/details/entry/InputRow;", "", "type", "Lcom/robinhood/android/crypto/costbasis/details/entry/InputRow$Type;", "getType", "()Lcom/robinhood/android/crypto/costbasis/details/entry/InputRow$Type;", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/utils/resource/StringResource;", "getLabel", "()Lcom/robinhood/utils/resource/StringResource;", "value", "", "getValue", "()Ljava/lang/String;", "placeholder", "getPlaceholder", "labelDescription", "getLabelDescription", "inlineError", "getInlineError", "Number", "Text", "Type", "Lcom/robinhood/android/crypto/costbasis/details/entry/InputRow$Number;", "Lcom/robinhood/android/crypto/costbasis/details/entry/InputRow$Text;", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface InputRow {
    String getInlineError();

    StringResource getLabel();

    StringResource getLabelDescription();

    String getPlaceholder();

    Type getType();

    String getValue();

    /* compiled from: InputRow.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003JU\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\n\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/details/entry/InputRow$Number;", "Lcom/robinhood/android/crypto/costbasis/details/entry/InputRow;", "type", "Lcom/robinhood/android/crypto/costbasis/details/entry/InputRow$Type;", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/utils/resource/StringResource;", "labelDescription", "value", "", "placeholder", "inlineError", "rawValue", "Ljava/math/BigDecimal;", "<init>", "(Lcom/robinhood/android/crypto/costbasis/details/entry/InputRow$Type;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getType", "()Lcom/robinhood/android/crypto/costbasis/details/entry/InputRow$Type;", "getLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getLabelDescription", "getValue", "()Ljava/lang/String;", "getPlaceholder", "getInlineError", "getRawValue", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Number implements InputRow {
        public static final int $stable = 8;
        private final String inlineError;
        private final StringResource label;
        private final StringResource labelDescription;
        private final String placeholder;
        private final BigDecimal rawValue;
        private final Type type;
        private final String value;

        public static /* synthetic */ Number copy$default(Number number, Type type2, StringResource stringResource, StringResource stringResource2, String str, String str2, String str3, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                type2 = number.type;
            }
            if ((i & 2) != 0) {
                stringResource = number.label;
            }
            if ((i & 4) != 0) {
                stringResource2 = number.labelDescription;
            }
            if ((i & 8) != 0) {
                str = number.value;
            }
            if ((i & 16) != 0) {
                str2 = number.placeholder;
            }
            if ((i & 32) != 0) {
                str3 = number.inlineError;
            }
            if ((i & 64) != 0) {
                bigDecimal = number.rawValue;
            }
            String str4 = str3;
            BigDecimal bigDecimal2 = bigDecimal;
            String str5 = str2;
            StringResource stringResource3 = stringResource2;
            return number.copy(type2, stringResource, stringResource3, str, str5, str4, bigDecimal2);
        }

        /* renamed from: component1, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getLabel() {
            return this.label;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getLabelDescription() {
            return this.labelDescription;
        }

        /* renamed from: component4, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component5, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        /* renamed from: component6, reason: from getter */
        public final String getInlineError() {
            return this.inlineError;
        }

        /* renamed from: component7, reason: from getter */
        public final BigDecimal getRawValue() {
            return this.rawValue;
        }

        public final Number copy(Type type2, StringResource label, StringResource labelDescription, String value, String placeholder, String inlineError, BigDecimal rawValue) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            return new Number(type2, label, labelDescription, value, placeholder, inlineError, rawValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Number)) {
                return false;
            }
            Number number = (Number) other;
            return this.type == number.type && Intrinsics.areEqual(this.label, number.label) && Intrinsics.areEqual(this.labelDescription, number.labelDescription) && Intrinsics.areEqual(this.value, number.value) && Intrinsics.areEqual(this.placeholder, number.placeholder) && Intrinsics.areEqual(this.inlineError, number.inlineError) && Intrinsics.areEqual(this.rawValue, number.rawValue);
        }

        public int hashCode() {
            int iHashCode = ((this.type.hashCode() * 31) + this.label.hashCode()) * 31;
            StringResource stringResource = this.labelDescription;
            int iHashCode2 = (((((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.value.hashCode()) * 31) + this.placeholder.hashCode()) * 31;
            String str = this.inlineError;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            BigDecimal bigDecimal = this.rawValue;
            return iHashCode3 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
        }

        public String toString() {
            return "Number(type=" + this.type + ", label=" + this.label + ", labelDescription=" + this.labelDescription + ", value=" + this.value + ", placeholder=" + this.placeholder + ", inlineError=" + this.inlineError + ", rawValue=" + this.rawValue + ")";
        }

        public Number(Type type2, StringResource label, StringResource stringResource, String value, String placeholder, String str, BigDecimal bigDecimal) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            this.type = type2;
            this.label = label;
            this.labelDescription = stringResource;
            this.value = value;
            this.placeholder = placeholder;
            this.inlineError = str;
            this.rawValue = bigDecimal;
        }

        public /* synthetic */ Number(Type type2, StringResource stringResource, StringResource stringResource2, String str, String str2, String str3, BigDecimal bigDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(type2, stringResource, stringResource2, str, str2, (i & 32) != 0 ? null : str3, bigDecimal);
        }

        @Override // com.robinhood.android.crypto.costbasis.details.entry.InputRow
        public Type getType() {
            return this.type;
        }

        @Override // com.robinhood.android.crypto.costbasis.details.entry.InputRow
        public StringResource getLabel() {
            return this.label;
        }

        @Override // com.robinhood.android.crypto.costbasis.details.entry.InputRow
        public StringResource getLabelDescription() {
            return this.labelDescription;
        }

        @Override // com.robinhood.android.crypto.costbasis.details.entry.InputRow
        public String getValue() {
            return this.value;
        }

        @Override // com.robinhood.android.crypto.costbasis.details.entry.InputRow
        public String getPlaceholder() {
            return this.placeholder;
        }

        @Override // com.robinhood.android.crypto.costbasis.details.entry.InputRow
        public String getInlineError() {
            return this.inlineError;
        }

        public final BigDecimal getRawValue() {
            return this.rawValue;
        }
    }

    /* compiled from: InputRow.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003JS\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\n\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/details/entry/InputRow$Text;", "Lcom/robinhood/android/crypto/costbasis/details/entry/InputRow;", "type", "Lcom/robinhood/android/crypto/costbasis/details/entry/InputRow$Type;", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/utils/resource/StringResource;", "labelDescription", "value", "", "placeholder", "inlineError", "rawValue", "<init>", "(Lcom/robinhood/android/crypto/costbasis/details/entry/InputRow$Type;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Lcom/robinhood/android/crypto/costbasis/details/entry/InputRow$Type;", "getLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getLabelDescription", "getValue", "()Ljava/lang/String;", "getPlaceholder", "getInlineError", "getRawValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Text implements InputRow {
        public static final int $stable = StringResource.$stable;
        private final String inlineError;
        private final StringResource label;
        private final StringResource labelDescription;
        private final String placeholder;
        private final String rawValue;
        private final Type type;
        private final String value;

        public static /* synthetic */ Text copy$default(Text text, Type type2, StringResource stringResource, StringResource stringResource2, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                type2 = text.type;
            }
            if ((i & 2) != 0) {
                stringResource = text.label;
            }
            if ((i & 4) != 0) {
                stringResource2 = text.labelDescription;
            }
            if ((i & 8) != 0) {
                str = text.value;
            }
            if ((i & 16) != 0) {
                str2 = text.placeholder;
            }
            if ((i & 32) != 0) {
                str3 = text.inlineError;
            }
            if ((i & 64) != 0) {
                str4 = text.rawValue;
            }
            String str5 = str3;
            String str6 = str4;
            String str7 = str2;
            StringResource stringResource3 = stringResource2;
            return text.copy(type2, stringResource, stringResource3, str, str7, str5, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getLabel() {
            return this.label;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getLabelDescription() {
            return this.labelDescription;
        }

        /* renamed from: component4, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component5, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        /* renamed from: component6, reason: from getter */
        public final String getInlineError() {
            return this.inlineError;
        }

        /* renamed from: component7, reason: from getter */
        public final String getRawValue() {
            return this.rawValue;
        }

        public final Text copy(Type type2, StringResource label, StringResource labelDescription, String value, String placeholder, String inlineError, String rawValue) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            return new Text(type2, label, labelDescription, value, placeholder, inlineError, rawValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Text)) {
                return false;
            }
            Text text = (Text) other;
            return this.type == text.type && Intrinsics.areEqual(this.label, text.label) && Intrinsics.areEqual(this.labelDescription, text.labelDescription) && Intrinsics.areEqual(this.value, text.value) && Intrinsics.areEqual(this.placeholder, text.placeholder) && Intrinsics.areEqual(this.inlineError, text.inlineError) && Intrinsics.areEqual(this.rawValue, text.rawValue);
        }

        public int hashCode() {
            int iHashCode = ((this.type.hashCode() * 31) + this.label.hashCode()) * 31;
            StringResource stringResource = this.labelDescription;
            int iHashCode2 = (((((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.value.hashCode()) * 31) + this.placeholder.hashCode()) * 31;
            String str = this.inlineError;
            return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.rawValue.hashCode();
        }

        public String toString() {
            return "Text(type=" + this.type + ", label=" + this.label + ", labelDescription=" + this.labelDescription + ", value=" + this.value + ", placeholder=" + this.placeholder + ", inlineError=" + this.inlineError + ", rawValue=" + this.rawValue + ")";
        }

        public Text(Type type2, StringResource label, StringResource stringResource, String value, String placeholder, String str, String rawValue) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            this.type = type2;
            this.label = label;
            this.labelDescription = stringResource;
            this.value = value;
            this.placeholder = placeholder;
            this.inlineError = str;
            this.rawValue = rawValue;
        }

        public /* synthetic */ Text(Type type2, StringResource stringResource, StringResource stringResource2, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(type2, stringResource, stringResource2, str, str2, (i & 32) != 0 ? null : str3, str4);
        }

        @Override // com.robinhood.android.crypto.costbasis.details.entry.InputRow
        public Type getType() {
            return this.type;
        }

        @Override // com.robinhood.android.crypto.costbasis.details.entry.InputRow
        public StringResource getLabel() {
            return this.label;
        }

        @Override // com.robinhood.android.crypto.costbasis.details.entry.InputRow
        public StringResource getLabelDescription() {
            return this.labelDescription;
        }

        @Override // com.robinhood.android.crypto.costbasis.details.entry.InputRow
        public String getValue() {
            return this.value;
        }

        @Override // com.robinhood.android.crypto.costbasis.details.entry.InputRow
        public String getPlaceholder() {
            return this.placeholder;
        }

        @Override // com.robinhood.android.crypto.costbasis.details.entry.InputRow
        public String getInlineError() {
            return this.inlineError;
        }

        public final String getRawValue() {
            return this.rawValue;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InputRow.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/details/entry/InputRow$Type;", "", "loggingIdentifier", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getLoggingIdentifier", "()Ljava/lang/String;", "PURCHASE_DATE", "COIN_QUANTITY", "TOTAL_COST", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private final String loggingIdentifier;
        public static final Type PURCHASE_DATE = new Type("PURCHASE_DATE", 0, "acquisition_date");
        public static final Type COIN_QUANTITY = new Type("COIN_QUANTITY", 1, "quantity");
        public static final Type TOTAL_COST = new Type("TOTAL_COST", 2, "total_cost_basis_fiat");

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{PURCHASE_DATE, COIN_QUANTITY, TOTAL_COST};
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        private Type(String str, int i, String str2) {
            this.loggingIdentifier = str2;
        }

        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }
}

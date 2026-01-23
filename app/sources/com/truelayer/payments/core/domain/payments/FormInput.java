package com.truelayer.payments.core.domain.payments;

import com.robinhood.android.markdown.compose.MarkdownText4;
import com.truelayer.payments.core.domain.experience.localisation.LocalisedText;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.text.Regex;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: FormInput.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00122\u00020\u0001:\u0004\u0012\u0013\u0014\u0015R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005\u0082\u0001\u0003\u0016\u0017\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/FormInput;", "Lcom/truelayer/payments/core/domain/payments/Translatable;", "hintLabel", "", "getHintLabel", "()Ljava/lang/String;", "id", "getId", AnnotatedPrivateKey.LABEL, "Lcom/truelayer/payments/core/domain/payments/TranslatableText;", "getLabel", "()Lcom/truelayer/payments/core/domain/payments/TranslatableText;", "mandatory", "", "getMandatory", "()Z", "placeholderTranslationId", "getPlaceholderTranslationId", "Companion", "Select", "Text", "TextWithImage", "Lcom/truelayer/payments/core/domain/payments/FormInput$Select;", "Lcom/truelayer/payments/core/domain/payments/FormInput$Text;", "Lcom/truelayer/payments/core/domain/payments/FormInput$TextWithImage;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface FormInput extends TranslatableText2 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    String getHintLabel();

    String getId();

    TranslatableText getLabel();

    boolean getMandatory();

    String getPlaceholderTranslationId();

    /* compiled from: FormInput.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static boolean getMandatory(FormInput formInput) {
            if (formInput instanceof Select) {
                return ((Select) formInput).getMandatory();
            }
            if (formInput instanceof Text) {
                return ((Text) formInput).getValidation().getMandatory();
            }
            if (formInput instanceof TextWithImage) {
                return ((TextWithImage) formInput).getValidation().getMandatory();
            }
            throw new NoWhenBranchMatchedException();
        }

        public static String getPlaceholderTranslationId(FormInput formInput) {
            return formInput.getId() + ".placeholder";
        }
    }

    /* compiled from: FormInput.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0003345BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u001c\u0010 \u001a\u00020!2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020$0#H\u0016J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003JS\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010-\u001a\u00020\u000b2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00066"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/FormInput$Text;", "Lcom/truelayer/payments/core/domain/payments/FormInput;", "id", "", AnnotatedPrivateKey.LABEL, "Lcom/truelayer/payments/core/domain/payments/TranslatableText;", "hintLabel", "description", "format", "Lcom/truelayer/payments/core/domain/payments/FormInput$Text$TextFormat;", "sensitive", "", "validation", "Lcom/truelayer/payments/core/domain/payments/FormInput$Text$TextInputValidation;", "(Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/TranslatableText;Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/TranslatableText;Lcom/truelayer/payments/core/domain/payments/FormInput$Text$TextFormat;ZLcom/truelayer/payments/core/domain/payments/FormInput$Text$TextInputValidation;)V", "getDescription", "()Lcom/truelayer/payments/core/domain/payments/TranslatableText;", "getFormat", "()Lcom/truelayer/payments/core/domain/payments/FormInput$Text$TextFormat;", "getHintLabel", "()Ljava/lang/String;", "setHintLabel", "(Ljava/lang/String;)V", "getId", "setId", "getLabel", "setLabel", "(Lcom/truelayer/payments/core/domain/payments/TranslatableText;)V", "getSensitive", "()Z", "getValidation", "()Lcom/truelayer/payments/core/domain/payments/FormInput$Text$TextInputValidation;", "applyTranslation", "", "translationsMap", "", "Lcom/truelayer/payments/core/domain/experience/localisation/LocalisedText;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "RegexValidation", "TextFormat", "TextInputValidation", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Text implements FormInput {
        private final TranslatableText description;
        private final TextFormat format;
        private String hintLabel;
        private String id;
        private TranslatableText label;
        private final boolean sensitive;
        private final TextInputValidation validation;

        public static /* synthetic */ Text copy$default(Text text, String str, TranslatableText translatableText, String str2, TranslatableText translatableText2, TextFormat textFormat, boolean z, TextInputValidation textInputValidation, int i, Object obj) {
            if ((i & 1) != 0) {
                str = text.id;
            }
            if ((i & 2) != 0) {
                translatableText = text.label;
            }
            if ((i & 4) != 0) {
                str2 = text.hintLabel;
            }
            if ((i & 8) != 0) {
                translatableText2 = text.description;
            }
            if ((i & 16) != 0) {
                textFormat = text.format;
            }
            if ((i & 32) != 0) {
                z = text.sensitive;
            }
            if ((i & 64) != 0) {
                textInputValidation = text.validation;
            }
            boolean z2 = z;
            TextInputValidation textInputValidation2 = textInputValidation;
            TextFormat textFormat2 = textFormat;
            String str3 = str2;
            return text.copy(str, translatableText, str3, translatableText2, textFormat2, z2, textInputValidation2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final TranslatableText getLabel() {
            return this.label;
        }

        /* renamed from: component3, reason: from getter */
        public final String getHintLabel() {
            return this.hintLabel;
        }

        /* renamed from: component4, reason: from getter */
        public final TranslatableText getDescription() {
            return this.description;
        }

        /* renamed from: component5, reason: from getter */
        public final TextFormat getFormat() {
            return this.format;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getSensitive() {
            return this.sensitive;
        }

        /* renamed from: component7, reason: from getter */
        public final TextInputValidation getValidation() {
            return this.validation;
        }

        public final Text copy(String id, TranslatableText label, String hintLabel, TranslatableText description, TextFormat format2, boolean sensitive, TextInputValidation validation) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(format2, "format");
            Intrinsics.checkNotNullParameter(validation, "validation");
            return new Text(id, label, hintLabel, description, format2, sensitive, validation);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Text)) {
                return false;
            }
            Text text = (Text) other;
            return Intrinsics.areEqual(this.id, text.id) && Intrinsics.areEqual(this.label, text.label) && Intrinsics.areEqual(this.hintLabel, text.hintLabel) && Intrinsics.areEqual(this.description, text.description) && this.format == text.format && this.sensitive == text.sensitive && Intrinsics.areEqual(this.validation, text.validation);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.label.hashCode()) * 31;
            String str = this.hintLabel;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            TranslatableText translatableText = this.description;
            return ((((((iHashCode2 + (translatableText != null ? translatableText.hashCode() : 0)) * 31) + this.format.hashCode()) * 31) + Boolean.hashCode(this.sensitive)) * 31) + this.validation.hashCode();
        }

        public String toString() {
            return "Text(id=" + this.id + ", label=" + this.label + ", hintLabel=" + this.hintLabel + ", description=" + this.description + ", format=" + this.format + ", sensitive=" + this.sensitive + ", validation=" + this.validation + ")";
        }

        public Text(String id, TranslatableText label, String str, TranslatableText translatableText, TextFormat format2, boolean z, TextInputValidation validation) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(format2, "format");
            Intrinsics.checkNotNullParameter(validation, "validation");
            this.id = id;
            this.label = label;
            this.hintLabel = str;
            this.description = translatableText;
            this.format = format2;
            this.sensitive = z;
            this.validation = validation;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Text(String str, TranslatableText translatableText, String str2, TranslatableText translatableText2, TextFormat textFormat, boolean z, TextInputValidation textInputValidation, int i, DefaultConstructorMarker defaultConstructorMarker) {
            TextInputValidation textInputValidation2;
            boolean z2;
            TextFormat textFormat2;
            TranslatableText translatableText3;
            str2 = (i & 4) != 0 ? null : str2;
            if ((i & 8) != 0) {
                textInputValidation2 = textInputValidation;
                z2 = z;
                textFormat2 = textFormat;
                translatableText3 = null;
            } else {
                textInputValidation2 = textInputValidation;
                z2 = z;
                textFormat2 = textFormat;
                translatableText3 = translatableText2;
            }
            this(str, translatableText, str2, translatableText3, textFormat2, z2, textInputValidation2);
        }

        @Override // com.truelayer.payments.core.domain.payments.FormInput
        public boolean getMandatory() {
            return DefaultImpls.getMandatory(this);
        }

        @Override // com.truelayer.payments.core.domain.payments.FormInput
        public String getPlaceholderTranslationId() {
            return DefaultImpls.getPlaceholderTranslationId(this);
        }

        @Override // com.truelayer.payments.core.domain.payments.FormInput
        public String getId() {
            return this.id;
        }

        public void setId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.id = str;
        }

        @Override // com.truelayer.payments.core.domain.payments.FormInput
        public TranslatableText getLabel() {
            return this.label;
        }

        public void setLabel(TranslatableText translatableText) {
            Intrinsics.checkNotNullParameter(translatableText, "<set-?>");
            this.label = translatableText;
        }

        @Override // com.truelayer.payments.core.domain.payments.FormInput
        public String getHintLabel() {
            return this.hintLabel;
        }

        public void setHintLabel(String str) {
            this.hintLabel = str;
        }

        public final TranslatableText getDescription() {
            return this.description;
        }

        public final TextFormat getFormat() {
            return this.format;
        }

        public final boolean getSensitive() {
            return this.sensitive;
        }

        public final TextInputValidation getValidation() {
            return this.validation;
        }

        /* compiled from: FormInput.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u001c\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0016J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006#"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/FormInput$Text$TextInputValidation;", "Lcom/truelayer/payments/core/domain/payments/Translatable;", "mandatory", "", "range", "Lkotlin/ranges/IntRange;", "regexValidations", "", "Lcom/truelayer/payments/core/domain/payments/FormInput$Text$RegexValidation;", "(ZLkotlin/ranges/IntRange;Ljava/util/List;)V", "getMandatory", "()Z", "getRange", "()Lkotlin/ranges/IntRange;", "getRegexValidations", "()Ljava/util/List;", "setRegexValidations", "(Ljava/util/List;)V", "applyTranslation", "", "translationsMap", "", "", "Lcom/truelayer/payments/core/domain/experience/localisation/LocalisedText;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final /* data */ class TextInputValidation implements TranslatableText2 {
            private final boolean mandatory;
            private final PrimitiveRanges2 range;
            private List<RegexValidation> regexValidations;

            public TextInputValidation() {
                this(false, null, null, 7, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ TextInputValidation copy$default(TextInputValidation textInputValidation, boolean z, PrimitiveRanges2 primitiveRanges2, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = textInputValidation.mandatory;
                }
                if ((i & 2) != 0) {
                    primitiveRanges2 = textInputValidation.range;
                }
                if ((i & 4) != 0) {
                    list = textInputValidation.regexValidations;
                }
                return textInputValidation.copy(z, primitiveRanges2, list);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getMandatory() {
                return this.mandatory;
            }

            /* renamed from: component2, reason: from getter */
            public final PrimitiveRanges2 getRange() {
                return this.range;
            }

            public final List<RegexValidation> component3() {
                return this.regexValidations;
            }

            public final TextInputValidation copy(boolean mandatory, PrimitiveRanges2 range, List<RegexValidation> regexValidations) {
                Intrinsics.checkNotNullParameter(regexValidations, "regexValidations");
                return new TextInputValidation(mandatory, range, regexValidations);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TextInputValidation)) {
                    return false;
                }
                TextInputValidation textInputValidation = (TextInputValidation) other;
                return this.mandatory == textInputValidation.mandatory && Intrinsics.areEqual(this.range, textInputValidation.range) && Intrinsics.areEqual(this.regexValidations, textInputValidation.regexValidations);
            }

            public int hashCode() {
                int iHashCode = Boolean.hashCode(this.mandatory) * 31;
                PrimitiveRanges2 primitiveRanges2 = this.range;
                return ((iHashCode + (primitiveRanges2 == null ? 0 : primitiveRanges2.hashCode())) * 31) + this.regexValidations.hashCode();
            }

            public String toString() {
                return "TextInputValidation(mandatory=" + this.mandatory + ", range=" + this.range + ", regexValidations=" + this.regexValidations + ")";
            }

            public TextInputValidation(boolean z, PrimitiveRanges2 primitiveRanges2, List<RegexValidation> regexValidations) {
                Intrinsics.checkNotNullParameter(regexValidations, "regexValidations");
                this.mandatory = z;
                this.range = primitiveRanges2;
                this.regexValidations = regexValidations;
            }

            public final boolean getMandatory() {
                return this.mandatory;
            }

            public final PrimitiveRanges2 getRange() {
                return this.range;
            }

            public /* synthetic */ TextInputValidation(boolean z, PrimitiveRanges2 primitiveRanges2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : primitiveRanges2, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
            }

            public final List<RegexValidation> getRegexValidations() {
                return this.regexValidations;
            }

            public final void setRegexValidations(List<RegexValidation> list) {
                Intrinsics.checkNotNullParameter(list, "<set-?>");
                this.regexValidations = list;
            }

            @Override // com.truelayer.payments.core.domain.payments.TranslatableText2
            public void applyTranslation(Map<String, LocalisedText> translationsMap) {
                Intrinsics.checkNotNullParameter(translationsMap, "translationsMap");
                Iterator<T> it = this.regexValidations.iterator();
                while (it.hasNext()) {
                    ((RegexValidation) it.next()).applyTranslation(translationsMap);
                }
            }
        }

        /* compiled from: FormInput.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0016J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/FormInput$Text$RegexValidation;", "Lcom/truelayer/payments/core/domain/payments/Translatable;", "regex", "Lkotlin/text/Regex;", "message", "Lcom/truelayer/payments/core/domain/payments/TranslatableText;", "(Lkotlin/text/Regex;Lcom/truelayer/payments/core/domain/payments/TranslatableText;)V", "getMessage", "()Lcom/truelayer/payments/core/domain/payments/TranslatableText;", "getRegex", "()Lkotlin/text/Regex;", "applyTranslation", "", "translationsMap", "", "", "Lcom/truelayer/payments/core/domain/experience/localisation/LocalisedText;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class RegexValidation implements TranslatableText2 {
            private final TranslatableText message;
            private final Regex regex;

            public static /* synthetic */ RegexValidation copy$default(RegexValidation regexValidation, Regex regex, TranslatableText translatableText, int i, Object obj) {
                if ((i & 1) != 0) {
                    regex = regexValidation.regex;
                }
                if ((i & 2) != 0) {
                    translatableText = regexValidation.message;
                }
                return regexValidation.copy(regex, translatableText);
            }

            /* renamed from: component1, reason: from getter */
            public final Regex getRegex() {
                return this.regex;
            }

            /* renamed from: component2, reason: from getter */
            public final TranslatableText getMessage() {
                return this.message;
            }

            public final RegexValidation copy(Regex regex, TranslatableText message) {
                Intrinsics.checkNotNullParameter(regex, "regex");
                Intrinsics.checkNotNullParameter(message, "message");
                return new RegexValidation(regex, message);
            }

            public String toString() {
                return "RegexValidation(regex=" + this.regex + ", message=" + this.message + ")";
            }

            public RegexValidation(Regex regex, TranslatableText message) {
                Intrinsics.checkNotNullParameter(regex, "regex");
                Intrinsics.checkNotNullParameter(message, "message");
                this.regex = regex;
                this.message = message;
            }

            public final Regex getRegex() {
                return this.regex;
            }

            public final TranslatableText getMessage() {
                return this.message;
            }

            @Override // com.truelayer.payments.core.domain.payments.TranslatableText2
            public void applyTranslation(Map<String, LocalisedText> translationsMap) {
                Intrinsics.checkNotNullParameter(translationsMap, "translationsMap");
                this.message.applyTranslation(translationsMap);
            }

            public boolean equals(Object other) {
                if (other instanceof RegexValidation) {
                    RegexValidation regexValidation = (RegexValidation) other;
                    if (Intrinsics.areEqual(this.message, regexValidation.message) && Intrinsics.areEqual(this.regex.getPattern(), regexValidation.regex.getPattern())) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                return (this.regex.hashCode() * 31) + this.message.hashCode();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: FormInput.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/FormInput$Text$TextFormat;", "", "(Ljava/lang/String;I)V", "Any", "SortCode", "AccountNumber", "IBAN", "Email", "Alphabetical", "Alphanumerical", "Numerical", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class TextFormat {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ TextFormat[] $VALUES;
            public static final TextFormat Any = new TextFormat("Any", 0);
            public static final TextFormat SortCode = new TextFormat("SortCode", 1);
            public static final TextFormat AccountNumber = new TextFormat("AccountNumber", 2);
            public static final TextFormat IBAN = new TextFormat("IBAN", 3);
            public static final TextFormat Email = new TextFormat("Email", 4);
            public static final TextFormat Alphabetical = new TextFormat("Alphabetical", 5);
            public static final TextFormat Alphanumerical = new TextFormat("Alphanumerical", 6);
            public static final TextFormat Numerical = new TextFormat("Numerical", 7);

            private static final /* synthetic */ TextFormat[] $values() {
                return new TextFormat[]{Any, SortCode, AccountNumber, IBAN, Email, Alphabetical, Alphanumerical, Numerical};
            }

            public static EnumEntries<TextFormat> getEntries() {
                return $ENTRIES;
            }

            public static TextFormat valueOf(String str) {
                return (TextFormat) Enum.valueOf(TextFormat.class, str);
            }

            public static TextFormat[] values() {
                return (TextFormat[]) $VALUES.clone();
            }

            private TextFormat(String str, int i) {
            }

            static {
                TextFormat[] textFormatArr$values = $values();
                $VALUES = textFormatArr$values;
                $ENTRIES = EnumEntries2.enumEntries(textFormatArr$values);
            }
        }

        @Override // com.truelayer.payments.core.domain.payments.TranslatableText2
        public void applyTranslation(Map<String, LocalisedText> translationsMap) {
            String value;
            Intrinsics.checkNotNullParameter(translationsMap, "translationsMap");
            getLabel().applyTranslation(translationsMap);
            LocalisedText localisedText = translationsMap.get(getPlaceholderTranslationId());
            if (localisedText != null && (value = localisedText.getValue()) != null) {
                setHintLabel(value);
            }
            this.validation.applyTranslation(translationsMap);
            TranslatableText translatableText = this.description;
            if (translatableText != null) {
                translatableText.applyTranslation(translationsMap);
            }
        }
    }

    /* compiled from: FormInput.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u001c\u0010&\u001a\u00020'2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020*0)H\u0016J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\t\u00100\u001a\u00020\u000bHÆ\u0003J\t\u00101\u001a\u00020\rHÆ\u0003J\t\u00102\u001a\u00020\u000fHÆ\u0003J]\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u00104\u001a\u00020\r2\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010!R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006:"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/FormInput$TextWithImage;", "Lcom/truelayer/payments/core/domain/payments/FormInput;", "id", "", AnnotatedPrivateKey.LABEL, "Lcom/truelayer/payments/core/domain/payments/TranslatableText;", "hintLabel", "description", "image", "Lcom/truelayer/payments/core/domain/payments/Image;", "format", "Lcom/truelayer/payments/core/domain/payments/FormInput$Text$TextFormat;", "sensitive", "", "validation", "Lcom/truelayer/payments/core/domain/payments/FormInput$Text$TextInputValidation;", "(Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/TranslatableText;Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/TranslatableText;Lcom/truelayer/payments/core/domain/payments/Image;Lcom/truelayer/payments/core/domain/payments/FormInput$Text$TextFormat;ZLcom/truelayer/payments/core/domain/payments/FormInput$Text$TextInputValidation;)V", "getDescription", "()Lcom/truelayer/payments/core/domain/payments/TranslatableText;", "getFormat", "()Lcom/truelayer/payments/core/domain/payments/FormInput$Text$TextFormat;", "getHintLabel", "()Ljava/lang/String;", "setHintLabel", "(Ljava/lang/String;)V", "getId", "setId", "getImage", "()Lcom/truelayer/payments/core/domain/payments/Image;", "setImage", "(Lcom/truelayer/payments/core/domain/payments/Image;)V", "getLabel", "setLabel", "(Lcom/truelayer/payments/core/domain/payments/TranslatableText;)V", "getSensitive", "()Z", "getValidation", "()Lcom/truelayer/payments/core/domain/payments/FormInput$Text$TextInputValidation;", "applyTranslation", "", "translationsMap", "", "Lcom/truelayer/payments/core/domain/experience/localisation/LocalisedText;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class TextWithImage implements FormInput {
        private final TranslatableText description;
        private final Text.TextFormat format;
        private String hintLabel;
        private String id;
        private Image image;
        private TranslatableText label;
        private final boolean sensitive;
        private final Text.TextInputValidation validation;

        public static /* synthetic */ TextWithImage copy$default(TextWithImage textWithImage, String str, TranslatableText translatableText, String str2, TranslatableText translatableText2, Image image, Text.TextFormat textFormat, boolean z, Text.TextInputValidation textInputValidation, int i, Object obj) {
            if ((i & 1) != 0) {
                str = textWithImage.id;
            }
            if ((i & 2) != 0) {
                translatableText = textWithImage.label;
            }
            if ((i & 4) != 0) {
                str2 = textWithImage.hintLabel;
            }
            if ((i & 8) != 0) {
                translatableText2 = textWithImage.description;
            }
            if ((i & 16) != 0) {
                image = textWithImage.image;
            }
            if ((i & 32) != 0) {
                textFormat = textWithImage.format;
            }
            if ((i & 64) != 0) {
                z = textWithImage.sensitive;
            }
            if ((i & 128) != 0) {
                textInputValidation = textWithImage.validation;
            }
            boolean z2 = z;
            Text.TextInputValidation textInputValidation2 = textInputValidation;
            Image image2 = image;
            Text.TextFormat textFormat2 = textFormat;
            return textWithImage.copy(str, translatableText, str2, translatableText2, image2, textFormat2, z2, textInputValidation2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final TranslatableText getLabel() {
            return this.label;
        }

        /* renamed from: component3, reason: from getter */
        public final String getHintLabel() {
            return this.hintLabel;
        }

        /* renamed from: component4, reason: from getter */
        public final TranslatableText getDescription() {
            return this.description;
        }

        /* renamed from: component5, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        /* renamed from: component6, reason: from getter */
        public final Text.TextFormat getFormat() {
            return this.format;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getSensitive() {
            return this.sensitive;
        }

        /* renamed from: component8, reason: from getter */
        public final Text.TextInputValidation getValidation() {
            return this.validation;
        }

        public final TextWithImage copy(String id, TranslatableText label, String hintLabel, TranslatableText description, Image image, Text.TextFormat format2, boolean sensitive, Text.TextInputValidation validation) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(format2, "format");
            Intrinsics.checkNotNullParameter(validation, "validation");
            return new TextWithImage(id, label, hintLabel, description, image, format2, sensitive, validation);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextWithImage)) {
                return false;
            }
            TextWithImage textWithImage = (TextWithImage) other;
            return Intrinsics.areEqual(this.id, textWithImage.id) && Intrinsics.areEqual(this.label, textWithImage.label) && Intrinsics.areEqual(this.hintLabel, textWithImage.hintLabel) && Intrinsics.areEqual(this.description, textWithImage.description) && Intrinsics.areEqual(this.image, textWithImage.image) && this.format == textWithImage.format && this.sensitive == textWithImage.sensitive && Intrinsics.areEqual(this.validation, textWithImage.validation);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.label.hashCode()) * 31;
            String str = this.hintLabel;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            TranslatableText translatableText = this.description;
            return ((((((((iHashCode2 + (translatableText != null ? translatableText.hashCode() : 0)) * 31) + this.image.hashCode()) * 31) + this.format.hashCode()) * 31) + Boolean.hashCode(this.sensitive)) * 31) + this.validation.hashCode();
        }

        public String toString() {
            return "TextWithImage(id=" + this.id + ", label=" + this.label + ", hintLabel=" + this.hintLabel + ", description=" + this.description + ", image=" + this.image + ", format=" + this.format + ", sensitive=" + this.sensitive + ", validation=" + this.validation + ")";
        }

        public TextWithImage(String id, TranslatableText label, String str, TranslatableText translatableText, Image image, Text.TextFormat format2, boolean z, Text.TextInputValidation validation) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(format2, "format");
            Intrinsics.checkNotNullParameter(validation, "validation");
            this.id = id;
            this.label = label;
            this.hintLabel = str;
            this.description = translatableText;
            this.image = image;
            this.format = format2;
            this.sensitive = z;
            this.validation = validation;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ TextWithImage(String str, TranslatableText translatableText, String str2, TranslatableText translatableText2, Image image, Text.TextFormat textFormat, boolean z, Text.TextInputValidation textInputValidation, int i, DefaultConstructorMarker defaultConstructorMarker) {
            Text.TextInputValidation textInputValidation2;
            boolean z2;
            Text.TextFormat textFormat2;
            Image image2;
            TranslatableText translatableText3;
            str2 = (i & 4) != 0 ? null : str2;
            if ((i & 8) != 0) {
                textInputValidation2 = textInputValidation;
                z2 = z;
                textFormat2 = textFormat;
                image2 = image;
                translatableText3 = null;
            } else {
                textInputValidation2 = textInputValidation;
                z2 = z;
                textFormat2 = textFormat;
                image2 = image;
                translatableText3 = translatableText2;
            }
            this(str, translatableText, str2, translatableText3, image2, textFormat2, z2, textInputValidation2);
        }

        @Override // com.truelayer.payments.core.domain.payments.FormInput
        public boolean getMandatory() {
            return DefaultImpls.getMandatory(this);
        }

        @Override // com.truelayer.payments.core.domain.payments.FormInput
        public String getPlaceholderTranslationId() {
            return DefaultImpls.getPlaceholderTranslationId(this);
        }

        @Override // com.truelayer.payments.core.domain.payments.FormInput
        public String getId() {
            return this.id;
        }

        public void setId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.id = str;
        }

        @Override // com.truelayer.payments.core.domain.payments.FormInput
        public TranslatableText getLabel() {
            return this.label;
        }

        public void setLabel(TranslatableText translatableText) {
            Intrinsics.checkNotNullParameter(translatableText, "<set-?>");
            this.label = translatableText;
        }

        @Override // com.truelayer.payments.core.domain.payments.FormInput
        public String getHintLabel() {
            return this.hintLabel;
        }

        public void setHintLabel(String str) {
            this.hintLabel = str;
        }

        public final TranslatableText getDescription() {
            return this.description;
        }

        public final Image getImage() {
            return this.image;
        }

        public final void setImage(Image image) {
            Intrinsics.checkNotNullParameter(image, "<set-?>");
            this.image = image;
        }

        public final Text.TextFormat getFormat() {
            return this.format;
        }

        public final boolean getSensitive() {
            return this.sensitive;
        }

        public final Text.TextInputValidation getValidation() {
            return this.validation;
        }

        @Override // com.truelayer.payments.core.domain.payments.TranslatableText2
        public void applyTranslation(Map<String, LocalisedText> translationsMap) {
            String value;
            Intrinsics.checkNotNullParameter(translationsMap, "translationsMap");
            getLabel().applyTranslation(translationsMap);
            LocalisedText localisedText = translationsMap.get(getPlaceholderTranslationId());
            if (localisedText != null && (value = localisedText.getValue()) != null) {
                setHintLabel(value);
            }
            this.validation.applyTranslation(translationsMap);
            TranslatableText translatableText = this.description;
            if (translatableText != null) {
                translatableText.applyTranslation(translationsMap);
            }
        }
    }

    /* compiled from: FormInput.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001.B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\u001c\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!0 H\u0016J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JC\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010(\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006/"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/FormInput$Select;", "Lcom/truelayer/payments/core/domain/payments/FormInput;", "id", "", AnnotatedPrivateKey.LABEL, "Lcom/truelayer/payments/core/domain/payments/TranslatableText;", "hintLabel", "mandatory", "", "options", "", "Lcom/truelayer/payments/core/domain/payments/FormInput$Select$SelectOption;", "(Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/TranslatableText;Ljava/lang/String;ZLjava/util/List;)V", "getHintLabel", "()Ljava/lang/String;", "setHintLabel", "(Ljava/lang/String;)V", "getId", "setId", "getLabel", "()Lcom/truelayer/payments/core/domain/payments/TranslatableText;", "setLabel", "(Lcom/truelayer/payments/core/domain/payments/TranslatableText;)V", "getMandatory", "()Z", "setMandatory", "(Z)V", "getOptions", "()Ljava/util/List;", "applyTranslation", "", "translationsMap", "", "Lcom/truelayer/payments/core/domain/experience/localisation/LocalisedText;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "SelectOption", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Select implements FormInput {
        private String hintLabel;
        private String id;
        private TranslatableText label;
        private boolean mandatory;
        private final List<SelectOption> options;

        public static /* synthetic */ Select copy$default(Select select, String str, TranslatableText translatableText, String str2, boolean z, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = select.id;
            }
            if ((i & 2) != 0) {
                translatableText = select.label;
            }
            if ((i & 4) != 0) {
                str2 = select.hintLabel;
            }
            if ((i & 8) != 0) {
                z = select.mandatory;
            }
            if ((i & 16) != 0) {
                list = select.options;
            }
            List list2 = list;
            String str3 = str2;
            return select.copy(str, translatableText, str3, z, list2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final TranslatableText getLabel() {
            return this.label;
        }

        /* renamed from: component3, reason: from getter */
        public final String getHintLabel() {
            return this.hintLabel;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getMandatory() {
            return this.mandatory;
        }

        public final List<SelectOption> component5() {
            return this.options;
        }

        public final Select copy(String id, TranslatableText label, String hintLabel, boolean mandatory, List<SelectOption> options) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(options, "options");
            return new Select(id, label, hintLabel, mandatory, options);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Select)) {
                return false;
            }
            Select select = (Select) other;
            return Intrinsics.areEqual(this.id, select.id) && Intrinsics.areEqual(this.label, select.label) && Intrinsics.areEqual(this.hintLabel, select.hintLabel) && this.mandatory == select.mandatory && Intrinsics.areEqual(this.options, select.options);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.label.hashCode()) * 31;
            String str = this.hintLabel;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.mandatory)) * 31) + this.options.hashCode();
        }

        public String toString() {
            return "Select(id=" + this.id + ", label=" + this.label + ", hintLabel=" + this.hintLabel + ", mandatory=" + this.mandatory + ", options=" + this.options + ")";
        }

        public Select(String id, TranslatableText label, String str, boolean z, List<SelectOption> options) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(options, "options");
            this.id = id;
            this.label = label;
            this.hintLabel = str;
            this.mandatory = z;
            this.options = options;
        }

        public /* synthetic */ Select(String str, TranslatableText translatableText, String str2, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, translatableText, (i & 4) != 0 ? null : str2, z, list);
        }

        @Override // com.truelayer.payments.core.domain.payments.FormInput
        public String getPlaceholderTranslationId() {
            return DefaultImpls.getPlaceholderTranslationId(this);
        }

        @Override // com.truelayer.payments.core.domain.payments.FormInput
        public String getId() {
            return this.id;
        }

        public void setId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.id = str;
        }

        @Override // com.truelayer.payments.core.domain.payments.FormInput
        public TranslatableText getLabel() {
            return this.label;
        }

        public void setLabel(TranslatableText translatableText) {
            Intrinsics.checkNotNullParameter(translatableText, "<set-?>");
            this.label = translatableText;
        }

        @Override // com.truelayer.payments.core.domain.payments.FormInput
        public String getHintLabel() {
            return this.hintLabel;
        }

        public void setHintLabel(String str) {
            this.hintLabel = str;
        }

        @Override // com.truelayer.payments.core.domain.payments.FormInput
        public boolean getMandatory() {
            return this.mandatory;
        }

        public void setMandatory(boolean z) {
            this.mandatory = z;
        }

        public final List<SelectOption> getOptions() {
            return this.options;
        }

        /* compiled from: FormInput.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\u001c\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J9\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/FormInput$Select$SelectOption;", "Lcom/truelayer/payments/core/domain/payments/Translatable;", "id", "", AnnotatedPrivateKey.LABEL, "Lcom/truelayer/payments/core/domain/payments/TranslatableText;", MarkdownText4.TagImageUrl, "searchAliases", "", "(Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/TranslatableText;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getImageUrl", "getLabel", "()Lcom/truelayer/payments/core/domain/payments/TranslatableText;", "getSearchAliases", "()Ljava/util/List;", "applyTranslation", "", "translationsMap", "", "Lcom/truelayer/payments/core/domain/experience/localisation/LocalisedText;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class SelectOption implements TranslatableText2 {
            private final String id;
            private final String imageUrl;
            private final TranslatableText label;
            private final List<String> searchAliases;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ SelectOption copy$default(SelectOption selectOption, String str, TranslatableText translatableText, String str2, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = selectOption.id;
                }
                if ((i & 2) != 0) {
                    translatableText = selectOption.label;
                }
                if ((i & 4) != 0) {
                    str2 = selectOption.imageUrl;
                }
                if ((i & 8) != 0) {
                    list = selectOption.searchAliases;
                }
                return selectOption.copy(str, translatableText, str2, list);
            }

            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* renamed from: component2, reason: from getter */
            public final TranslatableText getLabel() {
                return this.label;
            }

            /* renamed from: component3, reason: from getter */
            public final String getImageUrl() {
                return this.imageUrl;
            }

            public final List<String> component4() {
                return this.searchAliases;
            }

            public final SelectOption copy(String id, TranslatableText label, String imageUrl, List<String> searchAliases) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(label, "label");
                Intrinsics.checkNotNullParameter(searchAliases, "searchAliases");
                return new SelectOption(id, label, imageUrl, searchAliases);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SelectOption)) {
                    return false;
                }
                SelectOption selectOption = (SelectOption) other;
                return Intrinsics.areEqual(this.id, selectOption.id) && Intrinsics.areEqual(this.label, selectOption.label) && Intrinsics.areEqual(this.imageUrl, selectOption.imageUrl) && Intrinsics.areEqual(this.searchAliases, selectOption.searchAliases);
            }

            public int hashCode() {
                int iHashCode = ((this.id.hashCode() * 31) + this.label.hashCode()) * 31;
                String str = this.imageUrl;
                return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.searchAliases.hashCode();
            }

            public String toString() {
                return "SelectOption(id=" + this.id + ", label=" + this.label + ", imageUrl=" + this.imageUrl + ", searchAliases=" + this.searchAliases + ")";
            }

            public SelectOption(String id, TranslatableText label, String str, List<String> searchAliases) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(label, "label");
                Intrinsics.checkNotNullParameter(searchAliases, "searchAliases");
                this.id = id;
                this.label = label;
                this.imageUrl = str;
                this.searchAliases = searchAliases;
            }

            public /* synthetic */ SelectOption(String str, TranslatableText translatableText, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, translatableText, (i & 4) != 0 ? null : str2, list);
            }

            public final String getId() {
                return this.id;
            }

            public final TranslatableText getLabel() {
                return this.label;
            }

            public final String getImageUrl() {
                return this.imageUrl;
            }

            public final List<String> getSearchAliases() {
                return this.searchAliases;
            }

            @Override // com.truelayer.payments.core.domain.payments.TranslatableText2
            public void applyTranslation(Map<String, LocalisedText> translationsMap) {
                Intrinsics.checkNotNullParameter(translationsMap, "translationsMap");
                this.label.applyTranslation(translationsMap);
            }
        }

        @Override // com.truelayer.payments.core.domain.payments.TranslatableText2
        public void applyTranslation(Map<String, LocalisedText> translationsMap) {
            String value;
            Intrinsics.checkNotNullParameter(translationsMap, "translationsMap");
            getLabel().applyTranslation(translationsMap);
            LocalisedText localisedText = translationsMap.get(getPlaceholderTranslationId());
            if (localisedText != null && (value = localisedText.getValue()) != null) {
                setHintLabel(value);
            }
            Iterator<T> it = this.options.iterator();
            while (it.hasNext()) {
                ((SelectOption) it.next()).applyTranslation(translationsMap);
            }
        }
    }

    /* compiled from: FormInput.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/FormInput$Companion;", "", "()V", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}

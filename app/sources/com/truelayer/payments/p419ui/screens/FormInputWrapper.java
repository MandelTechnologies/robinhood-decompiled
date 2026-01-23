package com.truelayer.payments.p419ui.screens;

import com.truelayer.payments.core.domain.experience.localisation.LocalisedText;
import com.truelayer.payments.core.domain.payments.FormInput;
import com.truelayer.payments.core.domain.payments.TranslatableText2;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Screen.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0013\u0014\u0015J\u001c\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u0011H\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0003\u0016\u0017\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/FormInputWrapper;", "Lcom/truelayer/payments/core/domain/payments/Translatable;", "id", "", "getId", "()Ljava/lang/String;", "input", "Lcom/truelayer/payments/core/domain/payments/FormInput;", "getInput", "()Lcom/truelayer/payments/core/domain/payments/FormInput;", "lastError", "Lcom/truelayer/payments/ui/screens/LastInputError;", "getLastError", "()Lcom/truelayer/payments/ui/screens/LastInputError;", "applyTranslation", "", "translationsMap", "", "Lcom/truelayer/payments/core/domain/experience/localisation/LocalisedText;", "Select", "Text", "TextWithImage", "Lcom/truelayer/payments/ui/screens/FormInputWrapper$Select;", "Lcom/truelayer/payments/ui/screens/FormInputWrapper$Text;", "Lcom/truelayer/payments/ui/screens/FormInputWrapper$TextWithImage;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface FormInputWrapper extends TranslatableText2 {
    @Override // com.truelayer.payments.core.domain.payments.TranslatableText2
    void applyTranslation(Map<String, LocalisedText> translationsMap);

    String getId();

    FormInput getInput();

    LastInputError getLastError();

    /* compiled from: Screen.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static String getId(FormInputWrapper formInputWrapper) {
            return formInputWrapper.getInput().getId();
        }

        public static void applyTranslation(FormInputWrapper formInputWrapper, Map<String, LocalisedText> translationsMap) {
            Intrinsics.checkNotNullParameter(translationsMap, "translationsMap");
            formInputWrapper.getInput().applyTranslation(translationsMap);
        }
    }

    /* compiled from: Screen.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/FormInputWrapper$Text;", "Lcom/truelayer/payments/ui/screens/FormInputWrapper;", "input", "Lcom/truelayer/payments/core/domain/payments/FormInput$Text;", "lastError", "Lcom/truelayer/payments/ui/screens/LastInputError;", "(Lcom/truelayer/payments/core/domain/payments/FormInput$Text;Lcom/truelayer/payments/ui/screens/LastInputError;)V", "getInput", "()Lcom/truelayer/payments/core/domain/payments/FormInput$Text;", "getLastError", "()Lcom/truelayer/payments/ui/screens/LastInputError;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Text implements FormInputWrapper {
        public static final int $stable = 8;
        private final FormInput.Text input;
        private final LastInputError lastError;

        public static /* synthetic */ Text copy$default(Text text, FormInput.Text text2, LastInputError lastInputError, int i, Object obj) {
            if ((i & 1) != 0) {
                text2 = text.input;
            }
            if ((i & 2) != 0) {
                lastInputError = text.lastError;
            }
            return text.copy(text2, lastInputError);
        }

        /* renamed from: component1, reason: from getter */
        public final FormInput.Text getInput() {
            return this.input;
        }

        /* renamed from: component2, reason: from getter */
        public final LastInputError getLastError() {
            return this.lastError;
        }

        public final Text copy(FormInput.Text input, LastInputError lastError) {
            Intrinsics.checkNotNullParameter(input, "input");
            return new Text(input, lastError);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Text)) {
                return false;
            }
            Text text = (Text) other;
            return Intrinsics.areEqual(this.input, text.input) && Intrinsics.areEqual(this.lastError, text.lastError);
        }

        public int hashCode() {
            int iHashCode = this.input.hashCode() * 31;
            LastInputError lastInputError = this.lastError;
            return iHashCode + (lastInputError == null ? 0 : lastInputError.hashCode());
        }

        public String toString() {
            return "Text(input=" + this.input + ", lastError=" + this.lastError + ")";
        }

        public Text(FormInput.Text input, LastInputError lastInputError) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.input = input;
            this.lastError = lastInputError;
        }

        @Override // com.truelayer.payments.p419ui.screens.FormInputWrapper, com.truelayer.payments.core.domain.payments.TranslatableText2
        public void applyTranslation(Map<String, LocalisedText> map) {
            DefaultImpls.applyTranslation(this, map);
        }

        @Override // com.truelayer.payments.p419ui.screens.FormInputWrapper
        public String getId() {
            return DefaultImpls.getId(this);
        }

        @Override // com.truelayer.payments.p419ui.screens.FormInputWrapper
        public FormInput.Text getInput() {
            return this.input;
        }

        @Override // com.truelayer.payments.p419ui.screens.FormInputWrapper
        public LastInputError getLastError() {
            return this.lastError;
        }
    }

    /* compiled from: Screen.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/FormInputWrapper$Select;", "Lcom/truelayer/payments/ui/screens/FormInputWrapper;", "input", "Lcom/truelayer/payments/core/domain/payments/FormInput$Select;", "lastError", "Lcom/truelayer/payments/ui/screens/LastInputError;", "(Lcom/truelayer/payments/core/domain/payments/FormInput$Select;Lcom/truelayer/payments/ui/screens/LastInputError;)V", "getInput", "()Lcom/truelayer/payments/core/domain/payments/FormInput$Select;", "getLastError", "()Lcom/truelayer/payments/ui/screens/LastInputError;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Select implements FormInputWrapper {
        public static final int $stable = 8;
        private final FormInput.Select input;
        private final LastInputError lastError;

        public static /* synthetic */ Select copy$default(Select select, FormInput.Select select2, LastInputError lastInputError, int i, Object obj) {
            if ((i & 1) != 0) {
                select2 = select.input;
            }
            if ((i & 2) != 0) {
                lastInputError = select.lastError;
            }
            return select.copy(select2, lastInputError);
        }

        /* renamed from: component1, reason: from getter */
        public final FormInput.Select getInput() {
            return this.input;
        }

        /* renamed from: component2, reason: from getter */
        public final LastInputError getLastError() {
            return this.lastError;
        }

        public final Select copy(FormInput.Select input, LastInputError lastError) {
            Intrinsics.checkNotNullParameter(input, "input");
            return new Select(input, lastError);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Select)) {
                return false;
            }
            Select select = (Select) other;
            return Intrinsics.areEqual(this.input, select.input) && Intrinsics.areEqual(this.lastError, select.lastError);
        }

        public int hashCode() {
            int iHashCode = this.input.hashCode() * 31;
            LastInputError lastInputError = this.lastError;
            return iHashCode + (lastInputError == null ? 0 : lastInputError.hashCode());
        }

        public String toString() {
            return "Select(input=" + this.input + ", lastError=" + this.lastError + ")";
        }

        public Select(FormInput.Select input, LastInputError lastInputError) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.input = input;
            this.lastError = lastInputError;
        }

        @Override // com.truelayer.payments.p419ui.screens.FormInputWrapper, com.truelayer.payments.core.domain.payments.TranslatableText2
        public void applyTranslation(Map<String, LocalisedText> map) {
            DefaultImpls.applyTranslation(this, map);
        }

        @Override // com.truelayer.payments.p419ui.screens.FormInputWrapper
        public String getId() {
            return DefaultImpls.getId(this);
        }

        @Override // com.truelayer.payments.p419ui.screens.FormInputWrapper
        public FormInput.Select getInput() {
            return this.input;
        }

        @Override // com.truelayer.payments.p419ui.screens.FormInputWrapper
        public LastInputError getLastError() {
            return this.lastError;
        }
    }

    /* compiled from: Screen.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/FormInputWrapper$TextWithImage;", "Lcom/truelayer/payments/ui/screens/FormInputWrapper;", "input", "Lcom/truelayer/payments/core/domain/payments/FormInput$TextWithImage;", "lastError", "Lcom/truelayer/payments/ui/screens/LastInputError;", "(Lcom/truelayer/payments/core/domain/payments/FormInput$TextWithImage;Lcom/truelayer/payments/ui/screens/LastInputError;)V", "getInput", "()Lcom/truelayer/payments/core/domain/payments/FormInput$TextWithImage;", "getLastError", "()Lcom/truelayer/payments/ui/screens/LastInputError;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class TextWithImage implements FormInputWrapper {
        public static final int $stable = 8;
        private final FormInput.TextWithImage input;
        private final LastInputError lastError;

        public static /* synthetic */ TextWithImage copy$default(TextWithImage textWithImage, FormInput.TextWithImage textWithImage2, LastInputError lastInputError, int i, Object obj) {
            if ((i & 1) != 0) {
                textWithImage2 = textWithImage.input;
            }
            if ((i & 2) != 0) {
                lastInputError = textWithImage.lastError;
            }
            return textWithImage.copy(textWithImage2, lastInputError);
        }

        /* renamed from: component1, reason: from getter */
        public final FormInput.TextWithImage getInput() {
            return this.input;
        }

        /* renamed from: component2, reason: from getter */
        public final LastInputError getLastError() {
            return this.lastError;
        }

        public final TextWithImage copy(FormInput.TextWithImage input, LastInputError lastError) {
            Intrinsics.checkNotNullParameter(input, "input");
            return new TextWithImage(input, lastError);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextWithImage)) {
                return false;
            }
            TextWithImage textWithImage = (TextWithImage) other;
            return Intrinsics.areEqual(this.input, textWithImage.input) && Intrinsics.areEqual(this.lastError, textWithImage.lastError);
        }

        public int hashCode() {
            int iHashCode = this.input.hashCode() * 31;
            LastInputError lastInputError = this.lastError;
            return iHashCode + (lastInputError == null ? 0 : lastInputError.hashCode());
        }

        public String toString() {
            return "TextWithImage(input=" + this.input + ", lastError=" + this.lastError + ")";
        }

        public TextWithImage(FormInput.TextWithImage input, LastInputError lastInputError) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.input = input;
            this.lastError = lastInputError;
        }

        @Override // com.truelayer.payments.p419ui.screens.FormInputWrapper, com.truelayer.payments.core.domain.payments.TranslatableText2
        public void applyTranslation(Map<String, LocalisedText> map) {
            DefaultImpls.applyTranslation(this, map);
        }

        @Override // com.truelayer.payments.p419ui.screens.FormInputWrapper
        public String getId() {
            return DefaultImpls.getId(this);
        }

        @Override // com.truelayer.payments.p419ui.screens.FormInputWrapper
        public FormInput.TextWithImage getInput() {
            return this.input;
        }

        @Override // com.truelayer.payments.p419ui.screens.FormInputWrapper
        public LastInputError getLastError() {
            return this.lastError;
        }
    }
}

package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.shared.p422ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2UiDateFieldBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GovernmentIdNfcScanComponent.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanViewHolder;", "", "cardAccessNumber", "Lcom/google/android/material/textfield/TextInputLayout;", "documentNumber", "dateOfBirthBinding", "Lcom/withpersona/sdk2/inquiry/steps/ui/databinding/Pi2UiDateFieldBinding;", "expirationDateBinding", "launchButton", "Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "errorLabel", "Landroid/widget/TextView;", "<init>", "(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/withpersona/sdk2/inquiry/steps/ui/databinding/Pi2UiDateFieldBinding;Lcom/withpersona/sdk2/inquiry/steps/ui/databinding/Pi2UiDateFieldBinding;Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;Landroid/widget/TextView;)V", "getCardAccessNumber", "()Lcom/google/android/material/textfield/TextInputLayout;", "getDocumentNumber", "getDateOfBirthBinding", "()Lcom/withpersona/sdk2/inquiry/steps/ui/databinding/Pi2UiDateFieldBinding;", "getExpirationDateBinding", "getLaunchButton", "()Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "getErrorLabel", "()Landroid/widget/TextView;", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanViewHolder, reason: use source file name */
/* loaded from: classes18.dex */
public final class GovernmentIdNfcScanComponent3 {
    private final TextInputLayout cardAccessNumber;
    private final Pi2UiDateFieldBinding dateOfBirthBinding;
    private final TextInputLayout documentNumber;
    private final TextView errorLabel;
    private final Pi2UiDateFieldBinding expirationDateBinding;
    private final ButtonWithLoadingIndicator launchButton;

    public GovernmentIdNfcScanComponent3(TextInputLayout cardAccessNumber, TextInputLayout documentNumber, Pi2UiDateFieldBinding dateOfBirthBinding, Pi2UiDateFieldBinding expirationDateBinding, ButtonWithLoadingIndicator launchButton, TextView errorLabel) {
        Intrinsics.checkNotNullParameter(cardAccessNumber, "cardAccessNumber");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(dateOfBirthBinding, "dateOfBirthBinding");
        Intrinsics.checkNotNullParameter(expirationDateBinding, "expirationDateBinding");
        Intrinsics.checkNotNullParameter(launchButton, "launchButton");
        Intrinsics.checkNotNullParameter(errorLabel, "errorLabel");
        this.cardAccessNumber = cardAccessNumber;
        this.documentNumber = documentNumber;
        this.dateOfBirthBinding = dateOfBirthBinding;
        this.expirationDateBinding = expirationDateBinding;
        this.launchButton = launchButton;
        this.errorLabel = errorLabel;
    }

    public final TextInputLayout getCardAccessNumber() {
        return this.cardAccessNumber;
    }

    public final TextInputLayout getDocumentNumber() {
        return this.documentNumber;
    }

    public final Pi2UiDateFieldBinding getDateOfBirthBinding() {
        return this.dateOfBirthBinding;
    }

    public final Pi2UiDateFieldBinding getExpirationDateBinding() {
        return this.expirationDateBinding;
    }

    public final ButtonWithLoadingIndicator getLaunchButton() {
        return this.launchButton;
    }

    public final TextView getErrorLabel() {
        return this.errorLabel;
    }
}

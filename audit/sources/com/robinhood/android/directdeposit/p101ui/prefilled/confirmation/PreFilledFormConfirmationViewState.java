package com.robinhood.android.directdeposit.p101ui.prefilled.confirmation;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.directdeposit.C14044R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: PreFilledFormConfirmationViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÂ\u0003¢\u0006\u0002\u0010\u000fJ&\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/confirmation/PreFilledFormConfirmationViewState;", "", "email", "", "hasRhyAccount", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSummary", "Landroid/text/SpannedString;", "resources", "Landroid/content/res/Resources;", "component1", "component2", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/robinhood/android/directdeposit/ui/prefilled/confirmation/PreFilledFormConfirmationViewState;", "equals", "other", "hashCode", "", "toString", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final /* data */ class PreFilledFormConfirmationViewState {
    public static final int $stable = 0;
    private final String email;
    private final Boolean hasRhyAccount;

    /* JADX WARN: Multi-variable type inference failed */
    public PreFilledFormConfirmationViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final String getEmail() {
        return this.email;
    }

    /* renamed from: component2, reason: from getter */
    private final Boolean getHasRhyAccount() {
        return this.hasRhyAccount;
    }

    public static /* synthetic */ PreFilledFormConfirmationViewState copy$default(PreFilledFormConfirmationViewState preFilledFormConfirmationViewState, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = preFilledFormConfirmationViewState.email;
        }
        if ((i & 2) != 0) {
            bool = preFilledFormConfirmationViewState.hasRhyAccount;
        }
        return preFilledFormConfirmationViewState.copy(str, bool);
    }

    public final PreFilledFormConfirmationViewState copy(String email, Boolean hasRhyAccount) {
        return new PreFilledFormConfirmationViewState(email, hasRhyAccount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreFilledFormConfirmationViewState)) {
            return false;
        }
        PreFilledFormConfirmationViewState preFilledFormConfirmationViewState = (PreFilledFormConfirmationViewState) other;
        return Intrinsics.areEqual(this.email, preFilledFormConfirmationViewState.email) && Intrinsics.areEqual(this.hasRhyAccount, preFilledFormConfirmationViewState.hasRhyAccount);
    }

    public int hashCode() {
        String str = this.email;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.hasRhyAccount;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "PreFilledFormConfirmationViewState(email=" + this.email + ", hasRhyAccount=" + this.hasRhyAccount + ")";
    }

    public PreFilledFormConfirmationViewState(String str, Boolean bool) {
        this.email = str;
        this.hasRhyAccount = bool;
    }

    public /* synthetic */ PreFilledFormConfirmationViewState(String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool);
    }

    public final SpannedString getSummary(Resources resources) throws Resources.NotFoundException {
        Boolean bool;
        int i;
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (this.email == null || (bool = this.hasRhyAccount) == null) {
            return null;
        }
        if (bool.booleanValue()) {
            i = C14044R.string.direct_deposit_confirmation_account_spending;
        } else {
            i = C11048R.string.general_label_robinhood;
        }
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = resources.getString(C14044R.string.direct_deposit_confirmation_summary, this.email, string2);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) string3, this.email, 0, false, 6, (Object) null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string3);
        spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf$default, this.email.length() + iIndexOf$default, 33);
        return new SpannedString(spannableStringBuilder);
    }
}

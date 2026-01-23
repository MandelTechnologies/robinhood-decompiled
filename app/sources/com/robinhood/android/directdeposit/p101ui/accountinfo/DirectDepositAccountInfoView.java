package com.robinhood.android.directdeposit.p101ui.accountinfo;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.android.signature.SignatureHelper;
import com.robinhood.android.signature.SignatureView;
import com.robinhood.utils.ClipboardUtil;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DirectDepositAccountInfoView.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR(\u0010\u001e\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR(\u0010!\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR(\u0010$\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR(\u0010'\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001aR(\u0010+\u001a\u0004\u0018\u00010*2\b\u0010\u0014\u001a\u0004\u0018\u00010*@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00101\u001a\u0002002\u0006\u0010\u0014\u001a\u0002008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u00105\u001a\u0002002\u0006\u0010\u0014\u001a\u0002008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00102\"\u0004\b6\u00104R$\u00107\u001a\u0002002\u0006\u0010\u0014\u001a\u0002008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00102\"\u0004\b8\u00104¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/accountinfo/DirectDepositAccountInfoView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "nameRow", "Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "bankNameRow", "routingNumberRow", "accountNumberRow", "amountRow", "employerRow", "signatureRow", "signatureImageView", "Landroid/widget/ImageView;", "value", "", "name", "getName", "()Ljava/lang/CharSequence;", "setName", "(Ljava/lang/CharSequence;)V", "bankName", "getBankName", "setBankName", "routingNumber", "getRoutingNumber", "setRoutingNumber", "accountNumber", "getAccountNumber", "setAccountNumber", "amount", "getAmount", "setAmount", "employer", "getEmployer", "setEmployer", "Lcom/robinhood/android/signature/SignatureView$Signature;", "signature", "getSignature", "()Lcom/robinhood/android/signature/SignatureView$Signature;", "setSignature", "(Lcom/robinhood/android/signature/SignatureView$Signature;)V", "", "isAmountVisible", "()Z", "setAmountVisible", "(Z)V", "isEmployerVisible", "setEmployerVisible", "isSignatureVisible", "setSignatureVisible", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class DirectDepositAccountInfoView extends LinearLayout {
    public static final int $stable = 8;
    private final RdsDataRowView accountNumberRow;
    private final RdsDataRowView amountRow;
    private final RdsDataRowView bankNameRow;
    private final RdsDataRowView employerRow;
    private final RdsDataRowView nameRow;
    private final RdsDataRowView routingNumberRow;
    private SignatureView.Signature signature;
    private final ImageView signatureImageView;
    private final RdsDataRowView signatureRow;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DirectDepositAccountInfoView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DirectDepositAccountInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ DirectDepositAccountInfoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DirectDepositAccountInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
        ViewGroups.inflate(this, C14044R.layout.merge_direct_deposit_account_info, true);
        View viewFindViewById = findViewById(C14044R.id.direct_deposit_name_row);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.nameRow = (RdsDataRowView) viewFindViewById;
        View viewFindViewById2 = findViewById(C14044R.id.direct_deposit_bank_name_row);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.bankNameRow = (RdsDataRowView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C14044R.id.direct_deposit_routing_number_row);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        RdsDataRowView rdsDataRowView = (RdsDataRowView) viewFindViewById3;
        this.routingNumberRow = rdsDataRowView;
        View viewFindViewById4 = findViewById(C14044R.id.direct_deposit_account_number_row);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        RdsDataRowView rdsDataRowView2 = (RdsDataRowView) viewFindViewById4;
        this.accountNumberRow = rdsDataRowView2;
        View viewFindViewById5 = findViewById(C14044R.id.direct_deposit_amount_row);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.amountRow = (RdsDataRowView) viewFindViewById5;
        View viewFindViewById6 = findViewById(C14044R.id.direct_deposit_employer_row);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.employerRow = (RdsDataRowView) viewFindViewById6;
        View viewFindViewById7 = findViewById(C14044R.id.direct_deposit_signature_row);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.signatureRow = (RdsDataRowView) viewFindViewById7;
        View viewFindViewById8 = findViewById(C14044R.id.direct_deposit_signature);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.signatureImageView = (ImageView) viewFindViewById8;
        OnClickListeners.onClick(rdsDataRowView2, new Function0() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.DirectDepositAccountInfoView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DirectDepositAccountInfoView._init_$lambda$0(this.f$0);
            }
        });
        OnClickListeners.onClick(rdsDataRowView, new Function0() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.DirectDepositAccountInfoView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DirectDepositAccountInfoView._init_$lambda$1(this.f$0);
            }
        });
    }

    public final CharSequence getName() {
        return this.nameRow.getValueText();
    }

    public final void setName(CharSequence charSequence) {
        this.nameRow.setValueText(charSequence);
    }

    public final CharSequence getBankName() {
        return this.bankNameRow.getValueText();
    }

    public final void setBankName(CharSequence charSequence) {
        this.bankNameRow.setValueText(charSequence);
    }

    public final CharSequence getRoutingNumber() {
        return this.routingNumberRow.getValueText();
    }

    public final void setRoutingNumber(CharSequence charSequence) {
        this.routingNumberRow.setValueText(charSequence);
    }

    public final CharSequence getAccountNumber() {
        return this.accountNumberRow.getValueText();
    }

    public final void setAccountNumber(CharSequence charSequence) {
        this.accountNumberRow.setValueText(charSequence);
    }

    public final CharSequence getAmount() {
        return this.amountRow.getValueText();
    }

    public final void setAmount(CharSequence charSequence) {
        this.amountRow.setValueText(charSequence);
    }

    public final CharSequence getEmployer() {
        return this.employerRow.getValueText();
    }

    public final void setEmployer(CharSequence charSequence) {
        this.employerRow.setValueText(charSequence);
    }

    public final SignatureView.Signature getSignature() {
        return this.signature;
    }

    public final void setSignature(SignatureView.Signature signature) {
        this.signature = signature;
        if (signature == null) {
            this.signatureImageView.setImageDrawable(null);
            return;
        }
        ColorStateList foregroundTintList = this.signatureImageView.getForegroundTintList();
        Integer numValueOf = foregroundTintList != null ? Integer.valueOf(foregroundTintList.getDefaultColor()) : null;
        SignatureHelper signatureHelper = SignatureHelper.INSTANCE;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        this.signatureImageView.setImageBitmap(signatureHelper.drawSignatureToBitmap(signature, resources, numValueOf));
    }

    public final boolean isAmountVisible() {
        return this.amountRow.getVisibility() == 0;
    }

    public final void setAmountVisible(boolean z) {
        this.amountRow.setVisibility(z ? 0 : 8);
    }

    public final boolean isEmployerVisible() {
        return this.employerRow.getVisibility() == 0;
    }

    public final void setEmployerVisible(boolean z) {
        this.employerRow.setVisibility(z ? 0 : 8);
    }

    public final boolean isSignatureVisible() {
        return this.signatureRow.getVisibility() == 0;
    }

    public final void setSignatureVisible(boolean z) {
        this.signatureRow.setVisibility(z ? 0 : 8);
        this.signatureImageView.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(DirectDepositAccountInfoView directDepositAccountInfoView) throws Resources.NotFoundException {
        String string2;
        ClipboardUtil clipboardUtil = ClipboardUtil.INSTANCE;
        CharSequence accountNumber = directDepositAccountInfoView.getAccountNumber();
        if (accountNumber == null || (string2 = accountNumber.toString()) == null) {
            string2 = "";
        }
        ClipboardUtil.copyToClipboardWithHapticFeedback$default(clipboardUtil, string2, ViewsKt.getString(directDepositAccountInfoView, C14044R.string.account_info_account_number), directDepositAccountInfoView.accountNumberRow, false, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(DirectDepositAccountInfoView directDepositAccountInfoView) throws Resources.NotFoundException {
        String string2;
        ClipboardUtil clipboardUtil = ClipboardUtil.INSTANCE;
        CharSequence routingNumber = directDepositAccountInfoView.getRoutingNumber();
        if (routingNumber == null || (string2 = routingNumber.toString()) == null) {
            string2 = "";
        }
        ClipboardUtil.copyToClipboardWithHapticFeedback$default(clipboardUtil, string2, ViewsKt.getString(directDepositAccountInfoView, C14044R.string.account_info_routing_number), directDepositAccountInfoView.routingNumberRow, false, 8, null);
        return Unit.INSTANCE;
    }
}

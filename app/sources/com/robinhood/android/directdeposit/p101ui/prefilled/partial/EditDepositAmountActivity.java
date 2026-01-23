package com.robinhood.android.directdeposit.p101ui.prefilled.partial;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.android.directdeposit.p101ui.prefilled.partial.PreFilledFormAmountTypeFragment;
import com.robinhood.android.directdeposit.p101ui.prefilled.partial.input.InputType;
import com.robinhood.android.directdeposit.p101ui.prefilled.partial.input.PreFilledFormAmountInputFragment;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.models.p355ui.DirectDepositAmount;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EditDepositAmountActivity.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0012\u0013B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0011H\u0002¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/partial/EditDepositAmountActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/directdeposit/ui/prefilled/partial/PreFilledFormAmountTypeFragment$Callbacks;", "Lcom/robinhood/android/directdeposit/ui/prefilled/partial/input/PreFilledFormAmountInputFragment$Callbacks;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onEntirePaycheckSelected", "onPaycheckPercentSelected", "onPaycheckDollarAmountSelected", "onPartialAmountConfirmed", "amount", "Lcom/robinhood/models/ui/DirectDepositAmount$PartialPaycheck;", "setResultAndFinish", "Lcom/robinhood/models/ui/DirectDepositAmount;", "OnEditListener", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class EditDepositAmountActivity extends BaseActivity implements PreFilledFormAmountTypeFragment.Callbacks, PreFilledFormAmountInputFragment.Callbacks {
    public static final String EXTRA_DEPOSIT_AMOUNT = "depositAmount";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseActivity.$stable;

    /* compiled from: EditDepositAmountActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/partial/EditDepositAmountActivity$OnEditListener;", "", "onDepositAmountEdited", "", "amount", "Lcom/robinhood/models/ui/DirectDepositAmount;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface OnEditListener {
        void onDepositAmountEdited(DirectDepositAmount amount);
    }

    public EditDepositAmountActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C14044R.id.fragment_container, PreFilledFormAmountTypeFragment.INSTANCE.newInstance((Parcelable) new PreFilledFormAmountTypeFragment.Args(((LegacyIntentKey.DirectDepositEditAmount) INSTANCE.getExtras((Activity) this)).getAmount())));
        }
    }

    @Override // com.robinhood.android.directdeposit.ui.prefilled.partial.PreFilledFormAmountTypeFragment.Callbacks
    public void onEntirePaycheckSelected() {
        setResultAndFinish(DirectDepositAmount.EntirePaycheck.INSTANCE);
    }

    @Override // com.robinhood.android.directdeposit.ui.prefilled.partial.PreFilledFormAmountTypeFragment.Callbacks
    public void onPaycheckPercentSelected() {
        PreFilledFormAmountInputFragment.Companion companion = PreFilledFormAmountInputFragment.INSTANCE;
        InputType inputType = InputType.PERCENT;
        DirectDepositAmount amount = ((LegacyIntentKey.DirectDepositEditAmount) INSTANCE.getExtras((Activity) this)).getAmount();
        replaceFragment(companion.newInstance((Parcelable) new PreFilledFormAmountInputFragment.Args(inputType, amount instanceof DirectDepositAmount.PartialPaycheck.Percent ? (DirectDepositAmount.PartialPaycheck.Percent) amount : null)));
    }

    @Override // com.robinhood.android.directdeposit.ui.prefilled.partial.PreFilledFormAmountTypeFragment.Callbacks
    public void onPaycheckDollarAmountSelected() {
        PreFilledFormAmountInputFragment.Companion companion = PreFilledFormAmountInputFragment.INSTANCE;
        InputType inputType = InputType.DOLLARS;
        DirectDepositAmount amount = ((LegacyIntentKey.DirectDepositEditAmount) INSTANCE.getExtras((Activity) this)).getAmount();
        replaceFragment(companion.newInstance((Parcelable) new PreFilledFormAmountInputFragment.Args(inputType, amount instanceof DirectDepositAmount.PartialPaycheck.Dollars ? (DirectDepositAmount.PartialPaycheck.Dollars) amount : null)));
    }

    @Override // com.robinhood.android.directdeposit.ui.prefilled.partial.input.PreFilledFormAmountInputFragment.Callbacks
    public void onPartialAmountConfirmed(DirectDepositAmount.PartialPaycheck amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        setResultAndFinish(amount);
    }

    private final void setResultAndFinish(DirectDepositAmount amount) {
        setResult(-1, new Intent().putExtra(EXTRA_DEPOSIT_AMOUNT, amount));
        finish();
    }

    /* compiled from: EditDepositAmountActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/partial/EditDepositAmountActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/directdeposit/ui/prefilled/partial/EditDepositAmountActivity;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectDepositEditAmount;", "<init>", "()V", "EXTRA_DEPOSIT_AMOUNT", "", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<EditDepositAmountActivity, LegacyIntentKey.DirectDepositEditAmount> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public LegacyIntentKey.DirectDepositEditAmount getExtras(EditDepositAmountActivity editDepositAmountActivity) {
            return (LegacyIntentKey.DirectDepositEditAmount) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, editDepositAmountActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.DirectDepositEditAmount directDepositEditAmount) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, directDepositEditAmount);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, LegacyIntentKey.DirectDepositEditAmount directDepositEditAmount) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, directDepositEditAmount);
        }
    }
}

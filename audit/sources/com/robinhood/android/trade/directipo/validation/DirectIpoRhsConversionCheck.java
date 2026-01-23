package com.robinhood.android.trade.directipo.validation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.doc.p109ui.photo.DocUploadReviewPdfFragment;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.android.trade.directipo.C29323R;
import com.robinhood.android.trade.directipo.validation.DirectIpoOrderValidationFailure;
import com.robinhood.prefs.BooleanPreference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoRhsConversionCheck.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004:\u0001\fB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/validation/DirectIpoRhsConversionCheck;", "Lcom/robinhood/android/lib/trade/validation/Validator$Check;", "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderContext;", "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderFailureResolver;", "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderValidationCheck;", "hasConvertedToRhsPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Lcom/robinhood/prefs/BooleanPreference;)V", "check", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "input", "Failure", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class DirectIpoRhsConversionCheck implements Validator.Check<DirectIpoOrderContext, DirectIpoOrderFailureResolver> {
    public static final int $stable = 8;
    private final BooleanPreference hasConvertedToRhsPref;

    public DirectIpoRhsConversionCheck(BooleanPreference hasConvertedToRhsPref) {
        Intrinsics.checkNotNullParameter(hasConvertedToRhsPref, "hasConvertedToRhsPref");
        this.hasConvertedToRhsPref = hasConvertedToRhsPref;
    }

    @Override // com.robinhood.android.lib.trade.validation.Validator.Check
    public Validator.Failure<DirectIpoOrderContext, DirectIpoOrderFailureResolver> check(DirectIpoOrderContext input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (this.hasConvertedToRhsPref.get()) {
            return null;
        }
        return Failure.INSTANCE;
    }

    /* compiled from: DirectIpoRhsConversionCheck.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/validation/DirectIpoRhsConversionCheck$Failure;", "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderValidationFailure;", "<init>", "()V", "checkIdentifier", "", "getCheckIdentifier", "()Ljava/lang/String;", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "input", "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderContext;", "onPositiveResponse", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "resolver", "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderFailureResolver;", "passthroughArgs", "Landroid/os/Bundle;", "onNegativeResponse", "describeContents", "", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Failure implements DirectIpoOrderValidationFailure {
        public static final int $stable = 0;
        public static final Failure INSTANCE = new Failure();
        public static final Parcelable.Creator<Failure> CREATOR = new Creator();

        /* compiled from: DirectIpoRhsConversionCheck.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Failure> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Failure.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure[] newArray(int i) {
                return new Failure[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Failure() {
        }

        @Override // com.robinhood.android.trade.directipo.validation.DirectIpoOrderValidationFailure
        public Bundle getPassthroughArgs() {
            return DirectIpoOrderValidationFailure.DefaultImpls.getPassthroughArgs(this);
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public String getCheckIdentifier() {
            return "rhs_conversion";
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public void showAlert(BaseActivity activity, DirectIpoOrderContext input) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(input, "input");
            RhDialogFragment.Builder passthroughArgs = RhDialogFragment.INSTANCE.create(activity).setTitle(null).setMessage(activity.getResources().getString(C20649R.string.order_create_error_rhs_conversion)).setId(C29323R.id.dialog_id_direct_ipo_order_rhs_conversion).setNegativeButton(C11048R.string.general_label_cancel, new Object[0]).setPositiveButton(C11048R.string.general_label_continue, new Object[0]).setPassthroughArgs(getPassthroughArgs());
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(passthroughArgs, supportFragmentManager, DocUploadReviewPdfFragment.ERROR_DIALOG_TAG, false, 4, null);
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<DirectIpoOrderContext> onPositiveResponse(DirectIpoOrderFailureResolver resolver, Bundle passthroughArgs) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            resolver.launchRhsConversion();
            return Validator.Action.Abort.INSTANCE;
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<DirectIpoOrderContext> onNegativeResponse(DirectIpoOrderFailureResolver resolver, Bundle passthroughArgs) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            return Validator.Action.Abort.INSTANCE;
        }
    }
}

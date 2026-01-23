package com.robinhood.android.directdeposit.p101ui.deeplink;

import android.content.Context;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.android.directdeposit.p101ui.deeplink.DirectDepositFormDuxo3;
import java.io.File;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectDepositFormDuxo.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/deeplink/DirectDepositFormViewState;", "", "showLoadingView", "", "<init>", "(Z)V", "getShowLoadingView", "()Z", "Loading", "Loaded", "Error", "Lcom/robinhood/android/directdeposit/ui/deeplink/DirectDepositFormViewState$Error;", "Lcom/robinhood/android/directdeposit/ui/deeplink/DirectDepositFormViewState$Loaded;", "Lcom/robinhood/android/directdeposit/ui/deeplink/DirectDepositFormViewState$Loading;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directdeposit.ui.deeplink.DirectDepositFormViewState, reason: use source file name */
/* loaded from: classes27.dex */
public abstract class DirectDepositFormDuxo2 {
    public static final int $stable = 0;
    private final boolean showLoadingView;

    public /* synthetic */ DirectDepositFormDuxo2(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    private DirectDepositFormDuxo2(boolean z) {
        this.showLoadingView = z;
    }

    public final boolean getShowLoadingView() {
        return this.showLoadingView;
    }

    /* compiled from: DirectDepositFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/deeplink/DirectDepositFormViewState$Loading;", "Lcom/robinhood/android/directdeposit/ui/deeplink/DirectDepositFormViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directdeposit.ui.deeplink.DirectDepositFormViewState$Loading */
    public static final /* data */ class Loading extends DirectDepositFormDuxo2 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 328801500;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(true, null);
        }
    }

    /* compiled from: DirectDepositFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/deeplink/DirectDepositFormViewState$Loaded;", "Lcom/robinhood/android/directdeposit/ui/deeplink/DirectDepositFormViewState;", "form", "Ljava/io/File;", "<init>", "(Ljava/io/File;)V", "getForm", "()Ljava/io/File;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directdeposit.ui.deeplink.DirectDepositFormViewState$Loaded */
    public static final class Loaded extends DirectDepositFormDuxo2 {
        public static final int $stable = 8;
        private final File form;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(File form) {
            super(false, null);
            Intrinsics.checkNotNullParameter(form, "form");
            this.form = form;
        }

        public final File getForm() {
            return this.form;
        }
    }

    /* compiled from: DirectDepositFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/deeplink/DirectDepositFormViewState$Error;", "Lcom/robinhood/android/directdeposit/ui/deeplink/DirectDepositFormViewState;", "errorResponse", "Lcom/robinhood/android/directdeposit/ui/deeplink/ErrorResponse;", "<init>", "(Lcom/robinhood/android/directdeposit/ui/deeplink/ErrorResponse;)V", "createDialog", "Lcom/robinhood/android/common/ui/RhDialogFragment$Builder;", "context", "Landroid/content/Context;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directdeposit.ui.deeplink.DirectDepositFormViewState$Error */
    public static final class Error extends DirectDepositFormDuxo2 {
        public static final int $stable = 0;
        private final DirectDepositFormDuxo3 errorResponse;

        /* compiled from: DirectDepositFormDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.directdeposit.ui.deeplink.DirectDepositFormViewState$Error$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DirectDepositFormDuxo3.ErrorType.values().length];
                try {
                    iArr[DirectDepositFormDuxo3.ErrorType.INVALID.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DirectDepositFormDuxo3.ErrorType.EXPIRED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(DirectDepositFormDuxo3 errorResponse) {
            super(false, null);
            Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
            this.errorResponse = errorResponse;
        }

        public final RhDialogFragment.Builder createDialog(Context context) {
            int i;
            Intrinsics.checkNotNullParameter(context, "context");
            RhDialogFragment.Builder builderCreate = RhDialogFragment.INSTANCE.create(context);
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.errorResponse.getType().ordinal()];
            if (i2 == 1) {
                i = C14044R.id.dialog_direct_deposit_form_invalid;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C14044R.id.dialog_direct_deposit_form_expired;
            }
            RhDialogFragment.Builder positiveButton = builderCreate.setId(i).setTitle(this.errorResponse.getHeader()).setMessage(this.errorResponse.getSubtitle()).setPositiveButton(this.errorResponse.getButton_copy());
            if (this.errorResponse.getType() == DirectDepositFormDuxo3.ErrorType.EXPIRED) {
                positiveButton.setNegativeButton(C11048R.string.general_label_cancel, new Object[0]);
            }
            return positiveButton;
        }
    }
}

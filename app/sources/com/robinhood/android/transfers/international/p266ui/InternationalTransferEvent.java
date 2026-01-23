package com.robinhood.android.transfers.international.p266ui;

import androidx.fragment.app.Fragment;
import com.robinhood.android.doc.p109ui.photo.DocUploadReviewPdfFragment;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.transfers.international.p266ui.accountselection.AccountSelectionFragment;
import com.robinhood.android.transfers.international.p266ui.amountinput.AmountInputFragment;
import com.robinhood.android.transfers.international.p266ui.methodselection.TransferMethodFragment;
import com.robinhood.android.transfers.international.p266ui.review.ReviewTransferFragment;
import com.robinhood.android.transfers.international.p266ui.util.ErrorDialog;
import com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoFragment;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator;
import com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternationalTransferEvent.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent;", "", "ShowTransferMethodSelection", "ShowNonOriginatedAccountInfo", "ShowAmountInput", "ShowAccountSelection", "ShowTransferReview", "ReplaceFragment", "SetFragmentWithArgs", "SetFragmentWithoutArgs", "ShowMemoInput", "Error", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent$Error;", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent$ReplaceFragment;", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent$SetFragmentWithArgs;", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent$SetFragmentWithoutArgs;", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent$ShowAccountSelection;", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent$ShowAmountInput;", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent$ShowMemoInput;", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent$ShowNonOriginatedAccountInfo;", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent$ShowTransferMethodSelection;", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent$ShowTransferReview;", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface InternationalTransferEvent {

    /* compiled from: InternationalTransferEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent$ShowTransferMethodSelection;", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent;", "args", "Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodFragment$Args;", "<init>", "(Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodFragment$Args;)V", "getArgs", "()Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodFragment$Args;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowTransferMethodSelection implements InternationalTransferEvent {
        public static final int $stable = 8;
        private final TransferMethodFragment.Args args;

        public static /* synthetic */ ShowTransferMethodSelection copy$default(ShowTransferMethodSelection showTransferMethodSelection, TransferMethodFragment.Args args, int i, Object obj) {
            if ((i & 1) != 0) {
                args = showTransferMethodSelection.args;
            }
            return showTransferMethodSelection.copy(args);
        }

        /* renamed from: component1, reason: from getter */
        public final TransferMethodFragment.Args getArgs() {
            return this.args;
        }

        public final ShowTransferMethodSelection copy(TransferMethodFragment.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return new ShowTransferMethodSelection(args);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowTransferMethodSelection) && Intrinsics.areEqual(this.args, ((ShowTransferMethodSelection) other).args);
        }

        public int hashCode() {
            return this.args.hashCode();
        }

        public String toString() {
            return "ShowTransferMethodSelection(args=" + this.args + ")";
        }

        public ShowTransferMethodSelection(TransferMethodFragment.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            this.args = args;
        }

        public final TransferMethodFragment.Args getArgs() {
            return this.args;
        }
    }

    /* compiled from: InternationalTransferEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent$ShowNonOriginatedAccountInfo;", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent;", "args", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoFragment$Args;", "<init>", "(Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoFragment$Args;)V", "getArgs", "()Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoFragment$Args;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowNonOriginatedAccountInfo implements InternationalTransferEvent {
        public static final int $stable = NonOriginatedAccountInfoFragment.Args.$stable;
        private final NonOriginatedAccountInfoFragment.Args args;

        public static /* synthetic */ ShowNonOriginatedAccountInfo copy$default(ShowNonOriginatedAccountInfo showNonOriginatedAccountInfo, NonOriginatedAccountInfoFragment.Args args, int i, Object obj) {
            if ((i & 1) != 0) {
                args = showNonOriginatedAccountInfo.args;
            }
            return showNonOriginatedAccountInfo.copy(args);
        }

        /* renamed from: component1, reason: from getter */
        public final NonOriginatedAccountInfoFragment.Args getArgs() {
            return this.args;
        }

        public final ShowNonOriginatedAccountInfo copy(NonOriginatedAccountInfoFragment.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return new ShowNonOriginatedAccountInfo(args);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowNonOriginatedAccountInfo) && Intrinsics.areEqual(this.args, ((ShowNonOriginatedAccountInfo) other).args);
        }

        public int hashCode() {
            return this.args.hashCode();
        }

        public String toString() {
            return "ShowNonOriginatedAccountInfo(args=" + this.args + ")";
        }

        public ShowNonOriginatedAccountInfo(NonOriginatedAccountInfoFragment.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            this.args = args;
        }

        public final NonOriginatedAccountInfoFragment.Args getArgs() {
            return this.args;
        }
    }

    /* compiled from: InternationalTransferEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent$ShowAmountInput;", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent;", "args", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputFragment$Args;", "<init>", "(Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputFragment$Args;)V", "getArgs", "()Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputFragment$Args;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowAmountInput implements InternationalTransferEvent {
        public static final int $stable = 0;
        private final AmountInputFragment.Args args;

        public static /* synthetic */ ShowAmountInput copy$default(ShowAmountInput showAmountInput, AmountInputFragment.Args args, int i, Object obj) {
            if ((i & 1) != 0) {
                args = showAmountInput.args;
            }
            return showAmountInput.copy(args);
        }

        /* renamed from: component1, reason: from getter */
        public final AmountInputFragment.Args getArgs() {
            return this.args;
        }

        public final ShowAmountInput copy(AmountInputFragment.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return new ShowAmountInput(args);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowAmountInput) && Intrinsics.areEqual(this.args, ((ShowAmountInput) other).args);
        }

        public int hashCode() {
            return this.args.hashCode();
        }

        public String toString() {
            return "ShowAmountInput(args=" + this.args + ")";
        }

        public ShowAmountInput(AmountInputFragment.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            this.args = args;
        }

        public final AmountInputFragment.Args getArgs() {
            return this.args;
        }
    }

    /* compiled from: InternationalTransferEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent$ShowAccountSelection;", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent;", "args", "Lcom/robinhood/android/transfers/international/ui/accountselection/AccountSelectionFragment$Args;", "<init>", "(Lcom/robinhood/android/transfers/international/ui/accountselection/AccountSelectionFragment$Args;)V", "getArgs", "()Lcom/robinhood/android/transfers/international/ui/accountselection/AccountSelectionFragment$Args;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowAccountSelection implements InternationalTransferEvent {
        public static final int $stable = 0;
        private final AccountSelectionFragment.Args args;

        public static /* synthetic */ ShowAccountSelection copy$default(ShowAccountSelection showAccountSelection, AccountSelectionFragment.Args args, int i, Object obj) {
            if ((i & 1) != 0) {
                args = showAccountSelection.args;
            }
            return showAccountSelection.copy(args);
        }

        /* renamed from: component1, reason: from getter */
        public final AccountSelectionFragment.Args getArgs() {
            return this.args;
        }

        public final ShowAccountSelection copy(AccountSelectionFragment.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return new ShowAccountSelection(args);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowAccountSelection) && Intrinsics.areEqual(this.args, ((ShowAccountSelection) other).args);
        }

        public int hashCode() {
            return this.args.hashCode();
        }

        public String toString() {
            return "ShowAccountSelection(args=" + this.args + ")";
        }

        public ShowAccountSelection(AccountSelectionFragment.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            this.args = args;
        }

        public final AccountSelectionFragment.Args getArgs() {
            return this.args;
        }
    }

    /* compiled from: InternationalTransferEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent$ShowTransferReview;", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent;", "args", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferFragment$Args;", "<init>", "(Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferFragment$Args;)V", "getArgs", "()Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferFragment$Args;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowTransferReview implements InternationalTransferEvent {
        public static final int $stable = 8;
        private final ReviewTransferFragment.Args args;

        public static /* synthetic */ ShowTransferReview copy$default(ShowTransferReview showTransferReview, ReviewTransferFragment.Args args, int i, Object obj) {
            if ((i & 1) != 0) {
                args = showTransferReview.args;
            }
            return showTransferReview.copy(args);
        }

        /* renamed from: component1, reason: from getter */
        public final ReviewTransferFragment.Args getArgs() {
            return this.args;
        }

        public final ShowTransferReview copy(ReviewTransferFragment.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return new ShowTransferReview(args);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowTransferReview) && Intrinsics.areEqual(this.args, ((ShowTransferReview) other).args);
        }

        public int hashCode() {
            return this.args.hashCode();
        }

        public String toString() {
            return "ShowTransferReview(args=" + this.args + ")";
        }

        public ShowTransferReview(ReviewTransferFragment.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            this.args = args;
        }

        public final ReviewTransferFragment.Args getArgs() {
            return this.args;
        }
    }

    /* compiled from: InternationalTransferEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent$ReplaceFragment;", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent;", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/FragmentKey;)V", "getFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ReplaceFragment implements InternationalTransferEvent {
        public static final int $stable = 8;
        private final FragmentKey fragmentKey;

        public static /* synthetic */ ReplaceFragment copy$default(ReplaceFragment replaceFragment, FragmentKey fragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                fragmentKey = replaceFragment.fragmentKey;
            }
            return replaceFragment.copy(fragmentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final FragmentKey getFragmentKey() {
            return this.fragmentKey;
        }

        public final ReplaceFragment copy(FragmentKey fragmentKey) {
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            return new ReplaceFragment(fragmentKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ReplaceFragment) && Intrinsics.areEqual(this.fragmentKey, ((ReplaceFragment) other).fragmentKey);
        }

        public int hashCode() {
            return this.fragmentKey.hashCode();
        }

        public String toString() {
            return "ReplaceFragment(fragmentKey=" + this.fragmentKey + ")";
        }

        public ReplaceFragment(FragmentKey fragmentKey) {
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            this.fragmentKey = fragmentKey;
        }

        public final FragmentKey getFragmentKey() {
            return this.fragmentKey;
        }
    }

    /* compiled from: InternationalTransferEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u000e\u0010\u000f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\fJ4\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0006\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent$SetFragmentWithArgs;", "A", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent;", "fragmentCreator", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCreator;", "Landroidx/fragment/app/Fragment;", "args", "<init>", "(Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCreator;Ljava/lang/Object;)V", "getFragmentCreator", "()Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCreator;", "getArgs", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCreator;Ljava/lang/Object;)Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent$SetFragmentWithArgs;", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SetFragmentWithArgs<A> implements InternationalTransferEvent {
        public static final int $stable = 8;
        private final A args;
        private final FragmentWithArgsCreator<Fragment, A> fragmentCreator;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SetFragmentWithArgs copy$default(SetFragmentWithArgs setFragmentWithArgs, FragmentWithArgsCreator fragmentWithArgsCreator, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                fragmentWithArgsCreator = setFragmentWithArgs.fragmentCreator;
            }
            if ((i & 2) != 0) {
                obj = setFragmentWithArgs.args;
            }
            return setFragmentWithArgs.copy(fragmentWithArgsCreator, obj);
        }

        public final FragmentWithArgsCreator<Fragment, A> component1() {
            return this.fragmentCreator;
        }

        public final A component2() {
            return this.args;
        }

        public final SetFragmentWithArgs<A> copy(FragmentWithArgsCreator<? extends Fragment, ? super A> fragmentCreator, A args) {
            Intrinsics.checkNotNullParameter(fragmentCreator, "fragmentCreator");
            return new SetFragmentWithArgs<>(fragmentCreator, args);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetFragmentWithArgs)) {
                return false;
            }
            SetFragmentWithArgs setFragmentWithArgs = (SetFragmentWithArgs) other;
            return Intrinsics.areEqual(this.fragmentCreator, setFragmentWithArgs.fragmentCreator) && Intrinsics.areEqual(this.args, setFragmentWithArgs.args);
        }

        public int hashCode() {
            int iHashCode = this.fragmentCreator.hashCode() * 31;
            A a = this.args;
            return iHashCode + (a == null ? 0 : a.hashCode());
        }

        public String toString() {
            return "SetFragmentWithArgs(fragmentCreator=" + this.fragmentCreator + ", args=" + this.args + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SetFragmentWithArgs(FragmentWithArgsCreator<? extends Fragment, ? super A> fragmentCreator, A a) {
            Intrinsics.checkNotNullParameter(fragmentCreator, "fragmentCreator");
            this.fragmentCreator = fragmentCreator;
            this.args = a;
        }

        public final FragmentWithArgsCreator<Fragment, A> getFragmentCreator() {
            return this.fragmentCreator;
        }

        public final A getArgs() {
            return this.args;
        }
    }

    /* compiled from: InternationalTransferEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent$SetFragmentWithoutArgs;", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent;", "fragmentCreator", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCreator;", "Landroidx/fragment/app/Fragment;", "<init>", "(Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCreator;)V", "getFragmentCreator", "()Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCreator;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SetFragmentWithoutArgs implements InternationalTransferEvent {
        public static final int $stable = 8;
        private final FragmentWithoutArgsCreator<Fragment> fragmentCreator;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SetFragmentWithoutArgs copy$default(SetFragmentWithoutArgs setFragmentWithoutArgs, FragmentWithoutArgsCreator fragmentWithoutArgsCreator, int i, Object obj) {
            if ((i & 1) != 0) {
                fragmentWithoutArgsCreator = setFragmentWithoutArgs.fragmentCreator;
            }
            return setFragmentWithoutArgs.copy(fragmentWithoutArgsCreator);
        }

        public final FragmentWithoutArgsCreator<Fragment> component1() {
            return this.fragmentCreator;
        }

        public final SetFragmentWithoutArgs copy(FragmentWithoutArgsCreator<? extends Fragment> fragmentCreator) {
            Intrinsics.checkNotNullParameter(fragmentCreator, "fragmentCreator");
            return new SetFragmentWithoutArgs(fragmentCreator);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SetFragmentWithoutArgs) && Intrinsics.areEqual(this.fragmentCreator, ((SetFragmentWithoutArgs) other).fragmentCreator);
        }

        public int hashCode() {
            return this.fragmentCreator.hashCode();
        }

        public String toString() {
            return "SetFragmentWithoutArgs(fragmentCreator=" + this.fragmentCreator + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SetFragmentWithoutArgs(FragmentWithoutArgsCreator<? extends Fragment> fragmentCreator) {
            Intrinsics.checkNotNullParameter(fragmentCreator, "fragmentCreator");
            this.fragmentCreator = fragmentCreator;
        }

        public final FragmentWithoutArgsCreator<Fragment> getFragmentCreator() {
            return this.fragmentCreator;
        }
    }

    /* compiled from: InternationalTransferEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent$ShowMemoInput;", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowMemoInput implements InternationalTransferEvent {
        public static final int $stable = 0;
        public static final ShowMemoInput INSTANCE = new ShowMemoInput();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowMemoInput);
        }

        public int hashCode() {
            return 1798543334;
        }

        public String toString() {
            return "ShowMemoInput";
        }

        private ShowMemoInput() {
        }
    }

    /* compiled from: InternationalTransferEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent$Error;", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent;", DocUploadReviewPdfFragment.ERROR_DIALOG_TAG, "Lcom/robinhood/android/transfers/international/ui/util/ErrorDialog;", "<init>", "(Lcom/robinhood/android/transfers/international/ui/util/ErrorDialog;)V", "getErrorDialog", "()Lcom/robinhood/android/transfers/international/ui/util/ErrorDialog;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements InternationalTransferEvent {
        public static final int $stable = StringResource.$stable;
        private final ErrorDialog errorDialog;

        public static /* synthetic */ Error copy$default(Error error, ErrorDialog errorDialog, int i, Object obj) {
            if ((i & 1) != 0) {
                errorDialog = error.errorDialog;
            }
            return error.copy(errorDialog);
        }

        /* renamed from: component1, reason: from getter */
        public final ErrorDialog getErrorDialog() {
            return this.errorDialog;
        }

        public final Error copy(ErrorDialog errorDialog) {
            Intrinsics.checkNotNullParameter(errorDialog, "errorDialog");
            return new Error(errorDialog);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.errorDialog, ((Error) other).errorDialog);
        }

        public int hashCode() {
            return this.errorDialog.hashCode();
        }

        public String toString() {
            return "Error(errorDialog=" + this.errorDialog + ")";
        }

        public Error(ErrorDialog errorDialog) {
            Intrinsics.checkNotNullParameter(errorDialog, "errorDialog");
            this.errorDialog = errorDialog;
        }

        public final ErrorDialog getErrorDialog() {
            return this.errorDialog;
        }
    }
}

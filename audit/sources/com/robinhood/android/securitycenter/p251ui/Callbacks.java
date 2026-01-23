package com.robinhood.android.securitycenter.p251ui;

import com.robinhood.android.securitycenter.p251ui.SecurityCenterFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SecurityCenterComposable.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tHÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u009f\u0001\u0010%\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/Callbacks;", "", "createPasskey", "Lkotlin/Function0;", "", "updatePassword", "mfa", "openPrivacyUrl", "securityRow", "Lkotlin/Function1;", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterFragment$SecurityRowType;", "onCreatePasskeyAccepted", "onCreatePasskeyDismissed", "onCreateErrorPasskeyDismissed", "onPasskeyBottomSheetDoneClick", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getCreatePasskey", "()Lkotlin/jvm/functions/Function0;", "getUpdatePassword", "getMfa", "getOpenPrivacyUrl", "getSecurityRow", "()Lkotlin/jvm/functions/Function1;", "getOnCreatePasskeyAccepted", "getOnCreatePasskeyDismissed", "getOnCreateErrorPasskeyDismissed", "getOnPasskeyBottomSheetDoneClick", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Callbacks {
    public static final int $stable = 0;
    private final Function0<Unit> createPasskey;
    private final Function0<Unit> mfa;
    private final Function0<Unit> onCreateErrorPasskeyDismissed;
    private final Function0<Unit> onCreatePasskeyAccepted;
    private final Function0<Unit> onCreatePasskeyDismissed;
    private final Function0<Unit> onPasskeyBottomSheetDoneClick;
    private final Function0<Unit> openPrivacyUrl;
    private final Function1<SecurityCenterFragment.SecurityRowType, Unit> securityRow;
    private final Function0<Unit> updatePassword;

    public static /* synthetic */ Callbacks copy$default(Callbacks callbacks, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function1 function1, Function0 function05, Function0 function06, Function0 function07, Function0 function08, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = callbacks.createPasskey;
        }
        if ((i & 2) != 0) {
            function02 = callbacks.updatePassword;
        }
        if ((i & 4) != 0) {
            function03 = callbacks.mfa;
        }
        if ((i & 8) != 0) {
            function04 = callbacks.openPrivacyUrl;
        }
        if ((i & 16) != 0) {
            function1 = callbacks.securityRow;
        }
        if ((i & 32) != 0) {
            function05 = callbacks.onCreatePasskeyAccepted;
        }
        if ((i & 64) != 0) {
            function06 = callbacks.onCreatePasskeyDismissed;
        }
        if ((i & 128) != 0) {
            function07 = callbacks.onCreateErrorPasskeyDismissed;
        }
        if ((i & 256) != 0) {
            function08 = callbacks.onPasskeyBottomSheetDoneClick;
        }
        Function0 function09 = function07;
        Function0 function010 = function08;
        Function0 function011 = function05;
        Function0 function012 = function06;
        Function1 function12 = function1;
        Function0 function013 = function03;
        return callbacks.copy(function0, function02, function013, function04, function12, function011, function012, function09, function010);
    }

    public final Function0<Unit> component1() {
        return this.createPasskey;
    }

    public final Function0<Unit> component2() {
        return this.updatePassword;
    }

    public final Function0<Unit> component3() {
        return this.mfa;
    }

    public final Function0<Unit> component4() {
        return this.openPrivacyUrl;
    }

    public final Function1<SecurityCenterFragment.SecurityRowType, Unit> component5() {
        return this.securityRow;
    }

    public final Function0<Unit> component6() {
        return this.onCreatePasskeyAccepted;
    }

    public final Function0<Unit> component7() {
        return this.onCreatePasskeyDismissed;
    }

    public final Function0<Unit> component8() {
        return this.onCreateErrorPasskeyDismissed;
    }

    public final Function0<Unit> component9() {
        return this.onPasskeyBottomSheetDoneClick;
    }

    public final Callbacks copy(Function0<Unit> createPasskey, Function0<Unit> updatePassword, Function0<Unit> mfa, Function0<Unit> openPrivacyUrl, Function1<? super SecurityCenterFragment.SecurityRowType, Unit> securityRow, Function0<Unit> onCreatePasskeyAccepted, Function0<Unit> onCreatePasskeyDismissed, Function0<Unit> onCreateErrorPasskeyDismissed, Function0<Unit> onPasskeyBottomSheetDoneClick) {
        Intrinsics.checkNotNullParameter(createPasskey, "createPasskey");
        Intrinsics.checkNotNullParameter(updatePassword, "updatePassword");
        Intrinsics.checkNotNullParameter(mfa, "mfa");
        Intrinsics.checkNotNullParameter(openPrivacyUrl, "openPrivacyUrl");
        Intrinsics.checkNotNullParameter(securityRow, "securityRow");
        Intrinsics.checkNotNullParameter(onCreatePasskeyAccepted, "onCreatePasskeyAccepted");
        Intrinsics.checkNotNullParameter(onCreatePasskeyDismissed, "onCreatePasskeyDismissed");
        Intrinsics.checkNotNullParameter(onCreateErrorPasskeyDismissed, "onCreateErrorPasskeyDismissed");
        Intrinsics.checkNotNullParameter(onPasskeyBottomSheetDoneClick, "onPasskeyBottomSheetDoneClick");
        return new Callbacks(createPasskey, updatePassword, mfa, openPrivacyUrl, securityRow, onCreatePasskeyAccepted, onCreatePasskeyDismissed, onCreateErrorPasskeyDismissed, onPasskeyBottomSheetDoneClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Callbacks)) {
            return false;
        }
        Callbacks callbacks = (Callbacks) other;
        return Intrinsics.areEqual(this.createPasskey, callbacks.createPasskey) && Intrinsics.areEqual(this.updatePassword, callbacks.updatePassword) && Intrinsics.areEqual(this.mfa, callbacks.mfa) && Intrinsics.areEqual(this.openPrivacyUrl, callbacks.openPrivacyUrl) && Intrinsics.areEqual(this.securityRow, callbacks.securityRow) && Intrinsics.areEqual(this.onCreatePasskeyAccepted, callbacks.onCreatePasskeyAccepted) && Intrinsics.areEqual(this.onCreatePasskeyDismissed, callbacks.onCreatePasskeyDismissed) && Intrinsics.areEqual(this.onCreateErrorPasskeyDismissed, callbacks.onCreateErrorPasskeyDismissed) && Intrinsics.areEqual(this.onPasskeyBottomSheetDoneClick, callbacks.onPasskeyBottomSheetDoneClick);
    }

    public int hashCode() {
        return (((((((((((((((this.createPasskey.hashCode() * 31) + this.updatePassword.hashCode()) * 31) + this.mfa.hashCode()) * 31) + this.openPrivacyUrl.hashCode()) * 31) + this.securityRow.hashCode()) * 31) + this.onCreatePasskeyAccepted.hashCode()) * 31) + this.onCreatePasskeyDismissed.hashCode()) * 31) + this.onCreateErrorPasskeyDismissed.hashCode()) * 31) + this.onPasskeyBottomSheetDoneClick.hashCode();
    }

    public String toString() {
        return "Callbacks(createPasskey=" + this.createPasskey + ", updatePassword=" + this.updatePassword + ", mfa=" + this.mfa + ", openPrivacyUrl=" + this.openPrivacyUrl + ", securityRow=" + this.securityRow + ", onCreatePasskeyAccepted=" + this.onCreatePasskeyAccepted + ", onCreatePasskeyDismissed=" + this.onCreatePasskeyDismissed + ", onCreateErrorPasskeyDismissed=" + this.onCreateErrorPasskeyDismissed + ", onPasskeyBottomSheetDoneClick=" + this.onPasskeyBottomSheetDoneClick + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Callbacks(Function0<Unit> createPasskey, Function0<Unit> updatePassword, Function0<Unit> mfa, Function0<Unit> openPrivacyUrl, Function1<? super SecurityCenterFragment.SecurityRowType, Unit> securityRow, Function0<Unit> onCreatePasskeyAccepted, Function0<Unit> onCreatePasskeyDismissed, Function0<Unit> onCreateErrorPasskeyDismissed, Function0<Unit> onPasskeyBottomSheetDoneClick) {
        Intrinsics.checkNotNullParameter(createPasskey, "createPasskey");
        Intrinsics.checkNotNullParameter(updatePassword, "updatePassword");
        Intrinsics.checkNotNullParameter(mfa, "mfa");
        Intrinsics.checkNotNullParameter(openPrivacyUrl, "openPrivacyUrl");
        Intrinsics.checkNotNullParameter(securityRow, "securityRow");
        Intrinsics.checkNotNullParameter(onCreatePasskeyAccepted, "onCreatePasskeyAccepted");
        Intrinsics.checkNotNullParameter(onCreatePasskeyDismissed, "onCreatePasskeyDismissed");
        Intrinsics.checkNotNullParameter(onCreateErrorPasskeyDismissed, "onCreateErrorPasskeyDismissed");
        Intrinsics.checkNotNullParameter(onPasskeyBottomSheetDoneClick, "onPasskeyBottomSheetDoneClick");
        this.createPasskey = createPasskey;
        this.updatePassword = updatePassword;
        this.mfa = mfa;
        this.openPrivacyUrl = openPrivacyUrl;
        this.securityRow = securityRow;
        this.onCreatePasskeyAccepted = onCreatePasskeyAccepted;
        this.onCreatePasskeyDismissed = onCreatePasskeyDismissed;
        this.onCreateErrorPasskeyDismissed = onCreateErrorPasskeyDismissed;
        this.onPasskeyBottomSheetDoneClick = onPasskeyBottomSheetDoneClick;
    }

    public final Function0<Unit> getCreatePasskey() {
        return this.createPasskey;
    }

    public final Function0<Unit> getUpdatePassword() {
        return this.updatePassword;
    }

    public final Function0<Unit> getMfa() {
        return this.mfa;
    }

    public final Function0<Unit> getOpenPrivacyUrl() {
        return this.openPrivacyUrl;
    }

    public final Function1<SecurityCenterFragment.SecurityRowType, Unit> getSecurityRow() {
        return this.securityRow;
    }

    public final Function0<Unit> getOnCreatePasskeyAccepted() {
        return this.onCreatePasskeyAccepted;
    }

    public final Function0<Unit> getOnCreatePasskeyDismissed() {
        return this.onCreatePasskeyDismissed;
    }

    public final Function0<Unit> getOnCreateErrorPasskeyDismissed() {
        return this.onCreateErrorPasskeyDismissed;
    }

    public final Function0<Unit> getOnPasskeyBottomSheetDoneClick() {
        return this.onPasskeyBottomSheetDoneClick;
    }
}
